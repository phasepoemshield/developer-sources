package ru.metaculture.protection;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_2350.class_2351;

public final class VvUNVunnuu implements O000c0oocoo {
   static int UuUVuuUu;
   static float C00OOC00oO;
   static VuNvNNvVV uUnuvNvvNU = new VuNvNNvVV();
   static VuNvNNvVV vVvUvVVuuNvV = new VuNvNNvVV();

   public static void UuUVuuUu(class_1309 var0, boolean var1, float var2, boolean var3) {
      long var4 = System.currentTimeMillis();
      if (!AttackAura.UnvuVuVnNuvu && var4 - AttackAura.nNuVunNUVu >= AttackAura.UNvvunVVn) {
         AttackAura.UnvuVuVnNuvu = true;
         AttackAura.UvNNVUVNVuvV = var4;
         AttackAura.NnunUUnU = ThreadLocalRandom.current().nextInt(270, 390);
         AttackAura.nNuVunNUVu = var4;
         AttackAura.UNvvunVVn = ThreadLocalRandom.current().nextLong(6500L, 7200L);
      }

      boolean var6 = false;
      if (AttackAura.UnvuVuVnNuvu && var4 - AttackAura.UvNNVUVNVuvV >= AttackAura.NnunUUnU) {
         AttackAura.UnvuVuVnNuvu = false;
      }

      if (var4 - AttackAura.UvNNVUVNVuvV >= AttackAura.NnunUUnU + 40L) {
         var6 = true;
      }

      class_243 var7 = a_.field_1724.method_33571();
      float var8 = (float)Math.cos(System.currentTimeMillis() / 450.0);
      float var9 = 0.06F * var8;
      float var10 = (float)Math.cos(System.currentTimeMillis() / 500.0);
      float var11 = 0.06F * var10;
      float var12 = (float)Math.cos(System.currentTimeMillis() / 14000.0);
      float var13 = (float)Math.cos(System.currentTimeMillis() / 2500L);
      float var14 = 0.5F * var12;
      class_243 var15 = uvnuUUnunNn.C00OOC00oO(var0);
      float var16 = NNvvnnunn.uUnuvNvvNU;
      if (var1 && uvnuUUnunNn.UuUVuuUu((class_1297)var0) < var2 && !var3) {
         C00OOC00oO = VnNnNnvuvn.vVvUvVVuuNvV(6.0F, 7.0F);
      }

      float var17 = VnNnNnvuvn.vVvUvVVuuNvV(22.0F, 28.0F);
      float var18 = 0.0F;
      float var19 = VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 3.5F);
      float var20 = (float)Math.cos(System.currentTimeMillis() / 40.0);
      float var21 = (float)Math.sin(System.currentTimeMillis() / 70.0);
      if (C00OOC00oO > 0.0F) {
         var17 = VnNnNnvuvn.vVvUvVVuuNvV(70.0F, 120.0F);
         var16 = (float)Math.toDegrees(Math.atan2(-var15.field_1352, var15.field_1350));
         var18 = (var20 + var21) * UuUVuuUu(1.0F, 2.0F);
         C00OOC00oO--;
      }

