package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "NoWeb",
   O000000000 = "Убирает замедление в паутине",
   O0000000000 = Category.Movement
)
public class NoWeb extends Module {
   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O00O0.O00000000() && O0000O00O00O0.O000000000()) {
         double[] var2 = O0000O00O000OO.O00000000((double)O0000O000OOOOO.O0000000000(0.62F, 0.64F));
         O0000000000.player
            .setVelocity(var2[0], O0000000000.options.jumpKey.isPressed() ? 1.2 : (O0000000000.options.sneakKey.isPressed() ? -2.0 : 0.0), var2[1]);
      }
   }
}
