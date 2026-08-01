package zenith.zov.client.screens.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.OtherClientPlayerEntity;

public class ImplOtherClientPlayerEntity extends OtherClientPlayerEntity {
   public ImplOtherClientPlayerEntity(ClientWorld ClientWorld, GameProfile gameprofile) {
      super(ClientWorld, gameprofile);
   }

   public boolean isAttackable() {
      return false;
   }

   public boolean canHit() {
      return false;
   }

   public boolean isPushable() {
      return false;
   }

   public void pushAwayFrom(Entity Entity) {
   }

   protected void pushAway(Entity Entity) {
   }

   public boolean canBeHitByProjectile() {
      return false;
   }
}
