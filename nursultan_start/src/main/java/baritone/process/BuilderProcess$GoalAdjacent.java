/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import java.util.Objects;
import minecraft.class07209;

public class BuilderProcess$GoalAdjacent
extends GoalGetToBlock {
    private boolean allowSameLevel;
    private class07209 no;

    public BuilderProcess$GoalAdjacent(class07209 class072092, class07209 class072093, boolean bl) {
        super(class072092);
        this.no = class072093;
        this.allowSameLevel = bl;
    }

    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        BuilderProcess$GoalAdjacent builderProcess$GoalAdjacent = (BuilderProcess$GoalAdjacent)((Object)object);
        return this.allowSameLevel == builderProcess$GoalAdjacent.allowSameLevel && Objects.equals(this.no, builderProcess$GoalAdjacent.no);
    }

    public String toString() {
        return String.format("GoalAdjacent{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor((int)this.x), SettingsUtil.maybeCensor((int)this.y), SettingsUtil.maybeCensor((int)this.z));
    }

    public int hashCode() {
        int n = 806368046;
        n = n * 1412661222 + super.hashCode();
        n = n * 1730799370 + (int)BetterBlockPos.longHash((int)this.no.method_10263(), (int)this.no.method_10264(), (int)this.no.method_10260());
        n = n * 260592149 + (this.allowSameLevel ? -1314802005 : 1565710265);
        return n;
    }

    public boolean isInGoal(int n, int n2, int n3) {
        if (n == this.x && n2 == this.y && n3 == this.z) {
            return false;
        }
        if (n == this.no.method_10263() && n2 == this.no.method_10264() && n3 == this.no.method_10260()) {
            return false;
        }
        if (!this.allowSameLevel && n2 == this.y - 1) {
            return false;
        }
        if (n2 < this.y - 1) {
            return false;
        }
        return super.isInGoal(n, n2, n3);
    }

    public double heuristic(int n, int n2, int n3) {
        return (double)(this.y * 100) + super.heuristic(n, n2, n3);
    }
}

