package ru.metaculture.protection;

import java.util.List;
import java.util.Map;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Trails",
   C00OOC00oO = "Оставляет за игроком красивый след.",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class Trails extends Module implements uvVVuUNNunn {
   private static final int uVunuUNVVUUV = 64;
   private static final int UNnVVNvvnVvU = 65;
   private static final int uNnUnnuNUnNu = 4;
   private static final int NnUuNNU = 14;
   private static final int nNvNUVU = 12;
   private static final int UnUNuUU = 926;
   private static final double uUVuVvuNUvnu = 0.0036;
   private static final double UvUvUNuvNU = 0.00108;
   private static final double c0oOOCcCoC0 = 36.0;
   private static final float VVnVNnunVvu = 0.3F;
   private static final float unNNVVNnvvV = 1.45F;
   private static final float NuunnvnN = 0.42F;
   private static final float NVUunUNUN = 0.95F;
   private static final float UUVNuUNUvUnV = 0.3F;
   private static final float vuvnUnVnUNnV = 0.3F;
   private static final float nnuUVNUuvvVU = 0.18F;
   private static final float nVVUuvuNnUN = 0.4F;
   private static final float nNnVnUNVV = 0.16F;
   private static final float nuunNvv = 3.8F;
   private static final float uUVVvVVNvvn = 11.0F;
   private static final float vvUVNVvvNUv = 5.5F;
   private static final double UuNnnVnuNNV = 0.36;
   private static final float uUVvnUuNvvN = 12.0F;
   private static final float UUuUnNVNuuv = 0.5F;
   private static final long NVuNUuVnVUN = System.nanoTime();
   public static final ili11Iii1Ii NVNnnvnuunNv = new ili11Iii1Ii("Foundry Shader", VnuVUNUv.TRAILS);
   private static final float[] NVuunNnvvvVu = new float[13];
   private static final float[] vNnNuuvVn = new float[13];
   private static final float[] VUuuVUnun = new float[13];
   private final double[] vVVuuVVv = new double[64];
   private final double[] VuunNUUUvu = new double[64];
   private final double[] NNUUNUuVNNVn = new double[64];
   private final float[] VvVvnNUnvuvV = new float[64];
   private int ccOO0COcoco0;
   private final double[] NUVvUUVuVNVv = new double[65];
   private final double[] nNuVunNUVu = new double[65];
   private final double[] UNvvunVVn = new double[65];
   private final float[] UnvuVuVnNuvu = new float[65];
   private final double[] UvNNVUVNVuvV = new double[926];
   private final double[] NnunUUnU = new double[926];
   private final double[] nvuVvuNnNUnv = new double[926];
   private final double[] NnVnNVN = new double[926];
   private final double[] vnvvNvUnVv = new double[926];
   private final double[] OCOocoOoOO = new double[926];
   private final double[] o0Ooc0COOoc = new double[926];
   private final double[] nvvnUnUn = new double[926];
   private final double[] UnUUVuVunvVu = new double[926];
   private final float[] nnvuvUNuUnN = new float[926];
   private final float[] UVnuVUUVnnU = new float[926];
   private int VunnVNvNV;
   private long NvUVUvVVnUu;
   private float unnUnUNVnN = 0.18F;
   private double NnuUnUNnu;
   private double UnnnvvU;
   private double VUUnuVvVu;
   private float VvVuvUvvNNVv;
   private boolean UnnNNvuvvUU;
   private float VNNnnVUuvv = 0.95F;
   private final Trails.NVnVnNnN vUvUvUNNuNvn = new Trails.NVnVnNnN();

   public Trails() {
      vUUuvuUNVnV.UuUVuuUu();
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      this.nUUVuvU();
      super.UuUVuuUu();
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this, this);
   }

   @Override
   public void C00OOC00oO() {
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this);
      this.nUUVuvU();
      super.C00OOC00oO();
   }

   @Override
   public VnuVUNUv uUnuvNvvNU() {
      return VnuVUNUv.TRAILS;
   }

   @Override
   public String vVvUvVVuuNvV() {
      String var1 = UuuNnUvUuv();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean uNNnnnuuuN() {
      return true;
   }

   public static String UuuNnUvUuv() {
      String var0 = NVNnnvnuunNv.UuuNnUvUuv();
      return var0 == null ? "" : var0;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.nUUVuvU();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      vUnVuNUUUVu.UuUVuuUu().C00OOC00oO(this, this);
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.method_31044() != null && !uUnuvNvvNU.field_1690.method_31044().method_31034()) {
            long var2 = System.nanoTime();
            float var4 = this.NvUVUvVVnUu == 0L ? 0.0F : Math.min((float)(var2 - this.NvUVUvVVnUu) / 1.0E9F, 0.1F);
            this.NvUVUvVVnUu = var2;
            float var5;
            if (uUnuvNvvNU.field_1724.method_6128()) {
               var5 = 0.3F;
            } else if (uUnuvNvvNU.field_1724.method_5681()) {
               var5 = 0.3F;
            } else {
               var5 = 0.95F;
            }

            float var6 = 1.0F - (float)Math.exp(-8.0F * var4);
            this.VNNnnVUuvv = this.VNNnnVUuvv + (var5 - this.VNNnnVUuvv) * var6;
            class_243 var7 = uUnuvNvvNU.field_1724.method_30950(var1.vVvUvVVuuNvV());
            double var8 = var7.field_1352;
            double var10 = var7.field_1351 + this.VNNnnVUuvv;
            double var12 = var7.field_1350;
            class_243 var14 = uUnuvNvvNU.field_1724.method_18798();
            double var15 = Math.sqrt(var14.field_1352 * var14.field_1352 + var14.field_1351 * var14.field_1351 + var14.field_1350 * var14.field_1350);
            double var17 = Math.sqrt(var14.field_1352 * var14.field_1352 + var14.field_1350 * var14.field_1350);
            boolean var19 = var17 > 0.02 || var15 > 0.045;
            float var20 = (float)Math.min(1.0, var15 / 0.36);
            float var21 = var19 ? 0.18F + 0.4F * var20 : 0.16F;
            float var22 = 1.0F - (float)Math.exp(-3.8F * var4);
            this.unnUnUNVnN = this.unnUnUNVnN + (var21 - this.unnUnUNVnN) * var22;
            if (var19) {
               this.NnuUnUNnu = var8;
               this.UnnnvvU = var10;
               this.VUUnuVvVu = var12;
               this.UnnNNvuvvUU = true;
               float var23 = 1.0F - (float)Math.exp(-11.0F * var4);
               this.VvVuvUvvNNVv = this.VvVuvUvvNNVv + (1.0F - this.VvVuvUvvNNVv) * var23;
               this.UuUVuuUu(var8, var10, var12);
            } else {
               this.VvVuvUvvNNVv = this.VvVuvUvvNNVv * (float)Math.exp(-5.5F * var4);
               if (this.VvVuvUvvNNVv < 0.01F) {
                  this.VvVuvUvvNNVv = 0.0F;
                  this.UnnNNvuvvUU = false;
               }
            }

            this.UuUVuuUu(var4);
            if (this.ccOO0COcoco0 >= 1) {
               class_4184 var38 = uUnuvNvvNU.field_1773.method_19418();
               double var24 = var38.method_19326().field_1352;
               double var26 = var38.method_19326().field_1351;
               double var28 = var38.method_19326().field_1350;
               this.vUvUvUNNuNvn.UuUVuuUu(this.UvnvNVnnnnNU(), UuuNnUvUuv());
               this.UnUNVVVNuv();
               if (this.VunnVNvNV >= 2) {
                  this.vNVuvnUUnuUn();
                  class_4587 var30 = var1.uUnuvNvvNU();
                  Matrix4f var31 = var30.method_23760().method_23761();
                  class_4598 var32 = nNNnNvVVv.UuUVuuUu();

                  try {
                     class_4588 var33 = var32.getBuffer(vUUuvuUNVnV.C00OOC00oO());
                     this.UuUVuuUu(var33, var31, var24, var26, var28, 1.0F, 1.0F);
                     class_4588 var34 = var32.getBuffer(vUUuvuUNVnV.uUnuvNvvNU());
                     this.UuUVuuUu(var34, var31, var24, var26, var28, 1.45F, 0.42F);
                  } finally {
                     nNNnNvVVv.C00OOC00oO();
                  }
               }
            }
         } else {
            this.nUUVuvU();
         }
      }
   }

   private void UuUVuuUu(double var1, double var3, double var5) {
      if (this.ccOO0COcoco0 == 0) {
         this.vVVuuVVv[0] = var1;
         this.VuunNUUUvu[0] = var3;
         this.NNUUNUuVNNVn[0] = var5;
         this.VvVvnNUnvuvV[0] = 0.0F;
         this.ccOO0COcoco0 = 1;
      } else {
         int var7 = this.ccOO0COcoco0 - 1;
         double var8 = var1 - this.vVVuuVVv[var7];
         double var10 = var3 - this.VuunNUUUvu[var7];
         double var12 = var5 - this.NNUUNUuVNNVn[var7];
         double var14 = var8 * var8 + var10 * var10 + var12 * var12;
         if (var14 > 36.0) {
            this.nUUVuvU();
            this.UuUVuuUu(var1, var3, var5);
         } else if (!(var14 < 0.0036)) {
            if (this.ccOO0COcoco0 == 64) {
               System.arraycopy(this.vVVuuVVv, 1, this.vVVuuVVv, 0, 63);
               System.arraycopy(this.VuunNUUUvu, 1, this.VuunNUUUvu, 0, 63);
               System.arraycopy(this.NNUUNUuVNNVn, 1, this.NNUUNUuVNNVn, 0, 63);
               System.arraycopy(this.VvVvnNUnvuvV, 1, this.VvVvnNUnvuvV, 0, 63);
               this.ccOO0COcoco0 = 63;
            }

            this.vVVuuVVv[this.ccOO0COcoco0] = var1;
            this.VuunNUUUvu[this.ccOO0COcoco0] = var3;
            this.NNUUNUuVNNVn[this.ccOO0COcoco0] = var5;
            this.VvVvnNUnvuvV[this.ccOO0COcoco0] = 0.0F;
            this.ccOO0COcoco0++;
         }
      }
   }

   private void UuUVuuUu(float var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.ccOO0COcoco0; var3++) {
         float var4 = this.VvVvnNUnvuvV[var3] + var1;
         if (var4 < this.unnUnUNVnN) {
            if (var2 != var3) {
               this.vVVuuVVv[var2] = this.vVVuuVVv[var3];
               this.VuunNUUUvu[var2] = this.VuunNUUUvu[var3];
               this.NNUUNUuVNNVn[var2] = this.NNUUNUuVNNVn[var3];
            }

            this.VvVvnNUnvuvV[var2] = var4;
            var2++;
         }
      }

      this.ccOO0COcoco0 = var2;
   }

   private void nUUVuvU() {
      this.ccOO0COcoco0 = 0;
      this.VunnVNvNV = 0;
      this.VvVuvUvvNNVv = 0.0F;
      this.UnnNNvuvvUU = false;
   }

   private void UnUNVVVNuv() {
      this.VunnVNvNV = 0;

      for (int var1 = 0; var1 < this.ccOO0COcoco0; var1++) {
         this.NUVvUUVuVNVv[var1] = this.vVVuuVVv[var1];
         this.nNuVunNUVu[var1] = this.VuunNUUUvu[var1];
         this.UNvvunVVn[var1] = this.NNUUNUuVNNVn[var1];
         float var2 = this.VvVvnNUnvuvV[var1] / Math.max(0.001F, this.unnUnUNVnN);
         if (var2 < 0.0F) {
            var2 = 0.0F;
         }

         if (var2 > 1.0F) {
            var2 = 1.0F;
         }

         this.UnvuVuVnNuvu[var1] = 1.0F - var2 * var2 * (3.0F - 2.0F * var2);
      }

      int var10 = this.ccOO0COcoco0;
      if (this.ccOO0COcoco0 > 0 && this.UnnNNvuvvUU && this.VvVuvUvvNNVv > 0.02F) {
         int var11 = this.ccOO0COcoco0 - 1;
         double var3 = this.NnuUnUNnu - this.vVVuuVVv[var11];
         double var5 = this.UnnnvvU - this.VuunNUUUvu[var11];
         double var7 = this.VUUnuVvVu - this.NNUUNUuVNNVn[var11];
         if (var3 * var3 + var5 * var5 + var7 * var7 > 0.00108) {
            this.NUVvUUVuVNVv[this.ccOO0COcoco0] = this.NnuUnUNnu;
            this.nNuVunNUVu[this.ccOO0COcoco0] = this.UnnnvvU;
            this.UNvvunVVn[this.ccOO0COcoco0] = this.VUUnuVvVu;
            this.UnvuVuVnNuvu[this.ccOO0COcoco0] = this.VvVuvUvvNNVv;
            var10 = this.ccOO0COcoco0 + 1;
         }
      }

      if (var10 >= 2) {
         this.UvNNVUVNVuvV[0] = this.NUVvUUVuVNVv[0];
         this.NnunUUnU[0] = this.nNuVunNUVu[0];
         this.nvuVvuNnNUnv[0] = this.UNvvunVVn[0];
         this.nnvuvUNuUnN[0] = this.UnvuVuVnNuvu[0];
         this.VunnVNvNV = 1;

         for (int var12 = 0; var12 < var10 - 1; var12++) {
            int var14 = Math.max(0, var12 - 1);
            int var4 = var12;
            int var20 = var12 + 1;
            int var6 = Math.min(var10 - 1, var12 + 2);
            int var22 = this.UuUVuuUu(var14, var12, var20, var6);

            for (int var8 = 1; var8 <= var22; var8++) {
               if (this.VunnVNvNV >= 926) {
                  return;
               }

               float var9 = (float)var8 / var22;
               this.UvNNVUVNVuvV[this.VunnVNvNV] = UuUVuuUu(
                  this.NUVvUUVuVNVv[var14], this.NUVvUUVuVNVv[var4], this.NUVvUUVuVNVv[var20], this.NUVvUUVuVNVv[var6], var9
               );
               this.NnunUUnU[this.VunnVNvNV] = UuUVuuUu(this.nNuVunNUVu[var14], this.nNuVunNUVu[var4], this.nNuVunNUVu[var20], this.nNuVunNUVu[var6], var9);
               this.nvuVvuNnNUnv[this.VunnVNvNV] = UuUVuuUu(this.UNvvunVVn[var14], this.UNvvunVVn[var4], this.UNvvunVVn[var20], this.UNvvunVVn[var6], var9);
               this.nnvuvUNuUnN[this.VunnVNvNV] = UuUVuuUu(this.UnvuVuVnNuvu[var4], this.UnvuVuVnNuvu[var20], var9);
               this.VunnVNvNV++;
            }
         }

         this.UVnuVUUVnnU[0] = 0.0F;
         float var13 = 0.0F;

         for (int var15 = 1; var15 < this.VunnVNvNV; var15++) {
            double var18 = this.UvNNVUVNVuvV[var15] - this.UvNNVUVNVuvV[var15 - 1];
            double var21 = this.NnunUUnU[var15] - this.NnunUUnU[var15 - 1];
            double var23 = this.nvuVvuNnNUnv[var15] - this.nvuVvuNnNUnv[var15 - 1];
            var13 += (float)Math.sqrt(var18 * var18 + var21 * var21 + var23 * var23);
            this.UVnuVUUVnnU[var15] = var13;
         }

         if (var13 > 1.0E-4F) {
            float var16 = 1.0F / var13;

            for (int var19 = 0; var19 < this.VunnVNvNV; var19++) {
               this.UVnuVUUVnnU[var19] = this.UVnuVUUVnnU[var19] * var16;
            }
         } else {
            for (int var17 = 0; var17 < this.VunnVNvNV; var17++) {
               this.UVnuVUUVnnU[var17] = this.VunnVNvNV > 1 ? (float)var17 / (this.VunnVNvNV - 1) : 0.0F;
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.VunnVNvNV >= 1) {
         int var1 = Math.min(this.VunnVNvNV - 1, 1);
         double var2 = this.UvNNVUVNVuvV[var1] - this.UvNNVUVNVuvV[0];
         double var4 = this.NnunUUnU[var1] - this.NnunUUnU[0];
         double var6 = this.nvuVvuNnNUnv[var1] - this.nvuVvuNnNUnv[0];
         double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
         double var10;
         double var12;
         double var14;
         if (var8 > 1.0E-6) {
            var10 = var2 / var8;
            var12 = var4 / var8;
            var14 = var6 / var8;
         } else {
            var10 = 1.0;
            var12 = 0.0;
            var14 = 0.0;
         }

         double var16 = Math.sqrt(var2 * var2 + var6 * var6);
         double var18;
         double var20;
         double var22;
         if (var16 > 1.0E-6) {
            var18 = -var6 / var16;
            var20 = 0.0;
            var22 = var2 / var16;
         } else {
            var18 = 1.0;
            var20 = 0.0;
            var22 = 0.0;
         }

         this.NnVnNVN[0] = var18;
         this.vnvvNvUnVv[0] = var20;
         this.OCOocoOoOO[0] = var22;
         double var24 = var12 * var22 - var14 * var20;
         double var26 = var14 * var18 - var10 * var22;
         double var28 = var10 * var20 - var12 * var18;
         double var30 = Math.sqrt(var24 * var24 + var26 * var26 + var28 * var28);
         if (var30 > 1.0E-6) {
            var24 /= var30;
            var26 /= var30;
            var28 /= var30;
         } else {
            var24 = 0.0;
            var26 = 1.0;
            var28 = 0.0;
         }

         this.o0Ooc0COOoc[0] = var24;
         this.nvvnUnUn[0] = var26;
         this.UnUUVuVunvVu[0] = var28;

         for (int var32 = 1; var32 < this.VunnVNvNV; var32++) {
            int var33 = var32 - 1;
            int var34 = Math.min(this.VunnVNvNV - 1, var32 + 1);
            double var35 = this.UvNNVUVNVuvV[var34] - this.UvNNVUVNVuvV[var33];
            double var37 = this.NnunUUnU[var34] - this.NnunUUnU[var33];
            double var39 = this.nvuVvuNnNUnv[var34] - this.nvuVvuNnNUnv[var33];
            double var41 = Math.sqrt(var35 * var35 + var37 * var37 + var39 * var39);
            if (var41 < 1.0E-6) {
               this.NnVnNVN[var32] = this.NnVnNVN[var32 - 1];
               this.vnvvNvUnVv[var32] = this.vnvvNvUnVv[var32 - 1];
               this.OCOocoOoOO[var32] = this.OCOocoOoOO[var32 - 1];
               this.o0Ooc0COOoc[var32] = this.o0Ooc0COOoc[var32 - 1];
               this.nvvnUnUn[var32] = this.nvvnUnUn[var32 - 1];
               this.UnUUVuVunvVu[var32] = this.UnUUVuVunvVu[var32 - 1];
            } else {
               double var43 = var35 / var41;
               double var45 = var37 / var41;
               double var47 = var39 / var41;
               double var49 = this.NnVnNVN[var32 - 1];
               double var51 = this.vnvvNvUnVv[var32 - 1];
               double var53 = this.OCOocoOoOO[var32 - 1];
               double var55 = var49 * var43 + var51 * var45 + var53 * var47;
               var49 -= var43 * var55;
               var51 -= var45 * var55;
               var53 -= var47 * var55;
               double var57 = Math.sqrt(var49 * var49 + var51 * var51 + var53 * var53);
               if (var57 > 1.0E-6) {
                  var49 /= var57;
                  var51 /= var57;
                  var53 /= var57;
               } else {
                  double var59 = Math.sqrt(var35 * var35 + var39 * var39);
                  if (var59 > 1.0E-6) {
                     var49 = -var39 / var59;
                     var51 = 0.0;
                     var53 = var35 / var59;
                  } else {
                     var49 = 1.0;
                     var51 = 0.0;
                     var53 = 0.0;
                  }
               }

               this.NnVnNVN[var32] = var49;
               this.vnvvNvUnVv[var32] = var51;
               this.OCOocoOoOO[var32] = var53;
               double var76 = var45 * var53 - var47 * var51;
               double var61 = var47 * var49 - var43 * var53;
               double var63 = var43 * var51 - var45 * var49;
               double var65 = Math.sqrt(var76 * var76 + var61 * var61 + var63 * var63);
               if (var65 > 1.0E-6) {
                  var76 /= var65;
                  var61 /= var65;
                  var63 /= var65;
               } else {
                  var76 = 0.0;
                  var61 = 1.0;
                  var63 = 0.0;
               }

               this.o0Ooc0COOoc[var32] = var76;
               this.nvvnUnUn[var32] = var61;
               this.UnUUVuVunvVu[var32] = var63;
            }
         }
      }
   }

   private int UuUVuuUu(int var1, int var2, int var3, int var4) {
      double var5 = this.NUVvUUVuVNVv[var2] - this.NUVvUUVuVNVv[var1];
      double var7 = this.nNuVunNUVu[var2] - this.nNuVunNUVu[var1];
      double var9 = this.UNvvunVVn[var2] - this.UNvvunVVn[var1];
      double var11 = this.NUVvUUVuVNVv[var3] - this.NUVvUUVuVNVv[var2];
      double var13 = this.nNuVunNUVu[var3] - this.nNuVunNUVu[var2];
      double var15 = this.UNvvunVVn[var3] - this.UNvvunVVn[var2];
      double var17 = this.NUVvUUVuVNVv[var4] - this.NUVvUUVuVNVv[var3];
      double var19 = this.nNuVunNUVu[var4] - this.nNuVunNUVu[var3];
      double var21 = this.UNvvunVVn[var4] - this.UNvvunVVn[var3];
      double var23 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
      double var25 = Math.sqrt(var11 * var11 + var13 * var13 + var15 * var15);
      double var27 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
      double var29 = var23 > 1.0E-6 && var25 > 1.0E-6 ? (var5 * var11 + var7 * var13 + var9 * var15) / (var23 * var25) : 1.0;
      double var31 = var25 > 1.0E-6 && var27 > 1.0E-6 ? (var11 * var17 + var13 * var19 + var15 * var21) / (var25 * var27) : 1.0;
      double var33 = Math.max(1.0 - var29, 1.0 - var31);
      if (var33 < 0.0) {
         var33 = 0.0;
      }

      if (var33 > 2.0) {
         var33 = 2.0;
      }

      double var35 = Math.min(1.0, Math.pow(var33 * 12.0, 0.5));
      int var37 = (int)Math.round(10.0 * var35);
      return 4 + var37;
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, double var3, double var5, double var7, float var9, float var10) {
      for (int var11 = 0; var11 < this.VunnVNvNV - 1; var11++) {
         float var12 = this.UVnuVUUVnnU[var11];
         float var13 = this.UVnuVUUVnnU[var11 + 1];
         float var14 = this.nnvuvUNuUnN[var11] * var10 * this.vUvUvUNNuNvn.NVNnnvnuunNv;
         float var15 = this.nnvuvUNuUnN[var11 + 1] * var10 * this.vUvUvUNNuNvn.NVNnnvnuunNv;
         float var16 = 0.3F * var9 * this.vUvUvUNNuNvn.uVUVnuvnuVuv * C00OOC00oO(var12);
         float var17 = 0.3F * var9 * this.vUvUvUNNuNvn.uVUVnuvnuVuv * C00OOC00oO(var13);
         int var18 = uUnuvNvvNU(var14);
         int var19 = uUnuvNvvNU(var15);
         if ((var18 | var19) != 0 && (!(var16 <= 1.0E-4F) || !(var17 <= 1.0E-4F))) {
            int var20 = this.vUvUvUNNuNvn.UuUVuuUu(var12);
            int var21 = this.vUvUvUNNuNvn.UuUVuuUu(var13);
            double var22 = this.UvNNVUVNVuvV[var11] - var3;
            double var24 = this.NnunUUnU[var11] - var5;
            double var26 = this.nvuVvuNnNUnv[var11] - var7;
            double var28 = this.UvNNVUVNVuvV[var11 + 1] - var3;
            double var30 = this.NnunUUnU[var11 + 1] - var5;
            double var32 = this.nvuVvuNnNUnv[var11 + 1] - var7;
            double var34 = this.NnVnNVN[var11];
            double var36 = this.vnvvNvUnVv[var11];
            double var38 = this.OCOocoOoOO[var11];
            double var40 = this.NnVnNVN[var11 + 1];
            double var42 = this.vnvvNvUnVv[var11 + 1];
            double var44 = this.OCOocoOoOO[var11 + 1];
            double var46 = this.o0Ooc0COOoc[var11];
            double var48 = this.nvvnUnUn[var11];
            double var50 = this.UnUUVuVunvVu[var11];
            double var52 = this.o0Ooc0COOoc[var11 + 1];
            double var54 = this.nvvnUnUn[var11 + 1];
            double var56 = this.UnUUVuVunvVu[var11 + 1];

            for (int var58 = 0; var58 < 12; var58++) {
               float var59 = NVuunNnvvvVu[var58];
               float var60 = vNnNuuvVn[var58];
               float var61 = NVuunNnvvvVu[var58 + 1];
               float var62 = vNnNuuvVn[var58 + 1];
               float var63 = VUuuVUnun[var58];
               float var64 = VUuuVUnun[var58 + 1];
               double var65 = var59 * var34 + var60 * var46;
               double var67 = var59 * var36 + var60 * var48;
               double var69 = var59 * var38 + var60 * var50;
               double var71 = var61 * var34 + var62 * var46;
               double var73 = var61 * var36 + var62 * var48;
               double var75 = var61 * var38 + var62 * var50;
               double var77 = var59 * var40 + var60 * var52;
               double var79 = var59 * var42 + var60 * var54;
               double var81 = var59 * var44 + var60 * var56;
               double var83 = var61 * var40 + var62 * var52;
               double var85 = var61 * var42 + var62 * var54;
               double var87 = var61 * var44 + var62 * var56;
               this.UuUVuuUu(var1, var2, var22 + var65 * var16, var24 + var67 * var16, var26 + var69 * var16, var12, var63, var20, var18, var65, var67, var69);
               this.UuUVuuUu(var1, var2, var22 + var71 * var16, var24 + var73 * var16, var26 + var75 * var16, var12, var64, var20, var18, var71, var73, var75);
               this.UuUVuuUu(var1, var2, var28 + var83 * var17, var30 + var85 * var17, var32 + var87 * var17, var13, var64, var21, var19, var83, var85, var87);
               this.UuUVuuUu(var1, var2, var28 + var77 * var17, var30 + var79 * var17, var32 + var81 * var17, var13, var63, var21, var19, var77, var79, var81);
            }
         }
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      float var9,
      float var10,
      int var11,
      int var12,
      double var13,
      double var15,
      double var17
   ) {
      var1.method_22918(var2, (float)var3, (float)var5, (float)var7)
         .method_22913(var9, var10)
         .method_1336(UuUVuuUu(var11), C00OOC00oO(var11), uUnuvNvvNU(var11), var12)
         .method_22914((float)var13, (float)var15, (float)var17);
   }

   private static float C00OOC00oO(float var0) {
      float var1 = C00OOC00oO(0.0F, 0.42F, var0);
      float var2 = 1.0F - C00OOC00oO(0.92F, 1.0F, var0) * 0.5F;
      return var1 * var2;
   }

   private float UvnvNVnnnnNU() {
      return (float)(System.nanoTime() - NVuNUuVnVUN) / 1.0E9F;
   }

   private static double UuUVuuUu(double var0, double var2, double var4, double var6, float var8) {
      double var9 = var8 * var8;
      double var11 = var9 * var8;
      return 0.5
         * (2.0 * var2 + (-var0 + var4) * var8 + (2.0 * var0 - 5.0 * var2 + 4.0 * var4 - var6) * var9 + (-var0 + 3.0 * var2 - 3.0 * var4 + var6) * var11);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = uUnuvNvvNU((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   static float uUnuvNvvNU(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   private static int UuUVuuUu(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   private static int uUnuvNvvNU(float var0) {
      return UuUVuuUu(Math.round(uUnuvNvvNU(var0, 0.0F, 1.0F) * 255.0F), 0, 255);
   }

   private static int UuUVuuUu(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int C00OOC00oO(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static int uUnuvNvvNU(int var0) {
      return var0 & 0xFF;
   }

   static int UuUVuuUu(int var0, int var1, float var2) {
      float var3 = uUnuvNvvNU(var2, 0.0F, 1.0F);
      int var4 = Math.round(UuUVuuUu(var0) + (UuUVuuUu(var1) - UuUVuuUu(var0)) * var3);
      int var5 = Math.round(C00OOC00oO(var0) + (C00OOC00oO(var1) - C00OOC00oO(var0)) * var3);
      int var6 = Math.round(uUnuvNvvNU(var0) + (uUnuvNvvNU(var1) - uUnuvNvvNU(var0)) * var3);
      return var4 << 16 | var5 << 8 | var6;
   }

   static {
      for (int var0 = 0; var0 <= 12; var0++) {
         double var1 = (Math.PI * 2) * var0 / 12.0;
         NVuunNnvvvVu[var0] = (float)Math.cos(var1);
         vNnNuuvVn[var0] = (float)Math.sin(var1);
         VUuuVUnun[var0] = var0 / 12.0F;
      }
   }

   static final class NVnVnNnN {
      private static final int[] UuUVuuUu = new int[]{16747247, 16754396, 8648959, 11141102, 16747247};
      private static final int[] C00OOC00oO = new int[]{6750183, 6014975, 4688895, 11730932, 6750183};
      private static final int[] uUnuvNvvNU = new int[]{16773227, 16751954, 16736157, 9304063, 16773227};
      private static final int[] vVvUvVVuuNvV = new int[]{11141048, 6485458, 8228095, 16755188, 11141048};
      private static final int[] uNNnnnuuuN = new int[]{8257383, 3405823, 16773210, 16727538, 8257383};
      private static final int[] nuUnNvnuUu = new int[]{16754632, 16769167, 11000063, 14067711, 16754632};
      private static final int[] VVuuUN = new int[]{8033279, 11561983, 5963734, 16736142, 8033279};
      private static final int[] vNUvnnVnUvu = new int[]{16757594, 16739146, 16732041, 13995263, 16757594};
      private static final int[] uVUuuVnNVU = new int[]{14089215, 9169663, 9149951, 16777215, 14089215};
      private static final int[] vuuuNvNuv = new int[]{16736109, 16770140, 6160312, 7179519, 16736109};
      private static final int[] nvUVNnuu = new int[]{14001919, 16752603, 7733222, 16773260, 14001919};
      private static final int[] UuuNnUvUuv = new int[]{13172552, 16773466, 3732223, 16735457, 13172552};
      private NvVNvUvunNNu nUUVuvU = NvVNvUvunNNu.WILD;
      private int[] UnUNVVVNuv;
      private int vNVuvnUUnuUn = 7316991;
      private float UvnvNVnnnnNU;
      float uVUVnuvnuVuv = 1.0F;
      float NVNnnvnuunNv = 1.0F;

      void UuUVuuUu(float var1, String var2) {
         this.uVUVnuvnuVuv = 1.0F;
         this.NVNnnvnuunNv = 1.0F;
         if (!this.C00OOC00oO(var1, var2)) {
            this.nUUVuvU = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
               ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
               : NvVNvUvunNNu.WILD;
            this.UnUNVVVNuv = UuUVuuUu(this.nUUVuvU);
            this.UvnvNVnnnnNU = var1 * 0.06F;
            if (this.UnUNVVVNuv == null) {
               this.vNVuvnUUnuUn = this.nUUVuvU == NvVNvUvunNNu.WILD ? 8108031 : this.nUUVuvU.UuUVuuUu().getRGB() & 16777215;
            }
         }
      }

      int UuUVuuUu(float var1) {
         return this.UnUNVVVNuv != null ? UuUVuuUu(this.UnUNVVVNuv, this.UvnvNVnnnnNU + (1.0F - var1) * 0.42F) : this.vNVuvnUUnuUn;
      }

      private boolean C00OOC00oO(float var1, String var2) {
         if (var2 != null && !var2.isBlank()) {
            uNNnUu var3 = uNNnUu.UuUVuuUu();
            if (!var3.uNNnnnuuuN(var2)) {
               return false;
            } else {
               nuVVnvn var4 = var3.uUnuvNvvNU(var2);
               NNnUUVVnuUV var5 = var3.C00OOC00oO(var2);
               List var6 = var3.vNUvnnVnUvu(var2);
               Map var7 = var3.uVUuuVnNVU(var2);
               int[] var8 = new int[4];
               int var9 = 0;

               for (ccCoCoOCocoo var11 : var6) {
                  if (var11.kind() == ccCoCoOCocoo.NVnVnNnN.COLOR && var9 < var8.length) {
                     float[] var12 = (float[])var7.get(var11.uniformName());
                     var8[var9++] = UuUVuuUu(var12 == null ? var11.defaults() : var12);
                  }
               }

               if (var9 == 0) {
                  int var15 = ((var4 == null ? var2 : var4.C00OOC00oO() + var2) + (var5 == null ? "" : var5.hash())).hashCode();
                  var8[var9++] = UuUVuuUu(var15, 0.0F);
                  var8[var9++] = UuUVuuUu(var15, 0.31F);
                  var8[var9++] = UuUVuuUu(var15, 0.63F);
               }

               if (var9 == 1) {
                  int var16 = var8[0];
                  this.UnUNVVVNuv = new int[]{
                     Trails.UuUVuuUu(var16, 16777215, 0.44F),
                     var16,
                     Trails.UuUVuuUu(var16, 7796735, 0.36F),
                     Trails.UuUVuuUu(var16, 16741065, 0.3F),
                     Trails.UuUVuuUu(var16, 16777215, 0.44F)
                  };
               } else if (var9 == 2) {
                  this.UnUNVVVNuv = new int[]{
                     var8[0], Trails.UuUVuuUu(var8[0], var8[1], 0.42F), var8[1], Trails.UuUVuuUu(var8[1], 16777215, 0.34F), var8[0]
                  };
               } else if (var9 == 3) {
                  this.UnUNVVVNuv = new int[]{var8[0], var8[1], var8[2], Trails.UuUVuuUu(var8[2], 16777215, 0.32F), var8[0]};
               } else {
                  this.UnUNVVVNuv = new int[]{var8[0], var8[1], var8[2], var8[3], var8[0]};
               }

               float var17 = UuUVuuUu(var6, var7, 0.5F, "width", "radius", "size", "thick");
               float var18 = UuUVuuUu(var6, var7, 0.66F, "opacity", "alpha", "power", "glow", "intensity");
               float var19 = UuUVuuUu(var6, var7, 0.5F, "flow", "speed", "phase", "time");
               this.uVUVnuvnuVuv = Trails.uUnuvNvvNU(var17 == 0.5F ? 1.0F : 0.68F + var17 * 1.22F, 0.58F, 1.9F);
               this.NVNnnvnuunNv = Trails.uUnuvNvvNU(0.62F + var18 * 0.82F, 0.52F, 1.48F);
               this.UvnvNVnnnnNU = var1 * (0.034F + var19 * 0.09F);
               return true;
            }
         } else {
            return false;
         }
      }

      private static float UuUVuuUu(List<ccCoCoOCocoo> var0, Map<String, float[]> var1, float var2, String... var3) {
         if (var0 != null && !var0.isEmpty()) {
            for (ccCoCoOCocoo var5 : var0) {
               if (var5.kind() == ccCoCoOCocoo.NVnVnNnN.FLOAT) {
                  String var6 = (var5.name() + " " + var5.uniformName()).toLowerCase();
                  boolean var7 = false;

                  for (String var11 : var3) {
                     if (var11 != null && var6.contains(var11)) {
                        var7 = true;
                        break;
                     }
                  }

                  if (var7) {
                     float[] var12 = var1 == null ? null : (float[])var1.get(var5.uniformName());
                     float var13 = var12 != null && var12.length != 0 ? var12[0] : var5.defaultFloat();
                     float var14 = var5.maximum() - var5.minimum();
                     if (Float.isFinite(var13) && !(var14 <= 1.0E-6F)) {
                        return Trails.uUnuvNvvNU((var13 - var5.minimum()) / var14, 0.0F, 1.0F);
                     }

                     return var2;
                  }
               }
            }

            return var2;
         } else {
            return var2;
         }
      }

      private static int UuUVuuUu(float[] var0) {
         float var1 = var0 != null && var0.length > 0 ? var0[0] : 1.0F;
         float var2 = var0 != null && var0.length > 1 ? var0[1] : 1.0F;
         float var3 = var0 != null && var0.length > 2 ? var0[2] : 1.0F;
         return C00OOC00oO(var1) << 16 | C00OOC00oO(var2) << 8 | C00OOC00oO(var3);
      }

      private static int C00OOC00oO(float var0) {
         return !Float.isFinite(var0) ? 0 : Math.max(0, Math.min(255, Math.round(var0 * 255.0F)));
      }

      private static int UuUVuuUu(int var0, float var1) {
         int var2 = var0 ^ -1640531527;
         var2 ^= var2 >>> 16;
         var2 *= 2146121005;
         var2 ^= var2 >>> 15;
         var2 *= -2073254261;
         var2 ^= var2 >>> 16;
         float var3 = ((var2 & 16777215) / 1.6777215E7F + var1) % 1.0F;
         return UuUVuuUu(var3, 0.62F, 1.0F);
      }

      private static int UuUVuuUu(float var0, float var1, float var2) {
         var0 -= (float)Math.floor(var0);
         float var3 = var0 * 6.0F;
         int var4 = (int)Math.floor(var3);
         float var5 = var2 * (1.0F - var1);
         float var6 = var2 * (1.0F - var1 * (var3 - var4));
         float var7 = var2 * (1.0F - var1 * (1.0F - (var3 - var4)));
         float var8;
         float var9;
         float var10;
         switch (var4 % 6) {
            case 0:
               var8 = var2;
               var9 = var7;
               var10 = var5;
               break;
            case 1:
               var8 = var6;
               var9 = var2;
               var10 = var5;
               break;
            case 2:
               var8 = var5;
               var9 = var2;
               var10 = var7;
               break;
            case 3:
               var8 = var5;
               var9 = var6;
               var10 = var2;
               break;
            case 4:
               var8 = var7;
               var9 = var5;
               var10 = var2;
               break;
            default:
               var8 = var2;
               var9 = var5;
               var10 = var6;
         }

         return C00OOC00oO(var8) << 16 | C00OOC00oO(var9) << 8 | C00OOC00oO(var10);
      }

      private static int UuUVuuUu(int[] var0, float var1) {
         float var2 = var1 - (float)Math.floor(var1);
         float var3 = var2 * (var0.length - 1);
         int var4 = Math.min(var0.length - 2, Math.max(0, (int)Math.floor(var3)));
         return Trails.UuUVuuUu(var0[var4] & 16777215, var0[var4 + 1] & 16777215, var3 - var4);
      }

      private static int[] UuUVuuUu(NvVNvUvunNNu var0) {
         return switch (var0) {
            case ASTOLFO_RAINBOW -> UuUVuuUu;
            case LAGUNE_RAINBOW -> C00OOC00oO;
            case HALF_RAINBOW -> uUnuvNvvNU;
            case AURORA_RAINBOW -> vVvUvVVuuNvV;
            case NEON_RAINBOW -> uNNnnnuuuN;
            case BLOSSOM_RAINBOW -> nuUnNvnuUu;
            case ABYSS_RAINBOW -> VVuuUN;
            case SUNSET_RAINBOW -> vNUvnnVnUvu;
            case GLACIER_RAINBOW -> uVUuuVnNVU;
            case CHROMA_RAINBOW -> vuuuNvNuv;
            case DREAM_RAINBOW -> nvUVNnuu;
            case TOXIC_RAINBOW -> UuuNnUvUuv;
            default -> null;
         };
      }
   }
}
