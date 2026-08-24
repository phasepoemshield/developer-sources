package org.zenith.event;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import org.zenith.base.bot.client.BotClient;
import org.zenith.base.bot.world.BotPlayer;
import org.zenith.base.bot.world.BotWorld;














import com.darkmagician6.eventapi.events.Event;

public class Event49 implements Event {
   public final BotClient botClient6;
   public final BotWorld botWorld3;
   public final BotPlayer botPlayer3;

   public BotClient getBot() {
      return this.botClient6;
   }

   public BotWorld getWorld() {
      return this.botWorld3;
   }

   public BotPlayer getPlayer() {
      return this.botPlayer3;
   }

   public Event49(BotClient var1, BotWorld var2, BotPlayer var3) {
      this.botClient6 = var1;
      this.botWorld3 = var2;
      this.botPlayer3 = var3;
   }
}
