/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 */
package baritone.api.event.events;

import baritone.api.event.events.type.EventState;
import minecraft.class03448;

public final class WorldEvent {
    private final class03448 world;
    private final EventState state;

    public WorldEvent(class03448 class034482, EventState eventState) {
        this.world = class034482;
        this.state = eventState;
    }

    public final EventState getState() {
        return this.state;
    }

    public final class03448 getWorld() {
        return this.world;
    }
}

