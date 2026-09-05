/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.Packet
 *  de.maxhenkel.voicechat.plugins.impl.events.SoundPacketEventImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.Packet;
import de.maxhenkel.voicechat.plugins.impl.events.SoundPacketEventImpl;
import javax.annotation.Nullable;

public class EntitySoundPacketEventImpl
extends SoundPacketEventImpl<EntitySoundPacket>
implements EntitySoundPacketEvent {
    public EntitySoundPacketEventImpl(EntitySoundPacket entitySoundPacket, @Nullable VoicechatConnection voicechatConnection, VoicechatConnection voicechatConnection2, String string) {
        super((Packet)entitySoundPacket, voicechatConnection, voicechatConnection2, string);
    }
}

