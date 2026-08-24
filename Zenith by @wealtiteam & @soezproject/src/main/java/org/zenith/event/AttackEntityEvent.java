package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ElytraMotion;
import org.zenith.module.ElytraTarget;

import org.zenith.module.ElytraMotion;
import org.zenith.module.ElytraTarget;
import org.zenith.event.Event18;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;



import net.minecraft.entity.Entity;

public final class AttackEntityEvent extends Event18 {
   public final Entity target;
   public final AttackEntityEvent.on23 phase;

   public AttackEntityEvent(Entity var1, AttackEntityEvent.on23 var2) {
      this.target = var1;
      this.phase = var2;
   }

   public AttackEntityEvent.on23 ElytraTarget() {
      return this.phase;
   }

   public Entity ElytraMotion() {
      return this.target;
   }

   public static enum on23 {
      call185,
      call077;

      private on23() {
      }
   }
}
