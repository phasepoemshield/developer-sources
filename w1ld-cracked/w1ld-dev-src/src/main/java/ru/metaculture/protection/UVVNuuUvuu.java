package ru.metaculture.protection;

import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2761;
import net.minecraft.class_310;
import net.minecraft.class_640;

public class UVVNuuUvuu {
   private static final double uUnuvNvvNU = 50.0;
   private static final double vVvUvVVuuNvV = 1.0E-6;
   private static final double uNNnnnuuuN = 1000000.0;
   private static final long nuUnNvnuUu = 5000000000L;
   private static final double VVuuUN = 0.15;
   private static final double vNUvnnVnUvu = 0.125;
   public static long UuUVuuUu = System.currentTimeMillis() - 588L;
   public static double C00OOC00oO = 20.0;
   private static volatile long uVUuuVnNVU = System.nanoTime();
   private static volatile long vuuuNvNuv;
   private static volatile double nvUVNnuu;
   private static volatile double UuuNnUvUuv;
   private static volatile boolean nUUVuvU;

   public static boolean UuUVuuUu(uvUUuvnunU var0) {
      if (var0 != null && var0.uNNnnnuuuN() == uvUUuvnunU.NVnVnNnN.RECEIVE) {
         class_2596 var1 = var0.vVvUvVVuuNvV();
         long var2 = System.nanoTime();
         if (var1 instanceof class_2761) {
            UuUVuuUu(var2, System.currentTimeMillis());
            return true;
         } else {
            if (var1 instanceof class_2670) {
               UuUVuuUu(var2);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public static void UuUVuuUu(long var0, long var2) {
      long var4 = UuUVuuUu;
      float var6 = (float)(var2 - var4);
      float var7 = var6 / 1000.0F;
      float var8 = var7 > 0.0F ? 20.0F / var7 : 20.0F;
      C00OOC00oO = Math.min(var8, 20.0F);
      UuUVuuUu = var2;
      UuUVuuUu(var0, true);
   }

   public static void UuUVuuUu(long var0) {
      UuUVuuUu(var0, false);
   }

   private static void UuUVuuUu(long var0, boolean var2) {
      long var3 = vuuuNvNuv;
      if (var3 > 0L) {
         uNNnnnuuuN(var0 - var3);
      }

      vuuuNvNuv = var0;
      if (var2 || uVUuuVnNVU == 0L) {
         uVUuuVnNVU = var0;
         nUUVuvU = true;
      }

      VVuuUN();
   }

   private static void uNNnnnuuuN(long var0) {
      if (var0 > 0L) {
         double var2 = var0 * 1.0E-6;
         double var4 = Math.max(1.0, Math.rint(var2 / 50.0));
         double var6 = Math.abs(var2 - var4 * 50.0);
         double var8 = UuuNnUvUuv;
         UuuNnUvUuv = var8 <= 0.0 ? var6 : var8 + (var6 - var8) * 0.125;
      }
   }

   private static void VVuuUN() {
      class_310 var0 = class_310.method_1551();
      if (var0 != null && var0.field_1724 != null && var0.method_1562() != null) {
         class_640 var1 = var0.method_1562().method_2871(var0.field_1724.method_5667());
         if (var1 != null) {
            int var2 = var1.method_2959();
            if (var2 > 0 && var2 <= 2000) {
               double var3 = nvUVNnuu;
               nvUVNnuu = var3 <= 0.0 ? var2 : var3 + (var2 - var3) * 0.15;
            }
         }
      }
   }

   public static double UuUVuuUu() {
      return C00OOC00oO;
   }

   public static double C00OOC00oO() {
      return 20.0 - C00OOC00oO;
   }

   public static boolean uUnuvNvvNU() {
      return C00OOC00oO(System.nanoTime());
   }

   public static boolean C00OOC00oO(long var0) {
      long var2 = uVUuuVnNVU;
      long var4 = var0 - var2;
      return nUUVuvU && var2 > 0L && var4 >= 0L && var4 <= 5000000000L;
   }

   public static double uUnuvNvvNU(long var0) {
      if (!C00OOC00oO(var0)) {
         return 50.0;
      } else {
         double var2 = vVvUvVVuuNvV(var0);
         double var4 = 50.0 - var2;
         return var4 <= 0.0 ? 50.0 : var4;
      }
   }

   public static double vVvUvVVuuNvV(long var0) {
      long var2 = uVUuuVnNVU;
      if (var2 <= 0L) {
         return 0.0;
      } else {
         double var4 = (var0 - var2) * 1.0E-6 + nvUVNnuu * 0.5;
         var4 %= 50.0;
         if (var4 < 0.0) {
            var4 += 50.0;
         }

         return var4;
      }
   }

   public static long UuUVuuUu(long var0, double var2) {
      if (!C00OOC00oO(var0)) {
         return 0L;
      } else {
         double var4 = vVvUvVVuuNvV(var0);
         double var6 = var2 - var4;
         if (var6 < 0.0) {
            var6 += 50.0;
         }

         return (long)(var6 * 1000000.0);
      }
   }

   public static double vVvUvVVuuNvV() {
      return nvUVNnuu;
   }

   public static double uNNnnnuuuN() {
      return UuuNnUvUuv;
   }

   public static void nuUnNvnuUu() {
      UuUVuuUu = System.currentTimeMillis() - 588L;
      C00OOC00oO = 20.0;
      uVUuuVnNVU = System.nanoTime();
      vuuuNvNuv = 0L;
      nvUVNnuu = 0.0;
      UuuNnUvUuv = 0.0;
      nUUVuvU = false;
   }
}
