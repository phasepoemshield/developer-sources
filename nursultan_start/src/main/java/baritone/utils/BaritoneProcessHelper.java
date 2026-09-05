/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.utils.Helper
 *  baritone.api.utils.IPlayerContext
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.process.IBaritoneProcess;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;

public abstract class BaritoneProcessHelper
implements IBaritoneProcess,
Helper {
    public final Baritone baritone;
    protected final IPlayerContext ctx;

    public BaritoneProcessHelper(Baritone baritone) {
        this.baritone = baritone;
        this.ctx = baritone.getPlayerContext();
    }

    public boolean isTemporary() {
        return false;
    }
}

