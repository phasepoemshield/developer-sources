package ru.metaculture.protection;

import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent.Builder;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.Impl;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public final class O000000OOOO {
   public static ItemStack O00000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_HELMET);
      O00000000(
         var0,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.AQUA_AFFINITY,
         1,
         Enchantments.RESPIRATION,
         3,
         Enchantments.PROTECTION,
         5
      );
      O00000000(var0, O00000000("Шлем Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack O000000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_CHESTPLATE);
      O00000000(
         var0,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      O00000000(var0, O00000000("Нагрудник Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack O0000000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_LEGGINGS);
      O00000000(
         var0,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      O00000000(var0, O00000000("Поножи Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack O00000000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_BOOTS);
      O00000000(
         var0,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.DEPTH_STRIDER,
         3,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.FEATHER_FALLING,
         4,
         Enchantments.SOUL_SPEED,
         3,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      O00000000(var0, O00000000("Ботинки Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack O000000000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_SWORD);
      O00000000(
         var0,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.SMITE,
         7,
         Enchantments.SWEEPING_EDGE,
         3,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.BANE_OF_ARTHROPODS,
         7,
         Enchantments.SHARPNESS,
         7,
         Enchantments.LOOTING,
         5
      );
      O00000000(
         var0,
         O00000000("Меч Крушителя"),
         List.of(
            Text.literal("Опытный III").formatted(Formatting.GRAY),
            Text.literal("Вампиризм II").formatted(Formatting.GRAY),
            Text.literal("Окисление II").formatted(Formatting.GRAY),
            Text.literal("Яд III").formatted(Formatting.GRAY),
            Text.literal("Детекция III").formatted(Formatting.GRAY),
            Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)
         )
      );
      return var0;
   }

   public static ItemStack O0000000000000() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_PICKAXE);
      O00000000(var0, Enchantments.UNBREAKING, 5, Enchantments.MENDING, 1, Enchantments.EFFICIENCY, 10, Enchantments.FORTUNE, 5);
      O00000000(
         var0,
         O00000000("Кирка Крушителя"),
         List.of(
            Text.literal("Бульдозер II").formatted(Formatting.GRAY),
            Text.literal("Опытный III").formatted(Formatting.GRAY),
            Text.literal("Магнит").formatted(Formatting.GRAY),
            Text.literal("Авто-Плавка").formatted(Formatting.GRAY),
            Text.literal("Паутина").formatted(Formatting.GRAY),
            Text.literal("Пингер").formatted(Formatting.GRAY),
            Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)
         )
      );
      return var0;
   }

   public static ItemStack O000000000000O() {
      ItemStack var0 = new ItemStack(Items.CROSSBOW);
      O00000000(var0, Enchantments.QUICK_CHARGE, 3, Enchantments.MENDING, 1, Enchantments.PIERCING, 5, Enchantments.UNBREAKING, 3, Enchantments.MULTISHOT, 1);
      O00000000(var0, O00000000("Арбалет Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack O00000000000O() {
      ItemStack var0 = new ItemStack(Items.TRIDENT);
      O00000000(
         var0,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.CHANNELING,
         1,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.IMPALING,
         5,
         Enchantments.SHARPNESS,
         7,
         Enchantments.LOYALTY,
         3
      );
      O00000000(
         var0,
         O00000000("Трезубец Крушителя"),
         List.of(
            Text.literal("Скаут III").formatted(Formatting.GRAY),
            Text.literal("Опытный III").formatted(Formatting.GRAY),
            Text.literal("Вампиризм II").formatted(Formatting.GRAY),
            Text.literal("Ступор III").formatted(Formatting.GRAY),
            Text.literal("Притяжение II").formatted(Formatting.GRAY),
            Text.literal("Окисление II").formatted(Formatting.GRAY),
            Text.literal("Возвращение").formatted(Formatting.GRAY),
            Text.literal("Подрывник").formatted(Formatting.GRAY),
            Text.literal("Яд III").formatted(Formatting.GRAY),
            Text.literal("Детекция III").formatted(Formatting.GRAY),
            Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)
         )
      );
      return var0;
   }

   public static ItemStack O00000000000O0() {
      ItemStack var0 = new ItemStack(Items.MACE);
      O00000000(
         var0,
         Enchantments.SHARPNESS,
         7,
         Enchantments.SMITE,
         7,
         Enchantments.BANE_OF_ARTHROPODS,
         7,
         Enchantments.DENSITY,
         5,
         Enchantments.BREACH,
         3,
         Enchantments.SWEEPING_EDGE,
         3,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.LOOTING,
         5,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1
      );
      O00000000(
         var0,
         O00000000("Булава Крушителя"),
         List.of(
            Text.literal("Опытный III").formatted(Formatting.GRAY),
            Text.literal("Вампиризм II").formatted(Formatting.GRAY),
            Text.literal("Окисление II").formatted(Formatting.GRAY),
            Text.literal("Яд III").formatted(Formatting.GRAY),
            Text.literal("Детекция III").formatted(Formatting.GRAY),
            Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)
         )
      );
      return var0;
   }

   private static void O00000000(ItemStack itemStack, Object... objects) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2 != null && var2.world != null) {
         DynamicRegistryManager var3 = var2.world.getRegistryManager();
         Impl var4 = var3.getOrThrow(RegistryKeys.ENCHANTMENT);
         Builder var5 = new Builder((ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT));

         for (byte var6 = 0; var6 < objects.length; var6 += 2) {
            RegistryKey var7 = (RegistryKey)objects[var6];
            int var8 = (Integer)objects[var6 + 1];
            var4.getOptional(var7).ifPresent(reference -> var5.add((net.minecraft.registry.entry.RegistryEntry<net.minecraft.enchantment.Enchantment>)reference, var8));
         }

         itemStack.set(DataComponentTypes.ENCHANTMENTS, var5.build());
      }
   }

   private static void O00000000(ItemStack itemStack, Text text, List<Text> list) {
      itemStack.set(DataComponentTypes.CUSTOM_NAME, text);
      NbtCompound var3 = new NbtCompound();
      var3.putInt("HideFlags", 127);
      var3.putBoolean("Unbreakable", true);
      itemStack.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(var3));
      if (!list.isEmpty()) {
         itemStack.set(DataComponentTypes.LORE, new LoreComponent(list));
      }
   }

   private static Text O00000000(String string) {
      return Text.literal(string).formatted(new Formatting[]{Formatting.BOLD, Formatting.DARK_RED});
   }
}
