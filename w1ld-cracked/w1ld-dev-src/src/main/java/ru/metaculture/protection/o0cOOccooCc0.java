package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_408;

@vuUuvvvNnVV(
   UuUVuuUu = "ServerHelper",
   C00OOC00oO = "w"
)
public final class o0cOOccooCc0 extends nnvNuuNvvuu {
   private static final o0cOOccooCc0 UuUVuuUu = new o0cOOccooCc0();
   private static final class_310 c0oOOCcCoC0 = class_310.method_1551();
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static final VVnnnnN NVUunUNUN = new VVnnnnN();
   private static final Map<String, VVnnnnN> UUVNuUNUvUnV = new HashMap<>();
   static final Map<class_1792, class_1799> vuvnUnVnUNnV = new HashMap<>();
   private static final Map<Integer, String> nnuUVNUuvvVU = new HashMap<>();
   private static boolean nVVUuvuNnUN;
   private final vvNnnUNnVvn nNnVnUNVV = new vvNnnUNnVvn("Отображать бинды", true);
   private final List<o0cOOccooCc0.nvnNNunvv> nuunNvv = new ArrayList<>(12);
   private final List<o0cOOccooCc0.nvnNNunvv> uUVVvVVNvvn = new ArrayList<>(12);
   private final List<o0cOOccooCc0.NVnVnNnN> vvUVNVvvNUv = new ArrayList<>(12);

   private o0cOOccooCc0() {
      this.UuUVuuUu(this.nNnVnUNVV);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   private void UuUVuuUu(List<o0cOOccooCc0.nvnNNunvv> var1, class_1792 var2, int var3) {
      this.UuUVuuUu(var1, var2.method_7876(), var2, var1x -> var1x.method_31574(var2), var3);
   }

   private void UuUVuuUu(List<o0cOOccooCc0.nvnNNunvv> var1, String var2, class_1792 var3, Predicate<class_1799> var4, int var5) {
      boolean var6 = var5 != -1 && var5 != 0;
      String var7 = var6 ? UuUVuuUu(var5) : "";
      var1.add(new o0cOOccooCc0.nvnNNunvv(var2, var3, var4, var7, var6));
   }

   private static String UuUVuuUu(int var0) {
      String var1 = nnuUVNUuvvVU.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         String var2 = var0 > 0 ? class_3675.method_15985(var0, -1).method_1441() : "";
         String var3 = ServerHelper.NVNnnvnuunNv.UuUVuuUu(var0, var2);
         nnuUVNUuvvVU.put(var0, var3);
         return var3;
      }
   }

