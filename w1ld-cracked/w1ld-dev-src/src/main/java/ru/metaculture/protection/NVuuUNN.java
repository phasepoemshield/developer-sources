package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.class_1044;
import net.minecraft.class_1074;
import net.minecraft.class_10868;
import net.minecraft.class_1291;
import net.minecraft.class_1292;
import net.minecraft.class_1293;
import net.minecraft.class_1799;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_4081;

@vuUuvvvNnVV(
   UuUVuuUu = "PotionsHUD",
   C00OOC00oO = "w"
)
public final class NVuuUNN extends nnvNuuNvvuu {
   private static final NVuuUNN UuUVuuUu = new NVuuUNN();
   private static final class_310 c0oOOCcCoC0 = class_310.method_1551();
   private static final List<NVuuUNN.VvunVVUvUNnv> VVnVNnunVvu = new ArrayList<>();
   private static final List<NVuuUNN.VvunVVUvUNnv> unNNVVNnvvV = new ArrayList<>(16);
   private static final class_1293[] NuunnvnN = new class_1293[8];
   private static final VVnnnnN NVUunUNUN = new VVnnnnN();
   private static final VVnnnnN UUVNuUNUvUnV = new VVnnnnN();
   private static final VVnnnnN vuvnUnVnUNnV = new VVnnnnN();
   private static final Set<String> nnuUVNUuvvVU = new HashSet<>();
   private static final Set<class_1293> nVVUuvuNnUN = new HashSet<>();
   private static final List<class_1293> nNnVnUNVV = new ArrayList<>();
   private final UvNnUnuNUUU nuunNvv = new UvNnUnuNUUU("Вид", "Капсулы", "Капсулы", "Список");
   private final vvNnnUNnVvn uUVVvVVNvvn = new vvNnnUNnVvn("Показывать верхушку", true).UuUVuuUu(() -> this.nuunNvv.C00OOC00oO("Капсулы"));
   private final vvNnnUNnVvn vvUVNVvvNUv = new vvNnnUNnVvn("Показывать иконку", true).UuUVuuUu(() -> this.nuunNvv.C00OOC00oO("Капсулы"));
   private final vvNnnUNnVvn UuNnnVnuNNV = new vvNnnUNnVvn("Скрыть бесконечные", false);
   private final vvNnnUNnVvn uUVvnUuNvvN = new vvNnnUNnVvn("Кастомные зелья", true);
   private final vvNnnUNnVvn UUuUnNVNuuv = new vvNnnUNnVvn("Шкала времени", false);
   private static final List<NVuuUNN.NVnVnNnN> NVuNUuVnVUN = List.of(
      new NVuuUNN.NVnVnNnN(
         "custom:hlopushka", "Хлопушка", false, "minecraft:slowness", 9, "minecraft:speed", 4, "minecraft:blindness", 9, "minecraft:glowing", 0
      ),
      new NVuuUNN.NVnVnNnN("custom:holy_water", "Святая Вода", false, "minecraft:regeneration", 2, "minecraft:invisibility", 1),
      new NVuuUNN.NVnVnNnN("custom:gnev", "Зелье Гнева", false, "minecraft:strength", 4, "minecraft:slowness", 3),
      new NVuuUNN.NVnVnNnN(
         "custom:paladin",
         "Зелье Палладина",
         false,
         "minecraft:resistance",
         0,
         "minecraft:fire_resistance",
         0,
         "minecraft:invisibility",
         0,
         "minecraft:health_boost",
         2
      ),
      new NVuuUNN.NVnVnNnN("custom:assassin", "Зелье Ассасина", false, "minecraft:strength", 3, "minecraft:speed", 2, "minecraft:haste", 0),
      new NVuuUNN.NVnVnNnN(
         "custom:radiation",
         "Зелье Радиации",
         true,
         "minecraft:poison",
         1,
         "minecraft:wither",
         1,
         "minecraft:slowness",
         2,
         "minecraft:hunger",
         4,
         "minecraft:glowing",
         0
      ),
      new NVuuUNN.NVnVnNnN(
         "custom:snotvornoye", "Снотворное", true, "minecraft:weakness", 1, "minecraft:mining_fatigue", 1, "minecraft:wither", 2, "minecraft:blindness", 0
      )
   );

