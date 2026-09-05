/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.ServerEvent;

public interface PlayerConnectedEvent
extends ServerEvent {
    public VoicechatConnection getConnection();
}

