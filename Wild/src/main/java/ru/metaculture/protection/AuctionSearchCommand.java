package ru.metaculture.protection;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class AuctionSearchCommand extends Command {
   public AuctionSearchCommand() {
      super("ahsearch", "Поиск лотов по названию и максимальной цене", ".ahsearch <название> <максимальная цена>");
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 1 && this.O0000000000(strings[0])) {
         AhHelper.O0000000000O0();
         ChatUtil.O00000000("§7Фильтр поиска аукциона сброшен.");
         return;
      }

      if (strings.length < 2 || a_ == null || a_.player == null || a_.player.networkHandler == null) {
         this.O00000000000();
         return;
      }

      List<String> var2 = new ArrayList<>(List.of(strings));
      int var3 = this.O00000000(var2);
      if (var3 <= 0) {
         this.O00000000000();
         return;
      }

      String var4 = String.join(" ", var2.subList(0, var3)).trim();
      Long var5 = this.O000000000(var2.subList(var3, var2.size()));
      if (var4.isEmpty() || var5 == null || var5 <= 0L) {
         this.O00000000000();
         return;
      }

      AhHelper.O00000000(var4, var5);
      a_.player.networkHandler.sendChatCommand("ah search " + var4);
      ChatUtil.O00000000("§aПоиск §f'" + var4 + "' §aдо §f" + this.O00000000(var5));
   }

   @Override
   public List<String> O00000000(String[] strings) {
      String var2 = strings.length == 0 ? "" : strings[strings.length - 1].toLowerCase(Locale.ROOT);
      return List.of("clear").stream().filter(string2 -> string2.startsWith(var2)).toList();
   }

   private int O00000000(List<String> list) {
      if (list.size() >= 2 && this.O00000000((String)list.getLast())) {
         int var2 = list.size() - 1;

         while (var2 > 1 && this.O000000000((String)list.get(var2)) == 3 && this.O00000000((String)list.get(var2 - 1))) {
            var2--;
         }

         return var2;
      } else {
         return -1;
      }
   }

   private Long O000000000(List<String> list) {
      StringBuilder var2 = new StringBuilder();

      for (String var4 : list) {
         var2.append(var4.replaceAll("[^0-9]", ""));
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         try {
            return Long.parseLong(var2.toString());
         } catch (NumberFormatException var5) {
            return null;
         }
      }
   }

   private boolean O00000000(String string) {
      return string != null && string.matches("[0-9][0-9_.,]*");
   }

   private int O000000000(String string) {
      return string.replaceAll("[^0-9]", "").length();
   }

   private boolean O0000000000(String string) {
      return string.equalsIgnoreCase("clear") || string.equalsIgnoreCase("off") || string.equalsIgnoreCase("reset");
   }

   private String O00000000(long l) {
      return String.format(Locale.ROOT, "%,d", l).replace(',', ' ');
   }

   private void O00000000000() {
      ChatUtil.O00000000("§cИспользование: " + this.O0000000000());
      ChatUtil.O00000000("§7Пример: §f.ahsearch зачарованное золотое яблоко 100 000");
      ChatUtil.O00000000("§7Сброс: §f.ahsearch clear");
   }

   static {
      Loader.initialize();
   }
}
