package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.TriggerBot;
import org.zenith.module.WallBypass;

import org.zenith.core.UiAnimation;
import org.zenith.module.TriggerBot;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.module.WallBypass;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.util.math.Vec3d;

public class EventPosHook implements Event {
   public Vec3d TriggerBot;

   public Vec3d WallBypass() {
      return this.TriggerBot;
   }

   public void UiAnimation(Vec3d var1) {
      this.TriggerBot = var1;
   }

   public EventPosHook(Vec3d var1) {
      this.TriggerBot = var1;
   }
}
