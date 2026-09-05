/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.packets.ConvertablePacket;
import de.maxhenkel.voicechat.api.packets.Packet;
import java.util.UUID;
import javax.annotation.Nullable;

public interface SoundPacket
extends ConvertablePacket,
Packet {
    @Nullable
    public String getCategory();

    public UUID getSender();

    public UUID getChannelId();

    public byte[] getOpusEncodedData();

    public long getSequenceNumber();
}

