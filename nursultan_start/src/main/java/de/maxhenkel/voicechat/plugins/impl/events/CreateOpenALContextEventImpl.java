/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;

public class CreateOpenALContextEventImpl
extends ClientEventImpl
implements CreateOpenALContextEvent {
    protected long context;
    protected long device;

    public CreateOpenALContextEventImpl(long l, long l2) {
        this.context = l;
        this.device = l2;
    }

    public long getContext() {
        return this.context;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }

    public long getDevice() {
        return this.device;
    }
}

