package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class vnvuNnvVuNn {
   public static class_310 UuUVuuUu = class_310.method_1551();

   public static void UuUVuuUu(uNVVnVUNun var0, class_2338 var1, nNUuNvVn var2, float var3) {
      if (UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null && var1 != null) {
         class_243 var4 = UuUVuuUu.field_1724.method_19538();
         class_243 var5 = new class_243(var1.method_10263() + 0.5, UuUVuuUu.field_1724.method_23318(), var1.method_10260() + 0.5);
         double var6 = var4.method_1022(var5);
         if (var6 <= var2.uUnuvNvvNU()) {
            var0.UuUVuuUu(0.0F);
            var0.C00OOC00oO(0.0F);
            var0.UuUVuuUu(false);
            var0.C00OOC00oO(false);
         } else {
            float var8 = (float)Math.toDegrees(Math.atan2(var5.field_1350 - var4.field_1350, var5.field_1352 - var4.field_1352)) - 90.0F;
            vnvuNnvVuNn.NVnVnNnN var9 = UuUVuuUu(var3, 1.2, 0.4);
            boolean var10 = UuUVuuUu();
            var0.C00OOC00oO(var10);
            float var11 = 0.0F;
            if (!var10 && var9.hitSolid) {
               float var12 = UuvVnuU.VVuuUN(var8 - var3);
               var11 = var12 > 0.0F ? -0.8F : 0.8F;
            }

            boolean var13 = !var10 && UuUVuuUu(var3);
            var0.UuUVuuUu(var13);
            UuUVuuUu(var0, var3, var8, var11);
         }
      }
   }

   private static vnvuNnvVuNn.NVnVnNnN UuUVuuUu(float var0, double var1, double var3) {
      if (UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null) {
         class_243 var5 = UuUVuuUu.field_1724.method_33571().method_1031(0.0, var3, 0.0);
         double var6 = -Math.sin(Math.toRadians(var0));
         double var8 = Math.cos(Math.toRadians(var0));
         class_243 var10 = new class_243(var6, 0.0, var8).method_1029();
         class_243 var11 = var5.method_1019(var10.method_1021(var1));
         class_3959 var12 = new class_3959(var5, var11, class_3960.field_17559, class_242.field_1348, UuUVuuUu.field_1724);
         class_3965 var13 = UuUVuuUu.field_1687.method_17742(var12);
         if (var13.method_17783() != class_240.field_1332) {
            return new vnvuNnvVuNn.NVnVnNnN(false, class_2338.field_10980);
         } else {
            class_2338 var14 = var13.method_17777();
            class_2680 var15 = UuUVuuUu.field_1687.method_8320(var14);
            boolean var16 = !var15.method_26215() && !var15.method_26220(UuUVuuUu.field_1687, var14).method_1110();
            return new vnvuNnvVuNn.NVnVnNnN(var16, var14);
         }
      } else {
         return new vnvuNnvVuNn.NVnVnNnN(false, class_2338.field_10980);
      }
   }

   public static boolean UuUVuuUu(float var0) {
      if (UuUVuuUu.field_1724 == null || UuUVuuUu.field_1687 == null) {
         return false;
      } else if (!UuUVuuUu.field_1724.method_24828()) {
         return false;
      } else {
         class_243 var1 = UuUVuuUu.field_1724.method_19538();
         double var2 = -Math.sin(Math.toRadians(var0));
         double var4 = Math.cos(Math.toRadians(var0));
         class_2338 var6 = class_2338.method_49638(var1);
         class_2338 var7 = class_2338.method_49637(var1.field_1352 + var2 * 0.8, var1.field_1351, var1.field_1350 + var4 * 0.8);
         class_2338 var8 = var7.method_10084();
         class_2680 var9 = UuUVuuUu.field_1687.method_8320(var7);
         class_2680 var10 = UuUVuuUu.field_1687.method_8320(var8);
         double var11 = var7.method_10264() - var6.method_10264();
         if (!(var11 < 0.6) && !(var11 > 1.25)) {
            boolean var13 = !var9.method_26215() && !var9.method_26220(UuUVuuUu.field_1687, var7).method_1110();
            boolean var14 = var10.method_26215() || var10.method_26220(UuUVuuUu.field_1687, var8).method_1110();
            if (var13 && var14) {
               class_2338 var15 = var7.method_10069((int)Math.signum(var2), 0, (int)Math.signum(var4));
               class_2338 var16 = var15.method_10074();
               class_2680 var17 = UuUVuuUu.field_1687.method_8320(var16);
               return !var17.method_26215() && !var17.method_26220(UuUVuuUu.field_1687, var16).method_1110();
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static void UuUVuuUu(class_2338 var0, nNUuNvVn var1, nNUuNvVn var2) {
      if (var0 != null && UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null) {
         class_243 var3 = UuUVuuUu.field_1724.method_33571();
         class_243 var4 = class_243.method_24953(var0);
         class_243 var5 = var4.method_1020(var3).method_1029();
         float var6 = (float)Math.toDegrees(Math.atan2(-var5.field_1352, var5.field_1350));
         float var7 = (float)(-Math.toDegrees(Math.atan2(var5.field_1351, Math.sqrt(var5.field_1352 * var5.field_1352 + var5.field_1350 * var5.field_1350))));
         long var8 = System.currentTimeMillis();
         float var10 = var2.uUnuvNvvNU();
         float var11 = (float)Math.sin(var8 / 50.0) * var10;
         float var12 = (float)Math.cos(var8 / 40.0) * var10 * 10.0F;
         float var13 = (float)Math.sin(var8 / 40.0) * var10 * 0.5F;
         float var14 = var11 + var12;
         float var15 = var13 * 5.0F;
         uuUuvNuNVNVU var16 = new uuUuvNuNVNVU(var6 + var14, var7 + var15);
         COC0OCc.UuUVuuUu(var16, var1.uUnuvNvvNU(), var1.uUnuvNvvNU(), 30.0F, 30.0F, 0, 18, false);
      }
   }

   public static void C00OOC00oO(class_2338 var0, nNUuNvVn var1, nNUuNvVn var2) {
      if (var0 != null && UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null) {
         class_243 var3 = UuUVuuUu.field_1724.method_33571();
         class_243 var4 = class_243.method_24953(var0);
         class_243 var5 = var4.method_1020(var3).method_1029();
         float var6 = (float)Math.toDegrees(Math.atan2(-var5.field_1352, var5.field_1350));
         float var7 = (float)(-Math.toDegrees(Math.atan2(var5.field_1351, Math.sqrt(var5.field_1352 * var5.field_1352 + var5.field_1350 * var5.field_1350))));
         long var8 = System.currentTimeMillis();
         float var10 = (float)Math.sin(var8 / 200.0) * 0.8F;
         uuUuvNuNVNVU var11 = new uuUuvNuNVNVU(var6 + var10 * 0.3F, var7 + var10 * 0.2F);
         COC0OCc.UuUVuuUu(var11, var1.uUnuvNvvNU() * 1.5F, var1.uUnuvNvvNU() * 1.2F, 30.0F, 30.0F, 0, 10, false);
      }
   }

   public static boolean UuUVuuUu(class_2338 var0, float var1) {
      if (var0 != null && UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null) {
         class_243 var2 = UuUVuuUu.field_1724.method_33571();
         class_243 var3 = class_243.method_24953(var0);
         class_243 var4 = var3.method_1020(var2).method_1029();
         float var5 = (float)Math.toDegrees(Math.atan2(-var4.field_1352, var4.field_1350));
         float var6 = (float)(-Math.toDegrees(Math.atan2(var4.field_1351, Math.sqrt(var4.field_1352 * var4.field_1352 + var4.field_1350 * var4.field_1350))));
         float var7 = Math.abs(UuvVnuU.VVuuUN(var5 - UuUVuuUu.field_1724.method_36454()));
         float var8 = Math.abs(UuvVnuU.VVuuUN(var6 - UuUVuuUu.field_1724.method_36455()));
         return var7 <= var1 && var8 <= var1;
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu(class_2338 var0, long var1, nNUuNvVn var3, nNUuNvVn var4) {
      if (var0 != null && UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null) {
         double var5 = UuUVuuUu.field_1724.method_5649(var0.method_10263() + 0.5, var0.method_10264() + 0.5, var0.method_10260() + 0.5);
         if (var5 > var4.uUnuvNvvNU() * var4.uUnuvNvvNU()) {
            return false;
         } else if ((float)(System.currentTimeMillis() - var1) < var3.uUnuvNvvNU()) {
            return false;
         } else {
            UuUVuuUu.field_1761.method_2910(var0, class_2350.field_11036);
            UuUVuuUu.field_1724.method_6104(class_1268.field_5808);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu(class_2338 var0, class_1792 var1, long var2) {
      if (var0 != null && UuUVuuUu.field_1724 != null && UuUVuuUu.field_1687 != null && var1 != null) {
         if (System.currentTimeMillis() - var2 < 600L) {
            return false;
         } else {
            class_1268 var4 = null;
            if (UuUVuuUu.field_1724.method_6079().method_7909() == var1) {
               var4 = class_1268.field_5810;
            } else if (UuUVuuUu.field_1724.method_6047().method_7909() == var1) {
               var4 = class_1268.field_5808;
            }

            if (var4 == null) {
               return false;
            } else {
               class_2338 var5 = var0.method_10084();
               if (!UuUVuuUu.field_1687.method_8320(var5).method_45474()) {
                  return false;
               } else {
                  class_243 var6 = class_243.method_24953(var0).method_1019(class_243.method_24954(class_2350.field_11036.method_62675()).method_1021(0.5));
                  class_3965 var7 = new class_3965(var6, class_2350.field_11036, var0, false);
                  UuUVuuUu.field_1761.method_2896(UuUVuuUu.field_1724, var4, var7);
                  UuUVuuUu.field_1724.method_6104(var4);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu() {
      if (UuUVuuUu.field_1724 == null || UuUVuuUu.field_1687 == null) {
         return false;
      } else if (UuUVuuUu.field_1724.method_24828()) {
         return false;
      } else {
         class_243 var0 = UuUVuuUu.field_1724.method_19538();
         class_2338 var1 = class_2338.method_49637(var0.field_1352, var0.field_1351 - 1.0, var0.field_1350);
         if (UuUVuuUu(var1, 3)) {
            return true;
         } else {
            float var2 = UuUVuuUu.field_1724.method_36454();
            double var3 = -Math.sin(Math.toRadians(var2));
            double var5 = Math.cos(Math.toRadians(var2));
            class_243 var7 = var0.method_1031(var3 * 0.8, 0.0, var5 * 0.8);
            class_2338 var8 = class_2338.method_49637(var7.field_1352, var7.field_1351 - 1.0, var7.field_1350);
            return UuUVuuUu(var8, 3);
         }
      }
   }

   public static boolean UuUVuuUu(class_2338 var0, int var1) {
      if (UuUVuuUu.field_1687 == null) {
         return false;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < var1; var3++) {
            class_2338 var4 = var0.method_10087(var3);
            class_2680 var5 = UuUVuuUu.field_1687.method_8320(var4);
            if (UuUVuuUu(var5, var4) || !var5.method_26215() && !var5.method_26220(UuUVuuUu.field_1687, var4).method_1110()) {
               break;
            }

            var2++;
         }

         return var2 >= var1;
      }
   }

   private static boolean UuUVuuUu(class_2680 var0, class_2338 var1) {
      if (var0.method_26215()) {
         return false;
      } else {
         class_2248 var2 = var0.method_26204();
         if (var2 == class_2246.field_10362) {
            return true;
         } else if (var2 == class_2246.field_10114) {
            return true;
         } else {
            return var2 == class_2246.field_10194 ? true : !var0.method_26220(UuUVuuUu.field_1687, var1).method_1110();
         }
      }
   }

   private static void UuUVuuUu(uNVVnVUNun var0, float var1, float var2, float var3) {
      float var4 = var0.uUnuvNvvNU();
      float var5 = var0.vVvUvVVuuNvV();
      double var6 = UuvVnuU.VVuuUN((float)Math.toDegrees(UuUVuuUu(var1, var4, var5)));
      if (var4 == 0.0F && var5 == 0.0F) {
         var0.UuUVuuUu(1.0F);
         var0.C00OOC00oO(var3);
      } else {
         float var8 = 0.0F;
         float var9 = 0.0F;
         float var10 = Float.MAX_VALUE;

         for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
            for (float var12 = -1.0F; var12 <= 1.0F; var12++) {
               if (var11 != 0.0F || var12 != 0.0F) {
                  double var13 = UuvVnuU.VVuuUN((float)Math.toDegrees(UuUVuuUu(var2, var11, var12)));
                  float var15 = (float)Math.abs(var6 - var13);
                  if (var15 < var10) {
                     var10 = var15;
                     var8 = var11;
                     var9 = var12 + var3;
                  }
               }
            }
         }

         var0.UuUVuuUu(var8);
         var0.C00OOC00oO(var9);
      }
   }

   private static double UuUVuuUu(float var0, float var1, float var2) {
      if (var1 == 0.0F && var2 == 0.0F) {
         return 0.0;
      } else {
         double var3 = Math.atan2(var2, var1);
         return var3 + Math.toRadians(var0);
      }
   }

   record NVnVnNnN(boolean hitSolid, class_2338 hitPos) {
   }
}
