package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;
import net.minecraft.class_1044;
import net.minecraft.class_1074;
import net.minecraft.class_10868;
import net.minecraft.class_124;
import net.minecraft.class_1293;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_408;
import net.minecraft.class_9334;

@vuUuvvvNnVV(
   UuUVuuUu = "Notifications",
   C00OOC00oO = "w"
)
public final class nuVVunNUnVnv extends nnvNuuNvvuu {
   public static final String UuUVuuUu = "Модули";
   public static final String c0oOOCcCoC0 = "Свап предметов";
   public static final String VVnVNnunVvu = "Эффекты";
   public static final String unNNVVNnvvV = "Низкое HP";
   public static final String NuunnvnN = "Предупреждения";
   public static final String NVUunUNUN = "Поломка брони";
   private static final nuVVunNUnVnv UUVNuUNUvUnV = new nuVVunNUnVnv();
   private static final List<nuVVunNUnVnv.NVnVnNnN> vuvnUnVnUNnV = new ArrayList<>();
   private static final Map<String, nuVVunNUnVnv.nvnNNunvv> nnuUVNUuvvVU = new HashMap<>();
   private static final VVnnnnN nVVUuvuNnUN = new VVnnnnN();
   private static final float nNnVnUNVV = 40.0F;
   private static final float nuunNvv = 22.0F;
   private static final float uUVVvVVNvvn = 28.0F;
   private static final float vvUVNVvvNUv = 8.0F;
   private static final int UuNnnVnuNNV = 5;
   private static final float uUVvnUuNvvN = 220.0F;
   private static final class_1304[] UUuUnNVNuuv = new class_1304[]{class_1304.field_6166, class_1304.field_6172, class_1304.field_6174, class_1304.field_6169};
   private static final int[] NVuNUuVnVUN = new int[]{100, 100, 100, 100};
   private static final class_1792[] NVuunNnvvvVu = new class_1792[4];
   private static final String vNnNuuvVn = "Свапнул на » ";
   private static final String VUuuVUnun = "Скоро сломается » ";
   private static final class_2960 vVVuuVVv = class_2960.method_60655("minecraft", "textures/gui/sprites/hud/heart/full.png");
   private static float VuunNUUUvu = Float.NaN;
   private static boolean NNUUNUuVNNVn;
   private final VUVnvvnNN VvVvnNUnvuvV = new VUVnvvnNN(
      "Показывать",
      new vvNnnUNnVvn("Модули", true),
      new vvNnnUNnVvn("Свап предметов", true),
      new vvNnnUNnVvn("Эффекты", true),
      new vvNnnUNnVvn("Низкое HP", true),
      new vvNnnUNnVvn("Предупреждения", true),
      new vvNnnUNnVvn("Поломка брони", true)
   );

   private nuVVunNUnVnv() {
      this.UuUVuuUu(this.VvVvnNUnvuvV);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static nuVVunNUnVnv C00OOC00oO() {
      return UUVNuUNUvUnV;
   }

   public static boolean vVvUvVVuuNvV(String var0) {
      return UUVNuUNUvUnV.VvVvnNUnvuvV.C00OOC00oO(var0);
   }

   public static void UvnvNVnnnnNU() {
      if (O000c0oocoo.a_.field_1724 != null && O000c0oocoo.a_.field_1687 != null) {
         if (vVvUvVVuuNvV("Эффекты")) {
            uVUVnuvnuVuv();
         } else {
            nnuUVNUuvvVU.clear();
         }

         if (vVvUvVVuuNvV("Низкое HP")) {
            UNnVVNvvnVvU();
         } else {
            NNUUNUuVNNVn = false;
         }

         if (vVvUvVVuuNvV("Поломка брони")) {
            NVNnnvnuunNv();
         } else {
            uVunuUNVVUUV();
         }
      } else {
         nnuUVNUuvvVU.clear();
         NNUUNUuVNNVn = false;
         uVunuUNVVUUV();
      }
   }

   public static void UuUVuuUu(String var0, String var1, long var2) {
      UuUVuuUu(var0, var1, var2, "Предупреждения");
   }

   public static void UuUVuuUu(String var0, String var1, long var2, String var4) {
      if (vVvUvVVuuNvV(var4)) {
         vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(var0, var1, var2));
      }
   }