   private NVuuUNN() {
      this.UuUVuuUu(this.nuunNvv);
      this.UuUVuuUu(this.uUVVvVVNvvn);
      this.UuUVuuUu(this.vvUVNVvvNUv);
      this.UuUVuuUu(this.UuNnnVnuNNV);
      this.UuUVuuUu(this.uUVvnUuNvvN);
      this.UuUVuuUu(this.UUuUnNVNuuv);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static void UuUVuuUu(uvUUuvnunU var0) {
      if (var0 != null && !var0.uUnuvNvvNU() && c0oOOCcCoC0.field_1724 != null) {
         if (var0.vVvUvVVuuNvV() instanceof class_2724 || var0.vVvUvVVuuNvV() instanceof class_2678) {
            VVnVNnunVvu.clear();
         }
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   public static NVuuUNN C00OOC00oO() {
      return UuUVuuUu;
   }

   public void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (c0oOOCcCoC0.field_1724 != null) {
         this.UvnvNVnnnnNU();
         unNNVVNnvvV.clear();
         boolean var3 = this.UuNnnVnuNNV.uUnuvNvvNU();
         boolean var4 = false;

         for (NVuuUNN.VvunVVUvUNnv var6 : VVnVNnunVvu) {
            if (!var3 || !var6.C00OOC00oO()) {
               unNNVVNnvvV.add(var6);
               if (var6.vuuuNvNuv.uNNnnnuuuN() > 0.01F) {
                  var4 = true;
               }
            }
         }

         boolean var29 = !var4 && !(c0oOOCcCoC0.field_1755 instanceof class_408);
         boolean var30 = !var29;
         NVUunUNUN.UuUVuuUu();
         NVUunUNUN.UuUVuuUu(var30 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var7 = NVUunUNUN.uNNnnnuuuN();
         if (!(var7 <= 0.01F)) {
            boolean var8 = this.nuunNvv.uUnuvNvvNU().equals("Капсулы");
            boolean var9 = Hud.nUUVuvU();
            unUuuVVuNnNN.NVnVnNnN var10 = var9 ? unUuuVVuNnNN.uUnuvNvvNU() : null;
            float var11 = 0.0F;
            float var12 = 0.0F;
            if (var8) {
               float var13 = 18.0F;
               float var14 = 14.0F;
               float var15 = var9 ? Math.max(28.0F, var10.nvUVNnuu + 14.0F) : 36.0F;
               float var16 = var9 ? var10.vNUvnnVnUvu : 7.0F;
               float var17 = var15 - var16 * 2.0F;
               float var18 = var17 + 4.0F;
               float var19 = var9 ? var10.uVUuuVnNVU : 5.0F;
               float var20 = var9 ? var10.uVUuuVnNVU : 5.0F;

               for (NVuuUNN.VvunVVUvUNnv var22 : unNNVVNnvvV) {
                  float var23 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22.uUnuvNvvNU(), var13).UuUVuuUu;
                  float var24 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22.vVvUvVVuuNvV(), var14).UuUVuuUu;
                  float var25 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var22.uNNnnnuuuN(), var13).UuUVuuUu;
                  float var26 = var23 + (var24 > 0.0F ? var24 + 8.0F : 0.0F) + 16.0F;
                  float var27 = var25 + 16.0F;
                  float var28 = var16 * 2.0F + var18 + var19 + var26 + var19 + var27;
                  if (var28 > var11) {
                     var11 = var28;
                  }

                  var12 += (var15 + var20) * var22.vuuuNvNuv.uNNnnnuuuN();
               }

               if (var12 > 0.0F) {
                  var12 -= var20;
               }
            } else {
               float var31 = 24.0F;
               float var33 = var9 ? var10.vNUvnnVnUvu : 7.0F;
               float var35 = this.uUVVvVVNvvn.uUnuvNvvNU() ? (var9 ? var10.vuuuNvNuv : 32.0F) : 0.0F;
               float var37 = var9 ? var10.nvUVNnuu : 22.0F;
               float var39 = var9 ? var10.uVUuuVnNVU : 5.0F;
               float var40 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "Potions", var9 ? var10.UuuNnUvUuv : 28.0F).UuUVuuUu;
               float var41 = var40 + 22.0F + (var9 ? var10.nUUVuvU : 24.0F);
               float var42 = 0.0F;
               float var43 = 0.0F;

               for (NVuuUNN.VvunVVUvUNnv var46 : unNNVVNnvvV) {
                  String var48 = var46.uUnuvNvvNU() + (var46.vVvUvVVuuNvV().isEmpty() ? "" : " " + var46.vVvUvVVuuNvV());
                  var42 = Math.max(var42, vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var48, var31).UuUVuuUu);
                  var43 = Math.max(var43, vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var46.uNNnnnuuuN(), var31).UuUVuuUu);
               }

               float var45 = this.vvUVNVvvNUv.uUnuvNvvNU() ? 22.0F : 0.0F;
               float var47 = var42 + var45 + 24.0F;
               float var49 = var43 + 20.0F + (var9 ? var10.UnUNVVVNuv : 0.0F);
               float var50 = var47 + var39 + var49;
               var11 = var50 + var33 * 2.0F;
               if (this.uUVVvVVNvvn.uUnuvNvvNU()) {
                  var11 = Math.max(var11, var41 + var33 * 2.0F);
               }

               float var51 = 0.0F;

               for (NVuuUNN.VvunVVUvUNnv var53 : unNNVVNnvvV) {
                  var51 += var37 * var53.vuuuNvNuv.uNNnnnuuuN();
               }

               var12 = var33 + var35 + (this.uUVVvVVNvvn.uUnuvNvvNU() && var51 > 0.01F ? var39 : 0.0F) + var51 + var33;
               if (unNNVVNnvvV.isEmpty() && this.uUVVvVVNvvn.uUnuvNvvNU()) {
                  var12 = var33 + var35 + var33;
               }
            }

