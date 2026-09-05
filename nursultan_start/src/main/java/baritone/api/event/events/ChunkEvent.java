/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.type.EventState
 */
package baritone.api.event.events;

import baritone.api.event.events.ChunkEvent$Type;
import baritone.api.event.events.type.EventState;

public final class ChunkEvent {
    private final EventState state;
    private final ChunkEvent$Type type;
    private final int x;
    private final int z;

    public ChunkEvent(EventState eventState, ChunkEvent$Type chunkEvent$Type, int n, int n2) {
        this.state = eventState;
        this.type = chunkEvent$Type;
        this.x = n;
        this.z = n2;
    }

    public EventState getState() {
        return this.state;
    }

    public ChunkEvent$Type getType() {
        return this.type;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return this.z;
    }

    public boolean isPostPopulate() {
        return this.state == EventState.POST && this.type.isPopulate();
    }
}