   public static void UuUVuuUu(class_1799 var0, String var1, long var2) {
      if (vVvUvVVuuNvV("Свап предметов")) {
         String var4 = uNNnnnuuuN(var1);
         if ((var4 == null || var4.isEmpty()) && var0 != null && !var0.method_7960()) {
            var4 = uNNnnnuuuN(var0.method_7964().getString());
         }

         if (var4 == null || var4.isEmpty()) {
            var4 = "предмет";
         }

         int var5 = nuUnNvnuUu(var1);
         if (var5 == 0 && var0 != null && var0.method_57826(class_9334.field_49631)) {
            var5 = nuUnNvnuUu(var0.method_7964().getString());
         }

         String var6 = "Свапнул на » " + var4;
         if (var0 != null && !var0.method_7960()) {
            vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(var0.method_7972(), var6, "Свапнул на » ".length(), var5, var2));
         } else {
            nuVVunNUnVnv.NVnVnNnN var7 = new nuVVunNUnVnv.NVnVnNnN("i", var6, var2);
            var7.vNUvnnVnUvu = "Свапнул на » ".length();
            var7.uVUuuVnNVU = var5;
            vuvnUnVnUNnV.add(var7);
         }
      }
   }

   public static void UuUVuuUu(String var0, String var1) {
      if (vVvUvVVuuNvV("Эффекты")) {
         vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(VVuuUN(var0), var1 + " » Скоро закончится", 2200L));
      }
   }

   public static void C00OOC00oO(String var0, String var1) {
      if (vVvUvVVuuNvV("Эффекты")) {
         vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(VVuuUN(var0), "Истёк » " + var1, 2200L));
      }
   }

   public static void UuUVuuUu(class_1799 var0, int var1) {
      if (vVvUvVVuuNvV("Поломка брони") && var0 != null && !var0.method_7960()) {
         String var2 = "Скоро сломается » " + var1 + "%";
         int var3 = VnVnuUn.uUnuvNvvNU(255, 70, 70, 255);
         vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(var0.method_7972(), var2, "Скоро сломается » ".length(), var3, 2600L));
      }
   }

   public static void UuUVuuUu(String var0, boolean var1) {
      if (vVvUvVVuuNvV("Модули")) {
         for (nuVVunNUnVnv.NVnVnNnN var3 : vuvnUnVnUNnV) {
            if (var3.vVvUvVVuuNvV() && var3.nuUnNvnuUu().equals(var0)) {
               var3.C00OOC00oO(var1);
               var3.UuUVuuUu(System.currentTimeMillis());
               return;
            }
         }

         vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(var0, var1, 1000L));
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UUVNuUNUvUnV.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (O000c0oocoo.a_.field_1724 != null) {
         boolean var2 = O000c0oocoo.a_.field_1755 instanceof class_408;
         vuvnUnVnUNnV.removeIf(var0 -> {
            var0.vNVuvnUUnuUn().UuUVuuUu();
            return var0.uUnuvNvvNU() && var0.vNVuvnUUnuUn().uNNnnnuuuN() <= 0.01F;
         });
         nVVUuvuNnUN.UuUVuuUu();
         nVVUuvuNnUN.UuUVuuUu(vuvnUnVnUNnV.isEmpty() && var2 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var3 = nVVUuvuNnUN.uNNnnnuuuN();
         float var4 = 38.0F;
         float var5 = 5.0F;
         float var6 = 28.0F;
         if (vuvnUnVnUNnV.isEmpty()) {
            if (!(var3 <= 0.01F)) {
               String var23 = "Настройте позицию";
               float var24 = 24.0F;
               float var26 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, var24).UuUVuuUu;
               float var28 = var26 + 20.0F;
               int var30 = O000c0oocoo.a_.method_22683().method_4489();
               int var31 = O000c0oocoo.a_.method_22683().method_4506();
               float var32 = var31 / 2.0F + 140.0F;
               nNuUNVu.nvnNNunvv var33 = this.UuUVuuUu(var4, var4, var32, var30, var31);
               float var34 = VuunNUUUvu - var28 * 0.5F;
               float var35 = var33.uUnuvNvvNU;
               this.UuUVuuUu(var34, var35, var28, var4);
               float var36 = this.uVunuUNVVUUV.uUnuvNvvNU() * var3;
               int var37 = this.uNNnnnuuuN(var36);
               float var20 = 12.0F;
               this.UuUVuuUu(var1, var34, var35, var28, var4, var20, var36);
               String var21 = UuUVuuUu(var23, var24, Math.max(0.0F, var28 - 20.0F));
               float var22 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var21, var24).UuUVuuUu;
               var1.UuUVuuUu(var34, var35, Math.max(1.0F, var28), Math.max(1.0F, var4), var20, var20, var20, var20);
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var34 + (var28 - var22) / 2.0F, var35 + var4 / 2.0F + 3.0F, var24, var21, var37);
               var1.nuUnNvnuUu();
               nNuUNVu.UuUVuuUu().UuUVuuUu(var33);
               UuUuVnVvnvn.UuUVuuUu(
                  var1, this, var33, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
               );
            }
         } else {
            float var7 = 0.0F;
            float var8 = 0.0F;

            for (nuVVunNUnVnv.NVnVnNnN var10 : vuvnUnVnUNnV) {
               float var11 = UuUVuuUu(var10, var6);
               if (var11 > var7) {
                  var7 = var11;
               }

               var8 += (var4 + var5) * var10.vNVuvnUUnuUn().uNNnnnuuuN();
            }

            int var25 = O000c0oocoo.a_.method_22683().method_4489();
            int var27 = O000c0oocoo.a_.method_22683().method_4506();
            float var29 = var27 / 2.0F + 140.0F;
            nNuUNVu.nvnNNunvv var12 = this.UuUVuuUu(var8 > 0.0F ? var8 : var4, var4, var29, var25, var27);
            float var13 = var12.uUnuvNvvNU;
            this.UuUVuuUu(VuunNUUUvu - var7 * 0.5F, var13, var7, Math.max(var4, var12.uNNnnnuuuN));

            for (int var14 = vuvnUnVnUNnV.size() - 1; var14 >= 0; var14--) {
               nuVVunNUnVnv.NVnVnNnN var15 = vuvnUnVnUNnV.get(var14);
               boolean var16 = !var15.uUnuvNvvNU();
               var15.vNVuvnUUnuUn().UuUVuuUu(var16 ? 1.0 : 0.0, 0.24F, VvVUUNUu.UnUNVVVNuv, false);
               float var17 = var15.vNVuvnUUnuUn().uNNnnnuuuN();
               if (!(var17 <= 0.01F)) {
                  float var18 = UuUVuuUu(var15, var6);
                  float var19 = VuunNUUUvu - var18 * 0.5F;
                  this.UuUVuuUu(var1, var19, var13, var18, var4, var17, var15, var6);
                  var13 += (var4 + var5) * var17;
               }
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var12);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var12, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      }
   }

   private nNuUNVu.nvnNNunvv UuUVuuUu(float var1, float var2, float var3, int var4, int var5) {
      if (!Float.isFinite(VuunNUUUvu)) {
         nNuUNVu.VUnuUnnuNvVu var6 = nNuUNVu.UuUVuuUu().uNNnnnuuuN().get("HUD_Notifications");
         if (var6 != null && var4 > 0) {
            VuunNUUUvu = var6.nx() * var4 + 110.0F;
         } else {
            VuunNUUUvu = var4 * 0.5F;
         }
      }

      float var8 = VuunNUUUvu - 110.0F;
      nNuUNVu.nvnNNunvv var7 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_Notifications", var8, var3, 220.0F, var1 > 0.0F ? var1 : var2);
      VuunNUUUvu = var7.C00OOC00oO + var7.vVvUvVVuuNvV * 0.5F;
      return var7;
   }

   private static float UuUVuuUu(nuVVunNUnVnv.NVnVnNnN var0, float var1) {
      float var2 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var0.nuUnNvnuUu(), var1).UuUVuuUu;
      return var0.vVvUvVVuuNvV() ? var2 + 20.0F + 5.0F + 40.0F : var2 + 20.0F + 5.0F + 28.0F;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, nuVVunNUnVnv.NVnVnNnN var7, float var8) {
      float var9 = this.uVunuUNVVUUV.uUnuvNvvNU() * var6;
      int var10 = (int)(255.0F * var9);
      int var11 = this.UuUVuuUu(var9);
      int var12 = this.vVvUvVVuuNvV(var9);
      int var13 = this.uNNnnnuuuN(var9);
      int var14 = this.VVuuUN(var9);
      float var15 = 14.0F;
      float var16 = 0.8F + 0.2F * var6;
      var1.UuUVuuUu(var16, var2 + var4 / 2.0F, var3 + var5 / 2.0F);

      try {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var15, var9);
         var1.UuUVuuUu(var2, var3, Math.max(1.0F, var4), Math.max(1.0F, var5), var15, var15, var15, var15);

         try {
            if (var7.vVvUvVVuuNvV()) {
               var7.UvnvNVnnnnNU().UuUVuuUu();
               var7.UvnvNVnnnnNU().UuUVuuUu(var7.VVuuUN() ? 1.0 : 0.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
               float var17 = var7.UvnvNVnnnnNU().uNNnnnuuuN();
               float var18 = var2 + 10.0F;
               float var19 = var2 + var4 - 10.0F;
               float var20 = Math.max(0.0F, var19 - var18);
               float var21 = Math.min(40.0F, var20);
               float var22 = Math.min(22.0F, Math.max(8.0F, var5 - 8.0F));
               float var23 = var19 - var21;
               float var24 = var3 + var5 / 2.0F - var22 / 2.0F;
               if (var21 >= 8.0F) {
                  if (!this.UuuNnUvUuv() && !this.nUUVuvU()) {
                     if (!this.UuUVuuUu(var23, var24, var21, var22, var22 / 2.0F, true, var9, 2)) {
                        var1.UuUVuuUu(var23, var24, var21, var22, var22 / 2.0F, var11);
                     }
                  } else {
                     this.C00OOC00oO(var1, var23, var24, var21, var22, var22 / 2.0F, var9);
                  }

                  if (var17 > 0.01F) {
                     float var25 = 3.0F;
                     float var26 = Math.max(1.0F, var21 - var25 * 2.0F);
                     float var27 = Math.max(1.0F, var22 - var25 * 2.0F);
                     float var28 = Math.max(Math.min(var27, var26), var26 * var17);
                     float var29 = var27 / 2.0F;
                     var1.UuUVuuUu(var23 + var25, var24 + var25, var26, var27, var29, var29, var29, var29);
                     var1.C00OOC00oO(var23 + var25, var24 + var25, var28, var27, var29, this.vNUvnnVnUvu(var9), this.uVUuuVnNVU(var9));
                     var1.nuUnNvnuUu();
                  }

                  float var54 = Math.max(1.0F, Math.min(var22 - 4.0F, var21 - 4.0F) / 2.0F);
                  float var55 = var23 + 2.0F + var54 + Math.max(0.0F, var21 - var22) * var17;
                  float var57 = var24 + var22 / 2.0F;
                  boolean var59 = nNuUNVu.UuUVuuUu().uVUuuVnNVU()
                     && UuUVuuUu(nNuUNVu.UuUVuuUu().VVuuUN(), nNuUNVu.UuUVuuUu().vNUvnnVnUvu(), var23, var24, var21, var22);
                  if (!this.UuuNnUvUuv() && !this.nUUVuvU()) {
                     if (!this.UuUVuuUu(var55 - var54, var57 - var54, var54 * 2.0F, var54 * 2.0F, var54, var59, var9, var59 ? 2 : 1)) {
                        var1.C00OOC00oO(var55, var57, var54, 0.0F, 360.0F, VnVnuUn.uUnuvNvvNU(255, 255, 255, var10));
                     }
                  } else {
                     this.C00OOC00oO(var1, var55 - var54, var57 - var54, var54 * 2.0F, var54 * 2.0F, var54, var9);
                  }
               }

               float var56 = Math.max(0.0F, var23 - 5.0F - var18);
               String var58 = UuUVuuUu(var7.nuUnNvnuUu(), var8, var56);
               if (!var58.isEmpty()) {
                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var18, UuUVuuUu(var3, var5), var8, var58, var13);
               }
            } else {
               float var38 = var2 + 10.0F;
               float var39 = var3 + var5 * 0.5F;
               if (var7.UuUVuuUu()) {
                  float var42 = Math.max(0.65F, (var5 - 10.0F) / 20.0F);
                  float var46 = 16.0F * var42;
                  float var50 = var38 + (28.0F - var46) * 0.5F;
                  float var52 = var39 - var46 * 0.5F;
                  var1.uUnuvNvvNU();
                  NuNvVUuUUnun.UuUVuuUu(var1, var7.vNUvnnVnUvu(), var50, var52, var42, var7.uVUuuVnNVU(), false, 0);
               } else if (var7.C00OOC00oO()) {
                  float var41 = Math.max(14.0F, (var5 - 10.0F) * 0.62F);
                  float var45 = var38 + (28.0F - var41) * 0.5F;
                  float var49 = var39 - var41 * 0.5F;
                  UuUVuuUu(var1, var7.vuuuNvNuv(), var45, var49, var41, var9);
               } else {
                  int var40 = VnVnuUn.UuUVuuUu(var14, (int)(VnVnuUn.UuUVuuUu(var14) * var6));
                  String var44 = var7.uNNnnnuuuN();
                  float var48 = UuUVuuUu(var3, var5);
                  if (var44.contains("on")) {
                     var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var38, var48, 28.0F, "n", var40);
                  } else if (var44.contains("off")) {
                     var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var38, var48, 28.0F, "l", var40);
                  } else if (var44.contains("warn") || var44.contains("gg")) {
                     var1.UuUVuuUu(vNvnnVvvVUu.nuUnNvnuUu, var38, var48 - 2.0F, 24.0F, var44.contains("warn") ? "i" : "y", var40);
                  } else if (var44.contains("cfg")) {
                     var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var38, var48 - 2.0F, 22.0F, "G", var40);
                  } else {
                     var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var38, var48, 28.0F, var44, var40);
                  }
               }

               float var43 = var38 + 28.0F + 5.0F;
               float var47 = Math.max(0.0F, var2 + var4 - 10.0F - var43);
               String var51 = UuUVuuUu(var7.nuUnNvnuUu(), var8, var47);
               int var53 = Math.min(var7.nvUVNnuu(), var51.length());
               UuUVuuUu(var1, var43, UuUVuuUu(var3, var5), var8, var51, var13, var53, var7.UuuNnUvUuv(), var9);
            }
         } finally {
            var1.nuUnNvnuUu();
         }
      } finally {
         var1.vNUvnnVnUvu();
      }
   }

   private static float UuUVuuUu(float var0, float var1) {
      return var0 + var1 * 0.5F + 5.0F;
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, String var4, int var5, int var6, int var7, float var8) {
      if (var4 != null && !var4.isEmpty()) {
         if (var7 != 0 && var6 > 0 && var6 < var4.length()) {
            String var9 = var4.substring(0, var6);
            String var10 = var4.substring(var6);
            if (!var9.isEmpty()) {
               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1, var2, var3, var9, var5);
            }

            float var11 = var9.isEmpty() ? 0.0F : vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9, var3).UuUVuuUu;
            int var12 = VnVnuUn.UuUVuuUu(var7, Math.round(VnVnuUn.UuUVuuUu(var7) * var8));
            if (!var10.isEmpty()) {
               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1 + var11, var2, var3, var10, var12);
            }
         } else {
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1, var2, var3, var4, var5);
         }
      }
   }

   private static String UuUVuuUu(String var0, float var1, float var2) {
      if (var0 != null && !var0.isEmpty() && !(var2 <= 1.0F)) {
         if (vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var0, var1).UuUVuuUu <= var2) {
            return var0;
         } else {
            String var3 = "...";
            if (vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var1).UuUVuuUu > var2) {
               return "";
            } else {
               for (int var4 = var0.length(); var4 > 0; var4--) {
                  String var5 = var0.substring(0, var4).trim() + var3;
                  if (vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, var1).UuUVuuUu <= var2) {
                     return var5;
                  }
               }

               return var3;
            }
         }
      } else {
         return "";
      }
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   private static void uVUVnuvnuVuv() {
      HashSet var0 = new HashSet();

      for (class_1293 var2 : O000c0oocoo.a_.field_1724.method_6026()) {
         if (!Removals.UuUVuuUu(var2.method_5579())) {
            String var3 = var2.method_5579().method_55840();
            var0.add(var3);
            nuVVunNUnVnv.nvnNNunvv var4 = nnuUVNUuvvVU.computeIfAbsent(var3, var0x -> new nuVVunNUnVnv.nvnNNunvv());
            var4.UuUVuuUu = uNNnnnuuuN(class_1074.method_4662(var2.method_5586(), new Object[0]));
            if (var2.method_48559()) {
               var4.UuUVuuUu();
            } else {
               int var5 = Math.max(0, (int)Math.ceil(var2.method_5584() / 20.0));
               UuUVuuUu(var3, var4.UuUVuuUu, var5, var4);
            }
         }
      }

      Iterator var6 = nnuUVNUuvvVU.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         if (!var0.contains(var7.getKey())) {
            String var8 = ((nuVVunNUnVnv.nvnNNunvv)var7.getValue()).UuUVuuUu;
            if (var8 != null && !var8.isEmpty()) {
               C00OOC00oO((String)var7.getKey(), var8);
            }

            var6.remove();
         }
      }
   }

   private static void UuUVuuUu(String var0, String var1, int var2, nuVVunNUnVnv.nvnNNunvv var3) {
      if (var2 > 5) {
         var3.UuUVuuUu();
      } else {
         if (var2 >= 1 && !var3.C00OOC00oO) {
            var3.C00OOC00oO = true;
            UuUVuuUu(var0, var1);
         }
      }
   }

   private static void NVNnnvnuunNv() {
      for (int var0 = 0; var0 < UUuUnNVNuuv.length; var0++) {
         class_1799 var1 = O000c0oocoo.a_.field_1724.method_6118(UUuUnNVNuuv[var0]);
         if (var1 != null && !var1.method_7960() && var1.method_7963()) {
            if (NVuunNnvvvVu[var0] != var1.method_7909()) {
               NVuunNnvvvVu[var0] = var1.method_7909();
               NVuNUuVnVUN[var0] = 100;
            }

            int var2 = var1.method_7936();
            if (var2 > 0) {
               int var3 = var2 - var1.method_7919();
               int var4 = (int)Math.floor(var3 * 100.0 / var2);
               if (var4 > 30) {
                  NVuNUuVnVUN[var0] = 100;
               } else {
                  int var5 = var4 <= 10 ? 10 : (var4 <= 20 ? 20 : 30);
                  if (var5 < NVuNUuVnVUN[var0]) {
                     NVuNUuVnVUN[var0] = var5;
                     UuUVuuUu(var1, var4);
                  }
               }
            }
         } else {
            NVuNUuVnVUN[var0] = 100;
            NVuunNnvvvVu[var0] = null;
         }
      }
   }

   private static void uVunuUNVVUUV() {
      for (int var0 = 0; var0 < NVuNUuVnVUN.length; var0++) {
         NVuNUuVnVUN[var0] = 100;
         NVuunNnvvvVu[var0] = null;
      }
   }

   private static void UNnVVNvvnVvU() {
      float var0 = O000c0oocoo.a_.field_1724.method_6032() + O000c0oocoo.a_.field_1724.method_6067();
      if (var0 <= 8.0F && var0 > 0.0F && !NNUUNUuVNNVn) {
         if (vVvUvVVuuNvV("Низкое HP")) {
            vuvnUnVnUNnV.add(new nuVVunNUnVnv.NVnVnNnN(vVVuuVVv, "Низкое HP » " + String.format("%.1f", var0), 2500L));
         }

         NNUUNUuVNNVn = true;
      } else {
         if (var0 > 10.0F) {
            NNUUNUuVNNVn = false;
         }
      }
   }

   private static String uNNnnnuuuN(String var0) {
      return var0 != null && !var0.isEmpty() ? var0.replaceAll("(?i)\\u0412?\\u00A7[0-9A-FK-OR]", "").replace("§", "").replace(' ', ' ').trim() : "";
   }

   private static int nuUnNvnuUu(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         Integer var1 = null;

         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (var3 == 167 || var3 == '&') {
               if (var2 + 1 >= var0.length()) {
                  break;
               }

               if ((var0.charAt(var2 + 1) == 'x' || var0.charAt(var2 + 1) == 'X') && var2 + 13 < var0.length()) {
                  Integer var6 = UuUVuuUu(var0, var2 + 2);
                  if (var6 != null) {
                     var1 = var6;
                  }

                  var2 += 13;
               } else {
                  class_124 var4 = class_124.method_544(var0.charAt(var2 + 1));
                  if (var4 != null) {
                     if (var4 == class_124.field_1070) {
                        var1 = null;
                     } else {
                        Integer var5 = var4.method_532();
                        if (var5 != null) {
                           var1 = 0xFF000000 | var5;
                        }
                     }
                  }
               }
            }
         }

         return var1 == null ? 0 : var1;
      } else {
         return 0;
      }
   }

   private static Integer UuUVuuUu(String var0, int var1) {
      int var2 = 0;
      int var3 = 0;

      for (int var4 = var1; var4 < var0.length() && var3 < 6; var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == 167 || var5 == '&') {
            if (++var4 >= var0.length()) {
               return null;
            }

            var5 = var0.charAt(var4);
         }

         int var6 = UuUVuuUu(var5);
         if (var6 < 0) {
            return null;
         }

         var2 = var2 << 4 | var6;
         var3++;
      }

      return var3 == 6 ? 0xFF000000 | var2 : null;
   }

   private static int UuUVuuUu(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else {
         return var0 >= 65 && var0 <= 70 ? var0 - 65 + 10 : -1;
      }
   }

   private static class_2960 VVuuUN(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         int var1 = var0.indexOf(58);
         String var2 = var1 > 0 ? var0.substring(0, var1) : "minecraft";
         String var3 = var1 > 0 && var1 + 1 < var0.length() ? var0.substring(var1 + 1) : var0;
         return class_2960.method_60655(var2, "textures/mob_effect/" + var3 + ".png");
      } else {
         return class_2960.method_60655("minecraft", "textures/mob_effect/strength.png");
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, class_2960 var1, float var2, float var3, float var4, float var5) {
      if (var0 != null && var1 != null && O000c0oocoo.a_ != null && O000c0oocoo.a_.method_1531() != null) {
         class_1044 var6 = O000c0oocoo.a_.method_1531().method_4619(var1);
         if (var6 != null && var6.method_68004() instanceof class_10868 var7 && var7.method_68427() > 0) {
            var0.uUnuvNvvNU();
            var0.uNNnnnuuuN(var5);
            var0.UuUVuuUu(var7.method_68427(), var2, var3, var4, var4, 0.0F, 0.0F, 1.0F, 1.0F);
            var0.vuuuNvNuv();
         }
      }
   }

   public static class NVnVnNnN {
      private boolean UuUVuuUu;
      private String C00OOC00oO;
      private String uUnuvNvvNU;
      private boolean vVvUvVVuuNvV;
      private class_1799 uNNnnnuuuN;
      private int nuUnNvnuUu;
      private class_2960 VVuuUN;
      int vNUvnnVnUvu;
      int uVUuuVnNVU;
      private long vuuuNvNuv;
      private long nvUVNnuu;
      private VVnnnnN UuuNnUvUuv = new VVnnnnN();
      private VVnnnnN nUUVuvU = new VVnnnnN();

      public NVnVnNnN(String var1, String var2, long var3) {
         this.UuUVuuUu = false;
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = var2;
         this.nvUVNnuu = var3;
         this.vuuuNvNuv = System.currentTimeMillis();
      }

      public NVnVnNnN(class_1799 var1, String var2, int var3, int var4, long var5) {
         this.UuUVuuUu = false;
         this.uNNnnnuuuN = var1;
         this.nuUnNvnuUu = var1.hashCode();
         this.uUnuvNvvNU = var2;
         this.vNUvnnVnUvu = var3;
         this.uVUuuVnNVU = var4;
         this.nvUVNnuu = var5;
         this.vuuuNvNuv = System.currentTimeMillis();
      }

      public NVnVnNnN(class_2960 var1, String var2, long var3) {
         this.UuUVuuUu = false;
         this.VVuuUN = var1;
         this.uUnuvNvvNU = var2;
         this.nvUVNnuu = var3;
         this.vuuuNvNuv = System.currentTimeMillis();
      }

      public boolean UuUVuuUu() {
         return this.uNNnnnuuuN != null && !this.uNNnnnuuuN.method_7960();
      }

      public boolean C00OOC00oO() {
         return this.VVuuUN != null;
      }

      public NVnVnNnN(String var1, boolean var2, long var3) {
         this.UuUVuuUu = true;
         this.uUnuvNvvNU = var1;
         this.vVvUvVVuuNvV = var2;
         this.nvUVNnuu = var3;
         this.vuuuNvNuv = System.currentTimeMillis();
         this.nUUVuvU.nuUnNvnuUu(var2 ? 1.0 : 0.0);
      }

      public boolean uUnuvNvvNU() {
         return System.currentTimeMillis() - this.vuuuNvNuv > this.nvUVNnuu;
      }

      @Generated
      public boolean vVvUvVVuuNvV() {
         return this.UuUVuuUu;
      }

      @Generated
      public String uNNnnnuuuN() {
         return this.C00OOC00oO;
      }

      @Generated
      public String nuUnNvnuUu() {
         return this.uUnuvNvvNU;
      }

      @Generated
      public boolean VVuuUN() {
         return this.vVvUvVVuuNvV;
      }

      @Generated
      public class_1799 vNUvnnVnUvu() {
         return this.uNNnnnuuuN;
      }

      @Generated
      public int uVUuuVnNVU() {
         return this.nuUnNvnuUu;
      }

      @Generated
      public class_2960 vuuuNvNuv() {
         return this.VVuuUN;
      }

      @Generated
      public int nvUVNnuu() {
         return this.vNUvnnVnUvu;
      }

      @Generated
      public int UuuNnUvUuv() {
         return this.uVUuuVnNVU;
      }

      @Generated
      public long nUUVuvU() {
         return this.vuuuNvNuv;
      }

      @Generated
      public long UnUNVVVNuv() {
         return this.nvUVNnuu;
      }

      @Generated
      public VVnnnnN vNVuvnUUnuUn() {
         return this.UuuNnUvUuv;
      }

      @Generated
      public VVnnnnN UvnvNVnnnnNU() {
         return this.nUUVuvU;
      }

      @Generated
      public void UuUVuuUu(boolean var1) {
         this.UuUVuuUu = var1;
      }

      @Generated
      public void UuUVuuUu(String var1) {
         this.C00OOC00oO = var1;
      }

      @Generated
      public void C00OOC00oO(String var1) {
         this.uUnuvNvvNU = var1;
      }

      @Generated
      public void C00OOC00oO(boolean var1) {
         this.vVvUvVVuuNvV = var1;
      }

      @Generated
      public void UuUVuuUu(class_1799 var1) {
         this.uNNnnnuuuN = var1;
      }

      @Generated
      public void UuUVuuUu(int var1) {
         this.nuUnNvnuUu = var1;
      }

      @Generated
      public void UuUVuuUu(class_2960 var1) {
         this.VVuuUN = var1;
      }

      @Generated
      public void C00OOC00oO(int var1) {
         this.vNUvnnVnUvu = var1;
      }

      @Generated
      public void uUnuvNvvNU(int var1) {
         this.uVUuuVnNVU = var1;
      }

      @Generated
      public void UuUVuuUu(long var1) {
         this.vuuuNvNuv = var1;
      }

      @Generated
      public void C00OOC00oO(long var1) {
         this.nvUVNnuu = var1;
      }

      @Generated
      public void UuUVuuUu(VVnnnnN var1) {
         this.UuuNnUvUuv = var1;
      }

      @Generated
      public void C00OOC00oO(VVnnnnN var1) {
         this.nUUVuvU = var1;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof nuVVunNUnVnv.NVnVnNnN var2)) {
            return false;
         } else if (!var2.UuUVuuUu(this)) {
            return false;
         } else if (this.vVvUvVVuuNvV() != var2.vVvUvVVuuNvV()) {
            return false;
         } else if (this.VVuuUN() != var2.VVuuUN()) {
            return false;
         } else if (this.uVUuuVnNVU() != var2.uVUuuVnNVU()) {
            return false;
         } else if (this.nvUVNnuu() != var2.nvUVNnuu()) {
            return false;
         } else if (this.UuuNnUvUuv() != var2.UuuNnUvUuv()) {
            return false;
         } else if (this.nUUVuvU() != var2.nUUVuvU()) {
            return false;
         } else if (this.UnUNVVVNuv() != var2.UnUNVVVNuv()) {
            return false;
         } else {
            String var3 = this.uNNnnnuuuN();
            String var4 = var2.uNNnnnuuuN();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.nuUnNvnuUu();
               String var6 = var2.nuUnNvnuUu();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  class_1799 var7 = this.vNUvnnVnUvu();
                  class_1799 var8 = var2.vNUvnnVnUvu();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     class_2960 var9 = this.vuuuNvNuv();
                     class_2960 var10 = var2.vuuuNvNuv();
                     if (var9 == null ? var10 == null : var9.equals(var10)) {
                        VVnnnnN var11 = this.vNVuvnUUnuUn();
                        VVnnnnN var12 = var2.vNVuvnUUnuUn();
                        if (var11 == null ? var12 == null : var11.equals(var12)) {
                           VVnnnnN var13 = this.UvnvNVnnnnNU();
                           VVnnnnN var14 = var2.UvnvNVnnnnNU();
                           return var13 == null ? var14 == null : var13.equals(var14);
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean UuUVuuUu(Object var1) {
         return var1 instanceof nuVVunNUnVnv.NVnVnNnN;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + (this.vVvUvVVuuNvV() ? 79 : 97);
         var2 = var2 * 59 + (this.VVuuUN() ? 79 : 97);
         var2 = var2 * 59 + this.uVUuuVnNVU();
         var2 = var2 * 59 + this.nvUVNnuu();
         var2 = var2 * 59 + this.UuuNnUvUuv();
         long var3 = this.nUUVuvU();
         var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
         long var5 = this.UnUNVVVNuv();
         var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
         String var7 = this.uNNnnnuuuN();
         var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
         String var8 = this.nuUnNvnuUu();
         var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
         class_1799 var9 = this.vNUvnnVnUvu();
         var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
         class_2960 var10 = this.vuuuNvNuv();
         var2 = var2 * 59 + (var10 == null ? 43 : var10.hashCode());
         VVnnnnN var11 = this.vNVuvnUUnuUn();
         var2 = var2 * 59 + (var11 == null ? 43 : var11.hashCode());
         VVnnnnN var12 = this.UvnvNVnnnnNU();
         return var2 * 59 + (var12 == null ? 43 : var12.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "NotificationsHUD.Notification(isToggle="
            + this.vVvUvVVuuNvV()
            + ", icon="
            + this.uNNnnnuuuN()
            + ", text="
            + this.nuUnNvnuUu()
            + ", toggleState="
            + this.VVuuUN()
            + ", itemStack="
            + this.vNUvnnVnUvu()
            + ", itemSeed="
            + this.uVUuuVnNVU()
            + ", textureIconId="
            + this.vuuuNvNuv()
            + ", highlightStart="
            + this.nvUVNnuu()
            + ", highlightColor="
            + this.UuuNnUvUuv()
            + ", createTime="
            + this.nUUVuvU()
            + ", duration="
            + this.UnUNVVVNuv()
            + ", animation="
            + this.vNVuvnUUnuUn()
            + ", toggleAnim="
            + this.UvnvNVnnnnNU()
            + ")";
      }
   }

   static final class nvnNNunvv {
      String UuUVuuUu = "";
      boolean C00OOC00oO;

      void UuUVuuUu() {
         this.C00OOC00oO = false;
      }
   }
}
