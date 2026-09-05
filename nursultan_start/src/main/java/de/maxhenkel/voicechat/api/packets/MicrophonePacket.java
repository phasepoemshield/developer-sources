/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.packets.ConvertablePacket;
import de.maxhenkel.voicechat.api.packets.Packet;

public interface MicrophonePacket
extends ConvertablePacket,
Packet {
    public boolean isWhispering();

    public byte[] getOpusEncodedData();

    public void setOpusEncodedData(byte[] var1);
}

