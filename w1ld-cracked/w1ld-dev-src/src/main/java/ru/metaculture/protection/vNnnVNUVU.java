package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_9285;
import net.minecraft.class_9290;
import net.minecraft.class_9296;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9285.class_9287;

public class vNnnVNUVU {
   private static final String UuUVuuUu = "holyworld:";
   private static final double C00OOC00oO = 1.0E-4;
   private static final Map<String, String> uUnuvNvvNU = Map.of("sweeping", "sweeping_edge");
   private static final Map<String, List<String>> vVvUvVVuuNvV = Map.ofEntries(
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
   static final Map<String, Integer> uNNnnnuuuN = new HashMap<>();
   private static final List<vNnnVNUVU.nvUnvV> nuUnNvnuUu = List.of(
      C00OOC00oO("Шлем инфинити", class_1802.field_22027)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:aqua_affinity:1",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:respiration:3",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый II")
         .C00OOC00oO(),
      C00OOC00oO("Нагрудник инфинити", class_1802.field_22028)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 8.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый II")
         .C00OOC00oO(),
      C00OOC00oO("Поножи инфинити", class_1802.field_22029)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 6.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый II")
         .C00OOC00oO(),
      C00OOC00oO("Ботинки инфинити", class_1802.field_22030)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:feather_falling:4",
            "minecraft:depth_strider:3",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5",
            "minecraft:soul_speed:3"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый II")
         .C00OOC00oO(),
      C00OOC00oO("Талисман инфинити", class_1802.field_8288)
         .C00OOC00oO("minecraft:unbreaking:1")
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Макс. здоровье II", "• Броня II", "• Урон II", "• Скорость II")
         .C00OOC00oO(),
      C00OOC00oO("Кирка этернити", class_1802.field_22024)
         .C00OOC00oO("minecraft:efficiency:10", "minecraft:fortune:5", "minecraft:unbreaking:5", "minecraft:mending:1")
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 5.0), UuUVuuUu("minecraft:attack_speed", -2.8F))
         .UuUVuuUu("Магнетизм I", "Неразрушимость I", "Автоплавка", "Опытный III", "Бур II")
         .C00OOC00oO(),
      C00OOC00oO("Шлем этернити", class_1802.field_22027)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:aqua_affinity:1",
            "minecraft:fire_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:respiration:3",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Нагрудник этернити", class_1802.field_22028)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 8.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Штаны этернити", class_1802.field_22029)
         .C00OOC00oO(
            "minecraft:blast_protection:5",
            "minecraft:fire_protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 6.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Ботинки этернити", class_1802.field_22030)
         .C00OOC00oO(
            "minecraft:fire_protection:5",
            "minecraft:soul_speed:3",
            "minecraft:blast_protection:5",
            "minecraft:unbreaking:5",
            "minecraft:protection:5",
            "minecraft:projectile_protection:5",
            "minecraft:depth_strider:3",
            "minecraft:feather_falling:4"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Меч этернити", class_1802.field_22022)
         .C00OOC00oO(
            "minecraft:smite:7",
            "minecraft:bane_of_arthropods:7",
            "minecraft:fire_aspect:2",
            "minecraft:mending:1",
            "minecraft:sweeping_edge:3",
            "minecraft:unbreaking:5",
            "minecraft:looting:5",
            "minecraft:sharpness:7"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 7.0), UuUVuuUu("minecraft:attack_speed", -2.4F))
         .UuUVuuUu("Разрушитель II", "Богач I", "Критический II")
         .C00OOC00oO(),
      C00OOC00oO("Талисман этернити", class_1802.field_8288)
         .C00OOC00oO("minecraft:unbreaking:1")
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Скорость II", "• Урон II", "• Броня II")
         .C00OOC00oO(),
      C00OOC00oO("Сфера этернити", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Броня II", "• Скорость II", "• Урон II")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .C00OOC00oO(),
      C00OOC00oO("Кирка стингер", class_1802.field_22024)
         .C00OOC00oO("minecraft:efficiency:8", "minecraft:unbreaking:4", "minecraft:mending:1", "minecraft:fortune:4")
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 5.0), UuUVuuUu("minecraft:attack_speed", -2.8F))
         .UuUVuuUu("Неразрушимость I", "Автоплавка", "Опытный III", "Бур I")
         .C00OOC00oO(),
      C00OOC00oO("Шлем стингер", class_1802.field_22027)
         .C00OOC00oO(
            "minecraft:fire_protection:4",
            "minecraft:blast_protection:4",
            "minecraft:aqua_affinity:1",
            "minecraft:unbreaking:4",
            "minecraft:protection:5",
            "minecraft:projectile_protection:4",
            "minecraft:respiration:3"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .C00OOC00oO(),
      C00OOC00oO("Нагрудник стингер", class_1802.field_22028)
         .C00OOC00oO(
            "minecraft:blast_protection:4",
            "minecraft:fire_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:5",
            "minecraft:projectile_protection:4"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 8.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Штаны стингер", class_1802.field_22029)
         .C00OOC00oO(
            "minecraft:blast_protection:4",
            "minecraft:fire_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:4",
            "minecraft:projectile_protection:4"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 6.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .UuUVuuUu("Непробиваемый I")
         .C00OOC00oO(),
      C00OOC00oO("Ботинки стингер", class_1802.field_22030)
         .C00OOC00oO(
            "minecraft:fire_protection:4",
            "minecraft:soul_speed:3",
            "minecraft:blast_protection:4",
            "minecraft:unbreaking:4",
            "minecraft:protection:4",
            "minecraft:projectile_protection:4",
            "minecraft:depth_strider:3",
            "minecraft:feather_falling:4"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0), UuUVuuUu("minecraft:armor_toughness", 3.0), UuUVuuUu("minecraft:knockback_resistance", 0.1F))
         .C00OOC00oO(),
      C00OOC00oO("Меч стингер", class_1802.field_22022)
         .C00OOC00oO(
            "minecraft:smite:7",
            "minecraft:bane_of_arthropods:7",
            "minecraft:fire_aspect:2",
            "minecraft:mending:1",
            "minecraft:sweeping_edge:3",
            "minecraft:unbreaking:4",
            "minecraft:looting:5",
            "minecraft:sharpness:6"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 7.0), UuUVuuUu("minecraft:attack_speed", -2.4F))
         .UuUVuuUu("Богач I", "Критический II")
         .C00OOC00oO(),
      C00OOC00oO("Талисман стингер", class_1802.field_8288)
         .C00OOC00oO("minecraft:unbreaking:1")
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Скорость I", "• Броня II", "• Урон II")
         .C00OOC00oO(),
      C00OOC00oO("Сфера стингер", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Броня II", "• Скорость I", "• Урон II")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .C00OOC00oO(),
      C00OOC00oO("Сфера Цербера", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:waypoint_transmit_range", -1.0))
         .UuUVuuUu("Проклятие утраты", "• Спешка I", "• Урон V")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0="
         )
         .C00OOC00oO(),
      C00OOC00oO("Сфера Флеша", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 1.0))
         .UuUVuuUu("Проклятие утраты", "• Броня I", "• Скорость III")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc0MDBlYTE5ZGJkODRmNzVjMzlhZDY4MjNhYzRlZjc4NmYzOWY0OGZjNmY4NDYwMjM2NmFjMjliODM3NDIyIn19fQ=="
         )
         .C00OOC00oO(),
      C00OOC00oO("Легендарная сфера", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:waypoint_transmit_range", -1.0))
         .UuUVuuUu("• Урон III")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
         )
         .C00OOC00oO(),
      C00OOC00oO("Мифическая сфера", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Броня II", "• Урон III")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .C00OOC00oO(),
      C00OOC00oO("Мифическая сфера", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 3.0))
         .UuUVuuUu("• Скорость II", "• Броня III")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ=="
         )
         .C00OOC00oO(),
      C00OOC00oO("Золотой Спавнер", class_1802.field_8849)
         .UuUVuuUu(
            "Особенности:",
            "виртуально фармит мобов",
            ".  без спавна сущностей;",
            "лут и опыт копятся",
            ".  во внутреннем хранилище;",
            "вставка яйца может",
            ".  сломать спавнер.",
            "Шанс уничтожения: 50.6%"
         )
         .C00OOC00oO(),
      C00OOC00oO("Взрывчатое вещество", class_1802.field_19060)
         .UuUVuuUu("Особенности:", "используется только для крафта", ".   взрывных предметов;", "можно перекрафтить в 9 пороха.")
         .C00OOC00oO(),
      C00OOC00oO("100", class_1802.field_8287).UuUVuuUu("В пузырьке 30971 опыта (100 ур.)", "Киньте пузырек, чтобы получить опыт").C00OOC00oO(),
      C00OOC00oO("Загадочный спавнер", class_1802.field_8849)
         .UuUVuuUu(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 25.0%",
            "• Ведьма — 7.0%",
            "• Блейз — 20.0%",
            "• Зомби — 18.0%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .C00OOC00oO(),
      C00OOC00oO("Загадочное яйцо призыва", class_1802.field_8254)
         .UuUVuuUu(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 25.0%",
            "• Ведьма — 7.0%",
            "• Блейз — 20.0%",
            "• Зомби — 18.0%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .C00OOC00oO(),
      C00OOC00oO("Загадочное яйцо призыва", class_1802.field_8503)
         .UuUVuuUu(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 33.0%",
            "• Крипер — 2.0%",
            "• Блейз — 17.5%",
            "• Зомби — 17.5%",
            "• Скелет — 30.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .C00OOC00oO(),
      C00OOC00oO("Загадочное яйцо призыва", class_1802.field_25777)
         .UuUVuuUu(
            "Потенциальное содержание:",
            "• Брутальный пиглин — 50.0%",
            "• Ведьма — 4.0%",
            "• Мини-зомби — 20.0%",
            "• Крипер — 1.0%",
            "• Блейз — 25.0%",
            "▍ Может вмещать в себе случайного моба,",
            "▍ с шансом из списка, указанного выше."
         )
         .C00OOC00oO(),
      C00OOC00oO("Трапка", class_1802.field_8882).C00OOC00oO(),
      C00OOC00oO("Ком снега", class_1802.field_8543, "Снежок заморозки", "Снежок заморозка").C00OOC00oO(),
      C00OOC00oO("Стан", class_1802.field_8137).C00OOC00oO(),
      C00OOC00oO("Взрывная трапка", class_1802.field_8662, "Взрывная").C00OOC00oO(),
      C00OOC00oO("С4", class_1802.field_8626).UuUVuuUu("Особенности:", "разрушает блок незеритового привата;", "взрывает блоки обсидиана.").C00OOC00oO(),
      C00OOC00oO("Справедливость", class_1802.field_8574)
         .UuUVuuUu(
            "Особенности:",
            "когда предмет в инвентаре, вы получаете",
            ".   защиту от различных дебафов слепота",
            ".   прыгучесть, отравление, иссушение",
            ".   медлительность и слабость."
         )
         .C00OOC00oO(),
      C00OOC00oO("Броневая элитра", class_1802.field_8833)
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 8.0))
         .UuUVuuUu("Особенности:", "имеет свойства алмазного нагрудника;", "позволяет летать как обычная элитра;", "возможно накладывать зачарования.")
         .C00OOC00oO(),
      C00OOC00oO("Арбалет этернити", class_1802.field_8399)
         .C00OOC00oO("minecraft:piercing:5", "minecraft:multishot:1", "minecraft:unbreaking:3", "minecraft:quick_charge:3")
         .UuUVuuUu("Оглушение II")
         .C00OOC00oO(),
      C00OOC00oO("Сфера ᴀʀᴍᴏʀᴛᴀʟɪᴛʏ", class_1802.field_8575, "Сфера armortlity", "Сфера armortality")
         .UuUVuuUu(UuUVuuUu("minecraft:armor", 2.0))
         .UuUVuuUu("• Броня II", "• Макс. здоровье II", "• Урон II")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWE2MmI5ZGU2YTI2Yjg2ODY5Y2EyMmVhNDBmMWJkZTgwYTA0MzBhNTQ1NDdiZWNjZThmZGE4NzA3Nzc3MjU4ZiJ9fX0="
         )
         .C00OOC00oO(),
      C00OOC00oO("Сфера immortality", class_1802.field_8575)
         .UuUVuuUu(UuUVuuUu("minecraft:waypoint_transmit_range", -1.0))
         .UuUVuuUu("• Скорость II", "• Урон III")
         .UuUVuuUu(
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNlZDRjZTIzOTMzZTY2ZTA0ZGYxNjA3MDY0NGY3NTk5ZWViNTUzMDdmN2VhZmU4ZDkyZjQwZmIzNTIwODYzYyJ9fX0="
         )
         .C00OOC00oO(),
      C00OOC00oO("15", class_1802.field_8287).UuUVuuUu("В пузырьке 315 опыта (15 ур.)", "Киньте пузырек, чтобы получить опыт").C00OOC00oO(),
      C00OOC00oO("50", class_1802.field_8287).UuUVuuUu("В пузырьке 5345 опыта (50 ур.)", "Киньте пузырек, чтобы получить опыт").C00OOC00oO(),
      C00OOC00oO("Особый компас", class_1802.field_8251)
         .C00OOC00oO("minecraft:luck_of_the_sea:1")
         .UuUVuuUu("Особенности:", "- ведёт к ближайшему или случайному", "- можно использовать раз в 8 часов.")
         .C00OOC00oO(),
      C00OOC00oO("Тнт-Пушка", class_1802.field_8357)
         .C00OOC00oO("minecraft:soul_speed:10")
         .UuUVuuUu(
            "Особенности:",
            "- запускает летящий динамит",
            ".   со скоростью до 5 блоков за секунду;",
            "- при запуске сохраняет свойства",
            ".   особых динамитов и пиротехники;",
            "- можно сломать в чужом привате.",
            "● Данный товар можно"
         )
         .C00OOC00oO(),
      C00OOC00oO("Меч инфинити", class_1802.field_22022)
         .C00OOC00oO(
            "minecraft:sharpness:8",
            "minecraft:unbreaking:5",
            "minecraft:mending:1",
            "minecraft:fire_aspect:2",
            "minecraft:bane_of_arthropods:7",
            "minecraft:sweeping_edge:3",
            "minecraft:smite:7",
            "minecraft:looting:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 7.0), UuUVuuUu("minecraft:attack_speed", -2.4F))
         .UuUVuuUu("Богач VI", "Разрушитель II", "Критический II")
         .C00OOC00oO(),
      C00OOC00oO("Меч Цербера ", class_1802.field_22022)
         .C00OOC00oO(
            "minecraft:sharpness:9",
            "minecraft:unbreaking:5",
            "minecraft:mending:1",
            "minecraft:fire_aspect:2",
            "minecraft:bane_of_arthropods:7",
            "minecraft:sweeping_edge:3",
            "minecraft:smite:7",
            "minecraft:looting:5"
         )
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 7.0), UuUVuuUu("minecraft:attack_speed", -2.4F))
         .UuUVuuUu("Богач VI", "Разрушитель III", "Критический II", "● Данный товар можно")
         .C00OOC00oO(),
      C00OOC00oO("Нерушимые элитры", class_1802.field_8833).C00OOC00oO(),
      C00OOC00oO("Меч Выгодный фарм", class_1802.field_22022)
         .UuUVuuUu(UuUVuuUu("minecraft:attack_damage", 7.0), UuUVuuUu("minecraft:attack_speed", -2.4F))
         .UuUVuuUu("Фармер II", "● Данный товар можно")
         .C00OOC00oO(),
      C00OOC00oO("Рюкзак инфинити", class_1802.field_8548, "- Рюкзак Iɴғɪɴɪᴛʏ -")
         .UuUVuuUu("Особенности:", "- нельзя поставить на землю;", "- вместимость 36 слотов;", "● Данный товар можно")
         .C00OOC00oO(),
      C00OOC00oO("Рюкзак 1 уровень", class_1802.field_8520, "Рюкзак I уровень", "Рюкзак (I уровень)")
         .UuUVuuUu("Особенности:", "- нельзя поставить на землю;", "- вместимость 9 слотов;")
         .C00OOC00oO(),
      C00OOC00oO("Рюкзак 2 уровень", class_1802.field_8829, "Рюкзак II уровень", "Рюкзак (II уровень)")
         .UuUVuuUu("Особенности:", "- нельзя поставить на землю;", "- вместимость 15 слотов;")
         .C00OOC00oO(),
      C00OOC00oO("Рюкзак 3 уровень", class_1802.field_8676, "Рюкзак III уровень", "Рюкзак (III уровень)")
         .UuUVuuUu("Особенности:", "- нельзя поставить на землю;", "- вместимость 21 слот;", "● Данный товар можно")
         .C00OOC00oO(),
      C00OOC00oO("Рюкзак 4 уровень", class_1802.field_8050, "Рюкзак IV уровень", "Рюкзак (IV уровень)")
         .UuUVuuUu("Особенности:", "- нельзя поставить на землю;", "- вместимость 27 слотов;", "● Данный товар можно")
         .C00OOC00oO(),
      C00OOC00oO("Руна Бессмертие", class_1802.field_8492)
         .C00OOC00oO("minecraft:luck_of_the_sea:1")
         .UuUVuuUu(
            "Эффект руны",
            "Особенности:",
            "после активации тотема с этим эффектом,",
            ".   Вы получите неуязвимость к урону",
            ".   продолжительностью 3 секунды;",
            "возможность наложить данный эффект",
            ".   на тотем через наковальню;"
         )
         .C00OOC00oO(),
      C00OOC00oO("Зелье исцеление", class_1802.field_8574).C00OOC00oO(),
      C00OOC00oO("Зелье черепашьей мощи", class_1802.field_8574).C00OOC00oO(),
      C00OOC00oO("Зелье черепашьей мощи", class_1802.field_8574).C00OOC00oO(),
      C00OOC00oO("Эндер-жемчуг", class_1802.field_8634).C00OOC00oO(),
      C00OOC00oO("Динамит а", class_1802.field_8626).UuUVuuUu("Особенности:", "имеет в 3 раза больший радиус взрыва.").C00OOC00oO(),
      C00OOC00oO("Динамит б", class_1802.field_8626).UuUVuuUu("Особенности:", "имеет в 10 раз больший радиус взрыва.").C00OOC00oO(),
      C00OOC00oO("Динамит б2", class_1802.field_8626)
         .UuUVuuUu(
            "Особенности:", "взрывает практически все блоки", ".   в радиусе 12 блоков;", "не работает на всех стандартных", ".   заприваченных территориях;"
         )
         .C00OOC00oO(),
      C00OOC00oO("С4 взрывчатка", class_1802.field_8626)
         .UuUVuuUu("Особенности:", "разрушает блок незеритового привата;", "взрывает блоки обсидиана.")
         .C00OOC00oO()
   );
   private static final Map<String, vNnnVNUVU.nvUnvV> VVuuUN = C00OOC00oO();

   public static List<vNnnVNUVU.nvUnvV> UuUVuuUu() {
      return nuUnNvnuUu;
   }

   public static boolean UuUVuuUu(String var0) {
      return var0 != null && var0.startsWith("holyworld:");
   }

   public static boolean C00OOC00oO(String var0) {
      return uUnuvNvvNU(var0) != null;
   }

   public static vNnnVNUVU.nvUnvV uUnuvNvvNU(String var0) {
      if (var0 != null && !var0.isBlank()) {
         vNnnVNUVU.nvUnvV var1 = VVuuUN.get(var0);
         return var1 != null ? var1 : VVuuUN.get(nUUVuvU(UuuNnUvUuv(var0)));
      } else {
         return null;
      }
   }

   public static String vVvUvVVuuNvV(String var0) {
      vNnnVNUVU.nvUnvV var1 = uUnuvNvvNU(var0);
      return var1 == null ? var0 : var1.label();
   }

   public static String uNNnnnuuuN(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String[] var1 = var0.split(":");
         return var1.length >= 2 ? uVUuuVnNVU(var1[0] + ":" + var1[1]) : uVUuuVnNVU(var0);
      } else {
         return "";
      }
   }

   public static class_1799 nuUnNvnuUu(String var0) {
      vNnnVNUVU.nvUnvV var1 = uUnuvNvvNU(var0);
      if (var1 == null) {
         return class_1799.field_8037;
      } else {
         return var1.item() == class_1802.field_8575 && var1.texture() != null && !var1.texture().isBlank()
            ? C00OOC00oO(var1.texture(), var1.label())
            : new class_1799(var1.item());
      }
   }

   public static boolean UuUVuuUu(class_1799 var0) {
      return UuUVuuUu("Трапка", var0);
   }

   public static boolean C00OOC00oO(class_1799 var0) {
      return UuUVuuUu("Ком снега", var0);
   }

   public static boolean uUnuvNvvNU(class_1799 var0) {
      return UuUVuuUu("Стан", var0);
   }

   public static boolean vVvUvVVuuNvV(class_1799 var0) {
      return UuUVuuUu("Взрывная трапка", var0);
   }

   public static boolean UuUVuuUu(String var0, class_1799 var1, String var2) {
      vNnnVNUVU.nvUnvV var3 = uUnuvNvvNU(var0);
      if (var3 != null && var1 != null && !var1.method_7960() && var1.method_31574(var3.item())) {
         String var4 = nUUVuvU(var2);
         if (var4.isEmpty()) {
            var4 = nUUVuvU(var1.method_7964().getString());
         }

         String var5 = nUUVuvU(VVuuUN(var1));
         return C00OOC00oO(var3, var1, var4, var5);
      } else {
         return false;
      }
   }

   private static boolean UuUVuuUu(String var0, class_1799 var1) {
      vNnnVNUVU.nvUnvV var2 = uUnuvNvvNU(var0);
      return var2 != null && UuUVuuUu(var2, var1, uNNnnnuuuN(var1), nuUnNvnuUu(var1));
   }

   public static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3) {
      return UuUVuuUu(var0, var1, var2, var3, true, true, true, true);
   }

   public static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if (var0 != null && var1 != null && !var1.method_7960() && var1.method_31574(var0.item())) {
         String var8 = var2 == null ? "" : var2;
         if (var8.isEmpty()) {
            var8 = nUUVuvU(var1.method_7964().getString());
         }

         String var9 = var3 == null ? "" : var3;
         if (var9.isEmpty()) {
            var9 = var8;
         }

         return C00OOC00oO(var0, var1, var8, var9, var4, var5, var6, var7);
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3, Set<String> var4) {
      if (var0 != null && var1 != null && !var1.method_7960() && var1.method_31574(var0.item())) {
         String var5 = var2 == null ? "" : var2;
         if (var5.isEmpty()) {
            var5 = nUUVuvU(var1.method_7964().getString());
         }

         String var6 = var3 == null ? "" : var3;
         if (var6.isEmpty()) {
            var6 = var5;
         }

         return C00OOC00oO(var0, var1, var5, var6, var4);
      } else {
         return false;
      }
   }

   public static String uNNnnnuuuN(class_1799 var0) {
      if (var0 != null && !var0.method_7960()) {
         StringBuilder var1 = new StringBuilder();
         var1.append(var0.method_7964().getString()).append(' ');
         class_9290 var2 = (class_9290)var0.method_58694(class_9334.field_49632);
         if (var2 != null) {
            for (class_2561 var4 : var2.comp_2400()) {
               var1.append(var4.getString()).append(' ');
            }
         }

         return nUUVuvU(var1.toString());
      } else {
         return "";
      }
   }

   public static String nuUnNvnuUu(class_1799 var0) {
      return var0 != null && !var0.method_7960() ? nUUVuvU(VVuuUN(var0)) : "";
   }

   public static String VVuuUN(String var0) {
      return var0 == null ? "" : vNVuvnUUnuUn(UnUNVVVNuv(var0)).trim();
   }

   private static boolean C00OOC00oO(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3) {
      if (UuUVuuUu(var0, var2)) {
         return false;
      } else {
         if (var3.isEmpty()) {
            var3 = var2;
         }

         boolean var4 = UuUVuuUu(var2, var0.aliases());
         if (!var4) {
            return false;
         } else {
            return !var0.hasRequirements() ? true : C00OOC00oO(var0, var1, var2, var3, true, true, true, true);
         }
      }
   }

   private static boolean C00OOC00oO(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if (UuUVuuUu(var0, var2)) {
         return false;
      } else {
         if (var3.isEmpty()) {
            var3 = var2;
         }

         boolean var8 = UuUVuuUu(var2, var0.aliases());
         if (!var8) {
            return false;
         } else {
            return !var0.hasRequirements()
               ? true
               : (!var4 || C00OOC00oO(var0, var3))
                  && (!var5 || UuUVuuUu(var0, var1, var3))
                  && (!var6 || C00OOC00oO(var0, var1, var3))
                  && (!var7 || uUnuvNvvNU(var0, var1, var3));
         }
      }
   }

   private static boolean C00OOC00oO(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, String var3, Set<String> var4) {
      if (UuUVuuUu(var0, var2)) {
         return false;
      } else {
         if (var3.isEmpty()) {
            var3 = var2;
         }

         boolean var5 = UuUVuuUu(var2, var0.aliases());
         if (!var5) {
            return false;
         } else {
            return !var0.hasRequirements()
               ? true
               : C00OOC00oO(var0, var3) && UuUVuuUu(var0, var1, var3) && UuUVuuUu(var0, var1, var3, var4) && uUnuvNvvNU(var0, var1, var3);
         }
      }
   }

   private static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, String var1) {
      String var2 = nUUVuvU(var0.label());
      return var2.equals("элитры") && var1.contains("броневаяэлитра")
         || var2.equals("динамитb") && var1.contains("динамитb2")
         || var2.equals("зельечерепашьеймощи")
            && (var1.contains("зельечерепашьеймощиii") || var1.contains("черепашьямощьii") || var1.contains("черепашьямощь2"));
   }

   private static boolean C00OOC00oO(vNnnVNUVU.nvUnvV var0, String var1) {
      for (String var3 : var0.lore()) {
         String var4 = nUUVuvU(var3);
         if (!var4.isEmpty() && !var1.contains(var4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2) {
      for (vNnnVNUVU.NVnVnNnN var4 : var0.attributes()) {
         if (!UuUVuuUu(var1, var4) && !UuUVuuUu(var4, var2)) {
            return false;
         }
      }

      return true;
   }

   private static boolean C00OOC00oO(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2) {
      for (String var4 : var0.enchantments()) {
         vNnnVNUVU.uunvUUVnuNn var5 = vuuuNvNuv(var4);
         if (var5 != null) {
            if (vNUvnnVnUvu(var5.id())) {
               if (!UuUVuuUu(var1, var5.id(), var5.level()) && !UuUVuuUu(var2, var5.raw())) {
                  return false;
               }
            } else {
               boolean var6 = UuUVuuUu(var2, var5.raw()) || UuUVuuUu(var2, var5);
               if (var0.strictCheck() && !var6) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private static boolean UuUVuuUu(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2, Set<String> var3) {
      for (String var5 : var0.enchantments()) {
         if (var3 == null || var3.contains(uNNnnnuuuN(var5))) {
            vNnnVNUVU.uunvUUVnuNn var6 = vuuuNvNuv(var5);
            if (var6 != null) {
               if (vNUvnnVnUvu(var6.id())) {
                  if (!UuUVuuUu(var1, var6.id(), var6.level()) && !UuUVuuUu(var2, var6.raw())) {
                     return false;
                  }
               } else {
                  boolean var7 = UuUVuuUu(var2, var6.raw()) || UuUVuuUu(var2, var6);
                  if (var0.strictCheck() && !var7) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }

   private static boolean uUnuvNvvNU(vNnnVNUVU.nvUnvV var0, class_1799 var1, String var2) {
      if (var0.effects().isEmpty()) {
         return true;
      } else {
         boolean var3 = var2.contains("hms")
            || var1.method_58694(class_9334.field_49636) != null
            || UuUVuuUu(var2, List.of("урон", "брон", "скор", "здоров", "damage", "armor", "speed", "health"));
         if (!var3) {
            return true;
         } else {
            for (String var5 : var0.effects()) {
               if (!C00OOC00oO(var5, var1, var2)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private static boolean C00OOC00oO(String var0, class_1799 var1, String var2) {
      String var3 = nUUVuvU(var0);
      if (!var3.isEmpty() && var2.contains(var3)) {
         return true;
      } else {
         vNnnVNUVU.VvunVVUvUNnv var4 = nvUVNnuu(var0);
         if (var4 == null) {
            return true;
         } else {
            String var6 = var4.type();

            class_6880 var5 = switch (var6) {
               case "damage" -> class_5134.field_23721;
               case "armor" -> class_5134.field_23724;
               case "speed" -> class_5134.field_23719;
               case "health" -> class_5134.field_23716;
               default -> null;
            };
            return var5 != null && UuUVuuUu(var1, var5, var4.level()) ? true : UuUVuuUu(var2, var4.type(), var4.level());
         }
      }
   }

   private static boolean UuUVuuUu(String var0, String var1, double var2) {
      String var4 = UuUVuuUu(var2);
      String var5 = UuUVuuUu((int)var2);

      for (String var10 : switch (var1) {
         case "damage" -> List.of("урон", "damage");
         case "armor" -> List.of("брон", "armor");
         case "speed" -> List.of("скор", "speed");
         case "health" -> List.of("здоров", "health");
         default -> List.of(var1);
      }) {
         String var9 = nUUVuvU(var10);
         if (var0.contains(var9 + var4) || var0.contains(var4 + var9) || !var5.isEmpty() && (var0.contains(var9 + var5) || var0.contains(var5 + var9))) {
            return true;
         }
      }

      return false;
   }

   private static boolean UuUVuuUu(String var0, vNnnVNUVU.uunvUUVnuNn var1) {
      List var2 = vVvUvVVuuNvV.getOrDefault(var1.id(), List.of());
      if (var2.isEmpty()) {
         return false;
      } else {
         String var3 = UuUVuuUu((double)var1.level());
         String var4 = UuUVuuUu(var1.level());

         for (String var6 : var2) {
            String var7 = nUUVuvU(var6);
            if (!var7.isEmpty()) {
               if (!var0.contains(var7 + var3) && !var0.contains(var3 + var7)) {
                  if (var4.isEmpty() || !var0.contains(var7 + var4) && !var0.contains(var4 + var7)) {
                     if (var1.level() <= 1 && var0.contains(var7)) {
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

   private static boolean UuUVuuUu(String var0, String var1) {
      String var2 = nUUVuvU(var1);
      return !var2.isEmpty() && var0.contains(var2);
   }

   private static boolean UuUVuuUu(vNnnVNUVU.NVnVnNnN var0, String var1) {
      String var2 = C00OOC00oO(var0.value());
      String var3 = UuUVuuUu(var0);
      if (!var3.isEmpty()) {
         if (var1.contains(var3 + var2)) {
            return true;
         }

         if (var1.contains(var2 + var3)) {
            return true;
         }
      }

      return false;
   }

   private static boolean UuUVuuUu(class_1799 var0, vNnnVNUVU.NVnVnNnN var1) {
      class_9285 var2 = (class_9285)var0.method_58694(class_9334.field_49636);
      if (var2 == null) {
         return false;
      } else {
         for (class_9287 var4 : var2.comp_2393()) {
            class_1322 var5 = var4.comp_2396();
            if (UuUVuuUu(var1, var4.comp_2395()) && Math.abs(var5.comp_2449() - var1.value()) <= 1.0E-4) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean UuUVuuUu(class_1799 var0, class_6880<class_1320> var1, double var2) {
      class_9285 var4 = (class_9285)var0.method_58694(class_9334.field_49636);
      if (var4 == null) {
         return false;
      } else {
         for (class_9287 var6 : var4.comp_2393()) {
            class_1322 var7 = var6.comp_2396();
            if (var6.comp_2395().equals(var1) && Math.abs(var7.comp_2449() - var2) <= 1.0E-4) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean UuUVuuUu(vNnnVNUVU.NVnVnNnN var0, class_6880<class_1320> var1) {
      if (var0.attribute() != null && var0.attribute().equals(var1)) {
         return true;
      } else {
         String var2 = UvnvNVnnnnNU(var0.id());
         String var3 = UvnvNVnnnnNU(C00OOC00oO(var1));
         return !var2.isEmpty() && var2.equals(var3);
      }
   }

   private static boolean UuUVuuUu(class_1799 var0, String var1, int var2) {
      class_9304 var3 = (class_9304)var0.method_58694(class_9334.field_49633);
      if (var3 != null && !var3.method_57543()) {
         String var4 = uVUuuVnNVU(var1);

         for (Entry var6 : var3.method_57539()) {
            String var7 = UuUVuuUu((class_6880<class_1887>)var6.getKey());
            if (var4.equals(uVUuuVnNVU(var7)) && var6.getIntValue() >= var2) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String UuUVuuUu(class_6880<class_1887> var0) {
      Optional var1 = var0.method_40230().map(var0x -> var0x.method_29177());
      return var1.<String>map(class_2960::toString).orElse("");
   }

   private static boolean vNUvnnVnUvu(String var0) {
      String var1 = uVUuuVnNVU(var0);

      return switch (var1) {
         case "aqua_affinity", "blast_protection", "depth_strider", "efficiency", "feather_falling", "fire_aspect", "fire_protection", "fortune", "luck_of_the_sea", "looting", "mending", "projectile_protection", "protection", "respiration", "sharpness", "smite", "soul_speed", "sweeping_edge", "thorns", "unbreaking", "bane_of_arthropods" -> true;
         default -> false;
      };
   }

   private static String uVUuuVnNVU(String var0) {
      String var1 = var0 == null ? "" : var0.toLowerCase(Locale.ROOT).trim();
      int var2 = var1.indexOf(58);
      if (var2 >= 0 && var1.substring(0, var2).indexOf(45) < 0) {
         var1 = var1.substring(var2 + 1);
      }

      return uUnuvNvvNU.getOrDefault(var1, var1);
   }

   private static vNnnVNUVU.uunvUUVnuNn vuuuNvNuv(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim();
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

         return new vNnnVNUVU.uunvUUVnuNn(var0, var3, Math.max(1, var4));
      } else {
         return null;
      }
   }

   private static vNnnVNUVU.VvunVVUvUNnv nvUVNnuu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String[] var1 = var0.split(":", 2);
         if (var1.length != 2) {
            return null;
         } else {
            String var2 = var1[0].toLowerCase(Locale.ROOT).replace("hms-", "").trim();

            try {
               return new vNnnVNUVU.VvunVVUvUNnv(var2, Double.parseDouble(var1[1].replace(',', '.')));
            } catch (NumberFormatException var4) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static Map<String, vNnnVNUVU.nvUnvV> C00OOC00oO() {
      HashMap var0 = new HashMap();

      for (vNnnVNUVU.nvUnvV var2 : nuUnNvnuUu) {
         var0.put(var2.key(), var2);
         var0.put(nUUVuvU(var2.label()), var2);

         for (String var4 : var2.aliases()) {
            if (!var4.isEmpty()) {
               var0.putIfAbsent(var4, var2);
            }
         }
      }

      return Map.copyOf(var0);
   }

   private static vNnnVNUVU.nvUnvV UuUVuuUu(String var0, class_1792 var1, String... var2) {
      return C00OOC00oO(var0, var1, var2).C00OOC00oO();
   }

   private static vNnnVNUVU.nvnNNunvv C00OOC00oO(String var0, class_1792 var1, String... var2) {
      return new vNnnVNUVU.nvnNNunvv(var0, var1, var2);
   }

   private static vNnnVNUVU.NVnVnNnN UuUVuuUu(class_6880<class_1320> var0, double var1) {
      return new vNnnVNUVU.NVnVnNnN(var0, C00OOC00oO(var0), var1);
   }

   private static vNnnVNUVU.NVnVnNnN UuUVuuUu(String var0, double var1) {
      return new vNnnVNUVU.NVnVnNnN(null, var0, var1);
   }

   private static class_1799 C00OOC00oO(String var0, String var1) {
      class_1799 var2 = new class_1799(class_1802.field_8575);
      UUID var3 = UUID.nameUUIDFromBytes(("holyworld:" + var1 + var0).getBytes(StandardCharsets.UTF_8));
      GameProfile var4 = new GameProfile(var3, "");
      var4.getProperties().put("textures", new Property("textures", var0));
      var2.method_57379(class_9334.field_49617, new class_9296(var4));
      return var2;
   }

   private static String UuuNnUvUuv(String var0) {
      return UuUVuuUu(var0) ? var0.substring("holyworld:".length()) : var0;
   }

   static String nUUVuvU(String var0) {
      return var0 == null ? "" : vNVuvnUUnuUn(UnUNVVVNuv(var0).replaceAll("(?i)§[0-9A-FK-OR]", "").toLowerCase(Locale.ROOT)).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private static String UnUNVVVNuv(String var0) {
      return var0.replace("ᴀ", "a")
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

   private static String vNVuvnUUnuUn(String var0) {
      return var0.replace("инфинити", "infinity").replace("этернити", "eternity").replace("етернити", "eternity").replace("стингер", "stinger");
   }

   private static boolean UuUVuuUu(String var0, List<String> var1) {
      if (var0 != null && !var0.isEmpty()) {
         for (String var3 : var1) {
            if (var3 != null && !var3.isEmpty() && var0.contains(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String VVuuUN(class_1799 var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append(var0.method_7964().getString()).append(' ');
      class_9290 var2 = (class_9290)var0.method_58694(class_9334.field_49632);
      if (var2 != null) {
         for (class_2561 var4 : var2.comp_2400()) {
            var1.append(var4.getString()).append(' ');
         }
      }

      var1.append(var0.method_57353());
      return var1.toString();
   }

   private static String UuUVuuUu(vNnnVNUVU.NVnVnNnN var0) {
      String var1 = UvnvNVnnnnNU(var0.id());
      if (!var1.isEmpty()) {
         return nUUVuvU(var1);
      } else {
         class_6880 var2 = var0.attribute();
         if (var2 == null) {
            return "";
         } else if (var2.equals(class_5134.field_23721)) {
            return "attackdamage";
         } else if (var2.equals(class_5134.field_23724)) {
            return "armor";
         } else if (var2.equals(class_5134.field_23719)) {
            return "movementspeed";
         } else {
            return var2.equals(class_5134.field_23716) ? "maxhealth" : "";
         }
      }
   }

   private static String C00OOC00oO(class_6880<class_1320> var0) {
      return var0 == null ? "" : var0.method_40230().map(var0x -> var0x.method_29177().toString()).orElse("");
   }

   private static String UvnvNVnnnnNU(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.toLowerCase(Locale.ROOT).trim();
         if (var1.startsWith("minecraft:")) {
            var1 = var1.substring("minecraft:".length());
         }

         if (var1.startsWith("generic.")) {
            var1 = var1.substring("generic.".length());
         }

         return var1.replace('.', '_');
      }
   }

   private static String UuUVuuUu(double var0) {
      return var0 == Math.rint(var0) ? String.valueOf((int)var0) : C00OOC00oO(var0);
   }

   private static String C00OOC00oO(double var0) {
      return var0 == Math.rint(var0) ? String.valueOf((int)var0) : String.valueOf(var0).replace(".", "");
   }

   private static String UuUVuuUu(int var0) {
      return switch (var0) {
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

   public record NVnVnNnN(class_6880<class_1320> attribute, String id, double value) {
   }

   record VvunVVUvUNnv(String type, double level) {
   }

   public record nvUnvV(
      String key,
      String label,
      class_1792 item,
      List<String> aliases,
      List<String> lore,
      List<String> enchantments,
      List<String> effects,
      List<vNnnVNUVU.NVnVnNnN> attributes,
      String texture,
      boolean strictCheck
   ) {
      boolean hasRequirements() {
         return !this.lore.isEmpty() || !this.enchantments.isEmpty() || !this.effects.isEmpty() || !this.attributes.isEmpty();
      }
   }

   static final class nvnNNunvv {
      private final String UuUVuuUu;
      private final class_1792 C00OOC00oO;
      private final List<String> uUnuvNvvNU = new ArrayList<>();
      private final List<String> vVvUvVVuuNvV = new ArrayList<>();
      private final List<String> uNNnnnuuuN = new ArrayList<>();
      private final List<String> nuUnNvnuUu = new ArrayList<>();
      private final List<vNnnVNUVU.NVnVnNnN> VVuuUN = new ArrayList<>();
      private String vNUvnnVnUvu;
      private boolean uVUuuVnNVU;

      nvnNNunvv(String var1, class_1792 var2, String... var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU.add(vNnnVNUVU.nUUVuvU(var1));

         for (String var7 : var3) {
            this.uUnuvNvvNU.add(vNnnVNUVU.nUUVuvU(var7));
         }
      }

      vNnnVNUVU.nvnNNunvv UuUVuuUu(String... var1) {
         this.vVvUvVVuuNvV.addAll(List.of(var1));
         return this;
      }

      vNnnVNUVU.nvnNNunvv C00OOC00oO(String... var1) {
         this.uNNnnnuuuN.addAll(List.of(var1));
         return this;
      }

      private vNnnVNUVU.nvnNNunvv uUnuvNvvNU(String... var1) {
         this.nuUnNvnuUu.addAll(List.of(var1));
         return this;
      }

      vNnnVNUVU.nvnNNunvv UuUVuuUu(vNnnVNUVU.NVnVnNnN... var1) {
         this.VVuuUN.addAll(List.of(var1));
         return this;
      }

      vNnnVNUVU.nvnNNunvv UuUVuuUu(String var1) {
         this.vNUvnnVnUvu = var1;
         return this;
      }

      private vNnnVNUVU.nvnNNunvv UuUVuuUu() {
         this.uVUuuVnNVU = true;
         return this;
      }

      vNnnVNUVU.nvUnvV C00OOC00oO() {
         String var1 = "holyworld:" + vNnnVNUVU.nUUVuvU(this.UuUVuuUu);
         int var2 = vNnnVNUVU.uNNnnnuuuN.merge(var1, 1, Integer::sum);
         return new vNnnVNUVU.nvUnvV(
            var2 == 1 ? var1 : var1 + ":" + var2,
            this.UuUVuuUu,
            this.C00OOC00oO,
            List.copyOf(this.uUnuvNvvNU),
            List.copyOf(this.vVvUvVVuuNvV),
            List.copyOf(this.uNNnnnuuuN),
            List.copyOf(this.nuUnNvnuUu),
            List.copyOf(this.VVuuUN),
            this.vNUvnnVnUvu,
            this.uVUuuVnNVU
         );
      }
   }

   record uunvUUVnuNn(String raw, String id, int level) {
   }
}
