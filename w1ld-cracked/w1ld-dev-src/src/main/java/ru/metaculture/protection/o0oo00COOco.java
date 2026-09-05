package ru.metaculture.protection;

import java.security.SecureRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class o0oo00COOco implements O000c0oocoo {
   private static final SecureRandom UuUVuuUu = new SecureRandom();
   private static float C00OOC00oO = 24.0F;
   private static float uUnuvNvvNU = 6.0F;

   private o0oo00COOco() {
   }

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 != null && var0 != null) {
         class_243 var1 = uvnuUUnunNn.uUnuvNvvNU(var0);
         float var2 = UuUVuuUu(35.0F, 40.0F);
         float var3 = UuUVuuUu(4.0F, 8.0F);
         float var4 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
         float var5 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))), -90.0, 90.0);
         float var6 = 0.3F;
         if (VuUVUvnU.UuUVuuUu(a_.field_1724.method_36454(), a_.field_1724.method_36455(), 5.0, var0)) {
            var2 = 0.0F;
            var3 = 0.0F;
         }

         C00OOC00oO = C00OOC00oO + (var2 - C00OOC00oO) * var6;
         uUnuvNvvNU = uUnuvNvvNU + (var3 - uUnuvNvvNU) * var6;
         COC0OCc.UuUVuuUu(
            new uuUuvNuNVNVU(var4, var5), C00OOC00oO, uUnuvNvvNU, UuUVuuUu(360.0, 390.0), UuUVuuUu(360.0, 390.0), (int)UuUVuuUu(3.0, 5.0), 1, false
         );
      }
   }

   public static void UuUVuuUu() {
   }

   public static void C00OOC00oO() {
      C00OOC00oO = 24.0F;
      uUnuvNvvNU = 6.0F;
   }

   private static float UuUVuuUu(float var0, float var1) {
      return var1 + (var0 - var1) * UuUVuuUu.nextFloat();
   }

   private static float UuUVuuUu(double var0, double var2) {
      return (float)(var0 + (var2 - var0) * Math.random());
   }
}
