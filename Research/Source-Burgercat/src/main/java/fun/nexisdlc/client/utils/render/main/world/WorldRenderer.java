package fun.nexisdlc.client.utils.render.main.world;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

import java.util.Objects;

/**
 * Provides contextual rendering state for post-world rendering passes and custom overlays.
 */
public final class WorldRenderer implements AutoCloseable {

    private static final int DEFAULT_BUFFER_CAPACITY_BYTES = 1 << 20; // 1 MiB
    private static final boolean REUSE_BUFFERS = true;
    private static final ThreadLocal<SharedBuffers> SHARED_BUFFERS = new ThreadLocal<>();
    private static final ThreadLocal<CachedEmitters> SHARED_EMITTERS = new ThreadLocal<>();

    private final Camera camera;
    private final MatrixStack matrixStack;
    private final Matrix4f positionMatrix;
    private final Matrix4f projectionMatrix;
    private final BufferAllocator bufferAllocator;
    private final VertexConsumerProvider.Immediate immediate;
    private final float tickDelta;
    private final boolean reuseBuffers;
    private boolean used;
    private boolean closed;
    private boolean forceNoDepth;
    private boolean forceAdditive;
    private boolean batchActive;
    private boolean batchNoDepth;
    private boolean batchAdditive;
    private final CachedEmitters emitters;

    private WorldRenderer(Camera camera,
                          MatrixStack matrixStack,
                          Matrix4f positionMatrix,
                          Matrix4f projectionMatrix,
                          BufferAllocator bufferAllocator,
                          VertexConsumerProvider.Immediate immediate,
                          float tickDelta,
                          boolean reuseBuffers,
                          CachedEmitters emitters) {
        this.camera = camera;
        this.matrixStack = matrixStack;
        this.positionMatrix = positionMatrix;
        this.projectionMatrix = projectionMatrix;
        this.bufferAllocator = bufferAllocator;
        this.immediate = immediate;
        this.tickDelta = tickDelta;
        this.reuseBuffers = reuseBuffers;
        this.emitters = emitters;
    }

    public static WorldRenderer begin(MinecraftClient client,
                                      RenderTickCounter tickCounter,
                                      Camera camera,
                                      Matrix4f positionMatrix,
                                      Matrix4f projectionMatrix) {
        Objects.requireNonNull(client, "client");
        Objects.requireNonNull(tickCounter, "tickCounter");
        Objects.requireNonNull(camera, "camera");
        Objects.requireNonNull(positionMatrix, "positionMatrix");
        Objects.requireNonNull(projectionMatrix, "projectionMatrix");

        MatrixStack stack = new MatrixStack();
        Matrix4f basePositionMatrix = new Matrix4f(positionMatrix);
        stack.multiplyPositionMatrix(basePositionMatrix);

        BufferAllocator allocator;
        VertexConsumerProvider.Immediate immediate;
        boolean reuse = false;
        if (REUSE_BUFFERS) {
            SharedBuffers shared = SHARED_BUFFERS.get();
            if (shared == null) {
                allocator = new BufferAllocator(DEFAULT_BUFFER_CAPACITY_BYTES);
                immediate = VertexConsumerProvider.immediate(allocator);
                SHARED_BUFFERS.set(new SharedBuffers(allocator, immediate));
            } else {
                allocator = shared.allocator;
                immediate = shared.immediate;
                try {
                    immediate.draw();
                } catch (RuntimeException ignored) {
                }
            }
            reuse = true;
        } else {
            allocator = new BufferAllocator(DEFAULT_BUFFER_CAPACITY_BYTES);
            immediate = VertexConsumerProvider.immediate(allocator);
        }
        float tickDelta = tickCounter.getTickProgress(false);

        CachedEmitters cachedEmitters;
        if (REUSE_BUFFERS) {
            CachedEmitters existing = SHARED_EMITTERS.get();
            if (existing == null) {
                cachedEmitters = new CachedEmitters();
                SHARED_EMITTERS.set(cachedEmitters);
            } else {
                cachedEmitters = existing;
            }
        } else {
            cachedEmitters = new CachedEmitters();
        }

        WorldRenderer renderer = new WorldRenderer(
                camera,
                stack,
                basePositionMatrix,
                new Matrix4f(projectionMatrix),
                allocator,
                immediate,
                tickDelta,
                reuse,
                cachedEmitters
        );
        renderer.used = false;
        renderer.batchActive = false;
        renderer.forceNoDepth = false;
        renderer.forceAdditive = false;
        renderer.emitters.reset();
        return renderer;
    }

