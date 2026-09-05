package ru.metaculture.protection;

public final class uUuuVVUuuVuN {
   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      var1.UuUVuuUu(
         var3.uUnuvNvvNU(),
         var3.vVvUvVVuuNvV(),
         var3.uNNnnnuuuN(),
         var3.nuUnNvnuUu(),
         var5.UuUVuuUu(16.0F),
         var5.UuUVuuUu(4.0F),
         var5.UuUVuuUu(4.0F),
         var5.UuUVuuUu(16.0F),
         nunvNNUnvU.vNUvnnVnUvu(var6)
      );
      if (var6.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(
            var3.uUnuvNvvNU() + 1.0F,
            var3.vVvUvVVuuNvV() + 1.0F,
            Math.max(1.0F, var3.uNNnnnuuuN() - 2.0F),
            Math.max(1.0F, var3.nuUnNvnuUu() - 2.0F),
            Math.max(0.0F, var5.UuUVuuUu(16.0F) - 1.0F),
            Math.max(0.0F, var5.UuUVuuUu(4.0F) - 1.0F),
            Math.max(0.0F, var5.UuUVuuUu(4.0F) - 1.0F),
            Math.max(0.0F, var5.UuUVuuUu(16.0F) - 1.0F),
            nunvNNUnvU.C00OOC00oO(var6, 0.82F),
            1.0F
         );
      }

