package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class vvNVnVNvUvV implements O000c0oocoo {
   private static final int UuUVuuUu = 15;
   private static boolean C00OOC00oO;
   private static int uUnuvNvvNU = -1;
   private static float vVvUvVVuuNvV;
   private static float uNNnnnuuuN;

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 == null) {
         C00OOC00oO();
      } else if (a_.field_1687 != null && var0 != null) {
         class_238 var1 = var0.method_5829();
         class_243 var2 = a_.field_1724.method_33571();
         boolean var3 = AttackAura.NuunnvnN.uUnuvNvvNU();
         if (uUnuvNvvNU != var0.method_5628()) {
            uUnuvNvvNU = var0.method_5628();
            vVvUvVVuuNvV = NNvvnnunn.uUnuvNvvNU;
            uNNnnnuuuN = NNvvnnunn.vVvUvVVuuNvV;
         }

         class_243 var4 = var0.method_19538()
            .method_1031(0.0, class_3532.method_15350(var2.field_1351 - var0.method_23318(), 0.0, var0.method_17682()), 0.0)
            .method_1020(var2)
            .method_1029();
         float var5 = (float)Math.toDegrees(Math.atan2(-var4.field_1352, var4.field_1350));
         float var6 = (float)class_3532.method_15350(Math.toDegrees(Math.asin(-var4.field_1351)), -90.0, 90.0);
         float var7 = Float.MAX_VALUE;
         float var8 = -Float.MAX_VALUE;
         float var9 = Float.MAX_VALUE;
         float var10 = -Float.MAX_VALUE;
         double[][] var11 = new double[][]{
            {var1.field_1323, var1.field_1322, var1.field_1321},
            {var1.field_1323, var1.field_1322, var1.field_1324},
            {var1.field_1323, var1.field_1325, var1.field_1321},
            {var1.field_1323, var1.field_1325, var1.field_1324},
            {var1.field_1320, var1.field_1322, var1.field_1321},
            {var1.field_1320, var1.field_1322, var1.field_1324},
            {var1.field_1320, var1.field_1325, var1.field_1321},
            {var1.field_1320, var1.field_1325, var1.field_1324}
         };

         for (double[] var15 : var11) {
            class_243 var16 = new class_243(var15[0], var15[1], var15[2]).method_1020(var2);
            float var17 = (float)Math.toDegrees(Math.atan2(-var16.field_1352, var16.field_1350));
            float var18 = (float)class_3532.method_15350(
               -Math.toDegrees(Math.atan2(var16.field_1351, Math.hypot(var16.field_1352, var16.field_1350))), -90.0, 90.0
            );
            float var19 = class_3532.method_15393(var17 - var5);
            float var20 = var18 - var6;
            var7 = Math.min(var7, var19);
            var8 = Math.max(var8, var19);
            var9 = Math.min(var9, var20);
            var10 = Math.max(var10, var20);
         }

         float var36 = 22.0F;
         float var37 = class_3532.method_15363(class_3532.method_15393(NNvvnnunn.uUnuvNvvNU - var5), var7 - var36, var8 + var36);
         float var38;
         if (var3) {
            float var39 = (float)(System.currentTimeMillis() % 2000L) / 2000.0F;
            float var41 = (float)Math.sin(var39 * Math.PI * 2.0);
            float var43 = (var10 - var9) * 0.75F + VnNnNnvuvn.vVvUvVVuuNvV(15.0F, 30.0F);
            float var45 = (var9 + var10) * 0.5F;
            var38 = var45 + var41 * var43 + VnNnNnvuvn.vVvUvVVuuNvV(-4.0F, 4.0F);
         } else {
            var38 = class_3532.method_15363(NNvvnnunn.vVvUvVVuuNvV - var6, var9 - var36, var10 + var36);
         }

         float var40 = var5 + var37;
         float var42 = class_3532.method_15363(var6 + var38, -90.0F, 90.0F);
         float var44 = NNvvnnunn.uUnuvNvvNU;
         float var46 = NNvvnnunn.vVvUvVVuuNvV;
         float var47 = Math.abs(class_3532.method_15393(var44 - vVvUvVVuuNvV));
         float var48 = Math.abs(var46 - uNNnnnuuuN);
         vVvUvVVuuNvV = var44;
         uNNnnnuuuN = var46;
         float[] var21 = AttackAura.C00OOC00oO(var0);
         float[] var22 = new float[]{var21[0], var21[1], var21[0] + var21[1]};
         boolean var23 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, true, true, -50L, var22) && uvnuUUnunNn.UuUVuuUu((class_1297)var0) < AttackAura.UuUVuuUu(var0);
         if (!var23) {
            float var49 = VnNnNnvuvn.vVvUvVVuuNvV(0.3F, 0.6F);
            float var50 = VnNnNnvuvn.vVvUvVVuuNvV(0.2F, 0.4F);
            float var51 = var49 + var47 * 3.5F;
            float var52 = var50 + var48 * 3.5F;
            float var53 = class_3532.method_15393(var40 - a_.field_1724.method_36454());
            float var29 = var42 - a_.field_1724.method_36455();
            float var30 = class_3532.method_15363(var53, -var51, var51);
            float var31 = var3 ? class_3532.method_15363(var29, -var52 * 5.0F, var52 * 5.0F) : class_3532.method_15363(var29, -var52, var52);
            float var32 = a_.field_1724.method_36454() + var30;
            float var33 = class_3532.method_15363(a_.field_1724.method_36455() + var31, -90.0F, 90.0F);
            float var34 = Math.max(var51 * 18.5F, 6.0F);
            float var35 = Math.max(var52 * 18.5F, 4.0F);
            UuUVuuUu(new uuUuvNuNVNVU(var32, var33), var34, var35);
         } else {
            float var24 = a_.field_1724.method_36454();
            float var25 = a_.field_1724.method_36455();
            float var26 = class_3532.method_15393(var24 - var5);
            float var27 = var25 - var6;
            boolean var28 = var26 >= var7 && var26 <= var8 && var27 >= var9 && var27 <= var10;
            if (!var28) {
               UuUVuuUu(var1, var2, var24, var25);
            } else {
               UuUVuuUu(new uuUuvNuNVNVU(var24, var25), 6.0F, 4.0F);
            }
         }
      } else {
         UuUVuuUu();
      }
   }

   public static void UuUVuuUu() {
      if (!C00OOC00oO) {
         C00OOC00oO();
      } else {
         if (a_.field_1724 != null) {
            NNvvnnunn.uUnuvNvvNU = a_.field_1724.method_36454();
            NNvvnnunn.vVvUvVVuuNvV = a_.field_1724.method_36455();
         }

         COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
         COC0OCc.nuUnNvnuUu = 0;
         COC0OCc.vuuuNvNuv = false;
         COC0OCc.uVUuuVnNVU = null;
         COC0OCc.vNUvnnVnUvu = 0;
         NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
         C00OOC00oO();
      }
   }

   private static void UuUVuuUu(class_238 var0, class_243 var1, float var2, float var3) {
      boolean var4 = ThreadLocalRandom.current().nextBoolean();
      float var5 = var4 ? VnNnNnvuvn.vVvUvVVuuNvV(0.05F, 0.2F) : VnNnNnvuvn.vVvUvVVuuNvV(0.8F, 0.95F);
      float var6 = (float)(ThreadLocalRandom.current().nextDouble() * ThreadLocalRandom.current().nextDouble());
      float var7 = 0.5F + var6 * 0.5F;
      float var8 = VnNnNnvuvn.vVvUvVVuuNvV(-1.0F, 1.0F) * VnNnNnvuvn.vVvUvVVuuNvV(0.0F, 1.0F);
      float var9 = (var8 + 1.0F) / 2.0F;
      double var10 = var0.field_1323 + (var0.field_1320 - var0.field_1323) * var5;
      double var12 = var0.field_1322 + (var0.field_1325 - var0.field_1322) * var7;
      double var14 = var0.field_1321 + (var0.field_1324 - var0.field_1321) * var9;
      class_243 var16 = new class_243(var10, var12, var14).method_1020(var1);
      float var17 = (float)Math.toDegrees(Math.atan2(-var16.field_1352, var16.field_1350));
      float var18 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var16.field_1351, Math.hypot(var16.field_1352, var16.field_1350))), -90.0, 90.0);
      float var19 = Math.abs(class_3532.method_15393(var17 - var2));
      float var20 = Math.abs(var18 - var3);
      float var21 = VnNnNnvuvn.vVvUvVVuuNvV(15.0F, 25.0F) + var19 / 90.0F * VnNnNnvuvn.vVvUvVVuuNvV(30.0F, 40.0F);
      float var22 = VnNnNnvuvn.vVvUvVVuuNvV(10.0F, 18.0F) + var20 / 90.0F * VnNnNnvuvn.vVvUvVVuuNvV(20.0F, 27.0F);
      UuUVuuUu(new uuUuvNuNVNVU(var17, var18), var21, var22);
   }

   private static void UuUVuuUu(uuUuvNuNVNVU var0, float var1, float var2) {
      C00OOC00oO = COC0OCc.nuUnNvnuUu <= 15;
      COC0OCc.UuUVuuUu(var0, var1, var2, VnNnNnvuvn.UuUVuuUu(25, 45), VnNnNnvuvn.UuUVuuUu(10, 25), VnNnNnvuvn.UuUVuuUu(0, 2), 15, false);
   }

   private static void C00OOC00oO() {
      C00OOC00oO = false;
      uUnuvNvvNU = -1;
      vVvUvVVuuNvV = 0.0F;
      uNNnnnuuuN = 0.0F;
   }
}
