/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.AudioUtils;
import de.maxhenkel.voicechat.voice.common.Packet;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class SoundPacket<T extends SoundPacket>
implements Packet<T> {
    public static final byte WHISPER_MASK = 1;
    public static final byte HAS_CATEGORY_MASK = 2;
    protected UUID channelId;
    protected UUID sender;
    protected byte[] data;
    protected long sequenceNumber;
    @Nullable
    protected String category;

    @Nullable
    public String getCategory() {
        return this.category;
    }

    public SoundPacket() {
    }

    public SoundPacket(UUID uUID, UUID uUID2, short[] sArray, @Nullable String string) {
        this.channelId = uUID;
        this.sender = uUID2;
        this.data = AudioUtils.shortsToBytes(sArray);
        this.sequenceNumber = -1L;
        this.category = string;
    }

    public SoundPacket(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        this.channelId = uUID;
        this.sender = uUID2;
        this.data = byArray;
        this.sequenceNumber = l;
        this.category = string;
    }

    public byte[] getData() {
        return this.data;
    }

    public UUID getSender() {
        return this.sender;
    }

    protected byte setFlag(byte by, byte by2) {
        return (byte)(by | by2);
    }

    protected boolean hasFlag(byte by, byte by2) {
        return (by & by2) != 0;
    }

    public boolean isFromClientAudioChannel() {
        return this.sequenceNumber < 0L;
    }

    public UUID getChannelId() {
        return this.channelId;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }
}

