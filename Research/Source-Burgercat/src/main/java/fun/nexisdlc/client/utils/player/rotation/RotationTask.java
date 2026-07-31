package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.*;
import fun.nexisdlc.client.events.impl.entity.EntityRenderEvent;
import fun.nexisdlc.client.events.impl.player.FixVelocityEvent;
import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.events.impl.player.RotationEvent;
import fun.nexisdlc.client.events.impl.player.TravelRotationEvent;
import fun.nexisdlc.client.utils.baritone.BaritoneRotationHook;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.mixins.accessors.ClientPlayerEntityAccessor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RotationTask implements IMinecraft {
    private static final String BARITONE_TASK_NAME = "baritone_global";
    public static final Map<String, RotationTask> tasks = new ConcurrentHashMap<>();
    private final String name;
    private int priority = 1;
    private static float spoofYaw;
    private static float spoofPitch;


    private static boolean spoofingThisTick;
    private static float packetYaw;
    private static boolean hasPacketYaw;

    public static float visualHeadYaw;
    public static float visualHeadPitch;
    public static float visualPrevHeadYaw;
    public static float visualPrevHeadPitch;
    private static float visualBodyYaw;
    private static float visualPrevBodyYaw;

    public static volatile float renderHeadYaw;
    public static volatile float renderHeadPitch;
    public static volatile float renderPrevHeadYaw;
    public static volatile float renderPrevHeadPitch;
    private static volatile boolean renderRotationActive;

    public static long returnStartTime = 0L;
    private static long returnDurationMs = 800L;
    public static long resetDelayMs = -1L;
    private static boolean instantResetOnReturn = false;
    public static RotationState rotationState = RotationState.IDLE;

    public static float auraSpinYaw = 0f;
    private static float auraPrevSpinYaw = 0f;
    private static float auraSpinBaseYaw = 0f;
    private static float auraSpinProgress = 0f;
    private static int auraSpinDir = 1;
    private static long auraSpinLastTime = 0L;
    private static boolean auraSpinActive = false;
    public static boolean enableVisualSpin = false;
    public static float aimYawSpeed;
    public static float aimPitchSpeed;
    public static float returnYawSpeed = 35f;
    public static float returnPitchSpeed = 28f;
    public static int rotationPriority = 0;
    public static long rotationTimeoutMs = 0L;
    public static long inactiveMs = 0L;
    private static long lastInactiveUpdateMs = 0L;
    public static Rotation desiredRotation;
    public static boolean needSmoothReset = false;
    private static float movementTargetYaw = Float.NaN;
    private static Runnable pendingAfterAimAction;

    private RotationTask(String name) {
        this.name = name;
    }

    public static void init() {
        NexisClient.getEventBus().subscribe(new RotationTask("global"));
    }

    public static boolean isRotating() {
        return rotationState != RotationState.IDLE || (System.currentTimeMillis() - returnStartTime < returnDurationMs);
    }

    public static boolean isRenderRotating() {
        return rotationState == RotationState.AIM;
    }

    public static boolean isRenderResetting() {
        return rotationState == RotationState.RESET;
    }

    private static void setRenderRotation(float yaw, float pitch) {
        renderPrevHeadYaw = renderHeadYaw;
        renderPrevHeadPitch = renderHeadPitch;
        renderHeadYaw = fixNegativeZero(yaw);
        renderHeadPitch = clampPitch(pitch);
        renderRotationActive = true;
    }

    private static void clearRenderRotation() {
        renderRotationActive = false;
    }

    public static float getRenderYaw() {
        if (mc.player == null) return 0f;
        if (shouldFollowMcRotation()) {
            return mc.player.getYaw();
        }
        return renderHeadYaw;
    }

    public static float getPreviousRenderYaw() {
        if (mc.player == null) return 0f;
        if (shouldFollowMcRotation()) {
            return mc.player.lastYaw;
        }
        return renderPrevHeadYaw;
    }

    public static float getRenderPitch() {
        if (mc.player == null) return 0f;
        if (shouldFollowMcRotation()) {
            return mc.player.getPitch();
        }
        return renderHeadPitch;
    }

    public static float getPreviousRenderPitch() {
        if (mc.player == null) return 0f;
        if (shouldFollowMcRotation()) {
            return mc.player.lastPitch;
        }
        return renderPrevHeadPitch;
    }

    /**
     * Возвращает true, если рендерные yaw/pitch должны строго следовать за MC игроком.
     * Это происходит в двух случаях:
     * 1. Рендерная ротация сейчас не активна (нет AIM/RESET).
     * 2. Модуль {@link fun.nexisdlc.modules.impl.render.RotationRender} выключен —
     *    тогда и модель, и серверные пакеты должны использовать yaw/pitch самого игрока.
     */
    private static boolean shouldFollowMcRotation() {
        if (!renderRotationActive) {
            return true;
        }
        var module = Nexis.getFunctionManager().getRotationRender();
        return module == null || !module.isState();
    }

    public static boolean hasTask(String name) {
        return tasks.containsKey(name);
    }

    public static boolean isBaritoneTaskActive() {
        return hasTask(BARITONE_TASK_NAME);
    }

    public static boolean shouldFixMovement() {
        if (!isRotating()) {
            return false;
        }

        return !isBaritoneTaskActive() || tasks.size() > 1;
    }

    public static boolean isTargetRotationReached() {
        if (rotationState != RotationState.AIM || desiredRotation == null) {
            return false;
        }

        float gcd = SensUtility.getGCDValue();
        float yawDiff = Math.abs(MathHelper.wrapDegrees(desiredRotation.yaw - visualHeadYaw));
        float pitchDiff = Math.abs(desiredRotation.pitch - visualHeadPitch);
        float tolerance = Math.max(gcd * 1.5f, 0.1f);

        return yawDiff <= tolerance && pitchDiff <= tolerance;
    }

    public static void scheduleActionAfterAim(Runnable action) {
        pendingAfterAimAction = action;
    }

    public static RotationTask create(String name, int priority) {
        RotationTask task = tasks.computeIfAbsent(name, RotationTask::new);
        task.priority = priority;
        return task;
    }

    public static void remove(String name) {
        tasks.remove(name);
        if (tasks.isEmpty()) {
            finishRotation();
        }
    }

    public static void setTargetRotation(float yaw, float pitch, float yawSpeed, float pitchSpeed, float returnYSpeed, float returnPSpeed, double timeout, int prio, long customResetDelayMs) {
        if (prio < rotationPriority) return;
        aimYawSpeed = yawSpeed;
        aimPitchSpeed = pitchSpeed;
        returnYawSpeed = returnYSpeed;
        returnPitchSpeed = returnPSpeed;
        rotationTimeoutMs = timeout <= 0.0 ? Long.MAX_VALUE : toTimeoutMs(timeout);
        rotationPriority = prio;
        rotationState = RotationState.AIM;
        desiredRotation = new Rotation(yaw, clampPitch(pitch));
        resetDelayMs = customResetDelayMs >= 0L ? customResetDelayMs : -1L;
        instantResetOnReturn = customResetDelayMs == 0L;
        inactiveMs = 0L;
        lastInactiveUpdateMs = System.currentTimeMillis();
        returnStartTime = System.currentTimeMillis();
        needSmoothReset = true;
    }

    public static void setTargetRotation(float yaw, float pitch, int prio) {
        if (prio < rotationPriority) return;
        aimYawSpeed = Float.MAX_VALUE;
        aimPitchSpeed = Float.MAX_VALUE;
        returnYawSpeed = 80;
        returnPitchSpeed = 80;
        rotationTimeoutMs = Long.MAX_VALUE;
        rotationPriority = prio;
        rotationState = RotationState.AIM;
        desiredRotation = new Rotation(yaw, clampPitch(pitch));
        resetDelayMs = -1L;
        instantResetOnReturn = false;
        inactiveMs = 0L;
        lastInactiveUpdateMs = System.currentTimeMillis();
        returnStartTime = System.currentTimeMillis();
        needSmoothReset = true;
    }

    public static void setTargetRotation(float yaw, float pitch, int prio, long customResetDelayMs) {
        setTargetRotation(yaw, pitch, prio);
        resetDelayMs = Math.max(0L, customResetDelayMs);
        instantResetOnReturn = customResetDelayMs == 0L;
    }

    public static void setTargetRotation(float yaw, float pitch, float returnSpeed, int prio) {
        if (prio < rotationPriority) return;
        aimYawSpeed = Float.MAX_VALUE;
        aimPitchSpeed = Float.MAX_VALUE;
        returnYawSpeed = returnSpeed;
        returnPitchSpeed = returnSpeed;
        rotationTimeoutMs = Long.MAX_VALUE;
        rotationPriority = prio;
        rotationState = RotationState.AIM;
        desiredRotation = new Rotation(yaw, clampPitch(pitch));
        resetDelayMs = -1L;
        instantResetOnReturn = false;
        inactiveMs = 0L;
        lastInactiveUpdateMs = System.currentTimeMillis();
        returnStartTime = System.currentTimeMillis();
        needSmoothReset = true;
    }

    public static void setTargetRotation(float yaw, float pitch, float returnSpeed, int prio, long customResetDelayMs) {
        setTargetRotation(yaw, pitch, returnSpeed, prio);
        resetDelayMs = Math.max(0L, customResetDelayMs);
        instantResetOnReturn = customResetDelayMs == 0L;
    }

    public static void setTargetRotation(float yaw, float pitch, float yawSpeed, float pitchSpeed, float returnYSpeed, float returnPSpeed, double timeout, int prio) {
        setTargetRotation(yaw, pitch, yawSpeed, pitchSpeed, returnYSpeed, returnPSpeed, timeout, prio, -1L);
    }

    @EventHandler
    public void onFastest(FastestEvent event) {
        visualHeadYaw = antiAimModulo360(visualHeadYaw, visualHeadYaw);

        updateRenderRotationFastest();
        ensureAuraSpinInitialized();
        updateAuraSpinOffset();
    }

    private static void syncRenderRotationFromVisual() {
        renderHeadYaw = visualHeadYaw;
        renderHeadPitch = visualHeadPitch;
        renderPrevHeadYaw = visualPrevHeadYaw;
        renderPrevHeadPitch = visualPrevHeadPitch;
    }

    private void updateRenderRotationFastest() {
        if (mc.player == null) return;

        if (rotationState == RotationState.RESET) {
            renderRotationActive = true;
            return;
        }

        renderPrevHeadYaw = renderHeadYaw;
        renderPrevHeadPitch = renderHeadPitch;

        if (rotationState != RotationState.AIM) {
            renderHeadYaw = visualHeadYaw;
            renderHeadPitch = visualHeadPitch;
            renderHeadYaw = fixNegativeZero(renderHeadYaw);
            return;
        }

        if (desiredRotation != null) {
            float yawDiff = MathHelper.wrapDegrees(desiredRotation.yaw - renderHeadYaw);
            float pitchDiff = desiredRotation.pitch - renderHeadPitch;

            float yawStep = Math.min(Math.abs(yawDiff), aimYawSpeed);
            float pitchStep = Math.min(Math.abs(pitchDiff), aimPitchSpeed);

            float deltaYaw = MathHelper.clamp(yawDiff, -yawStep, yawStep);
            float deltaPitch = MathHelper.clamp(pitchDiff, -pitchStep, pitchStep);

            float gcd = SensUtility.getGCDValue();

            deltaYaw -= deltaYaw % gcd;
            deltaPitch -= deltaPitch % gcd;

            renderHeadYaw += deltaYaw;
            renderHeadPitch = clampPitch(renderHeadPitch + deltaPitch);
            renderRotationActive = true;
        }

        renderHeadYaw = fixNegativeZero(renderHeadYaw);
    }

    private static void resetRenderRotation() {
        if (mc.player == null) return;

        float targetYaw = normalizeYawTo(renderHeadYaw, mc.player.getYaw());
        float targetPitch = mc.player.getPitch();

        if (instantResetOnReturn) {
            setRenderRotation(targetYaw, targetPitch);
            return;
        }

        float diffYaw = MathHelper.wrapDegrees(targetYaw - renderHeadYaw);
        float diffPitch = targetPitch - renderHeadPitch;

        float gcd = SensUtility.getGCDValue();

        if (Math.abs(diffYaw) < 2f && Math.abs(diffPitch) < 2f) {
            setRenderRotation(targetYaw, targetPitch);
            return;
        }

        float minStep = 8.0f;

        float speedYaw = MathHelper.clamp(Math.abs(diffYaw) * 0.4f, minStep, 45f);
        float speedPitch = MathHelper.clamp(Math.abs(diffPitch) * 0.4f, minStep, 35f);

        float yawStep = MathHelper.clamp(diffYaw, -speedYaw, speedYaw);
        float pitchStep = MathHelper.clamp(diffPitch, -speedPitch, speedPitch);

        yawStep = Math.round(yawStep / gcd) * gcd;
        pitchStep = Math.round(pitchStep / gcd) * gcd;

        if (yawStep == 0 && Math.abs(diffYaw) > 0.01f) {
            yawStep = Math.signum(diffYaw) * gcd;
        }

        if (pitchStep == 0 && Math.abs(diffPitch) > 0.01f) {
            pitchStep = Math.signum(diffPitch) * gcd;
        }

        setRenderRotation(renderHeadYaw + yawStep, MathHelper.clamp(renderHeadPitch + pitchStep, -90.0f, 90.0f));
    }

    @EventHandler
    public void onTick(TickEvent event) {
        if (mc.player == null) return;

        // Автоактивация BaritoneRotationHook когда Baritone pathing/mining активен
        BaritoneRotationHook.updateAutoActivation();

        if (!isRotating()) {
            visualPrevHeadYaw = mc.player.lastYaw;
            visualPrevHeadPitch = mc.player.lastPitch;
            visualHeadYaw = hasPacketYaw ? normalizeYawTo(packetYaw, mc.player.headYaw) : mc.player.headYaw;
            visualHeadPitch = mc.player.getPitch();
            //     visualPrevBodyYaw = mc.player.lastBodyYaw;
            //     visualBodyYaw = mc.player.bodyYaw;
            return;
        }

        visualPrevHeadYaw = visualHeadYaw;
        visualPrevHeadPitch = visualHeadPitch;

        if (rotationState == RotationState.AIM) {
            long now = System.currentTimeMillis();
            if (lastInactiveUpdateMs == 0L) {
                lastInactiveUpdateMs = now;
            }
            inactiveMs += Math.max(0L, now - lastInactiveUpdateMs);
            lastInactiveUpdateMs = now;

            if (inactiveMs >= rotationTimeoutMs) {
                rotationState = RotationState.RESET;
                returnStartTime = System.currentTimeMillis();
                return;
            }

            if (desiredRotation != null) {
                float yawDiff = MathHelper.wrapDegrees(desiredRotation.yaw - visualHeadYaw);
                float pitchDiff = desiredRotation.pitch - visualHeadPitch;
                float yawStep = Math.min(Math.abs(yawDiff), aimYawSpeed);
                float pitchStep = Math.min(Math.abs(pitchDiff), aimPitchSpeed);
                float deltaYaw = MathHelper.clamp(yawDiff, -yawStep, yawStep);
                float deltaPitch = MathHelper.clamp(pitchDiff, -pitchStep, pitchStep);
                float gcd = SensUtility.getGCDValue();
                deltaYaw -= deltaYaw % gcd;
                deltaPitch -= deltaPitch % gcd;
                visualHeadYaw += deltaYaw;
                visualHeadPitch = clampPitch(visualHeadPitch + deltaPitch);
            }
        } else if (rotationState == RotationState.RESET) {
            resetRotation();
            renderPrevHeadYaw = renderHeadYaw;
            renderPrevHeadPitch = renderHeadPitch;
            renderHeadYaw = visualHeadYaw;
            renderHeadPitch = visualHeadPitch;
            renderRotationActive = true;
        } else {
            visualHeadYaw = mc.player.getYaw();
            visualHeadPitch = mc.player.getPitch();
        }

        visualHeadYaw = fixNegativeZero(visualHeadYaw);
    }

    @EventHandler
    public void onVelocity(FixVelocityEvent event) {
        if (!isRotating() || mc.player == null || mc.player.isRiding()) return;

        RotationEvent rot = new RotationEvent(mc.player.getYaw(), mc.player.getPitch(), CorrectionType.FREE);
        NexisClient.getEventBus().post(rot);

        //   if (rot.getCorrectionType() == CorrectionType.TARGET && rot.hasTarget() && rot.getTarget() instanceof LivingEntity target) {
        //       event.setTargetYaw(Float.isNaN(movementTargetYaw) ? calculateTargetYawForMovement(target) : movementTargetYaw);
        //       return;
        //   }

        movementTargetYaw = Float.NaN;
        event.setTargetYaw(visualHeadYaw);
    }

    @EventHandler
    public void onMoveInput(MoveInputEvent event) {
        if (!isRotating() || mc.player == null) return;
        if (mc.player.isGliding() || mc.player.isRiding()) {
            movementTargetYaw = Float.NaN;
            event.setNeedFix(false);
            return;
        }
        if (!shouldFixMovement()) {
            movementTargetYaw = Float.NaN;
            event.setNeedFix(false);
            if (mc.currentScreen == null) {
                event.setSneaking(event.isSneaking() || mc.options.sneakKey.isPressed());
            }
            if (!PlayerUtils.canMove) {
                event.setForward(false);
                event.setSideways(false);
                event.setSneaking(mc.options.sneakKey.isPressed());
                event.cancel();
            }
            return;
        }
        RotationEvent rot = new RotationEvent(mc.player.getYaw(), mc.player.getPitch(), CorrectionType.FREE);
        NexisClient.getEventBus().post(rot);

        CorrectionType type = rot.getCorrectionType();
        if (rotationState == RotationState.RESET) {
            rot.setCorrectionType(CorrectionType.FREE);
            type = CorrectionType.FREE;
        }

        if (type == CorrectionType.FOCUSED) {
            movementTargetYaw = Float.NaN;
            event.setNeedFix(false);
            return;
        }

        movementTargetYaw = Float.NaN;
        if (type == CorrectionType.TARGET && rot.hasTarget() && rot.getTarget() instanceof LivingEntity target) {
            movementTargetYaw = calculateTargetYawForMovement(target);
            event.setYaw(visualHeadYaw);
            event.setTargetYaw(movementTargetYaw);
            event.setNeedFix(true);
            event.setSneaking(event.isSneaking() || mc.options.sneakKey.isPressed());
            //    event.setYaw(visualHeadYaw);
            //    event.setNeedFix(true);
        }

        if (type == CorrectionType.FREE && isRotating()) {
            event.setYaw(visualHeadYaw);
            event.setNeedFix(true);
        }
        if (mc.currentScreen == null) {
            event.setSneaking(event.isSneaking() || mc.options.sneakKey.isPressed());
        }

        if (!PlayerUtils.canMove) {
            event.setForward(false);
            event.setSideways(false);
            event.setSneaking(mc.options.sneakKey.isPressed());
            event.cancel();
        }
    }

    @EventHandler
    public void onTravel(TravelRotationEvent event) {
        if (!isRotating()) {
            event.uncancel();
            return;
        }
        event.setYaw(continuousPacketYaw(visualHeadYaw));
        event.setPitch(visualHeadPitch);
        event.cancel();
    }

    @EventHandler
    public void onRotationFix(RotationFixEvent event) {
        if (!isRotating()) {
            event.uncancel();
            return;
        }

        RotationEvent rot = new RotationEvent(mc.player.getYaw(), mc.player.getPitch(), CorrectionType.FREE);
        NexisClient.getEventBus().post(rot);

        event.setYaw(continuousPacketYaw(visualHeadYaw));
        event.setPitch(visualHeadPitch);
        event.cancel();
    }

    @EventHandler
    public void onModelRender(EntityRenderEvent event) {
        if (!LivingEntityRenderRotation.shouldUseOriginalRotation()) {
            if (rotationState == RotationState.AIM) {
                renderRotationActive = true;
            } else if (rotationState == RotationState.RESET) {
                // renderHeadYaw обновляется только в onTick/onFastest для плавного RESET через lerp майнкрафта
            } else {
                syncRenderRotationFromVisual();
                clearRenderRotation();
            }
        } else {
            // RotationRender выключен — render-поля не нужны,
            // геттеры сами отдадут yaw/pitch самого игрока.
            clearRenderRotation();
        }


        if (shouldSpinAuraModelYaw()) {
            float oscillatingPitch = getOscillatingVisualPitch(System.currentTimeMillis());

            event.setYaw(auraSpinYaw);
            event.setPitch(oscillatingPitch);
            event.setPrevYaw(auraPrevSpinYaw);
            event.setPrevPitch(oscillatingPitch);
            event.setBodyYaw(visualBodyYaw);
            event.setPrevBodyYaw(visualPrevBodyYaw);
            return;
        }

        event.setYaw(getRenderYaw());
        event.setPitch(getRenderPitch());
        event.setPrevYaw(getPreviousRenderYaw());
        event.setPrevPitch(getPreviousRenderPitch());
        event.setBodyYaw(visualBodyYaw);
        event.setPrevBodyYaw(visualPrevBodyYaw);
    }

    private static void resetRotation() {
        if (mc.player == null) return;
        long elapsed = System.currentTimeMillis() - returnStartTime;
        long timeout = resetDelayMs >= 0L ? resetDelayMs : 800L;
        if (elapsed < timeout) return;

        float targetYaw = normalizeYawTo(visualHeadYaw, mc.player.getYaw());
        float targetPitch = mc.player.getPitch();

        if (instantResetOnReturn) {
            visualHeadYaw = targetYaw;
            visualHeadPitch = targetPitch;
            finishRotation();
            return;
        }

        float diffYaw = MathHelper.wrapDegrees(targetYaw - visualHeadYaw);
        float diffPitch = targetPitch - visualHeadPitch;
        float gcd = SensUtility.getGCDValue();

        if (Math.abs(diffYaw) < 2f && Math.abs(diffPitch) < 2f) {
            visualHeadYaw = targetYaw;
            visualHeadPitch = targetPitch;
            finishRotation();
            return;
        }

        float minStep = 8.0f;
        float speedYaw = MathHelper.clamp(Math.abs(diffYaw) * 0.4f, minStep, 45f);
        float speedPitch = MathHelper.clamp(Math.abs(diffPitch) * 0.4f, minStep, 35f);
        float yawStep = MathHelper.clamp(diffYaw, -speedYaw, speedYaw);
        float pitchStep = MathHelper.clamp(diffPitch, -speedPitch, speedPitch);
        yawStep = Math.round(yawStep / gcd) * gcd;
        pitchStep = Math.round(pitchStep / gcd) * gcd;

        if (yawStep == 0 && Math.abs(diffYaw) > 0.01f) yawStep = Math.signum(diffYaw) * gcd;
        if (pitchStep == 0 && Math.abs(diffPitch) > 0.01f) pitchStep = Math.signum(diffPitch) * gcd;

        visualHeadYaw += yawStep;
        visualHeadPitch = MathHelper.clamp(visualHeadPitch + pitchStep, -90.0f, 90.0f);
    }

    public boolean needRenderModel() {
        return true;
    }

    private float bodyYaw(float headYaw) {
        double deltaX = mc.player.getX() - mc.player.lastX;
        double deltaZ = mc.player.getZ() - mc.player.lastZ;
        float moveSqr = (float) (deltaX * deltaX + deltaZ * deltaZ);

        float target = visualBodyYaw;

        if (moveSqr > 0.0025000002f) {
            float moveYaw = (float) MathHelper.atan2(deltaZ, deltaX) * (180f / (float) Math.PI) - 90f;

            float headToMoveDiff = MathHelper.abs(MathHelper.wrapDegrees(headYaw - moveYaw));
            if (headToMoveDiff > 95f && headToMoveDiff < 265f) {
                target = moveYaw - 180f;
            } else {
                target = moveYaw;
            }
        }

        if (mc.player.handSwingProgress > 0.0f) {
            target = ((ClientPlayerEntityAccessor) mc.player).getLastYaw();
        }

        float diff = MathHelper.wrapDegrees(target - visualBodyYaw);
        visualBodyYaw += diff * 0.3f;

        float yawBodyDelta = MathHelper.wrapDegrees(headYaw - visualBodyYaw);
        float clamped = MathHelper.clamp(yawBodyDelta, -50f, 50f);

        return headYaw - clamped;
    }

    private static float clampPitch(float value) {
        if (!Float.isFinite(value)) return 0.0f;
        return MathHelper.clamp(value, -90.0f, 90.0f);
    }

    public static float normalizeYawTo(float baseYaw, float yaw) {
        float cleanYaw = Float.isFinite(yaw) ? yaw : 0.0f;
        float cleanBase = Float.isFinite(baseYaw) ? baseYaw : cleanYaw;
        return fixNegativeZero(antiAimModulo360(cleanBase, cleanYaw));
    }

    public static float antiAimModulo360(float base, float yaw) {
        float diff = MathHelper.wrapDegrees(yaw - base);
        return base + diff;
    }

    public static float continuousPacketYaw(float yaw) {
        float fallback = mc.player != null ? mc.player.getYaw() : packetYaw;
        float cleanYaw = Float.isFinite(yaw) ? yaw : fallback;
        float baseYaw = hasPacketYaw ? packetYaw : fallback;
        return normalizeYawTo(baseYaw, cleanYaw);
    }

    public static float sanitizePacketYaw(float yaw) {
        float continuousYaw = continuousPacketYaw(yaw);
        packetYaw = continuousYaw;
        hasPacketYaw = true;
        return continuousYaw;
    }

    public static void recordPacketYaw(float yaw) {
        if (!Float.isFinite(yaw)) {
            return;
        }

        packetYaw = hasPacketYaw ? normalizeYawTo(packetYaw, yaw) : fixNegativeZero(yaw);
        hasPacketYaw = true;
    }

    private static void finishRotation() {
        rotationState = RotationState.IDLE;
        rotationPriority = 0;
        rotationTimeoutMs = 0L;
        inactiveMs = 0L;
        lastInactiveUpdateMs = 0L;
        returnStartTime = 0L;
        resetDelayMs = -1L;
        instantResetOnReturn = false;
        needSmoothReset = false;
        desiredRotation = null;
        movementTargetYaw = Float.NaN;
        pendingAfterAimAction = null;
        clearRenderRotation();
    }

    @EventHandler
    public void onSync(EventSync event) {
        if (mc.player == null) {
            spoofingThisTick = false;
            return;
        }

        spoofYaw = mc.player.getYaw();
        spoofPitch = mc.player.getPitch();

        if (!isRotating()) {
            float sendYaw = hasPacketYaw ? normalizeYawTo(packetYaw, spoofYaw) : fixNegativeZero(spoofYaw);
            packetYaw = sendYaw;
            hasPacketYaw = true;
            mc.player.setYaw(sendYaw);
            spoofingThisTick = true;
            return;
        }

        mc.player.setYaw(continuousPacketYaw(visualHeadYaw));
        mc.player.setPitch(MathHelper.clamp(visualHeadPitch, -90.0f, 90.0f));
        spoofingThisTick = true;

        if (pendingAfterAimAction != null && isTargetRotationReached()) {
            Runnable action = pendingAfterAimAction;
            pendingAfterAimAction = null;
            action.run();
        }
    }

    @EventHandler
    public void onPostSync(EventPostSync event) {
        if (mc.player != null && spoofingThisTick) {
            mc.player.setYaw(spoofYaw);
            mc.player.setPitch(spoofPitch);
            spoofingThisTick = false;
        }

        if (mc.player == null) {
            return;
        }

        visualPrevBodyYaw = visualBodyYaw;
        visualBodyYaw = bodyYaw(shouldSpinAuraModelYaw() ? auraSpinYaw : visualHeadYaw);
    }

    /**
     * Вычисляет yaw для движения в направлении цели (для TARGET коррекции)
     * Используется для стрейфа вокруг цели
     */
    public static float calculateTargetYawForMovement(LivingEntity target) {
        if (target == null || mc.player == null) {
            return mc.player != null ? mc.player.getYaw() : 0f;
        }

        // ха изи тупа имено пушка
        // 1. Получаем вектор движения цели (разница между текущей и прошлой позицией)
        double motionX = target.getX() - target.lastX;
        double motionZ = target.getZ() - target.lastZ;

        // Считаем общую длину вектора движения в горизонтальной плоскости
        double speed = Math.sqrt(motionX * motionX + motionZ * motionZ);

        // Координаты цели, которые мы будем использовать для расчета (по умолчанию текущие)
        double predictedX = target.getX();
        double predictedZ = target.getZ();

        // 2. Если цель движется, добавляем предикт на 0.87 блока вперед по вектору движения
        if (speed > 0.001) { // Проверка на микро-движения (чтобы не было деления на ноль)
            predictedX += (motionX / speed) * 0.87;
            predictedZ += (motionZ / speed) * 0.87;
        }

        // 3. Расчет угла Yaw на предсказанную позицию цели
        float newTargetYaw = (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(
                predictedZ - mc.player.getZ(),
                predictedX - mc.player.getX()
        )) - 90.0f);

        return MathHelper.wrapDegrees(newTargetYaw);
    }

    private static void ensureAuraSpinInitialized() {
        if (!auraSpinActive) {
            auraSpinActive = true;
            auraSpinBaseYaw = mc.player != null ? mc.player.getYaw() : 0f;
        }
    }

    private static void updateAuraSpinOffset() {
        if (!enableVisualSpin) return;
        long now = System.currentTimeMillis();
        if (now - auraSpinLastTime > 50) {
            auraSpinLastTime = now;
            auraSpinProgress += 0.05f * auraSpinDir;
            if (auraSpinProgress > 1f || auraSpinProgress < 0f) {
                auraSpinDir *= -1;
            }
        }
        auraPrevSpinYaw = auraSpinYaw;
        auraSpinYaw = auraSpinBaseYaw + (auraSpinProgress * 360f);
    }

    private static boolean shouldSpinAuraModelYaw() {
        return enableVisualSpin && auraSpinActive;
    }

    private static float getOscillatingVisualPitch(long time) {
        return (float) Math.sin(time / 200.0) * 10f;
    }

    public static void saveRenderPrev() {
        renderPrevHeadYaw = renderHeadYaw;
        renderPrevHeadPitch = renderHeadPitch;
    }

    public static float fixNegativeZero(float value) {
        if (value == -0.0f) return 0.0f;
        return value;
    }

    public enum RotationState {
        IDLE,
        AIM,
        RESET
    }

    private static long toTimeoutMs(double timeoutTicks) {
        return Math.max(0L, Math.round(timeoutTicks * 50.0));
    }
}
