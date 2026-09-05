/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.events.SoundPacketEventImpl;
import javax.annotation.Nullable;

public class StaticSoundPacketEventImpl
extends SoundPacketEventImpl<StaticSoundPacket>
implements StaticSoundPacketEvent {
    public StaticSoundPacketEventImpl(StaticSoundPacket staticSoundPacket, @Nullable VoicechatConnection voicechatConnection, VoicechatConnection voicechatConnection2, String string) {
        super(staticSoundPacket, voicechatConnection, voicechatConnection2, string);
    }
}

