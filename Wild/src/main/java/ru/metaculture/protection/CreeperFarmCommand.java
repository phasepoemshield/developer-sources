package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.List;
import net.minecraft.util.math.BlockPos;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class CreeperFarmCommand extends Command {
   private final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private final File O000000000 = new File(WildClient.O00000000.O0000000000000, "creeperfarm.cfg");

   public CreeperFarmCommand() {
      super("cf", "Управление границами фермы криперов", ".cf <pos1/pos2/clear/info>");
      this.O00000000("pos1", List::of);
      this.O00000000("pos2", List::of);
      this.O00000000("clear", List::of);
      this.O00000000("info", List::of);
      this.O00000000000O();
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {}

   @Compile
   private void O00000000000() {}

   @Compile
   private void O000000000000() {}

   @Compile
   private void O0000000000000() {}

   @Compile
   private void O000000000000O() {}

   @Compile
   private String O00000000(BlockPos blockPos) { return ""; }

   @Compile
   private void O00000000000O() {}

   @Compile
   private void O00000000000O0() {}

   static {
      Loader.initialize();
   }

   static class W17 {
      CreeperFarmCommand.W18 O00000000;
      CreeperFarmCommand.W18 O000000000;
   }

   static class W18 {
      int O00000000;
      int O000000000;
      int O0000000000;

      W18(int i, int j, int k) {
         this.O00000000 = i;
         this.O000000000 = j;
         this.O0000000000 = k;
      }
   }
}
