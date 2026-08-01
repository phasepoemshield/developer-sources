package ru.metaculture.protection;

import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoAuth",
   O000000000 = "Авто регистр/логин на серверах",
   O0000000000 = Category.Misc
)
public class AutoAuth extends Module {
   public final TextSetting O000000000O = new TextSetting("Пишите сюда ваш пороль", "");

   public AutoAuth() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (!O0000O00O0000O.O00000000() && O0000000000.world != null) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var5 = var2.content().getString();
            String var4 = this.O000000000O.O0000000000();
            if ((var5.contains("Войдите") || var5.contains("/login")) && O0000000000.player.networkHandler != null) {
               O0000000000.player.networkHandler.sendChatCommand("login " + var4);
            }

            if ((var5.contains("Зарегистрируйтесь") || var5.contains("/reg"))
               && var4 != null
               && var4.length() >= 4
               && O0000000000.player.networkHandler != null) {
               O0000000000.player.networkHandler.sendChatCommand("reg " + var4 + " " + var4);
            }
         }
      }
   }
}
