/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.utils.BaritoneProcessHelper;

public class InventoryPauserProcess
extends BaritoneProcessHelper {
    boolean pauseRequestedLastTick;
    boolean safeToCancelLastTick;
    int ticksOfStationary;

    public InventoryPauserProcess(Baritone baritone) {
        super(baritone);
    }

    public double priority() {
        return 5.1;
    }

    public boolean isActive() {
        return this.ctx.player() != null && this.ctx.world() != null;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        this.safeToCancelLastTick = bl2;
        if (this.pauseRequestedLastTick) {
            this.pauseRequestedLastTick = false;
            if (this.stationaryNow()) {
                ++this.ticksOfStationary;
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        this.ticksOfStationary = 0;
        return new PathingCommand(null, PathingCommandType.DEFER);
    }

    private double motion() {
        return this.ctx.player().method_18798().u(1.0, 0.0, 1.0).M();
    }

    public String displayName0() {
        return "inventory pauser";
    }

    public void onLostControl() {
    }

    @Override
    public boolean isTemporary() {
        return true;
    }

    private boolean stationaryNow() {
        return this.motion() < 1.0E-5;
    }

    public boolean stationaryForInventoryMove() {
        this.pauseRequestedLastTick = true;
        return this.safeToCancelLastTick && this.ticksOfStationary > 1;
    }
}

