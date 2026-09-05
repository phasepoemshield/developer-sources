/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.movement.ActionCosts;
import baritone.api.utils.SettingsUtil;

public class GoalYLevel
implements Goal,
ActionCosts {
    public final int level;

    public GoalYLevel(int n) {
        this.level = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalYLevel goalYLevel = (GoalYLevel)object;
        return this.level == goalYLevel.level;
    }

    public String toString() {
        return String.format("GoalYLevel{y=%s}", SettingsUtil.maybeCensor(this.level));
    }

    public int hashCode() {
        return this.level * 1271009915;
    }

    public static double calculate(int n, int n2) {
        if (n2 > n) {
            return FALL_N_BLOCKS_COST[2] / 2.0 * (double)(n2 - n);
        }
        if (n2 < n) {
            return (double)(n - n2) * JUMP_ONE_BLOCK_COST;
        }
        return 0.0;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return n2 == this.level;
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        return GoalYLevel.calculate(this.level, n2);
    }
}

