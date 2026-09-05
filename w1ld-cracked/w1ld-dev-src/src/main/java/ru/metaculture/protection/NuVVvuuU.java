package ru.metaculture.protection;

public final class NuVVvuuU {
   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = var2.UuUVuuUu(vnvnUnVnuunn.NVNnnvnuunNv());
      if (!(var6 < 0.01F) && var2.vnvUUNNVvU() != null && !var2.vnvUUNNVvU().isEmpty()) {
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         String var9 = var2.vnvUUNNVvU();
         float var10 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.UuUVuuUu, var9, 9.0F);
         float var11 = var7.UuUVuuUu(8.0F);
         float var12 = var7.UuUVuuUu(4.0F);
         float var13 = var10 + var11 * 2.0F;
         float var14 = Math.max(var7.UuUVuuUu(18.0F), var7.UuUVuuUu(9.0F) + var12 * 2.0F);
         float var15 = var7.UuUVuuUu(6.0F);
         float var16 = var2.nVVunnNVNvN() + var7.UuUVuuUu(12.0F);
         float var17 = var2.NNNVNvNuVvuN() - var14 - var7.UuUVuuUu(4.0F);
         if (var16 + var13 > var4 - var7.UuUVuuUu(4.0F)) {
            var16 = var4 - var13 - var7.UuUVuuUu(4.0F);
         }

         if (var16 < var7.UuUVuuUu(4.0F)) {
            var16 = var7.UuUVuuUu(4.0F);
         }

         if (var17 < var7.UuUVuuUu(4.0F)) {
            var17 = var2.NNNVNvNuVvuN() + var7.UuUVuuUu(16.0F);
         }

         var1.uNNnnnuuuN(var6);

         try {
            var1.UuUVuuUu(
               var16,
               var17,
               var13,
               var14,
               var15,
               var7.UuUVuuUu(var8.uNnUnnuNUnNu() ? 8.0F : 6.0F),
               var7.UuUVuuUu(var8.uNnUnnuNUnNu() ? 1.5F : 1.0F),
               var8.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(46, 59, 70, 24) : NUunUunuNV.UuUVuuUu(0, 0, 0, 48)
            );
            int var18 = var8.uNnUnnuNUnNu()
               ? nunvNNUnvU.UuUVuuUu(var8, 0.0F)
               : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var8.VVuuUN(), var8.nuUnNvnuUu(), 0.52F), 242);
            int var19 = NUunUunuNV.UuUVuuUu(var18, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), var18 >>> 24 & 0xFF), 0.018F);
            int var20 = NUunUunuNV.UuUVuuUu(var18, NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), var18 >>> 24 & 0xFF), 0.014F);
            var1.C00OOC00oO(var16, var17, var13, var14, var15, var19, var20);
            nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.UuUVuuUu, var16 + var11, var17, var14, 9.0F, var9, var8.NVNnnvnuunNv());
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }
}
