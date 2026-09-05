/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  minecraft.class04995
 *  minecraft.class06889
 */
package baritone.api.pathing.goals;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import minecraft.class04995;
import minecraft.class06889;

public class GoalXZ
implements Goal {
    private static final double SQRT_2 = Math.sqrt(2.0);
    private final int x;
    private final int z;

    public GoalXZ(int n, int n2) {
        this.x = n;
        this.z = n2;
    }

    public GoalXZ(BetterBlockPos betterBlockPos) {
        this.x = betterBlockPos.x;
        this.z = betterBlockPos.z;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GoalXZ goalXZ = (GoalXZ)object;
        return this.x == goalXZ.x && this.z == goalXZ.z;
    }

    public String toString() {
        return String.format("GoalXZ{x=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.z));
    }

    public int hashCode() {
        int n = 1791873246;
        n = n * 222601791 + this.x;
        n = n * -1331679453 + this.z;
        return n;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return this.z;
    }

    public static double calculate(double d, double d2) {
        double d3;
        double d4;
        double d5 = Math.abs(d);
        if (d5 < (d4 = Math.abs(d2))) {
            d3 = d4 - d5;
            var10_5 = d5;
        } else {
            d3 = d5 - d4;
            var10_5 = d4;
        }
        return ((var10_5 *= SQRT_2) + d3) * (Double)BaritoneAPI.getSettings().costHeuristic.value;
    }

    @Override
    public boolean isInGoal(int n, int n2, int n3) {
        return n == this.x && n3 == this.z;
    }

    @Override
    public double heuristic(int n, int n2, int n3) {
        int n4 = n - this.x;
        int n5 = n3 - this.z;
        return GoalXZ.calculate(n4, n5);
    }

    public static GoalXZ fromDirection(class06889 class068892, float f, double d) {
        float f2 = (float)Math.toRadians(f);
        double d2 = class068892.M - (double)class04995.m((double)f2) * d;
        double d3 = class068892.Z + (double)class04995.P((double)f2) * d;
        return new GoalXZ(class04995.N((double)d2), class04995.N((double)d3));
    }
}

