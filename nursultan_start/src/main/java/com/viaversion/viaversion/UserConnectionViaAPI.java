/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion;

import com.viaversion.viaversion.ViaAPIBase;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.buffer.ByteBuf;

public class UserConnectionViaAPI
extends ViaAPIBase<UserConnection> {
    @Override
    public void sendRawPacket(UserConnection connection, ByteBuf packet) {
        connection.sendRawPacket(packet);
    }

    @Override
    public ProtocolVersion getPlayerProtocolVersion(UserConnection connection) {
        return connection.getProtocolInfo().protocolVersion();
    }
}

