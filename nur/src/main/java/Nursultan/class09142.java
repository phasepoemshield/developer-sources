package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09142 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public static Object y_0;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;

   private boolean L(long var1) {
      if (!(Boolean)this.u_3) {
         return false;
      } else if (var1 <= (Long)this.u_2 && (Integer)this.L_4 < (Integer)this.L_5) {
         return true;
      } else {
         this.u_3 = false;
         return false;
      }
   }

   public class09142() {
      this.u();
      this.N_0 = new class09166();
      this.N_1 = new float[8];
      this.N_2 = new float[8];
      this.N_3 = new float[8];
      this.N_4 = new float[8];
      this.N_5 = new float[8];
      this.L_0 = new float[8];
      this.L_1 = new float[8];
      this.L_2 = new float[8];
      this.L_3 = Integer.MIN_VALUE;
   }

   static {
      Z();
   }

   private static void Z() {
      y_0 = 8;
   }

   private void u() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = 0;
         this.L_4 = 0;
         this.L_5 = 0;
         this.L_6 = 0;
         this.L_7 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0;
         this.u_1 = 0;
         this.u_2 = 0L;
         this.u_3 = false;
      }
   }

   private float y(float var1, double var2, boolean var4) {
      if (var2 <= 1.0E-5) {
         return Math.max(var4 ? 0.35F : 0.25F, var1);
      } else {
         float var5 = var4 ? 0.35F : 0.25F;
         return (float)Math.max(1, Math.round(Math.max(var5, var1) / (float)var2)) * (float)var2;
      }
   }

   private float y(int var1, float var2) {
      if (var1 == 0) {
         return ((class09166)this.N_0).y(0.18F, 0.42F);
      } else if (var1 == 1) {
         return ((class09166)this.N_0).y(0.38F, 0.68F);
      } else {
         return var1 >= (Integer)this.L_5 - 2
            ? ((class09166)this.N_0).y(0.86F, 1.18F)
            : ((class09166)this.N_0).y(0.58F, 1.02F) + (float)Math.sin((double)var2 * Math.PI * 1.25) * ((class09166)this.N_0).y(-0.1F, 0.16F);
      }
   }

   private float y(float var1, float var2, float var3, float var4, boolean var5) {
      float var6 = Math.abs(var3) > var4 ? var3 : var2;
      if (Math.abs(var6) <= 1.0E-4F) {
         float var9 = var4 * (var5 ? 2.4F : 0.9F);
         return class04995.N(var1, -var9, var9);
      } else {
         if (Math.signum(var1) != Math.signum(var6) && Math.abs(var6) > var4 * 1.6F) {
            var1 = Math.signum(var6) * Math.abs(var1);
         }

         float var7 = var4 * ((class09166)this.N_0).y(var5 ? 1.8F : 0.75F, var5 ? 5.6F : 2.1F);
         float var8 = Math.abs(var6) + var7;
         return class04995.N(var1, -var8, var8);
      }
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private float N(float var1, float var2, float var3) {
      float var4 = Math.abs(var3) > 1.0E-4F ? var3 : var2;
      return Math.abs(var4) <= 1.0E-4F ? var1 : Math.signum(var4) * Math.abs(var1);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var8 && !var9 && !var1.N(var2, var4)) {
         float var10 = class09170.N(var3.y(), var4.y());
         float var11 = var4.R() - var3.R();

         for (float var16 : new float[]{0.74F, 0.52F, 0.31F, 0.16F}) {
            class11499 var17 = new class11499(var3.y() + this.N(var10 * var16, var6), class04995.N(var3.R() + this.N(var11 * var16, var6), -90.0F, 90.0F));
            if (var1.N(var2, var17)) {
               return var17;
            }
         }

         return var1.N(var2, var3) ? var3 : var5;
      } else {
         return var4;
      }
   }

   private void N(class11499 var1, class11499 var2, class11499 var3, double var4, boolean var6, boolean var7, boolean var8, long var9) {
      float var11 = (float)Math.max(var4, 0.035F);
      float var12 = class09170.N(var1.y(), var3.y());
      float var13 = var3.R() - var1.R();
      float var14 = class09170.N(var1.y(), var2.y());
      float var15 = var2.R() - var1.R();
      float var16 = this.N(var12, var14);
      float var17 = this.N(var13, var15);
      this.L_4 = 0;
      this.L_5 = var8 ? ((class09166)this.N_0).N(5, 7) : (var6 ? ((class09166)this.N_0).N(5, 8) : ((class09166)this.N_0).N(4, 7));
      this.u_2 = var9 + (long)((class09166)this.N_0).y(var7 ? 118.0F : 145.0F, var8 ? 230.0F : (var6 ? 245.0F : 285.0F));
      this.L_6 = 0;
      this.L_7 = 0;
      this.u_0 = 0;
      this.u_1 = 0;

      for (int var18 = 0; var18 < (Integer)this.L_5; var18++) {
         float var19 = (float)var18 / (float)Math.max(1, (Integer)this.L_5 - 1);
         float var20 = (float)Math.sin((double)var19 * Math.PI);
         float var21 = var18 == 0 ? ((class09166)this.N_0).y(0.12F, var8 ? 0.18F : (var6 ? 0.32F : 0.24F)) : 0.0F;
         float var22 = var18 >= (Integer)this.L_5 - 2 ? ((class09166)this.N_0).y(0.08F, 0.22F) : 0.0F;
         if (var8) {
            float var23 = this.N(var18, var19);
            float var24 = this.y(var18, var19);
            ((float[])this.N_1)[var18] = class04995.N(var23 + var20 * ((class09166)this.N_0).y(-0.08F, 0.16F) + var21 - var22 * 0.72F, 0.58F, 1.22F);
            ((float[])this.N_2)[var18] = class04995.N(
               var24 + var20 * ((class09166)this.N_0).y(-0.06F, 0.14F) - (var18 == 0 ? ((class09166)this.N_0).y(0.04F, 0.12F) : 0.0F), 0.28F, 1.16F
            );
         } else {
            ((float[])this.N_1)[var18] = class04995.N(
               ((class09166)this.N_0).y(0.72F, 1.08F) + var20 * ((class09166)this.N_0).y(-0.18F, 0.28F) + var21 - var22, 0.48F, 1.34F
            );
            ((float[])this.N_2)[var18] = class04995.N(
               ((class09166)this.N_0).y(0.54F, 0.98F)
                  + var20 * ((class09166)this.N_0).y(-0.12F, 0.24F)
                  - (var18 == 0 ? ((class09166)this.N_0).y(0.1F, 0.24F) : 0.0F),
               0.34F,
               1.22F
            );
         }

         if (var18 > 0 && Math.abs(((float[])this.N_1)[var18] - ((float[])this.N_1)[var18 - 1]) < 0.045F) {
            ((float[])this.N_1)[var18] = ((float[])this.N_1)[var18] + (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.05F, 0.16F);
         }

         if (var18 > 0 && Math.abs(((float[])this.N_2)[var18] - ((float[])this.N_2)[var18 - 1]) < 0.035F) {
            ((float[])this.N_2)[var18] = ((float[])this.N_2)[var18] + (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.04F, 0.12F);
         }

         ((float[])this.N_3)[var18] = var16 * var11 * ((class09166)this.N_0).y(var8 ? 0.16F : (var6 ? 0.42F : 0.25F), var8 ? 1.45F : (var6 ? 2.85F : 1.95F));
         ((float[])this.N_4)[var18] = var17 * var11 * ((class09166)this.N_0).y(var8 ? 0.14F : 0.12F, var8 ? 0.95F : (var6 ? 1.08F : 0.72F));
         if (var18 > 0 && ((class09166)this.N_0).N(0.34F)) {
            ((float[])this.N_3)[var18] = -((float[])this.N_3)[var18] * ((class09166)this.N_0).y(0.35F, 0.86F);
         }

         if (var18 > 1 && ((class09166)this.N_0).N(0.28F)) {
            ((float[])this.N_4)[var18] = -((float[])this.N_4)[var18] * ((class09166)this.N_0).y(0.25F, 0.72F);
         }

         if (var8) {
            this.N(var18, var19, var16, var17, var11);
         }

         if (var8) {
            ((float[])this.N_5)[var18] = ((class09166)this.N_0).y(var18 == 0 ? 0.92F : 0.78F, var18 == 0 ? 1.22F : 1.12F);
            ((float[])this.L_0)[var18] = ((class09166)this.N_0).y(var18 <= 1 ? 0.62F : 0.78F, var18 <= 1 ? 0.92F : 1.16F);
         } else {
            ((float[])this.N_5)[var18] = ((class09166)this.N_0).y(0.82F, var6 ? 1.44F : 1.26F);
            ((float[])this.L_0)[var18] = ((class09166)this.N_0).y(0.68F, var6 ? 1.22F : 1.08F);
         }
      }

      this.u_3 = true;
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

   public void N() {
      this.L_3 = Integer.MIN_VALUE;
      this.L_4 = 0;
      this.L_5 = 0;
      this.L_6 = 0;
      this.L_7 = 0;
      this.u_0 = 0;
      this.u_1 = 0;
      this.u_2 = 0L;
      this.u_3 = false;
      ((class09166)this.N_0).y();

      for (int var1 = 0; var1 < 8; var1++) {
         ((float[])this.N_1)[var1] = 1.0F;
         ((float[])this.N_2)[var1] = 1.0F;
         ((float[])this.N_3)[var1] = 0.0F;
         ((float[])this.N_4)[var1] = 0.0F;
         ((float[])this.N_5)[var1] = 1.0F;
         ((float[])this.L_0)[var1] = 1.0F;
         ((float[])this.L_1)[var1] = 0.0F;
         ((float[])this.L_2)[var1] = 0.0F;
      }
   }

   private float N(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(var2 <= 1.0E-5)) {
         float var5 = (float)var2;
         int var6 = Math.round(var1 / var5);
         if (var6 == 0) {
            var6 = var1 > 0.0F ? 1 : -1;
         }

         int var7 = var4 ? (Integer)this.L_6 : (Integer)this.L_7;
         int var8 = var4 ? (Integer)this.u_0 : (Integer)this.u_1;
         int var9 = var6 - var7;
         if (var6 == var7 || var9 == var8 && Math.abs(var6) > 1) {
            var6 += (var6 > 0 ? 1 : -1) * ((class09166)this.N_0).N(1, var4 ? 3 : 2);
            if (var6 == 0) {
               var6 = var7 >= 0 ? 1 : -1;
            }

            var9 = var6 - var7;
         }

         if (var4) {
            this.L_6 = var6;
            this.u_0 = var9;
         } else {
            this.L_7 = var6;
            this.u_1 = var9;
         }

         return (float)var6 * var5;
      } else {
         return var1;
      }
   }

   public class09151 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      float var11,
      float var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         long var16 = System.currentTimeMillis();
         this.N(var1, var3, var4, var5, var6, var13, var14, var15, var16);
         if (!this.L(var16)) {
            return class09151.N(var5, var11, var12);
         } else {
            int var10002 = (Integer)this.L_4;
            this.L_4 = var10002 + 1;
            int var18 = var10002;
            float var19 = (float)Math.max(var6, 0.035F);
            float var20 = class09170.N(var3.y(), var5.y());
            float var21 = var8 ? 0.0F : var5.R() - var3.R();
            if (Math.abs(var20) <= var19 * 0.35F && Math.abs(var21) <= var19 * 0.25F) {
               if (!var15 || var8) {
                  return class09151.N(var5, var11, var12);
               }

               float var22 = class09170.N(var3.y(), var4.y());
               float var23 = var4.R() - var3.R();
               var20 += this.N(var22, var20) * var19 * ((class09166)this.N_0).y(0.32F, 0.86F);
               var21 += this.N(var23, var21) * var19 * ((class09166)this.N_0).y(0.24F, 0.62F);
            }

            float var31 = class09170.N(var3.y(), var4.y());
            float var32 = var8 ? 0.0F : var4.R() - var3.R();
            float var24 = var20 * ((float[])this.N_1)[var18] + this.N(((float[])this.N_3)[var18], var20, var31);
            float var25 = var8 ? 0.0F : var21 * ((float[])this.N_2)[var18] + this.N(((float[])this.N_4)[var18], var21, var32);
            if (var15) {
               var24 += ((float[])this.L_1)[var18] + this.N(var32, var19, true, var18);
               var25 += var8 ? 0.0F : ((float[])this.L_2)[var18] + this.N(var31, var19, false, var18);
               var24 = this.N(var24, var20, var31, var19, true);
               var25 = var8 ? 0.0F : this.N(var25, var21, var32, var19, false);
            }

            var24 = this.y(var24, var20, var31, var19, true);
            var25 = var8 ? 0.0F : this.y(var25, var21, var32, var19, false);
            var24 = this.N(var24, var6, true);
            var25 = var8 ? 0.0F : this.N(var25, var6, false);
            class11499 var26 = new class11499(var3.y() + var24, class04995.N(var3.R() + var25, -90.0F, 90.0F));
            var26 = this.N(var1, var2, var5, var26, var3, var6, var9, var10);
            float var27 = Math.abs(class09170.N(var3.y(), var26.y()));
            float var28 = Math.abs(var26.R() - var3.R());
            float var29 = this.y(Math.max(var27, var11 * ((float[])this.N_5)[var18]), var6, true);
            float var30 = this.y(Math.max(var28, var12 * ((float[])this.L_0)[var18]), var6, false);
            return new class09151(var26, var29, var30, true);
         }
      } else {
         return class09151.N(var5, var11, var12);
      }
   }

   private float N(int var1, float var2) {
      if (var1 == 0) {
         return ((class09166)this.N_0).y(0.82F, 1.08F);
      } else if (var1 == 1) {
         return ((class09166)this.N_0).y(0.54F, 0.82F);
      } else {
         return var1 >= (Integer)this.L_5 - 2
            ? ((class09166)this.N_0).y(0.74F, 1.04F)
            : ((class09166)this.N_0).y(0.68F, 1.12F) + (float)Math.sin((double)var2 * Math.PI * 1.7) * ((class09166)this.N_0).y(-0.12F, 0.18F);
      }
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5) {
      int var6 = this.y(var1, var4);
      int var7 = this.y(var2, var4);
      int var8 = var5 ? (Integer)this.L_6 : (Integer)this.L_7;
      int var9 = var5 ? (Integer)this.u_0 : (Integer)this.u_1;
      int var10 = var6 - var8;
      if (var6 == var7 || var6 == var8 || var10 == var9) {
         float var11 = this.N(var3, var1);
         float var12 = var4 * ((class09166)this.N_0).y(var5 ? 0.55F : 0.28F, var5 ? 1.85F : 1.08F);
         var1 += var11 * var12;
      }

      return var1;
   }

   private void N(class11087 var1, class11499 var2, class11499 var3, class11499 var4, double var5, boolean var7, boolean var8, boolean var9, long var10) {
      int var12 = var1.u();
      if ((Integer)this.L_3 == Integer.MIN_VALUE) {
         this.L_3 = var12;
         if (var12 <= 0 || var1.y().y() > 95L) {
            return;
         }
      } else {
         if (var12 == (Integer)this.L_3) {
            return;
         }

         this.L_3 = var12;
      }

      if (var1.y().y() <= 95L) {
         this.N(var2, var3, var4, var5, var7, var8, var9, var10);
      }
   }

   private void N(int var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sin((double)var2 * Math.PI);
      float var7 = var1 >= (Integer)this.L_5 - 2 ? -1.0F : 1.0F;
      float var8 = var1 != 1 && var1 != (Integer)this.L_5 - 1 ? var3 : -var3;
      float var9 = var1 <= 1 ? -var4 : var4;
      ((float[])this.L_1)[var1] = var8 * var5 * ((class09166)this.N_0).y(0.18F, 1.65F) * (0.42F + var6 * 0.78F) * var7;
      ((float[])this.L_2)[var1] = var9 * var5 * ((class09166)this.N_0).y(0.12F, 0.95F) * (0.28F + var6 * 0.9F);
      if (var1 > 0 && Math.abs(((float[])this.L_1)[var1] - ((float[])this.L_1)[var1 - 1]) < var5 * 0.28F) {
         ((float[])this.L_1)[var1] = ((float[])this.L_1)[var1] + var8 * var5 * ((class09166)this.N_0).y(0.32F, 0.9F);
      }

      if (var1 > 0 && Math.abs(((float[])this.L_2)[var1] - ((float[])this.L_2)[var1 - 1]) < var5 * 0.18F) {
         ((float[])this.L_2)[var1] = ((float[])this.L_2)[var1] + var9 * var5 * ((class09166)this.N_0).y(0.2F, 0.62F);
      }
   }

   private float N(float var1, float var2, boolean var3, int var4) {
      if (Math.abs(var1) <= var2 * 0.7F) {
         return 0.0F;
      } else {
         float var5 = Math.signum(var1);
         float var6 = var3 ? (var4 <= 1 ? 0.46F : 0.18F) : (var4 <= 1 ? -0.32F : 0.28F);
         float var7 = var3 ? 0.52F : 0.34F;
         return var5 * var2 * var7 * var6;
      }
   }

   private float N(float var1, float var2) {
      if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else {
         return (float)((class09166)this.N_0).N();
      }
   }
}
