package l;

import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class AutoAuth extends Helper242 {
   private final Setting6 password = new Setting6("Пароль", "").method2407("bee1892");

   public AutoAuth() {
      super("AutoAuth", "AutoAuth", Helper269.MISC);
      this.setup(new Helper264[]{this.password});
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state && mc.player != null && mc.world != null && var1.method3896() == Helper385.RECEIVE) {
         if (var1.method3895() instanceof GameMessageS2CPacket var2) {
            String var5 = var2.content().getString();
            String var4 = this.password.method2403();
            if ((var5.contains("Войдите") || var5.contains("/login")) && mc.player.networkHandler != null) {
               mc.player.networkHandler.sendChatCommand("login " + var4);
            }

            if ((var5.contains("Зарегистрируйтесь") || var5.contains("/reg")) && var4 != null && var4.length() >= 4 && mc.player.networkHandler != null) {
               mc.player.networkHandler.sendChatCommand("reg " + var4 + " " + var4);
            }
         }
      }
   }
}
