/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.goals.Goal
 *  minecraft.class07209
 */
package baritone.utils.pathing;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.pathing.path.CutoffPath;
import baritone.utils.BlockStateInterface;
import minecraft.class07209;

public abstract class PathBase
implements IPath {
    public PathBase staticCutoff(Goal goal) {
        int n = (Integer)BaritoneAPI.getSettings().pathCutoffMinimumLength.value;
        if (this.length() < n) {
            return this;
        }
        if (goal == null || goal.isInGoal((class07209)this.getDest())) {
            return this;
        }
        double d = (Double)BaritoneAPI.getSettings().pathCutoffFactor.value;
        int n2 = (int)((double)(this.length() - n) * d) + n - 1;
        return new CutoffPath(this, n2);
    }

    public PathBase cutoffAtLoadedChunks(Object object) {
        if (!((Boolean)Baritone.settings().cutoffAtLoadBoundary.value).booleanValue()) {
            return this;
        }
        BlockStateInterface blockStateInterface = (BlockStateInterface)object;
        for (int i = 0; i < this.positions().size(); ++i) {
            class07209 class072092 = (class07209)this.positions().get(i);
            if (blockStateInterface.worldContainsLoadedChunk(class072092.method_10263(), class072092.method_10260())) continue;
            return new CutoffPath(this, i);
        }
        return this;
    }
}

