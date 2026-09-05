/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;

public class ClientVoicechatConnectionEventImpl
extends ClientEventImpl
implements ClientVoicechatConnectionEvent {
    private final boolean connected;

    public ClientVoicechatConnectionEventImpl(boolean bl) {
        this.connected = bl;
    }

    public boolean isConnected() {
        return this.connected;
    }
}

