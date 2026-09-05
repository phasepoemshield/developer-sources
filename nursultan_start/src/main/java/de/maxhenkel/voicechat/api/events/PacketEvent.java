/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.ServerEvent;
import de.maxhenkel.voicechat.api.packets.Packet;
import javax.annotation.Nullable;

public interface PacketEvent<T extends Packet>
extends ServerEvent {
    public T getPacket();

    @Nullable
    public VoicechatConnection getSenderConnection();

    @Nullable
    public VoicechatConnection getReceiverConnection();
}