    public Camera camera() {
        return camera;
    }

    /**
     * Returns the matrix stack seeded with the vanilla position matrix captured when this renderer began.
     *
     * <p>The stack is not pre-translated by the camera position; camera-relative adjustment is handled when
     * geometry is emitted.</p>
     */
    public MatrixStack matrixStack() {
        return matrixStack;
    }

    public Matrix4f positionMatrix() {
        return new Matrix4f(positionMatrix);
    }

    /**
     * Returns a copy of the base world-space position matrix captured when this renderer began.
     *
     * <p>The matrix is aligned with vanilla's position matrix and does not include an implicit camera translation.</p>
     */
    public Matrix4f worldMatrix() {
        return new Matrix4f(positionMatrix);
    }

    public Matrix4f projectionMatrix() {
        return new Matrix4f(projectionMatrix);
    }

    public float tickDelta() {
        return tickDelta;
    }

    public VertexConsumerProvider.Immediate bufferSource() {
        if (closed) {
            throw new IllegalStateException("Cannot access buffers after the world renderer has been closed.");
        }
        return immediate;
    }

    public VertexConsumer getBuffer(RenderLayer layer) {
        Objects.requireNonNull(layer, "layer");
        if (closed) {
            throw new IllegalStateException("Cannot request buffers after the world renderer has been closed.");
        }
        boolean shaderPack = WorldRenderLayers.isShaderPackActive();
        WorldRenderLayers.LayerIntent intent = WorldRenderLayers.consumeIntent();
        boolean noDepth = intent != null ? intent.noDepth() : WorldRenderLayers.isNoDepthLayer(layer);
        boolean additive = intent != null ? intent.additive() : WorldRenderLayers.isAdditiveLayer(layer);

        if (used && batchActive && (batchNoDepth != noDepth || batchAdditive != additive)) {
            flush();
        }

        used = true;
        batchActive = true;
        batchNoDepth = noDepth;
        batchAdditive = additive;

        if (shaderPack && noDepth) {
            forceNoDepth = true;
        }
        if (shaderPack && additive) {
            forceAdditive = true;
        }

        return immediate.getBuffer(layer);
    }

