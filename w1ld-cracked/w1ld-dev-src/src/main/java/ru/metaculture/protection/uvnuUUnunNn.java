package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import org.joml.Vector2f;
import org.joml.Vector4f;

public final class uvnuUUnunNn implements O000c0oocoo {
   public static double UuUVuuUu(class_1297 var0) {
      return C00OOC00oO(var0).method_1033();
   }

   public static uuUuvNuNVNVU UuUVuuUu() {
      return new uuUuvNuNVNVU(a_.field_1724.method_36454(), a_.field_1724.method_36455());
   }

   public static boolean UuUVuuUu(class_1297 var0, float var1, boolean var2) {
      return UuUVuuUu(var0) < var1;
   }

   public static class_243 C00OOC00oO(class_1297 var0) {
      class_243 var1 = a_.field_1724.method_33571();
      return UuUVuuUu(var1, var0).method_1020(var1);
   }

   public static class_243 UuUVuuUu(class_243 var0, class_238 var1) {
      return new class_243(
         UuvVnuU.vVvUvVVuuNvV(var0.field_1352, var1.field_1323, var1.field_1320),
         UuvVnuU.vVvUvVVuuNvV(var0.field_1351, var1.field_1322, var1.field_1325),
         UuvVnuU.vVvUvVVuuNvV(var0.field_1350, var1.field_1321, var1.field_1324)
      );
   }

   public static class_243 UuUVuuUu(class_243 var0, class_1297 var1) {
      return UuUVuuUu(var0, var1.method_5829());
   }

   public static class_243 UuUVuuUu(class_1309 var0) {
      double var1 = var0.method_17681() / 2.0F;
      double var3 = class_3532.method_15350(var0.method_23318() - 6.0, 0.0, var0.method_17682());
      double var5 = class_3532.method_15350(a_.field_1724.method_23317() - var0.method_23317(), -var1, var1);
      double var7 = class_3532.method_15350(a_.field_1724.method_23321() - var0.method_23321(), -var1, var1);
      return new class_243(
         var0.method_23317() - a_.field_1724.method_23317() + var5,
         var0.method_23318() - a_.field_1724.method_23318() - 0.8F,
         var0.method_23321() - a_.field_1724.method_23321() + var7
      );
   }

   public static class_243 C00OOC00oO(class_1309 var0) {
      double var1 = class_3532.method_15350(var0.method_23318() - var0.method_23318(), 0.0, var0.method_17682());
      double var3 = class_3532.method_15350(a_.field_1724.method_23317() - var0.method_23317(), 0.0, 0.0);
      double var5 = class_3532.method_15350(a_.field_1724.method_23321() - var0.method_23321(), 0.0, 0.0);
      return new class_243(
         var0.method_23317() - a_.field_1724.method_23317() + var3,
         var0.method_23318() - a_.field_1724.method_23318() - 0.8F,
         var0.method_23321() - a_.field_1724.method_23321() + var5
      );
   }

   public static class_243 uUnuvNvvNU(class_1309 var0) {
      double var1 = class_3532.method_15350(var0.method_23320() - var0.method_23318(), 0.0, var0.method_17682());
      double var3 = class_3532.method_15350(a_.field_1724.method_23317() - var0.method_23317(), 0.0, 0.0);
      double var5 = class_3532.method_15350(a_.field_1724.method_23321() - var0.method_23321(), 0.0, 0.0);
      return new class_243(
         var0.method_23317() - a_.field_1724.method_23317() + var3,
         var0.method_23318() - a_.field_1724.method_23320() + var1,
         var0.method_23321() - a_.field_1724.method_23321() + var5
      );
   }

   public static class_243 vVvUvVVuuNvV(class_1309 var0) {
      double var1 = var0.method_17681() / 2.0F;
      double var3 = class_3532.method_15350(var0.method_23320() - var0.method_23318(), 0.0, var0.method_17682());
      double var5 = class_3532.method_15350(a_.field_1724.method_23317() - var0.method_23317(), -var1, var1);
      double var7 = class_3532.method_15350(a_.field_1724.method_23321() - var0.method_23321(), -var1, var1);
      return new class_243(
         var0.method_23317() - a_.field_1724.method_23317() + var5,
         var0.method_23318() - a_.field_1724.method_23320() + var3,
         var0.method_23321() - a_.field_1724.method_23321() + var7
      );
   }

   public static double UuUVuuUu(float var0, float var1, float var2) {
      if (var1 < 0.0F) {
         var0 += 180.0F;
      }

      float var3 = 1.0F;
      if (var1 < 0.0F) {
         var3 = -0.5F;
      }

      if (var1 > 0.0F) {
         var3 = 0.5F;
      }

      if (var2 > 0.0F) {
         var0 -= 90.0F * var3;
      }

      if (var2 < 0.0F) {
         var0 += 90.0F * var3;
      }

      return Math.toRadians(var0);
   }

