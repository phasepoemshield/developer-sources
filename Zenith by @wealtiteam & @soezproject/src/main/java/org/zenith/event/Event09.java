package org.zenith.event;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import org.zenith.base.bot.client.BotClient;
import org.zenith.base.bot.world.BotPlayer;
import org.zenith.base.bot.world.BotWorld;














import com.darkmagician6.eventapi.events.Event;

public class Event09 implements Event {
   public final BotClient botClient2;
   public final BotWorld botWorld;
   public final BotPlayer botPlayer;

   public BotClient getBot() {
      return this.botClient2;
   }

   public BotWorld getWorld() {
      return this.botWorld;
   }

   public BotPlayer getPlayer() {
      return this.botPlayer;
   }

   public Event09(BotClient var1, BotWorld var2, BotPlayer var3) {
      this.botClient2 = var1;
      this.botWorld = var2;
      this.botPlayer = var3;
   }
}
