package fun.nexisdlc.modules.impl.combat.aura.rotations;

import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.sterford.annotations.NativeCall;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@NativeCall
public class FunTimeRotation extends RotateModel {

    public static float funTimeFov = 40f;

    private static final float SNAP_TIMING = 0.9f;
    private static final long FREEZE_MS = 200L;

    private float stateYaw, statePitch;
    private long frozenUntil = 0;
    private long lastDetectedAttack = 0;
    private UUID lastTargetUuid = null;
    private boolean frozen = false;

    private float targetFovSide = 1f;
    private float currentFovSide = 1f;

    private Vec3d targetCenter = Vec3d.ZERO;
    private long nextCenterRefresh = 0;

    private Vec3d snapAimPoint = Vec3d.ZERO;
    private long nextSnapAimRefresh = 0;

    @Override
    public RotateVector update(RotateVector currentRotation, LivingEntity target) {
        if (mc.player == null || target == null) {
            lastTargetUuid = null;
            return currentRotation;
        }

        AuraModule aura = AuraModule.getInstance();
        long now = System.currentTimeMillis();
        float cd = AuraModule.getNormalizedAttackCooldown();
        float distance = mc.player.distanceTo(target);

        boolean targetChanged = lastTargetUuid == null || !lastTargetUuid.equals(target.getUuid());
        if (targetChanged) {
            lastTargetUuid = target.getUuid();
            stateYaw = currentRotation.getYaw();
            statePitch = currentRotation.getPitch();
            lastDetectedAttack = now;
            targetFovSide = ThreadLocalRandom.current().nextBoolean() ? 1f : -1f;
            currentFovSide = targetFovSide;
            targetCenter = target.getBoundingBox().getCenter();
            snapAimPoint = pickSnapAimPoint(target);
            nextCenterRefresh = now + 300L;
            nextSnapAimRefresh = now + ThreadLocalRandom.current().nextLong(80L, 151L);
        }
        this.target = target;

        if (now >= nextCenterRefresh) {
            targetCenter = target.getBoundingBox().getCenter();
            nextCenterRefresh = now + 300L;
        }

        if (now >= nextSnapAimRefresh) {
            snapAimPoint = pickSnapAimPoint(target);
            nextSnapAimRefresh = now + ThreadLocalRandom.current().nextLong(80L, 151L);
        }

        if (aura != null && aura.lastAttackTime > lastDetectedAttack) {
            lastDetectedAttack = aura.lastAttackTime;
            frozenUntil = now + FREEZE_MS;
            frozen = true;
            targetFovSide = ThreadLocalRandom.current().nextBoolean() ? 1f : -1f;
        }

        currentFovSide = MathUtil.lerp(currentFovSide, targetFovSide, 0.08f);

        if (frozen && now < frozenUntil) {
            return new RotateVector(stateYaw, statePitch);
        }
        frozen = false;

        RotateVector targetRotation;

        if (cd > SNAP_TIMING) {
            targetRotation = calcAim(snapAimPoint);
        } else {
            RotateVector centerRot = calcAim(targetCenter);
            targetRotation = new RotateVector(
                    centerRot.getYaw() - funTimeFov * currentFovSide,
                    centerRot.getPitch()
            );
        }

        float aimSpeed = getAimSpeed(currentRotation);
        float speedMult = cd < SNAP_TIMING ? 0.15f : 0.17f;

        float yawDiff = MathHelper.wrapDegrees(targetRotation.getYaw() - stateYaw);
        float pitchDiff = targetRotation.getPitch() - statePitch;

        float maxYaw = aimSpeed * speedMult;
        float maxPitch = MathHelper.clamp(aimSpeed * 0.08f * speedMult, 0.5f, 3f);

        yawDiff = MathHelper.clamp(yawDiff, -maxYaw, maxYaw);
        pitchDiff = MathHelper.clamp(pitchDiff, -maxPitch, maxPitch);

        stateYaw += yawDiff;
        statePitch += pitchDiff;
        statePitch = MathHelper.clamp(statePitch, -90f, 90f);
        stateYaw = applyGCD(stateYaw);
        statePitch = applyGCD(statePitch);

        float resultYaw = MathUtil.lerpAngle(currentRotation.getYaw(), stateYaw, getLerpSpeed());
        float resultPitch = MathUtil.lerp(currentRotation.getPitch(), statePitch, 0.33f);
        return new RotateVector(resultYaw, resultPitch);
    }

    private float getLerpSpeed() {
        return ThreadLocalRandom.current().nextFloat(0.38f, 0.57f);
    }

    private float getAimSpeed(RotateVector currentRotation) {
        return 25;
    }

    private Vec3d pickSnapAimPoint(LivingEntity target) {
        float h = target.getHeight();
        float halfW = target.getWidth() * 0.85f;
        float t = ThreadLocalRandom.current().nextFloat(0.0f, 0.6f);
        float wt = ThreadLocalRandom.current().nextFloat(-0.6f, 0.6f);
        double y = target.getY() + h * t;
        double x = target.getX() + wt * halfW;
        double z = target.getZ() + wt * halfW;
        return new Vec3d(x, y, z);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        lastTargetUuid = null;
        lastDetectedAttack = System.currentTimeMillis();
        frozen = false;
        targetCenter = Vec3d.ZERO;
        snapAimPoint = Vec3d.ZERO;
        nextCenterRefresh = 0;
        nextSnapAimRefresh = 0;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        lastTargetUuid = null;
        frozen = false;
        targetCenter = Vec3d.ZERO;
        snapAimPoint = Vec3d.ZERO;
        nextCenterRefresh = 0;
        nextSnapAimRefresh = 0;
    }
}
