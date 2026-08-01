package ru.metaculture.protection;

import java.util.List;
import java.util.Locale;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class AiRotationCommand extends Command {
   public AiRotationCommand() {
      super("ai", "Запись, обучение и воспроизведение AI-ротации", ".ai <train|learn|run|stop|log|lab|profile|list>");
      this.O00000000("train", List::of);
      this.O00000000("learn", List::of);
      this.O00000000("stop", List::of);
      this.O00000000("run", List::of);
      this.O00000000("log", List::of);
      this.O00000000("lab", List::of);
      this.O00000000("profile", List::of);
      this.O00000000("list", List::of);
   }

   public static void O00000000000() {
   }

   @Override
   public List<String> O00000000(String[] strings) {
      if (strings.length == 2) {
         String var4 = strings[1].toLowerCase(Locale.ROOT);
         return List.of("train", "learn", "run", "stop", "log", "lab", "profile", "list").stream().filter(string2 -> string2.startsWith(var4)).toList();
      } else {
         if (strings.length == 3) {
            String var2 = strings[1].toLowerCase(Locale.ROOT);
            if (var2.equals("profile") || var2.equals("run") || var2.equals("train") || var2.equals("learn")) {
               String var3 = strings[2].toLowerCase(Locale.ROOT);
               return O000000O0O0O00.O00000000O().stream().filter(string2 -> string2.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }
         }

         return List.of();
      }
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      String var2 = strings[0].toLowerCase(Locale.ROOT);
      if (strings.length >= 2 && (var2.equals("train") || var2.equals("learn") || var2.equals("run"))) {
         ChatUtil.O000000000(O000000O0O0O00.O000000000(strings[1]));
      }

      String var3;
      switch (var2) {
         case "train" -> var3 = O000000O0O0O00.O00000000();
         case "learn" -> var3 = O000000O0O0O00.O00000000000();
         case "run" -> {
            var3 = O000000O0O0O00.O0000000000();
            this.O000000000000();
         }
         case "stop" -> var3 = O000000O0O0O00.O000000000();
         case "profile" -> var3 = strings.length >= 2
            ? O000000O0O0O00.O000000000(strings[1])
            : "Активный профиль: " + O000000O0O0O00.O000000000OOOO();
         case "list" -> var3 = O000000O0O0O00.O00000000O0();
         case "log" -> var3 = "AI log: " + O000000O0O0O00.O000000000O000().toAbsolutePath();
         case "lab" -> {
            if (a_ != null) {
               a_.setScreen(new AiLabScreen());
            }
            var3 = "AI Lab открыт.";
         }
         default -> var3 = "Использование: " + this.O0000000000();
      }

      ChatUtil.O000000000(var3);
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      O000000O0O0O00.O00000000(o0000000O0O0OO);
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      O000000O0O0O00.O000000000000();
   }

   private void O000000000000() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null && AttackAura.O000000000O00.O00000000000.contains("AI")) {
         AttackAura.O000000000O00.O000000000000 = "AI";
         AttackAura.O000000000O00.O00000000000O = AttackAura.O000000000O00.O00000000000.indexOf("AI");
         AttackAura var1 = WildClient.O00000000.O000000000.O00000000(AttackAura.class);
         if (var1 != null && !var1.O0000000000000) {
            var1.O00000000(true);
         }
      } else {
         ChatUtil.O00000000("Режим AI недоступен для текущего профиля.");
         O000000O0O0O00.O000000000();
      }
   }

   static {
      Loader.initialize();
   }
}
