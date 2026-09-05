/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.interfaces.IGoalRenderPos;
import minecraft.class07209;

public class GoalBlock
implements Goal,
IGoalRenderPos {
    public final int x;
    public final int y;
    public final int z;

    public GoalBlock(class07209 class072092) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public GoalBlock(int n, int n2, int n3) {
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
        GoalBlock goalBlock = (GoalBlock)object;
        return this.x == goalBlock.x && this.y == goalBlock.y && this.z == goalBlock.z;
    }

    public String toString() {
        return String.format("GoalBlock{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash(this.x, this.y, this.z) * 905165533;
    }

    public static double calculate(double d, int n, double d2) {
        double d3 = 0.0;
        d3 += GoalYLevel.calculate(0, n);
        return d3 += GoalXZ.calculate(d, d2);
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return n == this.x && n2 == this.y && n3 == this.z;
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
        return GoalBlock.calculate(n4, n5, n6);
    }
}

