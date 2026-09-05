/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 */
package baritone.api.pathing.goals;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalYLevel;

public class GoalAxis
implements Goal {
    private static final double SQRT_2_OVER_2 = Math.sqrt(2.0) / 2.0;

    public boolean equals(Object object) {
        return object.getClass() == GoalAxis.class;
    }

    public String toString() {
        return "GoalAxis";
    }

    public int hashCode() {
        return 201385781;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return n2 == (Integer)BaritoneAPI.getSettings().axisHeight.value && (n == 0 || n3 == 0 || Math.abs(n) == Math.abs(n3));
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        int n4 = Math.abs(n);
        int n5 = Math.abs(n3);
        int n6 = Math.min(n4, n5);
        int n7 = Math.max(n4, n5);
        int n8 = n7 - n6;
        double d = Math.min((double)n4, Math.min((double)n5, (double)n8 * SQRT_2_OVER_2));
        return d * (Double)BaritoneAPI.getSettings().costHeuristic.value + GoalYLevel.calculate((Integer)BaritoneAPI.getSettings().axisHeight.value, n2);
    }
}

