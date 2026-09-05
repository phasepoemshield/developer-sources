/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.process;

import baritone.api.pathing.goals.Goal;
import baritone.api.process.IBaritoneProcess;
import minecraft.class07209;

public interface IElytraProcess
extends IBaritoneProcess {
    public void resetState();

    public boolean isLoaded();

    public void pathTo(Goal var1);

    public void pathTo(class07209 var1);

    public boolean isSafeToCancel();

    public class07209 currentDestination();

    public void repackChunks();
}

