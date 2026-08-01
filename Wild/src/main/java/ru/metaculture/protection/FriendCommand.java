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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import com.google.gson.reflect.TypeToken;
import net.minecraft.client.MinecraftClient;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class FriendCommand extends Command {
   private static final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private static final File O000000000 = new File(WildClient.O00000000.O0000000000000, "friend.cfg");
   private static final Map<String, FriendCommand.W19> O0000000000 = new HashMap<>();
   private static final SimpleDateFormat O00000000000 = new SimpleDateFormat("dd.MM.yyyy HH:mm");

   public FriendCommand() {
      super("friend", "Управление друзьями", ".friend <add/remove/list/clear> <name>");
      this.O00000000("add", () -> a_.getNetworkHandler().getPlayerList().stream().map(playerListEntry -> playerListEntry.getProfile().getName()).toList());
      this.O00000000("remove", () -> new ArrayList<>(O0000000000.keySet()));
      this.O00000000("list", List::of);
      this.O00000000("clear", List::of);
      this.O000000000000O();
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      switch (strings[0].toLowerCase(java.util.Locale.ROOT)) {
         case "add" -> this.O0000000000(strings);
         case "remove", "del", "delete" -> this.O00000000000(strings);
         case "list" -> this.O000000000000();
         case "clear" -> this.O0000000000000();
         default -> ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
      }
   }

   @Compile
   private void O0000000000(String[] strings) {
      if (strings.length != 2 || strings[1].isBlank()) {
         ChatUtil.O00000000("§cИспользование: §f.friend add <name>");
         return;
      }

      String var2 = strings[1].trim();
      if (O00000000(var2)) {
         ChatUtil.O00000000("§eУже в друзьях: §f" + var2);
      } else {
         O000000000(var2);
      }
   }

   @Compile
   private void O00000000000(String[] strings) {
      if (strings.length != 2 || strings[1].isBlank()) {
         ChatUtil.O00000000("§cИспользование: §f.friend remove <name>");
         return;
      }

      String var2 = strings[1].trim();
      if (!O00000000(var2)) {
         ChatUtil.O00000000("§eНе найден в друзьях: §f" + var2);
      } else {
         O000000000(var2);
      }
   }

   @Compile
   private void O000000000000() {
      if (O0000000000.isEmpty()) {
         ChatUtil.O00000000("§7Список друзей пуст.");
         return;
      }

      ChatUtil.O00000000("§fДрузья (§7" + O0000000000.size() + "§f):");
      O0000000000.values().stream().sorted((left, right) -> left.O00000000.compareToIgnoreCase(right.O00000000)).forEach(friend ->
         ChatUtil.O00000000("§f" + friend.O00000000 + " §7— " + O00000000000.format(friend.O000000000))
      );
   }

   @Compile
   private void O0000000000000() {
      int var1 = O0000000000.size();
      O0000000000.clear();
      O00000000000O0();
      ChatUtil.O00000000("§aСписок друзей очищен (§f" + var1 + "§a).");
   }

   public static boolean O00000000(String string) {
      return string == null ? false : O0000000000.containsKey(string.toLowerCase());
   }

   public static List<String> O00000000000() {
      return O0000000000.values().stream().map(o00000000 -> o00000000.O00000000).toList();
   }

   public static void O000000000(String string) {
      String var1 = string.toLowerCase();
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.getSession() != null && string.equalsIgnoreCase(var2.getSession().getUsername())) {
         ChatUtil.O00000000("§cНельзя добавить самого себя.");
      } else {
         if (O0000000000.containsKey(var1)) {
            O0000000000.remove(var1);
            O00000000000O0();
            O0000O0O00OOO.O00000000("friendremove", 100.0F, false);
            ChatUtil.O00000000("§cУдалён из друзей: §f" + string);
         } else {
            FriendCommand.W19 var3 = new FriendCommand.W19(string, new Date());
            O0000000000.put(var1, var3);
            O00000000000O0();
            O0000O0O00OOO.O00000000("friendadd", 100.0F, false);
            ChatUtil.O00000000("§aДобавлен в друзья: §f" + string + " §7(" + O00000000000.format(var3.O000000000) + ")");
         }
      }
   }

   @Compile
   private void O000000000000O() {
      if (!O000000000.isFile()) {
         return;
      }

      try (java.io.Reader var1 = Files.newBufferedReader(O000000000.toPath(), StandardCharsets.UTF_8)) {
         Map<String, FriendCommand.W19> var2 = O00000000.fromJson(var1, new TypeToken<Map<String, FriendCommand.W19>>() {}.getType());
         O0000000000.clear();
         if (var2 != null) {
            var2.forEach((name, friend) -> {
               if (friend != null && friend.O00000000 != null) {
                  O0000000000.put(friend.O00000000.toLowerCase(java.util.Locale.ROOT), friend);
               }
            });
         }
      } catch (Exception var3) {
         System.out.println("[FriendCommand] Failed to load friends: " + var3.getMessage());
      }
   }

   @Compile
   private void O00000000000O() { this.O000000000000(); }

   @Compile
   private static void O00000000000O0() {
      try {
         File var0 = O000000000.getParentFile();
         if (var0 != null) {
            Files.createDirectories(var0.toPath());
         }
         try (java.io.Writer var1 = Files.newBufferedWriter(O000000000.toPath(), StandardCharsets.UTF_8)) {
            O00000000.toJson(O0000000000, var1);
         }
      } catch (Exception var3) {
         System.out.println("[FriendCommand] Failed to save friends: " + var3.getMessage());
      }
   }

   static {
      Loader.initialize();
   }

   static class W19 {
      String O00000000;
      Date O000000000;

      W19(String string, Date date) {
         this.O00000000 = string;
         this.O000000000 = date;
      }
   }
}
