/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.behavior.IBehavior
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.behavior.IBehavior;
import baritone.api.utils.IPlayerContext;

public class Behavior
implements IBehavior {
    public final Baritone baritone;
    public final IPlayerContext ctx;

    public Behavior(Baritone baritone) {
        this.baritone = baritone;
        this.ctx = baritone.getPlayerContext();
    }
}

