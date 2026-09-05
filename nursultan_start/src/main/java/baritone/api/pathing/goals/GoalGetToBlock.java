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

public class GoalGetToBlock
implements Goal,
IGoalRenderPos {
    public final int x;
    public final int y;
    public final int z;

    public GoalGetToBlock(class07209 class072092) {
        this.x = class072092.method_10263();
        this.y = class072092.method_10264();
        this.z = class072092.method_10260();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalGetToBlock goalGetToBlock = (GoalGetToBlock)object;
        return this.x == goalGetToBlock.x && this.y == goalGetToBlock.y && this.z == goalGetToBlock.z;
    }

    public String toString() {
        return String.format("GoalGetToBlock{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash(this.x, this.y, this.z) * -49639096;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        int n4 = n - this.x;
        int n5 = n2 - this.y;
        int n6 = n3 - this.z;
        return Math.abs(n4) + Math.abs(n5 < 0 ? n5 + 1 : n5) + Math.abs(n6) <= 1;
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

