package org.zenith.base.bot.world;

import org.zenith.module.Bot;

import org.zenith.base.bot.net.BotPlayHandler;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;

public class BotRemotePlayer extends PlayerEntity {
   public final BotPlayHandler networkHandler;
   public Vec3d clientVelocity = Vec3d.ZERO;
   public int velocityLerpDivisor;

   public BotRemotePlayer(BotWorld var1, BotPlayHandler var2, GameProfile var3) {
      super(var1, var1.getSpawnPos(), var1.getSpawnAngle(), var3);
      this.networkHandler = var2;
      this.noClip = true;
   }

   public GameMode getListedGameMode() {
      PlayerListEntry playerlistentry = this.networkHandler.getPlayerListEntry(this.getUuid());
      return playerlistentry == null ? null : playerlistentry.getGameMode();
   }

   @Override
   public boolean isSpectator() {
      return this.getListedGameMode() == GameMode.SPECTATOR;
   }

   @Override
   public boolean isCreative() {
      return this.getListedGameMode() == GameMode.CREATIVE;
   }

   @Override
   public boolean clientDamage(DamageSource source) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.updateLimbs(false);
   }

   @Override
   public void tickMovement() {
      if (this.bodyTrackingIncrements > 0) {
         this.lerpPosAndRotation(this.bodyTrackingIncrements, this.serverX, this.serverY, this.serverZ, this.serverYaw, this.serverPitch);
         this.bodyTrackingIncrements--;
      }

      if (this.headTrackingIncrements > 0) {
         this.lerpHeadYaw(this.headTrackingIncrements, this.serverHeadYaw);
         this.headTrackingIncrements--;
      }

      if (this.velocityLerpDivisor > 0) {
         this.addVelocityInternal(
            new Vec3d(
               (this.clientVelocity.x - this.getVelocity().x) / (double)this.velocityLerpDivisor,
               (this.clientVelocity.y - this.getVelocity().y) / (double)this.velocityLerpDivisor,
               (this.clientVelocity.z - this.getVelocity().z) / (double)this.velocityLerpDivisor
            )
         );
         this.velocityLerpDivisor--;
      }

      this.prevStrideDistance = this.strideDistance;
      this.tickHandSwing();
      float f;
      if (this.isOnGround() && !this.isDead()) {
         f = (float)Math.min(0.1, this.getVelocity().horizontalLength());
      } else {
         f = 0.0F;
      }

      this.strideDistance = this.strideDistance + (f - this.strideDistance) * 0.4F;
      this.tickCramming();
   }

   @Override
   public void setVelocityClient(double x, double y, double z) {
      this.clientVelocity = new Vec3d(x, y, z);
      this.velocityLerpDivisor = this.getType().getTrackTickInterval() + 1;
   }

   @Override
   protected void updatePose() {
   }

   @Override
   public void onSpawnPacket(EntitySpawnS2CPacket packet) {
      super.onSpawnPacket(packet);
      this.resetPosition();
   }
}
