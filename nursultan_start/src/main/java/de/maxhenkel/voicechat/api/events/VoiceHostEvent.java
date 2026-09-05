/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerPlayer
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.events.ServerEvent;

public interface VoiceHostEvent
extends ServerEvent {
    public String getVoiceHost();

    public ServerPlayer getPlayer();

    public void setVoiceHost(String var1);
}

