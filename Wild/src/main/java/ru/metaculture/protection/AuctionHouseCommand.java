package ru.metaculture.protection;

import java.util.Locale;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class AuctionHouseCommand extends Command {
   public AuctionHouseCommand() {
      super("ah", "Открыть общую страницу аукциона с фильтром цены", ".ah [максимальная цена]");
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (a_ == null || a_.player == null || a_.player.networkHandler == null) {
         ChatUtil.O00000000("§cИгрок не подключён к серверу.");
         return;
      }

      if (strings.length == 0) {
         AhHelper.O0000000000O0();
         a_.player.networkHandler.sendChatCommand("ah");
         return;
      }

      Long var2 = this.O0000000000(strings);
      if (var2 == null || var2 <= 0L) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      AhHelper.O00000000(var2);
      a_.player.networkHandler.sendChatCommand("ah");
      ChatUtil.O00000000("§aФильтр аукциона: цена до §f" + this.O00000000(var2));
   }

   private Long O0000000000(String[] strings) {
      StringBuilder var2 = new StringBuilder();

      for (String var6 : strings) {
         if (var6 == null || !var6.matches("[0-9][0-9_.,]*")) {
            return null;
         }

         var2.append(var6.replaceAll("[^0-9]", ""));
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         try {
            return Long.parseLong(var2.toString());
         } catch (NumberFormatException var7) {
            return null;
         }
      }
   }

   private String O00000000(long l) {
      return String.format(Locale.ROOT, "%,d", l).replace(',', ' ');
   }

   static {
      Loader.initialize();
   }
}
