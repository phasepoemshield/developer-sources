/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.ICustomGoalProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  minecraft.class00392
 *  minecraft.class03448
 *  minecraft.class07209
 *  minecraft.class07299
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.process.CustomGoalProcess$State;
import baritone.utils.BaritoneProcessHelper;
import minecraft.class00392;
import minecraft.class03448;
import minecraft.class07209;
import minecraft.class07299;

public final class CustomGoalProcess
extends BaritoneProcessHelper
implements ICustomGoalProcess {
    private Goal goal;
    private Goal mostRecentGoal;
    private CustomGoalProcess$State state;

    public CustomGoalProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return this.state != CustomGoalProcess$State.NONE;
    }

    public void path() {
        this.state = CustomGoalProcess$State.PATH_REQUESTED;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        switch (this.state.ordinal()) {
            case 1: {
                return new PathingCommand(this.goal, PathingCommandType.CANCEL_AND_SET_GOAL);
            }
            case 2: {
                PathingCommand pathingCommand = new PathingCommand(this.goal, PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH);
                this.state = CustomGoalProcess$State.EXECUTING;
                return pathingCommand;
            }
            case 3: {
                if (bl) {
                    this.onLostControl();
                    return new PathingCommand(this.goal, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                if (this.goal == null || this.goal.isInGoal((class07209)this.ctx.playerFeet()) && this.goal.isInGoal((class07209)this.baritone.getPathingBehavior().pathStart())) {
                    class07299 class072992;
                    this.onLostControl();
                    if (((Boolean)Baritone.settings().disconnectOnArrival.value).booleanValue() && (class072992 = this.ctx.world()) instanceof class03448) {
                        class03448 class034482 = (class03448)class072992;
                        class034482.N((class00392)class00392.y((String)"[Baritone] Arrived at goal!"));
                    }
                    if (((Boolean)Baritone.settings().notificationOnPathComplete.value).booleanValue()) {
                        this.logNotification("Pathing complete", false);
                    }
                    return new PathingCommand(this.goal, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                return new PathingCommand(this.goal, PathingCommandType.SET_GOAL_AND_PATH);
            }
        }
        throw new IllegalStateException("Unexpected state " + String.valueOf((Object)this.state));
    }

    public Goal getGoal() {
        return this.goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
        this.mostRecentGoal = goal;
        if (this.baritone.getElytraProcess().isActive()) {
            this.baritone.getElytraProcess().pathTo(goal);
        }
        if (this.state == CustomGoalProcess$State.NONE) {
            this.state = CustomGoalProcess$State.GOAL_SET;
        }
        if (this.state == CustomGoalProcess$State.EXECUTING) {
            this.state = CustomGoalProcess$State.PATH_REQUESTED;
        }
    }

    public String displayName0() {
        return "Custom Goal " + String.valueOf(this.goal);
    }

    public void onLostControl() {
        this.state = CustomGoalProcess$State.NONE;
        this.goal = null;
    }

    public Goal mostRecentGoal() {
        return this.mostRecentGoal;
    }
}

