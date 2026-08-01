package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class CommandManager {
   private final List<Command> O00000000 = new ArrayList<>();

   public CommandManager() {
      this.O00000000(new HelpCommand(this));
      this.O00000000(new FriendCommand());
      this.O00000000(new PrefixCommand());
      this.O00000000(new ConfigCommand());
      this.O00000000(new CreeperFarmCommand());
      this.O00000000(new CocoaFarmCommand());
      this.O00000000(new ChorusFarmCommand());
      this.O00000000(new TelegramApiCommand());
      this.O00000000(new MacroCommand());
      this.O00000000(new GpsCommand());
      this.O00000000(new BindCommand());
      this.O00000000(new AutoBuyCommand());
      this.O00000000(new AuctionHouseCommand());
      this.O00000000(new AuctionSearchCommand());
      this.O00000000(new ReconnectCommand());
      this.O00000000(new XrayCommand());
      this.O00000000(new AiRotationCommand());
   }

   @Compile
   public void O00000000(Command o000000000O0OO) {
      if (o000000000O0OO != null
         && this.O00000000.stream().noneMatch(command -> command.O00000000().equalsIgnoreCase(o000000000O0OO.O00000000()))) {
         this.O00000000.add(o000000000O0OO);
         this.O00000000.sort(Comparator.comparing(Command::O00000000, String.CASE_INSENSITIVE_ORDER));
         EventManager.O00000000(o000000000O0OO);
      }
   }

   @Compile
   public void O00000000(String string) {
      if (string == null || WildClient.O00000000 == null) {
         return;
      }

      String var2 = WildClient.O00000000.O000000000OO();
      if (var2 == null || var2.isEmpty() || !string.startsWith(var2)) {
         return;
      }

      String var3 = string.substring(var2.length()).trim();
      if (var3.isEmpty()) {
         ChatUtil.O00000000("§cВведите команду. Используйте §f" + var2 + "help§c.");
         return;
      }

      String[] var4 = var3.split("\\s+");
      Command var5 = this.O00000000.stream().filter(command -> command.O00000000().equalsIgnoreCase(var4[0])).findFirst().orElse(null);
      if (var5 == null) {
         ChatUtil.O00000000("§cНеизвестная команда: §f" + var4[0] + "§c. Используйте §f" + var2 + "help§c.");
         return;
      }

      try {
         var5.O000000000(Arrays.copyOfRange(var4, 1, var4.length));
      } catch (Throwable var7) {
         ChatUtil.O00000000("§cОшибка команды §f" + var5.O00000000() + "§c: " + var7.getClass().getSimpleName());
         var7.printStackTrace();
      }
   }

   public List<Command> O00000000() {
      return this.O00000000;
   }

   static {
      Loader.initialize();
   }
}
