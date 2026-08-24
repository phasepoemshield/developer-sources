/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  lombok.Generated
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.gl.GlGpuBuffer
 *  net.minecraft.client.util.BufferAllocator
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
package kotakbaz.rain.client.render.main;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.reflect.Field;
import java.util.IdentityHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlGpuBuffer;
import net.minecraft.client.util.BufferAllocator;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0627\u0632;
import oxxxde.\u0627\u0650;
import oxxxde.\u062d\u0646;
import oxxxde.\u062f\u0642;
import oxxxde.\u0631\u0622;
import oxxxde.\u0631\u0633;
import oxxxde.\u0635\u0652;
import oxxxde.\u0636\u0626;
import oxxxde.\u0636\u062f;

public class ChromaRenderer {
    private static ToIntFunction<GlGpuBuffer> bufferIdGetter;
    private static boolean initialized;
    public static final a matrixSnippet;
    private static int drawScopeDepth;
    private static \u0636\u0626 modelViewUniform;
    private static volatile int bufferPoolMisses;
    private static final ThreadLocal<int[]> VIEWPORT_BUFFER;
    private static final int SMALL_BUFFER_SIZE = 262144;
    private static final IdentityHashMap<GlProgram, Boolean> MATRIX_PROGRAMS_IN_SCOPE;
    private static final Logger logger;
    public static final \u0627\u0632 scissorStack;
    private static GlProgram globalProgram;
    private static final Field BUFFER_ALLOCATOR_SIZE_FIELD;
    private static IntSupplier scaleGetter;
    private static final ConcurrentLinkedQueue<BufferAllocator> BUFFER_POOL;
    private static final ConcurrentLinkedQueue<MeshBuilder> MESH_BUILDER_POOL;
    private static \u062f\u0642 projectionUniform;
    private static volatile int bufferPoolHits;
    private static final int DEFAULT_BUFFER_SIZE = 0x100000;

