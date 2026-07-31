package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoGApple",
   O0000000000 = Category.Combat,
   O000000000 = "Автоматически есть яблочки"
)
public class AutoGApple extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Здоровье", 10.0F, 1.0F, 20.0F, 1.0F, false);

   public AutoGApple() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
   }
}
