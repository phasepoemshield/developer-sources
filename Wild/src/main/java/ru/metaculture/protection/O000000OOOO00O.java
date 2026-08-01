package ru.metaculture.protection;

import com.mojang.authlib.properties.Property;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.wild.mixin.acceser.HandledScreenAccessor;

public final class O000000OOOO00O {
   private O000000OOOO00O() {
   }

   public static String O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         List var1 = O0000000000(itemStack);
         List var2 = O00000000000(itemStack);
         List var3 = O000000000000(itemStack);
         String var4 = O0000000000000(itemStack);
         StringBuilder var5 = new StringBuilder();
         var5.append("builder(\"")
            .append(O0000000000(O00000000(itemStack.getName().getString(), O000000000(itemStack.getItem()))))
            .append("\", ")
            .append(O00000000(itemStack.getItem()))
            .append(")");
         if (!var2.isEmpty()) {
            var5.append("\n        .enchantments(").append(O00000000(var2)).append(")");
         }

         if (!var3.isEmpty()) {
            var5.append("\n        .attributes(").append(String.join(", ", var3)).append(")");
         }

         if (!var1.isEmpty()) {
            var5.append("\n        .lore(").append(O00000000(var1)).append(")");
         }

         if (!var4.isBlank()) {
            var5.append("\n        .texture(\"").append(O0000000000(var4)).append("\")");
         }

