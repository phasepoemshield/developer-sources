/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.Packet
 *  de.maxhenkel.voicechat.plugins.impl.events.SoundPacketEventImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.Packet;
import de.maxhenkel.voicechat.plugins.impl.events.SoundPacketEventImpl;
import javax.annotation.Nullable;

public class LocationalSoundPacketEventImpl
extends SoundPacketEventImpl<LocationalSoundPacket>
implements LocationalSoundPacketEvent {
    public LocationalSoundPacketEventImpl(LocationalSoundPacket locationalSoundPacket, @Nullable VoicechatConnection voicechatConnection, VoicechatConnection voicechatConnection2, String string) {
        super((Packet)locationalSoundPacket, voicechatConnection, voicechatConnection2, string);
    }
}

