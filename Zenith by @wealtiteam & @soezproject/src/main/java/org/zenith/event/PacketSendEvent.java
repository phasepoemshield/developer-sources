package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ItemScroller;

import org.zenith.event.Event18;
import org.zenith.module.ItemScroller;
import org.zenith.core.BotFeatureRegistry;



import net.minecraft.network.packet.Packet;

public class PacketSendEvent extends Event18 {
   public final Packet<?> packet6;

   public Packet<?> ItemScroller() {
      return this.packet6;
   }

   public PacketSendEvent(Packet<?> var1) {
      this.packet6 = var1;
   }
}
