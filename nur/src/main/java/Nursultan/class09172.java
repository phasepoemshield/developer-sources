package Nursultan;

import minecraft.class04995;

public class class09172 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   private void M() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
         this.y_1 = 0L;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = false;
         this.L_3 = false;
      }
   }

   public class09172() {
      this.M();
      this.N_1 = 11.0F;
      this.N_2 = 1.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0.55F;
      this.N_5 = 0.42F;
   }

   private boolean y(class11097 var1, boolean var2, boolean var3, boolean var4, long var5) {
      if (!var1.B() && (!var4 || var5 < 500L)) {
         if (var3) {
            boolean var11 = var5 >= 18L && var5 <= 98L;
            return var11 && (var1.U() >= 2.2F || var1.L() >= 1.1F || !var1.z()) && Math.random() < 0.38;
         } else if (var1.M() && var5 >= 32L) {
            return Math.random() < 0.24;
         } else if (var1.z() && var1.U() < (Float)this.N_1 && var1.L() < 3.2F) {
            return var1.U() <= 4.8F && var5 >= 70L && Math.random() < 0.18;
         } else {
            float var7 = var1.z() ? (Float)this.N_1 * 0.86F : Math.max(4.4F, (Float)this.N_1 * 0.58F);
            boolean var8 = var1.U() >= var7;
            boolean var9 = !var1.z() && var1.U() >= 4.8F;
            boolean var10 = var4 && var2 && (var1.U() >= 3.4F || var1.L() >= 1.8F);
            return var8 || var9 || var10;
         }
      } else {
         return false;
      }
   }

   public void N() {
      this.y_0 = 0L;
      this.y_1 = 0L;
      this.N_0 = 0L;
      this.N_1 = class09139.N(8.5, 14.5);
      this.N_2 = 1.0F;
      this.N_3 = 1.0F;
      this.N_4 = 0.55F;
      this.N_5 = 0.42F;
      this.L_0 = 0.0F;
      this.L_1 = 0.0F;
      this.L_2 = false;
      this.L_3 = false;
   }

   private void N(long var1, class11097 var3, boolean var4, boolean var5) {
      float var6 = var3.U();
      boolean var7 = var3.M() || var6 >= 14.0F || !var3.z() && var6 >= 8.0F;
      this.N_2 = class09139.N(var7 ? 1.48 : 1.24, var7 ? 2.36 : 1.82);
      this.N_3 = class09139.N(var5 && var4 ? 1.12 : 1.02, var7 ? 1.46 : 1.28);
      this.N_4 = class09139.N(var7 ? 0.52 : 0.38, var7 ? 0.86 : 0.68);
      this.N_5 = class09139.N(0.24, var7 ? 0.52 : 0.42);
      this.L_2 = var3.M() && var6 <= 12.0F || var3.z() && var6 <= 5.6F || Math.random() < 0.18;
      if ((Boolean)this.L_2) {
         float var9 = Math.random() > 0.5 ? 1.0F : -1.0F;
         this.L_0 = var9 * class09139.N(var7 ? 2.2 : 1.25, var7 ? 5.4 : 3.6);
         this.L_1 = class09139.N(var7 ? -1.75 : -0.95, var7 ? 1.75 : 0.95);
         this.N_2 = Math.max((Float)this.N_2, class09139.N(1.74, 2.42));
         this.N_3 = Math.max((Float)this.N_3, class09139.N(1.18, 1.52));
         this.N_4 = Math.max((Float)this.N_4, class09139.N(0.62, 0.9));
         this.N_5 = Math.max((Float)this.N_5, class09139.N(0.34, 0.58));
      } else {
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
      }

      this.y_1 = var1;
      this.N_0 = var1 + (long)class09139.N((Boolean)this.L_2 ? 120.0 : 72.0, (Boolean)this.L_2 ? 230.0 : (var7 ? 150.0 : 126.0));
      this.y_0 = var1 + (long)class09139.N((Boolean)this.L_2 ? 260.0 : 340.0, (Boolean)this.L_2 ? 760.0 : (var7 ? 880.0 : 1120.0));
      this.N_1 = class09139.N(4.8, var7 ? 12.5 : 9.8);
      this.L_3 = true;
   }

   public class09141 N(class11097 var1, boolean var2, boolean var3, boolean var4, long var5) {
      long var8 = System.currentTimeMillis();
      boolean var7 = var5 >= 500L && var4;
      if (var7 || var1.B()) {
         this.L_3 = false;
         this.L_2 = false;
      }

      if (var8 >= (Long)this.N_0) {
         this.L_3 = false;
         this.L_2 = false;
      }

      if (!(Boolean)this.L_3 && var8 >= (Long)this.y_0 && this.y(var1, var2, var3, var4, var5)) {
         this.N(var8, var1, var2, var4);
      }

      if (!(Boolean)this.L_3) {
         return class09141.Z();
      } else {
         float var11 = class04995.N((float)(var8 - (Long)this.y_1) / (float)Math.max(1L, (Long)this.N_0 - (Long)this.y_1), 0.0F, 1.0F);
         float var12 = (float)Math.pow((double)Math.max(0.0F, 1.0F - var11), 0.54F);
         float var13 = 0.16F + var12 * 0.96F;
         float var14 = (Boolean)this.L_2 ? Math.max(0.74F, (float)Math.sin((double)var11 * Math.PI)) : 0.0F;
         return new class09141(
            true,
            class04995.B(var13, 1.0F, (Float)this.N_2),
            class04995.B(var13, 1.0F, (Float)this.N_3),
            class04995.B(var13, 0.72F, 1.22F),
            (Float)this.N_4,
            (Float)this.N_5,
            (Float)this.L_0 * var14,
            (Float)this.L_1 * var14,
            (Boolean)this.L_2 && var14 > 0.08F
         );
      }
   }
}
