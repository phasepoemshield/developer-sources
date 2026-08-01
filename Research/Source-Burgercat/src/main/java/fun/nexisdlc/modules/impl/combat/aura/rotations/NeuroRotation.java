package fun.nexisdlc.modules.impl.combat.aura.rotations;

import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.combat.RotationRecorderModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ThreadLocalRandom;

public class NeuroRotation extends RotateModel {

    // === конфиг ===
    public static volatile String selectedModel = "sharp";

    public static volatile boolean assistEnabled = true;
    public static volatile float assistYaw = 0.15f;
    public static volatile float assistPitch = 0.20f;

    public static volatile boolean fovLimitEnabled = true;
    public static volatile float maxFov = 8.0f;

    public static volatile float cfgMaxStep = 22.0f;
    public static volatile float cfgMaxPitchStep = 12.0f;

    public static volatile float cfgSmooth = 0.5f;
    public static volatile long cfgStepNs = 10_000_000L;

    public static volatile float jitterDeg = 0.0f;

    public static volatile boolean stickyEnabled = false;
    public static volatile float stickyMult = 2.0f;

    public static volatile boolean predictEnabled = false;
    public static volatile float predictTicks = 2.0f;

    // Анти-упреждение: сдвиг точки прицела назад по скорости цели (в тиках).
    public static volatile float antiPredictTicks = 0.5f;

    // Смещение точки прицеливания по высоте (положительное = выше).
    public static volatile float aimHeightOffset = -0.38f;

    // === Smart Multi-point ===
    public static volatile boolean multiPointEnabled = true;
    public static volatile float multiPointRadiusX = 0.3f;
    public static volatile float multiPointRadiusY = 0.3f;
    public static volatile float multiPointRadiusZ = 0.3f;
    public static volatile long multiPointIntervalMinMs = 150L;
    public static volatile long multiPointIntervalMaxMs = 400L;

    // Плавный переход к цели. Доля 0..1 за вызов.
    public static volatile float tweenSpeed = 0.75f;

    // Скорость tween при первой атаке (firstAttack).
    public static volatile float firstAttackTweenSpeed = 0.6f;

    // Максимальные шаги модели при firstAttack (градусы).
    public static volatile float firstAttackMaxStep = 14.0f;
    public static volatile float firstAttackMaxPitchStep = 7.0f;

    public static volatile String pitchMode = "Обычная";

    // Порог кулдауна для переключения скорости после/перед ударом
    public static volatile float cfgHitTiming = 0.85f;
    public static volatile float cfgSpeedAfterHit = 0.5f;
    public static volatile float cfgSpeedBeforeHit = 1.0f;
    public static volatile float cfgPostHitSmooth = 0.3f;

    private static float currentHitTiming = 0.85f;

    private static final int T = RotationFeatures.WINDOW;
    private static final int F = RotationFeatures.FEATURES;

    private static final float WARMUP_GAIN = 0.75f;

    private final Deque<float[]> window = new ArrayDeque<>();

    private float prevDYaw;
    private float prevDPitch;

    private float smoothedSpeedMult = 1.0f;

    private long lastStepNs = 0L;

    private float stateYaw;
    private float statePitch;

    private float targetYaw;
    private float targetPitch;
    private boolean hasTarget = false;

    private boolean seeded = false;
    private int warmupLeft = 0;
    private String activeModel = null;

    // --- Смена таргета: плавная наводка на новую цель ---
    private java.util.UUID lastTargetUuid = null;
    private boolean targetTransitioning = false;

    // --- Frozen pitch ---
    private float testPitchFrozen = 0f;
    private boolean testPitchFrozenInit = false;

    // --- Smart Multi-point state ---
    private Vec3d multiPointOffset = Vec3d.ZERO;
    private long lastMultiPointUpdate = 0L;
    private long nextMultiPointInterval = 250L;
    private boolean multiPointInitialized = false;

