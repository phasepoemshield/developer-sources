/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalRunAway
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalRunAway;
import baritone.process.GetToBlockProcess;
import minecraft.class07209;

class GetToBlockProcess$1
extends GoalRunAway {
    GetToBlockProcess$1(GetToBlockProcess getToBlockProcess, double d, class07209 ... class07209Array) {
        super(d, class07209Array);
    }

    public boolean isInGoal(int n, int n2, int n3) {
        return false;
    }

    public double heuristic() {
        return Double.NEGATIVE_INFINITY;
    }
}

