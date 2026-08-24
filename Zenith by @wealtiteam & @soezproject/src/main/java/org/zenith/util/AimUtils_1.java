package org.zenith.util;

import org.zenith.managers.EmoteManager;
import org.zenith.module.AntiInvisible;
import org.zenith.module.ItemScroller;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ClientProvider;

import org.zenith.event.EventTick;
import org.zenith.event.PacketEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.MathHelper;

class AimUtils_1 {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   AimUtils_1() {
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      if (var1.AntiInvisible()
         && ClientProvider.minecraftClient3.player != null
         && var1.ItemScroller() instanceof PlayerMoveC2SPacket playermovec2spacket
         && playermovec2spacket.changeLook) {
         if (System.currentTimeMillis() - AimUtils.long155 <= 200L) {
            playermovec2spacket.yaw = AimUtils.float289;
            playermovec2spacket.pitch = AimUtils.float290;
         } else {
            float f1 = MathHelper.wrapDegrees(playermovec2spacket.yaw - AimUtils.float289);
            float f = playermovec2spacket.pitch - AimUtils.float290;
            if (AimUtils.double61()) {
               AimUtils.float289 = playermovec2spacket.yaw;
               AimUtils.float290 = playermovec2spacket.pitch;
            } else if (AimUtils.boolean181 && AimUtils.long155 != 0L) {
               playermovec2spacket.yaw = AimUtils.float289;
               playermovec2spacket.pitch = AimUtils.float290;
            } else if (!(Math.abs(f1) > 8.0F) && !(Math.abs(f) > 8.0F)) {
               AimUtils.float289 = playermovec2spacket.yaw;
               AimUtils.float290 = playermovec2spacket.pitch;
            } else {
               AimUtils.float289 = MathHelper.wrapDegrees(
                  AimUtils.float289 + MathHelper.clamp(f1, -35.0F, 35.0F)
               );
               AimUtils.float290 = MathHelper.clamp(AimUtils.float290 + MathHelper.clamp(f, -35.0F, 35.0F), -90.0F, 90.0F);
               AimUtils.EmoteManager(playermovec2spacket.yaw, playermovec2spacket.pitch);
               playermovec2spacket.yaw = AimUtils.float289;
               playermovec2spacket.pitch = AimUtils.float290;
            }

            AimUtils.float291 = playermovec2spacket.yaw;
            AimUtils.float292 = playermovec2spacket.pitch;
            if (!AimUtils.boolean180) {
               AimUtils.boolean180 = true;
               AimUtils.float293 = AimUtils.float295 = AimUtils.float291;
               AimUtils.float294 = AimUtils.float296 = AimUtils.float292;
            }
         }
      }
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (ClientProvider.minecraftClient3.player != null) {
         boolean flag = System.currentTimeMillis() - AimUtils.long155 <= 200L;
         float f = flag
            ? AimUtils.float289
            : (
               AimUtils.boolean180
                  ? AimUtils.float291
                  : ClientProvider.minecraftClient3.player.getYaw()
            );
         float f1 = flag
            ? AimUtils.float290
            : (
               AimUtils.boolean180
                  ? AimUtils.float292
                  : ClientProvider.minecraftClient3.player.getPitch()
            );
         AimUtils.float295 = AimUtils.float293;
         AimUtils.float296 = AimUtils.float294;
         float f2 = MathHelper.wrapDegrees(f - AimUtils.float293);
         float f3 = f1 - AimUtils.float294;
         AimUtils.float293 = AimUtils.float293 + MathHelper.clamp(f2 * 0.45F, -40.0F, 40.0F);
         AimUtils.float294 = MathHelper.clamp(
            AimUtils.float294 + MathHelper.clamp(f3 * 0.45F, -40.0F, 40.0F), -90.0F, 90.0F
         );
      }
   }
}
