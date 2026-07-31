package l;

import java.util.List;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent.Builder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.Impl;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Helper201 {
   public Helper201() {
   }

   public static ItemStack method1746() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_HELMET);
      method1755(
         var0,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.RESPIRATION,
         3,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.UNBREAKING,
         5,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.AQUA_AFFINITY,
         1
      );
      method1756(var0, method1757("Шлем Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack method1747() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_CHESTPLATE);
      method1755(
         var0,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.UNBREAKING,
         5,
         Enchantments.BLAST_PROTECTION,
         5
      );
      method1756(var0, method1757("Нагрудник Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack method1748() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_LEGGINGS);
      method1755(
         var0,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.UNBREAKING,
         5,
         Enchantments.BLAST_PROTECTION,
         5
      );
      method1756(var0, method1757("Поножи Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack method1749() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_BOOTS);
      method1755(
         var0,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.SOUL_SPEED,
         3,
         Enchantments.FEATHER_FALLING,
         4,
         Enchantments.DEPTH_STRIDER,
         3,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.UNBREAKING,
         5,
         Enchantments.BLAST_PROTECTION,
         5
      );
      method1756(var0, method1757("Ботинки Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack method1750() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_SWORD);
      method1755(
         var0,
         Enchantments.SHARPNESS,
         7,
         Enchantments.BANE_OF_ARTHROPODS,
         7,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.SWEEPING_EDGE,
         3,
         Enchantments.MENDING,
         1,
         Enchantments.LOOTING,
         5,
         Enchantments.SMITE,
         7,
         Enchantments.UNBREAKING,
         5
      );
      method1756(
         var0,
         method1757("Меч Крушителя"),
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

   public static ItemStack method1751() {
      ItemStack var0 = new ItemStack(Items.NETHERITE_PICKAXE);
      method1755(var0, Enchantments.EFFICIENCY, 10, Enchantments.MENDING, 1, Enchantments.FORTUNE, 5, Enchantments.UNBREAKING, 5);
      method1756(
         var0,
         method1757("Кирка Крушителя"),
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

   public static ItemStack method1752() {
      ItemStack var0 = new ItemStack(Items.CROSSBOW);
      method1755(var0, Enchantments.MULTISHOT, 1, Enchantments.MENDING, 1, Enchantments.PIERCING, 5, Enchantments.UNBREAKING, 3, Enchantments.QUICK_CHARGE, 3);
      method1756(var0, method1757("Арбалет Крушителя"), List.of(Text.literal("[★] Оригинальный предмет").formatted(Formatting.GRAY)));
      return var0;
   }

   public static ItemStack method1753() {
      ItemStack var0 = new ItemStack(Items.TRIDENT);
      method1755(
         var0,
         Enchantments.CHANNELING,
         1,
         Enchantments.SHARPNESS,
         7,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.MENDING,
         1,
         Enchantments.UNBREAKING,
         5,
         Enchantments.LOYALTY,
         3,
         Enchantments.IMPALING,
         5
      );
      method1756(
         var0,
         method1757("Трезубец Крушителя"),
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

   public static ItemStack method1754() {
      ItemStack var0 = new ItemStack(Items.MACE);
      method1755(
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
      method1756(
         var0,
         method1757("Булава Крушителя"),
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

   private static void method1755(ItemStack var0, Object... var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.world != null) {
         try {
            DynamicRegistryManager var3 = var2.world.getRegistryManager();
            Impl var4 = var3.getOrThrow(RegistryKeys.ENCHANTMENT);
            Builder var5 = new Builder(var0.getOrDefault(DataComponentTypes.ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT));

            for (byte var6 = 0; var6 < var1.length; var6 += 2) {
               try {
                  RegistryKey var7 = (RegistryKey)var1[var6];
                  int var8 = (Integer)var1[var6 + 1];
                  Optional var9 = var4.getOptional(var7);
                  if (var9.isPresent()) {
                     var5.add((RegistryEntry<Enchantment>)var9.get(), var8);
                  }
               } catch (Exception var10) {
               }
            }

            var0.set(DataComponentTypes.ENCHANTMENTS, var5.build());
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      }
   }

   private static void method1756(ItemStack var0, Text var1, List<Text> var2) {
      var0.set(DataComponentTypes.CUSTOM_NAME, var1);
      NbtCompound var3 = new NbtCompound();
      var3.putInt("HideFlags", 127);
      var3.putBoolean("Unbreakable", true);
      var0.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(var3));
      if (!var2.isEmpty()) {
         var0.set(DataComponentTypes.LORE, new LoreComponent(var2));
      }
   }

   private static Text method1757(String var0) {
      return Text.literal(var0).formatted(Formatting.BOLD, Formatting.DARK_RED);
   }
}
