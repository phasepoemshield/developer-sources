/*
 * Decompiled with CFR 0.152.
 */
package baritone.behavior;

import baritone.api.utils.Rotation;
import baritone.behavior.LookBehavior$AbstractAimProcessor;

class LookBehavior$AbstractAimProcessor$1
extends LookBehavior$AbstractAimProcessor {
    private Rotation prev;
    final /* synthetic */ LookBehavior$AbstractAimProcessor this$0;

    LookBehavior$AbstractAimProcessor$1(LookBehavior$AbstractAimProcessor lookBehavior$AbstractAimProcessor, LookBehavior$AbstractAimProcessor lookBehavior$AbstractAimProcessor2) {
        this.this$0 = lookBehavior$AbstractAimProcessor;
        super(lookBehavior$AbstractAimProcessor2);
        this.prev = this.this$0.getPrevRotation();
    }

    @Override
    public Rotation nextRotation(Rotation rotation) {
        this.prev = super.nextRotation(rotation);
        return this.prev;
    }

    @Override
    protected Rotation getPrevRotation() {
        return this.prev;
    }
}

