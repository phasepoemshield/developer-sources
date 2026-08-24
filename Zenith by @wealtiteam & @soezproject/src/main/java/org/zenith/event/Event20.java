package org.zenith.event;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.ItemScroller;

import org.zenith.module.ItemScroller;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.base.bot.client.BotClient;














import com.darkmagician6.eventapi.events.Event;
import net.minecraft.network.packet.Packet;

public class Event20 implements Event {
   public final Packet<?> packet;
   public final BotClient botClient5;

   public BotClient getBot() {
      return this.botClient5;
   }

   public Packet<?> ItemScroller() {
      return this.packet;
   }

   public Event20(BotClient var1, Packet<?> var2) {
      this.botClient5 = var1;
      this.packet = var2;
   }
}
