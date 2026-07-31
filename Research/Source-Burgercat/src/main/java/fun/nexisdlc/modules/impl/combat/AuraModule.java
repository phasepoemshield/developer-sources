package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.entity.EventAttack;
import fun.nexisdlc.client.events.impl.entity.EventMove;
import fun.nexisdlc.client.events.impl.player.RotationEvent;
import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.events.impl.client.OptimizedUpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.eventbus.EventPriority;
import fun.nexisdlc.client.utils.math.time.NewStopWatch;
import fun.nexisdlc.client.utils.player.rotation.CorrectionType;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.server.ServerTPSManager;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.aura.AuraAttackHandler;
import fun.nexisdlc.modules.impl.combat.aura.AuraChecks;
import fun.nexisdlc.modules.impl.combat.aura.AuraShieldBreaker;
import fun.nexisdlc.modules.impl.combat.aura.AuraTargetSelector;
import fun.nexisdlc.modules.impl.combat.aura.elytra.AuraElytraUtils;
import fun.nexisdlc.modules.impl.combat.aura.rotations.*;
import fun.nexisdlc.modules.impl.movement.AutoSprint;
import fun.nexisdlc.modules.impl.player.ElytraMotion;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.sterford.annotations.NativeCall;

import java.util.concurrent.ThreadLocalRandom;

// @hibludnov
@FunctionAdd(name = "Aura", alias = "Aura", category = Category.Combat, description = "Автоматически атакует сущностей вокруг вас")
public class AuraModule extends Function {
    private static final int AURA_ROTATION_PRIORITY = 5;

    @Getter
    private static AuraModule instance;
    private static final long BASE_ATTACK_TIMER_DELAY_MS = 548L;
    private static final long BASE_ATTACK_PROGRESS_DELAY_MS = 548L;
    private static final long HASTE_ATTACK_TIMER_REDUCTION_MS = 70L;
    private static final long FASTEST_ROTATION_INTERVAL_NS = 5_000_000L;

    private final ModeSetting rotationMode = new ModeSetting("Режим ротации",
            "ReallyWorld", "ReallyWorld", "SpookyTime", "FunTime", "Neuro", "Снап");

    public final ModeSetting neuroModel = new ModeSetting("Нейро-модель", "Резкая",
            "Резкая", "Плавная", "Точная")
            .setVisible(() -> "Neuro".equals(rotationMode.get()));

    public final ModeSetting neuroPitchMode = new ModeSetting("Наводка Pitch", "Обычная",
            "Обычная", "Test")
            .setVisible(() -> "Neuro".equals(rotationMode.get()));

    public final BooleanSetting neuroAssist = new BooleanSetting("Ассист наводки", true);
    public final SliderSetting neuroAssistYaw = new SliderSetting("Сила ассиста (Yaw)", 0.15f, 0.0f, 1.0f, 0.01f);
    public final SliderSetting neuroAssistPitch = new SliderSetting("Сила ассиста (Pitch)", 0.20f, 0.0f, 1.0f, 0.01f);

    public final BooleanSetting neuroFovLimit = new BooleanSetting("Ограничение FOV", true);
    public final SliderSetting neuroMaxFov = new SliderSetting("Макс. отклонение°", 8.0f, 1.0f, 45.0f, 0.5f);

    public final SliderSetting neuroMaxStep = new SliderSetting("Скорость Yaw (°/шаг)", 22.0f, 1.0f, 90.0f, 1.0f);
    public final SliderSetting neuroMaxPitchStep = new SliderSetting("Скорость Pitch (°/шаг)", 12.0f, 1.0f, 45.0f, 1.0f);
    public final SliderSetting neuroSmooth = new SliderSetting("Сглаживание", 0.5f, 0.0f, 1.0f, 0.05f);
    public final SliderSetting neuroReactionMs = new SliderSetting("Интервал реакции (мс)", 45.0f, 10.0f, 100.0f, 1.0f);

    public final SliderSetting neuroJitter = new SliderSetting("Хуманизация (дрожь°)", 0.0f, 0.0f, 3.0f, 0.05f);
    public final BooleanSetting neuroSticky = new BooleanSetting("Залипание у цели", false);
    public final SliderSetting neuroStickyMult = new SliderSetting("Сила залипания", 2.0f, 1.0f, 4.0f, 0.1f);
    public final BooleanSetting neuroPredict = new BooleanSetting("Упреждение цели", false);
    public final SliderSetting neuroPredictTicks = new SliderSetting("Сила упреждения", 2.0f, 0.0f, 6.0f, 0.5f);

    public final SliderSetting neuroHitTiming = new SliderSetting("Тайминг удара", 0.85f, 0.0f, 1.0f, 0.05f);
    public final SliderSetting neuroSpeedAfterHit = new SliderSetting("Скорость после удара", 0.5f, 0.0f, 1.0f, 0.05f);
    public final SliderSetting neuroSpeedBeforeHit = new SliderSetting("Скорость перед ударом", 1.0f, 0.0f, 3.0f, 0.05f);
    public final SliderSetting neuroPostHitSmooth = new SliderSetting("Плавность перехода после удара", 0.3f, 0.0f, 1.0f, 0.05f);

