package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.client.EventAimAssist;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.server.ServerTPSManager;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.ui.gui.BaseClickGui;
import lombok.Getter;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import ru.sterford.annotations.Handshake;
import ru.sterford.annotations.NativeCall;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static net.minecraft.util.math.MathHelper.wrapDegrees;

@Handshake
@FunctionAdd(name = "AimBot", alias = "Aim Bot", category = Category.Combat, description = "Помогает плавно доводиться до цели")
public class AimBot extends Function {

    public static final SliderSetting attackRange = new SliderSetting("Дистанция атаки", 3f, 1f, 6f, 0.1f);
    public static final SliderSetting aimRange = new SliderSetting("Дистанция наводки", 6f, 1f, 30f, 0.1f);
    public static final SliderSetting aimStrength = new SliderSetting("Скорость", 35f, 1f, 100f, 1f);
    public static final SliderSetting attackDelay = new SliderSetting("Задержка атаки (мс)", 543f, 400f, 700f, 1f);

    public static final BooleanSetting aimByY = new BooleanSetting("Наводиться по Y", true);
    public static final BooleanSetting randomization = new BooleanSetting("Рандомизация", false);
    public static final SliderSetting randomizationStrength = new SliderSetting("Сила рандомизации", 1.0f, 0.0f, 2.0f, 0.05f)
            .setVisible(randomization::get);
    public static final SliderSetting randomizationInterpolation = new SliderSetting("Плавность рандома", 0.65f, 0.0f, 1.0f, 0.01f)
            .setVisible(randomization::get);
    public static final BooleanSetting sendInstruction = new BooleanSetting("Отправить инструкцию", true);
    public static final BooleanSetting autoAttack = new BooleanSetting("Авто-атака", true);
    public static final BooleanSetting aimOnlyOnHit = new BooleanSetting("Наводится только при ударе", false);


    public static final ModeListSetting attack = new ModeListSetting("Атака",
            new BooleanSetting("Умные криты", true),
            new BooleanSetting("Только криты", true),
            new BooleanSetting("Рандомизация критов", true),
            new BooleanSetting("Бить через стены", false),
            new BooleanSetting("Бить и есть", false));

    public static final ModeListSetting targets = new ModeListSetting("Кого атаковать",
            new BooleanSetting("Игроки", true),
            new BooleanSetting("Игроки без брони", true),
            new BooleanSetting("Тиммейты команды", false),
            new BooleanSetting("Невидимок", true),
            new BooleanSetting("Ботов", false),
            new BooleanSetting("Мобы", true),
            new BooleanSetting("Животные", false));

    public static final ModeListSetting sort = new ModeListSetting("Сортировать по",
            new BooleanSetting("Здоровью", true),
            new BooleanSetting("Дистанции", true),
            new BooleanSetting("Прицелу", false));

    public static final ModeListSetting extra = new ModeListSetting("Дополнительно",
            new BooleanSetting("Не бить в GUI", true));

    public final ModeSetting sprintType = new ModeSetting("Тип спринта", "Обычный", "Обычный", "Обход");

    @Getter
    private static LivingEntity target;

    public static final StopWatch MAIN_ATTACK_TIMER = new StopWatch();

    private final List<PlayerEntity> bots = new ArrayList<>();
    private long lastRandomRetargetTime = 0L;
    private float randomCurveYaw = 0.0f;
    private float randomCurvePitch = 0.0f;
    private float randomCurveTargetYaw = 0.0f;
    private float randomCurveTargetPitch = 0.0f;
    private float randomOffsetYaw = 0.0f;
    private float randomOffsetPitch = 0.0f;
    private float appliedPitchNoise = 0.0f;

    private static final int PATTERN_HISTORY_LIMIT = 8;
    private static final int PATTERN_CANDIDATE_ATTEMPTS = 18;

    private static boolean sessionEnableInstructionShown = false;
    private static boolean sessionWorldInstructionShown = false;

    private boolean pendingEnableInstructionHint = false;
    private Object lastWorldRef = null;

