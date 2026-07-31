package fun.wonderful.client.modules.impl.combat.ivanrwrot;

import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.combat.TpsSync;
import fun.wonderful.client.modules.impl.movement.Sprint;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

public class ИванРуХит
implements QClient {
    private long lastHitMs;
    private int legitSprintResetTicks;
    private boolean sprintGateActive;
    private boolean wasSprinting;
    private boolean hitTick;

    public boolean isHitTick() {
        return this.hitTick;
    }

    public boolean onMoveInput(EventMoveInput event) {
        if (this.legitSprintResetTicks <= 0) {
            return false;
        }
        event.setForward(0.0f);
        event.setStrafe(0.0f);
        if (ИванРуХит.mc.player != null) {
            ИванРуХит.mc.player.setSprinting(false);
        }
        --this.legitSprintResetTicks;
        return true;
    }

    public void updateSprintStatus(boolean var1, LivingEntity var2, boolean var3, boolean var4) {
    }


    public boolean canHit(boolean onlyCrit, boolean onlySpace, boolean isCrit, TpsSync tpsSync) {
        if (ИванРуХит.mc.player == null || ИванРуХит.mc.world == null) {
            return false;
        }
        if (!this.isAttackReady(tpsSync)) {
            return false;
        }
        if (this.shouldWaitForFall(onlyCrit, onlySpace)) {
            return false;
        }
        if (!onlyCrit) {
            return true;
        }
        if (!this.isValidAttackCondition()) {
            return true;
        }
        if (onlySpace && ИванРуХит.mc.options != null && !ИванРуХит.mc.options.jumpKey.isPressed() && ИванРуХит.mc.player.isOnGround()) {
            return true;
        }
        if (this.canUsePostCritical()) {
            return this.canCritPostFall();
        }
        return this.canVanillaCrit() && isCrit;
    }

    public boolean preHit(SprintReset sprintReset) {
        if (ИванРуХит.mc.player == null) {
            return false;
        }
        boolean sprinting = ИванРуХит.mc.player.isSprinting();
        if (Wonderful.INSTANCE != null && Wonderful.INSTANCE.serverStorage != null) {
            sprinting |= Wonderful.INSTANCE.serverStorage.isServerSprinting();
        }
        if (sprinting) {
            if (sprintReset == SprintReset.PACKET) {
                this.legitSprintResetTicks = 1;
                if (ИванРуХит.mc.player.networkHandler != null) {
                    ИванРуХит.mc.player.networkHandler.sendPacket((Packet)new ClientCommandC2SPacket((Entity)ИванРуХит.mc.player, ClientCommandC2SPacket.Mode.STOP_SPRINTING));
                }
                ИванРуХит.mc.player.setSprinting(false);
                this.wasSprinting = true;
            } else if (sprintReset == SprintReset.LEGIT) {
                this.hitTick = true;
                this.legitSprintResetTicks = 1;
                this.wasSprinting = true;
                ИванРуХит.mc.player.setSprinting(false);
            }
        }
        return true;
    }

    public void postHit() {
        this.wasSprinting = false;
        this.hitTick = false;
    }

    public void upHitCooldown() {
        this.lastHitMs = System.currentTimeMillis();
    }

    public boolean shouldCancelCrit() {
        if (ИванРуХит.mc.player == null || ИванРуХит.mc.world == null) {
            return true;
        }
        return ИванРуХит.mc.player.isSwimming() || ИванРуХит.mc.player.isGliding() || ИванРуХит.mc.player.isInLava() || this.isInCobweb() || ИванРуХит.mc.player.isClimbing() || ИванРуХит.mc.player.hasVehicle() || ИванРуХит.mc.player.getAbilities().flying || ИванРуХит.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) || ИванРуХит.mc.player.hasStatusEffect(StatusEffects.LEVITATION);
    }

    public boolean isValidFallState() {
        if (ИванРуХит.mc.player == null || ИванРуХит.mc.world == null) {
            return false;
        }
        if (ИванРуХит.mc.player.fallDistance > 0.1f && this.willLandNextTick()) {
            return false;
        }
        if (!ИванРуХит.mc.player.isOnGround() && ИванРуХит.mc.player.getVelocity().y < 0.0 && ИванРуХит.mc.player.fallDistance > 0.0f) {
            return true;
        }
        double yDiff = (double)((int)ИванРуХит.mc.player.getY()) - ИванРуХит.mc.player.getY();
        boolean sneaking = ИванРуХит.mc.options != null && ИванРуХит.mc.options.sneakKey.isPressed();
        return (yDiff == -0.01250004768371582 || yDiff == -0.1875) && !sneaking;
    }

    public void reset() {
        this.lastHitMs = 0L;
        this.legitSprintResetTicks = 0;
        this.wasSprinting = false;
        this.hitTick = false;
        this.setSprintAllowed(true);
    }

    private boolean isAttackReady(TpsSync tpsSync) {
        return this.finished(this.getSyncedDelay(450L, tpsSync)) && ИванРуХит.mc.player.getAttackCooldownProgress(this.getCooldownAdjustTicks()) > this.getAttackDelay();
    }

    private float getAttackDelay() {
        if (ИванРуХит.mc.player.getMainHandStack().getItem() instanceof AxeItem || ИванРуХит.mc.player.getMainHandStack().getItem() instanceof ShovelItem) {
            return 0.95f;
        }
        return 0.93f;
    }

    private long getSyncedDelay(long delayMs, TpsSync tpsSync) {
        return delayMs;
    }

    private float getCooldownAdjustTicks() {
        return 1.5f;
    }

    private boolean finished(long delay) {
        return System.currentTimeMillis() >= this.lastHitMs + delay;
    }

    private boolean shouldWaitForFall(boolean onlyCrit, boolean onlySpace) {
        if (!onlyCrit) {
            return false;
        }
        if (ИванРуХит.mc.player == null) {
            return false;
        }
        if (onlySpace) {
            return false;
        }
        if (this.canUsePostCritical()) {
            return false;
        }
        if (!this.isValidAttackCondition()) {
            return false;
        }
        return ИванРуХит.mc.player.isOnGround();
    }

    private boolean isValidAttackCondition() {
        if (ИванРуХит.mc.player == null) {
            return false;
        }
        return !ИванРуХит.mc.player.isTouchingWater() && !ИванРуХит.mc.player.isSubmergedInWater() && !ИванРуХит.mc.player.isInLava() && !ИванРуХит.mc.player.isClimbing() && !ИванРуХит.mc.player.hasVehicle() && !ИванРуХит.mc.player.getAbilities().flying && !ИванРуХит.mc.player.isGliding() && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.LEVITATION) && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) && !this.isInCobweb();
    }

    private boolean canUsePostCritical() {
        block6: {
            block5: {
                if (ИванРуХит.mc.player == null) {
                    return false;
                }
                if (ModuleClass.INSTANCE == null) {
                    return false;
                }
                if (ModuleClass.packetCriticals == null) break block5;
                if (ModuleClass.packetCriticals.isEnable()) break block6;
            }
            return false;
        }
        return ИванРуХит.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) || this.isInCobweb();
    }

    private boolean canCritPostFall() {
        if (ИванРуХит.mc.player == null) {
            return false;
        }
        return ИванРуХит.mc.player.getVelocity().y < 0.0 && ИванРуХит.mc.player.fallDistance > 0.0f;
    }

    private boolean canVanillaCrit() {
        if (ИванРуХит.mc.player == null) {
            return false;
        }
        return !ИванРуХит.mc.player.isOnGround() && ИванРуХит.mc.player.getVelocity().y < 0.0 && ИванРуХит.mc.player.fallDistance > 0.0f && !ИванРуХит.mc.player.isTouchingWater() && !ИванРуХит.mc.player.isSubmergedInWater() && !ИванРуХит.mc.player.isInLava() && !ИванРуХит.mc.player.isClimbing() && !ИванРуХит.mc.player.hasVehicle() && !ИванРуХит.mc.player.getAbilities().flying && !ИванРуХит.mc.player.isGliding() && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.LEVITATION) && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) && !ИванРуХит.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) && !this.isInCobweb();
    }

    private boolean willLandNextTick() {
        if (ИванРуХит.mc.player == null || ИванРуХит.mc.world == null || ИванРуХит.mc.player.isOnGround()) {
            return false;
        }
        double motionY = ИванРуХит.mc.player.getVelocity().y;
        if (motionY >= 0.0) {
            return false;
        }
        Box box = ИванРуХит.mc.player.getBoundingBox().offset(new Vec3d(0.0, motionY, 0.0));
        return ИванРуХит.mc.world.getBlockCollisions((Entity)ИванРуХит.mc.player, box).iterator().hasNext();
    }

    private boolean isInCobweb() {
        if (ИванРуХит.mc.player == null || ИванРуХит.mc.world == null) {
            return false;
        }
        for (BlockPos pos : BlockPos.iterate((int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().minX)), (int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().minY)), (int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().minZ)), (int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().maxX)), (int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().maxY)), (int)((int)Math.floor(ИванРуХит.mc.player.getBoundingBox().maxZ)))) {
            if (!ИванРуХит.mc.world.getBlockState(pos).isOf(Blocks.COBWEB)) continue;
            return true;
        }
        return false;
    }

    private void setSprintAllowed(boolean allowed) {
        if (allowed) {
            if (this.sprintGateActive) {
                Sprint.setCombatSprintAllowed(true);
                this.sprintGateActive = false;
            }
            return;
        }
        Sprint.setCombatSprintAllowed(false);
        this.sprintGateActive = true;
    }

    public static enum SprintReset {
        NONE,
        PACKET,
        LEGIT;

    }
}