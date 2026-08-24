package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ItemScroller;

import org.zenith.event.Event18;
import org.zenith.module.ItemScroller;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;



import net.minecraft.network.packet.Packet;

public class PacketReceiveEvent extends Event18 {
   public Packet<?> packet;

   public Packet<?> ItemScroller() {
      return this.packet;
   }

   public void on23(Packet<?> var1) {
      this.packet = var1;
   }

   public PacketReceiveEvent(Packet<?> var1) {
      this.packet = var1;
   }
}
