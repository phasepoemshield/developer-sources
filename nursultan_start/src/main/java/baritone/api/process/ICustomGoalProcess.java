/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.process;

import baritone.api.pathing.goals.Goal;
import baritone.api.process.IBaritoneProcess;

public interface ICustomGoalProcess
extends IBaritoneProcess {
    public void path();

    public Goal getGoal();

    public void setGoal(Goal var1);

    default public void setGoalAndPath(Goal goal) {
        this.setGoal(goal);
        this.path();
    }

    public Goal mostRecentGoal();
}

