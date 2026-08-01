package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class PartyCommand extends Command {
   private final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private final File O000000000 = new File(WildClient.O00000000.O0000000000000, "party.cfg");
   private static final Map<String, PartyCommand.W21> O0000000000 = new HashMap<>();
   private final SimpleDateFormat O00000000000 = new SimpleDateFormat("dd.MM.yyyy HH:mm");

   public PartyCommand() {
      super("party", "Управление группой (Party List)", ".party <add/remove/list/clear> <name>");
      this.O00000000("add", () -> a_.getNetworkHandler().getPlayerList().stream().map(playerListEntry -> playerListEntry.getProfile().getName()).toList());
      this.O00000000("remove", () -> new ArrayList<>(O0000000000.keySet()));
      this.O00000000("list", List::of);
      this.O00000000("clear", List::of);
      this.O000000000000O();
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {}

   @Compile
   private void O0000000000(String[] strings) {}

   @Compile
   private void O00000000000(String[] strings) {}

   @Compile
   private void O000000000000() {}

   @Compile
   private void O0000000000000() {}

   @Compile
   public static boolean O00000000(String string) { return false; }

   public static Set<String> O00000000000() {
      return O0000000000.keySet();
   }

   @Compile
   private void O000000000000O() {}

   @Compile
   private void O00000000000O() {}

   static {
      Loader.initialize();
   }

   static class W21 {
      String O00000000;
      Date O000000000;

      W21(String string, Date date) {
         this.O00000000 = string;
         this.O000000000 = date;
      }
   }
}
