/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.pathing.goals;

import minecraft.class07209;

public interface Goal {
    default public boolean isInGoal(class07209 class072092) {
        return this.isInGoal(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public boolean isInGoal(int var1, int var2, int var3);

    default public double heuristic() {
        return 0.0;
    }

    default public double heuristic(class07209 class072092) {
        return this.heuristic(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public double heuristic(int var1, int var2, int var3);
}

