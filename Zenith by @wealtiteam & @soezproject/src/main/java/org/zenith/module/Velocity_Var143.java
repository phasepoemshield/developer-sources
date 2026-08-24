package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;


import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;

public class Velocity_Var143 {
   public final Packet<?> packet2;
   public final long long90;

   public Velocity_Var143(Packet<?> var1) {
      this.packet2 = var1;
      this.long90 = System.currentTimeMillis();
   }

   public Packet<ClientPlayPacketListener> ItemScroller() {
      return (Packet<ClientPlayPacketListener>)this.packet2;
   }

   public Packet<?> float273() {
      return this.packet2;
   }

   public long getTime() {
      return this.long90;
   }
}
