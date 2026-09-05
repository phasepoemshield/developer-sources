package ru.metaculture.protection;

import net.minecraft.class_3532;

public final class UUnnnNuuV {
   public static boolean UuUVuuUu;
   public static float C00OOC00oO;
   public static float uUnuvNvvNU;
   public static float vVvUvVVuuNvV = -90.0F;
   public static float uNNnnnuuuN = 90.0F;
   private static float nuUnNvnuUu;
   private static float VVuuUN;
   private static float vNUvnnVnUvu;
   private static float uVUuuVnNVU;
   private static float vuuuNvNuv = 1.0F;

   private UUnnnNuuV() {
   }

   public static void UuUVuuUu(float var0, float var1, float var2) {
      nuUnNvnuUu = var0;
      VVuuUN = var1;
      vuuuNvNuv = class_3532.method_15363(var2, 0.05F, 1.0F);
   }

   public static void UuUVuuUu() {
      if (!UuUVuuUu) {
         vNUvnnVnUvu = 0.0F;
         uVUuuVnNVU = 0.0F;
         C00OOC00oO = 0.0F;
         uUnuvNvvNU = 0.0F;
      } else {
         vNUvnnVnUvu = vNUvnnVnUvu + (nuUnNvnuUu - vNUvnnVnUvu) * vuuuNvNuv;
         uVUuuVnNVU = uVUuuVnNVU + (VVuuUN - uVUuuVnNVU) * vuuuNvNuv;
         C00OOC00oO = vNUvnnVnUvu;
         uUnuvNvvNU = uVUuuVnNVU;
      }
   }

   public static void C00OOC00oO() {
      UuUVuuUu = false;
      C00OOC00oO = 0.0F;
      uUnuvNvvNU = 0.0F;
      vVvUvVVuuNvV = -90.0F;
      uNNnnnuuuN = 90.0F;
      nuUnNvnuUu = 0.0F;
      VVuuUN = 0.0F;
      vNUvnnVnUvu = 0.0F;
      uVUuuVnNVU = 0.0F;
      vuuuNvNuv = 1.0F;
   }
}
