/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.pathing.goals.GoalYLevel
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;

class ExploreProcess$1
extends GoalXZ {
    ExploreProcess$1(int n, int n2) {
        super(n, n2);
    }

    public double heuristic(int n, int n2, int n3) {
        return super.heuristic(n, n2, n3) + GoalYLevel.calculate((int)((Integer)Baritone.settings().exploreMaintainY.value), (int)n2);
    }
}

