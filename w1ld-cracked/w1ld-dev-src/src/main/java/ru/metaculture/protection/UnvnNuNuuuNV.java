package ru.metaculture.protection;

import java.awt.Color;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class UnvnNuNuuuNV {
   private final Map<OO0OCoOC.VvunVVUvUNnv, Integer> UuUVuuUu = new IdentityHashMap<>();

   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4, float var5) {
      float var6 = var2.UuUVuuUu(vnvnUnVnuunn.UnUNVVVNuv());
      if (!(var6 <= 0.005F)) {
         nUvnuVnNUU var7 = UuUVuuUu(var4);
         NUunUunuNV var8 = var4.nuUnNvnuUu();
         float var9 = var3.UvUvUNuvNU();
         float var10 = var3.c0oOOCcCoC0();
         float var11 = var7.uVunuUNVVUUV();
         float var12 = var7.UNnVVNvvnVvU();
         float var13 = var7.UuUVuuUu(14.0F);
         float var14 = this.UuUVuuUu(var6);
         boolean var15 = !var2.NvUVUvVVnUu() && !var2.nUununvNvvn() && var6 < 0.995F;
         float var16 = uUnuvNvvNU(var9);
         float var17 = uUnuvNvvNU(var10);
         float var18 = Math.max(1.0F, uUnuvNvvNU(var9 + var11) - var16);
         float var19 = Math.max(1.0F, uUnuvNvvNU(var10 + var12) - var17);
         UnVNvNnU.uunvUUVnuNn var20 = var15 ? var1.C00OOC00oO(var16, var17, var18, var19) : null;
         boolean var21 = false;
         if (var20 != null) {
            try {
               this.UuUVuuUu(var1, var2, var3, var4, var5, var9, var10, var11, var12, var13);
            } finally {
               var1.UuUVuuUu(var20);
            }

            int var22 = nunvNNUnvU.VVuuUN(var8);
            int var23 = var8.uNnUnnuNUnNu()
               ? nunvNNUnvU.C00OOC00oO(var8, 0.95F)
               : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 64), var8.uVunuUNVVUUV(), 0.3F);
            int var24 = var8.UNnVVNvvnVvU();
            int var25 = var8.uVunuUNVVUUV();
            float var26 = this.UuUVuuUu();
            var21 = var1.UuUVuuUu(var20, var16, var17, var18, var19, var13, var22, var23, var24, var25, var14, var26);
         }

         if (!var21) {
            this.UuUVuuUu(var1, var2, var3, var4, var5, var9, var10, var11, var12, var13);
         }
      }
   }

   private static nUvnuVnNUU UuUVuuUu(nUVuuNUVnV var0) {
      nUvnuVnNUU var1 = var0.uNNnnnuuuN();
      return var1.uUnuvNvvNU(var1.uUnuvNvvNU());
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      nUvnuVnNUU var11 = UuUVuuUu(var4);
      NUunUunuNV var12 = var4.nuUnNvnuUu();
      float var13 = var11.UuUVuuUu(8.0F);
      float var14 = var11.UuUVuuUu(44.0F);
      float var15 = var11.UuUVuuUu(8.0F);
      int var16 = var12.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 194) : NUunUunuNV.UuUVuuUu(15, 16, 19, 255);
      var1.UuUVuuUu(var6, var7, var8, var9, var10, nunvNNUnvU.VVuuUN(var12), 0.88F, var16);
      if (var12.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(
            var6 + 1.0F,
            var7 + 1.0F,
            Math.max(1.0F, var8 - 2.0F),
            Math.max(1.0F, var9 - 2.0F),
            Math.max(0.0F, var10 - 1.0F),
            nunvNNUnvU.C00OOC00oO(var12, 0.95F),
            1.0F
         );
      }

      this.UuUVuuUu(var1, var6, var7, var8, var9, var10, var12, var5);
      VnvNUvNN var17 = VnvNUvNN.UuUVuuUu(var3, var11);
      float var18 = var17.uUnuvNvvNU();
      float var19 = var17.C00OOC00oO();
      float var20 = var17.vVvUvVVuuNvV();
      var1.UuUVuuUu(var6 + var13, var7 + var13, var18, var14, var15, var15, var11.UuUVuuUu(4.0F), var11.UuUVuuUu(4.0F), nunvNNUnvU.vNUvnnVnUvu(var12));
      var1.UuUVuuUu(var6 + var13, var19, var18, var20, var11.UuUVuuUu(4.0F), var11.UuUVuuUu(4.0F), var15, var15, nunvNNUnvU.vNUvnnVnUvu(var12));
      if (var12.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(
            var6 + var13 + 1.0F,
            var7 + var13 + 1.0F,
            Math.max(1.0F, var18 - 2.0F),
            Math.max(1.0F, var14 - 2.0F),
            Math.max(0.0F, var15 - 1.0F),
            Math.max(0.0F, var15 - 1.0F),
            Math.max(0.0F, var11.UuUVuuUu(4.0F) - 1.0F),
            Math.max(0.0F, var11.UuUVuuUu(4.0F) - 1.0F),
            nunvNNUnvU.C00OOC00oO(var12, 0.72F),
            1.0F
         );
         var1.UuUVuuUu(
            var6 + var13 + 1.0F,
            var19 + 1.0F,
            Math.max(1.0F, var18 - 2.0F),
            Math.max(1.0F, var20 - 2.0F),
            Math.max(0.0F, var11.UuUVuuUu(4.0F) - 1.0F),
            Math.max(0.0F, var11.UuUVuuUu(4.0F) - 1.0F),
            Math.max(0.0F, var15 - 1.0F),
            Math.max(0.0F, var15 - 1.0F),
            nunvNNUnvU.C00OOC00oO(var12, 0.72F),
            1.0F
         );
      }

      this.UuUVuuUu(var1, var11, var12, var6, var7, var8, var13, var14, var4);
      this.UuUVuuUu(var1, var2, var17, var11, var12);
      this.UuUVuuUu(var1, var2, var17, var4);
      this.UuUVuuUu(var1, var2, var3, var4, var19, var20);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, VnvNUvNN var3, nUvnuVnNUU var4, NUunUunuNV var5) {
      float var6 = var3.uNNnnnuuuN();
      float var7 = var3.nuUnNvnuUu();
      float var8 = var3.VVuuUN();
      float var9 = var3.vNUvnnVnUvu();
      float var10 = var4.UuUVuuUu(8.0F);
      float var11 = var2.UuUVuuUu(vnvnUnVnuunn.vNVuvnUUnuUn());
      float var12 = var2.UuUVuuUu(vnvnUnVnuunn.UvnvNVnnnnNU());
      String var13 = var2.nvvnUnUn();
      boolean var14 = !var2.NvUVUvVVnUu() && var2.UnUUVuVunvVu();
      var1.UuUVuuUu(var6, var7, var8, var9, var10, nunvNNUnvU.vNUvnnVnUvu(var5));
      var1.UuUVuuUu(var6, var7, var8, var9, var10, NUunUunuNV.UuUVuuUu(var5.uVUuuVnNVU(), var5.nvUVNnuu(), var11));
      if (var5.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(
            var6 + 1.0F,
            var7 + 1.0F,
            Math.max(1.0F, var8 - 2.0F),
            Math.max(1.0F, var9 - 2.0F),
            Math.max(0.0F, var10 - 1.0F),
            nunvNNUnvU.C00OOC00oO(var5, 0.78F),
            1.0F
         );
      }

      if (var11 > 0.01F) {
         var1.UuUVuuUu(
            var6 + 1.0F,
            var7 + 1.0F,
            Math.max(1.0F, var8 - 2.0F),
            Math.max(1.0F, var9 - 2.0F),
            Math.max(0.0F, var10 - 1.0F),
            NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(50.0F * var11)),
            1.0F
         );
      }

      float var15 = var4.UuUVuuUu(10.0F);
      float var16 = var3.vuuuNvNuv();
      float var17 = var8 - var15 * 2.0F - var16;
      int var18 = NUunUunuNV.UuUVuuUu(var5.uVUVnuvnuVuv(), var5.NVNnnvnuunNv(), var11);
      float var19 = var13.isEmpty() ? 0.0F : nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, var13, 10.0F);
      float var20 = var19 > var17 ? var17 - var19 : 0.0F;
      int var21 = (int)Math.floor(var6);
      int var22 = (int)Math.ceil(var6 + var8 - var16);
      var1.UuUVuuUu(var21, (int)Math.floor(var7), Math.max(1, var22 - var21), Math.max(1, (int)Math.ceil(var9)));
      if (!var13.isEmpty()) {
         nunvNNUnvU.UuUVuuUu(var1, var4, vNvnnVvvVUu.UuUVuuUu, var6 + var15 + var20, var7, var9, 10.0F, var13, var18);
      } else if (!var14) {
         nunvNNUnvU.UuUVuuUu(var1, var4, vNvnnVvvVUu.UuUVuuUu, var6 + var15, var7, var9, 10.0F, "Поиск тем...", var5.UvnvNVnnnnNU());
      }

      if (var14) {
         float var23 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
         float var24 = var4.UuUVuuUu(11.0F);
         var1.UuUVuuUu(
            var6 + var15 + var20 + var19 + var4.UuUVuuUu(1.0F),
            var7 + (var9 - var24) * 0.5F,
            Math.max(1.0F, var4.UuUVuuUu(1.0F)),
            var24,
            0.0F,
            NUunUunuNV.UuUVuuUu(var5.vVvUvVVuuNvV(), Math.round(255.0F * var23))
         );
      }

      var1.nuUnNvnuUu();
      float var25 = Math.max(var11 * 0.3F, var12);
      if (var25 > 0.01F) {
         float var26 = nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.uNNnnnuuuN, "l", 10.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var4,
            vNvnnVvvVUu.uNNnnnuuuN,
            var3.uVUuuVnNVU() + (var16 - var26) * 0.5F,
            var7,
            var9,
            10.0F,
            "l",
            NUunUunuNV.UuUVuuUu(var5.vVvUvVVuuNvV(), Math.round(255.0F * var25))
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, NUunUunuNV var7, float var8) {
      if (!var7.uNnUnnuNUnNu()) {
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var6, var6, var6);
         boolean var24 = false /* VF: Semaphore variable */;

         try {
            var24 = true;
            float var9 = var8 * (float) (Math.PI * 2);
            float var10 = 0.8F + 0.2F * (float)Math.sin(var9 * 0.3);
            float var11 = var4 * 0.75F;
            float var12 = var5 * 0.55F;
            float var13 = Math.min(var11, var12) * 0.5F;
            float var14 = var2 + var4 * 0.05F + (float)Math.cos(var9 * 0.1) * var4 * 0.04F;
            float var15 = var3 + var5 * 0.06F + (float)Math.sin(var9 * 0.08) * var5 * 0.03F;
            var1.UuUVuuUu(var14, var15, var11, var12, var13, var11 * 0.45F, var11 * 0.12F, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), Math.round(3.0F * var10)));
            float var16 = 0.75F + 0.25F * (float)Math.sin(var9 * 0.22 + 2.094F);
            float var17 = var4 * 0.65F;
            float var18 = var5 * 0.5F;
            float var19 = Math.min(var17, var18) * 0.5F;
            float var20 = var2 + var4 * 0.35F + (float)Math.cos(var9 * 0.14 + 1.2F) * var4 * 0.05F;
            float var21 = var3 + var5 * 0.5F + (float)Math.sin(var9 * 0.1 + 0.7F) * var5 * 0.04F;
            var1.UuUVuuUu(var20, var21, var17, var18, var19, var17 * 0.4F, var17 * 0.1F, NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), Math.round(2.0F * var16)));
            var24 = false;
         } finally {
            if (var24) {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }
         }

         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var2, var3, var4, var5, var6, var6, var6, var6);

      try {
         long var8 = (long)(var7 * 10000.0F) + 9999L;
         float var10 = 36.0F;
         float var11 = 36.0F;
         int var12 = (int)Math.ceil(var4 / var10) + 1;
         int var13 = (int)Math.ceil(var5 / var11) + 1;

         for (int var14 = 0; var14 < var13; var14++) {
            for (int var15 = 0; var15 < var12; var15++) {
               long var16 = var8 + var15 * 73856093L + var14 * 19349663L ^ 25214903917L;
               var16 = var16 * 6364136223846793005L + 1442695040888963407L;
               int var18 = (int)(var16 >>> 48 & 15L);
               if (var18 <= 5) {
                  int var19 = 3 + (var18 & 3);
                  float var20 = Math.round(var2 + var15 * var10 + (float)(var16 >>> 32 & 15L) - 8.0F);
                  float var21 = Math.round(var3 + var14 * var11 + (float)(var16 >>> 16 & 15L) - 8.0F);
                  float var22 = 1.0F + (var18 & 1);
                  int var23 = (var18 & 1) == 0 ? NUunUunuNV.UuUVuuUu(255, 255, 255, var19) : NUunUunuNV.UuUVuuUu(0, 0, 0, var19 + 1);
                  var1.UuUVuuUu(var20, var21, var22, var22, 0.0F, var23);
               }
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, nUVuuNUVnV var9) {
      float var10 = var2.UuUVuuUu(30.0F);
      float var11 = var4 + var7 + var2.UuUVuuUu(8.0F);
      float var12 = var5 + var7 + (var8 - var10) * 0.5F;
      var1.UuUVuuUu(var11, var12, var10, var10, var2.UuUVuuUu(7.0F), var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.0F) : var3.uVUuuVnNVU());
      var1.UuUVuuUu(
         var11 + 1.0F,
         var12 + 1.0F,
         Math.max(1.0F, var10 - 2.0F),
         Math.max(1.0F, var10 - 2.0F),
         Math.max(0.0F, var2.UuUVuuUu(7.0F) - 1.0F),
         var3.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var3, 0.82F) : var3.nvUVNnuu(),
         1.0F
      );
      nunvNNUnvU.UuUVuuUu(var1, var2, var3, var11 + var2.UuUVuuUu(5.0F), var12 + var2.UuUVuuUu(5.0F), var2.UuUVuuUu(9.0F), var2.UuUVuuUu(2.0F));
      float var13 = var2.UuUVuuUu(5.0F);
      float var14 = var5 + var7;
      float var15 = var11 + var10 + var13;
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var15, var14, var8, 11.0F, "t.me/soezproject", var3.uVUVnuvnuVuv());
      var15 += nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, "t.me/soezproject", 11.0F) + var13;
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vNUvnnVnUvu, var15, var14, var8, 8.0F, "k", var3.UvnvNVnnnnNU());
      var15 += nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vNUvnnVnUvu, "k", 8.0F) + var13;
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.uNNnnnuuuN, var15, var14, var8, 11.0F, "p", var3.vVvUvVVuuNvV());
      var15 += nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.uNNnnnuuuN, "p", 11.0F) + var13;
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var15, var14, var8, 11.0F, "Themes", var3.NVNnnvnuunNv());
      float var16 = var2.UuUVuuUu(20.0F);
      float var17 = var4 + var6 - var2.UuUVuuUu(15.0F) - var16;
      float var18 = var5 + var2.UuUVuuUu(20.0F);
      var1.UuUVuuUu(var17, var18, var16, var16, var2.UuUVuuUu(5.0F), var3.uNnUnnuNUnNu() ? nunvNNUnvU.UuUVuuUu(var3, 0.2F) : var3.vuuuNvNuv());
      var1.UuUVuuUu(
         var17 + 1.0F,
         var18 + 1.0F,
         Math.max(1.0F, var16 - 2.0F),
         Math.max(1.0F, var16 - 2.0F),
         Math.max(0.0F, var2.UuUVuuUu(5.0F) - 1.0F),
         var3.uNnUnnuNUnNu() ? nunvNNUnvU.C00OOC00oO(var3, 0.86F) : var3.UuuNnUvUuv(),
         1.0F
      );
      float var19 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.uNNnnnuuuN, "l", 14.0F);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.uNNnnnuuuN, var17 + (var16 - var19) * 0.5F, var18, var16, 14.0F, "l", var3.uVUVnuvnuVuv());
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, VnvNUvNN var3, nUVuuNUVnV var4) {
      nUvnuVnNUU var5 = UuUVuuUu(var4);
      NUunUunuNV var6 = var4.nuUnNvnuUu();
      float var7 = var3.uUnuvNvvNU();
      float var8 = var5.UuUVuuUu(8.0F);
      float var9 = var5.UuUVuuUu(8.0F);
      float var10 = var3.C00OOC00oO();
      float var11 = var3.vVvUvVVuuNvV();
      float var12 = var2.UNnVVNvvnVvU();
      float var13 = nunvNNUnvU.uUnuvNvvNU(var5);
      List var14 = var4.VVuuUN().uUnuvNvvNU();
      List var15 = var2.UuUVuuUu(var4.VVuuUN());
      int var16 = var2.NunUUVVVuu() >= 0 ? var2.NunUUVVVuu() : var4.VVuuUN().UuUVuuUu(var2.NnVnNVN());
      if (var15.isEmpty()) {
         String var17 = "Ничего не найдено";
         float var18 = nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.UuUVuuUu, var17, 10.0F);
         nunvNNUnvU.UuUVuuUu(var1, var5, vNvnnVvvVUu.UuUVuuUu, var3.UuUVuuUu() + (var7 - var18) * 0.5F, var10, var11, 10.0F, var17, var6.UvnvNVnnnnNU());
      } else {
         nunvNNUnvU.UuUVuuUu(
            var1,
            var5,
            var6,
            var3.UuUVuuUu(),
            var10,
            var7,
            var11,
            var5.UuUVuuUu(4.0F),
            var5.UuUVuuUu(4.0F),
            var9,
            var9,
            var2.NNUUNUuVNNVn().uUnuvNvvNU(),
            () -> {
               for (int var12x = 0; var12x < var15.size(); var12x++) {
                  int var13x = (Integer)var15.get(var12x);
                  OO0OCoOC.VvunVVUvUNnv var14x = (OO0OCoOC.VvunVVUvUNnv)var14.get(var13x);
                  VnvNUvNN.NVnVnNnN var15x = var3.UuUVuuUu(var12x, var12);
                  if (var3.UuUVuuUu(var15x, var13)) {
                     float var16x = uUnuvNvvNU(var15x.x());
                     float var17x = uUnuvNvvNU(var15x.y());
                     float var18x = uUnuvNvvNU(var15x.x() + var15x.width());
                     float var19 = uUnuvNvvNU(var15x.y() + var15x.height());
                     float var20 = Math.max(var5.UuUVuuUu(1.0F), var18x - var16x);
                     float var21 = Math.max(var5.UuUVuuUu(1.0F), var19 - var17x);
                     float var22 = UuUVuuUu(var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var13x)), 0.0F, 1.0F);
                     float var23 = UuUVuuUu(var2.UuUVuuUu(vnvnUnVnuunn.C00OOC00oO(var13x)), 0.0F, 1.0F);
                     boolean var24 = var13x == var16;
                     float var26 = Math.max(var22, var23);
                     if (var26 > 0.01F) {
                        float var27 = 0.24F + var26 * 0.52F;
                        int var28;
                        if (var6.uNnUnnuNUnNu()) {
                           int var29 = NUunUunuNV.UuUVuuUu(54, 72, 90, 255);
                           int var30 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var14x.vVvUvVVuuNvV(), var14x.uNNnnnuuuN(), 0.52F), 255);
                           var28 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var29, var30, 0.11F), Math.round(12.0F * var27));
                        } else {
                           var28 = NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(26.0F * var27));
                        }

                        var1.UuUVuuUu(var16x, var17x, var20, var21, var8, var5.UuUVuuUu(4.5F) * var27, var5.UuUVuuUu(0.65F) * var27, var28);
                     }

                     int var55 = var6.uNnUnnuNUnNu()
                        ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var6, 0.0F), 242)
                        : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var6.VVuuUN(), var6.nuUnNvnuUu(), 0.42F), 238);
                     float var56 = var23 * (var6.uNnUnnuNUnNu() ? 0.05F : 0.07F);
                     float var57 = var22 * (var6.uNnUnnuNUnNu() ? 0.008F : 0.012F);
                     float var58 = (var6.uNnUnnuNUnNu() ? 0.19F : 0.15F) + var56 + var57;
                     float var31 = (var6.uNnUnnuNUnNu() ? 0.23F : 0.19F) + var56 + var57;
                     int var32 = NUunUunuNV.UuUVuuUu(var55, NUunUunuNV.UuUVuuUu(var14x.vVvUvVVuuNvV(), var55 >>> 24 & 0xFF), var58);
                     int var33 = NUunUunuNV.UuUVuuUu(var55, NUunUunuNV.UuUVuuUu(var14x.uNNnnnuuuN(), var55 >>> 24 & 0xFF), var31);
                     int var34 = this.UuUVuuUu(var14x);
                     float var35 = var22 > 0.001F ? UuUVuuUu((var2.unnUnUNVnN() - var16x) / Math.max(1.0F, var20), 0.07F, 0.93F) : 0.5F;
                     float var36 = var22 > 0.001F ? UuUVuuUu((var2.NnuUnUNnu() - var17x) / Math.max(1.0F, var21), 0.1F, 0.9F) : 0.5F;
                     var1.UuUVuuUu(
                        var16x,
                        var17x,
                        var20,
                        var21,
                        var8,
                        var32,
                        var33,
                        var14x.vVvUvVVuuNvV(),
                        var34,
                        var35,
                        var36,
                        var22,
                        Math.max(var23, var23 * 0.3F),
                        var24,
                        6
                     );
                     float var37 = var5.UuUVuuUu(28.0F);
                     float var38 = var5.UuUVuuUu(14.0F);
                     float var39 = C00OOC00oO(var22);
                     float var40 = uUnuvNvvNU(var16x + var20 - var37 - var5.UuUVuuUu(10.0F));
                     float var41 = uUnuvNvvNU(var17x + (var21 - var38) * 0.5F);
                     float var42 = var5.UuUVuuUu(3.5F);
                     float var43 = var16x + var5.UuUVuuUu(10.0F);
                     String var44 = var14x.C00OOC00oO();
                     float var45 = var16x + var20 - var5.UuUVuuUu(10.0F);
                     float var46 = Math.max(var5.UuUVuuUu(34.0F), var45 - var43);
                     float var47 = UuUVuuUu(var5, var44, var46);
                     int var48 = (int)Math.floor(var43);
                     int var49 = (int)Math.ceil(var45);
                     int var50 = (int)Math.floor(var17x);
                     int var51 = (int)Math.ceil(var17x + var21);
                     var1.UuUVuuUu(var48, var50, Math.max(1, var49 - var48), Math.max(1, var51 - var50));

                     try {
                        nunvNNUnvU.UuUVuuUu(
                           var1,
                           var5,
                           vNvnnVvvVUu.vVvUvVVuuNvV,
                           var43,
                           var17x,
                           var21,
                           var47,
                           var44,
                           NUunUunuNV.UuUVuuUu(var6.uVUVnuvnuVuv(), var6.NVNnnvnuunNv(), var26 * 0.72F + (var24 ? 0.18F : 0.0F))
                        );
                     } finally {
                        var1.nuUnNvnuUu();
                     }

                     var1.UuUVuuUu(
                        var40,
                        var41,
                        var37,
                        var38,
                        var42,
                        var14x.vVvUvVVuuNvV(),
                        var14x.uNNnnnuuuN(),
                        var14x.vVvUvVVuuNvV(),
                        var34,
                        0.5F,
                        0.5F,
                        var39,
                        0.0F,
                        false,
                        5
                     );
                  }
               }
            }
         );
      }
   }

   private float UuUVuuUu(float var1) {
      float var2 = Math.max(0.0F, Math.min(1.0F, var1));
      return (float)Math.pow(var2, 1.42F);
   }

   private float UuUVuuUu() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   private void UuUVuuUu(UnVNvNnU var1, OO0OCoOC.VvunVVUvUNnv var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = uUnuvNvvNU(var3);
      float var9 = uUnuvNvvNU(var4);
      float var10 = Math.max(1.0F, uUnuvNvvNU(var3 + var5) - var8);
      float var11 = Math.max(1.0F, uUnuvNvvNU(var4 + var6) - var9);
      float var12 = Math.min(var7, Math.min(var10, var11) * 0.5F);
      int[] var13 = var2.VVuuUN();
      int var14 = UuUVuuUu(var13, var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN(), 0.0F);
      int var15 = UuUVuuUu(var13, var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN(), 0.34F);
      int var16 = UuUVuuUu(var13, var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN(), 0.72F);
      int var17 = UuUVuuUu(var13, var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN(), 1.0F);
      var1.UuUVuuUu(var8, var9, var10, var11, var12, var14, var15, var16, var17);
   }

   private static int UuUVuuUu(int[] var0, int var1, int var2, float var3) {
      if (var0 == null || var0.length < 2) {
         return NUunUunuNV.UuUVuuUu(var1, var2, var3);
      } else if (var3 <= 0.0F) {
         return var0[0];
      } else if (var3 >= 1.0F) {
         return var0[var0.length - 1];
      } else {
         float var4 = var3 * (var0.length - 1);
         int var5 = Math.min(var0.length - 2, (int)var4);
         return NUunUunuNV.UuUVuuUu(var0[var5], var0[var5 + 1], var4 - var5);
      }
   }

   private int UuUVuuUu(OO0OCoOC.VvunVVUvUNnv var1) {
      Integer var2 = this.UuUVuuUu.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         int var3 = C00OOC00oO(var1);
         this.UuUVuuUu.put(var1, var3);
         return var3;
      }
   }

   private static int C00OOC00oO(OO0OCoOC.VvunVVUvUNnv var0) {
      int[] var1 = var0.VVuuUN();
      if (var1 != null && var1.length > 2) {
         return var0.uNNnnnuuuN();
      } else {
         int var2 = var0.vVvUvVVuuNvV();
         int var3 = var0.uNNnnnuuuN();
         float[] var4 = Color.RGBtoHSB(var2 >>> 16 & 0xFF, var2 >>> 8 & 0xFF, var2 & 0xFF, null);
         float[] var5 = Color.RGBtoHSB(var3 >>> 16 & 0xFF, var3 >>> 8 & 0xFF, var3 & 0xFF, null);
         float var6 = Math.abs(var4[0] - var5[0]);
         var6 = Math.min(var6, 1.0F - var6);
         if (!(var4[1] < 0.14F) && !(var5[1] < 0.14F) && !(var6 > 0.035F)) {
            float var7 = (float)Math.sin((var5[0] + 0.11F) * Math.PI * 2.0) >= 0.0F ? 0.048F : -0.048F;
            float var8 = var5[0] + var7;
            if (var8 < 0.0F) {
               var8++;
            } else if (var8 >= 1.0F) {
               var8--;
            }

            float var9 = UuUVuuUu(var5[1] * 0.86F + 0.12F, 0.24F, 0.94F);
            float var10 = UuUVuuUu(var5[2] * 0.96F + 0.04F, 0.18F, 1.0F);
            int var11 = 0xFF000000 | Color.HSBtoRGB(var8, var9, var10) & 16777215;
            return NUunUunuNV.UuUVuuUu(var3, var11, 0.25F);
         } else {
            return var3;
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float UuUVuuUu(nUvnuVnNUU var0, String var1, float var2) {
      float var3 = 10.0F;

      while (var3 > 7.0F && nunvNNUnvU.UuUVuuUu(var0, vNvnnVvvVUu.vVvUvVVuuNvV, var1, var3) > var2) {
         var3 -= 0.25F;
      }

      return var3;
   }

   private static float C00OOC00oO(float var0) {
      float var1 = UuUVuuUu(var0, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float uUnuvNvvNU(float var0) {
      return Math.round(var0 * 2.0F) * 0.5F;
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4, float var5, float var6) {
      nUvnuVnNUU var7 = UuUVuuUu(var4);
      NUunUunuNV var8 = var4.nuUnNvnuUu();
      if (!(var2.uuvvuNvuUNVV() <= 0.5F)) {
         float var9 = var7.UuUVuuUu(7.0F);
         float var10 = var7.UuUVuuUu(3.6F);
         float var11 = var3.UvUvUNuvNU() + var7.uVunuUNVVUUV() - var9 - var10 - var7.UuUVuuUu(0.8F);
         float var12 = var6 - var7.UuUVuuUu(10.0F);
         float var13 = var5 + var7.UuUVuuUu(5.0F);
         float var14 = Math.max(var7.UuUVuuUu(28.0F), var12 * (var12 / (var12 + var2.uuvvuNvuUNVV())));
         float var15 = Math.min(1.0F, Math.max(0.0F, -var2.UNnVVNvvnVvU() / var2.uuvvuNvuUNVV()));
         float var16 = var13 + (var12 - var14) * var15;
         VnvNUvNN var17 = VnvNUvNN.UuUVuuUu(var3, var7);
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            var17.UuUVuuUu(),
            var17.C00OOC00oO(),
            var17.uUnuvNvvNU(),
            var17.vVvUvVVuuNvV(),
            var7.UuUVuuUu(4.0F),
            var7.UuUVuuUu(4.0F),
            var7.UuUVuuUu(8.0F),
            var7.UuUVuuUu(8.0F)
         );

         try {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               var8,
               var11,
               var13,
               var10,
               var12,
               var16,
               var14,
               var2.NNUUNUuVNNVn().uUnuvNvvNU(),
               0.0F,
               2L,
               var2.unnUnUNVnN(),
               var2.NnuUnUNnu(),
               var2::vVvUvVVuuNvV
            );
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }
}
