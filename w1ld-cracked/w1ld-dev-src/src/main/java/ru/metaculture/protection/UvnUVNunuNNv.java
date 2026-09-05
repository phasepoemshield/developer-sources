package ru.metaculture.protection;

import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.joml.Quaternionf;

final class UvnUVNunuNNv {
   private static class_4184 UuUVuuUu;
   private static double C00OOC00oO = Double.NaN;
   private static double uUnuvNvvNU = Double.NaN;
   private static double vVvUvVVuuNvV = Double.NaN;
   private static float uNNnnnuuuN = Float.NaN;
   private static float nuUnNvnuUu = Float.NaN;
   private static float VVuuUN = Float.NaN;
   private static float vNUvnnVnUvu = Float.NaN;
   private static double uVUuuVnNVU;
   private static double vuuuNvNuv;
   private static double nvUVNnuu;
   private static float UuuNnUvUuv;
   private static float nUUVuvU;
   private static float UnUNVVVNuv;
   private static float vNVuvnUUnuUn;
   private static float UvnvNVnnnnNU;
   private static float uVUVnuvnuVuv;

   private UvnUVNunuNNv() {
   }

   static void UuUVuuUu(class_4184 var0) {
      class_243 var1 = var0.method_19326();
      Quaternionf var2 = var0.method_23767();
      float var3 = var2.x();
      float var4 = var2.y();
      float var5 = var2.z();
      float var6 = var2.w();
      if (var0 != UuUVuuUu
         || var1.field_1352 != C00OOC00oO
         || var1.field_1351 != uUnuvNvvNU
         || var1.field_1350 != vVvUvVVuuNvV
         || var3 != uNNnnnuuuN
         || var4 != nuUnNvnuUu
         || var5 != VVuuUN
         || var6 != vNUvnnVnUvu) {
         UuUVuuUu = var0;
         C00OOC00oO = var1.field_1352;
         uUnuvNvvNU = var1.field_1351;
         vVvUvVVuuNvV = var1.field_1350;
         uNNnnnuuuN = var3;
         nuUnNvnuUu = var4;
         VVuuUN = var5;
         vNUvnnVnUvu = var6;
         uVUuuVnNVU = var1.field_1352;
         vuuuNvNuv = var1.field_1351;
         nvUVNnuu = var1.field_1350;
         UuuNnUvUuv = 1.0F - 2.0F * (var4 * var4 + var5 * var5);
         nUUVuvU = 2.0F * (var3 * var4 + var5 * var6);
         UnUNVVVNuv = 2.0F * (var3 * var5 - var4 * var6);
         vNVuvnUUnuUn = 2.0F * (var3 * var4 - var5 * var6);
         UvnvNVnnnnNU = 1.0F - 2.0F * (var3 * var3 + var5 * var5);
         uVUVnuvnuVuv = 2.0F * (var4 * var5 + var3 * var6);
      }
   }

   static double UuUVuuUu() {
      return uVUuuVnNVU;
   }

   static double C00OOC00oO() {
      return vuuuNvNuv;
   }

   static double uUnuvNvvNU() {
      return nvUVNnuu;
   }

   static float vVvUvVVuuNvV() {
      return UuuNnUvUuv;
   }

   static float uNNnnnuuuN() {
      return nUUVuvU;
   }

   static float nuUnNvnuUu() {
      return UnUNVVVNuv;
   }

   static float VVuuUN() {
      return vNVuvnUUnuUn;
   }

   static float vNUvnnVnUvu() {
      return UvnvNVnnnnNU;
   }

   static float uVUuuVnNVU() {
      return uVUVnuvnuVuv;
   }
}
