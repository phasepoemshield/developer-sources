package ru.metaculture.protection;

import java.awt.Color;

public class UvNnVvNNVvuN extends UUVNUUUnNUv {
   public static final float nNuVunNUVu = 160.0F;
   public static final float UNvvunVVn = 119.0F;
   public static final float UnvuVuVnNuvu = 6.0F;
   public static final float UvNNVUVNVuvV = 5.0F;
   public static final float NnunUUnU = 132.0F;
   public static final float nvuVvuNnNUnv = 62.0F;
   public static final float NnVnNVN = 10.0F;
   public static final float vnvvNvUnVv = 7.0F;
   public static final float OCOocoOoOO = 10.0F;
   public static final float o0Ooc0COOoc = 10.0F;
   private static final int nvvnUnUn = -1577754;
   private static final int UnUUVuVunvVu = -3945532;

   public static void UuUVuuUu(UnVNvNnU var0, VnnUvVNuNuVv var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      if (var1 != null) {
         if (UUVNUUUnNUv.UvnvNVnnnnNU != 0.0F || UUVNUUUnNUv.uVUVnuvnuVuv != 0.0F) {
            UuUVuuUu(var0, var1, UUVNUUUnNUv.UvnvNVnnnnNU, UUVNUUUnNUv.uVUVnuvnuVuv, var2, var3, var4, var5, var6, var7);
         }
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, VnnUvVNuNuVv var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, float var9) {
      float var10 = UuUVuuUu(var2);
      if (UUVNUUUnNUv.VVuuUN.uUnuvNvvNU()) {
         var0.UuUVuuUu(var10, var3, 160.0F, 119.0F, 6.0F);
      }

      var0.UuUVuuUu(var10, var3, 160.0F, 119.0F, 6.0F, var7);
      var0.UuUVuuUu(var10, var3, 160.0F, 119.0F, 6.0F, var6, 0.35F);
      float var11 = C00OOC00oO(var10);
      float var12 = uUnuvNvvNU(var3);
      float var13 = vVvUvVVuuNvV(var10);
      float var14 = uNNnnnuuuN(var3);
      float var15 = nuUnNvnuUu(var3);
      float var16 = VVuuUN(var3);
      float var17 = var1.vVvUvVVuuNvV();
      float var18 = var1.vNVuvnUUnuUn;
      UuUVuuUu(var0, var11, var12, 132.0F, 62.0F, var17, var9);
      var0.UuUVuuUu(var11, var12, 132.0F, 62.0F, 4.0F, VnVnuUn.uUnuvNvvNU(var6, var9), 0.45F);
      float var19 = var11 + var1.nUUVuvU * 132.0F;
      float var20 = var12 + (1.0F - var1.UnUNVVVNuv) * 62.0F;
      var0.UuUVuuUu(var19 - 3.0F, var20 - 3.0F, 6.0F, 6.0F, 3.0F, VnVnuUn.uUnuvNvvNU(-1, var9));
      var0.UuUVuuUu(var19 - 4.0F, var20 - 4.0F, 8.0F, 8.0F, 4.0F, VnVnuUn.uUnuvNvvNU(-16777216, var9 * 0.7F), 0.4F);
      UuUVuuUu(var0, var13, var12, 10.0F, 62.0F, var9);
      var0.UuUVuuUu(var13, var12, 10.0F, 62.0F, 4.0F, VnVnuUn.uUnuvNvvNU(var6, var9), 0.45F);
      float var21 = var12 + var17 * 62.0F;
      var0.UuUVuuUu(var13 - 1.5F, var21 - 2.0F, 13.0F, 4.0F, 2.0F, VnVnuUn.uUnuvNvvNU(-1, var9));
      var0.UuUVuuUu(var13 - 1.5F, var21 - 2.0F, 13.0F, 4.0F, 2.0F, VnVnuUn.uUnuvNvvNU(-16777216, var9 * 0.65F), 0.35F);
      UuUVuuUu(var0, var11, var14, 148.0F, 7.0F, var1, var9);
      float var22 = var11 + var18 * 148.0F;
      var0.UuUVuuUu(var22 - 1.5F, var14 - 1.0F, 3.0F, 9.0F, 1.5F, VnVnuUn.uUnuvNvvNU(-1, var9));
      C00OOC00oO(var0, var11, var15, 148.0F, 10.0F, var1, var9);
      uUnuvNvvNU(var0, var11, var16, 148.0F, 10.0F, var1, var9);
   }

   public static float UuUVuuUu(float var0) {
      return var0 + (30.0F - 30.0F * UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU());
   }

   public static float C00OOC00oO(float var0) {
      return var0 + 6.0F;
   }

   public static float uUnuvNvvNU(float var0) {
      return var0 + 6.0F;
   }

   public static float vVvUvVVuuNvV(float var0) {
      return var0 + 6.0F + 132.0F + 5.0F;
   }

   public static float uNNnnnuuuN(float var0) {
      return var0 + 6.0F + 62.0F + 5.0F;
   }

   public static float nuUnNvnuUu(float var0) {
      return uNNnnnuuuN(var0) + 7.0F + 5.0F;
   }

   public static float VVuuUN(float var0) {
      return nuUnNvnuUu(var0) + 10.0F + 5.0F;
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      Color var7 = Color.getHSBColor(var5, 1.0F, 1.0F);
      var0.UuUVuuUu(var1, var2, var3, var4, 4.0F, VnVnuUn.uUnuvNvvNU(-1, var6), VnVnuUn.uUnuvNvvNU(var7.getRGB(), var6));
      var0.C00OOC00oO(var1, var2, var3, var4, 4.0F, 0, VnVnuUn.uUnuvNvvNU(-16777216, var6));
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5) {
      byte var6 = 6;
      float var7 = var4 / var6;

      for (int var8 = 0; var8 < var6; var8++) {
         float var9 = var2 + var8 * var7;
         int var10 = UuUVuuUu(var8 / 6.0F, 1.0F, 1.0F, var5);
         int var11 = UuUVuuUu((var8 + 1.0F) / 6.0F, 1.0F, 1.0F, var5);
         var0.C00OOC00oO(var1, var9, var3, var7 + 0.5F, var10, var11);
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, VnnUvVNuNuVv var5, float var6) {
      C00OOC00oO(var0, var1, var2, var3, var4, 6.0F, var6);
      int var7 = UuUVuuUu(var5.vVvUvVVuuNvV(), var5.nUUVuvU, var5.UnUNVVVNuv, 0.0F);
      int var8 = UuUVuuUu(var5.vVvUvVVuuNvV(), var5.nUUVuvU, var5.UnUNVVVNuv, var6);
      var0.UuUVuuUu(var1, var2, var3, var4, 3.0F, var7, var8);
      var0.UuUVuuUu(var1, var2, var3, var4, 3.0F, VnVnuUn.uUnuvNvvNU(-1, var6 * 0.16F), 0.35F);
   }

   private static void C00OOC00oO(UnVNvNnU var0, float var1, float var2, float var3, float var4, VnnUvVNuNuVv var5, float var6) {
      float[] var7 = new float[]{0.0F, 0.5F, -0.083333336F, 0.083333336F, 0.33333334F};
      float var8 = 3.0F;
      float var9 = (var3 - var8 * (var7.length - 1)) / var7.length;

      for (int var10 = 0; var10 < var7.length; var10++) {
         float var11 = var1 + var10 * (var9 + var8);
         C00OOC00oO(var0, var11, var2, var9, var4, 6.0F, var6 * 0.55F);
         var0.UuUVuuUu(
            var11,
            var2,
            var9,
            var4,
            3.0F,
            UuUVuuUu(var5.vVvUvVVuuNvV() + var7[var10], Math.max(var5.nUUVuvU, 0.62F), Math.max(var5.UnUNVVVNuv, 0.72F), var5.vNVuvnUUnuUn * var6)
         );
         var0.UuUVuuUu(var11, var2, var9, var4, 3.0F, VnVnuUn.uUnuvNvvNU(var10 == 0 ? -1 : -1996488705, var6 * 0.45F), 0.35F);
      }
   }

   private static void uUnuvNvvNU(UnVNvNnU var0, float var1, float var2, float var3, float var4, VnnUvVNuNuVv var5, float var6) {
      byte var7 = 9;
      float var8 = 3.0F;
      float var9 = (var3 - var8 * (var7 - 1)) / var7;
      int var10 = var5.uVUuuVnNVU();

      for (int var11 = 0; var11 < var7; var11++) {
         float var12 = var1 + var11 * (var9 + var8);
         boolean var13 = var11 == 8;
         boolean var14 = !var13 && var11 < var5.UvnvNVnnnnNU.size();
         C00OOC00oO(var0, var12, var2, var9, var4, 6.0F, var14 ? var6 * 0.6F : var6 * 0.25F);
         if (var14) {
            var0.UuUVuuUu(var12, var2, var9, var4, 3.0F, VnVnuUn.uUnuvNvvNU(var5.UvnvNVnnnnNU.get(var11), var6));
         } else {
            var0.UuUVuuUu(var12, var2, var9, var4, 3.0F, VnVnuUn.uUnuvNvvNU(var13 ? 1144649215 : 587202559, var6));
         }

         if (var13) {
            UuUVuuUu(var0, vNvnnVvvVUu.vNUvnnVnUvu, "O", var12, var2, var9, var4, 8.0F, VnVnuUn.uUnuvNvvNU(-1, var6));
         }

         boolean var15 = var14 && var5.UvnvNVnnnnNU.get(var11) == var10;
         if (var15) {
            UuUVuuUu(var0, vNvnnVvvVUu.vNUvnnVnUvu, "j", var12, var2, var9, var4, 7.0F, VnVnuUn.uUnuvNvvNU(-1, var6 * 0.9F));
         }

         var0.UuUVuuUu(var12, var2, var9, var4, 3.0F, VnVnuUn.uUnuvNvvNU(var15 ? -1 : 2013265919, var6 * (var15 ? 0.9F : 0.34F)), var15 ? 0.6F : 0.35F);
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUVnuvUu var1, String var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = UnVNvNnU.UuUVuuUu(var1, var2, var7).UuUVuuUu;
      var0.UuUVuuUu(var1, var3 + (var5 - var9) * 0.5F, var4 + var6 * 0.5F + var7 * 0.32F, var7, var2, var8);
   }

   private static void C00OOC00oO(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = false;
      float var8 = var2;

      while (var8 < var2 + var4) {
         boolean var9 = var7;
         float var10 = Math.min(var5, var2 + var4 - var8);

         for (float var11 = var1; var11 < var1 + var3; var11 += var5) {
            float var12 = Math.min(var5, var1 + var3 - var11);
            var0.UuUVuuUu(var11, var8, var12, var10, VnVnuUn.uUnuvNvvNU(var9 ? -1577754 : -3945532, var6));
            var9 = !var9;
         }

         var7 = !var7;
         var8 += var5;
      }
   }

   private static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      float var4 = var0 - (float)Math.floor(var0);
      int var5 = Color.HSBtoRGB(var4, vNUvnnVnUvu(var1), vNUvnnVnUvu(var2));
      int var6 = Math.round(vNUvnnVnUvu(var3) * 255.0F);
      return var6 << 24 | var5 & 16777215;
   }

   private static float vNUvnnVnUvu(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? Math.min(var0, 1.0F) : 0.0F;
   }
}
