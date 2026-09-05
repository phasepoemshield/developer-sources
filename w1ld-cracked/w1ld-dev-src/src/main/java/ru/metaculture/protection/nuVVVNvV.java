package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_640;

@vuUuvvvNnVV(
   UuUVuuUu = "StaffListHUD",
   C00OOC00oO = "w"
)
public final class nuVVVNvV extends vVvnUVnUvv {
   private static final nuVVVNvV UuUVuuUu = new nuVVVNvV();
   private static final class_310 C00OOC00oO = class_310.method_1551();
   private static final VVnnnnN uUnuvNvvNU = new VVnnnnN();
   private static final VVnnnnN vVvUvVVuuNvV = new VVnnnnN();
   private static final VVnnnnN uNNnnnuuuN = new VVnnnnN();
   private static final VVnnnnN nuUnNvnuUu = new VVnnnnN();
   private static final Map<String, VVnnnnN> VVuuUN = new HashMap<>();
   private static final List<nuVVVNvV.NVnVnNnN> vNUvnnVnUvu = new ArrayList<>(32);
   private static boolean uVUuuVnNVU;
   private static long vuuuNvNuv;
   private static final List<String> nvUVNnuu = List.of(
      "helper", "moder", "staff", "admin", "curator", "stager", "sotrudnik", "pomoshnik", "стаж", "сотруд", "модер", "админ", "куратор", "хелпер"
   );
   private final vvNnnUNnVvn UuuNnUvUuv = new vvNnnUNnVvn("Показывать верхушку", true);
   private final nNUuNvVn nUUVuvU = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final nNUuNvVn UnUNVVVNuv = new nNUuNvVn("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   private final UvNnUnuNUUU vNVuvnUUnuUn = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Феррофлюид");
   private final VUVnvvnNN UvnvNVnnnnNU = new VUVnvvnNN("Визуал", new vvNnnUNnVvn("Тень", true), new vvNnnUNnVvn("Обводка", true));
   private final vvNnnUNnVvn uVUVnuvnuVuv = new vvNnnUNnVvn("Показывать головы", true);
   private static final Map<Character, Integer> NVNnnvnuunNv = new HashMap<>();

