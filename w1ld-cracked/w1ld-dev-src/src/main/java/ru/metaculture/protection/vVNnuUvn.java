package ru.metaculture.protection;

import java.awt.Color;
import java.util.HashMap;

public class vVNnuUvn {
   public static VVnnnnN UuUVuuUu = new VVnnnnN();
   public static HashMap<String, Float> C00OOC00oO = new HashMap<>();
   public static HashMap<String, Float> uUnuvNvvNU = new HashMap<>();
   public static HashMap<String, Float> vVvUvVVuuNvV = new HashMap<>();

   public static float UuUVuuUu(UnVNvNnU var0, nvUuvVvuuN var1) {
      if (var1 instanceof VnnUVUVvV) {
         return ((VnnUVUVvV)var1).uUnuvNvvNU();
      } else if (var1 instanceof vvNnnUNnVvn) {
         return 10.0F;
      } else if (var1 instanceof nNUuNvVn) {
         return 19.0F;
      } else if (var1 instanceof UvNnUnuNUUU var15) {
         float var16 = 105.47F;
         float var17 = 2.0F;
         float var18 = 10.075F;
         float var19 = 3.0F;
         float var20 = -2.0F;
         float var21 = var19;
         float var22 = 0.0F;

         for (String var24 : var15.vVvUvVVuuNvV) {
            float var25 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 12.0F).UuUVuuUu + var19 * 2.0F;
            if (var21 + var25 > var16 && var21 > var19) {
               var21 = var19;
               var22 += var18 + var20;
            }

            var21 += var25 + var17;
         }

         return var22 + var18 + 12.0F;
      } else if (var1 instanceof uVNuNUVvn) {
         return 13.0F;
      } else if (var1 instanceof NVuVVUNUvV) {
         return 15.0F;
      } else if (var1 instanceof VnnUvVNuNuVv) {
         return 15.0F;
      } else if (var1 instanceof VUVnvvnNN var2) {
         float var3 = 0.0F;
         float var4 = 10.0F;
         float var5 = 0.0F;
         float var6 = var4;
         float var7 = 3.0F;
         float var8 = 10.0F;
         float var9 = 4.0F;
         float var10 = 105.47F;

         for (vvNnnUNnVvn var12 : var2.vVvUvVVuuNvV) {
            float var13 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12.UuUVuuUu, 12.0F).UuUVuuUu;
            float var14 = var13 + var9 * 2.0F;
            if (var5 + var14 > 0.0F + var10) {
               var5 = 0.0F;
               var6 += var8 + var7;
            }

            var5 += var14 + var7;
         }

