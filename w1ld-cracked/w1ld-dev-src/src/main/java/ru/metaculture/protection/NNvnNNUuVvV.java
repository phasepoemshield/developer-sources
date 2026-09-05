package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class NNvnNNUuVvV implements O000c0oocoo {
   private static int UuUVuuUu;
   private static int C00OOC00oO = -1;
   private static int uUnuvNvvNU;
   private static long vVvUvVVuuNvV;
   private static boolean uNNnnnuuuN;
   private static long nuUnNvnuUu;
   private static int VVuuUN;
   private static long vNUvnnVnUvu;

   private NNvnNNUuVvV() {
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && a_.field_1687 != null && var0 != null) {
         NNUnuvVvUv var1 = NNUnuvVvUv.UuUVuuUu();
         long var2 = System.currentTimeMillis();
         if (C00OOC00oO != var0.method_5628()) {
            C00OOC00oO = var0.method_5628();
            UuUVuuUu = 0;
            uUnuvNvvNU = 0;
            vVvUvVVuuNvV = 0L;
         }

         if (var1.vNUvnnVnUvu != null && !var1.vNUvnnVnUvu.equals("Custom")) {
            UuUVuuUu(var1, var0, var2);

            try {
               boolean var20 = uUnuvNvvNU(var0);
               float[] var21 = UuUVuuUu(var1, var20);
               int var22 = Math.round(var1.nNvNUVU);
               COC0OCc.UuUVuuUu(new COC0OCc.uunvUUVnuNn(var21[0], var21[1], var22, var22, var1.UnUNuUU), () -> UuUVuuUu(var1.vNUvnnVnUvu, var0));
            } finally {
               UUnnnNuuV.C00OOC00oO();
            }
         } else {
            class_243 var4 = UuUVuuUu(var0, var1, var2);
            class_243 var5 = var4.method_1020(a_.field_1724.method_33571());
            float var6 = (float)Math.toDegrees(Math.atan2(-var5.field_1352, var5.field_1350));
            float var7 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var5.field_1351, Math.hypot(var5.field_1352, var5.field_1350))), -90.0, 90.0);
            boolean var8 = uUnuvNvvNU(var0);
            if ("Static".equals(var1.c0oOOCcCoC0)) {
               var7 *= 0.4F;
            } else if ("Locked".equals(var1.c0oOOCcCoC0)) {
               var7 = 0.0F;
            }

            if (var1.nNnVnUNVV && UuUVuuUu(var2, var1)) {
               var7 = -var1.nuunNvv;
            }

            float var9 = (float)(Math.cos(var2 / 40.0) * var1.uVUVnuvnuVuv) + UuUVuuUu(-var1.uVUVnuvnuVuv, var1.uVUVnuvnuVuv) * 0.5F;
            float var10 = (float)(Math.sin(var2 / 70.0) * var1.NVNnnvnuunNv) + UuUVuuUu(-var1.NVNnnvnuunNv, var1.NVNnnvnuunNv) * 0.5F;
            float var11 = var6 + var1.VVnVNnunVvu + var9;
            float var12 = var7 + var1.unNNVVNnvvV + var10;
            var12 = class_3532.method_15363(var12, var1.NuunnvnN, var1.NVUunUNUN);
            var12 = class_3532.method_15363(var12, -90.0F, 90.0F);
            float[] var13 = UuUVuuUu(var1, var8);
            float var14 = var13[0];
            float var15 = var13[1];
            uuUuvNuNVNVU var16 = new uuUuvNuNVNVU(var11, var12);
            int var17 = Math.round(var1.nNvNUVU);
            COC0OCc.UuUVuuUu(var16, var14, var15, var17, var17, ThreadLocalRandom.current().nextInt(1, 3), 5, var1.UnUNuUU);
         }
      }
   }

   private static void UuUVuuUu(NNUnuvVvUv var0, class_1309 var1, long var2) {
      UUnnnNuuV.C00OOC00oO();
      UUnnnNuuV.UuUVuuUu = true;
      float var4 = var0.VVnVNnunVvu;
      float var5 = var0.unNNVVNnvvV;
      boolean var6 = var0.vvUVNVvvNUv != null && !var0.vvUVNVvvNUv.isEmpty()
         || !"Multipoint".equals(var0.vuuuNvNuv)
         || var0.NnUuNNU > 0.001F
         || var0.UUVNuUNUvUnV > 0.001F;
      if (var6) {
         class_238 var7 = var1.method_5829();
         class_243 var8 = nVvuVvVNVUun.UuUVuuUu(var7, false);
         class_243 var9 = UuUVuuUu(var1, var7, var0, var2);
         float[] var10 = UuUVuuUu(var8);
         float[] var11 = UuUVuuUu(var9);
         var4 += class_3532.method_15393(var11[0] - var10[0]);
         var5 += var11[1] - var10[1];
      }

      UUnnnNuuV.vVvUvVVuuNvV = var0.NuunnvnN;
      UUnnnNuuV.uNNnnnuuuN = var0.NVUunUNUN;
      UUnnnNuuV.UuUVuuUu(var4 * var0.nnuUVNUuvvVU, var5 * var0.nnuUVNUuvvVU, var0.vuvnUnVnUNnV);
   }

   private static float[] UuUVuuUu(class_243 var0) {
      class_243 var1 = var0.method_1020(a_.field_1724.method_33571());
      float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
      float var3 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))), -90.0, 90.0);
      return new float[]{var2, var3};
   }

   private static class_243 UuUVuuUu(class_1309 var0, class_238 var1, NNUnuvVvUv var2, long var3) {
      class_243 var5;
      if (var2.vvUVNVvvNUv != null && !var2.vvUVNVvvNUv.isEmpty()) {
         var5 = C00OOC00oO(var0, var1, var2, var3);
      } else {
         String var6 = var2.vuuuNvNuv;

         var5 = switch (var6) {
            case "Center" -> var1.method_1005();
            case "Eyes" -> new class_243(var0.method_23317(), var0.method_23320(), var0.method_23321());
            case "Closest" -> uvnuUUnunNn.UuUVuuUu(a_.field_1724.method_33571(), var0);
            default -> nVvuVvVNVUun.UuUVuuUu(var1, false);
         };
      }

      double var13 = 0.0;
      double var8 = 0.0;
      if (var2.NnUuNNU > 0.001F) {
         class_243 var10 = C00OOC00oO(var0);
         double var11 = var2.NnUuNNU * Math.sin(var3 / 300.0);
         var13 = var10.field_1352 * var11;
         var8 = var10.field_1350 * var11;
      }

      class_243 var14 = var5.method_1031(var13, 0.0, var8);
      if (var2.UUVNuUNUvUnV > 0.001F) {
         class_243 var15 = var0.method_18798();
         var14 = var14.method_1031(var15.field_1352 * var2.UUVNuUNUvUnV * 3.0, 0.0, var15.field_1350 * var2.UUVNuUNUvUnV * 3.0);
      }

      return var14;
   }

   private static void UuUVuuUu(String var0, class_1309 var1) {
      switch (var0) {
         case "FunTime":
            VVnuUunUv.UuUVuuUu(var1);
            break;
         case "Smooth":
            NUnUNvUunVVN.UuUVuuUu(var1);
            break;
         default:
            float[] var4 = AttackAura.C00OOC00oO(var1);
            float[] var5 = new float[]{var4[0], var4[1], var4[0] + var4[1]};
            boolean var6 = oCCO0cc0C0Oc.UuUVuuUu(var1, false, true, true, -50L, var5);
            switch (var0) {
               case "Snap":
                  VvUNVunnuu.UuUVuuUu(var1, var6, "Fast");
                  break;
               case "Holy":
                  VvUNVunnuu.C00OOC00oO(var1, var6);
                  break;
               case "Spooky":
                  VvUNVunnuu.UuUVuuUu(var1, var6);
                  break;
               case "Matrix":
                  if (VUUuVvvnNVUu.UuUVuuUu("spookytime")) {
                     VvUNVunnuu.UuUVuuUu(var1, var6);
                  } else if (VUUuVvvnNVUu.UuUVuuUu("holy")) {
                     VvUNVunnuu.C00OOC00oO(var1, var6);
                  } else if (VUUuVvvnNVUu.UuUVuuUu("ares")) {
                     VvUNVunnuu.uUnuvNvvNU(var1, var6);
                  } else {
                     VvUNVunnuu.UuUVuuUu(var1, var6);
                  }
            }
      }
   }

   private static boolean UuUVuuUu(long var0, NNUnuvVvUv var2) {
      long var3 = (long)(var2.uUVVvVVNvvn * 1000.0F);
      if (!uNNnnnuuuN && var0 - vNUvnnVnUvu >= var3) {
         uNNnnnuuuN = true;
         nuUnNvnuUu = var0;
         VVuuUN = ThreadLocalRandom.current().nextInt(200, 320);
         vNUvnnVnUvu = var0;
      }

      if (uNNnnnuuuN && var0 - nuUnNvnuUu >= VVuuUN) {
         uNNnnnuuuN = false;
      }

      return uNNnnnuuuN;
   }

   private static class_243 UuUVuuUu(class_1309 var0, NNUnuvVvUv var1, long var2) {
      class_238 var4 = var0.method_5829();
      class_243 var5;
      if (var1.vvUVNVvvNUv != null && !var1.vvUVNVvvNUv.isEmpty()) {
         var5 = C00OOC00oO(var0, var4, var1, var2);
      } else {
         String var6 = var1.vuuuNvNuv;

         var5 = switch (var6) {
            case "Center" -> var4.method_1005();
            case "Eyes" -> new class_243(var0.method_23317(), var0.method_23320(), var0.method_23321());
            case "Closest" -> uvnuUUnunNn.UuUVuuUu(a_.field_1724.method_33571(), var0);
            default -> nVvuVvVNVUun.UuUVuuUu(var4, false);
         };
      }

      double var19 = Math.max(0.2, (double)var1.uNnUnnuNUnNu);
      double var8 = var1.uVunuUNVVUUV * Math.sin(var2 / (250.0 / var19));
      double var10 = var1.UNnVVNvvnVvU * Math.cos(var2 / (520.0 / var19));
      double var12 = 0.0;
      double var14 = 0.0;
      if (var1.NnUuNNU > 0.001F) {
         class_243 var16 = C00OOC00oO(var0);
         double var17 = var1.NnUuNNU * Math.sin(var2 / 300.0);
         var12 = var16.field_1352 * var17;
         var14 = var16.field_1350 * var17;
      }

      class_243 var20 = var5.method_1031(var8 + var12, var10, var14);
      if (var1.UUVNuUNUvUnV > 0.001F) {
         class_243 var21 = var0.method_18798();
         var20 = var20.method_1031(var21.field_1352 * var1.UUVNuUNUvUnV * 3.0, 0.0, var21.field_1350 * var1.UUVNuUNUvUnV * 3.0);
      }

      return var20;
   }

   private static class_243 C00OOC00oO(class_1309 var0, class_238 var1, NNUnuvVvUv var2, long var3) {
      int var5 = var2.vvUVNVvvNUv.size();
      long var6 = (long)(var2.UvUvUNuvNU * 1000.0F / Math.max(0.1F, var2.nVVUuvuNnUN));
      if ("Cycle".equals(var2.uUVuVvuNUvnu)) {
         if (var3 >= vVvUvVVuuNvV) {
            uUnuvNvvNU = (uUnuvNvvNU + 1) % var5;
            vVvUvVVuuNvV = var3 + var6;
         }

         return UuUVuuUu(var0, var1, var2.vvUVNVvvNUv.get(Math.min(uUnuvNvvNU, var5 - 1)));
      } else if ("Random".equals(var2.uUVuVvuNUvnu)) {
         if (var3 >= vVvUvVVuuNvV) {
            uUnuvNvvNU = ThreadLocalRandom.current().nextInt(var5);
            vVvUvVVuuNvV = var3 + var6;
         }

         return UuUVuuUu(var0, var1, var2.vvUVNVvvNUv.get(Math.min(uUnuvNvvNU, var5 - 1)));
      } else {
         class_243 var8 = a_.field_1724.method_33571();
         class_243 var9 = a_.field_1724.method_5828(1.0F).method_1029();
         class_243 var10 = null;
         double var11 = Double.MAX_VALUE;

         for (NNUnuvVvUv.NVnVnNnN var14 : var2.vvUVNVvvNUv) {
            class_243 var15 = UuUVuuUu(var0, var1, var14);
            class_243 var16 = var15.method_1020(var8).method_1029();
            double var17 = Math.acos(class_3532.method_15350(var9.method_1026(var16), -1.0, 1.0));
            if (var17 < var11) {
               var11 = var17;
               var10 = var15;
            }
         }

         return var10 != null ? var10 : var1.method_1005();
      }
   }

   private static class_243 UuUVuuUu(class_1309 var0, class_238 var1, NNUnuvVvUv.NVnVnNnN var2) {
      class_243 var3 = C00OOC00oO(var0);
      double var4 = (var1.field_1323 + var1.field_1320) * 0.5;
      double var6 = (var1.field_1321 + var1.field_1324) * 0.5;
      double var8 = var1.field_1320 - var1.field_1323;
      double var10 = var1.field_1325 - var1.field_1322;
      return new class_243(
         var4 + var3.field_1352 * (var2.UuUVuuUu * var8), var1.field_1322 + var2.C00OOC00oO * var10, var6 + var3.field_1350 * (var2.UuUVuuUu * var8)
      );
   }

   private static class_243 C00OOC00oO(class_1309 var0) {
      class_243 var1 = var0.method_19538().method_1020(a_.field_1724.method_19538());
      double var2 = Math.hypot(var1.field_1352, var1.field_1350);
      return var2 < 1.0E-4 ? new class_243(1.0, 0.0, 0.0) : new class_243(-var1.field_1350 / var2, 0.0, var1.field_1352 / var2);
   }

   private static boolean uUnuvNvvNU(class_1309 var0) {
      float[] var1 = AttackAura.C00OOC00oO(var0);
      float[] var2 = new float[]{var1[0], var1[1], var1[0] + var1[1]};
      boolean var3 = oCCO0cc0C0Oc.UuUVuuUu(var0, false, true, true, -50L, var2);
      if (var3 && uvnuUUnunNn.UuUVuuUu((class_1297)var0) < AttackAura.UuUVuuUu(var0)) {
         UuUVuuUu = 2;
      }

      if (UuUVuuUu <= 0) {
         return false;
      } else {
         UuUVuuUu--;
         return true;
      }
   }

   private static float[] UuUVuuUu(NNUnuvVvUv var0, boolean var1) {
      float var2 = var1 ? var0.vNVuvnUUnuUn : UuUVuuUu(var0.nvUVNnuu, var0.UuuNnUvUuv);
      float var3 = var1 ? var0.UvnvNVnnnnNU : UuUVuuUu(var0.nUUVuvU, var0.UnUNVVVNuv);
      if ("Static".equals(var0.c0oOOCcCoC0)) {
         var3 *= 0.3F;
      }

      return new float[]{var2, var3};
   }

   private static float UuUVuuUu(float var0, float var1) {
      if (var1 < var0) {
         float var2 = var0;
         var0 = var1;
         var1 = var2;
      }

      return var1 == var0 ? var0 : var0 + ThreadLocalRandom.current().nextFloat() * (var1 - var0);
   }
}
