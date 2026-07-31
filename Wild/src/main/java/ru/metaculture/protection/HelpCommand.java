package ru.metaculture.protection;

import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class HelpCommand extends Command {
   private final CommandManager O00000000;

   public HelpCommand(CommandManager o000000000OO) {
      super("help", "Показывает список всех команд", ".help");
      this.O00000000 = o000000000OO;
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      String var2 = WildClient.O00000000 == null ? "." : WildClient.O00000000.O000000000OO();
      ChatUtil.O00000000("§fКоманды Wild (§7" + this.O00000000.O00000000().size() + "§f):");

      for (Command var4 : this.O00000000.O00000000()) {
         ChatUtil.O00000000("§f" + var2 + var4.O00000000() + " §7— " + var4.O000000000());
      }
   }

   static {
      Loader.initialize();
   }
}
