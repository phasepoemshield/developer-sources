package ru.metaculture.protection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public class UNuvuNVuUnVu {
   private static final Pattern UuUVuuUu = Pattern.compile("Продавец:\\s*(.+)");
   private static final Pattern C00OOC00oO = Pattern.compile("\\$(?:[^\\d]*?Цена)?[^\\d]*?([0-9][\\d,]*)");

   public static String UuUVuuUu(class_1735 var0) {
      if (!var0.method_7681()) {
         return null;
      } else {
         class_1799 var1 = var0.method_7677();
         class_9290 var2 = (class_9290)var1.method_57353().method_58694(class_9334.field_49632);
         if (var2 != null) {
            for (class_2561 var5 : var2.comp_2400()) {
               String var6 = var5.getString().replaceAll("(?i)§[0-9A-FK-OR]", "");
               Matcher var7 = UuUVuuUu.matcher(var6);
               if (var7.find()) {
                  return var7.group(1).trim();
               }
            }
         }

         return null;
      }
   }

   public static int C00OOC00oO(class_1735 var0) {
      if (!var0.method_7681()) {
         return 0;
      } else {
         class_1799 var1 = var0.method_7677();
         class_9290 var2 = (class_9290)var1.method_57353().method_58694(class_9334.field_49632);
         if (var2 != null) {
            for (class_2561 var5 : var2.comp_2400()) {
               String var6 = var5.getString();
               if (var6.contains("$") || var6.contains("Цена")) {
                  String var7 = var6.replaceAll("[^0-9]", "");
                  if (!var7.isEmpty()) {
                     try {
                        return Math.toIntExact(Long.parseLong(var7));
                     } catch (NumberFormatException var9) {
                     }
                  }
               }
            }
         }

         return 0;
      }
   }
}