    private final List<RandomPattern> recentPatterns = new ArrayList<>();
    private RandomPattern currentPattern = RandomPattern.defaultPattern();
    private long currentPatternId = 0L;
    private int autoRefreshSeconds = 0;
    private long autoRefreshIntervalMs = 0L;
    private long nextAutoRefreshAtMs = 0L;
    private int nextRandomRetargetDelayMs = randomRetargetDelayMs(currentPattern);

    public AimBot() {
        addSettings(
                attackRange,
                aimRange,
                aimStrength,
                attackDelay,
                aimByY,
                randomization,
                randomizationStrength,
                randomizationInterpolation,
                sendInstruction,
                autoAttack,
                aimOnlyOnHit,
                attack,
                targets,
                sort,
                extra,
                sprintType);
    }

    @EventHandler
    public void onUpdate(TickEvent event) {
        try {
            if (nullCheck()) {
                target = null;
                return;
            }

            PlayerEntity player = mc.player;
            if (player == null || mc.world == null) {
                target = null;
                return;
            }

            trySendInstructionHint();
            handleAutoRefresh();

            mc.world.getPlayers().forEach(this::markAsBot);

            if (isGuiBlocked()) {
                target = null;
                return;
            }

            if (target == null || !isValidTarget(target)) {
                target = findTarget();
            }

            if (target == null) {
                return;
            }

            attack();
        } catch (Exception ignored) {
            target = null;
        }
    }

    @NativeCall
    @EventHandler
    public void onAimAssist(EventAimAssist event) {
        try {
            if (nullCheck() || isGuiBlocked()) {
                randomOffsetYaw = 0.0f;
                randomOffsetPitch = 0.0f;
                randomCurveTargetYaw = 0.0f;
                randomCurveTargetPitch = 0.0f;
                appliedPitchNoise = 0.0f;
                return;
            }

            PlayerEntity player = mc.player;
            LivingEntity currentTarget = target;
            if (player == null || currentTarget == null || !isValidTarget(currentTarget)) {
                randomOffsetYaw = 0.0f;
                randomOffsetPitch = 0.0f;
                randomCurveTargetYaw = 0.0f;
                randomCurveTargetPitch = 0.0f;
                appliedPitchNoise = 0.0f;
                return;
            }

            boolean cd =
                    mc.player.getAttackCooldownProgress(0.5f) > 0.7f;

            boolean noAim = aimOnlyOnHit.get() && !cd;

            double deltaSeconds = MathHelper.clamp(event.getDeltaSeconds(), 0.001, 0.2);
            float tickDelta = getRenderTickDelta();
            Rotation rotation = applyRandomization(getTargetRotation(player, currentTarget, tickDelta), deltaSeconds);

            float yawDiff = wrapDegrees(rotation.yaw - player.getYaw());
            float maxYawStep = noAim ? 0 : getMaxAssistStep(deltaSeconds, false, Math.abs(yawDiff));
            float yawAssist = MathHelper.clamp(yawDiff, -maxYawStep, maxYawStep);
            event.setDeltaX(event.getDeltaX() + degreesToMouseDelta(yawAssist));

            if (aimByY.get()) {
                float pitchDiff = rotation.pitch - player.getPitch();
                float maxPitchStep = noAim ? 0 : getMaxAssistStep(deltaSeconds, true, Math.abs(pitchDiff));
                float pitchAssist = MathHelper.clamp(pitchDiff, -maxPitchStep, maxPitchStep);
                event.setDeltaY(event.getDeltaY() + degreesToMouseDelta(pitchAssist));
            }

            if (randomization.get()) {
                float targetPitchNoise = getRandomPitchNoise();
                float maxNoiseStep = Math.max(0.02f, (float) deltaSeconds * 36.0f);
                float randomPitchAssist = MathHelper.clamp(targetPitchNoise - appliedPitchNoise, -maxNoiseStep, maxNoiseStep);
                appliedPitchNoise += randomPitchAssist;
                event.setDeltaY(event.getDeltaY() + degreesToMouseDelta(randomPitchAssist));
            } else {
                if (aimByY.get()) {
                    appliedPitchNoise = 0.0f;
                    return;
                }
                if (Math.abs(appliedPitchNoise) > 1.0E-3f) {
                    float maxUnwindStep = Math.max(0.02f, (float) deltaSeconds * 36.0f);
                    float unwindPitchNoise = MathHelper.clamp(-appliedPitchNoise, -maxUnwindStep, maxUnwindStep);
                    appliedPitchNoise += unwindPitchNoise;
                    event.setDeltaY(event.getDeltaY() + degreesToMouseDelta(unwindPitchNoise));
                }
            }
        } catch (Exception ignored) {
            target = null;
            randomOffsetYaw = 0.0f;
            randomOffsetPitch = 0.0f;
            randomCurveTargetYaw = 0.0f;
            randomCurveTargetPitch = 0.0f;
        }
    }

