package org.zenith.utility.mixin.entity;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.CloudScope;
import org.zenith.core.CloudResult;













import com.mojang.authlib.GameProfile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({OtherClientPlayerEntity.class})
public class MixinOtherClientPlayerEntity extends AbstractClientPlayerEntity implements CloudScope {
   @Unique
   public double backUpX;
   @Unique
   public double backUpY;
   @Unique
   public double backUpZ;

   public MixinOtherClientPlayerEntity(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Unique
   @Override
   public void zenithDLC_resolve() {
      this.backUpX = this.getX();
      this.backUpY = this.getY();
      this.backUpZ = this.getZ();
      Vec3d vec3d = new Vec3d(
         ((CloudResult)this).zenithDLC_getPrevServerZ(),
         ((CloudResult)this).zenithDLC_getPrevServerY(),
         ((CloudResult)this).zenithDLC_getPrevServerZ()
      );
      Vec3d vec3d1 = new Vec3d(this.serverX, this.serverY, this.serverZ);
      if (MinecraftClient.getInstance().player.squaredDistanceTo(vec3d) > MinecraftClient.getInstance().player.squaredDistanceTo(vec3d1)) {
         this.setPosition(vec3d1.x, vec3d1.y, vec3d1.z);
      } else {
         this.setPosition(vec3d.x, vec3d.y, vec3d.z);
      }
   }

   @Unique
   @Override
   public void zenithDLC_releaseResolver() {
      if (this.backUpY != -999.0) {
         this.setPosition(this.backUpX, this.backUpY, this.backUpZ);
         this.backUpY = -999.0;
      }
   }
}
