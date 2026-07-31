package l;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.util.Formatting;

public class Prefix2 extends Helper214 implements Helper160 {
   protected Prefix2() {
      super("prefix");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      if (var3.equals("set")) {
         var2.method1738(1);
         this.method905("Установлен префикс '" + Formatting.RED + (Helper363.prefix = var2.method1723()) + Formatting.GRAY + "'", Formatting.GRAY);
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1690()) {
         String var3 = var2.method1723();
         return var3.equalsIgnoreCase("set")
            ? new Helper120().method999().method994("name").method1003()
            : new Helper120().method999().method994("set").method1000(var3).method1003();
      } else {
         return Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Позволяет менять префикс команд в моде";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "С помощью этой команды можно изменить префикс команд в моде", "", "Использование:", "> prefix set <name> - устанавливает префикс команд"
      );
   }
}
