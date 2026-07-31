package l;

import java.util.Random;

final class Helper415 {
   private final int[] p = new int[512];

   Helper415(int var1) {
      int[] var2 = new int[256];
      int var3 = 0;

      while (var3 < 256) {
         var2[var3] = var3++;
      }

      Random var7 = new Random(var1);

      for (int var4 = 255; var4 > 0; var4--) {
         int var5 = var7.nextInt(var4 + 1);
         int var6 = var2[var4];
         var2[var4] = var2[var5];
         var2[var5] = var6;
      }

      for (int var8 = 0; var8 < 256; var8++) {
         int var9 = var2[var8] & 0xFF;
         this.p[var8] = var9;
         this.p[var8 + 256] = var9;
      }
   }

   private static float method4230(float var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0F - 15.0F) + 10.0F);
   }

   private static float method4231(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   private static float method4232(int var0, float var1, float var2, float var3) {
      int var4 = var0 & 15;
      float var5 = var4 < 8 ? var1 : var2;
      float var6 = var4 < 4 ? var2 : (var4 != 12 && var4 != 14 ? var3 : var1);
      return ((var4 & 1) == 0 ? var5 : -var5) + ((var4 & 2) == 0 ? var6 : -var6);
   }

   float method4233(float var1, float var2) {
      float var3 = 0.0F;
      int var4 = (int)Math.floor(var1) & 0xFF;
      int var5 = (int)Math.floor(var2) & 0xFF;
      int var6 = (int)Math.floor(var3) & 0xFF;
      var1 = (float)(var1 - Math.floor(var1));
      var2 = (float)(var2 - Math.floor(var2));
      var3 = (float)(var3 - Math.floor(var3));
      float var7 = method4230(var1);
      float var8 = method4230(var2);
      float var9 = method4230(var3);
      int var10 = this.p[var4] + var5;
      int var11 = this.p[var10] + var6;
      int var12 = this.p[var10 + 1] + var6;
      int var13 = this.p[var4 + 1] + var5;
      int var14 = this.p[var13] + var6;
      int var15 = this.p[var13 + 1] + var6;
      return method4231(
         var9,
         method4231(
            var8,
            method4231(var7, method4232(this.p[var11], var1, var2, var3), method4232(this.p[var14], var1 - 1.0F, var2, var3)),
            method4231(var7, method4232(this.p[var12], var1, var2 - 1.0F, var3), method4232(this.p[var15], var1 - 1.0F, var2 - 1.0F, var3))
         ),
         method4231(
            var8,
            method4231(var7, method4232(this.p[var11 + 1], var1, var2, var3 - 1.0F), method4232(this.p[var14 + 1], var1 - 1.0F, var2, var3 - 1.0F)),
            method4231(
               var7, method4232(this.p[var12 + 1], var1, var2 - 1.0F, var3 - 1.0F), method4232(this.p[var15 + 1], var1 - 1.0F, var2 - 1.0F, var3 - 1.0F)
            )
         )
      );
   }

   float method4234(float var1, float var2, int var3, float var4, float var5) {
      float var6 = 0.0F;
      float var7 = 0.5F;
      float var8 = var1;
      float var9 = var2;

      for (int var10 = 0; var10 < var3; var10++) {
         var6 += this.method4233(var8, var9) * var7;
         var8 *= var4;
         var9 *= var4;
         var7 *= var5;
      }

      return var6;
   }
}
