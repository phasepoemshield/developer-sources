package fun.nexisdlc.modules.impl.combat.aura.rotations;

import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.minecraft.util.math.MathHelper.wrapDegrees;

public class SpookyTimeRotation extends RotateModel {

    private static final float AIM_STRENGTH = 100f;
    private static final float AIM_STRENGTH_MAX = 100f;
    private static final boolean AIM_BY_Y = true;
    private static final boolean RANDOMIZATION = true;
    private static final float RANDOMIZATION_STRENGTH = 1.5f;
    private static final float RANDOMIZATION_INTERPOLATION = 0.45f;

    private static final int PATTERN_HISTORY_LIMIT = 8;
    private static final int PATTERN_CANDIDATE_ATTEMPTS = 18;

    private LivingEntity lastTarget;

    private float frozenTargetPitch = 0f;

    private RandomPattern currentPattern = RandomPattern.defaultPattern();
    private long currentPatternId = 0L;
    private final List<RandomPattern> recentPatterns = new ArrayList<>();

    private long lastRandomRetargetTime = 0L;
    private int nextRandomRetargetDelayMs = randomRetargetDelayMs(currentPattern);

    private float randomCurveYaw = 0.0f;
    private float randomCurvePitch = 0.0f;
    private float randomCurveTargetYaw = 0.0f;
    private float randomCurveTargetPitch = 0.0f;
    private float randomOffsetYaw = 0.0f;
    private float randomOffsetPitch = 0.0f;
    private float appliedPitchNoise = 0.0f;

    @NativeCall
    @Override
    public RotateVector update(RotateVector currentRotation, LivingEntity target) {
        if (mc.player == null || target == null) {
            lastTarget = null;
            return currentRotation;
        }

        if (lastTarget != target) {
            resetRandomState();
            lastTarget = target;
        }
        this.target = target;

        double deltaSeconds = getDeltaSeconds();
        float tickDelta = getTickDelta();

        Vec3d aimPointYaw = calculateTargetPoint(target, currentRotation);
        Vec3d aimPointPitch = interpolatedTargetCenter(target, tickDelta);

        float targetYaw = calcRotationTo(aimPointYaw, tickDelta).yaw;
        float targetPitch = calcRotationTo(aimPointPitch, tickDelta).pitch;

        if (AuraModule.getAttackCooldown() > 0.75f) {
            frozenTargetPitch = targetPitch;
        }

        Rotation targetRotation = new Rotation(targetYaw, frozenTargetPitch);
        Rotation randomized = applyRandomization(targetRotation, deltaSeconds);

        float yawDiff = wrapDegrees(randomized.yaw - currentRotation.getYaw());
        float maxYawStep = getMaxAssistStep(deltaSeconds, false, Math.abs(yawDiff));
        yawDiff = MathHelper.clamp(yawDiff, -maxYawStep, maxYawStep);
        float yaw = currentRotation.getYaw() + yawDiff;

        float pitch = frozenTargetPitch;

        if (RANDOMIZATION) {
            float targetPitchNoise = getRandomPitchNoise();
            float maxNoiseStep = Math.max(0.02f, (float) deltaSeconds * 36.0f);
            float randomPitchAssist = MathHelper.clamp(targetPitchNoise - appliedPitchNoise, -maxNoiseStep, maxNoiseStep);
            appliedPitchNoise += randomPitchAssist;
            pitch += appliedPitchNoise;
        }

        yaw = MathUtil.lerpAngle(currentRotation.getYaw(), yaw, 0.25f);
        pitch = MathUtil.lerpAngle(currentRotation.getPitch(), pitch, 0.025f);
        pitch = MathHelper.clamp(pitch, -90.0f, 90.0f);

        yaw = applyGCD(yaw);
        pitch = applyGCD(pitch);

        return new RotateVector(yaw, pitch);
    }

    @NativeCall
    private Vec3d calculateTargetPoint(LivingEntity target, RotateVector baseRotation) {
        float distance = mc.player.distanceTo(target);
        boolean rayTracePassed = PlayerUtils.getMouseOver(target, baseRotation.getYaw(), baseRotation.getPitch(), distance, 0.94f) != null;
        double heightPercent = rayTracePassed ? 1.0 : 0.78;
        return targetPoint(target, heightPercent);
    }

