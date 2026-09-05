package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoGApple",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Автоматически есть яблочки"
)
public class AutoGApple extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Здоровье", 10.0F, 1.0F, 20.0F, 1.0F, false);

   public AutoGApple() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
   }
}
