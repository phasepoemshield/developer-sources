package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_310;
import net.minecraft.class_641;
import net.minecraft.class_642;
import net.minecraft.class_642.class_8678;

public final class ocoOOOoc {
   private static final String UuUVuuUu = "BravoHvH";
   private static final String C00OOC00oO = "wi.bravohvh.su";
   private static final AtomicBoolean uUnuvNvvNU = new AtomicBoolean(false);

   private ocoOOOoc() {
   }

   public static void UuUVuuUu(class_310 var0) {
      if (var0 != null && uUnuvNvvNU.compareAndSet(false, true)) {
         try {
            class_641 var1 = new class_641(var0);
            var1.method_2981();
            if (UuUVuuUu(var1, "wi.bravohvh.su")) {
               return;
            }

            class_642 var2 = new class_642("BravoHvH", "wi.bravohvh.su", class_8678.field_45611);
            var1.method_2988(var2, false);
            var1.method_2987();
         } catch (Throwable var3) {
         }
      }
   }

   private static boolean UuUVuuUu(class_641 var0, String var1) {
      String var2 = UuUVuuUu(var1);
      if (var2.isEmpty()) {
         return true;
      } else {
         int var3 = var0.method_2984();

         for (int var4 = 0; var4 < var3; var4++) {
            class_642 var5 = var0.method_2982(var4);
            if (var5 != null && UuUVuuUu(var5.field_3761).equals(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         if (var1.endsWith(":25565")) {
            var1 = var1.substring(0, var1.length() - ":25565".length());
         }

         return var1;
      }
   }
}