            UUVNuUNUvUnV.UuUVuuUu();
            vuvnUnVnUNnV.UuUVuuUu();
            UUVNuUNUvUnV.UuUVuuUu(var11, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            vuvnUnVnUNnV.UuUVuuUu(var12, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var32 = UUVNuUNUvUnV.uNNnnnuuuN();
            float var34 = vuvnUnVnUNnV.uNNnnnuuuN();
            float var36 = c0oOOCcCoC0.method_22683().method_4489();
            nNuUNVu.nvnNNunvv var38 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_Potions", Math.max(10.0F, var36 - var32 - 10.0F), 70.0F, var32, var34);
            if (var8) {
               this.UuUVuuUu(var1, var2, var38, unNNVVNnvvV, var7, var32);
            } else {
               this.UuUVuuUu(var1, var2, var38, unNNVVNnvvV, var7, var32, var34);
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, nNuUNVu.nvnNNunvv var3, List<NVuuUNN.VvunVVUvUNnv> var4, float var5, float var6) {
      float var7 = var3.C00OOC00oO;
      float var8 = var3.uUnuvNvvNU;
      float var9 = var3.vVvUvVVuuNvV;
      float var10 = var9 / Math.max(1.0F, var6);
      boolean var11 = Hud.nUUVuvU();
      unUuuVVuNnNN.NVnVnNnN var12 = var11 ? unUuuVVuNnNN.uUnuvNvvNU() : null;
      this.UuUVuuUu(var7, var8, var9, Math.max(36.0F * var10, var3.uNNnnnuuuN));
      float var13 = (var11 ? Math.max(28.0F, var12.nvUVNnuu + 14.0F) : 36.0F) * var10;
      float var14 = (var11 ? var12.vNUvnnVnUvu : 7.0F) * var10;
      float var15 = var13 - var14 * 2.0F;
      float var16 = var15 + 4.0F * var10;
      float var17 = (var11 ? var12.uVUuuVnNVU : 5.0F) * var10;
      float var18 = (var11 ? var12.uVUuuVnNVU : 5.0F) * var10;
      float var19 = 18.0F * var10;
      float var20 = 14.0F * var10;
      float var21 = var5 * this.uVunuUNVVUUV.uUnuvNvvNU();
      int var22 = this.UuUVuuUu(var21);
      int var23 = this.uUnuvNvvNU(var21);
      int var24 = this.vVvUvVVuuNvV(var21);
      int var25 = this.uNNnnnuuuN(var21);
      int var26 = VnVnuUn.uUnuvNvvNU(130, 130, 130, (int)(255.0F * var21));
      int var27 = VnVnuUn.uUnuvNvvNU(145, 160, 255, (int)(255.0F * var21));
      int var28 = VnVnuUn.uUnuvNvvNU(255, 77, 77, (int)(255.0F * var21));
      float var29 = (var11 ? var12.UuUVuuUu : 11.0F) * var10;
      float var30 = (var11 ? var12.VVuuUN : 8.0F) * var10;
      float var31 = (var11 ? var12.vVvUvVVuuNvV : 6.0F) * var10;
      float var32 = (var11 ? var12.uNNnnnuuuN : 8.0F) * var10;

      for (NVuuUNN.VvunVVUvUNnv var34 : var4) {
         float var35 = Math.max(0.0F, Math.min(1.0F, var34.vuuuNvNuv.uNNnnnuuuN()));
         if (!(var35 <= 0.01F)) {
            float var36 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var34.uUnuvNvvNU(), var19).UuUVuuUu;
            float var37 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var34.vVvUvVVuuNvV(), var20).UuUVuuUu;
            float var38 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var34.uNNnnnuuuN(), var19).UuUVuuUu;
            float var39 = var36 + (var37 > 0.0F ? var37 + 8.0F * var10 : 0.0F) + 16.0F * var10;
            float var40 = var38 + 16.0F * var10;
            float var41 = var14 * 2.0F + var16 + var17 + var39 + var17 + var40;
            float var42 = var34.uVUuuVnNVU();
            int var43 = (int)(255.0F * var21 * var35 * var42);
            int var44 = VnVnuUn.UuUVuuUu(var22, (int)((var22 >> 24 & 0xFF) * var35));
            int var45 = VnVnuUn.UuUVuuUu(var23, (int)((var23 >> 24 & 0xFF) * var35));
            int var46 = VnVnuUn.UuUVuuUu(var34.nuUnNvnuUu() ? var28 : var25, var43);
            int var47 = VnVnuUn.UuUVuuUu(var26, var43);
            int var48 = VnVnuUn.UuUVuuUu(var27, var43);
            float var49 = (1.0F - var35) * 8.0F * var10;
            float var50 = var7 - var49;
            this.UuUVuuUu(var1, var50, var8, var41, var13, var29, var21 * var35);
            float var51 = var50 + var14;
            float var52 = var8 + var14;
            float var53 = var52 + var15 / 2.0F + 3.5F * var10;
            if (this.nvUVNnuu()) {
               this.C00OOC00oO(var1, var51, var52, var16, var15, var30, var21 * var35);
            } else {
               var1.UuUVuuUu(var51, var52, var16, var15, var30, 4.0F, 4.0F, var30, var45);
            }

            if (var34.uUnuvNvvNU) {
               this.UuUVuuUu(var1, var34.uUnuvNvvNU(), var51, var52, var16, var15, var30, 0.7F);
            } else {
               int var54 = UuUVuuUu(var34.C00OOC00oO);
               if (var54 > 0) {
                  float var55 = 18.0F * var10;
                  float var56 = var51 + (var16 - var55) / 2.0F;
                  float var57 = var52 + (var15 - var55) / 2.0F;
                  var1.uNNnnnuuuN(var21 * var35 * var42);
                  var1.UuUVuuUu(var54, var56, var57, var55, var55, 0.0F, 0.0F, 1.0F, 1.0F);
                  var1.vuuuNvNuv();
               } else {
                  float var61 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "j", 18.0F * var10).UuUVuuUu;
                  var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var51 + (var16 - var61) / 2.0F, var52 + var15 / 2.0F + 5.0F * var10, 18.0F * var10, "j", var46);
               }
            }

            var51 += var16 + var17;
            if (this.nvUVNnuu()) {
               this.C00OOC00oO(var1, var51, var52, var39, var15, var31, var21 * var35);
            } else {
               var1.UuUVuuUu(var51, var52, var39, var15, var11 ? var31 : 4.0F, var45);
            }

