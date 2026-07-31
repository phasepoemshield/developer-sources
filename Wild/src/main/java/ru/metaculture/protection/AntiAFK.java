package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AntiAFK",
   O0000000000 = Category.Player,
   O000000000 = "Убирает вылет при входе в режим AFK"
)
public class AntiAFK extends Module {
   public static BooleanSetting O000000000O = new BooleanSetting("Кружится", false);
   public static BooleanSetting O000000000O0 = new BooleanSetting("Прыгать", true);
   public static BooleanSetting O000000000O00 = new BooleanSetting("Отправлять сообщения", true);

   public AntiAFK() {
      this.O00000000(new Setting[]{O000000000O00, O000000000O0, O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player.getHealth() > 0.0F) {
         if (O000000000O.O0000000000() && O0000000000.player.age % 60 == 0) {
            O0000000000.player.setYaw(O0000000000.player.getYaw() + 300.0F);
         }

         if (O000000000O0.O0000000000() && O0000000000.player.age % 40 == 0 && !O0000000000.options.jumpKey.isPressed() && O0000000000.player.isOnGround()) {
            O0000000000.player.jump();
         }

         if (O000000000O00.O0000000000() && O0000000000.player.age % 400 == 0) {
            O0000000000.player.networkHandler.sendChatCommand("ak1");
         }
      }
   }
}
