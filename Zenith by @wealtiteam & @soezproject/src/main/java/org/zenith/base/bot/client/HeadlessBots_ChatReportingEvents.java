package org.zenith.base.bot.client;

import org.zenith.module.Bot;
import org.zenith.ZenithClient;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;















import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

final class HeadlessBots_ChatReportingEvents implements BotClientEvents {
   public HeadlessBots_ChatReportingEvents() {
   }

   @Override
   public void onPhaseChanged(BotClient var1, BotPhase var2, BotPhase var3) {
      info("[\u0431\u043e\u0442 " + var1.getName() + "] \u0444\u0430\u0437\u0430: " + var3);
   }

   @Override
   public void onJoined(BotClient var1) {
      info("[\u0431\u043e\u0442 " + var1.getName() + "] \u0437\u0430\u0448\u0451\u043b \u0432 \u043c\u0438\u0440");
   }

   @Override
   public void onDisconnected(BotClient var1, Text var2) {
      HeadlessBots.BOTS.remove(var1.getName().toLowerCase(Locale.ROOT), var1);
      info("[\u0431\u043e\u0442 " + var1.getName() + "] \u043e\u0442\u043a\u043b\u044e\u0447\u0451\u043d: " + var2.getString());
   }

   public static void info(String var0) {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      if (minecraftclient != null) {
         minecraftclient.execute(() -> StyledTextBuilder.on23(TextAccent.call002, var0));
      }
   }
}
