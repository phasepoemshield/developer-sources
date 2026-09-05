package ru.metaculture.protection;

import java.util.ArrayList;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_476;
import net.minecraft.class_490;
import net.minecraft.class_742;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Arrows",
   C00OOC00oO = "Показывает игроков через стрелочки",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Arrows extends Module {
   private static final class_2960 NuunnvnN = class_2960.method_60655("wild", "textures/arrows/arrows.png");
   public static final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Показ дистанции", true);
   public static final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Показ игроков с бронёй", true);
   public static final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Выделять таргета", true);
   public static final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Анимировать", true);
   public static final nNUuNvVn NnUuNNU = new nNUuNvVn("Размер", 10.0F, 1.0F, 100.0F, 1.0F, false);
   public static final nNUuNvVn nNvNUVU = new nNUuNvVn("Дистанция от центра", 150.0F, 80.0F, 300.0F, 5.0F, false);
   public static final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Сортировка по дистанции", false);
   public static final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Только друзья", false);
   public static final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Мерцать", true).UuUVuuUu(() -> !NVNnnvnuunNv.uUnuvNvvNU());
   public static class_1309 c0oOOCcCoC0;
   public ArrayList<Arrows.NVnVnNnN> VVnVNnunVvu = new ArrayList<>();
   public ArrayList<Arrows.nvnNNunvv> unNNVVNnvvV = new ArrayList<>();

   public Arrows() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU, UnUNuUU, uUVuVvuNUvnu, UvUvUNuvNU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (AttackAura.ccOO0COcoco0 != null) {
            c0oOOCcCoC0 = AttackAura.ccOO0COcoco0;
         }

         if (c0oOOCcCoC0 != null && (!c0oOOCcCoC0.method_5805() || !uUnuvNvvNU.field_1687.method_18456().contains(c0oOOCcCoC0))) {
            c0oOOCcCoC0 = null;
         }

         if (uUnuvNvvNU.field_1687.method_18456() != null) {
            for (class_1297 var3 : uUnuvNvvNU.field_1687.method_18456()) {
               if (var3 != null && var3 != uUnuvNvvNU.field_1724) {
                  boolean var4 = false;

                  for (Arrows.NVnVnNnN var6 : this.VVnVNnunVvu) {
                     if (var6.C00OOC00oO == var3) {
                        var4 = true;
                        break;
                     }
                  }

                  if (!var4) {
                     this.VVnVNnunVvu.add(new Arrows.NVnVnNnN(var3));
                  }
               }
            }
         }

         for (Arrows.NVnVnNnN var13 : this.VVnVNnunVvu) {
            var13.UuUVuuUu(var1.vVvUvVVuuNvV());
         }

         this.VVnVNnunVvu.removeIf(var0 -> var0.UuUVuuUu.nuUnNvnuUu() != uununU.FORWARDS && var0.UuUVuuUu.uVUuuVnNVU() == 0.0F);
         NnNvunvnU var12 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
            ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NnNvunvnU.class)
            : null;
         if (UNnVVNvvnVvU.uUnuvNvvNU() && var12 != null && var12.NnUuNNU.uUnuvNvvNU() && var12.nuUnNvnuUu) {
            String var14 = vUUvvNUVNvNU.UuUVuuUu();
            ArrayList var16 = new ArrayList();

            for (vUUvvNUVNvNU.nvnNNunvv var20 : vUUvvNUVNvNU.vVvUvVVuuNvV.values()) {
               if (var20.C00OOC00oO.equals(var14)) {
                  var16.add(var20.UuUVuuUu);
               }
            }

            if (NnNvunvnU.UnUNuUU != null && !NnNvunvnU.UnUNuUU.isEmpty() && !var16.contains(NnNvunvnU.UnUNuUU)) {
               var16.add(NnNvunvnU.UnUNuUU);
            }

            for (String var21 : var16) {
               boolean var7 = uUnuvNvvNU.field_1687
                  .method_18456()
                  .stream()
                  .anyMatch(var1x -> var1x.method_5477().getString().equalsIgnoreCase(var21) && var1x != uUnuvNvvNU.field_1724);
               if (!var7) {
                  boolean var8 = false;

                  for (Arrows.nvnNNunvv var10 : this.unNNVVNnvvV) {
                     if (var10.C00OOC00oO.equalsIgnoreCase(var21)) {
                        var8 = true;
                        break;
                     }
                  }

                  if (!var8) {
                     this.unNNVVNnvvV.add(new Arrows.nvnNNunvv(var21));
                  }
               }
            }
         }

         for (Arrows.nvnNNunvv var17 : this.unNNVVNnvvV) {
            var17.UuUVuuUu(var1.vVvUvVVuuNvV());
         }

         this.unNNVVNnvvV.removeIf(var0 -> var0.UuUVuuUu.nuUnNvnuUu() != uununU.FORWARDS && var0.UuUVuuUu.uVUuuVnNVU() == 0.0F);
      }
   }

   static int UuuNnUvUuv() {
      if (uUnuvNvvNU != null && uUnuvNvvNU.method_1531() != null) {
         class_1044 var0 = uUnuvNvvNU.method_1531().method_4619(NuunnvnN);
         if (var0 == null) {
            return -1;
         } else if (var0.method_68004() instanceof class_10868 var2) {
            int var3 = var2.method_68427();
            return var3 > 0 ? var3 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   static int UuUVuuUu(int var0, int var1) {
      return VnVnuUn.uNNnnnuuuN(var0 | 0xFF000000, var1);
   }

   static float UuUVuuUu(String var0) {
      return -UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var0, 20.0F).UuUVuuUu / 2.0F;
   }

   static double UuUVuuUu(double var0) {
      return !UnUNuUU.uUnuvNvvNU() ? 0.0 : Math.min(nNvNUVU.vVvUvVVuuNvV * 0.85, Math.max(0.0, var0 * 0.65));
   }

   public static class NVnVnNnN {
      UUVVvUvuNNn UuUVuuUu = new VUnvnVNv(300, 1.0);
      class_1297 C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;

      public NVnVnNnN(class_1297 var1) {
         this.C00OOC00oO = var1;
      }

      public void UuUVuuUu() {
         if (Module.uUnuvNvvNU.field_1687 != null && Module.uUnuvNvvNU.field_1724 != null) {
            boolean var1 = Module.uUnuvNvvNU.field_1687.method_18456().contains(this.C00OOC00oO);
            boolean var2 = this.C00OOC00oO.method_5805();
            boolean var3 = this.C00OOC00oO == Module.uUnuvNvvNU.field_1724;
            boolean var4 = var1 && var2 && !var3;
            if (var4 && Arrows.uUVuVvuNUvnu.uUnuvNvvNU()) {
               var4 = this.C00OOC00oO instanceof class_1657 var5 && uNvUVUNvuUVV.UuUVuuUu(var5.method_5477().getString());
            }

            if (var4 && Arrows.uVunuUNVVUUV.uUnuvNvvNU() && this.C00OOC00oO instanceof class_1657 var14) {
               boolean var16 = false;
               class_1304[] var7 = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};

               for (class_1304 var11 : var7) {
                  class_1799 var12 = var14.method_6118(var11);
                  if (var12 != null && !var12.method_7960()) {
                     String var13 = var12.method_7909().toString().toUpperCase();
                     if (var13.contains("DIAMOND") || var13.contains("NETHERITE")) {
                        var16 = true;
                        break;
                     }
                  }
               }

               if (!var16) {
                  var4 = false;
               }
            }

            this.UuUVuuUu.C00OOC00oO(var4 ? uununU.FORWARDS : uununU.BACKWARDS);
         }
      }

      public void UuUVuuUu(UnVNvNnU var1) {
         this.UuUVuuUu();
         UnVnUVUUUVvn var2 = new UnVnUVUUUVvn(Module.uUnuvNvvNU);
         float[] var3 = UNnnNuVnu.C00OOC00oO();
         float var4 = var3[0];
         float var5 = var3[1];
         if (Arrows.uNnUnnuNUnNu.uUnuvNvvNU()) {
            this.vVvUvVVuuNvV = UuvVnuU.nvUVNnuu(this.vVvUvVVuuNvV, var5 * 10.0F, 5.0F);
            this.uNNnnnuuuN = UuvVnuU.nvUVNnuu(this.uNNnnnuuuN, var4 * 10.0F, 5.0F);
         } else {
            this.vVvUvVVuuNvV = 0.0F;
            this.uNNnnnuuuN = 0.0F;
         }

         float var6 = NNvvnnunn.UuUVuuUu ? Module.uUnuvNvvNU.field_1773.method_19418().method_19330() : NNvvnnunn.uUnuvNvvNU;
         this.nuUnNvnuUu = UuvVnuU.nvUVNnuu(this.nuUnNvnuUu, var6, 10.0F);
         boolean var7 = Arrows.UNnVVNvvnVvU.uUnuvNvvNU() && Arrows.c0oOOCcCoC0 != null && this.C00OOC00oO.equals(Arrows.c0oOOCcCoC0);
         if (!var7 && Arrows.UNnVVNvvnVvU.uUnuvNvvNU()) {
            NnNvunvnU var8 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
               ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NnNvunvnU.class)
               : null;
            if (var8 != null && var8.NnUuNNU.uUnuvNvvNU() && var8.nuUnNvnuUu) {
               String var9 = this.C00OOC00oO.method_5477().getString();
               String var10 = vUUvvNUVNvNU.UuUVuuUu();

               for (vUUvvNUVNvNU.nvnNNunvv var12 : vUUvvNUVNvNU.vVvUvVVuuNvV.values()) {
                  if (var12.C00OOC00oO.equals(var10) && var12.UuUVuuUu.equals(var9)) {
                     var7 = true;
                     break;
                  }
               }

               if (NnNvunvnU.UnUNuUU != null && NnNvunvnU.UnUNuUU.equals(var9)) {
                  var7 = true;
               }
            }
         }

         float var43 = var7 ? 1.5F : 1.0F;
         float var44 = this.UuUVuuUu.uVUuuVnNVU() * (Arrows.nNvNUVU.vVvUvVVuuNvV * var43);
         if (Module.uUnuvNvvNU.field_1755 instanceof class_476) {
            var44 += 200.0F;
         }

         if (Module.uUnuvNvvNU.field_1755 instanceof class_490) {
            var44 += 180.0F;
         }

         if (Arrows.uNnUnnuNUnNu.uUnuvNvvNU()
               && (C00OOC00oO() || Module.uUnuvNvvNU.field_1724.method_18276() || Module.uUnuvNvvNU.field_1724.method_5681())
            || Module.uUnuvNvvNU.field_1755 instanceof class_408) {
            var44 += 90.0F;
         }

         this.uUnuvNvvNU = Arrows.uNnUnnuNUnNu.uUnuvNvvNU() ? UuvVnuU.nvUVNnuu(this.uUnuvNvvNU, var44, 6.0F) : var44;
         double var45 = this.C00OOC00oO.field_6014
            + (this.C00OOC00oO.method_23317() - this.C00OOC00oO.field_6014) * Module.uUnuvNvvNU.field_1773.method_19418().method_55437()
            - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1352;
         double var46 = this.C00OOC00oO.field_6036
            + (this.C00OOC00oO.method_23318() - this.C00OOC00oO.field_6036) * Module.uUnuvNvvNU.field_1773.method_19418().method_55437()
            + this.C00OOC00oO.method_17682() / 2.0F
            - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1351
            - Module.uUnuvNvvNU.field_1724.method_18381(Module.uUnuvNvvNU.field_1724.method_18376());
         double var14 = this.C00OOC00oO.field_5969
            + (this.C00OOC00oO.method_23321() - this.C00OOC00oO.field_5969) * Module.uUnuvNvvNU.field_1773.method_19418().method_55437()
            - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1350;
         double var16 = Math.sqrt(var45 * var45 + var46 * var46 + var14 * var14);
         double var18 = class_3532.method_15362((float)(this.nuUnNvnuUu * (Math.PI / 180.0)));
         double var20 = class_3532.method_15374((float)(this.nuUnNvnuUu * (Math.PI / 180.0)));
         double var22 = -(var14 * var18 - var45 * var20);
         double var24 = -(var45 * var18 + var14 * var20);
         double var26 = Math.atan2(var22, var24) * 180.0 / Math.PI;
         double var28 = this.uUnuvNvvNU + Arrows.UuUVuuUu(var16) * this.UuUVuuUu.uVUuuVnNVU();
         double var30 = Math.min(1.0, var16 / 20.0);
         double var32 = var28 * class_3532.method_15362((float)Math.toRadians(var26)) + var2.uUnuvNvvNU();
         double var34 = var28 * class_3532.method_15374((float)Math.toRadians(var26)) + var2.vVvUvVVuuNvV();
         var32 += this.vVvUvVVuuNvV;
         var34 += this.uNNnnnuuuN + var30;
         int var36 = Arrows.UuuNnUvUuv();
         if (var36 > 0) {
            int var37;
            if (var7) {
               var37 = VnVnuUn.UuUVuuUu;
            } else if (this.C00OOC00oO instanceof class_742 var38 && uNvUVUNvuUVV.UuUVuuUu(var38.method_5820())) {
               var37 = VnVnuUn.C00OOC00oO;
            } else {
               var37 = VnVnuUn.UuUVuuUu();
            }

            int var49 = (int)(this.UuUVuuUu.uVUuuVnNVU() * 255.0F);
            if (Arrows.NVNnnvnuunNv.uUnuvNvvNU() && Arrows.UvUvUNuvNU.uUnuvNvvNU() && var16 > 50.0) {
               long var50 = System.currentTimeMillis() % 5000L;
               if (var50 > 2500L) {
                  var49 = 0;
               }
            }

            if (var49 > 5) {
               var1.UuUVuuUu((float)var32, (float)var34);
               var1.C00OOC00oO((float)(var26 + 90.0));
               float var51 = Arrows.NnUuNNU.vVvUvVVuuNvV * 2.0F;
               var1.UuUVuuUu(var36, -var51 / 2.0F, -var51 / 2.0F, var51, var51, Arrows.UuUVuuUu(var37, var49), false);
               var1.vNUvnnVnUvu();
               if (Arrows.NVNnnvnuunNv.uUnuvNvvNU()) {
                  String var40;
                  if (var16 > 100.0) {
                     var40 = "100+";
                  } else {
                     var40 = (int)var16 + "m";
                  }

                  float var41 = Arrows.UuUVuuUu(var40);
                  float var42 = Arrows.NnUuNNU.vVvUvVVuuNvV + 8.0F;
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var41, var42, 20.0F, var40, VnVnuUn.uUnuvNvvNU(255, 255, 255, var49));
               }

               var1.vNUvnnVnUvu();
            }
         }
      }

      public static boolean C00OOC00oO() {
         float[] var0 = UNnnNuVnu.C00OOC00oO();
         return var0[0] != 0.0F || var0[1] != 0.0F;
      }
   }

   public static class nvnNNunvv {
      UUVVvUvuNNn UuUVuuUu = new VUnvnVNv(300, 1.0);
      String C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;

      public nvnNNunvv(String var1) {
         this.C00OOC00oO = var1;
      }

      public void UuUVuuUu(UnVNvNnU var1) {
         String var2 = vUUvvNUVNvNU.UuUVuuUu();
         double var3 = 0.0;
         double var5 = 0.0;
         double var7 = 0.0;
         boolean var9 = false;
         long var10 = 0L;

         for (vUUvvNUVNvNU.nvnNNunvv var13 : vUUvvNUVNvNU.vVvUvVVuuNvV.values()) {
            if (var13.UuUVuuUu.equalsIgnoreCase(this.C00OOC00oO) && var13.C00OOC00oO.equals(var2)) {
               long var14 = System.currentTimeMillis() - var13.uVUuuVnNVU;
               double var16 = class_3532.method_15350(var14 / 200.0, 0.0, 1.0);
               var3 = class_3532.method_16436(var16, var13.nuUnNvnuUu, var13.uUnuvNvvNU);
               var5 = class_3532.method_16436(var16, var13.VVuuUN, var13.vVvUvVVuuNvV);
               var7 = class_3532.method_16436(var16, var13.vNUvnnVnUvu, var13.uNNnnnuuuN);
               var10 = var13.uVUuuVnNVU;
               var9 = true;
               break;
            }
         }

         if (!var9 && this.C00OOC00oO.equalsIgnoreCase(NnNvunvnU.UnUNuUU)) {
            var3 = NnNvunvnU.uUVuVvuNUvnu;
            var5 = NnNvunvnU.UvUvUNuvNU;
            var7 = NnNvunvnU.c0oOOCcCoC0;
            var10 = System.currentTimeMillis();
            var9 = true;
         }

         long var55 = System.currentTimeMillis() - var10;
         boolean var56 = var9 && (var55 < 4000L || this.C00OOC00oO.equalsIgnoreCase(NnNvunvnU.UnUNuUU));
         this.UuUVuuUu.C00OOC00oO(var56 ? uununU.FORWARDS : uununU.BACKWARDS);
         if (this.UuUVuuUu.uVUuuVnNVU() != 0.0F) {
            UnVnUVUUUVvn var15 = new UnVnUVUUUVvn(Module.uUnuvNvvNU);
            float[] var57 = UNnnNuVnu.C00OOC00oO();
            float var17 = var57[0];
            float var18 = var57[1];
            if (Arrows.uNnUnnuNUnNu.uUnuvNvvNU()) {
               this.vVvUvVVuuNvV = UuvVnuU.nvUVNnuu(this.vVvUvVVuuNvV, var18 * 10.0F, 5.0F);
               this.uNNnnnuuuN = UuvVnuU.nvUVNnuu(this.uNNnnnuuuN, var17 * 10.0F, 5.0F);
            } else {
               this.vVvUvVVuuNvV = 0.0F;
               this.uNNnnnuuuN = 0.0F;
            }

            float var19 = NNvvnnunn.UuUVuuUu ? Module.uUnuvNvvNU.field_1773.method_19418().method_19330() : NNvvnnunn.uUnuvNvvNU;
            this.nuUnNvnuUu = UuvVnuU.nvUVNnuu(this.nuUnNvnuUu, var19, 10.0F);
            float var20 = 1.5F;
            float var21 = this.UuUVuuUu.uVUuuVnNVU() * (Arrows.nNvNUVU.vVvUvVVuuNvV * var20);
            if (Module.uUnuvNvvNU.field_1755 instanceof class_476) {
               var21 += 200.0F;
            }

            if (Module.uUnuvNvvNU.field_1755 instanceof class_490) {
               var21 += 180.0F;
            }

            if (Arrows.uNnUnnuNUnNu.uUnuvNvvNU()
                  && (Arrows.NVnVnNnN.C00OOC00oO() || Module.uUnuvNvvNU.field_1724.method_18276() || Module.uUnuvNvvNU.field_1724.method_5681())
               || Module.uUnuvNvvNU.field_1755 instanceof class_408) {
               var21 += 90.0F;
            }

            this.uUnuvNvvNU = Arrows.uNnUnnuNUnNu.uUnuvNvvNU() ? UuvVnuU.nvUVNnuu(this.uUnuvNvvNU, var21, 6.0F) : var21;
            double var22 = var3 - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1352;
            double var24 = var5
               + 1.0
               - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1351
               - Module.uUnuvNvvNU.field_1724.method_18381(Module.uUnuvNvvNU.field_1724.method_18376());
            double var26 = var7 - Module.uUnuvNvvNU.field_1773.method_19418().method_19326().field_1350;
            double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
            double var30 = class_3532.method_15362((float)(this.nuUnNvnuUu * (Math.PI / 180.0)));
            double var32 = class_3532.method_15374((float)(this.nuUnNvnuUu * (Math.PI / 180.0)));
            double var34 = -(var26 * var30 - var22 * var32);
            double var36 = -(var22 * var30 + var26 * var32);
            double var38 = Math.atan2(var34, var36) * 180.0 / Math.PI;
            double var40 = this.uUnuvNvvNU + Arrows.UuUVuuUu(var28) * this.UuUVuuUu.uVUuuVnNVU();
            double var42 = Math.min(1.0, var28 / 20.0);
            double var44 = var40 * class_3532.method_15362((float)Math.toRadians(var38)) + var15.uUnuvNvvNU();
            double var46 = var40 * class_3532.method_15374((float)Math.toRadians(var38)) + var15.vVvUvVVuuNvV();
            var44 += this.vVvUvVVuuNvV;
            var46 += this.uNNnnnuuuN + var42;
            int var48 = Arrows.UuuNnUvUuv();
            if (var48 > 0) {
               int var49 = VnVnuUn.UuUVuuUu;
               int var50 = (int)(this.UuUVuuUu.uVUuuVnNVU() * 255.0F);
               if (var55 > 3000L && !this.C00OOC00oO.equalsIgnoreCase(NnNvunvnU.UnUNuUU)) {
                  float var51 = 1.0F - (float)(var55 - 3000L) / 1000.0F;
                  var50 = (int)(var50 * class_3532.method_15363(var51, 0.0F, 1.0F));
               }

               if (Arrows.NVNnnvnuunNv.uUnuvNvvNU() && Arrows.UvUvUNuvNU.uUnuvNvvNU() && var28 > 50.0) {
                  long var60 = System.currentTimeMillis() % 5000L;
                  if (var60 > 2500L) {
                     var50 = 0;
                  }
               }

               if (var50 > 5) {
                  var1.UuUVuuUu((float)var44, (float)var46);
                  var1.C00OOC00oO((float)(var38 + 90.0));
                  float var61 = Arrows.NnUuNNU.vVvUvVVuuNvV * 2.0F;
                  var1.UuUVuuUu(var48, -var61 / 2.0F, -var61 / 2.0F, var61, var61, Arrows.UuUVuuUu(var49, var50), false);
                  var1.vNUvnnVnUvu();
                  if (Arrows.NVNnnvnuunNv.uUnuvNvvNU()) {
                     String var52 = var28 > 300.0 ? "300+" : (int)var28 + "m";
                     float var53 = Arrows.UuUVuuUu(var52);
                     float var54 = Arrows.NnUuNNU.vVvUvVVuuNvV + 8.0F;
                     var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var53, var54, 20.0F, var52, VnVnuUn.uUnuvNvvNU(255, 255, 255, var50));
                  }

                  var1.vNUvnnVnUvu();
               }
            }
         }
      }
   }
}
