package ru.metaculture.protection;

public final class vvUUNnVVuUu {
   public static final float UuUVuuUu = 0.995F;
   public static final float C00OOC00oO = 0.055F;
   public static final float uUnuvNvvNU = 0.085F;
   public static final float vVvUvVVuuNvV = 0.02F;
   public static final float uNNnnnuuuN = 0.026F;
   public static final float nuUnNvnuUu = 0.009F;
   public static final float VVuuUN = 0.055F;
   public static final float vNUvnnVnUvu = 0.24F;

   private vvUUNnVVuUu() {
   }

   public static float UuUVuuUu(float var0) {
      return 1.0F;
   }

   public static float C00OOC00oO(float var0) {
      return UuUVuuUu(0.018F, 0.88F, var0);
   }

   public static float uUnuvNvvNU(float var0) {
      return UuUVuuUu(var0, 0.035F, 0.19F, 0.74F, 0.985F) * 0.055F;
   }

   public static float vVvUvVVuuNvV(float var0) {
      return UuUVuuUu(var0, 0.025F, 0.17F, 0.68F, 0.975F) * 0.085F;
   }

   public static int uNNnnnuuuN(float var0) {
      return 6;
   }

   public static float UuUVuuUu(float var0, float var1) {
      return 0.02F * uNNnnnuuuN(var0, var1);
   }

   public static float C00OOC00oO(float var0, float var1) {
      return 0.026F * uNNnnnuuuN(var0, var1);
   }

   public static float uUnuvNvvNU(float var0, float var1) {
      float var2 = uNNnnnuuuN(var0, var1);
      return 0.009F * var2 * var2;
   }

   public static float vVvUvVVuuNvV(float var0, float var1) {
      return 0.24F * uNNnnnuuuN(var0, var1);
   }

   private static float uNNnnnuuuN(float var0, float var1) {
      return nuUnNvnuUu(var1) * UuUVuuUu(0.02F, 0.98F, var0);
   }

   private static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      return UuUVuuUu(var1, var2, var0) * (1.0F - UuUVuuUu(var3, var4, var0));
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = nuUnNvnuUu((var2 - var0) / Math.max(1.0E-6F, var1 - var0));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float nuUnNvnuUu(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}
