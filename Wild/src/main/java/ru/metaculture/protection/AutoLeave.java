package ru.metaculture.protection;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.text.Text;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoLeave",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматический выход"
)
public class AutoLeave extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим работы", "Хаб", "Хаб", "Меню");
   public final ModeSetting O000000000O0 = new ModeSetting("Триггеры", "Игрок рядом", "Игрок рядом", "ХП");
   public final NumberSetting O000000000O00 = new NumberSetting("Радиус игрока", 30.0F, 10.0F, 100.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("Игрок рядом"));
   public final NumberSetting O000000000O000 = new NumberSetting("Порог здоровья", 10.0F, 1.0F, 20.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("ХП"));
   private final O0000O00O0 O000000000O00O = new O0000O00O0();

   public AutoLeave() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (this.O000000000O00O.O000000000(100.0)) {
            boolean var2 = false;
            String var3 = "";
            if (this.O000000000O0.O000000000("ХП")) {
               float var4 = O0000000000.player.getHealth() + O0000000000.player.getAbsorptionAmount();
               if (var4 <= this.O000000000O000.O0000000000()) {
                  var2 = true;
                  var3 = "Мало здоровья (" + (int)var4 + " HP)";
               }
            } else if (this.O000000000O0.O000000000("Игрок рядом")) {
               for (AbstractClientPlayerEntity var5 : O0000000000.world.getPlayers()) {
                  if (var5 != O0000000000.player && !FriendCommand.O00000000(var5.getName().getString())) {
                     double var6 = O0000000000.player.distanceTo(var5);
                     if (var6 <= this.O000000000O00.O0000000000()) {
                        var2 = true;
                        var3 = var5.getName().getString();
                        break;
                     }
                  }
               }
            }

            if (var2) {
               this.O00000000(var3);
               this.O000000000O00O.O00000000();
               this.a_();
            }
         }
      }
   }

   private void O00000000(String string) {
      if (this.O000000000O.O000000000("Хаб")) {
         if (O0000000000.player.networkHandler != null) {
            O0000000000.player.networkHandler.sendChatMessage("/hub");
            if (ClientUtil.O000000000O.O0000000000()) {
               O0000000OO0O00.O00000000("[AutoLeave] Был замечен игрок, его ник - " + string);
            }
         }
      } else if (this.O000000000O.O000000000("Меню") && O0000000000.getNetworkHandler() != null && O0000000000.getNetworkHandler().getConnection() != null) {
         String var2 = string;
         if (this.O000000000O0.O000000000("Игрок рядом")) {
            var2 = "Был замечен игрок, его ник - " + string;
         }

         O0000000000.getNetworkHandler().getConnection().disconnect(Text.of(var2));
      }
   }
}
