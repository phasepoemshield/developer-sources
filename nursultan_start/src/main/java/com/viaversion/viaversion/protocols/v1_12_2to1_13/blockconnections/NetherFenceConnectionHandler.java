/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections;

import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.AbstractFenceConnectionHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData;

public class NetherFenceConnectionHandler
extends AbstractFenceConnectionHandler {
    public NetherFenceConnectionHandler(String blockConnections) {
        super(blockConnections);
    }

    static ConnectionData.ConnectorInitAction init() {
        return new NetherFenceConnectionHandler("netherFence").getInitAction("minecraft:nether_brick_fence");
    }
}

