package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09152 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   public class09152() {
      this.M();
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * 2.0F) {
         return var1;
      } else {
         float var4 = Math.max(var3, Math.abs(var2) - var3 * class09139.N(0.9, 2.6));
         return class04995.N(var1, -var4, var4);
      }
   }

   private void N(long var1, float var3, boolean var4) {
      if (var1 >= (Long)this.N_0) {
         this.N_1 = class09139.N((double)(-var3 * (var4 ? 1.55F : 0.9F)), (double)(var3 * (var4 ? 1.85F : 0.92F)));
         this.N_2 = class09139.N((double)(-var3 * (var4 ? 0.48F : 0.32F)), (double)(var3 * (var4 ? 0.48F : 0.32F)));
         this.N_0 = var1 + (long)class09139.N(var4 ? 70.0 : 180.0, var4 ? 190.0 : 420.0);
      }
   }

   private float N(float var1, float var2, boolean var3, boolean var4) {
      int var6 = Math.max(1, Math.round(var1 / var2));
      int var5 = var3 ? (Integer)this.N_5 : (Integer)this.N_6;
      if (var6 == var5 && var4 && Math.random() < 0.46F) {
         int var8 = Math.random() > 0.5 ? 1 : -1;
         int var9 = var4 ? 3 : 1;
         var6 = Math.max(1, var6 + var8 * Math.max(1, Math.round(class09139.N(1.0, (double)var9))));
      }

      if (var3) {
         this.N_5 = var6;
      } else {
         this.N_6 = var6;
      }

      return (float)var6 * var2;
   }

   public void N(class11499 var1) {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 0;
      this.N_4 = 0;
      this.N_5 = 0;
      this.N_6 = 0;
      this.N_7 = 0;
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
   }

   public class09123 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      float var12 = (float)Math.max(class09170.N(), 0.035F);
      long var13 = System.currentTimeMillis();
      this.N(var13, var12, var7);
      float var15 = class09170.N(var3.y(), var4.y());
      float var16 = var8 ? 0.0F : var4.R() - var3.R();
      int var17 = this.N(var15, var12);
      int var18 = this.N(var16, var12);
      int var10001;
      if (var17 != (Integer)this.N_3 || var18 != (Integer)this.N_4 || var17 == 0 && var18 == 0) {
         var10001 = 0;
      } else {
         int var10003 = (Integer)this.N_7 + 1;
         var10001 = var10003;
         this.N_7 = var10003;
      }

      this.N_7 = var10001;
      class11499 var19 = var4;
      if ((Integer)this.N_7 >= 4 || var7 && (Integer)this.N_7 >= 2 || var7 && Math.random() < 0.16) {
         var19 = this.N(var1, var2, var3, var4, var15, var16, var12, var8, var9, var7);
         var15 = class09170.N(var3.y(), var19.y());
         var16 = var8 ? 0.0F : var19.R() - var3.R();
         var17 = this.N(var15, var12);
         var18 = this.N(var16, var12);
      }

      float var20 = this.N(var5, var12, true, var7);
      float var21 = var8 ? var12 : this.N(var6, var12, false, var7);
      this.N_3 = var17;
      this.N_4 = var18;
      return new class09123(var19, var20, var21);
   }

   private class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10
   ) {
      if (var9 && Math.abs(var5) + Math.abs(var6) < var7 * 0.8F) {
         return var4;
      } else {
         float var11 = Math.abs(var5) > 1.0E-4F ? Math.signum(var5) : (Math.random() > 0.5 ? 1.0F : -1.0F);
         float var12 = Math.abs(var6) > 1.0E-4F ? Math.signum(var6) : (Math.random() > 0.5 ? 1.0F : -1.0F);
         float var13 = var11 * var7 * class09139.N(0.54, var10 ? 3.25 : 1.72) + (Float)this.N_1;
         float var14 = var8 ? 0.0F : var12 * var7 * class09139.N(0.22, var10 ? 1.08 : 0.58) + (Float)this.N_2;
         class11499 var15 = new class11499(
            var3.y() + this.N(var5 + var13, var5, var7), class04995.N(var3.R() + this.N(var6 + var14, var6, var7), -90.0F, 90.0F)
         );
         if (var1.N(var2, var15)) {
            return var15;
         } else {
            return var9 && var1.N(var2, var3) ? var3 : var4;
         }
      }
   }
}
