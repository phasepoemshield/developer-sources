/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.IElytraProcess
 *  baritone.api.process.PathingCommand
 *  minecraft.class07209
 */
package baritone.process.elytra;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.IElytraProcess;
import baritone.api.process.PathingCommand;
import baritone.utils.BaritoneProcessHelper;
import minecraft.class07209;

public final class NullElytraProcess
extends BaritoneProcessHelper
implements IElytraProcess {
    public NullElytraProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return false;
    }

    public void resetState() {
    }

    public boolean isLoaded() {
        return false;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        throw new UnsupportedOperationException("Called onTick on NullElytraProcess");
    }

    public void pathTo(Goal goal) {
        throw new UnsupportedOperationException("Called pathTo() on NullElytraBehavior");
    }

    public void pathTo(class07209 class072092) {
        throw new UnsupportedOperationException("Called pathTo() on NullElytraBehavior");
    }

    public boolean isSafeToCancel() {
        return true;
    }

    public class07209 currentDestination() {
        return null;
    }

    public String displayName0() {
        return "NullElytraProcess";
    }

    public void onLostControl() {
    }

    public void repackChunks() {
        throw new UnsupportedOperationException("Called repackChunks() on NullElytraBehavior");
    }
}

