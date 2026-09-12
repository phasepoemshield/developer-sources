package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09145 {
   public static Object N_0;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;

   private boolean L(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return false;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < (Integer)this.L_0; var3++) {
            if (((int[])this.y_0)[var3] == var1) {
               var2++;
            }
         }

         return var2 >= 2;
      }
   }

   public class09145() {
      this.i();
      this.y_0 = new int[20];
      this.y_1 = new int[20];
      this.y_2 = new int[20];
   }

   static {
      R();
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
         this.y_6 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = 0;
         this.L_4 = false;
      }
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9, boolean var10
   ) {
      float var12 = (float)Math.max(var6, 0.035F);
      float var13 = class09170.N(var3.y(), var5.y());
      float var14 = var8 ? 0.0F : var5.R() - var3.R();
      int var15 = this.y(var13, var12);
      int var16 = this.y(var14, var12);
      int var17 = this.N(var13, var14);
      int var18 = this.N(var17);
      if (var15 == 0 && var16 == 0) {
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = var17;
         this.L_4 = true;
         return var5;
      } else {
         boolean var19 = (Boolean)this.L_4 && var15 == (Integer)this.y_3 && var16 == (Integer)this.y_4;
         boolean var20 = (Boolean)this.L_4 && var17 == (Integer)this.y_5 && var17 != Integer.MIN_VALUE && (var15 != 0 || var16 != 0);
         boolean var21 = this.N(var15, var16);
         boolean var22 = this.L(var17);
         boolean var11 = !var8 && var15 != 0 && Math.abs(var15) == Math.abs(var16);
         int var10001;
         if (var19) {
            int var10003 = (Integer)this.L_1 + 1;
            var10001 = var10003;
            this.L_1 = var10003;
         } else {
            var10001 = 0;
         }

         this.L_1 = var10001;
         if (var20) {
            int var30 = (Integer)this.L_2 + 1;
            var10001 = var30;
            this.L_2 = var30;
         } else {
            var10001 = 0;
         }

         this.L_2 = var10001;
         if (var18 == 0 && var17 != Integer.MIN_VALUE && (Integer)this.L_0 > 0) {
            int var31 = (Integer)this.L_3 + 1;
            var10001 = var31;
            this.L_3 = var31;
         } else {
            var10001 = 0;
         }

         this.L_3 = var10001;
         class11499 var24 = var5;
         if (var19 || var21 || (Integer)this.L_2 >= 1 || (Integer)this.L_3 >= 1 || var22 || var11) {
            var24 = this.N(var1, var2, var3, var4, var5, var6, var12, var8, var9, var10, var15, var16);
            var13 = class09170.N(var3.y(), var24.y());
            var14 = var8 ? 0.0F : var24.R() - var3.R();
            var15 = this.y(var13, var12);
            var16 = this.y(var14, var12);
            var17 = this.N(var13, var14);
            var18 = this.N(var17);
            this.L_1 = var15 == (Integer)this.y_3 && var16 == (Integer)this.y_4 ? (Integer)this.L_1 : 0;
            this.L_2 = var17 == (Integer)this.y_5 ? (Integer)this.L_2 : 0;
            this.L_3 = var18 == 0 && var17 != Integer.MIN_VALUE && (Integer)this.L_0 > 0 ? (Integer)this.L_3 : 0;
         }

         this.y_3 = var15;
         this.y_4 = var16;
         this.y_5 = var17;
         this.N(var15, var16, var17);
         this.L_4 = true;
         return var24;
      }
   }

   private boolean N(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return false;
      } else {
         for (int var3 = 0; var3 < (Integer)this.L_0; var3++) {
            if (((int[])this.y_1)[var3] == var1 && ((int[])this.y_2)[var3] == var2) {
               return true;
            }
         }

         return false;
      }
   }

   public void N() {
      this.y_3 = 0;
      this.y_4 = 0;
      this.y_5 = Integer.MIN_VALUE;
      this.y_6 = 0;
      this.L_0 = 0;
      this.L_1 = 0;
      this.L_2 = 0;
      this.L_3 = 0;
      this.L_4 = false;
   }

   private class11499 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      float var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      int var13
   ) {
      int var15 = this.N(var12, class09170.N(var3.y(), var4.y()));
      int var16 = this.N(var13, var4.R() - var3.R());
      int[] var17 = new int[]{1, -1, 2, -2, 3, -3};
      int[] var18 = new int[]{1, -1, 2, -2};
      if (!var9) {
         for (int var22 : var17) {
            class11499 var14 = this.N(var3, var4, var6, var8, var12, var13 + var16 * var22, false);
            if (this.N(var1, var2, var14, var10, var11) && this.N(var3, var14, var8)) {
               return var14;
            }
         }
      }

      for (int var31 : var18) {
         class11499 var23 = this.N(var3, var4, var6, var8, var12 + var15 * var31, var9 ? 0 : var13, var9);
         if (this.N(var1, var2, var23, var10, var11) && this.N(var3, var23, var8)) {
            return var23;
         }
      }

      float var26 = class09170.N(var3.y(), var5.y());
      float var28 = var9 ? 0.0F : var5.R() - var3.R();
      float var30 = (float)var15 * var8 * class09139.N(0.35F, 0.85F);
      float var32 = var9 ? 0.0F : (float)var16 * var8 * class09139.N(0.2F, 0.65F);
      class11499 var24 = new class11499(var3.y() + this.N(var26 + var30, var6), class04995.N(var3.R() + this.N(var28 + var32, var6), -90.0F, 90.0F));
      return this.N(var1, var2, var24, var10, var11) ? var24 : var5;
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

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return !var4 || var5 || var1.N(var2, var3);
   }

   private void N(int var1, int var2, int var3) {
      if (var3 != Integer.MIN_VALUE) {
         ((int[])this.y_1)[(Integer)this.y_6] = var1;
         ((int[])this.y_2)[(Integer)this.y_6] = var2;
         ((int[])this.y_0)[(Integer)this.y_6] = var3;
         this.y_6 = ((Integer)this.y_6 + 1) % 20;
         this.L_0 = Math.min(20, (Integer)this.L_0 + 1);
      }
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int var4 = this.y(class09170.N(var1.y(), var2.y()), var3);
      int var5 = this.y(var2.R() - var1.R(), var3);
      int var6 = this.N(class09170.N(var1.y(), var2.y()), var2.R() - var1.R());
      return (var4 != (Integer)this.y_3 || var5 != (Integer)this.y_4)
         && var6 != (Integer)this.y_5
         && !this.N(var4, var5)
         && !this.L(var6)
         && (var5 == 0 || Math.abs(var4) != Math.abs(var5));
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, int var6, int var7, boolean var8) {
      float var9 = class09170.N(var1.y(), var2.y());
      float var10 = var2.R() - var1.R();
      float var11 = this.N((float)var6 * var5, var9, var5);
      float var12 = var8 ? 0.0F : this.N((float)var7 * var5, var10, var5);
      return new class11499(var1.y() + this.N(var11, var3), class04995.N(var1.R() + this.N(var12, var3), -90.0F, 90.0F));
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * 1.15F) {
         return var1;
      } else {
         float var4 = Math.max(var3, Math.abs(var2) - var3 * 0.35F);
         return class04995.N(var1, -var4, var4);
      }
   }

   private int N(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1 : -1;
      } else {
         return Math.random() > 0.5 ? 1 : -1;
      }
   }

   private int N(int var1) {
      if (var1 != Integer.MIN_VALUE && (Integer)this.L_0 != 0) {
         int var2 = ((int[])this.y_0)[((Integer)this.y_6 - 1 + 20) % 20];
         return Math.abs(var1 - var2);
      } else {
         return Integer.MIN_VALUE;
      }
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F && Math.abs(var2) <= 1.0E-4F
         ? Integer.MIN_VALUE
         : (int)Math.round(Math.toDegrees(Math.atan2((double)Math.abs(var2), (double)Math.abs(var1))) % 90.0 * 10.0);
   }

   private static void R() {
      N_0 = 20;
   }
}
