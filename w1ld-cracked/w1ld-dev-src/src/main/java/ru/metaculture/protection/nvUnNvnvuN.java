package ru.metaculture.protection;

import net.minecraft.class_2400;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3999;
import net.minecraft.class_4003;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;

public final class nvUnNvnvuN extends class_4003 {
   public static class_2400 UuUVuuUu = unnNUVnUnv.uUnuvNvvNU;
   private static int C00OOC00oO;
   private static int uUnuvNvvNU;
   private static final float vVvUvVVuuNvV = 0.035F;
   private static final float uNNnnnuuuN = 0.0238F;
   private static final float nuUnNvnuUu = (float)Math.sin(0.035F);
   private static final float VVuuUN = (float)Math.cos(0.035F);
   private static final float vNUvnnVnUvu = (float)Math.sin(0.0238F);
   private static final float uVUuuVnNVU = (float)Math.cos(0.0238F);
   private static class_638 vuuuNvNuv;
   private static long nvUVNnuu = Long.MIN_VALUE;
   private static double UuuNnUvUuv;
   private static double nUUVuvU;
   private static double UnUNVVVNuv;
   private static double vNVuvnUUnuUn;
   private static float UvnvNVnnnnNU;
   private static boolean uVUVnuvnuVuv;
   private final int NVNnnvnuunNv;
   private final float uVunuUNVVUUV;
   private final float UNnVVNvvnVvU;
   private final float uNnUnnuNUnNu;
   private final float NnUuNNU;
   private final int nNvNUVU;
   private final int UnUNuUU;
   private final int uUVuVvuNUvnu;
   private float UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private float VVnVNnunVvu;
   private float unNNVVNnvvV;
   private float NuunnvnN;
   private float NVUunUNUN;
   private float UUVNuUNUvUnV;
   private float vuvnUnVnUNnV;
   private float nnuUVNUuvvVU;
   private boolean nVVUuvuNnUN = true;

   public nvUnNvnvuN(class_638 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      float var14 = C00OOC00oO((float)(var2 * 0.071 + var4 * 0.113 + var6 * 0.197));
      float var15 = C00OOC00oO(var14 * 37.13F + (float)var4 * 0.021F);
      float var16 = C00OOC00oO(var15 * 51.73F + (float)var6 * 0.017F);
      float var17 = var14 * (float) (Math.PI * 2);
      float var18 = var15 * (float) (Math.PI * 2);
      this.UNnVVNvvnVvU = var15;
      this.uVunuUNVVUUV = 0.092F + var16 * 0.244F + C00OOC00oO(0.74F, 1.0F, var15) * 0.306F;
      float var19 = (1.0F + var14 * 60.0F) * 0.035F;
      float var20 = var19 * 0.68F;
      this.UvUvUNuvNU = (float)Math.sin(var19 + var17);
      this.c0oOOCcCoC0 = (float)Math.cos(var19 + var17);
      this.VVnVNnunVvu = (float)Math.sin(var20 + var18);
      this.unNNVVNnvvV = (float)Math.cos(var20 + var18);
      this.NuunnvnN = (float)Math.sin(var19 + var18);
      this.NVUunUNUN = (float)Math.cos(var19 + var18);
      float var21 = 0.085F + var14 * 0.075F;
      this.uNnUnnuNUnNu = (float)Math.sin(var21);
      this.NnUuNNU = (float)Math.cos(var21);
      this.UUVNuUNUvUnV = (float)Math.sin(var17);
      this.vuvnUnVnUNnV = (float)Math.cos(var17);
      this.uNNnnnuuuN();
      int var22 = var14 < 0.58F ? Stardust.uVUVnuvnuVuv() : Stardust.NVNnnvnuunNv();
      float var23 = 0.36F + var15 * 0.36F;
      float var24 = C00OOC00oO(0.84F, 1.0F, var16);
      this.nNvNUVU = UuUVuuUu(UuUVuuUu(184.0F + var24 * 48.0F, UuUVuuUu(var22, 16), var23) + var14 * 18.0F);
      this.UnUNuUU = UuUVuuUu(UuUVuuUu(218.0F + var24 * 30.0F, UuUVuuUu(var22, 8), var23) + var15 * 14.0F);
      this.uUVuVvuNUvnu = UuUVuuUu(UuUVuuUu(246.0F, UuUVuuUu(var22, 0), var23) + var16 * 10.0F);
      this.NVNnnvnuunNv = uUnuvNvvNU;
      this.field_3847 = 142 + (int)(var15 * 138.0F);
      this.field_3862 = false;
      this.field_3844 = 0.0F;
      this.field_28786 = 0.99F;
      this.method_34753(var8, var10, var12);
      this.field_17867 = this.uVunuUNVVUUV;
      C00OOC00oO++;
   }

