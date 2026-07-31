package l;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

class Helper220 {
   private final long timestamp;
   private final float yaw;
   private final Vec3d startPos;
   private final Entity entity;
   private final GameProfile gameProfile;
   private final EntityPose pose;
   private final OtherClientPlayerEntity fakePlayer;

   public Helper220(long var1, float var3, Vec3d var4, Entity var5, OtherClientPlayerEntity var6) {
      this.timestamp = var1;
      this.yaw = var3;
      this.startPos = var4;
      this.entity = var5;
      this.gameProfile = var5 instanceof PlayerEntity ? ((PlayerEntity)var5).getGameProfile() : null;
      this.pose = var5.getPose();
      this.fakePlayer = var6;
   }

   public long method1962() {
      return this.timestamp;
   }

   public float method1963() {
      return this.yaw;
   }

   public Vec3d method1964() {
      return this.startPos;
   }

   public Entity method1965() {
      return this.entity;
   }

   public GameProfile method1966() {
      return this.gameProfile;
   }

   public EntityPose method1967() {
      return this.pose;
   }

   public OtherClientPlayerEntity method1968() {
      return this.fakePlayer;
   }
}
