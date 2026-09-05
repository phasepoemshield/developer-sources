package ru.metaculture.protection;

public final class vunUuUUNnN {
   private static final int UuUVuuUu = -15921388;
   private static final int C00OOC00oO = -15197404;
   private static final int uUnuvNvvNU = 12;
   private static final int vVvUvVVuuNvV = -15657957;
   private static final int uNNnnnuuuN = -14670802;
   private static final uUuvVvunnNuu nuUnNvnuUu = new uUuvVvunnNuu();
   private static final uUuvVvunnNuu VVuuUN = new uUuvVvunnNuu();

   private vunUuUUNnN() {
   }

   public static void UuUVuuUu(
      UnVNvNnU var0, nUVuuNUVnV var1, float var2, float var3, float var4, float var5, VuNVnnuuUun var6, float var7, float var8, float var9, float var10
   ) {
      nUvnuVnNUU var11 = var1.uNNnnnuuuN();
      NUunUunuNV var12 = var1.nuUnNvnuUu();
      var0.UuUVuuUu(var2, var3, var4, var5, var11.UuUVuuUu(10.0F), var11.UuUVuuUu(10.0F), var11.UuUVuuUu(10.0F), var11.UuUVuuUu(10.0F));

      try {
         UuUVuuUu(var0, var2, var3, var4, var5);
         vvNvVvVUVv var13 = var6 == null ? null : var6.nUUVuvU();
         if (var13 == null) {
            UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var10);
         } else {
            float var14 = (float)(System.currentTimeMillis() % 100000L) * 0.001F;
            float var15 = Math.max(var13.UuuNnUvUuv(), var13.nUUVuvU());
            float var16 = Math.min(var5 * 0.82F / var13.vuuuNvNuv(), var4 * 0.78F / var15) * Math.max(0.2F, var9);
            float var17 = var2 + var4 * 0.5F;
            float var18 = var3 + var5 * 0.5F + (float)Math.sin(var14 * 1.3F) * var16 * 0.3F;
            float var19 = var7 + (float)Math.sin(var14 * 0.25F) * 4.0F;
            nuUnNvnuUu.UuUVuuUu(var0, var13, var6.UuUVuuUu(), var17, var18, var16, var19, var8, var10, var14, true);
         }
      } finally {
         var0.uUnuvNvvNU();
         var0.nuUnNvnuUu();
      }

      var0.UuUVuuUu(var2, var3, var4, var5, var11.UuUVuuUu(10.0F), NUunUunuNV.UuUVuuUu(var12.uVunuUNVVUUV(), 96), 0.7F);
   }

   public static void UuUVuuUu(UnVNvNnU var0, vvNvVvVUVv var1, String var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 != null) {
         float var8 = Math.max(var1.UuuNnUvUuv(), var1.nUUVuvU());
         float var9 = Math.min(var6 * 0.8F / var1.vuuuNvNuv(), var5 * 0.84F / var8);
         float var10 = var3 + var5 * 0.5F;
         float var11 = var4 + var6 * 0.52F;
         VVuuUN.UuUVuuUu(var0, var1, var2, var10, var11, var9, 200.0F, -10.0F, var7, 0.0F, false);
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4) {
      var0.UuUVuuUu(var1, var2, var3, var4, 0.0F, -15921388);
      int var5 = (int)Math.ceil(var3 / 12.0F);
      int var6 = (int)Math.ceil(var4 / 12.0F);

      for (int var7 = 0; var7 < var6; var7++) {
         for (int var8 = 0; var8 < var5; var8++) {
            if ((var7 + var8 & 1) != 0) {
               float var9 = var1 + var8 * 12;
               float var10 = var2 + var7 * 12;
               float var11 = Math.min(12.0F, var1 + var3 - var9);
               float var12 = Math.min(12.0F, var2 + var4 - var10);
               if (var11 > 0.0F && var12 > 0.0F) {
                  var0.UuUVuuUu(var9, var10, var11, var12, 0.0F, -15197404);
               }
            }
         }
      }

      float var13 = var2 + var4 * 0.86F;
      var0.UuUVuuUu(var1, var13, var3, var4 - (var13 - var2), 0.0F, -15657957);
      var0.UuUVuuUu(var1, var13, var3, 1.0F, 0.0F, -14670802);
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUVuuNUVnV var1, float var2, float var3, float var4, float var5, VuNVnnuuUun var6, float var7) {
      nUvnuVnNUU var8 = var1.uNNnnnuuuN();
      NUunUunuNV var9 = var1.nuUnNvnuUu();
      String var10 = var6 == null ? "Выберите модель" : "Не удалось загрузить модель";
      String var11 = var6 == null ? "" : UuUVuuUu(var6.UuuNnUvUuv());
      float var12 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var10, 11.0F);
      nunvNNUnvU.UuUVuuUu(
         var0,
         var8,
         vNvnnVvvVUu.UuUVuuUu,
         var2 + (var4 - var12) * 0.5F,
         var3 + var5 * 0.46F,
         var8.UuUVuuUu(14.0F),
         11.0F,
         var10,
         NUunUunuNV.UuUVuuUu(var9.NVNnnvnuunNv(), Math.round(200.0F * var7))
      );
      if (!var11.isEmpty()) {
         float var13 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var11, 9.0F);
         nunvNNUnvU.UuUVuuUu(
            var0,
            var8,
            vNvnnVvvVUu.UuUVuuUu,
            var2 + (var4 - var13) * 0.5F,
            var3 + var5 * 0.46F + var8.UuUVuuUu(16.0F),
            var8.UuUVuuUu(12.0F),
            9.0F,
            var11,
            NUunUunuNV.UuUVuuUu(var9.UNnVVNvvnVvU(), Math.round(180.0F * var7))
         );
      }
   }

   private static String UuUVuuUu(String var0) {
      return var0 == null ? "" : var0;
   }
}
