package ru.metaculture.protection;

public final class UNVVnNnnNNVv {
   private static final float UuUVuuUu = 1.5F;
   private static final float C00OOC00oO = 0.875F;
   private static final float uUnuvNvvNU = 0.5625F;
   private static final float vVvUvVVuuNvV = -0.25F;
   private static final float uNNnnnuuuN = 0.25F;
   private static final float nuUnNvnuUu = 0.0F;
   private static final float VVuuUN = 0.375F;
   private static final float vNUvnnVnUvu = -0.25F;
   private static final float uVUuuVnNVU = 0.25F;
   private static final float vuuuNvNuv = 0.375F;
   private static final float nvUVNnuu = 0.75F;
   private static final float UuuNnUvUuv = -0.5F;
   private static final float nUUVuvU = -0.25F;
   private static final float UnUNVVVNuv = 0.25F;
   private static final float vNVuvnUUnuUn = 0.5F;
   private static final float UvnvNVnnnnNU = -0.25F;
   private static final float uVUVnuvnuVuv = 0.25F;
   private static final float NVNnnvnuunNv = 0.75F;
   private static final float uVunuUNVVUUV = 1.0F;

   private UNVVnNnnNNVv() {
   }

   public static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (var0 != null && !(var7 <= 1.0F) && !(var8 <= 1.0F) && !(var9 <= 0.001F)) {
         C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         UuUVuuUu(var0, var5, var6, var7, var8, var9);
      }
   }

   public static float[] UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return new float[]{var0 + var4 * var2, var1 - var5 * var3};
   }

   public static float[] C00OOC00oO(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = UuUVuuUu(var4 / 30.0F * 0.42F, -0.48F, 0.48F);
      float var7 = UuUVuuUu(0.875F - var5 / 90.0F * 0.38F, 0.08F, 0.98F);
      return UuUVuuUu(var0, var1, var2, var3, var6, var7);
   }

   public static float UuUVuuUu(float var0, float var1) {
      return var0 - 0.875F * var1;
   }

   public static float C00OOC00oO(float var0, float var1) {
      return var0 - 0.5625F * var1;
   }

   public static boolean uUnuvNvvNU(float var0, float var1) {
      if (var1 < 0.0F || var1 > 1.0F) {
         return false;
      } else if (uUnuvNvvNU(var0, var1, -0.25F, 0.25F, 0.75F, 1.0F)) {
         return true;
      } else if (uUnuvNvvNU(var0, var1, -0.25F, 0.25F, 0.375F, 0.75F)) {
         return true;
      } else if (uUnuvNvvNU(var0, var1, -0.5F, -0.25F, 0.375F, 0.75F)) {
         return true;
      } else if (uUnuvNvvNU(var0, var1, 0.25F, 0.5F, 0.375F, 0.75F)) {
         return true;
      } else {
         if (var1 <= 0.375F) {
            if (var0 >= -0.25F && var0 < 0.0F) {
               return true;
            }

            if (var0 >= 0.0F && var0 <= 0.25F) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean uUnuvNvvNU(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 <= var3 && var1 >= var4 && var1 <= var5;
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5) {
      int var6 = UuUVuuUu(86, 112, 162, Math.round(82.0F * var5));
      int var7 = UuUVuuUu(58, 78, 118, Math.round(95.0F * var5));
      int var8 = UuUVuuUu(155, 188, 238, Math.round(65.0F * var5));
      UuUVuuUu(var0, var1, var2, var3, var4, -0.25F, 0.0F, 0.0F, 0.375F, var7, var8);
      UuUVuuUu(var0, var1, var2, var3, var4, 0.0F, 0.25F, 0.0F, 0.375F, var7, var8);
      UuUVuuUu(var0, var1, var2, var3, var4, -0.25F, 0.25F, 0.375F, 0.75F, var6, var8);
      UuUVuuUu(var0, var1, var2, var3, var4, -0.5F, -0.25F, 0.375F, 0.75F, var6, var8);
      UuUVuuUu(var0, var1, var2, var3, var4, 0.25F, 0.5F, 0.375F, 0.75F, var6, var8);
      UuUVuuUu(var0, var1, var2, var3, var4, -0.25F, 0.25F, 0.75F, 1.0F, var6, var8);
   }

   private static void UuUVuuUu(
      UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10
   ) {
      float var11 = var1 + var5 * var3;
      float var12 = var2 - var8 * var4;
      float var13 = (var6 - var5) * var3;
      float var14 = (var8 - var7) * var4;
      var0.UuUVuuUu(var11, var12, var13, var14, 1.5F, var10, 1.0F);
      var0.UuUVuuUu(var11, var12, var13, var14, 1.5F, var9);
   }

   public static void UuUVuuUu(
      UnVNvNnU var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      if (var0 != null && !(var12 <= 0.001F)) {
         float[] var13 = C00OOC00oO(var1, var2, var3, var4, 0.0F, 0.0F);
         float[] var14 = C00OOC00oO(var1, var2, var3, var4, var5, var6);
         float var15 = UuUVuuUu(0.875F - var8 / 90.0F * 0.38F, 0.08F, 0.98F);
         float var16 = UuUVuuUu(0.875F - var7 / 90.0F * 0.38F, 0.08F, 0.98F);
         float var17 = var2 - Math.max(var15, var16) * var4;
         float var18 = var2 - Math.min(var15, var16) * var4;
         float var19 = Math.max(3.0F, var18 - var17);
         var0.UuUVuuUu(var1 + -0.25F * var3, var17, 0.5F * var3, var19, 1.5F, UuUVuuUu(95, 210, 255, Math.round(18.0F * var12)));
         var0.UuUVuuUu(var1 + -0.25F * var3, var17, 0.5F * var3, var19, 1.5F, UuUVuuUu(95, 210, 255, Math.round(55.0F * var12)), 1.0F);
         UuUVuuUu(var0, var13[0], var13[1], UuUVuuUu(95, 210, 255, Math.round(200.0F * var12)), 5.0F);
         if (Math.abs(var5) > 0.05F || Math.abs(var6) > 0.05F) {
            UuUVuuUu(var0, var13[0], var13[1], var14[0], var14[1], UuUVuuUu(95, 210, 255, Math.round(100.0F * var12)), 1.2F);
            UuUVuuUu(var0, var14[0], var14[1], UuUVuuUu(95, 210, 255, Math.round(220.0F * var12)), 4.5F);
         }

         if (var9 > 0.001F) {
            float var20 = UuUVuuUu(var5 / 30.0F * 0.42F + var9 * 0.55F, -0.48F, 0.48F);
            float var21 = UuUVuuUu(0.875F - var6 / 90.0F * 0.38F, 0.08F, 0.98F);
            float[] var22 = UuUVuuUu(var1, var2, var3, var4, var20, var21);
            UuUVuuUu(var0, var14[0], var14[1], var22[0], var22[1], UuUVuuUu(255, 190, 90, Math.round(160.0F * var12)), 1.4F);
            UuUVuuUu(var0, var22[0], var22[1], UuUVuuUu(255, 190, 90, Math.round(220.0F * var12)), 4.0F);
         }

         UuUVuuUu(var0, var10, var11, UuUVuuUu(255, 90, 110, Math.round(230.0F * var12)), 6.0F);
         var0.UuUVuuUu(var10 - 5.0F, var11 - 5.0F, 10.0F, 10.0F, 1.5F, UuUVuuUu(255, 90, 110, Math.round(30.0F * var12)));
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, int var3, float var4) {
      var0.UuUVuuUu(var1 - var4, var2 - 0.75F, var4 * 2.0F, 1.5F, 0.0F, var3);
      var0.UuUVuuUu(var1 - 0.75F, var2 - var4, 1.5F, var4 * 2.0F, 0.0F, var3);
      var0.UuUVuuUu(var1 - 1.5F, var2 - 1.5F, 3.0F, 3.0F, 0.0F, UuUVuuUu(255, 255, 255, 220));
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, int var5, float var6) {
      float var7 = var3 - var1;
      float var8 = var4 - var2;
      float var9 = (float)Math.hypot(var7, var8);
      if (!(var9 < 1.0F)) {
         float var10 = (var1 + var3) * 0.5F;
         float var11 = (var2 + var4) * 0.5F;
         float var12 = (float)Math.toDegrees(Math.atan2(var8, var7));
         var0.UuUVuuUu(var10, var11);
         var0.C00OOC00oO(var12);
         var0.UuUVuuUu(-var9 * 0.5F, -var6 * 0.5F, var9, var6, 0.0F, var5);
         var0.vNUvnnVnUvu();
         var0.vNUvnnVnUvu();
      }
   }

   private static void C00OOC00oO(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var6 - var8;
      var0.C00OOC00oO(
         var5 - var7 * 0.52F,
         var10 - 4.0F,
         var7 * 1.04F,
         var8 + 10.0F,
         1.5F,
         UuUVuuUu(70, 95, 140, Math.round(10.0F * var9)),
         UuUVuuUu(10, 14, 22, Math.round(4.0F * var9))
      );
      var0.UuUVuuUu(var5 - var7 * 0.25F, var6 - 1.0F, var7 * 0.5F, 6.0F, 1.5F, 10.0F, 1.0F, UuUVuuUu(95, 160, 255, Math.round(20.0F * var9)));
      var0.UuUVuuUu(var1 + 10.0F, var6, var3 - 20.0F, 1.0F, 0.0F, UuUVuuUu(120, 170, 255, Math.round(45.0F * var9)));
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }
}
