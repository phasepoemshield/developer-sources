/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.pathing.movement.CalculationContext
 *  minecraft.class00500
 */
package baritone.process;

import baritone.api.IBaritone;
import baritone.pathing.movement.CalculationContext;
import minecraft.class00500;

public final class ElytraProcess$WalkOffCalculationContext
extends CalculationContext {
    public ElytraProcess$WalkOffCalculationContext(IBaritone iBaritone) {
        super(iBaritone, true);
        this.allowFallIntoLava = true;
        this.minFallHeight = 8;
        this.maxFallHeightNoWater = 10000;
    }

    public double breakCostMultiplierAt(int n, int n2, int n3, class00500 class005002) {
        return 1000000.0;
    }

    public double costOfPlacingAt(int n, int n2, int n3, class00500 class005002) {
        return 1000000.0;
    }

    public double placeBucketCost() {
        return 1000000.0;
    }
}

