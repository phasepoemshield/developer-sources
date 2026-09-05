/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.Event
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.Event;

public class EventImpl
implements Event {
    protected boolean cancelled;

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean cancel() {
        if (!this.isCancellable()) {
            return false;
        }
        this.cancelled = true;
        return true;
    }

    public boolean isCancellable() {
        return true;
    }
}

