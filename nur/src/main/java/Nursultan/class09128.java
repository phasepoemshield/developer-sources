package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09128 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class09128() {
      this.R();
      this.N_0 = new class09144();
      this.N_1 = Integer.MIN_VALUE;
   }

   public class09149 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      class11499 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      float var11,
      float var12,
      boolean var13,
      float var14,
      boolean var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         long var16 = System.currentTimeMillis();
         this.N(var1, var3, var4, var5, var6, var11, var12, var13, var14, var15, var16);
         if (!((class09144)this.N_0).N(var16)) {
            return class09149.N(var5, var11, var12);
         } else {
            class09147 var18 = ((class09144)this.N_0).N(var3, var4, var5, var6, var8, var11, var12, var16);
            if (!var18.y()) {
               return class09149.N(var5, var11, var12);
            } else {
               class11499 var19 = this.N(var1, var2, var5, var18.i(), var18.N(), var18.L(), var6, var9, var10);
               return new class09149(var19, var18.u(), var18.R(), true);
            }
         }
      } else {
         return class09149.N(var5, var11, var12);
      }
   }

   private void N(
      class11087 var1,
      class11499 var2,
      class11499 var3,
      class11499 var4,
      double var5,
      float var7,
      float var8,
      boolean var9,
      float var10,
      boolean var11,
      long var12
   ) {
      int var14 = var1.u();
      if ((Integer)this.N_1 == Integer.MIN_VALUE) {
         this.N_1 = var14;
         if (var14 <= 0 || var1.y().y() > 90L) {
            return;
         }
      } else {
         if (var14 == (Integer)this.N_1) {
            return;
         }

         this.N_1 = var14;
      }

      if (var1.y().y() <= 90L) {
         float var15 = var9 ? class04995.N(0.38273627F + var10 * 0.7637284F + (var11 ? 0.32736284F : 0.0F), 0.0F, 1.0F) : 0.0F;
         ((class09144)this.N_0).N(var12, var2, var3, var4, var5, var7, var8, var9, var15, var11);
      }
   }

   public void N() {
      this.N_1 = Integer.MIN_VALUE;
      ((class09144)this.N_0).N();
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

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, float var5, float var6, double var7, boolean var9, boolean var10) {
      if (var9 && !var10 && !var1.N(var2, var4)) {
         for (float var15 : new float[]{0.78372836F, 0.5273628F, 0.2927363F, 0.13726372F}) {
            class11499 var16 = new class11499(var3.y() + this.N(var5 * var15, var7), class04995.N(var3.R() + this.N(var6 * var15, var7), -90.0F, 90.0F));
            if (var1.N(var2, var16)) {
               return var16;
            }
         }

         return var3;
      } else {
         return var4;
      }
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }
}
