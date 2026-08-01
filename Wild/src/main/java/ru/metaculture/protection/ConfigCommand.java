package ru.metaculture.protection;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionException;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class ConfigCommand extends Command {
   private final File O00000000;

   public ConfigCommand() {
      super("config", "Управление конфигурациями", ".config <save/load/cloudload/cloudlist/list/delete/dir/reset> <name>");
      this.O00000000 = ConfigManager.O00000000;
      this.O00000000("load", this::O00000000000);
      this.O00000000("delete", this::O00000000000);
      this.O00000000("dir", List::of);
      this.O00000000("reset", List::of);
      this.O00000000("save", this::O00000000000);
      this.O00000000("list", List::of);
      this.O00000000("cloudload", CloudConfigService::O000000000);
      this.O00000000("cloudlist", List::of);
   }

   private List<String> O00000000000() {
      if (!this.O00000000.exists()) {
         return List.of();
      } else {
         File[] var1 = this.O00000000.listFiles((file, string) -> string.endsWith(".cfg") || string.endsWith(".json"));
         return var1 == null ? List.of() : Arrays.stream(var1).map(file -> {
            String var1x = file.getName();
            return var1x.substring(0, var1x.lastIndexOf(46));
         }).distinct().sorted(String.CASE_INSENSITIVE_ORDER).toList();
      }
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0 || WildClient.O00000000 == null || WildClient.O00000000.O0000000000O00 == null) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      ConfigManager var2 = WildClient.O00000000.O0000000000O00;
      String var3 = strings[0].toLowerCase(java.util.Locale.ROOT);
      String var4 = strings.length >= 2 ? strings[1] : "default";
      switch (var3) {
         case "save" -> ChatUtil.O00000000(
            var2.O000000000(var4) ? "§aКонфиг §f'" + var4 + "' §aсохранён." : "§cНе удалось сохранить конфиг §f'" + var4 + "'."
         );
         case "load" -> {
            if (var2.O00000000(var4)) {
               ChatUtil.O00000000("§aКонфиг §f'" + var4 + "' §aзагружен.");
            } else {
               this.O00000000(var4, false);
            }
         }
         case "cloudload" -> this.O00000000(var4, true);
         case "list" -> {
            List<String> var5 = ConfigManager.O00000000().stream().map(Config::O000000000).sorted(String.CASE_INSENSITIVE_ORDER).toList();
            this.O00000000("Локальные конфиги", var5.isEmpty() ? List.of("нет") : var5);
         }
         case "cloudlist" -> {
            ChatUtil.O00000000("§7Запрашиваю список Cloud Config...");
            CloudConfigService.O00000000().whenComplete((result, error) -> this.O00000000(() -> {
               if (error != null) {
                  ChatUtil.O00000000("§cОшибка Cloud Config: §7" + this.O00000000(error));
               } else if (result != null && result.success()) {
                  this.O00000000("Cloud Config", result.names().isEmpty() ? List.of("нет") : result.names());
               } else {
                  ChatUtil.O00000000("§cОшибка Cloud Config: §7" + (result == null ? "неизвестная ошибка" : result.error()));
               }
            }));
         }
         case "delete", "del", "remove" -> ChatUtil.O00000000(
            var2.O00000000000(var4) ? "§aКонфиг §f'" + var4 + "' §aудалён." : "§cНе удалось удалить конфиг §f'" + var4 + "'."
         );
         case "dir" -> {
            try {
               java.awt.Desktop.getDesktop().open(this.O00000000);
               ChatUtil.O00000000("§aПапка конфигов открыта: §f" + this.O00000000.getAbsolutePath());
            } catch (Exception var8) {
               ChatUtil.O00000000("§7Папка конфигов: §f" + this.O00000000.getAbsolutePath());
            }
         }
         case "reset" -> {
            if (WildClient.O00000000.O000000000 != null) {
               WildClient.O00000000.O000000000.O000000000().forEach(org.wild.module.api.Module::c_);
            }
            var2.O000000000("default");
            ChatUtil.O00000000("§aНастройки модулей сброшены.");
         }
         default -> ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
      }
   }

   @Compile
   private void O0000000000(String[] strings) {}

   @Compile
   private void O00000000000(String[] strings) {}

   @Compile
   private void O000000000000(String[] strings) {}

   private void O00000000(String string, boolean bl) {
      if (bl) {
         ChatUtil.O00000000("§7Принудительно загружаю Cloud Config §f'" + string + "'§7...");
      } else {
         ChatUtil.O00000000("§7Локальный конфиг §f'" + string + "' §7не найден. Запрашиваю облако...");
      }

      CloudConfigService.O00000000(string).whenComplete((o000000000, throwable) -> this.O00000000(() -> {
         if (throwable != null) {
            ChatUtil.O00000000("§cОшибка Cloud Config: §7" + this.O00000000(throwable));
         } else {
            if (o000000000 != null && o000000000.success()) {
               ChatUtil.O00000000("§aCloud Config §f'" + o000000000.name() + "' §aзагружен и сохранен.");
            } else {
               String var4 = o000000000 != null && o000000000.error() != null ? o000000000.error() : "неизвестная ошибка";
               ChatUtil.O00000000("§cCloud Config §f'" + string + "' §cне загружен: §7" + var4);
            }
         }
      }));
   }

   @Compile
   private void O000000000000() {}

   @Compile
   private void O0000000000000(String[] strings) {}

   @Compile
   private void O0000000000000() {}

   @Compile
   private void O000000000000O() {}

   @Compile
   private void O00000000000O() {}

   private void O00000000(String string, List<String> list) {
      MutableText var3 = Text.literal("§f" + string + ": ");
      int var4 = O00000O0OOOOOO.O00000000();

      for (int var5 = 0; var5 < list.size(); var5++) {
         MutableText var6 = Text.literal((String)list.get(var5)).setStyle(Style.EMPTY.withColor(TextColor.fromRgb(var4)));
         var3.append(var6);
         if (var5 < list.size() - 1) {
            var3.append(Text.literal("§7 | "));
         }
      }

      if (a_.player != null) {
         a_.player.sendMessage(var3, false);
      } else {
         ChatUtil.O00000000(string + ": " + String.join(", ", list));
      }
   }

   private void O00000000(Runnable runnable) {
      if (a_ == null) {
         runnable.run();
      } else {
         a_.execute(runnable);
      }
   }

   private String O00000000(Throwable throwable) {
      Throwable var2 = throwable;

      while (var2 instanceof CompletionException && var2.getCause() != null) {
         var2 = var2.getCause();
      }

      String var3 = var2 == null ? null : var2.getMessage();
      return var3 != null && !var3.isBlank() ? var3 : "неизвестная ошибка";
   }

   static {
      Loader.initialize();
   }
}
