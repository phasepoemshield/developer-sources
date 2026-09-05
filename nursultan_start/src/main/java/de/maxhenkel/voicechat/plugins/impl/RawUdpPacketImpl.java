/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.RawUdpPacket;
import java.net.SocketAddress;

public class RawUdpPacketImpl
implements RawUdpPacket {
    private final byte[] data;
    private final SocketAddress socketAddress;
    private final long timestamp;

    public RawUdpPacketImpl(byte[] byArray, SocketAddress socketAddress, long l) {
        this.data = byArray;
        this.socketAddress = socketAddress;
        this.timestamp = l;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public byte[] getData() {
        return this.data;
    }

    public SocketAddress getSocketAddress() {
        return this.socketAddress;
    }
}

