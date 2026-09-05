/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.VoicechatDisableEvent
 *  de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.VoicechatDisableEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;

public class VoicechatDisableEventImpl
extends ClientEventImpl
implements VoicechatDisableEvent {
    private final boolean disabled;

    public VoicechatDisableEventImpl(boolean bl) {
        this.disabled = bl;
    }

    public boolean isDisabled() {
        return this.disabled;
    }
}