    private double degreesToMouseDelta(float degrees) {
        float degreesPerDelta = getMouseDegreesPerDelta();
        if (Math.abs(degreesPerDelta) < 1.0E-6f) {
            return 0.0;
        }
        return degrees / degreesPerDelta;
    }

    private float getMouseDegreesPerDelta() {
        if (mc.options == null) {
            return 0.15f;
        }

        double sensitivity = mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
        double cubic = sensitivity * sensitivity * sensitivity;
        boolean spyglassFirstPerson = mc.player != null
                && mc.options.getPerspective().isFirstPerson()
                && mc.player.isUsingSpyglass()
                && !mc.options.smoothCameraEnabled;
        double scale = spyglassFirstPerson ? cubic : cubic * 8.0;
        return (float) Math.max(scale * 0.15, 1.0E-4);
    }

    private LivingEntity findTarget() {
        PlayerEntity player = mc.player;
        if (player == null || mc.world == null) {
            return null;
        }

        double maxRange = getAimRange();
        Box searchBox = player.getBoundingBox().expand(maxRange).stretch(0.0, 1.0, 0.0);
        List<LivingEntity> candidates = new ArrayList<>();

        for (Entity entity : mc.world.getEntitiesByClass(LivingEntity.class, searchBox, e -> isValidTarget((LivingEntity) e))) {
            candidates.add((LivingEntity) entity);
        }

        if (candidates.isEmpty()) {
            return null;
        }

        if (candidates.size() == 1) {
            return candidates.get(0);
        }

        candidates.sort(Comparator.comparingDouble(entity -> targetWeight(player, entity)));
        return candidates.get(0);
    }

    private boolean isValidTarget(LivingEntity entity) {
        PlayerEntity player = mc.player;
        if (entity == null || player == null || mc.world == null) {
            return false;
        }
        if (entity == player || !entity.isAlive() || entity.age < 2) {
            return false;
        }
        if (entity instanceof ClientPlayerEntity || entity.isInvulnerable()) {
            return false;
        }

        double maxRange = getAimRange();
        double horizontalDistanceSq = entity.getEntityPos().subtract(player.getEntityPos()).multiply(1.0, 0.0, 1.0).lengthSquared();
        if (horizontalDistanceSq > maxRange * maxRange) {
            return false;
        }

        double verticalDistance = entity.getY() - player.getY();
        if (verticalDistance > 0.0) {
            if (verticalDistance > maxRange + 1.0) {
                return false;
            }
        } else if (-verticalDistance > maxRange) {
            return false;
        }

        if (entity instanceof PlayerEntity targetPlayer) {
            String name = targetPlayer.getName().getString();
            if (ClientContainer.getNexisInstance().getFriendStorage().isFriend(name)) {
                return false;
            }
            if (isTeamMate(player, targetPlayer) && !targets.getByName("Тиммейты команды").get()) {
                return false;
            }
            if (isBot(targetPlayer)) {
                return targets.getByName("Ботов").get();
            }
            if (!targets.getByName("Игроки").get()) {
                return false;
            }
            if (targetPlayer.getArmor() == 0 && !targets.getByName("Игроки без брони").get()) {
                return false;
            }
            if (targetPlayer.isInvisible() && targetPlayer.getArmor() == 0 && !targets.getByName("Невидимок").get()) {
                return false;
            }
            return true;
        }

        if (entity instanceof Monster || entity instanceof HostileEntity) {
            return targets.getByName("Мобы").get();
        }

        if (entity instanceof AnimalEntity) {
            return targets.getByName("Животные").get();
        }

        return false;
    }