   private nuVVVNvV() {
      this.UuUVuuUu(this.UuuNnUvUuv);
      this.UuUVuuUu(this.nUUVuvU);
      this.UuUVuuUu(this.UnUNVVVNuv);
      this.UuUVuuUu(this.vNVuvnUUnuUn);
      this.UuUVuuUu(this.UvnvNVnnnnNU);
      this.UuUVuuUu(this.uVUVnuvnuVuv);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (C00OOC00oO.field_1724 != null && C00OOC00oO.method_1562() != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - vuuuNvNuv > 500L) {
            vuuuNvNuv = var2;
            C00OOC00oO();
         }

         for (nuVVVNvV.NVnVnNnN var5 : vNUvnnVnUvu) {
            VVuuUN.computeIfAbsent(var5.UuUVuuUu, var0 -> new VVnnnnN()).UuUVuuUu(1.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         for (Entry var63 : VVuuUN.entrySet()) {
            ((VVnnnnN)var63.getValue()).UuUVuuUu();
            boolean var6 = false;

            for (nuVVVNvV.NVnVnNnN var8 : vNUvnnVnUvu) {
               if (var8.UuUVuuUu.equals(var63.getKey())) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               ((VVnnnnN)var63.getValue()).UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
            }
         }

         boolean var62 = vNUvnnVnUvu.isEmpty() && !(C00OOC00oO.field_1755 instanceof class_408);
         boolean var64 = !var62;
         uUnuvNvvNU.UuUVuuUu();
         vVvUvVVuuNvV.UuUVuuUu();
         uUnuvNvvNU.UuUVuuUu(var62 ? 0.0 : 1.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         if (var64) {
            if (!uVUuuVnNVU) {
               vVvUvVVuuNvV.nuUnNvnuUu(-10.0);
            }

            vVvUvVVuuNvV.UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         } else {
            if (uVUuuVnNVU) {
               vVvUvVVuuNvV.nuUnNvnuUu(0.0);
            }

            vVvUvVVuuNvV.UuUVuuUu(10.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         uVUuuVnNVU = var64;
         float var65 = uUnuvNvvNU.uNNnnnuuuN();
         if (!(var65 <= 0.01F)) {
            float var66 = 24.0F;
            boolean var67 = this.UuuNnUvUuv.uUnuvNvvNU();
            float var9 = var67 ? 7.0F : 0.0F;
            float var10 = var67 ? 29.48F : 0.0F;
            float var11 = 22.0F;
            float var12 = 19.37F;
            float var13 = 10.0F;
            String var14 = "Staff";
            float var15 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var14, 30.0F).UuUVuuUu;
            float var16 = var13 * 2.0F + 30.0F;
            if (var67) {
               var16 = Math.max(var16, var15 + var11 + var13 * 2.0F + 24.0F);
            }

            var16 = Math.max(var16, 228.379F);

            for (Entry var18 : VVuuUN.entrySet()) {
               if (((VVnnnnN)var18.getValue()).uNNnnnuuuN() > 0.01F) {
                  float var19 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, (String)var18.getKey(), var66).UuUVuuUu + var13 * 2.0F + 20.0F;
                  if (this.uVUVnuvnuVuv.uUnuvNvvNU()) {
                     var19 += 22.0F;
                  }

                  var16 = Math.max(var16, var19);
               }
            }

            float var69 = 0.0F;

            for (VVnnnnN var72 : VVuuUN.values()) {
               var69 += var12 * Math.max(0.0F, Math.min(1.0F, var72.uNNnnnuuuN()));
            }

            if (var69 > 0.01F) {
               var69 += var67 ? 5.0F : 7.0F;
            }

            float var71 = (var67 ? var9 + var10 + var9 : 12.0F) + var69;
            uNNnnnuuuN.UuUVuuUu();
            nuUnNvnuUu.UuUVuuUu();
            uNNnnnuuuN.UuUVuuUu(var16, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            nuUnNvnuUu.UuUVuuUu(var71, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var73 = uNNnnnuuuN.uNNnnnuuuN();
            float var20 = nuUnNvnuUu.uNNnnnuuuN();
            float var21 = C00OOC00oO.method_22683().method_4489();
            float var22 = Math.max(10.0F, var21 - var73 - 10.0F);
            float var23 = 100.0F;
            nNuUNVu.nvnNNunvv var24 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_StaffList", var22, var23, var73, var20);
            float var25 = var24.C00OOC00oO + vVvUvVVuuNvV.uNNnnnuuuN();
            float var26 = var24.uUnuvNvvNU;
            float var27 = var24.vVvUvVVuuNvV;
            float var28 = var24.uNNnnnuuuN;
            float var29 = var27 / Math.max(1.0F, var73);
            float var30 = var28 / Math.max(1.0F, var20);
            float var31 = Math.min(var29, var30);
            float var32 = var9 * var29;
            float var33 = var67 ? var9 * var30 : 0.0F;
            float var34 = var67 ? var10 * var30 : 0.0F;
            float var35 = var12 * var30;
            float var36 = var13 * var29;
            float var37 = var66 * var31;
            int var38 = (int)(255.0F * var65 * this.nUUVuvU.uUnuvNvvNU());
            float var39 = var65 * this.nUUVuvU.uUnuvNvvNU() * this.UnUNVVVNuv.uUnuvNvvNU();
            int var40 = (int)(255.0F * var39);
            int var41 = VnVnuUn.uUnuvNvvNU(24, 24, 24, var38);
            int var42 = VnVnuUn.uUnuvNvvNU(40, 37, 40, var40);
            int var43 = VnVnuUn.uUnuvNvvNU(45, 45, 45, var38);
            int var44 = VnVnuUn.uUnuvNvvNU(255, 255, 255, var38);
            int var45 = VnVnuUn.uUnuvNvvNU(255, 255, 255, var38);
            int var46 = VnVnuUn.uUnuvNvvNU(22, 22, 22, var40);
            if (this.vNVuvnUUnuUn.uUnuvNvvNU().equals("Светлый")) {
               var41 = VnVnuUn.uUnuvNvvNU(240, 240, 245, var38);
               var42 = VnVnuUn.uUnuvNvvNU(220, 220, 225, var40);
               var43 = VnVnuUn.uUnuvNvvNU(200, 200, 200, var38);
               var44 = VnVnuUn.uUnuvNvvNU(20, 20, 20, var38);
               int var47 = UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(255, 255);
               var45 = VnVnuUn.uNNnnnuuuN(var47, (int)(255.0F * var65 * this.nUUVuvU.uUnuvNvvNU()));
               var46 = VnVnuUn.uUnuvNvvNU(200, 200, 200, var40);
            } else if (this.vNVuvnUUnuUn.uUnuvNvvNU().equals("Блюр")) {
               var41 = VnVnuUn.uUnuvNvvNU(21, 22, 26, (int)(122.0F * var65 * this.nUUVuvU.uUnuvNvvNU()));
               var42 = VnVnuUn.uUnuvNvvNU(21, 22, 26, (int)(184.0F * var39));
               var43 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var65 * this.nUUVuvU.uUnuvNvvNU()));
               var46 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(10.0F * var39));
            }

            float var74 = 14.0F;
            float var48 = 10.0F;
            if (this.UvnvNVnnnnNU.C00OOC00oO("Тень")) {
               var1.UuUVuuUu(var25, var26, var27, var28, var74, 4.0F, 1.0F, VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(80.0F * var65 * this.nUUVuvU.uUnuvNvvNU())));
            }

            if (this.vNVuvnUUnuUn.uUnuvNvvNU().equals("Блюр")) {
               var1.UuUVuuUu(23.0F);
               var1.UuUVuuUu(var25, var26, var27, var28, var74, var65 * this.nUUVuvU.uUnuvNvvNU());
            }

            var1.UuUVuuUu(var25, var26, var27, var28, var74, var41);
            if (this.UvnvNVnnnnNU.C00OOC00oO("Обводка")) {
               var1.UuUVuuUu(var25, var26, var27, var28, var74, var43, this.vNVuvnUUnuUn.uUnuvNvvNU().equals("Блюр") ? 1.0F : 1.5F);
            }

            if (var67) {
               float var49 = var27 - var32 * 2.0F;
               if (this.vNVuvnUUnuUn.uUnuvNvvNU().equals("Блюр")) {
                  var1.UuUVuuUu(23.0F);
                  var1.UuUVuuUu(var25 + var32, var26 + var33, var49, var34, var48, var39);
               }

               var1.UuUVuuUu(var25 + var32, var26 + var33, var49, var34, 10.0F * var31, 10.0F * var31, 4.0F * var31, 4.0F * var31, var42);
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var25 + var32 + 12.4F * var29, var26 + var33 + var34 / 2.0F + 6.0F * var30, 30.0F * var31, var14, var44);
               float var50 = var11 * var30;
               float var51 = var25 + var32 + var49 - 6.0F * var29 - var50;
               float var52 = var26 + var33 + (var34 - var50) / 2.0F;
               var1.UuUVuuUu(var51, var52, var50, var50, 6.0F, var46);
               float var53 = (var66 + 4.0F) * var31;
               float var54 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "f", var53).UuUVuuUu;
               var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var51 + (var50 - var54) / 2.0F, var52 + var50 / 2.0F + 7.0F * var30, var53, "f", var45);
            }

