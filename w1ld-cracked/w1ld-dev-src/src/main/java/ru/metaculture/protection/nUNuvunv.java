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
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import net.minecraft.class_10042;
import net.minecraft.class_1041;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_11280;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4668;
import net.minecraft.class_11280.class_11281;
import net.minecraft.class_1921.class_4688;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.glfw.GLFW;

public final class nUNuvunv {
   private static final int UuUVuuUu = 1048576;
   private static final int C00OOC00oO = 5;
   private static final long uUnuvNvvNU = System.nanoTime();
   private static final class_2960 vVvUvVVuuNvV = class_2960.method_60655("wild", "core/prismatic_chams");
   private static final int uNNnnnuuuN = new Std140SizeCalculator().putVec4().putVec4().putVec4().putVec4().putVec4().putVec4().putIVec4().get();
   private static final RenderPipeline nuUnNvnuUu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(class_2960.method_60655("wild", "pipeline/sss_chams_visible"))
         .withVertexShader(vVvUvVVuuNvV)
         .withFragmentShader(vVvUvVVuuNvV)
         .withSampler("u_ScreenTexture")
         .withUniform("PrismaticChams", class_10789.field_60031)
         .withVertexFormat(class_290.field_1580, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withColorWrite(true, true)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline VVuuUN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(class_2960.method_60655("wild", "pipeline/sss_chams_depth"))
         .withVertexShader(vVvUvVVuuNvV)
         .withFragmentShader(vVvUvVVuuNvV)
         .withSampler("u_ScreenTexture")
         .withUniform("PrismaticChams", class_10789.field_60031)
         .withVertexFormat(class_290.field_1580, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withColorWrite(true, true)
         .withDepthWrite(true)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final class_1921 vNUvnnVnUvu = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049(
         "wild/sss_chams_visible",
         1048576,
         false,
         true,
         nuUnNvnuUu,
         class_4688.method_23598()
            .method_34577(class_4668.field_21378)
            .method_23608(class_4668.field_21383)
            .method_23611(class_4668.field_21385)
            .method_23617(false)
      ),
      nUNuvunv::UuUVuuUu
   );
   private static final class_1921 uVUuuVnNVU = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049(
         "wild/sss_chams_depth",
         1048576,
         false,
         true,
         VVuuUN,
         class_4688.method_23598()
            .method_34577(class_4668.field_21378)
            .method_23608(class_4668.field_21383)
            .method_23611(class_4668.field_21385)
            .method_23617(false)
      ),
      nUNuvunv::UuUVuuUu
   );
   private static final nUNuvunv.NVnVnNnN vuuuNvNuv = new nUNuvunv.NVnVnNnN(
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
   private static class_11280<nUNuvunv.NVnVnNnN> nvUVNnuu;
   private static nUNuvunv.NVnVnNnN UuuNnUvUuv = vuuuNvNuv;
   private static GpuBufferSlice nUUVuvU;
   private static GpuTexture UnUNVVVNuv;
   private static GpuTextureView vNVuvnUUnuUn;
   private static TextureFormat UvnvNVnnnnNU;
   private static int uVUVnuvnuVuv;
   private static int NVNnnvnuunNv;
   private static boolean uVunuUNVVUUV;

   private nUNuvunv() {
   }

   public static void UuUVuuUu() {
      if (vNUvnnVnUvu == null || uVUuuVnNVU == null) {
         vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("PrismaticChamsShaderRegistry.init", new IllegalStateException("SSS chams shader registry failed"));
      }
   }

   public static class_1921 C00OOC00oO() {
      return vNUvnnVnUvu;
   }

   public static class_1921 uUnuvNvvNU() {
      return uVUuuVnNVU;
   }

   public static class_1921 UuUVuuUu(Chams var0) {
      return var0 != null && !var0.vNVuvnUUnuUn() ? uVUuuVnNVU : vNUvnnVnUvu;
   }

   public static void vVvUvVVuuNvV() {
      uVunuUNVVUUV = false;
      if (nUUVuvU()) {
         class_310 var0 = class_310.method_1551();
         if (var0 != null) {
            class_276 var1 = var0.method_1522();
            if (var1 != null) {
               GpuTexture var2 = var1.method_30277();
               if (var2 != null && !var2.isClosed()) {
                  int var3 = Math.max(1, var2.getWidth(0));
                  int var4 = Math.max(1, var2.getHeight(0));
                  UuUVuuUu(var2, var3, var4);
                  if (UnUNVVVNuv != null && vNVuvnUUnuUn != null && !UnUNVVVNuv.isClosed() && !vNVuvnUUnuUn.isClosed()) {
                     RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var2, UnUNVVVNuv, 0, 0, 0, 0, 0, var3, var4);
                     uVUVnuvnuVuv = var3;
                     NVNnnvnuunNv = var4;
                     uVunuUNVVUUV = true;
                     RenderSystem.setShaderTexture(1, vNVuvnUUnuUn);
                  }
               }
            }
         }
      }
   }

