package ru.metaculture.protection;

import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class AutoBuyCommand extends Command {
   public AutoBuyCommand() {
      super("autobuy", "Управление AutoBuy", ".autobuy <ignore/unignore/list/clear> [name]");
      this.O00000000("ignore", this::O000000000000O);
      this.O00000000("add", this::O000000000000O);
      this.O00000000("unignore", AutoBuy::O0000000000O00);
      this.O00000000("remove", AutoBuy::O0000000000O00);
      this.O00000000("list", List::of);
      this.O00000000("clear", List::of);
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0) {
         this.O0000000000000();
         return;
      }

      switch (strings[0].toLowerCase(java.util.Locale.ROOT)) {
         case "ignore", "add", "+" -> this.O0000000000(strings);
         case "unignore", "remove", "del", "delete", "-" -> this.O00000000000(strings);
         case "list" -> this.O00000000000();
         case "clear" -> this.O000000000000();
         default -> this.O0000000000000();
      }
   }

   private void O0000000000(String[] strings) {
      String var2 = this.O000000000000(strings);
      if (var2 == null || var2.isBlank()) {
         ChatUtil.O00000000("§cУкажите ник игрока: §f.autobuy ignore Nick");
      } else if (AutoBuy.O00000000000(var2)) {
         ChatUtil.O00000000("§e[AutoBuy] Игрок уже в ignore: §f" + var2);
      } else if (AutoBuy.O000000000(var2)) {
         this.O00000000000O();
         ChatUtil.O00000000("§a[AutoBuy] Игрок добавлен в ignore: §f" + var2);
      } else {
         ChatUtil.O00000000("§c[AutoBuy] Некорректный ник.");
      }
   }

   private void O00000000000(String[] strings) {
      String var2 = this.O000000000000(strings);
      if (var2 != null && !var2.isBlank()) {
         if (AutoBuy.O0000000000(var2)) {
            this.O00000000000O();
            ChatUtil.O00000000("§a[AutoBuy] Игрок удален из ignore: §f" + var2);
         } else {
            ChatUtil.O00000000("§e[AutoBuy] Игрок не найден в ignore: §f" + var2);
         }
      } else {
         ChatUtil.O00000000("§cУкажите ник игрока: §f.autobuy unignore Nick");
      }
   }

   private void O00000000000() {
      List var1 = AutoBuy.O0000000000O00();
      if (var1.isEmpty()) {
         ChatUtil.O00000000("§7[AutoBuy] Ignore-список продавцов пуст.");
      } else {
         ChatUtil.O00000000("§f[AutoBuy] Ignore-продавцы (§7" + var1.size() + "§f): §7" + String.join(", ", var1));
      }
   }

   private void O000000000000() {
      if (AutoBuy.O0000000000O00().isEmpty()) {
         ChatUtil.O00000000("§7[AutoBuy] Ignore-список продавцов уже пуст.");
      } else {
         AutoBuy.O0000000000O0();
         this.O00000000000O();
         ChatUtil.O00000000("§a[AutoBuy] Ignore-список продавцов очищен.");
      }
   }

   private void O0000000000000() {
      ChatUtil.O00000000("§cИспользование: " + this.O0000000000());
      ChatUtil.O00000000("§7Пример: §f.autobuy ignore QWEERZIK");
   }

   private String O000000000000(String[] strings) {
      if (strings.length < 2) {
         return null;
      } else if ("+".equals(strings[1])) {
         return strings.length >= 3 ? strings[2] : null;
      } else {
         return strings[1];
      }
   }

   private List<String> O000000000000O() {
      return a_.getNetworkHandler() == null
         ? List.of()
         : a_.getNetworkHandler()
            .getPlayerList()
            .stream()
            .map(playerListEntry -> playerListEntry.getProfile().getName())
            .filter(string -> string != null && !string.isBlank())
            .toList();
   }

   private void O00000000000O() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   static {
      Loader.initialize();
   }
}
