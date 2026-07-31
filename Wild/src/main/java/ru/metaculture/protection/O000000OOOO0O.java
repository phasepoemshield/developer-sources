package ru.metaculture.protection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

public class O000000OOOO0O {
   private static final Pattern O00000000 = Pattern.compile("Продавец:\\s*(.+)");
   private static final Pattern O000000000 = Pattern.compile("\\$(?:[^\\d]*?Цена)?[^\\d]*?([0-9][\\d,]*)");

   public static String O00000000(Slot slot) {
      if (!slot.hasStack()) {
         return null;
      } else {
         ItemStack var1 = slot.getStack();
         LoreComponent var2 = (LoreComponent)var1.getComponents().get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var5 : var2.lines()) {
               String var6 = var5.getString().replaceAll("(?i)§[0-9A-FK-OR]", "");
               Matcher var7 = O00000000.matcher(var6);
               if (var7.find()) {
                  return var7.group(1).trim();
               }
            }
         }

         return null;
      }
   }

   public static int O000000000(Slot slot) {
      if (!slot.hasStack()) {
         return 0;
      } else {
         ItemStack var1 = slot.getStack();
         LoreComponent var2 = (LoreComponent)var1.getComponents().get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var5 : var2.lines()) {
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
