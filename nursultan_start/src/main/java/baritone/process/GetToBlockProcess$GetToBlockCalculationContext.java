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
import baritone.process.GetToBlockProcess;
import minecraft.class00500;

public class GetToBlockProcess$GetToBlockCalculationContext
extends CalculationContext {
    public GetToBlockProcess$GetToBlockCalculationContext(GetToBlockProcess getToBlockProcess, boolean bl) {
        super((IBaritone)GetToBlockProcess.access$001(getToBlockProcess), bl);
    }

    public double breakCostMultiplierAt(int n, int n2, int n3, class00500 class005002) {
        return 1.0;
    }
}

