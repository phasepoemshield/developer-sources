package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class uVnUnvnUn extends UNUuvUN {
   public uVnUnvnUn() {
      super("bot", "Управление хедлесс-ботами", ".bot connect <ник> <ip[:port]> | remove | chat | control <ник> | return | list | clear");
      this.UuUVuuUu("connect", List::of);
      this.UuUVuuUu("remove", () -> nnVNNuuVUVn.C00OOC00oO().stream().map(nnVNNuuVUVn.NVnVnNnN::name).collect(Collectors.toList()));
      this.UuUVuuUu("chat", () -> nnVNNuuVUVn.UuUVuuUu.stream().map(vUNVNUnuv::UuUVuuUu).collect(Collectors.toList()));
      this.UuUVuuUu("control", () -> nnVNNuuVUVn.UuUVuuUu.stream().map(vUNVNUnuv::UuUVuuUu).collect(Collectors.toList()));
      this.UuUVuuUu("return", List::of);
      this.UuUVuuUu("list", List::of);
      this.UuUVuuUu("clear", List::of);
   }

   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length != 0 && !var1[0].equalsIgnoreCase("help")) {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "connect":
               if (var1.length < 3) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Использование: .bot connect <ник> <ip[:port] или домен>");
                  return;
               }

               OCO0OoO.UuUVuuUu(var1[1], var1[2]);
               break;
            case "remove":
               if (var1.length < 2) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Использование: .bot remove <ник>");
                  return;
               }

               nnVNNuuVUVn.NVnVnNnN var7 = nnVNNuuVUVn.UuUVuuUu(var1[1]);
               if (var7 == null) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Бот не найден: " + var1[1]);
                  return;
               }

               if (!nnVNNuuVUVn.uUnuvNvvNU(var1[1])) {
                  vVnvuVVUunuv.UuUVuuUu("§7[Bot] Профиль уже отключён: §f" + var7.name());
                  return;
               }

               vVnvuVVUunuv.UuUVuuUu("§7[Bot] §fОтключён §c" + var7.name());
               break;
            case "chat":
               if (var1.length < 3) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Использование: .bot chat <ник> <текст>");
                  return;
               }

               vUNVNUnuv var6 = nnVNNuuVUVn.VVuuUN(var1[1]);
               if (var6 == null) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Бот не найден: " + var1[1]);
                  return;
               }

               String var5 = String.join(" ", Arrays.copyOfRange(var1, 2, var1.length));
               if (!var6.UuUVuuUu(var5)) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Бот ещё не вошёл, отключён или сообщение пустое/длиннее 256 символов");
                  return;
               }

               vVnvuVVUunuv.UuUVuuUu("§7[Бот §a" + var6.UuUVuuUu() + "§7] §8→ §f" + var5);
               break;
            case "list":
               if (nnVNNuuVUVn.C00OOC00oO().isEmpty()) {
                  vVnvuVVUunuv.UuUVuuUu("§7[Bot] Ботов нет");
                  return;
               }

               vVnvuVVUunuv.UuUVuuUu(
                  "§7[Bot] Профили: §f"
                     + nnVNNuuVUVn.C00OOC00oO()
                        .stream()
                        .map(var0 -> var0.name() + " §8[" + var0.state().name().toLowerCase() + "§8]§f")
                        .collect(Collectors.joining(", "))
               );
               break;
            case "control":
               if (var1.length < 2) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Использование: .bot control <ник>");
                  return;
               }

               vUNVNUnuv var4 = nnVNNuuVUVn.VVuuUN(var1[1]);
               if (var4 == null || !var4.vuuuNvNuv()) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Бот не найден или ещё не зашёл: " + var1[1]);
                  return;
               }

               if (!nnVNNuuVUVn.UuUVuuUu(var4)) {
                  vVnvuVVUunuv.UuUVuuUu("§c[Bot] Сейчас нельзя переключить управление: проверь соединение хоста и дождись завершения смены сервера");
                  return;
               }

               vVnvuVVUunuv.UuUVuuUu("§7[Bot] Управление §a" + var1[1] + "§7. Верни себя: §f.bot return");
               break;
            case "return":
               nnVNNuuVUVn.vVvUvVVuuNvV();
               vVnvuVVUunuv.UuUVuuUu("§7[Bot] Управление возвращено хосту");
               break;
            case "clear":
               nnVNNuuVUVn.UnUNVVVNuv();
               vVnvuVVUunuv.UuUVuuUu("§7[Bot] Все боты отключены");
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§c[Bot] Неизвестная под-команда: §f" + var1[0] + " §7— см. §f.bot");
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§7[Bot] Команды:");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot connect §7<ник> <ip[:port]/домен> §8— подключить бота");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot control §7<ник> §8— вселиться в бота (управление)");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot return §8— вернуться к хосту");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot chat §7<ник> <текст> §8— написать в чат от имени бота");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot list §8— список ботов");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot remove §7<ник> §8— отключить бота");
         vVnvuVVUunuv.UuUVuuUu("  §f.bot clear §8— отключить всех");
         vVnvuVVUunuv.UuUVuuUu("§8Менеджер и модули ботов — вкладка Bots в боковой панели ClickGUI.");
      }
   }
}
