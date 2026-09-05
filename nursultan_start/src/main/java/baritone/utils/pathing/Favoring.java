/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.api.utils.IPlayerContext
 *  baritone.pathing.movement.CalculationContext
 *  it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap
 */
package baritone.utils.pathing;

import baritone.api.pathing.calc.IPath;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.pathing.movement.CalculationContext;
import baritone.utils.pathing.Avoidance;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;

public final class Favoring {
    private final Long2DoubleOpenHashMap favorings = new Long2DoubleOpenHashMap();

    public Favoring(IPlayerContext iPlayerContext, IPath iPath, CalculationContext calculationContext) {
        this(iPath, calculationContext);
        for (Avoidance avoidance : Avoidance.create(iPlayerContext)) {
            avoidance.applySpherical(this.favorings);
        }
        Helper.HELPER.logDebug("Favoring size: " + this.favorings.size());
    }

    public Favoring(IPath iPath, CalculationContext calculationContext) {
        this.favorings.defaultReturnValue(1.0);
        double d = calculationContext.backtrackCostFavoringCoefficient;
        if (d != 1.0 && iPath != null) {
            iPath.positions().forEach(betterBlockPos -> this.favorings.put(BetterBlockPos.longHash((BetterBlockPos)betterBlockPos), d));
        }
    }

    public boolean isEmpty() {
        return this.favorings.isEmpty();
    }

    public double calculate(long l) {
        return this.favorings.get(l);
    }
}

