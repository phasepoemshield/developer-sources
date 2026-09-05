package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5595;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public final class NVuUUNU {
   private static final Logger C00OOC00oO = LogUtils.getLogger();
   private static final Supplier<String> uUnuvNvvNU = () -> "Wild BlockESP";
   private static final Supplier<String> vVvUvVVuuNvV = () -> "Wild BlockESP vertices";
   private static final Supplier<String> uNNnnnuuuN = () -> "Wild BlockESP uniforms";
   private static final int nuUnNvnuUu = 40;
   private static final int VVuuUN = 136;
   private static final int vNUvnnVnUvu = 2097152;
   private static final int uVUuuVnNVU = 6;
   private static final float vuuuNvNuv = 1.0F;
   private static final float nvUVNnuu = 0.68F;
   private static final float UuuNnUvUuv = 0.55F;
   private static final float nUUVuvU = 0.45F;
   private static final float UnUNVVVNuv = 0.1F;
   private static final float vNVuvnUUnuUn = 1.25F;
   private static final float UvnvNVnnnnNU = 1.22F;
   private static final float uVUVnuvnuVuv = 0.55F;
   private static final float NVNnnvnuunNv = 0.46F;
   private static final float uVunuUNVVUUV = 0.5F;
   private static final float UNnVVNvvnVvU = 1.0F;
   private static final float uNnUnnuNUnNu = 0.85F;
   private static final float NnUuNNU = 0.66F;
   private static final float nNvNUVU = 0.75F;
   private static final float UnUNuUU = 0.3F;
   public static final double UuUVuuUu = 256.0;
   private static final float uUVuVvuNUvnu = 2.0F;
   private static final float UvUvUNuvNU = 0.03F;
   private static final Matrix4f c0oOOCcCoC0 = new Matrix4f();
   private static volatile boolean VVnVNnunVvu;
   private GpuBuffer unNNVVNnvvV;
   private GpuBuffer NuunnvnN;
   private int NVUunUNUN;
   private int UUVNuUNUvUnV;
   private int vuvnUnVnUNnV;
   private int nnuUVNUuvvVU;
   private int nVVUuvuNnUN;
   private float[] nNnVnUNVV = new float[0];
   private int[] nuunNvv = new int[0];
   private int[] uUVVvVVNvvn = new int[0];
   private VVuNvNvUUvn.NVnVnNnN vvUVNVvvNUv;
   private VVuNvNvUUvn.NVnVnNnN UuNnnVnuNNV;
   private int uUVvnUuNvvN;
   private GpuBuffer UUuUnNVNuuv;
   private ByteBuffer NVuNUuVnVUN;
   private final GpuBufferSlice[] NVuunNnvvvVu = new GpuBufferSlice[6];
   private boolean vNnNuuvVn;
   private int VUuuVUnun;
   private final Matrix4f vVVuuVVv = new Matrix4f();
   private final float[] VuunNUUUvu = new float[24];
   private int[] NNUUNUuVNNVn = new int[64];
   private int[] VvVvnNUnvuvV = new int[64];

   public static void UuUVuuUu(Matrix4f var0) {
      if (var0 == null) {
         VVnVNnunVvu = false;
      } else {
         synchronized (c0oOOCcCoC0) {
            c0oOOCcCoC0.set(var0);
         }

         VVnVNnunVvu = Math.abs(var0.m23()) > 1.0E-6F;
      }
   }

   public void UuUVuuUu(VVuNvNvUUvn.NVnVnNnN var1) {
      if (this.vNnNuuvVn) {
         VVuNvNvUUvn.UuUVuuUu(var1);
      } else {
         if (var1 != null && var1.C00OOC00oO == 0 && this.vvUVNVvvNUv != null) {
            VVuNvNvUUvn.UuUVuuUu(this.vvUVNVvvNUv);
            this.vvUVNVvvNUv = null;
            VVuNvNvUUvn.UuUVuuUu(this.UuNnnVnuNNV);
            this.UuNnnVnuNNV = null;
         }

         try {
            this.C00OOC00oO(var1);
         } catch (Throwable var3) {
            this.vNnNuuvVn = true;
            C00OOC00oO.error("BlockESP geometry upload disabled after failure", var3);
         }
      }
   }

   private void C00OOC00oO(VVuNvNvUUvn.NVnVnNnN var1) {
      if (var1 != null) {
         if (this.vvUVNVvvNUv == null) {
            this.vVvUvVVuuNvV(var1);
         } else {
            VVuNvNvUUvn.UuUVuuUu(this.UuNnnVnuNNV);
            this.UuNnnVnuNNV = var1;
         }
      }

      if (this.vvUVNVvvNUv != null && this.NuunnvnN != null) {
         int var2 = this.vvUVNVvvNUv.UuUVuuUu();
         int var3 = Math.min(var2 - this.uUVvnUuNvvN, 2097152);
         if (var3 > 0) {
            ByteBuffer var4 = this.vvUVNVvvNUv.UuUVuuUu;
            var4.limit(this.uUVvnUuNvvN + var3).position(this.uUVvnUuNvvN);
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.NuunnvnN.slice(this.uUVvnUuNvvN, var3), var4);
            this.uUVvnUuNvvN += var3;
         }

         if (this.uUVvnUuNvvN >= var2) {
            GpuBuffer var6 = this.unNNVVNnvvV;
            this.unNNVVNnvvV = this.NuunnvnN;
            this.NuunnvnN = var6;
            this.NVUunUNUN = this.vvUVNVvvNUv.C00OOC00oO;
            this.UUVNuUNUvUnV = this.vvUVNVvvNUv.uUnuvNvvNU;
            this.vuvnUnVnUNnV = this.vvUVNVvvNUv.vVvUvVVuuNvV;
            this.nnuUVNUuvvVU = this.vvUVNVvvNUv.uNNnnnuuuN;
            this.uUnuvNvvNU(this.vvUVNVvvNUv);
            VVuNvNvUUvn.UuUVuuUu(this.vvUVNVvvNUv);
            this.vvUVNVvvNUv = null;
            if (this.UuNnnVnuNNV != null) {
               VVuNvNvUUvn.NVnVnNnN var5 = this.UuNnnVnuNNV;
               this.UuNnnVnuNNV = null;
               this.vVvUvVVuuNvV(var5);
            }
         }
      }
   }

   private void uUnuvNvvNU(VVuNvNvUUvn.NVnVnNnN var1) {
      this.nVVUuvuNnUN = var1.nuUnNvnuUu;
      if (this.nVVUuvuNnUN != 0) {
         if (this.nuunNvv.length < this.nVVUuvuNnUN) {
            this.nuunNvv = new int[this.nVVUuvuNnUN];
            this.uUVVvVVNvvn = new int[this.nVVUuvuNnUN];
            this.nNnVnUNVV = new float[this.nVVUuvuNnUN * 6];
         }

         System.arraycopy(var1.vNUvnnVnUvu, 0, this.nuunNvv, 0, this.nVVUuvuNnUN);
         System.arraycopy(var1.uVUuuVnNVU, 0, this.uUVVvVVNvvn, 0, this.nVVUuvuNnUN);
         System.arraycopy(var1.VVuuUN, 0, this.nNnVnUNVV, 0, this.nVVUuvuNnUN * 6);
         if (this.NNUUNUuVNNVn.length < this.nVVUuvuNnUN) {
            this.NNUUNUuVNNVn = new int[this.nVVUuvuNnUN];
            this.VvVvnNUnvuvV = new int[this.nVVUuvuNnUN];
         }
      }
   }

   private void vVvUvVVuuNvV(VVuNvNvUUvn.NVnVnNnN var1) {
      if (var1.C00OOC00oO == 0) {
         this.NVUunUNUN = 0;
         this.nVVUuvuNnUN = 0;
         this.UUVNuUNUvUnV = var1.uUnuvNvvNU;
         this.vuvnUnVnUNnV = var1.vVvUvVVuuNvV;
         this.nnuUVNUuvvVU = var1.uNNnnnuuuN;
         VVuNvNvUUvn.UuUVuuUu(var1);
      } else {
         this.vvUVNVvvNUv = var1;
         this.uUVvnUuNvvN = 0;
         this.NuunnvnN = this.UuUVuuUu(this.NuunnvnN, var1.UuUVuuUu());
      }
   }

   public void UuUVuuUu() {
      VVuNvNvUUvn.UuUVuuUu(this.vvUVNVvvNUv);
      this.vvUVNVvvNUv = null;
      VVuNvNvUUvn.UuUVuuUu(this.UuNnnVnuNNV);
      this.UuNnnVnuNNV = null;
      this.uUVvnUuNvvN = 0;
      this.NVUunUNUN = 0;
      this.nVVUuvuNnUN = 0;
   }

   public int C00OOC00oO() {
      return this.UUVNuUNUvUnV;
   }

   public int uUnuvNvvNU() {
      return this.vuvnUnVnUNnV;
   }

   public int vVvUvVVuuNvV() {
      return this.nnuUVNUuvvVU;
   }

   public boolean uNNnnnuuuN() {
      return this.unNNVVNnvvV != null && this.NVUunUNUN > 0;
   }

   public void UuUVuuUu(
      Matrix4f var1,
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
      boolean var13
   ) {
      if (!this.vNnNuuvVn && this.uNNnnnuuuN()) {
         try {
            this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         } catch (Throwable var15) {
            this.vNnNuuvVn = true;
            C00OOC00oO.error("BlockESP render pass disabled after failure", var15);
         }
      }
   }

   private void C00OOC00oO(
      Matrix4f var1,
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
      boolean var13
   ) {
      GpuBufferSlice var14 = RenderSystem.getProjectionMatrixBuffer();
      if (var14 != null) {
         class_310 var15 = class_310.method_1551();
         class_276 var16 = var15.method_1522();
         if (var16 != null) {
            int var17 = this.UuUVuuUu(var1, var2, var3, var4, var11);
            if (var17 != 0) {
               float var18 = class_3532.method_15363(var11 * 0.2F, 10.0F, 45.0F);
               float var19 = class_3532.method_15363(var11 * 0.62F, 28.0F, 170.0F);
               GpuBufferSlice var20 = var13
                  ? this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0.55F, var18, var19)
                  : null;
               GpuBufferSlice var21 = this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 1.0F, var18, var19);
               int var22 = this.NVUunUNUN / 4 * 6;
               class_5590 var23 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
               GpuBuffer var24 = var23.method_68274(var22);
               class_5595 var25 = var23.method_31924();
               GpuTextureView var26 = RenderSystem.outputColorTextureOverride != null ? RenderSystem.outputColorTextureOverride : var16.method_71639();
               GpuTextureView var27 = var16.field_1478
                  ? (RenderSystem.outputDepthTextureOverride != null ? RenderSystem.outputDepthTextureOverride : var16.method_71640())
                  : null;
               if (var27 != null) {
                  RenderPass var28 = RenderSystem.getDevice()
                     .createCommandEncoder()
                     .createRenderPass(uUnuvNvvNU, var26, OptionalInt.empty(), var27, OptionalDouble.empty());

                  try {
                     if (var20 != null) {
                        this.UuUVuuUu(var28, UvNVnUVVnNN.uUnuvNvvNU(), var14, var20, var24, var25, var17);
                     }

                     this.UuUVuuUu(var28, UvNVnUVVnNN.C00OOC00oO(), var14, var21, var24, var25, var17);
                  } catch (Throwable var32) {
                     if (var28 != null) {
                        try {
                           var28.close();
                        } catch (Throwable var31) {
                           var32.addSuppressed(var31);
                        }
                     }

                     throw var32;
                  }

                  if (var28 != null) {
                     var28.close();
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(RenderPass var1, RenderPipeline var2, GpuBufferSlice var3, GpuBufferSlice var4, GpuBuffer var5, class_5595 var6, int var7) {
      var1.setPipeline(var2);
      var1.setUniform("Projection", var3);
      var1.setUniform("BlockEsp", var4);
      var1.setVertexBuffer(0, this.unNNVVNnvvV);
      var1.setIndexBuffer(var5, var6);

      for (int var8 = 0; var8 < var7; var8++) {
         var1.drawIndexed(0, this.NNUUNUuVNNVn[var8] / 4 * 6, this.VvVvnNUnvuvV[var8] / 4 * 6, 1);
      }
   }

   private int UuUVuuUu(Matrix4f var1, float var2, float var3, float var4, float var5) {
      if (this.nVVUuvuNnUN == 0) {
         this.NNUUNUuVNNVn[0] = 0;
         this.VvVvnNUnvuvV[0] = this.NVUunUNUN;
         return 1;
      } else if (!VVnVNnunVvu) {
         return this.VVuuUN();
      } else {
         synchronized (c0oOOCcCoC0) {
            this.vVVuuVVv.set(c0oOOCcCoC0);
         }

         this.vVVuuVVv.mul(var1);
         this.C00OOC00oO(this.vVVuuVVv);
         float var26 = (var5 + 24.0F) * (var5 + 24.0F);
         int var7 = 0;
         int var8 = -1;
         int var9 = -1;

         for (int var10 = 0; var10 < this.nVVUuvuNnUN; var10++) {
            int var11 = this.uUVVvVVNvvn[var10];
            if (var11 > 0) {
               int var12 = var10 * 6;
               float var13 = this.nNnVnUNVV[var12] - var2;
               float var14 = this.nNnVnUNVV[var12 + 1] - var3;
               float var15 = this.nNnVnUNVV[var12 + 2] - var4;
               float var16 = this.nNnVnUNVV[var12 + 3] - var2;
               float var17 = this.nNnVnUNVV[var12 + 4] - var3;
               float var18 = this.nNnVnUNVV[var12 + 5] - var4;
               float var19 = Math.max(Math.max(var13, -var16), 0.0F);
               float var20 = Math.max(Math.max(var14, -var17), 0.0F);
               float var21 = Math.max(Math.max(var15, -var18), 0.0F);
               float var22 = var19 * var19 + var20 * var20 + var21 * var21;
               if (!(var22 > var26)) {
                  float var23 = 2.0F + 0.03F * (float)Math.sqrt(var22);
                  if (!this.UuUVuuUu(var13 - var23, var14 - var23, var15 - var23, var16 + var23, var17 + var23, var18 + var23)) {
                     int var24 = this.nuunNvv[var10];
                     if (var8 >= 0 && var24 == var9) {
                        var9 = var24 + var11;
                     } else {
                        if (var8 >= 0) {
                           this.NNUUNUuVNNVn[var7] = var8;
                           this.VvVvnNUnvuvV[var7] = var9 - var8;
                           var7++;
                        }

                        var8 = var24;
                        var9 = var24 + var11;
                     }
                  }
               }
            }
         }

         if (var8 >= 0) {
            this.NNUUNUuVNNVn[var7] = var8;
            this.VvVvnNUnvuvV[var7] = var9 - var8;
            var7++;
         }

         return var7;
      }
   }

   private int VVuuUN() {
      this.NNUUNUuVNNVn[0] = 0;
      this.VvVvnNUnvuvV[0] = this.NVUunUNUN;
      return 1;
   }

   private void C00OOC00oO(Matrix4f var1) {
      this.UuUVuuUu(0, var1.m03() + var1.m00(), var1.m13() + var1.m10(), var1.m23() + var1.m20(), var1.m33() + var1.m30());
      this.UuUVuuUu(1, var1.m03() - var1.m00(), var1.m13() - var1.m10(), var1.m23() - var1.m20(), var1.m33() - var1.m30());
      this.UuUVuuUu(2, var1.m03() + var1.m01(), var1.m13() + var1.m11(), var1.m23() + var1.m21(), var1.m33() + var1.m31());
      this.UuUVuuUu(3, var1.m03() - var1.m01(), var1.m13() - var1.m11(), var1.m23() - var1.m21(), var1.m33() - var1.m31());
      this.UuUVuuUu(4, var1.m03() + var1.m02(), var1.m13() + var1.m12(), var1.m23() + var1.m22(), var1.m33() + var1.m32());
      this.UuUVuuUu(5, var1.m03() - var1.m02(), var1.m13() - var1.m12(), var1.m23() - var1.m22(), var1.m33() - var1.m32());
   }

   private void UuUVuuUu(int var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4);
      if (var6 < 1.0E-8F) {
         var6 = 1.0F;
      }

      int var7 = var1 * 4;
      this.VuunNUUUvu[var7] = var2 / var6;
      this.VuunNUUUvu[var7 + 1] = var3 / var6;
      this.VuunNUUUvu[var7 + 2] = var4 / var6;
      this.VuunNUUUvu[var7 + 3] = var5 / var6;
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < 6; var7++) {
         int var8 = var7 * 4;
         float var9 = this.VuunNUUUvu[var8];
         float var10 = this.VuunNUUUvu[var8 + 1];
         float var11 = this.VuunNUUUvu[var8 + 2];
         float var12 = this.VuunNUUUvu[var8 + 3];
         float var13 = var9 > 0.0F ? var4 : var1;
         float var14 = var10 > 0.0F ? var5 : var2;
         float var15 = var11 > 0.0F ? var6 : var3;
         if (var9 * var13 + var10 * var14 + var11 * var15 + var12 < 0.0F) {
            return true;
         }
      }

      return false;
   }

   private GpuBufferSlice UuUVuuUu(
      Matrix4f var1,
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
      float var15
   ) {
      int var16 = UvNVnUVVnNN.C00OOC00oO;
      if (this.UUuUnNVNuuv == null) {
         int var17 = class_3532.method_28139(var16, RenderSystem.getDevice().getUniformOffsetAlignment());
         this.UUuUnNVNuuv = RenderSystem.getDevice().createBuffer(uNNnnnuuuN, 136, var17 * 6);
         this.NVuNUuVnVUN = MemoryUtil.memAlloc(var16);

         for (int var18 = 0; var18 < 6; var18++) {
            this.NVuunNnvvvVu[var18] = this.UUuUnNVNuuv.slice(var18 * var17, var16);
         }
      }

      ByteBuffer var19 = this.NVuNUuVnVUN;
      var1.get(0, var19);
      var19.position(64);
      var19.putFloat(var2).putFloat(var3).putFloat(var4).putFloat(var8);
      var19.putFloat(var10).putFloat(var11).putFloat(var12).putFloat(var9);
      var19.putFloat(1.0F).putFloat(0.68F).putFloat(0.55F).putFloat(0.45F);
      var19.putFloat(0.1F).putFloat(var13).putFloat(1.25F).putFloat(1.22F);
      var19.putFloat(var14).putFloat(var15).putFloat(0.46F).putFloat(0.5F);
      var19.putFloat(var5).putFloat(var6).putFloat(var7).putFloat(1.0F);
      var19.putFloat(0.85F).putFloat(0.66F).putFloat(0.75F).putFloat(0.3F);
      var19.position(0).limit(var16);
      this.VUuuVUnun = (this.VUuuVUnun + 1) % 6;
      GpuBufferSlice var20 = this.NVuunNnvvvVu[this.VUuuVUnun];
      RenderSystem.getDevice().createCommandEncoder().writeToBuffer(var20, var19);
      var19.clear();
      return var20;
   }

   private GpuBuffer UuUVuuUu(GpuBuffer var1, int var2) {
      int var3 = Math.max(256, (var2 + 128 - 1) / 128);
      int var4 = class_3532.method_15339(var3) * 128;
      if (var1 != null && var1.size() == var4) {
         return var1;
      } else {
         if (var1 != null) {
            var1.close();
         }

         return RenderSystem.getDevice().createBuffer(vVvUvVVuuNvV, 40, var4);
      }
   }

   public void nuUnNvnuUu() {
      if (this.vvUVNVvvNUv != null) {
         VVuNvNvUUvn.UuUVuuUu(this.vvUVNVvvNUv);
         this.vvUVNVvvNUv = null;
      }

      if (this.UuNnnVnuNNV != null) {
         VVuNvNvUUvn.UuUVuuUu(this.UuNnnVnuNNV);
         this.UuNnnVnuNNV = null;
      }

      if (this.unNNVVNnvvV != null) {
         this.unNNVVNnvvV.close();
         this.unNNVVNnvvV = null;
      }

      if (this.NuunnvnN != null) {
         this.NuunnvnN.close();
         this.NuunnvnN = null;
      }

      if (this.UUuUnNVNuuv != null) {
         this.UUuUnNVNuuv.close();
         this.UUuUnNVNuuv = null;
         Arrays.fill(this.NVuunNnvvvVu, null);
      }

      if (this.NVuNUuVnVUN != null) {
         MemoryUtil.memFree(this.NVuNUuVnVUN);
         this.NVuNUuVnVUN = null;
      }

      this.NVUunUNUN = 0;
      this.nVVUuvuNnUN = 0;
      this.uUVvnUuNvvN = 0;
      this.VUuuVUnun = 0;
      this.vNnNuuvVn = false;
   }
}
