package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Locale;
import com.google.gson.reflect.TypeToken;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class MacroCommand extends Command {
   private final Gson O000000000 = new GsonBuilder().setPrettyPrinting().create();
   private final File O0000000000 = new File(WildClient.O00000000.O0000000000000, "macros.cfg");
   public static List<MacroCommand.W20> O00000000 = new ArrayList<>();

   public MacroCommand() {
      super("macro", "Управление макросами", ".macro <add/remove/list/clear/load>");
      this.O00000000("add", () -> List.of("add"));
      this.O00000000("remove", () -> O00000000.stream().map(o00000000 -> o00000000.O00000000).toList());
      this.O00000000("load", () -> List.of("load"));
      this.O00000000("list", () -> List.of("list"));
      this.O00000000("clear", () -> List.of("clear"));
      this.O00000000000();
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      switch (strings[0].toLowerCase(Locale.ROOT)) {
         case "add" -> this.O0000000000(strings);
         case "remove", "del", "delete" -> this.O00000000000(strings);
         case "list" -> this.O000000000000();
         case "clear" -> this.O0000000000000();
         case "load" -> {
            this.O00000000000();
            ChatUtil.O00000000("§aМакросы перезагружены: §f" + O00000000.size());
         }
         default -> ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O0000000000000() == 1) {
         for (MacroCommand.W20 var3 : O00000000) {
            if (o0000000O0O0.O00000000000() == var3.O0000000000) {
               a_.player.networkHandler.sendChatMessage(var3.O000000000);
            }
         }
      }
   }

   @Compile
   private void O0000000000(String[] strings) {
      if (strings.length < 4) {
         ChatUtil.O00000000("§cИспользование: §f.macro add <name> <key> <message>");
         return;
      }

      String var2 = strings[1];
      int var3 = O0000O000OO0O0.O00000000(strings[2].toUpperCase(Locale.ROOT).replace("_", ""));
      if (var3 == -1) {
         ChatUtil.O00000000("§cНеизвестная клавиша: §f" + strings[2]);
         return;
      }

      String var4 = String.join(" ", java.util.Arrays.copyOfRange(strings, 3, strings.length));
      O00000000.removeIf(macro -> macro.O00000000.equalsIgnoreCase(var2));
      O00000000.add(new MacroCommand.W20(var2, var3, var4));
      this.O000000000000O();
      ChatUtil.O00000000("§aМакрос §f'" + var2 + "' §aназначен на §f" + strings[2].toUpperCase(Locale.ROOT));
   }

   @Compile
   public void O00000000000() {
      if (!this.O0000000000.isFile()) {
         return;
      }

      try (java.io.Reader var1 = Files.newBufferedReader(this.O0000000000.toPath(), StandardCharsets.UTF_8)) {
         List<MacroCommand.W20> var2 = this.O000000000.fromJson(var1, new TypeToken<List<MacroCommand.W20>>() {}.getType());
         O00000000.clear();
         if (var2 != null) {
            O00000000.addAll(var2);
         }
      } catch (Exception var3) {
         System.out.println("[MacroCommand] Failed to load macros: " + var3.getMessage());
      }
   }

   @Compile
   private void O000000000000() {
      if (O00000000.isEmpty()) {
         ChatUtil.O00000000("§7Список макросов пуст.");
         return;
      }
      ChatUtil.O00000000("§fМакросы (§7" + O00000000.size() + "§f):");
      O00000000.stream().sorted((left, right) -> left.O00000000.compareToIgnoreCase(right.O00000000)).forEach(macro ->
         ChatUtil.O00000000("§f" + macro.O00000000 + " §7[" + O0000O000OO0O0.O00000000(macro.O0000000000) + "] — §f" + macro.O000000000)
      );
   }

   @Compile
   private void O0000000000000() {
      int var1 = O00000000.size();
      O00000000.clear();
      this.O000000000000O();
      ChatUtil.O00000000("§aМакросы очищены (§f" + var1 + "§a).");
   }

   @Compile
   private void O000000000000O() {
      try {
         File var1 = this.O0000000000.getParentFile();
         if (var1 != null) {
            Files.createDirectories(var1.toPath());
         }
         try (java.io.Writer var2 = Files.newBufferedWriter(this.O0000000000.toPath(), StandardCharsets.UTF_8)) {
            this.O000000000.toJson(O00000000, var2);
         }
      } catch (Exception var4) {
         System.out.println("[MacroCommand] Failed to save macros: " + var4.getMessage());
      }
   }

   @Compile
   private void O00000000000(String[] strings) {
      if (strings.length != 2) {
         ChatUtil.O00000000("§cИспользование: §f.macro remove <name>");
         return;
      }
      boolean var2 = O00000000.removeIf(macro -> macro.O00000000.equalsIgnoreCase(strings[1]));
      if (var2) {
         this.O000000000000O();
      }
      ChatUtil.O00000000(var2 ? "§aМакрос удалён: §f" + strings[1] : "§eМакрос не найден: §f" + strings[1]);
   }

   static {
      Loader.initialize();
   }

   public static class W20 {
      public String O00000000;
      public String O000000000;
      public int O0000000000;

      public W20(String string, int i, String string2) {
         this.O00000000 = string;
         this.O0000000000 = i;
         this.O000000000 = string2;
      }
   }
}
