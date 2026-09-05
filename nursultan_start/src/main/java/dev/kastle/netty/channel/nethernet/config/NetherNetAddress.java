/*
 * Decompiled with CFR 0.152.
 */
package dev.kastle.netty.channel.nethernet.config;

import java.net.SocketAddress;

public class NetherNetAddress
extends SocketAddress {
    private final String networkId;

    public NetherNetAddress(long networkId) {
        this.networkId = Long.toUnsignedString(networkId);
    }

    public NetherNetAddress(String networkId) {
        this.networkId = networkId;
    }

    public String toString() {
        return this.networkId;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public long getNetworkIdAsLong() {
        return Long.parseUnsignedLong(this.networkId);
    }
}

