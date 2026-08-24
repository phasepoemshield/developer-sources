package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.GmmModel;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.TradeGuardService;


import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.math.Vec3d;

public class ReachV3_Var159 {
   public final Packet<?> packet3;
   public final long long91;
   public final Vec3d vec3d17;
   public boolean boolean81;

   public ReachV3_Var159(Packet<?> var1, Vec3d var2) {
      this.packet3 = var1;
      this.long91 = System.currentTimeMillis();
      this.vec3d17 = var2;
      this.boolean81 = false;
   }

   public Packet<ClientPlayPacketListener> ItemScroller() {
      return (Packet<ClientPlayPacketListener>)this.packet3;
   }

   public Packet<?> float273() {
      return this.packet3;
   }

   public long getTime() {
      return this.long91;
   }

   public Vec3d var126() {
      return this.vec3d17;
   }

   public boolean random5() {
      return this.boolean81;
   }

   public void TradeGuardService(boolean var1) {
      this.boolean81 = var1;
   }
}
