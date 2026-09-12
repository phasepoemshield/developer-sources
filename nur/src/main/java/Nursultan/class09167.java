package Nursultan;

import minecraft.class04995;

public class class09167 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
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
   public Object L_5;
   public boolean L_init;
   public Object u_0;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public boolean R_init;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public boolean M_init;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public boolean B_init;
   public static Object Z_0;
   public Object z_0;
   public Object z_1;
   public Object z_2;
   public Object z_3;
   public Object z_4;
   public Object z_5;
   public Object z_6;
   public Object z_7;
   public boolean z_init;

   private float L(long var1) {
      float var3 = (float)Math.sin((double)((float)var1 * 0.021F + (Float)this.B_0));
      float var4 = (float)Math.sin((double)((float)var1 * 0.047F + (Float)this.B_0 * 1.7F));
      return class04995.N(var3 * 0.65F + var4 * 0.35F, -1.0F, 1.0F);
   }

   private float L(float var1) {
      float var2 = class04995.N(var1, 0.0F, 1.0F);
      float var3 = (float)Math.sin((double)var2 * Math.PI);
      float var4 = 1.0F
         + (float)Math.sin((double)var2 * Math.PI * (double)((float)((Integer)this.B_1).intValue() + 1.35F) + (double)((Float)this.B_0).floatValue()) * 0.34F;
      if ((Integer)this.B_1 == 0) {
         var3 = (float)Math.pow((double)(1.0F - var2), 0.62) * 0.72F + var3 * 0.34F;
      } else if ((Integer)this.B_1 == 1) {
         var3 = (float)Math.pow((double)var2, 1.65) * 0.84F + var3 * 0.22F;
      }

      return class04995.N(var3 * var4, 0.0F, 1.0F);
   }

   public class09167() {
      this.R();
      this.N_0 = new class09166();
      this.N_1 = new int[12];
      this.N_2 = new int[12];
      this.y_0 = new int[12];
      this.y_1 = new int[12];
      this.i_0 = 1.0F;
      this.i_1 = 1.0F;
      this.L_3 = 1.0F;
      this.L_4 = 1.0F;
      this.L_5 = 1.0F;
      this.B_2 = -1;
   }

   static {
      y();
   }

   private int Z() {
      int var1 = ((class09166)this.N_0).N(0, 4);
      if (var1 == (Integer)this.B_2) {
         var1 = (var1 + ((class09166)this.N_0).N(1, 4)) % 5;
      }

      return var1;
   }

   private float u(long var1) {
      return (Long)this.y_4 <= (Long)this.y_3 ? 1.0F : class04995.N((float)(var1 - (Long)this.y_3) / (float)((Long)this.y_4 - (Long)this.y_3), 0.0F, 1.0F);
   }

   private float y(long var1) {
      return var1 >= (Long)this.y_5 && var1 < (Long)this.y_6
         ? class04995.N(
            (float)Math.sin((double)class04995.N((float)(var1 - (Long)this.y_5) / (float)Math.max(1L, (Long)this.y_6 - (Long)this.y_5), 0.0F, 1.0F) * Math.PI),
            0.0F,
            1.0F
         )
         : 0.0F;
   }

   private static void y() {
      Z_0 = 12;
   }

   private int y(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   private boolean y(float var1, float var2, float var3) {
      int var5 = this.y(var1, var3);
      int var6 = this.y(var2, var3);
      if (var5 == 0 && var6 == 0) {
         return false;
      } else {
         int var7 = (Boolean)this.z_6 ? var5 - (Integer)this.z_2 : 0;
         int var4 = (Boolean)this.z_6 ? var6 - (Integer)this.z_3 : 0;
         if ((Boolean)this.z_6 && var5 == (Integer)this.z_2 && var6 == (Integer)this.z_3) {
            return true;
         } else if ((Boolean)this.z_6
            && (var7 != 0 || var4 != 0)
            && var7 == (Integer)this.z_4
            && var4 == (Integer)this.z_5
            && Math.abs(var5) + Math.abs(var6) > 3) {
            return true;
         } else {
            for (int var9 = 0; var9 < (Integer)this.z_1; var9++) {
               if (((int[])this.N_1)[var9] == var5 && ((int[])this.N_2)[var9] == var6) {
                  return true;
               }

               if (((int[])this.y_0)[var9] == var7 && ((int[])this.y_1)[var9] == var4 && (var7 != 0 || var4 != 0)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   private float y(float var1) {
      float var2 = class04995.N(var1, 0.0F, 1.0F);

      return switch ((Integer)this.B_1) {
         case 0 -> 0.78F * (1.0F - (float)Math.pow((double)var2, 0.42)) - 0.22F * (float)Math.sin((double)var2 * Math.PI);
         case 1 -> -0.34F * (1.0F - var2) + 0.92F * (float)Math.pow((double)var2, 2.2);
         case 2 -> (float)Math.sin((double)var2 * Math.PI * 2.15F + (double)((Float)this.B_0).floatValue()) * 0.58F;
         case 3 -> var2 < 0.36F ? -0.54F + var2 * 0.72F : (var2 < 0.72F ? 0.84F : -0.18F);
         default -> (float)Math.sin((double)(var2 * 1.35F + 0.18F) * Math.PI + (double)((Float)this.B_0).floatValue()) * 0.66F;
      };
   }

   private float N(float var1, float var2) {
      if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1.0F : -1.0F;
      } else if (Math.abs(var1) > 1.0E-4F) {
         return var1 > 0.0F ? 1.0F : -1.0F;
      } else {
         return (float)((class09166)this.N_0).N();
      }
   }

   private float N(long var1, boolean var3) {
      float var4 = var3 ? 0.067F : 0.052F;
      float var5 = (float)Math.sin((double)((float)var1 * var4 + (Float)this.B_0));
      float var6 = (float)Math.sin((double)((float)var1 * var4 * 1.91F + (Float)this.B_0 * (var3 ? 1.43F : 0.81F)));
      float var7 = var6 > 0.0F ? 0.32F : -0.32F;
      return class04995.N(var5 * 0.58F + var6 * 0.28F + var7, -1.0F, 1.0F);
   }

   private class09155 N(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      float var8 = var1;
      float var9 = var2;

      for (int var10 = 0; var10 < 7 && this.y(var8, var9, var5); var10++) {
         float var11 = this.N(var8, var3);
         float var12 = this.N(var9, var4);
         float var13 = 0.75F + (float)var10 * 0.34F + var6 * 0.75F;
         float var14 = var7 ? 0.66F : 1.0F;
         float var15 = var11 * var5 * ((class09166)this.N_0).y(0.65F, 2.15F + var13) * var14;
         float var16 = var12 * var5 * ((class09166)this.N_0).y(0.28F, 1.32F + var13 * 0.44F) * (var7 ? 0.58F : 1.0F);
         if ((var10 & 1) == 1) {
            var16 = -var16 * ((class09166)this.N_0).y(0.55F, 1.18F);
         }

         var8 = this.N(var8 + var15, var3, var5, true, var7);
         var9 = this.N(var9 + var16, var4, var5, false, var7);
      }

      return new class09155(var8, var9);
   }

   private float N(float var1) {
      float var2 = class04995.N(var1, 0.0F, 1.0F);

      return switch ((Integer)this.B_1) {
         case 1 -> class04995.N(1.0F - var2 * 2.7F, 0.0F, 1.0F);
         case 3 -> var2 < 0.34F ? class04995.N(1.0F - var2 * 2.1F, 0.0F, 1.0F) : class04995.N((var2 - 0.76F) * 3.8F, 0.0F, 1.0F);
         default -> class04995.N((float)Math.sin((double)var2 * Math.PI * 2.0 + (double)((Float)this.B_0).floatValue()) * 0.38F, 0.0F, 1.0F);
      };
   }

   public void N() {
      this.y_2 = 0L;
      this.y_3 = 0L;
      this.y_4 = 0L;
      this.y_5 = 0L;
      this.y_6 = 0L;
      this.i_0 = 1.0F;
      this.i_1 = 1.0F;
      this.i_2 = 0.0F;
      this.i_3 = 0.0F;
      this.M_0 = 0.0F;
      this.M_1 = 0.0F;
      this.M_2 = 0.0F;
      this.M_3 = 0.0F;
      this.R_0 = 0.0F;
      this.R_1 = 0.0F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = 0.0F;
      this.L_3 = 1.0F;
      this.L_4 = 1.0F;
      this.L_5 = 1.0F;
      this.B_0 = 0.0F;
      this.B_1 = 0;
      this.B_2 = -1;
      this.z_0 = 0;
      this.z_1 = 0;
      this.z_2 = 0;
      this.z_3 = 0;
      this.z_4 = 0;
      this.z_5 = 0;
      this.z_6 = false;
      this.z_7 = false;
      this.u_0 = false;

      for (int var1 = 0; var1 < 12; var1++) {
         ((int[])this.N_1)[var1] = 0;
         ((int[])this.N_2)[var1] = 0;
         ((int[])this.y_0)[var1] = 0;
         ((int[])this.y_1)[var1] = 0;
      }

      ((class09166)this.N_0).y();
   }

   private void N(float var1, float var2, float var3) {
      int var4 = this.y(var1, var3);
      int var5 = this.y(var2, var3);
      int var6 = (Boolean)this.z_6 ? var4 - (Integer)this.z_2 : 0;
      int var7 = (Boolean)this.z_6 ? var5 - (Integer)this.z_3 : 0;
      ((int[])this.N_1)[(Integer)this.z_0] = var4;
      ((int[])this.N_2)[(Integer)this.z_0] = var5;
      ((int[])this.y_0)[(Integer)this.z_0] = var6;
      ((int[])this.y_1)[(Integer)this.z_0] = var7;
      this.z_0 = ((Integer)this.z_0 + 1) % 12;
      this.z_1 = Math.min(12, (Integer)this.z_1 + 1);
      this.z_2 = var4;
      this.z_3 = var5;
      this.z_4 = var6;
      this.z_5 = var7;
      this.z_6 = true;
   }

   public class09138 N(
      float var1, float var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11
   ) {
      long var17 = System.currentTimeMillis();
      this.N(var17, var4, var5, var6, var7, var8, var9, var10, var11);
      float var19 = Math.abs(var1);
      float var20 = Math.abs(var2);
      boolean var21 = var10 || var11;
      float var22 = class04995.N((var19 + var20 * 1.45F) / 34.0F, 0.0F, 1.0F);
      float var23 = class04995.N(var4 * 0.72F + var5 * 0.82F + (var8 ? 0.35F : 0.0F), 0.0F, 1.65F);
      float var24 = this.u(var17);
      float var25 = this.y(var24);
      float var26 = this.N(var24);
      float var27 = this.L(var24);
      float var28 = this.y(var17);
      float var29 = this.L(var17);
      float var30 = var21 ? 0.64F : 1.0F;
      float var31 = (Float)this.i_0 + (Float)this.i_2 * var25 * var30 + (Float)this.M_2 * var28 - (Float)this.M_0 * var26;
      float var32 = (Float)this.i_1 - (Float)this.i_3 * var25 * 0.72F + var29 * (Float)this.i_3 * 0.34F + (Float)this.M_3 * var28 - (Float)this.M_1 * var26;
      float var33 = (Float)this.L_5 * var3 * (Float)this.R_0 * var23 * var22 * var30;
      float var34 = -(Float)this.L_5 * var3 * (Float)this.R_1 * var23 * var22 * (var21 ? 0.58F : 1.0F);
      float var35 = this.N(var17, true) * var3 * (Float)this.L_0 * var22 * var30;
      float var36 = this.N(var17, false) * var3 * (Float)this.L_1 * var22;
      float var37 = var3 * (Float)this.L_2 * var23 * class04995.N(0.35F + var22, 0.0F, 1.25F) * var27 * var30;
      float var38 = (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
      float var15;
      float var16;
      if (var38 > 1.0E-4F) {
         var16 = -var2 / var38 * (Float)this.L_5;
         var15 = var1 / var38 * (Float)this.L_5 * (Float)this.L_3;
      } else {
         var16 = (Float)this.L_5;
         var15 = -(Float)this.L_5 * (Float)this.L_3;
      }

      if (var19 > 54.0F) {
         var33 *= 0.42F;
         var35 *= 0.55F;
         var37 *= 0.62F;
      }

      float var39 = var1 * var31 + var33 + var35 + var16 * var37;
      float var40 = var2 * var32 + var34 + var36 + var15 * var37;
      class09155 var41 = this.N(var39, var40, var1, var2, var3, var22, var21);
      var39 = var41.y();
      var40 = var41.N();
      this.N(var39, var40, var3);
      float var14 = var21 ? 0.94F : (var7 ? 0.8F : 0.86F);
      float var13 = var21 ? 0.88F : (var7 ? 0.7F : 0.78F);
      float var12 = var21 ? 1.14F : (var7 ? 1.18F : 1.24F);
      float var42 = var21 ? 1.1F : (var7 ? 1.14F : 1.18F);
      boolean var43 = var28 > 0.36F && (Boolean)this.z_7 || var27 > 0.55F && (Boolean)this.u_0;
      boolean var44 = var43 && (var21 || var9 || var22 > 0.34F);
      return new class09138(
         var39,
         var40,
         var14,
         var13,
         var12,
         var42,
         class04995.N((Float)this.L_4 + var28 * 0.72F + Math.max(var25, 0.0F) * 0.44F, 0.76F, 2.15F),
         class04995.N((Float)this.L_4 * 0.88F + var28 * 0.44F + Math.abs(var29) * 0.28F, 0.66F, 1.75F),
         var43,
         var44
      );
   }

   private void N(long var1, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      boolean var11 = var9 || var10;
      if (var1 >= (Long)this.y_2) {
         this.B_2 = (Integer)this.B_1;
         this.B_1 = this.Z();
         float var13 = Math.abs(var5) > 0.45F ? Math.signum(var5) : 0.0F;
         this.L_5 = var13 != 0.0F && ((class09166)this.N_0).N(0.58F + var4 * 0.16F)
            ? -var13
            : (((class09166)this.N_0).N(0.62F + var4 * 0.12F) ? -(Float)this.L_5 : (float)((class09166)this.N_0).N());
         float var15 = var3 * 0.62F + var4 * 0.92F + (var7 ? 0.42F : 0.0F) + (var8 ? 0.26F : 0.0F);
         this.i_0 = this.N((Float)this.i_0, var11 ? 0.96F : (var6 ? 0.82F : 0.88F), var11 ? 1.08F : 1.1F, 0.045F);
         this.i_1 = this.N((Float)this.i_1, var11 ? 0.9F : (var6 ? 0.74F : 0.82F), var11 ? 1.03F : 1.03F, 0.04F);
         this.i_2 = ((class09166)this.N_0).y(0.08F, 0.25F + var15 * 0.09F);
         this.i_3 = ((class09166)this.N_0).y(0.04F, 0.18F + var15 * 0.06F);
         this.M_0 = ((class09166)this.N_0).y(0.06F, var11 ? 0.13F : 0.22F);
         this.M_1 = ((class09166)this.N_0).y(0.04F, var11 ? 0.1F : 0.18F);
         this.R_0 = ((class09166)this.N_0).y(0.7F, 3.6F + var15 * 1.55F);
         this.R_1 = ((class09166)this.N_0).y(0.26F, 1.65F + var15 * 0.84F);
         this.L_0 = ((class09166)this.N_0).y(0.42F, 1.55F + var15 * 0.58F);
         this.L_1 = ((class09166)this.N_0).y(0.14F, 0.82F + var15 * 0.28F);
         this.L_2 = ((class09166)this.N_0).y(1.15F, 4.7F + var15 * 2.3F);
         this.L_3 = ((class09166)this.N_0).y(0.35F, 1.18F);
         this.L_4 = ((class09166)this.N_0).y(!var8 && !var11 ? 0.82F : 1.08F, !var8 && !var11 ? 1.36F : 1.72F);
         this.B_0 = ((class09166)this.N_0).N(0.0F, (float) (Math.PI * 2));
         this.u_0 = ((class09166)this.N_0).N(!var8 && !var11 ? 0.3F : 0.46F);
         this.y_3 = var1;
         this.y_4 = var1 + (long)((class09166)this.N_0).y(var8 ? 62.0F : 84.0F, var11 ? 145.0F : 230.0F);
         this.y_2 = var1 + (long)((class09166)this.N_0).y(var8 ? 54.0F : 78.0F, var11 ? 155.0F : 250.0F);
      }

      if (var1 >= (Long)this.y_6 && ((class09166)this.N_0).N(!var8 && !var9 ? 0.26F : 0.44F)) {
         boolean var16 = ((class09166)this.N_0).N(!var9 && !var10 ? 0.54F : 0.76F);
         this.M_2 = var16 ? ((class09166)this.N_0).y(0.1F, 0.28F) : -((class09166)this.N_0).y(0.07F, 0.18F);
         this.M_3 = var16 ? ((class09166)this.N_0).y(0.05F, 0.16F) : -((class09166)this.N_0).y(0.04F, 0.13F);
         this.z_7 = var16 && ((class09166)this.N_0).N(0.62F);
         this.y_5 = var1;
         this.y_6 = var1 + (long)((class09166)this.N_0).y(28.0F, var9 ? 86.0F : 118.0F);
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var2) <= 1.0E-4F) {
         return class04995.N(var1, -var3 * (var4 ? 3.0F : 1.8F), var3 * (var4 ? 3.0F : 1.8F));
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6 && Math.abs(var2) > var3 * 2.5F) {
            return class04995.N(var1, -var3 * (var4 ? 1.1F : 0.85F), var3 * (var4 ? 1.1F : 0.85F));
         } else {
            float var7 = var5 ? (var4 ? 1.14F : 1.1F) : (var4 ? 1.24F : 1.18F);
            float var8 = var3 * (var4 ? 2.4F : 1.35F);
            return class04995.N(var1, -Math.abs(var2) * var7 - var8, Math.abs(var2) * var7 + var8);
         }
      }
   }

   private float N(float var1, float var2, float var3, float var4) {
      float var5 = ((class09166)this.N_0).y(var2, var3);
      if (Math.abs(var5 - var1) < var4) {
         var5 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).y(var4, var4 * 3.4F);
      }

      return class04995.N(var5, var2, var3);
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0L;
         this.y_3 = 0L;
         this.y_4 = 0L;
         this.y_5 = 0L;
         this.y_6 = 0L;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = 0.0F;
         this.i_2 = 0.0F;
         this.i_3 = 0.0F;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0.0F;
         this.M_1 = 0.0F;
         this.M_2 = 0.0F;
         this.M_3 = 0.0F;
      }

      if (!this.R_init) {
         this.R_init = true;
         this.R_0 = 0.0F;
         this.R_1 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
      }

      if (!this.B_init) {
         this.B_init = true;
         this.B_0 = 0.0F;
         this.B_1 = 0;
         this.B_2 = 0;
      }

      if (!this.z_init) {
         this.z_init = true;
         this.z_0 = 0;
         this.z_1 = 0;
         this.z_2 = 0;
         this.z_3 = 0;
         this.z_4 = 0;
         this.z_5 = 0;
         this.z_6 = false;
         this.z_7 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
      }
   }
}
