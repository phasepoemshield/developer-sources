package org.zenith.base.bot.client;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import net.minecraft.text.Text;

public interface BotClientEvents {
   default void onPhaseChanged(BotClient var1, BotPhase var2, BotPhase var3) {
   }

   default void onJoined(BotClient var1) {
   }

   default void onChat(BotClient var1, Text var2) {
   }

   default void onDisconnected(BotClient var1, Text var2) {
   }
}
