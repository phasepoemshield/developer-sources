/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.pathing.calc.IPathingControlManager
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  baritone.behavior.PathingBehavior
 *  minecraft.class07209
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.pathing.calc.IPathingControlManager;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.behavior.PathingBehavior;
import baritone.pathing.path.PathExecutor;
import baritone.utils.PathingControlManager$1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class07209;

public class PathingControlManager
implements IPathingControlManager {
    private final Baritone baritone;
    private final HashSet<IBaritoneProcess> processes;
    private final List<IBaritoneProcess> active;
    private IBaritoneProcess inControlLastTick;
    private IBaritoneProcess inControlThisTick;
    private PathingCommand command;

    public PathingControlManager(Baritone baritone) {
        this.baritone = baritone;
        this.processes = new HashSet();
        this.active = new ArrayList<IBaritoneProcess>();
        baritone.getGameEventHandler().registerEventListener((IGameEventListener)new PathingControlManager$1(this));
    }

    public void preTick() {
        this.inControlLastTick = this.inControlThisTick;
        this.inControlThisTick = null;
        PathingBehavior pathingBehavior = this.baritone.getPathingBehavior();
        this.command = this.executeProcesses();
        if (this.command == null) {
            pathingBehavior.cancelSegmentIfSafe();
            pathingBehavior.secretInternalSetGoal(null);
            return;
        }
        if (!Objects.equals(this.inControlThisTick, this.inControlLastTick) && this.command.commandType != PathingCommandType.REQUEST_PAUSE && this.inControlLastTick != null && !this.inControlLastTick.isTemporary()) {
            pathingBehavior.cancelSegmentIfSafe();
        }
        switch (this.command.commandType) {
            case SET_GOAL_AND_PAUSE: {
                pathingBehavior.secretInternalSetGoalAndPath(this.command);
            }
            case REQUEST_PAUSE: {
                pathingBehavior.requestPause();
                break;
            }
            case CANCEL_AND_SET_GOAL: {
                pathingBehavior.secretInternalSetGoal(this.command.goal);
                pathingBehavior.cancelSegmentIfSafe();
                break;
            }
            case FORCE_REVALIDATE_GOAL_AND_PATH: 
            case REVALIDATE_GOAL_AND_PATH: {
                if (pathingBehavior.isPathing() || pathingBehavior.getInProgress().isPresent()) break;
                pathingBehavior.secretInternalSetGoalAndPath(this.command);
                break;
            }
            case SET_GOAL_AND_PATH: {
                if (this.command.goal == null) break;
                pathingBehavior.secretInternalSetGoalAndPath(this.command);
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected command type " + String.valueOf(this.command.commandType));
            }
        }
    }

    void postTick() {
        if (this.command == null) {
            return;
        }
        PathingBehavior pathingBehavior = this.baritone.getPathingBehavior();
        switch (this.command.commandType) {
            case FORCE_REVALIDATE_GOAL_AND_PATH: {
                if (this.command.goal == null || this.forceRevalidate(this.command.goal) || this.revalidateGoal(this.command.goal)) {
                    pathingBehavior.softCancelIfSafe();
                }
                pathingBehavior.secretInternalSetGoalAndPath(this.command);
                break;
            }
            case REVALIDATE_GOAL_AND_PATH: {
                if (((Boolean)Baritone.settings().cancelOnGoalInvalidation.value).booleanValue() && (this.command.goal == null || this.revalidateGoal(this.command.goal))) {
                    pathingBehavior.softCancelIfSafe();
                }
                pathingBehavior.secretInternalSetGoalAndPath(this.command);
                break;
            }
        }
    }

    public void cancelEverything() {
        this.inControlLastTick = null;
        this.inControlThisTick = null;
        this.command = null;
        this.active.clear();
        for (IBaritoneProcess iBaritoneProcess : this.processes) {
            iBaritoneProcess.onLostControl();
            if (!iBaritoneProcess.isActive() || iBaritoneProcess.isTemporary()) continue;
            throw new IllegalStateException(iBaritoneProcess.displayName() + " stayed active after being cancelled");
        }
    }

    public Optional<PathingCommand> mostRecentCommand() {
        return Optional.ofNullable(this.command);
    }

    public void registerProcess(IBaritoneProcess iBaritoneProcess) {
        iBaritoneProcess.onLostControl();
        this.processes.add(iBaritoneProcess);
    }

    public boolean forceRevalidate(Goal goal) {
        PathExecutor pathExecutor = this.baritone.getPathingBehavior().getCurrent();
        if (pathExecutor != null) {
            if (goal.isInGoal((class07209)pathExecutor.getPath().getDest())) {
                return false;
            }
            return !goal.equals((Object)pathExecutor.getPath().getGoal());
        }
        return false;
    }

    public PathingCommand executeProcesses() {
        for (IBaritoneProcess iBaritoneProcess : this.processes) {
            if (iBaritoneProcess.isActive()) {
                if (this.active.contains(iBaritoneProcess)) continue;
                this.active.add(0, iBaritoneProcess);
                continue;
            }
            this.active.remove(iBaritoneProcess);
        }
        this.active.sort(Comparator.comparingDouble(IBaritoneProcess::priority).reversed());
        Iterator<IBaritoneProcess> iterator = this.active.iterator();
        while (iterator.hasNext()) {
            IBaritoneProcess iBaritoneProcess;
            PathingCommand pathingCommand = iBaritoneProcess.onTick(Objects.equals(iBaritoneProcess = iterator.next(), this.inControlLastTick) && this.baritone.getPathingBehavior().calcFailedLastTick(), this.baritone.getPathingBehavior().isSafeToCancel());
            if (pathingCommand == null) {
                if (!iBaritoneProcess.isActive()) continue;
                throw new IllegalStateException(iBaritoneProcess.displayName() + " actively returned null PathingCommand");
            }
            if (pathingCommand.commandType == PathingCommandType.DEFER) continue;
            this.inControlThisTick = iBaritoneProcess;
            if (!iBaritoneProcess.isTemporary()) {
                iterator.forEachRemaining(IBaritoneProcess::onLostControl);
            }
            return pathingCommand;
        }
        return null;
    }

    public boolean revalidateGoal(Goal goal) {
        BetterBlockPos betterBlockPos;
        Goal goal2;
        PathExecutor pathExecutor = this.baritone.getPathingBehavior().getCurrent();
        return pathExecutor != null && (goal2 = pathExecutor.getPath().getGoal()).isInGoal((class07209)(betterBlockPos = pathExecutor.getPath().getDest())) && !goal.isInGoal((class07209)betterBlockPos);
    }

    public Optional<IBaritoneProcess> mostRecentInControl() {
        return Optional.ofNullable(this.inControlThisTick);
    }
}

