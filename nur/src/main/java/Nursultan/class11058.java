package Nursultan;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11058 {
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
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public boolean u_init;

   private void L(int var1) {
      this.y_5 = var1;
      this.y_6 = 0L;
      this.y_7 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0L;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
      this.N_6 = false;
      this.u_0 = false;
      this.u_1 = false;
      ((class09166)this.y_0).y();
      ((class09167)this.y_1).N();
      ((class11088)this.y_2).y();
      ((class09171)this.y_3).N();
      ((class09133)this.y_4).N();
   }

   public class11058() {
      this.R();
      this.y_0 = new class09166();
      this.y_1 = new class09167();
      this.y_2 = new class11088();
      this.y_3 = new class09171();
      this.y_4 = new class09133();
      this.y_5 = Integer.MIN_VALUE;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
   }

   public boolean y() {
      return ((class11088)this.y_2).N();
   }

   private float y(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float var6 = var1 * (!var4 && !var5 ? 9.0F : 14.0F);
      float var7 = var2 * (var3 ? 0.66F : 0.84F);
      return Math.max(var6, var7);
   }

   private boolean N(class00734 var1, class06889 var2, double var3) {
      boolean var5 = var1.M(0.025).u(var2);
      boolean var6 = var2.M >= var1.N - 0.34
         && var2.M <= var1.u + 0.34
         && var2.Z >= var1.L - 0.34
         && var2.Z <= var1.R + 0.34
         && var2.B >= var1.y - 0.45
         && var2.B <= var1.i + 0.95;
      return var5 || var6 || var3 <= 0.82;
   }

   private float N(float var1, float var2, float var3, float var4) {
      float var5 = Math.abs(var2);
      if (var5 <= 1.0E-4F) {
         return var1;
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6) {
            return var2 * var3;
         } else {
            float var7 = var5 * var3;
            return Math.abs(var1) < var7 ? var6 * var7 : class04995.N(var1, -var5 * var4, var5 * var4);
         }
      }
   }

   private float N(float var1, float var2, boolean var3) {
      float var4 = 9.0F - var2 * 1.6F + (var3 ? 2.2F : 0.0F);
      return Math.max(var1 * 3.0F, class04995.N(var4, 5.0F, 12.0F));
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      float var5 = 42.0F - var2 * 7.5F - (Float)this.L_0 * 4.5F;
      if (var3) {
         var5 += 10.0F;
      }

      if (var4) {
         var5 += 4.0F;
      }

      return Math.max(var1 * 10.0F, class04995.N(var5, 26.0F, var3 ? 56.0F : 46.0F));
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, boolean var6, boolean var7) {
      long var8 = System.currentTimeMillis();
      if (var8 >= (Long)this.y_6) {
         float var10 = var7 ? 1.0F : 0.0F;
         this.L_1 = ((class09166)this.y_0).N(true, var5 * (0.28F + var10 * 0.18F));
         this.L_2 = ((class09166)this.y_0).N(false, var5 * (0.16F + var10 * 0.08F));
         this.y_6 = var8 + (long)((class09166)this.y_0).y(var7 ? 65.0F : 105.0F, var7 ? 150.0F : 260.0F);
      }

      class11499 var11 = new class11499(var4.y() + (Float)this.L_1, class04995.N(var4.R() + (Float)this.L_2, -90.0F, 90.0F));
      return var6 && !var1.N(var2, var11) ? var4 : var11;
   }

   private class06889 N(class00734 var1, float var2, float var3, float var4) {
      return new class06889(class04995.u((double)var2, var1.N, var1.u), class04995.u((double)var3, var1.y, var1.i), class04995.u((double)var4, var1.L, var1.R));
   }

   private class06889 N(class00734 var1, boolean var2) {
      long var3 = System.currentTimeMillis();
      if (var2 || var3 >= (Long)this.N_2) {
         float var5 = (float)((class09166)this.y_0).N();
         this.N_3 = class04995.N(0.5F + var5 * ((class09166)this.y_0).y(0.08F, 0.28F), 0.2F, 0.8F);
         this.N_4 = ((class09166)this.y_0).y(0.58F, 0.86F);
         this.N_5 = class04995.N(0.5F + ((class09166)this.y_0).y(-0.24F, 0.24F), 0.2F, 0.8F);
         this.N_2 = var3 + (long)((class09166)this.y_0).y(58.0F, 155.0F);
      }

      return this.N(var1, (Float)this.N_3, (Float)this.N_4, (Float)this.N_5);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      float var11 = this.N(var5, var6, var7, var8);
      float var10;
      class11499 var12 = this.N(var3, var4, var11, var10 = this.N(var5, var6, var7));
      if (var1.N(var2, var12)) {
         return var12;
      } else {
         class11499 var13 = this.N(var3, class09170.N(this.N(class11064.u(var2), true)), var11, var10);
         if (var1.N(var2, var13)) {
            return var13;
         } else {
            class11499 var14 = this.N(var3, class09170.N(class11064.y(var2)), var11 * 1.18F, var10);
            if (var1.N(var2, var14)) {
               return var14;
            } else {
               return var9 && var1.N(var2, var3) ? this.N(var1, var2, var3, var5, var8) : var12;
            }
         }
      }
   }

   private void N(class11499 var1, class11499 var2) {
      this.N_0 = class09170.N(var1.y(), var2.y());
      this.N_1 = var2.R() - var1.R();
      this.u_0 = true;
   }

   private class11499 N(class11499 var1, class11499 var2, float var3, float var4) {
      float var5 = class09170.N(var1.y(), var2.y());
      float var6 = var2.R() - var1.R();
      return new class11499(var1.y() + class04995.N(var5, -var3, var3), class04995.N(var1.R() + class04995.N(var6, -var4, var4), -90.0F, 90.0F));
   }

   public void N() {
      this.y_5 = Integer.MIN_VALUE;
      this.y_6 = 0L;
      this.y_7 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0L;
      this.N_3 = 0.5F;
      this.N_4 = 0.68F;
      this.N_5 = 0.5F;
      this.N_6 = false;
      this.u_0 = false;
      this.u_1 = false;
      ((class09166)this.y_0).y();
      ((class09167)this.y_1).N();
      ((class11088)this.y_2).y();
      ((class09171)this.y_3).N();
      ((class09133)this.y_4).N();
   }

   private float N(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float var6 = var1 * (!var4 && !var5 ? 24.0F : 34.0F);
      float var7 = var2 * (var3 ? 0.72F : 0.92F);
      return Math.max(var6, var7);
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      float var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12
   ) {
      float var13 = class09170.N(var3.y(), var4.y());
      float var14 = var4.R() - var3.R();
      float var15 = Math.abs(var13);
      float var16 = Math.abs(var14);
      if (var15 <= var5 * 0.8F && var16 <= var5 * 0.55F) {
         class11499 var26 = this.N(var1, var2, var3, var4, var5, var8, var11);
         this.N(var3, var26);
         return var26;
      } else {
         class09138 var17 = ((class09167)this.y_1).N(var13, var14, var5, var6, (Float)this.L_0, var7, var8, var9, var10, var11, var12);
         float var18 = var17.R();
         float var19 = var17.i();
         float var20 = var17.B();
         float var21 = var17.Z();
         float var22 = var17.z();
         float var23 = var17.M();
         this.u_1 = var17.N();
         var22 = this.N(var22, var13, var18, var20);
         var23 = this.N(var23, var14, var19, var21);
         if ((Boolean)this.u_0 && !var17.u()) {
            float var24 = this.N(var5, var15, var8, var10, var11) * var17.L();
            float var25 = this.y(var5, var16, var8, var10, var11) * var17.y();
            var22 = (Float)this.N_0 + class04995.N(var22 - (Float)this.N_0, -var24, var24);
            var23 = (Float)this.N_1 + class04995.N(var23 - (Float)this.N_1, -var25, var25);
            var22 = this.N(var22, var13, var18, var20);
            var23 = this.N(var23, var14, var19, var21);
         }

         class11499 var31 = new class11499(var3.y() + var22, class04995.N(var3.R() + var23, -90.0F, 90.0F));
         if (var8 && !var1.N(var2, var31)) {
            var31 = this.N(var1, var2, var3, var4, var22, var23, var5);
         }

         this.N(var3, var31);
         return var31;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, float var7) {
      for (float var12 : new float[]{0.82F, 0.66F, 0.48F, 0.3F}) {
         class11499 var13 = new class11499(
            var3.y() + class04995.B(var12, class09170.N(var3.y(), var4.y()), var5),
            class04995.N(var3.R() + class04995.B(var12, var4.R() - var3.R(), var6), -90.0F, 90.0F)
         );
         if (var1.N(var2, var13)) {
            return var13;
         }
      }

      class11499 var14 = new class11499(
         var3.y() + ((class09166)this.y_0).N(true, var7 * 0.22F), class04995.N(var3.R() + ((class09166)this.y_0).N(false, var7 * 0.12F), -90.0F, 90.0F)
      );
      return var1.N(var2, var14) ? var14 : var4;
   }

   public class09122 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      float var5,
      float var6,
      double var7,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14
   ) {
      if ((class04453)((class06202)class11087.N_0).T_4 != null && var1 != null && var2 != null && var3 != null && var4 != null) {
         if ((Integer)this.y_5 != var2.method_5628()) {
            this.L(var2.method_5628());
         }

         float var16 = (float)Math.max(var7, 0.035F);
         class06889 var17 = class11064.y(var2);
         class06889 var18 = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
         class00734 var19 = class11064.u(var2);
         double var20 = Math.hypot(
            ((class04453)((class06202)class11087.N_0).T_4).method_23317() - var17.M, ((class04453)((class06202)class11087.N_0).T_4).method_23321() - var17.Z
         );
         double var22 = var18.R(var17);
         float var24 = var1.N(var2);
         boolean var25 = var20 <= Math.min(2.85, (double)(var24 + 0.45F)) && var22 <= (double)(var24 + 1.35F);
         float var26 = this.N(var17, var25);
         this.u_1 = false;
         boolean var27 = this.N(var19, var18, var20);
         boolean var28 = ((class09133)this.y_4).N(var2, var19, var18, var20, var24);
         float var29 = class04995.N((float)((2.85 - var20) / 1.65) + (var28 ? 0.22F : 0.0F), 0.0F, 1.0F);
         if (!((class11088)this.y_2).N(var1, var2, var3, var4, var19, var18, var17, var20, var22, var24, var25, var27, var28, var10)) {
            return new class09122(var4, var5, var6, var9, var11, var12, false, false, var29, var27, var28);
         } else {
            float var30 = class09170.N(var3.y(), var4.y());
            float var31 = var4.R() - var3.R();
            boolean var15 = Math.abs(var30) > class04995.N(96.0F - var29 * 18.0F, 72.0F, 96.0F);
            class09132 var33 = ((class09171)this.y_3).N(var3, var4, var16, var29, var26, var27, var10, var12, var13, var5, var6);
            if (var33.u() && !var10) {
               this.N(var3, var33.N());
               return new class09122(var33.N(), var33.y(), var33.L(), false, false, true, true, true, var29, var27, var28);
            } else if (var10) {
               if (var15 && var27) {
                  class11499 var36 = this.N(var1, var2, var3, var16, var13);
                  this.N(var3, var36);
                  return new class09122(var36, var5, var6, var9 && !var28, false, false, false, true, var29, var27, var28);
               } else {
                  class11499 var35 = this.N(var1, var2, var3, var4, var16, var29, var26, true, var27, var12 || var28, var13, var14);
                  return new class09122(var35, var5, var6, var9 && !var28, false, var12 || (Boolean)this.u_1 || var28, false, true, var29, var27, var28);
               }
            } else if (var27 && var15) {
               class11499 var34 = this.N(var1, var2, var3, var4, var16, var29, var12, var13);
               return new class09122(var34, var5, var6, false, false, true, false, true, var29, var27, var28);
            } else {
               return new class09122(
                  this.N(var1, var2, var3, var4, var16, var29, var26, false, var27, var12 || var28, var13, var14),
                  var5,
                  var6,
                  var9 && !var28,
                  var11,
                  var12 || (Boolean)this.u_1 || var28,
                  false,
                  true,
                  var29,
                  var27,
                  var28
               );
            }
         }
      } else {
         return new class09122(var4, var5, var6, var9, var11, var12);
      }
   }

   private float N(class06889 var1, boolean var2) {
      if (!var2) {
         this.L_0 = (Float)this.L_0 * 0.72F;
         this.N_6 = false;
         return 0.0F;
      } else {
         float var3 = (float)Math.toDegrees(
            Math.atan2(
               ((class04453)((class06202)class11087.N_0).T_4).method_23321() - var1.Z, ((class04453)((class06202)class11087.N_0).T_4).method_23317() - var1.M
            )
         );
         float var4 = (Boolean)this.N_6 ? class09170.N((Float)this.y_7, var3) : 0.0F;
         this.y_7 = var3;
         this.N_6 = true;
         this.L_0 = (Float)this.L_0 * 0.68F + class04995.N(Math.abs(var4) / 18.0F, 0.0F, 1.0F) * 0.32F;
         return var4;
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8) {
      float var9 = this.N(var5, var6, true, var8);
      float var10 = this.N(var5, var6, true);
      class11499 var11 = class09170.N(this.N(class11064.u(var2), true));
      float var12 = var11.R() - var3.R();
      float[] var13 = new float[]{
         0.0F,
         (float)((class09166)this.y_0).N() * var5 * ((class09166)this.y_0).y(1.0F, 3.0F),
         (float)(-((class09166)this.y_0).N()) * var5 * ((class09166)this.y_0).y(1.0F, 3.0F),
         7.5F,
         -7.5F,
         15.0F,
         -15.0F,
         26.0F,
         -26.0F,
         class04995.N(class09170.N(var3.y(), var4.y()), -var9, var9)
      };
      float[] var14 = new float[]{
         class04995.N(var12, -var10, var10),
         0.0F,
         class04995.N(var4.R() - var3.R(), -var10, var10),
         class04995.N(var12 * 0.58F, -var10, var10),
         class04995.N(var12 - 2.8F, -var10, var10),
         class04995.N(var12 - 5.0F, -var10, var10)
      };
      class11499 var15 = null;
      double var16 = Double.MAX_VALUE;

      for (float var21 : var13) {
         for (float var25 : var14) {
            class11499 var28 = new class11499(var3.y() + var21, class04995.N(var3.R() + var25, -90.0F, 90.0F));
            double var26;
            if (var1.N(var2, var28) && (var26 = (double)Math.abs(var21) * 1.35 + (double)Math.abs(var25) * 0.72) < var16) {
               var15 = var28;
               var16 = var26;
            }
         }
      }

      return var15 != null ? var15 : this.N(var3, var11, var9, var10);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, float var4, boolean var5) {
      long var7 = System.currentTimeMillis();
      if (var7 >= (Long)this.y_6) {
         float var9 = var5 ? 1.0F : 0.0F;
         this.L_1 = ((class09166)this.y_0).N(true, var4 * (0.55F + var9 * 0.25F));
         this.L_2 = ((class09166)this.y_0).N(false, var4 * (0.22F + var9 * 0.12F));
         this.y_6 = var7 + (long)((class09166)this.y_0).y(var5 ? 90.0F : 145.0F, var5 ? 210.0F : 360.0F);
      }

      class11499 var6;
      return var1.N(var2, var6 = new class11499(var3.y() + (Float)this.L_1, class04995.N(var3.R() + (Float)this.L_2, -90.0F, 90.0F))) ? var6 : var3;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_5 = 0;
         this.y_6 = 0L;
         this.y_7 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
         this.u_1 = false;
      }
   }
}
