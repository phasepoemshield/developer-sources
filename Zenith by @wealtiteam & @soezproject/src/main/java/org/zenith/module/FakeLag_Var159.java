package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import net.minecraft.network.packet.Packet;
import net.minecraft.util.math.Vec3d;

record FakeLag_Var159(Packet<?> packet5, Vec3d vec3d31, long long119) {

   public FakeLag_Var159(Packet<?> var1, Vec3d var2) {
      this(var1, var2, System.currentTimeMillis());
   }

   public Packet<?> call076() {
      return this.packet5;
   }

   public Vec3d call047() {
      return this.vec3d31;
   }

   public long int392() {
      return this.long119;
   }
}
