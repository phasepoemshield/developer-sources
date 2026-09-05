package ru.metaculture.protection;

import net.minecraft.class_3532;

public class VuUVnvUuVN {
   private static final double UuUVuuUu = 0.1;

   public static double UuUVuuUu() {
      return Math.min((double)vvUnNVVnV.UuUVuuUu().uUnuvNvvNU(), 0.1);
   }

   public static float UuUVuuUu(float var0, float var1, float var2) {
      return (1.0F - class_3532.method_15363((float)(UuUVuuUu() * var2), 0.0F, 1.0F)) * var0
         + class_3532.method_15363((float)(UuUVuuUu() * var2), 0.0F, 1.0F) * var1;
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = (var1 - var0) * class_3532.method_15363((float)(UuUVuuUu() * 15.0), 0.0F, 1.0F);
      if (var3 > 0.0F) {
         var3 = Math.max(var2, var3);
         var3 = Math.min(var1 - var0, var3);
      } else if (var3 < 0.0F) {
         var3 = Math.min(-var2, var3);
         var3 = Math.max(var1 - var0, var3);
      }

      return var0 + var3;
   }

   public static double UuUVuuUu(double var0, double var2, double var4) {
      return var2 + (var0 - var2) * var4;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, double var3) {
      float var5 = var1 - var0;
      if (var2 < 1.0F) {
         var2 = 1.0F;
      }

      if (var2 > 100.0F) {
         var2 = 16.666666F;
      }

      double var6 = Math.max(var3 * var2 / 16.666666F, 0.5);
      if (var5 > var3) {
         if ((var1 = (float)(var1 - var6)) < var0) {
            var1 = var0;
         }
      } else if (var5 < -var3) {
         if ((var1 = (float)(var1 + var6)) > var0) {
            var1 = var0;
         }
      } else {
         var1 = var0;
      }

      return var1;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      float var5 = (var1 - var0) * class_3532.method_15363(var4, 0.0F, 1.0F);
      if (var5 < 0.0F) {
         var5 = class_3532.method_15363(var5, -var3, -var2);
      } else {
         var5 = class_3532.method_15363(var5, var2, var3);
      }

      return Math.abs(var5) > Math.abs(var1 - var0) ? var1 : var0 + var5;
   }

   public static double C00OOC00oO(double var0, double var2, double var4) {
      boolean var6 = var0 > var2;
      if (var4 < 0.0) {
         var4 = 0.0;
      } else if (var4 > 1.0) {
         var4 = 1.0;
      }

      double var7 = Math.max(var0, var2) - Math.min(var0, var2);
      double var9 = var7 * var4;
      if (var9 < 0.1) {
         var9 = 0.1;
      }

      if (var6) {
         var2 += var9;
      } else {
         var2 -= var9;
      }

      return var2;
   }
}
