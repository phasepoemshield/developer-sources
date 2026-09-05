package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class UnnVuuvN implements O000c0oocoo {
   private static final double UuUVuuUu = 0.27;
   private static final double C00OOC00oO = 0.24;
   private static final double uUnuvNvvNU = 0.26;
   private static final double vVvUvVVuuNvV = 0.2;
   private static final double uNNnnnuuuN = 0.15;
   private static final double nuUnNvnuUu = 0.2;
   private static final double VVuuUN = 0.09;
   private static final double vNUvnnVnUvu = 0.2;
   private static final double uVUuuVnNVU = 0.12;
   private static final double vuuuNvNuv = 0.4;
   private static final long nUUVuvU = 80L;
   private static final int UnUNVVVNuv = 200;
   private static final double vNVuvnUUnuUn = 3.0;
   private static final double UvnvNVnnnnNU = 0.35;
   private static final double uVUVnuvnuVuv = 1.0;
   private static final float NVNnnvnuunNv = 38.0F;
   private static final float uVunuUNVVUUV = 43.0F;
   private static final float UNnVVNvvnVvU = 3.0F;
   private static final float uNnUnnuNUnNu = 5.0F;
   private static final float NnUuNNU = 55.0F;
   private static final float nNvNUVU = 70.0F;
   private static final float UnUNuUU = 8.0F;
   private static final float uUVuVvuNUvnu = 12.0F;
   private static final float UvUvUNuvNU = 30.0F;
   private static final long c0oOOCcCoC0 = 100L;
   private static final int VVnVNnunVvu = 1;
   private static final int unNNVVNnvvV = 15;
   private static final long NuunnvnN = 50L;
   private static final float NVUunUNUN = 20.0F;
   private static final float UUVNuUNUvUnV = 4.0F;
   private static long vuvnUnVnUNnV;
   private static long nnuUVNUuvvVU;
   private static long nVVUuvuNnUN = -1L;
   private static double nNnVnUNVV = 0.27;
   private static double nuunNvv = 0.24;
   private static double uUVVvVVNvvn = 0.26;

   private UnnVuuvN() {
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && var0 != null) {
         vVvUvVVuuNvV();
         long var1 = System.currentTimeMillis();
         if (nVVUuvuNnUN < 0L) {
            nVVUuvuNnUN = var1;
         }

         float var3 = class_3532.method_15363((float)(var1 - nVVUuvuNnUN) / 50.0F, 0.0F, 4.0F);
         nVVUuvuNnUN = var1;
         if (var3 <= 0.0F) {
            var3 = 0.05F;
         }

         float var4 = AttackAura.NVNnnvnuunNv.uUnuvNvvNU();
         double var5 = var0.method_17681();
         double var7 = var0.method_17682();
         double var9 = a_.field_1724.method_33571().method_1022(var0.method_19538().method_1031(0.0, var7 * 0.5, 0.0));
         double var11 = class_3532.method_15350(var9 / Math.max(3.0, (double)var4), 0.35, 1.0);
         double var13 = (nNnVnUNVV - 0.4) * var5 * var11;
         double var15 = (uUVVvVVNvvn - 0.4) * var5 * var11;
         class_243 var17 = var0.method_19538().method_1031(var13, var7 * nuunNvv, var15);
         class_243 var18 = var17.method_1020(a_.field_1724.method_33571());
         float var19 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var18.field_1350, var18.field_1352)) - 90.0);
         float var20 = (float)class_3532.method_15350(
            -Math.toDegrees(Math.atan2(var18.field_1351, Math.hypot(var18.field_1352, var18.field_1350))), -89.0, 89.0
         );
         boolean var21 = var1 < nnuUVNUuvvVU;
         float var22 = VnNnNnvuvn.uUnuvNvvNU(-3.0F, 3.0F) + (float)(3.0 * Math.cos(var1 / 40.0));
         float var23 = VnNnNnvuvn.uUnuvNvvNU(-1.0F, 1.0F) + (float)(4.0 * Math.sin(var1 / 240.0));
         float var24 = 0.0F;
         if (var21) {
            var24 = VnNnNnvuvn.uUnuvNvvNU(-3.0F, 4.0F) + (float)(2.0 * Math.sin(var1 / 30.0));
         }

         float var25 = VnNnNnvuvn.uUnuvNvvNU(38.0F, 43.0F);
         float var26 = VnNnNnvuvn.uUnuvNvvNU(3.0F, 5.0F);
         if (var21) {
            var25 = VnNnNnvuvn.uUnuvNvvNU(55.0F, 70.0F);
            var26 = VnNnNnvuvn.uUnuvNvvNU(8.0F, 12.0F);
         }

         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var19 + var22 + var24, var20 + var23), var25 * var3, var26 * var3, 30.0F, 30.0F, 1, 15, false);
      }
   }

   public static void UuUVuuUu() {
      nnuUVNUuvvVU = System.currentTimeMillis() + 100L;
   }

   public static void C00OOC00oO() {
      uUnuvNvvNU();
   }

   public static void uUnuvNvvNU() {
      vuvnUnVnUNnV = 0L;
      nnuUVNUuvvVU = 0L;
      nVVUuvuNnUN = -1L;
      nNnVnUNVV = 0.27;
      nuunNvv = 0.24;
      uUVVvVVNvvn = 0.26;
   }

   private static void vVvUvVVuuNvV() {
      long var0 = System.currentTimeMillis();
      if (var0 >= vuvnUnVnUNnV) {
         ThreadLocalRandom var2 = ThreadLocalRandom.current();
         nNnVnUNVV = 0.2 + var2.nextDouble() * 0.15;
         nuunNvv = 0.2 + var2.nextDouble() * 0.09;
         uUVVvVVNvvn = 0.2 + var2.nextDouble() * 0.12;
         vuvnUnVnUNnV = var0 + 80L + var2.nextInt(200);
      }
   }
}
