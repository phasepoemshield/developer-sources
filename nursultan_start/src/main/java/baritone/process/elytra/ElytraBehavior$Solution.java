/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Rotation
 *  minecraft.class06889
 */
package baritone.process.elytra;

import baritone.api.utils.Rotation;
import baritone.process.elytra.ElytraBehavior$SolverContext;
import minecraft.class06889;

final class ElytraBehavior$Solution {
    public final ElytraBehavior.SolverContext context;
    public final Rotation rotation;
    public final class06889 goingTo;
    public final boolean solvedPitch;
    public final boolean forceUseFirework;

    public ElytraBehavior$Solution(ElytraBehavior.SolverContext solverContext, Rotation rotation, class06889 class068892, boolean bl, boolean bl2) {
        this.context = solverContext;
        this.rotation = rotation;
        this.goingTo = class068892;
        this.solvedPitch = bl;
        this.forceUseFirework = bl2;
    }
}

