package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_640;

@vuUuvvvNnVV(
   UuUVuuUu = "PartyListHUD",
   C00OOC00oO = "w"
)
public final class uVunUnVVUn extends vVvnUVnUvv {
   private static final uVunUnVVUn UuUVuuUu = new uVunUnVVUn();
   private static final class_310 C00OOC00oO = class_310.method_1551();
   private static final VVnnnnN uUnuvNvvNU = new VVnnnnN();
   private static final VVnnnnN vVvUvVVuuNvV = new VVnnnnN();
   private static final VVnnnnN uNNnnnuuuN = new VVnnnnN();
   private static final VVnnnnN nuUnNvnuUu = new VVnnnnN();
   private static final Map<String, VVnnnnN> VVuuUN = new HashMap<>();
   private static final Map<String, class_2960> vNUvnnVnUvu = new HashMap<>();
   private static final Map<String, List<uVunUnVVUn.NVnVnNnN>> uVUuuVnNVU = new HashMap<>();
   private static final List<String> vuuuNvNuv = new ArrayList<>(16);
   private static boolean nvUVNnuu;
   private static long UuuNnUvUuv;
   private final vvNnnUNnVvn nUUVuvU = new vvNnnUNnVvn("Показывать верхушку", true);
   private final nNUuNvVn UnUNVVVNuv = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
   private final nNUuNvVn vNVuvnUUnuUn = new nNUuNvVn("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
   private final UvNnUnuNUUU UvnvNVnnnnNU = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Феррофлюид");
   private final VUVnvvnNN uVUVnuvnuVuv = new VUVnvvnNN("Визуал", new vvNnnUNnVvn("Тень", true), new vvNnnUNnVvn("Обводка", true));
   private final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Показывать здоровье", true);

   private uVunUnVVUn() {
      this.UuUVuuUu(this.nUUVuvU);
      this.UuUVuuUu(this.UnUNVVVNuv);
      this.UuUVuuUu(this.vNVuvnUUnuUn);
      this.UuUVuuUu(this.UvnvNVnnnnNU);
      this.UuUVuuUu(this.uVUVnuvnuVuv);
      this.UuUVuuUu(this.NVNnnvnuunNv);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UuUVuuUu.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (C00OOC00oO.field_1724 != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - UuuNnUvUuv > 1000L) {
            UuuNnUvUuv = var2;
            uVUuuVnNVU.clear();
         }

         vuuuNvNuv.clear();

         for (String var5 : UuuNvUuUnu.uNNnnnuuuN()) {
            vuuuNvNuv.add(var5.toLowerCase());
         }

         String var65 = C00OOC00oO.field_1724.method_5477().getString().toLowerCase();
         if (!vuuuNvNuv.contains(var65)) {
            vuuuNvNuv.add(0, var65);
         }

         for (String var6 : vuuuNvNuv) {
            VVuuUN.computeIfAbsent(var6, var0 -> new VVnnnnN()).UuUVuuUu(1.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         for (Entry var69 : VVuuUN.entrySet()) {
            ((VVnnnnN)var69.getValue()).UuUVuuUu();
            if (!vuuuNvNuv.contains(((String)var69.getKey()).toLowerCase())) {
               ((VVnnnnN)var69.getValue()).UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
            }
         }

         boolean var68 = vuuuNvNuv.isEmpty() && !(C00OOC00oO.field_1755 instanceof class_408);
         boolean var70 = !var68;
         uUnuvNvvNU.UuUVuuUu();
         vVvUvVVuuNvV.UuUVuuUu();
         uUnuvNvvNU.UuUVuuUu(var68 ? 0.0 : 1.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         if (var70) {
            if (!nvUVNnuu) {
               vVvUvVVuuNvV.nuUnNvnuUu(-10.0);
            }

            vVvUvVVuuNvV.UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         } else {
            if (nvUVNnuu) {
               vVvUvVVuuNvV.nuUnNvnuUu(0.0);
            }

            vVvUvVVuuNvV.UuUVuuUu(10.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         nvUVNnuu = var70;
         float var7 = uUnuvNvvNU.uNNnnnuuuN();
         if (!(var7 <= 0.01F)) {
            float var8 = 24.0F;
            boolean var9 = this.nUUVuvU.uUnuvNvvNU();
            float var10 = var9 ? 7.0F : 0.0F;
            float var11 = var9 ? 32.0F : 0.0F;
            float var12 = 22.0F;
            float var13 = 28.0F;
            float var14 = 10.0F;
            String var15 = "Party";
            float var16 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var15, 26.0F).UuUVuuUu;
            float var17 = var14 * 2.0F + 30.0F;
            if (var9) {
               var17 = Math.max(var17, var16 + var12 + var14 * 2.0F + 24.0F);
            }

            for (Entry var19 : VVuuUN.entrySet()) {
               if (((VVnnnnN)var19.getValue()).uNNnnnuuuN() > 0.01F) {
                  List var20 = this.UuUVuuUu((String)var19.getKey(), VnVnuUn.uUnuvNvvNU(245, 245, 245, 255));
                  float var21 = 0.0F;

                  for (uVunUnVVUn.NVnVnNnN var23 : var20) {
                     var21 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23.UuUVuuUu, var8).UuUVuuUu;
                  }

                  float var77 = var21 + var14 * 2.0F + 26.0F;
                  if (this.NVNnnvnuunNv.uUnuvNvvNU()) {
                     var77 += 40.0F;
                  }

                  var17 = Math.max(var17, var77);
               }
            }

            float var71 = 0.0F;

            for (VVnnnnN var74 : VVuuUN.values()) {
               var71 += var13 * Math.max(0.0F, Math.min(1.0F, var74.uNNnnnuuuN()));
            }

            if (var71 > 0.01F) {
               var71 += var9 ? 5.0F : 7.0F;
            }

            float var73 = (var9 ? var10 + var11 + 5.0F : 7.0F) + var71;
            uNNnnnuuuN.UuUVuuUu();
            nuUnNvnuUu.UuUVuuUu();
            uNNnnnuuuN.UuUVuuUu(var17, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            nuUnNvnuUu.UuUVuuUu(var73, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var75 = uNNnnnuuuN.uNNnnnuuuN();
            float var76 = nuUnNvnuUu.uNNnnnuuuN();
            float var78 = C00OOC00oO.method_22683().method_4489();
            float var79 = 10.0F;
            float var24 = 100.0F;
            nNuUNVu.nvnNNunvv var25 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_PartyList", var79, var24, var75, var76);
            float var26 = var25.C00OOC00oO + vVvUvVVuuNvV.uNNnnnuuuN();
            float var27 = var25.uUnuvNvvNU;
            float var28 = var25.vVvUvVVuuNvV;
            float var29 = var25.uNNnnnuuuN;
            float var30 = var28 / Math.max(1.0F, var75);
            float var31 = var29 / Math.max(1.0F, var76);
            float var32 = Math.min(var30, var31);
            float var33 = var10 * var30;
            float var34 = var9 ? var10 * var31 : 0.0F;
            float var35 = var9 ? var11 * var31 : 0.0F;
            float var36 = var13 * var31;
            float var37 = var14 * var30;
            float var38 = var8 * var32;
            int var39 = (int)(255.0F * var7 * this.UnUNVVVNuv.uUnuvNvvNU());
            float var40 = var7 * this.UnUNVVVNuv.uUnuvNvvNU() * this.vNVuvnUUnuUn.uUnuvNvvNU();
            int var41 = (int)(255.0F * var40);
            int var42 = VnVnuUn.uUnuvNvvNU(24, 24, 24, var39);
            int var43 = VnVnuUn.uUnuvNvvNU(40, 37, 40, var41);
            int var44 = VnVnuUn.uUnuvNvvNU(45, 45, 45, var39);
            int var45 = VnVnuUn.uUnuvNvvNU(255, 255, 255, var39);
            int var46 = VnVnuUn.uUnuvNvvNU(255, 255, 255, var39);
            int var47 = VnVnuUn.uUnuvNvvNU(22, 22, 22, var41);
            if (this.UvnvNVnnnnNU.uUnuvNvvNU().equals("Светлый")) {
               var42 = VnVnuUn.uUnuvNvvNU(240, 240, 245, var39);
               var43 = VnVnuUn.uUnuvNvvNU(220, 220, 225, var41);
               var44 = VnVnuUn.uUnuvNvvNU(200, 200, 200, var39);
               var45 = VnVnuUn.uUnuvNvvNU(20, 20, 20, var39);
               int var48 = UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(255, 255);
               var46 = VnVnuUn.uNNnnnuuuN(var48, (int)(255.0F * var7 * this.UnUNVVVNuv.uUnuvNvvNU()));
               var47 = VnVnuUn.uUnuvNvvNU(200, 200, 200, var41);
            } else if (this.UvnvNVnnnnNU.uUnuvNvvNU().equals("Блюр")) {
               var42 = VnVnuUn.uUnuvNvvNU(10, 10, 10, (int)(40.0F * var7 * this.UnUNVVVNuv.uUnuvNvvNU()));
               var43 = VnVnuUn.uUnuvNvvNU(25, 25, 25, (int)(120.0F * var40));
               var44 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(35.0F * var7 * this.UnUNVVVNuv.uUnuvNvvNU()));
               var47 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(40.0F * var40));
            }

            float var80 = 10.0F;
            float var49 = 6.0F;
            if (this.uVUVnuvnuVuv.C00OOC00oO("Тень")) {
               var1.UuUVuuUu(var26, var27, var28, var29, var80, 4.0F, 1.0F, VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(80.0F * var7 * this.UnUNVVVNuv.uUnuvNvvNU())));
            }

            if (this.UvnvNVnnnnNU.uUnuvNvvNU().equals("Блюр")) {
               var1.UuUVuuUu(23.0F);
               var1.UuUVuuUu(var26, var27, var28, var29, var80, var7 * this.UnUNVVVNuv.uUnuvNvvNU());
            }

            var1.UuUVuuUu(var26, var27, var28, var29, var80, var42);
            if (this.uVUVnuvnuVuv.C00OOC00oO("Обводка")) {
               var1.UuUVuuUu(var26, var27, var28, var29, var80, var44, this.UvnvNVnnnnNU.uUnuvNvvNU().equals("Блюр") ? 1.0F : 1.5F);
            }

            if (var9) {
               float var50 = var28 - var33 * 2.0F;
               if (this.UvnvNVnnnnNU.uUnuvNvvNU().equals("Блюр")) {
                  var1.UuUVuuUu(23.0F);
                  var1.UuUVuuUu(var26 + var33, var27 + var34, var50, var35, var49, var40);
               }

               var1.UuUVuuUu(var26 + var33, var27 + var34, var50, var35, var49, var43);
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var26 + var33 + 10.0F * var30, var27 + var34 + var35 / 2.0F + 6.0F * var31, 26.0F * var32, var15, var45);
               float var51 = var12 * var31;
               float var52 = var26 + var33 + var50 - 6.0F * var30 - var51;
               float var53 = var27 + var34 + (var35 - var51) / 2.0F;
               var1.UuUVuuUu(var52, var53, var51, var51, 6.0F, var47);
               float var54 = (var8 + 4.0F) * var32;
               float var55 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "p", var54).UuUVuuUu;
               var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var52 + (var51 - var55) / 2.0F, var53 + var51 / 2.0F + 7.0F * var31, var54, "p", var46);
            }

            var1.UuUVuuUu(var26, var27, var28, var29, var80, var80, var80, var80);
            float var81 = var27 + (var9 ? var34 + var35 + 5.0F * var31 : 7.0F * var31);

            for (Entry var83 : VVuuUN.entrySet()) {
               float var84 = Math.max(0.0F, Math.min(1.0F, ((VVnnnnN)var83.getValue()).uNNnnnuuuN()));
               if (!(var84 <= 0.01F)) {
                  float var85 = var84 * var84;
                  int var86 = (int)(255.0F * var7 * var85 * this.UnUNVVVNuv.uUnuvNvvNU());
                  if (var86 <= 5) {
                     var81 += var36 * var84;
                  } else {
                     String var56 = (String)var83.getKey();
                     float var57 = (1.0F - var84) * 8.0F * var30;
                     float var58 = var26 + var37 - var57;
                     float var59 = 18.0F * var32;
                     UuUVuuUu(var1, var56, var58, var81 + (var36 - var59) / 2.0F, var59, var7 * var85 * this.UnUNVVVNuv.uUnuvNvvNU());
                     float var60 = var58 + var59 + 6.0F * var30;

                     for (uVunUnVVUn.NVnVnNnN var63 : this.UuUVuuUu(var56, VnVnuUn.uUnuvNvvNU(245, 245, 245, var86))) {
                        int var64 = VnVnuUn.uNNnnnuuuN(var63.C00OOC00oO, var86);
                        var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60, var81 + var36 / 2.0F + 3.0F * var31, var38, var63.UuUVuuUu, var64);
                        var60 += vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var63.UuUVuuUu, var38).UuUVuuUu;
                     }

                     if (this.NVNnnvnuunNv.uUnuvNvvNU()) {
                        String var87 = "20.0 HP";
                        float var88 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var87, var38).UuUVuuUu;
                        var1.UuUVuuUu(
                           vNvnnVvvVUu.UuUVuuUu,
                           var26 + var28 - var37 - var88 + var57,
                           var81 + var36 / 2.0F + 3.0F * var31,
                           var38,
                           var87,
                           VnVnuUn.uUnuvNvvNU(100, 255, 100, var86)
                        );
                     }

                     var81 += var36 * var84;
                  }
               }
            }

            var1.nuUnNvnuUu();
            nNuUNVu.UuUVuuUu().UuUVuuUu(var25);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var25, nNuUNVu.UuUVuuUu(), C00OOC00oO.method_22683().method_4486(), C00OOC00oO.method_22683().method_4502());
         }
      }
   }

   private List<uVunUnVVUn.NVnVnNnN> UuUVuuUu(String var1, int var2) {
      ArrayList var3 = new ArrayList();
      if (C00OOC00oO.method_1562() != null) {
         for (class_640 var5 : C00OOC00oO.method_1562().method_2880()) {
            if (var5.method_2966().getName().equalsIgnoreCase(var1)) {
               Object var6 = var5.method_2971() != null ? var5.method_2971() : class_2561.method_43470(var5.method_2966().getName());
               var6.method_27658((var2x, var3x) -> {
                  String var4 = var3x.replaceAll("(?i)§.", "").replaceAll("[^A-Za-zА-Яа-яЁё0-9\\s\\[\\]()_\\-.,!<>:|]", "");
                  if (!var4.isEmpty()) {
                     int var5x = var2;
                     if (var2x.method_10973() != null) {
                        var5x = var2x.method_10973().method_27716() | 0xFF000000;
                     }

                     var3.add(new uVunUnVVUn.NVnVnNnN(var4, var5x));
                  }

                  return Optional.empty();
               }, class_2583.field_24360);
               if (!var3.isEmpty()) {
                  return var3;
               }
            }
         }
      }

      var3.add(new uVunUnVVUn.NVnVnNnN(var1, var2));
      return var3;
   }

   private static void UuUVuuUu(UnVNvNnU var0, String var1, float var2, float var3, float var4, float var5) {
      try {
         String var6 = var1.toLowerCase(Locale.ROOT);
         class_2960 var7 = vNUvnnVnUvu.computeIfAbsent(var6, var1x -> {
            GameProfile var2x = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1).getBytes()), var1);
            return C00OOC00oO.method_1582().method_52862(var2x).comp_1626();
         });
         class_1044 var8 = C00OOC00oO.method_1531().method_4619(var7);
         if (!(var8.method_68004() instanceof class_10868 var10)) {
            return;
         }

         int var11 = var10.method_68427();
         if (var11 <= 0) {
            return;
         }

         GlStateManager._bindTexture(var11);
         var0.uNNnnnuuuN(var5);
         var0.UuUVuuUu(var11, var2, var3, var4, var4, 0.125F, 0.125F, 0.25F, 0.25F, 4.0F);
         var0.UuUVuuUu(var11, var2, var3, var4, var4, 0.625F, 0.125F, 0.75F, 0.25F, 4.0F);
         var0.vuuuNvNuv();
      } catch (Throwable var12) {
         var0.UuUVuuUu(var2, var3, var4, var4, 4.0F, VnVnuUn.vVvUvVVuuNvV(255, (int)(40.0F * var5)));
      }
   }

   static class NVnVnNnN {
      String UuUVuuUu;
      int C00OOC00oO;

      NVnVnNnN(String var1, int var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
