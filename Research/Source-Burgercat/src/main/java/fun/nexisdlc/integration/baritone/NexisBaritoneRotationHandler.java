package fun.nexisdlc.integration.baritone;

import fun.nexisdlc.client.utils.player.rotation.SensUtility;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import net.minecraft.util.math.MathHelper;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Обработчик ротаций Baritone -> RotationTask.
 * Здесь находится общий слой Baritone-randomize, чтобы LookBehavior не трогал mc.player yaw/pitch напрямую.
 */
public final class NexisBaritoneRotationHandler {
    private static final int DEFAULT_BARITONE_ROTATION_PRIORITY = 40;
    private static final float BASE_YAW_JITTER_RANGE = 2.35f;
    private static final float BASE_PITCH_JITTER_RANGE = 1.15f;
    private static final float MAX_YAW_JITTER_RANGE = 4.5f;
    private static final float MAX_PITCH_JITTER_RANGE = 2.4f;
    private static final float JITTER_BLEND = 0.68f;
    private static final long MIN_JITTER_INTERVAL_MS = 90L;
    private static final long MAX_JITTER_INTERVAL_MS = 170L;

    private static long nextJitterAtMs;
    private static float jitterYaw;
    private static float jitterPitch;
    private static float targetJitterYaw;
    private static float targetJitterPitch;

    private NexisBaritoneRotationHandler() {
    }

    /**
     * Предварительная обработка целевой ротации Baritone: sanitize + GCD-aware jitter.
     */
    public static float[] prepareTargetRotation(float targetYaw, float targetPitch) {
        if (!Float.isFinite(targetYaw) || !Float.isFinite(targetPitch)) {
            return null;
        }

        long now = System.currentTimeMillis();
        float yaw = MathHelper.wrapDegrees(targetYaw);
        float pitch = MathHelper.clamp(targetPitch, -90.0f, 90.0f);
        updateJitter(now);

        return new float[]{
                MathHelper.wrapDegrees(yaw + jitterYaw),
                MathHelper.clamp(pitch + jitterPitch, -90.0f, 90.0f)
        };
    }

    /**
     * Финальная обработка ротации после наведения Baritone.
     */
    public static float[] finishRotation(float targetYaw, float targetPitch, float aimedYaw, float aimedPitch) {
        if (!Float.isFinite(aimedYaw) || !Float.isFinite(aimedPitch)) {
            return prepareTargetRotation(targetYaw, targetPitch);
        }
        return prepareTargetRotation(aimedYaw, aimedPitch);
    }

    /**
     * Применяет ротацию к RotationTask с приоритетом по умолчанию (40).
     */
    public static void applyRotation(float yaw, float pitch) {
        applyRotation(yaw, pitch, DEFAULT_BARITONE_ROTATION_PRIORITY);
    }

    /**
     * Применяет ротацию к RotationTask с указанным приоритетом.
     */
    public static void applyRotation(float yaw, float pitch, int priority) {
        float[] prepared = prepareTargetRotation(yaw, pitch);
        if (prepared == null) {
            return;
        }
        RotationTask.setTargetRotation(
                prepared[0],
                prepared[1],
                priority
        );
    }

    /**
     * Возвращает текущую визуальную ротацию, если RotationTask активен.
     */
    public static Optional<float[]> currentRotation() {
        if (!RotationTask.isRotating()) {
            return Optional.empty();
        }
        return Optional.of(new float[]{RotationTask.visualHeadYaw, RotationTask.visualHeadPitch});
    }

    /**
     * Сброс внутреннего состояния.
     */
    public static void reset() {
        nextJitterAtMs = 0L;
        jitterYaw = 0.0f;
        jitterPitch = 0.0f;
        targetJitterYaw = 0.0f;
        targetJitterPitch = 0.0f;
    }

    private static void updateJitter(long now) {
        float gcd = SensUtility.getGCDValue();
        if (!Float.isFinite(gcd) || gcd <= 0.0f) {
            gcd = 0.15f;
        }

        float yawRange = Math.min(MAX_YAW_JITTER_RANGE, Math.max(BASE_YAW_JITTER_RANGE, gcd * 2.15f));
        float pitchRange = Math.min(MAX_PITCH_JITTER_RANGE, Math.max(BASE_PITCH_JITTER_RANGE, gcd * 1.35f));

        if (now >= nextJitterAtMs) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            targetJitterYaw = randomOffset(random, yawRange, gcd);
            targetJitterPitch = randomOffset(random, pitchRange, Math.min(gcd, pitchRange));
            nextJitterAtMs = now + random.nextLong(MIN_JITTER_INTERVAL_MS, MAX_JITTER_INTERVAL_MS + 1L);
        }

        jitterYaw = quantizeToGcd(jitterYaw + (targetJitterYaw - jitterYaw) * JITTER_BLEND, gcd);
        jitterPitch = quantizeToGcd(jitterPitch + (targetJitterPitch - jitterPitch) * JITTER_BLEND, gcd);
    }

    private static float randomOffset(ThreadLocalRandom random, float range, float gcd) {
        float minVisible = Math.min(range, Math.max(0.35f, gcd));
        float value = (float) random.nextDouble(minVisible, range);
        if (random.nextBoolean()) {
            value = -value;
        }
        return quantizeToGcd(value, gcd);
    }

    private static float quantizeToGcd(float value, float gcd) {
        if (!Float.isFinite(value)) {
            return 0.0f;
        }
        if (!Float.isFinite(gcd) || gcd <= 0.0f) {
            return value;
        }

        float quantized = Math.round(value / gcd) * gcd;
        if (quantized == 0.0f && Math.abs(value) >= 0.01f) {
            quantized = Math.copySign(gcd, value);
        }
        return quantized;
    }

    // ── Утилиты для внешнего кода (оставлены для совместимости) ──

    public static float lerpAngle(float from, float to, float factor) {
        return from + wrapDegrees(to - from) * clamp01(factor);
    }

    public static float wrapDegrees(float degrees) {
        float wrapped = degrees % 360.0f;
        if (wrapped >= 180.0f) {
            wrapped -= 360.0f;
        }
        if (wrapped < -180.0f) {
            wrapped += 360.0f;
        }
        return wrapped;
    }

    public static float clamp01(float value) {
        if (value < 0.0f) return 0.0f;
        if (value > 1.0f) return 1.0f;
        return value;
    }
}
