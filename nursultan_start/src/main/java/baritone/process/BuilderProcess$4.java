/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  minecraft.class07209
 */
package baritone.process;

import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.process.BuilderProcess;
import minecraft.class07209;

class BuilderProcess$4
extends GoalGetToBlock {
    BuilderProcess$4(BuilderProcess builderProcess, class07209 class072092) {
        super(class072092);
    }

    public boolean isInGoal(int n, int n2, int n3) {
        if (n2 > this.y || n == this.x && n2 == this.y && n3 == this.z) {
            return false;
        }
        return super.isInGoal(n, n2, n3);
    }
}

