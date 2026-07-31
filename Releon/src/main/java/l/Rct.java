package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.util.Formatting;

public class Rct extends Helper214 implements Helper160 {
   private final Helper2 repository;

   protected Rct(Releon var1) {
      super("rct");
      this.repository = var1.method24();
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      if (!Helper128.method1055()) {
         Notifications.method1666().method1668("[RCT] Не работает на этом " + Formatting.RED + "сервере", 3000L);
      } else if (Helper128.method1047()) {
         Notifications.method1666().method1668("[RCT] Вы находитесь в режиме " + Formatting.RED + "пвп", 3000L);
      } else {
         if (var2.method1690()) {
            var2.method1738(1);
            int var3 = var2.method1687().getFirst().method396(Integer.class);
            this.repository.method254(var3);
         } else {
            this.repository.method254(Helper128.method1059());
         }
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      return Stream.empty();
   }

   @Override
   public String method268() {
      return "Перезаходит на анархию";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Перезаходит на анархию", "", "Использование:", "> rct <anarchy> - Заходит на <anarchy>", "> rct - Перезаходит на анархию где вы только что были"
      );
   }
}