   public static void UuUVuuUu(Chams var0, class_10042 var1, float var2, float var3) {
      if (var0 == null) {
         UuuNnUvUuv = vuuuNvNuv;
      } else {
         float[] var4 = var0.UvnvNVnnnnNU();
         float[] var5 = var0.uVUVnuvnuVuv();
         class_243 var6 = UuuNnUvUuv();
         float var7 = (float)(System.nanoTime() - uUnuvNvvNU) / 1.0E9F;
         float var8 = UuUVuuUu(var1);
         float var9 = var0.vNVuvnUUnuUn() ? 0.0F : (var0.UnUNVVVNuv() ? 1.0F : 2.0F);
         Vector4f var10 = nvUVNnuu();
         UuuNnUvUuv = new nUNuvunv.NVnVnNnN(
            new Vector4f(var4[0], var4[1], var4[2], var4[3]),
            new Vector4f(var5[0], var5[1], var5[2], var5[3]),
            new Vector4f((float)var6.field_1352, (float)var6.field_1351, (float)var6.field_1350, var7),
            new Vector4f(var0.UUVNuUNUvUnV.uUnuvNvvNU(), var0.vuvnUnVnUNnV.uUnuvNvvNU(), var0.nnuUVNUuvvVU.uUnuvNvvNU(), 0.0F),
            new Vector4f(var3, var2, var8, var9),
            var10,
            var0.nUUVuvU(),
            0,
            0,
            0
         );
         VVuuUN();
      }
   }

   public static void uNNnnnuuuN() {
      if (nvUVNnuu != null && nUUVuvU()) {
         nvUVNnuu.method_71100();
      }

      nUUVuvU = null;
      uVunuUNVVUUV = false;
   }

   public static void nuUnNvnuUu() {
      class_11280 var0 = nvUVNnuu;
      nvUVNnuu = null;
      nUUVuvU = null;
      uVunuUNVVUUV = false;
      if (var0 != null && nUUVuvU()) {
         var0.close();
      }

      uVUuuVnNVU();
   }

   private static void UuUVuuUu(RenderPass var0) {
      GpuBufferSlice var1 = nUUVuvU;
      if (var1 == null) {
         vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("PrismaticChamsShaderRegistry.uniform", new IllegalStateException("PrismaticChams uniform slice is not prepared"));
      }

      var0.setUniform("PrismaticChams", var1);
      GpuTextureView var2 = vuuuNvNuv();
      if (var2 == null || var2.isClosed()) {
         vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("PrismaticChamsShaderRegistry.sampler", new IllegalStateException("u_ScreenTexture sampler is unavailable"));
      }

      var0.bindSampler("u_ScreenTexture", var2);
   }

   private static void VVuuUN() {
      nUUVuvU = nUUVuvU() ? vNUvnnVnUvu().method_71102(UuuNnUvUuv == null ? vuuuNvNuv : UuuNnUvUuv) : null;
   }

   private static class_11280<nUNuvunv.NVnVnNnN> vNUvnnVnUvu() {
      if (nvUVNnuu == null) {
         nvUVNnuu = new class_11280("SSS Chams UBO", uNNnnnuuuN, 4);
      }

      return nvUVNnuu;
   }

