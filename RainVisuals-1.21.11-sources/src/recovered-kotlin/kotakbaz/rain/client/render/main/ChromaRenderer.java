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
import oxxxde.از;
import oxxxde.اِ;
import oxxxde.حن;
import oxxxde.دق;
import oxxxde.رآ;
import oxxxde.رس;
import oxxxde.صْ;
import oxxxde.ضئ;
import oxxxde.ضد;

// $VF: Compiled from heavy
public class ChromaRenderer {
   private static ToIntFunction<GlGpuBuffer> bufferIdGetter;
   private static boolean initialized = false;
   public static final a matrixSnippet = رس.IN_JAR
      .createProgramBuilder()
      .uniform("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.BUFFER)
      .uniform("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.MATRIX)
      .buildSnippet();
   private static int drawScopeDepth = 0;
   private static ضئ modelViewUniform;
   private static volatile int bufferPoolMisses = 0;
   private static final ThreadLocal<int[]> VIEWPORT_BUFFER = ThreadLocal.withInitial(() -> new int[4]);
   private static final int SMALL_BUFFER_SIZE = 262144;
   private static final IdentityHashMap<GlProgram, Boolean> MATRIX_PROGRAMS_IN_SCOPE = new IdentityHashMap<>();
   private static final Logger logger = LoggerFactory.getLogger("ChromaRenderer");
   public static final از scissorStack = new از();
   private static GlProgram globalProgram;
   private static final Field BUFFER_ALLOCATOR_SIZE_FIELD = resolveBufferAllocatorSizeField();
   private static IntSupplier scaleGetter;
   private static final ConcurrentLinkedQueue<BufferAllocator> BUFFER_POOL = new ConcurrentLinkedQueue<>();
   private static final ConcurrentLinkedQueue<MeshBuilder> MESH_BUILDER_POOL = new ConcurrentLinkedQueue<>();
   private static دق projectionUniform;
   private static volatile int bufferPoolHits = 0;
   private static final int DEFAULT_BUFFER_SIZE = 1048576;

   public static void setGlobalProgram(GlProgram globalProgram) {
      if (ChromaRenderer.globalProgram != globalProgram) {
         ChromaRenderer.globalProgram = globalProgram;
         if (globalProgram == null) {
            projectionUniform = null;
            modelViewUniform = null;
         } else {
            projectionUniform = globalProgram.getUniformNullable("ProjMat", kotakbaz.rain.client.render.main.program.uniform.a.BUFFER);
            modelViewUniform = globalProgram.getUniformNullable("ModelViewMat", kotakbaz.rain.client.render.main.program.uniform.a.MATRIX);
         }
      }
   }

   public static void applyBlend(صْ dstFactor, حن srcFactor) {
      GlStateManager._enableBlend();
      GL11.glBlendFunc(srcFactor.glId, dstFactor.glId);
   }

   private static long getBufferCapacity(BufferAllocator buffer) {
      if (BUFFER_ALLOCATOR_SIZE_FIELD != null && buffer != null) {
         try {
            return BUFFER_ALLOCATOR_SIZE_FIELD.getLong(buffer);
         } catch (Exception ignored) {
            return -1L;
         }
      } else {
         return -1L;
      }
   }

   public static void bindFramebuffer(Framebuffer framebuffer) {
      if (framebuffer != null && framebuffer.getColorAttachmentView() != null) {
         bindFramebuffer(framebuffer.getColorAttachmentView(), framebuffer.getDepthAttachmentView());
      }
   }

   private static BufferAllocator getPooledBuffer(int size) {
      BufferAllocator buffer = BUFFER_POOL.poll();
      if (buffer == null) {
         buffer = new BufferAllocator(size);
         bufferPoolMisses++;
      } else {
         try {
            buffer.clear();
            bufferPoolHits++;
         } catch (IllegalStateException var5) {
            try {
               buffer.close();
            } catch (Exception var4) {
            }

            buffer = new BufferAllocator(size);
            bufferPoolMisses++;
         }
      }

      return buffer;
   }

   public static void captureFramebufferState(ChromaRenderer.FramebufferState state) {
      if (state != null) {
         state.framebufferId = GL11.glGetInteger(36006);
         int[] viewport = VIEWPORT_BUFFER.get();
         GL11.glGetIntegerv(2978, viewport);
         state.viewportX = viewport[0];
         state.viewportY = viewport[1];
         state.viewportWidth = viewport[2];
         state.viewportHeight = viewport[3];
      }
   }

   public static void applyDefaultBlend() {
      GlStateManager._enableBlend();
      GL11.glBlendFunc(صْ.SRC_ALPHA.glId, حن.ONE_MINUS_SRC_ALPHA.glId);
   }

   public static void applyBlend(صْ dstColor, حن srcColor, صْ srcAlpha, حن dstAlpha) {
      GlStateManager._enableBlend();
      GL14.glBlendFuncSeparate(srcColor.glId, dstColor.glId, srcAlpha.glId, dstAlpha.glId);
   }

   private static void returnBuffer(BufferAllocator buffer) {
      if (buffer != null) {
         try {
            long capacity = getBufferCapacity(buffer);
            if (capacity > 8388608L) {
               buffer.close();
            } else if (BUFFER_POOL.size() < 16) {
               buffer.clear();
               BUFFER_POOL.offer(buffer);
            } else {
               buffer.close();
            }
         } catch (IllegalStateException e) {
            try {
               buffer.close();
            } catch (Exception var3) {
            }
         }
      }
   }

   public static اِ createMesh(DrawMode drawMode, VertexFormat buildConsumer, Consumer<MeshBuilder> vertexFormat) {
      MeshBuilder meshBuilder = borrowMeshBuilder(drawMode, vertexFormat);
      BufferAllocator buffer = meshBuilder.getBufferAllocator();

      try {
         buildConsumer.accept(meshBuilder);
      } catch (Exception var10) {
         returnBuffer(buffer);
         recycleMeshBuilder(meshBuilder);
         throw var10;
      }

      try {
         return meshBuilder.buildNullable();
      } finally {
         recycleMeshBuilder(meshBuilder);
      }
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

   public static اِ createSmallMesh(DrawMode drawMode, VertexFormat buildConsumer, Consumer<MeshBuilder> vertexFormat) {
      BufferAllocator buffer = getPooledBuffer(262144);
      MeshBuilder meshBuilder = new MeshBuilder(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);

      try {
         buildConsumer.accept(meshBuilder);
      } catch (Exception var6) {
         returnBuffer(buffer);
         throw var6;
      }

      return meshBuilder.buildNullable();
   }

   public static void beginDrawScope() {
      if (drawScopeDepth++ == 0) {
         MATRIX_PROGRAMS_IN_SCOPE.clear();
      }
   }

   public static void initMatrix() {
      if (drawScopeDepth <= 0 || globalProgram == null || MATRIX_PROGRAMS_IN_SCOPE.put(globalProgram, Boolean.TRUE) == null) {
         if (projectionUniform != null) {
            GpuBufferSlice slice = RenderSystem.getProjectionMatrixBuffer();
            projectionUniform.set(slice);
         }

         if (modelViewUniform != null) {
            modelViewUniform.set(RenderSystem.getModelViewMatrix());
         }
      }
   }

   public static void restoreFramebufferState(ChromaRenderer.FramebufferState state) {
      if (state != null) {
         GlStateManager._glBindFramebuffer(36160, state.framebufferId);
         GlStateManager._viewport(state.viewportX, state.viewportY, state.viewportWidth, state.viewportHeight);
      }
   }

   public static void bindMainFramebuffer() {
      bindFramebuffer(MinecraftClient.getInstance().getFramebuffer());
   }

   @Generated
   public static GlProgram getGlobalProgram() {
      return globalProgram;
   }

   public static MeshBuilder borrowMeshBuilder(DrawMode drawMode, VertexFormat vertexFormat) {
      MeshBuilder meshBuilder = MESH_BUILDER_POOL.poll();
      if (meshBuilder == null) {
         BufferAllocator buffer = getPooledBuffer(1048576);
         meshBuilder = new MeshBuilder(buffer, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
      } else {
         BufferAllocator var4 = getPooledBuffer(1048576);
         meshBuilder.set(var4, drawMode, vertexFormat, false, ChromaRenderer::returnBuffer);
      }

      return meshBuilder;
   }

   public static void draw(IMesh mesh) {
      draw(ضد.CUSTOM_BUFFER, mesh, true);
   }

   private static Field resolveBufferAllocatorSizeField() {
      try {
         Field field = BufferAllocator.class.getDeclaredField("capacity");
         field.setAccessible(true);
         return field;
      } catch (Exception var1) {
         return null;
      }
   }

   @Generated
   public static int getBufferPoolHits() {
      return bufferPoolHits;
   }

   public static void init(ToIntFunction<GlGpuBuffer> scaleGetter, IntSupplier bufferIdGetter) {
      if (initialized) {
         throw new IllegalStateException("Renderer has already initialized.");
      }

      ChromaRenderer.bufferIdGetter = bufferIdGetter;
      ChromaRenderer.scaleGetter = scaleGetter;
      initialized = true;
   }

   public static ChromaRenderer.FramebufferState captureFramebufferState() {
      ChromaRenderer.FramebufferState state = new ChromaRenderer.FramebufferState();
      captureFramebufferState(state);
      return state;
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
      if (drawScopeDepth > 0) {
         if (--drawScopeDepth == 0) {
            MATRIX_PROGRAMS_IN_SCOPE.clear();
            GlProgram active = GlProgram.ACTIVE_PROGRAM;
            if (active != null) {
               active.unbind();
            }
         }
      }
   }

   public static void draw(IMesh close, boolean mesh) {
      draw(ضد.CUSTOM_BUFFER, mesh, close);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static <T> void draw(BiConsumer<T, Boolean> close, T renderConsumer, boolean builtBuffer) {
      globalProgram.bind();
      boolean var5 = false /* VF: Semaphore variable */;

      try {
         var5 = true;
         renderConsumer.accept(builtBuffer, close);
         var5 = false;
      } finally {
         if (var5) {
            if (drawScopeDepth == 0) {
               globalProgram.unbind();
            }
         }
      }

      if (drawScopeDepth == 0) {
         globalProgram.unbind();
      }
   }

   public static void cleanup() {
      اِ.clearVertexBufferPool();

      BufferAllocator pooledBuffer;
      while ((pooledBuffer = BUFFER_POOL.poll()) != null) {
         try {
            pooledBuffer.close();
         } catch (Exception var2) {
         }
      }

      MESH_BUILDER_POOL.clear();
      bufferPoolHits = 0;
      bufferPoolMisses = 0;
   }

   public static void bindFramebuffer(GpuTextureView depthTexture, GpuTextureView colorTexture) {
      رآ.bindFrameBuffer(رآ.getFrameBufferId(colorTexture, depthTexture), colorTexture);
   }

   public static void disableBlend() {
      GlStateManager._disableBlend();
   }

   @Generated
   public static Logger getLogger() {
      return logger;
   }

   // $VF: Compiled from heavy
   public static final class FramebufferState {
      public int framebufferId;
      public int viewportX;
      public int viewportWidth;
      public int viewportY;
      public int viewportHeight;

      public FramebufferState() {
      }

      public FramebufferState(int viewportWidth, int viewportY, int framebufferId, int viewportX, int viewportHeight) {
         this.framebufferId = framebufferId;
         this.viewportX = viewportX;
         this.viewportY = viewportY;
         this.viewportWidth = viewportWidth;
         this.viewportHeight = viewportHeight;
      }
   }
}
