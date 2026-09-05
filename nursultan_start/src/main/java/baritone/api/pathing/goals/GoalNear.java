/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleIterator
 *  it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet
 *  minecraft.class07209
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.interfaces.IGoalRenderPos;
import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import minecraft.class07209;

public class GoalNear
implements Goal,
IGoalRenderPos {
    private final int x;
    private final int y;
    private final int z;
    private final int rangeSq;

    public GoalNear(class07209 class072092, int n) {
        this.x = class072092.method_10263();
        this.y = class072092.method_10264();
        this.z = class072092.method_10260();
        this.rangeSq = n * n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalNear goalNear = (GoalNear)object;
        return this.x == goalNear.x && this.y == goalNear.y && this.z == goalNear.z && this.rangeSq == goalNear.rangeSq;
    }

    public String toString() {
        return String.format("GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z), this.rangeSq);
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash(this.x, this.y, this.z) + this.rangeSq;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        int n4 = n - this.x;
        int n5 = n2 - this.y;
        int n6 = n3 - this.z;
        return n4 * n4 + n5 * n5 + n6 * n6 <= this.rangeSq;
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

    @Override
    public double heuristic() {
        double d;
        int n = (int)Math.ceil(Math.sqrt(this.rangeSq));
        DoubleOpenHashSet doubleOpenHashSet = new DoubleOpenHashSet();
        double d2 = Double.POSITIVE_INFINITY;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    d = this.heuristic(this.x + i, this.y + j, this.z + k);
                    if (d < d2 && this.isInGoal(this.x + i, this.y + j, this.z + k)) {
                        doubleOpenHashSet.add(d);
                        continue;
                    }
                    d2 = Math.min(d2, d);
                }
            }
        }
        double d3 = Double.NEGATIVE_INFINITY;
        DoubleIterator doubleIterator = doubleOpenHashSet.iterator();
        while (doubleIterator.hasNext()) {
            d = doubleIterator.nextDouble();
            if (!(d < d2)) continue;
            d3 = Math.max(d3, d);
        }
        return d3;
    }
}

