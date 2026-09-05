package ru.metaculture.protection;

public class nuNuNnNV extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(double var0, double var2, int var4, double var5, double var7) {
      int var9 = (int)CoCO0oOCO0c.UuUVuuUu((float)var0, (float)var2)[0];
      int var10 = (int)CoCO0oOCO0c.UuUVuuUu((float)var0, (float)var2)[1];
      if (UUVNUUUnNUv.vNVuvnUUnuUn != null && UUVNUUUnNUv.vNVuvnUUnuUn instanceof VnnUvVNuNuVv) {
         VnnUvVNuNuVv var11 = UUVNUUUnNUv.vNVuvnUUnuUn;
         float var12 = UUVNUUUnNUv.UvnvNVnnnnNU;
         float var13 = UUVNUUUnNUv.uVUVnuvnuVuv;
         if (var12 != 0.0F || var13 != 0.0F) {
            float var14 = UvNnVvNNVvuN.UuUVuuUu(var12);
            float var15 = UvNnVvNNVvuN.C00OOC00oO(var14);
            float var16 = UvNnVvNNVvuN.uUnuvNvvNU(var13);
            float var17 = 148.0F;
            if (UUVNUUUnNUv.NVNnnvnuunNv) {
               NNvNUNnUnNuU.UuUVuuUu(var11, var9, var10, var15, var16);
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }

            if (UUVNUUUnNUv.uVunuUNVVUUV) {
               NNvNUNnUnNuU.UuUVuuUu(var11, var10, var16);
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }

            if (UUVNUUUnNUv.UNnVVNvvnVvU) {
               NNvNUNnUnNuU.UuUVuuUu(var11, var9, var15, var17);
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }
         }
      }

      if (UUVNUUUnNUv.nNvNUVU != null) {
         nNUuNvVn var18 = UUVNUUUnNUv.nNvNUVU;
         float var19 = (var9 - UUVNUUUnNUv.uUVuVvuNUvnu) / UUVNUUUnNUv.c0oOOCcCoC0;
         var19 = Math.max(0.0F, Math.min(1.0F, var19));
         var18.vVvUvVVuuNvV = var18.uNNnnnuuuN + (var18.nuUnNvnuUu - var18.uNNnnnuuuN) * var19;
         if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
         }

         return true;
      } else {
         return false;
      }
   }
}
