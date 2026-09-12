package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class11083 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0L;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
      }
   }

   public class11083() {
      this.M();
   }

   public class11499 N(class11087 var1, class07438 var2, class11499 var3, class11499 var4, boolean var5, boolean var6, boolean var7) {
      if (var1.N(var2, var3) && !var5 && !var7) {
         float var9 = class09170.N(var3.y(), var4.y());
         float var10 = var4.R() - var3.R();
         float var11 = Math.abs(var9);
         float var12 = Math.abs(var10);
         if (var11 <= 0.55F && var12 <= 0.28F) {
            class11499 var17 = this.N(var1, var2, var3, var6);
            return var17 == null ? var4 : var17;
         } else if (!(var11 > 6.4F) && !(var12 > 3.1F)) {
            long var13 = System.currentTimeMillis();
            if (var13 >= (Long)this.N_0) {
               float var15 = var6 ? 1.0F : 0.0F;
               this.N_1 = class09139.N((double)(-0.42F - var15 * 0.22F), (double)(0.52F + var15 * 0.28F));
               this.N_2 = class09139.N((double)(-0.18F - var15 * 0.08F), (double)(0.22F + var15 * 0.1F));
               this.N_0 = var13 + (long)class09139.N(95.0, var6 ? 210.0 : 310.0);
            }

            class11499 var8;
            if (var1.N(
               var2,
               var8 = new class11499(
                  var3.y() + class04995.N(var9 * 0.22F + (Float)this.N_1, -0.88F, 0.94F),
                  class04995.N(var3.R() + class04995.N(var10 * 0.16F + (Float)this.N_2, -0.38F, 0.42F), -90.0F, 90.0F)
               )
            )) {
               return var8;
            } else {
               class11499 var18 = new class11499(var3.y() + class04995.N(var9 * 0.16F, -0.54F, 0.56F), var3.R());
               if (var1.N(var2, var18)) {
                  return var18;
               } else {
                  class11499 var16 = this.N(var1, var2, var3, var6);
                  return var16 == null ? var4 : var16;
               }
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void N() {
      this.N_0 = 0L;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, boolean var4) {
      float var6 = var4 ? 1.0F : 0.0F;

      for (float[] var10 : new float[][]{
         {class09139.N((double)(-0.72F - var6 * 0.22F), (double)(0.82F + var6 * 0.28F)), class09139.N(-0.22F, 0.26F)},
         {class09139.N(-0.46F, 0.52F), class09139.N((double)(-0.34F - var6 * 0.08F), (double)(0.34F + var6 * 0.1F))},
         {class09139.N(-1.05F, 1.12F), class09139.N(-0.08F, 0.08F)},
         {class09139.N(-0.22F, 0.22F), class09139.N(-0.42F, 0.46F)},
         {class09139.N(-1.38F, 1.46F), class09139.N(-0.28F, 0.32F)}
      }) {
         class11499 var11 = new class11499(var3.y() + var10[0], class04995.N(var3.R() + var10[1], -90.0F, 90.0F));
         if (var1.N(var2, var11)) {
            return var11;
         }
      }

      return null;
   }
}
