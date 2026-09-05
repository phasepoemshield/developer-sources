package ru.metaculture.protection;

import net.minecraft.class_1306;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_332;

@vuUuvvvNnVV(
   UuUVuuUu = "HotBar",
   C00OOC00oO = "d"
)
public final class UVNVVUnUnUU extends nnvNuuNvvuu {
   private static final UVNVVUnUnUU c0oOOCcCoC0 = new UVNVVUnUnUU();
   private static float VVnVNnunVvu = 0.0F;
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static String NVUunUNUN = "";
   private static long UUVNuUNUvUnV;
   public final VUVnvvnNN UuUVuuUu = new VUVnvvnNN(
      "Элементы статуса",
      new vvNnnUNnVvn("Здоровье", true),
      new vvNnnUNnVvn("Голод", true),
      new vvNnnUNnVvn("Броня", true),
      new vvNnnUNnVvn("Воздух", true),
      new vvNnnUNnVvn("Поглощение", true)
   );

   private UVNVVUnUnUU() {
      uNvNvUNUnuu.UuUVuuUu(this);
      this.UuUVuuUu(this.UuUVuuUu);
   }

   public static UVNVVUnUnUU C00OOC00oO() {
      return c0oOOCcCoC0;
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      c0oOOCcCoC0.C00OOC00oO(var0, var1);
   }

