/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import java.net.SocketAddress;

public interface RawUdpPacket {
    public long getTimestamp();

    public byte[] getData();

    public SocketAddress getSocketAddress();
}