      float var22 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var15.field_1351, Math.hypot(var15.field_1352, var15.field_1350))), -90.0, 90.0);
      float var23 = var20 * UuUVuuUu(13.0F, 15.0F) + var18;
      float var24 = var21 * UuUVuuUu(5.0F, 7.0F) + var18;
      float var26 = AttackAura.UnvuVuVnNuvu ? -VnNnNnvuvn.vVvUvVVuuNvV(80.0F, 90.0F) : var22;
      uuUuvNuNVNVU var27 = new uuUuvNuNVNVU(var16 + var23, var26 + var24);
      COC0OCc.UuUVuuUu(
         var27, var17, AttackAura.UnvuVuVnNuvu ? UuUVuuUu(120.0F, 170.0F) : (var6 ? UuUVuuUu(120.0F, 170.0F) : UuUVuuUu(6.0F, 8.0F)), 25.0F, 25.0F, 0, 15, false
      );
   }

   public static void UuUVuuUu(class_2338 var0, class_2350 var1) {
      class_243 var2 = a_.field_1724.method_33571();
      double var3 = var0.method_10263() + 0.5 + var1.method_10148() * 0.5;
      double var5 = var0.method_10264() + 0.5 + var1.method_10164() * 0.5;
      double var7 = var0.method_10260() + 0.5 + var1.method_10165() * 0.5;
      if (var1.method_10166() != class_2351.field_11048) {
         var3 = class_3532.method_15350(var2.field_1352, var0.method_10263() + 0.15, var0.method_10263() + 0.85);
      }

      if (var1.method_10166() != class_2351.field_11052) {
         var5 = class_3532.method_15350(var2.field_1351 - 1.2, var0.method_10264() + 0.15, var0.method_10264() + 0.85);
      }

      if (var1.method_10166() != class_2351.field_11051) {
         var7 = class_3532.method_15350(var2.field_1350, var0.method_10260() + 0.15, var0.method_10260() + 0.85);
      }

      class_243 var9 = new class_243(var3, var5, var7).method_1020(var2);
      float var10 = (float)Math.toDegrees(Math.atan2(-var9.field_1352, var9.field_1350));
      float var11 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var9.field_1351, Math.hypot(var9.field_1352, var9.field_1350))), -90.0, 90.0);
      COC0OCc.UuUVuuUu(
         new uuUuvNuNVNVU(var10, var11), VnNnNnvuvn.vVvUvVVuuNvV(250.0F, 360.0F), VnNnNnvuvn.vVvUvVVuuNvV(250.0F, 360.0F), 180.0F, 180.0F, 0, 5, false
      );
   }

   public static void UuUVuuUu(class_1309 var0) {
      class_243 var1 = a_.field_1724.method_33571();
      class_243 var2 = var0.method_19538().method_1031(0.0, var0.method_17682() * 0.8, 0.0);
      class_243 var3 = var2.method_1020(var1).method_1029();
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.field_1352, var3.field_1350));
      float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var3.field_1351, Math.hypot(var3.field_1352, var3.field_1350))), -90.0, 90.0);
      double var6 = Math.max(0.0, a_.field_1724.method_23318() - var0.method_23318());
      float var8;
      float var9;
      if (var6 > 2.5) {
         var8 = 15.0F;
         var9 = 10.0F;
      } else if (var6 > 1.0) {
         var8 = 45.0F;
         var9 = 35.0F;
      } else {
         var8 = 90.0F;
         var9 = 80.0F;
      }

      float var10 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F);
      COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var4 + var10, var5 + var10), var8, var9, 30.0F, 30.0F, 1, 15, false);
   }

   public static float UuUVuuUu(float var0, float var1) {
      return nNUuNuVuuv.UuUVuuUu(var1, var0, new SecureRandom().nextFloat());
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1) {
      class_243 var2 = nVvuVvVNVUun.UuUVuuUu(var0.method_5829(), false);
      class_243 var3 = var2.method_1020(a_.field_1724.method_33571());
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.field_1352, var3.field_1350));
      float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var3.field_1351, Math.hypot(var3.field_1352, var3.field_1350))), -89.0, 89.0);
      uuUuvNuNVNVU var6 = new uuUuvNuNVNVU(var4, var5);
      COC0OCc.UuUVuuUu(var6, VnNnNnvuvn.UuUVuuUu(120, 180), VnNnNnvuvn.vVvUvVVuuNvV(30.0F, 63.0F), 30.0F, 30.0F, 1, 15, false);
   }

   public static void C00OOC00oO(class_1309 var0, boolean var1) {
      float var2 = 0.3F * (float)Math.cos(System.currentTimeMillis() / 2200.0);
      float var3 = 0.03F * (float)Math.sin(System.currentTimeMillis() / 900.0) + 0.06F * (float)Math.cos(System.currentTimeMillis() / 1200.0);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700.0) + 0.04F * (float)Math.sin(System.currentTimeMillis() / 900.0);
      class_243 var5 = a_.field_1724.method_33571();
      class_243 var6 = var0.method_19538().method_1031(var4, var0.method_17682() - 0.35F - var2, var3).method_1020(var5).method_1029();
      boolean var7 = false;
      if (var1) {
         UuUVuuUu = 4;
      }

      if (UuUVuuUu > 0) {
         var7 = true;
         UuUVuuUu--;
      }

      float var8 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
      float var9 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var6.field_1351, Math.hypot(var6.field_1352, var6.field_1350))), -90.0, 90.0);
      float var10 = 0.0F;
      if (var7) {
         var10 = (float)(3.0 * Math.sin(System.currentTimeMillis() / 30.0)) + (float)(VnNnNnvuvn.UuUVuuUu(3, 4) * Math.cos(System.currentTimeMillis() / 60.0));
      }

      uuUuvNuNVNVU var11 = new uuUuvNuNVNVU(
         var8 + var10 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F), var9 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F) + var10
      );
      COC0OCc.UuUVuuUu(
         var11, (float)VnNnNnvuvn.UuUVuuUu(50.0, 70.0, 70L, uUnuvNvvNU), (float)VnNnNnvuvn.UuUVuuUu(10.0, 20.0, 65L, vVvUvVVuuNvV), 30.0F, 30.0F, 1, 15, false
      );
   }

   public static void uUnuvNvvNU(class_1309 var0, boolean var1) {
      class_243 var2 = a_.field_1724.method_33571();
      class_243 var3 = var0.method_19538().method_1031(0.0, var0.method_17682() / 2.0F, 0.0).method_1020(var2).method_1029();
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.field_1352, var3.field_1350));
      float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var3.field_1351, Math.hypot(var3.field_1352, var3.field_1350))), -90.0, 90.0);
      float var6 = 180.0F;
      float var7 = 45.0F;
      uuUuvNuNVNVU var8 = new uuUuvNuNVNVU(var4 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F), var5 + ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F));
      COC0OCc.UuUVuuUu(var8, var7, var6, var7, var6, 0, 15, false);
   }

   public static void vVvUvVVuuNvV(class_1309 var0, boolean var1) {
      float var2 = 0.02F * (float)Math.sin(System.currentTimeMillis() / 1200.0);
      float var3 = 0.03F * (float)Math.sin(System.currentTimeMillis() / 900.0) + 0.02F * (float)Math.cos(System.currentTimeMillis() / 1200.0);
      float var4 = 0.4F * (float)Math.cos(System.currentTimeMillis() / 700L) + 0.04F * (float)Math.sin(System.currentTimeMillis() / 900.0);
      class_243 var5 = uvnuUUnunNn.uUnuvNvvNU(var0).method_1031(var3, 0.0, var4);
      boolean var6 = false;
      if (var1) {
         UuUVuuUu = 2;
      }

      if (UuUVuuUu > 0) {
         var6 = true;
         UuUVuuUu--;
      }

      float var7 = (float)Math.toDegrees(Math.atan2(-var5.field_1352, var5.field_1350));
      float var8 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var5.field_1351, Math.hypot(var5.field_1352, var5.field_1350))), -90.0, 90.0);
      float var9 = 0.0F;
      if (var6) {
         var9 = VnNnNnvuvn.uUnuvNvvNU(-3.0F, 4.0F) + (float)(2.0 * Math.sin(System.currentTimeMillis() / 30.0));
      }

      float var10 = VnNnNnvuvn.uUnuvNvvNU(-3.0F, 3.0F) + (float)(3.0 * Math.cos(System.currentTimeMillis() / 40.0));
      float var11 = VnNnNnvuvn.uUnuvNvvNU(-1.0F, 1.0F) + (float)(4.0 * Math.sin(System.currentTimeMillis() / 240.0));
      uuUuvNuNVNVU var12 = new uuUuvNuNVNVU(var7 + var10 + var9, var8 + var11);
      COC0OCc.UuUVuuUu(var12, VnNnNnvuvn.UuUVuuUu(38, 43), VnNnNnvuvn.vVvUvVVuuNvV(3.0F, 5.0F), 30.0F, 30.0F, 1, 15, false);
   }

   public static void uNNnnnuuuN(class_1309 var0, boolean var1) {
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1, String var2) {
      float var3 = 0.25F * (float)Math.cos(System.currentTimeMillis() / 1500L);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700L);
      float var5 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 900L);
      class_243 var6 = a_.field_1724.method_33571();
      class_243 var7 = var0.method_19538()
         .method_1031(var5, class_3532.method_15350(var6.field_1351 - var0.method_19538().field_1351, 0.0, 0.8) - var3, var4)
         .method_1020(var6)
         .method_1029();
      if (var2.contains("Fast")) {
         float var8 = NNvvnnunn.uUnuvNvvNU;
         float var9 = NNvvnnunn.vVvUvVVuuNvV;
         float var10 = VnNnNnvuvn.uUnuvNvvNU(190.0F, 245.0F);
         if (var1) {
            var8 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var9 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
         }

         float var11 = 0.0F;
         float var12 = 0.0F;
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var8 + var11, var9 + var12), var10, var10, 40.0F, 40.0F, 1, 7, false);
      } else if (var2.contains("Smooth")) {
         float var13 = NNvvnnunn.uUnuvNvvNU;
         float var15 = NNvvnnunn.vVvUvVVuuNvV;
         float var17 = 24.0F;
         if (var1) {
            UuUVuuUu = 3;
            var17 = 88.0F;
         }

         if (UuUVuuUu > 0) {
            var13 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var15 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
            UuUVuuUu--;
         }

         float var19 = 0.0F;
         float var21 = 0.0F;
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var13 + var19, var15 + var21), var17, var17, 40.0F, 40.0F, 1, 7, false);
      } else if (var2.contains("Random")) {
         float var14 = NNvvnnunn.uUnuvNvvNU;
         float var16 = NNvvnnunn.vVvUvVVuuNvV;
         float var18 = VnNnNnvuvn.uUnuvNvvNU(30.0F, 35.0F);
         if (var1) {
            UuUVuuUu = VnNnNnvuvn.UuUVuuUu(2, 4);
         }

         if (UuUVuuUu > 0) {
            var18 = VnNnNnvuvn.uUnuvNvvNU(140.0F, 220.0F);
            var14 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var16 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
            UuUVuuUu--;
         }

         float var20 = ThreadLocalRandom.current().nextFloat(-3.0F, 3.0F)
            + (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 5.0F) * Math.cos(System.currentTimeMillis() / 150.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 5.0F) * Math.sin(System.currentTimeMillis() / 50.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(5.0F, 8.0F) * Math.sin(System.currentTimeMillis() / 130.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 7.0F) * Math.cos(System.currentTimeMillis() / 650.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(12.0F, 18.0F) * Math.sin(System.currentTimeMillis() / 80.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 2650.0));
         float var22 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F)
            + (float)(VnNnNnvuvn.uUnuvNvvNU(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 170.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(3.0F, 4.0F) * Math.sin(System.currentTimeMillis() / 70.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(1.0F, 2.0F) * Math.sin(System.currentTimeMillis() / 110.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(1.0F, 2.0F) * Math.cos(System.currentTimeMillis() / 350.0));
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var14 + var20 / 4.0F, var16 + var22), var18, var18, 40.0F, 40.0F, 1, 7, false);
      }
   }

   public static void C00OOC00oO(class_1309 var0, boolean var1, String var2) {
      float var3 = 0.25F * (float)Math.cos(System.currentTimeMillis() / 1500L);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700L);
      float var5 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 900L);
      class_243 var6 = a_.field_1724.method_33571();
      class_243 var7 = var0.method_19538()
         .method_1031(var5, class_3532.method_15350(var6.field_1351 - var0.method_19538().field_1351, 0.0, 0.8) - var3, var4)
         .method_1020(var6)
         .method_1029();
      if (var2.contains("Fast")) {
         float var8 = NNvvnnunn.uUnuvNvvNU;
         float var9 = NNvvnnunn.vVvUvVVuuNvV;
         float var10 = VnNnNnvuvn.uUnuvNvvNU(280.0F, 360.0F);
         if (var1) {
            var8 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var9 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
         }

         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var8, var9), var10, var10, 40.0F, 40.0F, 1, 7, false);
      } else if (var2.contains("Smooth")) {
         float var13 = NNvvnnunn.uUnuvNvvNU;
         float var15 = NNvvnnunn.vVvUvVVuuNvV;
         float var17 = 24.0F;
         if (var1) {
            UuUVuuUu = 2;
            var17 = 130.0F;
         }

         if (UuUVuuUu > 0) {
            var13 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var15 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
            UuUVuuUu--;
         }

         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var13, var15), var17, var17, 40.0F, 40.0F, 1, 7, false);
      } else if (var2.contains("Random")) {
         float var14 = NNvvnnunn.uUnuvNvvNU;
         float var16 = NNvvnnunn.vVvUvVVuuNvV;
         float var18 = VnNnNnvuvn.uUnuvNvvNU(30.0F, 35.0F);
         if (var1) {
            UuUVuuUu = 2;
         }

         if (UuUVuuUu > 0) {
            var18 = VnNnNnvuvn.uUnuvNvvNU(200.0F, 280.0F);
            var14 = (float)Math.toDegrees(Math.atan2(-var7.field_1352, var7.field_1350));
            var16 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var7.field_1351, Math.hypot(var7.field_1352, var7.field_1350))), -90.0, 90.0);
            UuUVuuUu--;
         }

         float var11 = ThreadLocalRandom.current().nextFloat(-3.0F, 3.0F)
            + (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 5.0F) * Math.cos(System.currentTimeMillis() / 150.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 5.0F) * Math.sin(System.currentTimeMillis() / 50.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(5.0F, 8.0F) * Math.sin(System.currentTimeMillis() / 130.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(4.0F, 7.0F) * Math.cos(System.currentTimeMillis() / 650.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(12.0F, 18.0F) * Math.sin(System.currentTimeMillis() / 80.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 2650.0));
         float var12 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F)
            + (float)(VnNnNnvuvn.uUnuvNvvNU(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 170.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(3.0F, 4.0F) * Math.sin(System.currentTimeMillis() / 70.0))
            + (float)(VnNnNnvuvn.uUnuvNvvNU(1.0F, 2.0F) * Math.sin(System.currentTimeMillis() / 110.0))
               * (float)(VnNnNnvuvn.uUnuvNvvNU(1.0F, 2.0F) * Math.cos(System.currentTimeMillis() / 350.0));
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var14 + var11 / 4.0F, var16 + var12), var18, var18, 40.0F, 40.0F, 1, 7, false);
      }
   }

   @Generated
   private VvUNVunnuu() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
