package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09161 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
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
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public static Object i_0;

   private int L() {
      return (Boolean)this.N_4 && (Integer)this.y_7 != 0 ? ((int[])this.L_2)[((Integer)this.y_6 - 1 + 18) % 18] : 0;
   }

   private int M() {
      return (Boolean)this.N_4 && (Integer)this.y_7 != 0 ? ((int[])this.L_1)[((Integer)this.y_6 - 1 + 18) % 18] : 0;
   }

   public class09161() {
      this.R();
      this.u_0 = new class09166();
      this.u_1 = new int[18];
      this.u_2 = new int[18];
      this.u_3 = new int[18];
      this.L_0 = new int[18];
      this.L_1 = new int[18];
      this.L_2 = new int[18];
      this.L_3 = new int[18];
      this.L_4 = new int[18];
      this.L_5 = new int[18];
      this.y_0 = new int[18];
   }

   static {
      z();
   }

   private static void z() {
      i_0 = 18;
   }

   private boolean y(int var1, boolean var2) {
      if (!(Boolean)this.N_4) {
         return false;
      } else {
         int var3 = var2 ? (Integer)this.N_2 : (Integer)this.N_3;
         int var4 = var1 - var3;
         int var5 = this.N(var2);
         if (var1 != var3 && (var4 != var5 || Math.abs(var4) > 2)) {
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (int var9 = 0; var9 < (Integer)this.y_7; var9++) {
               int var10 = var2 ? ((int[])this.L_3)[var9] : ((int[])this.L_4)[var9];
               int var11 = var2 ? ((int[])this.L_5)[var9] : ((int[])this.y_0)[var9];
               if (var10 == var1) {
                  var6++;
               }

               if (Math.abs(var10) == Math.abs(var1)) {
                  var7++;
               }

               if (var11 == var4 && var4 != 0) {
                  var8++;
               }
            }

            if (var6 <= 0 && var7 <= 1 && var8 <= 0) {
               if ((Integer)this.y_7 >= 4) {
                  int var15 = ((Integer)this.y_6 - 1 + 18) % 18;
                  int var16 = ((Integer)this.y_6 - 2 + 18) % 18;
                  int var17 = var2 ? ((int[])this.L_3)[var15] : ((int[])this.L_4)[var15];
                  int var12 = var2 ? ((int[])this.L_3)[var16] : ((int[])this.L_4)[var16];
                  int var13 = var1 - var17;
                  int var14 = var17 - var12;
                  if (var13 == var14) {
                     return true;
                  }
               }

               return false;
            } else {
               return true;
            }
         } else {
            return true;
         }
      }
   }

   private float y(float var1, double var2) {
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

   private void N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.y_1) {
         float var6 = (var4 ? 0.58F : 0.0F) + (var5 ? 0.42F : 0.0F);
         this.y_2 = ((class09166)this.u_0).y(-var3 * (0.28F + var6 * 0.22F), var3 * (0.36F + var6 * 0.36F));
         this.y_3 = ((class09166)this.u_0).y(-var3 * (0.14F + var6 * 0.12F), var3 * (0.18F + var6 * 0.18F));
         this.y_4 = ((class09166)this.u_0).y(-0.083728F - var6 * 0.027362F, 0.117263F + var6 * 0.043728F);
         this.y_5 = ((class09166)this.u_0).y(-0.063728F - var6 * 0.018273F, 0.092736F + var6 * 0.027362F);
         this.y_1 = var1 + (long)((class09166)this.u_0).y(var4 ? 28.372639F : 42.736282F, var5 ? 88.82736F : 136.37263F);
      }
   }

   public void N() {
      this.y_1 = 0L;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = 0.0F;
      this.y_5 = 0.0F;
      this.y_6 = 0;
      this.y_7 = 0;
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = false;

      for (int var1 = 0; var1 < 18; var1++) {
         ((int[])this.u_1)[var1] = 0;
         ((int[])this.u_2)[var1] = 0;
         ((int[])this.u_3)[var1] = 0;
         ((int[])this.L_0)[var1] = 0;
         ((int[])this.L_1)[var1] = 0;
         ((int[])this.L_2)[var1] = 0;
         ((int[])this.L_3)[var1] = 0;
         ((int[])this.L_4)[var1] = 0;
         ((int[])this.L_5)[var1] = 0;
         ((int[])this.y_0)[var1] = 0;
      }

      ((class09166)this.u_0).y();
   }

   private int N(boolean var1) {
      if ((Boolean)this.N_4 && (Integer)this.y_7 != 0) {
         int var2 = ((Integer)this.y_6 - 1 + 18) % 18;
         return var1 ? ((int[])this.L_5)[var2] : ((int[])this.y_0)[var2];
      } else {
         return 0;
      }
   }

   private int N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int var4 = Math.round(var1 / (float)var2);
         return var4 == 0 ? (var1 > 0.0F ? 1 : -1) : var4;
      } else {
         return 0;
      }
   }

   private int N(int var1, int var2, boolean var3) {
      if (var1 > var2) {
         return ((class09166)this.u_0).N(0.68F) ? 1 : -1;
      } else if (var1 < var2) {
         return ((class09166)this.u_0).N(0.68F) ? -1 : 1;
      } else {
         int var4 = this.N(var3);
         return var4 != 0 ? -Integer.signum(var4) : ((class09166)this.u_0).N();
      }
   }

   private void N(float var1, float var2, float var3, float var4, double var5, float var7) {
      int var8 = this.N(var1, var5);
      int var9 = this.N(var2, var5);
      int var10 = (Boolean)this.N_4 ? var8 - (Integer)this.N_0 : 0;
      int var11 = (Boolean)this.N_4 ? var9 - (Integer)this.N_1 : 0;
      int var12 = Math.round(var3 / var7);
      int var13 = Math.round(var4 / var7);
      int var14 = (Boolean)this.N_4 ? var12 - (Integer)this.N_2 : 0;
      int var15 = (Boolean)this.N_4 ? var13 - (Integer)this.N_3 : 0;
      ((int[])this.u_1)[(Integer)this.y_6] = (var8 + 32768) * 65537 ^ var9 + 32768;
      ((int[])this.u_2)[(Integer)this.y_6] = (var12 + 32768) * 65537 ^ var13 + 32768;
      ((int[])this.u_3)[(Integer)this.y_6] = var8;
      ((int[])this.L_0)[(Integer)this.y_6] = var9;
      ((int[])this.L_1)[(Integer)this.y_6] = var10;
      ((int[])this.L_2)[(Integer)this.y_6] = var11;
      ((int[])this.L_3)[(Integer)this.y_6] = var12;
      ((int[])this.L_4)[(Integer)this.y_6] = var13;
      ((int[])this.L_5)[(Integer)this.y_6] = var14;
      ((int[])this.y_0)[(Integer)this.y_6] = var15;
      this.y_6 = ((Integer)this.y_6 + 1) % 18;
      this.y_7 = Math.min(18, (Integer)this.y_7 + 1);
      this.N_0 = var8;
      this.N_1 = var9;
      this.N_2 = var12;
      this.N_3 = var13;
      this.N_4 = true;
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      int var5 = Math.max(1, Math.round(var1 / var2));
      int var6 = var3 ? (Integer)this.N_2 : (Integer)this.N_3;

      for (int var7 = 0; var7 < 7 && this.y(var5, var3); var7++) {
         int var8 = this.N(var5, var6, var3);
         int var9 = var3 ? (var4 ? 9 : 6) : (var4 ? 6 : 4);
         var5 += var8 * ((class09166)this.u_0).N(1 + var7 / 2, var9);
         var5 = Math.max(1, var5);
      }

      return (float)var5 * var2;
   }

   private boolean N(float var1, float var2, double var3, boolean var5) {
      int var6 = this.N(var1, var3);
      int var7 = var5 ? 0 : this.N(var2, var3);
      if (var6 == 0 && var7 == 0) {
         return false;
      } else {
         int var8 = (Boolean)this.N_4 ? var6 - (Integer)this.N_0 : 0;
         int var9 = (Boolean)this.N_4 ? var7 - (Integer)this.N_1 : 0;
         if ((Boolean)this.N_4 && var6 == (Integer)this.N_0 && var7 == (Integer)this.N_1) {
            return true;
         } else if ((Boolean)this.N_4 && var8 == this.M() && var9 == this.L() && Math.abs(var6) + Math.abs(var7) > 1) {
            return true;
         } else {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;

            for (int var13 = 0; var13 < (Integer)this.y_7; var13++) {
               if (((int[])this.u_3)[var13] == var6 && ((int[])this.L_0)[var13] == var7) {
                  var10++;
               }

               if (((int[])this.L_1)[var13] == var8 && ((int[])this.L_2)[var13] == var9 && (var8 != 0 || var9 != 0)) {
                  var11++;
               }

               if (Math.abs(((int[])this.u_3)[var13]) == Math.abs(var6) && Math.abs(((int[])this.L_0)[var13]) == Math.abs(var7)) {
                  var12++;
               }
            }

            if (var10 <= 0 && var11 <= 0 && var12 <= 1) {
               if ((Integer)this.y_7 < 4) {
                  return false;
               } else {
                  int var19 = ((Integer)this.y_6 - 1 + 18) % 18;
                  int var14 = ((Integer)this.y_6 - 2 + 18) % 18;
                  int var15 = var6 - ((int[])this.u_3)[var19];
                  int var16 = var7 - ((int[])this.L_0)[var19];
                  int var17 = ((int[])this.u_3)[var19] - ((int[])this.u_3)[var14];
                  int var18 = ((int[])this.L_0)[var19] - ((int[])this.L_0)[var14];
                  return var15 == var17 && var16 == var18 && (var15 != 0 || var16 != 0);
               }
            } else {
               return true;
            }
         }
      }
   }

   public class09131 N(
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
      float var13,
      float var14
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float var15 = (float)Math.max(var6, 0.035F);
         this.N(System.currentTimeMillis(), var15, var11, var12);
         float var16 = class09170.N(var3.y(), var5.y());
         float var17 = var8 ? 0.0F : var5.R() - var3.R();
         float var18 = class09170.N(var3.y(), var4.y());
         float var19 = var4.R() - var3.R();
         float var20 = (Float)this.y_2 + ((class09166)this.u_0).N(true, var15 * (0.263728F + (var11 ? 0.327362F : 0.0F)));
         float var21 = var8 ? 0.0F : (Float)this.y_3 + ((class09166)this.u_0).N(false, var15 * (0.127362F + (var12 ? 0.172638F : 0.0F)));
         var16 = this.N(var16 + var20, var18, var15, true, var11 || var12);
         var17 = var8 ? 0.0F : this.N(var17 + var21, var19, var15, false, var11 || var12);
         var16 = this.N(var16, var6, true);
         var17 = var8 ? 0.0F : this.N(var17, var6, false);
         class09163 var22 = this.N(var16, var17, var18, var19, var6, var8, var11 || var12);
         var16 = var22.N();
         var17 = var22.y();
         class11499 var23 = new class11499(var3.y() + var16, class04995.N(var3.R() + var17, -90.0F, 90.0F));
         if (var9 && !var10 && var1 != null && !var1.N(var2, var23)) {
            var23 = this.N(var1, var2, var3, var5, var16, var17, var6, var8);
            var16 = class09170.N(var3.y(), var23.y());
            var17 = var8 ? 0.0F : var23.R() - var3.R();
         }

         float var24 = Math.max(0.004F, var15 * 0.183728F);
         float var25 = this.N(Math.max(Math.abs(var16) + var24, var13 * (1.0F + (Float)this.y_4)), var24, true, var11 || var12);
         float var26 = this.N(Math.max(Math.abs(var17) + var24, var14 * (1.0F + (Float)this.y_5)), var24, false, var11 || var12);
         this.N(var16, var17, var25, var26, var6, var24);
         return new class09131(var23, var25, var26);
      } else {
         return new class09131(var5, var13, var14);
      }
   }

   private class09163 N(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8) {
      if (var5 <= 1.0E-5) {
         return new class09163(var1, var2);
      } else {
         float var9 = var1;
         float var10 = var7 ? 0.0F : var2;

         for (int var11 = 0; var11 < 8 && this.N(var9, var10, var5, var7); var11++) {
            float var12 = this.N(var3, var9);
            float var13 = var7 ? 0.0F : this.N(var4, var10);
            float var14 = var12 * (float)var5 * ((class09166)this.u_0).y(0.75F + (float)var11 * 0.24F, var8 ? 4.8F : 3.2F);
            float var15 = var7 ? 0.0F : var13 * (float)var5 * ((class09166)this.u_0).y(0.38F + (float)var11 * 0.12F, var8 ? 2.8F : 1.75F);
            if ((var11 & 1) == 1 && !var7) {
               var15 = -var15 * ((class09166)this.u_0).y(0.55F, 1.15F);
            }

            if (var11 >= 3 && ((class09166)this.u_0).N(0.42F)) {
               var14 = -var14 * ((class09166)this.u_0).y(0.35F, 0.8F);
            }

            var9 = this.N(var9 + var14, var3, (float)Math.max(var5, 0.035F), true, var8);
            var10 = var7 ? 0.0F : this.N(var10 + var15, var4, (float)Math.max(var5, 0.035F), false, var8);
            var9 = this.y(var9, var5);
            var10 = var7 ? 0.0F : this.y(var10, var5);
         }

         return new class09163(var9, var10);
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         int var5 = Math.round(var1 / (float)var2);
         if (var5 == 0) {
            var5 = var1 > 0.0F ? 1 : -1;
         }

         int var6 = var4 ? (Integer)this.N_0 : (Integer)this.N_1;
         if (var5 == var6 && Math.abs(var5) > 1 || this.N(var5, var4) > 2) {
            int var7 = var5 == 0 ? ((class09166)this.u_0).N() : (var5 > 0 ? 1 : -1);
            var5 += var7 * ((class09166)this.u_0).N(1, var4 ? 4 : 3);
            if (var5 == 0) {
               var5 = var7;
            }
         }

         return (float)var5 * (float)var2;
      } else {
         return var1;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         float var7 = var3 * (var4 ? 4.372638F : 2.172638F);
         return class04995.N(var1, -var7, var7);
      } else {
         float var6 = var3 * (var4 ? 2.827362F : 1.372638F) * (var5 ? 1.427362F : 1.0F);
         return class04995.N(var1, -Math.abs(var2) - var6, Math.abs(var2) + var6);
      }
   }

   private float N(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return (float)((class09166)this.u_0).N();
      }
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, double var7, boolean var9) {
      for (float var14 : new float[]{0.82F, 0.64F, 0.46F, 0.28F, -0.22F}) {
         class11499 var15 = new class11499(
            var3.y() + this.y(var5 * var14, var7), class04995.N(var3.R() + (var9 ? 0.0F : this.y(var6 * var14, var7)), -90.0F, 90.0F)
         );
         if (var1.N(var2, var15)) {
            return var15;
         }
      }

      return var4;
   }

   private int N(int var1, boolean var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < (Integer)this.y_7; var4++) {
         int var5 = var2 ? ((int[])this.u_3)[var4] : ((int[])this.L_0)[var4];
         if (var5 == var1 || Math.abs(var5) == Math.abs(var1)) {
            var3++;
         }
      }

      return var3;
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0L;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
         this.y_5 = 0.0F;
         this.y_6 = 0;
         this.y_7 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = false;
      }
   }
}
