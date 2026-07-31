package fun.nexisdlc.modules.impl.combat.aura.rotations;

import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.client.utils.player.rotation.SensUtility;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.concurrent.ThreadLocalRandom;

public class SnapRotation extends RotateModel {

    // synced from AuraModule
    public static float snapRandomizationStrengthBeforeHit = 10f;
    public static float snapRandomizationStrengthOnHit = 10f;
    public static float snapLerpBeforeHit = 1f;
    public static float snapLerpOnHit = 1f;
    public static float snapFovSetting = 40f;
    public static float snapHitTiming = 0.7f;
    public static int snapFovAlpha = 180;
    public static boolean snapBypassEnabled = false;
    public static long snapBypassUntil = 0;
    public static boolean snapIdle = false;

    private static final float EXACT_ATTACK_COOLDOWN = 0.999f;

    public static boolean isExactAttackTiming() {
        return snapHitTiming >= 0.999f;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public RotateVector update(RotateVector current, LivingEntity target) {
        this.target = target;
        if (mc.player == null || target == null) {
            return current;
        }

        long currentTime = System.currentTimeMillis();
        float attackCooldown = AuraModule.getAttackCooldown();
        boolean exactAttackSnap = isExactAttackTiming() && attackCooldown >= EXACT_ATTACK_COOLDOWN;

        if (snapBypassEnabled && currentTime < snapBypassUntil) {
            snapIdle = false;
            return current;
        }

        Vec3d hvec = getAimPoint(target);

        float targetYaw = (float) Math.toDegrees(Math.atan2(hvec.z - mc.player.getZ(), hvec.x - mc.player.getX())) - 90f;
        float targetPitch = (float) -Math.toDegrees(Math.atan2(
                hvec.y - (mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose())),
                Math.sqrt(Math.pow(hvec.x - mc.player.getX(), 2) + Math.pow(hvec.z - mc.player.getZ(), 2))
        ));

        float yaw;
        float pitch;

        boolean instantSnap = exactAttackSnap || (!isExactAttackTiming() && attackCooldown > snapHitTiming);

        boolean rayTracePassed = PlayerUtils.getMouseOver(target, mc.player.getYaw(), mc.player.getPitch(), mc.player.distanceTo(target) + 1.0, 0.94f) != null;

        boolean check2 = mc.player.isUsingItem();
        boolean check3 = lookTarget(target);
        boolean check4 = false;

        if (!mc.player.isOnGround() && mc.player.fallDistance > 0) {
            check4 = true;
        } else if (mc.player.isOnGround() && !(mc.player.fallDistance > 0)) {
            check4 = true;
        }

        boolean shouldSnap = exactAttackSnap || (instantSnap && !rayTracePassed && !check2 && !check3 && check4);

        if (exactAttackSnap) {
            yaw = targetYaw;
            pitch = targetPitch;
        } else if (shouldSnap) {
            yaw = lerpAngle(current.getYaw(), targetYaw, snapLerpOnHit);
            pitch = lerpAngle(current.getPitch(), targetPitch, snapLerpOnHit);
        } else {
            yaw = lerpAngle(current.getYaw(), mc.player.getYaw(), snapLerpBeforeHit);
            pitch = lerpAngle(current.getPitch(), mc.player.getPitch(), snapLerpBeforeHit);
        }

        if (!shouldSnap) {
            double time = 50;
            float minRnd = MathHelper.clamp(snapRandomizationStrengthBeforeHit - 6, 0, 16) * 0.5f;
            float maxRnd = snapRandomizationStrengthBeforeHit * 0.5f;

            yaw += (float) (Math.ceil(MathHelper.lerp(ThreadLocalRandom.current().nextFloat(), minRnd, maxRnd)
                    * Math.cos(currentTime / time)));
            pitch += (float) (Math.ceil(MathHelper.lerp(ThreadLocalRandom.current().nextFloat(), minRnd * 0.6f, maxRnd * 0.6f)
                    * Math.sin(currentTime / time)));
        }

        float gcd = SensUtility.getGCDValue();
        if (Float.isFinite(gcd) && gcd > 0f) {
            yaw -= (yaw - current.getYaw()) % gcd;
            pitch -= (pitch - current.getPitch()) % gcd;
        }

        pitch = MathHelper.clamp(pitch, -90.0f, 90.0f);

        // if (rayTracePassed && Math.abs(MathHelper.wrapDegrees(yaw - mc.player.getYaw())) < 0.5f
        //         && Math.abs(pitch - mc.player.getPitch()) < 0.5f) {
        //     snapIdle = true;
        //     return current;
        // }

        snapIdle = false;
        return new RotateVector(yaw, pitch);
    }

    private Vec3d getAimPoint(LivingEntity target) {
        return target.getBoundingBox().getCenter();
    }

    private boolean lookTarget(LivingEntity target) {
        if (target == null || mc.player == null) return false;

        Vec3d playerDirection = mc.player.getRotationVec(1.0F);
        Vec3d targetDirection = new Vec3d(target.getX(), target.getY(), target.getZ()).subtract(mc.player.getEyePos()).normalize();
        double angle = Math.toDegrees(Math.acos(playerDirection.dotProduct(targetDirection)));

        return angle >= snapFovSetting;
    }

    private static float lerpAngle(float from, float to, float factor) {
        float diff = ((to - from + 180f) % 360f) - 180f;
        if (diff < -180f) diff += 360f;
        return from + diff * factor;
    }
}
