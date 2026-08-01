package zenith.zov.utility.mixin.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import zenith.ZenithInternal037;
import zenith.ZenithInternal083;

@Mixin({OtherClientPlayerEntity.class})
public class MixinOtherClientPlayerEntity extends AbstractClientPlayerEntity implements ZenithInternal037 {
   @Unique
   private double backUpX;
   @Unique
   private double backUpY;
   @Unique
   private double backUpZ;

   public MixinOtherClientPlayerEntity(ClientWorld ClientWorld, GameProfile gameprofile) {
      super(ClientWorld, gameprofile);
   }

   @Unique
   @Override
   public void zenithDLC$resolve() {
      this.backUpX = this.getX();
      this.backUpY = this.getY();
      this.backUpZ = this.getZ();
      Vec3d Vec3dx = new Vec3d(
         ((ZenithInternal083)this).zenithDLC$getPrevServerZ(),
         ((ZenithInternal083)this).zenithDLC$getPrevServerY(),
         ((ZenithInternal083)this).zenithDLC$getPrevServerZ()
      );
      Vec3d Vec3dx = new Vec3d(this.serverX, this.serverY, this.serverZ);
      if (MinecraftClient.getInstance().player.squaredDistanceTo(Vec3dx) > MinecraftClient.getInstance().player.squaredDistanceTo(Vec3dx)) {
         this.setPosition(Vec3dx.x, Vec3dx.y, Vec3dx.z);
      } else {
         this.setPosition(Vec3dx.x, Vec3dx.y, Vec3dx.z);
      }
   }

   @Unique
   @Override
   public void zenithDLC$releaseResolver() {
      if (this.backUpY != -999.0) {
         this.setPosition(this.backUpX, this.backUpY, this.backUpZ);
         this.backUpY = -999.0;
      }
   }
}
