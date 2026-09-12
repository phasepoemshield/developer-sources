package Nursultan;

import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;

public class class09146 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
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

   private float L(int var1) {
      return class04995.N((float)Math.sqrt((double)(Math.max(400.0F, (float)var1) / 800.0F)), 0.7F, 2.0F);
   }

   private float L(long var1) {
      if ((Long)this.N_1 <= 0L) {
         this.N_1 = var1;
         return 1.0F;
      } else {
         float var3 = class04995.N((float)(var1 - (Long)this.N_1) / 50.0F, 0.35F, 1.8F);
         this.N_1 = var1;
         return var3;
      }
   }

   private float M() {
      if ((class05630)((class06202)class11087.N_0).i_7 == null) {
         return 1.0F;
      } else {
         double var3 = (Double)((class05630)((class06202)class11087.N_0).i_7).u().method_41753() * 0.6 + 0.2;
         return class04995.N((float)(0.64 + var3 * var3 * 1.72), 0.62F, 1.72F);
      }
   }

   public class09146() {
      this.i();
      this.L_0 = new class09172();
      this.L_1 = new class09125();
      this.L_2 = new class09140();
      this.L_3 = new class09165();
      this.L_4 = new class09159();
      this.N_0 = new class09156();
      this.N_7 = 1.0F;
      this.y_0 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = class09139.N(0.0, Math.PI * 2);
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0L;
         this.N_4 = 0L;
         this.N_5 = 0.0F;
         this.N_6 = 0.0F;
         this.N_7 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
      }
   }

   public class09160 N(class11087 var1, class11499 var2, class11097 var3, boolean var4, boolean var5, boolean var6) {
      long var11 = System.currentTimeMillis();
      float var13 = this.L(var11);
      this.N(var11, var5);
      float var16 = (float)Math.max(class09170.N(), 0.035F);
      float var17 = var3.U();
      float var18 = var3.L();
      class09141 var19 = ((class09172)this.L_0).N(var3, var4, var5, var6, var1.y().y());
      class09143 var20 = ((class09125)this.L_1).N(var3, var16, var5);
      boolean var21 = var3.z() && !var3.M() && !var3.R() && !var3.B() && !var5 && !var4 && var17 <= 7.2F && var18 <= 3.1F;
      boolean var22 = this.N(var11, var3, var4, var6);
      boolean var23 = var3.B() || var22 || var19.y();
      float var24 = this.M();
      float var25 = this.L(var1.i());
      float var26 = var24 * var25;
      float var27 = this.N(var17, var16, var26, var23, true);
      float var10 = var3.N() ? var16 : this.N(var18, var16, var26 * 0.64F, var23, false);
      if (var23) {
         var27 = Math.max(var27, var17 * class09139.N(0.54, 0.78) * (Float)this.N_7);
         var10 = var3.N() ? var16 : Math.max(var10, var18 * class09139.N(0.34, 0.54) * (Float)this.N_7);
      }

      if (var3.B()) {
         var27 = Math.max(var27, var17 * class09139.N(0.92, 1.06));
         var10 = var3.N() ? var16 : Math.max(var10, var18 * class09139.N(0.68, 0.9));
      }

      if (var19.y()) {
         var27 = Math.max(var27, var17 * var19.u() * var19.i() * class09139.N(1.06, 1.18));
         var10 = var3.N() ? var16 : Math.max(var10, var18 * var19.B() * var19.M() * class09139.N(1.02, 1.12));
      }

      if (var19.N()) {
         var27 = Math.max(var27, Math.abs(var19.R()) * class09139.N(0.92, 1.18));
         var10 = var3.N() ? var16 : Math.max(var10, Math.abs(var19.z()) * class09139.N(0.75, 1.05));
      }

      if (var20.L()) {
         float var29 = class04995.B(var20.u(), 1.0F, var20.N());
         var27 = Math.max(var27, var17 * class09139.N(0.82, 1.04) * var29);
         var10 = var3.N() ? var16 : Math.max(var10, var18 * class09139.N(0.54, 0.82) * var29);
      }

      if (var21 && !var19.y()) {
         var27 = Math.max(var16, Math.min(var27, var17 * 0.62F + var16 * 1.4F));
         var10 = var3.N() ? var16 : Math.max(var16, Math.min(var10, var18 * 0.56F + var16 * 1.2F));
      } else {
         var27 = ((class09165)this.L_3).N(var27, var17, var16, var23, var3.M(), true);
         var10 = var3.N() ? var16 : ((class09165)this.L_3).N(var10, var18, var16, var23, var3.M(), false);
      }

      if (var3.z() && var17 < 1.15F && var18 < 0.72F) {
         var27 = Math.min(var27, var16 * class09139.N(1.2, 3.3));
         var10 = var3.N() ? var16 : Math.min(var10, var16 * class09139.N(0.8, 1.9));
      }

      var27 = this.N(var27, var17, var16, var23);
      var10 = this.N(var10, var18, var16, var23);
      float var9 = var20.L()
         ? class09139.N(0.86, 1.0)
         : (
            var19.y()
               ? var19.L()
               : (var3.B() ? class09139.N(0.82, 1.0) : (var22 ? class09139.N(0.82, 1.0) : (var3.z() ? class09139.N(0.42, 0.66) : class09139.N(0.66, 0.9))))
         );
      float var8 = var20.L()
         ? class09139.N(0.72, 0.94)
         : (
            var19.y()
               ? Math.max(0.78F, var19.L() * 0.72F)
               : (var3.B() ? class09139.N(0.68, 0.92) : (var22 ? class09139.N(0.64, 0.86) : (var3.z() ? class09139.N(0.28, 0.46) : class09139.N(0.48, 0.7))))
         );
      if (var21 && !var19.y()) {
         var9 = Math.min(var9, 0.34F);
         var8 = Math.min(var8, 0.26F);
      }

      class09136 var42 = ((class09159)this.L_4).N(var3, var10, var8, var16, var23);
      var10 = var42.y();
      var8 = var42.N();
      this.N_5 = (Float)this.N_5 + (var27 - (Float)this.N_5) * class04995.N(var9 * var13, 0.0F, 1.0F);
      this.N_6 = (Float)this.N_6 + (var10 - (Float)this.N_6) * class04995.N(var8 * var13, 0.0F, 1.0F);
      if (var19.y() || var20.L()) {
         float var30 = class04995.N(class09139.N(var20.L() ? 0.42 : 0.28, var20.L() ? 0.68 : 0.48) * var13, 0.0F, var20.L() ? 0.78F : 0.62F);
         this.N_5 = class04995.B(var30, (Float)this.N_5, var27);
         if (!var3.N()) {
            float var31 = class04995.N(var30 * class09139.N(0.58, 0.82), 0.0F, 0.48F);
            this.N_6 = class04995.B(var31, (Float)this.N_6, var10);
         }

         float var44 = var20.L() ? class09139.N(0.68, 0.92) : var19.u();
         float var32 = var20.L() ? class09139.N(0.44, 0.7) : var19.B();
         this.N_5 = Math.max((Float)this.N_5, this.N(var17 * var44 * 0.94F, var17, var16, true));
         if (!var3.N()) {
            this.N_6 = Math.max((Float)this.N_6, this.N(var18 * var32 * 0.82F, var18, var16, true));
         }
      }

      float var43 = (float)Math.sin((double)var11 * 0.018 + (double)((Float)this.y_2).floatValue()) * var16 * 0.72F * (Float)this.y_0;
      float var7 = var3.M() ? 1.24F : (var19.N() ? 1.12F : 1.0F);
      if (var21 && !var19.y()) {
         var7 *= 0.14F;
      }

      if (var21 && !var19.y()) {
         var43 *= 0.18F;
      }

      float var45 = (float)Math.cos((double)var11 * 0.014 + (double)((Float)this.y_2 * 0.61F)) * var16 * 0.28F * (Float)this.y_1 * var7;
      float var46 = Math.max(var16, (Float)this.N_5 + var43);
      class09168 var33 = ((class09156)this.N_0).N(var46, var17, var16, var23, var21, var19.y());
      var46 = var33.y();
      class09148 var34 = ((class09140)this.L_2).N(var1, var2, var3, var46, var16, var23 || var33.N(), var19.y() || var20.L(), var6);
      var46 = var34.N();
      float var35 = Math.max(var16, (Float)this.N_6 + (var3.N() ? 0.0F : var45));
      return new class09160(
         this.N(var46, var17, var16, var23 || var33.N() || var34.y()),
         var3.N() ? var16 : this.N(var35, var18, var16, var23),
         var23 || var33.N() || var34.y(),
         var19.R(),
         var19.z(),
         var19.N()
      );
   }

   private boolean N(long var1, class11097 var3, boolean var4, boolean var5) {
      boolean var7 = var3.B() || var3.Z() && (!var3.z() || var3.U() > 8.2F || var3.L() > 3.5F) || var5 && var4 && (var3.U() > 4.0F || var3.L() > 2.25F);
      boolean var6 = var1 < (Long)this.N_3;
      if (var7 && var1 >= (Long)this.N_2 && var1 >= (Long)this.N_3) {
         this.N_7 = class09139.N(1.04, var3.U() > 18.0F ? 1.46 : 1.28);
         this.N_3 = var1 + (long)class09139.N(55.0, 138.0);
         this.N_2 = var1 + (long)class09139.N(230.0, 620.0);
         var6 = true;
      }

      if (!var6) {
         this.N_7 = 1.0F;
      }

      return var7 || var6;
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      if (var2 <= var3 * 2.4F) {
         return Math.max(var3, var1);
      } else {
         float var5 = var4 ? 0.95F : 1.55F;
         float var6 = var3 * var5;
         return class04995.N(var1, var3, Math.max(var3, var2 - var6));
      }
   }

   private float N(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (var1 <= 1.0E-4F) {
         return var2;
      } else {
         float var6 = var1 / var2;
         float var7 = var4 ? (var5 ? 0.76F : 0.69F) : (var5 ? 0.62F : 0.56F);
         float var8 = (float)Math.pow((double)Math.max(1.0F, var6), (double)var7) * var2 * var3 * (var4 ? (var5 ? 2.35F : 1.55F) : (var5 ? 1.24F : 0.82F));
         float var9 = var4 ? (var5 ? 0.76F : 0.58F) : (var5 ? 0.42F : 0.3F);
         float var10 = var1 * var9;
         float var11 = Math.max(var8, var10);
         float var12 = var5 ? (var4 ? 58.0F : 28.0F) : (var4 ? 12.0F : 6.6F);
         return class04995.N(var11, var2, var12);
      }
   }

   private void N(long var1, boolean var3) {
      if (var1 >= (Long)this.N_4) {
         this.y_0 = class09139.N(var3 ? 0.9 : 0.78, var3 ? 1.28 : 1.16);
         this.y_1 = class09139.N(0.72, var3 ? 1.18 : 1.06);
         this.y_2 = class09139.N(0.0, Math.PI * 2);
         this.N_4 = var1 + (long)class09139.N(var3 ? 85.0 : 160.0, var3 ? 210.0 : 420.0);
      }
   }

   public void N() {
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0L;
      this.N_4 = 0L;
      this.N_5 = 0.0F;
      this.N_6 = 0.0F;
      this.N_7 = 1.0F;
      this.y_0 = 1.0F;
      this.y_1 = 1.0F;
      this.y_2 = class09139.N(0.0, Math.PI * 2);
      ((class09172)this.L_0).N();
      ((class09125)this.L_1).N();
      ((class09140)this.L_2).N();
      ((class09165)this.L_3).N();
      ((class09159)this.L_4).N();
      ((class09156)this.N_0).N();
   }
}
