package org.zenith.module;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;

record Velocity_Var159(EntityVelocityUpdateS2CPacket entityVelocityUpdateS2CPacket, long long89) {

   public EntityVelocityUpdateS2CPacket call063() {
      return this.entityVelocityUpdateS2CPacket;
   }

   public long int392() {
      return this.long89;
   }
}
