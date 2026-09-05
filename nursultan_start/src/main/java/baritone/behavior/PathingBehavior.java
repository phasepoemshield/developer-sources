/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.event.events.PathEvent
 *  baritone.api.event.events.PlayerUpdateEvent
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.events.SprintStateEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.pathing.calc.AStarPathFinder
 *  baritone.pathing.calc.AbstractNodeCostSearch
 *  baritone.pathing.movement.CalculationContext
 *  baritone.pathing.movement.MovementHelper
 *  baritone.pathing.path.PathExecutor
 *  baritone.utils.PathRenderer
 *  baritone.utils.PathingCommandContext
 *  baritone.utils.pathing.Favoring
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class03448
 *  minecraft.class05630
 *  minecraft.class07209
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.event.events.PathEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.PathingCommand;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.PathCalculationResult;
import baritone.api.utils.PathCalculationResult$Type;
import baritone.api.utils.interfaces.IGoalRenderPos;
import baritone.behavior.Behavior;
import baritone.pathing.calc.AStarPathFinder;
import baritone.pathing.calc.AbstractNodeCostSearch;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.path.PathExecutor;
import baritone.utils.PathRenderer;
import baritone.utils.PathingCommandContext;
import baritone.utils.pathing.Favoring;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class03448;
import minecraft.class05630;
import minecraft.class07209;

