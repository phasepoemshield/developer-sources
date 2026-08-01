package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.nio.ByteBuffer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.DynamicUniformStorage;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.gl.DynamicUniformStorage.Uploadable;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.Window;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.glfw.GLFW;

public final class PrismaticChamsRenderer {
   private static final int O00000000 = 1048576;
   private static final int O000000000 = 5;
   private static final long O0000000000 = System.nanoTime();
   private static final Identifier O00000000000 = Identifier.of("wild", "core/prismatic_chams");
   private static final int O000000000000 = new Std140SizeCalculator().putVec4().putVec4().putVec4().putVec4().putVec4().putVec4().putIVec4().get();
   private static final RenderPipeline O0000000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/sss_chams_visible"))
         .withVertexShader(O00000000000)
         .withFragmentShader(O00000000000)
         .withSampler("u_ScreenTexture")
         .withUniform("PrismaticChams", UniformType.UNIFORM_BUFFER)
         .withVertexFormat(VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withColorWrite(true, true)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O000000000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/sss_chams_depth"))
         .withVertexShader(O00000000000)
         .withFragmentShader(O00000000000)
         .withSampler("u_ScreenTexture")
         .withUniform("PrismaticChams", UniformType.UNIFORM_BUFFER)
         .withVertexFormat(VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withColorWrite(true, true)
         .withDepthWrite(true)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderLayer O00000000000O = O0000O0O0O.O00000000(
      RenderLayer.of(
         "wild/sss_chams_visible",
         1048576,
         false,
         true,
         O0000000000000,
         MultiPhaseParameters.builder()
            .texture(RenderPhase.NO_TEXTURE)
            .lightmap(RenderPhase.ENABLE_LIGHTMAP)
            .overlay(RenderPhase.ENABLE_OVERLAY_COLOR)
            .build(false)
      ),
      PrismaticChamsRenderer::O00000000
   );
   private static final RenderLayer O00000000000O0 = O0000O0O0O.O00000000(
      RenderLayer.of(
         "wild/sss_chams_depth",
         1048576,
         false,
         true,
         O000000000000O,
         MultiPhaseParameters.builder()
            .texture(RenderPhase.NO_TEXTURE)
            .lightmap(RenderPhase.ENABLE_LIGHTMAP)
            .overlay(RenderPhase.ENABLE_OVERLAY_COLOR)
            .build(false)
      ),
      PrismaticChamsRenderer::O00000000
   );
   private static final PrismaticChamsRenderer.W191 O00000000000OO = new PrismaticChamsRenderer.W191(
      new Vector4f(0.12F, 0.82F, 1.0F, 1.0F),
      new Vector4f(0.82F, 0.18F, 1.0F, 1.0F),
      new Vector4f(0.0F, 0.0F, 0.0F, 0.0F),
      new Vector4f(1.35F, 1.0F, 0.72F, 0.0F),
      new Vector4f(1.0F, 0.0F, 0.0F, 0.0F),
      new Vector4f(1.0F, 1.0F, 1.0F, 1.0F),
      0,
      0,
      0,
      0
   );
   private static DynamicUniformStorage<PrismaticChamsRenderer.W191> O0000000000O;
   private static PrismaticChamsRenderer.W191 O0000000000O0 = O00000000000OO;
   private static GpuBufferSlice O0000000000O00;
   private static GpuTexture O0000000000O0O;
   private static GpuTextureView O0000000000OO;
   private static TextureFormat O0000000000OO0;
   private static int O0000000000OOO;
   private static int O000000000O;
   private static boolean O000000000O0;

   private PrismaticChamsRenderer() {
   }

   public static void O00000000() {
      if (O00000000000O == null || O00000000000O0 == null) {
         O00000000OO0OO.O00000000().O000000000("PrismaticChamsShaderRegistry.init", new IllegalStateException("SSS chams shader registry failed"));
      }
   }

   public static RenderLayer O000000000() {
      return O00000000000O;
   }

   public static RenderLayer O0000000000() {
      return O00000000000O0;
   }

   public static RenderLayer O00000000(Chams o00000O00O00O) {
      return o00000O00O00O != null && !o00000O00O00O.O0000000000OO() ? O00000000000O0 : O00000000000O;
   }

   public static void O00000000000() {
      O000000000O0 = false;
      if (O0000000000O00()) {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0 != null) {
            Framebuffer var1 = var0.getFramebuffer();
            if (var1 != null) {
               GpuTexture var2 = var1.getColorAttachment();
               if (var2 != null && !var2.isClosed()) {
                  int var3 = Math.max(1, var2.getWidth(0));
                  int var4 = Math.max(1, var2.getHeight(0));
                  O00000000(var2, var3, var4);
                  if (O0000000000O0O != null && O0000000000OO != null && !O0000000000O0O.isClosed() && !O0000000000OO.isClosed()) {
                     RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var2, O0000000000O0O, 0, 0, 0, 0, 0, var3, var4);
                     O0000000000OOO = var3;
                     O000000000O = var4;
                     O000000000O0 = true;
                     RenderSystem.setShaderTexture(1, O0000000000OO);
                  }
               }
            }
         }
      }
   }