    public void drawQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3, int rgbaColor, boolean depthTest) {
        Objects.requireNonNull(v0, "v0");
        Objects.requireNonNull(v1, "v1");
        Objects.requireNonNull(v2, "v2");
        Objects.requireNonNull(v3, "v3");
        RenderLayer layer = depthTest ? WorldRenderLayers.POSITION_COLOR_QUADS() : WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH();
        WorldGeometryEmitter emitter = emitters.colorEmitter(this, getBuffer(layer));
        emitter.emitQuad(v0, v1, v2, v3, rgbaColor);
    }

    public void drawCube(Vec3d min, Vec3d max, int rgbaColor, boolean depthTest) {
        Objects.requireNonNull(min, "min");
        Objects.requireNonNull(max, "max");
        RenderLayer layer = depthTest ? WorldRenderLayers.POSITION_COLOR_QUADS() : WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH();
        WorldGeometryEmitter emitter = emitters.colorEmitter(this, getBuffer(layer));
        emitter.emitCube(min, max, rgbaColor);
    }

    public void drawLine(Vec3d start, Vec3d end, double width, int rgbaColor, boolean depthTest) {
        Objects.requireNonNull(start, "start");
        Objects.requireNonNull(end, "end");
        if (!Double.isFinite(width)) {
            throw new IllegalArgumentException("Line width must be finite.");
        }
        if (width < 0.0D) {
            throw new IllegalArgumentException("Line width cannot be negative.");
        }
        RenderLayer layer = depthTest ? WorldRenderLayers.LINES(width) : WorldRenderLayers.LINES_NO_DEPTH(width);
        WorldGeometryEmitter emitter = emitters.lineEmitter(this, getBuffer(layer));
        emitter.emitLine(start, end, rgbaColor);
    }

    public WorldGeometryEmitter lineEmitter(RenderLayer layer) {
        Objects.requireNonNull(layer, "layer");
        if (closed) {
            throw new IllegalStateException("Cannot request buffers after the world renderer has been closed.");
        }
        return emitters.lineEmitter(this, getBuffer(layer));
    }

    public void drawTexturedQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3,
                                 float u0, float v0Coord,
                                 float u1, float v1Coord,
                                 float u2, float v2Coord,
                                 float u3, float v3Coord,
                                 int rgbaColor) {
        Objects.requireNonNull(v0, "v0");
        Objects.requireNonNull(v1, "v1");
        Objects.requireNonNull(v2, "v2");
        Objects.requireNonNull(v3, "v3");
        RenderLayer layer = WorldRenderLayers.TEXTURED_QUADS();
        WorldGeometryEmitter emitter = emitters.texturedEmitter(this, getBuffer(layer));
        emitter.emitTexturedQuad(v0, v1, v2, v3, u0, v0Coord, u1, v1Coord, u2, v2Coord, u3, v3Coord, rgbaColor);
    }

    public void flush() {
        if (closed) {
            return;
        }
        if (!used) {
            return;
        }
        boolean shaderPack = WorldRenderLayers.isShaderPackActive();
        boolean disableDepth = forceNoDepth && shaderPack;
        boolean useAdditive = forceAdditive && shaderPack;
        if (shaderPack && (disableDepth || useAdditive)) {
            WorldRenderLayers.setPassOverride(disableDepth, useAdditive);
        }
        immediate.draw();
        if (shaderPack && (disableDepth || useAdditive)) {
            WorldRenderLayers.clearPassOverride();
        }
        if (shaderPack) {
        }
        used = false;
        forceNoDepth = false;
        forceAdditive = false;
        batchActive = false;
        batchNoDepth = false;
        batchAdditive = false;
        emitters.reset();
    }

    @Override
    public void close() {
        if (closed) {
            return;
        }
        flush();
        closed = true;
        if (reuseBuffers) {
            emitters.reset();
            return;
        }
        try {
            bufferAllocator.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new IllegalStateException("Failed to release world renderer buffers.", e);
        }
    }

    private record SharedBuffers(BufferAllocator allocator, VertexConsumerProvider.Immediate immediate) {}

    private static final class CachedEmitters {
        private final MatrixStack identity = new MatrixStack();
        private WorldGeometryEmitter colorEmitter;
        private WorldGeometryEmitter lineEmitter;
        private WorldGeometryEmitter texturedEmitter;
        private VertexConsumer colorConsumer;
        private VertexConsumer lineConsumer;
        private VertexConsumer texturedConsumer;

        WorldGeometryEmitter colorEmitter(WorldRenderer renderer, VertexConsumer consumer) {
            if (colorEmitter == null || colorConsumer != consumer) {
                colorConsumer = consumer;
                colorEmitter = new WorldGeometryEmitter(renderer, identity.peek(), consumer);
            }
            return colorEmitter;
        }

        WorldGeometryEmitter lineEmitter(WorldRenderer renderer, VertexConsumer consumer) {
            if (lineEmitter == null || lineConsumer != consumer) {
                lineConsumer = consumer;
                lineEmitter = new WorldGeometryEmitter(renderer, identity.peek(), consumer);
            }
            return lineEmitter;
        }

        WorldGeometryEmitter texturedEmitter(WorldRenderer renderer, VertexConsumer consumer) {
            if (texturedEmitter == null || texturedConsumer != consumer) {
                texturedConsumer = consumer;
                texturedEmitter = new WorldGeometryEmitter(renderer, identity.peek(), consumer);
            }
            return texturedEmitter;
        }

        void reset() {
            colorConsumer = null;
            lineConsumer = null;
            texturedConsumer = null;
        }
    }


}
