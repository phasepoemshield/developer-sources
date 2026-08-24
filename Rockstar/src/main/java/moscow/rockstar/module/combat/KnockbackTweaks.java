package moscow.rockstar.module.combat;

import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.InternalAttackEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.util.rotations.Rotation;
import moscow.rockstar.util.rotations.RotationHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Knockback Tweaks", category = ModuleCategory.COMBAT, desc = "Настройка отбрасывания при ударах")
public class KnockbackTweaks extends BaseModule {
   private final BooleanSetting fakeSprint = new BooleanSetting(this, "Фальшивый спринт");
   private boolean sendLookPacket;
   private boolean punchQueued;
   private Entity queuedEntity;
   private int attackDelayTicks;
   private boolean kbActive;
   private final EventListener<InternalAttackEvent> onAttack = event -> {
      if (!this.isEnabled() || mc.player == null || event.getEntity() == null) {
         return;
      }

      this.queueAttack(event.getEntity());
      if (!this.fakeSprint.isEnabled()) {
         this.handleTick();
      } else {
         this.sendAttackLook(event.getEntity());
      }
   };
   private final EventListener<ClientPlayerTickEvent> onTick = event -> this.handleTick();

   private void handleTick() {
      if (mc.player == null || mc.world == null) {
         return;
      }

      if (!this.fakeSprint.isEnabled()) {
         this.forceSprint();
         this.processQueuedAttack();
      }

      if (this.sendLookPacket) {
         this.sendLookPacket = false;
         Rotation rotation = this.getRotation();
         mc.player.networkHandler.sendPacket(
            new PlayerMoveC2SPacket.LookAndOnGround(rotation.getYaw(), rotation.getPitch(), mc.player.isOnGround(), mc.player.horizontalCollision)
         );
      }

      if (this.punchQueued) {
         this.punchQueued = false;
         mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.START_SPRINTING));
      }
   }

   @Override
   public void onDisable() {
      this.sendLookPacket = false;
      this.punchQueued = false;
      this.queuedEntity = null;
      this.attackDelayTicks = 0;
      this.kbActive = false;
   }

   private void sendAttackLook(Entity entity) {
      Rotation rotation = this.createAttackRotation(entity);
      mc.player.networkHandler.sendPacket(
         new PlayerMoveC2SPacket.LookAndOnGround(rotation.getYaw(), rotation.getPitch(), mc.player.isOnGround(), mc.player.horizontalCollision)
      );
      this.sendLookPacket = true;
   }

   private Rotation createAttackRotation(Entity entity) {
      Vec3d offset = entity.getPos().subtract(mc.player.getPos());
      float yaw = MathHelper.wrapDegrees((float)Math.toDegrees(Math.atan2(offset.z, offset.x)) + 90.0F);
      return new Rotation(yaw, this.getRotation().getPitch());
   }

   private Rotation getRotation() {
      RotationHandler handler = Rockstar.getInstance().getRotationHandler();
      return handler.isIdling() ? handler.getPlayerRotation() : handler.getCurrentRotation();
   }

   private void forceSprint() {
      mc.options.sprintKey.setPressed(true);
      if (!mc.player.isSprinting() && this.canSprint()) {
         mc.player.setSprinting(true);
      }
   }

   private void queueAttack(Entity entity) {
      this.queuedEntity = entity;
      this.attackDelayTicks = 1;
   }

   private void processQueuedAttack() {
      if (this.queuedEntity == null || mc.interactionManager == null) {
         return;
      }

      if (this.queuedEntity.isRemoved() || !this.canSprint()) {
         this.queuedEntity = null;
         this.attackDelayTicks = 0;
         return;
      }

      if (this.attackDelayTicks > 0) {
         this.attackDelayTicks--;
         return;
      }

      Entity target = this.queuedEntity;
      this.queuedEntity = null;
      this.kbActive = true;
      try {
         mc.interactionManager.attackEntity(mc.player, target);
         mc.player.swingHand(Hand.MAIN_HAND);
      } finally {
         this.kbActive = false;
      }
   }

   private boolean canSprint() {
      return mc.player.input.hasForwardMovement()
         && !mc.player.horizontalCollision
         && !mc.player.isSneaking()
         && !mc.player.isTouchingWater()
         && !mc.player.isSubmergedInWater()
         && (mc.player.getHungerManager().getFoodLevel() > 6 || mc.player.getAbilities().allowFlying);
   }
}