   public static void O00000000(Chams o00000O00O00O, LivingEntityRenderState livingEntityRenderState, float f, float g) {
      if (o00000O00O00O == null) {
         O0000000000O0 = O00000000000OO;
      } else {
         float[] var4 = o00000O00O00O.O0000000000OO0();
         float[] var5 = o00000O00O00O.O0000000000OOO();
         Vec3d var6 = O0000000000O0();
         float var7 = (float)(System.nanoTime() - O0000000000) / 1.0E9F;
         float var8 = O00000000(livingEntityRenderState);
         float var9 = o00000O00O00O.O0000000000OO() ? 0.0F : (o00000O00O00O.O0000000000O0O() ? 1.0F : 2.0F);
         Vector4f var10 = O0000000000O();
         O0000000000O0 = new PrismaticChamsRenderer.W191(
            new Vector4f(var4[0], var4[1], var4[2], var4[3]),
            new Vector4f(var5[0], var5[1], var5[2], var5[3]),
            new Vector4f((float)var6.x, (float)var6.y, (float)var6.z, var7),
            new Vector4f(o00000O00O00O.O000000000OOOO.O0000000000(), o00000O00O00O.O00000000O.O0000000000(), o00000O00O00O.O00000000O0.O0000000000(), 0.0F),
            new Vector4f(g, f, var8, var9),
            var10,
            o00000O00O00O.O0000000000O00(),
            0,
            0,
            0
         );
         O000000000000O();
      }
   }

   public static void O000000000000() {
      if (O0000000000O != null && O0000000000O00()) {
         O0000000000O.clear();
      }

      O0000000000O00 = null;
      O000000000O0 = false;
   }

   public static void O0000000000000() {
      DynamicUniformStorage var0 = O0000000000O;
      O0000000000O = null;
      O0000000000O00 = null;
      O000000000O0 = false;
      if (var0 != null && O0000000000O00()) {
         var0.close();
      }

      O00000000000O0();
   }

   private static void O00000000(RenderPass renderPass) {
      GpuBufferSlice var1 = O0000000000O00;
      if (var1 == null) {
         O00000000OO0OO.O00000000()
            .O000000000("PrismaticChamsShaderRegistry.uniform", new IllegalStateException("PrismaticChams uniform slice is not prepared"));
      }

      renderPass.setUniform("PrismaticChams", var1);
      GpuTextureView var2 = O00000000000OO();
      if (var2 == null || var2.isClosed()) {
         O00000000OO0OO.O00000000().O000000000("PrismaticChamsShaderRegistry.sampler", new IllegalStateException("u_ScreenTexture sampler is unavailable"));
      }

      renderPass.bindSampler("u_ScreenTexture", var2);
   }

   private static void O000000000000O() {
      O0000000000O00 = O0000000000O00() ? O00000000000O().write(O0000000000O0 == null ? O00000000000OO : O0000000000O0) : null;
   }

   private static DynamicUniformStorage<PrismaticChamsRenderer.W191> O00000000000O() {
      if (O0000000000O == null) {
         O0000000000O = new DynamicUniformStorage("SSS Chams UBO", O000000000000, 4);
      }

      return O0000000000O;
   }