            float var60 = var51 + 10.0F * var10;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60, var53, var19, var34.uUnuvNvvNU(), var46);
            if (var37 > 0.0F) {
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60 + var36 + 8.0F * var10, var53, var20, var34.vVvUvVVuuNvV(), var47);
            }

            var51 += var39 + var17;
            if (this.nvUVNnuu()) {
               this.C00OOC00oO(var1, var51, var52, var40, var15, var32, var21 * var35);
            } else {
               var1.UuUVuuUu(var51, var52, var40, var15, 4.0F, var32, var32, 4.0F, var45);
            }

            if (this.UUuUnNVNuuv.uUnuvNvvNU() && !var34.C00OOC00oO()) {
               float var62 = var34.VVuuUN();
               if (var62 > 0.001F) {
                  float var63 = Math.max(3.0F * var10, var40 * var62);
                  int var64 = VnVnuUn.UuUVuuUu(var34.nuUnNvnuUu() ? var28 : var27, (int)(60.0F * var21 * var35));
                  var1.UuUVuuUu(var51, var52, var40, var15, 4.0F, var32, var32, 4.0F);
                  var1.UuUVuuUu(var51, var52, var63, var15, 0.0F, var64);
                  var1.nuUnNvnuUu();
               }
            }

            var34.UuuNnUvUuv.UuUVuuUu(var34.uNNnnnuuuN(), var34.vNUvnnVnUvu());
            var34.UuuNnUvUuv
               .UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var51, var52, var40, var15, Math.min(var32, var15 * 0.5F), var51 + var40 * 0.5F, var53, var19, var48);
            var8 += (var13 + var18) * var35;
         }
      }

      nNuUNVu.UuUVuuUu().UuUVuuUu(var3);
      UuUuVnVvnvn.UuUVuuUu(var1, this, var3, nNuUNVu.UuUVuuUu(), c0oOOCcCoC0.method_22683().method_4486(), c0oOOCcCoC0.method_22683().method_4502());
   }

   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, nNuUNVu.nvnNNunvv var3, List<NVuuUNN.VvunVVUvUNnv> var4, float var5, float var6, float var7) {
      float var8 = var3.C00OOC00oO;
      float var9 = var3.uUnuvNvvNU;
      float var10 = var3.vVvUvVVuuNvV;
      float var11 = var3.uNNnnnuuuN;
      this.UuUVuuUu(var8, var9, var10, var11);
      float var12 = var10 / Math.max(1.0F, var6);
      float var13 = var11 / Math.max(1.0F, var7);
      float var14 = Math.min(var12, var13);
      boolean var15 = Hud.nUUVuvU();
      unUuuVVuNnNN.NVnVnNnN var16 = var15 ? unUuuVVuNnNN.uUnuvNvvNU() : null;
      float var17 = (var15 ? var16.vNUvnnVnUvu : 7.0F) * var12;
      float var18 = (var15 ? var16.vNUvnnVnUvu : 7.0F) * var13;
      float var19 = this.uUVVvVVNvvn.uUnuvNvvNU() ? (var15 ? var16.vuuuNvNuv : 32.0F) * var13 : 0.0F;
      float var20 = (var15 ? var16.nvUVNnuu : 22.0F) * var13;
      float var21 = (var15 ? var16.uVUuuVnNVU : 5.0F) * var12;
      float var22 = (var15 ? var16.uVUuuVnNVU : 5.0F) * var13;
      float var23 = 24.0F * var14;
      boolean var24 = this.vvUVNVvvNUv.uUnuvNvvNU();
      float var25 = var24 ? 22.0F : 0.0F;
      float var26 = 0.0F;
      float var27 = 0.0F;

      for (NVuuUNN.VvunVVUvUNnv var29 : var4) {
         String var30 = var29.uUnuvNvvNU() + (var29.vVvUvVVuuNvV().isEmpty() ? "" : " " + var29.vVvUvVVuuNvV());
         var26 = Math.max(var26, vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var30, 24.0F).UuUVuuUu);
         var27 = Math.max(var27, vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var29.uNNnnnuuuN(), 24.0F).UuUVuuUu);
      }

      float var68 = (var26 + var25 + 24.0F) * var12;
      float var69 = (var27 + 20.0F + (var15 ? var16.UnUNVVVNuv : 0.0F)) * var12;
      float var70 = var68 + var21 + var69;
      float var31 = var10 - var17 * 2.0F;
      if (var31 > var70) {
         var68 = var31 - var21 - var69;
      }

      float var32 = var5 * this.uVunuUNVVUUV.uUnuvNvvNU();
      int var33 = this.C00OOC00oO(var32);
      int var34 = this.uUnuvNvvNU(var32);
      int var35 = this.uNNnnnuuuN(var32);
      int var36 = this.vNUvnnVnUvu(var32);
      float var37 = var15 ? var16.UuUVuuUu : 14.0F;
      float var38 = var15 ? var16.C00OOC00oO : 11.0F;
      float var39 = var15 ? var16.uUnuvNvvNU : 7.0F;
      float var40 = var15 ? var16.vVvUvVVuuNvV : var39;
      float var41 = var15 ? var16.uNNnnnuuuN : var39;
      this.UuUVuuUu(var1, var8, var9, var10, var11, var37, var32);
      if (this.uUVVvVVNvvn.uUnuvNvvNU()) {
         if (this.nvUVNnuu()) {
            this.UuUVuuUu(var1, var8 + var17, var9 + var18, var31, var19, var38, var32);
         } else if (var15) {
            var1.UuUVuuUu(var8 + var17, var9 + var18, var31, var19, var38, var33);
         } else {
            var1.UuUVuuUu(var8 + var17, var9 + var18, var31, var19, 11.0F, 11.0F, 4.0F, 4.0F, var33);
         }

         float var42 = var15 ? var8 + var16.UvnvNVnnnnNU.UuUVuuUu * var12 : var8 + var17 + 10.0F * var12;
         float var43 = var15 ? var9 + var16.UvnvNVnnnnNU.C00OOC00oO * var13 : var9 + var18 + var19 / 2.0F + 6.0F * var13;
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var42, var43, (var15 ? var16.UuuNnUvUuv : 28.0F) * var14, "Potions", var35);
         float var44 = 22.0F * var13;
         float var45 = var8 + var17 + var31 - 10.0F * var12 - var44;
         float var46 = var9 + var18 + (var19 - var44) / 2.0F;
         float var47 = (var15 ? var16.nUUVuvU : 24.0F) * var14;
         float var48 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "t", var47).UuUVuuUu;
         float var49 = var15 ? (var16.uVUVnuvnuVuv.uUnuvNvvNU ? var8 + var10 : var8) + var16.uVUVnuvnuVuv.UuUVuuUu * var12 : var45 + (var44 - var48) / 2.0F;
         float var50 = var15 ? var9 + var16.uVUVnuvnuVuv.C00OOC00oO * var13 : var46 + var44 / 2.0F + 5.5F * var13;
         var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var49, var50, var47, "t", var36);
      }

      float var71 = var9 + var18 + var19 + (this.uUVVvVVNvvn.uUnuvNvvNU() ? var22 : 0.0F);
      float var72 = var8 + var17 + (var15 ? var16.NVNnnvnuunNv.UuUVuuUu * var12 : 0.0F);
      float var73 = var71 + (var15 ? var16.NVNnnvnuunNv.C00OOC00oO * var13 : 0.0F);
      float var74 = var8 + var17 + var68 + var21 + (var15 ? var16.uVunuUNVVUUV.UuUVuuUu * var12 : 0.0F);
      float var75 = var71 + (var15 ? var16.uVunuUNVVUUV.C00OOC00oO * var13 : 0.0F);
      float var76 = 0.0F;

      for (NVuuUNN.VvunVVUvUNnv var79 : var4) {
         var76 += var20 * var79.vuuuNvNuv.uNNnnnuuuN();
      }

      if (var76 > 0.01F && this.vNUvnnVnUvu()) {
         if (this.nvUVNnuu()) {
            this.C00OOC00oO(var1, var72, var73, var68, var76, var40, var32);
            this.C00OOC00oO(var1, var74, var75, var69, var76, var41, var32);
         } else if (var15) {
            var1.UuUVuuUu(var72, var73, var68, var76, var40, var34);
            var1.UuUVuuUu(var74, var75, var69, var76, var41, var34);
         } else {
            var1.UuUVuuUu(var72, var73, var68, var76, 4.0F, 4.0F, 4.0F, 11.0F, var34);
            var1.UuUVuuUu(var74, var75, var69, var76, 4.0F, 4.0F, 11.0F, 4.0F, var34);
         }
      }

      var1.UuUVuuUu(var8, var9, var10, var11, var37, var37, var37, var37);
      float var78 = var73;
      float var80 = var75;

      for (NVuuUNN.VvunVVUvUNnv var51 : var4) {
         float var52 = var51.vuuuNvNuv.uNNnnnuuuN();
         if (!(var52 <= 0.01F)) {
            float var53 = var51.uVUuuVnNVU();
            int var54 = (int)(255.0F * var32 * var52 * var53);
            int var55 = VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), var54);
            int var56 = VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(1.0F), var54);
            if (var51.nuUnNvnuUu()) {
               var55 = VnVnuUn.uUnuvNvvNU(255, 85, 85, var54);
               var56 = VnVnuUn.uUnuvNvvNU(255, 120, 120, var54);
            }

            float var57 = (1.0F - var52) * 8.0F * var12;
            float var58 = var72 + 10.0F * var12 - var57;
            if (!var15 || var16.vNVuvnUUnuUn > 0.05F) {
               float var59 = var15 ? var16.vNVuvnUUnuUn * var12 : 1.9F * var12;
               var1.UuUVuuUu(var58, var78 + (var20 - 8.0F * var13) / 2.0F, var59, 8.0F * var13, Math.max(0.7F, var59 * 0.5F), var56);
            }

            var58 += 8.0F * var12;
            if (var24) {
               float var83 = 14.0F * var14;
               float var60 = var78 + (var20 - var83) * 0.5F;
               this.UuUVuuUu(var1, var51, var58, var60, var83, var32 * var52 * var53, var55);
               var58 += var83 + 6.0F * var12;
            }

            String var84 = var51.uUnuvNvvNU() + (var51.vVvUvVVuuNvV().isEmpty() ? "" : " " + var51.vVvUvVVuuNvV());
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var58, var78 + var20 / 2.0F + 4.0F * var13, var23, var84, var55);
            if (this.UUuUnNVNuuv.uUnuvNvvNU() && !var51.C00OOC00oO()) {
               float var85 = var51.VVuuUN();
               if (var85 > 0.001F) {
                  float var61 = Math.max(2.0F, var20 - 6.0F * var13);
                  float var62 = Math.max(1.0F, var69 - 6.0F * var12);
                  float var63 = Math.max(3.0F * var12, var62 * var85);
                  float var64 = var74 + 3.0F * var12 + var57;
                  float var65 = var80 + (var20 - var61) * 0.5F;
                  float var66 = var61 * 0.4F;
                  int var67 = VnVnuUn.UuUVuuUu(var56, (int)(VnVnuUn.UuUVuuUu(var56) * 0.22F));
                  var1.UuUVuuUu(var64, var65, var62, var61, var66, var66, var66, var66);
                  var1.UuUVuuUu(var64, var65, var63, var61, 0.0F, var67);
                  var1.nuUnNvnuUu();
               }
            }

            var51.UuuNnUvUuv.UuUVuuUu(var51.uNNnnnuuuN(), var51.vNUvnnVnUvu());
            var51.UuuNnUvUuv
               .UuUVuuUu(
                  var1,
                  vNvnnVvvVUu.UuUVuuUu,
                  var74,
                  var80,
                  var69,
                  var20,
                  Math.min(var41, var20 * 0.5F),
                  var74 + var69 * 0.5F + var57,
                  var80 + var20 / 2.0F + 4.0F * var13,
                  var23,
                  var56
               );
            var78 += var20 * var52;
            var80 += var20 * var52;
         }
      }

      var1.nuUnNvnuUu();
      nNuUNVu.UuUVuuUu().UuUVuuUu(var3);
      UuUuVnVvnvn.UuUVuuUu(var1, this, var3, nNuUNVu.UuUVuuUu(), c0oOOCcCoC0.method_22683().method_4486(), c0oOOCcCoC0.method_22683().method_4502());
   }

   private void UuUVuuUu(UnVNvNnU var1, NVuuUNN.VvunVVUvUNnv var2, float var3, float var4, float var5, float var6, int var7) {
      if (var2.uUnuvNvvNU) {
         this.UuUVuuUu(var1, var2.uUnuvNvvNU(), var3, var4, var5, var5, var5 * 0.25F, 1.0F);
      } else {
         int var8 = UuUVuuUu(var2.C00OOC00oO);
         if (var8 > 0) {
            var1.uNNnnnuuuN(var6);
            var1.UuUVuuUu(var8, var3, var4, var5, var5, 0.0F, 0.0F, 1.0F, 1.0F);
            var1.vuuuNvNuv();
         } else {
            float var9 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "j", var5).UuUVuuUu;
            var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var3 + (var5 - var9) * 0.5F, var4 + var5 * 0.5F + var5 * 0.28F, var5, "j", var7);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      class_1799 var9 = VnuunNV.UuUVuuUu(var2);
      if (var9 != null && !var9.method_7960() && !(var5 <= 0.0F) && !(var6 <= 0.0F)) {
         float var10 = Math.max(1.0F, Math.min(var5, var6) * var8);
         float var11 = NuNvVUuUUnun.uUnuvNvvNU(var10 / 16.0F);
         float var12 = 16.0F * var11;
         float var13 = NuNvVUuUUnun.UuUVuuUu(var3);
         float var14 = NuNvVUuUUnun.UuUVuuUu(var4);
         float var15 = Math.max(1.0F, NuNvVUuUUnun.UuUVuuUu(var5));
         float var16 = Math.max(1.0F, NuNvVUuUUnun.UuUVuuUu(var6));
         float var17 = NuNvVUuUUnun.UuUVuuUu(var13 + (var15 - var12) * 0.5F);
         float var18 = NuNvVUuUUnun.UuUVuuUu(var14 + (var16 - var12) * 0.5F);
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(var13, var14, var15, var16, var7, var7, var7, var7);

         try {
            NuNvVUuUUnun.UuUVuuUu(var1, var9, var17, var18, var11, 0, false, 0);
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }

   private static int UuUVuuUu(class_2960 var0) {
      if (c0oOOCcCoC0 != null && c0oOOCcCoC0.method_1531() != null) {
         class_1044 var1 = c0oOOCcCoC0.method_1531().method_4619(var0);
         return var1 != null && var1.method_68004() instanceof class_10868 var2 ? var2.method_68427() : -1;
      } else {
         return -1;
      }
   }

   private void UvnvNVnnnnNU() {
      if (c0oOOCcCoC0.field_1724 != null) {
         nnuUVNUuvvVU.clear();
         nVVUuvuNnUN.clear();
         nNnVnUNVV.clear();

         for (class_1293 var2 : c0oOOCcCoC0.field_1724.method_6026()) {
            if (!Removals.UuUVuuUu(var2.method_5579())) {
               nNnVnUNVV.add(var2);
            }
         }

         boolean var12 = c0oOOCcCoC0.field_1755 instanceof class_408;
         if (var12 && nNnVnUNVV.isEmpty()) {
            nnuUVNUuvvVU.add("minecraft:fire_resistance");
            C00OOC00oO("minecraft:fire_resistance", class_1074.method_4662("effect.minecraft.fire_resistance", new Object[0]), 1, 8000, false);
            nnuUVNUuvvVU.add("minecraft:strength");
            C00OOC00oO("minecraft:strength", class_1074.method_4662("effect.minecraft.strength", new Object[0]), 3, 2380, false);
            nnuUVNUuvvVU.add("minecraft:poison");
            C00OOC00oO("minecraft:poison", class_1074.method_4662("effect.minecraft.poison", new Object[0]), 2, 240, true);
         }

         if (this.uUVvnUuNvvN.uUnuvNvvNU()) {
            for (NVuuUNN.NVnVnNnN var3 : NVuNUuVnVUN) {
               boolean var4 = true;
               int var5 = 0;

               for (NVuuUNN.nvnNNunvv var7 : var3.reqs()) {
                  class_1293 var8 = null;
                  int var9 = 0;

                  for (int var10 = nNnVnUNVV.size(); var9 < var10; var9++) {
                     class_1293 var11 = nNnVnUNVV.get(var9);
                     if (var11.method_5579().method_55840().equals(var7.id()) && (var11.method_5578() == var7.amp() || var11.method_5578() == var7.amp() - 1)) {
                        var8 = var11;
                        break;
                     }
                  }

                  if (var8 == null) {
                     var4 = false;
                     break;
                  }

                  NuunnvnN[var5++] = var8;
               }

               if (var4) {
                  nnuUVNUuvvVU.add(var3.id());
                  int var19 = 0;

                  for (int var20 = 0; var20 < var5; var20++) {
                     class_1293 var21 = NuunnvnN[var20];
                     nVVUuvuNnUN.add(var21);
                     if (var21.method_5584() > var19) {
                        var19 = var21.method_5584();
                     }

                     NuunnvnN[var20] = null;
                  }

                  UuUVuuUu(var3.id(), var3.name(), 1, var19, var3.harmful());
               }
            }
         }

         for (class_1293 var16 : nNnVnUNVV) {
            if (!nVVUuvuNnUN.contains(var16)) {
               String var18 = var16.method_5579().method_55840();
               nnuUVNUuvvVU.add(var18);
               UuUVuuUu(var18, var16);
            }
         }

         for (NVuuUNN.VvunVVUvUNnv var17 : VVnVNnunVvu) {
            if (!nnuUVNUuvvVU.contains(var17.UuUVuuUu)) {
               var17.vuuuNvNuv.UuUVuuUu(0.0, 0.15F, VvVUUNUu.UnUNVVVNuv, true);
            }

            var17.vuuuNvNuv.UuUVuuUu();
         }

         VVnVNnunVvu.removeIf(var0 -> var0.vuuuNvNuv.uNNnnnuuuN() <= 0.01F && !nnuUVNUuvvVU.contains(var0.UuUVuuUu));
         VVnVNnunVvu.sort(Comparator.comparingInt(NVuuUNN.VvunVVUvUNnv::UuUVuuUu).reversed());
      }
   }

   private static void UuUVuuUu(String var0, String var1, int var2, int var3, boolean var4) {
      NVuuUNN.VvunVVUvUNnv var5 = vVvUvVVuuNvV(var0);
      if (var5 == null) {
         var5 = new NVuuUNN.VvunVVUvUNnv(var0);
         var5.uUnuvNvvNU = true;
         var5.vVvUvVVuuNvV = false;
         var5.uNNnnnuuuN = var1;
         var5.nuUnNvnuUu = var2;
         var5.vNUvnnVnUvu = var4;
         var5.VVuuUN = var3;
         var5.vuuuNvNuv.nuUnNvnuUu(0.0);
         var5.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
         VVnVNnunVvu.add(var5);
      } else {
         var5.uUnuvNvvNU = true;
         var5.vVvUvVVuuNvV = false;
         var5.VVuuUN = var3;
         var5.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, true);
      }
   }

   private static void C00OOC00oO(String var0, String var1, int var2, int var3, boolean var4) {
      NVuuUNN.VvunVVUvUNnv var5 = vVvUvVVuuNvV(var0);
      if (var5 == null) {
         var5 = new NVuuUNN.VvunVVUvUNnv(var0);
         var5.vuuuNvNuv.nuUnNvnuUu(0.0);
         var5.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
         VVnVNnunVvu.add(var5);
      } else {
         var5.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, true);
      }

      var5.uUnuvNvvNU = false;
      var5.vVvUvVVuuNvV = true;
      var5.uVUuuVnNVU = null;
      var5.uNNnnnuuuN = var1;
      var5.nuUnNvnuUu = var2;
      var5.VVuuUN = var3;
      var5.vNUvnnVnUvu = var4;
   }

   private static void UuUVuuUu(String var0, class_1293 var1) {
      NVuuUNN.VvunVVUvUNnv var2 = vVvUvVVuuNvV(var0);
      if (var2 == null) {
         var2 = new NVuuUNN.VvunVVUvUNnv(var0);
         var2.uUnuvNvvNU = false;
         var2.vVvUvVVuuNvV = false;
         var2.uVUuuVnNVU = var1;
         var2.vuuuNvNuv.nuUnNvnuUu(0.0);
         var2.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
         VVnVNnunVvu.add(var2);
      } else {
         var2.uUnuvNvvNU = false;
         var2.vVvUvVVuuNvV = false;
         var2.uVUuuVnNVU = var1;
         var2.vuuuNvNuv.UuUVuuUu(1.0, 0.15F, VvVUUNUu.UnUNVVVNuv, true);
      }
   }

   private static NVuuUNN.VvunVVUvUNnv vVvUvVVuuNvV(String var0) {
      for (NVuuUNN.VvunVVUvUNnv var2 : VVnVNnunVvu) {
         if (var2.UuUVuuUu.equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   static String uNNnnnuuuN(String var0) {
      return var0 != null && !var0.isEmpty()
         ? var0.replaceAll("(?i)\\u0412?\\u00A7[0-9A-FK-OR]", "").replace("§", "").replace("Â", "").replaceAll("\\p{Cntrl}", "").trim()
         : "";
   }

   record NVnVnNnN(String id, String name, boolean harmful, List<NVuuUNN.nvnNNunvv> reqs) {
      public NVnVnNnN(String var1, String var2, boolean var3, Object... var4) {
         this(var1, var2, var3, buildReqs(var4));
      }

      private static List<NVuuUNN.nvnNNunvv> buildReqs(Object[] var0) {
         ArrayList var1 = new ArrayList();

         for (byte var2 = 0; var2 < var0.length; var2 += 2) {
            var1.add(new NVuuUNN.nvnNNunvv((String)var0[var2], (Integer)var0[var2 + 1]));
         }

         return var1;
      }
   }

   static final class VvunVVUvUNnv {
      final String UuUVuuUu;
      final class_2960 C00OOC00oO;
      boolean uUnuvNvvNU;
      boolean vVvUvVVuuNvV;
      String uNNnnnuuuN;
      int nuUnNvnuUu = 1;
      int VVuuUN;
      boolean vNUvnnVnUvu;
      class_1293 uVUuuVnNVU;
      final VVnnnnN vuuuNvNuv = new VVnnnnN();
      private final VVnnnnN nvUVNnuu = new VVnnnnN();
      final VnuuvvUv UuuNnUvUuv = new VnuuvvUv();
      private int nUUVuvU;
      private String UnUNVVVNuv;
      private String vNVuvnUUnuUn;
      private int UvnvNVnnnnNU = Integer.MIN_VALUE;
      private String uVUVnuvnuVuv;
      private int NVNnnvnuunNv = Integer.MIN_VALUE;
      private boolean uVunuUNVVUUV;

      VvunVVUvUNnv(String var1) {
         this.UuUVuuUu = var1;
         int var2 = var1.indexOf(58);
         String var3 = var2 > 0 ? var1.substring(0, var2) : "minecraft";
         String var4 = var2 > 0 && var2 + 1 < var1.length() ? var1.substring(var2 + 1) : var1;
         this.C00OOC00oO = class_2960.method_60655(var3, "textures/mob_effect/" + var4 + ".png");
      }

      public int UuUVuuUu() {
         return !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null ? this.uVUuuVnNVU.method_5584() : this.VVuuUN;
      }

      public boolean C00OOC00oO() {
         return !this.uUnuvNvvNU && this.uVUuuVnNVU != null && this.uVUuuVnNVU.method_48559();
      }

      public String uUnuvNvvNU() {
         if (!this.vVvUvVVuuNvV && !this.uUnuvNvvNU) {
            if (this.UnUNVVVNuv == null) {
               this.UnUNVVVNuv = NVuuUNN.uNNnnnuuuN(class_1074.method_4662(this.uVUuuVnNVU.method_5586(), new Object[0]));
            }

            return this.UnUNVVVNuv;
         } else {
            return NVuuUNN.uNNnnnuuuN(this.uNNnnnuuuN);
         }
      }

      public String vVvUvVVuuNvV() {
         int var1 = !this.vVvUvVVuuNvV && !this.uUnuvNvvNU ? this.uVUuuVnNVU.method_5578() + 1 : this.nuUnNvnuUu;
         if (var1 == this.UvnvNVnnnnNU && this.vNVuvnUUnuUn != null) {
            return this.vNVuvnUUnuUn;
         } else {
            this.UvnvNVnnnnNU = var1;
            this.vNVuvnUUnuUn = var1 > 1 ? "lvl " + var1 : "";
            return this.vNVuvnUUnuUn;
         }
      }

      public String uNNnnnuuuN() {
         boolean var1 = !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null && this.uVUuuVnNVU.method_48559();
         int var2 = !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null ? this.uVUuuVnNVU.method_5584() : this.VVuuUN;
         int var3 = var1 ? Integer.MAX_VALUE : Math.max(0, var2 / 20);
         if (var3 == this.NVNnnvnuunNv && var1 == this.uVunuUNVVUUV && this.uVUVnuvnuVuv != null) {
            return this.uVUVnuvnuVuv;
         } else {
            this.NVNnnvnuunNv = var3;
            this.uVunuUNVVUUV = var1;
            if (var1) {
               String var4 = NVuuUNN.uNNnnnuuuN(class_1292.method_5577(this.uVUuuVnNVU, 1.0F, 20.0F).getString());
               this.uVUVnuvnuVuv = var4 != null && !var4.isEmpty() ? var4 : "∞";
            } else {
               this.uVUVnuvnuVuv = var3 / 60 + (var3 % 60 < 10 ? ":0" : ":") + var3 % 60;
            }

            return this.uVUVnuvnuVuv;
         }
      }

      public boolean nuUnNvnuUu() {
         if (this.vVvUvVVuuNvV) {
            return this.vNUvnnVnUvu;
         } else {
            return this.uUnuvNvvNU ? this.vNUvnnVnUvu : ((class_1291)this.uVUuuVnNVU.method_5579().comp_349()).method_18792() == class_4081.field_18272;
         }
      }

      public float VVuuUN() {
         this.nvUVNnuu.UuUVuuUu();
         int var1 = !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null ? this.uVUuuVnNVU.method_5584() : this.VVuuUN;
         if (var1 > this.nUUVuvU) {
            this.nUUVuvU = var1;
         }

         float var2 = this.nUUVuvU <= 0 ? 0.0F : Math.max(0.0F, Math.min(1.0F, (float)var1 / this.nUUVuvU));
         this.nvUVNnuu.UuUVuuUu(var2, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
         return this.nvUVNnuu.uNNnnnuuuN();
      }

      public int vNUvnnVnUvu() {
         return !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null ? this.uVUuuVnNVU.method_5584() : this.VVuuUN;
      }

      public float uVUuuVnNVU() {
         int var1 = !this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null ? this.uVUuuVnNVU.method_5584() : this.VVuuUN;
         if (!this.uUnuvNvvNU && !this.vVvUvVVuuNvV && this.uVUuuVnNVU != null && this.uVUuuVnNVU.method_48559()) {
            return 1.0F;
         } else {
            float var2 = Math.max(0.0F, var1 / 20.0F);
            if (var2 > 10.0F) {
               return 1.0F;
            } else {
               float var3 = 1.0F - var2 / 10.0F;
               float var4 = 0.8F + var3 * 4.2F;
               double var5 = System.currentTimeMillis() / 1000.0 * var4 * Math.PI * 2.0;
               return 0.68F + (float)((Math.sin(var5) + 1.0) * 0.5) * 0.32F;
            }
         }
      }
   }

   record nvnNNunvv(String id, int amp) {
   }
}
