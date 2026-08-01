package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Macro extends Helper214 {
   private final Helper7 macroRepository;

   public Macro(Releon var1) {
      super("macro", "macros");
      this.macroRepository = var1.method22();
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      switch (var3) {
         case "add":
            this.method3013(var2);
            break;
         case "remove":
            this.method3014(var2);
            break;
         case "list":
            this.method3015(var2, var1);
            break;
         case "clear":
            this.method3016(var2);
      }
   }

   private void method3013(Helper219 var1) {
      var1.method1738(3);
      int var2 = var1.<Entry<String, Integer>, Helper266>method1733(Helper266.INSTANCE).getValue();
      String var3 = var1.method1723();
      String var4 = var1.method1737();
      if (this.macroRepository.method333(var3)) {
         this.method905("Макрос с таким именем уже есть в списке!", Formatting.RED);
      } else {
         this.macroRepository.method332(var3, var4, var2);
         this.method906(
            Formatting.GREEN
               + "Добавлен макрос с названием "
               + Formatting.RED
               + var3
               + Formatting.GREEN
               + " с кнопкой "
               + Formatting.RED
               + Helper209.method1791(var2).toLowerCase()
               + Formatting.GREEN
               + " с командой "
               + Formatting.RED
               + var4
         );
      }
   }

   private void method3014(Helper219 var1) {
      var1.method1739(1);
      String var2 = var1.method1723();
      if (this.macroRepository.method333(var2)) {
         this.macroRepository.method334(var2);
         this.method906(Formatting.GREEN + "Макрос " + Formatting.RED + var2 + Formatting.GREEN + " был успешно удален!");
      } else {
         this.method905("Макрос с таким именем не найден!", Formatting.RED);
      }
   }

   private void method3015(Helper219 var1, String var2) {
      var1.method1739(1);
      Helper77.method806(
         var1,
         new Helper77<>(this.macroRepository.macroList),
         () -> this.method906("Список макросов:"),
         var0 -> {
            String var1x = var0.method345();
            String var2x = Helper209.method1791(var0.method347()).toLowerCase();
            String var3 = var0.method346();
            return Text.literal(Formatting.GRAY + "Название: " + Formatting.WHITE + var1x)
               .append(Text.literal(Formatting.GRAY + " Клавиша: " + Formatting.WHITE + var2x))
               .append(Text.literal(Formatting.GRAY + " Команда: " + Formatting.WHITE + var3));
         },
         Helper215.FORCE_COMMAND_PREFIX + var2
      );
   }

   private void method3016(Helper219 var1) {
      var1.method1739(1);
      this.macroRepository.method335();
      this.method905("Все макросы были удалены.", Formatting.GREEN);
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1690() && var2.method1694()) {
         return new Helper120().method999().method994("add", "remove", "list", "clear").method1000(var2.method1723()).method1003();
      } else {
         if (var2.method1690()) {
            String var3 = var2.method1723();
            if (var3.equalsIgnoreCase("add") && var2.method1694()) {
               return var2.method1736(Helper266.INSTANCE);
            }

            if (var3.equalsIgnoreCase("remove") && var2.method1694()) {
               return var2.method1736(Helper265.INSTANCE);
            }
         }

         return Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Позволяет управлять макросами";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Эта команда позволяет управлять макросами, которые автоматически вводят заданные команды в чат.",
         "",
         "Использование:",
         "> macro add <key> <name> <message> - Добавляет новый макрос, который будет активироваться при нажатии на указанную клавишу и вводить указанное сообщение.",
         "> macro remove <name> - Удаляет макрос с указанным именем.",
         "> macro list - Отображает список всех текущих макросов.",
         "> macro clear - Удаляет все макросы из списка."
      );
   }
}
