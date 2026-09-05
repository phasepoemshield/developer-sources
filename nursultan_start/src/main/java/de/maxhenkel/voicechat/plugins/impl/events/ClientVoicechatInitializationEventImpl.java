/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ClientVoicechatSocket
 *  de.maxhenkel.voicechat.api.events.ClientVoicechatInitializationEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.ClientVoicechatSocket;
import de.maxhenkel.voicechat.api.events.ClientVoicechatInitializationEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;
import javax.annotation.Nullable;

public class ClientVoicechatInitializationEventImpl
extends ClientEventImpl
implements ClientVoicechatInitializationEvent {
    @Nullable
    private ClientVoicechatSocket socketImplementation;

    @Override
    public boolean isCancellable() {
        return false;
    }

    @Nullable
    public ClientVoicechatSocket getSocketImplementation() {
        return this.socketImplementation;
    }

    public void setSocketImplementation(ClientVoicechatSocket clientVoicechatSocket) {
        this.socketImplementation = clientVoicechatSocket;
    }
}