   private static void O00000000(GpuTexture gpuTexture, int i, int j) {
      TextureFormat var3 = gpuTexture.getFormat();
      if (O0000000000O0O == null
         || O0000000000OO == null
         || O0000000000O0O.isClosed()
         || O0000000000OO.isClosed()
         || O0000000000OOO != i
         || O000000000O != j
         || O0000000000OO0 != var3) {
         O00000000000O0();
         O0000000000O0O = RenderSystem.getDevice().createTexture("Wild SSS Chams Screen", 5, var3, i, j, 1, 1);
         O0000000000OO = RenderSystem.getDevice().createTextureView(O0000000000O0O);
         O0000000000OO0 = var3;
         O0000000000OOO = i;
         O000000000O = j;
         O0000000000O0O.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         O0000000000O0O.setTextureFilter(FilterMode.LINEAR, false);
      }
   }

   private static void O00000000000O0() {
      GpuTextureView var0 = O0000000000OO;
      GpuTexture var1 = O0000000000O0O;
      O0000000000OO = null;
      O0000000000O0O = null;
      O0000000000OO0 = null;
      O0000000000OOO = 0;
      O000000000O = 0;
      if (var0 != null && !var0.isClosed()) {
         var0.close();
      }

      if (var1 != null && !var1.isClosed()) {
         var1.close();
      }
   }

   private static GpuTextureView O00000000000OO() {
      if (O000000000O0 && O0000000000OO != null && !O0000000000OO.isClosed()) {
         return O0000000000OO;
      } else {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0 != null && var0.getFramebuffer() != null) {
            GpuTextureView var1 = var0.getFramebuffer().getColorAttachmentView();
            return var1 != null && !var1.isClosed() ? var1 : O00000000("framebuffer color attachment view is unavailable");
         } else {
            return O00000000("client framebuffer is unavailable");
         }
      }
   }

   private static GpuTextureView O00000000(String string) {
      IllegalStateException var1 = new IllegalStateException(string);
      O00000000OO0OO.O00000000().O000000000("PrismaticChamsShaderRegistry.screenSampler", var1);
      throw var1;
   }

   private static Vector4f O0000000000O() {
      int var0 = O000000000O0 && O0000000000OOO > 0 ? O0000000000OOO : 0;
      int var1 = O000000000O0 && O000000000O > 0 ? O000000000O : 0;
      if (var0 <= 0 || var1 <= 0) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         Window var3 = var2 == null ? null : var2.getWindow();
         if (var3 != null) {
            var0 = var3.getFramebufferWidth();
            var1 = var3.getFramebufferHeight();
         }
      }

      var0 = Math.max(1, var0);
      var1 = Math.max(1, var1);
      return new Vector4f(var0, var1, 1.0F / var0, 1.0F / var1);
   }

   private static Vec3d O0000000000O0() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      return var0 != null && var0.gameRenderer != null && var0.gameRenderer.getCamera() != null ? var0.gameRenderer.getCamera().getPos() : Vec3d.ZERO;
   }

   private static boolean O0000000000O00() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float O00000000(LivingEntityRenderState livingEntityRenderState) {
      if (livingEntityRenderState == null) {
         return 0.0F;
      } else {
         int var1 = ((O0000O00OO000O)livingEntityRenderState).wild$getEntityId();
         int var2 = var1 == Integer.MIN_VALUE
            ? Float.floatToIntBits((float)livingEntityRenderState.x * 17.0F + (float)livingEntityRenderState.z * 31.0F)
            : var1;
         var2 ^= var2 << 13;
         var2 ^= var2 >>> 17;
         var2 ^= var2 << 5;
         return (var2 & 65535) / 65535.0F;
      }
   }

   record W191(
      Vector4fc accentTop,
      Vector4fc accentBottom,
      Vector4fc cameraAndTime,
      Vector4fc params,
      Vector4fc state,
      Vector4fc resolution,
      int mode,
      int flagA,
      int flagB,
      int flagC
   ) implements Uploadable {
      public void write(ByteBuffer buffer) {
         Std140Builder.intoBuffer(buffer)
            .putVec4(this.accentTop)
            .putVec4(this.accentBottom)
            .putVec4(this.cameraAndTime)
            .putVec4(this.params)
            .putVec4(this.state)
            .putVec4(this.resolution)
            .putIVec4(this.mode, this.flagA, this.flagB, this.flagC);
      }
   }
}
