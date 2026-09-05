package ru.metaculture.protection;

import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.wild.mixin.acceser.GameRendererAccessor;

public final class NuunNNvUNun implements O000c0oocoo {
   private NuunNNvUNun() {
   }

   public static double UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && var0 != null) {
         class_243 var1 = a_.field_1724.method_33571();
         class_243 var2 = UuUVuuUu();
         class_238 var3 = var0.method_5829();
         double var4 = var3.field_1323;
         double var6 = var3.field_1322;
         double var8 = var3.field_1321;
         double var10 = var3.field_1320;
         double var12 = var3.field_1325;
         double var14 = var3.field_1324;
         double var16 = (var4 + var10) * 0.5;
         double var18 = (var8 + var14) * 0.5;
         double var20 = 180.0;

         for (int var22 = 0; var22 < 2; var22++) {
            double var23 = var22 == 0 ? var4 : var10;

            for (int var25 = 0; var25 < 2; var25++) {
               double var26 = var25 == 0 ? var6 : var12;

               for (int var28 = 0; var28 < 2; var28++) {
                  double var29 = var28 == 0 ? var8 : var14;
                  var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var23, var26, var29)));
               }
            }
         }

         var20 = Math.min(var20, UuUVuuUu(var1, var2, var3.method_1005()));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var16, var0.method_23320(), var18)));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var16, var12, var18)));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var16, var6, var18)));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var4, UuUVuuUu(var3), var18)));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var10, UuUVuuUu(var3), var18)));
         var20 = Math.min(var20, UuUVuuUu(var1, var2, new class_243(var16, UuUVuuUu(var3), var8)));
         return Math.min(var20, UuUVuuUu(var1, var2, new class_243(var16, UuUVuuUu(var3), var14)));
      } else {
         return 180.0;
      }
   }

   public static boolean UuUVuuUu(class_1309 var0, float var1) {
      return var0 != null && !(var1 <= 0.0F) ? UuUVuuUu(var0) <= var1 * 0.5F : false;
   }

   public static float UuUVuuUu(float var0, int var1) {
      if (a_ != null && a_.field_1773 != null && var1 > 0 && !(var0 <= 0.0F)) {
         class_4184 var2 = a_.field_1773.method_19418();
         float var3 = ((GameRendererAccessor)a_.field_1773).invokeGetFov(var2, 1.0F, true);
         float var4 = var1 * 0.5F;
         float var5 = (float)Math.toRadians(var3 * 0.5F);
         float var6 = (float)Math.toRadians(var0 * 0.5F);
         return var5 <= 1.0E-4F ? 0.0F : var4 / (float)Math.tan(var5) * (float)Math.tan(var6);
      } else {
         return 0.0F;
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, float var1, int var2, int var3) {
      if (var0 != null && var2 > 0 && var3 > 0) {
         float var4 = UuUVuuUu(var1, var3);
         if (!(var4 <= 1.0F)) {
            float var5 = var2 * 0.5F;
            float var6 = var3 * 0.5F;
            int var7 = UuUVuuUu(255, 255, 255, 210);
            var0.UuUVuuUu(var5 - var4, var6 - var4, var4 * 2.0F, var4 * 2.0F, var4, var7, 1.2F);
         }
      }
   }

   private static class_243 UuUVuuUu() {
      if (a_.field_1773 != null && a_.field_1773.method_19418() != null) {
         class_4184 var0 = a_.field_1773.method_19418();
         Vector3f var1 = new Vector3f(0.0F, 0.0F, -1.0F);
         new Quaternionf(var0.method_23767()).transform(var1);
         return new class_243(var1.x, var1.y, var1.z).method_1029();
      } else {
         return a_.field_1724 != null ? a_.field_1724.method_5828(1.0F).method_1029() : new class_243(0.0, 0.0, 1.0);
      }
   }

   private static double UuUVuuUu(class_238 var0) {
      return (var0.field_1322 + var0.field_1325) * 0.5;
   }

   private static double UuUVuuUu(class_243 var0, class_243 var1, class_243 var2) {
      class_243 var3 = var2.method_1020(var0);
      double var4 = var3.method_1033();
      if (var4 < 1.0E-6) {
         return 0.0;
      } else {
         var3 = var3.method_1021(1.0 / var4);
         double var6 = class_3532.method_15350(var1.method_1026(var3), -1.0, 1.0);
         return Math.toDegrees(Math.acos(var6));
      }
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
   }
}
