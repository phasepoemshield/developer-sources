package ru.metaculture.protection;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;

public class O000000OOOO00 {
   private static final List<StatusEffectInstance> O00000000 = List.of(
      new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 9),
      new StatusEffectInstance(StatusEffects.SPEED, 400, 4),
      new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 9),
      new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0)
   );
   private static final List<StatusEffectInstance> O000000000 = List.of(
      new StatusEffectInstance(StatusEffects.STRENGTH, 600, 4), new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 3)
   );
   private static final List<StatusEffectInstance> O0000000000 = List.of(
      new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 0),
      new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 0),
      new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 2),
      new StatusEffectInstance(StatusEffects.INVISIBILITY, 18000, 0)
   );
   private static final List<StatusEffectInstance> O00000000000 = List.of(
      new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1),
      new StatusEffectInstance(StatusEffects.INVISIBILITY, 12000, 1),
      new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 0, 1)
   );
   private static final List<StatusEffectInstance> O000000000000 = List.of(
      new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 3),
      new StatusEffectInstance(StatusEffects.SPEED, 6000, 2),
      new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),
      new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 0, 1)
   );
   private static final List<StatusEffectInstance> O0000000000000 = List.of(
      new StatusEffectInstance(StatusEffects.POISON, 1200, 1),
      new StatusEffectInstance(StatusEffects.WITHER, 1200, 1),
      new StatusEffectInstance(StatusEffects.SLOWNESS, 1800, 2),
      new StatusEffectInstance(StatusEffects.HUNGER, 1200, 4),
      new StatusEffectInstance(StatusEffects.GLOWING, 2400, 0)
   );
   private static final List<StatusEffectInstance> O000000000000O = List.of(
      new StatusEffectInstance(StatusEffects.WEAKNESS, 1800, 1),
      new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 200, 1),
      new StatusEffectInstance(StatusEffects.WITHER, 1800, 2),
      new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0)
   );
   private static final List<StatusEffectInstance> O00000000000O = List.of(
      new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0),
      new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 1),
      new StatusEffectInstance(StatusEffects.LUCK, 3600, 0),
      new StatusEffectInstance(StatusEffects.HASTE, 3600, 1)
   );
   private static final List<O000000OOOO00.W115> O00000000000O0 = List.of(
      new O000000OOOO00.W115("Хлопушка", O00000000),
      new O000000OOOO00.W115("Зелье Гнева", O000000000),
      new O000000OOOO00.W115("Зелье Палладина", O0000000000),
      new O000000OOOO00.W115("Святая Вода", O00000000000),
      new O000000OOOO00.W115("Зелье Ассасина", O000000000000),
      new O000000OOOO00.W115("Зелье Радиации", O0000000000000),
      new O000000OOOO00.W115("Снотворное", O000000000000O)
   );

   public static List<O000000OOOO00.W115> O00000000() {
      return O00000000000O0;
   }

   private static Map<RegistryEntry<EntityAttribute>, Double> O00000000OO0O(ItemStack itemStack) {
      AttributeModifiersComponent var1 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      HashMap var2 = new HashMap();
      if (var1 == null) {
         return var2;
      } else {
         for (Entry var4 : var1.modifiers()) {
            EntityAttributeModifier var5 = var4.modifier();
            var2.put(var4.attribute(), var5.value());
         }

         return var2;
      }
   }

   private static boolean O00000000(Map<RegistryEntry<EntityAttribute>, Double> map, RegistryEntry<EntityAttribute> registryEntry, double d) {
      return Math.abs(map.getOrDefault(registryEntry, 0.0) - d) < 1.0E-4;
   }

   private static boolean O00000000(ItemStack itemStack, String string) {
      if (!itemStack.isOf(Items.PLAYER_HEAD)) {
         return false;
      } else {
         NbtComponent var2 = (NbtComponent)itemStack.get(DataComponentTypes.CUSTOM_DATA);
         if (var2 == null) {
            return false;
         } else {
            NbtCompound var3 = var2.copyNbt();
            return var3.getCompound("SkullOwner")
               .flatMap(nbtCompound -> nbtCompound.getCompound("Properties"))
               .flatMap(nbtCompound -> nbtCompound.getList("textures"))
               .filter(nbtList -> !nbtList.isEmpty())
               .flatMap(nbtList -> nbtList.getCompound(0))
               .flatMap(nbtCompound -> nbtCompound.getString("Value"))
               .map(string2 -> string2.equals(string))
               .orElse(false);
         }
      }
   }

   private static boolean O00000000(ItemStack itemStack, List<StatusEffectInstance> list) {
      PotionContentsComponent var2 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
      if (var2 == null) {
         return false;
      } else {
         List var3 = var2.customEffects();

         for (StatusEffectInstance var5 : list) {
            boolean var6 = false;

            for (StatusEffectInstance var8 : (List<StatusEffectInstance>)var3) {
               if (var8.getEffectType().equals(var5.getEffectType()) && var8.getAmplifier() == var5.getAmplifier()) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean O000000000(ItemStack itemStack, String string) {
      return itemStack.getName().getString().contains(string);
   }

   private static boolean O0000000000(ItemStack itemStack, String string) {
      return itemStack.getName().getString().toLowerCase(Locale.ROOT).contains(string.toLowerCase(Locale.ROOT));
   }

   private static boolean O00000000000(ItemStack itemStack, String string) {
      LoreComponent var2 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var2 == null) {
         return false;
      } else {
         for (Text var4 : var2.lines()) {
            if (var4.getString().contains(string)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean O000000000000(ItemStack itemStack, String string) {
      String var2 = string.toLowerCase(Locale.ROOT);
      if (itemStack.getName().getString().toLowerCase(Locale.ROOT).contains(var2)) {
         return true;
      } else {
         LoreComponent var3 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
         if (var3 == null) {
            return false;
         } else {
            for (Text var5 : var3.lines()) {
               if (var5.getString().toLowerCase(Locale.ROOT).contains(var2)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static boolean O00000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.MAX_HEALTH, -4.0)
         && O00000000(var1, EntityAttributes.ARMOR, 1.5)
         && O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 2.5)
         && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, 0.07)
         && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.13)
         && O00000000(var1, EntityAttributes.GRAVITY, 0.09);
   }

   public static boolean O000000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.ARMOR, 2.5)
         && O00000000(var1, EntityAttributes.ARMOR_TOUGHNESS, 2.5)
         && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, -0.15);
   }

   public static boolean O0000000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 6.0)
         && O00000000(var1, EntityAttributes.ARMOR, -2.0)
         && O00000000(var1, EntityAttributes.MAX_HEALTH, -2.0);
   }

   public static boolean O00000000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.ARMOR, 1.0)
         && O00000000(var1, EntityAttributes.MAX_HEALTH, 4.0)
         && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, 0.1)
         && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.1);
   }

   public static boolean O000000000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.MAX_HEALTH, 4.0)
         && O00000000(var1, EntityAttributes.ARMOR, 2.0)
         && O00000000(var1, EntityAttributes.SUBMERGED_MINING_SPEED, 0.5)
         && O00000000(var1, EntityAttributes.OXYGEN_BONUS, 0.5);
   }

   public static boolean O0000000000000(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 2.0) && O00000000(var1, EntityAttributes.MAX_HEALTH, 2.0);
   }

   public static boolean O000000000000O(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.LUCK, 1.0)
         && O00000000(var1, EntityAttributes.MAX_HEALTH, 2.0)
         && O00000000(var1, EntityAttributes.BLOCK_INTERACTION_RANGE, 1.0);
   }

   public static boolean O00000000000O(ItemStack itemStack) {
      Map var1 = O00000000OO0O(itemStack);
      return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 2.0)
         && O00000000(var1, EntityAttributes.JUMP_STRENGTH, -0.1)
         && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.15);
   }

   public static boolean O00000000000O0(ItemStack itemStack) {
      return itemStack.isOf(Items.PLAYER_HEAD) && O000000000(itemStack, "Сфера Мороза") && O00000000000(itemStack, "Вечная мерзлота");
   }

   public static boolean O00000000000OO(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 2.5) && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.1);
      }
   }

   public static boolean O0000000000O(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 7.0)
            && O00000000(var1, EntityAttributes.MAX_HEALTH, -4.0)
            && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, 0.1);
      }
   }

   public static boolean O0000000000O0(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ARMOR, 1.5) && O00000000(var1, EntityAttributes.MAX_HEALTH, 1.5);
      }
   }

   public static boolean O0000000000O00(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 5.0) && O00000000(var1, EntityAttributes.MAX_HEALTH, -4.0);
      }
   }

   public static boolean O0000000000O0O(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 2.0)
            && O00000000(var1, EntityAttributes.ARMOR, 2.0)
            && O00000000(var1, EntityAttributes.MAX_HEALTH, -4.0);
      }
   }

   public static boolean O0000000000OO(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.MAX_HEALTH, 4.0)
            && O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 3.0)
            && O00000000(var1, EntityAttributes.ARMOR_TOUGHNESS, 2.0)
            && O00000000(var1, EntityAttributes.ARMOR, 2.0);
      }
   }

   public static boolean O0000000000OO0(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 4.0)
            && O00000000(var1, EntityAttributes.MAX_HEALTH, 2.0)
            && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, 0.1)
            && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.1)
            && O00000000(var1, EntityAttributes.ARMOR, -3.0);
      }
   }

   public static boolean O0000000000OOO(ItemStack itemStack) {
      if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         return O00000000(var1, EntityAttributes.MAX_HEALTH, 2.0);
      }
   }

   public static String O000000000O(ItemStack itemStack) {
      if (O00000000000OO(itemStack)) {
         return "Талисман Демона";
      } else if (O0000000000O(itemStack)) {
         return "Талисман Карателя";
      } else if (O0000000000O0(itemStack)) {
         return "Талисман Мрака";
      } else if (O0000000000O00(itemStack)) {
         return "Талисман Ярости";
      } else if (O0000000000O0O(itemStack)) {
         return "Талисман Тирана";
      } else if (O0000000000OO(itemStack)) {
         return "Талисман Крушителя";
      } else if (O0000000000OO0(itemStack)) {
         return "Талисман Раздора";
      } else {
         return O0000000000OOO(itemStack) ? "Талисман Сары" : "";
      }
   }

   public static boolean O000000000O0(ItemStack itemStack) {
      if (!itemStack.isOf(Items.SPLASH_POTION)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         boolean var2 = O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 12.0)
            && O00000000(var1, EntityAttributes.MOVEMENT_SPEED, 0.6)
            && O00000000(var1, EntityAttributes.ATTACK_SPEED, 0.1);
         return var2 || O00000000(itemStack, O000000000000);
      }
   }

   public static boolean O000000000O00(ItemStack itemStack) {
      if (!itemStack.isOf(Items.SPLASH_POTION)) {
         return false;
      } else {
         Map var1 = O00000000OO0O(itemStack);
         boolean var2 = O00000000(var1, EntityAttributes.ATTACK_DAMAGE, 5.0);
         return var2 && O00000000(itemStack, O000000000);
      }
   }

   public static boolean O000000000O000(ItemStack itemStack) {
      return !itemStack.isOf(Items.SPLASH_POTION) ? false : O00000000(itemStack, O00000000);
   }

   public static boolean O000000000O00O(ItemStack itemStack) {
      return !itemStack.isOf(Items.SPLASH_POTION) ? false : O00000000(itemStack, O00000000000) || O000000000(itemStack, "Святая вода");
   }

   public static boolean O000000000O0O(ItemStack itemStack) {
      return !itemStack.isOf(Items.SPLASH_POTION) ? false : O00000000(itemStack, O0000000000);
   }

   public static boolean O000000000O0O0(ItemStack itemStack) {
      return !itemStack.isOf(Items.SPLASH_POTION) ? false : O00000000(itemStack, O0000000000000);
   }

   public static boolean O000000000O0OO(ItemStack itemStack) {
      return !itemStack.isOf(Items.SPLASH_POTION) ? false : O00000000(itemStack, O000000000000O);
   }

   public static boolean O000000000OO(ItemStack itemStack) {
      return itemStack.isOf(Items.SUGAR) && O000000000(itemStack, "Явная пыль") && O00000000000(itemStack, "Каст: Световая вспышка");
   }

   public static boolean O000000000OO0(ItemStack itemStack) {
      return itemStack.isOf(Items.ENDER_EYE) && O000000000(itemStack, "Дезориентация") && O00000000000(itemStack, "Чем ближе цель");
   }

   public static boolean O000000000OO00(ItemStack itemStack) {
      return itemStack.isOf(Items.NETHERITE_SCRAP) && O000000000(itemStack, "Трапка") && O00000000000(itemStack, "Каст: Нерушимая клетка");
   }

   public static boolean O000000000OO0O(ItemStack itemStack) {
      return itemStack.isOf(Items.TRIPWIRE_HOOK) && O000000000(itemStack, "Отмычка к Сферам") && O00000000000(itemStack, "Открыть хранилище с Сферам");
   }

   public static boolean O000000000OOO(ItemStack itemStack) {
      return itemStack.isOf(Items.DRIED_KELP) && O000000000(itemStack, "Пласт") && O00000000000(itemStack, "Каст: Нерушимая стена");
   }

   public static boolean O000000000OOO0(ItemStack itemStack) {
      return itemStack.isOf(Items.EXPERIENCE_BOTTLE) && (O000000000000(itemStack, "Опыт с уровнем 15") || O000000000000(itemStack, "15 ур"));
   }

   public static boolean O000000000OOOO(ItemStack itemStack) {
      return itemStack.isOf(Items.EXPERIENCE_BOTTLE) && (O000000000000(itemStack, "Опыт с уровнем 30") || O000000000000(itemStack, "30 ур"));
   }

   public static boolean O00000000O(ItemStack itemStack) {
      return itemStack.isOf(Items.EXPERIENCE_BOTTLE) && (O000000000000(itemStack, "Опыт с уровнем 50") || O000000000000(itemStack, "50 ур"));
   }

   public static boolean O00000000O0(ItemStack itemStack) {
      return itemStack.isOf(Items.EXPERIENCE_BOTTLE) && (O000000000000(itemStack, "Опыт с уровнем 45") || O000000000000(itemStack, "45 ур"));
   }

   public static boolean O00000000O00(ItemStack itemStack) {
      return itemStack.isOf(Items.TNT) && O000000000(itemStack, "WHITE") && O00000000000(itemStack, "в 10 раз сильнее");
   }

   public static boolean O00000000O000(ItemStack itemStack) {
      return itemStack.isOf(Items.TNT) && O000000000(itemStack, "BLACK") && O00000000000(itemStack, "взорвать обсидиан");
   }

   public static boolean O00000000O0000(ItemStack itemStack) {
      return itemStack.isOf(Items.CAMPFIRE) && O000000000(itemStack, "Случайный") && O00000000000(itemStack, "Уровень лута: Случайный");
   }

   public static boolean O00000000O000O(ItemStack itemStack) {
      return itemStack.isOf(Items.CAMPFIRE) && O000000000(itemStack, "Обычный") && O00000000000(itemStack, "Уровень лута: Обычный");
   }

   public static boolean O00000000O00O(ItemStack itemStack) {
      return itemStack.isOf(Items.CAMPFIRE) && O000000000(itemStack, "Богатый") && O00000000000(itemStack, "Уровень лута: Богатый");
   }

   public static boolean O00000000O00O0(ItemStack itemStack) {
      return itemStack.isOf(Items.SOUL_CAMPFIRE) && O000000000(itemStack, "Легендарный") && O00000000000(itemStack, "Уровень лута: Легендарный");
   }

   public static boolean O00000000O00OO(ItemStack itemStack) {
      return itemStack.isOf(Items.JIGSAW) && O000000000(itemStack, "Блок дамагер") && O00000000000(itemStack, "Каст: Нанесение урона");
   }

   public static boolean O00000000O0O(ItemStack itemStack) {
      return itemStack.isOf(Items.STRUCTURE_BLOCK) && O000000000(itemStack, "1x1") && O00000000000(itemStack, "(1x1)");
   }

   public static boolean O00000000O0O0(ItemStack itemStack) {
      return itemStack.isOf(Items.BEACON) && O000000000(itemStack, "Маяк") && O00000000000(itemStack, "раздающий Монеты");
   }

   public static boolean O00000000O0O00(ItemStack itemStack) {
      return itemStack.isOf(Items.SOUL_LANTERN) && O000000000(itemStack, "Проклятая душа") && O00000000000(itemStack, "Обменяй души");
   }

   public static boolean O00000000O0O0O(ItemStack itemStack) {
      return itemStack.isOf(Items.PAPER) && O000000000(itemStack, "Драконий скин") && O00000000000(itemStack, "Драконий скин взамен");
   }

   public static boolean O00000000O0OO(ItemStack itemStack) {
      return itemStack.isOf(Items.FIRE_CHARGE) && O000000000(itemStack, "Огненный смерч") && O00000000000(itemStack, "Каст: Огненная волна");
   }

   public static boolean O00000000O0OO0(ItemStack itemStack) {
      return itemStack.isOf(Items.SNOWBALL) && O000000000(itemStack, "Снежок заморозка") && O00000000000(itemStack, "Каст: Ледяная сфера");
   }

   public static boolean O00000000O0OOO(ItemStack itemStack) {
      return itemStack.isOf(Items.PHANTOM_MEMBRANE) && O000000000(itemStack, "Божья аура") && O00000000000(itemStack, "Каст: Божественная аура");
   }

   public static boolean O00000000OO(ItemStack itemStack) {
      return itemStack.isOf(Items.IRON_NUGGET) && O000000000(itemStack, "Серебро");
   }

   public static boolean O00000000OO0(ItemStack itemStack) {
      return itemStack.isOf(Items.GOLDEN_PICKAXE) && O0000000000(itemStack, "Божье касание") && O00000000000(itemStack, "Может добыть спавнер");
   }

   public static boolean O00000000OO00(ItemStack itemStack) {
      return itemStack.isOf(Items.GOLDEN_PICKAXE) && O000000000(itemStack, "Мощный удар") && O00000000000(itemStack, "Может разрушить бедрок");
   }

   public static boolean O00000000OO000(ItemStack itemStack) {
      return itemStack.isOf(Items.NETHERITE_PICKAXE) && O000000000(itemStack, "мега-бульдозер") && O00000000000(itemStack, "Вскапывает территорию");
   }

   public static boolean O00000000OO00O(ItemStack itemStack) {
      return itemStack.isOf(Items.ELYTRA) && O000000000(itemStack, "Нерушимые элитры") && O00000000000(itemStack, "Нерушимый предмет");
   }

   public record W115(String name, List<StatusEffectInstance> effects) {
   }
}
