package Nursultan;

import minecraft.class04995;

public class class09159 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class09159() {
      this.y();
      this.N_3 = 1.0F;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 1.0F;
   }

   public class09136 N(class11097 var1, float var2, float var3, float var4, boolean var5) {
      if (var1.N()) {
         return new class09136(var4, 0.0F);
      } else {
         long var6 = System.currentTimeMillis();
         this.N(var6, var1, var5);
         float var8 = var2;
         float var9 = var3;
         if (var1.z() && !var1.M() && !var1.B()) {
            float var10 = class04995.N(var1.L() / 2.8F, 0.16F, 0.72F);
            var8 = Math.min(var2, Math.max(var4, var1.L() * var10 + var4 * 0.65F));
            var9 = var3 * class04995.N(var10, 0.18F, 0.58F);
         }

         if (var6 < (Long)this.N_1 && !var1.B()) {
            var8 = Math.min(var8, var4 * class09139.N(0.7, 1.35));
            var9 *= 0.18F;
         }

         if (var6 < (Long)this.N_2 || var1.B()) {
            float var11 = var1.B() ? class09139.N(0.72, 0.92) : class09139.N(0.42, 0.66);
            var8 = Math.max(var8, var1.L() * var11);
            var9 = Math.max(var9, var1.B() ? class09139.N(0.72, 0.94) : class09139.N(0.48, 0.72));
         }

         return new class09136(Math.max(var4, var8 * (Float)this.N_3), class04995.N(var9, 0.0F, 1.0F));
      }
   }

   private void N(long var1, class11097 var3, boolean var4) {
      if (var1 >= (Long)this.N_0) {
         this.N_3 = class09139.N(0.74, var4 ? 1.28 : 1.08);
         if (!var3.B() && var3.L() < 3.0F) {
            double var5 = Math.random();
            double var7 = var3.z() ? 0.46 : 0.24;
            if (var5 < var7) {
               this.N_1 = var1 + (long)class09139.N(45.0, 115.0);
            }
         }

         if (var3.M() || var3.L() > 2.4F) {
            double var9 = Math.random();
            double var10 = var4 ? 0.42 : 0.2;
            if (var9 < var10) {
               this.N_2 = var1 + (long)class09139.N(55.0, 125.0);
            }
         }

         this.N_0 = var1 + (long)class09139.N(var4 ? 70.0 : 115.0, var4 ? 180.0 : 310.0);
      }
   }
}
