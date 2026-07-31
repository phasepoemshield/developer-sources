package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

public class Way2 extends Helper214 implements Helper160 {
   private final Helper466 wayRepository;

   protected Way2(Releon var1) {
      super("way");
      this.wayRepository = var1.method23();
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      switch (var3) {
         case "add":
            this.method272(var2);
            break;
         case "remove":
            this.method273(var2);
            break;
         case "clear":
            this.method275(var2);
            break;
         case "list":
            this.method274(var1, var2);
      }
   }

   private void method272(Helper219 var1) {
      var1.method1738(4);
      String var2 = var1.method1723();
      int var3 = var1.method1687().get(0).method396(Integer.class);
      int var4 = var1.method1687().get(1).method396(Integer.class);
      int var5 = var1.method1687().get(2).method396(Integer.class);
      if (this.wayRepository.method4987(var2)) {
         this.method905("Метка с таким именем уже есть в списке!", Formatting.RED);
      } else {
         String var6 = mc.getNetworkHandler() == null
            ? "vanilla"
            : (mc.getNetworkHandler().getServerInfo() == null ? "vanilla" : mc.getNetworkHandler().getServerInfo().address);
         this.method905("Добавлена метка " + var2 + ", Координаты: (" + var3 + ", " + var4 + ", " + var5 + "), Сервер: " + var6, Formatting.GRAY);
         this.wayRepository.method4986(var2, new BlockPos(var3, var4, var5), var6);
      }
   }

   private void method273(Helper219 var1) {
      var1.method1739(1);
      String var2 = var1.method1723();
      if (this.wayRepository.method4987(var2)) {
         this.wayRepository.method4988(var2);
         this.method906(Formatting.GREEN + "Метка " + Formatting.RED + var2 + Formatting.GREEN + " была успешна удалена!");
      } else {
         this.method906("Метка с названием '" + var2 + "' не найдена!");
      }
   }

   private void method274(String var1, Helper219 var2) {
      var2.method1739(1);
      Helper77.method806(
         var2,
         new Helper77<>(this.wayRepository.wayList),
         () -> this.method906("Список меток:"),
         var0 -> Text.literal(Formatting.GRAY + "Название: " + Formatting.RED + var0.method2934())
            .append(
               Text.literal(
                     Formatting.GRAY
                        + " Координаты: "
                        + Formatting.WHITE
                        + " ("
                        + var0.method2935().getX()
                        + ", "
                        + var0.method2935().getY()
                        + ", "
                        + var0.method2935().getZ()
                        + ")"
                  )
                  .append(Text.literal(Formatting.GRAY + " Сервер: " + Formatting.WHITE + var0.method2936()))
            ),
         Helper215.FORCE_COMMAND_PREFIX + var1
      );
   }

   private void method275(Helper219 var1) {
      var1.method1739(1);
      this.wayRepository.method4989();
      this.method906(Formatting.GREEN + "Все метки были удалены.");
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1690()) {
         String var3 = var2.method1723();
         if (!var3.equalsIgnoreCase("remove")) {
            if (var3.equalsIgnoreCase("add")) {
               String var4 = var2.method1689(5) ? "" : (var2.method1689(4) ? "z" : (var2.method1689(3) ? "y" : (var2.method1689(2) ? "x" : "Название")));
               return new Helper120().method999().method994(var4).method1003();
            }

            return new Helper120().method999().method994("add", "remove", "list", "clear").method1000(var3).method1003();
         }

         if (var2.method1694()) {
            return var2.method1736(Helper272.INSTANCE);
         }
      }

      return Stream.empty();
   }

   @Override
   public String method268() {
      return "Позволяет ставить метки в мире";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "С помощью этой команды можно добавлять/удалять метки в мире",
         "",
         "Использование:",
         "> way add <name> <x> <y> <z> - Добавляет метку",
         "> way remove <name> - Удаляет метку",
         "> way list - Возвращает список меток",
         "> way clear - Очищает список меток."
      );
   }
}
