package fun.nexisdlc.mixins.baritone;

import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.type.EventState;
import baritone.api.utils.Rotation;
import baritone.behavior.LookBehavior;
import fun.nexisdlc.client.utils.player.rotation.SensUtility;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.integration.baritone.NexisBaritoneRotationHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Field;

@Mixin(value = LookBehavior.class, remap = false)
public class LookBehaviorMixin {

    private static final boolean REDIRECT_TO_ROTATION_TASK = false;
    private static final int BARITONE_ROTATION_PRIORITY = 200;
    private static final String BARITONE_TASK_NAME = "baritone_global";
    private static final float MAX_YAW_STEP = 35.0f;
    private static final float MAX_PITCH_STEP = 25.0f;
    private static final float RETURN_SPEED = 80.0f;
    private static final long RESET_DELAY_MS = 120L;
    private static final long STALE_TARGET_MS = 250L;

    private static long lastTargetAtMs;

    private static final Field TARGET_FIELD;
    private static final Field ROTATION_FIELD;
    private static final Field MODE_FIELD;
    private static final Object NONE_MODE;

    static {
        try {
            TARGET_FIELD = LookBehavior.class.getDeclaredField("target");
            TARGET_FIELD.setAccessible(true);
            Class<?> targetClass = Class.forName("baritone.behavior.LookBehavior$Target");
            ROTATION_FIELD = targetClass.getDeclaredField("rotation");
            ROTATION_FIELD.setAccessible(true);
            MODE_FIELD = targetClass.getDeclaredField("mode");
            MODE_FIELD.setAccessible(true);

            Class<?> modeEnum = Class.forName("baritone.behavior.LookBehavior$Target$Mode");
            NONE_MODE = Enum.valueOf((Class<Enum>) modeEnum, "NONE");
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize LookBehaviorMixin reflection", e);
        }
    }

    @Inject(method = "onPlayerUpdate", at = @At("HEAD"), cancellable = true)
    private void onPlayerUpdatePre(PlayerUpdateEvent event, CallbackInfo ci) {
        if (event.getState() != EventState.PRE) return;
        if (!REDIRECT_TO_ROTATION_TASK) {
            RotationTask.remove(BARITONE_TASK_NAME);
            NexisBaritoneRotationHandler.reset();
            return;
        }
        sendTargetRotationToTask();
        ci.cancel();
    }

    @Inject(method = "onPlayerUpdate", at = @At("HEAD"), cancellable = true)
    private void onPlayerUpdatePost(PlayerUpdateEvent event, CallbackInfo ci) {
        if (event.getState() != EventState.POST) return;
        if (!REDIRECT_TO_ROTATION_TASK) {
            return;
        }
        try {
            LookBehavior look = (LookBehavior) (Object) this;
            Object target = TARGET_FIELD.get(look);
            if (target != null) {
                TARGET_FIELD.set(look, null);
            }
        } catch (IllegalAccessException ignored) {
        }
        ci.cancel();
    }

    private boolean sendTargetRotationToTask() {
        try {
            LookBehavior look = (LookBehavior) (Object) this;
            Object target = TARGET_FIELD.get(look);
            if (target == null) {
                removeIfStale();
                return false;
            }

            TARGET_FIELD.set(look, null);

            Object mode = MODE_FIELD.get(target);
            if (mode == NONE_MODE) {
                removeIfStale();
                return false;
            }

            Rotation rotation = (Rotation) ROTATION_FIELD.get(target);
            if (rotation == null) {
                removeIfStale();
                return false;
            }

            float yaw = rotation.getYaw();
            float pitch = rotation.getPitch();
            if (Float.isFinite(yaw) && Float.isFinite(pitch)) {
                long now = System.currentTimeMillis();
                lastTargetAtMs = now;
                float[] randomizedRotation = NexisBaritoneRotationHandler.prepareTargetRotation(yaw, pitch);
                if (randomizedRotation == null) {
                    return false;
                }
                float randomizedYaw = randomizedRotation[0];
                float randomizedPitch = randomizedRotation[1];

                seedRotationIfIdle(randomizedYaw);
                RotationTask.create(BARITONE_TASK_NAME, BARITONE_ROTATION_PRIORITY);
                RotationTask.setTargetRotation(
                        randomizedYaw,
                        randomizedPitch,
                        MAX_YAW_STEP,
                        MAX_PITCH_STEP,
                        RETURN_SPEED,
                        RETURN_SPEED,
                        3.0,
                        BARITONE_ROTATION_PRIORITY,
                        RESET_DELAY_MS
                );
                stepVisualToward(randomizedYaw, randomizedPitch);
                return true;
            }
        } catch (IllegalAccessException ignored) {
        }
        return false;
    }

    private static void removeIfStale() {
        if (System.currentTimeMillis() - lastTargetAtMs >= STALE_TARGET_MS) {
            RotationTask.remove(BARITONE_TASK_NAME);
            NexisBaritoneRotationHandler.reset();
        }
    }

    private static void seedRotationIfIdle(float targetYaw) {
        if (RotationTask.isRotating()) {
            return;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.player == null) {
            return;
        }

        RotationTask.visualHeadYaw = RotationTask.normalizeYawTo(targetYaw, client.player.getYaw());
        RotationTask.visualHeadPitch = client.player.getPitch();
        RotationTask.visualPrevHeadYaw = RotationTask.visualHeadYaw;
        RotationTask.visualPrevHeadPitch = RotationTask.visualHeadPitch;
    }

    private static void stepVisualToward(float targetYaw, float targetPitch) {
        float yawDiff = MathHelper.wrapDegrees(targetYaw - RotationTask.visualHeadYaw);
        float pitchDiff = MathHelper.clamp(targetPitch, -90.0f, 90.0f) - RotationTask.visualHeadPitch;

        float yawStep = MathHelper.clamp(yawDiff, -MAX_YAW_STEP, MAX_YAW_STEP);
        float pitchStep = MathHelper.clamp(pitchDiff, -MAX_PITCH_STEP, MAX_PITCH_STEP);
        float gcd = SensUtility.getGCDValue();
        if (Float.isFinite(gcd) && gcd > 0.0f) {
            yawStep = Math.round(yawStep / gcd) * gcd;
            pitchStep = Math.round(pitchStep / gcd) * gcd;

            if (yawStep == 0.0f && Math.abs(yawDiff) > 0.01f) {
                yawStep = Math.copySign(gcd, yawDiff);
            }
            if (pitchStep == 0.0f && Math.abs(pitchDiff) > 0.01f) {
                pitchStep = Math.copySign(gcd, pitchDiff);
            }
        }

        RotationTask.visualHeadYaw += yawStep;
        RotationTask.visualHeadPitch = MathHelper.clamp(RotationTask.visualHeadPitch + pitchStep, -90.0f, 90.0f);
    }
}
