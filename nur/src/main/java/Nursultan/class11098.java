package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class11098 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   public class11098() {
      this.i();
      this.L_0 = new class09166();
      this.L_2 = 0.72F;
      this.L_3 = 0.54F;
      this.y_2 = 1.0F;
   }

   private void i() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0L;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
         this.L_6 = 0.0F;
         this.L_7 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = false;
      }
   }

   private float y(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float var5 = (float)var2;
         int var6 = Math.round(var1 / var5);
         if (var6 == 0) {
            var6 = var1 > 0.0F ? 1 : -1;
         }

         int var7 = var4 ? (Integer)this.N_2 : (Integer)this.N_3;
         int var8 = var4 ? (Integer)this.N_4 : (Integer)this.N_5;
         int var9 = var6 - var7;
         if (var6 == var7 || var9 == var8 || Math.abs(var6) == Math.abs(var7)) {
            int var10 = var6 == 0 ? ((class09166)this.L_0).N() : (var6 > 0 ? 1 : -1);
            var6 += var10 * ((class09166)this.L_0).N(1, var4 ? 3 : 2);
            if (var6 == 0) {
               var6 = var10;
            }

            var9 = var6 - var7;
         }

         if (var4) {
            this.N_2 = var6;
            this.N_4 = var9;
         } else {
            this.N_3 = var6;
            this.N_5 = var9;
         }

         this.N_6 = true;
         return (float)var6 * var5;
      } else {
         return var1;
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if (var1 >= (Long)this.L_1) {
         float var8 = (var4 ? 0.18F : 0.0F) + (var5 ? 0.32F : 0.0F) + (var6 ? 0.18F : 0.0F) + (var7 ? 0.16F : 0.0F);
         this.N_1 = ((class09166)this.L_0).N(0, 4);
         this.L_2 = ((class09166)this.L_0).y(0.54F, 0.86F + var8 * 0.12F);
         this.L_3 = ((class09166)this.L_0).y(0.38F, 0.68F + var8 * 0.08F);
         this.L_4 = ((class09166)this.L_0).y(0.9F, 4.4F + var8 * 2.0F);
         this.L_5 = ((class09166)this.L_0).y(0.32F, 1.9F + var8 * 0.85F);
         this.L_6 = ((class09166)this.L_0).y(0.35F, 2.25F + var8 * 0.9F);
         this.L_7 = ((class09166)this.L_0).y(0.12F, 1.05F + var8 * 0.45F);
         this.y_0 = ((class09166)this.L_0).y(0.25F, 1.8F);
         this.y_1 = ((class09166)this.L_0).y(0.14F, 1.05F + var8 * 0.45F);
         this.y_2 = ((class09166)this.L_0).N(0.58F) ? -(Float)this.y_2 : (float)((class09166)this.L_0).N();
         this.N_0 = ((class09166)this.L_0).N(0.0F, (float) (Math.PI * 2));
         this.L_1 = var1 + (long)((class09166)this.L_0).y(!var6 && !var7 ? 68.0F : 45.0F, var5 ? 150.0F : 230.0F);
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, float var5) {
      float var6 = Math.abs(var2) > 1.0E-4F ? var2 : var1;
      float var7 = var4 ? (Float)this.L_2 : (Float)this.L_3;
      float var8 = var1 * ((class09166)this.L_0).y(0.72F, 1.08F) + var6 * var7 * ((class09166)this.L_0).y(0.14F, 0.36F);
      if (Math.abs(var8) < var3 && Math.abs(var6) > var3 * 2.0F) {
         var8 = Math.signum(var6) * var3 * ((class09166)this.L_0).y(var4 ? 1.4F : 0.7F, var4 ? 4.2F : 1.9F);
      }

      return var8;
   }

   public class09134 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      float var14,
      float var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null && (var10 || var11 || var12 || var13)) {
         float var16 = (float)Math.max(var6, 0.035F);
         long var17 = System.currentTimeMillis();
         this.N(var17, var16, var10, var11, var12, var13);
         float var19 = class09170.N(var3.y(), var4.y());
         float var20 = var4.R() - var3.R();
         float var21 = class09170.N(var3.y(), var5.y());
         float var22 = var5.R() - var3.R();
         float var23 = Math.abs(var19) > Math.abs(var21) ? var19 : var21;
         float var24 = Math.abs(var20) > Math.abs(var22) ? var20 : var22;
         float var25 = class04995.N(
            (Math.abs(var23) + Math.abs(var24) * 1.45F) / 76.0F + (var10 ? 0.18F : 0.0F) + (var11 ? 0.24F : 0.0F) + (var13 ? 0.16F : 0.0F), 0.0F, 1.18F
         );
         float var26 = this.N(var21, var19, var16, true, var25);
         float var27 = this.N(var22, var20, var16, false, var25);
         float var28 = (float)Math.sqrt((double)(var23 * var23 + var24 * var24));
         float var29 = var28 > 1.0E-4F ? -var24 / var28 * (Float)this.y_2 : (Float)this.y_2;
         float var30 = var28 > 1.0E-4F ? var23 / var28 * (Float)this.y_2 : -(Float)this.y_2;
         float var31 = (float)Math.sin((double)var17 * 0.027 + (double)((Float)this.N_0).floatValue());
         float var32 = (float)Math.sin((double)var17 * 0.061 + (double)((Float)this.N_0 * 1.73F));
         float var33 = var31 * 0.62F + var32 * 0.38F;
         float var34 = var16 * (Float)this.L_4 * var25;
         float var35 = var16 * (Float)this.L_5 * var25;
         var26 += var29 * var34 + var33 * var16 * (Float)this.L_6;
         var27 += var30 * var35 + var32 * var16 * (Float)this.L_7;
         if ((Integer)this.N_1 == 1) {
            var26 -= Math.signum(var26) * var16 * (Float)this.y_0 * class04995.N(var25, 0.25F, 1.0F);
            var27 += Math.signum(var24 == 0.0F ? var27 : var24) * var16 * (Float)this.y_1;
         } else if ((Integer)this.N_1 == 2) {
            var26 += Math.signum(var23 == 0.0F ? var26 : var23) * var16 * ((class09166)this.L_0).y(0.65F, 2.6F) * var25;
            var27 -= var16 * ((class09166)this.L_0).y(0.35F, 1.45F) * (var11 ? 1.0F : 0.55F);
         } else if ((Integer)this.N_1 == 3) {
            var27 *= ((class09166)this.L_0).y(0.62F, 1.28F);
            var26 *= ((class09166)this.L_0).y(0.82F, 1.18F);
         }

         var26 = this.N(var26, var23, var21, var16, true, var25);
         var27 = this.N(var27, var24, var22, var16, false, var25);
         if (Math.abs(var27) <= var16 * 0.45F && Math.abs(var24) > var16 * 1.1F) {
            var27 = Math.signum(var24) * var16 * ((class09166)this.L_0).y(0.85F, var11 ? 3.4F : 2.1F);
         }

         var26 = this.y(var26, var6, true);
         var27 = this.y(var27, var6, false);
         class11499 var36 = new class11499(var3.y() + var26, class04995.N(var3.R() + var27, -90.0F, 90.0F));
         var36 = this.N(var1, var2, var3, var5, var36, var6, var8, var9);
         float var37 = Math.abs(class09170.N(var3.y(), var36.y()));
         float var38 = Math.abs(var36.R() - var3.R());
         return new class09134(
            var36,
            this.N(Math.max(var37, var14 * ((class09166)this.L_0).y(0.74F, 1.42F)), var6, true),
            this.N(Math.max(var38, var15 * ((class09166)this.L_0).y(0.62F, 1.28F)), var6, false)
         );
      } else {
         return new class09134(var5, var14, var15);
      }
   }

   public void N() {
      this.L_1 = 0L;
      this.L_2 = 0.72F;
      this.L_3 = 0.54F;
      this.L_4 = 0.0F;
      this.L_5 = 0.0F;
      this.L_6 = 0.0F;
      this.L_7 = 0.0F;
      this.y_0 = 0.0F;
      this.y_1 = 0.0F;
      this.y_2 = 1.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = false;
      ((class09166)this.L_0).y();
   }

   private float N(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float var5 = var4 ? 0.35F : 0.25F;
         return (float)Math.max(1, Math.round(Math.max(var5, var1) / (float)var2)) * (float)var2;
      }
   }

   private float N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > 0.0F ? 1 : -1;
         }

         return (float)var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5, float var6) {
      float var7 = Math.abs(var2) > 1.0E-4F ? var2 : var3;
      if (Math.abs(var7) <= 1.0E-4F) {
         float var11 = var4 * (var5 ? 6.0F : 2.8F) * (0.7F + var6);
         return class04995.N(var1, -var11, var11);
      } else {
         if (Math.signum(var1) != Math.signum(var7) && Math.abs(var7) > var4 * 3.2F) {
            float var8 = var4 * (var5 ? 4.2F : 1.6F) * (0.65F + var6 * 0.35F);
            var1 = class04995.N(var1, -var8, var8);
         }

         float var10 = var5 ? 1.18F : 1.08F;
         float var9 = var4 * (var5 ? 4.2F : 1.9F) * (0.5F + var6);
         return class04995.N(var1, -Math.abs(var7) * var10 - var9, Math.abs(var7) * var10 + var9);
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var8 && !var9 && !var1.N(var2, var5)) {
         float var10 = class09170.N(var4.y(), var5.y());
         float var11 = var5.R() - var4.R();

         for (float var16 : new float[]{0.86F, 0.64F, 0.42F, 0.24F}) {
            class11499 var17 = new class11499(var4.y() + this.N(var10 * var16, var6), class04995.N(var4.R() + this.N(var11 * var16, var6), -90.0F, 90.0F));
            if (var1.N(var2, var17)) {
               return var17;
            }
         }

         return var1.N(var2, var4) ? var4 : var3;
      } else {
         return var5;
      }
   }
}
