/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.VoiceDistanceEvent
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.VoiceDistanceEvent;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import javax.annotation.Nullable;

public class VoiceDistanceEventImpl
extends ServerEventImpl
implements VoiceDistanceEvent {
    private final MicrophonePacket packet;
    private final VoicechatConnection senderConnection;
    private float distance;

    public VoiceDistanceEventImpl(MicrophonePacket microphonePacket, VoicechatConnection voicechatConnection, float f) {
        this.packet = microphonePacket;
        this.senderConnection = voicechatConnection;
        this.distance = f;
    }

    public boolean isCancellable() {
        return false;
    }

    public MicrophonePacket getPacket() {
        return this.packet;
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    @Nullable
    public VoicechatConnection getSenderConnection() {
        return this.senderConnection;
    }
}

