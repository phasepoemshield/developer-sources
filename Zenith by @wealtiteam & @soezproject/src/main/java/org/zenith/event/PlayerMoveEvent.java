package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.NoPush;

import org.zenith.event.Event18;
import org.zenith.module.NoPush;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;



import net.minecraft.util.math.Vec3d;

public class PlayerMoveEvent extends Event18 {
   public Vec3d vec3d40;

   public PlayerMoveEvent(Vec3d var1) {
      this.vec3d40 = var1;
   }

   public Vec3d NoPush() {
      return this.vec3d40;
   }

   public void on23(Vec3d var1) {
      this.vec3d40 = var1;
   }
}
