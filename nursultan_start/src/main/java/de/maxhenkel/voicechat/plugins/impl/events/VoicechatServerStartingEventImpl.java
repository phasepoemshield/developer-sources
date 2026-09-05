/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatSocket
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatSocket;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import javax.annotation.Nullable;

public class VoicechatServerStartingEventImpl
extends ServerEventImpl
implements VoicechatServerStartingEvent {
    @Nullable
    private VoicechatSocket socketImplementation;

    public boolean isCancellable() {
        return false;
    }

    @Nullable
    public VoicechatSocket getSocketImplementation() {
        return this.socketImplementation;
    }

    public void setSocketImplementation(VoicechatSocket voicechatSocket) {
        this.socketImplementation = voicechatSocket;
    }
}

