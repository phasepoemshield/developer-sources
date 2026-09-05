/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.Goal
 */
package baritone.process;

import baritone.api.pathing.goals.Goal;
import java.util.Objects;

public class BuilderProcess$JankyGoalComposite
implements Goal {
    private final Goal primary;
    private final Goal fallback;

    public BuilderProcess$JankyGoalComposite(Goal goal, Goal goal2) {
        this.primary = goal;
        this.fallback = goal2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        BuilderProcess$JankyGoalComposite builderProcess$JankyGoalComposite = (BuilderProcess$JankyGoalComposite)object;
        return Objects.equals(this.primary, builderProcess$JankyGoalComposite.primary) && Objects.equals(this.fallback, builderProcess$JankyGoalComposite.fallback);
    }

    public String toString() {
        return "JankyComposite Primary: " + String.valueOf(this.primary) + " Fallback: " + String.valueOf(this.fallback);
    }

    public int hashCode() {
        int n = -1701079641;
        n = n * 1196141026 + this.primary.hashCode();
        n = n * -80327868 + this.fallback.hashCode();
        return n;
    }

    public boolean isInGoal(int n, int n2, int n3) {
        return this.primary.isInGoal(n, n2, n3) || this.fallback.isInGoal(n, n2, n3);
    }

    public double heuristic(int n, int n2, int n3) {
        return this.primary.heuristic(n, n2, n3);
    }
}