    public final SliderSetting snapRandomizationStrengthBeforeHit = new SliderSetting("Snap рандом до удара", 10f, 0f, 16f, 1f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final SliderSetting snapRandomizationStrengthOnHit = new SliderSetting("Snap рандом при ударе", 10f, 0f, 16f, 1f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final SliderSetting snapLerpBeforeHit = new SliderSetting("Snap плавность до удара", 1f, 0f, 1f, 0.1f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final SliderSetting snapLerpOnHit = new SliderSetting("Snap плавность при ударе", 1f, 0f, 1f, 0.1f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final SliderSetting snapFovSetting = new SliderSetting("Snap FOV", 40f, 0f, 180f, 1f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final SliderSetting snapHitTiming = new SliderSetting("Snap тайминг удара", 0.7f, 0f, 1f, 0.05f)
            .setVisible(() -> "Снап".equals(rotationMode.get()));
    public final BooleanSetting snapBypass = new BooleanSetting("Обход", false)
            .setVisible(() -> "Снап".equals(rotationMode.get()));

    // FunTime settings
    public final SliderSetting funTimeFov = new SliderSetting("FunTime FOV отводки", 40f, 0f, 180f, 1f)
            .setVisible(() -> "FunTime".equals(rotationMode.get()));

    public static final ModeListSetting targets = new ModeListSetting("Цели",
            new BooleanSetting("Игроки", true),
            new BooleanSetting("Игроки без брони", true),
            new BooleanSetting("Тиммейты", false),
            new BooleanSetting("Невидимые", true),
            new BooleanSetting("Боты", false),
            new BooleanSetting("Мобы", true),
            new BooleanSetting("Животные", false));

    private final BooleanSetting attackThroughBlocks = new BooleanSetting("Через блоки", false);

    public final ModeListSetting attack = new ModeListSetting("Атака",
            new BooleanSetting("Ломать щит", false),
            new BooleanSetting("Во время еды", false));

    private final SliderSetting attackRange = new SliderSetting("Дистанция атаки", 3.0f, 2.0f, 6.0f, 0.1f);
    private final BooleanSetting increaseRangeInBlocks = new BooleanSetting("Увеличить дистанцию в блоках", false);
    private final SliderSetting rangeIncreaseAmount = new SliderSetting("На сколько увеличить", 1.0f, 0.1f, 3.0f, 0.1f);

    private final ModeSetting clickMode = new ModeSetting("Режим клика", "1.9", "1.9", "1.8");
    private final SliderSetting minCps = new SliderSetting("Мин. CPS", 7.0f, 1.0f, 20.0f, 0.5f);
    private final SliderSetting maxCps = new SliderSetting("Макс. CPS", 11.0f, 1.0f, 20.0f, 0.5f);
    private final BooleanSetting tpsSynchronization = new BooleanSetting("Синхронизация TPS", true);
    private final BooleanSetting fasterRotate = new BooleanSetting("Быстрая ротация", true);
    private final ModeSetting attackSpeedMode = new ModeSetting("Скорость атаки", "Медленная", "Медленная", "Быстрая", "Самая быстрая");
    private final BooleanSetting smartCrits = new BooleanSetting("Умные криты", false);
    private final ModeSetting sprintResetMode = new ModeSetting("Сброс спринта", "Обычный", "Выкл", "Обычный", "SpookyTime");
    private final ModeSetting correctionType = new ModeSetting("Тип коррекции", "Таргетированная", "Свободный", "Таргетированная");

    private final ModeSetting raytraceMode = new ModeSetting("Режим рейтрейса", "Всегда", "Всегда", "Умный");
    private final BooleanSetting raytraceWhenFlying = new BooleanSetting("Проверка при полёте", true);
    private final BooleanSetting raytraceWhenSwimming = new BooleanSetting("Проверка при плавании", true);
    private final BooleanSetting raytraceWhenMoving = new BooleanSetting("Проверка при движении", true);

    private final BooleanSetting autoMove = new BooleanSetting("Авто движение", false);

    @Setter
    @Getter
    public static LivingEntity target = null;
    public static LivingEntity subconsciousTarget = null;

    public volatile long lastAttackTime = 0;
    private volatile long sprintResetUntil = 0;
    private long lastTargetActiveTime = 0;
    private int nextCpsDelay = 0;
    @Getter
    public boolean firstAttack = true;
    private long snapBypassUntil = 0;
    private RotateVector headVector = new RotateVector(0f, 0f);
    private LivingEntity lastRotationTarget = null;
    private volatile float cachedAttackCooldown = 1.0f;
    private volatile long cachedTimeUntilNextAttack = 0L;
    private volatile long lastFastestRotationNs = 0L;
    private boolean autoMoveActive = false;
    public boolean shouldPredict = false;

    // FunTime rotation state
    public boolean needReset = false;
    public static volatile boolean canAttack = false;
    private int funTimeAttackCounter = 0;
    private int funTimeNextMaxValue = 17;

    private final RotationController rotationController = new RotationController();
    private final AuraAttackHandler attackHandler = new AuraAttackHandler(this);

    public static NewStopWatch elytraTargetTimer = new NewStopWatch();

    public AuraModule() {
        instance = this;
        minCps.setVisible(() -> isLegacyClickMode());
        maxCps.setVisible(() -> isLegacyClickMode());

        neuroAssist.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroAssistYaw.setVisible(() -> "Neuro".equals(rotationMode.get()) && neuroAssist.get());
        neuroAssistPitch.setVisible(() -> "Neuro".equals(rotationMode.get()) && neuroAssist.get());
        neuroFovLimit.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroMaxFov.setVisible(() -> "Neuro".equals(rotationMode.get()) && neuroFovLimit.get());
        neuroMaxStep.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroMaxPitchStep.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroSmooth.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroReactionMs.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroJitter.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroSticky.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroStickyMult.setVisible(() -> "Neuro".equals(rotationMode.get()) && neuroSticky.get());
        neuroPredict.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroPredictTicks.setVisible(() -> "Neuro".equals(rotationMode.get()) && neuroPredict.get());
        neuroHitTiming.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroSpeedAfterHit.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroSpeedBeforeHit.setVisible(() -> "Neuro".equals(rotationMode.get()));
        neuroPostHitSmooth.setVisible(() -> "Neuro".equals(rotationMode.get()));

        rangeIncreaseAmount.setVisible(() -> increaseRangeInBlocks.get());
        raytraceWhenFlying.setVisible(() -> "Умный".equals(raytraceMode.get()));
        raytraceWhenSwimming.setVisible(() -> "Умный".equals(raytraceMode.get()));
        raytraceWhenMoving.setVisible(() -> "Умный".equals(raytraceMode.get()));

        addSettings(
                rotationMode, neuroModel, neuroPitchMode, neuroAssist, neuroAssistYaw, neuroAssistPitch, neuroFovLimit, neuroMaxFov,
                neuroMaxStep, neuroMaxPitchStep, neuroSmooth, neuroReactionMs, neuroJitter, neuroSticky, neuroStickyMult, neuroPredict,
                neuroPredictTicks, neuroHitTiming, neuroSpeedAfterHit, neuroSpeedBeforeHit, neuroPostHitSmooth, snapRandomizationStrengthBeforeHit,
                snapRandomizationStrengthOnHit, snapLerpBeforeHit, snapLerpOnHit, snapFovSetting, snapHitTiming, snapBypass, funTimeFov, targets,
                attackThroughBlocks, attack, attackRange, increaseRangeInBlocks, rangeIncreaseAmount, clickMode, minCps, maxCps, tpsSynchronization,
                fasterRotate, attackSpeedMode, smartCrits, sprintResetMode, correctionType, raytraceMode, raytraceWhenFlying, raytraceWhenSwimming,
                raytraceWhenMoving, autoMove
        );
    }

    @Override
    public void onEnable() {
        super.onEnable();
        target = null;
        subconsciousTarget = null;
        firstAttack = true;
        lastRotationTarget = null;
        if (mc.player != null) {
            headVector = new RotateVector(mc.player.getYaw(), mc.player.getPitch());
        }

        sprintResetUntil = 0;
        cachedAttackCooldown = 1.0f;
        cachedTimeUntilNextAttack = 0L;
        lastFastestRotationNs = 0L;
        funTimeAttackCounter = 0;
        funTimeNextMaxValue = 17;
        updateAttackCooldownCache();

        SnapRotation.snapIdle = false;
        rotationController.setRotationMode(rotationMode.get());
        rotationController.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        boolean hadTargetRecently = (System.currentTimeMillis() - lastTargetActiveTime) <= 500L;
        if ((hadTargetRecently || RotationTask.isRotating()) && RotationTask.rotationPriority <= AURA_ROTATION_PRIORITY) {
            RotationTask.rotationState = RotationTask.RotationState.RESET;
            RotationTask.returnStartTime = System.currentTimeMillis() - 460;
            RotationTask.rotationPriority = 0;
            RotationTask.inactiveMs = 0L;
            RotationTask.needSmoothReset = true;
        } else {
            RotationTask.remove("aura");
        }
        target = null;
        subconsciousTarget = null;
        firstAttack = true;
        lastRotationTarget = null;
        if (mc.player != null) {
            headVector = new RotateVector(mc.player.getYaw(), mc.player.getPitch());
        }

        sprintResetUntil = 0;
        cachedAttackCooldown = 1.0f;
        cachedTimeUntilNextAttack = 0L;
        lastFastestRotationNs = 0L;
        funTimeAttackCounter = 0;

        rotationController.onDisable();
    }

    @EventHandler
    public void onUpdate(TickEvent event) {
        if (!isState()) return;
        if (mc.player == null || mc.world == null) return;

        updateAttackCooldownCache();

        if (target != null && target.isAlive()) {
            if (target.handSwinging) elytraTargetTimer.reset();

            lastTargetActiveTime = System.currentTimeMillis();

            if (!shouldUseFastestRotation()) {
                applyAuraRotationMode(false);
            }

            canAttack = canAttack() && canAttackTarget();
            needReset = System.currentTimeMillis() - lastAttackTime > 395;

            if ("Быстрая".equals(attackSpeedMode.get())) {
                attackHandler.tryAttackCurrentTarget(mc, target);
            }

        } else {
            firstAttack = true;

            lastRotationTarget = null;
            headVector.setYaw(mc.player.getYaw());
            headVector.setPitch(mc.player.getPitch());
            startSmoothAuraReset();
        }
    }

    @EventHandler
    public void onOptimizedUpdate(OptimizedUpdateEvent event) {
        if (nullCheck()) return;

        AntiBotSystem.scanWorld(mc.world);

        if (!isCurrentTargetValid()) {
            AuraTargetSelector.TargetResult result = AuraTargetSelector.selectTargets(mc, this);
            target = result.mainTarget;
            subconsciousTarget = result.subconsciousTarget;
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        if (!mc.player.isAlive()) this.setState(false);

        if (!nullCheck()) {
            if (Nexis.getFunctionManager().getElytraMotion().isState() && target != null && mc.player.isGliding()) {
                Vec3d targetPos = target.getBoundingBox().getCenter();
                Vec3d glidingVelocity = AuraElytraUtils.calcGlidingVelocityPredicted(target, target.getVelocity(), 0.15f);
                Vec3d predictedTargetPos = targetPos.add(glidingVelocity);
                double distanceToPredictedPos = mc.player.getEntityPos().distanceTo(predictedTargetPos);

                shouldPredict = distanceToPredictedPos > (double) ElytraMotion.elytraMotionDistance.get();
            }

            if (isState() && target != null && target.isAlive() && "Медленная".equals(attackSpeedMode.get())) {
                attackHandler.tryAttackCurrentTarget(mc, target);
            }
        }

        updateAutoMove();
    }

    private void updateAutoMove() {
        if (!isState()) return;
        if (mc.player == null || !autoMove.get()) {
            if (autoMoveActive) {
                stopAutoMove();
                autoMoveActive = false;
            }
            return;
        }

        if (target != null && target.isAlive()) {
            handleAutoMove();
            autoMoveActive = true;
        } else if (autoMoveActive) {
            stopAutoMove();
            autoMoveActive = false;
        }
    }

    @EventHandler
    public void onFastest(FastestEvent event) {
        if (!isState() || mc.player == null) return;

        if (!shouldRunFastestRotation()) {
            return;
        }

        if (shouldUseFastestRotation() && target != null && target.isAlive()) {
            applyAuraRotationMode(true);
        }

        if (target != null && target.isAlive()) {
            canAttack = canAttack() && canAttackTarget();
            needReset = System.currentTimeMillis() - lastAttackTime > 395;
        }

        if ("Самая быстрая".equals(attackSpeedMode.get()) && (System.currentTimeMillis() - lastAttackTime >= 50L)) {
            attackHandler.tryAttackCurrentTarget(mc, target);
        }
    }

    @EventHandler
    public void onSprint(SprintEvent event) {
        if (!isState() || mc.player == null) return;
        if ("Выкл".equals(sprintResetMode.get())) return;

        if (mc.player.isSubmergedInWater() || mc.player.isSwimming()) {
            return;
        }

        if ("SpookyTime".equals(sprintResetMode.get()) && target != null) {
            event.cancel();
            event.setSprinting(false);
            return;
        }

        if ("Обычный".equals(sprintResetMode.get())) {
            setSprinting(event);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMove(EventMove e) {
        if (nullCheck())
            return;

        if (Nexis.getFunctionManager().getElytraMotion().isState() && target != null && mc.player.isGliding()) {
            if (!shouldPredict) {
                e.cancel();
                e.setMovement(Vec3d.ZERO);
            }
        }
    }

    @EventHandler
    public void onAttackSwing(EventAttack.Swing e) {
        if (nullCheck()) return;
        if (target == null) return;

        if ("Neuro".equals(rotationMode.get())) {
            NeuroRotation.randomizeHitTiming();
        }

        if ("FunTime".equals(rotationMode.get())) {
            FunTimeRotation.funTimeFov = funTimeFov.get() * ThreadLocalRandom.current().nextFloat(0.6f, 1.1f);

            if (!firstAttack) {
                funTimeAttackCounter++;
                if (funTimeAttackCounter > funTimeNextMaxValue) {
                    funTimeAttackCounter = 0;
                    funTimeNextMaxValue = ThreadLocalRandom.current().nextInt(15, 19);
                }
            }
        }
    }

    @NativeCall
    private void setSprinting(SprintEvent event) {
        boolean hardCollision = (mc.player.horizontalCollision && !mc.player.collidedSoftly) || AuraChecks.hasAnySideCollision(mc);

        if (hardCollision) {
            event.setSprinting(false);
        }

        float cooldown = 0.8f;

        if ((firstAttack && !mc.player.isOnGround() && mc.player.getVelocity().getY() < -0.073 && subconsciousTarget != null) && getAttackCooldown() > cooldown) {
            event.setSprinting(false);
        }

        if ((!mc.player.isOnGround()) && target != null && getAttackCooldown() > cooldown) {
            event.setSprinting(false);
        }

        if (!hardCollision && mc.player.forwardSpeed > 0 && !mc.player.isSprinting()) {
            mc.options.sprintKey.setPressed(true);
        }
    }


    private boolean canAttack() {
        long now = System.currentTimeMillis();

        if (now - lastAttackTime < getAttackTimerDelay()) return false;

        if (isLegacyClickMode()) {
            if (now - lastAttackTime < nextCpsDelay) return false;
            double cps = randomCps();
            cps += ThreadLocalRandom.current().nextInt(-4, 2);
            cps = Math.max(1.0, cps);
            nextCpsDelay = (int) scaleByTps(Math.max(1L, Math.round(1000.0 / cps)));
            return true;
        } else {
            float cooldownThreshold = AuraChecks.isHoldingCombatWeapon(mc)
                    ? getTpsScaledCooldownThreshold(0.85f)
                    : 0.85f;
            if (AuraChecks.isHoldingCombatWeapon(mc) && cachedAttackCooldown < cooldownThreshold) return false;
            if (now - lastAttackTime < scaleByTps(50L)) return false;

            if (cachedTimeUntilNextAttack > 0) return false;

            return true;
        }
    }

    private long getAttackTimerDelay() {
        return scaleByTps(Math.max(0L, BASE_ATTACK_TIMER_DELAY_MS - getHasteAttackTimerReduction()));
    }

    private long getAttackProgressDelay() {
        return scaleByTps(Math.max(1L, BASE_ATTACK_PROGRESS_DELAY_MS - getHasteAttackTimerReduction()));
    }

    private long getHasteAttackTimerReduction() {
        if (mc.player == null) {
            return 0L;
        }

        var haste = mc.player.getStatusEffect(StatusEffects.HASTE);
        if (haste == null) {
            return 0L;
        }

        return (long) (haste.getAmplifier() + 1) * HASTE_ATTACK_TIMER_REDUCTION_MS;
    }


    private boolean canAttackTarget() {
        if (target == null) return false;

        if (!attack.getByName("Во время еды").get() && mc.player.isUsingItem() && !AuraShieldBreaker.isUsingShield(mc)) {
            return false;
        }

        return true;
    }


    private double randomCps() {
        double min = minCps.get();
        double max = maxCps.get();
        if (min > max) {
            double t = min;
            min = max;
            max = t;
        }
        if (Math.abs(max - min) < 0.0001) {
            return min;
        }
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static boolean isLegacyClickMode() {
        return instance != null && "1.8".equals(instance.clickMode.get());
    }

    public static float getNormalizedAttackCooldown() {
        if (instance == null || instance.mc.player == null) {
            return 1.0f;
        }
        instance.updateAttackCooldownCache();
        float cd = instance.cachedAttackCooldown;
        if (isLegacyClickMode()) {
            float avgCps = (instance.minCps.get() + instance.maxCps.get()) / 2.0f;
            if (avgCps <= 0.1f) return 1.0f;
            float intervalMs = 1000.0f / avgCps;
            long hasteReduction = 0L;
            var haste = instance.mc.player.getStatusEffect(StatusEffects.HASTE);
            if (haste != null) {
                hasteReduction = (long) (haste.getAmplifier() + 1) * HASTE_ATTACK_TIMER_REDUCTION_MS;
            }
            long progressDelay = Math.max(1L, BASE_ATTACK_PROGRESS_DELAY_MS - hasteReduction);
            float scale = (float) progressDelay / intervalMs;
            return MathHelper.clamp(cd * scale, 0.0f, 1.0f);
        }
        return MathHelper.clamp(cd, 0.0f, 1.0f);
    }

    private long scaleByTps(long ms) {
        if (!tpsSynchronization.get()) {
            return ms;
        }
        float factor = ServerTPSManager.getInstance().getPreciseTpsFactor();
        return Math.max(1L, Math.round(ms * factor));
    }

    /**
     * При низком TPS серверу нужно больше тиков для восстановления кулдауна.
     * Повышаем порог: например, при 15 TPS и базовом пороге 0.85
     * эффективный порог = 0.85 * (20/15) = 1.13 → ограниченный до 0.95.
     * Это гарантирует, что мы не атакуем раньше, чем сервер готов.
     */
    private float getTpsScaledCooldownThreshold(float baseThreshold) {
        if (!tpsSynchronization.get()) {
            return baseThreshold;
        }
        float tps = ServerTPSManager.getInstance().getPreciseTps();
        if (tps >= 19.8f) {
            return baseThreshold;
        }
        float factor = 20.0f / Math.max(tps, 10.0f);
        // Ограничиваем, чтобы порог не превышал 0.95 (иначе атака станет невозможной)
        return Math.min(0.95f, baseThreshold * factor);
    }

    public boolean canDealCrit() {
        if (mc.player.isOnGround() && smartCrits.get() && !mc.options.jumpKey.isPressed()) return true;
        return mc.player.fallDistance > getCritThreshold();
    }

    public float getCritThreshold() {
        return 0;
    }

    private boolean shouldBypassCritCheck() {
        return mc.player.isTouchingWater()
                || mc.player.isInLava()
                || mc.player.isClimbing()
                || AuraChecks.isInCobweb(mc)
                || mc.player.hasStatusEffect(StatusEffects.BLINDNESS)
                || mc.player.hasStatusEffect(StatusEffects.MINING_FATIGUE)
                || mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
                || mc.player.hasStatusEffect(StatusEffects.LEVITATION)
                || mc.player.getAbilities().flying;
    }


    private void updateAttackCooldownCache() {
        long now = System.currentTimeMillis();

        if (mc.player == null) {
            cachedAttackCooldown = 1.0f;
            cachedTimeUntilNextAttack = 0L;
            return;
        }

        if (AuraChecks.isHoldingCombatWeapon(mc)) {
            float cooldown = mc.player.getAttackCooldownProgress(0.5f);
            cachedAttackCooldown = MathHelper.clamp(cooldown, 0.0f, 1.0f);
            if (cachedAttackCooldown >= 0.83f) {
                cachedTimeUntilNextAttack = 0L;
            } else {
                // Клиентский кулдаун основан на тиках клиента (20 TPS).
                // Если сервер работает медленнее, серверный кулдаун ещё не завершился.
                // Масштабируем оставшееся время на TPS-фактор.
                long rawTime = (long) ((0.83f - cachedAttackCooldown) * 1000.0f);
                cachedTimeUntilNextAttack = scaleByTps(rawTime);
            }
            return;
        }

        long timeSinceLastAttack = now - lastAttackTime;
        long progressDelay = getAttackProgressDelay();
        cachedAttackCooldown = Math.min(1.0f, (float) timeSinceLastAttack / progressDelay);
        cachedTimeUntilNextAttack = Math.max(0L, progressDelay - timeSinceLastAttack);
    }

    private boolean shouldRunFastestRotation() {
        long now = System.nanoTime();
        if (now - lastFastestRotationNs < FASTEST_ROTATION_INTERVAL_NS) {
            return false;
        }

        lastFastestRotationNs = now;
        return true;
    }


    private void forceStopSprintForReset() {
        if (mc.player == null) {
            return;
        }

        mc.options.sprintKey.setPressed(false);
        if (mc.player.isSprinting()) {
            mc.player.setSprinting(false);
        }
    }

    private void applyAuraRotationMode(boolean fastestContext) {
        if (mc.player == null || target == null || !target.isAlive()) {
            lastRotationTarget = null;
            startSmoothAuraReset();
            return;
        }

        if ("Снап".equals(rotationMode.get()) && SnapRotation.snapIdle) {
            boolean targetChanged = lastRotationTarget != target;
            float yawDiff = Math.abs(MathHelper.wrapDegrees(mc.player.getYaw() - headVector.getYaw()));
            float pitchDiff = Math.abs(mc.player.getPitch() - headVector.getPitch());
            if (!targetChanged && yawDiff < 5f && pitchDiff < 5f) {
                return;
            }
            headVector.setYaw(mc.player.getYaw());
            headVector.setPitch(mc.player.getPitch());
            SnapRotation.snapIdle = false;
        }

        if ("Neuro".equals(rotationMode.get())) {
            NeuroRotation.selectedModel = mapNeuroModel(neuroModel.get());
            NeuroRotation.assistEnabled = neuroAssist.get();
            NeuroRotation.assistYaw = neuroAssistYaw.get();
            NeuroRotation.assistPitch = neuroAssistPitch.get();
            NeuroRotation.fovLimitEnabled = neuroFovLimit.get();
            NeuroRotation.maxFov = neuroMaxFov.get();
            NeuroRotation.cfgMaxStep = neuroMaxStep.get() * 3f;
            NeuroRotation.cfgMaxPitchStep = neuroMaxPitchStep.get();
            NeuroRotation.cfgSmooth = neuroSmooth.get();
            NeuroRotation.cfgStepNs = (long) (neuroReactionMs.get() * 0_100_000.0f);
            NeuroRotation.jitterDeg = neuroJitter.get();
            NeuroRotation.stickyEnabled = neuroSticky.get();
            NeuroRotation.stickyMult = neuroStickyMult.get();
            NeuroRotation.predictEnabled = neuroPredict.get();
            NeuroRotation.predictTicks = neuroPredictTicks.get();
            NeuroRotation.cfgHitTiming = neuroHitTiming.get();
            NeuroRotation.cfgSpeedAfterHit = neuroSpeedAfterHit.get();
            NeuroRotation.cfgSpeedBeforeHit = neuroSpeedBeforeHit.get();
            NeuroRotation.cfgPostHitSmooth = neuroPostHitSmooth.get();
            NeuroRotation.pitchMode = neuroPitchMode.get();
        }

        if ("Снап".equals(rotationMode.get())) {
            SnapRotation.snapRandomizationStrengthBeforeHit = snapRandomizationStrengthBeforeHit.get();
            SnapRotation.snapRandomizationStrengthOnHit = snapRandomizationStrengthOnHit.get();
            SnapRotation.snapLerpBeforeHit = snapLerpBeforeHit.get();
            SnapRotation.snapLerpOnHit = snapLerpOnHit.get();
            SnapRotation.snapFovSetting = snapFovSetting.get();
            SnapRotation.snapHitTiming = snapHitTiming.get();
            SnapRotation.snapBypassEnabled = snapBypass.get();
            SnapRotation.snapBypassUntil = snapBypassUntil;
        }

        String currentMode = rotationMode.get();
        if (!rotationController.getCurrentMode().equals(currentMode)) {
            rotationController.setRotationMode(currentMode);
        }

        // Реакквизиция: цель сменилась (была null/другая). Сидим голову реальными
        // углами игрока и чистим внутреннее сглаживание модели, иначе первый кадр
        // наведётся со старого угла прошлого таргета.
        boolean targetReacquired = (lastRotationTarget != target);
        if (targetReacquired) {
            // Любая незавершённая ротация (активное наведение на старую цель ИЛИ
            // плавный ресет после выкл/потери цели) — продолжаем с ТЕКУЩЕГО
            // визуального угла головы, а не прыгаем на mc.player getYaw/getPitch.
            // Иначе при вкл/смене/возврате цели наведение стартует "с нуля".
            boolean resumeFromCurrent = RotationTask.isRotating();
            float seedYaw = resumeFromCurrent ? RotationTask.visualHeadYaw : mc.player.getYaw();
            float seedPitch = resumeFromCurrent ? RotationTask.visualHeadPitch : mc.player.getPitch();

            headVector.setYaw(seedYaw);
            headVector.setPitch(seedPitch);

            // Сбрасываем внутреннее сглаживание модели ТОЛЬКО при старте "с нуля"
            // (голова уже у игрока). Если ротация ещё идёт (aim/reset) — НЕ сбрасываем,
            // иначе onEnable модели заново сидит её на mc.player getYaw/getPitch и наведение
            // стартует от углов игрока, а не от текущего угла головы.
            if (!resumeFromCurrent) {
                RotateModel activeModel = rotationController.getCurrentRotation();
                if (activeModel != null) {
                    activeModel.onDisable();
                    activeModel.onEnable();
                }
            }

            lastRotationTarget = target;
        }

        RotateVector baseRotation;
        if (targetReacquired) {
            // Стартуем с угла, на котором уже сидит голова: либо реальные углы
            // игрока, либо текущий угол прерванного ресета (см. выше).
            baseRotation = new RotateVector(headVector.getYaw(), headVector.getPitch());
        } else if (fastestContext) {
            baseRotation = new RotateVector(headVector.getYaw(), headVector.getPitch());
        } else {
            baseRotation = RotationTask.isRotating()
                    ? new RotateVector(RotationTask.visualHeadYaw, RotationTask.visualHeadPitch)
                    : new RotateVector(headVector.getYaw(), headVector.getPitch());
        }

        RotateVector newRotation = rotationController.update(baseRotation, target);

        if (newRotation != null) {
            headVector.setYaw(newRotation.getYaw());
            headVector.setPitch(newRotation.getPitch());

            RotationTask.create("aura", 100);
            RotationTask.setTargetRotation(
                    newRotation.getYaw(),
                    newRotation.getPitch(),
                    Float.MAX_VALUE,
                    Float.MAX_VALUE,
                    220f,
                    180f,
                    0,
                    AURA_ROTATION_PRIORITY,
                    -1L
            );
            RotationTask.needSmoothReset = true;
        }
    }

    private String mapNeuroModel(String label) {
        switch (label) {
            case "Плавная":
                return "smooth";
            case "Точная":
                return "precise";
            default:
                return "sharp"; // Резкая
        }
    }

    private boolean shouldUseFastestRotation() {
        if ("FunTime".equals(rotationMode.get()) || "SpookyTime".equals(rotationMode.get())) {
            return true;
        }
        if ("Neuro".equals(rotationMode.get())) return true; // fastest-путь применяет голову, как FunTime
        return fasterRotate.get();
    }

    private void startSmoothAuraReset() {
        if (RotationTask.rotationPriority > AURA_ROTATION_PRIORITY) {
            RotationTask.remove("aura");
            return;
        }

        if (!RotationTask.isRotating()) {
            RotationTask.remove("aura");
            return;
        }
        if (RotationTask.rotationState == RotationTask.RotationState.RESET) {
            return;
        }

        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 460;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
    }

    @EventHandler
    public void onRotation(RotationEvent event) {
        if (mc.player == null || !isState()) {
            return;
        }

        if (target != null && target.isAlive()) {
            CorrectionType type = "Таргетированная".equals(correctionType.get())
                    ? CorrectionType.TARGET
                    : CorrectionType.FREE;

            if (type == CorrectionType.TARGET) {
                event.rotate(headVector.getYaw(), headVector.getPitch(), type, target, RotationTask.calculateTargetYawForMovement(target));
            } else {
                event.rotate(headVector.getYaw(), headVector.getPitch(), type, target);
            }
            return;
        }

        event.rotate(mc.player.getYaw(), mc.player.getPitch(), CorrectionType.FREE);
    }

    public static boolean isSmartCritsEnabled() {
        return instance != null && instance.smartCrits.get();
    }

    public boolean isAttackThroughBlocksEnabled() {
        return attackThroughBlocks.get();
    }

    public double getEffectiveAttackRange() {
        double baseRange = attackRange.get();
        if (increaseRangeInBlocks.get() && AuraChecks.isPlayerInBlocks(mc)) {
            baseRange = baseRange + rangeIncreaseAmount.get();
        }
        return baseRange - 0.38f;
    }

    public double getEffectiveSearchRange() {
        double baseRange = attackRange.get();
        if (increaseRangeInBlocks.get() && AuraChecks.isPlayerInBlocks(mc)) {
            baseRange = baseRange + rangeIncreaseAmount.get();
        }

        if (mc.player.isGliding()) {
            baseRange = 35;
        }

        return baseRange + 0.25f;
    }


    public static float getAttackCooldown() {
        if (instance == null || instance.mc.player == null) {
            return 1.0f;
        }

        // Важно для RotationRecorder:
        // Aura может быть выключена/кэш может быть stale.
        // Перед чтением обновляем live cooldown.
        instance.updateAttackCooldownCache();

        return MathHelper.clamp(instance.cachedAttackCooldown, 0.0f, 1.0f);
    }

    private float getRaytraceYaw() {
        if (RotationTask.isRotating()) {
            return RotationTask.visualHeadYaw;
        }
        return mc.player != null ? mc.player.getYaw() : 0.0f;
    }

    private float getRaytracePitch() {
        if (RotationTask.isRotating()) {
            return RotationTask.visualHeadPitch;
        }
        return mc.player != null ? mc.player.getPitch() : 0.0f;
    }

    public boolean canAttackNow() {
        return canAttack();
    }

    public boolean canAttackTargetNow() {
        return canAttackTarget();
    }

    public boolean shouldBypassCritCheckForAttack() {
        return shouldBypassCritCheck();
    }

    public String getRaytraceMode() {
        return raytraceMode.get();
    }

    public boolean isRaytraceWhenFlyingEnabled() {
        return raytraceWhenFlying.get();
    }

    public boolean isRaytraceWhenSwimmingEnabled() {
        return raytraceWhenSwimming.get();
    }

    public boolean isRaytraceWhenMovingEnabled() {
        return raytraceWhenMoving.get();
    }

    public boolean isSnapBypassEnabled() {
        return snapBypass.get();
    }

    public String getRotationModeLabel() {
        return rotationMode.get();
    }

    public float getRaytraceYawForAttack() {
        return getRaytraceYaw();
    }

    public float getRaytracePitchForAttack() {
        return getRaytracePitch();
    }

    public boolean shouldUseExactSnapOnAttack() {
        return "Снап".equals(rotationMode.get()) && snapHitTiming.get() >= 0.999f;
    }


    public void onAttackPerformedByHandler(long attackTime) {
        lastAttackTime = attackTime;
        if ("Снап".equals(rotationMode.get()) && snapBypass.get()) {
            snapBypassUntil = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(100L, 171L);
            SnapRotation.snapIdle = false;
        }
        cachedAttackCooldown = 0.0f;
        cachedTimeUntilNextAttack = getAttackProgressDelay();
        firstAttack = false;

        AutoSprint autoSprint = AutoSprint.getInstance();

        if (!"Выкл".equals(sprintResetMode.get())) {
            int duration = 50;
            sprintResetUntil = lastAttackTime + duration;
            if (autoSprint != null && autoSprint.isState()) {
                autoSprint.blockSprintUntil(sprintResetUntil);
            }
            forceStopSprintForReset();
        }

        if (autoSprint != null && autoSprint.isState()) {
            autoSprint.onAttackPerformed();
        }

    }

    private boolean isCurrentTargetValid() {
        if (target == null) return false;
        if (!target.isAlive()) return false;
        if (mc.player == null) return false;
        if (target instanceof PlayerEntity player && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString()))
            return false;

        double safeRange = getEffectiveAttackRange() + 0.5;
        if (mc.player.distanceTo(target) > safeRange) return false;

        return AuraTargetSelector.isValid(mc, this, target, safeRange * safeRange,
                new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()));
    }

    private void handleAutoMove() {
        if (mc.player == null || target == null) return;

        mc.options.forwardKey.setPressed(true);

        if (getAttackCooldown() > 0.1f) {
            mc.options.jumpKey.setPressed(true);
        }

    }

    private void stopAutoMove() {
        if (mc.options == null) return;
        mc.options.forwardKey.setPressed(false);
        mc.options.jumpKey.setPressed(false);
    }

}
