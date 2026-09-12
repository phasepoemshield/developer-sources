package Nursultan;

import minecraft.class04995;
import minecraft.class07438;

public class class09135 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0L;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }
   }

   public class09135() {
      this.L();
      this.N_0 = new class09166();
   }

   public class09153 N(
      class11087 var1,
      class07438 var2,
      class11499 var3,
      class11499 var4,
      double var5,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      float var12,
      float var13
   ) {
      if (var3 != null && var4 != null && !(var5 <= 1.0E-5)) {
         float var14 = (float)Math.max(var5, 0.035F);
         this.N(System.currentTimeMillis(), var14, var10, var11);
         class11499 var15 = new class11499(var4.y() + (Float)this.N_2, var7 ? var4.R() : class04995.N(var4.R() + (Float)this.N_3, -90.0F, 90.0F));
         if (var8 && !var9 && !var1.N(var2, var15)) {
            var15 = this.N(var1, var2, var4, var7);
         }

         float var16 = Math.max(0.01F, var12 + (Float)this.N_4);
         float var17 = Math.max(0.01F, var13 + (var7 ? 0.0F : (Float)this.N_5));
         return new class09153(var15, var16, var17);
      } else {
         return new class09153(var4, var12, var13);
      }
   }

   private void N(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.N_1) {
         float var6 = (var4 ? 1.0F : 0.0F) + (var5 ? 0.55F : 0.0F);
         float var7 = var3 * (0.18F + var6 * 0.08F);
         float var8 = var3 * (0.075F + var6 * 0.035F);
         this.N_2 = this.N(var7);
         this.N_3 = this.N(var8);
         this.N_4 = this.N(var3 * (0.2F + var6 * 0.11F));
         this.N_5 = this.N(var3 * (0.1F + var6 * 0.05F));
         this.N_1 = var1 + (long)((class09166)this.N_0).y(var4 ? 34.0F : 48.0F, var5 ? 96.0F : 145.0F);
      }
   }

   public void N() {
      this.N_1 = 0L;
      this.N_2 = 0.0F;
      this.N_3 = 0.0F;
      this.N_4 = 0.0F;
      this.N_5 = 0.0F;
      ((class09166)this.N_0).y();
   }

   private float N(float var1) {
      float var2 = (float)((class09166)this.N_0).N();
      float var3 = ((class09166)this.N_0).y(0.19F, 0.83F);
      if (var3 > 0.46F && var3 < 0.56F) {
         var3 += (float)((class09166)this.N_0).N() * ((class09166)this.N_0).N(0.08F, 0.18F);
      }

      return var2 * var1 * class04995.N(var3, 0.12F, 0.92F);
   }

   private class11499 N(class11087 var1, class07438 var2, class11499 var3, boolean var4) {
      for (float var9 : new float[]{0.72F, 0.48F, 0.26F, -0.38F, -0.18F}) {
         class11499 var10 = new class11499(var3.y() + (Float)this.N_2 * var9, var4 ? var3.R() : class04995.N(var3.R() + (Float)this.N_3 * var9, -90.0F, 90.0F));
         if (var1.N(var2, var10)) {
            return var10;
         }
      }

      return var3;
   }
}
