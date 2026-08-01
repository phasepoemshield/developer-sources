package l;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Friend extends Helper214 {
   protected Friend() {
      super("friend");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      var2.method1739(1);
      if (var3.contains("add")) {
         String var4 = var2.method1723();
         if (!Helper309.method3076(var4)) {
            Helper309.method3072(var4);
            this.method906("Вы успешно добавили " + var4 + " в список друзей!");
         } else {
            this.method905(var4 + " уже есть в списке друзей!", Formatting.RED);
         }
      }

      if (var3.contains("remove")) {
         String var5 = var2.method1723();
         if (Helper309.method3076(var5)) {
            Helper309.method3074(var5);
            this.method906("Вы успешно удалили " + var5 + " из списка друзей!");
            return;
         }

         this.method905(var5 + " не найден в списке друзей", Formatting.RED);
      }

      if (var3.contains("list")) {
         Helper77.method806(var2, new Helper77<>(Helper309.method3078()), () -> this.method906("Список друзей:"), var0 -> {
            String var1x = var0.getName();
            MutableText var2x = Text.literal(var1x);
            var2x.setStyle(var2x.getStyle().withColor(Formatting.WHITE));
            return var2x;
         }, Helper215.FORCE_COMMAND_PREFIX + var1);
      }

      if (var3.contains("clear")) {
         Helper309.method3077();
         this.method906("Список друзей очищен.");
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1690()) {
         String var3 = var2.method1723();
         if (!var2.method1694()) {
            return new Helper120().method999().method994("add", "remove", "list", "clear").method1000(var3).method1003();
         }

         if (var3.equalsIgnoreCase("add")) {
            return var2.method1736(Helper271.INSTANCE);
         }

         if (var3.equalsIgnoreCase("remove")) {
            return var2.method1736(Helper279.INSTANCE);
         }
      }

      return Stream.empty();
   }

   @Override
   public String method268() {
      return "Позволяет управлять списком друзей";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "С помощью этой команды можно добавлять/удалять друзей в чите",
         "",
         "Использование:",
         "> friend add <name> - Добавляет имя в список друзей.",
         "> friend remove <name> - Удаляет имя из списка друзей.",
         "> friend list - Возвращает список друзей",
         "> friend clear - Очищает список друзей."
      );
   }
}
