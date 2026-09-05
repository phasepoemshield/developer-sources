package ru.metaculture.protection;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;
import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.joml.Vector3d;

public class UuvVnuU {
   public static class_310 UuUVuuUu = class_310.method_1551();
   private static final Random uUnuvNvvNU = new Random();
   public static int C00OOC00oO = 2;
   private static final double vVvUvVVuuNvV = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] uNNnnnuuuN = new double[257];
   private static final double[] nuUnNvnuUu = new double[257];

   public static double UuUVuuUu(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double UuUVuuUu(double var0, int var2) {
      return new BigDecimal(var0).setScale(var2, RoundingMode.HALF_EVEN).doubleValue();
   }

   public static float UuUVuuUu(float var0, float var1, float var2) {
      return (var0 - var1) / (var2 - var1);
   }

   public static double UuUVuuUu(double var0, double var2) {
      return Math.random() * (var2 - var0) + var0;
   }

   public static float UuUVuuUu(float var0, float var1) {
      return (float)(Math.random() * (var1 - var0) + var0);
   }

   public static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var1 >= var3 && var0 < var2 + var4 && var1 < var3 + var5;
   }

   public static double UuUVuuUu(double var0) {
      return new BigDecimal(var0).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
   }

   public static double C00OOC00oO(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float UuUVuuUu(float var0) {
      if ((var0 = var0 % 360.0F) >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static float C00OOC00oO(float var0, float var1) {
      return (float)(var0 + Math.random() * (var1 - var0));
   }

   public static double C00OOC00oO(double var0) {
      return var0 * var0;
   }

   public static double C00OOC00oO(double var0, double var2) {
      return Math.sqrt(C00OOC00oO(var0) - C00OOC00oO(var2));
   }

   public static float C00OOC00oO(float var0) {
      return var0 * 9.0F / 16.0F;
   }

   public static float uUnuvNvvNU(float var0) {
      return var0 * 16.0F / 9.0F;
   }

   public static int UuUVuuUu(int var0) {
      class_1041 var1 = class_310.method_1551().method_22683();
      return (int)((double)var0 * var1.method_4495() / C00OOC00oO);
   }

   public static double uUnuvNvvNU(double var0, double var2) {
      double var4 = var2 * var2 + var0 * var0;
      if (Double.isNaN(var4)) {
         return Double.NaN;
      } else {
         boolean var6 = var0 < 0.0;
         if (var6) {
            var0 = -var0;
         }

         boolean var7 = var2 < 0.0;
         if (var7) {
            var2 = -var2;
         }

         boolean var8 = var0 > var2;
         if (var8) {
            double var9 = var2;
            var2 = var0;
            var0 = var9;
         }

         double var28 = uUnuvNvvNU(var4);
         var2 *= var28;
         var0 *= var28;
         double var11 = vVvUvVVuuNvV + var0;
         int var13 = (int)Double.doubleToRawLongBits(var11);
         double var14 = uNNnnnuuuN[var13];
         double var16 = nuUnNvnuUu[var13];
         double var18 = var11 - vVvUvVVuuNvV;
         double var20 = var0 * var16 - var2 * var18;
         double var22 = (6.0 + var20 * var20) * var20 * 0.16666666666666666;
         double var24 = var14 + var22;
         if (var8) {
            var24 = (Math.PI / 2) - var24;
         }

         if (var7) {
            var24 = Math.PI - var24;
         }

         if (var6) {
            var24 = -var24;
         }

         return var24;
      }
   }

   public static double uUnuvNvvNU(double var0) {
      double var2 = 0.5 * var0;
      long var4 = Double.doubleToRawLongBits(var0);
      var4 = 6910469410427058090L - (var4 >> 1);
      var0 = Double.longBitsToDouble(var4);
      return var0 * (1.5 - var2 * var0 * var0);
   }

   public static double vVvUvVVuuNvV(double var0, double var2) {
      return Math.abs(var2 - var0) > Math.abs(var0 - var2) ? Math.abs(var0 - var2) : Math.abs(var2 - var0);
   }

   public static double C00OOC00oO(double var0, int var2) {
      return var0 < 0.5 ? 2.0 * var0 * var0 : 1.0 - Math.pow(-2.0 * var0 + 2.0, var2) / 2.0;
   }

   public static float UuUVuuUu(float var0, int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Decimal places must be non-negative");
      } else {
         double var2 = Math.pow(10.0, var1);
         return (float)(Math.round(var0 * var2) / var2);
      }
   }

   public static double UuUVuuUu(Vector3d var0, Vector3d var1) {
      double var2 = var1.x - var0.x;
      double var4 = var1.z - var0.z;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public float vVvUvVVuuNvV(float var1) {
      class_1041 var2 = class_310.method_1551().method_22683();
      return var1 * (int)((double)var1 * var2.method_4495() / C00OOC00oO);
   }

   public static int vVvUvVVuuNvV(double var0) {
      int var2 = (int)var0;
      return var0 > var2 ? var2 + 1 : var2;
   }

   public double uNNnnnuuuN(double var1) {
      class_1041 var3 = class_310.method_1551().method_22683();
      return var1 * (int)(var1 * var3.method_4495() / C00OOC00oO);
   }

   public static float uNNnnnuuuN(float var0) {
      return nuUnNvnuUu(var0) * UuUVuuUu();
   }

   public static float UuUVuuUu() {
      return (float)(C00OOC00oO() * 0.15);
   }

   public static float C00OOC00oO() {
      float var0;
      return (var0 = (float)((Double)UuUVuuUu.field_1690.method_42495().method_41753() * 0.6 + 0.2)) * var0 * var0 * 8.0F;
   }

   public static float nuUnNvnuUu(float var0) {
      return Math.round(var0 / UuUVuuUu());
   }

   public static double UuUVuuUu(class_1297 var0) {
      double var1 = var0.method_23321() - var0.field_5969;
      double var3 = var0.method_23317() - var0.field_6014;
      double var5 = var0.method_23318() - var0.field_6036;
      double var7 = Math.sqrt(var3 * var3 + var1 * var1 + var5 * var5);
      return var7 * 15.3571428571;
   }

   public static float VVuuUN(float var0) {
      if ((var0 = (float)(var0 % 360.0)) >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      if (var2 - var1 == 0.0F) {
         throw new IllegalArgumentException("Диапазон входных значений не может быть равен нулю.");
      } else {
         float var5 = (var2 - var0) / (var2 - var1) * (var4 - var3) + var3;
         return Math.max(var3, Math.min(var4, var5));
      }
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3, float var4) {
      if (var2 - var1 == 0.0F) {
         throw new IllegalArgumentException("Диапазон входных значений не может быть равен нулю.");
      } else {
         float var5 = (var0 - var1) / (var2 - var1) * (var4 - var3) + var3;
         return Math.max(var3, Math.min(var4, var5));
      }
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      if (!(var0 < var1) && !(var0 > var2)) {
         float var3 = var2 - var1;
         return (var0 - var1) / var3 * 100.0F;
      } else {
         return 0.0F;
      }
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2) {
      if (!(var0 < var1) && !(var0 > var2)) {
         float var3 = var2 - var1;
         return (var0 - var1) / var3 * 101.0F;
      } else {
         return 0.0F;
      }
   }

   public static float vVvUvVVuuNvV(float var0, float var1, float var2) {
      if (!(var0 < var1) && !(var0 > var2)) {
         float var3 = var2 - var1;
         return (var0 - var1) / var3 * 191.0F;
      } else {
         return 0.0F;
      }
   }

   public static float uNNnnnuuuN(float var0, float var1, float var2) {
      if (!(var0 < 0.0F) && !(var0 > 100.0F)) {
         float var3 = var2 - var1;
         return var0 / 100.0F * var3 + var1;
      } else {
         return 0.0F;
      }
   }

   public static double uNNnnnuuuN(double var0, double var2) {
      return var2 + (var0 - var2) * uUnuvNvvNU.nextDouble();
   }

   public static BigDecimal C00OOC00oO(float var0, int var1) {
      BigDecimal var2 = new BigDecimal(Float.toString(var0));
      return var2.setScale(var1, 4);
   }

   public static int UuUVuuUu(int var0, int var1) {
      return (int)(var1 + (var0 - var1) * uUnuvNvvNU.nextDouble());
   }

   public static boolean C00OOC00oO(int var0) {
      return var0 % 2 == 0;
   }

   public static double uUnuvNvvNU(double var0, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = new BigDecimal(var0);
         var3 = var3.setScale(var2, RoundingMode.HALF_UP);
         return var3.doubleValue();
      }
   }

   public static double nuUnNvnuUu(double var0, double var2) {
      double var4 = Math.pow(10.0, var2);
      return Math.round(var0 * var4) / var4;
   }

   public static double VVuuUN(double var0, double var2) {
      return Math.random() * (var0 - var2) + var2;
   }

   public static int C00OOC00oO(int var0, int var1) {
      return -var1 + (int)(Math.random() * (var0 - -var1 + 1));
   }

   public static float uUnuvNvvNU(float var0, float var1) {
      return var0 != var1 && !(var1 - var0 <= 0.0F) ? (float)(var0 + (var1 - var0) * Math.random()) : var0;
   }

   public static int uUnuvNvvNU(int var0, int var1) {
      return uUnuvNvvNU.nextInt(var1 - var0) + var0;
   }

   public static double vNUvnnVnUvu(double var0, double var2) {
      double var4 = 1.0 / var2;
      return Math.round(var0 * var4) / var4;
   }

   public static boolean UuUVuuUu(Double var0) {
      return var0 == Math.floor(var0) && !Double.isInfinite(var0);
   }

   public static float[] UuUVuuUu(float[] var0) {
      var0[0] %= 360.0F;
      var0[1] %= 360.0F;

      while (var0[0] <= -180.0F) {
         var0[0] += 360.0F;
      }

      while (var0[1] <= -180.0F) {
         var0[1] += 360.0F;
      }

      while (var0[0] > 180.0F) {
         var0[0] -= 360.0F;
      }

      while (var0[1] > 180.0F) {
         var0[1] -= 360.0F;
      }

      return var0;
   }

   public static double uVUuuVnNVU(double var0, double var2) {
      Random var4 = new Random();
      double var5 = var2 - var0;
      double var7 = var4.nextDouble() * var5;
      if (var7 > var2) {
         var7 = var2;
      }

      double var9;
      if ((var9 = var7 + var0) > var2) {
         var9 = var2;
      }

      return var9;
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3) {
      float var4 = uNNnnnuuuN(var3, 0.0F, var2);
      return VVuuUN(var0, var1, var4);
   }

   public static float nuUnNvnuUu(float var0, float var1, float var2) {
      float var3 = var0 + var2 / 2.0F;
      if (var3 > var1) {
         var3 = var1;
      }

      return var3;
   }

   public static float VVuuUN(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3) {
      float var4 = (var1 - var0) * (var3 / 2.0F) > 0.0F
         ? Math.max(var3, Math.min(var1 - var0, (var1 - var0) * (var3 / 2.0F)))
         : Math.max(var1 - var0, Math.min(-(var3 / 2.0F), (var1 - var0) * (var3 / 2.0F)));
      return var2 + var4;
   }

   public static float vNUvnnVnUvu(float var0, float var1, float var2) {
      float var3 = (var1 - var0) * (var2 / 2.0F) > 0.0F
         ? Math.max(var2, Math.min(var1 - var0, (var1 - var0) * (var2 / 2.0F)))
         : Math.max(var1 - var0, Math.min(-(var2 / 2.0F), (var1 - var0) * (var2 / 2.0F)));
      return var0 + var3;
   }

   public static double vuuuNvNuv(double var0, double var2) {
      double var4 = var2 / 2.0;
      double var6 = Math.floor(var0 / var2) * var2;
      return var0 >= var6 + var4
         ? new BigDecimal(Math.ceil(var0 / var2) * var2, MathContext.DECIMAL64).stripTrailingZeros().doubleValue()
         : new BigDecimal(var6, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2, float var3) {
      Random var4 = new Random();
      float var5 = var4.nextFloat() * var3;
      return var0 + var2 * var5 * (var1 - var0);
   }

   public static int UuUVuuUu(int var0, int var1, int var2) {
      if (var0 <= var1) {
         var0 = var1;
      }

      if (var0 >= var2) {
         var0 = var2;
      }

      return var0;
   }

   public static float uVUuuVnNVU(float var0, float var1, float var2) {
      if (var0 <= var1) {
         var0 = var1;
      }

      if (var0 >= var2) {
         var0 = var2;
      }

      return var0;
   }

   public static String UuUVuuUu(long var0) {
      long var2 = var0 / 3600000L;
      long var4 = var0 % 3600000L / 60000L;
      long var6 = var0 % 360000L % 60000L / 1000L;
      return String.format("%02d:%02d:%02d", var2, var4, var6);
   }

   public static float vuuuNvNuv(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static double uUnuvNvvNU(double var0, double var2, double var4) {
      return var2 + (var0 - var2) * var4;
   }

   public static float UuUVuuUu(float var0, float var1, double var2) {
      return (float)uUnuvNvvNU((double)var0, (double)var1, var2);
   }

   public static int UuUVuuUu(int var0, int var1, double var2) {
      return (int)uUnuvNvvNU((double)var0, (double)var1, var2);
   }

   public static Vector3d UuUVuuUu(Vector3d var0, Vector3d var1, float var2) {
      return new Vector3d(uUnuvNvvNU(var0.x, var1.x, (double)var2), uUnuvNvvNU(var0.y, var1.y, (double)var2), uUnuvNvvNU(var0.z, var1.z, (double)var2));
   }

   public static double nvUVNnuu(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(2, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static int vVvUvVVuuNvV(int var0, int var1) {
      return (int)(Math.random() * (var1 - var0 + 1) + var0);
   }

   public static double UuuNnUvUuv(double var0, double var2) {
      return Math.random() * (var2 - var0) + var0;
   }

   public static Vector3d C00OOC00oO(Vector3d var0, Vector3d var1, float var2) {
      return new Vector3d(
         nvUVNnuu((float)var0.x, (float)var1.x, var2), nvUVNnuu((float)var0.y, (float)var1.y, var2), nvUVNnuu((float)var0.z, (float)var1.z, var2)
      );
   }

   public static float nvUVNnuu(float var0, float var1, float var2) {
      return (1.0F - vuuuNvNuv((float)(uUnuvNvvNU() * var2), 0.0F, 1.0F)) * var0 + vuuuNvNuv((float)(uUnuvNvvNU() * var2), 0.0F, 1.0F) * var1;
   }

   public static double uUnuvNvvNU() {
      return vvUnNVVnV.UuUVuuUu().uUnuvNvvNU();
   }

   public static double nuUnNvnuUu(double var0) {
      double var2 = Math.max(0.0, Math.min(1.0, var0));
      double var4 = Math.max(0.0, Math.min(60.0, uUnuvNvvNU() * 240.0));
      return 1.0 - Math.pow(1.0 - var2, var4);
   }

   public static double VVuuUN(double var0) {
      double var2 = Math.max(0.0, Math.min(1.0, var0));
      double var4 = Math.max(0.0, Math.min(60.0, uUnuvNvvNU() * 240.0));
      return Math.pow(var2, var4);
   }

   public static int vNUvnnVnUvu(double var0) {
      int var2 = (int)var0;
      return var0 > var2 ? var2 + 1 : var2;
   }

   public static double vVvUvVVuuNvV(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2, float var3, float var4) {
      return var3 + (var4 - var3) * (var0 - var1) / (var2 - var1);
   }

   public static float vVvUvVVuuNvV(float var0, float var1) {
      return (float)(Math.random() * (var0 - var1) + var1);
   }

   public static float UuuNnUvUuv(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * vuuuNvNuv(var2, 0.0F, 1.0F);
   }

   public static double uNNnnnuuuN(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * vuuuNvNuv((float)var4, 0.0F, 1.0F);
   }

   public static double vVvUvVVuuNvV(double var0, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = new BigDecimal(var0);
         var3 = var3.setScale(var2, RoundingMode.HALF_UP);
         return var3.doubleValue();
      }
   }

   public static int uNNnnnuuuN(int var0, int var1) {
      return var0 / 2 - var1 / 2;
   }

   public static float uNNnnnuuuN(float var0, float var1) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (var1 - var0) + var0;
   }

   public static float C00OOC00oO(float var0, float var1, double var2) {
      return UuuNnUvUuv(var0, var1, (float)var2);
   }

   public static float nuUnNvnuUu(float var0, float var1) {
      double var2 = 3.141592653;
      double var4 = 1.0 / Math.sqrt(2.0 * var2 * (var1 * var1));
      return (float)(var4 * Math.exp(-(var0 * var0) / (2.0 * (var1 * var1))));
   }

   public static double uVUuuVnNVU(double var0) {
      return Math.round(var0 * 2.0) / 2.0;
   }

   public static float VVuuUN(float var0, float var1) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (var0 - var1) + var1;
   }

   public static int nuUnNvnuUu(int var0, int var1) {
      return (var0 + var1) / 2;
   }

   public static int VVuuUN(int var0, int var1) {
      return (int)(Math.random() * (var0 - var1)) + var1;
   }

   public static float nUUVuvU(float var0, float var1, float var2) {
      float var3 = VVuuUN(var0 - var1);
      if (var3 < -var2) {
         var3 = -var2;
      }

      if (var3 >= var2) {
         var3 = var2;
      }

      return var0 - var3;
   }

   public static float vNUvnnVnUvu(float var0) {
      return (float)nuUnNvnuUu(0.0, 1.0, (double)var0);
   }

   public static double nuUnNvnuUu(double var0, double var2, double var4) {
      return Math.max(var0, Math.min(var2, var4));
   }
}
