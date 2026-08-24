package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.math.Box;

@ModuleInfo(
   name = "BoatLongJump",
   category = Category.MOVEMENT,
   description = "LongJump bypass"
)
public final class BoatLongJump extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final BoatLongJump boatLongJump = new BoatLongJump();
   public boolean boolean35 = false;

   public BoatLongJump() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         if (minecraftClient3.player.getVehicle() == null) {
            Entity entity = this.call093();
            if (minecraftClient3.player.isOnGround()) {
               if (minecraftClient3.options.jumpKey.isPressed()
                  && entity != null
                  && !this.boolean35
                  && minecraftClient3.player.isSprinting()) {
                  float f = minecraftClient3.player.getYaw();
                  double d0 = minecraftClient3.player.getVelocity().x + -Math.sin(Math.toRadians((double)f)) * 0.9F;
                  double d1 = minecraftClient3.player.getVelocity().z + Math.cos(Math.toRadians((double)f)) * 0.9F;
                  minecraftClient3.player.setVelocity(d0, minecraftClient3.player.getVelocity().y, d1);
                  this.boolean35 = true;
               }
            } else {
               this.boolean35 = false;
            }
         }
      }
   }

   public Entity call093() {
      Box box = minecraftClient3.player.getBoundingBox().expand(1.0);

      for (Entity entity : minecraftClient3.world.getEntities()) {
         if (entity instanceof BoatEntity boatentity
            && !boatentity.hasPassenger(minecraftClient3.player)
            && boatentity.getBoundingBox().intersects(box)) {
            return boatentity;
         }
      }

      return null;
   }

   @Override
   public void onDisable() {
      this.boolean35 = false;
      super.onDisable();
   }
}