   private static void UuUVuuUu(GpuTexture var0, int var1, int var2) {
      TextureFormat var3 = var0.getFormat();
      if (UnUNVVVNuv == null
         || vNVuvnUUnuUn == null
         || UnUNVVVNuv.isClosed()
         || vNVuvnUUnuUn.isClosed()
         || uVUVnuvnuVuv != var1
         || NVNnnvnuunNv != var2
         || UvnvNVnnnnNU != var3) {
         uVUuuVnNVU();
         UnUNVVVNuv = RenderSystem.getDevice().createTexture("Wild SSS Chams Screen", 5, var3, var1, var2, 1, 1);
         vNVuvnUUnuUn = RenderSystem.getDevice().createTextureView(UnUNVVVNuv);
         UvnvNVnnnnNU = var3;
         uVUVnuvnuVuv = var1;
         NVNnnvnuunNv = var2;
         UnUNVVVNuv.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         UnUNVVVNuv.setTextureFilter(FilterMode.LINEAR, false);
      }
   }

   private static void uVUuuVnNVU() {
      GpuTextureView var0 = vNVuvnUUnuUn;
      GpuTexture var1 = UnUNVVVNuv;
      vNVuvnUUnuUn = null;
      UnUNVVVNuv = null;
      UvnvNVnnnnNU = null;
      uVUVnuvnuVuv = 0;
      NVNnnvnuunNv = 0;
      if (var0 != null && !var0.isClosed()) {
         var0.close();
      }

      if (var1 != null && !var1.isClosed()) {
         var1.close();
      }
   }

   private static GpuTextureView vuuuNvNuv() {
      if (uVunuUNVVUUV && vNVuvnUUnuUn != null && !vNVuvnUUnuUn.isClosed()) {
         return vNVuvnUUnuUn;
      } else {
         class_310 var0 = class_310.method_1551();
         if (var0 != null && var0.method_1522() != null) {
            GpuTextureView var1 = var0.method_1522().method_71639();
            return var1 != null && !var1.isClosed() ? var1 : UuUVuuUu("framebuffer color attachment view is unavailable");
         } else {
            return UuUVuuUu("client framebuffer is unavailable");
         }
      }
   }

   private static GpuTextureView UuUVuuUu(String var0) {
      IllegalStateException var1 = new IllegalStateException(var0);
      vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("PrismaticChamsShaderRegistry.screenSampler", var1);
      throw var1;
   }

   private static Vector4f nvUVNnuu() {
      int var0 = uVunuUNVVUUV && uVUVnuvnuVuv > 0 ? uVUVnuvnuVuv : 0;
      int var1 = uVunuUNVVUUV && NVNnnvnuunNv > 0 ? NVNnnvnuunNv : 0;
      if (var0 <= 0 || var1 <= 0) {
         class_310 var2 = class_310.method_1551();
         class_1041 var3 = var2 == null ? null : var2.method_22683();
         if (var3 != null) {
            var0 = var3.method_4489();
            var1 = var3.method_4506();
         }
      }

      var0 = Math.max(1, var0);
      var1 = Math.max(1, var1);
      return new Vector4f(var0, var1, 1.0F / var0, 1.0F / var1);
   }

   private static class_243 UuuNnUvUuv() {
      class_310 var0 = class_310.method_1551();
      return var0 != null && var0.field_1773 != null && var0.field_1773.method_19418() != null
         ? var0.field_1773.method_19418().method_19326()
         : class_243.field_1353;
   }

   private static boolean nUUVuvU() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float UuUVuuUu(class_10042 var0) {
      if (var0 == null) {
         return 0.0F;
      } else {
         int var1 = ((uuUUunvVVu)var0).wild$getEntityId();
         int var2 = var1 == Integer.MIN_VALUE ? Float.floatToIntBits((float)var0.field_53325 * 17.0F + (float)var0.field_53327 * 31.0F) : var1;
         var2 ^= var2 << 13;
         var2 ^= var2 >>> 17;
         var2 ^= var2 << 5;
         return (var2 & 65535) / 65535.0F;
      }
   }

   record NVnVnNnN(
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
   ) implements class_11281 {
      public void method_71104(ByteBuffer var1) {
         Std140Builder.intoBuffer(var1)
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
