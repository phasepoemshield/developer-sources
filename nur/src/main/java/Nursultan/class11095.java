package Nursultan;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11095 {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;

   private void M() {
   }

   public class11095() {
      this.M();
      this.y_0 = new class11062();
      this.y_1 = new class11055();
      this.y_2 = new class11081();
      this.y_3 = new class11083();
      this.y_4 = new class11078();
      this.y_5 = new class11057();
      this.y_6 = new class11076();
   }

   static {
      R();
   }

   private boolean y(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (!var5) {
         return false;
      } else {
         float var8 = Math.abs(var4.R() - var3.R());
         if (var7 && var8 > 1.2F) {
            return false;
         } else {
            class11499 var9 = new class11499(var4.y(), var3.R());
            if (var1.N(var2, var9)) {
               return true;
            } else if (var6) {
               return false;
            } else if (var8 > 1.15F) {
               return false;
            } else {
               float var10 = class09170.N(var3.y(), var4.y());
               class11499 var11 = new class11499(var3.y() + var10 * 0.62F, var3.R());
               return var1.N(var2, var11);
            }
         }
      }
   }

   public void N() {
      ((class11076)this.y_6).N();
      ((class11062)this.y_0).N();
      ((class11055)this.y_1).N();
      ((class11081)this.y_2).N();
      ((class11083)this.y_3).N();
      ((class11078)this.y_4).N();
      ((class11057)this.y_5).N();
   }

   private double N(class11499 var1, class11499 var2) {
      float var3 = Math.abs(class09170.N(var1.y(), var2.y()));
      float var4 = Math.abs(var2.R() - var1.R());
      return (double)var3 * 0.88 + (double)var4 * 1.42;
   }

   private class11499 N(class06889 var1) {
      class11499 var2 = class09170.N(var1);
      return new class11499(var2.y(), class04995.N(var2.R(), -90.0F, 90.0F));
   }

   private class06889 N(class00734 var1, float var2, float var3, float var4) {
      return new class06889(class04995.u((double)var2, var1.N, var1.u), class04995.u((double)var3, var1.y, var1.i), class04995.u((double)var4, var1.L, var1.R));
   }

   public class11097 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      boolean var12 = var1.N(var2, var3);
      boolean var13 = var1.N(var2, var4);
      class00734 var14 = class11064.u(var2);
      class06889 var15 = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
      class06889 var16 = this.N(var14, var2, var12, var5, var7);
      class11104 var17 = ((class11057)this.y_5).N(var1, var2, var14, var16, var3, var12, var5, var6, var7);
      class06889 var18 = var17.u();
      class11499 var19 = this.N(var18);
      class11065 var20 = var17.N()
         ? new class11065(var18, true, var17.y())
         : ((class11062)this.y_0).N(var1, var2, var14, var18, var3, var19, var12, var5, var6);
      class11499 var21 = this.N(var20.L());
      class11499 var22 = var20.y() ? (var17.N() ? var17.L() : var21) : this.N(var1, var2, var3, var21, var14, var20.L(), var12);
      boolean var11 = var12 && !var20.y() && !var20.N();
      if (var11) {
         var22 = ((class11078)this.y_4).N(var1, var2, var3, var22, var12, var6, var5, false);
      }

      float var24 = Math.abs(class09170.N(var3.y(), var21.y()));
      float var25 = Math.abs(var21.R() - var3.R());
      boolean var26 = false;
      if (!var11 && !var20.y() && var12 && var24 <= 2.4F && var25 <= 1.15F && !var6) {
         class11096 var27 = ((class11081)this.y_2).N(var1, var2, var3, var22, var12, var5, var6, var7);
         var22 = var27.y();
         var26 = var27.N();
      }

      class11086 var10 = var11 ? class11086.u() : ((class11055)this.y_1).N(var1, var2, var3, var22, var12, var5, var6, var20.y());
      if (var10.N()) {
         var22 = new class11499(var22.y() + var10.y(), class04995.N(var22.R() + var10.i(), -90.0F, 90.0F));
      }

      boolean var8;
      boolean var9 = !(var8 = var10.L()) && this.y(var1, var2, var3, var22, var12, var20.y(), var20.N());
      if (var9) {
         var22 = new class11499(var22.y(), var3.R());
      }

      var22 = ((class11083)this.y_3).N(var1, var2, var3, var22, var6, var5 && var7, var20.y() || var8);
      var22 = ((class11078)this.y_4).N(var1, var2, var3, var22, var12, var6, var5, var20.y() || var8);
      float var29 = Math.abs(class09170.N(var3.y(), var22.y()));
      float var30 = Math.abs(var22.R() - var3.R());
      double var31 = var15.R(var14.R());
      boolean var33 = var20.y()
         || var20.N()
         || var17.y()
         || var8
         || !var12
         || var29 > class04995.N(7.0F + (float)var31 * 1.6F, 8.0F, 15.5F)
         || var7 && var5 && (var29 > 2.8F || var30 > 1.35F);
      return new class11097(var22, var12, var13, var33, var9, var20.y() || var8 || var17.N(), var26, var20.N() || var17.y(), var29, var30, var31);
   }

   private class06889 N(class00734 var1, class07438 var2, boolean var3, boolean var4, boolean var5) {
      return ((class11076)this.y_6).N(var1, var2, var3, var4, var5);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class00734 var5, class06889 var6, boolean var7) {
      if (var7 && var1.N(var2, var3)) {
         float var20 = Math.abs(class09170.N(var3.y(), var4.y()));
         float var21 = Math.abs(var4.R() - var3.R());
         if (var20 <= 4.5F && var21 <= 2.0F) {
            return var4;
         } else {
            class11499 var11 = new class11499(
               var3.y() + class09170.N(var3.y(), var4.y()) * 0.38F, class04995.N(var3.R() + (var4.R() - var3.R()) * 0.28F, -90.0F, 90.0F)
            );
            if (var1.N(var2, var11)) {
               return var11;
            } else {
               class11499 var22 = new class11499(var4.y(), var3.R());
               if (var1.N(var2, var22)) {
                  return var22;
               } else {
                  return var1.N(var2, var4) ? var4 : var3;
               }
            }
         }
      } else {
         class11499 var9 = var1.N(var2, var4) ? var4 : null;
         double var10 = var9 == null ? Double.MAX_VALUE : this.N(var3, var9);
         class06889 var12 = class11064.N(var2, ((class04453)((class06202)class11087.N_0).T_4).method_33571());

         for (class06889 var16 : new class06889[]{
            var6,
            var5.R(),
            var12,
            this.N(var5, 0.5F, 0.54F, 0.5F),
            this.N(var5, 0.5F, 0.74F, 0.5F),
            this.N(var5, 0.32F, 0.67F, 0.5F),
            this.N(var5, 0.68F, 0.67F, 0.5F),
            ((class11076)this.y_6).y(var5),
            ((class11076)this.y_6).N(var5)
         }) {
            class11499 var19 = this.N(var16);
            double var17;
            if (var1.N(var2, var19) && (var17 = this.N(var3, var19)) < var10) {
               var9 = var19;
               var10 = var17;
            }
         }

         return var9 == null ? var4 : var9;
      }
   }

   private static void R() {
      N_0 = -90.0F;
      N_1 = 90.0F;
   }
}
