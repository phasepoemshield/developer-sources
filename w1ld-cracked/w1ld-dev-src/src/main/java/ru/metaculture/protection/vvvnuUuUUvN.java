package ru.metaculture.protection;

import net.minecraft.class_2400;
import net.minecraft.class_3999;
import net.minecraft.class_4003;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;

public final class vvvnuUuUUvN extends class_4003 {
   public static class_2400 UuUVuuUu = unnNUVnUnv.vVvUvVVuuNvV;
   private static int C00OOC00oO;
   private static int uUnuvNvvNU;
   private final int vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private final float VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final float vuuuNvNuv;
   private final float nvUVNnuu;
   private final int UuuNnUvUuv;
   private final int nUUVuvU;
   private final int UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private boolean NVNnnvnuunNv = true;

   public vvvnuUuUUvN(class_638 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      float var14 = C00OOC00oO((float)(var2 * 0.047 + var4 * 0.131 + var6 * 0.089));
      float var15 = C00OOC00oO(var14 * 43.19F + (float)var8 * 7.71F);
      float var16 = C00OOC00oO((float)var8, (float)var10, (float)var12);
      if (var16 <= 0.0F) {
         var8 = 0.028;
         var10 = -0.07;
         var12 = 0.018;
         var16 = C00OOC00oO((float)var8, (float)var10, (float)var12);
      }

      this.uNNnnnuuuN = 0.036F + var14 * 0.026F;
      this.nuUnNvnuUu = 3.4F + var15 * 3.2F;
      this.VVuuUN = (float)var8 * var16;
      this.vNUvnnVnUvu = (float)var10 * var16;
      this.uVUuuVnNVU = (float)var12 * var16;
      float var17 = 0.2F + var14 * 0.18F;
      this.vuuuNvNuv = (float)Math.sin(var17);
      this.nvUVNnuu = (float)Math.cos(var17);
      this.vNVuvnUUnuUn = 0.0F;
      this.UvnvNVnnnnNU = 1.0F;
      this.vVvUvVVuuNvV();
      int var18 = var14 < 0.5F ? Stardust.uVUVnuvnuVuv() : Stardust.NVNnnvnuunNv();
      this.UuuNnUvUuv = UuUVuuUu(UuUVuuUu(214.0F, UuUVuuUu(var18, 16), 0.44F + var14 * 0.28F) + 18.0F);
      this.nUUVuvU = UuUVuuUu(UuUVuuUu(236.0F, UuUVuuUu(var18, 8), 0.38F + var15 * 0.3F) + 12.0F);
      this.UnUNVVVNuv = UuUVuuUu(UuUVuuUu(255.0F, UuUVuuUu(var18, 0), 0.32F + var15 * 0.24F));
      this.vVvUvVVuuNvV = uUnuvNvvNU;
      this.field_3847 = 34 + (int)(var15 * 28.0F);
      this.field_3862 = false;
      this.field_3844 = 0.0F;
      this.field_28786 = 0.986F;
      this.method_34753(var8, var10, var12);
      C00OOC00oO++;
   }

