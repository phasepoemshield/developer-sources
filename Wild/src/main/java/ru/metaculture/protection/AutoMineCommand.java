package ru.metaculture.protection;

import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class AutoMineCommand extends Command {
   public AutoMineCommand() {
      super("automine", "Управление AutoMine", ".automine save");
      this.O00000000("save", List::of);
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {}

   static {
      Loader.initialize();
   }
}
