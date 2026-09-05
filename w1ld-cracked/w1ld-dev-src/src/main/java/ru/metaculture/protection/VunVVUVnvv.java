package ru.metaculture.protection;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.class_4587;
import org.wild.module.api.Module;

public class VunVVUVnvv extends UUVNUUUnNUv {
   private static final char[] nNuVunNUVu = new char[65535];

   public static void UuUVuuUu(UnVNvNnU var0, class_4587 var1, int var2, int var3, float var4) {
      if (UUVNUUUnNUv.unNNVVNnvvV) {
         NVnVnU.UuUVuuUu().UuUVuuUu("Search");
      } else {
         NVnVnU.UuUVuuUu().C00OOC00oO("Search");
      }

      if (UUVNUUUnNUv.unNNVVNnvvV) {
         boolean var5 = UNuNUNVv.UuUVuuUu(259);
         long var6 = System.currentTimeMillis();
         if (var5) {
            if (!UUVNUUUnNUv.NVUunUNUN) {
               UUVNUUUnNUv.NVUunUNUN = true;
               UUVNUUUnNUv.UUVNuUNUvUnV = var6;
               UUVNUUUnNUv.NuunnvnN = var6;
               if (!UUVNUUUnNUv.VVnVNnunVvu.isEmpty()) {
                  UUVNUUUnNUv.VVnVNnunVvu = UUVNUUUnNUv.VVnVNnunVvu.substring(0, UUVNUUUnNUv.VVnVNnunVvu.length() - 1);
               }
            } else if (var6 - UUVNUUUnNUv.UUVNuUNUvUnV > 500L && var6 - UUVNUUUnNUv.NuunnvnN > 30L) {
               if (!UUVNUUUnNUv.VVnVNnunVvu.isEmpty()) {
                  UUVNUUUnNUv.VVnVNnunVvu = UUVNUUUnNUv.VVnVNnunVvu.substring(0, UUVNUUUnNUv.VVnVNnunVvu.length() - 1);
               }

               UUVNUUUnNUv.NuunnvnN = var6;
            }
         } else {
            UUVNUUUnNUv.NVUunUNUN = false;
            UUVNUUUnNUv.UUVNuUNUvUnV = 0L;
         }
      } else {
         UUVNUUUnNUv.NVUunUNUN = false;
         UUVNUUUnNUv.UUVNuUNUvUnV = 0L;
      }

      int var63 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), (int)(20.4F * var4));
      int var64 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(10.2F * var4));
      int var7 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(255.0F * var4));
      int var8 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(15.3F * var4));
      int var9 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(102.0F * var4));
      int var10 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), (int)(255.0F * var4));
      int var11 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(1, 1), (int)(178.5F * var4));
      Color var12 = UnVNvNnU.VvunVVUvUNnv.UuuNnUvUuv(UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(56.0F * var4)));
      float var13 = UUVNUUUnNUv.nNnVnUNVV + 104.735F;
      float var14 = UUVNUUUnNUv.nuunNvv + 34.025F;
      float var15 = 261.5F;
      float var16 = 209.5F;
      float var17 = var13 + 5.0F;
      float var18 = var14 + 5.0F;
      float var19 = var15 - 10.0F;
      float var20 = var16 - 10.0F;
      var0.UuUVuuUu(var17, var18, var19, var20, 0.0F, 0.0F, 0.0F, 0.0F);
      List var21 = UUVNUUUnNUv.vVVuuVVv;
      if (UUVNUUUnNUv.unNNVVNnvvV && !UUVNUUUnNUv.VVnVNnunVvu.isEmpty()) {
         String var22 = UUVNUUUnNUv.VVnVNnunVvu.toLowerCase().trim();
         String var23 = UuUVuuUu(var22);
         var21 = UUVNUUUnNUv.vVVuuVVv.stream().filter(var2x -> {
            String var3x = var2x.vVvUvVVuuNvV.toLowerCase();
            return var3x.contains(var22) || !var23.equals(var22) && var3x.contains(var23);
         }).collect(Collectors.toList());
      }

      float var65 = 0.0F;
      float var66 = 0.0F;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = 0.0F;
      int var27 = 1;

      for (Module var29 : var21) {
         var29.UnUNVVVNuv.UuUVuuUu();
         var29.UnUNVVVNuv.UuUVuuUu(var29.nuUnNvnuUu ? 1.0 : 0.0, 0.15F, VvVUUNUu.UNnVVNvvnVvU);
         var29.vNVuvnUUnuUn.C00OOC00oO(var29.nuUnNvnuUu ? uununU.FORWARDS : uununU.BACKWARDS);
         float var30 = var29.UnUNVVVNuv.uNNnnnuuuN();
         float var31 = 12.0F;
         float var32 = 12.0F;
         float var33 = UUVNUUUnNUv.UuUVuuUu(var29).uNNnnnuuuN();
         float var34 = UUVNUUUnNUv.C00OOC00oO(var29).uNNnnnuuuN();
         if (UUVNUUUnNUv.VuunNUUUvu.contains(var29) || var33 > 0.0F || var34 > 0.0F) {
            for (nvUuvVvuuN var36 : var29.nuUnNvnuUu()) {
               var32 += vVNnuUvn.UuUVuuUu(var0, var36);
            }

            var32 = Math.max(var32, 20.0F);
            var31 = 12.0F + (var32 - 12.0F) * var33;
         }

         if (var27 % 2 == 0) {
            float var75 = var65 + var24 - 30.0F;
            float var78 = 21.325F;
            var78 += var31;
            float var37 = var75 + var78;
            var26 = Math.max(var26, var37);
            var24 += var31;
         } else {
            float var76 = var65 + var66;
            float var80 = 21.325F;
            var80 += var31;
            float var83 = var76 + var80;
            var25 = Math.max(var25, var83);
            var66 += var31;
            var65 += 30.325F;
         }

         var27++;
      }

      float var67 = Math.max(var25, var26);
      float var68 = var67 + 150.0F;
      float var69 = UUVNUUUnNUv.nNnVnUNVV + 104.735F;
      float var70 = UUVNUUUnNUv.nuunNvv + 34.025F;
      boolean var72 = UuUVuuUu(var2, var3, var69 + 5.0F, var70 + 5.0F, var15 - 10.0F, var16 - 10.0F);
      UUVNUUUnNUv.UuUVuuUu().vVvUvVVuuNvV(6.0F);
      UUVNUUUnNUv.UuUVuuUu().UuUVuuUu(var72);
      UUVNUUUnNUv.UuUVuuUu().uUnuvNvvNU();
      UUVNUUUnNUv.UuUVuuUu().UuUVuuUu(UuvVnuU.vuuuNvNuv(var68, 260.0F, 9999.0F), var16 - 10.0F);
      float var73 = -0.35F;
      float var74 = -0.7F;
      int var77 = 1;
      float var82 = UUVNUUUnNUv.UuUVuuUu().vNUvnnVnUvu();
      float var84 = 0.0F;
      float var38 = 0.0F;

      for (Module var40 : var21) {
         if (var77 % 2 == 0) {
            float var85 = var40.UnUNVVVNuv.uNNnnnuuuN();
            float var86 = var82 + var38 - 30.0F;
            float var87 = 12.0F;
            float var89 = 12.0F;
            float var91 = UUVNUUUnNUv.UuUVuuUu(var40).uNNnnnuuuN();
            float var92 = UUVNUUUnNUv.C00OOC00oO(var40).uNNnnnuuuN();
            if (UUVNUUUnNUv.VuunNUUUvu.contains(var40) || var91 > 0.0F) {
               for (nvUuvVvuuN var95 : var40.nuUnNvnuUu()) {
                  var89 += vVNnuUvn.UuUVuuUu(var0, var95) + 0.5F;
               }

               var89 = Math.max(var89, 20.0F);
               var87 = 12.0F * var91 + (var89 - 12.0F) * var91;
            }

            if (!(var91 > 0.0F) && !(var92 > 0.0F)) {
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 238.35F, UUVNUUUnNUv.nuunNvv + 43.365F + var86, 121.47F, 21.325F, 6.5F, var63, 0.1F);
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 238.35F, UUVNUUUnNUv.nuunNvv + 43.365F + var86, 121.47F, 21.325F, 6.5F, var64);
            } else {
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 238.35F, UUVNUUUnNUv.nuunNvv + 43.365F + var86, 121.47F, 21.325F + var87, 6.5F, var63, 0.1F);
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 238.35F, UUVNUUUnNUv.nuunNvv + 43.365F + var86, 121.47F, 21.325F + var87, 6.5F, var64);
               if (var92 > 0.01F) {
                  var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 238.515F, UUVNUUUnNUv.nuunNvv + 64.69F + var86, 121.47F, 1.0F, VnVnuUn.uUnuvNvvNU(var63, var92));
               }
            }

            float var96 = UUVNUUUnNUv.nNnVnUNVV + 247.895F;
            float var97 = UUVNUUUnNUv.nuunNvv + 49.555F + var86;
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var96, var97 + 6.6F, 14.0F, var40.vVvUvVVuuNvV, VnVnuUn.uNNnnnuuuN(var9, var10, var85));
            float var98 = UUVNUUUnNUv.uUnuvNvvNU(var40).uNNnnnuuuN();
            if (var40.nvUVNnuu || var40.uNNnnnuuuN != -1 || var98 > 0.0F) {
               float var100 = 10.0F;
               String var103 = var40.nvUVNnuu ? "..." : (var40.uNNnnnuuuN != -1 ? UuNVnuUvunN.UuUVuuUu(var40.uNNnnnuuuN) : "");
               float var106 = var103.isEmpty() ? 0.0F : UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var103, 12.0F).UuUVuuUu;
               float var109 = 6.0F;
               float var112 = Math.max(var109, var106 + 6.0F);
               float var115 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40.vVvUvVVuuNvV, 14.0F).UuUVuuUu;
               float var117 = var96 + var115 + 4.0F;
               float var118 = var97 - 0.35F;
               var0.UuUVuuUu(var117, var118, var112, var100, 3.0F, VnVnuUn.uUnuvNvvNU(var63, var98), 0.1F);
               var0.UuUVuuUu(var117, var118, var112, var100, 3.0F, VnVnuUn.uUnuvNvvNU(var8, var98));
               if (!var103.isEmpty()) {
                  var0.UuUVuuUu(
                     vNvnnVvvVUu.UuUVuuUu,
                     var117 + var112 / 2.0F - var106 / 2.0F - 0.2F,
                     var118 + 2.0F + 5.25F,
                     12.0F,
                     var103,
                     VnVnuUn.uUnuvNvvNU(var40.nvUVNnuu ? var7 : var9, var98)
                  );
               }
            }

            var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 348.415F - 1.5F, UUVNUUUnNUv.nuunNvv + 52.505F + var86 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var63, 0.08F);
            var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 348.415F - 1.5F, UUVNUUUnNUv.nuunNvv + 52.505F + var86 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var8);
            var0.UuUVuuUu(
               UUVNUUUnNUv.nNnVnUNVV + 349.27F - 0.75F,
               UUVNUUUnNUv.nuunNvv + 53.365F + var86 - 0.78F + var73,
               3.0F,
               3.0F,
               1.5F,
               VnVnuUn.uNNnnnuuuN(var9, var7, var85)
            );
            var0.UuUVuuUu(
               UUVNUUUnNUv.nNnVnUNVV + 349.27F + 0.7F,
               UUVNUUUnNUv.nuunNvv + 53.365F + var86 + var73,
               0.1F,
               0.1F,
               1.5F,
               2.575F,
               0.1F,
               VnVnuUn.uNNnnnuuuN(0, var12.getRGB(), var85)
            );
            if (!var40.nuUnNvnuUu().isEmpty()) {
               var0.UuUVuuUu(
                  vNvnnVvvVUu.uUnuvNvvNU,
                  UUVNUUUnNUv.nNnVnUNVV + 337.975F,
                  UUVNUUUnNUv.nuunNvv + 52.81F + var86 - 1.5F + var74 + 6.5F + 6.0F - 6.0F * var91,
                  11.0F,
                  "S",
                  VnVnuUn.uNNnnnuuuN(0, var7, var91)
               );
               var0.UuUVuuUu(
                  vNvnnVvvVUu.uUnuvNvvNU,
                  UUVNUUUnNUv.nNnVnUNVV + 337.975F,
                  UUVNUUUnNUv.nuunNvv + 52.81F + var86 - 1.5F + var74 + 6.5F + 6.0F * var91,
                  11.0F,
                  "R",
                  VnVnuUn.uNNnnnuuuN(var9, 0, var91)
               );
            }

            if (var91 > 0.0F || var92 > 0.0F) {
               float var101 = UUVNUUUnNUv.nuunNvv + 64.69F + var86 + 4.0F;
               float var104 = UUVNUUUnNUv.nNnVnUNVV + 238.35F + 9.0F;
               float var107 = 105.47F;
               float var110 = 0.0F;

               for (nvUuvVvuuN var116 : var40.nuUnNvnuUu()) {
                  var110 += vVNnuUvn.UuUVuuUu(
                        var0,
                        var116,
                        var104,
                        var101 + var110,
                        var107,
                        var2,
                        var3,
                        VnVnuUn.uUnuvNvvNU(var63, var92),
                        VnVnuUn.uUnuvNvvNU(var7, var92),
                        VnVnuUn.uUnuvNvvNU(var8, var92),
                        VnVnuUn.uUnuvNvvNU(var9, var92),
                        VnVnuUn.uUnuvNvvNU(var10, var92),
                        var4 * var92
                     )
                     * var92;
               }

               var38 += var87;
            }
         } else {
            float var41 = var40.UnUNVVVNuv.uNNnnnuuuN();
            float var42 = var82 + var84;
            float var43 = 12.0F;
            float var44 = 12.0F;
            float var45 = UUVNUUUnNUv.UuUVuuUu(var40).uNNnnnuuuN();
            float var46 = UUVNUUUnNUv.C00OOC00oO(var40).uNNnnnuuuN();
            if (UUVNUUUnNUv.VuunNUUUvu.contains(var40) || var45 > 0.0F) {
               for (nvUuvVvuuN var48 : var40.nuUnNvnuUu()) {
                  var44 += vVNnuUvn.UuUVuuUu(var0, var48) + 0.5F;
               }

               var44 = Math.max(var44, 20.0F);
               var43 = 12.0F * var45 + (var44 - 12.0F) * var45;
            }

            if (!(var45 > 0.0F) && !(var46 > 0.0F)) {
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 111.885F, UUVNUUUnNUv.nuunNvv + 43.365F + var42, 121.47F, 21.325F, 6.5F, var63, 0.1F);
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 111.885F, UUVNUUUnNUv.nuunNvv + 43.365F + var42, 121.47F, 21.325F, 6.5F, var64);
            } else {
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 111.885F, UUVNUUUnNUv.nuunNvv + 43.365F + var42, 121.47F, 21.325F + var43, 6.5F, var63, 0.1F);
               var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 111.885F, UUVNUUUnNUv.nuunNvv + 43.365F + var42, 121.47F, 21.325F + var43, 6.5F, var64);
               if (var46 > 0.01F) {
                  var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 111.885F, UUVNUUUnNUv.nuunNvv + 64.69F + var42, 121.47F, 1.0F, VnVnuUn.uUnuvNvvNU(var63, var46));
               }
            }

            float var94 = UUVNUUUnNUv.nNnVnUNVV + 121.425F;
            float var49 = UUVNUUUnNUv.nuunNvv + 49.555F + var42;
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var94, var49 + 6.6F, 14.0F, var40.vVvUvVVuuNvV, VnVnuUn.uNNnnnuuuN(var9, var10, var41));
            float var50 = UUVNUUUnNUv.uUnuvNvvNU(var40).uNNnnnuuuN();
            if (var40.nvUVNnuu || var40.uNNnnnuuuN != -1 || var50 > 0.0F) {
               float var51 = 10.0F;
               String var52 = var40.nvUVNnuu ? "..." : (var40.uNNnnnuuuN != -1 ? UuNVnuUvunN.UuUVuuUu(var40.uNNnnnuuuN) : "");
               float var53 = var52.isEmpty() ? 0.0F : UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var52, 12.0F).UuUVuuUu;
               float var54 = 6.0F;
               float var55 = Math.max(var54, var53 + 6.0F);
               float var56 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40.vVvUvVVuuNvV, 14.0F).UuUVuuUu;
               float var57 = var94 + var56 + 4.0F;
               float var58 = var49 - 0.35F;
               var0.UuUVuuUu(var57, var58, var55, var51, 3.0F, VnVnuUn.uUnuvNvvNU(var63, var50), 0.1F);
               var0.UuUVuuUu(var57, var58, var55, var51, 3.0F, VnVnuUn.uUnuvNvvNU(var8, var50));
               if (!var52.isEmpty()) {
                  var0.UuUVuuUu(
                     vNvnnVvvVUu.UuUVuuUu,
                     var57 + var55 / 2.0F - var53 / 2.0F - 0.2F,
                     var58 + 2.0F + 5.25F,
                     12.0F,
                     var52,
                     VnVnuUn.uUnuvNvvNU(var40.nvUVNnuu ? var7 : var9, var50)
                  );
               }
            }

            var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 221.875F - 1.5F, UUVNUUUnNUv.nuunNvv + 52.505F + var42 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var63, 0.08F);
            var0.UuUVuuUu(UUVNUUUnNUv.nNnVnUNVV + 221.875F - 1.5F, UUVNUUUnNUv.nuunNvv + 52.505F + var42 - 1.5F + var73, 6.0F, 6.0F, 3.0F, var8);
            var0.UuUVuuUu(
               UUVNUUUnNUv.nNnVnUNVV + 222.735F - 0.75F,
               UUVNUUUnNUv.nuunNvv + 53.365F + var42 - 0.78F + var73,
               3.0F,
               3.0F,
               1.5F,
               VnVnuUn.uNNnnnuuuN(var9, var7, var41)
            );
            var0.UuUVuuUu(
               UUVNUUUnNUv.nNnVnUNVV + 222.735F + 0.7F,
               UUVNUUUnNUv.nuunNvv + 53.365F + var42 + var73,
               0.1F,
               0.1F,
               1.5F,
               2.575F,
               0.1F,
               VnVnuUn.uNNnnnuuuN(0, var12.getRGB(), var41)
            );
            if (!var40.nuUnNvnuUu().isEmpty() && !var40.nuUnNvnuUu().isEmpty()) {
               var0.UuUVuuUu(
                  vNvnnVvvVUu.uUnuvNvvNU,
                  UUVNUUUnNUv.nNnVnUNVV + 211.48F,
                  UUVNUUUnNUv.nuunNvv + 52.81F + var42 - 1.5F + var74 + 6.5F + 6.0F - 6.0F * var45,
                  11.0F,
                  "S",
                  VnVnuUn.uNNnnnuuuN(0, var7, var45)
               );
               var0.UuUVuuUu(
                  vNvnnVvvVUu.uUnuvNvvNU,
                  UUVNUUUnNUv.nNnVnUNVV + 211.48F,
                  UUVNUUUnNUv.nuunNvv + 52.81F + var42 - 1.5F + var74 + 6.5F + 6.0F * var45,
                  11.0F,
                  "R",
                  VnVnuUn.uNNnnnuuuN(var9, 0, var45)
               );
            }

            if (var45 > 0.0F || var46 > 0.0F) {
               float var99 = UUVNUUUnNUv.nuunNvv + 64.69F + var42 + 4.0F;
               float var102 = UUVNUUUnNUv.nNnVnUNVV + 111.885F + 9.0F;
               float var105 = 105.47F;
               float var108 = 0.0F;

               for (nvUuvVvuuN var114 : var40.nuUnNvnuUu()) {
                  var108 += vVNnuUvn.UuUVuuUu(
                        var0,
                        var114,
                        var102,
                        var99 + var108,
                        var105,
                        var2,
                        var3,
                        VnVnuUn.uUnuvNvvNU(var63, var46),
                        VnVnuUn.uUnuvNvvNU(var7, var46),
                        VnVnuUn.uUnuvNvvNU(var8, var46),
                        VnVnuUn.uUnuvNvvNU(var9, var46),
                        VnVnuUn.uUnuvNvvNU(var10, var46),
                        var4 * var46
                     )
                     * var46;
               }

               var84 += var43;
            }

            var82 += 30.325F;
         }

         var77++;
      }

      var0.nuUnNvnuUu();
      UUVNUUUnNUv.UuUVuuUu().UuUVuuUu(var0, UUVNUUUnNUv.nNnVnUNVV + 104.735F + 261.5F - 5.0F + 1.0F, UUVNUUUnNUv.nuunNvv + 34.025F + 5.0F, 2.0F, 194.5F, var4);
      if (UUVNUUUnNUv.vNVuvnUUnuUn != null && UUVNUUUnNUv.vNVuvnUUnuUn instanceof VnnUvVNuNuVv) {
         UvNnVvNNVvuN.UuUVuuUu(
            var0,
            UUVNUUUnNUv.vNVuvnUUnuUn,
            var2,
            var3,
            VnVnuUn.uUnuvNvvNU(var63, UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU()),
            VnVnuUn.uUnuvNvvNU(var11, UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU()),
            VnVnuUn.uUnuvNvvNU(var9, UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU()),
            var4 * UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU()
         );
      }
   }

   private static String UuUVuuUu(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         var1.append(var3 < nNuVunNUVu.length && nNuVunNUVu[var3] != 0 ? nNuVunNUVu[var3] : var3);
      }

      return var1.toString();
   }

   public static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var1 >= var3 && var0 < var2 + var4 && var1 < var3 + var5;
   }

   static {
      String var0 = "йцукенгшщзхъфывапролджэячсмитьбю";
      String var1 = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";

      for (int var2 = 0; var2 < var0.length(); var2++) {
         nNuVunNUVu[var0.charAt(var2)] = var1.charAt(var2);
      }
   }
}
