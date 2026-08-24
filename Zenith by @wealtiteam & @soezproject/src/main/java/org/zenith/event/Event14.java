package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.NoWeb;
import org.zenith.module.ShulkerJump;
import org.zenith.module.Speed;

import org.zenith.module.NoWeb;
import org.zenith.module.ShulkerJump;
import org.zenith.module.Speed;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.util.math.Vec3d;

public class Event14 implements Event {
   public final float speed;
   public final Vec3d vec3d8;

   public float NoWeb() {
      return this.speed;
   }

   public Vec3d ShulkerJump() {
      return this.vec3d8;
   }

   public Event14(float var1, Vec3d var2) {
      this.speed = var1;
      this.vec3d8 = var2;
   }
}
