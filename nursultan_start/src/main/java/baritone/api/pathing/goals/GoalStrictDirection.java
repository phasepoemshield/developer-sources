/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import minecraft.class07209;
import minecraft.class07211;

public class GoalStrictDirection
implements Goal {
    public final int x;
    public final int y;
    public final int z;
    public final int dx;
    public final int dz;

    public GoalStrictDirection(class07209 class072092, class07211 class072112) {
        this.x = class072092.method_10263();
        this.y = class072092.method_10264();
        this.z = class072092.method_10260();
        this.dx = class072112.P();
        this.dz = class072112.T();
        if (this.dx == 0 && this.dz == 0) {
            throw new IllegalArgumentException(String.valueOf(class072112));
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalStrictDirection goalStrictDirection = (GoalStrictDirection)object;
        return this.x == goalStrictDirection.x && this.y == goalStrictDirection.y && this.z == goalStrictDirection.z && this.dx == goalStrictDirection.dx && this.dz == goalStrictDirection.dz;
    }

    public String toString() {
        return String.format("GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z), SettingsUtil.maybeCensor(this.dx), SettingsUtil.maybeCensor(this.dz));
    }

    public int hashCode() {
        int n = (int)BetterBlockPos.longHash(this.x, this.y, this.z);
        n = n * 630627507 + this.dx;
        n = n * -283028380 + this.dz;
        return n;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return false;
    }

    @Override
    public double heuristic() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        int n4 = (n - this.x) * this.dx + (n3 - this.z) * this.dz;
        int n5 = Math.abs((n - this.x) * this.dz) + Math.abs((n3 - this.z) * this.dx);
        int n6 = Math.abs(n2 - this.y);
        double d = -n4 * 100;
        d += (double)(n5 * 1000);
        return d += (double)(n6 * 1000);
    }
}

