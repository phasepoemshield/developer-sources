/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.Packet;
import java.util.UUID;
import minecraft.class00667;

public class PingPacket
implements Packet<PingPacket> {
    private UUID id;
    private long timestamp;

    public PingPacket(UUID uUID, long l) {
        this.id = uUID;
        this.timestamp = l;
    }

    public PingPacket() {
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.id);
        class006672.writeLong(this.timestamp);
    }

    public UUID getId() {
        return this.id;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public PingPacket fromBytes(class00667 class006672) {
        PingPacket pingPacket = new PingPacket();
        pingPacket.id = class006672.m();
        pingPacket.timestamp = class006672.readLong();
        return pingPacket;
    }
}

