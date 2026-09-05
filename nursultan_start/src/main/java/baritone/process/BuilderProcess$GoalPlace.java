/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.SettingsUtil;
import minecraft.class07209;

public class BuilderProcess$GoalPlace
extends GoalBlock {
    public BuilderProcess$GoalPlace(class07209 class072092) {
        super(class072092.method_10084());
    }

    public String toString() {
        return String.format("GoalPlace{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor((int)this.x), SettingsUtil.maybeCensor((int)this.y), SettingsUtil.maybeCensor((int)this.z));
    }

    public int hashCode() {
        return super.hashCode() * 1910811835;
    }

    public double heuristic(int n, int n2, int n3) {
        return (double)(this.y * 100) + super.heuristic(n, n2, n3);
    }
}

