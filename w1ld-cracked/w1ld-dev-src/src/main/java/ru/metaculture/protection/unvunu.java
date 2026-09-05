package ru.metaculture.protection;

public class unvunu extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(UnVNvNnU var0, nvUuvVvuuN var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      if (var1 instanceof vvNnnUNnVvn var8) {
         float var9 = 8.0F;
         float var10 = var2 + var4 - var9 - 3.0F;
         float var11 = var3 + 2.0F;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var10, var11, var9, var9)) {
            var8.C00OOC00oO(!var8.uUnuvNvvNU());
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }

            return true;
         }
      }

      if (var1 instanceof uVNuNUVvn var24) {
         float var31 = 10.075F;
         String var38 = var24.VVuuUN ? "..." : UNuNUNVv.C00OOC00oO(var24.vVvUvVVuuNvV);
         float var45 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var38, 12.0F).UuUVuuUu;
         float var12 = 16.055F;
         float var13 = Math.max(var12, var45 + 8.0F);
         float var14 = var2 + var4 - var13 - 2.0F;
         if (var14 < var2) {
            var14 = var2;
            var13 = var4 - 2.0F;
         }

         float var15 = var14 - 6.0F;
         float var16 = var13 + 2.0F;
         if (var15 < var2) {
            var16 = var15 + var16 - var2;
            var15 = var2;
         }

         if (VunVVUVnvv.UuUVuuUu(var5, var6, var15, var3, var16, var31)) {
            if (var7 == 0) {
               if (UUVNUUUnNUv.uNnUnnuNUnNu != var24) {
                  if (UUVNUUUnNUv.uNnUnnuNUnNu != null) {
                     UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
                  }

                  UUVNUUUnNUv.uNnUnnuNUnNu = var24;
                  var24.VVuuUN = true;
               }

               return true;
            }

            if (UUVNUUUnNUv.uNnUnnuNUnNu == var24 && var7 >= 0 && var7 <= 8) {
               int var72 = -100 - var7;
               var24.vVvUvVVuuNvV = var72;
               var24.VVuuUN = false;
               UUVNUUUnNUv.uNnUnnuNUnNu = null;
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }
         }
      }

      if (var1 instanceof VnnUvVNuNuVv var25) {
         float var32 = 40.0F;
         float var39 = var2 + var4 - var32 - 2.0F;
         float var46 = var39 - 10.0F;
         float var54 = 46.48F;
         float var58 = 10.075F;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var46, var3, var54, var58)) {
            if (UUVNUUUnNUv.vNVuvnUUnuUn == var25) {
               UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
               UUVNUUUnNUv.vNVuvnUUnuUn = null;
               UUVNUUUnNUv.UvnvNVnnnnNU = 0.0F;
               UUVNUUUnNUv.uVUVnuvnuVuv = 0.0F;
            } else {
               UUVNUUUnNUv.vNVuvnUUnuUn = var25;
               UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.FORWARDS);
               float[] var66 = vunnnNNUv.UuUVuuUu(var0, var25);
               if (var66 != null) {
                  UUVNUUUnNUv.UvnvNVnnnnNU = var66[0];
                  UUVNUUUnNUv.uVUVnuvnuVuv = var66[1];
               }
            }

            return true;
         }

         if (UUVNUUUnNUv.vNVuvnUUnuUn == var25 && NNvNUNnUnNuU.UuUVuuUu(var5, var6, var7)) {
            return true;
         }
      }

      if (var1 instanceof nNUuNvVn var26) {
         float var33 = 4.0F;
         float var40 = var3 + 10.0F;
         float var47 = var4 - 2.5F;
         float var55 = var40 + 2.0F;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var2, var55, var47, var33)) {
            UUVNUUUnNUv.nNvNUVU = var26;
            UUVNUUUnNUv.uUVuVvuNUvnu = var2;
            UUVNUUUnNUv.UvUvUNuvNU = var55;
            UUVNUUUnNUv.c0oOOCcCoC0 = var47;
            float var61 = (var5 - var2) / var47;
            var61 = Math.max(0.0F, Math.min(1.0F, var61));
            var26.vVvUvVVuuNvV = var26.uNNnnnuuuN + (var26.nuUnNvnuUu - var26.uNNnnnuuuN) * var61;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }

            return true;
         }
      }

      if (var1 instanceof vNnVvvNU var27) {
         float var34 = 10.075F;
         float var41 = 60.0F;
         float var48 = var2 + var4 - var41 - 2.0F;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var48, var3, var41, var34)) {
            var27.vVvUvVVuuNvV();
            return true;
         }
      }

      if (var1 instanceof UvNnUnuNUUU var28) {
         float var35 = 2.0F;
         float var42 = 10.075F;
         float var49 = 3.0F;
         float var52 = -2.0F;
         float var56 = var49;
         float var59 = 0.0F;

         for (String var67 : var28.vVvUvVVuuNvV) {
            float var17 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var67, 12.0F).UuUVuuUu + var49 * 2.0F;
            if (var56 + var17 > var4 && var56 > var49) {
               var56 = var49;
               var59 += var42 + var52;
            }

            var56 += var17 + var35;
         }

         float var64 = var3 + 10.0F;
         float var69 = var59 + var42;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var2, var64, var4, var69)) {
            float var18 = var49;
            float var19 = 1.5F;

            for (String var21 : var28.vVvUvVVuuNvV) {
               float var22 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var21, 12.0F).UuUVuuUu + var49 * 2.0F;
               if (var18 + var22 > var4 && var18 > var49) {
                  var18 = var49;
                  var19 += var42 + var52;
               }

               if (VunVVUVnvv.UuUVuuUu(var5, var6, var2 + var18, var64 + var19, var22, var42)) {
                  var28.uNNnnnuuuN = var21;
                  var28.vNUvnnVnUvu = var28.vVvUvVVuuNvV.indexOf(var21);
                  if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                     NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
                  }

                  return true;
               }

               var18 += var22 + var35;
            }
         }
      }

      if (var1 instanceof NVuVVUNUvV var29) {
         float var36 = 10.075F;
         float var43 = 63.56F;
         float var50 = var2 + 42.0F;
         if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var50, var3, var43, var36)) {
            if (UUVNUUUnNUv.NnUuNNU != var29) {
               if (UUVNUUUnNUv.NnUuNNU != null) {
                  UUVNUUUnNUv.NnUuNNU.vNUvnnVnUvu = false;
               }

               UUVNUUUnNUv.NnUuNNU = var29;
               var29.vNUvnnVnUvu = true;
            }

            return true;
         }

         if (var7 == 0 && UUVNUUUnNUv.NnUuNNU == var29) {
            UUVNUUUnNUv.NnUuNNU.vNUvnnVnUvu = false;
            UUVNUUUnNUv.NnUuNNU = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         }
      }

      if (var1 instanceof VUVnvvnNN var30) {
         float var37 = var3 + 10.0F;
         float var44 = var2;
         float var51 = var37;
         float var53 = 3.0F;
         float var57 = 10.0F;
         float var60 = 4.0F;

         for (vvNnnUNnVvn var68 : var30.vVvUvVVuuNvV) {
            float var70 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var68.UuUVuuUu, 12.0F).UuUVuuUu;
            float var71 = var70 + var60 * 2.0F;
            if (var44 + var71 > var2 + var4) {
               var44 = var2;
               var51 += var57 + var53;
            }

            if (var7 == 0 && VunVVUVnvv.UuUVuuUu(var5, var6, var44, var51, var71, var57)) {
               var68.C00OOC00oO(!var68.uUnuvNvvNU());
               if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
                  NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
               }

               return true;
            }

            var44 += var71 + var53;
         }
      }

      return false;
   }
}
