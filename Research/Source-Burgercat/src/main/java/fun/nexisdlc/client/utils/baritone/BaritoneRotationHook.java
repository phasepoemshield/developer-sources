package fun.nexisdlc.client.utils.baritone;

import fun.nexisdlc.client.utils.player.rotation.SensUtility;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import net.minecraft.util.math.MathHelper;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

/**
 * Управляет камерной ротацией при активном Baritone (free look).
 * Вся Baritone ротация теперь перехватывается напрямую в LookBehaviorMixin.
 */
public final class BaritoneRotationHook {

    private BaritoneRotationHook() {}

    private static final String BARITONE_TASK_NAME = "baritone_global";

    private static boolean active = false;
    private static int explicitEnableCount = 0;

    private static float cameraYaw;
    private static float cameraPitch;
    private static boolean cameraInitialized;

    public static void enable() {
        explicitEnableCount++;
        updateActiveState();
    }

    public static void disable() {
        explicitEnableCount = Math.max(0, explicitEnableCount - 1);
        updateActiveState();
    }

    public static void forceDisable() {
        explicitEnableCount = 0;
        active = false;
        clearState();
        removeBaritoneTask();
    }

    public static boolean isActive() {
        return active;
    }

    public static void updateAutoActivation() {
        if (explicitEnableCount > 0) {
            enforceNoSprintWhileActive();
            return;
        }

        boolean baritoneActive = BaritoneHelper.isAvailable()
                && (BaritoneHelper.isPathing() || BaritoneHelper.isMining());

        if (baritoneActive && !active) {
            active = true;
            clearState();
            initCameraFromPlayer();
        } else if (!baritoneActive && active) {
            active = false;
            clearState();
            removeBaritoneTask();
        }
        enforceNoSprintWhileActive();
    }

    private static void updateActiveState() {
        boolean shouldBeActive = explicitEnableCount > 0;
        if (shouldBeActive && !active) {
            active = true;
            clearState();
            initCameraFromPlayer();
        } else if (!shouldBeActive && active && explicitEnableCount == 0) {
            boolean baritoneActive = BaritoneHelper.isAvailable()
                    && (BaritoneHelper.isPathing() || BaritoneHelper.isMining());
            if (!baritoneActive) {
                active = false;
                clearState();
                removeBaritoneTask();
            }
        }
        enforceNoSprintWhileActive();
    }

    public static void enforceNoSprintWhileActive() {
        if (!active || mc.player == null || mc.options == null) {
            return;
        }
    }

    private static void clearState() {
        cameraInitialized = false;
    }

    private static void removeBaritoneTask() {
        RotationTask.remove(BARITONE_TASK_NAME);
    }

    private static void initCameraFromPlayer() {
        if (mc.player == null) {
            return;
        }
        cameraYaw = mc.player.getYaw();
        cameraPitch = mc.player.getPitch();
        cameraInitialized = true;
    }

    public static void addCameraRotation(float yawDelta, float pitchDelta) {
        if (!active) return;

        float sensitivity = SensUtility.getGCDValue();
        cameraYaw += yawDelta * sensitivity;
        cameraPitch = MathHelper.clamp(cameraPitch + pitchDelta * sensitivity, -90f, 90f);
    }

    public static float getCameraYaw() {
        if (!cameraInitialized && mc.player != null) {
            cameraYaw = mc.player.getYaw();
            cameraPitch = mc.player.getPitch();
            cameraInitialized = true;
        }
        return cameraYaw;
    }

    public static float getCameraPitch() {
        if (!cameraInitialized && mc.player != null) {
            cameraYaw = mc.player.getYaw();
            cameraPitch = mc.player.getPitch();
            cameraInitialized = true;
        }
        return cameraPitch;
    }

    public static boolean isCameraInitialized() {
        return cameraInitialized;
    }
}