    private Rotation calcRotationTo(Vec3d aimPoint) {
        return calcRotationTo(aimPoint, getTickDelta());
    }

    private Rotation calcRotationTo(Vec3d aimPoint, float tickDelta) {
        if (mc.player == null) return new Rotation(0f, 0f);
        Vec3d eyePos = mc.player.getCameraPosVec(tickDelta);
        double dx = aimPoint.x - eyePos.x;
        double dy = aimPoint.y - eyePos.y;
        double dz = aimPoint.z - eyePos.z;
        double xz = Math.sqrt(dx * dx + dz * dz);
        float yaw = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        float pitch = MathHelper.clamp((float) -Math.toDegrees(Math.atan2(dy, xz)), -90.0f, 90.0f);
        return new Rotation(yaw, pitch);
    }

    private float getMaxAssistStep(double deltaSeconds, boolean pitch, float difference) {
        float speedFactor = MathHelper.clamp((AIM_STRENGTH * 0.65f) / AIM_STRENGTH_MAX, 0.01f, 18.0f);
        float baseSpeed = pitch ? 90.0f + speedFactor * 560.0f : speedFactor * 980.0f;
        float closeFactor = MathHelper.clamp(difference / (pitch ? 8.0f : 10.0f), pitch ? 0.05f : 0.06f, 1.0f);
        return Math.max(0.01f, (float) deltaSeconds * baseSpeed * closeFactor);
    }

    private Rotation applyRandomization(Rotation rotation, double deltaSeconds) {
        if (!RANDOMIZATION) {
            randomOffsetYaw = 0.0f;
            randomOffsetPitch = 0.0f;
            return rotation;
        }

        float strength = RANDOMIZATION_STRENGTH;
        if (strength <= 1.0E-4f) {
            randomCurveYaw = 0.0f;
            randomCurvePitch = 0.0f;
            randomCurveTargetYaw = 0.0f;
            randomCurveTargetPitch = 0.0f;
            randomOffsetYaw = 0.0f;
            randomOffsetPitch = 0.0f;
            return rotation;
        }

        float interpolationFactor = RANDOMIZATION_INTERPOLATION;
        float interpolationDamp = 1.0f - (interpolationFactor * 0.85f);
        float dt = (float) MathHelper.clamp(deltaSeconds, 0.001, 0.2);

        long now = System.currentTimeMillis();
        if (now - lastRandomRetargetTime > nextRandomRetargetDelayMs) {
            randomCurveTargetYaw = ThreadLocalRandom.current().nextFloat(-currentPattern.maxCurveYaw(), currentPattern.maxCurveYaw()) * strength;
            randomCurveTargetPitch = ThreadLocalRandom.current().nextFloat(-currentPattern.maxCurvePitch(), currentPattern.maxCurvePitch()) * strength;
            lastRandomRetargetTime = now;
            nextRandomRetargetDelayMs = randomRetargetDelayMs(currentPattern);
        }

        float curveLerp = MathHelper.clamp(dt * (3.2f + interpolationFactor * 10.8f), 0.0f, 1.0f);
        randomCurveYaw += (randomCurveTargetYaw - randomCurveYaw) * curveLerp;
        randomCurvePitch += (randomCurveTargetPitch - randomCurvePitch) * curveLerp;

        float sineYaw = (float) Math.sin(now / currentPattern.sinePeriodYawMs()) * currentPattern.sineAmplitudeYaw() * strength * interpolationDamp;
        float sinePitch = (float) Math.sin(now / currentPattern.sinePeriodPitchMs()) * currentPattern.sineAmplitudePitch() * strength * interpolationDamp;

        float targetOffsetYaw = randomCurveYaw + sineYaw;
        float targetOffsetPitch = randomCurvePitch + sinePitch;

        float maxYawOffsetStep = currentPattern.yawStepPerSecond() * dt * strength * (0.45f + interpolationFactor * 0.55f);
        float maxPitchOffsetStep = currentPattern.pitchStepPerSecond() * dt * strength * (0.45f + interpolationFactor * 0.55f);

        randomOffsetYaw += MathHelper.clamp(targetOffsetYaw - randomOffsetYaw, -maxYawOffsetStep, maxYawOffsetStep);
        randomOffsetPitch += MathHelper.clamp(targetOffsetPitch - randomOffsetPitch, -maxPitchOffsetStep, maxPitchOffsetStep);

        float randomizedYaw = wrapDegrees(rotation.yaw + randomOffsetYaw);
        float randomizedPitch = MathHelper.clamp(rotation.pitch + randomOffsetPitch, -90.0f, 90.0f);
        return new Rotation(randomizedYaw, randomizedPitch);
    }

