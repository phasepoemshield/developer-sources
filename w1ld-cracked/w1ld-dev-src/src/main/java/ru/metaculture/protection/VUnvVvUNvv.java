package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class VUnvVvUNvv implements O000c0oocoo {
   private static final int UuUVuuUu = 15;
   private static final int C00OOC00oO = 3;
   private static final float uUnuvNvvNU = 0.33333334F;
   private static final long vVvUvVVuuNvV = 17L;
   private static final float uNNnnnuuuN = 2.0F;
   private static final float nuUnNvnuUu = 0.35F;
   private static final float VVuuUN = 0.6F;
   private static final float vNUvnnVnUvu = 0.35F;
   private static final float uVUuuVnNVU = 0.75F;
   private static final float vuuuNvNuv = 180.0F;
   private static final float nUUVuvU = 220.0F;
   private static final float UnUNVVVNuv = 340.0F;
   private static final int vNVuvnUUnuUn = 14;
   private static final float UvnvNVnnnnNU = 0.6F;
   private static final float uVUVnuvnuVuv = 90.0F;
   private static final float NVNnnvnuunNv = 170.0F;
   private static final float uVunuUNVVUUV = 26.0F;
   private static final float UNnVVNvvnVvU = 44.0F;
   private static final float uNnUnnuNUnNu = 450.0F;
   private static final long NnUuNNU = 100L;
   private static final long nNvNUVU = ThreadLocalRandom.current().nextLong(0L, 86400000L);
   private static final COC0OCc.NVnVnNnN UnUNuUU = VUnvVvUNvv::vVvUvVVuuNvV;
   private static final VUnvVvUNvv.nvnNNunvv uUVuVvuNUvnu = new VUnvVvUNvv.nvnNNunvv();

   private VUnvVvUNvv() {
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1) {
      if (a_.field_1724 != null && a_.field_1687 != null && var0 != null) {
         long var2 = System.currentTimeMillis();
         uUVuVvuNUvnu.C00OOC00oO = true;
         C00OOC00oO(var2);
         if (uUVuVvuNUvnu.uUnuvNvvNU != var0.method_5628()) {
            uUVuVvuNUvnu.uUnuvNvvNU = var0.method_5628();
            uUVuVvuNUvnu.UuUVuuUu = VUnvVvUNvv.NVnVnNnN.HOLD;
            uUVuVvuNUvnu.vNUvnnVnUvu = 0L;
            uUVuVvuNUvnu.VVuuUN = nuUnNvnuUu();
            uUVuVvuNUvnu.uVUuuVnNVU = null;
            uUVuVvuNUvnu.nUUVuvU = null;
            uUVuVvuNUvnu.UnUNVVVNuv = null;
         }

         uUVuVvuNUvnu.uNnUnnuNUnNu = UuUVuuUu(26.0F, 44.0F);
         switch (uUVuVvuNUvnu.UuUVuuUu) {
            case AIM:
               C00OOC00oO(var2, var1, var0);
               break;
            case FLICK:
               UuUVuuUu(var2);
               break;
            default:
               UuUVuuUu(var2, var1, var0);
         }
      }
   }

   public static void UuUVuuUu() {
      long var0 = System.currentTimeMillis();
      uUnuvNvvNU(var0);
      uUVuVvuNUvnu.NnUuNNU = oCCO0cc0C0Oc.vNVuvnUUnuUn();
   }

   public static void C00OOC00oO() {
      if (uUVuVvuNUvnu.C00OOC00oO) {
         if (a_.field_1724 != null && a_.field_1687 != null) {
            uUVuVvuNUvnu.UuUVuuUu();
            COC0OCc.VvunVVUvUNnv var0 = COC0OCc.UuUVuuUu;
            if (var0 != COC0OCc.VvunVVUvUNnv.RESET) {
               if (var0 == COC0OCc.VvunVVUvUNnv.AIM) {
                  COC0OCc.UuUVuuUu(UnUNuUU);
               } else {
                  uNNnnnuuuN();
               }
            }
         } else {
            uNNnnnuuuN();
         }
      }
   }

   public static void uUnuvNvvNU() {
      if (uUVuVvuNUvnu.C00OOC00oO && a_.field_1724 != null) {
         uUVuVvuNUvnu.UuUVuuUu();
         if (COC0OCc.UuUVuuUu == COC0OCc.VvunVVUvUNnv.IDLE) {
            uNNnnnuuuN();
         }
      } else {
         uNNnnnuuuN();
      }
   }

   private static void UuUVuuUu(long var0, boolean var2, class_1309 var3) {
      if (var0 >= uUVuVvuNUvnu.vNUvnnVnUvu && C00OOC00oO(var3, var2)) {
         uUVuVvuNUvnu.UuUVuuUu = VUnvVvUNvv.NVnVnNnN.AIM;
         uUVuVvuNUvnu.uNNnnnuuuN = 0;
         uUVuVvuNUvnu.nuUnNvnuUu = var0;
         uUVuVvuNUvnu.vVvUvVVuuNvV++;
         uUVuVvuNUvnu.uVUuuVnNVU = null;
         C00OOC00oO(var0, var2, var3);
      }
   }

   private static boolean C00OOC00oO(class_1309 var0, boolean var1) {
      if (a_.field_1724.method_6115()) {
         return false;
      } else {
         return uvnuUUnunNn.UuUVuuUu((class_1297)var0) > AttackAura.UuUVuuUu(var0) + 0.6F
            ? false
            : var1 || (float)oCCO0cc0C0Oc.UuuNnUvUuv() - oCCO0cc0C0Oc.vNVuvnUUnuUn() <= uUVuVvuNUvnu.VVuuUN;
      }
   }

   private static void C00OOC00oO(long var0, boolean var2, class_1309 var3) {
      uUVuVvuNUvnu.uNNnnnuuuN++;
      if (!a_.field_1724.method_6115() && uUVuVvuNUvnu.uNNnnnuuuN <= 14) {
         class_243 var4 = a_.field_1724.method_33571();
         class_243 var5 = UuUVuuUu(var3, var4, AttackAura.UuUVuuUu(var3), uUVuVvuNUvnu.vVvUvVVuuNvV, a_.field_1724.field_6012);
         uUVuVvuNUvnu.vuuuNvNuv = var5;
         uUVuVvuNUvnu.uVUuuVnNVU = C00OOC00oO(uUVuVvuNUvnu.uVUuuVnNVU, var5);
         float[] var6 = uUnuvNvvNU(var4, uUVuVvuNUvnu.uVUuuVnNVU);
         uUVuVvuNUvnu.nvUVNnuu = var6[0];
         uUVuVvuNUvnu.UuuNnUvUuv = var6[1];
         UuUVuuUu(var0, var2, var4);
      } else {
         UuUVuuUu(var0, UuUVuuUu(420.0F, 900.0F));
      }
   }

   private static void UuUVuuUu(long var0) {
      if (uUVuVvuNUvnu.nUUVuvU != null && uUVuVvuNUvnu.UnUNVVVNuv != null) {
         float var2 = (float)Math.max(uUVuVvuNUvnu.UvnvNVnnnnNU, 1L);
         float var3 = class_3532.method_15363((float)(var0 - uUVuVvuNUvnu.vNVuvnUUnuUn) / var2, 0.0F, 1.0F);
         float var4 = var3 * var3 * (3.0F - 2.0F * var3);
         float var5 = class_3532.method_15393(uUVuVvuNUvnu.UnUNVVVNuv.UuUVuuUu - uUVuVvuNUvnu.nUUVuvU.UuUVuuUu);
         float var6 = class_3532.method_15363(class_3532.method_15393(uUVuVvuNUvnu.UnUNVVVNuv.C00OOC00oO - uUVuVvuNUvnu.nUUVuvU.C00OOC00oO), -90.0F, 90.0F);
         UuUVuuUu(
            new uuUuvNuNVNVU(uUVuVvuNUvnu.nUUVuvU.UuUVuuUu + var5 * var4, class_3532.method_15363(uUVuVvuNUvnu.nUUVuvU.C00OOC00oO + var6 * var4, -90.0F, 90.0F)),
            360.0F,
            360.0F
         );
         if (var3 >= 1.0F) {
            uUVuVvuNUvnu.nUUVuvU = null;
            uUVuVvuNUvnu.UnUNVVVNuv = null;
            UuUVuuUu(var0, UuUVuuUu(40.0F, 120.0F));
         }
      } else {
         UuUVuuUu(var0, UuUVuuUu(40.0F, 120.0F));
      }
   }

   private static void UuUVuuUu(long var0, float var2) {
      uUVuVvuNUvnu.UuUVuuUu = VUnvVvUNvv.NVnVnNnN.HOLD;
      uUVuVvuNUvnu.vNUvnnVnUvu = var0 + (long)var2;
      uUVuVvuNUvnu.VVuuUN = nuUnNvnuUu();
      uUVuVvuNUvnu.uNNnnnuuuN = 0;
      uUVuVvuNUvnu.uVUuuVnNVU = null;
      uUVuVvuNUvnu.UnUNuUU = 0L;
      if (COC0OCc.UuUVuuUu != COC0OCc.VvunVVUvUNnv.IDLE) {
         COC0OCc.UuUVuuUu(UnUNuUU);
      }
   }

   private static void UuUVuuUu(long var0, boolean var2, class_243 var3) {
      boolean var4 = var2 && oCCO0cc0C0Oc.UnUNVVVNuv() > 0.35F;
      float var5 = uUVuVvuNUvnu.nvUVNnuu;
      float var6 = uUVuVvuNUvnu.UuuNnUvUuv;
      if (var4 && uUVuVvuNUvnu.vuuuNvNuv != null) {
         float[] var7 = uUnuvNvvNU(var3, uUVuVvuNUvnu.vuuuNvNuv);
         var5 = var7[0];
         var6 = var7[1];
      }

      float var34 = var4 ? 0.1505F : 0.35F;
      float var8 = var4 ? 2.5F : 1.0F;
      float var9 = a_.field_1724.method_36454();
      float var10 = a_.field_1724.method_36455();

      for (int var11 = 0; var11 < 3; var11++) {
         long var12 = var0 - (2 - var11) * 17L;
         long var14 = var12 + nNvNUVU;
         float var16 = Math.abs(class_3532.method_15393(var5 - var9));
         float var17 = Math.abs(var6 - var10);
         float var18 = Math.max(var16, var17);
         float var19 = class_3532.method_15363(1.0F - var18 / 8.0F, 0.0F, 1.0F);
         float var20 = class_3532.method_15363((float)(var12 - uUVuVvuNUvnu.nuUnNvnuUu) / 180.0F, 0.0F, 1.0F);
         if (var12 > uUVuVvuNUvnu.uVUVnuvnuVuv) {
            uUVuVvuNUvnu.uVUVnuvnuVuv = var12 + ThreadLocalRandom.current().nextInt(260, 640);
            uUVuVvuNUvnu.NVNnnvnuunNv = UuUVuuUu(0.75F, 1.25F);
         }

         if (var12 > uUVuVvuNUvnu.uVunuUNVVUUV) {
            uUVuVvuNUvnu.uVunuUNVVUUV = var12 + ThreadLocalRandom.current().nextInt(150, 350);
            uUVuVvuNUvnu.UNnVVNvvnVvU = UuUVuuUu(0.8F, 1.2F);
         }

         float var21 = class_3532.method_15363(var18 / 30.0F, 0.15F, 0.8F);
         float var22 = 0.8F + 0.2F * (float)(Math.sin(var14 / 137.0) * 0.6 + Math.sin(var14 / 89.0 + 1.7) * 0.3 + Math.sin(var14 / 61.0 + 4.2) * 0.1);
         float var23 = (var2 ? 46.0F : 30.0F) * var21 * var22 * uUVuVvuNUvnu.NVNnnvnuunNv * var8 * 2.0F;
         float var24 = Math.signum(class_3532.method_15393(var5 - var9));
         float var25 = Math.signum(var6 - var10);
         float var26 = var23 * uUVuVvuNUvnu.UNnVVNvvnVvU * (1.0F + 0.25F * var24 * uUVuVvuNUvnu.NVNnnvnuunNv) * (0.9F + 0.2F * (float)Math.sin(var14 / 173.0));
         float var27 = var23 * 0.55F * (1.0F - 0.2F * var25 * uUVuVvuNUvnu.NVNnnvnuunNv) * (0.85F + 0.15F * (float)Math.cos(var14 / 151.0));
         float var28 = var19 * var34 * (float)(Math.sin(var14 / 9.0) * 0.25 + Math.cos(var14 / 13.0) * 0.15);
         float var29 = var34 * (float)Math.sin(var14 / 420.0) * 0.7F * var19;
         float var30 = var34 * (float)(Math.sin(var14 / 110.0) * 4.5 + Math.cos(var14 / 57.0) * 2.0);
         float var31 = var34 * (float)(Math.cos(var14 / 55.0) * 3.2 + Math.sin(var14 / 83.0) * 1.6);
         float var32 = 0.4F + 0.6F * var20;
         uuUuvNuNVNVU var33 = UuUVuuUu(
            var9, var10, var5, var6, var26 * var32 * 0.33333334F, var27 * var32 * 0.33333334F, 0.75F, var30 + var28 + var29, var31 + var28
         );
         var9 = var33.UuUVuuUu;
         var10 = var33.C00OOC00oO;
      }

      UuUVuuUu(new uuUuvNuNVNVU(class_3532.method_15393(var9), class_3532.method_15363(var10, -90.0F, 90.0F)), 360.0F, 360.0F);
   }

   private static uuUuvNuNVNVU UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = class_3532.method_15393(var2 - var0);
      float var10 = class_3532.method_15363(class_3532.method_15393(var3 - var1), -90.0F, 90.0F);
      float var11 = Math.max((float)Math.hypot(Math.abs(var9), Math.abs(var10)), 1.0E-4F);
      float var12 = Math.abs(var9 / var11) * Math.max(var4, 0.0F);
      float var13 = Math.abs(var10 / var11) * Math.max(var5, 0.0F);
      float var14 = var0 + class_3532.method_15363(var9, -var12, var12) + var7;
      float var15 = class_3532.method_15363(var1 + class_3532.method_15363(var10, -var13, var13) + var8, -90.0F, 90.0F);
      return new uuUuvNuNVNVU(var0 + var6 * class_3532.method_15393(var14 - var0), class_3532.method_15363(var1 + var6 * (var15 - var1), -90.0F, 90.0F));
   }

   private static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2) {
      uUVuVvuNUvnu.UnUNuUU = 0L;
      COC0OCc.UuUVuuUu(var0, Math.max(var1, 0.0F), Math.max(var2, 0.0F), uUVuVvuNUvnu.uNnUnnuNUnNu, uUVuVvuNUvnu.uNnUnnuNUnNu, 0, 15, false, UnUNuUU);
   }

   private static COC0OCc.nvnNNunvv vVvUvVVuuNvV() {
      if (a_.field_1724 != null && uUVuVvuNUvnu.C00OOC00oO) {
         uuUuvNuNVNVU var0 = new uuUuvNuNVNVU(a_.field_1724);
         uuUuvNuNVNVU var1 = new uuUuvNuNVNVU(NNvvnnunn.uUnuvNvvNU, NNvvnnunn.vVvUvVVuuNvV);
         float var2 = var0.UuUVuuUu(var1);
         if (var2 < 1.0F) {
            uUVuVvuNUvnu.UnUNuUU = 0L;
            return COC0OCc.nvnNNunvv.UuUVuuUu();
         } else {
            long var3 = System.currentTimeMillis();
            if (uUVuVvuNUvnu.UnUNuUU == 0L) {
               uUVuVvuNUvnu.UnUNuUU = var3;
            }

            float var5 = class_3532.method_15363(1.0F - (float)(var3 - uUVuVvuNUvnu.UnUNuUU) / 450.0F, 0.0F, 1.0F)
               * class_3532.method_15363(var2 / 20.0F, 0.0F, 1.0F);
            float var6 = uNNnnnuuuN(var3) * var5;
            uuUuvNuNVNVU var7 = new uuUuvNuNVNVU(var1.UuUVuuUu + var6, class_3532.method_15363(var1.C00OOC00oO + var6 * 0.5F, -90.0F, 90.0F));
            float var8 = Math.max(uUVuVvuNUvnu.uNnUnnuNUnNu, 1.0F);
            return new COC0OCc.nvnNNunvv(var7, var8, var8, false);
         }
      } else {
         uNNnnnuuuN();
         return COC0OCc.nvnNNunvv.UuUVuuUu();
      }
   }

   private static void uNNnnnuuuN() {
      uUVuVvuNUvnu.C00OOC00oO();
      COC0OCc.C00OOC00oO(UnUNuUU);
   }

   private static void C00OOC00oO(long var0) {
      float var2 = oCCO0cc0C0Oc.vNVuvnUUnuUn();
      float var3 = uUVuVvuNUvnu.NnUuNNU;
      uUVuVvuNUvnu.NnUuNNU = var2;
      if (var3 >= 0.0F && var2 < var3) {
         uUnuvNvvNU(var0);
      }
   }

   private static void uUnuvNvvNU(long var0) {
      if (var0 - uUVuVvuNUvnu.nNvNUVU >= 100L) {
         uUVuVvuNUvnu.nNvNUVU = var0;
         if (uUVuVvuNUvnu.C00OOC00oO && uUVuVvuNUvnu.UuUVuuUu == VUnvVvUNvv.NVnVnNnN.AIM && a_.field_1724 != null && a_.field_1687 != null) {
            vVvUvVVuuNvV(var0);
         }
      }
   }

   private static void vVvUvVVuuNvV(long var0) {
      uuUuvNuNVNVU var2 = new uuUuvNuNVNVU(a_.field_1724);
      uUVuVvuNUvnu.nUUVuvU = var2;
      uUVuVvuNUvnu.UnUNVVVNuv = UuUVuuUu(AttackAura.ccOO0COcoco0, var2);
      uUVuVvuNUvnu.vNVuvnUUnuUn = var0;
      uUVuVvuNUvnu.UvnvNVnnnnNU = (long)UuUVuuUu(90.0F, 170.0F);
      uUVuVvuNUvnu.UuUVuuUu = VUnvVvUNvv.NVnVnNnN.FLICK;
   }

   private static uuUuvNuNVNVU UuUVuuUu(class_1309 var0, uuUuvNuNVNVU var1) {
      if (var0 != null && var0.method_5805() && a_.field_1724 != null) {
         class_238 var2 = var0.method_5829();
         class_243 var3 = a_.field_1724.method_33571();
         class_243 var4 = var2.method_1005();
         double var5 = var4.field_1352 - var3.field_1352;
         double var7 = var4.field_1350 - var3.field_1350;
         double var9 = Math.hypot(var5, var7);
         if (var9 > 1.0E-4) {
            double var11 = ThreadLocalRandom.current().nextBoolean() ? 1.0 : -1.0;
            double var13 = -var7 / var9 * var11;
            double var15 = var5 / var9 * var11;
            double var17 = UuUVuuUu(0.75F, 1.3F);
            double var19 = Math.min(
               (var2.method_17939() * 0.5 + var17) / Math.max(Math.abs(var13), 1.0E-4), (var2.method_17941() * 0.5 + var17) / Math.max(Math.abs(var15), 1.0E-4)
            );
            double var21 = ThreadLocalRandom.current().nextBoolean() ? 1.0 : -1.0;
            class_243 var23 = new class_243(
               var4.field_1352 + var13 * var19, var4.field_1351 + var21 * var2.method_17940() * UuUVuuUu(0.1F, 0.34F), var4.field_1350 + var15 * var19
            );
            float[] var24 = uUnuvNvvNU(var3, var23);
            return new uuUuvNuNVNVU(var24[0], var24[1]);
         }
      }

      float var25 = ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F;
      return new uuUuvNuNVNVU(var1.UuUVuuUu + var25 * UuUVuuUu(14.0F, 26.0F), class_3532.method_15363(var1.C00OOC00oO + UuUVuuUu(-9.0F, 9.0F), -90.0F, 90.0F));
   }

   private static class_243 UuUVuuUu(class_1309 var0, class_243 var1, float var2, int var3, int var4) {
      class_238 var5 = var0.method_5829();
      double var6 = Math.min(var5.field_1320 - var5.field_1323, var5.field_1324 - var5.field_1321);
      double var8 = var5.field_1325 - var5.field_1322;
      double var10 = Math.min(0.1, var6 * 0.25);
      double var12 = var5.field_1323 + var10;
      double var14 = var5.field_1320 - var10;
      double var16 = var5.field_1321 + var10;
      double var18 = var5.field_1324 - var10;
      double var20 = var5.field_1322 + Math.min(0.15, var8 * 0.15);
      double var22 = var5.field_1325 - Math.min(0.15, var8 * 0.12);
      if (var22 < var20) {
         var22 = var20;
      }

      class_243 var24 = new class_243(
         class_3532.method_15350(var1.field_1352, var12, var14),
         class_3532.method_15350(var1.field_1351, var20, var22),
         class_3532.method_15350(var1.field_1350, var16, var18)
      );
      class_243 var25 = var24.method_1020(var1);
      double var26 = Math.hypot(var25.field_1352, var25.field_1350);
      class_243 var28 = var26 < 1.0E-4 ? new class_243(1.0, 0.0, 0.0) : new class_243(-var25.field_1350 / var26, 0.0, var25.field_1352 / var26);
      double var29 = var3 * 1.37 + var4 * 0.07;
      double var31 = Math.sin(var29) * 0.6 + Math.sin(var29 * 0.37 + 1.9) * 0.3;
      double var33 = Math.cos(var29 * 0.63 + 0.7) * 0.55 + Math.sin(var29 * 0.23 + 2.6) * 0.25;
      double var35 = (var14 - var12) * 0.5;
      double var37 = (var22 - var20) * 0.5;
      class_243 var39 = var24.method_1019(var28.method_1021(var31 * var35 * 0.6F)).method_1031(0.0, var33 * var37 * 0.6 * 0.6F, 0.0);
      var39 = new class_243(
         class_3532.method_15350(var39.field_1352, var12, var14),
         class_3532.method_15350(var39.field_1351, var20, var22),
         class_3532.method_15350(var39.field_1350, var16, var18)
      );
      return !(var1.method_1022(var39) > var2 - 0.06) && UuUVuuUu(var1, var39) ? var39 : var24;
   }

   private static boolean UuUVuuUu(class_243 var0, class_243 var1) {
      if (a_.field_1687 == null) {
         return true;
      } else {
         try {
            class_239 var2 = nVvuVvVNVUun.UuUVuuUu(var0, var1, class_3960.field_17558, class_242.field_1348);
            return var2 == null || var2.method_17783() != class_240.field_1332;
         } catch (Throwable var3) {
            return true;
         }
      }
   }

   private static class_243 C00OOC00oO(class_243 var0, class_243 var1) {
      if (var0 == null) {
         return var1;
      } else {
         class_243 var2 = var1.method_1020(var0);
         double var3 = var2.method_1033();
         if (var3 < 0.04) {
            return var1;
         } else {
            double var5 = Math.max(0.18, var3 * 0.58);
            return var0.method_1019(var2.method_1029().method_1021(Math.min(var3, var5)));
         }
      }
   }

   private static float[] uUnuvNvvNU(class_243 var0, class_243 var1) {
      class_243 var2 = var1.method_1020(var0);
      double var3 = Math.hypot(var2.field_1352, var2.field_1350);
      return var3 < 1.0E-6 && Math.abs(var2.field_1351) < 1.0E-6
         ? new float[]{a_.field_1724.method_36454(), a_.field_1724.method_36455()}
         : new float[]{
            class_3532.method_15393((float)(Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0)),
            (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var2.field_1351, var3)), -90.0, 90.0)
         };
   }

   private static float uNNnnnuuuN(long var0) {
      double var2 = (var0 + nNvNUVU) / 50.0;
      return (float)((Math.sin(var2 * 0.31) * 0.5 + Math.sin(var2 * 0.73 + 1.1) * 0.3 + Math.sin(var2 * 1.7 + 2.6) * 0.2) * 12.0) / 4.0F;
   }

   static float nuUnNvnuUu() {
      return UuUVuuUu(220.0F, 340.0F);
   }

   private static float UuUVuuUu(float var0, float var1) {
      return var1 <= var0 ? var0 : (float)ThreadLocalRandom.current().nextDouble(var0, var1);
   }

   static enum NVnVnNnN {
      HOLD,
      AIM,
      FLICK;
   }

   static final class nvnNNunvv {
      VUnvVvUNvv.NVnVnNnN UuUVuuUu = VUnvVvUNvv.NVnVnNnN.HOLD;
      boolean C00OOC00oO;
      int uUnuvNvvNU = Integer.MIN_VALUE;
      int vVvUvVVuuNvV;
      int uNNnnnuuuN;
      long nuUnNvnuUu;
      float VVuuUN = 220.0F;
      long vNUvnnVnUvu;
      class_243 uVUuuVnNVU;
      class_243 vuuuNvNuv;
      float nvUVNnuu;
      float UuuNnUvUuv;
      uuUuvNuNVNVU nUUVuvU;
      uuUuvNuNVNVU UnUNVVVNuv;
      long vNVuvnUUnuUn;
      long UvnvNVnnnnNU;
      long uVUVnuvnuVuv;
      float NVNnnvnuunNv = 1.0F;
      long uVunuUNVVUUV;
      float UNnVVNvvnVvU = 1.0F;
      float uNnUnnuNUnNu = 60.0F;
      float NnUuNNU = -1.0F;
      long nNvNUVU;
      long UnUNuUU;

      void UuUVuuUu() {
         this.uUnuvNvvNU = Integer.MIN_VALUE;
         this.UuUVuuUu = VUnvVvUNvv.NVnVnNnN.HOLD;
         this.uNNnnnuuuN = 0;
         this.vNUvnnVnUvu = 0L;
         this.uVUuuVnNVU = null;
         this.vuuuNvNuv = null;
         this.nUUVuvU = null;
         this.UnUNVVVNuv = null;
      }

      void C00OOC00oO() {
         this.C00OOC00oO = false;
         this.UuUVuuUu();
         this.vVvUvVVuuNvV = 0;
         this.VVuuUN = VUnvVvUNvv.nuUnNvnuUu();
         this.uVUVnuvnuVuv = 0L;
         this.NVNnnvnuunNv = 1.0F;
         this.uVunuUNVVUUV = 0L;
         this.UNnVVNvvnVvU = 1.0F;
         this.NnUuNNU = -1.0F;
         this.nNvNUVU = 0L;
         this.UnUNuUU = 0L;
      }
   }
}