   public class_3999 method_18122() {
      return class_3999.field_17831;
   }

   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (Stardust.UuuNnUvUuv() && this.vVvUvVVuuNvV == uUnuvNvvNU && this.field_3866++ < this.field_3847) {
         this.field_3874 = this.field_3874 + this.field_3852;
         this.field_3854 = this.field_3854 + this.field_3869;
         this.field_3871 = this.field_3871 + this.field_3850;
         this.field_3852 *= 0.985;
         this.field_3869 *= 0.985;
         this.field_3850 *= 0.985;
         this.uUnuvNvvNU();
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
         float var6 = uUnuvNvvNU(0.0F, 0.12F, var5) * (1.0F - uUnuvNvvNU(0.7F, 1.0F, var5)) * Stardust.nUUVuvU() * 0.92F;
         if (!(var6 <= 0.003F)) {
            UvnUVNunuNNv.UuUVuuUu(var3);
            double var7 = this.field_3858 + (this.field_3874 - this.field_3858) * var4;
            double var9 = this.field_3838 + (this.field_3854 - this.field_3838) * var4;
            double var11 = this.field_3856 + (this.field_3871 - this.field_3856) * var4;
            float var13 = (float)(var7 - UvnUVNunuNNv.UuUVuuUu());
            float var14 = (float)(var9 - UvnUVNunuNNv.C00OOC00oO());
            float var15 = (float)(var11 - UvnUVNunuNNv.uUnuvNvvNU());
            float var16 = UvnUVNunuNNv.vVvUvVVuuNvV();
            float var17 = UvnUVNunuNNv.uNNnnnuuuN();
            float var18 = UvnUVNunuNNv.nuUnNvnuUu();
            float var19 = UvnUVNunuNNv.VVuuUN();
            float var20 = UvnUVNunuNNv.vNUvnnVnUvu();
            float var21 = UvnUVNunuNNv.uVUuuVnNVU();
            float var22 = this.VVuuUN;
            float var23 = this.vNUvnnVnUvu;
            float var24 = this.uVUuuVnNVU;
            float var25 = var22 * var16 + var23 * var17 + var24 * var18;
            float var26 = var22 * var19 + var23 * var20 + var24 * var21;
            float var27 = C00OOC00oO(var25, var26, 0.0F);
            if (var27 <= 0.0F) {
               var25 = 1.0F;
               var26 = 0.0F;
               var27 = 1.0F;
            }

            var25 *= var27;
            var26 *= var27;
            float var28 = var16 * var25 + var19 * var26;
            float var29 = var17 * var25 + var20 * var26;
            float var30 = var18 * var25 + var21 * var26;
            float var31 = var16 * -var26 + var19 * var25;
            float var32 = var17 * -var26 + var20 * var25;
            float var33 = var18 * -var26 + var21 * var25;
            float var34 = this.vNVuvnUUnuUn + (this.uVUVnuvnuVuv - this.vNVuvnUUnuUn) * var4;
            float var35 = 0.84F + 0.16F * var34;
            float var36 = this.uNNnnnuuuN * var35;
            float var37 = this.uNNnnnuuuN * 0.26F;
            float var38 = this.nuUnNvnuUu * (0.86F + var35 * 0.24F);
            float var39 = var28 * var36;
            float var40 = var29 * var36;
            float var41 = var30 * var36;
            float var42 = var28 * var38;
            float var43 = var29 * var38;
            float var44 = var30 * var38;
            float var45 = var31 * var36;
            float var46 = var32 * var36;
            float var47 = var33 * var36;
            float var48 = var31 * var37;
            float var49 = var32 * var37;
            float var50 = var33 * var37;
            int var51 = UuUVuuUu(var6 * 255.0F);
            class_4588 var52 = var2.getBuffer(vNvVVuUVVuuN.C00OOC00oO());
            this.UuUVuuUu(var52, var13 - var42 - var48, var14 - var43 - var49, var15 - var44 - var50, 0.0F, 1.0F, var51);
            this.UuUVuuUu(var52, var13 + var39 - var45, var14 + var40 - var46, var15 + var41 - var47, 1.0F, 0.0F, var51);
            this.UuUVuuUu(var52, var13 + var39 + var45, var14 + var40 + var46, var15 + var41 + var47, 1.0F, 0.0F, var51);
            this.UuUVuuUu(var52, var13 - var42 + var48, var14 - var43 + var49, var15 - var44 + var50, 0.0F, 1.0F, var51);
         }
      }
   }

   private void uUnuvNvvNU() {
      float var1 = this.uVUVnuvnuVuv;
      float var2 = this.UvnvNVnnnnNU * this.nvUVNnuu - this.vNVuvnUUnuUn * this.vuuuNvNuv;
      this.vNVuvnUUnuUn = var1;
      this.UvnvNVnnnnNU = var2;
      this.vVvUvVVuuNvV();
   }

   private void vVvUvVVuuNvV() {
      this.uVUVnuvnuVuv = this.vNVuvnUUnuUn * this.nvUVNnuu + this.UvnvNVnnnnNU * this.vuuuNvNuv;
   }

   public void method_3085() {
      if (this.NVNnnvnuunNv) {
         this.NVNnnvnuunNv = false;
         if (this.vVvUvVVuuNvV == uUnuvNvvNU && C00OOC00oO > 0) {
            C00OOC00oO--;
         }
      }

      super.method_3085();
   }

   private void UuUVuuUu(class_4588 var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      var1.method_22912(var2, var3, var4)
         .method_22913(var5, var6)
         .method_1336(this.UuuNnUvUuv, this.nUUVuvU, this.UnUNVVVNuv, var7)
         .method_22914(1.0F, 0.0F, 0.0F);
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
      float var3 = var0 * var0 + var1 * var1 + var2 * var2;
      return var3 <= 1.0E-8F ? 0.0F : (float)(1.0 / Math.sqrt(var3));
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
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
         return new vvvnuUuUUvN(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
