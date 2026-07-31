package ru.metaculture.protection;

import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class IrcCommand extends Command {
   public IrcCommand() {
      super("irc", "Отправка сообщения в глобальный IRC чат", ".irc <сообщение>");
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {}

   static {
      Loader.initialize();
   }
}
