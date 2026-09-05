/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.Packet;
import minecraft.class00667;

public class MicPacket
implements Packet<MicPacket> {
    private byte[] data;
    private boolean whispering;
    private long sequenceNumber;

    public void setData(byte[] byArray) {
        this.data = byArray;
    }

    public MicPacket(byte[] byArray, boolean bl, long l) {
        this.data = byArray;
        this.whispering = bl;
        this.sequenceNumber = l;
    }

    public MicPacket() {
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.data);
        class006672.writeLong(this.sequenceNumber);
        class006672.writeBoolean(this.whispering);
    }

    public byte[] getData() {
        return this.data;
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    @Override
    public MicPacket fromBytes(class00667 class006672) {
        MicPacket micPacket = new MicPacket();
        micPacket.data = class006672.y();
        micPacket.sequenceNumber = class006672.readLong();
        micPacket.whispering = class006672.readBoolean();
        return micPacket;
    }

    @Override
    public long getTTL() {
        return 500L;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }
}

