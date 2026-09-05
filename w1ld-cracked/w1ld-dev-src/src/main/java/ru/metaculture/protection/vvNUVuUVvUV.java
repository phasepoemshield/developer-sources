package ru.metaculture.protection;

public final class vvNUVuUVvUV {
   public static final int UuUVuuUu = 256;
   public static final int C00OOC00oO = 10;
   public static final int uUnuvNvvNU = 24;
   public static final int vVvUvVVuuNvV = 52992;
   public static final int uNNnnnuuuN = 6;
   public static final float nuUnNvnuUu = 0.0625F;
   public static final float VVuuUN = (float)Math.sqrt(0.17626953F) + 0.14F;
   public static final float vNUvnnVnUvu = 0.286F;
   public static final float uVUuuVnNVU = -0.515625F;
   public static final float vuuuNvNuv = -0.801625F;
   public static final float nvUVNnuu = 0.105F;
   public static final float UuuNnUvUuv = VVuuUN * 0.105F;
   public static final float nUUVuvU = -0.771595F;
   public static final float UnUNVVVNuv = VVuuUN * 1.008F;
   public static final float vNVuvnUUnuUn = VVuuUN * 1.025F;
   public static final float UvnvNVnnnnNU = VVuuUN * 0.025F;
   public static final float uVUVnuvnuVuv = VVuuUN * 0.022F;
   public static final float NVNnnvnuunNv = -0.515625F;
   public static final float uVunuUNVVUUV = 0.985F;
   public static final float UNnVVNvvnVvU = 0.985F;
   public static final float uNnUnnuNUnNu = 0.88F;
   public static final float NnUuNNU = 0.82F;
   public static final float nNvNUVU = 0.7F;
   private static final float UnUNuUU = UnUNVVVNuv - UuuNnUvUuv;
   private static final float uUVuVvuNUvnu = 0.25597F;
   private static final float UvUvUNuvNU = VVuuUN * 0.25597F / (0.286F * UnUNuUU);
   private static final float c0oOOCcCoC0 = (float) (Math.PI * 2);
   private static final float[] VVnVNnunVvu = new float[257];
   private static final float[] unNNVVNnvvV = new float[257];
   private static final float[] NuunnvnN = new float[25];
   private static final float[] NVUunUNUN = new float[25];

   private vvNUVuUVvUV() {
   }

   public static void UuUVuuUu(vvNUVuUVvUV.NVnVnNnN var0) {
      vVvUvVVuuNvV(var0);
      uUnuvNvvNU(var0);
      uNNnnnuuuN(var0);
   }

   public static void C00OOC00oO(vvNUVuUVvUV.NVnVnNnN var0) {
      UuUVuuUu(
         var0,
         0.0F,
         -0.515625F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         -0.515625F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         -0.515625F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         -0.515625F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F
      );
   }

   public static float UuUVuuUu(float var0, float var1) {
      float var2 = Math.max(0.0F, var0);
      float var3 = (float)Math.sqrt((var2 - vNVuvnUUnuUn) * (var2 - vNVuvnUUnuUn) + var1 * var1);
      float var4 = UuUVuuUu((var3 - 0.1F) / 0.18F);
      float var5 = Math.max(UuUVuuUu((var2 - vNVuvnUUnuUn * 0.72F) / (vNVuvnUUnuUn * 0.23F)), UuUVuuUu((Math.abs(var1) - 0.12F) / 0.2F));
      return var4 * var5;
   }

