package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class nVNVuUvVuU extends UNUuvUN {
   private final Gson UuUVuuUu = new GsonBuilder().setPrettyPrinting().create();
   private final File C00OOC00oO = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "telegram.cfg");

   public nVNVuUvVuU() {
      super("tapi", "телеграм API для отправки уведомлений в ТГ", ".tapi <token/chatid/test/clear/info/help/dir/load>");
      this.UuUVuuUu("token", List::of);
      this.UuUVuuUu("chatid", List::of);
      this.UuUVuuUu("test", List::of);
      this.UuUVuuUu("clear", List::of);
      this.UuUVuuUu("info", List::of);
      this.UuUVuuUu("help", List::of);
      this.UuUVuuUu("dir", List::of);
      this.UuUVuuUu("load", List::of);
      this.uVUuuVnNVU();
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "dir":
               this.vNUvnnVnUvu();
               break;
            case "help":
               this.VVuuUN();
               break;
            case "info":
               this.nuUnNvnuUu();
               break;
            case "load":
               this.uVUuuVnNVU();
               break;
            case "test":
               this.vVvUvVVuuNvV();
               break;
            case "clear":
               this.uNNnnnuuuN();
               break;
            case "token":
               this.uUnuvNvvNU(var1);
               break;
            case "chatid":
               this.vVvUvVVuuNvV(var1);
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда.");
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите токен бота.");
         vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.tapi token 7836941137:AAGSPTZ8lVbmXUX7zjjijRjs7iyCqgg7aXE");
      } else {
         String var2 = var1[1];
         if (!var2.matches("\\d+:[A-Za-z0-9_-]+")) {
            vVnvuVVUunuv.UuUVuuUu("§cНеверный формат токена!");
            vVnvuVVUunuv.UuUVuuUu("§7Формат: §f<числа>:<буквы и цифры>");
            vVnvuVVUunuv.UuUVuuUu("§7Пример: §f7836941137:AAGSPTZ8lVbmXUX7zjjijRjs7iyCqgg7aXE");
         } else {
            try {
               nVNVuUvVuU.NVnVnNnN var3 = this.vuuuNvNuv();
               var3.UuUVuuUu = NNnunVnUvuvU.UuUVuuUu(
                  var2, "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
               );
               this.UuUVuuUu(var3);
               this.C00OOC00oO(var3);
               vVnvuVVUunuv.UuUVuuUu("§aТокен бота успешно сохранён (зашифрован)");
               if (var3.C00OOC00oO != null && !var3.C00OOC00oO.isEmpty()) {
                  vVnvuVVUunuv.UuUVuuUu("§aИспользуйте §f.tapi test §aдля проверки");
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§eТеперь установите Chat ID: §f.tapi chatid <ID>");
               }
            } catch (Exception var4) {
               vVnvuVVUunuv.UuUVuuUu("§cОшибка шифрования токена.");
               var4.printStackTrace();
            }
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите Chat ID.");
         vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.tapi chatid 123456789");
         vVnvuVVUunuv.UuUVuuUu("§7Или для групп: §f.tapi chatid -100123456789");
      } else {
         String var2 = var1[1];
         if (!var2.matches("-?\\d+")) {
            vVnvuVVUunuv.UuUVuuUu("§cChat ID должен быть числом!");
            vVnvuVVUunuv.UuUVuuUu("§7Для личных чатов: §f123456789");
            vVnvuVVUunuv.UuUVuuUu("§7Для групп: §f-100123456789");
         } else {
            try {
               nVNVuUvVuU.NVnVnNnN var3 = this.vuuuNvNuv();
               var3.C00OOC00oO = NNnunVnUvuvU.UuUVuuUu(
                  var2, "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
               );
               this.UuUVuuUu(var3);
               this.C00OOC00oO(var3);
               vVnvuVVUunuv.UuUVuuUu("§aChat ID успешно сохранён (зашифрован)");
               if (var3.UuUVuuUu != null && !var3.UuUVuuUu.isEmpty()) {
                  vVnvuVVUunuv.UuUVuuUu("§aИспользуйте §f.tapi test §aдля проверки");
               } else {
                  vVnvuVVUunuv.UuUVuuUu("§eТеперь установите токен: §f.tapi token <токен>");
               }
            } catch (Exception var4) {
               vVnvuVVUunuv.UuUVuuUu("§cОшибка шифрования Chat ID.");
               var4.printStackTrace();
            }
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV() {
      if (!uvNnnnUuVu.UuUVuuUu()) {
         vVnvuVVUunuv.UuUVuuUu("§cСначала настройте токен и Chat ID!");
         vVnvuVVUunuv.UuUVuuUu("§7Используйте: §f.tapi token <токен>");
         vVnvuVVUunuv.UuUVuuUu("§7Используйте: §f.tapi chatid <ID>");
      } else {
         String var1 = "Тестовое сообщение от Wild Client!\nВаш Telegram API настроен корректно.";
         uvNnnnUuVu.UuUVuuUu(var1);
         vVnvuVVUunuv.UuUVuuUu("§aТестовое сообщение отправлено в Telegram!");
      }
   }

   @Compile
   private void uNNnnnuuuN() {
      try {
         nVNVuUvVuU.NVnVnNnN var1 = new nVNVuUvVuU.NVnVnNnN();
         this.UuUVuuUu(var1);
         uvNnnnUuVu.UuUVuuUu("", "");
         vVnvuVVUunuv.UuUVuuUu("§cДанные Telegram API очищены.");
      } catch (Exception var2) {
         vVnvuVVUunuv.UuUVuuUu("§cОшибка очистки данных.");
      }
   }

   @Compile
   private void nuUnNvnuUu() {
      try {
         nVNVuUvVuU.NVnVnNnN var1 = this.vuuuNvNuv();
         boolean var2 = var1.UuUVuuUu != null && !var1.UuUVuuUu.isEmpty();
         boolean var3 = var1.C00OOC00oO != null && !var1.C00OOC00oO.isEmpty();
         vVnvuVVUunuv.UuUVuuUu("§fИнформация о Telegram API:");
         vVnvuVVUunuv.UuUVuuUu(" §7Токен бота: " + (var2 ? "§aУстановлен ✓" : "§cНе установлен ✗"));
         vVnvuVVUunuv.UuUVuuUu(" §7Chat ID: " + (var3 ? "§aУстановлен ✓" : "§cНе установлен ✗"));
         vVnvuVVUunuv.UuUVuuUu(" §7Статус: " + (uvNnnnUuVu.UuUVuuUu() ? "§aГотов к работе" : "§cТребуется настройка"));
         if (var2 && var3) {
            vVnvuVVUunuv.UuUVuuUu(" §7Используйте §f.tapi test §7для проверки");
         } else {
            vVnvuVVUunuv.UuUVuuUu("");
            vVnvuVVUunuv.UuUVuuUu("§eКак настроить:");
            if (!var2) {
               vVnvuVVUunuv.UuUVuuUu("§c1. Создайте бота:");
               vVnvuVVUunuv.UuUVuuUu(" §7• Найдите §f@BotFather §7в Telegram");
               vVnvuVVUunuv.UuUVuuUu(" §7• Отправьте §f/newbot");
               vVnvuVVUunuv.UuUVuuUu(" §7• Скопируйте токен");
               vVnvuVVUunuv.UuUVuuUu(" §7• §f.tapi token <токен>");
               vVnvuVVUunuv.UuUVuuUu("");
            }

            if (!var3) {
               vVnvuVVUunuv.UuUVuuUu("§c2. Получите Chat ID:");
               vVnvuVVUunuv.UuUVuuUu(" §a▸ Способ 1 (простой):");
               vVnvuVVUunuv.UuUVuuUu("   §7• Найдите §f@userinfobot §7в Telegram");
               vVnvuVVUunuv.UuUVuuUu("   §7• Нажмите START");
               vVnvuVVUunuv.UuUVuuUu("   §7• Скопируйте число");
               vVnvuVVUunuv.UuUVuuUu("");
               vVnvuVVUunuv.UuUVuuUu(" §a▸ Способ 2 (через бота):");
               vVnvuVVUunuv.UuUVuuUu("   §7• Найдите §f@getmyid_bot");
               vVnvuVVUunuv.UuUVuuUu("   §7• Нажмите START");
               vVnvuVVUunuv.UuUVuuUu("   §7• Получите Chat ID");
               vVnvuVVUunuv.UuUVuuUu("");
               vVnvuVVUunuv.UuUVuuUu(" §a▸ Способ 3 (ручной):");
               vVnvuVVUunuv.UuUVuuUu("   §7• Напишите своему боту");
               vVnvuVVUunuv.UuUVuuUu("   §7• Откройте в браузере:");
               vVnvuVVUunuv.UuUVuuUu("   §fhttps://api.telegram.org/bot<ТОКЕН>/getUpdates");
               vVnvuVVUunuv.UuUVuuUu("   §7• Найдите §fchat.id §7в JSON");
               vVnvuVVUunuv.UuUVuuUu("");
               vVnvuVVUunuv.UuUVuuUu(" §7Затем: §f.tapi chatid <ID>");
            }
         }
      } catch (Exception var4) {
         vVnvuVVUunuv.UuUVuuUu("§cОшибка получения информации.");
         var4.printStackTrace();
      }
   }

   @Compile
   private void VVuuUN() {
      vVnvuVVUunuv.UuUVuuUu("§f§l═══════════════════════════════════════");
      vVnvuVVUunuv.UuUVuuUu("§e§l          КАК ПОЛУЧИТЬ CHAT ID?");
      vVnvuVVUunuv.UuUVuuUu("§f§l═══════════════════════════════════════");
      vVnvuVVUunuv.UuUVuuUu("");
      vVnvuVVUunuv.UuUVuuUu("§a§l▸ Способ 1 - Самый простой:");
      vVnvuVVUunuv.UuUVuuUu(" §71. Найдите бота §f@userinfobot §7в Telegram");
      vVnvuVVUunuv.UuUVuuUu(" §72. Нажмите §fSTART");
      vVnvuVVUunuv.UuUVuuUu(" §73. Бот пришлёт вам Chat ID");
      vVnvuVVUunuv.UuUVuuUu(" §74. Скопируйте число: §f.tapi chatid <число>");
      vVnvuVVUunuv.UuUVuuUu("");
      vVnvuVVUunuv.UuUVuuUu("§a§l▸ Способ 2 - Через другого бота:");
      vVnvuVVUunuv.UuUVuuUu(" §7Найдите любого из этихботов:");
      vVnvuVVUunuv.UuUVuuUu(" §f• @getmyid_bot");
      vVnvuVVUunuv.UuUVuuUu(" §f• @RawDataBot");
      vVnvuVVUunuv.UuUVuuUu(" §f• @myidbot");
      vVnvuVVUunuv.UuUVuuUu(" §7Нажмите START и получите Chat ID");
      vVnvuVVUunuv.UuUVuuUu("");
      vVnvuVVUunuv.UuUVuuUu("§a§l▸ Способ 3 - Через API:");
      vVnvuVVUunuv.UuUVuuUu(" §71. Напишите своему боту любое сообщение");
      vVnvuVVUunuv.UuUVuuUu(" §72. Откройте в браузере:");
      vVnvuVVUunuv.UuUVuuUu(" §fhttps://api.telegram.org/bot<ВАШ_ТОКЕН>/getUpdates");
      vVnvuVVUunuv.UuUVuuUu(" §73. Найдите в JSON: §f\"chat\":{\"id\":123456789}");
      vVnvuVVUunuv.UuUVuuUu(" §74. Используйте: §f.tapi chatid 123456789");
      vVnvuVVUunuv.UuUVuuUu("");
      vVnvuVVUunuv.UuUVuuUu("§c§l▸ Для отправки в ГРУППУ:");
      vVnvuVVUunuv.UuUVuuUu(" §71. Добавьте бота в группу");
      vVnvuVVUunuv.UuUVuuUu(" §72. Напишите что-то в группе");
      vVnvuVVUunuv.UuUVuuUu(" §73. Используйте getUpdates (способ 3)");
      vVnvuVVUunuv.UuUVuuUu(" §74. Chat ID группы начинается с §f-100");
      vVnvuVVUunuv.UuUVuuUu("");
      vVnvuVVUunuv.UuUVuuUu("§f§l═══════════════════════════════════════");
      vVnvuVVUunuv.UuUVuuUu("§7Подробнее: §fhttps://t.me/userinfobot");
      vVnvuVVUunuv.UuUVuuUu("§f§l═══════════════════════════════════════");
   }

   @Compile
   private void vNUvnnVnUvu() {
      try {
         File var1 = this.C00OOC00oO.getParentFile();
         if (!var1.exists()) {
            var1.mkdirs();
         }

         String var2 = System.getProperty("os.name").toLowerCase();
         if (var2.contains("win")) {
            Runtime.getRuntime().exec(new String[]{"explorer", var1.getAbsolutePath()});
         } else if (var2.contains("mac")) {
            Runtime.getRuntime().exec(new String[]{"open", var1.getAbsolutePath()});
         } else {
            Runtime.getRuntime().exec(new String[]{"xdg-open", var1.getAbsolutePath()});
         }

         vVnvuVVUunuv.UuUVuuUu("§aПапка с конфигом открыта");
      } catch (Exception var3) {
         vVnvuVVUunuv.UuUVuuUu("§cНе удалось открыть папку.");
      }
   }

   @Compile
   private void uVUuuVnNVU() {
      nVNVuUvVuU.NVnVnNnN var1 = this.vuuuNvNuv();
      this.C00OOC00oO(var1);
      if (uvNnnnUuVu.UuUVuuUu() && a_.field_1705 != null && a_.field_1705.method_1743() != null) {
         vVnvuVVUunuv.UuUVuuUu("§aTelegram API загружен успешно.");
      }
   }

   @Compile
   private nVNVuUvVuU.NVnVnNnN vuuuNvNuv() {
      if (!this.C00OOC00oO.exists()) {
         return new nVNVuUvVuU.NVnVnNnN();
      } else {
         try {
            nVNVuUvVuU.NVnVnNnN var3;
            try (BufferedReader var1 = Files.newBufferedReader(this.C00OOC00oO.toPath(), StandardCharsets.UTF_8)) {
               nVNVuUvVuU.NVnVnNnN var2 = (nVNVuUvVuU.NVnVnNnN)this.UuUVuuUu.fromJson(var1, nVNVuUvVuU.NVnVnNnN.class);
               var3 = var2 != null ? var2 : new nVNVuUvVuU.NVnVnNnN();
            }

            return var3;
         } catch (Exception var6) {
            var6.printStackTrace();
            return new nVNVuUvVuU.NVnVnNnN();
         }
      }
   }

   @Compile
   private void UuUVuuUu(nVNVuUvVuU.NVnVnNnN var1) throws Exception {
      if (!this.C00OOC00oO.getParentFile().exists()) {
         this.C00OOC00oO.getParentFile().mkdirs();
      }

      try (BufferedWriter var2 = Files.newBufferedWriter(this.C00OOC00oO.toPath(), StandardCharsets.UTF_8)) {
         this.UuUVuuUu.toJson(var1, var2);
      }
   }

   private void C00OOC00oO(nVNVuUvVuU.NVnVnNnN var1) {
      try {
         String var2 = "";
         String var3 = "";
         if (var1.UuUVuuUu != null && !var1.UuUVuuUu.isEmpty()) {
            var2 = NNnunVnUvuvU.C00OOC00oO(
               var1.UuUVuuUu,
               "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
            );
         }

         if (var1.C00OOC00oO != null && !var1.C00OOC00oO.isEmpty()) {
            var3 = NNnunVnUvuvU.C00OOC00oO(
               var1.C00OOC00oO,
               "gUhDvBzdE4xq5f4BxkPvxv70VY44WsuH1O6s2nZ2F9U1w9y1VVG1mXQcUfbJM2DDUCd8NvtM0L4O1t1nn8FwwAVYlChNncdagiv9UR8FpLXXF8iMAtlWY4mEnYtLHPB3"
            );
         }

         uvNnnnUuVu.UuUVuuUu(var2, var3);
      } catch (Exception var4) {
         vVnvuVVUunuv.UuUVuuUu("§cОшибка расшифровки данных.");
         var4.printStackTrace();
      }
   }

   static {
      Loader.initialize();
   }

   static class NVnVnNnN {
      String UuUVuuUu;
      String C00OOC00oO;
   }
}
