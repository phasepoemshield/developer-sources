package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1304;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_6880;
import net.minecraft.class_9285;
import net.minecraft.class_9334;
import net.minecraft.class_1322.class_1323;
import net.minecraft.class_9285.class_9287;

public class UNNUVV {
   private static Map<class_6880<class_1320>, Double> nuUnNvnuUu(class_1799 var0) {
      class_9285 var1 = (class_9285)var0.method_58694(class_9334.field_49636);
      HashMap var2 = new HashMap();
      if (var1 == null) {
         return var2;
      } else {
         for (class_9287 var4 : var1.comp_2393()) {
            if (var4.comp_2397().method_57286(class_1304.field_6171)) {
               class_1322 var5 = var4.comp_2396();
               if (var5.comp_2450() == class_1323.field_6328) {
                  var2.put(var4.comp_2395(), var5.comp_2449());
               }
            }
         }

         return var2;
      }
   }

   private static boolean UuUVuuUu(Map<class_6880<class_1320>, Double> var0, class_6880<class_1320> var1, double var2) {
      return Double.compare(var0.getOrDefault(var1, 0.0), var2) == 0;
   }

   public static boolean UuUVuuUu(class_1799 var0) {
      return var0.method_31574(class_1802.field_8367);
   }

   public static boolean C00OOC00oO(class_1799 var0) {
      return var0.method_31574(class_1802.field_8288);
   }

   public static boolean uUnuvNvvNU(class_1799 var0) {
      return var0.method_31574(class_1802.field_8477);
   }

   public static boolean vVvUvVVuuNvV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8849);
   }

   public static boolean uNNnnnuuuN(class_1799 var0) {
      return var0.method_31574(class_1802.field_8463);
   }
}
