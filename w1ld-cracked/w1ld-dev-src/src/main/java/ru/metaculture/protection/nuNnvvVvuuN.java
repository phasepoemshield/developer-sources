package ru.metaculture.protection;

public class nuNnvvVvuuN extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(UnVNvNnU var0, double var1, double var3, int var5) {
      int var6 = (int)CoCO0oOCO0c.UuUVuuUu((float)var1, (float)var3)[0];
      int var7 = (int)CoCO0oOCO0c.UuUVuuUu((float)var1, (float)var3)[1];
      UnVnUVUUUVvn var8 = new UnVnUVUUUVvn(UUVNUUUnNUv.UuUVuuUu);
      UUVNUUUnNUv.nNnVnUNVV = (int)UuvVnuU.vuuuNvNuv(UUVNUUUnNUv.nNnVnUNVV, 0.0F, CoCO0oOCO0c.UuUVuuUu(var8.UuUVuuUu()) - UUVNUUUnNUv.uUVVvVVNvvn);
      UUVNUUUnNUv.nuunNvv = (int)UuvVnuU.vuuuNvNuv(UUVNUUUnNUv.nuunNvv, 0.0F, CoCO0oOCO0c.UuUVuuUu(var8.C00OOC00oO()) - UUVNUUUnNUv.vvUVNVvvNUv);
      if (!UUVNUUUnNUv.nVVUuvuNnUN) {
         float var9 = UUVNUUUnNUv.nNnVnUNVV + 111.885F;
         float var10 = UUVNUUUnNUv.nuunNvv + 6.185F;
         float var11 = 124.04F;
         float var12 = 21.325F;
         if (var5 == 0 && VunVVUVnvv.UuUVuuUu(var6, var7, var9, var10, var11, var12)) {
            UUVNUUUnNUv.unNNVVNnvvV = true;
            return true;
         }

         vUnnnuun.UuUVuuUu(var6, var7);
         if (NNvNUNnUnNuU.UuUVuuUu(var6, var7, var5)) {
            return true;
         }

         if (vunnnNNUv.UuUVuuUu(var0, var6, var7, var5)) {
            return true;
         }

         vvNVnVNVnNNn.UuUVuuUu(var1, var3, var5);
      }

      if (UUVNUUUnNUv.uNnUnnuNUnNu != null && var5 >= 0 && var5 <= 2) {
         int var13 = -100 - var5;
         UUVNUUUnNUv.uNnUnnuNUnNu.vVvUvVVuuNvV = var13;
         UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
         UUVNUUUnNUv.uNnUnnuNUnNu = null;
         return true;
      } else {
         return false;
      }
   }
}