public final class PathingBehavior
extends Behavior
implements IPathingBehavior,
Helper {
    private PathExecutor current;
    private PathExecutor next;
    private Goal goal;
    private CalculationContext context;
    private int ticksElapsedSoFar;
    private BetterBlockPos startPosition;
    private boolean safeToCancel;
    private boolean pauseRequestedLastTick;
    private boolean unpausedLastTick;
    private boolean pausedThisTick;
    private boolean cancelRequested;
    private boolean calcFailedLastTick;
    private volatile AbstractNodeCostSearch inProgress;
    private final Object pathCalcLock = new Object();
    private final Object pathPlanLock = new Object();
    private boolean lastAutoJump;
    private BetterBlockPos expectedSegmentStart;
    private final LinkedBlockingQueue<PathEvent> toDispatch = new LinkedBlockingQueue();

    public PathingBehavior(Baritone baritone) {
        super(baritone);
    }

    public BetterBlockPos pathStart() {
        BetterBlockPos betterBlockPos2 = this.ctx.playerFeet();
        if (!MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)betterBlockPos2.below())) {
            if (this.ctx.player().method_24828()) {
                int n;
                double d = this.ctx.player().method_73189().M;
                double d2 = this.ctx.player().method_73189().Z;
                ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
                for (n = -1; n <= 1; ++n) {
                    for (int i = -1; i <= 1; ++i) {
                        arrayList.add(new BetterBlockPos(betterBlockPos2.x + n, betterBlockPos2.y, betterBlockPos2.z + i));
                    }
                }
                arrayList.sort(Comparator.comparingDouble(betterBlockPos -> ((double)betterBlockPos.x + 0.5 - d) * ((double)betterBlockPos.x + 0.5 - d) + ((double)betterBlockPos.z + 0.5 - d2) * ((double)betterBlockPos.z + 0.5 - d2)));
                for (n = 0; n < 4; ++n) {
                    BetterBlockPos betterBlockPos3 = (BetterBlockPos)((Object)arrayList.get(n));
                    double d3 = Math.abs((double)betterBlockPos3.x + 0.5 - d);
                    double d4 = Math.abs((double)betterBlockPos3.z + 0.5 - d2);
                    if (d3 > 0.8 && d4 > 0.8 || !MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)betterBlockPos3.below()) || !MovementHelper.canWalkThrough((IPlayerContext)this.ctx, (BetterBlockPos)betterBlockPos3) || !MovementHelper.canWalkThrough((IPlayerContext)this.ctx, (BetterBlockPos)betterBlockPos3.above())) continue;
                    return betterBlockPos3;
                }
            } else if (MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)betterBlockPos2.below().below())) {
                return betterBlockPos2.below();
            }
        }
        return betterBlockPos2;
    }

    public void onTick(TickEvent tickEvent) {
        this.dispatchEvents();
        if (tickEvent.getType() == TickEvent.Type.OUT) {
            this.secretInternalSegmentCancel();
            this.baritone.getPathingControlManager().cancelEverything();
            return;
        }
        this.expectedSegmentStart = this.pathStart();
        this.baritone.getPathingControlManager().preTick();
        this.tickPath();
        ++this.ticksElapsedSoFar;
        this.dispatchEvents();
    }

    public PathExecutor getNext() {
        return this.next;
    }

    public void onPlayerUpdate(PlayerUpdateEvent playerUpdateEvent) {
        if (this.current != null) {
            switch (playerUpdateEvent.getState()) {
                case PRE: {
                    this.lastAutoJump = (Boolean)((class05630)this.ctx.minecraft().i_7).f().method_41753();
                    ((class05630)this.ctx.minecraft().i_7).f().method_41748((Object)false);
                    break;
                }
                case POST: {
                    ((class05630)this.ctx.minecraft().i_7).f().method_41748((Object)this.lastAutoJump);
                    break;
                }
            }
        }
    }

    public CalculationContext secretInternalGetCalculationContext() {
        return this.context;
    }

    public Goal getGoal() {
        return this.goal;
    }

    public boolean isPathing() {
        return this.hasPath() && !this.pausedThisTick;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tickPath() {
        this.pausedThisTick = false;
        if (this.pauseRequestedLastTick && this.safeToCancel) {
            this.pauseRequestedLastTick = false;
            if (this.unpausedLastTick) {
                this.baritone.getInputOverrideHandler().clearAllKeys();
                this.baritone.getInputOverrideHandler().getBlockBreakHelper().stopBreakingBlock();
            }
            this.unpausedLastTick = false;
            this.pausedThisTick = true;
            return;
        }
        this.unpausedLastTick = true;
        if (this.cancelRequested) {
            this.cancelRequested = false;
            this.baritone.getInputOverrideHandler().clearAllKeys();
        }
        Object object = this.pathPlanLock;
        synchronized (object) {
            BetterBlockPos betterBlockPos;
            Object object2 = this.pathCalcLock;
            synchronized (object2) {
                if (this.inProgress != null) {
                    betterBlockPos = this.inProgress.getStart();
                    Optional optional = this.inProgress.bestPathSoFar();
                    if (!(this.current != null && this.current.getPath().getDest().equals((Object)betterBlockPos) || betterBlockPos.equals((Object)this.ctx.playerFeet()) || betterBlockPos.equals((Object)this.expectedSegmentStart) || optional.isPresent() && (((IPath)optional.get()).positions().contains((Object)this.ctx.playerFeet()) || ((IPath)optional.get()).positions().contains((Object)this.expectedSegmentStart)))) {
                        this.inProgress.cancel();
                    }
                }
            }
            if (this.current == null) {
                return;
            }
            this.safeToCancel = this.current.onTick();
            if (this.current.failed() || this.current.finished()) {
                this.current = null;
                if (this.goal == null || this.goal.isInGoal(this.ctx.playerFeet())) {
                    this.logDebug("All done. At " + String.valueOf(this.goal));
                    this.queuePathEvent(PathEvent.AT_GOAL);
                    this.next = null;
                    if (((Boolean)Baritone.settings().disconnectOnArrival.value).booleanValue() && (betterBlockPos = this.ctx.world()) instanceof class03448) {
                        object2 = (class03448)betterBlockPos;
                        object2.N((class00392)class00392.y((String)"[Baritone] Arrived at goal!"));
                    }
                    return;
                }
                if (this.next != null && !this.next.getPath().positions().contains((Object)this.ctx.playerFeet()) && !this.next.getPath().positions().contains((Object)this.expectedSegmentStart)) {
                    this.logDebug("Discarding next path as it does not contain current position");
                    this.queuePathEvent(PathEvent.DISCARD_NEXT);
                    this.next = null;
                }
                if (this.next != null) {
                    this.logDebug("Continuing on to planned next path");
                    this.queuePathEvent(PathEvent.CONTINUING_ONTO_PLANNED_NEXT);
                    this.current = this.next;
                    this.next = null;
                    this.current.onTick();
                    return;
                }
                object2 = this.pathCalcLock;
                synchronized (object2) {
                    if (this.inProgress != null) {
                        this.queuePathEvent(PathEvent.PATH_FINISHED_NEXT_STILL_CALCULATING);
                        return;
                    }
                    this.queuePathEvent(PathEvent.CALC_STARTED);
                    this.findPathInNewThread(this.expectedSegmentStart, true, this.context);
                }
                return;
            }
            if (this.safeToCancel && this.next != null && this.next.snipsnapifpossible()) {
                this.logDebug("Splicing into planned next path early...");
                this.queuePathEvent(PathEvent.SPLICING_ONTO_NEXT_EARLY);
                this.current = this.next;
                this.next = null;
                this.current.onTick();
                return;
            }
            if (((Boolean)Baritone.settings().splicePath.value).booleanValue()) {
                this.current = this.current.trySplice(this.next);
            }
            if (this.next != null && this.current.getPath().getDest().equals((Object)this.next.getPath().getDest())) {
                this.next = null;
            }
            object2 = this.pathCalcLock;
            synchronized (object2) {
                if (this.inProgress != null) {
                    return;
                }
                if (this.next != null) {
                    return;
                }
                if (this.goal == null || this.goal.isInGoal(this.current.getPath().getDest())) {
                    return;
                }
                if ((Double)this.ticksRemainingInSegment(false).get() < (double)((Integer)Baritone.settings().planningTickLookahead.value).intValue()) {
                    this.logDebug("Path almost over. Planning ahead...");
                    this.queuePathEvent(PathEvent.NEXT_SEGMENT_CALC_STARTED);
                    this.findPathInNewThread(this.current.getPath().getDest(), false, this.context);
                }
            }
        }
    }

    public void onRenderPass(RenderEvent renderEvent) {
        PathRenderer.render((RenderEvent)renderEvent, (PathingBehavior)this);
    }

    public PathExecutor getCurrent() {
        return this.current;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void secretInternalSegmentCancel() {
        this.queuePathEvent(PathEvent.CANCELED);
        Object object = this.pathPlanLock;
        synchronized (object) {
            this.getInProgress().ifPresent(AbstractNodeCostSearch::cancel);
            if (this.current != null) {
                this.current = null;
                this.next = null;
                this.baritone.getInputOverrideHandler().clearAllKeys();
                this.baritone.getInputOverrideHandler().getBlockBreakHelper().stopBreakingBlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean secretInternalSetGoalAndPath(PathingCommand pathingCommand) {
        this.secretInternalSetGoal(pathingCommand.goal);
        this.context = pathingCommand instanceof PathingCommandContext ? ((PathingCommandContext)pathingCommand).desiredCalcContext : new CalculationContext((IBaritone)this.baritone, true);
        if (this.goal == null) {
            return false;
        }
        if (this.goal.isInGoal(this.ctx.playerFeet())) {
            return false;
        }
        Object object = this.pathPlanLock;
        synchronized (object) {
            if (this.current != null) {
                return false;
            }
            Object object2 = this.pathCalcLock;
            synchronized (object2) {
                if (this.inProgress != null) {
                    return false;
                }
                this.queuePathEvent(PathEvent.CALC_STARTED);
                this.findPathInNewThread(this.expectedSegmentStart, true, this.context);
                return true;
            }
        }
    }

    public Optional<AbstractNodeCostSearch> getInProgress() {
        return Optional.ofNullable(this.inProgress);
    }

    public boolean cancelEverything() {
        boolean bl = this.isSafeToCancel();
        if (bl) {
            this.secretInternalSegmentCancel();
        }
        this.baritone.getPathingControlManager().cancelEverything();
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void forceCancel() {
        this.cancelEverything();
        this.secretInternalSegmentCancel();
        Object object = this.pathCalcLock;
        synchronized (object) {
            this.inProgress = null;
        }
    }

    public boolean isSafeToCancel() {
        if (this.current == null) {
            return !this.baritone.getElytraProcess().isActive() || this.baritone.getElytraProcess().isSafeToCancel();
        }
        return this.safeToCancel;
    }

    private void dispatchEvents() {
        ArrayList arrayList = new ArrayList();
        this.toDispatch.drainTo(arrayList);
        this.calcFailedLastTick = arrayList.contains(PathEvent.CALC_FAILED);
        for (PathEvent pathEvent : arrayList) {
            this.baritone.getGameEventHandler().onPathEvent(pathEvent);
        }
    }

    private AbstractNodeCostSearch createPathfinder(class07209 class072092, Goal goal, IPath iPath, CalculationContext calculationContext) {
        class07209 class072093;
        Goal goal2 = goal;
        if (((Boolean)Baritone.settings().simplifyUnloadedYCoord.value).booleanValue() && goal instanceof IGoalRenderPos && !calculationContext.bsi.worldContainsLoadedChunk((class072093 = ((IGoalRenderPos)((Object)goal)).getGoalPos()).method_10263(), class072093.method_10260())) {
            goal2 = new GoalXZ(class072093.method_10263(), class072093.method_10260());
        }
        class072093 = new Favoring(calculationContext.getBaritone().getPlayerContext(), iPath, calculationContext);
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        BetterBlockPos betterBlockPos2 = new BetterBlockPos(class072092);
        class07209 class072094 = betterBlockPos.method_10059((class00753)betterBlockPos2);
        if (betterBlockPos.method_10264() == betterBlockPos2.method_10264() && Math.abs(class072094.method_10263()) <= 1 && Math.abs(class072094.method_10260()) <= 1) {
            betterBlockPos2 = betterBlockPos;
        }
        return new AStarPathFinder(betterBlockPos2, class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), goal2, (Favoring)class072093, calculationContext);
    }

    public void requestPause() {
        this.pauseRequestedLastTick = true;
    }

    public boolean calcFailedLastTick() {
        return this.calcFailedLastTick;
    }

    private void queuePathEvent(PathEvent pathEvent) {
        this.toDispatch.add(pathEvent);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void softCancelIfSafe() {
        Object object = this.pathPlanLock;
        synchronized (object) {
            this.getInProgress().ifPresent(AbstractNodeCostSearch::cancel);
            if (!this.isSafeToCancel()) {
                return;
            }
            this.current = null;
            this.next = null;
        }
        this.cancelRequested = true;
    }

    public void onPlayerSprintState(SprintStateEvent sprintStateEvent) {
        if (this.isPathing()) {
            sprintStateEvent.setState(this.current.isSprinting());
        }
    }

    public Optional<Double> estimatedTicksToGoal() {
        double d;
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        if (this.goal == null || betterBlockPos == null || this.startPosition == null) {
            return Optional.empty();
        }
        if (this.goal.isInGoal(this.ctx.playerFeet())) {
            this.resetEstimatedTicksToGoal();
            return Optional.of(0.0);
        }
        if (this.ticksElapsedSoFar == 0) {
            return Optional.empty();
        }
        double d2 = this.goal.heuristic(betterBlockPos.x, betterBlockPos.y, betterBlockPos.z);
        if (d2 == (d = this.goal.heuristic(this.startPosition.x, this.startPosition.y, this.startPosition.z))) {
            return Optional.empty();
        }
        double d3 = Math.abs(d2 - this.goal.heuristic()) * (double)this.ticksElapsedSoFar / Math.abs(d - d2);
        return Optional.of(d3);
    }

    private void findPathInNewThread(class07209 class072092, boolean bl, CalculationContext calculationContext) {
        long l;
        long l2;
        if (!Thread.holdsLock(this.pathCalcLock)) {
            throw new IllegalStateException("Must be called with synchronization on pathCalcLock");
        }
        if (this.inProgress != null) {
            throw new IllegalStateException("Already doing it");
        }
        if (!calculationContext.safeForThreadedUse) {
            throw new IllegalStateException("Improper context thread safety level");
        }
        Goal goal = this.goal;
        if (goal == null) {
            this.logDebug("no goal");
            return;
        }
        if (this.current == null) {
            l2 = (Long)Baritone.settings().primaryTimeoutMS.value;
            l = (Long)Baritone.settings().failureTimeoutMS.value;
        } else {
            l2 = (Long)Baritone.settings().planAheadPrimaryTimeoutMS.value;
            l = (Long)Baritone.settings().planAheadFailureTimeoutMS.value;
        }
        AbstractNodeCostSearch abstractNodeCostSearch = this.createPathfinder(class072092, goal, this.current == null ? null : this.current.getPath(), calculationContext);
        if (!Objects.equals(abstractNodeCostSearch.getGoal(), goal)) {
            this.logDebug("Simplifying " + String.valueOf(goal.getClass()) + " to GoalXZ due to distance");
        }
        this.inProgress = abstractNodeCostSearch;
        Baritone.getExecutor().execute(() -> {
            if (bl) {
                this.logDebug("Starting to search for path from " + String.valueOf(class072092) + " to " + String.valueOf(goal));
            }
            PathCalculationResult pathCalculationResult = abstractNodeCostSearch.calculate(l2, l);
            Object object = this.pathPlanLock;
            synchronized (object) {
                Optional<PathExecutor> optional = pathCalculationResult.getPath().map(iPath -> new PathExecutor(this, iPath));
                if (this.current == null) {
                    if (optional.isPresent()) {
                        if (optional.get().getPath().positions().contains((Object)this.expectedSegmentStart)) {
                            this.queuePathEvent(PathEvent.CALC_FINISHED_NOW_EXECUTING);
                            this.current = optional.get();
                            this.resetEstimatedTicksToGoal(class072092);
                        } else {
                            this.logDebug("Warning: discarding orphan path segment with incorrect start");
                        }
                    } else if (pathCalculationResult.getType() != PathCalculationResult$Type.CANCELLATION && pathCalculationResult.getType() != PathCalculationResult$Type.EXCEPTION) {
                        this.queuePathEvent(PathEvent.CALC_FAILED);
                    }
                } else if (this.next == null) {
                    if (optional.isPresent()) {
                        if (optional.get().getPath().getSrc().equals((Object)this.current.getPath().getDest())) {
                            this.queuePathEvent(PathEvent.NEXT_SEGMENT_CALC_FINISHED);
                            this.next = optional.get();
                        } else {
                            this.logDebug("Warning: discarding orphan next segment with incorrect start");
                        }
                    } else {
                        this.queuePathEvent(PathEvent.NEXT_CALC_FAILED);
                    }
                } else {
                    this.logDirect("Warning: PathingBehaivor illegal state! Discarding invalid path!");
                }
                if (bl && this.current != null && this.current.getPath() != null) {
                    if (goal.isInGoal(this.current.getPath().getDest())) {
                        this.logDebug("Finished finding a path from " + String.valueOf(class072092) + " to " + String.valueOf(goal) + ". " + this.current.getPath().getNumNodesConsidered() + " nodes considered");
                    } else {
                        this.logDebug("Found path segment from " + String.valueOf(class072092) + " towards " + String.valueOf(goal) + ". " + this.current.getPath().getNumNodesConsidered() + " nodes considered");
                    }
                }
                Object object2 = this.pathCalcLock;
                synchronized (object2) {
                    this.inProgress = null;
                }
            }
        });
    }

    public void secretInternalSetGoal(Goal goal) {
        this.goal = goal;
    }

    public boolean cancelSegmentIfSafe() {
        if (this.isSafeToCancel()) {
            this.secretInternalSegmentCancel();
            return true;
        }
        return false;
    }

    private void resetEstimatedTicksToGoal() {
        this.resetEstimatedTicksToGoal(this.expectedSegmentStart);
    }

    private void resetEstimatedTicksToGoal(BetterBlockPos betterBlockPos) {
        this.ticksElapsedSoFar = 0;
        this.startPosition = betterBlockPos;
    }

    private void resetEstimatedTicksToGoal(class07209 class072092) {
        this.resetEstimatedTicksToGoal(new BetterBlockPos(class072092));
    }
}

