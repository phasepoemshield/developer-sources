package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ElytraFly;

import org.zenith.module.ElytraFly;
import org.zenith.core.BotFeatureRegistry;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.entity.Entity;

public class EventInjectAddEntity implements Event {
   public Entity entity;

   public Entity ElytraFly() {
      return this.entity;
   }

   public EventInjectAddEntity(Entity var1) {
      this.entity = var1;
   }
}
