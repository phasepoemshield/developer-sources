package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class NUnUNvUunVVN implements O000c0oocoo {
   public static void UuUVuuUu(class_1309 var0) {
      if (var0 != null && a_.field_1724 != null) {
         class_243 var1 = uvnuUUnunNn.C00OOC00oO(var0);
         float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
         float var3 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))), -90.0, 70.0);
         float var4 = a_.field_1724.method_36454();
         float var5 = a_.field_1724.method_36455();
         float var6 = class_3532.method_15393(var2 - var4);
         float var7 = var3 - var5;
         float var8 = var6 / 3.0F;
         float var9 = var7 / 6.0F;
         float var10 = 1.0F + (float)ThreadLocalRandom.current().nextDouble(-1.0, 1.5);
         float var11 = 1.0F + (float)ThreadLocalRandom.current().nextDouble(-0.4, 1.333);
         float var12 = var8 * var10;
         float var13 = var9 * var11;
         if (a_.field_1724.method_5681()) {
            COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var2, var3), 360.0F, 360.0F, 20.0F, 20.0F, 2, 15, false);
         } else {
            COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var4 + var12, var5 + var13), 360.0F, 360.0F, 20.0F, 20.0F, 2, 15, false);
         }
      }
   }
}
