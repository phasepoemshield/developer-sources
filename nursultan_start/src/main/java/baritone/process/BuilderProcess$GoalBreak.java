/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.utils.SettingsUtil;
import minecraft.class07209;

public class BuilderProcess$GoalBreak
extends GoalGetToBlock {
    public BuilderProcess$GoalBreak(class07209 class072092) {
        super(class072092);
    }

    public String toString() {
        return String.format("GoalBreak{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor((int)this.x), SettingsUtil.maybeCensor((int)this.y), SettingsUtil.maybeCensor((int)this.z));
    }

    public int hashCode() {
        return super.hashCode() * 1636324008;
    }

    public boolean isInGoal(int n, int n2, int n3) {
        if (n2 > this.y) {
            return false;
        }
        return super.isInGoal(n, n2, n3);
    }
}

