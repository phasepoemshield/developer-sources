package Nursultan;

import java.util.Arrays;
import minecraft.class04995;
import minecraft.class07438;

public class class09157 {
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
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public static Object u_0;

   private void L(int var1, int var2) {
      int var3 = (Boolean)this.y_3 ? var1 - (Integer)this.N_2 : 0;
      int var4 = (Boolean)this.y_3 ? var2 - (Integer)this.N_3 : 0;
      int var5 = (Boolean)this.y_3 ? var3 - (Integer)this.N_4 : 0;
      int var6 = (Boolean)this.y_3 ? var4 - (Integer)this.y_0 : 0;
      ((int[])this.L_1)[(Integer)this.N_0] = var1;
      ((int[])this.L_2)[(Integer)this.N_0] = var2;
      ((int[])this.L_3)[(Integer)this.N_0] = var3;
      ((int[])this.L_4)[(Integer)this.N_0] = var4;
      ((int[])this.L_5)[(Integer)this.N_0] = this.y(var1, var2);
      this.N_0 = ((Integer)this.N_0 + 1) % 34;
      this.N_1 = Math.min(34, (Integer)this.N_1 + 1);
      this.N_2 = var1;
      this.N_3 = var2;
      this.N_4 = var3;
      this.y_0 = var4;
      this.y_1 = var5;
      this.y_2 = var6;
      this.y_3 = true;
   }

