package Nursultan;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

public class class11088 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;

   public class11088() {
      this.z();
   }

   static {
      R();
   }

   private void z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
         this.N_1 = false;
         this.N_2 = false;
         this.N_3 = 0.0;
         this.N_4 = 0.0;
         this.N_5 = 0.0;
         this.N_6 = 0.0;
         this.N_7 = 0L;
      }
   }

   public void y() {
      this.N_0 = false;
      this.N_1 = false;
      this.N_2 = false;
      this.N_3 = 0.0;
      this.N_4 = 0.0;
      this.N_5 = 0.0;
      this.N_6 = 0.0;
      this.N_7 = 0L;
   }

   public boolean N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class00734 var5,
      class06889 var6,
      class06889 var7,
      double var8,
      double var10,
      float var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null && var6 != null && var7 != null) {
         boolean var17 = var1.N(var2, var4);
         boolean var18 = var16 || var17;
         boolean var19 = var13 && this.N(var7, var8, var14);
         long var20 = System.currentTimeMillis();
         if (var19 && var18 && var10 <= (double)(var12 + 1.35F)) {
            this.N_0 = true;
            this.N_7 = var20 + 420L;
         } else if (var15 && var13 && var18 && var10 <= (double)(var12 + 1.25F)) {
            this.N_0 = true;
            this.N_7 = var20 + 320L;
         }

         if (!(Boolean)this.N_0) {
            this.N(var7, var8);
            return false;
         } else if (this.N(var3, var5, var6, var12, var16)) {
            this.y();
            this.N(var7, var8);
            return false;
         } else if (var20 > (Long)this.N_7) {
            this.N_0 = false;
            this.N(var7, var8);
            return false;
         } else {
            this.N(var7, var8);
            return var13 && var18;
         }
      } else {
         this.y();
         return false;
      }
   }

   private boolean N(class11499 var1, class00734 var2, class06889 var3, float var4, boolean var5) {
      if (var5) {
         return false;
      } else {
         class06889 var6 = class09139.N(var1.R(), var1.y());
         class06889 var7 = var3.i(var6.L((double)var4 + 1.35));
         class06889 var8 = this.N(var3, var7, var2.R());
         class06889 var9 = new class06889(class04995.N(var8.M, var2.N, var2.u), class04995.N(var8.B, var2.y, var2.i), class04995.N(var8.Z, var2.L, var2.R));
         return var8.R(var9) >= 1.0;
      }
   }

   public boolean N() {
      return (Boolean)this.N_0;
   }

   private void N(class06889 var1, double var2) {
      if ((Boolean)this.N_1) {
         this.N_4 = var2 - (Double)this.N_3;
         this.N_2 = true;
      }

      this.N_1 = true;
      this.N_3 = var2;
      this.N_5 = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - var1.M;
      this.N_6 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - var1.Z;
   }

   private class06889 N(class06889 var1, class06889 var2, class06889 var3) {
      class06889 var4 = var2.u(var1);
      double var5 = var4.B();
      if (var5 <= 1.0E-6) {
         return var1;
      } else {
         double var7 = var3.u(var1).y(var4) / var5;
         return var1.i(var4.L(class04995.N(var7, 0.0, 1.0)));
      }
   }

   private double N(double var1, double var3, double var5, double var7, double var9) {
      double var11 = -((Double)this.N_5 * var5 + (Double)this.N_6 * var7) / var9;
      var11 = class04995.N(var11, 0.0, 1.0);
      double var13 = (Double)this.N_5 + var5 * var11;
      double var15 = (Double)this.N_6 + var7 * var11;
      return Math.hypot(var13, var15);
   }

   private boolean N(class06889 var1, double var2, boolean var4) {
      if (!(Boolean)this.N_1) {
         return false;
      } else {
         double var5 = ((class04453)((class06202)class11087.N_0).T_4).method_23317() - var1.M;
         double var7 = ((class04453)((class06202)class11087.N_0).T_4).method_23321() - var1.Z;
         double var9 = var5 - (Double)this.N_5;
         double var11 = var7 - (Double)this.N_6;
         double var13 = var9 * var9 + var11 * var11;
         if (var13 < 0.0064) {
            return false;
         } else {
            boolean var15 = (Double)this.N_5 * var5 + (Double)this.N_6 * var7 <= 0.0;
            double var16 = this.N(var5, var7, var9, var11, var13);
            double var18 = var4 ? 1.18 : 1.05;
            if (var16 > var18) {
               return false;
            } else {
               double var20 = var2 - (Double)this.N_3;
               boolean var22 = (Boolean)this.N_2 && (Double)this.N_4 < -0.025 && var20 > 0.025;
               boolean var23 = var15 && Math.min((Double)this.N_3, var2) <= 1.65;
               boolean var24 = Math.min((Double)this.N_3, var2) <= 0.92 && var20 > 0.025;
               return var22 || var23 || var24;
            }
         }
      }
   }

   private static void R() {
      y_0 = 1.05;
      y_1 = 0.08;
      y_2 = 0.025;
      y_3 = 1.0;
      y_4 = 420L;
   }
}