    public static void setGlobalProgram(GlProgram globalProgram) {
        if (ChromaRenderer.globalProgram == globalProgram) {
            return;
        }
        ChromaRenderer.globalProgram = globalProgram;
        if (globalProgram == null) {
            projectionUniform = null;
            modelViewUniform = null;
        } else {
            projectionUniform = globalProgram.getUniformNullable("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.BUFFER);
            modelViewUniform = globalProgram.getUniformNullable("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.MATRIX);
        }
    }

    public static void applyBlend(\u0635\u0652 srcFactor, \u062d\u0646 dstFactor) {
        GlStateManager._enableBlend();
        GL11.glBlendFunc((int)srcFactor.glId, (int)dstFactor.glId);
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

    public static void bindFramebuffer(Framebuffer framebuffer) {
        if (framebuffer != null && framebuffer.getColorAttachmentView() != null) {
            ChromaRenderer.bindFramebuffer(framebuffer.getColorAttachmentView(), framebuffer.getDepthAttachmentView());
        }
    }

    /*
     * WARNING - void declaration
     */
    private static BufferAllocator getPooledBuffer(int size) {
        void var1_1;
        BufferAllocator buffer = BUFFER_POOL.poll();
        if (buffer == null) {
            buffer = new BufferAllocator(size);
            ++bufferPoolMisses;
        } else {
            try {
                buffer.clear();
                ++bufferPoolHits;
            }
            catch (IllegalStateException e) {
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
        return var1_1;
    }

    public static void captureFramebufferState(FramebufferState state) {
        if (state == null) {
            return;
        }
        state.framebufferId = GL11.glGetInteger((int)36006);
        int[] viewport = VIEWPORT_BUFFER.get();
        GL11.glGetIntegerv((int)2978, (int[])viewport);
        state.viewportX = viewport[0];
        state.viewportY = viewport[1];
        state.viewportWidth = viewport[2];
        state.viewportHeight = viewport[3];
    }

    public static void applyDefaultBlend() {
        GlStateManager._enableBlend();
        GL11.glBlendFunc((int)\u0635\u0652.SRC_ALPHA.glId, (int)\u062d\u0646.ONE_MINUS_SRC_ALPHA.glId);
    }

    public static void applyBlend(\u0635\u0652 srcColor, \u062d\u0646 dstColor, \u0635\u0652 srcAlpha, \u062d\u0646 dstAlpha) {
        GlStateManager._enableBlend();
        GL14.glBlendFuncSeparate((int)srcColor.glId, (int)dstColor.glId, (int)srcAlpha.glId, (int)dstAlpha.glId);
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
                buffer.clear();
                BUFFER_POOL.offer(buffer);
            } else {
                buffer.close();
            }
        }
        catch (IllegalStateException e) {
            try {
                buffer.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static \u0627\u0650 createMesh(DrawMode drawMode, VertexFormat vertexFormat, Consumer<MeshBuilder> buildConsumer) {
        \u0627\u0650 \u0627\u06502;
        MeshBuilder meshBuilder = ChromaRenderer.borrowMeshBuilder(drawMode, vertexFormat);
        BufferAllocator buffer = meshBuilder.getBufferAllocator();
        try {
            buildConsumer.accept(meshBuilder);
        }
        catch (Exception e) {
            void var5_5;
            ChromaRenderer.returnBuffer(buffer);
            ChromaRenderer.recycleMeshBuilder(meshBuilder);
            throw var5_5;
        }
        try {
            \u0627\u06502 = meshBuilder.buildNullable();
        }
        catch (Throwable throwable) {
            void var3_3;
            ChromaRenderer.recycleMeshBuilder((MeshBuilder)var3_3);
            throw throwable;
        }
        ChromaRenderer.recycleMeshBuilder(meshBuilder);
        return \u0627\u06502;
    }

    public static void recycleMeshBuilder(MeshBuilder meshBuilder) {
        if (meshBuilder != null && MESH_BUILDER_POOL.size() < 8) {
            MESH_BUILDER_POOL.offer(meshBuilder);
        }
    }

    @Generated
    public static int getBufferPoolMisses() {
        return bufferPoolMisses;
    }

    /*
     * WARNING - void declaration
     */
    public static \u0627\u0650 createSmallMesh(DrawMode drawMode, VertexFormat vertexFormat, Consumer<MeshBuilder> buildConsumer) {
        BufferAllocator buffer = ChromaRenderer.getPooledBuffer(262144);
        MeshBuilder meshBuilder = new MeshBuilder(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        try {
            buildConsumer.accept(meshBuilder);
        }
        catch (Exception e) {
            void var5_5;
            ChromaRenderer.returnBuffer(buffer);
            throw var5_5;
        }
        return meshBuilder.buildNullable();
    }

    public static void beginDrawScope() {
        int n = drawScopeDepth;
        drawScopeDepth = n + 1;
        if (n == 0) {
            MATRIX_PROGRAMS_IN_SCOPE.clear();
        }
    }

    public static void initMatrix() {
        if (drawScopeDepth > 0 && globalProgram != null && MATRIX_PROGRAMS_IN_SCOPE.put(globalProgram, Boolean.TRUE) != null) {
            return;
        }
        if (projectionUniform != null) {
            GpuBufferSlice slice = RenderSystem.getProjectionMatrixBuffer();
            projectionUniform.set(slice);
        }
        if (modelViewUniform != null) {
            modelViewUniform.set(RenderSystem.getModelViewMatrix());
        }
    }

    public static void restoreFramebufferState(FramebufferState state) {
        if (state == null) {
            return;
        }
        GlStateManager._glBindFramebuffer((int)36160, (int)state.framebufferId);
        GlStateManager._viewport((int)state.viewportX, (int)state.viewportY, (int)state.viewportWidth, (int)state.viewportHeight);
    }

    public static void bindMainFramebuffer() {
        ChromaRenderer.bindFramebuffer(MinecraftClient.getInstance().getFramebuffer());
    }

    @Generated
    public static GlProgram getGlobalProgram() {
        return globalProgram;
    }

    /*
     * WARNING - void declaration
     */
    public static MeshBuilder borrowMeshBuilder(DrawMode drawMode, VertexFormat vertexFormat) {
        void var2_2;
        MeshBuilder meshBuilder = MESH_BUILDER_POOL.poll();
        if (meshBuilder == null) {
            BufferAllocator buffer = ChromaRenderer.getPooledBuffer(0x100000);
            meshBuilder = new MeshBuilder(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        } else {
            BufferAllocator buffer = ChromaRenderer.getPooledBuffer(0x100000);
            meshBuilder.set(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
        }
        return var2_2;
    }

    public static void draw(IMesh mesh) {
        ChromaRenderer.draw(\u0636\u062f.CUSTOM_BUFFER, mesh, true);
    }

    /*
     * WARNING - void declaration
     */
    private static Field resolveBufferAllocatorSizeField() {
        try {
            void ignored;
            Field field = BufferAllocator.class.getDeclaredField("capacity");
            field.setAccessible(true);
            return ignored;
        }
        catch (Exception ignored) {
            return null;
        }
    }

    @Generated
    public static int getBufferPoolHits() {
        return bufferPoolHits;
    }

    public static void init(ToIntFunction<GlGpuBuffer> bufferIdGetter, IntSupplier scaleGetter) {
        if (initialized) {
            throw new IllegalStateException("Renderer has already initialized.");
        }
        ChromaRenderer.bufferIdGetter = bufferIdGetter;
        ChromaRenderer.scaleGetter = scaleGetter;
        initialized = true;
    }

    public static FramebufferState captureFramebufferState() {
        FramebufferState state = new FramebufferState();
        ChromaRenderer.captureFramebufferState(state);
        return state;
    }

    static {
        initialized = false;
        logger = LoggerFactory.getLogger("ChromaRenderer");
        matrixSnippet = \u0631\u0633.IN_JAR.createProgramBuilder(new a[0]).uniform("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.BUFFER).uniform("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.MATRIX).buildSnippet();
        scissorStack = new \u0627\u0632();
        BUFFER_POOL = new ConcurrentLinkedQueue();
        MESH_BUILDER_POOL = new ConcurrentLinkedQueue();
        VIEWPORT_BUFFER = ThreadLocal.withInitial(() -> new int[4]);
        BUFFER_ALLOCATOR_SIZE_FIELD = ChromaRenderer.resolveBufferAllocatorSizeField();
        MATRIX_PROGRAMS_IN_SCOPE = new IdentityHashMap();
        drawScopeDepth = 0;
        bufferPoolHits = 0;
        bufferPoolMisses = 0;
    }

    @Generated
    public static ToIntFunction<GlGpuBuffer> getBufferIdGetter() {
        return bufferIdGetter;
    }

    @Generated
    public static IntSupplier getScaleGetter() {
        return scaleGetter;
    }

    public static void endDrawScope() {
        if (drawScopeDepth <= 0) {
            return;
        }
        if (--drawScopeDepth == 0) {
            MATRIX_PROGRAMS_IN_SCOPE.clear();
            GlProgram active = GlProgram.ACTIVE_PROGRAM;
            if (active != null) {
                active.unbind();
            }
        }
    }

    public static void draw(IMesh mesh, boolean close) {
        ChromaRenderer.draw(\u0636\u062f.CUSTOM_BUFFER, mesh, close);
    }

    public static <T> void draw(BiConsumer<T, Boolean> renderConsumer, T builtBuffer, boolean close) {
        globalProgram.bind();
        try {
            renderConsumer.accept(builtBuffer, close);
        }
        finally {
            if (drawScopeDepth == 0) {
                globalProgram.unbind();
            }
        }
    }

    public static void cleanup() {
        BufferAllocator pooledBuffer;
        \u0627\u0650.clearVertexBufferPool();
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

    public static void bindFramebuffer(GpuTextureView colorTexture, GpuTextureView depthTexture) {
        \u0631\u0622.bindFrameBuffer(\u0631\u0622.getFrameBufferId(colorTexture, depthTexture), colorTexture);
    }

    public static void disableBlend() {
        GlStateManager._disableBlend();
    }

    @Generated
    public static Logger getLogger() {
        return logger;
    }

    public static final class FramebufferState {
        public int framebufferId;
        public int viewportX;
        public int viewportWidth;
        public int viewportY;
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

