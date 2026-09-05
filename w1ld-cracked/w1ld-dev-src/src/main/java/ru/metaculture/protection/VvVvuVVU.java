package ru.metaculture.protection;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class VvVvuVVU implements O000c0oocoo {
   private static long UuUVuuUu;

   public static void UuUVuuUu(class_1309 var0, UUvNUNvUVnu var1) {
      if (var0 != null && a_.field_1724 != null && a_.field_1687 != null) {
         class_243 var2 = var0.method_19538()
            .method_1031(0.0, class_3532.method_15350(a_.field_1724.method_33571().field_1351 - var0.method_23318(), 0.0, 1.0), 0.0)
            .method_1020(a_.field_1724.method_33571())
            .method_1029();
         float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
         float var4 = a_.field_1724.method_36454();
         float var5 = class_3532.method_15393(var3 - var4);
         float var6 = class_3532.method_15363(AttackAura.unNNVVNnvvV.uUnuvNvvNU(), 0.02F, 0.4F);
         float var7 = UuUVuuUu();
         float var8 = 1.0F - (float)Math.pow(1.0F - var6, var7);
         float var9 = var4 + var5 * var8;
         a_.field_1724.method_36456(var9);
         a_.field_1724.field_6241 = var9;
         var1.UuUVuuUu(var9);
      }
   }

   private static float UuUVuuUu() {
      long var0 = System.nanoTime();
      if (UuUVuuUu == 0L) {
         UuUVuuUu = var0;
         return 1.0F;
      } else {
         float var2 = (float)(var0 - UuUVuuUu) / 1.6666667E7F;
         UuUVuuUu = var0;
         return class_3532.method_15363(var2, 0.25F, 4.0F);
      }
   }
}
