/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatSocket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatSocket;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import javax.annotation.Nullable;

public interface VoicechatServerStartingEvent
extends ServerEvent {
    @Nullable
    public VoicechatSocket getSocketImplementation();

    public void setSocketImplementation(VoicechatSocket var1);
}

