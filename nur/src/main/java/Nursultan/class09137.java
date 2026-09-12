package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09137 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class09137() {
      this.u();
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = false;
      }
   }

   private boolean y(int var1, int var2) {
      return var1 == (Integer)this.N_0 || var2 == (Integer)this.N_1;
   }

   private int N(float var1, float var2) {
      return Math.abs(var1) <= 1.0E-4F ? 0 : Math.round(var1 / var2);
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

   private int[] N(boolean var1, int var2) {
      return !var1 ? new int[]{0} : new int[]{var2, -var2, var2 * 2, -var2 * 2, var2 * 3, -var2 * 3, var2 * 4, -var2 * 4};
   }

   public class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, class11499 var5, double var6, boolean var8, boolean var9) {
      if (var3 != null && var4 != null && var5 != null) {
         float var10 = (float)Math.max(var6, 0.035F);
         int var11 = this.N(class09170.N(var3.y(), var5.y()), var10);
         int var12 = this.N(var5.R() - var3.R(), var10);
         if ((Boolean)this.N_2 && this.y(var11, var12)) {
            class11499 var13 = this.N(var1, var2, var3, var4, var6, var10, var8, var9, var11, var12);
            if (var13 != null) {
               var11 = this.N(class09170.N(var3.y(), var13.y()), var10);
               var12 = this.N(var13.R() - var3.R(), var10);
               this.N(var11, var12);
               return var13;
            } else {
               this.N(var11, var12);
               return var5;
            }
         } else {
            this.N(var11, var12);
            return var5;
         }
      } else {
         return var5;
      }
   }

   private float N(float var1, float var2, float var3, boolean var4) {
      float var5 = Math.abs(var2);
      float var6 = var4 ? 0.85F : 0.45F;
      if (var5 <= var3 * var6) {
         return class04995.N(var1, -var3 * (var4 ? 4.0F : 2.0F), var3 * (var4 ? 4.0F : 2.0F));
      } else {
         float var7 = Math.max(var3, Math.abs(var2) + var3 * (var4 ? 1.6F : 0.85F));
         return class04995.N(var1, -var7, var7);
      }
   }

   private boolean N(class11087 var1, class07438 var2, class11499 var3, boolean var4, boolean var5) {
      return var3 != null && (!var4 || var5 || var1.N(var2, var3));
   }

   private class11499 N(
      class11087 var1, class07438 var2, class11499 var3, class11499 var4, double var5, float var7, boolean var8, boolean var9, int var10, int var11
   ) {
      int var13 = this.N(var10, class09170.N(var3.y(), var4.y()));
      int var14 = this.N(var11, var4.R() - var3.R());
      int[] var15 = this.N(var10 == (Integer)this.N_0, var13);

      for (int var19 : this.N(var11 == (Integer)this.N_1, var14)) {
         for (int var23 : var15) {
            int var24;
            int var25;
            class11499 var26;
            if ((var23 != 0 || var19 != 0)
               && this.N(var1, var2, var26 = this.N(var3, var4, var5, var7, var25 = var10 + var23, var24 = var11 + var19), var8, var9)
               && this.N(var26, var3, var7)) {
               return var26;
            }
         }
      }

      return null;
   }

   private boolean N(class11499 var1, class11499 var2, float var3) {
      int var4 = this.N(class09170.N(var2.y(), var1.y()), var3);
      int var5 = this.N(var1.R() - var2.R(), var3);
      return var4 != (Integer)this.N_0 && var5 != (Integer)this.N_1;
   }

   private class11499 N(class11499 var1, class11499 var2, double var3, float var5, int var6, int var7) {
      float var8 = class09170.N(var1.y(), var2.y());
      float var9 = var2.R() - var1.R();
      float var10 = this.N((float)var6 * var5, var8, var5, true);
      float var11 = this.N((float)var7 * var5, var9, var5, false);
      return new class11499(var1.y() + this.N(var10, var3), class04995.N(var1.R() + this.N(var11, var3), -90.0F, 90.0F));
   }

   private void N(int var1, int var2) {
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = true;
   }

   public void N() {
      this.N_0 = 0;
      this.N_1 = 0;
      this.N_2 = false;
   }

   private int N(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > 1.0E-4F) {
         return var2 > 0.0F ? 1 : -1;
      } else {
         return Math.random() > 0.5 ? 1 : -1;
      }
   }
}
