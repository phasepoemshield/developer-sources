/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.interfaces.IGoalRenderPos;
import minecraft.class07209;

public class GoalTwoBlocks
implements Goal,
IGoalRenderPos {
    protected final int x;
    protected final int y;
    protected final int z;

    public GoalTwoBlocks(class07209 class072092) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public GoalTwoBlocks(int n, int n2, int n3) {
        this.x = n;
        this.y = n2;
        this.z = n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalTwoBlocks goalTwoBlocks = (GoalTwoBlocks)object;
        return this.x == goalTwoBlocks.x && this.y == goalTwoBlocks.y && this.z == goalTwoBlocks.z;
    }

    public String toString() {
        return String.format("GoalTwoBlocks{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash(this.x, this.y, this.z) * 516508351;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return n == this.x && (n2 == this.y || n2 == this.y - 1) && n3 == this.z;
    }

    @Override
    public class07209 getGoalPos() {
        return new class07209(this.x, this.y, this.z);
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        int n4 = n - this.x;
        int n5 = n2 - this.y;
        int n6 = n3 - this.z;
        return GoalBlock.calculate(n4, n5 < 0 ? n5 + 1 : n5, n6);
    }
}

