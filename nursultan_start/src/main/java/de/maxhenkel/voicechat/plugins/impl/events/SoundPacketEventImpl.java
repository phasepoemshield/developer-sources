/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.SoundPacketEvent
 *  de.maxhenkel.voicechat.api.packets.Packet
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.SoundPacketEvent;
import de.maxhenkel.voicechat.api.packets.Packet;
import de.maxhenkel.voicechat.plugins.impl.events.PacketEventImpl;
import javax.annotation.Nullable;

public class SoundPacketEventImpl<T extends Packet>
extends PacketEventImpl<T>
implements SoundPacketEvent<T> {
    private final String source;

    public SoundPacketEventImpl(T t, @Nullable VoicechatConnection voicechatConnection, @Nullable VoicechatConnection voicechatConnection2, String string) {
        super(t, voicechatConnection, voicechatConnection2);
        this.source = string;
    }

    public String getSource() {
        return this.source;
    }
}

