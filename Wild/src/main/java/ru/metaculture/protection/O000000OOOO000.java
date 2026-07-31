package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class O000000OOOO000 {
   private static final String O00000000 = "holyworld:";
   private static final double O000000000 = 1.0E-4;
   private static final Map<String, String> O0000000000 = Map.of("sweeping", "sweeping_edge");
   private static final Map<String, List<String>> O00000000000 = Map.ofEntries(
      Map.entry("spawner-getter-enchant", List.of("спавнер", "добытьспавнер", "spawnergetter")),
      Map.entry("impenetrable-enchant-custom", List.of("непробиваем", "impenetrable")),
      Map.entry("drill-enchant-custom", List.of("бур", "бульдозер", "drill")),
      Map.entry("exp-enchant-custom", List.of("опытный", "опыт", "exp")),
      Map.entry("foundry-enchant-custom", List.of("автоплавка", "автоплав", "foundry")),
      Map.entry("internal-enchant-custom", List.of("internal", "встроен")),
      Map.entry("magnet-enchant-custom", List.of("магнит", "magnet")),
      Map.entry("critical-enchant-custom", List.of("крит", "critical")),
      Map.entry("destroyer-enchant-custom", List.of("разрушитель", "destroyer")),
      Map.entry("rich-enchant-custom", List.of("богач", "rich")),
      Map.entry("mob-farmer-enchant", List.of("фармер", "фермер", "mobfarmer"))
   );
   static final Map<String, Integer> O000000000000 = new HashMap<>();
   private static final List<O000000OOOO000.W120> O0000000000000 = List.of(
      O000000000("Шлем инфинити", Items.NETHERITE_HELMET)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:aqua_affinity:1",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:respiration:3",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый II")
         .O000000000(),
      O000000000("Нагрудник инфинити", Items.NETHERITE_CHESTPLATE)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 8.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый II")
         .O000000000(),
      O000000000("Поножи инфинити", Items.NETHERITE_LEGGINGS)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 6.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый II")
         .O000000000(),
      O000000000("Ботинки инфинити", Items.NETHERITE_BOOTS)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:feather_falling:4",
            "minecraft:depth_strider:3",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5",
            "minecraft:soul_speed:3"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый II")
         .O000000000(),
      O000000000("Талисман инфинити", Items.TOTEM_OF_UNDYING)
         .O000000000("minecraft:unbreaking:1")
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Макс. здоровье II", "• Броня II", "• Урон II", "• Скорость II")
         .O000000000(),
      O000000000("Кирка этернити", Items.NETHERITE_PICKAXE)
         .O000000000("minecraft:efficiency:10", "minecraft:fortune:5", "minecraft:unbreaking:5", "minecraft:mending:1")
         .O00000000(O00000000("minecraft:attack_damage", 5.0), O00000000("minecraft:attack_speed", -2.8F))
         .O00000000("Магнетизм I", "Неразрушимость I", "Автоплавка", "Опытный III", "Бур II")
         .O000000000(),
      O000000000("Шлем этернити", Items.NETHERITE_HELMET)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:aqua_affinity:1",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:respiration:3",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Нагрудник этернити", Items.NETHERITE_CHESTPLATE)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 8.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Штаны этернити", Items.NETHERITE_LEGGINGS)
         .O000000000(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .O00000000(O00000000("minecraft:armor", 6.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Ботинки этернити", Items.NETHERITE_BOOTS)
         .O000000000(
            "minecraft:fire_protection:5",
            "minecraft:soul_speed:3",
            "minecraft:blast_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:depth_strider:3",
            "minecraft:feather_falling:4"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Меч этернити", Items.NETHERITE_SWORD)
         .O000000000(
            "minecraft:smite:7",
            "minecraft:bane_of_arthropods:7",
            "minecraft:fire_aspect:2",
            "minecraft:mending:1",
            "minecraft:sweeping_edge:3",
            "minecraft:unbreaking:5",
            "minecraft:looting:5",
            "minecraft:sharpness:7"
         )
         .O00000000(O00000000("minecraft:attack_damage", 7.0), O00000000("minecraft:attack_speed", -2.4F))
         .O00000000("Разрушитель II", "Богач I", "Критический II")
         .O000000000(),
      O000000000("Талисман этернити", Items.TOTEM_OF_UNDYING)
         .O000000000("minecraft:unbreaking:1")
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Скорость II", "• Урон II", "• Броня II")
         .O000000000(),
      O000000000("Сфера этернити", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Броня II", "• Скорость II", "• Урон II")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .O000000000(),
      O000000000("Кирка стингер", Items.NETHERITE_PICKAXE)
         .O000000000("minecraft:efficiency:8", "minecraft:unbreaking:4", "minecraft:mending:1", "minecraft:fortune:4")
         .O00000000(O00000000("minecraft:attack_damage", 5.0), O00000000("minecraft:attack_speed", -2.8F))
         .O00000000("Неразрушимость I", "Автоплавка", "Опытный III", "Бур I")
         .O000000000(),
      O000000000("Шлем стингер", Items.NETHERITE_HELMET)
         .O000000000(
            "minecraft:fire_protection:4",
            "minecraft:blast_protection:4",
            "minecraft:aqua_affinity:1",
            "minecraft:unbreaking:4",
            "minecraft:protection:5",
            "minecraft:projectile_protection:4",
            "minecraft:respiration:3"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O000000000(),
      O000000000("Нагрудник стингер", Items.NETHERITE_CHESTPLATE)
         .O000000000(
            "minecraft:blast_protection:4",
            "minecraft:fire_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:5",
            "minecraft:projectile_protection:4"
         )
         .O00000000(O00000000("minecraft:armor", 8.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Штаны стингер", Items.NETHERITE_LEGGINGS)
         .O000000000(
            "minecraft:blast_protection:4",
            "minecraft:fire_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:4",
            "minecraft:projectile_protection:4"
         )
         .O00000000(O00000000("minecraft:armor", 6.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O00000000("Непробиваемый I")
         .O000000000(),
      O000000000("Ботинки стингер", Items.NETHERITE_BOOTS)
         .O000000000(
            "minecraft:fire_protection:4",
            "minecraft:soul_speed:3",
            "minecraft:blast_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:4",
            "minecraft:projectile_protection:4",
            "minecraft:depth_strider:3",
            "minecraft:feather_falling:4"
         )
         .O00000000(O00000000("minecraft:armor", 3.0), O00000000("minecraft:armor_toughness", 3.0), O00000000("minecraft:knockback_resistance", 0.1F))
         .O000000000(),
      O000000000("Меч стингер", Items.NETHERITE_SWORD)
         .O000000000(
            "minecraft:smite:7",
            "minecraft:bane_of_arthropods:7",
            "minecraft:fire_aspect:2",
            "minecraft:mending:1",
            "minecraft:sweeping_edge:3",
            "minecraft:unbreaking:4",
            "minecraft:looting:5",
            "minecraft:sharpness:6"
         )
         .O00000000(O00000000("minecraft:attack_damage", 7.0), O00000000("minecraft:attack_speed", -2.4F))
         .O00000000("Богач I", "Критический II")
         .O000000000(),
      O000000000("Талисман стингер", Items.TOTEM_OF_UNDYING)
         .O000000000("minecraft:unbreaking:1")
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Скорость I", "• Броня II", "• Урон II")
         .O000000000(),
      O000000000("Сфера стингер", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Броня II", "• Скорость I", "• Урон II")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .O000000000(),
      O000000000("Сфера Цербера", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:waypoint_transmit_range", -1.0))
         .O00000000("Проклятие утраты", "• Спешка I", "• Урон V")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0="
         )
         .O000000000(),
      O000000000("Сфера Флеша", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:armor", 1.0))
         .O00000000("Проклятие утраты", "• Броня I", "• Скорость III")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc0MDBlYTE5ZGJkODRmNzVjMzlhZDY4MjNhYzRlZjc4NmYzOWY0OGZjNmY4NDYwMjM2NmFjMjliODM3NDIyIn19fQ=="
         )
         .O000000000(),
      O000000000("Легендарная сфера", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:waypoint_transmit_range", -1.0))
         .O00000000("• Урон III")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .O000000000(),
      O000000000("Мифическая сфера", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Броня II", "• Урон III")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .O000000000(),
      O000000000("Мифическая сфера", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:armor", 3.0))
         .O00000000("• Скорость II", "• Броня III")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .O000000000(),
      O000000000("Золотой Спавнер", Items.SPAWNER)
         .O00000000(
            "Особенности:",
            "виртуально фармит мобов",
            ".  без спавна сущностей;",
            "лут и опыт копятся",
            ".  во внутреннем хранилище;",
            "вставка яйца может",
            ".  сломать спавнер.",
            "Шанс уничтожения: 50.6%"
         )
         .O000000000(),
      O000000000("Взрывчатое вещество", Items.CLAY)
         .O00000000("Особенности:", "используется только для крафта", ".   взрывных предметов;", "можно перекрафтить в 9 пороха.")
         .O000000000(),
      O000000000("100", Items.EXPERIENCE_BOTTLE).O00000000("В пузырьке 30971 опыта (100 ур.)", "Киньте пузырек, чтобы получить опыт").O000000000(),
      O000000000("Загадочный спавнер", Items.SPAWNER)
         .O00000000(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 25.0%",
            "• Ведьма — 7.0%",
            "• Блейз — 20.0%",
            "• Зомби — 18.0%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .O000000000(),
      O000000000("Загадочное яйцо призыва", Items.WITCH_SPAWN_EGG)
         .O00000000(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 25.0%",
            "• Ведьма — 7.0%",
            "• Блейз — 20.0%",
            "• Зомби — 18.0%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .O000000000(),
      O000000000("Загадочное яйцо призыва", Items.CREEPER_SPAWN_EGG)
         .O00000000(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 33.0%",
            "• Крипер — 2.0%",
            "• Блейз — 17.5%",
            "• Зомби — 17.5%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .O000000000(),
      O000000000("Загадочное яйцо призыва", Items.PIGLIN_BRUTE_SPAWN_EGG)
         .O00000000(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 50.0%",
            "• Ведьма — 4.0%",
            "• Мини-зомби — 20.0%",
            "• Крипер — 1.0%",
            "• Блейз — 25.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .O000000000(),
      O000000000("Трапка", Items.POPPED_CHORUS_FRUIT).O000000000(),
      O000000000("Ком снега", Items.SNOWBALL, "Снежок заморозки", "Снежок заморозка").O000000000(),
      O000000000("Стан", Items.NETHER_STAR).O000000000(),
      O000000000("Взрывная трапка", Items.PRISMARINE_SHARD, "Взрывная").O000000000(),
      O000000000("С4", Items.TNT).O00000000("Особенности:", "разрушает блок незеритового привата;", "взрывает блоки обсидиана.").O000000000(),
      O000000000("Справедливость", Items.POTION)
         .O00000000(
            "Особенности:",
            "когда предмет в инвентаре, вы получаете",
            ".   защиту от различных дебафов слепота",
            ".   прыгучесть, отравление, иссушение",
            ".   медлительность и слабость."
         )
         .O000000000(),
      O000000000("Броневая элитра", Items.ELYTRA)
         .O00000000(O00000000("minecraft:armor", 8.0))
         .O00000000("Особенности:", "имеет свойства алмазного нагрудника;", "позволяет летать как обычная элитра;", "возможно накладывать зачарования.")
         .O000000000(),
      O000000000("Арбалет этернити", Items.CROSSBOW)
         .O000000000("minecraft:piercing:5", "minecraft:multishot:1", "minecraft:unbreaking:3", "minecraft:quick_charge:3")
         .O00000000("Оглушение II")
         .O000000000(),
      O000000000("Сфера ᴀʀᴍᴏʀᴛᴀʟɪᴛʏ", Items.PLAYER_HEAD, "Сфера armortlity", "Сфера armortality")
         .O00000000(O00000000("minecraft:armor", 2.0))
         .O00000000("• Броня II", "• Макс. здоровье II", "• Урон II")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWE2MmI5ZGU2YTI2Yjg2ODY5Y2EyMmVhNDBmMWJkZTgwYTA0MzBhNTQ1NDdiZWNjZThmZGE4NzA3Nzc3MjU4ZiJ9fX0="
         )
         .O000000000(),
      O000000000("Сфера immortality", Items.PLAYER_HEAD)
         .O00000000(O00000000("minecraft:waypoint_transmit_range", -1.0))
         .O00000000("• Скорость II", "• Урон III")
         .O00000000(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNlZDRjZTIzOTMzZTY2ZTA0ZGYxNjA3MDY0NGY3NTk5ZWViNTUzMDdmN2VhZmU4ZDkyZjQwZmIzNTIwODYzYyJ9fX0="
         )
         .O000000000(),
      O000000000("15", Items.EXPERIENCE_BOTTLE).O00000000("В пузырьке 315 опыта (15 ур.)", "Киньте пузырек, чтобы получить опыт").O000000000(),
      O000000000("50", Items.EXPERIENCE_BOTTLE).O00000000("В пузырьке 5345 опыта (50 ур.)", "Киньте пузырек, чтобы получить опыт").O000000000(),
      O000000000("Особый компас", Items.COMPASS)
         .O000000000("minecraft:luck_of_the_sea:1")
         .O00000000("Особенности:", "- ведёт к ближайшему или случайному", "- можно использовать раз в 8 часов.")
         .O000000000(),
      O000000000("Тнт-Пушка", Items.DISPENSER)
         .O000000000("minecraft:soul_speed:10")
         .O00000000(
            "Особенности:",
            "- запускает летящий динамит",
            ".   со скоростью до 5 блоков за секунду;",
            "- при запуске сохраняет свойства",
            ".   особых динамитов и пиротехники;",
            "- можно сломать в чужом привате.",
            "● Данный товар можно"
         )
         .O000000000(),
      O000000000("Меч инфинити", Items.NETHERITE_SWORD)
         .O000000000(
            "minecraft:sharpness:8",
            "minecraft:unbreaking:5",
            "minecraft:mending:1",
            "minecraft:fire_aspect:2",
            "minecraft:bane_of_arthropods:7",
            "minecraft:sweeping_edge:3",
            "minecraft:smite:7",
            "minecraft:looting:5"
         )
         .O00000000(O00000000("minecraft:attack_damage", 7.0), O00000000("minecraft:attack_speed", -2.4F))
         .O00000000("Богач VI", "Разрушитель II", "Критический II")
         .O000000000(),
      O000000000("Меч Цербера ", Items.NETHERITE_SWORD)
         .O000000000(
            "minecraft:sharpness:9",
            "minecraft:unbreaking:5",
            "minecraft:mending:1",
            "minecraft:fire_aspect:2",
            "minecraft:bane_of_arthropods:7",
            "minecraft:sweeping_edge:3",
            "minecraft:smite:7",
            "minecraft:looting:5"
         )
         .O00000000(O00000000("minecraft:attack_damage", 7.0), O00000000("minecraft:attack_speed", -2.4F))
         .O00000000("Богач VI", "Разрушитель III", "Критический II", "● Данный товар можно")
         .O000000000(),
      O000000000("Нерушимые элитры", Items.ELYTRA).O000000000(),
      O000000000("Меч Выгодный фарм", Items.NETHERITE_SWORD)
         .O00000000(O00000000("minecraft:attack_damage", 7.0), O00000000("minecraft:attack_speed", -2.4F))
         .O00000000("Фармер II", "● Данный товар можно")
         .O000000000(),
      O000000000("Рюкзак инфинити", Items.LIME_SHULKER_BOX, "- Рюкзак Iɴғɪɴɪᴛʏ -")
         .O00000000("Особенности:", "- нельзя поставить на землю;", "- вместимость 36 слотов;", "● Данный товар можно")
         .O000000000(),
      O000000000("Рюкзак 1 уровень", Items.PINK_SHULKER_BOX, "Рюкзак I уровень", "Рюкзак (I уровень)")
         .O00000000("Особенности:", "- нельзя поставить на землю;", "- вместимость 9 слотов;")
         .O000000000(),
      O000000000("Рюкзак 2 уровень", Items.LIGHT_BLUE_SHULKER_BOX, "Рюкзак II уровень", "Рюкзак (II уровень)")
         .O00000000("Особенности:", "- нельзя поставить на землю;", "- вместимость 15 слотов;")
         .O000000000(),
      O000000000("Рюкзак 3 уровень", Items.RED_SHULKER_BOX, "Рюкзак III уровень", "Рюкзак (III уровень)")
         .O00000000("Особенности:", "- нельзя поставить на землю;", "- вместимость 21 слот;", "● Данный товар можно")
         .O000000000(),
      O000000000("Рюкзак 4 уровень", Items.MAGENTA_SHULKER_BOX, "Рюкзак IV уровень", "Рюкзак (IV уровень)")
         .O00000000("Особенности:", "- нельзя поставить на землю;", "- вместимость 27 слотов;", "● Данный товар можно")
         .O000000000(),
      O000000000("Руна Бессмертие", Items.ORANGE_DYE)
         .O000000000("minecraft:luck_of_the_sea:1")
         .O00000000(
            "Эффект руны",
            "Особенности:",
            "после активации тотема с этим эффектом,",
            ".   Вы получите неуязвимость к урону",
            ".   продолжительностью 3 секунды;",
            "возможность наложить данный эффект",
            ".   на тотем через наковальню;"
         )
         .O000000000(),
      O000000000("Зелье исцеление", Items.POTION).O000000000(),
      O000000000("Зелье черепашьей мощи", Items.POTION).O000000000(),
      O000000000("Зелье черепашьей мощи", Items.POTION).O000000000(),
      O000000000("Эндер-жемчуг", Items.ENDER_PEARL).O000000000(),
      O000000000("Динамит а", Items.TNT).O00000000("Особенности:", "имеет в 3 раза больший радиус взрыва.").O000000000(),
      O000000000("Динамит б", Items.TNT).O00000000("Особенности:", "имеет в 10 раз больший радиус взрыва.").O000000000(),
      O000000000("Динамит б2", Items.TNT)
         .O00000000(
            "Особенности:", "взрывает практически все блоки", ".   в радиусе 12 блоков;", "не работает на всех стандартных", ".   заприваченных территориях;"
         )
         .O000000000(),
      O000000000("С4 взрывчатка", Items.TNT).O00000000("Особенности:", "разрушает блок незеритового привата;", "взрывает блоки обсидиана.").O000000000()
   );
   private static final Map<String, O000000OOOO000.W120> O000000000000O = O000000000();

   public static List<O000000OOOO000.W120> O00000000() {
      return O0000000000000;
   }

   public static boolean O00000000(String string) {
      return string != null && string.startsWith("holyworld:");
   }

   public static boolean O000000000(String string) {
      return O0000000000(string) != null;
   }

   public static O000000OOOO000.W120 O0000000000(String string) {
      if (string != null && !string.isBlank()) {
         O000000OOOO000.W120 var1 = O000000000000O.get(string);
         return var1 != null ? var1 : O000000000000O.get(O0000000000O00(O0000000000O0(string)));
      } else {
         return null;
      }
   }

   public static String O00000000000(String string) {
      O000000OOOO000.W120 var1 = O0000000000(string);
      return var1 == null ? string : var1.label();
   }

   public static String O000000000000(String string) {
      if (string != null && !string.isBlank()) {
         String[] var1 = string.split(":");
         return var1.length >= 2 ? O00000000000O0(var1[0] + ":" + var1[1]) : O00000000000O0(string);
      } else {
         return "";
      }
   }

   public static ItemStack O0000000000000(String string) {
      O000000OOOO000.W120 var1 = O0000000000(string);
      if (var1 == null) {
         return ItemStack.EMPTY;
      } else {
         return var1.item() == Items.PLAYER_HEAD && var1.texture() != null && !var1.texture().isBlank()
            ? O000000000(var1.texture(), var1.label())
            : new ItemStack(var1.item());
      }
   }

   public static boolean O00000000(ItemStack itemStack) {
      return O00000000("Трапка", itemStack);
   }

   public static boolean O000000000(ItemStack itemStack) {
      return O00000000("Ком снега", itemStack);
   }

   public static boolean O0000000000(ItemStack itemStack) {
      return O00000000("Стан", itemStack);
   }

   public static boolean O00000000000(ItemStack itemStack) {
      return O00000000("Взрывная трапка", itemStack);
   }

   public static boolean O00000000(String string, ItemStack itemStack, String string2) {
      O000000OOOO000.W120 var3 = O0000000000(string);
      if (var3 != null && itemStack != null && !itemStack.isEmpty() && itemStack.isOf(var3.item())) {
         String var4 = O0000000000O00(string2);
         if (var4.isEmpty()) {
            var4 = O0000000000O00(itemStack.getName().getString());
         }

         String var5 = O0000000000O00(O000000000000O(itemStack));
         return O000000000(var3, itemStack, var4, var5);
      } else {
         return false;
      }
   }

   private static boolean O00000000(String string, ItemStack itemStack) {
      O000000OOOO000.W120 var2 = O0000000000(string);
      return var2 != null && O00000000(var2, itemStack, O000000000000(itemStack), O0000000000000(itemStack));
   }

   public static boolean O00000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2) {
      return O00000000(o000000000000, itemStack, string, string2, true, true, true, true);
   }

   public static boolean O00000000(
      O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4
   ) {
      if (o000000000000 != null && itemStack != null && !itemStack.isEmpty() && itemStack.isOf(o000000000000.item())) {
         String var8 = string == null ? "" : string;
         if (var8.isEmpty()) {
            var8 = O0000000000O00(itemStack.getName().getString());
         }

         String var9 = string2 == null ? "" : string2;
         if (var9.isEmpty()) {
            var9 = var8;
         }

         return O000000000(o000000000000, itemStack, var8, var9, bl, bl2, bl3, bl4);
      } else {
         return false;
      }
   }

   public static boolean O00000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2, Set<String> set) {
      if (o000000000000 != null && itemStack != null && !itemStack.isEmpty() && itemStack.isOf(o000000000000.item())) {
         String var5 = string == null ? "" : string;
         if (var5.isEmpty()) {
            var5 = O0000000000O00(itemStack.getName().getString());
         }

         String var6 = string2 == null ? "" : string2;
         if (var6.isEmpty()) {
            var6 = var5;
         }

         return O000000000(o000000000000, itemStack, var5, var6, set);
      } else {
         return false;
      }
   }

   public static String O000000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         StringBuilder var1 = new StringBuilder();
         var1.append(itemStack.getName().getString()).append(' ');
         LoreComponent var2 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
         if (var2 != null) {
            for (Text var4 : var2.lines()) {
               var1.append(var4.getString()).append(' ');
            }
         }

         return O0000000000O00(var1.toString());
      } else {
         return "";
      }
   }

   public static String O0000000000000(ItemStack itemStack) {
      return itemStack != null && !itemStack.isEmpty() ? O0000000000O00(O000000000000O(itemStack)) : "";
   }

   public static String O000000000000O(String string) {
      return string == null ? "" : O0000000000OO(O0000000000O0O(string)).trim();
   }

   private static boolean O000000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2) {
      if (O00000000(o000000000000, string)) {
         return false;
      } else {
         if (string2.isEmpty()) {
            string2 = string;
         }

         boolean var4 = O00000000(string, o000000000000.aliases());
         if (!var4) {
            return false;
         } else {
            return !o000000000000.hasRequirements() ? true : O000000000(o000000000000, itemStack, string, string2, true, true, true, true);
         }
      }
   }

   private static boolean O000000000(
      O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4
   ) {
      if (O00000000(o000000000000, string)) {
         return false;
      } else {
         if (string2.isEmpty()) {
            string2 = string;
         }

         boolean var8 = O00000000(string, o000000000000.aliases());
         if (!var8) {
            return false;
         } else {
            return !o000000000000.hasRequirements()
               ? true
               : (!bl || O000000000(o000000000000, string2))
                  && (!bl2 || O00000000(o000000000000, itemStack, string2))
                  && (!bl3 || O000000000(o000000000000, itemStack, string2))
                  && (!bl4 || O0000000000(o000000000000, itemStack, string2));
         }
      }
   }

   private static boolean O000000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, String string2, Set<String> set) {
      if (O00000000(o000000000000, string)) {
         return false;
      } else {
         if (string2.isEmpty()) {
            string2 = string;
         }

         boolean var5 = O00000000(string, o000000000000.aliases());
         if (!var5) {
            return false;
         } else {
            return !o000000000000.hasRequirements()
               ? true
               : O000000000(o000000000000, string2)
                  && O00000000(o000000000000, itemStack, string2)
                  && O00000000(o000000000000, itemStack, string2, set)
                  && O0000000000(o000000000000, itemStack, string2);
         }
      }
   }

   private static boolean O00000000(O000000OOOO000.W120 o000000000000, String string) {
      String var2 = O0000000000O00(o000000000000.label());
      return var2.equals("элитры") && string.contains("броневаяэлитра")
         || var2.equals("динамитb") && string.contains("динамитb2")
         || var2.equals("зельечерепашьеймощи")
            && (string.contains("зельечерепашьеймощиii") || string.contains("черепашьямощьii") || string.contains("черепашьямощь2"));
   }

   private static boolean O000000000(O000000OOOO000.W120 o000000000000, String string) {
      for (String var3 : o000000000000.lore()) {
         String var4 = O0000000000O00(var3);
         if (!var4.isEmpty() && !string.contains(var4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean O00000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string) {
      for (O000000OOOO000.W116 var4 : o000000000000.attributes()) {
         if (!O00000000(itemStack, var4) && !O00000000(var4, string)) {
            return false;
         }
      }

      return true;
   }

   private static boolean O000000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string) {
      for (String var4 : o000000000000.enchantments()) {
         O000000OOOO000.W119 var5 = O00000000000OO(var4);
         if (var5 != null) {
            if (O00000000000O(var5.id())) {
               if (!O00000000(itemStack, var5.id(), var5.level()) && !O00000000(string, var5.raw())) {
                  return false;
               }
            } else {
               boolean var6 = O00000000(string, var5.raw()) || O00000000(string, var5);
               if (o000000000000.strictCheck() && !var6) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private static boolean O00000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string, Set<String> set) {
      for (String var5 : o000000000000.enchantments()) {
         if (set == null || set.contains(O000000000000(var5))) {
            O000000OOOO000.W119 var6 = O00000000000OO(var5);
            if (var6 != null) {
               if (O00000000000O(var6.id())) {
                  if (!O00000000(itemStack, var6.id(), var6.level()) && !O00000000(string, var6.raw())) {
                     return false;
                  }
               } else {
                  boolean var7 = O00000000(string, var6.raw()) || O00000000(string, var6);
                  if (o000000000000.strictCheck() && !var7) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   private static boolean O0000000000(O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string) {
      if (o000000000000.effects().isEmpty()) {
         return true;
      } else {
         boolean var3 = string.contains("hms")
            || itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS) != null
            || O00000000(string, List.of("урон", "брон", "скор", "здоров", "damage", "armor", "speed", "health"));
         if (!var3) {
            return true;
         } else {
            for (String var5 : o000000000000.effects()) {
               if (!O000000000(var5, itemStack, string)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private static boolean O000000000(String string, ItemStack itemStack, String string2) {
      String var3 = O0000000000O00(string);
      if (!var3.isEmpty() && string2.contains(var3)) {
         return true;
      } else {
         O000000OOOO000.W118 var4 = O0000000000O(string);
         if (var4 == null) {
            return true;
         } else {
            String var6 = var4.type();

            RegistryEntry var5 = switch (var6) {
               case "damage" -> EntityAttributes.ATTACK_DAMAGE;
               case "armor" -> EntityAttributes.ARMOR;
               case "speed" -> EntityAttributes.MOVEMENT_SPEED;
               case "health" -> EntityAttributes.MAX_HEALTH;
               default -> null;
            };
            return var5 != null && O00000000(itemStack, var5, var4.level()) ? true : O00000000(string2, var4.type(), var4.level());
         }
      }
   }

   private static boolean O00000000(String string, String string2, double d) {
      String var4 = O00000000(d);
      String var5 = O00000000((int)d);

      for (String var10 : switch (string2) {
         case "damage" -> List.of("урон", "damage");
         case "armor" -> List.of("брон", "armor");
         case "speed" -> List.of("скор", "speed");
         case "health" -> List.of("здоров", "health");
         default -> List.of(string2);
      }) {
         String var9 = O0000000000O00(var10);
         if (string.contains(var9 + var4) || string.contains(var4 + var9) || !var5.isEmpty() && (string.contains(var9 + var5) || string.contains(var5 + var9))) {
            return true;
         }
      }

      return false;
   }

   private static boolean O00000000(String string, O000000OOOO000.W119 o00000000000) {
      List var2 = O00000000000.getOrDefault(o00000000000.id(), List.of());
      if (var2.isEmpty()) {
         return false;
      } else {
         String var3 = O00000000((double)o00000000000.level());
         String var4 = O00000000(o00000000000.level());

         for (String var6 : (List<String>)var2) {
            String var7 = O0000000000O00(var6);
            if (!var7.isEmpty()) {
               if (!string.contains(var7 + var3) && !string.contains(var3 + var7)) {
                  if (var4.isEmpty() || !string.contains(var7 + var4) && !string.contains(var4 + var7)) {
                     if (o00000000000.level() <= 1 && string.contains(var7)) {
                        return true;
                     }
                     continue;
                  }

                  return true;
               }

               return true;
            }
         }

         return false;
      }
   }

   private static boolean O00000000(String string, String string2) {
      String var2 = O0000000000O00(string2);
      return !var2.isEmpty() && string.contains(var2);
   }

   private static boolean O00000000(O000000OOOO000.W116 o00000000, String string) {
      String var2 = O000000000(o00000000.value());
      String var3 = O00000000(o00000000);
      return !var3.isEmpty() && (string.contains(var3 + var2) || string.contains(var2 + var3));
   }

   private static boolean O00000000(ItemStack itemStack, O000000OOOO000.W116 o00000000) {
      AttributeModifiersComponent var2 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (var2 == null) {
         return false;
      } else {
         for (Entry var4 : var2.modifiers()) {
            EntityAttributeModifier var5 = var4.modifier();
            if (O00000000(o00000000, var4.attribute()) && Math.abs(var5.value() - o00000000.value()) <= 1.0E-4) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean O00000000(ItemStack itemStack, RegistryEntry<EntityAttribute> registryEntry, double d) {
      AttributeModifiersComponent var4 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
      if (var4 == null) {
         return false;
      } else {
         for (Entry var6 : var4.modifiers()) {
            EntityAttributeModifier var7 = var6.modifier();
            if (var6.attribute().equals(registryEntry) && Math.abs(var7.value() - d) <= 1.0E-4) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean O00000000(O000000OOOO000.W116 o00000000, RegistryEntry<EntityAttribute> registryEntry) {
      if (o00000000.attribute() != null && o00000000.attribute().equals(registryEntry)) {
         return true;
      } else {
         String var2 = O0000000000OO0(o00000000.id());
         String var3 = O0000000000OO0(O000000000(registryEntry));
         return !var2.isEmpty() && var2.equals(var3);
      }
   }

   private static boolean O00000000(ItemStack itemStack, String string, int i) {
      ItemEnchantmentsComponent var3 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
      if (var3 != null && !var3.isEmpty()) {
         String var4 = O00000000000O0(string);

         for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var6 : var3.getEnchantmentEntries()) {
            String var7 = O00000000((RegistryEntry<Enchantment>)var6.getKey());
            if (var4.equals(O00000000000O0(var7)) && var6.getIntValue() >= i) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String O00000000(RegistryEntry<Enchantment> registryEntry) {
      Optional var1 = registryEntry.getKey().map(registryKey -> registryKey.getValue());
      return ((Optional<Identifier>)var1).<String>map(Identifier::toString).orElse("");
   }

   private static boolean O00000000000O(String string) {
      String var1 = O00000000000O0(string);

      return switch (var1) {
         case "aqua_affinity", "blast_protection", "depth_strider", "efficiency", "feather_falling", "fire_aspect", "fire_protection", "fortune", "luck_of_the_sea", "looting", "mending", "projectile_protection", "protection", "respiration", "sharpness", "smite", "soul_speed", "sweeping_edge", "thorns", "unbreaking", "bane_of_arthropods" -> true;
         default -> false;
      };
   }

   private static String O00000000000O0(String string) {
      String var1 = string == null ? "" : string.toLowerCase(Locale.ROOT).trim();
      int var2 = var1.indexOf(58);
      if (var2 >= 0 && var1.substring(0, var2).indexOf(45) < 0) {
         var1 = var1.substring(var2 + 1);
      }

      return O0000000000.getOrDefault(var1, var1);
   }

   private static O000000OOOO000.W119 O00000000000OO(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = string.trim();
         int var2 = var1.lastIndexOf(58);
         String var3 = var2 > 0 ? var1.substring(0, var2).trim().toLowerCase(Locale.ROOT) : var1.toLowerCase(Locale.ROOT);
         int var4 = 1;
         if (var2 > 0 && var2 < var1.length() - 1) {
            try {
               var4 = Integer.parseInt(var1.substring(var2 + 1).replaceAll("[^0-9]", ""));
            } catch (NumberFormatException var6) {
               var4 = 1;
            }
         }

         return new O000000OOOO000.W119(string, var3, Math.max(1, var4));
      } else {
         return null;
      }
   }

   private static O000000OOOO000.W118 O0000000000O(String string) {
      if (string != null && !string.isBlank()) {
         String[] var1 = string.split(":", 2);
         if (var1.length != 2) {
            return null;
         } else {
            String var2 = var1[0].toLowerCase(Locale.ROOT).replace("hms-", "").trim();

            try {
               return new O000000OOOO000.W118(var2, Double.parseDouble(var1[1].replace(',', '.')));
            } catch (NumberFormatException var4) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static Map<String, O000000OOOO000.W120> O000000000() {
      HashMap var0 = new HashMap();

      for (O000000OOOO000.W120 var2 : O0000000000000) {
         var0.put(var2.key(), var2);
         var0.put(O0000000000O00(var2.label()), var2);

         for (String var4 : var2.aliases()) {
            if (!var4.isEmpty()) {
               var0.putIfAbsent(var4, var2);
            }
         }
      }

      return Map.copyOf(var0);
   }

   private static O000000OOOO000.W120 O00000000(String string, Item item, String... strings) {
      return O000000000(string, item, strings).O000000000();
   }

   private static O000000OOOO000.W117 O000000000(String string, Item item, String... strings) {
      return new O000000OOOO000.W117(string, item, strings);
   }

   private static O000000OOOO000.W116 O00000000(RegistryEntry<EntityAttribute> registryEntry, double d) {
      return new O000000OOOO000.W116(registryEntry, O000000000(registryEntry), d);
   }

   private static O000000OOOO000.W116 O00000000(String string, double d) {
      return new O000000OOOO000.W116(null, string, d);
   }

   private static ItemStack O000000000(String string, String string2) {
      ItemStack var2 = new ItemStack(Items.PLAYER_HEAD);
      UUID var3 = UUID.nameUUIDFromBytes(("holyworld:" + string2 + string).getBytes(StandardCharsets.UTF_8));
      GameProfile var4 = new GameProfile(var3, "");
      var4.getProperties().put("textures", new Property("textures", string));
      var2.set(DataComponentTypes.PROFILE, new ProfileComponent(var4));
      return var2;
   }

   private static String O0000000000O0(String string) {
      return O00000000(string) ? string.substring("holyworld:".length()) : string;
   }

   static String O0000000000O00(String string) {
      return string == null
         ? ""
         : O0000000000OO(O0000000000O0O(string).replaceAll("(?i)§[0-9A-FK-OR]", "").toLowerCase(Locale.ROOT)).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private static String O0000000000O0O(String string) {
      return string.replace("ᴀ", "a")
         .replace("ʙ", "b")
         .replace("ᴄ", "c")
         .replace("ᴅ", "d")
         .replace("ᴇ", "e")
         .replace("ғ", "f")
         .replace("ɢ", "g")
         .replace("ʜ", "h")
         .replace("ɪ", "i")
         .replace("ᴊ", "j")
         .replace("ᴋ", "k")
         .replace("ʟ", "l")
         .replace("ᴍ", "m")
         .replace("ɴ", "n")
         .replace("ᴏ", "o")
         .replace("ᴘ", "p")
         .replace("ǫ", "q")
         .replace("ʀ", "r")
         .replace("ѕ", "s")
         .replace("ᴛ", "t")
         .replace("ᴜ", "u")
         .replace("ᴠ", "v")
         .replace("ᴡ", "w")
         .replace("х", "x")
         .replace("ʏ", "y")
         .replace("ᴢ", "z");
   }

   private static String O0000000000OO(String string) {
      return string.replace("инфинити", "infinity").replace("этернити", "eternity").replace("етернити", "eternity").replace("стингер", "stinger");
   }

   private static boolean O00000000(String string, List<String> list) {
      if (string != null && !string.isEmpty()) {
         for (String var3 : list) {
            if (var3 != null && !var3.isEmpty() && string.contains(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String O000000000000O(ItemStack itemStack) {
      StringBuilder var1 = new StringBuilder();
      var1.append(itemStack.getName().getString()).append(' ');
      LoreComponent var2 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var2 != null) {
         for (Text var4 : var2.lines()) {
            var1.append(var4.getString()).append(' ');
         }
      }

      var1.append(itemStack.getComponents());
      return var1.toString();
   }

   private static String O00000000(O000000OOOO000.W116 o00000000) {
      String var1 = O0000000000OO0(o00000000.id());
      if (!var1.isEmpty()) {
         return O0000000000O00(var1);
      } else {
         RegistryEntry var2 = o00000000.attribute();
         if (var2 == null) {
            return "";
         } else if (var2.equals(EntityAttributes.ATTACK_DAMAGE)) {
            return "attackdamage";
         } else if (var2.equals(EntityAttributes.ARMOR)) {
            return "armor";
         } else if (var2.equals(EntityAttributes.MOVEMENT_SPEED)) {
            return "movementspeed";
         } else {
            return var2.equals(EntityAttributes.MAX_HEALTH) ? "maxhealth" : "";
         }
      }
   }

   private static String O000000000(RegistryEntry<EntityAttribute> registryEntry) {
      return registryEntry == null ? "" : registryEntry.getKey().map(registryKey -> registryKey.getValue().toString()).orElse("");
   }

   private static String O0000000000OO0(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.toLowerCase(Locale.ROOT).trim();
         if (var1.startsWith("minecraft:")) {
            var1 = var1.substring("minecraft:".length());
         }

         if (var1.startsWith("generic.")) {
            var1 = var1.substring("generic.".length());
         }

         return var1.replace('.', '_');
      }
   }

   private static String O00000000(double d) {
      return d == Math.rint(d) ? String.valueOf((int)d) : O000000000(d);
   }

   private static String O000000000(double d) {
      return d == Math.rint(d) ? String.valueOf((int)d) : String.valueOf(d).replace(".", "");
   }

   private static String O00000000(int i) {
      return switch (i) {
         case 1 -> "i";
         case 2 -> "ii";
         case 3 -> "iii";
         case 4 -> "iv";
         case 5 -> "v";
         case 6 -> "vi";
         case 7 -> "vii";
         case 8 -> "viii";
         case 9 -> "ix";
         case 10 -> "x";
         default -> "";
      };
   }

   public record W116(RegistryEntry<EntityAttribute> attribute, String id, double value) {
   }

   static final class W117 {
      private final String O00000000;
      private final Item O000000000;
      private final List<String> O0000000000 = new ArrayList<>();
      private final List<String> O00000000000 = new ArrayList<>();
      private final List<String> O000000000000 = new ArrayList<>();
      private final List<String> O0000000000000 = new ArrayList<>();
      private final List<O000000OOOO000.W116> O000000000000O = new ArrayList<>();
      private String O00000000000O;
      private boolean O00000000000O0;

      W117(String string, Item item, String... strings) {
         this.O00000000 = string;
         this.O000000000 = item;
         this.O0000000000.add(O000000OOOO000.O0000000000O00(string));

         for (String var7 : strings) {
            this.O0000000000.add(O000000OOOO000.O0000000000O00(var7));
         }
      }

      O000000OOOO000.W117 O00000000(String... strings) {
         this.O00000000000.addAll(List.of(strings));
         return this;
      }

      O000000OOOO000.W117 O000000000(String... strings) {
         this.O000000000000.addAll(List.of(strings));
         return this;
      }

      private O000000OOOO000.W117 O0000000000(String... strings) {
         this.O0000000000000.addAll(List.of(strings));
         return this;
      }

      O000000OOOO000.W117 O00000000(O000000OOOO000.W116... o00000000s) {
         this.O000000000000O.addAll(List.of(o00000000s));
         return this;
      }

      O000000OOOO000.W117 O00000000(String string) {
         this.O00000000000O = string;
         return this;
      }

      private O000000OOOO000.W117 O00000000() {
         this.O00000000000O0 = true;
         return this;
      }

      O000000OOOO000.W120 O000000000() {
         String var1 = "holyworld:" + O000000OOOO000.O0000000000O00(this.O00000000);
         int var2 = O000000OOOO000.O000000000000.merge(var1, 1, Integer::sum);
         return new O000000OOOO000.W120(
            var2 == 1 ? var1 : var1 + ":" + var2,
            this.O00000000,
            this.O000000000,
            List.copyOf(this.O0000000000),
            List.copyOf(this.O00000000000),
            List.copyOf(this.O000000000000),
            List.copyOf(this.O0000000000000),
            List.copyOf(this.O000000000000O),
            this.O00000000000O,
            this.O00000000000O0
         );
      }
   }

   record W118(String type, double level) {
   }

   record W119(String raw, String id, int level) {
   }

   public record W120(
      String key,
      String label,
      Item item,
      List<String> aliases,
      List<String> lore,
      List<String> enchantments,
      List<String> effects,
      List<O000000OOOO000.W116> attributes,
      String texture,
      boolean strictCheck
   ) {
      boolean hasRequirements() {
         return !this.lore.isEmpty() || !this.enchantments.isEmpty() || !this.effects.isEmpty() || !this.attributes.isEmpty();
      }
   }
}
