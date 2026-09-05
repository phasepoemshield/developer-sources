/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.type.EventState
 */
package baritone.api.event.events;

import baritone.api.event.events.type.EventState;

public final class PlayerUpdateEvent {
    private final EventState state;

    public PlayerUpdateEvent(EventState eventState) {
        this.state = eventState;
    }

    public final EventState getState() {
        return this.state;
    }
}

