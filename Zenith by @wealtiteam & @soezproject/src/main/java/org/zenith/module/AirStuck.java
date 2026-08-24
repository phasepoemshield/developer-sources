package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventHookTickEvent;
import org.zenith.event.PacketEvent;
import org.zenith.event.PlayerMoveEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "AirStuck",
   description = "",
   category = Category.MOVEMENT
)
public final class AirStuck extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AirStuck airStuck = new AirStuck();
   public Vec3d vec3d = Vec3d.ZERO;

   public AirStuck() {
   }

   @EventTarget
   public void on23(PlayerMoveEvent var1) {
      var1.on23(Vec3d.ZERO);
   }

   @EventTarget
   public void on23(EventHookTickEvent var1) {
      if (minecraftClient3.player != null) {
         minecraftClient3.player.setVelocity(Vec3d.ZERO);
         minecraftClient3.player.setNoGravity(true);
      }
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      if (minecraftClient3.player != null) {
         if (var1.ItemScroller() instanceof PlayerMoveC2SPacket) {
            var1.setCancelled(true);
         }
      }
   }

   @Override
   public void onEnable() {
      super.onEnable();
      if (minecraftClient3.player != null) {
         this.vec3d = minecraftClient3.player.getVelocity();
         minecraftClient3.player.setNoGravity(true);
      }
   }

   @Override
   public void onDisable() {
      super.onDisable();
      if (minecraftClient3.player != null) {
         if (!minecraftClient3.player.isOnGround() && this.vec3d != null) {
            minecraftClient3.player.setVelocity(this.vec3d);
         }

         minecraftClient3.player.setNoGravity(false);
      }
   }
}