         var5.append("\n        .build(),");
         return var5.toString();
      } else {
         return "";
      }
   }

   public static String O000000000(ItemStack itemStack) {
      String var1 = O00000000(itemStack);
      if (var1.isBlank()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(var1);
         var2.append("\n\ncomponents=").append(itemStack.getComponents());
         return var2.toString();
      }
   }

   public static boolean O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.currentScreen instanceof HandledScreen var1) {
         Slot var5 = O00000000(minecraftClient, var1);
         if (var5 != null && var5.hasStack() && !var5.getStack().isEmpty()) {
            ItemStack var3 = var5.getStack();
            String var4 = O00000000(var3);
            if (var4.isBlank()) {
               ChatUtil.O00000000("§c[AutoBuy] §fНе удалось собрать код предмета.");
               return true;
            } else {
               minecraftClient.keyboard.setClipboard(var4);
               O00000000(var3, var4);
               ChatUtil.O00000000("§a[AutoBuy] §fКод предмета скопирован в буфер и записан в configs/autobuy/dumps.");
               return true;
            }
         } else {
            ChatUtil.O00000000("§c[AutoBuy] §fПод курсором нет предмета.");
            return true;
         }
      } else {
         return false;
      }
   }

   private static Slot O00000000(MinecraftClient minecraftClient, HandledScreen<?> handledScreen) {
      HandledScreenAccessor var2 = (HandledScreenAccessor)handledScreen;
      Slot var3 = var2.litka$getFocusedSlot();
      if (var3 != null) {
         return var3;
      } else if (minecraftClient.getWindow() == null) {
         return null;
      } else {
         double var4 = minecraftClient.mouse.getScaledX(minecraftClient.getWindow());
         double var6 = minecraftClient.mouse.getScaledY(minecraftClient.getWindow());
         return var2.getSlotAtPosition(var4, var6);
      }
   }

   private static void O00000000(ItemStack itemStack, String string) {
      try {
         File var2 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null ? WildClient.O00000000.O0000000000000 : new File(".");
         File var3 = new File(var2, "configs/autobuy/dumps");
         if (!var3.exists()) {
            var3.mkdirs();
         }

         File var4 = new File(var3, "DonatItemsHW-snippets.txt");

         try (FileWriter var5 = new FileWriter(var4, true)) {
            var5.write("\n\n");
            var5.write(string);
            var5.write("\n");
         }
      } catch (Exception var10) {
         ChatUtil.O00000000("§e[AutoBuy] §fКод скопирован, но файл дампа не записался: " + var10.getClass().getSimpleName());
      }
   }

   private static List<String> O0000000000(ItemStack itemStack) {
      ArrayList var1 = new ArrayList();
      LoreComponent var2 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var2 == null) {
         return var1;
      } else {
         for (Text var4 : var2.lines()) {
            String var5 = O000000000(var4.getString()).trim();
            if (!var5.isBlank() && !O00000000(var5)) {
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   private static List<String> O00000000000(ItemStack itemStack) {
      ArrayList var1 = new ArrayList();
      ItemEnchantmentsComponent var2 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
      if (var2 != null && !var2.isEmpty()) {
         for (Entry var4 : var2.getEnchantmentEntries()) {
            String var5 = (String)((RegistryEntry)var4.getKey()).getKey().map(registryKey -> ((net.minecraft.registry.RegistryKey)registryKey).getValue().toString()).orElse("");
            if (!var5.isBlank()) {
               var1.add(var5 + ":" + var4.getIntValue());
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private static List<String> O000000000000(ItemStack itemStack) {
      ArrayList var1 = new ArrayList();
      AttributeModifiersComponent var2 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (var2 == null) {
         return var1;
      } else {
         for (net.minecraft.component.type.AttributeModifiersComponent.Entry var4 : var2.modifiers()) {
            EntityAttributeModifier var5 = var4.modifier();
            String var6 = O00000000(var4.attribute());
            if (!var6.isBlank()) {
               var1.add("attr(\"" + O0000000000(var6) + "\", " + O00000000(var5.value()) + ")");
            }
         }

         return var1;
      }
   }

   private static String O0000000000000(ItemStack itemStack) {
      ProfileComponent var1 = (ProfileComponent)itemStack.get(DataComponentTypes.PROFILE);
      if (var1 != null && var1.gameProfile() != null) {
         Collection var2 = var1.gameProfile().getProperties().get("textures");
         if (var2 != null && !var2.isEmpty()) {
            Property var3 = (Property)var2.iterator().next();
            return var3 != null && var3.value() != null ? var3.value() : "";
         } else {
            return "";
         }
      } else {
         return "";
      }
   }

   private static String O00000000(RegistryEntry<EntityAttribute> registryEntry) {
      return registryEntry.getKey().map(registryKey -> registryKey.getValue().toString()).orElse("");
   }

   private static String O00000000(Item item) {
      Identifier var1 = Registries.ITEM.getId(item);
      return !"minecraft".equals(var1.getNamespace())
         ? "Registries.ITEM.get(Identifier.of(\"" + O0000000000(var1.toString()) + "\"))"
         : "Items." + var1.getPath().toUpperCase(Locale.ROOT);
   }

   private static String O000000000(Item item) {
      Identifier var1 = Registries.ITEM.getId(item);
      return var1.getPath().replace('_', ' ');
   }

   private static String O00000000(String string, String string2) {
      String var2 = O000000000(string).trim();
      return var2.isBlank() ? string2 : var2;
   }

   private static boolean O00000000(String string) {
      String var1 = O000000000(string).toLowerCase(Locale.ROOT);
      return var1.contains("цена")
         || var1.contains("продавец")
         || var1.contains("купить")
         || var1.contains("нажмите")
         || var1.contains("лкм")
         || var1.contains("пкм")
         || var1.contains("shift")
         || var1.contains("страница")
         || var1.contains("истекает")
         || var1.contains("доступно")
         || var1.contains("аукцион");
   }

   private static String O000000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§[0-9A-FK-OR]", "");
   }

   private static String O00000000(List<String> list) {
      ArrayList var1 = new ArrayList();

      for (String var3 : list) {
         var1.add("\"" + O0000000000(var3) + "\"");
      }

      return String.join(", ", var1);
   }

   private static String O00000000(double d) {
      BigDecimal var2 = BigDecimal.valueOf(d).stripTrailingZeros();
      String var3 = var2.toPlainString();
      return var3.contains(".") ? var3 : var3 + ".0";
   }

   private static String O0000000000(String string) {
      return string.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
   }
}
