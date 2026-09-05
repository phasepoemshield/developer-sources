/*
 * Decompiled with CFR 0.152.
 */
package baritone.behavior;

import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.behavior.LookBehavior$AbstractAimProcessor;

final class LookBehavior$AimProcessor
extends LookBehavior$AbstractAimProcessor {
    public LookBehavior$AimProcessor(IPlayerContext iPlayerContext) {
        super(iPlayerContext);
    }

    @Override
    protected Rotation getPrevRotation() {
        return this.ctx.playerRotations();
    }
}