   public class_3999 method_18122() {
      return class_3999.field_17831;
   }

   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (Stardust.UuuNnUvUuv() && this.NVNnnvnuunNv == uUnuvNvvNU && this.field_3866++ < this.field_3847) {
         if (UuUVuuUu(this.field_3851)) {
            double var1 = this.field_3874 - UuuNnUvUuv;
            double var3 = this.field_3854 - nUUVuvU;
            double var5 = this.field_3871 - UnUNVVVNuv;
            if (var1 * var1 + var5 * var5 > vNVuvnUUnuUn || var3 < -2.4 || var3 > UvnvNVnnnnNU) {
               this.method_3085();
               return;
            }
         }

         this.field_3874 = this.field_3874 + (this.field_3852 + this.UvUvUNuvNU * 0.0028);
         this.field_3854 = this.field_3854 + (this.field_3869 + this.VVnVNnunVvu * 0.0022);
         this.field_3871 = this.field_3871 + (this.field_3850 + this.NVUunUNUN * 0.0028);
         this.field_3852 *= 0.973;
         this.field_3869 *= 0.97;
         this.field_3850 *= 0.973;
         this.uUnuvNvvNU();
         this.vVvUvVVuuNvV();
      } else {
         this.method_3085();
      }
   }

   public void method_3074(class_4588 var1, class_4184 var2, float var3) {
   }

   public void method_65198(class_4587 var1, class_4597 var2, class_4184 var3, float var4) {
      if (!Stardust.UuuNnUvUuv()) {
         this.method_3085();
      } else {
         float var5 = (this.field_3866 + var4) / this.field_3847;
         float var6 = C00OOC00oO(0.0F, 0.18F, var5) * (1.0F - C00OOC00oO(0.76F, 1.0F, var5));
         float var7 = this.UUVNuUNUvUnV + (this.nnuUVNUuvvVU - this.UUVNuUNUvUnV) * var4;
         float var8 = 0.76F + 0.24F * var7;
         var6 *= var8 * Stardust.nUUVuvU() * (0.68F + this.UNnVVNvvnVvU * 0.48F);
         if (!(var6 <= 0.003F)) {
            UvnUVNunuNNv.UuUVuuUu(var3);
            double var9 = this.field_3858 + (this.field_3874 - this.field_3858) * var4;
            double var11 = this.field_3838 + (this.field_3854 - this.field_3838) * var4;
            double var13 = this.field_3856 + (this.field_3871 - this.field_3856) * var4;
            float var15 = (float)(var9 - UvnUVNunuNNv.UuUVuuUu());
            float var16 = (float)(var11 - UvnUVNunuNNv.C00OOC00oO());
            float var17 = (float)(var13 - UvnUVNunuNNv.uUnuvNvvNU());
            float var18 = UvnUVNunuNNv.vVvUvVVuuNvV();
            float var19 = UvnUVNunuNNv.uNNnnnuuuN();
            float var20 = UvnUVNunuNNv.nuUnNvnuUu();
            float var21 = UvnUVNunuNNv.VVuuUN();
            float var22 = UvnUVNunuNNv.vNUvnnVnUvu();
            float var23 = UvnUVNunuNNv.uVUuuVnNVU();
            float var24 = (float)Math.sqrt(var15 * var15 + var16 * var16 + var17 * var17);
            float var25 = 1.0F - C00OOC00oO(2.8F, 24.0F, var24);
            float var26 = this.uVunuUNVVUUV * (0.9F + var8 * 0.24F + var25 * 0.88F);
            float var27 = var26 * 0.5F;
            int var28 = UuUVuuUu(var6 * 255.0F);
            class_4588 var29 = var2.getBuffer(vNvVVuUVVuuN.C00OOC00oO());
            float var30 = var18 * var27;
            float var31 = var19 * var27;
            float var32 = var20 * var27;
            float var33 = var21 * var27;
            float var34 = var22 * var27;
            float var35 = var23 * var27;
            this.UuUVuuUu(var29, var15 - var30 - var33, var16 - var31 - var34, var17 - var32 - var35, 0.0F, 1.0F, var28);
            this.UuUVuuUu(var29, var15 + var30 - var33, var16 + var31 - var34, var17 + var32 - var35, 1.0F, 1.0F, var28);
            this.UuUVuuUu(var29, var15 + var30 + var33, var16 + var31 + var34, var17 + var32 + var35, 1.0F, 0.0F, var28);
            this.UuUVuuUu(var29, var15 - var30 + var33, var16 - var31 + var34, var17 - var32 + var35, 0.0F, 0.0F, var28);
         }
      }
   }

   private static boolean UuUVuuUu(class_638 var0) {
      if (var0 == null) {
         uVUVnuvnuVuv = false;
         return false;
      } else {
         long var1 = var0.method_8510();
         if (var0 == vuuuNvNuv && var1 == nvUVNnuu) {
            return uVUVnuvnuVuv;
         } else {
            vuuuNvNuv = var0;
            nvUVNnuu = var1;
            class_310 var3 = class_310.method_1551();
            if (var3 != null && var3.field_1773 != null && var3.field_1773.method_19418() != null) {
               class_243 var4 = var3.field_1773.method_19418().method_19326();
               double var5 = Stardust.vNVuvnUUnuUn() + 5.0F;
               UuuNnUvUuv = var4.field_1352;
               nUUVuvU = var4.field_1351;
               UnUNVVVNuv = var4.field_1350;
               vNVuvnUUnuUn = var5 * var5;
               UvnvNVnnnnNU = Stardust.UvnvNVnnnnNU();
               uVUVnuvnuVuv = true;
               return true;
            } else {
               uVUVnuvnuVuv = false;
               return false;
            }
         }
      }
   }

   private void uUnuvNvvNU() {
      float var1 = this.UvUvUNuvNU * VVuuUN + this.c0oOOCcCoC0 * nuUnNvnuUu;
      this.c0oOOCcCoC0 = this.c0oOOCcCoC0 * VVuuUN - this.UvUvUNuvNU * nuUnNvnuUu;
      this.UvUvUNuvNU = var1;
      var1 = this.VVnVNnunVvu * uVUuuVnNVU + this.unNNVVNnvvV * vNUvnnVnUvu;
      this.unNNVVNnvvV = this.unNNVVNnvvV * uVUuuVnNVU - this.VVnVNnunVvu * vNUvnnVnUvu;
      this.VVnVNnunVvu = var1;
      var1 = this.NuunnvnN * VVuuUN + this.NVUunUNUN * nuUnNvnuUu;
      this.NVUunUNUN = this.NVUunUNUN * VVuuUN - this.NuunnvnN * nuUnNvnuUu;
      this.NuunnvnN = var1;
   }

   private void vVvUvVVuuNvV() {
      float var1 = this.nnuUVNUuvvVU;
      float var2 = this.vuvnUnVnUNnV * this.NnUuNNU - this.UUVNuUNUvUnV * this.uNnUnnuNUnNu;
      this.UUVNuUNUvUnV = var1;
      this.vuvnUnVnUNnV = var2;
      this.uNNnnnuuuN();
   }

   private void uNNnnnuuuN() {
      this.nnuUVNUuvvVU = this.UUVNuUNUvUnV * this.NnUuNNU + this.vuvnUnVnUNnV * this.uNnUnnuNUnNu;
   }

   public void method_3085() {
      if (this.nVVUuvuNnUN) {
         this.nVVUuvuNnUN = false;
         if (this.NVNnnvnuunNv == uUnuvNvvNU && C00OOC00oO > 0) {
            C00OOC00oO--;
         }
      }

      super.method_3085();
   }

   private void UuUVuuUu(class_4588 var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      var1.method_22912(var2, var3, var4)
         .method_22913(var5, var6)
         .method_1336(this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu, var7)
         .method_22914(0.0F, 1.0F, 0.0F);
   }

   public static int UuUVuuUu() {
      return C00OOC00oO;
   }

   public static void C00OOC00oO() {
      C00OOC00oO = 0;
      uUnuvNvvNU++;
   }

   private static int UuUVuuUu(float var0) {
      if (var0 <= 0.0F) {
         return 0;
      } else {
         return var0 >= 255.0F ? 255 : (int)var0;
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static int UuUVuuUu(int var0, int var1) {
      return var0 >>> var1 & 0xFF;
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = (var2 - var0) / (var1 - var0);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         return var3 >= 1.0F ? 1.0F : var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float C00OOC00oO(float var0) {
      return uUnuvNvvNU((float)Math.sin(var0 * 12.9898F + 78.233F) * 43758.547F);
   }

   private static float uUnuvNvvNU(float var0) {
      return var0 - (float)Math.floor(var0);
   }

   public static final class NVnVnNnN implements class_707<class_2400> {
      public class_703 UuUVuuUu(class_2400 var1, class_638 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
         return new nvUnNvnvuN(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
