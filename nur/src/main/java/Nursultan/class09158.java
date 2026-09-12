package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09158 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public boolean i_init;
   public static Object R_0;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public boolean M_init;

   private void L(float var1, float var2, float var3) {
      int var4 = this.L(var1, var3);
      int var5 = this.L(var2, var3);
      int var6 = (Boolean)this.i_6 ? var4 - (Integer)this.i_2 : 0;
      int var7 = (Boolean)this.i_6 ? var5 - (Integer)this.i_3 : 0;
      ((int[])this.N_1)[(Integer)this.i_0] = var4;
      ((int[])this.N_2)[(Integer)this.i_0] = var5;
      ((int[])this.N_3)[(Integer)this.i_0] = var6;
      ((int[])this.N_4)[(Integer)this.i_0] = var7;
      this.i_0 = ((Integer)this.i_0 + 1) % 14;
      this.i_1 = Math.min(14, (Integer)this.i_1 + 1);
      this.i_2 = var4;
      this.i_3 = var5;
      this.i_4 = var6;
      this.i_5 = var7;
      this.i_6 = true;
   }

   private int L(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class09158() {
      this.i();
      this.N_0 = new class09166();
      this.N_1 = new int[14];
      this.N_2 = new int[14];
      this.N_3 = new int[14];
      this.N_4 = new int[14];
      this.M_3 = 1.0F;
      this.u_1 = 1.0F;
      this.u_3 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = 1.0F;
      this.y_3 = 1.0F;
   }

   static {
      u();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0L;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0L;
         this.L_1 = 0L;
         this.L_2 = 0L;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0L;
         this.M_1 = 0L;
         this.M_2 = 0L;
         this.M_3 = 0.0F;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0.0F;
         this.u_1 = 0.0F;
         this.u_2 = 0.0F;
         this.u_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0.0F;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0;
         this.i_1 = 0;
         this.i_2 = 0;
         this.i_3 = 0;
         this.i_4 = 0;
         this.i_5 = 0;
         this.i_6 = false;
      }
   }

   private static void u() {
      R_0 = 14;
   }

   private float y(long var1) {
      if (var1 >= (Long)this.L_0 && var1 < (Long)this.L_1) {
         float var3 = class04995.N((float)(var1 - (Long)this.L_0) / (float)Math.max(1L, (Long)this.L_1 - (Long)this.L_0), 0.0F, 1.0F);
         float var4 = (float)Math.sin((double)var3 * Math.PI);
         float var5 = 1.0F + (float)Math.sin((double)var3 * Math.PI * 2.0 + (double)((Float)this.y_0).floatValue()) * 0.22F;
         return class04995.N((float)Math.pow((double)var4, (double)((Float)this.u_3).floatValue()) * var5, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   private boolean y(float var1, float var2, float var3) {
      int var5 = this.L(var1, var3);
      int var6 = this.L(var2, var3);
      if (var5 == 0 && var6 == 0) {
         return false;
      } else {
         int var7 = (Boolean)this.i_6 ? var5 - (Integer)this.i_2 : 0;
         int var4 = (Boolean)this.i_6 ? var6 - (Integer)this.i_3 : 0;
         if ((Boolean)this.i_6 && var5 == (Integer)this.i_2 && var6 == (Integer)this.i_3) {
            return true;
         } else if ((Boolean)this.i_6
            && (var7 != 0 || var4 != 0)
            && var7 == (Integer)this.i_4
            && var4 == (Integer)this.i_5
            && Math.abs(var5) + Math.abs(var6) > 3) {
            return true;
         } else {
            for (int var9 = 0; var9 < (Integer)this.i_1; var9++) {
               if (((int[])this.N_1)[var9] == var5 && ((int[])this.N_2)[var9] == var6) {
                  return true;
               }

               if (((int[])this.N_3)[var9] == var7 && ((int[])this.N_4)[var9] == var4 && (var7 != 0 || var4 != 0)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private float y(float var1, float var2) {
      if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else {
         return (float)((class09166)this.N_0).N();
      }
   }

   private class09150 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      double var9,
      boolean var11,
      boolean var12,
      boolean var13
   ) {
      float var14 = var4;
      float var15 = var5;

      for (int var16 = 0; var16 < 8 && this.y(var14, var15, var8); var16++) {
         float var18 = this.y(var14, var6);
         float var19 = var11 ? this.y(var15, var7) : 0.0F;
         float var20 = 0.45F + (float)var16 * 0.22F;
         float var21 = var18 * var8 * ((class09166)this.N_0).y(0.28F, 1.18F + var20);
         float var17 = var11 ? var19 * var8 * ((class09166)this.N_0).y(0.22F, 0.86F + var20 * 0.55F) : 0.0F;
         if (var16 % 2 == 1 && var11) {
            var17 = -var17 * ((class09166)this.N_0).y(0.56F, 1.16F);
         }

         float var23 = this.N(this.N(var14 + var21, var6, var8, true, var13), var9);
         float var24 = var11 ? this.N(this.N(var15 + var17, var7, var8, false, var13), var9) : 0.0F;
         class11499 var25 = new class11499(var3.y() + var23, class04995.N(var3.R() + var24, -90.0F, 90.0F));
         if (!var12 || var13 || var2 == null || var1.N(var2, var25)) {
            var14 = var23;
            var15 = var24;
            break;
         }
      }

      return new class09150(var14, var15);
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      if (!var4) {
         return 0.0F;
      } else {
         return Math.abs(var1) > var3 * 0.35F
            ? var1
            : (Math.abs(var2) > var3 ? Math.signum(var2) * (Float)this.M_3 : (float)((class09166)this.N_0).N()) * var3 * ((class09166)this.N_0).y(0.45F, 1.75F);
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.L_2) {
         float var7 = (var4 ? 0.16F : 0.0F) + (var5 ? 0.1F : 0.0F) + (var6 ? 0.12F : 0.0F);
         float var8 = 0.9F - var7 * 0.04F;
         float var9 = 1.14F + var7 * 0.12F;
         float var10 = 0.86F - var7 * 0.035F;
         float var11 = 1.1F + var7 * 0.08F;
         this.y_1 = this.N((Float)this.y_1, var8, var9);
         this.y_2 = this.N((Float)this.y_2, var10, var11);
         if (((class09166)this.N_0).N(!var4 && !var6 ? 0.12F : 0.26F)) {
            this.y_3 = ((class09166)this.N_0).N(0.58F) ? ((class09166)this.N_0).y(1.08F, var4 ? 1.34F : 1.22F) : ((class09166)this.N_0).y(0.76F, 0.92F);
            this.M_0 = var1 + (long)((class09166)this.N_0).y(35.0F, var5 ? 92.0F : 120.0F);
         }

         this.L_2 = var1 + (long)((class09166)this.N_0).y(var4 ? 95.0F : 140.0F, var5 ? 260.0F : 420.0F);
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

   private boolean N(long var1, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var1 >= (Long)this.N_5 && var1 >= (Long)this.L_1 && !(var4 <= var5 * 0.65F)) {
         float var11 = var8 && !var9 ? var5 * 6.0F : var5 * 3.2F;
         if (var3 < var11 && !var7) {
            return false;
         } else {
            float var10 = var9 ? 0.46F : (var6 ? 0.38F : (var7 ? 0.3F : 0.18F));
            if (var8 && !var9) {
               var10 -= 0.06F;
            }

            return ((class09166)this.N_0).N(class04995.N(var10, 0.08F, 0.55F));
         }
      } else {
         return false;
      }
   }

   private boolean N(long var1, class11087 var3, class07438 var4, class11499 var5, float var6, float var7, boolean var8, boolean var9) {
      if (var4 != null && var8 && !var9 && var1 < (Long)this.M_2 && !(Math.abs((Float)this.y_4) <= 1.0E-4F)) {
         float var10 = this.N(var1, var7, false, false);
         class11499 var11 = new class11499(var5.y() + var6, class04995.N(var5.R() + var10, -90.0F, 90.0F));
         return var3.N(var4, var11);
      } else {
         return false;
      }
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var5 && var8 && !var9) {
         if (var1 >= (Long)this.M_2 && var1 >= (Long)this.M_1) {
            float var10 = var7 ? 0.1F : (var6 ? 0.13F : 0.075F);
            if (!((class09166)this.N_0).N(var10)) {
               this.M_1 = var1 + (long)((class09166)this.N_0).y(180.0F, 420.0F);
            } else {
               float var11 = Math.abs(var3) > var4 * 0.45F ? Math.signum(var3) : (float)((class09166)this.N_0).N();
               this.y_4 = var11 * var4 * ((class09166)this.N_0).y(var6 ? 0.42F : 0.28F, var6 ? 1.65F : 1.1F);
               this.M_2 = var1 + (long)((class09166)this.N_0).y(var6 ? 42.0F : 58.0F, var7 ? 115.0F : 165.0F);
               this.M_1 = var1 + (long)((class09166)this.N_0).y(var7 ? 420.0F : 620.0F, var7 ? 980.0F : 1450.0F);
            }
         }
      } else {
         if (var1 >= (Long)this.M_2) {
            this.y_4 = 0.0F;
         }
      }
   }

   private float N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 < (Long)this.M_2 && (Long)this.M_2 > 0L) {
         float var7 = class04995.N(
            (float)Math.sin((double)class04995.N((float)((Long)this.M_2 - var1) / Math.max(1.0F, var4 ? 95.0F : 145.0F), 0.0F, 1.0F) * Math.PI), 0.28F, 1.0F
         );
         float var8 = var5 ? 1.16F : 1.0F;
         return (Float)this.y_4 * var7 * var8 + ((class09166)this.N_0).N(false, var3 * 0.34F);
      } else {
         return 0.0F;
      }
   }

   private float N(float var1, float var2, float var3) {
      float var4 = ((class09166)this.N_0).y(var2, var3);
      if (Math.abs(var4 - var1) < 0.045F) {
         var4 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(0.055F, 0.16F);
      }

      return class04995.N(var4, var2, var3);
   }

   private class09150 N(class11087 var1, class07438 var2, class11499 var3, float var4, float var5, float var6, float var7, boolean var8) {
      for (float var13 : new float[]{0.82F, 0.66F, 0.48F, 0.32F, 0.18F, 0.0F}) {
         float var14 = class04995.B(var13, var4, var6);
         float var15 = var8 ? class04995.B(var13, var5, var7) : 0.0F;
         class11499 var16 = new class11499(var3.y() + var14, class04995.N(var3.R() + var15, -90.0F, 90.0F));
         if (var1.N(var2, var16)) {
            return new class09150(var14, var15);
         }
      }

      return new class09150(var4, var5);
   }

   private float[] N(long var1, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      float var12 = this.y(var1);
      float var14 = var6;
      float var15 = var8 && Math.abs(var6) > var7 * 0.18F ? var6 : this.N(var4, var3, var7, var8);
      float var16 = this.N(var5, var15);
      if (var16 <= 1.0E-4F) {
         return new float[]{var5, var6};
      } else {
         float var17 = (var9 ? 1.18F : 1.0F) + (var10 ? 0.14F : 0.0F) + (var11 ? 0.18F : 0.0F);
         float var19 = Math.min(var7 * (var9 ? 4.8F : 3.1F) * var17, Math.max(var7 * 0.35F, var16 * (Float)this.u_0)) * var12;
         float var20 = (float)Math.sin((double)var12 * Math.PI * 2.7F + (double)((Float)this.y_0).floatValue()) * var7 * ((class09166)this.N_0).y(0.16F, 0.58F);
         float var21 = -var15 / var16 * (Float)this.M_3;
         float var22 = var5 / var16 * (Float)this.M_3 * (Float)this.u_1;
         float var13 = var5 + (var21 * var19 - Math.signum(var5) * Math.abs(var5) * (Float)this.u_2 * var12);
         if (var8) {
            var14 = var6 + var22 * var19 + var20;
         }

         return new float[]{var13, var14};
      }
   }

   private float N(float var1, float var2) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var1) <= 1.0E-4F) {
         return 0.0F;
      } else if (Math.abs(var2) <= 1.0E-4F) {
         float var8 = var3 * (var4 ? 2.4F : (var5 ? 3.2F : 1.65F));
         return class04995.N(var1, -var8, var8);
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6 && Math.abs(var2) > var3 * 3.0F) {
            float var9 = var3 * (var4 ? 0.85F : 1.45F);
            return class04995.N(var1, -var9, var9);
         } else {
            float var7 = var3 * (var4 ? 2.8F : (var5 ? 2.2F : 1.25F));
            return class04995.N(var1, -Math.abs(var2) - var7, Math.abs(var2) + var7);
         }
      }
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      this.M_3 = ((class09166)this.N_0).N(0.54F) ? -(Float)this.M_3 : (float)((class09166)this.N_0).N();
      float var8 = (var5 ? 0.18F : 0.0F) + (var6 ? 0.1F : 0.0F) + (var7 ? 0.14F : 0.0F);
      float var9 = class04995.N(var3 / Math.max(var4 * 16.0F, 8.0F), 0.0F, 1.0F);
      this.u_0 = ((class09166)this.N_0).y(0.035F + var8 * 0.02F, 0.12F + var8 * 0.05F + var9 * 0.035F);
      this.u_1 = ((class09166)this.N_0).y(0.38F, 0.92F + var8 * 0.16F);
      this.u_2 = ((class09166)this.N_0).y(0.0F, var5 ? 0.07F : 0.045F);
      this.u_3 = ((class09166)this.N_0).y(0.86F, 1.34F);
      this.y_0 = ((class09166)this.N_0).N(0.0F, (float) (Math.PI * 2));
      this.L_0 = var1;
      this.L_1 = var1 + (long)((class09166)this.N_0).y(var5 ? 70.0F : 95.0F, var6 ? 170.0F : 245.0F);
      this.N_5 = var1 + (long)((class09166)this.N_0).y(var5 ? 210.0F : 320.0F, var6 ? 620.0F : 980.0F);
   }

   public void N() {
      this.N_5 = 0L;
      this.L_0 = 0L;
      this.L_1 = 0L;
      this.L_2 = 0L;
      this.M_0 = 0L;
      this.M_1 = 0L;
      this.M_2 = 0L;
      this.M_3 = 1.0F;
      this.u_0 = 0.0F;
      this.u_1 = 1.0F;
      this.u_2 = 0.0F;
      this.u_3 = 1.0F;
      this.y_0 = 0.0F;
      this.y_1 = 1.0F;
      this.y_2 = 1.0F;
      this.y_3 = 1.0F;
      this.y_4 = 0.0F;
      this.i_0 = 0;
      this.i_1 = 0;
      this.i_2 = 0;
      this.i_3 = 0;
      this.i_4 = 0;
      this.i_5 = 0;
      this.i_6 = false;

      for (int var1 = 0; var1 < 14; var1++) {
         ((int[])this.N_1)[var1] = 0;
         ((int[])this.N_2)[var1] = 0;
         ((int[])this.N_3)[var1] = 0;
         ((int[])this.N_4)[var1] = 0;
      }

      ((class09166)this.N_0).y();
   }

   public class09169 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      double var10,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      if (var3 == null) {
         return new class09169(var6, var7, var8, var9, var12);
      } else {
         float var18 = (float)Math.max(var10, 0.035F);
         long var19 = System.currentTimeMillis();
         this.N(var19, var18, var13, var14, var16);
         this.N(var19, var5, var18, var12, var13, var14, var15, var16);
         float var21 = this.N(var4, var5);
         float var22 = this.N(var6, var7);
         if (this.N(var19, var21, var22, var18, var13, var14, var15, var16)) {
            this.N(var19, var21, var18, var13, var14, var16);
         }

         boolean var23 = !var12 || this.N(var19, var1, var2, var3, var6, var18, var15, var16);
         float var24 = var6;
         float var17 = var23 ? var7 : 0.0F;
         if (var12 && var23 && Math.abs(var17) <= var18 * 0.18F) {
            var17 = this.N(var19, var18, var13, var14);
         }

         if (var22 > var18 * 0.55F || Math.abs(var17) > var18 * 0.35F) {
            float[] var26 = this.N(var19, var4, var5, var6, var17, var18, var23, var13, var14, var16);
            var24 = var26[0];
            var17 = var23 ? var26[1] : 0.0F;
         }

         var24 = this.N(this.N(var24, var4, var18, true, var16), var10);
         var17 = var23 ? this.N(this.N(var17, var5, var18, false, var16 || var12), var10) : 0.0F;
         class09150 var35 = this.N(var1, var2, var3, var24, var17, var4, var5, var18, var10, var23, var15, var16);
         var24 = var35.y();
         var17 = var23 ? var35.N() : 0.0F;
         class11499 var27 = new class11499(var3.y() + var24, class04995.N(var3.R() + var17, -90.0F, 90.0F));
         if (var15 && !var16 && var2 != null && !var1.N(var2, var27)) {
            class09150 var28 = this.N(var1, var2, var3, var6, var12 ? 0.0F : var7, var24, var17, var23);
            var24 = var28.y();
            var17 = var28.N();
            var23 = !var12 || Math.abs(var17) > 1.0E-4F;
         }

         this.L(var24, var17, var18);
         float var36 = var19 < (Long)this.M_0 ? (Float)this.y_3 : 1.0F;
         float var29 = Math.max(var18, var8 * (Float)this.y_1 * var36);
         float var30 = Math.max(var18, var9 * (Float)this.y_2 * class04995.B(0.58F, var36, 1.0F));
         return new class09169(var24, var23 ? var17 : 0.0F, var29, var30, var12 && !var23);
      }
   }
}