   private static void uUnuvNvvNU(vvNUVuUVvUV.NVnVnNnN var0) {
      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = var1 + 1;
         float var3 = var1 / 256.0F;
         float var4 = var2 / 256.0F;
         float var5 = unNNVVNnvvV[var1];
         float var6 = VVnVNnunVvu[var1];
         float var7 = unNNVVNnvvV[var2];
         float var8 = VVnVNnunVvu[var2];
         UuUVuuUu(
            var0,
            var5 * UuuNnUvUuv,
            -0.771595F,
            var6 * UuuNnUvUuv,
            var5 * 0.25597F,
            -UnUNuUU,
            var6 * 0.25597F,
            var3,
            0.105F,
            0.7216F,
            var5 * UnUNVVVNuv,
            -0.515625F,
            var6 * UnUNVVVNuv,
            var5 * 0.25597F,
            -UnUNuUU,
            var6 * 0.25597F,
            var3,
            0.985F,
            0.88F,
            var7 * UnUNVVVNuv,
            -0.515625F,
            var8 * UnUNVVVNuv,
            var7 * 0.25597F,
            -UnUNuUU,
            var8 * 0.25597F,
            var4,
            0.985F,
            0.88F,
            var7 * UuuNnUvUuv,
            -0.771595F,
            var8 * UuuNnUvUuv,
            var7 * 0.25597F,
            -UnUNuUU,
            var8 * 0.25597F,
            var4,
            0.105F,
            0.7216F
         );
      }
   }

   private static void vVvUvVVuuNvV(vvNUVuUVvUV.NVnVnNnN var0) {
      for (int var1 = 0; var1 < 10; var1++) {
         float var2 = var1 / 10.0F;
         float var3 = (var1 + 1) / 10.0F;
         float var4 = UuuNnUvUuv * var2;
         float var5 = UuuNnUvUuv * var3;
         float var6 = -0.801625F + 0.030030001F * ((UvUvUNuvNU - 2.0F) * var2 * var2 * var2 + (3.0F - UvUvUNuvNU) * var2 * var2);
         float var7 = -0.801625F + 0.030030001F * ((UvUvUNuvNU - 2.0F) * var3 * var3 * var3 + (3.0F - UvUvUNuvNU) * var3 * var3);
         float var8 = 0.286F * (3.0F * (UvUvUNuvNU - 2.0F) * var2 * var2 + 2.0F * (3.0F - UvUvUNuvNU) * var2);
         float var9 = 0.286F * (3.0F * (UvUvUNuvNU - 2.0F) * var3 * var3 + 2.0F * (3.0F - UvUvUNuvNU) * var3);
         float var10 = 0.105F * var2;
         float var11 = 0.105F * var3;
         float var12 = 0.7F + 0.021600008F * var2;
         float var13 = 0.7F + 0.021600008F * var3;

         for (int var14 = 0; var14 < 256; var14++) {
            int var15 = var14 + 1;
            float var16 = var14 / 256.0F;
            float var17 = var15 / 256.0F;
            float var18 = unNNVVNnvvV[var14];
            float var19 = VVnVNnunVvu[var14];
            float var20 = unNNVVNnvvV[var15];
            float var21 = VVnVNnunVvu[var15];
            if (var1 == 0) {
               float var22 = (var14 + 0.5F) / 256.0F;
               UuUVuuUu(
                  var0,
                  0.0F,
                  -0.801625F,
                  0.0F,
                  0.0F,
                  -1.0F,
                  0.0F,
                  var22,
                  2.0F + var10,
                  var12,
                  var18 * var5,
                  var7,
                  var19 * var5,
                  var18 * var9,
                  -VVuuUN,
                  var19 * var9,
                  var16,
                  2.0F + var11,
                  var13,
                  var20 * var5,
                  var7,
                  var21 * var5,
                  var20 * var9,
                  -VVuuUN,
                  var21 * var9,
                  var17,
                  2.0F + var11,
                  var13
               );
            } else {
               UuUVuuUu(
                  var0,
                  var18 * var4,
                  var6,
                  var19 * var4,
                  var18 * var8,
                  -VVuuUN,
                  var19 * var8,
                  var16,
                  2.0F + var10,
                  var12,
                  var18 * var5,
                  var7,
                  var19 * var5,
                  var18 * var9,
                  -VVuuUN,
                  var19 * var9,
                  var16,
                  2.0F + var11,
                  var13,
                  var20 * var5,
                  var7,
                  var21 * var5,
                  var20 * var9,
                  -VVuuUN,
                  var21 * var9,
                  var17,
                  2.0F + var11,
                  var13,
                  var20 * var4,
                  var6,
                  var21 * var4,
                  var20 * var8,
                  -VVuuUN,
                  var21 * var8,
                  var17,
                  2.0F + var10,
                  var12
               );
            }
         }
      }
   }

   private static void uNNnnnuuuN(vvNUVuUVvUV.NVnVnNnN var0) {
      for (int var1 = 0; var1 < 256; var1++) {
         int var2 = var1 + 1;
         float var3 = var1 / 256.0F;
         float var4 = var2 / 256.0F;
         float var5 = unNNVVNnvvV[var1];
         float var6 = VVnVNnunVvu[var1];
         float var7 = unNNVVNnvvV[var2];
         float var8 = VVnVNnunVvu[var2];

         for (int var9 = 0; var9 < 24; var9++) {
            int var10 = var9 + 1;
            float var11 = vNVuvnUUnuUn + UvnvNVnnnnNU * NVUunUNUN[var9];
            float var12 = vNVuvnUUnuUn + UvnvNVnnnnNU * NVUunUNUN[var10];
            float var13 = -0.515625F + uVUVnuvnuVuv * NuunnvnN[var9];
            float var14 = -0.515625F + uVUVnuvnuVuv * NuunnvnN[var10];
            float var15 = NVUunUNUN[var9] / UvnvNVnnnnNU;
            float var16 = NuunnvnN[var9] / uVUVnuvnuVuv;
            float var17 = NVUunUNUN[var10] / UvnvNVnnnnNU;
            float var18 = NuunnvnN[var10] / uVUVnuvnuVuv;
            float var19 = 0.985F * var9 / 24.0F;
            float var20 = 0.985F * var10 / 24.0F;
            UuUVuuUu(
               var0,
               var5 * var11,
               var13,
               var6 * var11,
               var5 * var15,
               var16,
               var6 * var15,
               var3,
               1.0F + var19,
               1.0F,
               var5 * var12,
               var14,
               var6 * var12,
               var5 * var17,
               var18,
               var6 * var17,
               var3,
               1.0F + var20,
               1.0F,
               var7 * var12,
               var14,
               var8 * var12,
               var7 * var17,
               var18,
               var8 * var17,
               var4,
               1.0F + var20,
               1.0F,
               var7 * var11,
               var13,
               var8 * var11,
               var7 * var15,
               var16,
               var8 * var15,
               var4,
               1.0F + var19,
               1.0F
            );
         }
      }
   }

   private static void UuUVuuUu(
      vvNUVuUVvUV.NVnVnNnN var0,
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
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      float var25,
      float var26,
      float var27,
      float var28,
      float var29,
      float var30,
      float var31,
      float var32,
      float var33,
      float var34,
      float var35,
      float var36
   ) {
      UuUVuuUu(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27
      );
      UuUVuuUu(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33,
         var34,
         var35,
         var36
      );
   }

   private static void UuUVuuUu(
      vvNUVuUVvUV.NVnVnNnN var0,
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
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      float var25,
      float var26,
      float var27
   ) {
      var0.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      var0.UuUVuuUu(var10, var11, var12, var13, var14, var15, var16, var17, var18);
      var0.UuUVuuUu(var19, var20, var21, var22, var23, var24, var25, var26, var27);
   }

   private static float UuUVuuUu(float var0) {
      float var1 = Math.max(0.0F, Math.min(1.0F, var0));
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   static {
      for (int var0 = 0; var0 <= 256; var0++) {
         float var1 = (float) (Math.PI * 2) * var0 / 256.0F;
         VVnVNnunVvu[var0] = (float)Math.sin(var1);
         unNNVVNnvvV[var0] = (float)Math.cos(var1);
      }

      VVnVNnunVvu[256] = 0.0F;
      unNNVVNnvvV[256] = 1.0F;

      for (int var2 = 0; var2 <= 24; var2++) {
         float var3 = (float) (Math.PI * 2) * var2 / 24.0F;
         NuunnvnN[var2] = (float)Math.sin(var3);
         NVUunUNUN[var2] = (float)Math.cos(var3);
      }

      NuunnvnN[24] = 0.0F;
      NVUunUNUN[24] = 1.0F;
   }

   public interface NVnVnNnN {
      void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);
   }
}
