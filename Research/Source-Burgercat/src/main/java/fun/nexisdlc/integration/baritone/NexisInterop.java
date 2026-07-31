package fun.nexisdlc.integration.baritone;

import fun.nexisdlc.client.utils.player.rotation.RotationTask;

import java.util.Optional;

/**
 * Мост между Baritone и Nexis ротационной системой.
 *
 * ВСЯ ротация Baritone идёт СТРОГО через RotationTask.
 * Оригинальные вызовы Baritone setYaw/setPitch отменяются в LookBehaviorMixin,
 * ротация перехватывается и проходит через RotationTask с Baritone-randomize.
 *
 * API сохранён совместимым для удобства миграции.
 */
public final class NexisInterop {

    private static final int DEFAULT_BARITONE_ROTATION_PRIORITY = 40;

    private NexisInterop() {
    }

    /**
     * Предварительная обработка целевой ротации Baritone.
     */
    public static float[] prepareTargetRotation(float targetYaw, float targetPitch) {
        float[] sanitized = sanitize(targetYaw, targetPitch);
        if (sanitized == null) {
            return sanitized;
        }
        return NexisBaritoneRotationHandler.prepareTargetRotation(sanitized[0], sanitized[1]);
    }

    /**
     * Финальная обработка ротации после наведения Baritone.
     */
    public static float[] finishRotation(float targetYaw, float targetPitch,
                                          float aimedYaw, float aimedPitch) {
        float[] sanitizedAimed = sanitize(aimedYaw, aimedPitch);
        if (sanitizedAimed == null) {
            return sanitize(targetYaw, targetPitch);
        }
        return NexisBaritoneRotationHandler.finishRotation(
                targetYaw, targetPitch, sanitizedAimed[0], sanitizedAimed[1]);
    }

    /**
     * Применяет ротацию к RotationTask.
     */
    public static void applyRotation(float yaw, float pitch) {
        float[] sanitized = sanitize(yaw, pitch);
        if (sanitized == null) {
            return;
        }
        NexisBaritoneRotationHandler.applyRotation(sanitized[0], sanitized[1]);
    }

    /**
     * Установка ротации Baritone в RotationTask через общий randomized handler.
     */
    public static void applyRotationDirect(float yaw, float pitch) {
        applyRotationDirect(yaw, pitch, DEFAULT_BARITONE_ROTATION_PRIORITY);
    }

    /**
     * Установка ротации Baritone в RotationTask с указанным приоритетом.
     */
    public static void applyRotationDirect(float yaw, float pitch, int priority) {
        NexisBaritoneRotationHandler.applyRotation(yaw, pitch, priority);
    }

    /**
     * Возвращает текущую визуальную ротацию.
     */
    public static Optional<float[]> currentRotation() {
        return NexisBaritoneRotationHandler.currentRotation();
    }

    /**
     * Сброс обработчика ротаций.
     */
    public static void resetRotationHandler() {
        NexisBaritoneRotationHandler.reset();
    }

    /**
     * Проверяет, активна ли ротация Baritone.
     */
    public static boolean isRotating() {
        return RotationTask.isRotating();
    }

    private static float[] sanitize(float yaw, float pitch) {
        if (!Float.isFinite(yaw) || !Float.isFinite(pitch)) {
            return null;
        }
        return new float[]{yaw, pitch};
    }
}