   private float L() {
      if ((Integer)this.N_1 < 12) {
         return 0.0F;
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < (Integer)this.N_1; var7++) {
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = ((int[])this.L_5)[var7] != Integer.MIN_VALUE;
            int var13 = 0;

            for (int var8 = 0; var8 < var7; var8++) {
               if (((int[])this.L_1)[var7] == ((int[])this.L_1)[var8] && ((int[])this.L_2)[var7] == ((int[])this.L_2)[var8]) {
                  var9 = false;
               }

               if (Math.abs(((int[])this.L_1)[var7]) == Math.abs(((int[])this.L_1)[var8])
                  && Math.abs(((int[])this.L_2)[var7]) == Math.abs(((int[])this.L_2)[var8])) {
                  var10 = false;
               }

               if (((int[])this.L_3)[var7] == ((int[])this.L_3)[var8] && ((int[])this.L_4)[var7] == ((int[])this.L_4)[var8]) {
                  var11 = false;
               }

               if (((int[])this.L_5)[var7] == ((int[])this.L_5)[var8]) {
                  var12 = false;
               }
            }

            for (int var15 = 0; var15 < (Integer)this.N_1; var15++) {
               if (((int[])this.L_1)[var7] == ((int[])this.L_1)[var15] && ((int[])this.L_2)[var7] == ((int[])this.L_2)[var15]) {
                  var13++;
               }
            }

            if (((int[])this.L_3)[var7] == 0 && ((int[])this.L_4)[var7] == 0 && (((int[])this.L_1)[var7] != 0 || ((int[])this.L_2)[var7] != 0)) {
               var6++;
            }

            if (var9) {
               var1++;
            }

            if (var10) {
               var2++;
            }

            if (var11) {
               var3++;
            }

            if (var12) {
               var4++;
            }

            var5 = Math.max(var5, var13);
         }

         float var14 = 0.0F;
         if (var1 < Math.max(5, (Integer)this.N_1 / 4)) {
            var14 += 0.25F;
         }

         if (var2 < Math.max(4, (Integer)this.N_1 / 5)) {
            var14 += 0.18F;
         }

         if (var3 < Math.max(4, (Integer)this.N_1 / 5)) {
            var14 += 0.25F;
         }

         if (var4 < 3 && (Integer)this.N_1 >= 16) {
            var14 += 0.22F;
         }

         if ((float)var5 / (float)((Integer)this.N_1).intValue() > 0.24F) {
            var14 += 0.28F;
         }

         if ((float)var6 / (float)((Integer)this.N_1).intValue() > 0.34F) {
            var14 += 0.24F;
         }

         return var14;
      }
   }

   public class09157() {
      this.i();
      this.L_0 = new class09166();
      this.L_1 = new int[34];
      this.L_2 = new int[34];
      this.L_3 = new int[34];
      this.L_4 = new int[34];
      this.L_5 = new int[34];
   }

   static {
      Z();
   }

   private static void Z() {
      u_0 = 34;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = 0;
         this.N_3 = 0;
         this.N_4 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = false;
      }
   }

   private int i(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < (Integer)this.N_1; var3++) {
            if (((int[])this.L_5)[var3] == var1) {
               var2++;
            }
         }

         return var2;
      }
   }

   private int u(int var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < (Integer)this.N_1; var4++) {
         if (((int[])this.L_3)[var4] == var1 && ((int[])this.L_4)[var4] == var2) {
            var3++;
         }
      }

      return var3;
   }

   private int y(int var1, int var2) {
      return var1 == 0 && var2 == 0 ? Integer.MIN_VALUE : (int)Math.round(Math.toDegrees(Math.atan2((double)Math.abs(var2), (double)Math.abs(var1))) * 8.0);
   }

   public class11499 N(
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
      boolean var12
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float var14 = (float)Math.max(var6, 0.035F);
         float var15 = class09170.N(var3.y(), var5.y());
         float var16 = var8 ? 0.0F : var5.R() - var3.R();
         int var17 = this.N(var15, var14);
         int var18 = this.N(var16, var14);
         if (var17 == 0 && var18 == 0) {
            this.L(var17, var18);
            return var8 && var5.R() != var3.R() ? new class11499(var5.y(), var3.R()) : var5;
         } else {
            float var19 = this.N(var17, var18);
            float var20 = !var11 && !var12 ? 0.48F : 0.34F;
            class11499 var21 = var5;
            class11499 var13;
            if ((var19 >= var20 || ((class09166)this.L_0).N(var19 * (var11 ? 0.32F : 0.18F)))
               && (var13 = this.N(var1, var2, var3, var4, var5, var6, var14, var8, var9, var10, var11, var12, var17, var18, var19)) != null) {
               var21 = var13;
            }

            if (var8 && var21.R() != var3.R()) {
               var21 = new class11499(var21.y(), var3.R());
            }

            this.L(this.N(class09170.N(var3.y(), var21.y()), var14), this.N(var21.R() - var3.R(), var14));
            return var21;
         }
      } else {
         return var5;
      }
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int var4 = this.N(class09170.N(var1.y(), var2.y()), var3);
      int var5 = this.N(var2.R() - var1.R(), var3);
      if (var4 == 0 && var5 == 0) {
         return false;
      } else {
         int var6 = (Boolean)this.y_3 ? var4 - (Integer)this.N_2 : 0;
         int var7 = (Boolean)this.y_3 ? var5 - (Integer)this.N_3 : 0;
         int var8 = this.y(var4, var5);
         return (!(Boolean)this.y_3 || var4 != (Integer)this.N_2 || var5 != (Integer)this.N_3)
            && (!(Boolean)this.y_3 || Math.abs(var4) != Math.abs((Integer)this.N_2) || Math.abs(var5) != Math.abs((Integer)this.N_3))
            && (!(Boolean)this.y_3 || var6 != (Integer)this.N_4 || var7 != (Integer)this.y_0)
            && this.N(var4, var5, false) == 0
            && this.N(var4, var5, true) <= 1
            && this.u(var6, var7) == 0
            && this.i(var8) <= 1;
      }
   }

   private static float N(class11499 var0, class11499 var1) {
      return class09170.N(var1.y(), var0.y());
   }

   public void N() {
      Arrays.fill((int[])this.L_1, 0);
      Arrays.fill((int[])this.L_2, 0);
      Arrays.fill((int[])this.L_3, 0);
      Arrays.fill((int[])this.L_4, 0);
      Arrays.fill((int[])this.L_5, Integer.MIN_VALUE);
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = 0;
      this.N_3 = 0;
      this.N_4 = 0;
      this.y_0 = 0;
      this.y_1 = 0;
      this.y_2 = 0;
      this.y_3 = false;
      ((class09166)this.L_0).y();
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return var3 != null && (!var4 || var5 || var1.N(var2, var3));
   }

   private int N(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1 : -1;
      } else {
         return ((class09166)this.L_0).N();
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, float var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         float var9 = var3 * (var4 ? 2.6F : 1.2F) * (0.55F + var5);
         return class04995.N(var1, -var9, var9);
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6 && Math.abs(var2) > var3 * 1.15F) {
            var1 = var6 * Math.abs(var1);
         }

         float var7 = var3 * ((class09166)this.L_0).y(var4 ? 0.35F : 0.22F, var4 ? 2.9F : 1.25F);
         float var8 = Math.max(var3, Math.abs(var2) + var7 * (Math.abs(var2) <= var3 * 3.0F ? 1.0F : -0.45F));
         return class04995.N(var1, -var8, var8);
      }
   }

   private int N(int var1, int var2, int var3) {
      if (var2 <= 0) {
         return 0;
      } else {
         int var5 = var1 < 6 ? var1 % 3 + 1 : ((class09166)this.L_0).N(1, var2);
         int var4 = var1 % 2 == 0 ? var3 : -var3;
         if (var1 >= 10 && ((class09166)this.L_0).N(0.38F)) {
            var4 *= -1;
         }

         return var5 * var4;
      }
   }

   private float N(int var1, int var2) {
      if (!(Boolean)this.y_3) {
         return 0.0F;
      } else {
         int var3 = var1 - (Integer)this.N_2;
         int var4 = var2 - (Integer)this.N_3;
         int var5 = var3 - (Integer)this.N_4;
         int var6 = var4 - (Integer)this.y_0;
         float var7 = 0.0F;
         if (var1 == (Integer)this.N_2 && var2 == (Integer)this.N_3) {
            var7 += 0.55F;
         }

         if (Math.abs(var1) == Math.abs((Integer)this.N_2) && Math.abs(var2) == Math.abs((Integer)this.N_3)) {
            var7 += 0.26F;
         }

         if (var3 == (Integer)this.N_4 && var4 == (Integer)this.y_0) {
            var7 += var3 == 0 && var4 == 0 ? 0.45F : 0.36F;
         }

         if (var5 == (Integer)this.y_1 && var6 == (Integer)this.y_2) {
            var7 += 0.22F;
         }

         var7 += Math.min(0.38F, (float)this.N(var1, var2, false) * 0.11F);
         var7 += Math.min(0.28F, (float)this.N(var1, var2, true) * 0.07F);
         var7 += Math.min(0.34F, (float)this.u(var3, var4) * 0.12F);
         return Math.min(1.6F, var7 + this.L());
      }
   }

   private int N(int var1, int var2, boolean var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < (Integer)this.N_1; var5++) {
         if (var3
            ? Math.abs(((int[])this.L_1)[var5]) == Math.abs(var1) && Math.abs(((int[])this.L_2)[var5]) == Math.abs(var2)
            : ((int[])this.L_1)[var5] == var1 && ((int[])this.L_2)[var5] == var2) {
            var4++;
         }
      }

      return var4;
   }

   private float N(float var1, double var2) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float var4 = Math.signum(var1);
         float var5 = Math.abs(var1) / (float)var2;
         int var6 = Math.max(1, (int)Math.floor((double)var5));
         int var7 = Math.max(var6, (int)Math.ceil((double)var5));
         int var8 = ((class09166)this.L_0).N(var5 - (float)var6) ? var7 : var6;
         return var4 * (float)var8 * (float)var2;
      } else {
         return var1;
      }
   }

   private class11499 N(class11499 var1, float var2, float var3, double var4, float var6, int var7, int var8, boolean var9, float var10) {
      float var11 = this.N((float)var7 * var6, var2, var6, true, var10);
      float var12 = var9 ? 0.0F : this.N((float)var8 * var6, var3, var6, false, var10);
      return new class11499(var1.y() + this.N(var11, var4), class04995.N(var1.R() + this.N(var12, var4), -90.0F, 90.0F));
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
      boolean var12,
      boolean var13,
      int var14,
      int var15,
      float var16
   ) {
      float var17 = class09170.N(var3.y(), var4.y());
      float var18 = var9 ? 0.0F : var4.R() - var3.R();
      int var19 = this.N(var14, var17);
      int var20 = var9 ? 0 : this.N(var15, var18);
      int var21 = Math.min(9, Math.max(2, Math.round(2.0F + var16 * 5.5F + (var12 ? 2.0F : 0.0F))));
      int var22 = var9 ? 0 : Math.min(5, Math.max(1, Math.round(1.0F + var16 * 3.0F + (var13 ? 1.0F : 0.0F))));

      for (int var23 = 0; var23 < 28; var23++) {
         int var26 = this.N(var23, var21, var19);
         int var25 = var9 ? 0 : this.N(var23 + 7, var22, var20);
         class11499 var24;
         if ((var26 != 0 || var25 != 0)
            && this.N(var1, var2, var24 = this.N(var3, var17, var18, var6, var8, var14 + var26, var9 ? 0 : var15 + var25, var9, var16), var10, var11)
            && this.N(var3, var24, var8)) {
            return var24;
         }
      }

      float var28 = ((class09166)this.L_0).N(true, var8 * class04995.N(var16 * 2.2F, 0.4F, 2.8F));
      float var29 = var9 ? 0.0F : ((class09166)this.L_0).N(false, var8 * class04995.N(var16, 0.18F, 1.2F));
      class11499 var30 = new class11499(
         var3.y() + this.N(N(var5, var3) + var28, var6), class04995.N(var3.R() + this.N((var9 ? 0.0F : var5.R() - var3.R()) + var29, var6), -90.0F, 90.0F)
      );
      return this.N(var1, var2, var30, var10, var11) && this.N(var3, var30, var8) ? var30 : null;
   }
}
