package fun.nexisdlc.client.utils.baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.process.IMineProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

/**
 * Прямые вызовы Baritone API.
 * Этот класс загружается ТОЛЬКО если Baritone присутствует.
 * Все методы вызываются из BaritoneHelper через try-catch.
 */
final class BaritoneAccessor {

    private BaritoneAccessor() {
    }

    private static IBaritone getBaritone() {
        return BaritoneAPI.getProvider().getPrimaryBaritone();
    }

    private static IMineProcess getMineProcess() {
        return getBaritone().getMineProcess();
    }

    private static ICustomGoalProcess getGoalProcess() {
        return getBaritone().getCustomGoalProcess();
    }

    // ══════════════════════════════════════════════════════════════

    static boolean mine(Block... blocks) {
        if (blocks == null || blocks.length == 0) return false;
        getMineProcess().mine(blocks);
        return true;
    }

    static boolean goTo(BlockPos pos, int range) {
        if (pos == null) return false;
        getGoalProcess().setGoalAndPath(new GoalNear(pos, range));
        return true;
    }

    static boolean goToExact(BlockPos pos) {
        if (pos == null) return false;
        getGoalProcess().setGoalAndPath(new GoalBlock(pos));
        return true;
    }

    static boolean stop() {
        getBaritone().getPathingBehavior().cancelEverything();
        return true;
    }

    static boolean isPathing() {
        return getBaritone().getPathingBehavior().isPathing();
    }

    static boolean isMining() {
        return getMineProcess().isActive();
    }

    static boolean cancelMine() {
        getMineProcess().cancel();
        return true;
    }

    static boolean applySettings(boolean enable, double blockBreakDelay) {
        return applySettings(enable, blockBreakDelay, false);
    }

    static boolean applySettings(boolean enable, double blockBreakDelay, boolean renderPath) {
        Settings settings = BaritoneAPI.getSettings();
        if (enable) {
            // Родной Baritone синхронизирует серверную ротацию и физику движения,
            // а CameraMixin оставляет игроку свободную камеру.
            settings.freeLook.value = true;
            settings.blockFreeLook.value = true;
            settings.smoothLook.value = false;
            settings.elytraSmoothLook.value = false;
            settings.antiCheatCompatibility.value = true;

            settings.allowSprint.value = true;
            settings.sprintInWater.value = true;
            settings.blockBreakAdditionalPenalty.value = blockBreakDelay;
            settings.allowParkour.value = false;
            settings.allowParkourPlace.value = false;
            settings.allowParkourAscend.value = false;
            settings.sprintAscends.value = true;
            settings.overshootTraverse.value = false;
            settings.allowOvershootDiagonalDescend.value = false;
            settings.allowDiagonalDescend.value = false;
            settings.allowDiagonalAscend.value = false;
            settings.assumeStep.value = false;
            settings.assumeSafeWalk.value = false;
            settings.walkWhileBreaking.value = false;
            settings.chatControl.value = false;
            settings.chatControlAnyway.value = false;
            settings.renderGoal.value = renderPath;
            settings.renderPath.value = renderPath;
        } else {
            // Возврат к дефолтам
            settings.freeLook.value = true; // дефолт Baritone
            settings.blockFreeLook.value = false;
            settings.smoothLook.value = false;
            settings.elytraSmoothLook.value = false;
            settings.antiCheatCompatibility.value = true;
            settings.allowSprint.value = true;
            settings.sprintInWater.value = true;
            settings.blockBreakAdditionalPenalty.value = 2.0;
            settings.allowParkour.value = false;
            settings.allowParkourPlace.value = false;
            settings.allowParkourAscend.value = true;
            settings.sprintAscends.value = true;
            settings.overshootTraverse.value = true;
            settings.allowOvershootDiagonalDescend.value = true;
            settings.allowDiagonalDescend.value = false;
            settings.allowDiagonalAscend.value = false;
            settings.assumeStep.value = false;
            settings.assumeSafeWalk.value = false;
            settings.walkWhileBreaking.value = true;
            settings.chatControl.value = true;
            settings.chatControlAnyway.value = false;
            settings.renderGoal.value = true;
            settings.renderPath.value = true;
        }
        return true;
    }

    // ══════════════════════════════════════════════════════════════
    //  Пауза (без потери цели)
    // ══════════════════════════════════════════════════════════════

    private static boolean paused = false;
    private static boolean pauseProcessRegistered = false;

    private static void ensurePauseProcess() {
        if (pauseProcessRegistered) return;
        getBaritone().getPathingControlManager().registerProcess(new IBaritoneProcess() {
            @Override public boolean isActive() { return paused; }
            @Override public PathingCommand onTick(boolean calcFailed, boolean isSafeToCancel) {
                return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
            }
            @Override public boolean isTemporary() { return true; }
            @Override public void onLostControl() {}
            @Override public double priority() { return 100.0; }
            @Override public String displayName0() { return "AutoMinePause"; }
        });
        pauseProcessRegistered = true;
    }

    static boolean setPaused(boolean p) {
        ensurePauseProcess();
        paused = p;
        return true;
    }
}
