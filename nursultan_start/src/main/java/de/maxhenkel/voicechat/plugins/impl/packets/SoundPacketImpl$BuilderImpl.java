/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.SoundPacket
 *  de.maxhenkel.voicechat.api.packets.SoundPacket$Builder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.packets.SoundPacket;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class SoundPacketImpl$BuilderImpl<T extends SoundPacketImpl$BuilderImpl<T, P>, P extends SoundPacket>
implements SoundPacket.Builder<T, P> {
    protected UUID channelId;
    protected UUID sender;
    protected byte[] opusEncodedData;
    protected long sequenceNumber;
    @Nullable
    protected String category;

    public SoundPacketImpl$BuilderImpl(SoundPacketImpl soundPacketImpl) {
        this.channelId = soundPacketImpl.getChannelId();
        this.sender = soundPacketImpl.getSender();
        this.opusEncodedData = soundPacketImpl.getOpusEncodedData();
        this.sequenceNumber = soundPacketImpl.getSequenceNumber();
        this.category = soundPacketImpl.getCategory();
    }

    public SoundPacketImpl$BuilderImpl(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        this.channelId = uUID;
        this.sender = uUID2;
        this.opusEncodedData = byArray;
        this.sequenceNumber = l;
        this.category = string;
    }

    public T category(@Nullable String string) {
        this.category = string;
        return (T)this;
    }

    public T channelId(UUID uUID) {
        if (uUID == null) {
            throw new IllegalArgumentException("channelId can't be null");
        }
        this.channelId = uUID;
        return (T)this;
    }

    public T opusEncodedData(byte[] byArray) {
        this.opusEncodedData = byArray;
        return (T)this;
    }
}

