package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_640;

@vuUuvvvNnVV(
   UuUVuuUu = "InformationHUD",
   C00OOC00oO = "w"
)
public final class VUVVnvUunV extends nnvNuuNvvuu implements O000c0oocoo {
   private static final VUVVnvUunV UuUVuuUu = new VUVVnvUunV();
   private static double c0oOOCcCoC0 = 0.0;
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static final VVnnnnN NVUunUNUN = new VVnnnnN();
   private static boolean UUVNuUNUvUnV;
   private static final List<VUVVnvUunV.NVnVnNnN> vuvnUnVnUNnV = new ArrayList<>(4);
   private final UvNnUnuNUUU nnuUVNUuvvVU = new UvNnUnuNUUU("Вид", "Стандарт", "Стандарт", "Строка");
   private final vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Показывать верхушку", true);
   private final vvNnnUNnVvn nNnVnUNVV = new vvNnnUNnVvn("Анимация значений", true);
   private final Map<String, VnuuvvUv> nuunNvv = new HashMap<>();
   private final VUVnvvnNN uUVVvVVNvvn = new VUVnvvnNN(
         "Отображаемые данные",
         new vvNnnUNnVvn("Скорость (BPS)", true),
         new vvNnnUNnVvn("Тикрейт (TPS)", true),
         new vvNnnUNnVvn("Координаты (XYZ)", true),
         new vvNnnUNnVvn("Ping (MS)", true)
      )
      .C00OOC00oO(true);

