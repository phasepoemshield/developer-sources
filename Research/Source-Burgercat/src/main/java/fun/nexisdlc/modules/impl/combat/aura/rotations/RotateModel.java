package fun.nexisdlc.modules.impl.combat.aura.rotations;

import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.client.utils.player.rotation.SensUtility;
import fun.nexisdlc.client.utils.render.animations.EasingFunction;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class RotateModel {
    protected final MinecraftClient mc = MinecraftClient.getInstance();
    protected final Random random = new Random();
    protected LivingEntity target;
    protected final Map<String, SimpleLinearAnimation> animations = new HashMap<>();
    private final Map<String, Vec3d> randomOffsets = new HashMap<>();
    private final Map<String, Long> randomOffsetUpdateAt = new HashMap<>();

    public abstract RotateVector update(RotateVector currentRotation, LivingEntity target);

    public void onEnable() {
        animations.clear();
        randomOffsets.clear();
        randomOffsetUpdateAt.clear();
    }

    public void onDisable() {
        animations.clear();
        randomOffsets.clear();
        randomOffsetUpdateAt.clear();
    }

    protected SimpleLinearAnimation animation(String name, long duration) {
        return animation(name, Easings.SMOOTH_STEP, duration);
    }

    protected SimpleLinearAnimation animation(String name, EasingFunction easing, long duration) {
        return animations.computeIfAbsent(name, k -> new SimpleLinearAnimation(duration, easing));
    }

    protected RotateVector calcAim(Vec3d targetPoint) {
        if (mc.player == null) return new RotateVector(0, 0);

        Vec3d eyePos = mc.player.getEyePos();
        double dx = targetPoint.x - eyePos.x;
        double dy = targetPoint.y - eyePos.y;
        double dz = targetPoint.z - eyePos.z;
        double xz = Math.sqrt(dx * dx + dz * dz);

        float yaw = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        float pitch = (float) -Math.toDegrees(Math.atan2(dy, xz));
        pitch = MathHelper.clamp(pitch, -90.0f, 90.0f);

        return new RotateVector(yaw, pitch);
    }

    protected Vec3d baseTargetPoint(LivingEntity target, double heightFactor) {
        return new Vec3d(target.getX(), target.getY() + target.getHeight() * heightFactor, target.getZ());
    }

    protected Vec3d offsetTargetPoint(Vec3d point, double offsetX, double offsetY, double offsetZ) {
        return point.add(offsetX, offsetY, offsetZ);
    }

    protected Vec3d randomOffset(String key, long intervalMs, double maxOffsetX, double maxOffsetY, double maxOffsetZ) {
        long now = System.currentTimeMillis();
        long lastUpdate = randomOffsetUpdateAt.getOrDefault(key, 0L);
        if (now - lastUpdate >= intervalMs || !randomOffsets.containsKey(key)) {
            double x = ThreadLocalRandom.current().nextDouble(-maxOffsetX, maxOffsetX);
            double y = ThreadLocalRandom.current().nextDouble(-maxOffsetY, maxOffsetY);
            double z = ThreadLocalRandom.current().nextDouble(-maxOffsetZ, maxOffsetZ);
            randomOffsets.put(key, new Vec3d(x, y, z));
            randomOffsetUpdateAt.put(key, now);
        }
        return randomOffsets.get(key);
    }

    protected Vec3d withRandomOffset(Vec3d point, String key, long intervalMs, double maxOffsetX, double maxOffsetY, double maxOffsetZ) {
        return point.add(randomOffset(key, intervalMs, maxOffsetX, maxOffsetY, maxOffsetZ));
    }

    protected AimData aimTo(RotateVector headVector, Vec3d targetPoint, float maxYawSpeed, float maxPitchSpeed) {
        Vec3d playerPos = mc.player.getEyePos();
        Vec3d diff = targetPoint.subtract(playerPos);

        float yawToTarget = (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(diff.z, diff.x)) - 90.0);
        float pitchToTarget = (float) (-Math.toDegrees(Math.atan2(diff.y, Math.sqrt(diff.x * diff.x + diff.z * diff.z))));

        float yawDelta = MathHelper.wrapDegrees(yawToTarget - headVector.getYaw());
        float pitchDelta = MathHelper.wrapDegrees(pitchToTarget - headVector.getPitch());

        float finalYawSpeed = Math.min(Math.abs(yawDelta), maxYawSpeed);
        float finalPitchSpeed = Math.min(Math.abs(pitchDelta), maxPitchSpeed);

        return new AimData(yawToTarget, pitchToTarget, yawDelta, pitchDelta, finalYawSpeed, finalPitchSpeed);
    }

    protected AimData calcAim(RotateVector headVector, Vec3d targetPoint, float maxYawSpeed, float maxPitchSpeed) {
        return aimTo(headVector, targetPoint, maxYawSpeed, maxPitchSpeed);
    }

    protected AimData calcAimAtTargetRandom(RotateVector headVector, LivingEntity target, double heightFactor,
                                            String randomKey, long randomIntervalMs, double maxOffsetX, double maxOffsetY, double maxOffsetZ,
                                            float maxYawSpeed, float maxPitchSpeed) {
        Vec3d point = baseTargetPoint(target, heightFactor);
        point = withRandomOffset(point, randomKey, randomIntervalMs, maxOffsetX, maxOffsetY, maxOffsetZ);
        return aimTo(headVector, point, maxYawSpeed, maxPitchSpeed);
    }

    protected Vec3d targetPoint(LivingEntity target, double heightPercent) {
        if (target == null) return Vec3d.ZERO;

        double x = target.getX();
        double y = target.getY() + target.getHeight() * heightPercent;
        double z = target.getZ();

        return new Vec3d(x, y, z);
    }

    protected Vec3d randomTargetPoint(LivingEntity target) {
        if (target == null) return Vec3d.ZERO;

        double widthOffset = (random.nextDouble() - 0.5) * target.getWidth() * 0.8;
        double heightPercent = 0.3 + random.nextDouble() * 0.5;

        double x = target.getX() + widthOffset;
        double y = target.getY() + target.getHeight() * heightPercent;
        double z = target.getZ() + widthOffset;

        return new Vec3d(x, y, z);
    }

    protected RotateVector randomOffset(RotateVector rotation, float maxYawOffset, float maxPitchOffset) {
        float yawOffset = (random.nextFloat() - 0.5f) * maxYawOffset;
        float pitchOffset = (random.nextFloat() - 0.5f) * maxPitchOffset;

        float newYaw = rotation.getYaw() + yawOffset;
        float newPitch = MathHelper.clamp(rotation.getPitch() + pitchOffset, -90.0f, 90.0f);

        return new RotateVector(newYaw, newPitch);
    }

    protected float lerp(float start, float end, float progress) {
        return start + (end - start) * progress;
    }

    protected float normalizeYaw(float yaw) {
        yaw = yaw % 360.0f;
        if (yaw >= 180.0f) {
            yaw -= 360.0f;
        }
        if (yaw < -180.0f) {
            yaw += 360.0f;
        }
        return yaw;
    }

    protected float getYawDelta(float from, float to) {
        float delta = normalizeYaw(to - from);
        return delta;
    }

    protected float applyGCD(float angle) {
        return SensUtility.getSensitivity(angle);
    }

    protected Vec3d predictTargetPosition(LivingEntity target, float ticks) {
        if (target == null) return Vec3d.ZERO;

        net.minecraft.util.math.Vec3d velocity = target.getVelocity();
        net.minecraft.util.math.Vec3d currentPos = new net.minecraft.util.math.Vec3d(target.getX(), target.getY(), target.getZ());

        return currentPos.add(velocity.multiply(ticks));
    }

    protected static final class AimData {
        public final float yawToTarget;
        public final float pitchToTarget;
        public final float yawDelta;
        public final float pitchDelta;
        public final float finalYawSpeed;
        public final float finalPitchSpeed;

        public AimData(float yawToTarget, float pitchToTarget, float yawDelta, float pitchDelta, float finalYawSpeed, float finalPitchSpeed) {
            this.yawToTarget = yawToTarget;
            this.pitchToTarget = pitchToTarget;
            this.yawDelta = yawDelta;
            this.pitchDelta = pitchDelta;
            this.finalYawSpeed = finalYawSpeed;
            this.finalPitchSpeed = finalPitchSpeed;
        }
    }

}
