package ru.metaculture.protection;

public final class uvUVNuVuuU {
   private uvUVNuVuuU() {
   }

   public static vnvNNVNU UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      if (var0 != null && var1 != null) {
         String var2 = UuUVuuUu();
         float var3 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var2, 12.0F);
         float var4 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "g", 12.0F);
         float var5 = var0.uVUuuVnNVU() + var0.UuuNnUvUuv() - var1.UuUVuuUu(16.0F) - var4;
         float var6 = var5 - var1.UuUVuuUu(8.0F) - var3;
         float var7 = var1.UuUVuuUu(86.0F);
         float var8 = var1.UuUVuuUu(24.0F);
         float var9 = var6 - var1.UuUVuuUu(12.0F) - var7;
         float var10 = var0.vuuuNvNuv() + (var0.nvUVNnuu() - var8) * 0.5F;
         return new vnvNNVNU(var9, var10, var7, var8);
      } else {
         return new vnvNNVNU(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   private static String UuUVuuUu() {
      Menu var0 = Menu.vNVuvnUUnuUn();
      int var1 = var0 != null && var0.uNNnnnuuuN != -1 ? var0.uNNnnnuuuN : 344;
      return UuNVnuUvunN.UuUVuuUu(var1);
   }
}
