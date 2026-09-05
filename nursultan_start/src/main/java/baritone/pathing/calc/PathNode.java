/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.SettingsUtil
 */
package baritone.pathing.calc;

import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;

public final class PathNode {
    public final int x;
    public final int y;
    public final int z;
    public final double estimatedCostToGoal;
    public double cost = 1000000.0;
    public double combinedCost;
    public PathNode previous = null;
    public int heapPosition;

    public PathNode(int n, int n2, int n3, Goal goal) {
        this.estimatedCostToGoal = goal.heuristic(n, n2, n3);
        if (Double.isNaN(this.estimatedCostToGoal)) {
            throw new IllegalStateException(String.format("%s calculated implausible heuristic NaN at %s %s %s", goal, SettingsUtil.maybeCensor((int)n), SettingsUtil.maybeCensor((int)n2), SettingsUtil.maybeCensor((int)n3)));
        }
        this.heapPosition = -1;
        this.x = n;
        this.y = n2;
        this.z = n3;
    }

    public boolean equals(Object object) {
        PathNode pathNode = (PathNode)object;
        return this.x == pathNode.x && this.y == pathNode.y && this.z == pathNode.z;
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash((int)this.x, (int)this.y, (int)this.z);
    }

    public boolean isOpen() {
        return this.heapPosition != -1;
    }
}

