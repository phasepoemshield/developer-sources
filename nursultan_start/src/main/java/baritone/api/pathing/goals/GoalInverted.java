/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import java.util.Objects;

public class GoalInverted
implements Goal {
    public final Goal origin;

    public GoalInverted(Goal goal) {
        this.origin = goal;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalInverted goalInverted = (GoalInverted)object;
        return Objects.equals(this.origin, goalInverted.origin);
    }

    public String toString() {
        return String.format("GoalInverted{%s}", this.origin.toString());
    }

    public int hashCode() {
        return this.origin.hashCode() * 495796690;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return false;
    }

    @Override
    public double heuristic() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        return -this.origin.heuristic(n, n2, n3);
    }
}

