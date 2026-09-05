package ru.metaculture.protection;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;

public final class vnuuuVVuNvvv implements VvnNUnUu {
   private static final float UuUVuuUu = 80.0F;
   private static final float C00OOC00oO = 18.0F;
   private static final float uUnuvNvvNU = 18.0F;
   private static final float vVvUvVVuuNvV = 17.0F;
   private static final float uNNnnnuuuN = 18.0F;
   private static final float nuUnNvnuUu = 20.0F;
   private static final float VVuuUN = 298.0F;
   private static final float vNUvnnVnUvu = 6.0F;
   private static final float uVUuuVnNVU = 15.0F;
   private static final float vuuuNvNuv = 3.0F;
   private static final float nvUVNnuu = 18.0F;
   private static final float UuuNnUvUuv = 12.0F;
   private static final float nUUVuvU = 1.35F;
   private static final int UnUNVVVNuv = -14606047;
   private static final int vNVuvnUUnuUn = -2500135;
   private static final int UvnvNVnnnnNU = -7829368;
   private static final int uVUVnuvnuVuv = -1;
   private static final uNNnVuNunvU NVNnnvnuunNv = uNNnVuNunvU.UuUVuuUu(2.1F, 0.55F);
   private static final uNNnVuNunvU uVunuUNVVUUV = uNNnVuNunvU.UuUVuuUu(1.4F, 0.7F);
   private static final uNNnVuNunvU UNnVVNvvnVvU = uNNnVuNunvU.UuUVuuUu(8.0F, 0.8F);
   private static final uNNnVuNunvU uNnUnnuNUnNu = uNNnVuNunvU.UuUVuuUu(1.8F, 0.65F);
   private static final float NnUuNNU = 5.0E-4F;
   private static final float nNvNUVU = 5.0E-4F;
   private static final float UnUNuUU = 1.0E-4F;
   private static final double uUVuVvuNUvnu = 1.0E-4;
   private static final float UvUvUNuvNU = 0.001F;
   private final Module c0oOOCcCoC0;
   private final nNUuNvVn VVnVNnunVvu;
   private final uvNNUnnUvU unNNVVNnvvV;
   private final nNVnuNVvvv<Double> NuunnvnN;
   private final String NVUunUNUN;
   private final uNuuunuNvuN UUVNuUNUvUnV;
   private final uNuuunuNvuN vuvnUnVnUNnV;
   private final uNuuunuNvuN nnuUVNUuvvVU;
   private final uNuuunuNvuN nVVUuvuNnUN;
   private vnuuuVVuNvvv.NVnVnNnN nNnVnUNVV = vnuuuVVuNvvv.NVnVnNnN.EMPTY;
   private vnuuuVVuNvvv.NVnVnNnN nuunNvv = vnuuuVVuNvvv.NVnVnNnN.EMPTY;
   private vnuuuVVuNvvv.NVnVnNnN uUVVvVVNvvn = vnuuuVVuNvvv.NVnVnNnN.EMPTY;
   private boolean vvUVNVvvNUv = false;
   private double UuNnnVnuNNV;
   private int uUVvnUuNvvN;
   private boolean UUuUnNVNuuv = false;

   public vnuuuVVuNvvv(Module var1, uvNNUnnUvU var2, nNUuNvVn var3, nNVnuNVvvv<Double> var4) {
      this(var1, var2, var3, var4, null);
   }