    private float getRandomPitchNoise() {
        long now = System.currentTimeMillis();
        float strength = RANDOMIZATION_STRENGTH;
        if (strength <= 1.0E-4f) {
            return 0.0f;
        }
        float interpolationDamp = 1.0f - (RANDOMIZATION_INTERPOLATION * 0.7f);
        float pitchNoise = randomCurvePitch * currentPattern.pitchNoiseCurveFactor()
                + (float) Math.sin(now / currentPattern.pitchNoiseSinePeriodMs()) * currentPattern.pitchNoiseSineAmplitude() * strength * interpolationDamp;
        return MathHelper.clamp(pitchNoise, -currentPattern.pitchNoiseClamp(), currentPattern.pitchNoiseClamp());
    }

    public long generateRandomPattern() {
        RandomPattern nextPattern = createMostDistinctPattern();
        applyPattern(nextPattern);
        rememberPattern(nextPattern);
        currentPatternId++;
        return currentPatternId;
    }

    public long getCurrentPatternId() {
        return currentPatternId;
    }

    private double getDeltaSeconds() {
        float tickDelta = getTickDelta();
        if (tickDelta <= 0.0f) {
            return 0.05;
        }
        return tickDelta * 0.05;
    }

    private float getTickDelta() {
        if (mc == null || mc.getRenderTickCounter() == null) {
            return 1.0f;
        }
        return MathHelper.clamp(mc.getRenderTickCounter().getTickProgress(true), 0.0f, 1.0f);
    }

    private Vec3d interpolatedTargetCenter(LivingEntity target, float tickDelta) {
        double x = MathHelper.lerp(tickDelta, target.lastX, target.getX());
        double y = MathHelper.lerp(tickDelta, target.lastY, target.getY()) + target.getHeight() * 0.6;
        double z = MathHelper.lerp(tickDelta, target.lastZ, target.getZ());
        return new Vec3d(x, y, z);
    }

    private RandomPattern createMostDistinctPattern() {
        RandomPattern bestPattern = RandomPattern.randomPattern();
        double bestScore = scorePattern(bestPattern);

        for (int i = 1; i < PATTERN_CANDIDATE_ATTEMPTS; i++) {
            RandomPattern candidate = RandomPattern.randomPattern();
            double score = scorePattern(candidate);
            if (score > bestScore) {
                bestScore = score;
                bestPattern = candidate;
            }
        }

        return bestPattern;
    }

    private double scorePattern(RandomPattern candidate) {
        double minDistance = patternDistance(candidate, currentPattern);

        for (RandomPattern previous : recentPatterns) {
            minDistance = Math.min(minDistance, patternDistance(candidate, previous));
        }

        return minDistance + ThreadLocalRandom.current().nextDouble(0.0, 0.02);
    }

    private double patternDistance(RandomPattern a, RandomPattern b) {
        double distance = 0.0;
        distance += Math.abs(a.maxCurveYaw() - b.maxCurveYaw()) / 3.5;
        distance += Math.abs(a.maxCurvePitch() - b.maxCurvePitch()) / 2.6;
        distance += Math.abs(a.sineAmplitudeYaw() - b.sineAmplitudeYaw()) / 0.45;
        distance += Math.abs(a.sineAmplitudePitch() - b.sineAmplitudePitch()) / 0.40;
        distance += Math.abs(a.sinePeriodYawMs() - b.sinePeriodYawMs()) / 220.0;
        distance += Math.abs(a.sinePeriodPitchMs() - b.sinePeriodPitchMs()) / 220.0;
        distance += Math.abs(a.yawStepPerSecond() - b.yawStepPerSecond()) / 12.0;
        distance += Math.abs(a.pitchStepPerSecond() - b.pitchStepPerSecond()) / 6.0;
        distance += Math.abs(a.minRetargetDelayMs() - b.minRetargetDelayMs()) / 280.0;
        distance += Math.abs(a.maxRetargetDelayMs() - b.maxRetargetDelayMs()) / 420.0;
        distance += Math.abs(a.pitchNoiseCurveFactor() - b.pitchNoiseCurveFactor()) / 1.0;
        distance += Math.abs(a.pitchNoiseSineAmplitude() - b.pitchNoiseSineAmplitude()) / 0.8;
        distance += Math.abs(a.pitchNoiseSinePeriodMs() - b.pitchNoiseSinePeriodMs()) / 220.0;
        distance += Math.abs(a.pitchNoiseClamp() - b.pitchNoiseClamp()) / 2.2;
        return distance;
    }

