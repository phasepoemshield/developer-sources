/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ClientVoicechatSocket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.ClientVoicechatSocket;
import de.maxhenkel.voicechat.api.events.ClientEvent;
import javax.annotation.Nullable;

public interface ClientVoicechatInitializationEvent
extends ClientEvent {
    @Nullable
    public ClientVoicechatSocket getSocketImplementation();

    public void setSocketImplementation(ClientVoicechatSocket var1);
}