    private float getMaxAssistStep(double deltaSeconds, boolean pitch, float difference) {
        float speedFactor = MathHelper.clamp((aimStrength.get() * 0.65f) / aimStrength.max, 0.01f, 18.0f);
        float baseSpeed = pitch ? 90.0f + speedFactor * 560.0f : 0 + speedFactor * 980.0f;
        float closeFactor = MathHelper.clamp(difference / (pitch ? 8.0f : 10.0f), pitch ? 0.05f : 0.06f, 1.0f);
        return Math.max(0.01f, (float) deltaSeconds * baseSpeed * closeFactor);
    }

    @NativeCall
    private Rotation applyRandomization(Rotation rotation, double deltaSeconds) {
        if (!randomization.get()) {
            randomOffsetYaw = 0.0f;
            randomOffsetPitch = 0.0f;
            return rotation;
        }

        float strength = getRandomizationStrengthFactor();
        if (strength <= 1.0E-4f) {
            randomCurveYaw = 0.0f;
            randomCurvePitch = 0.0f;
            randomCurveTargetYaw = 0.0f;
            randomCurveTargetPitch = 0.0f;
            randomOffsetYaw = 0.0f;
            randomOffsetPitch = 0.0f;
            return rotation;
        }

        float interpolationFactor = getRandomizationInterpolationFactor();
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
        float strength = getRandomizationStrengthFactor();
        if (strength <= 1.0E-4f) {
            return 0.0f;
        }
        float interpolationDamp = 1.0f - (getRandomizationInterpolationFactor() * 0.7f);
        float pitchNoise = randomCurvePitch * currentPattern.pitchNoiseCurveFactor()
                + (float) Math.sin(now / currentPattern.pitchNoiseSinePeriodMs()) * currentPattern.pitchNoiseSineAmplitude() * strength * interpolationDamp;
        return MathHelper.clamp(pitchNoise, -currentPattern.pitchNoiseClamp(), currentPattern.pitchNoiseClamp());
    }

    public long generateRandomPattern(boolean notifyInChat) {
        RandomPattern nextPattern = createMostDistinctPattern();
        applyPattern(nextPattern);
        rememberPattern(nextPattern);
        currentPatternId++;

        if (notifyInChat) {
            sendMessage("AimBot: сгенерирован новый паттерн рандомизации #" + currentPatternId + ".");
        }
        return currentPatternId;
    }

    public void configureAutoRefresh(int seconds, boolean notifyInChat) {
        int clampedSeconds = MathHelper.clamp(seconds, 0, 3600);
        autoRefreshSeconds = clampedSeconds;

        if (clampedSeconds <= 0) {
            autoRefreshIntervalMs = 0L;
            nextAutoRefreshAtMs = 0L;
            if (notifyInChat) {
                sendMessage("AimBot: autorefresh отключен.");
            }
            return;
        }

        autoRefreshIntervalMs = clampedSeconds * 1000L;
        nextAutoRefreshAtMs = System.currentTimeMillis() + autoRefreshIntervalMs;
        if (notifyInChat) {
            sendMessage("AimBot: autorefresh включен, каждые " + clampedSeconds + " сек.");
        }
    }

    public int getAutoRefreshSeconds() {
        return autoRefreshSeconds;
    }

    public void applyAutoRefreshConfig(AimBotAutoRefreshConfig config) {
        configureAutoRefresh(config == null ? 0 : config.seconds(), false);
    }

    public long getCurrentPatternId() {
        return currentPatternId;
    }

