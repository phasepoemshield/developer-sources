/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.MicrophonePacketEvent
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.api.packets.Packet
 *  de.maxhenkel.voicechat.plugins.impl.events.PacketEventImpl
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.api.packets.Packet;
import de.maxhenkel.voicechat.plugins.impl.events.PacketEventImpl;

public class MicrophonePacketEventImpl
extends PacketEventImpl<MicrophonePacket>
implements MicrophonePacketEvent {
    public MicrophonePacketEventImpl(MicrophonePacket microphonePacket, VoicechatConnection voicechatConnection) {
        super((Packet)microphonePacket, voicechatConnection, null);
    }
}