         return var6 - 0.0F + var8;
      } else {
         return 15.0F;
      }
   }

   public static float UuUVuuUu(
      UnVNvNnU var0, nvUuvVvuuN var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, float var12
   ) {
      float var13 = 0.0F;
      if (var1 instanceof VnnUVUVvV) {
         var13 = ((VnnUVUVvV)var1).uUnuvNvvNU();
      } else if (var1 instanceof vvNnnUNnVvn var14) {
         boolean var15 = var14.uUnuvNvvNU();
         float var16 = 8.0F;
         float var17 = var2 + var4 - var16 - 3.0F;
         float var18 = var3 + 2.0F;
         var14.uNNnnnuuuN.UuUVuuUu();
         var14.uNNnnnuuuN.UuUVuuUu(var15 ? 1.0 : 0.0, 0.15F, VvVUUNUu.UNnVVNvvnVvU);
         var0.UuUVuuUu(var17, var18, var16, var16, 3.0F, var7, 0.1F);
         var0.UuUVuuUu(var17, var18, var16, var16, 3.0F, var9);
         var0.UuUVuuUu(var17 + 2.3F, var18 + 2.2F, 3.42F, 3.425F, 3.0F, VnVnuUn.uNNnnnuuuN(0, var8, var14.uNNnnnuuuN.uNNnnnuuuN()));
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 3.0F + 5.0F, 13.0F, var1.UuUVuuUu, var10);
         var13 = 10.0F;
      } else if (var1 instanceof nNUuNvVn var41) {
         float var47 = 4.0F;
         float var54 = var3 + 10.0F;
         float var61 = var4 - 2.5F;
         uVVuNvUUV var67 = UUVNUUUnNUv.UuUVuuUu(var41);
         float var19 = (var41.vVvUvVVuuNvV - var41.uNNnnnuuuN) / (var41.nuUnNvnuUu - var41.uNNnnnuuuN);
         double var20 = var67.vuuuNvNuv();
         var67.UuUVuuUu();
         var67.UuUVuuUu(var19, 0.24F, VnuVvnV.UnUNVVVNuv);
         float var22 = (float)var67.nvUVNnuu();
         float var23 = var61 * var22;
         var0.UuUVuuUu(var2, var54 + 2.0F, var61, var47, 2.0F, var7, 0.3F);
         var0.UuUVuuUu(var2, var54 + 2.0F, var61, var47, 2.0F, var9);
         var0.UuUVuuUu(var2 + 1.0F, var54 + 2.5F, var23 - 2.0F, var47 - 1.0F, 2.0F, var8);
         var0.UuUVuuUu(var2 + 1.0F + var23 - 5.0F + (var23 == 0.0F ? 5 : 2), var54 + 2.2F, 5.0F, 3.88F, 2.0F, var11);
         String var24 = var41.vuuuNvNuv ? String.format("%.1f%%", var41.vVvUvVVuuNvV) : String.format("%.1f / %.1f", var41.vVvUvVVuuNvV, var41.nuUnNvnuUu);
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 1.0F + 7.0F, 13.0F, var1.UuUVuuUu, var10);
         var0.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu, var2 + var61 - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 13.0F).UuUVuuUu - 2.0F, var3 + 7.0F, 13.0F, var24, var8
         );
         var13 = 19.0F;
      } else if (var1 instanceof UvNnUnuNUUU var42) {
         for (String var55 : var42.vVvUvVVuuNvV) {
            C00OOC00oO.putIfAbsent(var55, 0.0F);
         }

         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 7.0F, 13.0F, var1.UuUVuuUu, var10);
         float var49 = 2.0F;
         float var56 = 10.075F;
         float var62 = 3.0F;
         float var68 = -2.0F;
         float var72 = var62;
         float var77 = 0.0F;

         for (String var87 : var42.vVvUvVVuuNvV) {
            float var93 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var87, 12.0F).UuUVuuUu + var62 * 2.0F;
            if (var72 + var93 > var4 && var72 > var62) {
               var72 = var62;
               var77 += var56 + var68;
            }

            var72 += var93 + var49;
         }

         float var82 = var3 + 10.0F;
         float var88 = var77 + var56;
         var0.UuUVuuUu(var2, var82, var4, var88, 3.0F, var7, 0.1F);
         var0.UuUVuuUu(var2, var82, var4, var88, 3.0F, var9);
         float var94 = var62;
         float var99 = 1.5F;

         for (String var26 : var42.vVvUvVVuuNvV) {
            boolean var27 = var26.equals(var42.uNNnnnuuuN);
            float var28 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var26, 12.0F).UuUVuuUu + var62 * 2.0F;
            if (var94 + var28 > var4 && var94 > var62) {
               var94 = var62;
               var99 += var56 + var68;
            }

            float var29 = C00OOC00oO.get(var26);
            float var30 = var27 ? 1.0F : 0.0F;
            var29 = VuUVnvUuVN.UuUVuuUu(var29, var30, 10.0F);
            C00OOC00oO.put(var26, var29);
            int var32 = VnVnuUn.uNNnnnuuuN(var10, var8, var29);
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 + var94, var82 + var99 + 5.5F, 12.0F, var26, var32);
            var94 += var28 + var49;
         }

         var13 = var88 + 12.0F;
      } else if (var1 instanceof uVNuNUVvn var43) {
         float var50 = 10.075F;
         String var57 = var1.UuUVuuUu != null && !var1.UuUVuuUu.isEmpty() ? var1.UuUVuuUu : "KEY";
         String var63 = var43.VVuuUN ? "..." : UNuNUNVv.C00OOC00oO(var43.vVvUvVVuuNvV);
         float var69 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var63, 12.0F).UuUVuuUu;
         float var73 = 16.055F;
         float var78 = Math.max(var73, var69 + 8.0F);
         float var83 = var2 + var4 - var78 - 2.0F;
         if (var83 < var2) {
            var83 = var2;
            var78 = var4 - 2.0F;
         }

         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 1.0F + 6.8F, 13.0F, var57, var10);
         float var89 = var83 - 6.0F;
         float var95 = var78 + 2.0F;
         if (var89 < var2) {
            var95 = var89 + var95 - var2;
            var89 = var2;
         }

         var0.UuUVuuUu(var89, var3, var95, var50, 3.0F, var7, 0.1F);
         var0.UuUVuuUu(var89, var3, var95, var50, 3.0F, var9);
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var89 + var95 / 2.0F - var69 / 2.0F, var3 + 1.5F + 5.7F, 12.0F, var63, var43.VVuuUN ? var8 : var10);
         var13 = 13.0F;
      } else if (var1 instanceof NVuVVUNUvV var44) {
         float var51 = 10.075F;
         float var58 = 63.56F;
         float var64 = var2 + 42.0F;
         float var74 = var64 + 5.0F;
         float var79 = var3 + 1.5F;
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 1.0F + 6.5F, 13.0F, var1.UuUVuuUu, var10);
         var0.UuUVuuUu(var64, var3, var58, var51, 3.0F, var7, 0.1F);
         var0.UuUVuuUu(var64, var3, var58 - 10.0F, var51, 3.0F, var9);
         String var84 = var44.uNNnnnuuuN;
         boolean var90 = var84.isEmpty();
         float var96 = var74;
         if (var90) {
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var74 - 2.0F, var79 - 0.5F + 6.1F, 12.0F, "Enter text", var10);
         } else {
            float var100 = var74;
            float var105 = var64 + var58 - 5.0F;
            float var109 = var74;
            float var113 = var64 + var58 - 5.0F;

            for (int var117 = 0; var117 < var84.length(); var117++) {
               char var120 = var84.charAt(var117);
               String var122 = String.valueOf(var120);
               float var31 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var122, 12.0F).UuUVuuUu;
               if (var100 + var31 > var105) {
                  var96 = var100;
                  break;
               }

               var11 = var10;
               if (var117 >= 16) {
                  float var123 = var109 + UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var84.substring(0, 16), 12.0F).UuUVuuUu;
                  float var33 = Math.min(30.0F, var113 - var123);
                  if (var33 > 0.0F) {
                     float var34 = (var100 - var123) / var33;
                     var34 = UuvVnuU.vuuuNvNuv(var34, 0.0F, 1.0F);
                     int var35 = var10 >> 24 & 0xFF;
                     var35 = (int)(var35 * (1.0F - var34));
                     var11 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var10, var35);
                  } else {
                     var11 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var10, 0);
                  }
               }

               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var100 - 2.0F, var79 - 0.5F + 6.1F, 12.0F, var122, var11);
               var100 += var31;
               var96 = var100;
            }
         }

         boolean var101 = UUVNUUUnNUv.NnUuNNU == var44 && var44.vNUvnnVnUvu;
         if (var101) {
            long var106 = System.currentTimeMillis();
            boolean var114 = var106 / 500L % 2L == 0L;
            if (var114) {
               var0.UuUVuuUu(var96 - 3.0F, var79 - 0.5F, 1.0F, 8.0F, 0.5F, var8);
            }
         }

         var13 = 15.0F;
      } else if (var1 instanceof VnnUvVNuNuVv var45) {
         float var52 = 12.0F;
         float var59 = 40.0F;
         float var65 = var2 + var4 - var59 - 2.0F;
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 1.0F + 7.0F, 13.0F, var1.UuUVuuUu, var10);
         Color var70 = var45.uUnuvNvvNU();
         var0.UuUVuuUu(var65 - 10.0F, var3, 46.48F, 10.075F, 3.0F, var7, 0.1F);
         var0.UuUVuuUu(var65 - 10.0F, var3, 46.48F, 10.075F, 3.0F, var9);
         float var75 = var65 + 22.0F;
         float var80 = var3 + 0.8F;
         float var85 = 13.285F;
         float var91 = 8.315F;
         int var97 = Math.round(var45.vNVuvnUUnuUn * var12 * 255.0F) << 24 | var70.getRed() << 16 | var70.getGreen() << 8 | var70.getBlue();
         var0.UuUVuuUu(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F);

         try {
            boolean var102 = false;

            for (float var107 = var80; var107 < var80 + var91; var107 += 3.0F) {
               boolean var110 = var102;
               float var115 = Math.min(3.0F, var80 + var91 - var107);

               for (float var118 = var75; var118 < var75 + var85; var118 += 3.0F) {
                  float var121 = Math.min(3.0F, var75 + var85 - var118);
                  var0.UuUVuuUu(var118, var107, var121, var115, VnVnuUn.uUnuvNvvNU(var110 ? -12762550 : -14407632, var12 * 0.8F));
                  var110 = !var110;
               }

               var102 = !var102;
            }

            var0.UuUVuuUu(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F, var97);
            var0.C00OOC00oO(var75, var80, var85, var91 * 0.55F, 0.0F, 3.0F, 0.0F, 0.0F, VnVnuUn.uUnuvNvvNU(-1, var12 * 0.28F), 0);
         } finally {
            var0.nuUnNvnuUu();
         }

         var0.UuUVuuUu(var75, var80, var85, var91, 0.0F, 3.0F, 3.0F, 0.0F, VnVnuUn.uUnuvNvvNU(-1, var12 * 0.4F), 0.5F);
         String var103 = String.format("#%02X%02X%02X", var70.getRed(), var70.getGreen(), var70.getBlue());
         var0.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu,
            var65 + var59 / 2.0F - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var103, 12.0F).UuUVuuUu / 2.0F - 14.0F,
            var3 + 1.5F + 5.7F,
            12.0F,
            var103,
            var10
         );
         var13 = 15.0F;
      } else if (var1 instanceof VUVnvvnNN var46) {
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3 + 7.0F, 13.0F, var1.UuUVuuUu, var10);
         float var53 = var3 + 10.0F;
         float var60 = var2;
         float var66 = var53;
         float var71 = 3.0F;
         float var76 = 10.0F;
         float var81 = 4.0F;

         for (vvNnnUNnVvn var92 : var46.vVvUvVVuuNvV) {
            float var98 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var92.UuUVuuUu, 12.0F).UuUVuuUu;
            float var104 = var98 + var81 * 2.0F;
            if (var60 + var104 > var2 + var4) {
               var60 = var2;
               var66 += var76 + var71;
            }

            var0.UuUVuuUu(var60, var66, var104, var76, 3.0F, var7, 0.1F);
            var0.UuUVuuUu(var60, var66, var104, var76, 3.0F, var9);
            String var108 = var1.UuUVuuUu + "_" + var92.UuUVuuUu;
            vVvUvVVuuNvV.putIfAbsent(var108, var92.uUnuvNvvNU() ? 1.0F : 0.0F);
            float var111 = vVvUvVVuuNvV.get(var108);
            float var116 = var92.uUnuvNvvNU() ? 1.0F : 0.0F;
            var111 = VuUVnvUuVN.UuUVuuUu(var111, var116, 10.0F);
            vVvUvVVuuNvV.put(var108, var111);
            var11 = VnVnuUn.uNNnnnuuuN(var10, var8, var111);
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60 + var81, var66 + 3.0F - 1.0F + 5.0F, 12.0F, var92.UuUVuuUu, var11);
            var60 += var104 + var71;
         }

         var13 = var66 - var3 + var76;
      }

      return var13 + 1.0F;
   }
}
