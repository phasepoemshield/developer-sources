package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ClientUtil",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Настройки для клиента"
)
public class ClientUtil extends Module {
   public static final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Уведомления в Telegram", true);
   public static final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Звуки клиента", true);
   public static VUVnvvnNN UNnVVNvvnVvU = new VUVnvvnNN(
      "Звуки", new vvNnnUNnVvn("Модули", true), new vvNnnUNnVvn("Уведомления", true).UuUVuuUu(() -> !uVunuUNVVUUV.uUnuvNvvNU())
   );
   public static nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Громкость", 100.0F, 10.0F, 100.0F, 1.0F, false).UuUVuuUu(() -> !uVunuUNVVUUV.uUnuvNvvNU());

   public ClientUtil() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (NVNnnvnuunNv.uUnuvNvvNU() && !uvNnnnUuVu.UuUVuuUu()) {
         vVnvuVVUunuv.UuUVuuUu("§cСписок пуст для отправки сообщений. Настройте API через .tapi");
         NVNnnvnuunNv.C00OOC00oO(false);
      }
   }
}
