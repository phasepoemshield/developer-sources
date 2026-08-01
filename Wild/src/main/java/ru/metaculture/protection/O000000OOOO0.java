package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;

public class O000000OOOO0 {
   private static Map<RegistryEntry<EntityAttribute>, Double> O0000000000000(ItemStack itemStack) {
      AttributeModifiersComponent var1 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      HashMap var2 = new HashMap();
      if (var1 == null) {
         return var2;
      } else {
         for (Entry var4 : var1.modifiers()) {
            if (var4.slot().matches(EquipmentSlot.OFFHAND)) {
               EntityAttributeModifier var5 = var4.modifier();
               if (var5.operation() == Operation.ADD_VALUE) {
                  var2.put(var4.attribute(), var5.value());
               }
            }
         }

         return var2;
      }
   }

   private static boolean O00000000(Map<RegistryEntry<EntityAttribute>, Double> map, RegistryEntry<EntityAttribute> registryEntry, double d) {
      return Double.compare(map.getOrDefault(registryEntry, 0.0), d) == 0;
   }

   public static boolean O00000000(ItemStack itemStack) {
      return itemStack.isOf(Items.ENCHANTED_GOLDEN_APPLE);
   }

   public static boolean O000000000(ItemStack itemStack) {
      return itemStack.isOf(Items.TOTEM_OF_UNDYING);
   }

   public static boolean O0000000000(ItemStack itemStack) {
      return itemStack.isOf(Items.DIAMOND);
   }

   public static boolean O00000000000(ItemStack itemStack) {
      return itemStack.isOf(Items.SPAWNER);
   }

   public static boolean O000000000000(ItemStack itemStack) {
      return itemStack.isOf(Items.GOLDEN_APPLE);
   }
}