    private float getRandomizationStrengthFactor() {
        return MathHelper.clamp(randomizationStrength.get(), randomizationStrength.min, randomizationStrength.max);
    }

    private float getRandomizationInterpolationFactor() {
        return MathHelper.clamp(randomizationInterpolation.get(), randomizationInterpolation.min, randomizationInterpolation.max);
    }

    private void handleAutoRefresh() {
        int seconds = getAutoRefreshSeconds();
        if (seconds <= 0) {
            return;
        }

        long intervalMs = seconds * 1000L;

        long now = System.currentTimeMillis();
        if (nextAutoRefreshAtMs <= 0L) {
            autoRefreshIntervalMs = intervalMs;
            nextAutoRefreshAtMs = now + intervalMs;
            return;
        }

        if (now >= nextAutoRefreshAtMs) {
            generateRandomPattern(false);
            autoRefreshIntervalMs = intervalMs;
            nextAutoRefreshAtMs = now + intervalMs;
        }
    }

    private void trySendInstructionHint() {
        if (!sendInstruction.get()) {
            return;
        }

        if (mc.world != null && mc.world != lastWorldRef) {
            lastWorldRef = mc.world;
            if (!sessionWorldInstructionShown) {
                sessionWorldInstructionShown = true;
                sendMessage("AimBot: подсказка - .aimbot generate создает новый паттерн, .aimbot autorefresh <сек> обновляет его автоматически.");
            }
        }

        if (pendingEnableInstructionHint && !sessionEnableInstructionShown) {
            pendingEnableInstructionHint = false;
            sessionEnableInstructionShown = true;
            sendMessage("AimBot: для смены паттерна используй .aimbot generate. Для автообновления: .aimbot autorefresh <сек>.");
        }
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

    private static int randomRetargetDelayMs(RandomPattern pattern) {
        int minDelay = Math.max(30, pattern.minRetargetDelayMs());
        int maxDelay = Math.max(minDelay + 1, pattern.maxRetargetDelayMs());
        return ThreadLocalRandom.current().nextInt(minDelay, maxDelay + 1);
    }

    private Rotation getTargetRotation(PlayerEntity player, LivingEntity entity, float tickDelta) {
        Vec3d eyePos = player.getCameraPosVec(tickDelta);
        Box box = entity.getBoundingBox();
        double targetY = MathHelper.lerp(tickDelta, entity.lastY, entity.getY()) + (box.getLengthY() * 0.5) - Math.min(0.15, box.getLengthY() * 0.12);
        Vec3d targetPos = new Vec3d(
                MathHelper.lerp(tickDelta, entity.lastX, entity.getX()),
                targetY,
                MathHelper.lerp(tickDelta, entity.lastZ, entity.getZ())
        );

        double deltaX = targetPos.x - eyePos.x;
        double deltaY = targetPos.y - eyePos.y;
        double deltaZ = targetPos.z - eyePos.z;
        double horizontalDistance = Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);

        float yaw = wrapDegrees((float) Math.toDegrees(Math.atan2(deltaZ, deltaX)) - 90.0f);
        float pitch = MathHelper.clamp((float) -Math.toDegrees(Math.atan2(deltaY, horizontalDistance)), -90.0f, 90.0f);
        return new Rotation(yaw, pitch);
    }

    private float getRenderTickDelta() {
        if (mc == null || mc.getRenderTickCounter() == null) {
            return 1.0f;
        }
        return MathHelper.clamp(mc.getRenderTickCounter().getTickProgress(true), 0.0f, 1.0f);
    }

    private void attack() {
        if (mc.player == null || mc.interactionManager == null || target == null) {
            return;
        }

        if (!autoAttack.get()) return;

        if (canPerformCriticals()) {
            if (shouldPlayerFalling(true, attack.getByName("Умные криты").get(), false)) {
                updateAttack();
            }
        } else if (MAIN_ATTACK_TIMER.hasTimeElapsed()) {
            updateAttack();
        }
    }

