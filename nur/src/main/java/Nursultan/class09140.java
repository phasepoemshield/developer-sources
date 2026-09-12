package Nursultan;

import minecraft.class04995;

public class class09140 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   public class09140() {
      this.L();
      this.N_3 = 1.0F;
      this.N_4 = 0.0F;
   }

   private boolean N(class11087 var1, class11097 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (var5 || var3 <= 1.65F || var1.y().y() < 42L) {
         return false;
      } else if (var2.B() || var2.M()) {
         return true;
      } else if (!var2.z() && var3 > 3.4F) {
         return true;
      } else if (var6 && var3 > 2.4F) {
         return true;
      } else {
         return var4 && var3 > 5.0F ? Math.random() < 0.64F : (Integer)this.N_7 >= 2 && var3 > 4.2F || var3 > 10.0F && Math.random() < 0.34F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 1.0F;
      this.N_4 = 0.0F;
      this.N_5 = 0.0F;
      this.N_6 = 0;
      this.N_7 = 0;
   }

   private void N(long var1, class11097 var3, float var4, boolean var5) {
      boolean var6 = var3.M() || var3.B() || !var3.z() || var4 > 12.0F;
      this.N_3 = class09139.N(var6 ? 1.34F : 1.08F, var6 ? 2.18F : 1.62F);
      this.N_4 = class09139.N(var6 ? 0.46F : 0.3F, var5 ? 0.82F : (double)(var6 ? 0.74F : 0.58F));
      this.N_1 = var1;
      this.N_2 = var1 + (long)class09139.N(var6 ? 58.0 : 46.0, var6 ? 128.0 : 96.0);
      this.N_0 = var1 + (long)class09139.N(var6 ? 120.0 : 185.0, var6 ? 420.0 : 680.0);
   }

   public class09148 N(class11087 var1, class11499 var2, class11097 var3, float var4, float var5, boolean var6, boolean var7, boolean var8) {
      long var11 = System.currentTimeMillis();
      float var13 = var3.U();
      int var14 = Math.max(1, Math.round(var4 / var5));
      int var10001;
      if (var14 == (Integer)this.N_6) {
         int var10003 = (Integer)this.N_7 + 1;
         var10001 = var10003;
         this.N_7 = var10003;
      } else {
         var10001 = 0;
      }

      this.N_7 = var10001;
      boolean var10 = var11 < (Long)this.N_2;
      if (!var10 && var11 >= (Long)this.N_0 && this.N(var1, var3, var13, var6, var7, var8)) {
         this.N(var11, var3, var13, var8);
         var10 = true;
      }

      float var16 = var4;
      boolean var17 = false;
      if (var10) {
         float var18 = class04995.N((float)(var11 - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
         float var19 = (float)Math.pow((double)(1.0F - var18), 0.42F);
         float var20 = 0.34F + var19 * (Float)this.N_3;
         float var21 = var13 * (Float)this.N_4 * var20;
         var16 = Math.max(var4, var21);
         var16 *= class09139.N(1.08F, (double)(1.0F + (Float)this.N_3 * 0.18F));
         var17 = true;
      }

      if ((Integer)this.N_7 >= 1 && var13 > var5 * 4.0F) {
         float var24 = Math.signum(class09170.N(var2.y(), var3.y().y()));
         float var25 = var24 == 0.0F ? class09139.N(-2.0, 2.0) : var24 * class09139.N(1.0, var6 ? 6.0 : 3.0);
         var16 = Math.max(var5, var16 + var25 * var5);
         var17 |= var6 || (Integer)this.N_7 >= 2;
      }

      int var9;
      if ((var9 = Math.max(1, Math.round(var16 / var5))) == (Integer)this.N_6 && var9 > 1) {
         var9 += Math.random() > 0.5 ? 1 : -1;
      }

      var16 = Math.max(var5, (float)var9 * var5);
      this.N_6 = var9;
      this.N_5 = var16;
      return new class09148(var16, var17);
   }
}
