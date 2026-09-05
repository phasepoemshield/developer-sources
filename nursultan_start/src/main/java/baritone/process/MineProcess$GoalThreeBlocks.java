/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalTwoBlocks
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.utils.SettingsUtil;
import minecraft.class07209;

class MineProcess$GoalThreeBlocks
extends GoalTwoBlocks {
    public MineProcess$GoalThreeBlocks(class07209 class072092) {
        super(class072092);
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public String toString() {
        return String.format("GoalThreeBlocks{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor((int)this.x), SettingsUtil.maybeCensor((int)this.y), SettingsUtil.maybeCensor((int)this.z));
    }

    public int hashCode() {
        return super.hashCode() * 393857768;
    }

    public boolean isInGoal(int n, int n2, int n3) {
        return n == this.x && (n2 == this.y || n2 == this.y - 1 || n2 == this.y - 2) && n3 == this.z;
    }

    public double heuristic(int n, int n2, int n3) {
        int n4 = n - this.x;
        int n5 = n2 - this.y;
        int n6 = n3 - this.z;
        return GoalBlock.calculate((double)n4, (int)(n5 < -1 ? n5 + 2 : (n5 == -1 ? 0 : n5)), (double)n6);
    }
}

