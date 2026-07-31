package l;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Target extends Helper214 implements Helper160 {
   private final Helper11 repository = Helper11.method355();

   public Target() {
      super("target");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         this.method266(var1, var2);
      } else {
         String var3 = var2.method1700().toLowerCase(Locale.US);
         switch (var3) {
            case "add":
               var2.method1722();
               this.method263(var2);
               break;
            case "remove":
               var2.method1722();
               this.method264(var2);
               break;
            case "clear":
               var2.method1722();
               this.method265(var2);
               break;
            case "list":
               var2.method1722();
               this.method266(var1, var2);
               break;
            default:
               this.method263(var2);
         }
      }
   }

   private void method263(Helper219 var1) {
      var1.method1738(1);
      String var2 = var1.method1723();
      if (!this.repository.method360(var2)) {
         this.repository.method356(var2);
         this.method905("Игрок " + Formatting.GREEN + var2 + Formatting.GRAY + " добавлен в приоритетный список.", Formatting.GRAY);
      } else {
         this.method905("Игрок " + Formatting.RED + var2 + Formatting.GRAY + " уже в приоритетном списке.", Formatting.RED);
      }
   }

   private void method264(Helper219 var1) {
      var1.method1738(1);
      String var2 = var1.method1723();
      if (this.repository.method360(var2)) {
         this.repository.method357(var2);
         this.method905("Игрок " + Formatting.RED + var2 + Formatting.GRAY + " удален из приоритетного списка.", Formatting.GRAY);
      } else {
         this.method905("Игрок " + Formatting.RED + var2 + Formatting.GRAY + " не найден в приоритетном списке.", Formatting.RED);
      }
   }

   private void method265(Helper219 var1) {
      var1.method1739(0);
      this.repository.method358();
      this.method905("Приоритетный список целей очищен.", Formatting.GREEN);
   }

   private void method266(String var1, Helper219 var2) {
      var2.method1739(1);
      Helper77.method806(
         var2,
         new Helper77<>(this.repository.method359()),
         () -> this.method906("Приоритетный список целей:"),
         var0 -> Text.literal(Formatting.GRAY + "- " + Formatting.WHITE + var0),
         Helper215.FORCE_COMMAND_PREFIX + var1 + " list"
      );
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1694()) {
         return new Helper120()
            .method994("add", "remove", "list", "clear")
            .method1000(var2.method1700())
            .method1004((Helper129)mc.getNetworkHandler().getCommandSource())
            .method1003();
      } else if (var2.method1691(2) && var2.method1699(0).equalsIgnoreCase("add")) {
         return var2.method1736(Helper271.INSTANCE);
      } else {
         return var2.method1691(2) && var2.method1699(0).equalsIgnoreCase("remove") ? var2.method1736(Helper270.INSTANCE) : Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Управляет приоритетными целями для Aura.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Добавляет игроков в приоритетный список для модуля Aura.",
         "",
         "Использование:",
         "> target <ник> - Добавить игрока в приоритет.",
         "> target add <ник> - Добавить игрока в приоритет.",
         "> target remove <ник> - Удалить игрока из приоритета.",
         "> target list - Показать список приоритетных игроков.",
         "> target clear - Очистить список."
      );
   }
}