   private VUVVnvUunV() {
      this.UuUVuuUu(this.nnuUVNUuvvVU);
      this.UuUVuuUu(this.nVVUuvuNnUN);
      this.UuUVuuUu(this.nNnVnUNVV);
      this.UuUVuuUu(this.uUVVvVVNvvn);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static VUVVnvUunV C00OOC00oO() {
      return UuUVuuUu;
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   public void C00OOC00oO(UnVNvNnU var1) {
      if (a_.field_1724 != null) {
         boolean var2 = false;
         boolean var3 = true;
         unNNVVNnvvV.UuUVuuUu();
         VVnVNnunVvu.UuUVuuUu();
         unNNVVNnvvV.UuUVuuUu(var3 ? 1.0 : 0.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         if (var3) {
            if (!UUVNuUNUvUnV) {
               VVnVNnunVvu.nuUnNvnuUu(-10.0);
            }

            VVnVNnunVvu.UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         } else {
            if (UUVNuUNUvUnV) {
               VVnVNnunVvu.nuUnNvnuUu(0.0);
            }

            VVnVNnunVvu.UuUVuuUu(10.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         UUVNuUNUvUnV = var3;
         float var4 = unNNVVNnvvV.uNNnnnuuuN();
         if (!(var4 <= 0.01F)) {
            float var5 = 24.0F;
            boolean var6 = this.nVVUuvuNnUN.uUnuvNvvNU();
            boolean var7 = Hud.nUUVuvU();
            unUuuVVuNnNN.NVnVnNnN var8 = var7 ? unUuuVVuNnNN.UuUVuuUu("HUD_Info") : null;
            float var9 = var7 ? var8.vNUvnnVnUvu : 7.0F;
            float var10 = var6 ? (var7 ? var8.vuuuNvNuv : 32.0F) : 0.0F;
            float var11 = var6 ? (var7 ? var8.uVUuuVnNVU : 5.0F) : 0.0F;
            float var12 = 22.0F;
            float var13 = var7 ? var8.nvUVNnuu : 22.0F;
            float var14 = var7 ? Math.max(4.0F, var8.vNUvnnVnUvu + 3.0F) : 10.0F;
            vuvnUnVnUNnV.clear();
            if (this.uUVVvVVNvvn.C00OOC00oO("Скорость (BPS)")) {
               vuvnUnVnUNnV.add(new VUVVnvUunV.NVnVnNnN("BPS", UvnvNVnnnnNU(), VnVnuUn.uUnuvNvvNU(255, 90, 90, 255)));
            }

            if (this.uUVVvVVNvvn.C00OOC00oO("Тикрейт (TPS)")) {
               vuvnUnVnUNnV.add(new VUVVnvUunV.NVnVnNnN("TPS", UuUVuuUu(UVVNuuUvuu.UuUVuuUu()), VnVnuUn.uUnuvNvvNU(255, 170, 40, 255)));
            }

            if (this.uUVVvVVNvvn.C00OOC00oO("Координаты (XYZ)")) {
               vuvnUnVnUNnV.add(new VUVVnvUunV.NVnVnNnN("XYZ", uVUVnuvnuVuv(), VnVnuUn.uUnuvNvvNU(100, 255, 100, 255)));
            }

            if (this.uUVVvVVNvvn.C00OOC00oO("Ping (MS)")) {
               vuvnUnVnUNnV.add(new VUVVnvUunV.NVnVnNnN("PING", NVNnnvnuunNv(), VnVnuUn.uUnuvNvvNU(120, 190, 255, 255)));
            }

            if (this.nnuUVNUuvvVU.C00OOC00oO("Строка")) {
               this.UuUVuuUu(var1, vuvnUnVnUNnV, var4);
            } else {
               String var15 = "Information";
               float var16 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var15, var7 ? var8.UuuNnUvUuv : 26.0F).UuUVuuUu;
               float var17 = var14 * 2.0F + 30.0F;

               for (VUVVnvUunV.NVnVnNnN var19 : vuvnUnVnUNnV) {
                  float var20 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19.label, var5).UuUVuuUu
                     + vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19.value, var5).UuUVuuUu
                     + var14 * 2.0F
                     + 20.0F;
                  var17 = Math.max(var17, var20);
               }

               float var72 = vuvnUnVnUNnV.size() * var13 + 12.0F;
               float var73 = var17 + var9 * 2.0F;
               if (var6) {
                  float var74 = var16 + var12 + var14 * 2.0F + 24.0F;
                  var73 = Math.max(var73, var74 + var9 * 2.0F);
               }

               var17 = var73 - var9 * 2.0F;
               float var75 = var9 + var72 + var9;
               if (var6) {
                  var75 = var9 + var10 + var11 + var72 + var9;
               }

               NuunnvnN.UuUVuuUu();
               NVUunUNUN.UuUVuuUu();
               NuunnvnN.UuUVuuUu(var73, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
               NVUunUNUN.UuUVuuUu(var75, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
               float var21 = NuunnvnN.uNNnnnuuuN();
               float var22 = NVUunUNUN.uNNnnnuuuN();
               float var23 = 10.0F;
               float var24 = 10.0F;
               nNuUNVu.nvnNNunvv var25 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_Info", var23, var24, var21, var22);
               float var26 = var25.C00OOC00oO + VVnVNnunVvu.uNNnnnuuuN();
               float var27 = var25.uUnuvNvvNU;
               float var28 = Math.max(1.0F, var25.vVvUvVVuuNvV);
               float var29 = Math.max(1.0F, var25.uNNnnnuuuN);
               boolean var30 = this.UuUVuuUu(var28, var29, var21, var22, vuvnUnVnUNnV, var6);
               float var31 = var30 ? C00OOC00oO(var29, 38.0F, 54.0F) : C00OOC00oO(var29, Math.max(34.0F, var22 * 0.76F), Math.max(var22, var22 * 1.08F));
               var25 = nNuUNVu.UuUVuuUu().UuUVuuUu(var25, var28, var31, var21, var22);
               var26 = var25.C00OOC00oO + VVnVNnunVvu.uNNnnnuuuN();
               var27 = var25.uUnuvNvvNU;
               var28 = var25.vVvUvVVuuNvV;
               var31 = var25.uNNnnnuuuN;
               var30 = this.UuUVuuUu(var28, var31, var21, var22, vuvnUnVnUNnV, var6);
               this.UuUVuuUu(var26, var27, var28, var31);
               float var32 = C00OOC00oO(var28 / Math.max(1.0F, var21), 0.76F, 1.28F);
               float var33 = var30 ? 1.0F : C00OOC00oO(var31 / Math.max(1.0F, var22), 0.78F, 1.08F);
               float var34 = C00OOC00oO(Math.min(var32, var33), 0.78F, 1.12F);
               float var35 = C00OOC00oO(var9 * var32, 5.0F, 10.0F);
               float var36 = C00OOC00oO(var9 * var33, 5.0F, 9.0F);
               float var37 = var6 ? C00OOC00oO(var10 * var33, 24.0F, 36.0F) : 0.0F;
               float var38 = var6 ? C00OOC00oO(var11 * var33, 3.0F, 7.0F) : 0.0F;
               float var39 = C00OOC00oO(var13 * var33, 17.0F, 26.0F);
               float var40 = C00OOC00oO(var14 * var32, 7.0F, 13.0F);
               float var41 = C00OOC00oO(var5 * var34, 18.0F, 27.0F);
               float var42 = var4 * this.uVunuUNVVUUV.uUnuvNvvNU();
               int var43 = (int)(255.0F * var42);
               int var44 = this.UuUVuuUu(var42);
               int var45 = this.C00OOC00oO(var42);
               int var46 = this.uUnuvNvvNU(var42);
               int var47 = this.vVvUvVVuuNvV(var42);
               int var48 = this.uNNnnnuuuN(var42);
               int var49 = this.VVuuUN(var42);
               boolean var50 = this.nvUVNnuu();
               if (var30) {
                  this.UuUVuuUu(var1, var26, var27, var28, var31, var15, var6, vuvnUnVnUNnV, var42, var48, var49);
                  nNuUNVu.UuUVuuUu().UuUVuuUu(var25);
                  UuUuVnVvnvn.UuUVuuUu(var1, this, var25, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
               } else {
                  float var51 = var7 ? var8.UuUVuuUu : C00OOC00oO(Math.min(var28, var31) * 0.16F, 9.0F, 14.0F);
                  float var52 = var7 ? var8.C00OOC00oO : 11.0F;
                  float var53 = var7 ? var8.uUnuvNvvNU : (var6 ? 8.0F : 11.0F);
                  float var54 = Math.max(1.0F, var28 - var35 * 2.0F);
                  this.UuUVuuUu(var1, var26, var27, var28, var31, var51, var42);
                  if (var6) {
                     if (var50 || this.UuuNnUvUuv() || this.nUUVuvU()) {
                        this.UuUVuuUu(var1, var26 + var35, var27 + var36, var54, var37, var52, var42);
                     } else if (var7) {
                        var1.UuUVuuUu(var26 + var35, var27 + var36, var54, var37, var52, var45);
                     } else {
                        var1.UuUVuuUu(var26 + var35, var27 + var36, var54, var37, 11.0F, 11.0F, 4.0F, 4.0F, var45);
                     }

                     float var55 = C00OOC00oO(var12 * var33, 18.0F, 24.0F);
                     float var56 = var26 + var35 + var54 - C00OOC00oO(10.0F * var32, 8.0F, 12.0F) - var55;
                     float var57 = var27 + var36 + (var37 - var55) / 2.0F;
                     if (var7) {
                        float var58 = var26 + var8.UvnvNVnnnnNU.UuUVuuUu * var32;
                        float var59 = var27 + var8.UvnvNVnnnnNU.C00OOC00oO * var33;
                        var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var58, var59, var8.UuuNnUvUuv * var34, var15, var48);
                        float var60 = var8.nUUVuvU * var34;
                        float var61 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "e", var60).UuUVuuUu;
                        float var62 = (var8.uVUVnuvnuVuv.uUnuvNvvNU ? var26 + var28 : var26) + var8.uVUVnuvnuVuv.UuUVuuUu * var32;
                        float var63 = var27 + var8.uVUVnuvnuVuv.C00OOC00oO * var33;
                        var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var62, var63, var60, "e", var49);
                     } else {
                        float var86 = this.UuUVuuUu(
                           vNvnnVvvVUu.vVvUvVVuuNvV, var15, C00OOC00oO(26.0F * var34, 18.0F, 29.0F), Math.max(18.0F, var54 - var12 - 24.0F)
                        );
                        float var89 = var26 + var35 + C00OOC00oO(10.0F * var32, 8.0F, 12.0F);
                        float var91 = Math.max(1.0F, var56 - var89 - 4.0F);
                        var1.UuUVuuUu(var89, var27 + var36, var91, var37, 0.0F, 0.0F, 0.0F, 0.0F);
                        var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var89, UuUVuuUu(var27 + var36, var37, var86), var86, var15, var48);
                        var1.nuUnNvnuUu();
                        float var93 = C00OOC00oO((var5 + 4.0F) * var34, 22.0F, 30.0F);
                        float var95 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "e", var93).UuUVuuUu;
                        var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var56 + (var55 - var95) / 2.0F, UuUVuuUu(var57, var55, var93), var93, "e", var49);
                     }
                  }

                  float var82 = var27 + var36 + var37 + var38;
                  if (!var6) {
                     var82 = var27 + var36;
                  }

                  float var84 = var26 + var35 + (var7 ? var8.NVNnnvnuunNv.UuUVuuUu * var32 : 0.0F);
                  var82 += var7 ? var8.NVNnnvnuunNv.C00OOC00oO * var33 : 0.0F;
                  float var85;
                  if (var7) {
                     var85 = var72 * var33;
                  } else {
                     float var87 = Math.max(1.0F, var31 - var36 * 2.0F - var37 - var38);
                     var85 = Math.min(Math.max(12.0F, vuvnUnVnUNnV.size() * var39 + 12.0F), var87);
                  }

                  if (this.vNUvnnVnUvu() || var50 || this.UuuNnUvUuv() || this.nUUVuvU()) {
                     if (var50 || this.UuuNnUvUuv() || this.nUUVuvU()) {
                        this.C00OOC00oO(var1, var84, var82, var54, var85, var53, var42);
                     } else if (var7) {
                        var1.UuUVuuUu(var84, var82, var54, var85, var53, var46);
                     } else {
                        var1.UuUVuuUu(var84, var82, var54, var85, var6 ? 4.0F : 11.0F, var6 ? 4.0F : 11.0F, 11.0F, 11.0F, var46);
                     }
                  }

                  var1.UuUVuuUu(var26, var27, var28, var31, var51, var51, var51, var51);
                  float var88 = var82 + Math.max(6.0F, (var85 - vuvnUnVnUNnV.size() * var39) * 0.5F);
                  int var90 = VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), var43);

                  for (VUVVnvUunV.NVnVnNnN var94 : vuvnUnVnUNnV) {
                     if (var7) {
                        var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var84 + var40, var88 + var39 / 2.0F + 3.0F * var33, var41, var94.label, var90);
                        int var96 = VnVnuUn.uNNnnnuuuN(var94.valColor, var43);
                        float var98 = var84 + var54 - var40 - vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var94.value, var41).UuUVuuUu;
                        this.UuUVuuUu(
                           var1,
                           var94.label,
                           var94.value,
                           vNvnnVvvVUu.UuUVuuUu,
                           var84,
                           var88,
                           var54,
                           var39,
                           var98,
                           var88 + var39 / 2.0F + 3.0F * var33,
                           var41,
                           var96
                        );
                     } else {
                        float var97 = Math.max(1.0F, var54 - var40 * 2.0F);
                        float var99 = this.UuUVuuUu(var94, var41, var97, C00OOC00oO(var41 * 0.34F, 5.0F, 8.0F));
                        float var64 = UuUVuuUu(var88, var39, var99);
                        float var65 = var26 + var35 + var40;
                        float var66 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var94.label, var99).UuUVuuUu;
                        float var67 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var94.value, var99).UuUVuuUu;
                        float var68 = var26 + var35 + var40 + var97 - var67;
                        float var69 = var65 + var66 + C00OOC00oO(var99 * 0.34F, 5.0F, 8.0F);
                        if (var68 < var69) {
                           var68 = var69;
                        }

