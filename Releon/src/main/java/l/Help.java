package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.Action;
import net.minecraft.util.Formatting;

public class Help extends Helper214 {
   Releon main;

   protected Help(Releon var1) {
      super("help");
      this.main = var1;
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      var2.method1739(1);
      Helper308 var3 = this.main.method19();
      if (var2.method1690() && !var2.method1698(Integer.class)) {
         String var4 = var2.method1723().toLowerCase();
         Helper230 var5 = var3.method1062(var4);
         if (var5 == null) {
            throw new Helper114(var4);
         }

         this.method906("");
         var5.method269().forEach(this::method906);
         this.method906("");
         MutableText var6 = Text.literal("Нажмите что бы вернуться обратно в меню");
         var6.setStyle(var6.getStyle().withClickEvent(new ClickEvent(Action.RUN_COMMAND, Helper215.FORCE_COMMAND_PREFIX + var1)));
         this.method904(new Text[]{var6});
      } else {
         Helper77.method806(
            var2,
            new Helper77<>(var3.method1061().method962().filter(var0 -> !var0.method2075()).collect(Collectors.toList())),
            () -> this.method906("Доступные команды:"),
            var1x -> {
               String var2x = String.join("/", var1x.method1860());
               String var3x = var1x.method1860().get(0);
               MutableText var4x = Text.literal(" - " + var1x.method268());
               var4x.setStyle(var4x.getStyle().withColor(Formatting.DARK_GRAY));
               MutableText var5x = Text.literal(var2x);
               var5x.setStyle(var5x.getStyle().withColor(Formatting.WHITE));
               MutableText var6x = Text.literal("");
               var6x.setStyle(var6x.getStyle().withColor(Formatting.GRAY));
               var6x.append(var5x);
               var6x.append("\n" + var1x.method268());
               var6x.append("\n\nНажмите, чтобы просмотреть полную справку о команде");
               String var7 = Helper215.FORCE_COMMAND_PREFIX + String.format("%s %s", var1, var1x.method1860().get(0));
               MutableText var8 = Text.literal(var3x);
               var8.setStyle(var8.getStyle().withColor(Formatting.GRAY));
               var8.append(var4x);
               var8.setStyle(
                  var8.getStyle()
                     .withHoverEvent(new HoverEvent(net.minecraft.text.HoverEvent.Action.SHOW_TEXT, var6x))
                     .withClickEvent(new ClickEvent(Action.RUN_COMMAND, var7))
               );
               return var8;
            },
            Helper215.FORCE_COMMAND_PREFIX + var1
         );
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      return var2.method1694() ? new Helper120().method1004(Releon.method71().method19()).method1000(var2.method1723()).method1003() : Stream.empty();
   }

   @Override
   public String method268() {
      return "Просмотр всех доступных команд";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "С помощью этой команды можно просмотреть подробную справочную информацию о том, как использовать определенные команды",
         "",
         "Использование:",
         "> help - Перечисляет все команды и их краткие описания.",
         "> help <command> - Отображение справочной информации по конкретной команде."
      );
   }
}
