package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Irc extends Helper214 {
   private static String selectedPrefix = null;

   protected Irc() {
      super("irc");
   }

   public static String method3081() {
      return selectedPrefix;
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      IrcClient var3 = Releon.method71()
         .method17()
         .method2314()
         .stream()
         .filter(var0 -> var0 instanceof IrcClient)
         .map(var0 -> (IrcClient)var0)
         .findFirst()
         .orElse(null);
      if (var3 == null) {
         Helper238.method2192("Модуль IrcClient не найден");
      } else if (!var2.method1690()) {
         this.method3084();
      } else {
         String var4 = var2.method1723().toLowerCase();
         switch (var4) {
            case "prefix":
               if (var2.method1690()) {
                  String var8 = var2.method1723().toLowerCase();
                  if (var8.equals("list")) {
                     this.method3083();
                  } else {
                     this.method3082(var8);
                  }
               } else {
                  Helper238.method2192("Укажите номер префикса: .irc prefix <1-10> или .irc prefix list");
               }
               break;
            case "clear":
               selectedPrefix = null;
               this.method3086("");
               Helper238.method2190("Префикс сброшен");
               break;
            default:
               if (!var3.isState()) {
                  Helper238.method2192("Модуль IrcClient отключен");
                  return;
               }

               if (MinecraftClient.getInstance().player == null) {
                  Helper238.method2192("Игрок не инициализирован");
                  return;
               }

               String var7 = var4 + (var2.method1690() ? " " + var2.method1737() : "");
               var3.method3697(var7);
         }
      }
   }

   @Override
   public String method268() {
      return "Команда для управления IrcClient-чатом: отправка сообщений.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Эта команда позволяет управлять IrcClient-чатом, включая отправку сообщений, включение/выключение модуля и выбор префиксов для сообщений.",
         "",
         "Использование:",
         "> irc <сообщение> - Отправляет сообщение в IrcClient-чат (например: .irc Привет, мир!).",
         "> irc prefix <1-10> - Выбирает префикс для сообщений (например: .irc prefix 1).",
         "> irc prefix list - Отображает список доступных префиксов.",
         "> irc clear - Сбрасывает выбранный префикс."
      );
   }

   private void method3082(String var1) {
      String[] var2 = new String[]{"pikmi", "labuba", "zapen", "boost", "rich", "panda", "smiley", "bibi", "benena", "blyabuba"};
      String[] var3 = new String[]{"Пикми", "Лабуба", "Запен", "Буст", "Рич", "Панда", "(●'◡'●)", "Биби...!", "Бэнена", "Блябуба"};

      try {
         int var4 = Integer.parseInt(var1) - 1;
         if (var4 >= 0 && var4 < var2.length) {
            selectedPrefix = var2[var4];
            if (MinecraftClient.getInstance().player != null) {
               Text var5 = Helper37.method513("[IrcClient] ", "black_light_purple", true);
               MutableText var6 = Text.literal("Успешно установлен префикс ").setStyle(Style.EMPTY.withColor(Formatting.WHITE));
               Text var7 = this.method3085(var3[var4], "");
               MutableText var8 = var5.copy().append(var6).append(var7);
               MinecraftClient.getInstance().player.sendMessage(var8, false);
            }

            this.method3086(selectedPrefix);
         } else {
            Helper238.method2192("Неверный номер префикса. Используйте .irc prefix list (1-10)");
         }
      } catch (NumberFormatException var9) {
         Helper238.method2192("Неверный ввод. Используйте число от 1 до 10");
      }
   }

   private void method3083() {
      Helper238.method2190("Список префиксов:");
      if (MinecraftClient.getInstance().player != null) {
         MinecraftClient.getInstance().player.sendMessage(Text.literal("3. ").append(Helper238.method2195("")), false);
         MinecraftClient.getInstance().player.sendMessage(Text.literal("4. ").append(Helper238.method2196("")), false);
         MinecraftClient.getInstance().player.sendMessage(Text.literal("6. ").append(Helper238.method2198("")), false);
         MinecraftClient.getInstance().player.sendMessage(Text.literal("6. ").append(Helper238.method2197("")), false);
         MinecraftClient.getInstance().player.sendMessage(Text.literal("6. ").append(Helper238.method2193("")), false);
      }
   }

   public void method3084() {
      Helper238.method2188("Пример использования команды .irc:");
      Helper238.method2186(".irc <сообщение> - Отправить сообщение в IrcClient-чат (например: .irc Привет, мир!)");
      Helper238.method2186(".irc prefix <1-10> - Выбрать префикс для сообщений (например: .irc prefix 1)");
      Helper238.method2186(".irc prefix list - Показать список доступных префиксов");
      Helper238.method2186(".irc clear - Сбросить выбранный префикс");
   }

   private Text method3085(String var1, String var2) {
      switch (var1) {
         case "ТикТок":
            return Helper238.method2197(var2);
         case "Админ":
            return Helper238.method2193(var2);
         case "Пропен":
            return Helper238.method2195(var2);
         case "Буст":
            return Helper238.method2196(var2);
         case "Кролик":
            return Helper238.method2198(var2);
         default:
            return Text.literal(var2);
      }
   }

   private void method3086(String var1) {
      if (Releon.method71().method36().method949() != null && Releon.method71().method36().method949().isOpen()) {
         Releon.method71().method36().method949().method1444(var1);
      }
   }

   public static void method3087(String var0) {
      selectedPrefix = var0;
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         return new Helper120().method999().method994("prefix", "clear").method1003();
      } else if (var2.method1690() && var2.method1694()) {
         String var5 = var2.method1723().toLowerCase();
         return new Helper120().method999().method994("prefix", "clear").method1000(var5).method1003();
      } else {
         if (var2.method1690()) {
            String var3 = var2.method1723().toLowerCase();
            if (var3.equals("prefix")) {
               if (var2.method1690()) {
                  String var4 = var2.method1723().toLowerCase();
                  return new Helper120().method999().method994("list", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10").method1000(var4).method1003();
               }

               return new Helper120().method999().method994("list", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10").method1003();
            }
         }

         return Stream.empty();
      }
   }
}
