package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "LockSlots",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Блокирует выкидывание выбранных слотов хотбара"
)
public class LockSlots extends Module {
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Слоты: ",
      new vvNnnUNnVvn("1", false),
      new vvNnnUNnVvn("2", false),
      new vvNnnUNnVvn("3", false),
      new vvNnnUNnVvn("4", false),
      new vvNnnUNnVvn("5", false),
      new vvNnnUNnVvn("6", false),
      new vvNnnUNnVvn("7", false),
      new vvNnnUNnVvn("8", false),
      new vvNnnUNnVvn("9", false)
   );
   private final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Работать только в КД", false);

   public LockSlots() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   public boolean UuUVuuUu(int var1) {
      if (var1 < 0 || var1 > 8) {
         return false;
      } else {
         return !this.UuuNnUvUuv() ? false : this.NVNnnvnuunNv.UuUVuuUu(var1);
      }
   }

   private boolean UuuNnUvUuv() {
      return !this.uVunuUNVVUUV.uUnuvNvvNU() || vnvuUUVun.C00OOC00oO();
   }
}
