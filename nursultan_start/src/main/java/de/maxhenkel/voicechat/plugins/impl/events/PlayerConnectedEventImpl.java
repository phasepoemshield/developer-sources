/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.PlayerConnectedEvent
 *  de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.PlayerConnectedEvent;
import de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;

public class PlayerConnectedEventImpl
extends ServerEventImpl
implements PlayerConnectedEvent {
    protected VoicechatConnectionImpl connection;

    public VoicechatConnection getConnection() {
        return this.connection;
    }

    public PlayerConnectedEventImpl(VoicechatConnectionImpl voicechatConnectionImpl) {
        this.connection = voicechatConnectionImpl;
    }
}

