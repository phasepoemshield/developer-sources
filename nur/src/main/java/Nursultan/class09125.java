package Nursultan;

import minecraft.class04995;

public class class09125 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   public class09125() {
      this.i();
      this.N_5 = 1.0F;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0L;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
         this.N_6 = false;
         this.N_7 = false;
      }
   }

   private void y() {
      this.N_0 = 0L;
      this.N_4 = 0.0F;
      this.N_6 = false;
      this.N_7 = false;
   }

   private void N(long var1, float var3) {
      this.N_0 = var1;
      this.N_4 = Math.max(0.001F, var3);
      this.N_6 = true;
      this.N_7 = false;
   }

   private float N(double var1) {
      return (float)((double)Math.round(var1 * 1000000.0) / 1000000.0);
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0L;
      this.N_4 = 0.0F;
      this.N_5 = 1.0F;
      this.N_6 = false;
      this.N_7 = false;
   }

   private float N(class11097 var1) {
      return class04995.N(var1.U() * var1.U() + var1.L() * var1.L() * 2.15F);
   }

   private void N(long var1) {
      this.N_5 = this.N((double)class09139.N(1.7234382842983, 2.320309329));
      this.N_1 = var1;
      this.N_2 = var1 + (long)class09139.N(42.0, 86.0);
      this.N_3 = var1 + (long)class09139.N(260.0, 620.0);
      this.N_7 = true;
   }

   public class09143 N(class11097 var1, float var2, boolean var3) {
      long var5 = System.currentTimeMillis();
      float var7 = this.N(var1);
      boolean var4 = !var3 && (var1.M() || var1.B() || !var1.z()) && var7 > var2 * 4.0F;
      if (!var4) {
         this.y();
         return class09143.y();
      } else {
         if (!(Boolean)this.N_6 || var7 > (Float)this.N_4 * 1.24F) {
            this.N(var5, var7);
         }

         float var9 = 1.0F - class04995.N(var7 / Math.max(var2, (Float)this.N_4), 0.0F, 1.0F);
         if (!(Boolean)this.N_7 && var5 >= (Long)this.N_3 && var9 > class09139.N(0.52F, 0.64F)) {
            this.N(var5);
         }

         if (var5 >= (Long)this.N_2) {
            return class09143.y();
         } else {
            float var10 = class04995.N((float)(var5 - (Long)this.N_1) / (float)Math.max(1L, (Long)this.N_2 - (Long)this.N_1), 0.0F, 1.0F);
            float var11 = 0.32F + (float)Math.pow((double)(1.0F - var10), 0.36F) * 0.68F;
            return new class09143(true, (Float)this.N_5, var11);
         }
      }
   }
}