    @Override
    public void onEnable() {
        super.onEnable();
        reset();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        window.clear();
    }

    private void reset() {
        window.clear();

        prevDYaw = 0f;
        prevDPitch = 0f;

        smoothedSpeedMult = cfgSpeedBeforeHit;
        currentHitTiming = cfgHitTiming;

        lastStepNs = 0L;

        hasTarget = false;

        seeded = false;
        warmupLeft = 1;
        activeModel = selectedModel;

        lastTargetUuid = null;
        targetTransitioning = false;

        testPitchFrozen = 0f;
        testPitchFrozenInit = false;

        multiPointOffset = Vec3d.ZERO;
        lastMultiPointUpdate = 0L;
        nextMultiPointInterval = 250L;
        multiPointInitialized = false;
    }

    @NativeCall
    @Override
    public RotateVector update(RotateVector current, LivingEntity target) {
        if (target == null || current == null) {
            return current;
        }

        MinecraftClient mc = MinecraftClient.getInstance();

        // Детект смены таргета → включаем плавный подход.
        java.util.UUID curUuid = target.getUuid();
        if (!curUuid.equals(lastTargetUuid)) {
            targetTransitioning = true;
            lastTargetUuid = curUuid;
        }

        // Recording: Neuro не крутит, человек пишет labels.
        if (RotationRecorderModule.isRecording()) {
            if (mc.player == null) {
                return current;
            }
            return new RotateVector(mc.player.getYaw(), mc.player.getPitch());
        }

        String key = selectedModel;

        if (activeModel == null || !activeModel.equals(key)) {
            reset();
        }

        if (!NeuroModel.isReady(key)) {
            return calcAim(aimPoint(target));
        }

        float curYaw = current.getYaw();
        float curPitch = current.getPitch();

        if (!seeded) {
            if (mc.player == null) {
                return current;
            }
            targetYaw = curYaw;
            targetPitch = curPitch;
            hasTarget = true;
            seeded = true;
            window.clear();
        }

        long now = System.nanoTime();
        boolean doStep = now - lastStepNs >= cfgStepNs;

        if (doStep) {
            lastStepNs = now;

            // База для модели — реально текущая ротация.
            stateYaw = curYaw;
            statePitch = curPitch;

            RotateVector aim = calcAim(aimPoint(target));

            float[] frame = RotationFeatures.extract(stateYaw, statePitch, target, prevDYaw, prevDPitch);

            if (window.isEmpty()) {
                for (int k = 0; k < T; k++) {
                    window.addLast(frame);
                }
            } else {
                window.addLast(frame);
                while (window.size() > T) {
                    window.removeFirst();
                }
            }

            float[][][] input = new float[1][T][F];
            int i = 0;
            for (float[] fr : window) {
                input[0][i++] = fr;
            }

            float[] out = NeuroModel.predict(key, input);
            if (out != null) {
                float dYaw = out[0];
                float dPitch = out[1];

                if (warmupLeft > 0) {
                    dYaw *= WARMUP_GAIN;
                    dPitch *= WARMUP_GAIN;
                    warmupLeft--;
                }

                // Anti-micro-jitter: микро-шаги < 5° сглаживаем сильнее
                float stepSmooth = (Math.abs(dYaw) < 5.0f || Math.abs(dPitch) < 5.0f) ? 0.06f : 0.2f;
                dYaw = lerp(prevDYaw, dYaw, stepSmooth);
                dPitch = lerp(prevDPitch, dPitch, stepSmooth);

                // Плавно переключаем скорость после/перед ударом
                float cd = AuraModule.getNormalizedAttackCooldown();
                float targetSpeedMult = cd < currentHitTiming ? cfgSpeedAfterHit : cfgSpeedBeforeHit;
                smoothedSpeedMult = MathHelper.lerp(0.12f, smoothedSpeedMult, targetSpeedMult);

                boolean smoothApproach = AuraModule.getInstance().firstAttack || targetTransitioning;
                // firstAttack: скорость ×2
                float maxStep = (smoothApproach && firstAttackMaxStep > 0f ? firstAttackMaxStep * 2f : cfgMaxStep) * smoothedSpeedMult;
                float maxPitchStep = (smoothApproach && firstAttackMaxPitchStep > 0f ? firstAttackMaxPitchStep * 2f : cfgMaxPitchStep) * smoothedSpeedMult;

                dYaw = MathHelper.clamp(dYaw, -maxStep, maxStep);
                dPitch = MathHelper.clamp(dPitch, -maxPitchStep, maxPitchStep);

                prevDYaw = dYaw;
                prevDPitch = dPitch;

                stateYaw += dYaw;
                float neuroPitch = statePitch + dPitch;

                float ay = assistEnabled ? assistYaw * smoothedSpeedMult : 0f;
                float ap = assistEnabled ? assistPitch * smoothedSpeedMult : 0f;

                if (stickyEnabled && mc.player != null && mc.player.distanceTo(target) <= 3.5f) {
                    ay = clamp01(ay * stickyMult);
                    ap = clamp01(ap * stickyMult);
                }

                if (ay > 0f) {
                    // Yaw assist корректирует к центру ХБ (без предикции)
                    RotateVector centerAim = calcAim(target.getBoundingBox().getCenter());
                    float yawErr = wrap(centerAim.getYaw() - stateYaw);
                    stateYaw += yawErr * ay;
                }
                if (ap > 0f) {
                    neuroPitch = lerp(neuroPitch, aim.getPitch(), ap);
                }

                // === FOV limit (smooth, not hard snap) ===
                if (fovLimitEnabled) {
                    float yawErr = wrap(aim.getYaw() - stateYaw);
                    if (Math.abs(yawErr) > maxFov) {
                        float clampedYaw = aim.getYaw() - Math.signum(yawErr) * maxFov;
                        stateYaw = lerp(stateYaw, clampedYaw, 0.25f);
                    }
                    float pitchErr = aim.getPitch() - neuroPitch;
                    if (Math.abs(pitchErr) > maxFov) {
                        float clampedPitch = aim.getPitch() - Math.signum(pitchErr) * maxFov;
                        neuroPitch = lerp(neuroPitch, clampedPitch, 0.25f);
                    }
                }

                // === Humanization ===
                if (jitterDeg > 0.0f) {
                    stateYaw += (float) ThreadLocalRandom.current().nextDouble(-jitterDeg, jitterDeg);
                    neuroPitch += (float) ThreadLocalRandom.current().nextDouble(-jitterDeg, jitterDeg);
                }

                // Новая ЦЕЛЬ ротации. К ней плавно едем между шагами модели.
                targetYaw = stateYaw;

                float distance = mc.player.distanceTo(target);
                float prank = distance < 2f ? -0.8f : -0.1f;

                targetPitch = MathHelper.clamp(neuroPitch + ("Test".equals(pitchMode) ? -0.5f : prank), -90f, 90f);
                hasTarget = true;
            }
        }

        if (!hasTarget) {
            return new RotateVector(curYaw, curPitch);
        }

        // Плавный переход к цели. cfgSmooth = сглаживание (lerp к target).
        boolean smoothApproach = AuraModule.getInstance().firstAttack || targetTransitioning;
        float t = smoothApproach ? Math.min(cfgSmooth * 1.2f, 0.7f) : cfgSmooth;
        t *= smoothedSpeedMult;

        float yawDelta = wrap(targetYaw - curYaw);
        float pitchDelta = targetPitch - curPitch;

        // Если дошли до цели (угловая ошибка мала) — сбрасываем флаг смены таргета.
        if (targetTransitioning
                && Math.abs(yawDelta) < 5.0f
                && Math.abs(pitchDelta) < 5.0f) {
            targetTransitioning = false;
        }
        float outYaw = curYaw + yawDelta * t;

        // Скорость pitch пропорциональна скорости yaw:
        float yawSpeed = Math.abs(yawDelta);
        float pitchSpeed = Math.abs(pitchDelta);
        float minPitchFactor = 0.35f;
        float pitchFactor = pitchSpeed > 0.001f ? Math.clamp(yawSpeed / pitchSpeed, minPitchFactor, 1.0f) : 0.0f;

        // Буст pitch при cd > 0.7: оружие заряжено → точнее наводимся по вертикали
        float cd = AuraModule.getNormalizedAttackCooldown();
        float pitchBoost = cd > 0.7f ? 1.0f + (cd - 0.7f) / 0.3f * 1.8f : 1.0f; // до 2.8x при cd=1.0
        pitchFactor = Math.min(1.0f, pitchFactor * pitchBoost);

        float outPitch = curPitch + pitchDelta * t * pitchFactor;

        // === Логика заморозки чистой базы Pitch ===
        if ("Test".equals(pitchMode) && mc.player != null) {
            if (cd > 0.65f) {
                testPitchFrozen = outPitch;
                testPitchFrozenInit = true;
            } else {
                if (!testPitchFrozenInit || mc.player.getVelocity().getY() < -0.0743) {
                    testPitchFrozen = outPitch;
                    testPitchFrozenInit = true;
                }
                outPitch = testPitchFrozen;
            }
        } else {
            testPitchFrozenInit = false;
        }

        outYaw = applyGCD(outYaw);
        outPitch = applyGCD(outPitch);

        return new RotateVector(outYaw, MathHelper.clamp(outPitch, -90f, 90f));
    }

