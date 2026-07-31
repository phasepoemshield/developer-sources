package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "SeeInvisibles",
   O0000000000 = Category.Misc,
   O000000000 = "Показ игроков в невидимости"
)
public class SeeInvisibles extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Прозрачность", 0.5F, 0.3F, 1.0F, 0.1F, false);

   public SeeInvisibles() {
      this.O00000000(new Setting[]{this.O000000000O});
   }
}
