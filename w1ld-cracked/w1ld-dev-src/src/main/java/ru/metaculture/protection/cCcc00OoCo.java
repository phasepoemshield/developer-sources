package ru.metaculture.protection;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionException;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_5251;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class cCcc00OoCo extends UNUuvUN {
   private final File UuUVuuUu;

   public cCcc00OoCo() {
      super("config", "Управление конфигурациями", ".config <save/load/cloudload/cloudlist/list/delete/dir/reset> <name>");
      this.UuUVuuUu = NnunnNUUUNVn.UuUVuuUu;
      this.UuUVuuUu("load", this::vVvUvVVuuNvV);
      this.UuUVuuUu("delete", this::vVvUvVVuuNvV);
      this.UuUVuuUu("dir", List::of);
      this.UuUVuuUu("reset", List::of);
      this.UuUVuuUu("save", this::vVvUvVVuuNvV);
      this.UuUVuuUu("list", List::of);
      this.UuUVuuUu("cloudload", nNvunNUnV::C00OOC00oO);
      this.UuUVuuUu("cloudlist", List::of);
   }

   private List<String> vVvUvVVuuNvV() {
      if (!this.UuUVuuUu.exists()) {
         return List.of();
      } else {
         File[] var1 = this.UuUVuuUu.listFiles((var0, var1x) -> var1x.endsWith(".cfg") || var1x.endsWith(".json"));
         return var1 == null ? List.of() : Arrays.stream(var1).map(var0 -> {
            String var1x = var0.getName();
            return var1x.substring(0, var1x.lastIndexOf(46));
         }).distinct().sorted(String.CASE_INSENSITIVE_ORDER).toList();
      }
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (NVnVnNnN.UuUVuuUu.nUUVuvU == null) {
         vVnvuVVUunuv.UuUVuuUu("§cСистема конфигураций еще не инициализирована.");
      } else if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.UuUVuuUu());
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "save":
               this.uUnuvNvvNU(var1);
               break;
            case "load":
               this.vVvUvVVuuNvV(var1);
               break;
            case "cloudload":
               this.uNNnnnuuuN(var1);
               break;
            case "cloudlist":
               this.uNNnnnuuuN();
               break;
            case "delete":
               this.nuUnNvnuUu(var1);
               break;
            case "list":
               this.VVuuUN();
               break;
            case "dir":
               this.nuUnNvnuUu();
               break;
            case "reset":
               this.vNUvnnVnUvu();
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда. Используйте: save, load, cloudload, cloudlist, delete, list, dir, reset");
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите название конфига.");
      } else {
         String var2 = var1[1];
         if (NVnVnNnN.UuUVuuUu.nUUVuvU.C00OOC00oO(var2)) {
            vVnvuVVUunuv.UuUVuuUu("§aКонфиг §f'" + var2 + "' §aуспешно сохранен.");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cНе удалось сохранить конфиг §f'" + var2 + "'§c.");
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите название конфига для загрузки.");
      } else {
         String var2 = var1[1];
         NnunnNUUUNVn var3 = NVnVnNnN.UuUVuuUu.nUUVuvU;
         if (var3 != null && var3.UuUVuuUu(var2)) {
            vVnvuVVUunuv.UuUVuuUu("§aКонфиг §f'" + var2 + "' §aуспешно загружен.");
         } else {
            this.UuUVuuUu(var2, false);
         }
      }
   }

   @Compile
   private void uNNnnnuuuN(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите название Cloud Config для загрузки.");
      } else {
         this.UuUVuuUu(var1[1], true);
      }
   }

   private void UuUVuuUu(String var1, boolean var2) {
      if (var2) {
         vVnvuVVUunuv.UuUVuuUu("§7Принудительно загружаю Cloud Config §f'" + var1 + "'§7...");
      } else {
         vVnvuVVUunuv.UuUVuuUu("§7Локальный конфиг §f'" + var1 + "' §7не найден. Запрашиваю облако...");
      }

      nNvunNUnV.UuUVuuUu(var1).whenComplete((var2x, var3) -> this.UuUVuuUu(() -> {
         if (var3 != null) {
            vVnvuVVUunuv.UuUVuuUu("§cОшибка Cloud Config: §7" + this.UuUVuuUu(var3));
         } else {
            if (var2x != null && var2x.success()) {
               vVnvuVVUunuv.UuUVuuUu("§aCloud Config §f'" + var2x.name() + "' §aзагружен и сохранен.");
            } else {
               String var4 = var2x != null && var2x.error() != null ? var2x.error() : "неизвестная ошибка";
               vVnvuVVUunuv.UuUVuuUu("§cCloud Config §f'" + var1 + "' §cне загружен: §7" + var4);
            }
         }
      }));
   }

   @Compile
   private void uNNnnnuuuN() {
      vVnvuVVUunuv.UuUVuuUu("§7Запрашиваю список Cloud Configs...");
      nNvunNUnV.UuUVuuUu().whenComplete((var1, var2) -> this.UuUVuuUu(() -> {
         if (var2 != null) {
            vVnvuVVUunuv.UuUVuuUu("§cОшибка Cloud Config index: §7" + this.UuUVuuUu(var2));
         } else if (var1 != null && var1.success()) {
            if (var1.names().isEmpty()) {
               vVnvuVVUunuv.UuUVuuUu("§7Cloud Config index пуст.");
            } else {
               this.UuUVuuUu("Cloud Configs", var1.names());
            }
         } else {
            String var3 = var1 != null && var1.error() != null ? var1.error() : "неизвестная ошибка";
            vVnvuVVUunuv.UuUVuuUu("§cНе удалось загрузить cloudlist: §7" + var3);
         }
      }));
   }

   @Compile
   private void nuUnNvnuUu(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите название конфига для удаления.");
      } else {
         String var2 = var1[1];
         if (NVnVnNnN.UuUVuuUu.nUUVuvU.vVvUvVVuuNvV(var2)) {
            vVnvuVVUunuv.UuUVuuUu("§aКонфиг §f'" + var2 + "' §aудален.");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cКонфиг §f'" + var2 + "' §cне найден.");
         }
      }
   }

   @Compile
   private void nuUnNvnuUu() {
      try {
         if (!this.UuUVuuUu.exists()) {
            this.UuUVuuUu.mkdirs();
         }

         String var1 = System.getProperty("os.name").toLowerCase();
         if (var1.contains("win")) {
            Runtime.getRuntime().exec(new String[]{"explorer", this.UuUVuuUu.getAbsolutePath()});
         } else if (var1.contains("mac")) {
            Runtime.getRuntime().exec(new String[]{"open", this.UuUVuuUu.getAbsolutePath()});
         } else {
            Runtime.getRuntime().exec(new String[]{"xdg-open", this.UuUVuuUu.getAbsolutePath()});
         }

         vVnvuVVUunuv.UuUVuuUu("§aПапка с конфигами открыта!");
         vVnvuVVUunuv.UuUVuuUu("§7Путь: §f" + this.UuUVuuUu.getAbsolutePath());
      } catch (Exception var2) {
         vVnvuVVUunuv.UuUVuuUu("§cНе удалось открыть папку с конфигами.");
      }
   }

   @Compile
   private void VVuuUN() {
      List var1 = NVnVnNnN.UuUVuuUu.nUUVuvU.nuUnNvnuUu();
      if (var1.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7Нет доступных конфигов.");
      } else {
         this.UuUVuuUu("Доступные конфиги", var1.stream().map(UNVVUvUnNuNU::C00OOC00oO).toList());
      }
   }

   @Compile
   private void vNUvnnVnUvu() {
      if (NVnVnNnN.UuUVuuUu.nUUVuvU.uNNnnnuuuN()) {
         vVnvuVVUunuv.UuUVuuUu("§aКонфиг сброшен: модули выключены, бинды и настройки возвращены к значениям по умолчанию.");
      } else {
         vVnvuVVUunuv.UuUVuuUu("§cНе удалось сбросить конфиг.");
      }
   }

   private void UuUVuuUu(String var1, List<String> var2) {
      class_5250 var3 = class_2561.method_43470("§f" + var1 + ": ");
      int var4 = UVvNVuUvNVn.UuUVuuUu();

      for (int var5 = 0; var5 < var2.size(); var5++) {
         class_5250 var6 = class_2561.method_43470((String)var2.get(var5)).method_10862(class_2583.field_24360.method_27703(class_5251.method_27717(var4)));
         var3.method_10852(var6);
         if (var5 < var2.size() - 1) {
            var3.method_10852(class_2561.method_43470("§7 | "));
         }
      }

      if (a_.field_1724 != null) {
         a_.field_1724.method_7353(var3, false);
      } else {
         vVnvuVVUunuv.UuUVuuUu(var1 + ": " + String.join(", ", var2));
      }
   }

   private void UuUVuuUu(Runnable var1) {
      if (a_ == null) {
         var1.run();
      } else {
         a_.execute(var1);
      }
   }

   private String UuUVuuUu(Throwable var1) {
      Throwable var2 = var1;

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
