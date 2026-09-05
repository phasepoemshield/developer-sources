/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.schematic.ISchematic
 *  baritone.pathing.movement.CalculationContext
 *  minecraft.class00500
 *  minecraft.class07662
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.schematic.ISchematic;
import baritone.pathing.movement.CalculationContext;
import baritone.process.BuilderProcess;
import java.util.List;
import minecraft.class00500;
import minecraft.class07662;

public class BuilderProcess$BuilderCalculationContext
extends CalculationContext {
    private final List<class00500> placeable;
    private final ISchematic schematic;
    private final int originX;
    private final int originY;
    private final int originZ;
    final /* synthetic */ BuilderProcess this$0;

    public BuilderProcess$BuilderCalculationContext(BuilderProcess builderProcess) {
        this.this$0 = builderProcess;
        super((IBaritone)BuilderProcess.access$000(builderProcess), true);
        this.placeable = builderProcess.approxPlaceable(9);
        this.schematic = builderProcess.schematic;
        this.originX = builderProcess.origin.method_10263();
        this.originY = builderProcess.origin.method_10264();
        this.originZ = builderProcess.origin.method_10260();
        this.jumpPenalty += 10.0;
        this.backtrackCostFavoringCoefficient = 1.0;
    }

    public double breakCostMultiplierAt(int n, int n2, int n3, class00500 class005002) {
        if (!this.allowBreak && !this.allowBreakAnyway.contains(class005002.i()) || this.isPossiblyProtected(n, n2, n3)) {
            return 1000000.0;
        }
        class00500 class005003 = this.getSchematic(n, n2, n3, class005002);
        if (class005003 != null) {
            if (class005003.i() instanceof class07662) {
                return 1.0;
            }
            if (BuilderProcess.valid(this.bsi.get0(n, n2, n3), class005003, false)) {
                return (Double)Baritone.settings().breakCorrectBlockPenaltyMultiplier.value;
            }
            return 1.0;
        }
        return 1.0;
    }

    class00500 getSchematic(int n, int n2, int n3, class00500 class005002) {
        if (this.schematic.inSchematic(n - this.originX, n2 - this.originY, n3 - this.originZ, class005002)) {
            return this.schematic.desiredState(n - this.originX, n2 - this.originY, n3 - this.originZ, class005002, this.this$0.approxPlaceable);
        }
        return null;
    }

    public double costOfPlacingAt(int n, int n2, int n3, class00500 class005002) {
        if (this.isPossiblyProtected(n, n2, n3) || !this.worldBorder.canPlaceAt(n, n3)) {
            return 1000000.0;
        }
        class00500 class005003 = this.getSchematic(n, n2, n3, class005002);
        if (class005003 != null) {
            if (class005003.i() instanceof class07662) {
                return this.placeBlockCost * (Double)Baritone.settings().placeIncorrectBlockPenaltyMultiplier.value;
            }
            if (this.placeable.contains(class005003)) {
                return 0.0;
            }
            if (!this.hasThrowaway) {
                return 1000000.0;
            }
            return this.placeBlockCost * 1.5 * (Double)Baritone.settings().placeIncorrectBlockPenaltyMultiplier.value;
        }
        if (this.hasThrowaway) {
            return this.placeBlockCost;
        }
        return 1000000.0;
    }
}

