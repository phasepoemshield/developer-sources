package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_11280;
import net.minecraft.class_1921;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_11280.class_11281;
import net.minecraft.class_1921.class_4688;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.glfw.GLFW;

public final class uvuvNuUnNVuu {
   private static final int UuUVuuUu = 2097152;
   private static final int C00OOC00oO = 7;
   private static final int uUnuvNvvNU = new Std140SizeCalculator()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putMat4f()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .get();
   private static final class_2960 vVvUvVVuuNvV = class_2960.method_60655("wild", "core/chinahat_depth");
   private static final class_2960 uNNnnnuuuN = class_2960.method_60655("wild", "core/chinahat");
   private static final class_2960 nuUnNvnuUu = class_2960.method_60655("wild", "core/chinahat_aura");
   private static final RenderPipeline VVuuUN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(class_2960.method_60655("wild", "pipeline/chinahat_depth"))
         .withVertexShader(vVvUvVVuuNvV)
         .withFragmentShader(vVvUvVVuuNvV)
         .withVertexFormat(class_290.field_1577, class_5596.field_27379)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withColorWrite(false, false)
         .withDepthWrite(true)
         .withoutBlend()
         .build()
   );
   private static final RenderPipeline vNUvnnVnUvu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/chinahat_material"))
         .withVertexShader(uNNnnnuuuN)
         .withFragmentShader(uNNnnnuuuN)
         .withSampler("u_SceneColor")
         .withSampler("u_SceneDepth")
         .withUniform("ChinaHatMaterial", class_10789.field_60031)
         .withVertexFormat(class_290.field_1577, class_5596.field_27379)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .withColorWrite(true, false)
         .withDepthWrite(false)
         .withoutBlend()
         .build()
   );
   private static final RenderPipeline uVUuuVnNVU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/chinahat_aura"))
         .withVertexShader(nuUnNvnuUu)
         .withFragmentShader(nuUnNvnuUu)
         .withSampler("u_SceneColor")
         .withSampler("u_SceneDepth")
         .withUniform("ChinaHatMaterial", class_10789.field_60031)
         .withVertexFormat(class_290.field_1577, class_5596.field_27379)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withColorWrite(true, false)
         .withDepthWrite(true)
         .withoutBlend()
         .build()
   );
   private static final class_1921 vuuuNvNuv = class_1921.method_24049(
      "wild/chinahat_depth", 2097152, false, false, VVuuUN, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 nvUVNnuu = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049("wild/chinahat_material", 2097152, false, false, vNUvnnVnUvu, class_4688.method_23598().method_23617(false)),
      uvuvNuUnNVuu::UuUVuuUu
   );
   private static final class_1921 UuuNnUvUuv = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049("wild/chinahat_aura", 2097152, false, false, uVUuuVnNVU, class_4688.method_23598().method_23617(false)), uvuvNuUnNVuu::C00OOC00oO
   );
   private static final NVuuVnVNUnUV<uvuvNuUnNVuu.NVnVnNnN> nUUVuvU = new NVuuVnVNUnUV<>(new uvuvNuUnNVuu.NVnVnNnN(), new uvuvNuUnNVuu.NVnVnNnN());
   private static class_11280<uvuvNuUnNVuu.NVnVnNnN> UnUNVVVNuv;
   private static GpuBufferSlice vNVuvnUUnuUn;
   private static GpuTexture UvnvNVnnnnNU;
   private static GpuTextureView uVUVnuvnuVuv;
   private static TextureFormat NVNnnvnuunNv;
   private static GpuTexture uVunuUNVVUUV;
   private static GpuTextureView UNnVVNvvnVvU;
   private static TextureFormat uNnUnnuNUnNu;
   private static int NnUuNNU;
   private static int nNvNUVU;
   private static boolean UnUNuUU;
   private static boolean uUVuVvuNUvnu;
   private static volatile boolean UvUvUNuvNU;
   private static final C0CCOcCOO0 c0oOOCcCoC0 = new C0CCOcCOO0();
   private static final Runnable VVnVNnunVvu = () -> {
      c0oOOCcCoC0.vVvUvVVuuNvV();
      if (c0oOOCcCoC0.C00OOC00oO()) {
         vuuuNvNuv();
      }
   };

   private uvuvNuUnNVuu() {
   }

   public static void UuUVuuUu() {
      if (vuuuNvNuv == null || nvUVNnuu == null || UuuNnUvUuv == null) {
         vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ChinaHatShaderRegistry.init", new IllegalStateException("ChinaHat shader registry failed"));
      }
   }

   public static class_1921 C00OOC00oO() {
      return vuuuNvNuv;
   }

   public static class_1921 uUnuvNvvNU() {
      return nvUVNnuu;
   }

   public static class_1921 vVvUvVVuuNvV() {
      return UuuNnUvUuv;
   }

   public static boolean UuUVuuUu(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      Matrix4fc var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      float var25,
      float var26,
      float var27,
      float var28,
      float var29,
      float var30,
      float var31
   ) {
      UnUNuUU = false;
      vNVuvnUUnuUn = null;
      if (!UuuNnUvUuv() || var19 == null) {
         return false;
      } else if (c0oOOCcCoC0.C00OOC00oO() && !vuuuNvNuv()) {
         return false;
      } else {
         class_310 var32 = class_310.method_1551();
         if (var32 == null) {
            return false;
         } else {
            class_276 var33 = var32.method_1522();
            if (var33 == null) {
               return false;
            } else {
               GpuTexture var34 = var33.method_30277();
               GpuTexture var35 = var33.method_30278();
               if (var34 != null && var35 != null && !var34.isClosed() && !var35.isClosed()) {
                  int var36 = Math.max(1, var34.getWidth(0));
                  int var37 = Math.max(1, var34.getHeight(0));
                  if (var35.getWidth(0) == var36 && var35.getHeight(0) == var37) {
                     try {
                        UuUVuuUu(var34, var35, var36, var37);
                        if (UvnvNVnnnnNU != null
                           && uVunuUNVVUUV != null
                           && uVUVnuvnuVuv != null
                           && UNnVVNvvnVvU != null
                           && !UvnvNVnnnnNU.isClosed()
                           && !uVunuUNVVUUV.isClosed()
                           && !uVUVnuvnuVuv.isClosed()
                           && !UNnVVNvvnVvU.isClosed()) {
                           CommandEncoder var38 = RenderSystem.getDevice().createCommandEncoder();
                           var38.copyTextureToTexture(var34, UvnvNVnnnnNU, 0, 0, 0, 0, 0, var36, var37);
                           var38.copyTextureToTexture(var35, uVunuUNVVUUV, 0, 0, 0, 0, 0, var36, var37);
                           uvuvNuUnNVuu.NVnVnNnN var41 = nUUVuvU.UuUVuuUu();
                           var41.UuUVuuUu(
                              var0,
                              var1,
                              var2,
                              var3,
                              var4,
                              var5,
                              var36,
                              var37,
                              var6,
                              var7,
                              var8,
                              var9,
                              var10,
                              var11,
                              var12,
                              var13,
                              var14,
                              var15,
                              var16,
                              var17,
                              var18,
                              var19,
                              var20,
                              var21,
                              var22,
                              var23,
                              var24,
                              var25,
                              var26,
                              var27,
                              var28,
                              var29,
                              var30,
                              var31
                           );
                           vNVuvnUUnuUn = vNUvnnVnUvu().method_71102(var41);
                           nUUVuvU.C00OOC00oO();
                           UnUNuUU = vNVuvnUUnuUn != null;
                           uUVuVvuNUvnu = false;
                           return UnUNuUU;
                        } else {
                           return false;
                        }
                     } catch (RuntimeException var40) {
                        vNVuvnUUnuUn = null;
                        RuntimeException var39 = UuUVuuUu(null);
                        if (var39 != null && var39 != var40) {
                           var40.addSuppressed(var39);
                        }

                        if (!uUVuVvuNUvnu) {
                           uUVuVvuNUvnu = true;
                           vVnvuVuVvnun.UuUVuuUu().UuUVuuUu("ChinaHat scene capture", var40);
                        }

                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            }
         }
      }
   }

   public static void uNNnnnuuuN() {
      if (UnUNuUU) {
         if (!UuuNnUvUuv()) {
            UuUVuuUu("ChinaHat depth restore is outside the render context");
         }

         class_310 var0 = class_310.method_1551();
         if (var0 == null) {
            UuUVuuUu("ChinaHat depth restore has no client");
         }

         class_276 var1 = var0.method_1522();
         GpuTexture var2 = var1 == null ? null : var1.method_30278();
         if (uVunuUNVVUUV == null
            || uVunuUNVVUUV.isClosed()
            || var2 == null
            || var2.isClosed()
            || var2.getWidth(0) != NnUuNNU
            || var2.getHeight(0) != nNvNUVU
            || var2.getFormat() != uNnUnnuNUnNu) {
            UuUVuuUu("ChinaHat depth restore target is unavailable");
         }

         RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(uVunuUNVVUUV, var2, 0, 0, 0, 0, 0, NnUuNNU, nNvNUVU);
      }
   }

   public static void nuUnNvnuUu() {
      if (c0oOOCcCoC0.C00OOC00oO()) {
         if (UuuNnUvUuv()) {
            vuuuNvNuv();
         }

         vNVuvnUUnuUn = null;
         UnUNuUU = false;
      } else {
         if (UnUNVVVNuv != null && UuuNnUvUuv()) {
            UnUNVVVNuv.method_71100();
         }

         vNVuvnUUnuUn = null;
         UnUNuUU = false;
      }
   }

   public static boolean VVuuUN() {
      c0oOOCcCoC0.UuUVuuUu();
      if (UuuNnUvUuv()) {
         return vuuuNvNuv();
      } else {
         uVUuuVnNVU();
         return false;
      }
   }

   private static void UuUVuuUu(RenderPass var0) {
      GpuBufferSlice var1 = vNVuvnUUnuUn;
      if (!UnUNuUU || var1 == null) {
         UuUVuuUu("ChinaHat material slice is not prepared");
      }

      if (uVUVnuvnuVuv == null || UNnVVNvvnVvU == null || uVUVnuvnuVuv.isClosed() || UNnVVNvvnVvU.isClosed()) {
         UuUVuuUu("ChinaHat scene snapshot is unavailable");
      }

      var0.setUniform("ChinaHatMaterial", var1);
      var0.bindSampler("u_SceneColor", uVUVnuvnuVuv);
      var0.bindSampler("u_SceneDepth", UNnVVNvvnVvU);
   }

   private static void C00OOC00oO(RenderPass var0) {
      GpuBufferSlice var1 = vNVuvnUUnuUn;
      if (!UnUNuUU || var1 == null || uVUVnuvnuVuv == null || UNnVVNvvnVvU == null || uVUVnuvnuVuv.isClosed() || UNnVVNvvnVvU.isClosed()) {
         UuUVuuUu("ChinaHat aura material is not prepared");
      }

      var0.setUniform("ChinaHatMaterial", var1);
      var0.bindSampler("u_SceneColor", uVUVnuvnuVuv);
      var0.bindSampler("u_SceneDepth", UNnVVNvvnVvU);
   }

   private static void UuUVuuUu(GpuTexture var0, GpuTexture var1, int var2, int var3) {
      TextureFormat var4 = var0.getFormat();
      TextureFormat var5 = var1.getFormat();
      if (UvnvNVnnnnNU == null
         || uVunuUNVVUUV == null
         || uVUVnuvnuVuv == null
         || UNnVVNvvnVvU == null
         || UvnvNVnnnnNU.isClosed()
         || uVunuUNVVUUV.isClosed()
         || uVUVnuvnuVuv.isClosed()
         || UNnVVNvvnVvU.isClosed()
         || NnUuNNU != var2
         || nNvNUVU != var3
         || NVNnnvnuunNv != var4
         || uNnUnnuNUnNu != var5) {
         RuntimeException var6 = UuUVuuUu(null);
         if (var6 != null) {
            throw var6;
         } else if (nvUVNnuu()) {
            throw new IllegalStateException("ChinaHat scene targets could not be released");
         } else {
            UvnvNVnnnnNU = RenderSystem.getDevice().createTexture("Wild ChinaHat Scene Color", 7, var4, var2, var3, 1, 1);
            uVUVnuvnuVuv = RenderSystem.getDevice().createTextureView(UvnvNVnnnnNU);
            UvnvNVnnnnNU.setAddressMode(AddressMode.CLAMP_TO_EDGE);
            UvnvNVnnnnNU.setTextureFilter(FilterMode.NEAREST, false);
            uVunuUNVVUUV = RenderSystem.getDevice().createTexture("Wild ChinaHat Scene Depth", 7, var5, var2, var3, 1, 1);
            UNnVVNvvnVvU = RenderSystem.getDevice().createTextureView(uVunuUNVVUUV);
            uVunuUNVVUUV.setAddressMode(AddressMode.CLAMP_TO_EDGE);
            uVunuUNVVUUV.setTextureFilter(FilterMode.NEAREST, false);
            NVNnnvnuunNv = var4;
            uNnUnnuNUnNu = var5;
            NnUuNNU = var2;
            nNvNUVU = var3;
         }
      }
   }

   private static class_11280<uvuvNuUnNVuu.NVnVnNnN> vNUvnnVnUvu() {
      if (UnUNVVVNuv == null) {
         UnUNVVVNuv = new class_11280("Wild ChinaHat Material", uUnuvNvvNU, 4);
      }

      return UnUNVVVNuv;
   }

   private static void uVUuuVnNVU() {
      if (c0oOOCcCoC0.uUnuvNvvNU()) {
         try {
            class_310 var0 = class_310.method_1551();
            if (var0 == null) {
               c0oOOCcCoC0.uNNnnnuuuN();
               return;
            }

            var0.execute(VVnVNnunVvu);
         } catch (RuntimeException var1) {
            c0oOOCcCoC0.uNNnnnuuuN();
            C00OOC00oO(var1);
         }
      }
   }

   private static boolean vuuuNvNuv() {
      if (!UuuNnUvUuv()) {
         return false;
      } else {
         vNVuvnUUnuUn = null;
         UnUNuUU = false;
         RuntimeException var0 = null;
         class_11280 var1 = UnUNVVVNuv;
         if (var1 != null) {
            vnuUnvNvnNnv.VvunVVUvUNnv var2 = vnuUnvNvnNnv.UuUVuuUu(var1, class_11280::close, var0x -> false);
            var0 = UuUVuuUu(var0, var2.failure());
            if (var2.released()) {
               UnUNVVVNuv = null;
            }
         }

         var0 = UuUVuuUu(var0);
         boolean var4 = UnUNVVVNuv == null && !nvUVNnuu();
         c0oOOCcCoC0.UuUVuuUu(var4);
         if (var0 != null) {
            C00OOC00oO(var0);
         }

         if (var4) {
            UvUvUNuvNU = false;
         }

         return var4;
      }
   }

   private static RuntimeException UuUVuuUu(RuntimeException var0) {
      GpuTextureView var1 = uVUVnuvnuVuv;
      if (var1 != null) {
         vnuUnvNvnNnv.VvunVVUvUNnv var2 = vnuUnvNvnNnv.UuUVuuUu(var1, var0x -> {
            if (!var0x.isClosed()) {
               var0x.close();
            }
         }, GpuTextureView::isClosed);
         var0 = UuUVuuUu(var0, var2.failure());
         if (var2.released()) {
            uVUVnuvnuVuv = null;
         }
      }

      GpuTextureView var5 = UNnVVNvvnVvU;
      if (var5 != null) {
         vnuUnvNvnNnv.VvunVVUvUNnv var3 = vnuUnvNvnNnv.UuUVuuUu(var5, var0x -> {
            if (!var0x.isClosed()) {
               var0x.close();
            }
         }, GpuTextureView::isClosed);
         var0 = UuUVuuUu(var0, var3.failure());
         if (var3.released()) {
            UNnVVNvvnVvU = null;
         }
      }

      if (uVUVnuvnuVuv == null) {
         GpuTexture var6 = UvnvNVnnnnNU;
         if (var6 != null) {
            vnuUnvNvnNnv.VvunVVUvUNnv var4 = vnuUnvNvnNnv.UuUVuuUu(var6, var0x -> {
               if (!var0x.isClosed()) {
                  var0x.close();
               }
            }, GpuTexture::isClosed);
            var0 = UuUVuuUu(var0, var4.failure());
            if (var4.released()) {
               UvnvNVnnnnNU = null;
            }
         }
      }

      if (UNnVVNvvnVvU == null) {
         GpuTexture var7 = uVunuUNVVUUV;
         if (var7 != null) {
            vnuUnvNvnNnv.VvunVVUvUNnv var8 = vnuUnvNvnNnv.UuUVuuUu(var7, var0x -> {
               if (!var0x.isClosed()) {
                  var0x.close();
               }
            }, GpuTexture::isClosed);
            var0 = UuUVuuUu(var0, var8.failure());
            if (var8.released()) {
               uVunuUNVVUUV = null;
            }
         }
      }

      if (!nvUVNnuu()) {
         NVNnnvnuunNv = null;
         uNnUnnuNUnNu = null;
         NnUuNNU = 0;
         nNvNUVU = 0;
      }

      return var0;
   }

   private static boolean nvUVNnuu() {
      return uVUVnuvnuVuv != null || UvnvNVnnnnNU != null || UNnVVNvvnVvU != null || uVunuUNVVUUV != null;
   }

   private static RuntimeException UuUVuuUu(RuntimeException var0, RuntimeException var1) {
      if (var1 == null) {
         return var0;
      } else if (var0 == null) {
         return var1;
      } else {
         if (var0 != var1) {
            var0.addSuppressed(var1);
         }

         return var0;
      }
   }

   private static void C00OOC00oO(RuntimeException var0) {
      if (!UvUvUNuvNU) {
         UvUvUNuvNU = true;

         try {
            vVnvuVuVvnun.UuUVuuUu().UuUVuuUu("ChinaHat resource release", var0);
         } catch (RuntimeException var2) {
         }
      }
   }

   private static boolean UuuNnUvUuv() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static void UuUVuuUu(String var0) {
      IllegalStateException var1 = new IllegalStateException(var0);
      vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ChinaHatShaderRegistry.material", var1);
      throw var1;
   }

   static final class NVnVnNnN implements class_11281 {
      private final Matrix4f UuUVuuUu = new Matrix4f();
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      private float vVvUvVVuuNvV;
      private float uNNnnnuuuN;
      private float nuUnNvnuUu;
      private float VVuuUN;
      private float vNUvnnVnUvu;
      private float uVUuuVnNVU;
      private float vuuuNvNuv;
      private float nvUVNnuu;
      private float UuuNnUvUuv;
      private float nUUVuvU;
      private float UnUNVVVNuv;
      private float vNVuvnUUnuUn;
      private float UvnvNVnnnnNU;
      private float uVUVnuvnuVuv;
      private float NVNnnvnuunNv;
      private float uVunuUNVVUUV;
      private float UNnVVNvvnVvU;
      private float uNnUnnuNUnNu;
      private float NnUuNNU;
      private float nNvNUVU;
      private float UnUNuUU;
      private float uUVuVvuNUvnu;
      private float UvUvUNuvNU;
      private float c0oOOCcCoC0;
      private float VVnVNnunVvu;
      private float unNNVVNnvvV;
      private float NuunnvnN;
      private float NVUunUNUN;
      private float UUVNuUNUvUnV;
      private float vuvnUnVnUNnV;
      private float nnuUVNUuvvVU;
      private float nVVUuvuNnUN;
      private float nNnVnUNVV;

      void UuUVuuUu(
         float var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         int var7,
         int var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         float var14,
         float var15,
         float var16,
         float var17,
         float var18,
         float var19,
         float var20,
         float var21,
         Matrix4fc var22,
         float var23,
         float var24,
         float var25,
         float var26,
         float var27,
         float var28,
         float var29,
         float var30,
         float var31,
         float var32,
         float var33,
         float var34
      ) {
         this.C00OOC00oO = UuUVuuUu(var1);
         this.uUnuvNvvNU = UuUVuuUu(var2);
         this.vVvUvVVuuNvV = UuUVuuUu(var3);
         this.uNNnnnuuuN = UuUVuuUu(var4);
         this.nuUnNvnuUu = UuUVuuUu(var5);
         this.VVuuUN = UuUVuuUu(var6);
         this.vNUvnnVnUvu = var7;
         this.uVUuuVnNVU = var8;
         this.vuuuNvNuv = 1.0F / var7;
         this.nvUVNnuu = 1.0F / var8;
         this.UuuNnUvUuv = Math.max(0.0F, Math.min(1.0F, var9));
         this.nUUVuvU = C00OOC00oO(var10);
         this.UnUNVVVNuv = C00OOC00oO(var11);
         this.vNVuvnUUnuUn = C00OOC00oO(var12);
         this.UvnvNVnnnnNU = Math.max(0.0F, C00OOC00oO(var13));
         this.uVUVnuvnuVuv = Math.max(0.0F, C00OOC00oO(var14));
         this.NVNnnvnuunNv = Math.max(0.0F, C00OOC00oO(var15));
         this.uVunuUNVVUUV = Math.max(0.0F, C00OOC00oO(var16));
         this.UNnVVNvvnVvU = Math.max(0.0F, C00OOC00oO(var17));
         this.uNnUnnuNUnNu = UuUVuuUu(var18);
         this.NnUuNNU = C00OOC00oO(var19);
         this.nNvNUVU = C00OOC00oO(var20);
         this.UnUNuUU = C00OOC00oO(var21);
         this.UuUVuuUu.set(var22);
         this.uUVuVvuNUvnu = C00OOC00oO(var23);
         this.UvUvUNuvNU = C00OOC00oO(var24);
         this.c0oOOCcCoC0 = C00OOC00oO(var25);
         this.VVnVNnunVvu = C00OOC00oO(var26);
         this.unNNVVNnvvV = C00OOC00oO(var27);
         this.NuunnvnN = C00OOC00oO(var28);
         this.NVUunUNUN = C00OOC00oO(var29);
         this.UUVNuUNUvUnV = C00OOC00oO(var30);
         this.vuvnUnVnUNnV = C00OOC00oO(var31);
         this.nnuUVNUuvvVU = C00OOC00oO(var32);
         this.nVVUuvuNnUN = C00OOC00oO(var33);
         this.nNnVnUNVV = C00OOC00oO(var34);
      }

      private static float UuUVuuUu(float var0) {
         return Math.max(0.0F, Math.min(1.0F, var0));
      }

      private static float C00OOC00oO(float var0) {
         return Float.isFinite(var0) ? var0 : 0.0F;
      }

      public void method_71104(ByteBuffer var1) {
         Std140Builder.intoBuffer(var1)
            .putVec4(this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV, 1.0F)
            .putVec4(this.uNNnnnuuuN, this.nuUnNvnuUu, this.VVuuUN, 1.0F)
            .putVec4(this.vNUvnnVnUvu, this.uVUuuVnNVU, this.vuuuNvNuv, this.nvUVNnuu)
            .putVec4(this.UuuNnUvUuv, 0.62F, 1.18F, vvNUVuUVvUV.UvnvNVnnnnNU)
            .putVec4(this.nUUVuvU, this.UnUNVVVNuv, this.vNVuvnUUnuUn, this.UvnvNVnnnnNU)
            .putVec4(this.uVUVnuvnuVuv, this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU)
            .putVec4(this.uNnUnnuNUnNu, vvNUVuUVvUV.UvnvNVnnnnNU, vvNUVuUVvUV.uVUVnuvnuVuv, 0.0F)
            .putVec4(this.NnUuNNU, this.nNvNUVU, this.UnUNuUU, 0.0F)
            .putMat4f(this.UuUVuuUu)
            .putVec4(this.uUVuVvuNUvnu, this.UvUvUNuvNU, this.c0oOOCcCoC0, 1.0F)
            .putVec4(this.VVnVNnunVvu, this.unNNVVNnvvV, this.NuunnvnN, 0.0F)
            .putVec4(this.NVUunUNUN, this.UUVNuUNUvUnV, this.vuvnUnVnUNnV, 0.0F)
            .putVec4(this.nnuUVNUuvvVU, this.nVVUuvuNnUN, this.nNnVnUNVV, 0.0F);
      }
   }
}
