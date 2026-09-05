/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.type.Cancellable
 */
package baritone.api.event.events;

import baritone.api.event.events.type.Cancellable;

public final class ChatEvent
extends Cancellable {
    private final String message;

    public ChatEvent(String string) {
        this.message = string;
    }

    public final String getMessage() {
        return this.message;
    }
}

