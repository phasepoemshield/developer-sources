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
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.SettingsUtil;
import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class07209;

public class GoalRunAway
implements Goal {
    private final class07209[] from;
    private final int distanceSq;
    private final Integer maintainY;

    public GoalRunAway(double d, class07209 ... class07209Array) {
        this(d, (Integer)null, class07209Array);
    }

    public GoalRunAway(double d, Integer n, class07209 ... class07209Array) {
        if (class07209Array.length == 0) {
            throw new IllegalArgumentException("Positions to run away from must not be empty");
        }
        this.from = class07209Array;
        this.distanceSq = (int)(d * d);
        this.maintainY = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalRunAway goalRunAway = (GoalRunAway)object;
        return this.distanceSq == goalRunAway.distanceSq && Arrays.equals(this.from, goalRunAway.from) && Objects.equals(this.maintainY, goalRunAway.maintainY);
    }

    public String toString() {
        if (this.maintainY != null) {
            return String.format("GoalRunAwayFromMaintainY y=%s, %s", SettingsUtil.maybeCensor(this.maintainY), Arrays.asList(this.from));
        }
        return "GoalRunAwayFrom" + String.valueOf(Arrays.asList(this.from));
    }

    public int hashCode() {
        int n = Arrays.hashCode(this.from);
        n = n * 1196803141 + this.distanceSq;
        n = n * -2053788840 + this.maintainY;
        return n;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        if (this.maintainY != null && this.maintainY != n2) {
            return false;
        }
        for (class07209 class072092 : this.from) {
            int n4;
            int n5 = n - class072092.method_10263();
            int n6 = n5 * n5 + (n4 = n3 - class072092.method_10260()) * n4;
            if (n6 >= this.distanceSq) continue;
            return false;
        }
        return true;
    }

    @Override
    public double heuristic() {
        double d;
        int n = (int)Math.ceil(Math.sqrt(this.distanceSq));
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MAX_VALUE;
        int n5 = Integer.MIN_VALUE;
        int n6 = Integer.MIN_VALUE;
        int n7 = Integer.MIN_VALUE;
        for (class07209 class072092 : this.from) {
            n2 = Math.min(n2, class072092.method_10263() - n);
            n3 = Math.min(n3, class072092.method_10264() - n);
            n4 = Math.min(n4, class072092.method_10260() - n);
            n5 = Math.max(n2, class072092.method_10263() + n);
            n6 = Math.max(n3, class072092.method_10264() + n);
            n7 = Math.max(n4, class072092.method_10260() + n);
        }
        DoubleOpenHashSet doubleOpenHashSet = new DoubleOpenHashSet();
        double d2 = Double.POSITIVE_INFINITY;
        for (int i = n2; i <= n5; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    d = this.heuristic(i, j, k);
                    if (d < d2 && this.isInGoal(i, j, k)) {
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

    @Override
    public double heuristic(int n, int n2, int n3) {
        double d = Double.MAX_VALUE;
        for (class07209 class072092 : this.from) {
            double d2 = GoalXZ.calculate(class072092.method_10263() - n, class072092.method_10260() - n3);
            if (!(d2 < d)) continue;
            d = d2;
        }
        d = -d;
        if (this.maintainY != null) {
            d = d * 0.6 + GoalYLevel.calculate(this.maintainY, n2) * 1.5;
        }
        return d;
    }
}

