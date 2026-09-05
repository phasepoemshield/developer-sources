package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_310;

public final class UuUuVnVvnvn {
   private static final Map<String, VVnnnnN> UuUVuuUu = new HashMap<>();

   private static float UuUVuuUu(UnVNvNnU var0, vVvnUVnUvv var1, String var2, String var3) {
      float var4 = 5.0F;
      float var5 = 32.0F;
      float var6 = 4.0F;
      float var7 = var5 - var6 * 2.0F;
      float var8 = var4 + var6 + var7 + 8.0F;
      var8 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", 14.0F).UuUVuuUu + 3.0F;
      var8 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "wildclient.org", 22.0F).UuUVuuUu + 4.0F;
      var8 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "k", 14.0F).UuUVuuUu + 4.0F;
      var8 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var3, 18.0F).UuUVuuUu + 4.0F;
      var8 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var2, 22.0F).UuUVuuUu;
      var8 += 10.0F + var4;
      return Math.max(210.0F, var8);
   }

   public static UuUuVnVvnvn.NVnVnNnN UuUVuuUu(UnVNvNnU var0, vVvnUVnUvv var1, float var2, float var3, float var4, float var5) {
      if (var1.UuUVuuUu().isEmpty()) {
         return new UuUuVnVvnvn.NVnVnNnN(var2, var3, 0.0F, 0.0F);
      } else {
         vuUuvvvNnVV var6 = var1.getClass().getAnnotation(vuUuvvvNnVV.class);
         String var7 = var6 != null ? var6.UuUVuuUu() : "Settings";
         String var8 = var6 != null && !var6.C00OOC00oO().isEmpty() ? var6.C00OOC00oO() : "e";
         float var9 = UuUVuuUu(var0, var1, var7, var8);
         float var10 = 5.0F;
         float var11 = 32.0F;
         float var12 = 8.0F;
         float var13 = 4.0F;
         float var14 = 20.0F;
         float var15 = 28.0F;
         float var16 = 20.0F;
         float var17 = 20.0F;
         float var18 = var12 * 2.0F;

         for (nvUuvVvuuN var20 : var1.UuUVuuUu()) {
            if (UuUVuuUu(var20)) {
               if (var20 instanceof vvNnnUNnVvn) {
                  var18 += var14;
               } else if (var20 instanceof nNUuNvVn) {
                  var18 += var15;
               } else if (var20 instanceof UvNnUnuNUUU) {
                  var18 += var16;
               } else if (var20 instanceof vNnVvvNU) {
                  var18 += var17;
               } else if (var20 instanceof VUVnvvnNN var21) {
                  var18 += var14 + UuUVuuUu(var21) * var14 * var21.VVuuUN.uNNnnnuuuN();
               }
            }
         }

         float var28 = var10 + var11 + var13 + var18 + var10;
         class_310 var29 = class_310.method_1551();
         float var30 = var29.method_22683().method_4489();
         float var22 = var29.method_22683().method_4506();
         float var23 = 10.0F;
         boolean var24 = var2 + var4 + var23 + var9 > var30;
         boolean var25 = var3 + var28 + var23 > var22;
         float var26 = var24 ? var2 - var9 - var23 : var2 + var4 + var23;
         if (var26 + var9 > var30) {
            var26 = var30 - var9 - var23;
         }

         if (var26 < var23) {
            var26 = var23;
         }

         float var27 = var25 ? var3 + var5 - var28 : var3;
         if (var27 + var28 > var22) {
            var27 = var22 - var28 - var23;
         }

         if (var27 < var23) {
            var27 = var23;
         }

         return new UuUuVnVvnvn.NVnVnNnN(var26, var27, var9, var28);
      }
   }

   public static void UuUVuuUu(
      UnVNvNnU var0,
      vVvnUVnUvv var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      boolean var12
   ) {
      if (!var1.UuUVuuUu().isEmpty() && !(var8 <= 0.01F)) {
         vuUuvvvNnVV var13 = var1.getClass().getAnnotation(vuUuvvvNnVV.class);
         String var14 = var13 != null ? var13.UuUVuuUu() : "Settings";
         String var15 = var13 != null && !var13.C00OOC00oO().isEmpty() ? var13.C00OOC00oO() : "e";
         float var16 = UuUVuuUu(var0, var1, var14, var15);
         float var17 = 5.0F;
         float var18 = 32.0F;
         float var19 = 4.0F;
         float var20 = var18 - var19 * 2.0F;
         float var21 = 8.0F;
         float var22 = 4.0F;
         float var23 = 20.0F;
         float var24 = 28.0F;
         float var25 = 20.0F;
         float var26 = 20.0F;
         float var27 = var21 * 2.0F;

         for (nvUuvVvuuN var29 : var1.UuUVuuUu()) {
            if (UuUVuuUu(var29)) {
               if (var29 instanceof vvNnnUNnVvn) {
                  var27 += var23;
               } else if (var29 instanceof nNUuNvVn) {
                  var27 += var24;
               } else if (var29 instanceof UvNnUnuNUUU) {
                  var27 += var25;
               } else if (var29 instanceof vNnVvvNU) {
                  var27 += var26;
               } else if (var29 instanceof VUVnvvnNN var30) {
                  var30.VVuuUN.UuUVuuUu();
                  var30.VVuuUN.UuUVuuUu(var30.uNNnnnuuuN ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
                  var27 += var23 + UuUVuuUu(var30) * var23 * var30.VVuuUN.uNNnnnuuuN();
               }
            }
         }

         float var99 = var17 + var18 + var22 + var27 + var17;
         class_310 var100 = class_310.method_1551();
         float var101 = var100.method_22683().method_4489();
         float var31 = var100.method_22683().method_4506();
         float var32 = 10.0F;
         boolean var33 = var2 + var4 + var32 + var16 > var101;
         boolean var34 = var3 + var99 + var32 > var31;
         float var35 = var33 ? var2 - var16 - var32 : var2 + var4 + var32;
         if (var35 + var16 > var101) {
            var35 = var101 - var16 - var32;
         }

         if (var35 < var32) {
            var35 = var32;
         }

         float var36 = var34 ? var3 + var5 - var99 : var3;
         if (var36 + var99 > var31) {
            var36 = var31 - var99 - var32;
         }

         if (var36 < var32) {
            var36 = var32;
         }

         float var37 = (1.0F - var8) * 10.0F;
         float var38 = var35 + (var33 ? var37 : -var37);
         float var39 = (1.0F - var8) * 10.0F;
         float var40 = var36 + (var34 ? var39 : -var39);
         int var41 = (int)(255.0F * var8);
         int var42 = VnVnuUn.uUnuvNvvNU(10, 10, 10, (int)(40.0F * var8));
         int var43 = VnVnuUn.uUnuvNvvNU(28, 30, 30, (int)(140.0F * var8));
         int var44 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var8));
         int var45 = var1 instanceof nnvNuuNvvuu var46 ? var46.vNUvnnVnUvu(var8) : VnVnuUn.uNNnnnuuuN(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(255, 255), var41);
         int var102 = VnVnuUn.uUnuvNvvNU(255, 255, 255, var41);
         int var47 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(122.0F * var8));
         int var48 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(120.0F * var8));
         boolean var49 = UuUVuuUu(var1);
         VVNunVNVuuu.VvunVVUvUNnv var50 = C00OOC00oO(var1);
         if (var49) {
            var42 = VVNunVNVuuu.UuUVuuUu(var8);
            var43 = VVNunVNVuuu.UuUVuuUu(var8);
            var44 = VnVnuUn.uUnuvNvvNU(0, 0, 0, 0);
            var102 = VVNunVNVuuu.C00OOC00oO(var8);
            var47 = VVNunVNVuuu.uUnuvNvvNU(var8);
            var48 = VVNunVNVuuu.uUnuvNvvNU(var8);
         }

         var0.uNNnnnuuuN(var8);
         float var51 = 14.0F;
         if (!var49 || !VVNunVNVuuu.UuUVuuUu(null, var38, var40, var16, var99, var51, var50.distance(), var50.blur(), var50.intensity(), 1, false, var8)) {
            var0.UuUVuuUu(23.0F);
            var0.UuUVuuUu(var38, var40, var16, var99, var51, var8);
            var0.UuUVuuUu(var38, var40, var16, var99, var51, var42);
            var0.UuUVuuUu(var38, var40, var16, var99, var51, var44, 1.0F);
         }

         float var52 = var38 + var17;
         float var53 = var40 + var17;
         float var54 = var16 - var17 * 2.0F;
         if (!var49 || !VVNunVNVuuu.UuUVuuUu(null, var52, var53, var54, var18, 11.0F, var50.distance(), var50.blur(), var50.intensity(), 1, false, var8)) {
            var0.UuUVuuUu(var52, var53, var54, var18, 11.0F, 11.0F, 4.0F, 4.0F, var43);
         }

         float var55 = var52 + var19;
         float var56 = var53 + var19;
         var0.UuUVuuUu(var55, var56, var20, var20, 7.0F, var45);
         float var57 = 28.0F;
         float var58 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "o", var57).UuUVuuUu;
         var0.UuUVuuUu(
            vNvnnVvvVUu.vNUvnnVnUvu, var55 + (var20 - var58) / 2.0F, var56 + var20 / 2.0F + 6.0F, var57, "o", VnVnuUn.uUnuvNvvNU(255, 255, 255, var41)
         );
         float var59 = var55 + var20 + 8.0F;
         float var60 = var53 + var18 / 2.0F + 4.5F;
         var0.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var59, var60 - 0.5F, 14.0F, "w", var48);
         var59 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", 14.0F).UuUVuuUu + 3.0F;
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var59, var60, 22.0F, "wildclient.org", var47);
         var59 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "wildclient.org", 22.0F).UuUVuuUu + 4.0F;
         var0.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var59, var60 - 0.5F, 12.0F, "k", var48);
         var59 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "k", 12.0F).UuUVuuUu + 4.0F;
         var0.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var59, var60, 18.0F, var15, var45);
         var59 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var15, 18.0F).UuUVuuUu + 4.0F;
         var0.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var59, var60, 22.0F, var14, var102);
         float var61 = var38 + var17;
         float var62 = var53 + var18 + var22;
         float var63 = var16 - var17 * 2.0F;
         if (!var49 || !VVNunVNVuuu.UuUVuuUu(null, var61, var62, var63, var27, 9.0F, var50.distance(), var50.blur(), var50.intensity(), 2, true, var8)) {
            var0.UuUVuuUu(var61, var62, var63, var27, 4.0F, 4.0F, 11.0F, 11.0F, var43);
         }

         float var64 = 1.5F;
         var0.UuUVuuUu(var61 + var21, var62 + var21, var64, var27 - var21 * 2.0F, 0.5F, var45);
         float var65 = var62 + var21;
         float var66 = var61 + var21 + var64 + 6.5F;
         float var67 = var63 - (var66 - var61) - var21;
         float var68 = 22.0F;
         float var69 = 20.0F;
         float var70 = 5.0F;
         var0.UuUVuuUu(var61, var62, var63, var27, 4.0F, 4.0F, 11.0F, 11.0F);

         for (nvUuvVvuuN var72 : var1.UuUVuuUu()) {
            if (UuUVuuUu(var72)) {
               if (var72 instanceof vvNnnUNnVvn var73) {
                  float var110 = 12.0F;
                  float var114 = var66 + var67 - var110;
                  float var119 = var65 + (var23 - var110) / 2.0F;
                  float var122 = var67 - var110 - 6.0F;
                  UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var73.UuUVuuUu, var66, var65 + var23 / 2.0F + var70, var68, var102, var65, var23, var122);
                  var73.uNNnnnuuuN.UuUVuuUu();
                  var73.uNNnnnuuuN.UuUVuuUu(var73.uUnuvNvvNU() ? 1.0 : 0.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
                  int var125 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var8));
                  boolean var127 = var12 && UuUVuuUu(var9, var10, var66, var65, var67, var23);
                  if (!var49
                     || !VVNunVNVuuu.UuUVuuUu(
                        null, var114, var119, var110, var110, 3.0F, var50.distance(), var50.blur(), var50.intensity(), var127 ? 2 : 1, var127, var8
                     )) {
                     var0.UuUVuuUu(var114, var119, var110, var110, 3.0F, var125);
                  }

                  if (var73.uUnuvNvvNU()) {
                     float var130 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "j", 10.0F).UuUVuuUu;
                     var0.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var114 + (var110 - var130) / 2.0F, var119 + var110 / 2.0F + 3.0F, 10.0F, "j", var47);
                  }

                  if (var11 && UuUVuuUu(var9, var10, var66, var65, var67, var23)) {
                     var73.C00OOC00oO(!var73.uUnuvNvvNU());
                     uNvNvUNUnuu.vVvUvVVuuNvV();
                  }

                  var65 += var23;
               } else if (var72 instanceof nNUuNvVn var74) {
                  String var109 = C00OOC00oO(var74.uUnuvNvvNU());
                  float var113 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var109, var69).UuUVuuUu;
                  float var118 = var67 - var113 - 6.0F;
                  UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var74.UuUVuuUu, var66, var65 + 13.0F, var68, var102, var65, var24, var118);
                  var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var66 + var67 - var113, var65 + 13.0F, var69, var109, var45);
                  float var124 = var65 + var24 - 5.0F;
                  boolean var129 = var12 && UuUVuuUu(var9, var10, var66 - 4.0F, var124 - 6.0F, var67 + 8.0F, 16.0F);
                  if (var49) {
                     VVNunVNVuuu.UuUVuuUu(null, var66, var124 - 2.0F, var67, 7.0F, 3.5F, var50.distance(), var50.blur(), var50.intensity(), 2, true, var8);
                  } else {
                     var0.UuUVuuUu(var66, var124, var67, 3.0F, 1.5F, VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var8)));
                  }

                  VVnnnnN var132 = UuUVuuUu.computeIfAbsent(var14 + "_" + var74.UuUVuuUu, var0x -> new VVnnnnN());
                  var132.UuUVuuUu();
                  float var134 = (var74.uUnuvNvvNU() - var74.uNNnnnuuuN) / (var74.nuUnNvnuUu - var74.uNNnnnuuuN);
                  var132.UuUVuuUu(var134, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
                  float var136 = var132.uNNnnnuuuN();
                  var0.UuUVuuUu(var66, var124, var67 * var136, 3.0F, 1.5F, var45);
                  float var137 = 8.0F;
                  float var138 = 10.0F;
                  float var139 = var66 + var67 * var136 - var137 / 2.0F;
                  if (!var49
                     || !VVNunVNVuuu.UuUVuuUu(
                        null,
                        var139,
                        var124 - (var138 - 3.0F) / 2.0F,
                        var137,
                        var138,
                        2.0F,
                        var50.distance(),
                        var50.blur(),
                        var50.intensity(),
                        var129 ? 2 : 1,
                        var129,
                        var8
                     )) {
                     var0.UuUVuuUu(var139, var124 - (var138 - 3.0F) / 2.0F, var137, var138, 2.0F, VnVnuUn.uUnuvNvvNU(255, 255, 255, var41));
                  }

                  if (!var49) {
                     var0.UuUVuuUu(var139 + 2.5F, var124 - (var138 - 3.0F) / 2.0F + 2.5F, 1.0F, 5.0F, 0.5F, VnVnuUn.uUnuvNvvNU(100, 100, 100, var41));
                     var0.UuUVuuUu(var139 + 4.5F, var124 - (var138 - 3.0F) / 2.0F + 2.5F, 1.0F, 5.0F, 0.5F, VnVnuUn.uUnuvNvvNU(100, 100, 100, var41));
                  }

                  if (var129) {
                     float var140 = var74.uNNnnnuuuN + (var9 - var66) / var67 * (var74.nuUnNvnuUu - var74.uNNnnnuuuN);
                     var140 = Math.max(var74.uNNnnnuuuN, Math.min(var74.nuUnNvnuUu, var140));
                     var140 = (float)(Math.round(var140 * (1.0 / var74.VVuuUN)) / (1.0 / var74.VVuuUN));
                     var74.UuUVuuUu(var140);
                     uNvNvUNUnuu.vVvUvVVuuNvV();
                  }

                  var65 += var24;
               } else if (var72 instanceof UvNnUnuNUUU var75) {
                  String var108 = var75.uUnuvNvvNU();
                  float var112 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var108, var69).UuUVuuUu;
                  float var117 = var67 - var112 - 6.0F;
                  UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var75.UuUVuuUu, var66, var65 + var25 / 2.0F + var70, var68, var102, var65, var25, var117);
                  float var121 = var66 + var67 - var112;
                  var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var121, var65 + var25 / 2.0F + var70, var69, var108, var47);
                  if (var11 && UuUVuuUu(var9, var10, var66, var65, var67, var25)) {
                     var75.vNUvnnVnUvu = (var75.vNUvnnVnUvu + 1) % var75.vVvUvVVuuNvV.size();
                     var75.uNNnnnuuuN = var75.vVvUvVVuuNvV.get(var75.vNUvnnVnUvu);
                     uNvNvUNUnuu.vVvUvVVuuNvV();
                  }

                  var65 += var25;
               } else if (var72 instanceof vNnVvvNU var76) {
                  String var107 = var76.uNNnnnuuuN();
                  float var111 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var107, var69).UuUVuuUu;
                  float var115 = Math.max(70.0F, var111 + 18.0F);
                  var115 = Math.min(var115, var67 * 0.55F);
                  float var120 = 16.0F;
                  float var123 = var66 + var67 - var115;
                  float var126 = var65 + (var26 - var120) / 2.0F;
                  float var128 = var123 - var66 - 6.0F;
                  UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var76.UuUVuuUu, var66, var65 + var26 / 2.0F + var70, var68, var102, var65, var26, var128);
                  boolean var131 = var12 && UuUVuuUu(var9, var10, var123, var126, var115, var120);
                  if (!var49
                     || !VVNunVNVuuu.UuUVuuUu(
                        null, var123, var126, var115, var120, 4.0F, var50.distance(), var50.blur(), var50.intensity(), var131 ? 2 : 1, var131, var8
                     )) {
                     var0.UuUVuuUu(var123, var126, var115, var120, 4.0F, VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(14.0F * var8)));
                     var0.UuUVuuUu(var123, var126, var115, var120, 4.0F, var44, 0.6F);
                  }

                  String var133 = UuUVuuUu(var107, vNvnnVvvVUu.UuUVuuUu, var69, var115 - 8.0F);
                  float var135 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var133, var69).UuUVuuUu;
                  var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var123 + (var115 - var135) / 2.0F, var126 + var120 / 2.0F + var70, var69, var133, var47);
                  if (var11 && UuUVuuUu(var9, var10, var123, var126, var115, var120)) {
                     var76.vVvUvVVuuNvV();
                     uNvNvUNUnuu.vVvUvVVuuNvV();
                  }

                  var65 += var26;
               } else if (var72 instanceof VUVnvvnNN var77) {
                  float var78 = var77.VVuuUN.uNNnnnuuuN();
                  float var79 = 26.0F;
                  float var80 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.nuUnNvnuUu, "m", var79).UuUVuuUu;
                  float var81 = var67 - var80 - 6.0F;
                  UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var77.UuUVuuUu, var66, var65 + var23 / 2.0F + var70, var68, var102, var65, var23, var81);
                  float var82 = var66 + var67 - var80 / 2.0F;
                  float var83 = var65 + var23 / 2.0F;
                  var0.UuUVuuUu(var82, var83);
                  var0.UuUVuuUu(vNvnnVvvVUu.nuUnNvnuUu, -var80 / 2.0F, var79 / 3.0F, var79, "m", var47);
                  var0.vNUvnnVnUvu();
                  if (var11 && UuUVuuUu(var9, var10, var66, var65, var67, var23)) {
                     var77.uNNnnnuuuN = !var77.uNNnnnuuuN;
                  }

                  var65 += var23;
                  if (var78 > 0.001F) {
                     float var84 = UuUVuuUu(var77) * var23;
                     float var85 = var84 * var78;
                     var0.UuUVuuUu(var61, var65, var63, var85, 0.0F, 0.0F, 0.0F, 0.0F);
                     float var86 = var65;
                     float var87 = var65 + var85;
                     float var88 = var65 - var84 * (1.0F - var78);

                     for (vvNnnUNnVvn var90 : var77.vVvUvVVuuNvV) {
                        if (UuUVuuUu(var90)) {
                           float var91 = 12.0F;
                           float var92 = var66 + var67 - var91;
                           float var93 = var88 + (var23 - var91) / 2.0F;
                           float var94 = var67 - 10.0F - var91 - 6.0F;
                           UuUVuuUu(var0, vNvnnVvvVUu.UuUVuuUu, var90.UuUVuuUu, var66 + 10.0F, var88 + var23 / 2.0F + var70, var69, var47, var88, var23, var94);
                           var90.uNNnnnuuuN.UuUVuuUu();
                           var90.uNNnnnuuuN.UuUVuuUu(var90.uUnuvNvvNU() ? 1.0 : 0.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
                           int var95 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var8));
                           boolean var96 = var12 && UuUVuuUu(var9, var10, var66, var88, var67, var23);
                           boolean var97 = var93 >= var86 && var93 + var91 <= var87;
                           if (!var49
                              || !var97
                              || !VVNunVNVuuu.UuUVuuUu(
                                 null, var92, var93, var91, var91, 3.0F, var50.distance(), var50.blur(), var50.intensity(), var96 ? 2 : 1, var96, var8 * var78
                              )) {
                              var0.UuUVuuUu(var92, var93, var91, var91, 3.0F, var95);
                           }

                           if (var90.uUnuvNvvNU()) {
                              float var98 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "j", 10.0F).UuUVuuUu;
                              var0.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var92 + (var91 - var98) / 2.0F, var93 + var91 / 2.0F + 3.0F, 10.0F, "j", var47);
                           }

                           if (var77.uNNnnnuuuN && var11 && UuUVuuUu(var9, var10, var66, var88, var67, var23)) {
                              boolean var143 = var77.nuUnNvnuUu && var90.vVvUvVVuuNvV() && var77.uUnuvNvvNU() <= 1;
                              if (!var143) {
                                 var90.C00OOC00oO(!var90.uUnuvNvvNU());
                                 uNvNvUNUnuu.vVvUvVVuuNvV();
                              }
                           }

                           var88 += var23;
                        }
                     }

                     var0.nuUnNvnuUu();
                     var65 += var85;
                  }
               }
            }
         }

         var0.nuUnNvnuUu();
         var0.vuuuNvNuv();
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, vVvnUVnUvv var1, nNuUNVu.nvnNNunvv var2, nNuUNVu var3, float var4, float var5) {
      UuUVuuUu(
         var0,
         var1,
         var2.C00OOC00oO,
         var2.uUnuvNvvNU,
         var2.vVvUvVVuuNvV,
         var2.uNNnnnuuuN,
         var4,
         var5,
         var2.VVuuUN,
         var3.VVuuUN(),
         var3.vNUvnnVnUvu(),
         var3.vuuuNvNuv(),
         var3.uVUuuVnNVU()
      );
   }

   private static boolean UuUVuuUu(nvUuvVvuuN var0) {
      try {
         return var0 == null || var0.C00OOC00oO == null || !var0.C00OOC00oO.get();
      } catch (Throwable var2) {
         return true;
      }
   }

   private static int UuUVuuUu(VUVnvvnNN var0) {
      int var1 = 0;

      for (vvNnnUNnVvn var3 : var0.vVvUvVVuuNvV) {
         if (UuUVuuUu(var3)) {
            var1++;
         }
      }

      return var1;
   }

   private static boolean UuUVuuUu(vVvnUVnUvv var0) {
      for (nvUuvVvuuN var2 : var0.UuUVuuUu()) {
         if (var2 instanceof UvNnUnuNUUU var3 && var3.UuUVuuUu.equals("Стилистика")) {
            return nnvNuuNvvuu.UuUVuuUu(var3.uUnuvNvvNU());
         }
      }

      return false;
   }

   private static VVNunVNVuuu.VvunVVUvUNnv C00OOC00oO(vVvnUVnUvv var0) {
      float var1 = 5.5F;
      float var2 = 18.0F;
      float var3 = 0.72F;
      String var4 = "Выпуклая";

      for (nvUuvVvuuN var6 : var0.UuUVuuUu()) {
         if (var6 instanceof nNUuNvVn var7) {
            if (var7.UuUVuuUu.equals("Нео дистанция")) {
               var1 = var7.uUnuvNvvNU();
            } else if (var7.UuUVuuUu.equals("Нео размытие")) {
               var2 = var7.uUnuvNvvNU();
            } else if (var7.UuUVuuUu.equals("Нео интенсивность")) {
               var3 = var7.uUnuvNvvNU();
            }
         } else if (var6 instanceof UvNnUnuNUUU var8 && var8.UuUVuuUu.equals("Нео форма")) {
            var4 = var8.uUnuvNvvNU();
         }
      }

      return VVNunVNVuuu.UuUVuuUu(var1, var2, var3, var4);
   }

   private static String UuUVuuUu(String var0, nUVnuvUu var1, float var2, float var3) {
      if (var0 == null || var3 <= 0.0F) {
         return "";
      } else if (vVVUUuunVVV.UuUVuuUu(var1, var0, var2).UuUVuuUu <= var3) {
         return var0;
      } else {
         String var4 = "...";
         float var5 = vVVUUuunVVV.UuUVuuUu(var1, var4, var2).UuUVuuUu;
         if (var5 > var3) {
            return "";
         } else {
            int var6 = var0.length();

            while (var6 > 0 && vVVUUuunVVV.UuUVuuUu(var1, var0.substring(0, var6), var2).UuUVuuUu + var5 > var3) {
               var6--;
            }

            return var6 <= 0 ? var4 : var0.substring(0, var6) + var4;
         }
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUVnuvUu var1, String var2, float var3, float var4, float var5, int var6, float var7, float var8, float var9) {
      float var10 = vVVUUuunVVV.UuUVuuUu(var1, var2, var5).UuUVuuUu;
      if (var10 <= var9) {
         var0.UuUVuuUu(var1, var3, var4, var5, var2, var6);
      } else {
         float var11 = var10 - var9;
         long var12 = 8000L;
         float var14 = (float)(System.currentTimeMillis() % var12) / (float)var12;
         float var15 = 0.0F;
         if (var14 < 0.2F) {
            var15 = 0.0F;
         } else if (var14 < 0.45F) {
            float var16 = (var14 - 0.2F) / 0.3F;
            var15 = UuUVuuUu(var16);
         } else if (var14 < 0.7F) {
            var15 = 1.0F;
         } else if (var14 < 0.95F) {
            float var18 = (var14 - 0.7F) / 0.25F;
            var15 = 1.0F - UuUVuuUu(var18);
         } else {
            var15 = 0.0F;
         }

         float var19 = var11 * var15;
         var0.UuUVuuUu(var3, var7, Math.max(1.0F, var9), var8, 0.0F, 0.0F, 0.0F, 0.0F);
         var0.UuUVuuUu(var1, var3 - var19, var4, var5, var2, var6);
         var0.nuUnNvnuUu();
      }
   }

   private static float UuUVuuUu(float var0) {
      float var1 = 2.0F;
      float var2 = var1 + 1.0F;
      float var3 = var0 - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }

   private static String C00OOC00oO(float var0) {
      int var1 = Math.round(var0 * 10.0F);
      return var1 / 10 + "." + Math.abs(var1 % 10);
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   public record NVnVnNnN(float x, float y, float width, float height) {
      public boolean contains(float var1, float var2, float var3) {
         return var1 >= this.x - var3 && var1 <= this.x + this.width + var3 && var2 >= this.y - var3 && var2 <= this.y + this.height + var3;
      }
   }
}
