package l;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public class Helper300 implements Helper160 {
   private static final Map<Helper306, Map<String, String>> cache = new ConcurrentHashMap<>();
   private static final Map<String, String> SETTING_FALLBACK_RU = method2982();
   private static final Map<String, String> DESCRIPTION_FALLBACK_RU = method2983();

   public Helper300() {
   }

   public static String method2975(String var0) {
      if (var0 != null && !var0.isBlank()) {
         Helper306 var1 = method2979();
         if (var1 == Helper306.ENG) {
            return var0;
         } else {
            Map<String, String> var2 = cache.computeIfAbsent(var1, Helper300::method2978);
            return var2.getOrDefault(var0, var0);
         }
      } else {
         return var0 == null ? "" : var0;
      }
   }

   public static String method2976(String var0) {
      String var1 = method2975(var0);
      return method2979() == Helper306.RUS && var1.equals(var0) ? method2980(var0, SETTING_FALLBACK_RU) : var1;
   }

   public static String method2977(String var0) {
      String var1 = method2975(var0);
      if (method2979() == Helper306.RUS && var1.equals(var0)) {
         var1 = method2980(var0, SETTING_FALLBACK_RU);
         return method2980(var1, DESCRIPTION_FALLBACK_RU);
      } else {
         return var1;
      }
   }

   private static Map<String, String> method2978(Helper306 var0) {
      try {
         Identifier var1 = Identifier.of("minecraft", "translations/" + var0.method3039() + ".json");
         Optional var2 = mc.getResourceManager().getResource(var1);
         if (var2.isEmpty()) {
            return Map.of();
         } else {
            InputStream var3 = ((Resource)var2.get()).getInputStream();

            Map var6;
            try (BufferedReader var4 = new BufferedReader(new InputStreamReader(var3, StandardCharsets.UTF_8))) {
               Map var5 = (Map)gson.fromJson(var4, new Helper23().getType());
               var6 = var5 == null ? Map.of() : var5;
            }

            return var6;
         }
      } catch (Throwable var9) {
         throw new RuntimeException(var9);
      }
   }

   private static Helper306 method2979() {
      return mc != null && mc.options != null ? Helper306.method3038(mc.options.language) : Helper306.ENG;
   }

   private static String method2980(String var0, Map<String, String> var1) {
      String var2 = var0;

      for (Entry var4 : var1.entrySet()) {
         var2 = method2981(var2, (String)var4.getKey(), (String)var4.getValue());
      }

      return var2;
   }

   private static String method2981(String var0, String var1, String var2) {
      if (var0 != null && !var0.isBlank() && var1 != null && !var1.isBlank()) {
         String var3 = "(?<!\\p{L})" + Pattern.quote(var1) + "(?!\\p{L})";
         return var0.replaceAll(var3, var2);
      } else {
         return var0;
      }
   }

   private static Map<String, String> method2982() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put("Only Key Pressed", "Только при нажатой клавише");
      var0.put("In front of the target", "Перед целью");
      var0.put("Direction Mode", "Режим направления");
      var0.put("Auto Jump", "Авто прыжок");
      var0.put("Enter text...", "Введите текст...");
      var0.put("Click on me", "Нажми меня");
      var0.put("Settings", "Настройки");
      var0.put("setting", "настройка");
      var0.put("Setting", "Настройка");
      var0.put("Search", "Поиск");
      var0.put("Bind", "Бинд");
      var0.put("Mode", "Режим");
      var0.put("Range", "Дистанция");
      var0.put("Distance", "Дистанция");
      var0.put("Delay", "Задержка");
      var0.put("Color", "Цвет");
      var0.put("Only", "Только");
      var0.put("Key", "Клавиша");
      var0.put("Pressed", "Нажата");
      var0.put("Auto", "Авто");
      var0.put("Jump", "Прыжок");
      var0.put("Direction", "Направление");
      var0.put("Target", "Цель");
      var0.put("Player", "Игрок");
      var0.put("Players", "Игроки");
      var0.put("Friend", "Друг");
      var0.put("Friends", "Друзья");
      return var0;
   }

   private static Map<String, String> method2983() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put("Automatically", "Автоматически");
      var0.put("automatically", "автоматически");
      var0.put("Adds", "Добавляет");
      var0.put("Draws", "Рисует");
      var0.put("Draw", "Рисовать");
      var0.put("Shows", "Показывает");
      var0.put("Show", "Показывать");
      var0.put("Uses", "Использует");
      var0.put("Use", "Использовать");
      var0.put("Ignore", "Игнорировать");
      var0.put("Skip", "Пропускать");
      var0.put("Targets", "Цели");
      var0.put("targets", "цели");
      var0.put("Players", "Игроки");
      var0.put("players", "игроки");
      var0.put("Friends", "Друзья");
      var0.put("friends", "друзья");
      var0.put("Module", "Модуль");
      var0.put("module", "модуль");
      var0.put("Mode", "Режим");
      var0.put("mode", "режим");
      var0.put("Distance", "Дистанция");
      var0.put("distance", "дистанция");
      var0.put("Range", "Дальность");
      var0.put("range", "дальность");
      var0.put("Speed", "Скорость");
      var0.put("speed", "скорость");
      var0.put("Delay", "Задержка");
      var0.put("delay", "задержка");
      var0.put("Color", "Цвет");
      var0.put("color", "цвет");
      var0.put("Sound", "Звук");
      var0.put("sound", "звук");
      var0.put("Volume", "Громкость");
      var0.put("volume", "громкость");
      var0.put("Attack", "Атака");
      var0.put("attack", "атака");
      var0.put("Rotation", "Ротация");
      var0.put("rotation", "ротация");
      var0.put("Render", "Рендер");
      var0.put("render", "рендер");
      return var0;
   }
}
