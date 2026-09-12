package Nursultan;

import minecraft.class04995;

public class class09129 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;

   public class09129() {
      this.R();
   }

   private float y(boolean var1) {
      return var1 ? (Float)this.N_0 : (Float)this.N_1;
   }

   private void y(boolean var1, float var2) {
      if (var1) {
         this.N_0 = var2;
      } else {
         this.N_1 = var2;
      }
   }

   private float N(boolean var1) {
      return var1 ? (Float)this.N_2 : (Float)this.N_3;
   }

   private float N(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float var6 = var3 ? 1.0F : 0.62F;
      float var7 = var4 ? 7.4F : (var5 ? 1.85F : 3.25F);
      float var8 = var4 ? 0.58F : (var5 ? 0.24F : 0.36F);
      return var1 * var6 * var7 + Math.abs(var2) * var8;
   }

   public void N() {
      this.N_0 = 0.0F;
      this.N_1 = 0.0F;
      this.N_2 = 0.0F;
      this.N_3 = 0.0F;
   }

   private void N(boolean var1, float var2) {
      if (var1) {
         this.N_2 = var2;
      } else {
         this.N_3 = var2;
      }
   }

   private float N(float var1, float var2, double var3, float var5, boolean var6, boolean var7, boolean var8) {
      if (!(Math.abs(var1) <= 1.0E-4F) && !(Math.abs(var2) <= 1.0E-4F)) {
         float var12 = Math.signum(var1);
         float var13 = this.N(var6);
         if (Math.signum(var13) != var12) {
            var13 = 0.0F;
            this.y(var6, 0.0F);
         }

         float var9;
         float var10;
         float var11;
         if (Math.abs(
               var11 = var13
                  + class04995.N((var10 = var12 * Math.min(Math.abs(var2), Math.abs(var1))) - var13, -(var9 = this.N(var5, var10, var6, var7, var8)), var9)
            )
            > Math.abs(var1)) {
            var11 = var1;
         }

         float var14 = this.N(var11, var1, var3, var5, var6, var7);
         this.N(var6, var14);
         return var14;
      } else {
         this.N(var6, this.N(var6) * 0.35F);
         this.y(var6, this.y(var6) * 0.45F);
         return 0.0F;
      }
   }

   private float N(float var1, float var2, double var3, float var5, boolean var6, boolean var7) {
      if (var3 <= 1.0E-5) {
         return var1;
      } else {
         float var8 = var1 + this.y(var6);
         if (Math.abs(var8) <= 1.0E-4F) {
            return 0.0F;
         } else {
            float var9 = Math.signum(var8);
            int var10 = Math.round(Math.abs(var8) / (float)var3);
            boolean var11 = Math.signum(var2) == var9 && Math.abs(var2) > var5 * (var7 ? 0.62F : 1.08F) && Math.abs(var1) > var5 * 0.48F;
            if (var10 == 0 && var11) {
               var10 = 1;
            }

            if (var10 == 0) {
               this.y(var6, class04995.N(var8, -var5 * 1.35F, var5 * 1.35F));
               return 0.0F;
            } else {
               float var12 = var9 * (float)var10 * (float)var3;
               if (Math.signum(var2) == var9 && Math.abs(var12) > Math.abs(var2) && Math.abs(var2) > var5 * 0.65F) {
                  var12 = var2;
               }

               this.y(var6, class04995.N(var8 - var12, -var5 * 1.65F, var5 * 1.65F));
               return var12;
            }
         }
      }
   }

   public class09130 N(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8, boolean var9) {
      float var10 = (float)Math.max(var5, 0.035F);
      float var11 = this.N(var1, var3, var5, var10, true, var8, var9);
      float var12 = var7 ? 0.0F : this.N(var2, var4, var5, var10, false, var8, var9);
      return new class09130(var11, var12);
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
      }
   }
}
