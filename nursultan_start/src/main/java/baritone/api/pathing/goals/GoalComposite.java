/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import java.util.Arrays;

public class GoalComposite
implements Goal {
    private final Goal[] goals;

    public GoalComposite(Goal ... goalArray) {
        this.goals = goalArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalComposite goalComposite = (GoalComposite)object;
        return Arrays.equals(this.goals, goalComposite.goals);
    }

    public String toString() {
        return "GoalComposite" + Arrays.toString(this.goals);
    }

    public int hashCode() {
        return Arrays.hashCode(this.goals);
    }

    public Goal[] goals() {
        return this.goals;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        for (Goal goal : this.goals) {
            if (!goal.isInGoal(n, n2, n3)) continue;
            return true;
        }
        return false;
    }

    @Override
    public double heuristic() {
        double d = Double.MAX_VALUE;
        for (Goal goal : this.goals) {
            d = Math.min(d, goal.heuristic());
        }
        return d;
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        double d = Double.MAX_VALUE;
        for (Goal goal : this.goals) {
            d = Math.min(d, goal.heuristic(n, n2, n3));
        }
        return d;
    }
}

