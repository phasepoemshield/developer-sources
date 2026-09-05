/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.behavior.look.IAimProcessor
 *  minecraft.class00734
 *  minecraft.class06889
 */
package baritone.process.elytra;

import baritone.api.behavior.look.IAimProcessor;
import baritone.process.elytra.ElytraBehavior;
import baritone.process.elytra.ElytraBehavior$FireworkBoost;
import baritone.process.elytra.NetherPath;
import java.util.Objects;
import minecraft.class00734;
import minecraft.class06889;

final class ElytraBehavior$SolverContext {
    public final NetherPath path;
    public final int playerNear;
    public final class06889 start;
    public final class06889 motion;
    public final class00734 boundingBox;
    public final boolean ignoreLava;
    public final ElytraBehavior$FireworkBoost boost;
    public final IAimProcessor aimProcessor;

    public ElytraBehavior$SolverContext(ElytraBehavior elytraBehavior, boolean bl) {
        Object object;
        this.path = elytraBehavior.pathManager.getPath();
        this.playerNear = elytraBehavior.pathManager.getNear();
        this.start = elytraBehavior.ctx.playerFeetAsVec();
        this.motion = elytraBehavior.ctx.playerMotion();
        this.boundingBox = elytraBehavior.ctx.player().method_5829();
        this.ignoreLava = elytraBehavior.ctx.player().method_5771();
        Integer n = bl && elytraBehavior.deployedFireworkLastTick ? ((object = elytraBehavior.nextTickBoostCounter)[1] > object[0] ? Integer.valueOf(0) : null) : (Integer)elytraBehavior.getAttachedFirework().map(class080062 -> class080062.field_6012).orElse(null);
        this.boost = new ElytraBehavior$FireworkBoost(n, elytraBehavior.minimumBoostTicks);
        object = elytraBehavior.baritone.getLookBehavior().getAimProcessor().fork();
        if (bl) {
            object.advance(1);
        }
        this.aimProcessor = (IAimProcessor)object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != ElytraBehavior$SolverContext.class) {
            return false;
        }
        ElytraBehavior$SolverContext elytraBehavior$SolverContext = (ElytraBehavior$SolverContext)object;
        return this.path == elytraBehavior$SolverContext.path && this.playerNear == elytraBehavior$SolverContext.playerNear && Objects.equals(this.start, elytraBehavior$SolverContext.start) && Objects.equals(this.motion, elytraBehavior$SolverContext.motion) && Objects.equals(this.boundingBox, elytraBehavior$SolverContext.boundingBox) && this.ignoreLava == elytraBehavior$SolverContext.ignoreLava && Objects.equals(this.boost, elytraBehavior$SolverContext.boost);
    }
}

