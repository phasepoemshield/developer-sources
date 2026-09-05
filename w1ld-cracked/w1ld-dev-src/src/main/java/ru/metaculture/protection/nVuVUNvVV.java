package ru.metaculture.protection;

import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;

public final class nVuVUNvVV {
   private static final double UuUVuuUu = 1.0E-7;
   private static volatile boolean C00OOC00oO = false;
   private static volatile double uUnuvNvvNU = 0.0;
   private static volatile double vVvUvVVuuNvV = 0.0;
   private static volatile double uNNnnnuuuN = 0.0;
   private static volatile float nuUnNvnuUu = 0.0F;
   private static volatile boolean VVuuUN = true;
   private static volatile boolean vNUvnnVnUvu = false;
   private static volatile boolean uVUuuVnNVU = false;
   private static volatile float vuuuNvNuv = 0.0F;
   private static volatile float nvUVNnuu = 0.0F;
   private static volatile double UuuNnUvUuv = 0.0;
   private static volatile double nUUVuvU = 0.0;
   private static volatile boolean UnUNVVVNuv = false;
   private static volatile long vNVuvnUUnuUn = 0L;
   private static volatile long UvnvNVnnnnNU = 0L;
   private static volatile long uVUVnuvnuVuv = 0L;

   private nVuVUNvVV() {
   }

   public static void UuUVuuUu(class_2596<?> var0) {
      if (var0 instanceof class_2848 var9) {
         UuUVuuUu(var9);
         vNVuvnUUnuUn = System.currentTimeMillis();
      } else if (var0 instanceof class_2828 var1) {
         boolean var2 = var1.method_12273();
         if (var1.method_36172()) {
            vuuuNvNuv = var1.method_12271(vuuuNvNuv);
            nvUVNnuu = var1.method_12270(nvUVNnuu);
            uVUuuVnNVU = true;
            uVUVnuvnuVuv = System.currentTimeMillis();
         }

         if (var1.method_36171()) {
            double var3 = var1.method_12269(uUnuvNvvNU);
            double var5 = var1.method_12268(vVvUvVVuuNvV);
            double var7 = var1.method_12274(uNNnnnuuuN);
            UuUVuuUu(var3, var5, var7, var2);
         } else {
            C00OOC00oO(var2);
         }

         vNVuvnUUnuUn = System.currentTimeMillis();
      }
   }

   public static void C00OOC00oO(class_2596<?> var0) {
      if (var0 instanceof class_2678 || var0 instanceof class_2724) {
         UuuNnUvUuv();
      }
   }

   private static void UuUVuuUu(class_2848 var0) {
      class_2849 var1 = var0.method_12365();
      if (var1 == class_2849.field_12981) {
         vNUvnnVnUvu = true;
         UvnvNVnnnnNU = System.currentTimeMillis();
      } else {
         if (var1 == class_2849.field_12985) {
            vNUvnnVnUvu = false;
            UvnvNVnnnnNU = System.currentTimeMillis();
         }
      }
   }

   private static void UuUVuuUu(double var0, double var2, double var4, boolean var6) {
      if (!C00OOC00oO) {
         C00OOC00oO = true;
         uUnuvNvvNU = var0;
         vVvUvVVuuNvV = var2;
         uNNnnnuuuN = var4;
         VVuuUN = var6;
         nuUnNvnuUu = 0.0F;
         UuuNnUvUuv = 0.0;
         nUUVuvU = 0.0;
         UnUNVVVNuv = false;
      } else {
         double var7 = var2 - vVvUvVVuuNvV;
         nUUVuvU = UuuNnUvUuv;
         UuuNnUvUuv = var7;
         UnUNVVVNuv = !var6 && nUUVuvU > 1.0E-7 && var7 < -1.0E-7;
         if (var6) {
            nuUnNvnuUu = 0.0F;
         } else if (var7 < -1.0E-7) {
            nuUnNvnuUu += (float)(-var7);
         }

         uUnuvNvvNU = var0;
         vVvUvVVuuNvV = var2;
         uNNnnnuuuN = var4;
         VVuuUN = var6;
      }
   }

   private static void C00OOC00oO(boolean var0) {
      VVuuUN = var0;
      if (var0) {
         nuUnNvnuUu = 0.0F;
         UnUNVVVNuv = false;
      }
   }

   public static float UuUVuuUu() {
      return nuUnNvnuUu;
   }

   public static boolean C00OOC00oO() {
      return VVuuUN;
   }

   public static boolean uUnuvNvvNU() {
      return vNUvnnVnUvu;
   }

   public static boolean vVvUvVVuuNvV() {
      return uVUuuVnNVU;
   }

   public static float UuUVuuUu(float var0) {
      return uVUuuVnNVU ? vuuuNvNuv : var0;
   }

   public static float C00OOC00oO(float var0) {
      return uVUuuVnNVU ? nvUVNnuu : var0;
   }

   public static void UuUVuuUu(boolean var0) {
      vNUvnnVnUvu = var0;
      UvnvNVnnnnNU = System.currentTimeMillis();
   }

   public static double uNNnnnuuuN() {
      return UuuNnUvUuv;
   }

   public static double nuUnNvnuUu() {
      return nUUVuvU;
   }

   public static boolean VVuuUN() {
      return UnUNVVVNuv;
   }

   public static long vNUvnnVnUvu() {
      return vNVuvnUUnuUn;
   }

   public static long uVUuuVnNVU() {
      return UvnvNVnnnnNU;
   }

   public static long vuuuNvNuv() {
      return uVUVnuvnuVuv;
   }

   public static boolean nvUVNnuu() {
      return C00OOC00oO;
   }

   public static void UuuNnUvUuv() {
      C00OOC00oO = false;
      uUnuvNvvNU = 0.0;
      vVvUvVVuuNvV = 0.0;
      uNNnnnuuuN = 0.0;
      nuUnNvnuUu = 0.0F;
      VVuuUN = true;
      vNUvnnVnUvu = false;
      uVUuuVnNVU = false;
      vuuuNvNuv = 0.0F;
      nvUVNnuu = 0.0F;
      UuuNnUvUuv = 0.0;
      nUUVuvU = 0.0;
      UnUNVVVNuv = false;
      vNVuvnUUnuUn = 0L;
      UvnvNVnnnnNU = 0L;
      uVUVnuvnuVuv = 0L;
   }
}
