package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AntiAFK",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Убирает вылет при входе в режим AFK"
)
public class AntiAFK extends Module {
   public static vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Кружится", false);
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Прыгать", true);
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Отправлять сообщения", true);

   public AntiAFK() {
      this.UuUVuuUu(new nvUuvVvuuN[]{UNnVVNvvnVvU, uVunuUNVVUUV, NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724.method_6032() > 0.0F) {
         if (NVNnnvnuunNv.uUnuvNvvNU() && uUnuvNvvNU.field_1724.field_6012 % 60 == 0) {
            uUnuvNvvNU.field_1724.method_36456(uUnuvNvvNU.field_1724.method_36454() + 300.0F);
         }

         if (uVunuUNVVUUV.uUnuvNvvNU()
            && uUnuvNvvNU.field_1724.field_6012 % 40 == 0
            && !uUnuvNvvNU.field_1690.field_1903.method_1434()
            && uUnuvNvvNU.field_1724.method_24828()) {
            uUnuvNvvNU.field_1724.method_6043();
         }

         if (UNnVVNvvnVvU.uUnuvNvvNU() && uUnuvNvvNU.field_1724.field_6012 % 400 == 0) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("ak1");
         }
      }
   }
}