            var1.UuUVuuUu(var25, var26, var27, var28, var74, var74, var74, var74);
            float var75 = var26 + (var67 ? var33 + var34 + 5.0F * var30 : 7.0F * var30);

            for (Entry var77 : VVuuUN.entrySet()) {
               float var78 = Math.max(0.0F, Math.min(1.0F, ((VVnnnnN)var77.getValue()).uNNnnnuuuN()));
               if (!(var78 <= 0.01F)) {
                  nuVVVNvV.NVnVnNnN var79 = null;

                  for (nuVVVNvV.NVnVnNnN var55 : vNUvnnVnUvu) {
                     if (var55.UuUVuuUu.equals(var77.getKey())) {
                        var79 = var55;
                        break;
                     }
                  }

                  float var81 = (1.0F - var78) * 8.0F * var29;
                  float var82 = var25 + var36 - var81;
                  if (this.uVUVnuvnuVuv.uUnuvNvvNU() && var79 != null) {
                     float var56 = 16.0F * var31;
                     var1.UuUVuuUu(
                        var82,
                        var75 + (var35 - var56) / 2.0F,
                        var56,
                        var56,
                        4.0F,
                        VnVnuUn.uUnuvNvvNU(150, 150, 150, (int)(255.0F * var65 * this.nUUVuvU.uUnuvNvvNU()))
                     );
                     var82 += var56 + 6.0F * var29;
                  }

                  if (var79 != null) {
                     float var83 = var82;

                     for (nuVVVNvV.nvnNNunvv var58 : var79.C00OOC00oO) {
                        int var59 = (int)(255.0F * var65 * var78 * this.nUUVuvU.uUnuvNvvNU());
                        int var60 = VnVnuUn.uNNnnnuuuN(var58.C00OOC00oO, var59);
                        var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var83, var75 + var35 / 2.0F + 3.0F * var30, var37, var58.UuUVuuUu, var60);
                        var83 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var58.UuUVuuUu, var37).UuUVuuUu;
                     }
                  } else {
                     var1.UuUVuuUu(
                        vNvnnVvvVUu.UuUVuuUu,
                        var82,
                        var75 + var35 / 2.0F + 3.0F * var30,
                        var37,
                        (String)var77.getKey(),
                        VnVnuUn.uUnuvNvvNU(200, 200, 200, (int)(255.0F * var65 * this.nUUVuvU.uUnuvNvvNU()))
                     );
                  }

