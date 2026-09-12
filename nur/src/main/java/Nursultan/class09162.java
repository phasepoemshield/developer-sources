package Nursultan;

import minecraft.class04995;

public class class09162 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0L;
         this.N_2 = 0L;
         this.N_3 = 0.0F;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_1 = 0.0F;
         this.y_2 = 0.0F;
         this.y_3 = 0.0F;
         this.y_4 = 0;
         this.y_5 = false;
      }
   }

   public class09162() {
      this.M();
   }

   private float z() {
      return (Long)this.N_2 <= 0L ? 1.0F : class04995.N((float)(System.currentTimeMillis() - (Long)this.N_1) / (float)((Long)this.N_2).longValue(), 0.0F, 1.0F);
   }

   private int y(float var1) {
      if (Math.abs(var1) <= 1.0E-4F) {
         return 0;
      } else {
         return var1 > 0.0F ? 1 : -1;
      }
   }

   private float y(long var1) {
      if ((Long)this.N_0 <= 0L) {
         this.N_0 = var1;
         return 1.0F;
      } else {
         float var3 = class04995.N((float)(var1 - (Long)this.N_0) / 50.0F, 0.35F, 1.8F);
         this.N_0 = var1;
         return var3;
      }
   }

   private float y(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = Math.abs(var1);
      if (!(var8 <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float var9 = this.z();
         float var10 = this.N(var9);
         float var11 = (var5 ? 0.66F : 0.52F) + (float)Math.pow((double)class04995.N(var8 / 28.0F, 0.0F, 1.0F), 0.34) * 0.24F;
         if (var6 || var7) {
            var11 += 0.14F;
         }

         float var12 = this.R() && !var7 ? class04995.B(var10, Math.min(var11, 0.62F), var11) : var11;
         float var13 = Math.max(var3 * 0.45F, var8 * var12 + var3 * class09139.N(1.2F, 5.0));
         float var14 = class04995.N(var2, -var13, var13);
         float var15 = (
               var3 * (this.R() ? class04995.B(var10, var5 ? 8.0F : 5.6F, var5 ? 17.0F : 11.5F) : (var5 ? 13.5F : 8.8F))
                  + (float)Math.pow((double)(Math.abs(var14 - (Float)this.y_1) + var3 * 0.5F), 0.92) * 1.35F
            )
            * class04995.N(var4, 0.45F, 1.65F);
         float var16 = (Float)this.y_1 + class04995.N(var14 - (Float)this.y_1, -var15, var15);
         this.y_3 = (Float)this.y_3 * 0.18F + var16 * 0.82F;
         var16 = class04995.B(this.R() ? 0.035F : 0.02F, var16, (Float)this.y_3);
         if (Math.signum(var16) != Math.signum(var1) && var8 > var3) {
            var16 = Math.signum(var1) * Math.min(Math.abs(var16), var13);
         }

         return class04995.N(var16, -var8, var8);
      } else {
         this.y_3 = (Float)this.y_3 * 0.45F;
         return 0.0F;
      }
   }

   public class09126 N(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      long var12 = System.currentTimeMillis();
      float var14 = this.y(var12);
      int var15 = this.y(var1);
      float var16 = (Boolean)this.y_5 ? Math.abs(var1 - (Float)this.N_3) : 0.0F;
      boolean var17 = (Boolean)this.y_5 && var15 != 0 && (Integer)this.y_4 != 0 && var15 != (Integer)this.y_4 && Math.abs(var1) > Math.max(4.2F, var5 * 12.0F);
      boolean var11 = Math.abs(var1) > Math.max(7.2F, var5 * 17.0F)
         && (var16 > Math.max(3.6F, var5 * 8.5F) || var17 || Math.abs(var3) > Math.max(4.0F, var5 * 9.0F));
      if (var11 && !var10) {
         this.N(var12, var1, var16, var7, var8, var9);
      }

      float var19 = this.N(var1, var3, var5, var14, var7, var8, var10);
      float var20 = var6 ? 0.0F : this.y(var2, var4, var5, var14, var7, var8, var10);
      this.N_3 = var1;
      this.y_0 = var19;
      this.y_1 = var20;
      if (var15 != 0) {
         this.y_4 = var15;
      }

      this.y_5 = true;
      return new class09126(var19, var20);
   }

   private void N(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = class04995.N((Math.abs(var3) + var4 * 0.45F) / 120.0F, 0.0F, 1.0F);
      float var9 = !var5 && !var6 ? 16.0F : 12.0F;
      float var10 = var7 ? 34.0F : 52.0F;
      this.N_1 = var1;
      this.N_2 = (long)class09139.N((double)(var9 + var8 * 6.0F), (double)(var10 + var8 * 14.0F));
      this.y_4 = this.y(var3);
      this.y_2 = (Float)this.y_2 * 0.96F;
      this.y_3 = (Float)this.y_3 * 0.88F;
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0L;
      this.N_2 = 0L;
      this.N_3 = 0.0F;
      this.y_0 = 0.0F;
      this.y_1 = 0.0F;
      this.y_2 = 0.0F;
      this.y_3 = 0.0F;
      this.y_4 = 0;
      this.y_5 = false;
   }

   private float N(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = Math.abs(var1);
      if (!(var8 <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float var9 = this.z();
         float var10 = this.N(var9);
         float var11 = class04995.N(var8 / 96.0F, 0.0F, 1.0F);
         float var12 = (var5 ? 0.82F : 0.7F) + (float)Math.pow((double)var11, 0.28) * (var5 ? 0.22F : 0.24F);
         if (var6) {
            var12 += 0.14F;
         }

         if (var7) {
            var12 += 0.2F;
         }

         float var13 = this.R() && !var7 ? class04995.B(var10, Math.min(var12, var5 ? 0.78F : 0.7F), var12) : var12;
         float var14 = Math.max(var3, var8 * var13 + var3 * class09139.N(4.0, var5 ? 18.0 : 13.0));
         float var15 = class04995.N(var2, -var14, var14);
         float var16 = var3 * (this.R() ? class04995.B(var10, var5 ? 22.0F : 16.0F, var5 ? 46.0F : 34.0F) : (var5 ? 36.0F : 26.0F));
         float var17 = (float)Math.pow((double)(Math.abs(var15 - (Float)this.y_0) + var3), 0.94) * (var5 ? 2.35F : 1.85F);
         float var18 = (var16 + var17) * class04995.N(var4, 0.45F, 1.65F);
         float var19 = (Float)this.y_0 + class04995.N(var15 - (Float)this.y_0, -var18, var18);
         float var20 = this.R() ? class04995.B(var10, 0.88F, 0.96F) : (var5 ? 0.92F : 0.84F);
         this.y_2 = (Float)this.y_2 * (1.0F - var20) + var19 * var20;
         var19 = class04995.B(this.R() ? 0.04F : 0.03F, var19, (Float)this.y_2);
         if (Math.signum(var19) != Math.signum(var1) && var8 > var3 * 2.0F) {
            var19 = Math.signum(var1) * Math.min(Math.abs(var19), var14);
         }

         return class04995.N(var19, -var8, var8);
      } else {
         this.y_2 = (Float)this.y_2 * 0.35F;
         return 0.0F;
      }
   }

   private float N(float var1) {
      float var2 = class04995.N(var1, 0.0F, 1.0F);
      float var3 = 1.0F - (float)Math.pow((double)(1.0F - var2), 8.0);
      float var4 = (float)Math.sin((double)var2 * Math.PI) * 0.06F;
      return class04995.N(var3 + var4, 0.0F, 1.0F);
   }

   private boolean R() {
      return (Long)this.N_2 > 0L && System.currentTimeMillis() - (Long)this.N_1 < (Long)this.N_2;
   }
}