      this.vVvUvVVuuNvV(var1, var2, var3, var4);
      this.uNNnnnuuuN(var1, var2, var3, var4);
      this.C00OOC00oO(var1, var2, var3, var4);
      this.uUnuvNvvNU(var1, var2, var3, var4);
      this.nuUnNvnuUu(var1, var2, var3, var4);
   }

   public static float UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.uUnuvNvvNU() + var1.UuUVuuUu(16.0F));
   }

   public static float C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.vVvUvVVuuNvV() + var1.UuUVuuUu(16.0F));
   }

   public static float UuUVuuUu(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(40.0F);
   }

   public static float C00OOC00oO(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(40.0F);
   }

   public static float uUnuvNvvNU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.uUnuvNvvNU() + var1.UuUVuuUu(16.0F));
   }

   public static float vVvUvVVuuNvV(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.vVvUvVVuuNvV() + var0.nuUnNvnuUu() - var1.UuUVuuUu(56.0F));
   }

   public static float uNNnnnuuuN(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(var0.vVvUvVVuuNvV() + var1.UuUVuuUu(85.0F));
   }

   public static float uUnuvNvvNU(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(51.0F);
   }

   public static float nuUnNvnuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(vVvUvVVuuNvV(var0, var1) - var1.UuUVuuUu(100.0F));
   }

   public static float VVuuUN(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return Math.round(vVvUvVVuuNvV(var0, var1) - var1.UuUVuuUu(50.0F));
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = uUnuvNvvNU(var3, var5);
      float var8 = nuUnNvnuUu(var3, var5);
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN());
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.nuUnNvnuUu());
      float var11 = Math.max(var9, var10) * var5.UuUVuuUu(1.0F);
      float var12 = nunvNNUnvU.UuUVuuUu(var9, var2.C00OOC00oO(vnvnUnVnuunn.uNNnnnuuuN()));
      this.UuUVuuUu(var1, var2, var6, var7, var8 - var11, C00OOC00oO(var5), 5, var9, var10, var12);
      if (!this.UuUVuuUu(var2) && nunvNNUnvU.UuUVuuUu(var2, var7, var8, var5.UuUVuuUu(40.0F), var5.UuUVuuUu(40.0F))) {
         var2.UuUVuuUu("tab:autobuy", "AutoBuy", var7 + var5.UuUVuuUu(40.0F), var8 + var5.UuUVuuUu(20.0F));
      }
   }

   private void uUnuvNvvNU(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = uUnuvNvvNU(var3, var5);
      float var8 = VVuuUN(var3, var5);
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.VVuuUN());
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.vNUvnnVnUvu());
      float var11 = Math.max(var9, var10) * var5.UuUVuuUu(1.0F);
      float var12 = nunvNNUnvU.UuUVuuUu(var9, var2.C00OOC00oO(vnvnUnVnuunn.VVuuUN()));
      this.UuUVuuUu(var1, var2, var6, var7, var8 - var11, C00OOC00oO(var5), 6, var9, var10, var12);
      if (!this.UuUVuuUu(var2) && nunvNNUnvU.UuUVuuUu(var2, var7, var8, var5.UuUVuuUu(40.0F), var5.UuUVuuUu(40.0F))) {
         var2.UuUVuuUu("tab:bots", "Bots", var7 + var5.UuUVuuUu(40.0F), var8 + var5.UuUVuuUu(20.0F));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, NUunUunuNV var3, float var4, float var5, float var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), var3.NVNnnvnuunNv(), 0.45F) : var3.uVunuUNVVUUV();
      int var12 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), var3.NVNnnvnuunNv(), 0.45F) : var3.UNnVVNvvnVvU();
      int var13 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.0F) : var3.vNUvnnVnUvu();
      int var14 = var3.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var3, 0.9F) : var3.vuuuNvNuv();
      var1.uUnuvNvvNU();
      NVvUNUvuNnNU.UuUVuuUu(
         var4, var5, var6, var7, var8, var9, var10, var11, var12, var3.UvnvNVnnnnNU(), var13, var14, var2.vVvUvVVuuNvV(), var3.uNnUnnuNUnNu()
      );
   }

   private void vVvUvVVuuNvV(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = UuUVuuUu(var3, var5);
      float var8 = C00OOC00oO(var3, var5);
      float var9 = UuUVuuUu(var5);
      var1.uUnuvNvvNU();
      occc0oc00ooO.UuUVuuUu(var7, var8, var9, var6.uVunuUNVVUUV(), var6.UNnVVNvvnVvU(), var2.vVvUvVVuuNvV(), var6.uNnUnnuNUnNu());
      float var10 = 0.5F + 0.5F * (float)Math.sin((float)System.currentTimeMillis() * 0.00108F);
      float var11 = 19.5F;
      float var12 = var11 * (1.08F + var10 * 0.035F);
      float var13 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", var11);
      float var14 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", var12);
      float var15 = var7 + var9 * 0.5F;
      float var16 = var8 + var9 * 0.5F;
      float var17 = nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.vNUvnnVnUvu, var11);
      float var18 = nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.vNUvnnVnUvu, var12);
      float var19 = var15 - var13 * 0.5F;
      float var20 = var15 - var14 * 0.5F;
      float var21 = var16 - var17 * 0.5F - var5.UuUVuuUu(1.0F);
      float var22 = var16 - var18 * 0.5F - var5.UuUVuuUu(1.0F);
      if (!var6.uNnUnnuNUnNu()) {
         var1.vVvUvVVuuNvV();

         try {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var5,
               vNvnnVvvVUu.vNUvnnVnUvu,
               var20,
               var22,
               var12,
               "w",
               NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 120), NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 135), var10)
            );
         } finally {
            var1.uNNnnnuuuN();
         }
      }

      nunvNNUnvU.UuUVuuUu(var1, var5, vNvnnVvvVUu.vNUvnnVnUvu, var19, var21, var11, "w", NUunUunuNV.UuUVuuUu(nunvNNUnvU.vVvUvVVuuNvV(var6), 246));
      var1.UuUVuuUu(var7 + var5.UuUVuuUu(4.0F), var8 + var5.UuUVuuUu(56.0F), var5.UuUVuuUu(32.0F), var5.UuUVuuUu(1.0F), var5.UuUVuuUu(1.0F), var6.nUUVuvU());
      if (!this.UuUVuuUu(var2) && nunvNNUnvU.UuUVuuUu(var2, var7, var8, var9, var9)) {
         var2.UuUVuuUu("logo:themes", "Themes", var7 + var9 + var5.UuUVuuUu(6.0F), var8 + var9 * 0.5F);
      }
   }

   private void uNNnnnuuuN(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = uUnuvNvvNU(var3, var5);
      float var8 = uNNnnnuuuN(var3, var5);
      oOOOo0[] var9 = oOOOo0.values();

      for (int var10 = 0; var10 < var9.length; var10++) {
         oOOOo0 var11 = var9[var10];
         float var12 = var8 + var10 * uUnuvNvvNU(var5);
         float var13 = var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var11));
         float var14 = var2.UuUVuuUu(vnvnUnVnuunn.C00OOC00oO(var11));
         float var15 = Math.max(var13, var14) * var5.UuUVuuUu(1.0F);
         float var16 = nunvNNUnvU.UuUVuuUu(var13, var2.C00OOC00oO(vnvnUnVnuunn.UuUVuuUu(var11)));
         this.UuUVuuUu(var1, var2, var6, var7, var12 - var15, C00OOC00oO(var5), var10, var13, var14, var16);
         if (!this.UuUVuuUu(var2) && nunvNNUnvU.UuUVuuUu(var2, var7, var12, var5.UuUVuuUu(40.0F), var5.UuUVuuUu(40.0F))) {
            var2.UuUVuuUu("cat:" + var11.name(), var11.C00OOC00oO(), var7 + var5.UuUVuuUu(40.0F), var12 + var5.UuUVuuUu(20.0F));
         }
      }
   }

   private void nuUnNvnuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = var4.uNNnnnuuuN();
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = uUnuvNvvNU(var3, var5);
      float var8 = vVvUvVVuuNvV(var3, var5);
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.C00OOC00oO());
      float var10 = var2.vvNvvuUUUVvv() ? 1.0F : 0.0F;
      float var11 = Math.max(var9, var10);
      float var12 = C00OOC00oO(var5);
      float var13 = var7 + var12 * 0.5F;
      float var14 = var8 + var12 * 0.5F;
      float var15 = nunvNNUnvU.UuUVuuUu(var9, var2.C00OOC00oO(vnvnUnVnuunn.C00OOC00oO()));
      var1.UuUVuuUu(var15, var13, var14);

      try {
         if (var11 > 0.01F) {
            int var16 = var6.uNnUnnuNUnNu()
               ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(18.0F * var11))
               : NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), Math.round(38.0F * var11));
            var1.UuUVuuUu(
               var7 - var5.UuUVuuUu(1.5F),
               var8 - var5.UuUVuuUu(1.5F),
               var12 + var5.UuUVuuUu(3.0F),
               var12 + var5.UuUVuuUu(3.0F),
               var5.UuUVuuUu(21.5F),
               var5.UuUVuuUu(14.0F) * var11,
               var5.UuUVuuUu(var6.uNnUnnuNUnNu() ? 2.6F : 2.0F),
               var16
            );
         }

         var1.C00OOC00oO(
            var13,
            var14,
            var5.UuUVuuUu(20.0F),
            0.0F,
            1.0F,
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var6.UvnvNVnnnnNU(), 118), NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 196), var11)
         );
         var1.C00OOC00oO(
            var13,
            var14,
            var5.UuUVuuUu(18.25F),
            0.0F,
            1.0F,
            var6.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 218) : NUunUunuNV.UuUVuuUu(20, 15, 24, 238)
         );
         var1.C00OOC00oO(
            var13,
            var14,
            var5.UuUVuuUu(15.8F),
            0.0F,
            1.0F,
            var6.uNnUnnuNUnNu()
               ? nunvNNUnvU.UuUVuuUu(var6, var11)
               : NUunUunuNV.UuUVuuUu(var6.vNUvnnVnUvu(), NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 28), var11)
         );
         vnuvUNNuvnUU.UuUVuuUu(
            var1,
            var5,
            var13,
            var14 + var5.UuUVuuUu(0.4F),
            var5.UuUVuuUu(0.88F),
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var6), nunvNNUnvU.UuUVuuUu(var6), var11 * 0.72F),
            NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), Math.round(18.0F + 46.0F * var11))
         );
      } finally {
         var1.uVUuuVnNVU();
      }

      if (!this.UuUVuuUu(var2) && nunvNNUnvU.UuUVuuUu(var2, var7, var8, var12, var12)) {
         var2.UuUVuuUu("avatar", "Profile", var7 + var12 + var5.UuUVuuUu(6.0F), var8 + var12 * 0.5F);
      }
   }

   private boolean UuUVuuUu(vNvvVnNuUVvv var1) {
      return var1.vvNvvuUUUVvv() || var1.UnvuVuVnNuvu();
   }
}
