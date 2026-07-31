/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import kotakbaz.rain.client.render.main.b_0;
import kotakbaz.rain.client.render.main.c_0;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.A;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.b;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlGpuBuffer;
import net.minecraft.client.util.BufferAllocator;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChromaRenderer {
    private static boolean initialized = false;
    private static final Logger logger = LoggerFactory.getLogger("ChromaRenderer");
    private static Function<GlGpuBuffer, Integer> bufferIdGetter;
    private static Supplier<Integer> scaleGetter;
    public static final a matrixSnippet;
    private static kotakbaz.rain.client.render.main.program.a_0 globalProgram;
    public static final kotakbaz.rain.client.render.main.scissor.a_0 scissorStack;
    private static final ConcurrentLinkedQueue<BufferAllocator> BUFFER_POOL;
    private static final ConcurrentLinkedQueue<kotakbaz.rain.client.render.main.vertex.mesh.a_0> MESH_BUILDER_POOL;
    private static final ThreadLocal<int[]> VIEWPORT_BUFFER;
    private static final int DEFAULT_BUFFER_SIZE = 0x100000;
    private static final int SMALL_BUFFER_SIZE = 262144;
    private static final Field BUFFER_ALLOCATOR_SIZE_FIELD;
    private static volatile int bufferPoolHits;
    private static volatile int bufferPoolMisses;

    public static void init(Function<GlGpuBuffer, Integer> bufferIdGetter, Supplier<Integer> scaleGetter) {
        if (initialized) {
            throw new IllegalStateException("Renderer has already initialized.");
        }
        ChromaRenderer.bufferIdGetter = bufferIdGetter;
        ChromaRenderer.scaleGetter = scaleGetter;
        initialized = true;
    }

    public static void initMatrix() {
        A modelViewUniform;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a projectionUniform = globalProgram.getUniform("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.G);
        if (projectionUniform != null) {
            GpuBufferSlice slice = RenderSystem.getProjectionMatrixBuffer();
            projectionUniform.set(slice);
        }
        if ((modelViewUniform = globalProgram.getUniform("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.g)) != null) {
            modelViewUniform.set(RenderSystem.getModelViewMatrix());
        }
    }

    public static void setGlobalProgram(kotakbaz.rain.client.render.main.program.a_0 globalProgram) {
        ChromaRenderer.globalProgram = globalProgram;
    }

    public static void applyDefaultBlend() {
        GlStateManager._enableBlend();
        GL11.glBlendFunc((int)kotakbaz.rain.client.render.main.blend.a.F.H, (int)kotakbaz.rain.client.render.main.blend.a_0.E.h);
    }

    public static void applyBlend(kotakbaz.rain.client.render.main.blend.a srcFactor, kotakbaz.rain.client.render.main.blend.a_0 dstFactor) {
        GlStateManager._enableBlend();
        GL11.glBlendFunc((int)srcFactor.H, (int)dstFactor.h);
    }

    public static void applyBlend(kotakbaz.rain.client.render.main.blend.a srcColor, kotakbaz.rain.client.render.main.blend.a_0 dstColor, kotakbaz.rain.client.render.main.blend.a srcAlpha, kotakbaz.rain.client.render.main.blend.a_0 dstAlpha) {
        GlStateManager._enableBlend();
        GL14.glBlendFuncSeparate((int)srcColor.H, (int)dstColor.h, (int)srcAlpha.H, (int)dstAlpha.h);
    }

    public static void disableBlend() {
        GlStateManager._disableBlend();
    }

    public static void bindMainFramebuffer() {
        ChromaRenderer.bindFramebuffer(MinecraftClient.getInstance().getFramebuffer());
    }

    public static void bindFramebuffer(Framebuffer framebuffer) {
        if (framebuffer != null && framebuffer.getColorAttachmentView() != null) {
            ChromaRenderer.bindFramebuffer(framebuffer.getColorAttachmentView(), framebuffer.getDepthAttachmentView());
        }
    }

    public static void bindFramebuffer(GpuTextureView colorTexture, GpuTextureView depthTexture) {
        kotakbaz.rain.client.render.main.a.bindFrameBuffer(kotakbaz.rain.client.render.main.a.getFrameBufferId(colorTexture, depthTexture), colorTexture);
    }

    public static FramebufferState captureFramebufferState() {
        FramebufferState state2 = new FramebufferState();
        ChromaRenderer.captureFramebufferState(state2);
        return state2;
    }

    public static void captureFramebufferState(FramebufferState state2) {
        if (state2 == null) {
            return;
        }
        state2.framebufferId = GL11.glGetInteger((int)36006);
        int[] viewport = VIEWPORT_BUFFER.get();
        GL11.glGetIntegerv((int)2978, (int[])viewport);
        state2.viewportX = viewport[0];
        state2.viewportY = viewport[1];
        state2.viewportWidth = viewport[2];
        state2.viewportHeight = viewport[3];
    }

    public static void restoreFramebufferState(FramebufferState state2) {
        if (state2 == null) {
            return;
        }
        GlStateManager._glBindFramebuffer((int)36160, (int)state2.framebufferId);
        GlStateManager._viewport((int)state2.viewportX, (int)state2.viewportY, (int)state2.viewportWidth, (int)state2.viewportHeight);
    }

    private static BufferAllocator getPooledBuffer(int size) {
        BufferAllocator buffer = BUFFER_POOL.poll();
        if (buffer == null) {
            buffer = new BufferAllocator(size);
            ++bufferPoolMisses;
        } else {
            try {
                buffer.clear();
                ++bufferPoolHits;
            }
            catch (IllegalStateException e2) {
                try {
                    buffer.close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
                buffer = new BufferAllocator(size);
                ++bufferPoolMisses;
            }
        }
        return buffer;
    }

    private static void returnBuffer(BufferAllocator buffer) {
        if (buffer == null) {
            return;
        }
        try {
            long capacity = ChromaRenderer.getBufferCapacity(buffer);
            if (capacity > 0x800000L) {
                buffer.close();
            } else if (BUFFER_POOL.size() < 16) {
                buffer.reset();
                BUFFER_POOL.offer(buffer);
            } else {
                buffer.close();
            }
        }
        catch (IllegalStateException e2) {
            try {
                buffer.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static kotakbaz.rain.client.render.main.vertex.mesh.a_0 borrowMeshBuilder(kotakbaz.rain.client.render.main.vertex.a_0 drawMode, a_0 vertexFormat) {
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 meshBuilder = MESH_BUILDER_POOL.poll();
        if (meshBuilder == null) {
            BufferAllocator buffer = ChromaRenderer.getPooledBuffer(0x100000);
            meshBuilder = new kotakbaz.rain.client.render.main.vertex.mesh.a_0(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        } else {
            BufferAllocator buffer = ChromaRenderer.getPooledBuffer(0x100000);
            meshBuilder.set(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        }
        return meshBuilder;
    }

    public static void recycleMeshBuilder(kotakbaz.rain.client.render.main.vertex.mesh.a_0 meshBuilder) {
        if (meshBuilder != null && MESH_BUILDER_POOL.size() < 8) {
            MESH_BUILDER_POOL.offer(meshBuilder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static kotakbaz.rain.client.render.main.vertex.mesh.b_0 createMesh(kotakbaz.rain.client.render.main.vertex.a_0 drawMode, a_0 vertexFormat, Consumer<kotakbaz.rain.client.render.main.vertex.mesh.a_0> buildConsumer) {
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 meshBuilder = ChromaRenderer.borrowMeshBuilder(drawMode, vertexFormat);
        BufferAllocator buffer = meshBuilder.getBufferAllocator();
        try {
            buildConsumer.accept(meshBuilder);
        }
        catch (Exception e2) {
            ChromaRenderer.returnBuffer(buffer);
            ChromaRenderer.recycleMeshBuilder(meshBuilder);
            throw e2;
        }
        try {
            kotakbaz.rain.client.render.main.vertex.mesh.b_0 b_02 = meshBuilder.buildNullable();
            return b_02;
        }
        finally {
            ChromaRenderer.recycleMeshBuilder(meshBuilder);
        }
    }

    public static kotakbaz.rain.client.render.main.vertex.mesh.b_0 createSmallMesh(kotakbaz.rain.client.render.main.vertex.a_0 drawMode, a_0 vertexFormat, Consumer<kotakbaz.rain.client.render.main.vertex.mesh.a_0> buildConsumer) {
        BufferAllocator buffer = ChromaRenderer.getPooledBuffer(262144);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 meshBuilder = new kotakbaz.rain.client.render.main.vertex.mesh.a_0(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        try {
            buildConsumer.accept(meshBuilder);
        }
        catch (Exception e2) {
            ChromaRenderer.returnBuffer(buffer);
            throw e2;
        }
        return meshBuilder.buildNullable();
    }

    public static void draw(b mesh) {
        ChromaRenderer.draw(c_0.A, mesh, true);
    }

    public static void draw(b mesh, boolean close) {
        ChromaRenderer.draw(c_0.A, mesh, close);
    }

    public static <T> void draw(BiConsumer<T, Boolean> renderConsumer, T builtBuffer, boolean close) {
        globalProgram.bind();
        try {
            renderConsumer.accept(builtBuffer, close);
        }
        finally {
            globalProgram.unbind();
        }
    }

    public static void cleanup() {
        BufferAllocator pooledBuffer;
        while ((pooledBuffer = BUFFER_POOL.poll()) != null) {
            try {
                pooledBuffer.close();
            }
            catch (Exception exception) {}
        }
        MESH_BUILDER_POOL.clear();
        bufferPoolHits = 0;
        bufferPoolMisses = 0;
    }

    private static Field resolveBufferAllocatorSizeField() {
        try {
            Field field = BufferAllocator.class.getDeclaredField("size");
            field.setAccessible(true);
            return field;
        }
        catch (Exception ignored) {
            return null;
        }
    }

    private static long getBufferCapacity(BufferAllocator buffer) {
        if (BUFFER_ALLOCATOR_SIZE_FIELD == null || buffer == null) {
            return -1L;
        }
        try {
            return BUFFER_ALLOCATOR_SIZE_FIELD.getLong(buffer);
        }
        catch (Exception ignored) {
            return -1L;
        }
    }

    @Generated
    public static Logger getLogger() {
        return logger;
    }

    @Generated
    public static Function<GlGpuBuffer, Integer> getBufferIdGetter() {
        return bufferIdGetter;
    }

    @Generated
    public static Supplier<Integer> getScaleGetter() {
        return scaleGetter;
    }

    @Generated
    public static kotakbaz.rain.client.render.main.program.a_0 getGlobalProgram() {
        return globalProgram;
    }

    @Generated
    public static int getBufferPoolHits() {
        return bufferPoolHits;
    }

    @Generated
    public static int getBufferPoolMisses() {
        return bufferPoolMisses;
    }

    static {
        matrixSnippet = b_0.a.createProgramBuilder(new a[0]).uniform("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.G).uniform("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.g).buildSnippet();
        scissorStack = new kotakbaz.rain.client.render.main.scissor.a_0();
        BUFFER_POOL = new ConcurrentLinkedQueue();
        MESH_BUILDER_POOL = new ConcurrentLinkedQueue();
        VIEWPORT_BUFFER = ThreadLocal.withInitial(() -> new int[4]);
        BUFFER_ALLOCATOR_SIZE_FIELD = ChromaRenderer.resolveBufferAllocatorSizeField();
        bufferPoolHits = 0;
        bufferPoolMisses = 0;
    }

    public static final class FramebufferState {
        public int framebufferId;
        public int viewportX;
        public int viewportY;
        public int viewportWidth;
        public int viewportHeight;

        public FramebufferState() {
        }

        public FramebufferState(int framebufferId, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
            this.framebufferId = framebufferId;
            this.viewportX = viewportX;
            this.viewportY = viewportY;
            this.viewportWidth = viewportWidth;
            this.viewportHeight = viewportHeight;
        }
    }
}