   private List<o0cOOccooCc0.nvnNNunvv> UvnvNVnnnnNU() {
      this.nuunNvv.clear();
      List var1 = this.nuunNvv;
      ServerHelper var2 = ServerHelper.NVNnnvnuunNv;
      if (var2 == null) {
         return var1;
      } else {
         if (var2.uVunuUNVVUUV.C00OOC00oO("FunTime")) {
            this.UuUVuuUu(var1, "ft_disorientation", class_1802.field_8449, var2.UuUVuuUu(vnVVvun::c0oOOCcCoC0, "Дезориентация"), var2.NnUuNNU.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_light_dust", class_1802.field_8479, var2.UuUVuuUu(vnVVvun::UvUvUNuvNU, "Явная пыль"), var2.nNvNUVU.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_trap", class_1802.field_22021, var2.UuUVuuUu(vnVVvun::VVnVNnunVvu, "Трапка"), var2.UvUvUNuvNU.uUnuvNvvNU());
            this.UuUVuuUu(
               var1, "ft_freezing_snowball", class_1802.field_8543, var2.UuUVuuUu(vnVVvun::vVVuuVVv, "Снежок заморозка"), var2.c0oOOCcCoC0.uUnuvNvvNU()
            );
            this.UuUVuuUu(var1, "ft_gods_aura", class_1802.field_8614, var2.UuUVuuUu(vnVVvun::VuunNUUUvu, "Божья аура"), var2.UnUNuUU.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_plast", class_1802.field_8551, var2.UuUVuuUu(vnVVvun::NuunnvnN, "Пласт"), var2.uUVuVvuNUvnu.uUnuvNvvNU());
            this.UuUVuuUu(
               var1, "ft_potion_assassin", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::uVunuUNVVUUV, "Зелье Ассасина"), var2.VVnVNnunVvu.uUnuvNvvNU()
            );
            this.UuUVuuUu(
               var1,
               "ft_potion_paladin",
               class_1802.field_8436,
               var2.UuUVuuUu(vnVVvun::nNvNUVU, "Зелье Паладина", "Зелье Палладина"),
               var2.unNNVVNnvvV.uUnuvNvvNU()
            );
            this.UuUVuuUu(var1, "ft_potion_sleep", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::uUVuVvuNUvnu, "Снотворное"), var2.NuunnvnN.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_potion_wrath", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::UNnVVNvvnVvU, "Зелье Гнева"), var2.NVUunUNUN.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_potion_holy_water", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::NnUuNNU, "Святая вода"), var2.UUVNuUNUvUnV.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_potion_radiation", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::UnUNuUU, "Зелье Радиации"), var2.vuvnUnVnUNnV.uUnuvNvvNU());
            this.UuUVuuUu(var1, "ft_potion_hlopushka", class_1802.field_8436, var2.UuUVuuUu(vnVVvun::uNnUnnuNUnNu, "Хлопушка"), var2.nnuUVNUuvvVU.uUnuvNvvNU());
         } else if (var2.uVunuUNVVUUV.C00OOC00oO("HolyWorld")) {
            this.UuUVuuUu(var1, "hw_trap", class_1802.field_8882, vNnnVNUVU::UuUVuuUu, var2.nNnVnUNVV.uUnuvNvvNU());
            this.UuUVuuUu(var1, "hw_freezing_snowball", class_1802.field_8543, vNnnVNUVU::C00OOC00oO, var2.nuunNvv.uUnuvNvvNU());
            this.UuUVuuUu(var1, "hw_stan", class_1802.field_8137, vNnnVNUVU::uUnuvNvvNU, var2.uUVVvVVNvvn.uUnuvNvvNU());
            this.UuUVuuUu(var1, "hw_explosive_trap", class_1802.field_8662, vNnnVNUVU::vVvUvVVuuNvV, var2.vvUVNVvvNUv.uUnuvNvvNU());
         }

         this.UuUVuuUu(
            var1, "utility_shulker", class_1802.field_8545, var0 -> var0.method_7909().toString().contains("shulker_box"), var2.UuNnnVnuNNV.uUnuvNvvNU()
         );
         this.UuUVuuUu(var1, class_1802.field_49098, var2.uUVvnUuNvvN.uUnuvNvvNU());
         this.UuUVuuUu(var1, class_1802.field_8233, var2.NVuunNnvvvVu.uUnuvNvvNU());
         return var1;
      }
   }

   public static o0cOOccooCc0 C00OOC00oO() {
      return UuUVuuUu;
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   private void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (c0oOOCcCoC0.field_1724 != null) {
         List var3 = this.UvnvNVnnnnNU();
         this.uUVVvVVNvvn.clear();
         List var4 = this.uUVVvVVNvvn;

         for (o0cOOccooCc0.nvnNNunvv var6 : var3) {
            VVnnnnN var7 = UUVNuUNUvUnV.computeIfAbsent(var6.UuUVuuUu, var0 -> new VVnnnnN());
            var7.UuUVuuUu();
            var7.UuUVuuUu(var6.uNNnnnuuuN ? 1.0 : 0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
            if (var7.uNNnnnuuuN() > 0.001F || var6.uNNnnnuuuN) {
               var4.add(var6);
            }
         }

         boolean var65 = c0oOOCcCoC0.field_1755 instanceof class_408;
         boolean var66 = !var4.isEmpty() || var65;
         VVnVNnunVvu.UuUVuuUu();
         unNNVVNnvvV.UuUVuuUu();
         VVnVNnunVvu.UuUVuuUu(var66 ? 1.0 : 0.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         if (var66) {
            if (!nVVUuvuNnUN) {
               unNNVVNnvvV.nuUnNvnuUu(-10.0);
            }

            unNNVVNnvvV.UuUVuuUu(0.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         } else {
            if (nVVUuvuNnUN) {
               unNNVVNnvvV.nuUnNvnuUu(0.0);
            }

            unNNVVNnvvV.UuUVuuUu(10.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         }

         nVVUuvuNnUN = var66;
         float var67 = VVnVNnunVvu.uNNnnnuuuN();
         if (!(var67 <= 0.01F)) {
            float var8 = 7.0F;
            float var9 = 46.0F;
            float var10 = 5.0F;
            float var11 = 0.0F;
            boolean var12 = true;

            for (o0cOOccooCc0.nvnNNunvv var14 : var4) {
               float var15 = UUVNuUNUvUnV.get(var14.UuUVuuUu).uNNnnnuuuN();
               if (!(var15 <= 0.01F)) {
                  if (!var12) {
                     var11 += var10 * var15;
                  }

                  var11 += var9 * var15;
                  var12 = false;
               }
            }

            if (var4.isEmpty()) {
               var11 = var9;
            }

            float var69 = var11 + var8 * 2.0F;
            float var70 = var9 + var8 * 2.0F;
            NuunnvnN.UuUVuuUu();
            NVUunUNUN.UuUVuuUu();
            NuunnvnN.UuUVuuUu(var69, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            NVUunUNUN.UuUVuuUu(var70, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var71 = NuunnvnN.uNNnnnuuuN();
            float var16 = NVUunUNUN.uNNnnnuuuN();
            float var17 = c0oOOCcCoC0.method_22683().method_4489();
            float var18 = c0oOOCcCoC0.method_22683().method_4506();
            float var19 = (var17 - var71) / 2.0F;
            float var20 = var18 - var16 - 60.0F;
            nNuUNVu.nvnNNunvv var21 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_ServerHelper", var19, var20, var71, var16);
            float var22 = var21.C00OOC00oO + unNNVVNnvvV.uNNnnnuuuN();
            float var23 = var21.uUnuvNvvNU;
            float var24 = var21.vVvUvVVuuNvV;
            float var25 = var21.uNNnnnuuuN;
            this.UuUVuuUu(var22, var23, var24, var25);
            float var26 = var24 / Math.max(1.0F, var71);
            float var27 = var25 / Math.max(1.0F, var16);
            float var28 = Math.min(var26, var27);
            float var29 = var9 * var28;
            float var30 = var10 * var26;
            float var31 = var11 * var26;
            float var32 = var67 * this.uVunuUNVVUUV.uUnuvNvvNU();
            float var33 = this.vuuuNvNuv(var32);
            int var34 = this.UuUVuuUu(var32);
            int var35 = this.vVvUvVVuuNvV(var32);
            boolean var36 = this.nvUVNnuu();
            float var37 = 14.0F;
            this.UuUVuuUu(var1, var22, var23, var24, var25, var37, var32);
            var1.UuUVuuUu(var22, var23, var24, var25, var37, var37, var37, var37);
            float var38 = var23 + (var25 - var29) / 2.0F;
            float var39 = var22 + (var24 - var31) / 2.0F;
            this.vvUVNVvvNUv.clear();
            var12 = true;

            for (o0cOOccooCc0.nvnNNunvv var41 : var4) {
               float var42 = UUVNuUNUvUnV.get(var41.UuUVuuUu).uNNnnnuuuN();
               if (!(var42 <= 0.01F)) {
                  if (!var12) {
                     var39 += var30 * var42;
                  }

                  var12 = false;
                  int var44 = (int)(255.0F * var32 * var42);
                  int var45 = this.vuuuNvNuv() ? VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(5.0F * var33 * var42)) : this.C00OOC00oO(var33 * var42);
                  float var46 = (1.0F - var42) * 8.0F * var27;
                  float var47 = var38 + var46;
                  if (!var36 && !this.UuuNnUvUuv() && !this.nUUVuvU()) {
                     var1.UuUVuuUu(var39, var47, var29, var29, 6.0F * var28, var45);
                  } else {
                     this.C00OOC00oO(var1, var39, var47, var29, var29, 6.0F * var28, var32 * var42);
                  }

                  class_1661 var48 = c0oOOCcCoC0.field_1724.method_31548();
                  class_1799 var49 = var41.UuUVuuUu.startsWith("ft_potion_") ? var41.nuUnNvnuUu : null;
                  int var50 = 0;
                  int var51 = 0;

                  for (int var52 = var48.method_5439(); var51 < var52; var51++) {
                     class_1799 var53 = var48.method_5438(var51);
                     if (!var53.method_7960() && var41.UuUVuuUu(var53)) {
                        var50 += var53.method_7947();
                        if (var49 == null) {
                           var49 = var53;
                        }
                     }
                  }

                  if (var49 == null) {
                     var49 = var41.nuUnNvnuUu;
                  }

                  if (this.nNnVnUNVV.uUnuvNvvNU()) {
                     var51 = this.nuUnNvnuUu(var32 * var42);
                     var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var39 + 4.0F * var26, var47 + 12.0F * var27, 16.0F * var28, var41.vVvUvVVuuNvV, var51);
                  }

                  float var81 = 1.3F * var28;
                  float var82 = 16.0F * var81;
                  float var83 = var39 + (var29 - var82) / 2.0F;
                  float var54 = var47 + (var29 - var82) / 2.0F;
                  String var55 = String.valueOf(var50);
                  int var56 = var50 > 0 ? VnVnuUn.uUnuvNvvNU(200, 200, 200, var44) : VnVnuUn.uUnuvNvvNU(255, 60, 60, var44);
                  float var57 = (this.nNnVnUNVV.uUnuvNvvNU() ? 18.0F : 23.0F) * var28;
                  float var58 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var55, var57).UuUVuuUu;
                  float var59 = this.nNnVnUNVV.uUnuvNvvNU() ? 4.0F : 5.0F;
                  long var60 = vnVNuNUUvVNu.UuUVuuUu(var41.C00OOC00oO);
                  String var62 = var60 > 0L ? UuUVuuUu(var60) : "";
                  float var63 = UuUVuuUu(var62, 20.0F * var28, var29 - 6.0F * var26, var28);
                  float var64 = var62.isEmpty() ? 0.0F : vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var62, var63);
                  this.vvUVNVvvNUv
                     .add(
                        new o0cOOccooCc0.NVnVnNnN(
                           var49,
                           var39,
                           var47,
                           var29,
                           6.0F * var28,
                           var83,
                           var54,
                           var81,
                           var32 * var42,
                           var39 + var29 - var58 - 4.0F * var26,
                           var47 + var29 - var59 * var27,
                           var57,
                           var55,
                           var56,
                           var62,
                           var39 + (var29 - var64) * 0.5F,
                           var47 + var29 * 0.5F + 5.0F * var28,
                           var63,
                           VnVnuUn.UuUVuuUu(this.VVuuUN(var32 * var42), var44)
                        )
                     );
                  var39 += var29 * var42;
               }
            }

            var1.uUnuvNvvNU();

            for (int var72 = 0; var72 < this.vvUVNVvvNUv.size(); var72++) {
               o0cOOccooCc0.NVnVnNnN var74 = this.vvUVNVvvNUv.get(var72);
               if (var74.alpha >= 0.35F) {
                  NuNvVUuUUnun.UuUVuuUu(var1, var74.stack, var74.itemX, var74.itemY, var74.itemScale, var72, false, 0);
               }
            }

            var1.uUnuvNvvNU();
            boolean var73 = false;

            for (int var75 = 0; var75 < this.vvUVNVvvNUv.size(); var75++) {
               if (this.vvUVNVvvNUv.get(var75).hasCooldown()) {
                  var73 = true;
                  break;
               }
            }

            if (var73) {
               var1.UuUVuuUu(18.0F);

               for (o0cOOccooCc0.NVnVnNnN var78 : this.vvUVNVvvNUv) {
                  if (var78.hasCooldown()) {
                     var1.UuUVuuUu(var78.slotX, var78.slotY, var78.slotSize, var78.slotSize, var78.slotRadius, var78.alpha);
                     var1.UuUVuuUu(
                        var78.slotX, var78.slotY, var78.slotSize, var78.slotSize, var78.slotRadius, VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(116.0F * var78.alpha))
                     );
                  }
               }
            }

            for (o0cOOccooCc0.NVnVnNnN var79 : this.vvUVNVvvNUv) {
               if (var79.hasCooldown()) {
                  int var43 = VnVnuUn.uUnuvNvvNU(0, 0, 0, (int)(130.0F * var79.alpha));
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var79.cooldownX + 1.0F, var79.cooldownY + 1.0F, var79.cooldownFont, var79.cooldown, var43);
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var79.cooldownX, var79.cooldownY, var79.cooldownFont, var79.cooldown, var79.cooldownColor);
               } else {
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var79.countX, var79.countY, var79.countFont, var79.count, var79.countColor);
               }
            }

            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
            nNuUNVu.UuUVuuUu().UuUVuuUu(var21);
            UuUuVnVvnvn.UuUVuuUu(var1, this, var21, nNuUNVu.UuUVuuUu(), c0oOOCcCoC0.method_22683().method_4486(), c0oOOCcCoC0.method_22683().method_4502());
         }
      }
   }

   private static String UuUVuuUu(long var0) {
      int var2 = Math.max(1, (int)Math.ceil(var0 / 1000.0));
      return var2 + "сек";
   }

   private static float UuUVuuUu(String var0, float var1, float var2, float var3) {
      if (var0 != null && !var0.isEmpty()) {
         float var4 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var0, var1);
         return var4 <= var2 ? var1 : Math.max(12.0F * var3, var1 * var2 / Math.max(1.0F, var4));
      } else {
         return var1;
      }
   }

   record NVnVnNnN(
      class_1799 stack,
      float slotX,
      float slotY,
      float slotSize,
      float slotRadius,
      float itemX,
      float itemY,
      float itemScale,
      float alpha,
      float countX,
      float countY,
      float countFont,
      String count,
      int countColor,
      String cooldown,
      float cooldownX,
      float cooldownY,
      float cooldownFont,
      int cooldownColor
   ) {

      boolean hasCooldown() {
         return this.cooldown != null && !this.cooldown.isEmpty();
      }
   }

   static class nvnNNunvv {
      final String UuUVuuUu;
      final class_1792 C00OOC00oO;
      final Predicate<class_1799> uUnuvNvvNU;
      final String vVvUvVVuuNvV;
      final boolean uNNnnnuuuN;
      final class_1799 nuUnNvnuUu;

      nvnNNunvv(String var1, class_1792 var2, Predicate<class_1799> var3, String var4, boolean var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = o0cOOccooCc0.vuvnUnVnUNnV.computeIfAbsent(var2, class_1799::new);
      }

      boolean UuUVuuUu(class_1799 var1) {
         try {
            return this.uUnuvNvvNU.test(var1);
         } catch (Throwable var3) {
            return false;
         }
      }
   }
}
