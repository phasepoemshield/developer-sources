package moscow.rockstar.util.rotations.modes;

import moscow.rockstar.module.combat.Aura;
import moscow.rockstar.util.rotations.MoveCorrection;
import moscow.rockstar.util.rotations.Rotation;
import moscow.rockstar.util.rotations.RotationHandler;
import moscow.rockstar.util.rotations.RotationPriority;
import net.minecraft.entity.LivingEntity;

public final class OneTickRotationMode implements AuraRotationMode {
   private Rotation rotation = Rotation.ZERO;
   private int targetId = -1;
   private boolean ready;
   private boolean yawNudge;

   @Override
   public void rotate(Aura aura, RotationHandler handler, LivingEntity target, MoveCorrection moveCorrection) {
      if (target == null || target.isDead()) {
         this.reset();
         return;
      }

      if (!this.ready || this.targetId != target.getId() || !this.canUsePreparedRotation(aura, target)) {
         this.prepare(aura, target);
      } else {
         AuraRotationSupport.sendRotationPackets(this.rotation);
      }

      this.nudgeClientYaw();
      handler.rotate(this.rotation, moveCorrection, 180.0F, 180.0F, 180.0F, RotationPriority.TO_TARGET);
   }

   private void prepare(Aura aura, LivingEntity target) {
      this.rotation = AuraRotationSupport.rotationToTarget(aura, target);
      this.targetId = target.getId();
      this.ready = true;
      AuraRotationSupport.sendRotationPackets(this.rotation);
   }

   private boolean canUsePreparedRotation(Aura aura, LivingEntity target) {
      if (!this.ready) {
         return false;
      }

      return AuraRotationSupport.canTrace(aura, target, this.rotation, !aura.isNoHitInvEnabled()) || !aura.isWallsEnabled();
   }

   private void nudgeClientYaw() {
      if (mc.player == null) {
         return;
      }

      this.yawNudge = !this.yawNudge;
      mc.player.setYaw(mc.player.getYaw() + (this.yawNudge ? 0.1F : -0.1F));
   }

   @Override
   public void reset() {
      this.ready = false;
      this.targetId = -1;
      this.rotation = Rotation.ZERO;
   }
}
