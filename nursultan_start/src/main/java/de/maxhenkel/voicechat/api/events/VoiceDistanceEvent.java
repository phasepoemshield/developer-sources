/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;

public interface VoiceDistanceEvent
extends ServerEvent {
    public MicrophonePacket getPacket();

    public float getDistance();

    public void setDistance(float var1);

    public VoicechatConnection getSenderConnection();
}

