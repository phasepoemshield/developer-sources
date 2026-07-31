package fun.nexisdlc.modules.impl.combat.aura;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;

public final class AuraAttackHandler {
    private final AuraModule aura;

    public AuraAttackHandler(AuraModule aura) {
        this.aura = aura;
    }

    public synchronized void tryAttackCurrentTarget(MinecraftClient mc, LivingEntity target) {
        if (mc.player == null || mc.interactionManager == null || target == null || !target.isAlive()) {
            return;
        }

        if (!isTargetInAttackRange(mc, target)) {
            return;
        }

        if (aura.canAttackNow() && aura.canAttackTargetNow()) {
            attack(mc, target);
        }
    }

    private boolean isTargetInAttackRange(MinecraftClient mc, LivingEntity target) {
        double effectiveRange = aura.getEffectiveAttackRange();
        double safeRange = effectiveRange - 0.05;

        if (mc.crosshairTarget != null && mc.crosshairTarget.getType() == HitResult.Type.ENTITY) {
            EntityHitResult entityHit = (EntityHitResult) mc.crosshairTarget;
            if (entityHit.getEntity() == target) {
                return true;
            }
        }

        Vec3d playerPos = new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());
        Vec3d targetPos = new Vec3d(target.getX(), target.getY(), target.getZ());

        double horizontalDistanceSq = targetPos.subtract(playerPos).multiply(1, 0, 1).lengthSquared();
        double verticalDistance = Math.abs(targetPos.y - playerPos.y);

        return horizontalDistanceSq <= safeRange * safeRange
                && verticalDistance <= effectiveRange + 1.0;
    }

    private void attack(MinecraftClient mc, LivingEntity target) {
        if (AuraModule.isLegacyClickMode() || aura.shouldBypassCritCheckForAttack()) {
            performAttack(mc, target);
            return;
        }

        if (aura.canDealCrit()) {
            performAttack(mc, target);
        }
    }

    private void performAttack(MinecraftClient mc, LivingEntity target) {
        if (target instanceof PlayerEntity player
                && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
            return;
        }

        if (AuraChecks.isHoldingCombatWeapon(mc) && !AuraModule.isLegacyClickMode() && AuraModule.getAttackCooldown() < 0.85f) {
            return;
        }

        if (!passesRaytrace(mc, target)) {
            return;
        }

        int slotToRestore = AuraShieldBreaker.prepareSlot(mc, target, aura.attack.getByName("Ломать щит").get());
        try {
            AuraShieldBreaker.syncSelectedSlot(mc);
            AuraShieldBreaker.releaseShieldForAttack(mc);

            mc.interactionManager.attackEntity(mc.player, target);
            mc.player.swingHand(Hand.MAIN_HAND);
        } finally {
            AuraShieldBreaker.restoreSlot(mc, slotToRestore);
        }

        aura.onAttackPerformedByHandler(System.currentTimeMillis());
    }

    private boolean passesRaytrace(MinecraftClient mc, LivingEntity target) {
        boolean needRaytraceCheck = "Всегда".equals(aura.getRaytraceMode());
        if ("Умный".equals(aura.getRaytraceMode())) {
            boolean forceFlying = target.isGliding() && aura.isRaytraceWhenFlyingEnabled();
            boolean forceSwimming = target.isSwimming() && aura.isRaytraceWhenSwimmingEnabled();
            boolean forceMoving = (!target.isSwimming() && !target.isGliding()) && aura.isRaytraceWhenMovingEnabled();
            needRaytraceCheck = forceFlying || forceSwimming || forceMoving || aura.isFirstAttack();
        }

        if (!needRaytraceCheck) {
            return true;
        }

        float raytraceYaw = aura.getRaytraceYawForAttack();
        float raytracePitch = aura.getRaytracePitchForAttack();
        double raytraceRange = aura.getEffectiveAttackRange();

        var directHit = PlayerUtils.raytraceEntity(
                raytraceRange,
                raytraceYaw,
                raytracePitch,
                entity -> entity == target && !entity.isSpectator() && entity.canHit()
        );

        Entity crosshairEntity = null;

        if (mc.crosshairTarget instanceof EntityHitResult entityHit && entityHit.getEntity() == target) {
            Entity tempEntity;

            if (entityHit.getEntity().distanceTo(mc.player) > 3.08f) {
                tempEntity = null;
            } else {
                tempEntity = entityHit.getEntity();
            }

            crosshairEntity = tempEntity;
        }

        boolean mouseOverHitsTarget = PlayerUtils.getMouseOver(
                target,
                raytraceYaw,
                raytracePitch,
                raytraceRange + 1.0,
                0.94f
        ) != null;

        boolean raytraceCheckPassed = (directHit != null && directHit.getEntity() == target)
                || crosshairEntity != null
                || mouseOverHitsTarget
                || isInsideTargetHitbox(mc, target);

        if (!raytraceCheckPassed) {
            return false;
        }

        return aura.isAttackThroughBlocksEnabled()
                || (AuraChecks.canSeeThroughWall(mc, target) && !AuraChecks.hasGrassOnRay(mc, target));
    }

    private boolean isInsideTargetHitbox(MinecraftClient mc, LivingEntity entity) {
        return mc.player != null
                && entity.getBoundingBox().expand(1.0E-4).contains(mc.player.getEyePos());
    }
}
