package org.zenith.module;

import org.zenith.core.PricedItem;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ModuleSnapshotDto;

import org.zenith.event.EventClick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.component.Component;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

@ModuleInfo(
   name = "ItemDebug",
   category = Category.MISC,
   description = "Dumps full item data to console on slot click"
)
public class ItemDebug extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ItemDebug itemDebug = new ItemDebug();

   public ItemDebug() {
   }

   @EventTarget
   public void on23(EventClick var1) {
      if (minecraftClient3.player != null) {
         ScreenHandler screenhandler = minecraftClient3.player.currentScreenHandler;
         if (screenhandler != null) {
            int i = var1.PricedItem();
            if (screenhandler.isValid(i)) {
               ItemStack itemstack = screenhandler.getSlot(i).getStack();
               if (!itemstack.isEmpty()) {
                  this.ModuleSnapshotDto(itemstack);
               }
            }
         }
      }
   }

   public void ModuleSnapshotDto(ItemStack var1) {
      System.out.println("==================== ItemDebug ====================");
      System.out.println("Name: " + var1.getName().getString());
      System.out.println("Id: " + var1.getItem());
      System.out.println("Count: " + var1.getCount());
      LoreComponent lorecomponent = var1.get(DataComponentTypes.LORE);
      if (lorecomponent != null && !lorecomponent.lines().isEmpty()) {
         System.out.println("Lore:");

         for (Text text : lorecomponent.lines()) {
            System.out.println("  " + text.getString());
         }
      }

      ItemEnchantmentsComponent itemenchantmentscomponent = var1.get(DataComponentTypes.ENCHANTMENTS);
      if (itemenchantmentscomponent != null && !itemenchantmentscomponent.isEmpty()) {
         System.out.println("Enchantments:");

         for (RegistryEntry<net.minecraft.enchantment.Enchantment> registryentry : itemenchantmentscomponent.getEnchantments()) {
            String s = registryentry.getKey().map(var0 -> var0.getValue().toString()).orElse("unknown");
            System.out.println("  " + s + " " + itemenchantmentscomponent.getLevel(registryentry));
         }
      }

      System.out.println("Components:");

      for (Component component : var1.getComponents()) {
         System.out.println("  " + component.type() + " = " + component.value());
      }

      System.out.println("===================================================");
   }
}
