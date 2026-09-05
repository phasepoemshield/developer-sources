/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.ClientEvent;

public interface ClientVoicechatConnectionEvent
extends ClientEvent {
    public boolean isConnected();
}

