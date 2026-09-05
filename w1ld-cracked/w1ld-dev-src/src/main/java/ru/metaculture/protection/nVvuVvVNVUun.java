package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import lombok.Generated;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_4050;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class nVvuVvVNVUun implements O000c0oocoo {
   public static double UuUVuuUu(double var0, double var2, double var4) {
      return Math.min(var4, Math.max(var0, var2));
   }

   public static int UuUVuuUu(int var0, int var1, float var2) {
      return var0 + (int)(var2 * (var1 - var0));
   }

   public static double C00OOC00oO(double var0, double var2, double var4) {
      return var0 + var4 * (var2 - var0);
   }

   public static class_239 UuUVuuUu(class_243 var0, class_243 var1, class_3960 var2, class_242 var3) {
      return a_.field_1687.method_17742(new class_3959(var0, var1, var2, var3, a_.field_1724));
   }

   private static double UuUVuuUu(class_746 var0, double var1, double var3) {
      double var5 = var0.method_23317() - var1;
      double var7 = var0.method_23321() - var3;
      return class_3532.method_15355((float)(var5 * var5 + var7 * var7));
   }

   private static boolean UuUVuuUu(class_746 var0, double var1, double var3, double var5) {
      class_243 var7 = new class_243(var1, var3, var5);
      return a_.field_1687 != null && UuUVuuUu(var0.method_33571(), var7, class_3960.field_17558, class_242.field_1348).method_17783() != class_240.field_1332;
   }

   private static boolean UuUVuuUu(class_746 var0, class_243 var1) {
      class_243 var2 = new class_243(var0.method_23317(), var0.method_23320(), var0.method_23321());
      return a_.field_1687 != null && UuUVuuUu(var2, var1, class_3960.field_17558, class_242.field_1348).method_17783() != class_240.field_1332;
   }

   private static boolean UuUVuuUu(class_746 var0, class_243 var1, float var2) {
      return var2 == 0.0F
         ? UuUVuuUu(var0, var1.field_1352, var1.field_1351, var1.field_1350)
         : UuUVuuUu(var0, var1.field_1352, var1.field_1351, var1.field_1350)
            && UuUVuuUu(var0, var1.field_1352, var1.field_1351 + var2, var1.field_1350)
            && UuUVuuUu(var0, var1.field_1352, var1.field_1351 - var2, var1.field_1350)
            && UuUVuuUu(var0, var1.field_1352 + var2, var1.field_1351, var1.field_1350)
            && UuUVuuUu(var0, var1.field_1352 - var2, var1.field_1351, var1.field_1350)
            && UuUVuuUu(var0, var1.field_1352, var1.field_1351, var1.field_1350 + var2)
            && UuUVuuUu(var0, var1.field_1352, var1.field_1351, var1.field_1350 - var2);
   }

   public static List<class_243> UuUVuuUu(class_238 var0) {
      ArrayList var1 = new ArrayList();
      double var2 = 0.01F;
      byte var4 = 17;
      byte var5 = 5;
      byte var6 = 24;
      byte var7 = 6;
      var0 = var0.method_989(-var2, -var2, -var2);
      double[] var8 = new double[]{var0.field_1320 - var0.field_1323, var0.field_1325 - var0.field_1322, (var0.field_1325 - var0.field_1322) / 1.05};
      double[] var9 = new double[]{var0.field_1323 + var8[0] / 2.0, var0.field_1322, var0.field_1321 + var8[0] / 2.0};
      double[] var10 = new double[]{var0.field_1323, var0.field_1322, var0.field_1321};
      double[] var11 = new double[]{var0.field_1320, var0.field_1325, var0.field_1324};
      float var12 = (float)Math.sqrt(var8[0] * var8[0] + var8[0] * var8[0] + var8[0] * var8[0]) / 2.0F;
      class_746 var13 = a_.field_1724;
      if (var13 == null) {
         return null;
      } else {
         float var14 = (float)(
            (1.0 - Math.min(var13.method_19538().method_1022(new class_243(var9[0], var9[1], var9[2])) / 5.0, 1.0))
               * Math.min(var13.method_19538().method_1022(new class_243(var9[0], var13.method_23318(), var9[2])) / 0.6F, 1.0)
         );
         int var15 = UuUVuuUu(var5, var4, var14);
         int var16 = UuUVuuUu(var7, var6, var14);
         float var17 = 0.0F;
         int[] var18 = IntStream.range(0, var15).toArray();
         int var19 = var18.length;

         for (int var20 = 0; var20 < var19; var20++) {
            Integer var21 = var18[var20];
            boolean var22 = var21 == 0 || var21 == var15 - 1;
            double var23 = C00OOC00oO(var10[0], var11[0], (float)var21.intValue() / (var15 - 1));
            int[] var25 = IntStream.range(0, var15).toArray();
            int var26 = var25.length;

            for (int var27 = 0; var27 < var26; var27++) {
               Integer var28 = var25[var27];
               boolean var29 = var28 == 0 || var28 == var15 - 1;
               double var30 = C00OOC00oO(var10[2], var11[2], (float)var28.intValue() / (var15 - 1));
               int[] var32 = IntStream.range(0, var16).toArray();
               int var33 = var32.length;

               for (int var34 = 0; var34 < var33; var34++) {
                  Integer var35 = var32[var34];
                  boolean var36 = var35 == 0 || var35 == var16 - 1;
                  double var37 = C00OOC00oO(var10[1], var11[1], (float)var35.intValue() / (var16 - 1));
                  class_243 var39 = new class_243(var23, var37, var30);
                  if ((var22 || var29 || var36)
                     && !(var13.method_19538().method_1022(var39.method_1031(0.0, -var13.method_18381(class_4050.field_18076), 0.0)) < var12)
                     && UuUVuuUu(var13, var39, var17)
                     && !var1.add(var39)) {
                     break;
                  }
               }
            }
         }

         return var1;
      }
   }

   private static double UuUVuuUu(class_243 var0, class_243 var1) {
      double var2;
      double var4;
      double var6;
      return Math.sqrt(
         (var2 = var0.field_1352 - var1.field_1352) * var2
            + (var4 = var0.field_1351 - var1.field_1351) * var4
            + (var6 = var0.field_1350 - var1.field_1350) * var6
      );
   }

   public static class_243 C00OOC00oO(class_238 var0) {
      return UuUVuuUu(var0, true);
   }

   public static class_243 UuUVuuUu(class_238 var0, boolean var1) {
      if (var0 == null) {
         return a_.field_1724.method_33571();
      } else {
         double[] var2 = new double[]{var0.field_1320 - var0.field_1323, var0.field_1325 - var0.field_1322, (var0.field_1325 - var0.field_1322) / 1.1F};
         double[] var3 = new double[]{var0.field_1323 + var2[0] / 2.0, var0.field_1322, var0.field_1321 + var2[0] / 2.0};
         double[] var4 = new double[]{a_.field_1724.method_23318() - var3[1], UuUVuuUu(a_.field_1724, var3[0], var3[2])};
         double var5 = UuUVuuUu(VvVUUNUu.UnUNVVVNuv.ease((var4[1] - var2[0] / 2.0) / (5.0 + var2[0] / 2.0)), 0.1, 0.95);
         double var7 = UuUVuuUu(var5 * var5, 0.0, 1.0);
         double var9 = UuUVuuUu(var2[2] / 2.0 * var7 + var2[2] / 2.0 * UuUVuuUu(var4[0] + var7, 0.0, 1.0), 0.0, var2[2]);
         class_243 var11 = new class_243(var3[0], var3[1] + var9, var3[2]);
         if (!var1 && !UuUVuuUu(a_.field_1724, var11)) {
            var11 = var11.method_1031(0.0, -var9 / 2.0, 0.0);
         }

         if (!(var2[1] <= 1.0) && (var1 || !UuUVuuUu(a_.field_1724, var11))) {
            List var12 = UuUVuuUu(var0);
            float var13 = 1.0F - (float)Math.max(Math.min((var4[1] - 2.0) / 3.0, 1.0), 0.0);
            class_243 var14 = new class_243(
               a_.field_1724.method_23317(), a_.field_1724.method_23318() + 0.6F + C00OOC00oO(var9, var9 / 2.5, var13), a_.field_1724.method_23321()
            );
            if (var12 != null && var12.size() > 1) {
               var12.sort(Comparator.comparing(var1x -> UuUVuuUu(var14, var1x)));
            }

            return var12 != null && !var12.isEmpty() ? (class_243)var12.get(0) : var11;
         } else {
            return var11;
         }
      }
   }

   @Generated
   private nVvuVvVNVUun() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