    private void applyPattern(RandomPattern pattern) {
        currentPattern = pattern;
        nextRandomRetargetDelayMs = randomRetargetDelayMs(pattern);
        lastRandomRetargetTime = 0L;
        randomCurveYaw = 0.0f;
        randomCurvePitch = 0.0f;
        randomCurveTargetYaw = 0.0f;
        randomCurveTargetPitch = 0.0f;
        randomOffsetYaw = 0.0f;
        randomOffsetPitch = 0.0f;
        appliedPitchNoise = 0.0f;
    }

    private void rememberPattern(RandomPattern pattern) {
        recentPatterns.add(0, pattern);
        while (recentPatterns.size() > PATTERN_HISTORY_LIMIT) {
            recentPatterns.remove(recentPatterns.size() - 1);
        }
    }

    private void resetRandomState() {
        randomOffsetYaw = 0.0f;
        randomOffsetPitch = 0.0f;
        randomCurveTargetYaw = 0.0f;
        randomCurveTargetPitch = 0.0f;
        appliedPitchNoise = 0.0f;
        lastRandomRetargetTime = 0L;
    }

    private static int randomRetargetDelayMs(RandomPattern pattern) {
        int minDelay = Math.max(30, pattern.minRetargetDelayMs());
        int maxDelay = Math.max(minDelay + 1, pattern.maxRetargetDelayMs());
        return ThreadLocalRandom.current().nextInt(minDelay, maxDelay + 1);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        lastTarget = null;
        if (currentPatternId == 0L) {
            generateRandomPattern();
        } else {
            applyPattern(currentPattern);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        lastTarget = null;
        resetRandomState();
    }

    private record Rotation(float yaw, float pitch) {
    }

    private record RandomPattern(
            float maxCurveYaw,
            float maxCurvePitch,
            float sineAmplitudeYaw,
            float sineAmplitudePitch,
            float sinePeriodYawMs,
            float sinePeriodPitchMs,
            float yawStepPerSecond,
            float pitchStepPerSecond,
            int minRetargetDelayMs,
            int maxRetargetDelayMs,
            float pitchNoiseCurveFactor,
            float pitchNoiseSineAmplitude,
            float pitchNoiseSinePeriodMs,
            float pitchNoiseClamp
    ) {
        private static RandomPattern defaultPattern() {
            return new RandomPattern(
                    2.0f,
                    1.6f,
                    0.22f,
                    0.20f,
                    125.0f,
                    95.0f,
                    7.5f,
                    2.8f,
                    150,
                    300,
                    0.55f,
                    0.32f,
                    95.0f,
                    1.4f
            );
        }

        private static RandomPattern randomPattern() {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int minDelay = random.nextInt(90, 280);
            int maxDelay = random.nextInt(minDelay + 55, 430);

            return new RandomPattern(
                    random.nextFloat(1.05f, 3.35f),
                    random.nextFloat(0.75f, 2.35f),
                    random.nextFloat(0.09f, 0.40f),
                    random.nextFloat(0.08f, 0.36f),
                    random.nextFloat(80.0f, 310.0f),
                    random.nextFloat(72.0f, 285.0f),
                    random.nextFloat(4.3f, 15.5f),
                    random.nextFloat(1.7f, 8.2f),
                    minDelay,
                    maxDelay,
                    random.nextFloat(0.22f, 1.14f),
                    random.nextFloat(0.13f, 0.83f),
                    random.nextFloat(66.0f, 280.0f),
                    random.nextFloat(0.75f, 2.35f)
            );
        }
    }
}
