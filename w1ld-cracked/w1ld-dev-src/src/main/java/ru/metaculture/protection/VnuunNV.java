package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_332;
import net.minecraft.class_9296;
import net.minecraft.class_9334;

public class VnuunNV {
   private static final Map<String, class_1799> UuUVuuUu = new HashMap<>();

   public static void UuUVuuUu(class_332 var0, String var1, float var2, float var3) {
      class_1799 var4 = UuUVuuUu(var1);
      if (var4 != null && !var4.method_7960()) {
         var0.method_51427(var4, (int)var2, (int)var3);
      }
   }

   public static class_1799 UuUVuuUu(String var0) {
      if (UuUVuuUu.containsKey(var0)) {
         return UuUVuuUu.get(var0);
      } else if (vNnnVNUVU.C00OOC00oO(var0)) {
         class_1799 var4 = vNnnVNUVU.nuUnNvnuUu(var0);
         if (var4.method_7960()) {
            return var4;
         } else {
            UuUVuuUu.put(var0, var4);
            return var4;
         }
      } else {
         class_1799 var1 = switch (var0) {
            case "Сфера Хаоса" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODY0MTkwMCwKICAicHJvZmlsZUlkIiA6ICIxNzRjZmRiNGEzY2I0M2I1YmZjZGU0MjRjM2JiMmM2ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJhZWwxOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lN2E3YWU3Y2RjZjYxNmU4YjdhNDIyMWE2MjFiMjQzNTc1M2M2MGVkNmEyNThlYTA2MGRhZTMwMDJmZmU5ZTI4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
            );
            case "Сфера Титана" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM1NDQ1NTE5MiwKICAicHJvZmlsZUlkIiA6ICJkOTcwYzEzZTM4YWI0NzlhOTY1OGM1ZDQ1MjZkMTM0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmltcHlMYWNlODUxMjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFlOTY5ODQ1OGI3ODQxYzk2YWU0ZjI0ZWM4NGFlMDE3MjQxMDA2NDFjNTY0ZTJhN2IxODVmNDA2ZThlZDIzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
            );
            case "Сфера Ареса" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0Mzc3NDI1NSwKICAicHJvZmlsZUlkIiA6ICJhZWNkODIxZTQyYzE0ZDJlOThmNTA1OTg1MWI5OWMzNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJqdXNhbXUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzE2YWRjNmJhZmNiNTdmZDcwN2RlZTdkZDZhNzM2ZmUxMjY3MTFkNTNhMWZkNmNlNzg5ZGE0MWIzYmUxM2YyYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
            );
            case "Сфера Бестии" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0MzgzNDkzMCwKICAicHJvZmlsZUlkIiA6ICI1MzUzNWIxN2M0ZDY0NWQ0YWUwY2U2ZjM4Zjk0NTFjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJVYml2aXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQxMWFjMTczODFiOWZjZTliYWIzYzcyYWZkYjdmMTk4NTcwZGFmNDczMmJkODExZDMxYzIyN2Q4MGZhMzliMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
            );
            case "Сфера Гидры" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODUzMjE4MywKICAicHJvZmlsZUlkIiA6ICI1OGZmZWI5NTMxNGQ0ODcwYTQwYjVjYjQyZDRlYTU5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa2luREJuZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2UzYzExOGQ2OTZkOTEwZTU0ZGUwMmNhNGQ4MDc1NDNmOWIxOGMwMDhjOTgzOGQyZmY2OTM3NzYyMmZiMWQzMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
            );
            case "Сфера Икара" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODU4MjQ5MSwKICAicHJvZmlsZUlkIiA6ICJhZWNkODIxZTQyYzE0ZDJlOThmNTA1OTg1MWI5OWMzNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSb2RyaVgyMDc1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M2ODAzZTZkNTY2N2EyZDYxMDYyOGJjM2IzMmY4NjNjZGE0OTVjNDY1NjE2ZGU2NTVjYjMyOTkzM2I2MWFmNzciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
            );
            case "Сфера Эрида" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0Mzg2MTE4NywKICAicHJvZmlsZUlkIiA6ICJlZGUyYzdhMGFjNjM0MTNiYjA5ZDNmMGJlZTllYzhlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVEZXZKYWRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZlNGUyZjEwNDdmM2VjNmU5ZTQ1OTE4NDczOWUzM2I3YzFmYzYzYWQ4MjAyYmRhYjlmMDI0NTA4YWRkMjNlNWIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
            );
            case "Сфера Сатира" -> C00OOC00oO(
               "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODYwODUyOCwKICAicHJvZmlsZUlkIiA6ICJkMTQ4NjFiM2UwZmM0Njk5OTFlMTcyNTllMzdiZjZhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYXhpdG9jbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NzFhOWE0OThiNGZhNWVjNDkzNjJmOWJjODhlZGE0ZjUyYjA0ZGU0OWQ3NWFhM2NhMzMyYTFmZWExYWEwZTU3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
            );
            case "Талисман Демона", "Талисман Карателя", "Талисман Мрака", "Талисман Ярости", "Талисман Тирана", "Талисман Крушителя", "Талисман Раздора", "Талисман Инфинити", "Талисман Стингера", "Тотем Бессмертия", "Тотем бессмертия", "Тотем" -> new class_1799(
               class_1802.field_8288
            );
            case "Вещи Крушителя", "Набор Крушителя", "Меч Крушителя" -> new class_1799(class_1802.field_22022);
            case "Броня Крушителя", "Броня Крушителя с шипами", "Броня Крушителя шип", "Броня Крушителя без шипов", "Броня Крушителя без шип", "Нагрудник Крушителя" -> new class_1799(
               class_1802.field_22028
            );
            case "Шлем Крушителя" -> new class_1799(class_1802.field_22027);
            case "Поножи Крушителя" -> new class_1799(class_1802.field_22029);
            case "Ботинки Крушителя" -> new class_1799(class_1802.field_22030);
            case "Кирка Крушителя" -> new class_1799(class_1802.field_22024);
            case "Лук Крушителя" -> new class_1799(class_1802.field_8102);
            case "Арбалет Крушителя" -> new class_1799(class_1802.field_8399);
            case "Трезубец Крушителя" -> new class_1799(class_1802.field_8547);
            case "Булава Крушителя" -> new class_1799(class_1802.field_49814);
            case "Элитры Крушителя" -> new class_1799(class_1802.field_8833);
            case "Удочка Крушителя" -> new class_1799(class_1802.field_8378);
            case "Зелье Ассасина", "Зелье Гнева", "Хлопушка", "Святая Вода", "Зелье Палладина", "Зелье Радиации", "Снотворное" -> new class_1799(
               class_1802.field_8436
            );
            case "Явная Пыль" -> new class_1799(class_1802.field_8479);
            case "Дезориентация" -> new class_1799(class_1802.field_8449);
            case "Трапка" -> new class_1799(class_1802.field_22021);
            case "Отмычка к Сферам" -> new class_1799(class_1802.field_8366);
            case "Пласт" -> new class_1799(class_1802.field_8551);
            case "Опыт 15", "Опыт 30", "Опыт 45", "Опыт 50", "Пузырек опыта" -> new class_1799(class_1802.field_8287);
            case "Вайт", "Блек" -> new class_1799(class_1802.field_8626);
            case "Блок дамагер" -> new class_1799(class_1802.field_16538);
            case "Прогрузчик чанков" -> new class_1799(class_1802.field_8238);
            case "Маяк" -> new class_1799(class_1802.field_8668);
            case "Проклятая Душа" -> new class_1799(class_1802.field_22016);
            case "Драконий Скин" -> new class_1799(class_1802.field_8407);
            case "Огненный Смерч" -> new class_1799(class_1802.field_8814);
            case "Снежок Заморозка" -> new class_1799(class_1802.field_8543);
            case "Божья Аура" -> new class_1799(class_1802.field_8614);
            case "Серебро" -> new class_1799(class_1802.field_8675);
            case "Божье Касание", "Мощный Удар" -> new class_1799(class_1802.field_8335);
            case "Мега Бульдозер" -> new class_1799(class_1802.field_22024);
            case "Нерушимые Элитры" -> new class_1799(class_1802.field_8833);
            case "Зачарованное Золотое Яблоко", "Зачарованное яблоко" -> new class_1799(class_1802.field_8367);
            case "Золотое Яблоко", "Золотое яблоко", "Яблоко" -> new class_1799(class_1802.field_8463);
            case "Алмаз", "Алмазы" -> new class_1799(class_1802.field_8477);
            case "Эндер-жемчуг", "Эндер жемчуг", "Перл" -> new class_1799(class_1802.field_8634);
            case "Кристалл Энда", "Кристалл энда", "Кристалл" -> new class_1799(class_1802.field_8301);
            case "Обсидиан" -> new class_1799(class_1802.field_8281);
            case "Якорь Возрождения", "Якорь возрождения", "Якорь" -> new class_1799(class_1802.field_23141);
            case "Светящийся Камень", "Светящийся камень", "Глоустоун" -> new class_1799(class_1802.field_8801);
            case "Паутина" -> new class_1799(class_1802.field_8786);
            case "Стрела", "Стрелы" -> new class_1799(class_1802.field_8107);
            case "Спавнер" -> new class_1799(class_1802.field_8849);
            default -> new class_1799(class_1802.field_8077);
         };
         UuUVuuUu.put(var0, var1);
         return var1;
      }
   }

   private static class_1799 C00OOC00oO(String var0) {
      class_1799 var1 = new class_1799(class_1802.field_8575);
      GameProfile var2 = new GameProfile(UUID.randomUUID(), "CustomHead");
      var2.getProperties().put("textures", new Property("textures", var0));
      var1.method_57379(class_9334.field_49617, new class_9296(var2));
      return var1;
   }
}