    private void updateAttack() {
        ClientPlayerEntity player = mc.player;
        LivingEntity currentTarget = target;
        if (player == null || mc.interactionManager == null || currentTarget == null) {
            return;
        }

        double distToBox = distanceToHitbox(player, currentTarget);
        boolean insideTargetHitbox = currentTarget.getBoundingBox().expand(1.0E-4).contains(player.getEyePos());

        if (distToBox > getAttackRange()) {
            return;
        }
        if (!isStrictlyAimingAtHitbox(currentTarget, getAttackRange()) && !insideTargetHitbox) {
            return;
        }
        if (!attack.getByName("Бить через стены").get() && (!canSeeThroughWall(player, currentTarget) || hasGrassOnRay(player, currentTarget))) {
            return;
        }
        if (player.isUsingItem() && !attack.getByName("Бить и есть").get()) {
            return;
        }

        mc.interactionManager.attackEntity(player, currentTarget);
        player.swingHand(Hand.MAIN_HAND);

        long randMs = ThreadLocalRandom.current().nextLong(-2, 2);
        long attackTime = Math.round(attackDelay.get());
        long clickDelayMs = attackTime + (attack.getByName("Рандомизация критов").get() ? randMs : 0);

        MAIN_ATTACK_TIMER.setLastMS(scaleByTps(clickDelayMs));
    }

    private long scaleByTps(long ms) {
        float factor = ServerTPSManager.getInstance().getPreciseTpsFactor();
        return (long) (ms * factor);
    }

    @EventHandler
    public void onSprint(SprintEvent event) {
        if (nullCheck()) {
            return;
        }

        if (sprintType.is("Обход")) {
            if (shouldStopSprinting()) {
                event.cancel();
                event.setSprinting(false);
            } else {
                event.uncancel();
            }
        } else if (sprintType.is("Обычный")) {
            if (shouldStopSprinting()) {
                event.setSprinting(false);
            }
        }
    }

    private boolean shouldStopSprinting() {
        if (mc.player == null || target == null) {
            return false;
        }
        if (mc.player.isOnGround() || mc.player.isSubmergedInWater() || mc.player.isSwimming()) {
            return false;
        }

        boolean attackCheck = shouldPlayerFalling(true, attack.getByName("Умные криты").get(), true);
        if (mc.player.distanceTo(target) > getAttackRange()) {
            return false;
        }

        return attackCheck && (sprintType.is("Обход") || MAIN_ATTACK_TIMER.hasReached(-54));
    }

    private boolean shouldPlayerFalling(boolean onlyCrit, boolean onlySpace, boolean pre) {
        ClientPlayerEntity player = mc.player;
        if (player == null) {
            return false;
        }

        boolean cancelReason = player.isSubmergedInWater()
                || player.isInLava()
                || player.isClimbing()
                || player.hasVehicle()
                || player.getAbilities().flying;

        if (pre ? !MAIN_ATTACK_TIMER.hasReached(-200) : !MAIN_ATTACK_TIMER.hasTimeElapsed()) {
            return false;
        }

        if (isUnderCeiling() && player.isOnGround()) {
            return true;
        }

        boolean onSpace = !mc.options.jumpKey.isPressed() && player.isOnGround() && onlySpace;

        float critFallThreshold = 0.0f;
        if (attack.getByName("Рандомизация критов").get()) {
            critFallThreshold = MathUtil.clamp(ThreadLocalRandom.current().nextFloat(-0.02f, 0.07f), 0, 1);
        }

        boolean critCheck = player.fallDistance > critFallThreshold;

        if (!cancelReason && onlyCrit) {
            return onSpace || (pre ? !mc.player.isOnGround() : critCheck);
        }

        if (target != null && mc.player.distanceTo(target) > getAttackRange()) {
            return false;
        }

        return true;
    }

