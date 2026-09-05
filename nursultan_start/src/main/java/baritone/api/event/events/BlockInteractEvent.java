/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.event.events;

import baritone.api.event.events.BlockInteractEvent$Type;
import minecraft.class07209;

public final class BlockInteractEvent {
    private final class07209 pos;
    private final BlockInteractEvent$Type type;

    public BlockInteractEvent(class07209 class072092, BlockInteractEvent$Type blockInteractEvent$Type) {
        this.pos = class072092;
        this.type = blockInteractEvent$Type;
    }

    public final BlockInteractEvent$Type getType() {
        return this.type;
    }

    public final class07209 getPos() {
        return this.pos;
    }
}

