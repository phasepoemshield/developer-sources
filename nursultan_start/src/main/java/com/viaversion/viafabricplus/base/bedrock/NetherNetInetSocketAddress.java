/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 */
package com.viaversion.viafabricplus.base.bedrock;

import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.InetSocketAddress;

public final class NetherNetInetSocketAddress
extends InetSocketAddress {
    private final NetherNetAddress netherNetAddress;

    public NetherNetInetSocketAddress(NetherNetAddress netherNetAddress) {
        super(netherNetAddress.getNetworkId() + ".nethernet.viafabricplus.localhost", 0);
        this.netherNetAddress = netherNetAddress;
    }

    public NetherNetAddress getNetherNetAddress() {
        return this.netherNetAddress;
    }
}

