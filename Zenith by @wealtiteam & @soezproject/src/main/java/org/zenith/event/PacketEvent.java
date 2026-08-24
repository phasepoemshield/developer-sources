package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.AntiInvisible;
import org.zenith.module.Arrows;
import org.zenith.module.BetterMinecraft;
import org.zenith.module.ItemScroller;

import org.zenith.module.AntiInvisible;
import org.zenith.module.Arrows;
import org.zenith.module.BetterMinecraft;
import org.zenith.event.Event18;
import org.zenith.module.ItemScroller;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;



import net.minecraft.network.packet.Packet;

public class PacketEvent extends Event18 {
   public final PacketEvent_Var159 var128Var159;
   public Packet<?> packet;

   public boolean AntiInvisible() {
      return this.BetterMinecraft() == PacketEvent_Var159.val450;
   }

   public boolean Arrows() {
      return this.BetterMinecraft() == PacketEvent_Var159.val451;
   }

   public PacketEvent_Var159 BetterMinecraft() {
      return this.var128Var159;
   }

   public Packet<?> ItemScroller() {
      return this.packet;
   }

   public void on23(Packet<?> var1) {
      this.packet = var1;
   }

   public PacketEvent(PacketEvent_Var159 var1, Packet<?> var2) {
      this.var128Var159 = var1;
      this.packet = var2;
   }
}
