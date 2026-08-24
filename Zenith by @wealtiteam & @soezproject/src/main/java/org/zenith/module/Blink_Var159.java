package org.zenith.module;

import net.minecraft.network.packet.Packet;
import net.minecraft.util.math.Vec3d;

record Blink_Var159(Packet<?> packet4, Vec3d vec3d29) {

   public Packet<?> call076() {
      return this.packet4;
   }

   public Vec3d call047() {
      return this.vec3d29;
   }
}