   public vnuuuVVuNvvv(Module var1, uvNNUnnUvU var2, nNUuNvVn var3, nNVnuNVvvv<Double> var4, String var5) {
      this.c0oOOCcCoC0 = Objects.requireNonNull(var1, "module");
      this.unNNVVNnvvV = Objects.requireNonNull(var2, "popupContext");
      this.VVnVNnunVvu = Objects.requireNonNull(var3, "setting");
      this.NuunnvnN = Objects.requireNonNull(var4, "valueAccessor");
      this.NVUunUNUN = UuUVuuUu(var5);
      this.UUVNuUNUvUnV = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), NVNnnvnuunNv, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.UUVNuUNUvUnV.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
      this.vuvnUnVnUNnV = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uVunuUNVVUUV, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.vuvnUnVnUNnV.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
      Double var6 = (Double)var4.UuUVuuUu();
      double var7 = var6 != null ? var6 : var3.vVvUvVVuuNvV;
      this.UuNnnVnuNNV = var7;
      this.uUVvnUuNvvN = vVvUvVVuuNvV(var3.VVuuUN);
      float var9 = this.uUnuvNvvNU(this.UuNnnVnuNNV);
      this.nnuUVNUuvvVU = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), UNnVVNvvnVvU, var9, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.nVVUuvuNnUN = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNnUnnuNUnNu, 1.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      this.nVVUuvuNnUN.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
   }

   @Override
   public void UuUVuuUu() {
      Double var1 = this.NuunnvnN.UuUVuuUu();
      double var2 = var1 != null ? var1 : this.VVnVNnunVvu.vVvUvVVuuNvV;
      this.UuNnnVnuNNV = var2;
      this.UUVNuUNUvUnV.uUnuvNvvNU(this.vvUVNVvvNUv ? 1.0F : 0.0F);
      this.nnuUVNUuvvVU.uUnuvNvvNU(this.uVUuuVnNVU());
      this.UuuNnUvUuv();
   }

   @Override
   public void UuUVuuUu(boolean var1) {
      float var2 = var1 ? 1.0F : 0.0F;
      this.nVVUuvuNnUN.uUnuvNvvNU(var2);
      if (!var1) {
         this.vvUVNVvvNUv = false;
         this.UUuUnNVNuuv = false;
         this.UUVNuUNUvUnV.uUnuvNvvNU(0.0F);
         this.UuuNnUvUuv();
      }
   }

   @Override
   public void UuUVuuUu(float var1, float var2, float var3) {
      float var4 = Math.max(0.0F, this.VVuuUN());
      this.nNnVnUNVV = new vnuuuVVuNvvv.NVnVnNnN(var1, var2, var3, 80.0F);
      this.nuunNvv = new vnuuuVVuNvvv.NVnVnNnN(var1, var2, var3, var4);
      float var5 = var1 + 18.0F;
      float var6 = var2 + 17.0F + 18.0F + 15.0F;
      this.uUVVvVVNvvn = new vnuuuVVuNvvv.NVnVnNnN(var5, var6, 298.0F, 6.0F);
   }

   @Override
   public float C00OOC00oO() {
      return 80.0F;
   }

   @Override
   public float VVuuUN() {
      return 80.0F * UuUVuuUu(this.nVVUuvuNnUN.UuUVuuUu());
   }

   @Override
   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4) {
      float var5 = UuUVuuUu(this.nVVUuvuNnUN.UuUVuuUu());
      if (!(var5 <= 0.001F)) {
         float var6 = var2 * UuUVuuUu(var3) * var5;
         if (!(var6 <= 1.0E-4F)) {
            var1.uUnuvNvvNU(1.0F, var5, this.nNnVnUNVV.x, this.nNnVnUNVV.y);

            try {
               this.vNUvnnVnUvu();
               float var7 = UuUVuuUu(this.vuvnUnVnUNnV.UuUVuuUu());
               int var8 = VvUNvVNnuUNU.UuUVuuUu(-7829368, -1, var7);
               int var9 = UuUVuuUu(var8, var6);
               float var10 = this.nNnVnUNVV.x + 18.0F;
               float var11 = this.nNnVnUNVV.y + 17.0F + 18.0F;
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var10, var11, 18.0F, this.vuuuNvNuv(), var9, "l");
               float var12 = this.nNnVnUNVV.y + 20.0F + 18.0F;
               float var13 = this.nNnVnUNVV.x + this.nNnVnUNVV.width - 18.0F;
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var13, var12, 18.0F, this.nvUVNnuu(), var9, "r");
               int var14 = UuUVuuUu(-14606047, var6);
               var1.UuUVuuUu(this.uUVVvVVNvvn.x, this.uUVVvVVNvvn.y, this.uUVVvVVNvvn.width, this.uUVVvVVNvvn.height, 3.0F, var14);
               float var15 = UuUVuuUu(this.nnuUVNUuvvVU.UuUVuuUu());
               float var16 = this.uUVVvVVNvvn.width * var15;
               if (var16 > 0.0F) {
                  int var17 = UuUVuuUu(UVvNVuUvNVn.UuUVuuUu(), var6);
                  float var18 = var16 >= this.uUVVvVVNvvn.width - 0.01F ? 3.0F : 0.0F;
                  var1.UuUVuuUu(this.uUVVvVVNvvn.x, this.uUVVvVVNvvn.y, var16, this.uUVVvVVNvvn.height, 3.0F, var18, var18, 3.0F, var17);
               }

               float var26 = this.uUVVvVVNvvn.x + var16;
               float var27 = this.uUVVvVVNvvn.y + this.uUVVvVVNvvn.height * 0.5F;
               float var19 = 1.0F + UuUVuuUu(this.UUVNuUNUvUnV.UuUVuuUu()) * 0.35000002F;
               float var20 = 12.0F * var19;
               float var21 = var20 * 0.5F;
               int var22 = UuUVuuUu(-2500135, var6);
               var1.C00OOC00oO(var26, var27, var21, 0.0F, 1.0F, var22);
            } finally {
               var1.uVUuuVnNVU();
            }
         }
      }
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, int var5) {
      if (!this.nUUVuvU() || !this.nuunNvv.contains(var1, var3)) {
         return false;
      } else if (var5 == 2) {
         Double var6 = this.NuunnvnN.UuUVuuUu();
         Double var7 = var6 != null ? var6 : this.VVnVNnunVvu.vVvUvVVuuNvV;
         this.unNNVVNnvvV.openForSetting(this.c0oOOCcCoC0, this.VVnVNnunVvu, var1, var3, var7);
         return true;
      } else if (var5 != 0) {
         return false;
      } else {
         this.vvUVNVvvNUv = true;
         this.UUVNuUNUvUnV.uUnuvNvvNU(1.0F);
         this.UuuNnUvUuv();
         return true;
      }
   }

   @Override
   public nvUuvVvuuN uUnuvNvvNU() {
      return this.VVnVNnunVvu;
   }

   @Override
   public boolean vVvUvVVuuNvV() {
      return true;
   }

   @Override
   public boolean C00OOC00oO(double var1, double var3, double var5, double var7) {
      if (this.nUUVuvU() && this.nuunNvv.contains(var1, var3)) {
         if (Math.abs(var7) <= 1.0E-4) {
            return false;
         } else {
            class_310 var9 = class_310.method_1551();
            if (var9 != null && var9.method_22683() != null) {
               long var10 = var9.method_22683().method_4490();
               if (GLFW.glfwGetKey(var10, 341) != 1) {
                  return false;
               } else if (!this.C00OOC00oO(var7)) {
                  return false;
               } else {
                  this.UUVNuUNUvUnV.uUnuvNvvNU(1.0F);
                  this.UuuNnUvUuv();
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void UuUVuuUu(double var1, double var3) {
      if (!this.nUUVuvU()) {
         this.UUuUnNVNuuv = false;
         this.UuuNnUvUuv();
      } else {
         this.UUuUnNVNuuv = this.nuunNvv.contains(var1, var3);
         this.UuuNnUvUuv();
      }
   }

   private void vNUvnnVnUvu() {
      if (this.vvUVNVvvNUv) {
         if (!this.nUUVuvU()) {
            this.vvUVNVvvNUv = false;
            this.UUVNuUNUvUnV.uUnuvNvvNU(0.0F);
            this.UuuNnUvUuv();
         } else {
            class_310 var1 = class_310.method_1551();
            if (var1 != null && var1.method_22683() != null) {
               long var2 = var1.method_22683().method_4490();
               if (GLFW.glfwGetMouseButton(var2, 0) != 1) {
                  this.vvUVNVvvNUv = false;
                  this.UUVNuUNUvUnV.uUnuvNvvNU(0.0F);
                  this.UuuNnUvUuv();
               } else {
                  double[] var4 = new double[1];
                  double[] var5 = new double[1];
                  GLFW.glfwGetCursorPos(var2, var4, var5);
                  this.UuUVuuUu(UuUVuuUu(var4[0], var1));
               }
            } else {
               this.vvUVNVvvNUv = false;
               this.UUVNuUNUvUnV.uUnuvNvvNU(0.0F);
               this.UuuNnUvUuv();
            }
         }
      }
   }

   private void UuUVuuUu(double var1) {
      if (!(this.uUVVvVVNvvn.width <= 0.0F) && this.nUUVuvU()) {
         double var3 = Math.min(Math.max(var1, (double)this.uUVVvVVNvvn.x), (double)(this.uUVVvVVNvvn.x + this.uUVVvVVNvvn.width));
         double var5 = (var3 - this.uUVVvVVNvvn.x) / this.uUVVvVVNvvn.width;
         double var7 = this.VVnVNnunVvu.uNNnnnuuuN;
         double var9 = this.VVnVNnunVvu.nuUnNvnuUu;
         if (!(var9 <= var7)) {
            double var11 = var7 + (var9 - var7) * var5;
            if (!(Math.abs(var11 - this.UuNnnVnuNNV) <= 1.0E-4F)) {
               this.NuunnvnN.UuUVuuUu(var11);
               Double var13 = this.NuunnvnN.UuUVuuUu();
               this.UuNnnVnuNNV = var13 != null ? var13 : this.VVnVNnunVvu.vVvUvVVuuNvV;
               this.nnuUVNUuvvVU.uUnuvNvvNU(this.uVUuuVnNVU());
            }
         }
      }
   }

   private boolean C00OOC00oO(double var1) {
      double var3 = this.VVnVNnunVvu.VVuuUN;
      if (var3 <= 0.0) {
         return false;
      } else {
         double var5 = this.VVnVNnunVvu.uNNnnnuuuN;
         double var7 = this.VVnVNnunVvu.nuUnNvnuUu;
         double var9 = Math.signum(var1);
         if (var9 == 0.0) {
            return false;
         } else {
            double var11 = Math.ceil(Math.abs(var1));
            if (var11 <= 0.0) {
               var11 = 1.0;
            }

            double var13 = this.UuNnnVnuNNV + var3 * var11 * var9;
            double var15 = Math.min(Math.max(var13, var5), var7);
            if (Math.abs(var15 - this.UuNnnVnuNNV) <= 1.0E-4F) {
               return false;
            } else {
               this.NuunnvnN.UuUVuuUu(var15);
               Double var17 = this.NuunnvnN.UuUVuuUu();
               double var18 = var17 instanceof Number ? var17.doubleValue() : this.VVnVNnunVvu.vVvUvVVuuNvV;
               this.UuNnnVnuNNV = var18;
               this.UuuNnUvUuv();
               this.nnuUVNUuvvVU.uUnuvNvvNU(this.uVUuuVnNVU());
               return true;
            }
         }
      }
   }

   private float uVUuuVnNVU() {
      return this.uUnuvNvvNU(this.UuNnnVnuNNV);
   }

   private float uUnuvNvvNU(double var1) {
      double var3 = this.VVnVNnunVvu.uNNnnnuuuN;
      double var5 = this.VVnVNnunVvu.nuUnNvnuUu;
      if (var5 <= var3) {
         return 0.0F;
      } else {
         double var7 = Math.min(Math.max(var1, var3), var5);
         return (float)((var7 - var3) / (var5 - var3));
      }
   }

   private String vuuuNvNuv() {
      return this.NVUunUNUN != null ? this.NVUunUNUN : this.VVnVNnunVvu.UuUVuuUu;
   }

   private static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         return var1.isEmpty() ? null : var1;
      }
   }

   private String nvUVNnuu() {
      return this.uUVvnUuNvvN <= 0
         ? String.format(Locale.US, "%.0f", this.UuNnnVnuNNV)
         : String.format(Locale.US, "%1$." + this.uUVvnUuNvvN + "f", this.UuNnnVnuNNV);
   }

   private static int vVvUvVVuuNvV(double var0) {
      BigDecimal var2 = BigDecimal.valueOf(var0);
      int var3 = var2.scale();
      if (var3 <= 0) {
         return 0;
      } else {
         BigDecimal var4 = var2.stripTrailingZeros();
         return Math.max(0, var4.scale());
      }
   }

   private void UuuNnUvUuv() {
      float var1;
      if (this.vvUVNVvvNUv) {
         var1 = 1.0F;
      } else if (this.UUuUnNVNuuv && this.nUUVuvU()) {
         var1 = 0.5F;
      } else {
         var1 = 0.0F;
      }

      this.vuvnUnVnUNnV.uUnuvNvvNU(var1);
   }

   private boolean nUUVuvU() {
      return UuUVuuUu(this.nVVUuvuNnUN.UuUVuuUu()) > 0.001F;
   }

   private static float UuUVuuUu(float var0) {
      if (var0 <= 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 1.0F ? 1.0F : var0;
      }
   }

   private static int UuUVuuUu(int var0, float var1) {
      int var2 = var0 >>> 24 & 0xFF;
      int var3 = Math.round(var2 * var1);
      int var4 = var0 & 16777215;
      return var3 << 24 | var4;
   }

   private static double UuUVuuUu(double var0, int var2, float var3) {
      if (var2 <= 0) {
         return var0;
      } else if (Float.isFinite(var3) && !(Math.abs(var3 - 1.0F) <= 0.001F)) {
         double var4 = var2 * 0.5;
         return var4 + (var0 - var4) / var3;
      } else {
         return var0;
      }
   }

   private static double UuUVuuUu(double var0, class_310 var2) {
      if (var2 != null && var2.method_22683() != null) {
         int var3 = var2.method_22683().method_4489();
         if (var3 <= 0) {
            return var0;
         } else {
            float var4 = 1.0F;
            return Float.isFinite(var4) && !(Math.abs(var4) <= 1.0E-4F) ? UuUVuuUu(var0, var3, var4) : var0;
         }
      } else {
         return var0;
      }
   }

   record NVnVnNnN(float x, float y, float width, float height) {
      static final vnuuuVVuNvvv.NVnVnNnN EMPTY = new vnuuuVVuNvvv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F);

      boolean contains(double var1, double var3) {
         return var1 >= this.x && var1 <= this.x + this.width && var3 >= this.y && var3 <= this.y + this.height;
      }
   }
}
