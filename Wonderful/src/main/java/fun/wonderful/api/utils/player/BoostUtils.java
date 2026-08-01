package fun.wonderful.api.utils.player;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public final class BoostUtils {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    private static final float BASE_HORIZONTAL = 1.61f;
    private static final float BASE_VERTICAL = 1.5f;
    private static final float[] YAW_TABLE = new float[]{1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.62f, 1.62f, 1.62f, 1.63f, 1.63f, 1.64f, 1.65f, 1.65f, 1.66f, 1.67f, 1.68f, 1.69f, 1.7f, 1.71f, 1.72f, 1.73f, 1.73f, 1.75f, 1.76f, 1.78f, 1.79f, 1.81f, 1.83f, 1.85f, 1.87f, 1.89f, 1.91f, 1.93f, 1.95f, 1.98f, 2.01f, 2.03f, 2.06f, 2.09f, 2.12f, 2.16f, 2.19f, 2.23f, 2.27f, 2.31f, 2.35f, 2.31f, 2.27f, 2.23f, 2.19f, 2.16f, 2.12f, 2.09f, 2.06f, 2.03f, 2.01f, 1.98f, 1.95f, 1.93f, 1.89f, 1.87f, 1.85f, 1.83f, 1.81f, 1.79f, 1.78f, 1.76f, 1.75f, 1.73f, 1.72f, 1.71f, 1.7f, 1.69f, 1.68f, 1.67f, 1.66f, 1.65f, 1.64f, 1.63f, 1.63f, 1.63f, 1.62f, 1.62f, 1.62f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f};
    private static final float[] PITCH_TABLE = new float[]{1.61f, 1.61f, 1.61f, 1.62f, 1.62f, 1.62f, 1.63f, 1.63f, 1.64f, 1.65f, 1.65f, 1.66f, 1.67f, 1.68f, 1.69f, 1.7f, 1.71f, 1.72f, 1.73f, 1.73f, 1.75f, 1.76f, 1.78f, 1.79f, 1.81f, 1.83f, 1.85f, 1.87f, 1.89f, 1.91f, 1.93f, 1.95f, 1.98f, 2.01f, 2.03f, 2.06f, 2.09f, 2.12f, 2.16f, 2.19f, 2.23f, 2.24f, 2.21f, 2.21f, 2.21f, 2.23f, 2.23f, 2.19f, 2.16f, 2.12f, 2.09f, 2.06f, 2.03f, 2.01f, 1.98f, 1.95f, 1.93f, 1.89f, 1.87f, 1.85f, 1.83f, 1.81f, 1.79f, 1.78f, 1.76f, 1.75f, 1.73f, 1.72f, 1.71f, 1.7f, 1.69f, 1.68f, 1.67f, 1.66f, 1.65f, 1.64f, 1.63f, 1.63f, 1.63f, 1.62f, 1.62f, 1.62f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f, 1.61f};
    private static final int[] AI_YAW_VECTORS = new int[]{-45, 45, 135, -135};
    private static final int[] AI_PITCH_VECTORS = new int[]{-45, 45};

    public static Vec3d getBoost(LivingEntity entity) {
        double i2;
        float speed = BoostUtils.getRageSpeed(entity);
        Vec3d vec3d = entity.getRotationVector();
        Vec3d oldVelocity = Vec3d.fromPolar((float)entity.getPitch(), (float)entity.getYaw()).multiply((double)speed);
        float f2 = entity.getPitch() * ((float)Math.PI / 180);
        double d2 = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
        double e2 = oldVelocity.horizontalLength();
        boolean bl = entity.getVelocity().y <= 0.0;
        double g2 = bl && entity.hasStatusEffect(StatusEffects.SLOW_FALLING) ? Math.min(entity.getFinalGravity(), 0.01) : entity.getFinalGravity();
        double h2 = MathHelper.square((double)Math.cos(f2));
        oldVelocity = oldVelocity.add(0.0, g2 * (-1.0 + h2 * 0.75), 0.0);
        if (oldVelocity.y < 0.0 && d2 > 0.0) {
            i2 = oldVelocity.y * -0.1 * h2;
            oldVelocity = oldVelocity.add(vec3d.x * i2 / d2, i2, vec3d.z * i2 / d2);
        }
        if (f2 < 0.0f && d2 > 0.0) {
            i2 = e2 * (double)(-MathHelper.sin((float)f2)) * 0.04;
            oldVelocity = oldVelocity.add(-vec3d.x * i2 / d2, i2 * 3.2, -vec3d.z * i2 / d2);
        }
        if (d2 > 0.0) {
            oldVelocity = oldVelocity.add((vec3d.x / d2 * e2 - oldVelocity.x) * 0.1, 0.0, (vec3d.z / d2 * e2 - oldVelocity.z) * 0.1);
        }
        double length = oldVelocity.length();
        return new Vec3d(length, length, length).multiply(0.99, 0.98, 0.99);
    }

    private static float getRageSpeed(LivingEntity entity) {
        float yawAbs = Math.abs(MathHelper.wrapDegrees((float)entity.getYaw()));
        float yawFolded = BoostUtils.foldYaw(yawAbs);
        float pitchAbs = Math.abs(BoostUtils.clampPitch(entity.getPitch()));
        if (pitchAbs >= 70.0f && pitchAbs <= 90.0f) {
            return 1.615f;
        }
        float yawSpeed = YAW_TABLE[Math.min((int)Math.ceil(yawFolded), 90)];
        int pitchIndex = Math.min((int)Math.ceil(pitchAbs), PITCH_TABLE.length - 1);
        float pitchSpeed = PITCH_TABLE[pitchIndex];
        float speed = pitchAbs >= 75.0f ? pitchSpeed : Math.max(yawSpeed, pitchSpeed);
        return Math.max(speed, pitchAbs >= 75.0f ? 1.5f : 1.61f);
    }

    private static float foldYaw(float yawAbs) {
        float folded180 = yawAbs > 180.0f ? 360.0f - yawAbs : yawAbs;
        return folded180 > 90.0f ? 180.0f - folded180 : folded180;
    }

    private static float clampPitch(float pitch) {
        return Math.max(-90.0f, Math.min(90.0f, pitch));
    }

    public static Vec3d getBoostAntiTarget(LivingEntity entity, float speedSetting) {
        float yaw = Math.abs((entity.getYaw() - 360.0f) % 360.0f);
        float pitch = entity.getPitch();
        float absPitch = Math.abs(pitch);
        float baseSpeed = speedSetting;
        float pitchBonus = 0.0f;
        if (absPitch >= 30.0f && absPitch <= 50.0f) {
            pitchBonus = 0.15f;
        } else if (absPitch >= 25.0f && absPitch <= 55.0f) {
            pitchBonus = 0.1f;
        } else if (absPitch >= 20.0f && absPitch <= 60.0f) {
            pitchBonus = 0.05f;
        }
        float speed = baseSpeed + pitchBonus;
        float[] centers = new float[]{45.0f, 135.0f, 225.0f, 315.0f};
        float minDiff = 9999.0f;
        for (float c2 : centers) {
            float diff = Math.abs(yaw - c2);
            if (!(diff < minDiff)) continue;
            minDiff = diff;
        }
        if (minDiff < 15.0f) {
            speed += 0.1f;
        } else if (minDiff < 25.0f) {
            speed += 0.05f;
        }
        speed = Math.min(speed, 2.8f);
        return new Vec3d((double)speed, (double)speed, (double)speed);
    }

    public static Vec3d getBoostAntiTargetFast(LivingEntity entity) {
        float yaw = Math.abs((entity.getYaw() - 360.0f) % 360.0f);
        float pitch = entity.getPitch();
        float absPitch = Math.abs(pitch);
        float speedXZ = 2.5f;
        float speedY = 2.3f;
        if (absPitch >= 35.0f && absPitch <= 50.0f) {
            speedXZ = 2.7f;
            speedY = 2.5f;
        } else if (absPitch >= 30.0f && absPitch <= 55.0f) {
            speedXZ = 2.6f;
            speedY = 2.4f;
        }
        float[] centers = new float[]{45.0f, 135.0f, 225.0f, 315.0f};
        float minDiff = 9999.0f;
        for (float c2 : centers) {
            float diff = Math.abs(yaw - c2);
            if (!(diff < minDiff)) continue;
            minDiff = diff;
        }
        if (minDiff < 20.0f) {
            speedXZ += 0.15f;
        }
        return new Vec3d((double)speedXZ, (double)speedY, (double)speedXZ);
    }

    public static Vec3d getBoostAntiTargetWithAura(LivingEntity entity, float auraRotatePitch, float auraRotateYaw, float speedSetting) {
        float absPitch = Math.abs(auraRotatePitch);
        float speedXZ = speedSetting;
        float speedY = speedSetting;
        if (absPitch >= 38.0f && absPitch <= 52.0f) {
            speedXZ = Math.min(speedSetting + 0.2f, 2.7f);
            speedY = Math.min(speedSetting + 0.15f, 2.5f);
        } else if (absPitch >= 30.0f && absPitch <= 60.0f) {
            speedXZ = Math.min(speedSetting + 0.1f, 2.6f);
            speedY = Math.min(speedSetting + 0.1f, 2.4f);
        } else if (absPitch >= 25.0f && absPitch <= 65.0f) {
            speedY = speedSetting - 0.05f;
        } else {
            speedXZ = speedSetting - 0.1f;
            speedY = speedSetting - 0.15f;
        }
        return new Vec3d((double)speedXZ, (double)speedY, (double)speedXZ);
    }

    public static Vec3d getBoostslime(LivingEntity entity) {
        return BoostUtils.getBoostCustom(entity, 42.0f);
    }

    public static Vec3d getBoostbravo(LivingEntity entity) {
        return BoostUtils.getBoostCustom(entity, 39.0f);
    }

    public static Vec3d getBoostrw(LivingEntity entity) {
        float yaw = MathHelper.wrapDegrees((float)entity.getYaw());
        float pitch = entity.getPitch();
        float speed = BoostUtils.getAiBoost(pitch, yaw, false, true);
        return new Vec3d((double)speed, (double)speed, (double)speed);
    }

    private static float getAiBoost(float lastPitch, float lastYaw, boolean isBravo, boolean applyRwCap) {
        if (Math.abs(lastPitch) > 55.0f) {
            return 1.55f;
        }
        float boost = BoostUtils.adjustBoostForYaw(lastYaw, applyRwCap);
        boost = BoostUtils.adjustBoostForPitch(lastPitch, boost, applyRwCap);
        boost = Math.max(isBravo ? 1.65f : 1.6f, boost);
        float cap = applyRwCap ? 1.9f : (isBravo ? 1.9f : 2.2f);
        boost = Math.min(boost, cap);
        if (applyRwCap) {
            boost += (float)(Math.random() * 0.014 - 0.007);
        }
        return boost;
    }

    private static float adjustBoostForYaw(float lastYaw, boolean applyRwCap) {
        float minDist;
        int closestYawIndex = BoostUtils.findClosestAiVector(lastYaw, AI_YAW_VECTORS);
        if (closestYawIndex == -1) {
            return 1.6f;
        }
        float yawDistance = Math.abs(MathHelper.wrapDegrees((float)lastYaw) - (float)AI_YAW_VECTORS[closestYawIndex]);
        if (applyRwCap && yawDistance < (minDist = 3.0f)) {
            yawDistance = minDist + (float)(Math.random() * 2.0);
        }
        float maxBoost = 2.2f;
        float minBoostValue = 1.6f;
        float maxDistance = 12.0f;
        float variablespeedSmart = 0.0f;
        if (yawDistance <= maxDistance) {
            float ratio = yawDistance / maxDistance;
            variablespeedSmart = maxBoost - (maxBoost - minBoostValue) * ratio;
        }
        float variableSpeed = BoostUtils.getAiVariableSpeed(yawDistance);
        float finalSpeed = Math.max(variablespeedSmart, variableSpeed);
        return applyRwCap ? Math.min(finalSpeed, 1.8f) : finalSpeed;
    }

    private static float adjustBoostForPitch(float lastPitch, float boost, boolean applyRwCap) {
        float inc;
        int closestPitchIndex = BoostUtils.findClosestAiVector(lastPitch, AI_PITCH_VECTORS);
        if (closestPitchIndex == -1) {
            return boost;
        }
        float pitchDistance = Math.abs(Math.abs(lastPitch) - (float)Math.abs(AI_PITCH_VECTORS[closestPitchIndex]));
        float min = 30.0f;
        float f2 = inc = applyRwCap ? 0.22f : 0.4f;
        if (pitchDistance < min) {
            boost += inc * (1.0f - pitchDistance / min);
        }
        return boost;
    }

    private static float getAiVariableSpeed(float yawDistance) {
        int level;
        float[] thresholds = new float[]{4.0f, 8.0f, 11.0f, 15.0f, 21.0f, 28.0f};
        float[] speeds = new float[]{2.2f, 2.1f, 2.0f, 1.9f, 1.8f, 1.7f, 1.6f};
        for (level = 0; level < thresholds.length && yawDistance >= thresholds[level]; ++level) {
        }
        return speeds[level];
    }

    private static int findClosestAiVector(float angle, int[] vectors) {
        int minDistIndex = -1;
        float minDist = Float.MAX_VALUE;
        for (int i2 = 0; i2 < vectors.length; ++i2) {
            float dist = Math.abs(MathHelper.wrapDegrees((float)angle) - (float)vectors[i2]);
            if (!(dist < minDist)) continue;
            minDist = dist;
            minDistIndex = i2;
        }
        return minDistIndex;
    }

    public static Vec3d getBoostCustom(LivingEntity entity, float targetBps) {
        double i2;
        float maxSpeed = targetBps / 20.0f;
        float yaw = Math.abs((entity.getYaw() - 360.0f) % 360.0f);
        float pitch = entity.getPitch();
        float minSpeed = Math.min(maxSpeed * 0.7f, 1.67f);
        float[] centers = new float[]{45.0f, 135.0f, 225.0f, 315.0f};
        float minDiff = 9999.0f;
        for (float c2 : centers) {
            float diff = Math.abs(yaw - c2);
            if (!(diff < minDiff)) continue;
            minDiff = diff;
        }
        float yawFactor = 1.0f - minDiff / 45.0f;
        yawFactor = Math.max(0.0f, Math.min(1.0f, yawFactor));
        float pitchFactor = BoostUtils.getPitchFactor(pitch);
        float combinedFactor = yawFactor * pitchFactor;
        float speed = minSpeed + (maxSpeed - minSpeed) * combinedFactor;
        Vec3d vec3d = entity.getRotationVector();
        Vec3d oldVelocity = Vec3d.fromPolar((float)pitch, (float)entity.getYaw()).multiply((double)speed);
        float f2 = pitch * ((float)Math.PI / 180);
        double d2 = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
        double e2 = oldVelocity.horizontalLength();
        boolean bl = entity.getVelocity().y <= 0.0;
        double g2 = bl && entity.hasStatusEffect(StatusEffects.SLOW_FALLING) ? Math.min(entity.getFinalGravity(), 0.01) : entity.getFinalGravity();
        double h2 = MathHelper.square((double)Math.cos(f2));
        oldVelocity = oldVelocity.add(0.0, g2 * (-1.0 + h2 * 0.75), 0.0);
        if (oldVelocity.y < 0.0 && d2 > 0.0) {
            i2 = oldVelocity.y * -0.1 * h2;
            oldVelocity = oldVelocity.add(vec3d.x * i2 / d2, i2, vec3d.z * i2 / d2);
        }
        if (f2 < 0.0f && d2 > 0.0) {
            i2 = e2 * (double)(-MathHelper.sin((float)f2)) * 0.04;
            oldVelocity = oldVelocity.add(-vec3d.x * i2 / d2, i2 * 3.2, -vec3d.z * i2 / d2);
        }
        if (d2 > 0.0) {
            oldVelocity = oldVelocity.add((vec3d.x / d2 * e2 - oldVelocity.x) * 0.1, 0.0, (vec3d.z / d2 * e2 - oldVelocity.z) * 0.1);
        }
        double length = oldVelocity.length();
        return new Vec3d(length, length, length).multiply(0.99, 0.98, 0.99);
    }

    public static Vec3d getBoostFixedBps(LivingEntity entity, float targetBps) {
        float speed = targetBps / 20.0f;
        return new Vec3d((double)speed, (double)speed, (double)speed).multiply(0.99, 0.98, 0.99);
    }

    private static float getPitchFactor(float pitch) {
        float absPitch = Math.abs(pitch);
        if (absPitch <= 5.0f) {
            return 1.0f;
        }
        if (absPitch <= 15.0f) {
            return 0.95f;
        }
        if (absPitch <= 25.0f) {
            return 0.85f;
        }
        if (absPitch <= 35.0f) {
            return 0.75f;
        }
        if (absPitch <= 45.0f) {
            return 0.65f;
        }
        if (absPitch <= 55.0f) {
            return 0.55f;
        }
        if (absPitch <= 65.0f) {
            return 0.45f;
        }
        if (absPitch <= 75.0f) {
            return 0.35f;
        }
        return 0.25f;
    }

    private BoostUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}