   public static class_243 UuUVuuUu(class_243 var0, class_1297 var1, float var2) {
      if (var1 == null) {
         return class_243.field_1353;
      } else {
         class_238 var3 = var1.method_5829().method_1014(-var2);
         class_243 var4 = var3.method_1005();
         class_243 var5 = null;
         double var6 = Double.MAX_VALUE;

         for (double var8 = 0.0; var8 <= (var3.field_1320 - var3.field_1323) / 2.0; var8 += 0.1) {
            for (double var10 = 0.0; var10 <= (var3.field_1325 - var3.field_1322) / 2.0; var10 += 0.1) {
               for (double var12 = 0.0; var12 <= (var3.field_1324 - var3.field_1321) / 2.0; var12 += 0.1) {
                  for (int var17 : new int[]{-1, 1}) {
                     for (int var21 : new int[]{-1, 1}) {
                        for (int var25 : new int[]{-1, 1}) {
                           double var26 = var4.field_1352 + var17 * var8;
                           double var28 = var4.field_1351 + var21 * var10;
                           double var30 = var4.field_1350 + var25 * var12;
                           class_243 var32 = new class_243(var26, var28, var30);
                           Vector2f var33 = UuUVuuUu(var32);
                           if (VuUVUvnU.UuUVuuUu(6.0, var33.x, var33.y, a_.field_1724, false) instanceof class_3966 var35 && var35.method_17782().equals(var1)) {
                              double var36 = var0.method_1022(var32);
                              if (var36 < var6) {
                                 var6 = var36;
                                 var5 = var32;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var5 != null) {
            return var5;
         } else {
            double var38 = UuvVnuU.vVvUvVVuuNvV(var0.field_1352, var3.field_1323, var3.field_1320);
            double var39 = UuvVnuU.vVvUvVVuuNvV(var0.field_1351, var3.field_1322, var3.field_1325);
            double var40 = UuvVnuU.vVvUvVVuuNvV(var0.field_1350, var3.field_1321, var3.field_1324);
            return new class_243(var38, var39, var40);
         }
      }
   }

   public static Vector2f UuUVuuUu(class_243 var0) {
      return UuUVuuUu(a_.field_1724.method_19538().method_1031(0.0, a_.field_1724.method_23320(), 0.0), var0);
   }

   public static Vector2f UuUVuuUu(class_243 var0, class_243 var1) {
      double var2 = 180.0 / Math.PI;
      class_243 var4 = var1.method_1020(var0);
      double var5 = Math.hypot(var4.field_1352, var4.field_1350);
      float var7 = (float)(UuvVnuU.uUnuvNvvNU(var4.field_1350, var4.field_1352) * (180.0 / Math.PI)) - 90.0F;
      float var8 = (float)(-(UuvVnuU.uUnuvNvvNU(var4.field_1351, var5) * (180.0 / Math.PI)));
      return new Vector2f(var7, var8);
   }

   public static class_243 uUnuvNvvNU(class_1297 var0) {
      float var1 = a_.method_61966().method_60637(false);
      return UuUVuuUu(a_.field_1724.method_5836(var1), var0, Math.min(var0.method_17681(), var0.method_17682()) / 4.0F);
   }

   public static Vector4f uNNnnnuuuN(class_1309 var0) {
      float var1 = a_.method_61966().method_60637(false);
      class_243 var2 = a_.field_1724.method_5836(var1);
      class_243 var3 = uUnuvNvvNU((class_1297)var0).method_1020(var2);
      float var4 = UuvVnuU.VVuuUN((float)(Math.toDegrees(Math.atan2(var3.field_1350, var3.field_1352)) - 90.0));
      float var5 = (float)(-Math.toDegrees(Math.atan2(var3.field_1351, Math.sqrt(var3.field_1352 * var3.field_1352 + var3.field_1350 * var3.field_1350))));
      float var6 = UuvVnuU.VVuuUN(var4 - a_.field_1724.method_36454());
      float var7 = var5 - a_.field_1724.method_36455();
      return new Vector4f(var4, var5, var6, var7);
   }

   public static double nuUnNvnuUu(class_1309 var0) {
      Vector4f var1 = uNNnnnuuuN(var0);
      float var2 = var1.z;
      float var3 = var1.w;
      return Math.sqrt(var2 * var2 + var3 * var3);
   }

   @Generated
   private uvnuUUnunNn() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
