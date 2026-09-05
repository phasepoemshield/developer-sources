/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;

public class StaticSoundPacketImpl
extends SoundPacketImpl
implements StaticSoundPacket {
    public StaticSoundPacketImpl(GroupSoundPacket groupSoundPacket) {
        super(groupSoundPacket);
    }
}