                        var1.UuUVuuUu(var65 - 1.0F, var88, var97 + 2.0F, var39, 0.0F, 0.0F, 0.0F, 0.0F);
                        var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var65, var64, var99, var94.label, var90);
                        int var70 = VnVnuUn.uNNnnnuuuN(var94.valColor, var43);
                        this.UuUVuuUu(
                           var1, var94.label, var94.value, vNvnnVvvVUu.UuUVuuUu, var65 - 1.0F, var88, var97 + 2.0F, var39, var68, var64, var99, var70
                        );
                        var1.nuUnNvnuUu();
                     }

                     var88 += var39;
                  }

                  var1.nuUnNvnuUu();
                  nNuUNVu.UuUVuuUu().UuUVuuUu(var25);
                  UuUuVnVvnvn.UuUVuuUu(var1, this, var25, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
               }
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, List<VUVVnvUunV.NVnVnNnN> var2, float var3) {
      float var4 = 22.0F;
      float var5 = 6.0F;
      float var6 = 15.0F;
      float var7 = 12.0F;
      float var8 = 28.0F;
      float var9 = 0.0F;

      for (int var10 = 0; var10 < var2.size(); var10++) {
         VUVVnvUunV.NVnVnNnN var11 = (VUVVnvUunV.NVnVnNnN)var2.get(var10);
         var9 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var11.label, var4).UuUVuuUu
            + var5
            + vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var11.value, var4).UuUVuuUu;
         if (var10 < var2.size() - 1) {
            var9 += var6;
         }
      }

      float var34 = var9 + var7 * 2.0F;
      NuunnvnN.UuUVuuUu();
      NVUunUNUN.UuUVuuUu();
      NuunnvnN.UuUVuuUu(var34, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
      NVUunUNUN.UuUVuuUu(var8, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
      float var35 = NuunnvnN.uNNnnnuuuN();
      float var12 = NVUunUNUN.uNNnnnuuuN();
      nNuUNVu.nvnNNunvv var13 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_Info_Row", 10.0F, 10.0F, var35, var12);
      float var14 = Math.max(1.0F, var13.vVvUvVVuuNvV);
      float var15 = Math.max(1.0F, var13.uNNnnnuuuN);
      var13 = nNuUNVu.UuUVuuUu().UuUVuuUu(var13, var14, var15, var35, var12);
      float var16 = var13.C00OOC00oO + VVnVNnunVvu.uNNnnnuuuN();
      float var17 = var13.uUnuvNvvNU;
      var14 = var13.vVvUvVVuuNvV;
      var15 = var13.uNNnnnuuuN;
      this.UuUVuuUu(var16, var17, var14, var15);
      float var18 = C00OOC00oO(var14 / Math.max(1.0F, var35), 0.6F, 3.5F);
      float var19 = var4 * var18;
      float var20 = var5 * var18;
      float var21 = var6 * var18;
      float var22 = var7 * var18;
      float var23 = 0.0F;

      for (int var24 = 0; var24 < var2.size(); var24++) {
         VUVVnvUunV.NVnVnNnN var25 = (VUVVnvUunV.NVnVnNnN)var2.get(var24);
         var23 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var25.label, var19).UuUVuuUu
            + var20
            + vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var25.value, var19).UuUVuuUu;
         if (var24 < var2.size() - 1) {
            var23 += var21;
         }
      }

      float var39 = var3 * this.uVunuUNVVUUV.uUnuvNvvNU();
      float var40 = C00OOC00oO(var15 * 0.32F, 8.0F, 16.0F);
      this.UuUVuuUu(var1, var16, var17, var14, var15, var40, var39);
      var1.UuUVuuUu(var16, var17, var14, var15, var40, var40, var40, var40);
      float var26 = var16 + Math.max(var22, (var14 - var23) * 0.5F);
      float var27 = UuUVuuUu(var17, var15, var19);
      int var28 = VnVnuUn.UuUVuuUu(this.nuUnNvnuUu(1.0F), (int)(255.0F * var39));
      int var29 = (int)(255.0F * var39);

      for (VUVVnvUunV.NVnVnNnN var31 : var2) {
         float var32 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var31.label, var19).UuUVuuUu;
         float var33 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var31.value, var19).UuUVuuUu;
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var26, var27, var19, var31.label, var28);
         var26 += var32 + var20;
         this.UuUVuuUu(
            var1, var31.label, var31.value, vNvnnVvvVUu.UuUVuuUu, var16, var17, var14, var15, var26, var27, var19, VnVnuUn.uNNnnnuuuN(var31.valColor, var29)
         );
         var26 += var33 + var21;
      }

      var1.nuUnNvnuUu();
      nNuUNVu.UuUVuuUu().UuUVuuUu(var13);
      UuUuVnVvnvn.UuUVuuUu(var1, this, var13, nNuUNVu.UuUVuuUu(), a_.method_22683().method_4486(), a_.method_22683().method_4502());
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, List<VUVVnvUunV.NVnVnNnN> var5, boolean var6) {
      float var7 = var1 / Math.max(1.0F, var2);
      float var8 = var1 / Math.max(1.0F, var3);
      float var9 = this.UuUVuuUu(var5, var6);
      return var1 >= Math.max(190.0F, var9 * 0.86F) && var7 >= 2.35F && var8 >= 1.16F;
   }

   private float UuUVuuUu(List<VUVVnvUunV.NVnVnNnN> var1, boolean var2) {
      float var3 = 22.0F;
      float var4 = var2 ? vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "Information", 22.0F).UuUVuuUu + 36.0F : 0.0F;

      for (VUVVnvUunV.NVnVnNnN var6 : var1) {
         var4 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6.label, var3).UuUVuuUu;
         var4 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6.value, var3).UuUVuuUu;
         var4 += 26.0F;
      }

      return var4 + 28.0F;
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      String var6,
      boolean var7,
      List<VUVVnvUunV.NVnVnNnN> var8,
      float var9,
      int var10,
      int var11
   ) {
      float var12 = C00OOC00oO(var5, 38.0F, 54.0F);
      float var13 = var3 + (var5 - var12) * 0.5F;
      float var14 = C00OOC00oO(var12 * 0.28F, 10.0F, 14.0F);
      this.UuUVuuUu(var1, var2, var13, var4, var12, var14, var9);
      float var15 = C00OOC00oO(var4 * 0.033F, 13.0F, 22.0F);
      float var16 = C00OOC00oO(var12 * 0.18F, 6.0F, 9.0F);
      float var17 = var2 + var15;
      float var18 = var13 + var16;
      float var19 = Math.max(1.0F, var4 - var15 * 2.0F);
      float var20 = Math.max(1.0F, var12 - var16 * 2.0F);
      float var21 = C00OOC00oO(var20 * 0.82F, 21.0F, 30.0F);
      float var22 = C00OOC00oO(var20 * 0.78F, 21.0F, 29.0F);
      var1.UuUVuuUu(var2, var13, var4, var12, var14, var14, var14, var14);
      float var23 = var17;
      float var24 = var19;
      if (var7) {
         float var25 = C00OOC00oO(var22 + 1.0F, 21.0F, 30.0F);
         float var26 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var6, var22).UuUVuuUu;
         float var27 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "e", var25).UuUVuuUu;
         boolean var28 = var19 >= 300.0F;
         float var29 = C00OOC00oO(var26 + (var28 ? var27 + 15.0F : 0.0F), 78.0F, Math.min(var19 * 0.28F, 142.0F));
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var17, UuUVuuUu(var18, var20, var22), var22, var6, var10);
         if (var28) {
            var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var17 + var29 - var27, UuUVuuUu(var18, var20, var25), var25, "e", var11);
         }

         var23 = var17 + (var29 + C00OOC00oO(var4 * 0.018F, 8.0F, 16.0F));
         var24 = Math.max(1.0F, var17 + var19 - var23);
      }

      int var39 = Math.max(1, var8.size());
      float var40 = C00OOC00oO(var21 * 0.42F, 7.0F, 12.0F);
      float var41 = var24 / var39;
      int var42 = VnVnuUn.UuUVuuUu(this.nuUnNvnuUu(1.0F), (int)(255.0F * var9));

      for (int var43 = 0; var43 < var8.size(); var43++) {
         VUVVnvUunV.NVnVnNnN var30 = (VUVVnvUunV.NVnVnNnN)var8.get(var43);
         float var31 = var23 + var41 * var43;
         float var32 = this.UuUVuuUu(var30, var21, Math.max(20.0F, var41 - 8.0F), var40);
         float var33 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var30.label, var32).UuUVuuUu;
         float var34 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var30.value, var32).UuUVuuUu;
         float var35 = var33 + var40 + var34;
         float var36 = var31 + Math.max(3.0F, (var41 - var35) * 0.5F);
         float var37 = UuUVuuUu(var18, var20, var32);
         int var38 = VnVnuUn.uNNnnnuuuN(var30.valColor, (int)(255.0F * var9));
         var1.UuUVuuUu(var31 + 1.0F, var13, Math.max(1.0F, var41 - 2.0F), var12, 0.0F, 0.0F, 0.0F, 0.0F);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var36, var37, var32, var30.label, var42);
         this.UuUVuuUu(
            var1,
            var30.label,
            var30.value,
            vNvnnVvvVUu.UuUVuuUu,
            var31 + 1.0F,
            var13,
            Math.max(1.0F, var41 - 2.0F),
            var12,
            var36 + var33 + var40,
            var37,
            var32,
            var38
         );
         var1.nuUnNvnuUu();
      }

      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(
      UnVNvNnU var1, String var2, String var3, nUVnuvUu var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, int var12
   ) {
      if (!this.nNnVnUNVV.uUnuvNvvNU()) {
         var1.UuUVuuUu(var4, var9, var10, var11, var3, var12);
      } else {
         VnuuvvUv var13 = this.nuunNvv.get(var2);
         if (var13 == null) {
            var13 = new VnuuvvUv();
            this.nuunNvv.put(var2, var13);
         }

         var13.UuUVuuUu(var3);
         var13.C00OOC00oO(var1, var4, var5, var6, var7, var8, Math.min(var8 * 0.45F, 6.0F), var9, var10, var11, var12);
      }
   }

   private float UuUVuuUu(VUVVnvUunV.NVnVnNnN var1, float var2, float var3, float var4) {
      float var5 = var2;

      for (int var6 = 0; var6 < 8; var6++) {
         float var7 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1.label, var5).UuUVuuUu;
         float var8 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1.value, var5).UuUVuuUu;
         float var9 = var7 + var4 + var8;
         if (var9 <= var3 || var5 <= 16.0F) {
            return var5;
         }

         var5 = Math.max(16.0F, var5 * Math.max(0.72F, var3 / Math.max(1.0F, var9)));
      }

      return var5;
   }

   private float UuUVuuUu(nUVnuvUu var1, String var2, float var3, float var4) {
      float var5 = var3;

      for (int var6 = 0; var6 < 8; var6++) {
         float var7 = vVVUUuunVVV.UuUVuuUu(var1, var2, var5).UuUVuuUu;
         if (var7 <= var4 || var5 <= 16.0F) {
            return var5;
         }

         var5 = Math.max(16.0F, var5 * Math.max(0.72F, var4 / Math.max(1.0F, var7)));
      }

      return var5;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + var1 * 0.5F + var2 * 0.18F;
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static String UvnvNVnnnnNU() {
      double var0 = 0.0;
      if (a_.field_1724 != null) {
         double var2 = a_.field_1724.method_23317() - a_.field_1724.field_6014;
         double var4 = a_.field_1724.method_23321() - a_.field_1724.field_5969;
         var0 = Math.sqrt(var2 * var2 + var4 * var4) * 20.0;
      }

      c0oOOCcCoC0 = c0oOOCcCoC0 + (var0 - c0oOOCcCoC0) * 0.1;
      return C00OOC00oO(c0oOOCcCoC0);
   }

   private static String uVUVnuvnuVuv() {
      if (a_.field_1724 != null) {
         int var0 = (int)a_.field_1724.method_23317();
         int var1 = (int)a_.field_1724.method_23318();
         int var2 = (int)a_.field_1724.method_23321();
         return var0 + " " + var1 + " " + var2;
      } else {
         return "0 0 0";
      }
   }

   private static String NVNnnvnuunNv() {
      if (a_.field_1724 != null && a_.method_1562() != null) {
         class_640 var0 = a_.method_1562().method_2871(a_.field_1724.method_5667());
         return var0 == null ? "0 ms" : var0.method_2959() + " ms";
      } else {
         return "0 ms";
      }
   }

   private static String UuUVuuUu(double var0) {
      int var2 = (int)Math.round(var0 * 10.0);
      int var3 = var2 / 10;
      int var4 = Math.abs(var2 % 10);
      return var3 + "." + var4;
   }

   private static String C00OOC00oO(double var0) {
      int var2 = (int)Math.round(var0 * 100.0);
      int var3 = var2 / 100;
      int var4 = Math.abs(var2 % 100);
      return var3 + (var4 < 10 ? ".0" : ".") + var4;
   }

   record NVnVnNnN(String label, String value, int valColor) {
   }
}
