package ru.metaculture.protection;

import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class vnVUUVVVUUNU extends UNUuvUN {
   public vnVUUVVVUUNU() {
      super("autobuy", "Управление AutoBuy", ".autobuy <ignore/unignore/list/clear> [name]");
      this.UuUVuuUu("ignore", this::VVuuUN);
      this.UuUVuuUu("add", this::VVuuUN);
      this.UuUVuuUu("unignore", AutoBuy::nUUVuvU);
      this.UuUVuuUu("remove", AutoBuy::nUUVuvU);
      this.UuUVuuUu("list", List::of);
      this.UuUVuuUu("clear", List::of);
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         this.nuUnNvnuUu();
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "add":
            case "ignore":
               this.uUnuvNvvNU(var1);
               break;
            case "del":
            case "remove":
            case "unignore":
               this.vVvUvVVuuNvV(var1);
               break;
            case "list":
               this.vVvUvVVuuNvV();
               break;
            case "clear":
               this.uNNnnnuuuN();
               break;
            default:
               this.nuUnNvnuUu();
         }
      }
   }

   private void uUnuvNvvNU(String[] var1) {
      String var2 = this.uNNnnnuuuN(var1);
      if (var2 == null || var2.isBlank()) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите ник игрока: §f.autobuy ignore Nick");
      } else if (AutoBuy.vVvUvVVuuNvV(var2)) {
         vVnvuVVUunuv.UuUVuuUu("§e[AutoBuy] Игрок уже в ignore: §f" + var2);
      } else if (AutoBuy.C00OOC00oO(var2)) {
         this.vNUvnnVnUvu();
         vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Игрок добавлен в ignore: §f" + var2);
      } else {
         vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] Некорректный ник.");
      }
   }

   private void vVvUvVVuuNvV(String[] var1) {
      String var2 = this.uNNnnnuuuN(var1);
      if (var2 != null && !var2.isBlank()) {
         if (AutoBuy.uUnuvNvvNU(var2)) {
            this.vNUvnnVnUvu();
            vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Игрок удален из ignore: §f" + var2);
         } else {
            vVnvuVVUunuv.UuUVuuUu("§e[AutoBuy] Игрок не найден в ignore: §f" + var2);
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите ник игрока: §f.autobuy unignore Nick");
      }
   }

   private void vVvUvVVuuNvV() {
      List var1 = AutoBuy.nUUVuvU();
      if (var1.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7[AutoBuy] Ignore-список продавцов пуст.");
      } else {
         vVnvuVVUunuv.UuUVuuUu("§f[AutoBuy] Ignore-продавцы (§7" + var1.size() + "§f): §7" + String.join(", ", var1));
      }
   }

   private void uNNnnnuuuN() {
      if (AutoBuy.nUUVuvU().isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7[AutoBuy] Ignore-список продавцов уже пуст.");
      } else {
         AutoBuy.UuuNnUvUuv();
         this.vNUvnnVnUvu();
         vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Ignore-список продавцов очищен.");
      }
   }

   private void nuUnNvnuUu() {
      vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.autobuy ignore QWEERZIK");
   }

   private String uNNnnnuuuN(String[] var1) {
      if (var1.length < 2) {
         return null;
      } else if ("+".equals(var1[1])) {
         return var1.length >= 3 ? var1[2] : null;
      } else {
         return var1[1];
      }
   }

   private List<String> VVuuUN() {
      return a_.method_1562() == null
         ? List.of()
         : a_.method_1562().method_2880().stream().map(var0 -> var0.method_2966().getName()).filter(var0 -> var0 != null && !var0.isBlank()).toList();
   }

   private void vNUvnnVnUvu() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   static {
      Loader.initialize();
   }
}
