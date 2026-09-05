package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_1041;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_11280;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_9801;
import net.minecraft.class_11280.class_11281;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public final class vVUuUUNUVUN {
   private static final class_2960 UuUVuuUu = class_2960.method_60655("minecraft", "core/stardust_sky");
   private static final BlendFunction C00OOC00oO = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final int uUnuvNvvNU = new Std140SizeCalculator()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putIVec4()
      .get();
   private static final RenderPipeline vVvUvVVuuNvV = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/stardust_sky"))
         .withVertexShader(UuUVuuUu)
         .withFragmentShader(UuUVuuUu)
         .withUniform("StardustSky", class_10789.field_60031)
         .withVertexFormat(class_290.field_1592, class_5596.field_27379)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(C00OOC00oO)
         .build()
   );
   private static final int uNNnnnuuuN = 48;
   private static final int nuUnNvnuUu = 14;
   private static final float VVuuUN = 128.0F;
   private static final Vector4f vNUvnnVnUvu = new Vector4f();
   private static final Vector3f uVUuuVnNVU = new Vector3f();
   private static final Matrix4f vuuuNvNuv = new Matrix4f();
   private static final Matrix4f nvUVNnuu = new Matrix4f();
   private static final Vector3f UuuNnUvUuv = new Vector3f();
   private static final Matrix4f nUUVuvU = new Matrix4f();
   private static final long UnUNVVVNuv = System.nanoTime();
   private static final long vNVuvnUUnuUn = 4096000000000L;
   private static class_11280<vVUuUUNUVUN.NVnVnNnN> UvnvNVnnnnNU;
   private static GpuBuffer uVUVnuvnuVuv;
   private static int NVNnnvnuunNv;
   private static boolean uVunuUNVVUUV;

   private vVUuUUNUVUN() {
   }

   public static void UuUVuuUu() {
   }

   public static void UuUVuuUu(Matrix4f var0, Matrix4f var1) {
      try {
         if (var0 == null || var1 == null) {
            nvUVNnuu.identity();
            return;
         }

         nUUVuvU.set(var1).mul(var0);
         if (Math.abs(nUUVuvU.determinant()) <= 1.0E-8F) {
            nvUVNnuu.identity();
            return;
         }

         nvUVNnuu.set(nUUVuvU).invert();
      } catch (Throwable var3) {
         nvUVNnuu.identity();
      }
   }

   public static void UuUVuuUu(class_4184 var0, float var1, float var2) {
      if (!uVunuUNVVUUV && !(var2 <= 0.001F)) {
         try {
            uUnuvNvvNU();
            if (uVUVnuvnuVuv == null || NVNnnvnuunNv <= 0) {
               return;
            }

            class_310 var3 = class_310.method_1551();
            if (var3 == null || var3.method_1522() == null) {
               return;
            }

            if (var0 == null) {
               return;
            }

            GpuTextureView var4 = var3.method_1522().method_71639();
            GpuTextureView var5 = var3.method_1522().method_71640();
            int var6 = Stardust.uVUVnuvnuVuv();
            int var7 = Stardust.NVNnnvnuunNv();
            vNUvnnVnUvu.set((var6 >>> 16 & 0xFF) / 255.0F, (var6 >>> 8 & 0xFF) / 255.0F, (var6 & 0xFF) / 255.0F, var2);
            uVUuuVnNVU.set((var7 >>> 16 & 0xFF) / 255.0F, (var7 >>> 8 & 0xFF) / 255.0F, (var7 & 0xFF) / 255.0F);
            vuuuNvNuv.identity();
            GpuBufferSlice var8 = RenderSystem.getDynamicUniforms()
               .method_71106(RenderSystem.getModelViewMatrix(), vNUvnnVnUvu, uVUuuVnNVU, vuuuNvNuv, Stardust.UNnVVNvvnVvU());
            GpuBufferSlice var9 = C00OOC00oO().method_71102(UuUVuuUu(var3, var0, var1, var2, var6, var7));
            RenderPass var10 = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Wild Stardust Sky", var4, OptionalInt.empty(), var5, OptionalDouble.empty());

            try {
               var10.setPipeline(vVvUvVVuuNvV);
               RenderSystem.bindDefaultUniforms(var10);
               var10.setUniform("DynamicTransforms", var8);
               var10.setUniform("StardustSky", var9);
               var10.setVertexBuffer(0, uVUVnuvnuVuv);
               var10.draw(0, NVNnnvnuunNv);
            } catch (Throwable var14) {
               if (var10 != null) {
                  try {
                     var10.close();
                  } catch (Throwable var13) {
                     var14.addSuppressed(var13);
                  }
               }

               throw var14;
            }

            if (var10 != null) {
               var10.close();
            }
         } catch (Throwable var15) {
            uVunuUNVVUUV = true;
            System.err.println("[Stardust] sky renderer disabled: " + var15.getMessage());
         }
      }
   }

   private static class_11280<vVUuUUNUVUN.NVnVnNnN> C00OOC00oO() {
      if (UvnvNVnnnnNU == null) {
         UvnvNVnnnnNU = new class_11280("Wild Stardust Sky UBO", uUnuvNvvNU, 4);
      }

      return UvnvNVnnnnNU;
   }

   private static vVUuUUNUVUN.NVnVnNnN UuUVuuUu(class_310 var0, class_4184 var1, float var2, float var3, int var4, int var5) {
      class_1041 var6 = var0.method_22683();
      int var7 = var6 == null ? 1 : Math.max(1, var6.method_4489());
      int var8 = var6 == null ? 1 : Math.max(1, var6.method_4506());
      UuuNnUvUuv.set(0.0F, 0.0F, -1.0F);
      var1.method_23767().transform(UuuNnUvUuv);
      UuuNnUvUuv.normalize();
      float var9 = var0.field_1687 == null ? 0.0F : var0.field_1687.method_8430(var2);
      float var10 = UuUVuuUu(var0);
      float var11 = (float)((System.nanoTime() - UnUNVVVNuv) % 4096000000000L) / 1.0E9F;
      float var12 = Math.max(0.0F, Math.min(1.0F, Stardust.UNnVVNvvnVvU.uUnuvNvvNU() / 3600.0F));
      return new vVUuUUNUVUN.NVnVnNnN(
         new Vector4f((var4 >>> 16 & 0xFF) / 255.0F, (var4 >>> 8 & 0xFF) / 255.0F, (var4 & 0xFF) / 255.0F, var3),
         new Vector4f((var5 >>> 16 & 0xFF) / 255.0F, (var5 >>> 8 & 0xFF) / 255.0F, (var5 & 0xFF) / 255.0F, 1.0F),
         new Vector4f(UuuNnUvUuv.x, UuuNnUvUuv.y, UuuNnUvUuv.z, var9),
         new Vector4f(var7, var8, var11, var10),
         new Vector4f(var3, var12, var2, 0.0F),
         new Matrix4f(nvUVNnuu),
         Stardust.uVunuUNVVUUV().C00OOC00oO(),
         0,
         0,
         0
      );
   }

   private static float UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.field_1687 != null) {
         long var1 = Stardust.uNnUnnuNUnNu() ? Stardust.UvUvUNuvNU : var0.field_1687.method_8532();
         long var3 = Math.floorMod(var1, 24000L);
         return (float)var3 / 24000.0F;
      } else {
         return 0.75F;
      }
   }

   private static void uUnuvNvvNU() {
      if (uVUVnuvnuVuv == null && !uVunuUNVVUUV) {
         try {
            class_287 var0 = class_289.method_1348().method_60827(class_5596.field_27379, class_290.field_1592);
            float var1 = -0.24F;
            float var2 = 1.0F;

            for (int var3 = 0; var3 < 14; var3++) {
               float var4 = var3 / 14.0F;
               float var5 = (var3 + 1) / 14.0F;
               float var6 = var1 + (var2 - var1) * var4;
               float var7 = var1 + (var2 - var1) * var5;

               for (int var8 = 0; var8 < 48; var8++) {
                  float var9 = var8 / 48.0F;
                  float var10 = (var8 + 1) / 48.0F;
                  UuUVuuUu(var0, var9, var6);
                  UuUVuuUu(var0, var10, var6);
                  UuUVuuUu(var0, var10, var7);
                  UuUVuuUu(var0, var10, var7);
                  UuUVuuUu(var0, var9, var7);
                  UuUVuuUu(var0, var9, var6);
               }
            }

            class_9801 var14 = var0.method_60800();

            try {
               NVNnnvnuunNv = var14.method_60822().comp_750();
               uVUVnuvnuVuv = RenderSystem.getDevice().createBuffer(() -> "Wild Stardust Sky Dome", 32, var14.method_60818());
            } catch (Throwable var12) {
               if (var14 != null) {
                  try {
                     var14.close();
                  } catch (Throwable var11) {
                     var12.addSuppressed(var11);
                  }
               }

               throw var12;
            }

            if (var14 != null) {
               var14.close();
            }
         } catch (Throwable var13) {
            uVunuUNVVUUV = true;
         }
      }
   }

   private static void UuUVuuUu(class_287 var0, float var1, float var2) {
      float var3 = var1 * (float) (Math.PI * 2);
      float var4 = (float)Math.sqrt(Math.max(0.0F, 1.0F - var2 * var2));
      float var5 = (float)Math.cos(var3) * var4 * 128.0F;
      float var6 = var2 * 128.0F;
      float var7 = (float)Math.sin(var3) * var4 * 128.0F;
      var0.method_22912(var5, var6, var7);
   }

   record NVnVnNnN(
      Vector4fc primary,
      Vector4fc secondary,
      Vector4fc cameraWeather,
      Vector4fc resolutionTime,
      Vector4fc params,
      Matrix4fc inverseViewProjection,
      int mode,
      int flagA,
      int flagB,
      int flagC
   ) implements class_11281 {
      public void method_71104(ByteBuffer var1) {
         Std140Builder.intoBuffer(var1)
            .putVec4(this.primary)
            .putVec4(this.secondary)
            .putVec4(this.cameraWeather)
            .putVec4(this.resolutionTime)
            .putVec4(this.params)
            .putMat4f(this.inverseViewProjection)
            .putIVec4(this.mode, this.flagA, this.flagB, this.flagC);
      }
   }
}