    private boolean canPerformCriticals() {
        ClientPlayerEntity player = mc.player;
        if (player == null || mc.world == null) {
            return true;
        }
        if (isUnderCeiling()) {
            return true;
        }

        BlockPos feetPos = player.getBlockPos();
        BlockPos headPos = feetPos.up();
        boolean isInCobweb = mc.world.getBlockState(feetPos).isOf(Blocks.COBWEB)
                || mc.world.getBlockState(headPos).isOf(Blocks.COBWEB);

        if (player.getMainHandStack().getItem() instanceof MaceItem || player.isRiding()) {
            return true;
        }

        return !isInCobweb
                && !player.hasStatusEffect(StatusEffects.BLINDNESS)
                && !player.hasStatusEffect(StatusEffects.MINING_FATIGUE)
                && !player.hasStatusEffect(StatusEffects.SLOW_FALLING)
                && !player.hasStatusEffect(StatusEffects.LEVITATION)
                && !player.isSubmergedInWater()
                && !player.isTouchingWater()
                && !player.isInLava()
                && !player.isClimbing();
    }

    private boolean isUnderCeiling() {
        if (mc.player == null || mc.world == null) {
            return false;
        }

        BlockPos pos = mc.player.getBlockPos();
        return mc.world.getBlockState(pos.up(1)).isIn(BlockTags.TRAPDOORS)
                || mc.world.getBlockState(pos.up(2)).isIn(BlockTags.TRAPDOORS)
                || !mc.world.getBlockState(pos.up(2)).isAir();
    }

    private boolean canSeeThroughWall(PlayerEntity player, Entity entity) {
        if (player == null || entity == null || mc.world == null) {
            return false;
        }

        return mc.world.raycast(new RaycastContext(
                player.getEyePos(),
                entity.getEyePos(),
                RaycastContext.ShapeType.COLLIDER,
                RaycastContext.FluidHandling.NONE,
                player
        )).getType() == BlockHitResult.Type.MISS;
    }

    private boolean hasGrassOnRay(PlayerEntity player, Entity entity) {
        if (player == null || entity == null || mc.world == null) {
            return false;
        }

        HitResult outlineHit = mc.world.raycast(new RaycastContext(
                player.getEyePos(),
                entity.getEyePos(),
                RaycastContext.ShapeType.OUTLINE,
                RaycastContext.FluidHandling.NONE,
                player
        ));
        if (outlineHit.getType() != HitResult.Type.BLOCK) {
            return false;
        }

        BlockHitResult blockHit = (BlockHitResult) outlineHit;
        var state = mc.world.getBlockState(blockHit.getBlockPos());
        return state.isOf(Blocks.SHORT_GRASS)
                || state.isOf(Blocks.TALL_GRASS)
                || state.isOf(Blocks.FERN)
                || state.isOf(Blocks.LARGE_FERN)
                || state.isOf(Blocks.DEAD_BUSH)
                || state.isOf(Blocks.SEAGRASS)
                || state.isOf(Blocks.TALL_SEAGRASS)
                || state.isOf(Blocks.KELP)
                || state.isOf(Blocks.KELP_PLANT)
                || state.isOf(Blocks.OAK_FENCE)
                || state.isOf(Blocks.SPRUCE_FENCE)
                || state.isOf(Blocks.BIRCH_FENCE)
                || state.isOf(Blocks.JUNGLE_FENCE)
                || state.isOf(Blocks.ACACIA_FENCE)
                || state.isOf(Blocks.CHERRY_FENCE)
                || state.isOf(Blocks.DARK_OAK_FENCE)
                || state.isOf(Blocks.PALE_OAK_FENCE)
                || state.isOf(Blocks.MANGROVE_FENCE)
                || state.isOf(Blocks.BAMBOO_FENCE)
                || state.isOf(Blocks.CRIMSON_FENCE)
                || state.isOf(Blocks.WARPED_FENCE)
                || state.isOf(Blocks.NETHER_BRICK_FENCE);
    }

