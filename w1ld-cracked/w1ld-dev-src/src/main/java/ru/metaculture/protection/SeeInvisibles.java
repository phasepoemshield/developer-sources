package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "SeeInvisibles",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Показ игроков в невидимости"
)
public class SeeInvisibles extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Прозрачность", 0.5F, 0.3F, 1.0F, 0.1F, false);

   public SeeInvisibles() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }
}