                  var75 += var35 * var78;
               }
            }

            var1.nuUnNvnuUu();
            nNuUNVu.UuUVuuUu().UuUVuuUu(var24);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var24, nNuUNVu.UuUVuuUu(), C00OOC00oO.method_22683().method_4486(), C00OOC00oO.method_22683().method_4502());
         }
      }
   }

   private static void C00OOC00oO() {
      vNUvnnVnUvu.clear();
      if (C00OOC00oO.method_1562() != null) {
         for (class_640 var1 : C00OOC00oO.method_1562().method_2880()) {
            String var2 = var1.method_2966().getName();
            String var3 = var1.method_2971() != null ? var1.method_2971().getString() : var2;
            String var4 = var3.toLowerCase(Locale.ROOT);
            boolean var5 = false;

            for (String var7 : nvUVNnuu) {
               if (var4.contains(var7)) {
                  var5 = true;
                  break;
               }
            }

            if (var5) {
               vNUvnnVnUvu.add(C00OOC00oO(var3));
            }
         }
      }
   }

   private static String UuUVuuUu(String var0) {
      return var0.replaceAll("(?i)§[0-9A-FK-OR]", "");
   }

   private static nuVVVNvV.NVnVnNnN C00OOC00oO(String var0) {
      ArrayList var1 = new ArrayList();
      StringBuilder var2 = new StringBuilder();
      int var3 = -1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == 167 && var4 + 1 < var0.length()) {
            char var6 = Character.toLowerCase(var0.charAt(var4 + 1));
            if (NVNnnvnuunNv.containsKey(var6)) {
               if (!var2.isEmpty()) {
                  var1.add(new nuVVVNvV.nvnNNunvv(var2.toString(), var3));
                  var2.setLength(0);
               }

               var3 = NVNnnvnuunNv.get(var6);
            }

            var4++;
         } else {
            var2.append(var5);
         }
      }

      if (!var2.isEmpty()) {
         var1.add(new nuVVVNvV.nvnNNunvv(var2.toString(), var3));
      }

      return new nuVVVNvV.NVnVnNnN(UuUVuuUu(var0), var1);
   }

   static {
      NVNnnvnuunNv.put('0', -16777216);
      NVNnnvnuunNv.put('1', -16777046);
      NVNnnvnuunNv.put('2', -16733696);
      NVNnnvnuunNv.put('3', -16733526);
      NVNnnvnuunNv.put('4', -5636096);
      NVNnnvnuunNv.put('5', -5635926);
      NVNnnvnuunNv.put('6', -22016);
      NVNnnvnuunNv.put('7', -5592406);
      NVNnnvnuunNv.put('8', -11184811);
      NVNnnvnuunNv.put('9', -11184641);
      NVNnnvnuunNv.put('a', -11141291);
      NVNnnvnuunNv.put('b', -11141121);
      NVNnnvnuunNv.put('c', -43691);
      NVNnnvnuunNv.put('d', -43521);
      NVNnnvnuunNv.put('e', -171);
      NVNnnvnuunNv.put('f', -1);
   }

   static class NVnVnNnN {
      final String UuUVuuUu;
      final List<nuVVVNvV.nvnNNunvv> C00OOC00oO;

      NVnVnNnN(String var1, List<nuVVVNvV.nvnNNunvv> var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }

   static class nvnNNunvv {
      final String UuUVuuUu;
      final int C00OOC00oO;

      nvnNNunvv(String var1, int var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
