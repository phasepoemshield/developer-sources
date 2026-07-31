package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.client.events.impl.client.MsEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.impl.combat.aura.rotations.NeuroDataLogger;
import fun.nexisdlc.modules.impl.combat.aura.rotations.RotationFeatures;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import ru.sterford.annotations.NativeCall;

/**
 * Запись датасета ротации.
 * <p>
 * Логика:
 * - Aura может быть включена и выбирать target.
 * - Если RotationRecorder включён, NeuroRotation ничего не делает.
 * - Игрок свободно крутит мышкой.
 * - Recorder пишет человеческие dYaw/dPitch по target'у Aura.
 */
@FunctionAdd(
        name = "RotationRecorder",
        alias = "RotRec",
        category = Category.Combat,
        description = "Запись датасета ротации. Aura может выбирать цель, Neuro не крутит",
        needDev = true
)
public class RotationRecorderModule extends Function {
    private static volatile boolean recording = false;

    private static final double RANGE = 6.0;

    // true/true = можно писать и зомби, и игроков.
    // Если хочешь только зомби/мобы — RECORD_PLAYERS = false.
    private static final boolean RECORD_PLAYERS = true;
    private static final boolean RECORD_MOBS = true;

    // Не фильтр поведения, только защита от телепорта/GUI/резкого рассинхрона.
    private static final float MAX_VALID_DYAW = 140.0f;
    private static final float MAX_VALID_DPITCH = 90.0f;

    private final NeuroDataLogger logger = new NeuroDataLogger();

    private boolean hasPrev = false;

    private float prevYaw;
    private float prevPitch;

    private float prevDYaw;
    private float prevDPitch;

    private float[] prevFeatures;
    private LivingEntity prevTarget;

    @NativeCall
    public static boolean isRecording() {
        return recording;
    }

    @Override
    public void onEnable() {
        super.onEnable();

        recording = true;

        resetState(false);
        logger.start();
    }

    @Override
    public void onDisable() {
        super.onDisable();

        recording = false;

        logger.stop();
        resetState(false);
    }

    @EventHandler
    public void onTick(MsEvent e) {
        if (mc.player == null || mc.world == null) {
            breakSegment();
            return;
        }

        // Не пишем датасет, пока открыт инвентарь/чат/меню.
        // Разрываем segment, чтобы train не склеил окна через GUI.
        if (mc.currentScreen != null) {
            breakSegment();
            return;
        }

        // ВАЖНО:
        // getYaw(), не headYaw.
        // Replay в NeuroRotation тоже работает через getYaw/stateYaw.
        float curYaw = mc.player.getYaw();
        float curPitch = mc.player.getPitch();

        LivingEntity target = getRecordTarget();
        if (target == null) {
            breakSegment();
            return;
        }

        // Смена цели = новый sequence.
        if (prevTarget != null && prevTarget != target) {
            breakSegment();
        }

        if (hasPrev && prevFeatures != null && prevTarget == target) {
            float dYaw = normYaw(curYaw - prevYaw);
            float dPitch = curPitch - prevPitch;

            boolean saneDelta =
                    Math.abs(dYaw) <= MAX_VALID_DYAW &&
                            Math.abs(dPitch) <= MAX_VALID_DPITCH;

            if (saneDelta) {
                // Пишем честно, без "микродвижение выкинуть".
                // Cooldown/hurtTime в features дадут модели понять фазу боя.
                logger.writeRow(prevFeatures, dYaw, dPitch);
            } else {
                // Дикий скачок = разрыв, не training sample.
                breakSegment();
            }

            prevDYaw = dYaw;
            prevDPitch = dPitch;
        }

        prevFeatures = RotationFeatures.extract(curYaw, curPitch, target, prevDYaw, prevDPitch);

        prevTarget = target;
        prevYaw = curYaw;
        prevPitch = curPitch;
        hasPrev = true;
    }

    private LivingEntity getRecordTarget() {
        LivingEntity auraTarget = AuraModule.target;

        if (isValidTarget(auraTarget, RANGE)) {
            return auraTarget;
        }

        return nearestTarget(RANGE);
    }

    private LivingEntity nearestTarget(double range) {
        LivingEntity best = null;
        double bestDist = range * range;

        for (var entity : mc.world.getEntities()) {
            if (!(entity instanceof LivingEntity le)) continue;
            if (!isValidTarget(le, range)) continue;

            double d = mc.player.squaredDistanceTo(le);
            if (d < bestDist) {
                bestDist = d;
                best = le;
            }
        }

        return best;
    }

    private boolean isValidTarget(LivingEntity le, double range) {
        if (le == null) return false;
        if (mc.player == null) return false;
        if (le == mc.player) return false;
        if (!le.isAlive()) return false;

        boolean isPlayer = le instanceof PlayerEntity;

        if (isPlayer && !RECORD_PLAYERS) return false;
        if (!isPlayer && !RECORD_MOBS) return false;

        return mc.player.squaredDistanceTo(le) <= range * range;
    }

    private void breakSegment() {
        boolean hadState = hasPrev || prevFeatures != null || prevTarget != null;
        resetState(false);

        if (hadState) {
            logger.nextSegment();
        }
    }

    private void resetState(boolean nextSegment) {
        hasPrev = false;

        prevYaw = 0f;
        prevPitch = 0f;

        prevDYaw = 0f;
        prevDPitch = 0f;

        prevFeatures = null;
        prevTarget = null;

        if (nextSegment) {
            logger.nextSegment();
        }
    }

    private float normYaw(float yaw) {
        yaw %= 360.0f;

        if (yaw >= 180.0f) {
            yaw -= 360.0f;
        }

        if (yaw < -180.0f) {
            yaw += 360.0f;
        }

        return MathHelper.clamp(yaw, -180f, 180f);
    }
}