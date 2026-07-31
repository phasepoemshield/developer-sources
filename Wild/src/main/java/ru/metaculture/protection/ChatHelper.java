package ru.metaculture.protection;

import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ChatHelper",
   O000000000 = "Обновляет параметры чата",
   O0000000000 = Category.Misc
)
public class ChatHelper extends Module {
   public static final BooleanSetting O000000000O = new BooleanSetting("Антиспам чат", true);
   public static final BooleanSetting O000000000O0 = new BooleanSetting("Сохранять чат", true);
   public static final BooleanSetting O000000000O00 = new BooleanSetting("Улучшенные команды", true);
   public static final BooleanSetting O000000000O000 = new BooleanSetting("Расширенный просмотр чата ", true);

   public ChatHelper() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null) {
         if (o0000000O000OO.O00000000000() instanceof CommandExecutionC2SPacket var2) {
            String var10 = null;
            String var4 = var2.command();
            String var5 = var4.toLowerCase();
            int var6 = var5.indexOf("ah");
            int var7 = var5.indexOf(" me", var6);
            if (var7 != -1 && var6 != -1) {
               String var8 = O0000000000.player.getName().getString();
               var10 = var4.substring(0, var7) + " " + var8 + var4.substring(var7 + 3);
            }

            if (var5.startsWith("clan")) {
               O0000O000OOOO var11 = new O0000O000OOOO();
               var11.O00000000();
               String var9 = var11.O0000000000000();
               if (var5.endsWith(" all") || var5.contains(" all")) {
                  var10 = var4.replaceAll("(?i)\\ball\\b", var9);
               }
            }

            if (var10 != null) {
               o0000000O000OO.O000000000();
               O0000000000.player.networkHandler.sendPacket(new CommandExecutionC2SPacket(var10));
            }
         }
      }
   }
}