    private void markAsBot(PlayerEntity player) {
        if (player == null || bots.contains(player)) {
            return;
        }

        UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + player.getName().getString())
                .getBytes(StandardCharsets.UTF_8));

        if (!player.getUuid().equals(offlineUuid)
                && player instanceof OtherClientPlayerEntity
                && !player.getName().getString().contains("-")) {
            bots.add(player);
        }
    }

    public boolean isBot(PlayerEntity player) {
        return bots.contains(player);
    }

    private boolean isTeamMate(PlayerEntity self, PlayerEntity other) {
        return self != null && other != self && self.isTeammate(other);
    }

    private double targetWeight(PlayerEntity player, LivingEntity entity) {
        double healthPart = 1.0;
        double distancePart = 1.0;
        double fovPart = 1.0;
        double safeMaxDistance = Math.max(getAimRange(), 1.0E-3D);

        if (sort.getByName("Здоровью").get()) {
            healthPart += entity.getHealth() + entity.getAbsorptionAmount();
        }
        if (sort.getByName("Дистанции").get()) {
            distancePart += entity.distanceTo(player) / safeMaxDistance;
        }
        if (sort.getByName("Прицелу").get()) {
            fovPart += fovTo(player, entity) / 180.0;
        }

        return healthPart * distancePart * fovPart;
    }

    private double fovTo(PlayerEntity player, LivingEntity entity) {
        Vec3d playerPos = player.getEyePos();
        Vec3d targetPos = entity.getEyePos();
        Vec3d delta = targetPos.subtract(playerPos);
        if (delta.lengthSquared() < 1.0E-7D) {
            return 0.0D;
        }

        Vec3d toTarget = delta.normalize();
        Vec3d playerLook = player.getRotationVector();
        double dot = playerLook.dotProduct(toTarget);
        return Math.toDegrees(Math.acos(MathHelper.clamp(dot, -1.0, 1.0)));
    }

    private boolean isGuiBlocked() {
        BooleanSetting guiSetting = extra.getByName("Не бить в GUI");
        return guiSetting != null && guiSetting.get() && mc.currentScreen != null && !(mc.currentScreen instanceof BaseClickGui);
    }

    private double distanceToHitbox(PlayerEntity player, LivingEntity entity) {
        Vec3d eyePos = player.getEyePos();
        Box box = entity.getBoundingBox();
        Vec3d closestPoint = new Vec3d(
                MathHelper.clamp(eyePos.x, box.minX, box.maxX),
                MathHelper.clamp(eyePos.y, box.minY, box.maxY),
                MathHelper.clamp(eyePos.z, box.minZ, box.maxZ)
        );
        return eyePos.distanceTo(closestPoint);
    }

    private double getAttackRange() {
        return attackRange.get() == 3.0f ? 2.97f : attackRange.get();
    }

    private double getAimRange() {
        return aimRange.get();
    }

    private boolean isStrictlyAimingAtHitbox(Entity entity, double range) {
        if (mc.player == null || entity == null) {
            return false;
        }

        Vec3d start = mc.player.getEyePos();
        Box targetBox = entity.getBoundingBox();
        if (targetBox.expand(1.0E-4).contains(start)) {
            return true;
        }

        Vec3d direction = Vec3d.fromPolar(mc.player.getPitch(), mc.player.getYaw()).normalize();
        Vec3d end = start.add(direction.multiply(range));
        var hitPoint = targetBox.raycast(start, end);
        if (hitPoint.isEmpty()) {
            return false;
        }

        return start.squaredDistanceTo(hitPoint.get()) <= range * range;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        target = null;
        MAIN_ATTACK_TIMER.reset();
        applyPattern(currentPattern);
        pendingEnableInstructionHint = !sessionEnableInstructionShown;
        autoRefreshIntervalMs = Math.max(0L, (long) getAutoRefreshSeconds() * 1000L);

        if (currentPatternId == 0L) {
            generateRandomPattern(false);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        target = null;
        MAIN_ATTACK_TIMER.reset();
        lastWorldRef = null;
        randomOffsetYaw = 0.0f;
        randomOffsetPitch = 0.0f;
        randomCurveTargetYaw = 0.0f;
        randomCurveTargetPitch = 0.0f;
        appliedPitchNoise = 0.0f;
        pendingEnableInstructionHint = false;
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

    private record Rotation(float yaw, float pitch) {
    }
}
