/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.PacketEvent
 *  de.maxhenkel.voicechat.api.packets.Packet
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.PacketEvent;
import de.maxhenkel.voicechat.api.packets.Packet;
import de.maxhenkel.voicechat.plugins.impl.events.ServerEventImpl;
import javax.annotation.Nullable;

public class PacketEventImpl<T extends Packet>
extends ServerEventImpl
implements PacketEvent<T> {
    private final T packet;
    @Nullable
    private final VoicechatConnection receiverConnection;
    @Nullable
    private final VoicechatConnection senderConnection;

    public PacketEventImpl(T t, @Nullable VoicechatConnection voicechatConnection, @Nullable VoicechatConnection voicechatConnection2) {
        this.packet = t;
        this.senderConnection = voicechatConnection;
        this.receiverConnection = voicechatConnection2;
    }

    public T getPacket() {
        return this.packet;
    }

    @Nullable
    public VoicechatConnection getSenderConnection() {
        return this.senderConnection;
    }

    @Nullable
    public VoicechatConnection getReceiverConnection() {
        return this.receiverConnection;
    }
}