   public void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (O000c0oocoo.a_ != null && O000c0oocoo.a_.field_1724 != null && O000c0oocoo.a_.field_1687 != null) {
         if (O000c0oocoo.a_.method_22683() != null) {
            unNNVVNnvvV.UuUVuuUu();
            unNNVVNnvvV.UuUVuuUu(1.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var3 = unNNVVNnvvV.uNNnnnuuuN();
            if (!(var3 <= 0.01F)) {
               class_1661 var4 = O000c0oocoo.a_.field_1724.method_31548();
               if (var4 != null) {
                  class_1799 var5 = var4.method_5438(var4.method_67532());
                  String var6 = var5 != null && !var5.method_7960() ? var5.method_7964().getString() : "";
                  String var7 = var6.isEmpty() ? "" : var4.method_67532() + ":" + var5.method_7909().toString() + ":" + var6;
                  long var8 = System.currentTimeMillis();
                  if (!var7.equals(NVUunUNUN)) {
                     NVUunUNUN = var7;
                     UUVNuUNUvUnV = var7.isEmpty() ? 0L : var8 + 2200L;
                  }

                  NuunnvnN.UuUVuuUu();
                  NuunnvnN.UuUVuuUu(!var6.isEmpty() && var8 <= UUVNuUNUvUnV ? 1.0 : 0.0, 0.18, VvVUUNUu.UnUNVVVNuv, true);
                  float var10 = Math.max(0.0F, Math.min(1.0F, NuunnvnN.uNNnnnuuuN()));
                  float var11 = O000c0oocoo.a_.method_22683().method_4489();
                  float var12 = O000c0oocoo.a_.method_22683().method_4506();
                  if (!(var11 <= 0.0F) && !(var12 <= 0.0F)) {
                     float var13 = 42.0F;
                     float var14 = 5.0F;
                     float var15 = 1.75F;
                     float var16 = 16.0F * var15;
                     float var17 = 7.0F;
                     float var18 = var13 * 9.0F + var14 * 8.0F + var17 * 2.0F;
                     float var19 = var13 + var17 * 2.0F;
                     float var20 = (var11 - var18) / 2.0F;
                     float var21 = var12 - var19 - 3.0F;
                     nNuUNVu.nvnNNunvv var22 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_HotBar", var20, var21, var18, var19);
                     float var23 = Math.min(var22.vVvUvVVuuNvV / Math.max(1.0F, var18), var22.uNNnnnuuuN / Math.max(1.0F, var19));
                     float var24 = this.UuuNnUvUuv(var23) + this.nUUVuvU(var23) + this.UuUVuuUu(var23, var10);
                     Hud.NVnVnNnN var25 = Hud.UuUVuuUu(
                        "HUD_HotBar", var22.C00OOC00oO, var22.uUnuvNvvNU - var24, var22.vVvUvVVuuNvV, var22.uNNnnnuuuN + var24, 8.0F
                     );
                     float var26 = var25.C00OOC00oO;
                     float var27 = var25.uUnuvNvvNU + var24;
                     float var28 = var22.vVvUvVVuuNvV;
                     float var29 = var22.uNNnnnuuuN;
                     this.UuUVuuUu(var26, var27, var28, var29);
                     float var30 = var28 / Math.max(1.0F, var18);
                     float var31 = var29 / Math.max(1.0F, var19);
                     float var32 = Math.min(var30, var31);
                     float var33 = var13 * var30;
                     float var34 = var14 * var30;
                     float var35 = var17 * var30;
                     float var36 = var17 * var31;
                     float var37 = var16 * var32;
                     float var38 = var15 * var32;
                     float var39 = var4.method_67532() * (var33 + var34);
                     VVnVNnunVvu = VVnVNnunVvu + (var39 - VVnVNnunVvu) * 0.25F;
                     float var40 = var3 * this.uVunuUNVVUUV.uUnuvNvvNU();
                     float var41 = this.vuuuNvNuv(var40);
                     int var42 = (int)(255.0F * var40);
                     int var43 = this.UuUVuuUu(var40);
                     int var44 = this.vVvUvVVuuNvV(var40);
                     int var45 = this.vNUvnnVnUvu(var40);
                     int var46 = this.uVUuuVnNVU(var40);
                     int var47 = this.vuuuNvNuv() ? VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(5.0F * var41)) : this.C00OOC00oO(var41);
                     float var48 = 12.0F * var32;
                     boolean var49 = this.nvUVNnuu();
                     if (var49) {
                        VVNunVNVuuu.UuUVuuUu();
                     }

                     try {
                        this.UuUVuuUu(var1, var26, var27, var28, var29, var48, var40);

                        for (int var50 = 0; var50 < 9; var50++) {
                           float var51 = var26 + var35 + var50 * (var33 + var34);
                           float var52 = var50 == 0 ? 8.0F * var32 : 4.0F * var32;
                           float var53 = var50 == 8 ? 8.0F * var32 : 4.0F * var32;
                           if (!this.UuuNnUvUuv() && !this.nUUVuvU()) {
                              if (!var49
                                 || !this.UuUVuuUu(
                                    var51, var27 + var36, var33, var33, Math.min(var52, var53), 2.8F * var32, 6.0F * var32, 0.86F, 2, true, var40
                                 )) {
                                 var1.UuUVuuUu(var51, var27 + var36, var33, var33, var52, var53, var53, var52, var47);
                              }
                           } else {
                              this.C00OOC00oO(var1, var51, var27 + var36, var33, var33, Math.min(var52, var53), var40);
                           }
                        }
                     } finally {
                        if (var49) {
                           VVNunVNVuuu.uUnuvNvvNU();
                        }
                     }

                     float var85 = var26 + var35 + VVnVNnunVvu;
                     float var86 = var27 + var36;
                     var1.UuUVuuUu(
                        var85 + 3.0F * var30,
                        var86 + var33 - Math.max(2.0F, 2.0F * var31),
                        var33 - 4.0F * var30,
                        Math.max(1.0F, 2.0F * var31),
                        Math.max(0.5F, 0.8F * var32),
                        VnVnuUn.UuUVuuUu(var46, (int)(140.0F * var40))
                     );
                     var1.uUnuvNvvNU();
                     var1.UuUVuuUu(var26, var27, var28, var29, var48, var48, var48, var48);

                     try {
                        for (int var87 = 0; var87 < 9; var87++) {
                           class_1799 var89 = var4.method_5438(var87);
                           float var54 = var26 + var35 + var87 * (var33 + var34);
                           float var55 = var54 + (var33 - var37) * 0.5F;
                           float var56 = var27 + var36 + (var33 - var37) * 0.5F;
                           if (var89 != null && !var89.method_7960()) {
                              NuNvVUuUUnun.UuUVuuUu(
                                 var1, var89, NuNvVUuUUnun.UuUVuuUu(var55), NuNvVUuUUnun.UuUVuuUu(var56), NuNvVUuUUnun.uUnuvNvvNU(var38), var87, true, var87
                              );
                           }

                           String var57 = String.valueOf(var87 + 1);
                           float var58 = 22.0F * var32;
                           int var59 = var87 == var4.method_67532()
                              ? VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(245.0F * var40))
                              : VnVnuUn.UuUVuuUu(this.nuUnNvnuUu(1.0F), (int)(175.0F * var40));
                           float var60 = var54 + 4.0F * var30;
                           float var61 = var27 + var36 + var33 - var58 * var31 - 8.0F;
                           var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var60, var61, var58, var57, var59);
                        }
                     } finally {
                        var1.uUnuvNvvNU();
                        var1.nuUnNvnuUu();
                     }

                     class_1799 var88 = NoSlow.UuUVuuUu(O000c0oocoo.a_.field_1724.method_6079());
                     if (var88 != null && !var88.method_7960()) {
                        float var90 = O000c0oocoo.a_.field_1724.method_6068() == class_1306.field_6183
                           ? var26 - var29 - 5.0F * var30
                           : var26 + var28 + 5.0F * var30;
                        if (var49) {
                           VVNunVNVuuu.UuUVuuUu();
                        }

                        try {
                           if (this.UuuNnUvUuv() || this.nUUVuvU()) {
                              this.UuUVuuUu(var1, var90, var27, var29, var29, var48, var40);
                              this.C00OOC00oO(var1, var90 + var35, var27 + var36, var33, var33, 8.0F * var32, var40);
                           } else if (var49) {
                              if (!this.UuUVuuUu(var90, var27, var29, var29, var48, false, var40, 1)) {
                                 var1.UuUVuuUu(var90, var27, var29, var29, var48, var43);
                              }

                              if (!this.UuUVuuUu(var90 + var35, var27 + var36, var33, var33, 8.0F * var32, 2.8F * var32, 6.0F * var32, 0.86F, 2, true, var40)) {
                                 var1.UuUVuuUu(var90 + var35, var27 + var36, var33, var33, 8.0F * var32, var47);
                              }
                           } else {
                              if (this.vVvUvVVuuNvV()) {
                                 var1.UuUVuuUu(var90, var27, var29, var29, var48, this.UnUNVVVNuv() ? 6.0F : 4.0F, 1.0F, this.nvUVNnuu(var40));
                              }

                              if (this.vuuuNvNuv()) {
                                 var1.UuUVuuUu(23.0F);
                                 var1.UuUVuuUu(var90, var27, var29, var29, var48, var40);
                              }

                              var1.UuUVuuUu(var90, var27, var29, var29, var48, var43);
                              if (this.uNNnnnuuuN()) {
                                 var1.UuUVuuUu(var90, var27, var29, var29, var48, var44, this.uUnuvNvvNU());
                              }

                              var1.UuUVuuUu(var90 + var35, var27 + var36, var33, var33, 8.0F * var32, var47);
                           }
                        } finally {
                           if (var49) {
                              VVNunVNVuuu.uUnuvNvvNU();
                           }
                        }

                        float var93 = var90 + var35 + (var33 - var37) * 0.5F;
                        float var96 = var27 + var36 + (var33 - var37) * 0.5F;
                        var1.uUnuvNvvNU();
                        var1.UuUVuuUu(var90, var27, var29, var29, var48, var48, var48, var48);

                        try {
                           NuNvVUuUUnun.UuUVuuUu(
                              var1, var88, NuNvVUuUUnun.UuUVuuUu(var93), NuNvVUuUUnun.UuUVuuUu(var96), NuNvVUuUUnun.uUnuvNvvNU(var38), 0, true, 0
                           );
                        } finally {
                           var1.uUnuvNvvNU();
                           var1.nuUnNvnuUu();
                        }
                     }

                     VNNvvvUUVU.UuUVuuUu().UuUVuuUu(var1, this, var26, var27, var28, var30, var31, var40);
                     if (O000c0oocoo.a_.field_1724.field_7520 > 0) {
                        String var91 = String.valueOf(O000c0oocoo.a_.field_1724.field_7520);
                        float var94 = 12.0F * var32;
                        float var97 = 8.0F * var32;
                        float var99 = 26.0F * var32;
                        float var101 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var91, var99).UuUVuuUu;
                        int var103 = VnVnuUn.UuUVuuUu(var45, var42);
                        int var105 = this.C00OOC00oO(var40);
                        float var107 = this.UuuNnUvUuv(var32);
                        float var109 = Math.max(34.0F * var32, var101 + 16.0F * var32);
                        float var63 = var26 + (var28 - var109) * 0.5F;
                        float var64 = var27 - var107 - var97 - var94;
                        if (var49) {
                           if (!this.UuUVuuUu(var63, var64, var109, var94, var94 * 0.5F, 2.4F * var32, 5.5F * var32, 0.82F, 1, false, var40)) {
                              var1.UuUVuuUu(var63, var64, var109, var94, var94 * 0.5F, var105);
                           }
                        } else if (this.UuuNnUvUuv() || this.nUUVuvU()) {
                           this.C00OOC00oO(var1, var63, var64, var109, var94, var94 * 0.5F, var40);
                        }

                        var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var63 + (var109 - var101) * 0.5F, var64 + var94 * 0.5F + 3.7F * var32, var99, var91, var103);
                     }

                     if (var10 > 0.01F && !var6.isEmpty()) {
                        float var92 = var40 * var10;
                        float var95 = 16.0F * var32;
                        float var98 = 32.0F * var32;
                        float var100 = 4.0F * var32;
                        float var102 = Math.clamp(var28 * 0.72F, 20.0F * var32, 190.0F * var32);
                        String var104 = this.UuUVuuUu(var6, var98, var102);
                        float var106 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var104, var98);
                        float var108 = Math.max(54.0F * var32, var106 + 20.0F * var32);
                        float var110 = this.UuuNnUvUuv(var32);
                        float var62 = this.nUUVuvU(var32);
                        float var111 = var26 + (var28 - var108) * 0.5F;
                        float var112 = var27 - var110 - var62 - var100 - var95;
                        var1.UuUVuuUu(
                           vNvnnVvvVUu.UuUVuuUu,
                           var111 + (var108 - var106) * 0.5F,
                           var112 + var95 * 0.5F + 1.05F * var32,
                           var98,
                           var104,
                           VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), (int)(255.0F * var92))
                        );
                     }

                     Hud.UuUVuuUu("HUD_HotBar", var26, var27 - var24, var28, var29 + var24);
                     nNuUNVu.UuUVuuUu().UuUVuuUu(var22);
                     UuUuVnVvnvn.UuUVuuUu(
                        var1, this, var22, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
                     );
                  }
               }
            }
         }
      }
   }

   private float UuuNnUvUuv(float var1) {
      if (O000c0oocoo.a_ != null && O000c0oocoo.a_.field_1724 != null) {
         boolean var2 = this.UuUVuuUu.C00OOC00oO("Здоровье");
         boolean var3 = this.UuUVuuUu.C00OOC00oO("Голод");
         boolean var4 = this.UuUVuuUu.C00OOC00oO("Броня") && O000c0oocoo.a_.field_1724.method_6096() > 0;
         boolean var5 = this.UuUVuuUu.C00OOC00oO("Воздух") && O000c0oocoo.a_.field_1724.method_5669() < O000c0oocoo.a_.field_1724.method_5748();
         float var6 = 12.0F * var1;
         float var7 = 4.0F * var1;
         int var8 = 0;
         if (var2 || var3) {
            var8++;
         }

         if (var4 || var5) {
            var8++;
         }

         return var8 == 0 ? 0.0F : var8 * var6 + var8 * var7;
      } else {
         return 0.0F;
      }
   }

   private float nUUVuvU(float var1) {
      return O000c0oocoo.a_ != null && O000c0oocoo.a_.field_1724 != null && O000c0oocoo.a_.field_1724.field_7520 > 0 ? 16.0F * var1 : 0.0F;
   }

   private float UuUVuuUu(float var1, float var2) {
      return var2 > 0.01F ? 20.0F * var1 : 0.0F;
   }

   private String UuUVuuUu(String var1, float var2, float var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var1, var2) <= var3) {
            return var1;
         } else {
            String var4 = "...";
            float var5 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var4, var2);
            if (var5 >= var3) {
               return var4;
            } else {
               int var6 = 0;
               int var7 = var1.length();

               while (var6 < var7) {
                  int var8 = var6 + var7 + 1 >>> 1;
                  String var9 = var1.substring(0, var8).trim();
                  float var10 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var9, var2) + var5;
                  if (var10 <= var3) {
                     var6 = var8;
                  } else {
                     var7 = var8 - 1;
                  }
               }

               String var11 = var1.substring(0, Math.max(0, var6)).trim();
               return var11.isEmpty() ? var4 : var11 + var4;
            }
         }
      } else {
         return "";
      }
   }
}
