package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "DragonFly",
   O0000000000 = Category.Movement,
   O000000000 = "Ускоряет вас в воздухе"
)
public class DragonFly extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Скорость по X", 1.0F, 1.0F, 100.0F, 1.0F, false);
   public final NumberSetting O000000000O0 = new NumberSetting("Скорость по Y", 1.0F, 1.0F, 100.0F, 1.0F, false);

   public DragonFly() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000()) {
         if (O0000000000.player.getAbilities().flying) {
            double var2 = this.O000000000O.O0000000000() / 10.0;
            double var4 = this.O000000000O0.O0000000000() / 10.0;
            double var6;
            if (O0000000000.options.jumpKey.isPressed()) {
               var6 = var4;
            } else if (O0000000000.options.sneakKey.isPressed()) {
               var6 = -var4;
            } else {
               var6 = 0.0;
            }

            if (O0000O00O000OO.O00000000()) {
               double[] var8 = O0000O00O000OO.O00000000(var2);
               O0000000000.player.setVelocity(var8[0], var6, var8[1]);
            } else {
               O0000000000.player.setVelocity(0.0, var6, 0.0);
            }
         }
      }
   }
}
