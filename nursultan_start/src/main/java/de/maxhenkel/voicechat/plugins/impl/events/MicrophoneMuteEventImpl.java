/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.MicrophoneMuteEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.MicrophoneMuteEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;

public class MicrophoneMuteEventImpl
extends ClientEventImpl
implements MicrophoneMuteEvent {
    private final boolean muted;

    public MicrophoneMuteEventImpl(boolean bl) {
        this.muted = bl;
    }

    public boolean isDisabled() {
        return this.muted;
    }
}

