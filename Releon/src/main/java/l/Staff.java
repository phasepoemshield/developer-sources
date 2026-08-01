package l;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Staff extends Helper214 {
   public Staff() {
      super("staff");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      switch (var3) {
         case "add":
            var2.method1738(1);
            String var7 = var2.method1723();
            if (!Helper19.method382((String)var7)) {
               Helper19.method380((String)var7);
               this.method3042();
               this.method906("Вы успешно добавили " + Formatting.GREEN + var7 + Formatting.GRAY + " в список персонала!");
            } else {
               this.method905(Formatting.RED + var7 + " уже есть в списке персонала!", Formatting.RED);
            }
            break;
         case "remove":
            var2.method1738(1);
            String var6 = var2.method1723();
            if (Helper19.method382((String)var6)) {
               Helper19.method381((String)var6);
               this.method3042();
               this.method906("Вы успешно удалили " + Formatting.RED + var6 + Formatting.GRAY + " из списка персонала!");
            } else {
               this.method905(Formatting.RED + var6 + " не найден в списке персонала", Formatting.RED);
            }
            break;
         case "list":
            var2.method1739(1);
            Helper77.method806(var2, new Helper77<>(Helper19.method384()), () -> this.method906("Список персонала:"), var0 -> {
               MutableText var1x = Text.literal(var0.getName());
               var1x.setStyle(var1x.getStyle().withColor(Formatting.WHITE));
               return var1x;
            }, Helper215.FORCE_COMMAND_PREFIX + var1);
            break;
         case "clear":
            var2.method1739(0);
            Helper19.method383();
            this.method3042();
            this.method906("Список персонала очищен.");
            break;
         default:
            this.method906("Неизвестная подкоманда. Используйте: add, remove, list, clear");
      }
   }

   private void method3042() {
      try {
         Method var1 = Helper19.class.getDeclaredMethod("雲");
         var1.setAccessible(true);
         var1.invoke(null);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException("Ошибка при сохранении списка персонала через рефлексию", var2);
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1694()) {
         return new Helper120().method999().method994("add", "remove", "list", "clear").method1000(var2.method1723()).method1003();
      } else {
         if (var2.method1691(2)) {
            String var3 = var2.method1699(0).toLowerCase(Locale.US);
            if (var3.equals("add")) {
               return var2.method1736(Helper271.INSTANCE);
            }

            if (var3.equals("remove")) {
               return var2.method1736(Helper273.INSTANCE);
            }
         }

         return Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Управление списком персонала.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Эта команда позволяет управлять списком персонала.",
         "",
         "Использование:",
         "> staff add <ник> - Добавляет игрока в список персонала.",
         "> staff remove <ник> - Удаляет игрока из списка персонала.",
         "> staff list - Показывает список персонала.",
         "> staff clear - Очищает список персонала."
      );
   }
}
