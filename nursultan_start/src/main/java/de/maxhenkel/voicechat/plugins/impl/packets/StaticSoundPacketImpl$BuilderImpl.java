/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket$Builder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import java.util.UUID;
import javax.annotation.Nullable;

public class StaticSoundPacketImpl$BuilderImpl
extends SoundPacketImpl$BuilderImpl<StaticSoundPacketImpl$BuilderImpl, StaticSoundPacket>
implements StaticSoundPacket.Builder<StaticSoundPacketImpl$BuilderImpl> {
    public StaticSoundPacketImpl$BuilderImpl(SoundPacketImpl soundPacketImpl) {
        super(soundPacketImpl);
    }

    public StaticSoundPacketImpl$BuilderImpl(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
    }

    public StaticSoundPacket build() {
        return new StaticSoundPacketImpl(new GroupSoundPacket(this.channelId, this.sender, this.opusEncodedData, this.sequenceNumber, this.category));
    }
}

