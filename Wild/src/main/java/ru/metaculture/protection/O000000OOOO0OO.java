package ru.metaculture.protection;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

public class O000000OOOO0OO {
   public static String O00000000(Slot slot) {
      if (!slot.hasStack()) {
         return null;
      } else {
         ItemStack var1 = slot.getStack();
         LoreComponent var2 = (LoreComponent)var1.getComponents().get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var5 : var2.lines()) {
               String var6 = var5.getString();
               if (var6.contains("Продавец:")) {
                  return var6.replaceFirst(".*?Продавец:\\s*", "").trim();
               }
            }
         }

         return null;
      }
   }

   public static long O000000000(Slot slot) {
      if (!slot.hasStack()) {
         return 0L;
      } else {
         ItemStack var1 = slot.getStack();
         LoreComponent var2 = (LoreComponent)var1.getComponents().get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var5 : var2.lines()) {
               String var6 = var5.getString();
               if (var6.contains("$")) {
                  String var7 = var6.replaceAll("[^0-9]", "");
                  if (!var7.isEmpty()) {
                     try {
                        return Long.parseLong(var7);
                     } catch (NumberFormatException var9) {
                     }
                  }
               }
            }
         }

         return 0L;
      }
   }
}
