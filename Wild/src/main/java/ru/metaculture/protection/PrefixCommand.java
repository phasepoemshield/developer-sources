package ru.metaculture.protection;

import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class PrefixCommand extends Command {
   public PrefixCommand() {
      super("prefix", "Изменение префикса команд", ".prefix set <symbol>");
      this.O00000000("set", List::of);
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length != 2 || !strings[0].equalsIgnoreCase("set") || strings[1].isBlank()) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      String var2 = strings[1].trim();
      if (var2.length() > 3 || var2.chars().anyMatch(Character::isWhitespace) || var2.startsWith("/")) {
         ChatUtil.O00000000("§cПрефикс должен содержать 1–3 непробельных символа и не может начинаться с '/'.");
         return;
      }

      WildClient.O00000000.O00000000(var2);
      if (WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }

      ChatUtil.O00000000("§aПрефикс команд изменён на §f" + var2);
   }

   static {
      Loader.initialize();
   }
}