    private Vec3d aimPoint(LivingEntity target) {
        if (multiPointEnabled && !multiPointInitialized) {
            randMultiPoint();
        }

        if (multiPointEnabled) {
            long now = System.currentTimeMillis();
            if (now - lastMultiPointUpdate >= nextMultiPointInterval) {
                randMultiPoint();
            }
        }

        Vec3d bbCenter = target.getBoundingBox().getCenter();
        Vec3d point = multiPointEnabled
                ? new Vec3d(bbCenter.x + multiPointOffset.x, bbCenter.y + aimHeightOffset + multiPointOffset.y, bbCenter.z + multiPointOffset.z)
                : new Vec3d(bbCenter.x, bbCenter.y + aimHeightOffset, bbCenter.z);

        Vec3d v = target.getVelocity();

        if (predictEnabled) {
            point = point.add(v.x * predictTicks, v.y * predictTicks, v.z * predictTicks);
        }

        if (antiPredictTicks > 0f) {
            point = point.subtract(v.x * antiPredictTicks, v.y * antiPredictTicks, v.z * antiPredictTicks);
        }

        return point;
    }

    private void randMultiPoint() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        multiPointOffset = new Vec3d(
                rnd.nextDouble(-multiPointRadiusX, multiPointRadiusX),
                rnd.nextDouble(-multiPointRadiusY, multiPointRadiusY),
                rnd.nextDouble(-multiPointRadiusZ, multiPointRadiusZ)
        );
        lastMultiPointUpdate = System.currentTimeMillis();
        nextMultiPointInterval = rnd.nextLong(multiPointIntervalMinMs, multiPointIntervalMaxMs + 1);
        multiPointInitialized = true;
    }

    private static float wrap(float yaw) {
        yaw %= 360.0f;
        if (yaw >= 180.0f) {
            yaw -= 360.0f;
        }
        if (yaw < -180.0f) {
            yaw += 360.0f;
        }
        return yaw;
    }

    private static float clamp01(float v) {
        return MathHelper.clamp(v, 0.0f, 1.0f);
    }

    public static void randomizeHitTiming() {
        float base = cfgHitTiming;
        float rnd = ThreadLocalRandom.current().nextFloat(-0.07f, 0.07f);
        currentHitTiming = MathHelper.clamp(base + rnd, 0.0f, 1.0f);
    }
}
