package ru.metaculture.protection;

import java.util.List;
import java.util.stream.Collectors;
import org.wild.module.api.Module;

public class vunnnNNUv extends UUVNUUUnNUv {
   public static boolean UuUVuuUu(UnVNvNnU var0, int var1, int var2, int var3) {
      float var4 = UUVNUUUnNUv.nNnVnUNVV + 104.735F;
      float var5 = UUVNUUUnNUv.nuunNvv + 34.025F;
      float var6 = 261.5F;
      float var7 = 209.5F;
      float var8 = var4 + 5.0F;
      float var9 = var5 + 5.0F;
      float var10 = var6 - 10.0F;
      float var11 = var7 - 10.0F;
      if (!VunVVUVnvv.UuUVuuUu(var1, var2, var8, var9, var10, var11)) {
         return false;
      } else {
         List var12 = UUVNUUUnNUv.vVVuuVVv;
         if (UUVNUUUnNUv.unNNVVNnvvV && !UUVNUUUnNUv.VVnVNnunVvu.isEmpty()) {
            String var13 = UUVNUUUnNUv.VVnVNnunVvu.toLowerCase().trim();
            var12 = UUVNUUUnNUv.vVVuuVVv.stream().filter(var1x -> var1x.vVvUvVVuuNvV.toLowerCase().contains(var13)).collect(Collectors.toList());
         }

         int var35 = 1;
         float var14 = UUVNUUUnNUv.UuUVuuUu().vNUvnnVnUvu();
         float var15 = 0.0F;
         float var16 = 0.0F;

         for (Module var18 : var12) {
            float var19 = 12.0F;
            if (UUVNUUUnNUv.VuunNUUUvu.contains(var18)) {
               for (nvUuvVvuuN var21 : var18.nuUnNvnuUu()) {
                  var19 += vVNnuUvn.UuUVuuUu(var0, var21);
               }

               var19 = Math.max(var19, 20.0F);
            }

            if (var35 % 2 == 0) {
               float var37 = var14 + var16 - 30.0F;
               float var39 = UUVNUUUnNUv.nNnVnUNVV + 238.35F;
               float var40 = UUVNUUUnNUv.nuunNvv + 43.365F + var37;
               float var41 = 121.47F;
               float var42 = 21.325F;
               if (UUVNUUUnNUv.VuunNUUUvu.contains(var18) && var3 == 0) {
                  float var44 = UUVNUUUnNUv.nuunNvv + 64.69F + var37 + 4.0F;
                  float var47 = UUVNUUUnNUv.nNnVnUNVV + 238.35F + 9.0F;
                  float var50 = 105.47F;
                  float var53 = 0.0F;

                  for (nvUuvVvuuN var59 : var18.nuUnNvnuUu()) {
                     float var62 = var44 + var53;
                     if (unvunu.UuUVuuUu(var0, var59, var47, var62, var50, var1, var2, var3)) {
                        return true;
                     }

                     var53 += vVNnuUvn.UuUVuuUu(var0, var59) + 1.0F;
                  }
               }

               if (UUVNUUUnNUv.VuunNUUUvu.contains(var18)) {
                  var16 += var19;
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var39, var40, var41, var42) && var3 == 0) {
                  var18.a_();
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var39, var40, var41, var42) && var3 == 1 && !var18.nuUnNvnuUu().isEmpty()) {
                  if (UUVNUUUnNUv.VuunNUUUvu.contains(var18)) {
                     UUVNUUUnNUv.VuunNUUUvu.remove(var18);
                     UUVNUUUnNUv.UuUVuuUu(var18).UuUVuuUu(0.0, 0.6F, VnuVvnV.UnUNVVVNuv);
                     UUVNUUUnNUv.C00OOC00oO(var18).UuUVuuUu(0.0, 0.16F, VnuVvnV.UNnVVNvvnVvU);
                     if (UUVNUUUnNUv.vNVuvnUUnuUn != null && var18.nuUnNvnuUu().contains(UUVNUUUnNUv.vNVuvnUUnuUn)) {
                        UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
                        UUVNUUUnNUv.vNVuvnUUnuUn = null;
                        UUVNUUUnNUv.UvnvNVnnnnNU = 0.0F;
                        UUVNUUUnNUv.uVUVnuvnuVuv = 0.0F;
                     }
                  } else {
                     UUVNUUUnNUv.VuunNUUUvu.add(var18);
                     UUVNUUUnNUv.C00OOC00oO(var18).UuUVuuUu(1.0, 0.16F, VnuVvnV.UNnVVNvvnVvU);
                     UUVNUUUnNUv.UuUVuuUu(var18).UuUVuuUu(1.0, 0.6F, VnuVvnV.UnUNVVVNuv);
                  }
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var39, var40, var41, var42) && var3 == 2) {
                  if (var18.nvUVNnuu) {
                     var18.nvUVNnuu = false;
                     UUVNUUUnNUv.UnUNuUU = null;
                     UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                  } else {
                     if (UUVNUUUnNUv.UnUNuUU != null) {
                        UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
                        UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                     }

                     UUVNUUUnNUv.UnUNuUU = var18;
                     var18.nvUVNnuu = true;
                     UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                  }

                  return true;
               }

               if (var18.nvUVNnuu || var18.uNNnnnuuuN != -1) {
                  float var45 = UUVNUUUnNUv.nNnVnUNVV + 247.895F;
                  float var48 = UUVNUUUnNUv.nuunNvv + 49.555F + var37;
                  float var51 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var18.vVvUvVVuuNvV, 14.0F).UuUVuuUu;
                  float var54 = var45 + var51 + 4.0F;
                  float var57 = var48 - 1.0F;
                  String var60 = var18.nvUVNnuu ? "..." : UuNVnuUvunN.UuUVuuUu(var18.uNNnnnuuuN);
                  float var63 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60, 12.0F).UuUVuuUu;
                  float var64 = 16.0F;
                  float var65 = Math.max(var64, var63 + 8.0F);
                  if (VunVVUVnvv.UuUVuuUu(var1, var2, var54, var57, var65, 16.0F)) {
                     if (var3 == 2) {
                        if (var18.nvUVNnuu) {
                           var18.nvUVNnuu = false;
                           UUVNUUUnNUv.UnUNuUU = null;
                           UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        } else {
                           if (UUVNUUUnNUv.UnUNuUU != null) {
                              UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
                              UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                           }

                           UUVNUUUnNUv.UnUNuUU = var18;
                           var18.nvUVNnuu = true;
                           UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        }

                        return true;
                     }

                     if (var18.nvUVNnuu && var3 >= 0 && var3 <= 8) {
                        int var66 = -100 - var3;
                        var18.uNNnnnuuuN = var66;
                        var18.nvUVNnuu = false;
                        UUVNUUUnNUv.UnUNuUU = null;
                        UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        return true;
                     }
                  }
               }
            } else {
               float var36 = var14 + var15;
               float var38 = UUVNUUUnNUv.nNnVnUNVV + 111.885F;
               float var22 = UUVNUUUnNUv.nuunNvv + 43.365F + var36;
               float var23 = 121.47F;
               float var24 = 21.325F;
               if (UUVNUUUnNUv.VuunNUUUvu.contains(var18) && var3 == 0) {
                  float var25 = UUVNUUUnNUv.nuunNvv + 64.69F + var36 + 4.0F;
                  float var26 = UUVNUUUnNUv.nNnVnUNVV + 111.885F + 9.0F;
                  float var27 = 105.47F;
                  float var28 = 0.0F;

                  for (nvUuvVvuuN var30 : var18.nuUnNvnuUu()) {
                     float var31 = var25 + var28;
                     if (unvunu.UuUVuuUu(var0, var30, var26, var31, var27, var1, var2, var3)) {
                        return true;
                     }

                     var28 += vVNnuUvn.UuUVuuUu(var0, var30) + 1.0F;
                  }
               }

               if (UUVNUUUnNUv.VuunNUUUvu.contains(var18)) {
                  var15 += var19;
               }

               if (var18.nvUVNnuu || var18.uNNnnnuuuN != -1) {
                  float var43 = UUVNUUUnNUv.nNnVnUNVV + 121.425F;
                  float var46 = UUVNUUUnNUv.nuunNvv + 49.555F + var36;
                  float var49 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var18.vVvUvVVuuNvV, 14.0F).UuUVuuUu;
                  float var52 = var43 + var49 + 4.0F;
                  float var55 = var46 - 1.0F;
                  String var58 = var18.nvUVNnuu ? "..." : UuNVnuUvunN.UuUVuuUu(var18.uNNnnnuuuN);
                  float var61 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var58, 12.0F).UuUVuuUu;
                  float var32 = 16.0F;
                  float var33 = Math.max(var32, var61 + 8.0F);
                  if (VunVVUVnvv.UuUVuuUu(var1, var2, var52, var55, var33, 16.0F)) {
                     if (var3 == 2) {
                        if (var18.nvUVNnuu) {
                           var18.nvUVNnuu = false;
                           UUVNUUUnNUv.UnUNuUU = null;
                           UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        } else {
                           if (UUVNUUUnNUv.UnUNuUU != null) {
                              UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
                              UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(0.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                           }

                           UUVNUUUnNUv.UnUNuUU = var18;
                           var18.nvUVNnuu = true;
                           UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        }

                        return true;
                     }

                     if (var18.nvUVNnuu && var3 >= 0 && var3 <= 8) {
                        int var34 = -100 - var3;
                        var18.uNNnnnuuuN = var34;
                        var18.nvUVNnuu = false;
                        UUVNUUUnNUv.UnUNuUU = null;
                        UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
                        return true;
                     }
                  }
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var38, var22, var23, var24) && var3 == 0) {
                  var18.a_();
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var38, var22, var23, var24) && var3 == 1 && !var18.nuUnNvnuUu().isEmpty()) {
                  if (UUVNUUUnNUv.VuunNUUUvu.contains(var18)) {
                     UUVNUUUnNUv.VuunNUUUvu.remove(var18);
                     UUVNUUUnNUv.UuUVuuUu(var18).UuUVuuUu(0.0, 0.6F, VnuVvnV.UnUNVVVNuv);
                     UUVNUUUnNUv.C00OOC00oO(var18).UuUVuuUu(0.0, 0.16F, VnuVvnV.UNnVVNvvnVvU);
                     if (UUVNUUUnNUv.vNVuvnUUnuUn != null && var18.nuUnNvnuUu().contains(UUVNUUUnNUv.vNVuvnUUnuUn)) {
                        UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
                        UUVNUUUnNUv.vNVuvnUUnuUn = null;
                        UUVNUUUnNUv.UvnvNVnnnnNU = 0.0F;
                        UUVNUUUnNUv.uVUVnuvnuVuv = 0.0F;
                     }
                  } else {
                     UUVNUUUnNUv.VuunNUUUvu.add(var18);
                     UUVNUUUnNUv.C00OOC00oO(var18).UuUVuuUu(1.0, 0.16F, VnuVvnV.UNnVVNvvnVvU);
                     UUVNUUUnNUv.UuUVuuUu(var18).UuUVuuUu(1.0, 0.6F, VnuVvnV.UnUNVVVNuv);
                  }
               }

               if (VunVVUVnvv.UuUVuuUu(var1, var2, var38, var22, var23, var24) && var3 == 2) {
                  if (var18.nvUVNnuu) {
                     var18.nvUVNnuu = false;
                     UUVNUUUnNUv.UnUNuUU = null;
                     UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(0.0, 1.0, VnuVvnV.UNnVVNvvnVvU);
                  } else {
                     if (UUVNUUUnNUv.UnUNuUU != null) {
                        UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
                        UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(0.0, 1.0, VnuVvnV.UNnVVNvvnVvU);
                     }

                     UUVNUUUnNUv.UnUNuUU = var18;
                     var18.nvUVNnuu = true;
                     UUVNUUUnNUv.uUnuvNvvNU(var18).UuUVuuUu(1.0, 1.0, VnuVvnV.UNnVVNvvnVvU);
                  }

                  return true;
               }

               var14 += 30.325F;
            }

            var35++;
         }

         return false;
      }
   }

   public static float[] UuUVuuUu(UnVNvNnU var0, VnnUvVNuNuVv var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = 1;
         float var3 = UUVNUUUnNUv.UuUVuuUu().vNUvnnVnUvu();
         float var4 = 0.0F;
         float var5 = 0.0F;

         for (Module var7 : UUVNUUUnNUv.vVVuuVVv) {
            float var8 = 12.0F;
            if (UUVNUUUnNUv.VuunNUUUvu.contains(var7)) {
               for (nvUuvVvuuN var10 : var7.nuUnNvnuUu()) {
                  var8 += vVNnuUvn.UuUVuuUu(var0, var10);
               }

               var8 = Math.max(var8, 20.0F);
            }

            if (var2 % 2 == 0) {
               float var19 = var3 + var5 - 30.0F;
               if (UUVNUUUnNUv.VuunNUUUvu.contains(var7)) {
                  float var21 = UUVNUUUnNUv.nuunNvv + 64.69F + var19 + 4.0F;
                  float var22 = UUVNUUUnNUv.nNnVnUNVV + 238.35F + 9.0F;
                  float var23 = 111.47F;
                  float var24 = 0.0F;

                  for (nvUuvVvuuN var26 : var7.nuUnNvnuUu()) {
                     if (var26 == var1) {
                        float var27 = var22 + var23 - 15.0F;
                        float var28 = var21 + var24 - 5.0F;
                        return new float[]{var27, var28};
                     }

                     var24 += vVNnuUvn.UuUVuuUu(var0, var26) + 3.0F;
                  }

                  var5 += var8;
               }
            } else {
               float var18 = var3 + var4;
               if (UUVNUUUnNUv.VuunNUUUvu.contains(var7)) {
                  float var20 = UUVNUUUnNUv.nuunNvv + 64.69F + var18 + 4.0F;
                  float var11 = UUVNUUUnNUv.nNnVnUNVV + 111.885F + 9.0F;
                  float var12 = 111.47F;
                  float var13 = 0.0F;

                  for (nvUuvVvuuN var15 : var7.nuUnNvnuUu()) {
                     if (var15 == var1) {
                        float var16 = var11 + var12 - 15.0F;
                        float var17 = var20 + var13 - 5.0F;
                        return new float[]{var16, var17};
                     }

                     var13 += vVNnuUvn.UuUVuuUu(var0, var15) + 3.0F;
                  }

                  var4 += var8;
               }

               var3 += 30.325F;
            }

            var2++;
         }

         return null;
      }
   }
}
