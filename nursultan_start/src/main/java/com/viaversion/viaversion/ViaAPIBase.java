/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.legacy.LegacyViaAPI
 *  com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion
 *  com.viaversion.viaversion.legacy.LegacyAPI
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.legacy.LegacyViaAPI;
import com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion;
import com.viaversion.viaversion.legacy.LegacyAPI;
import io.netty.buffer.ByteBuf;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class ViaAPIBase<T>
implements ViaAPI<T> {
    private final LegacyAPI<T> legacy = new LegacyAPI();

    @Override
    public SortedSet<ProtocolVersion> getSupportedProtocolVersions() {
        TreeSet<ProtocolVersion> outputSet = new TreeSet<ProtocolVersion>(Via.getManager().getProtocolManager().getSupportedVersions());
        BlockedProtocolVersions blockedVersions = Via.getPlatform().getConf().blockedProtocolVersions();
        outputSet.removeIf(arg_0 -> ((BlockedProtocolVersions)blockedVersions).contains(arg_0));
        return outputSet;
    }

    @Override
    public @Nullable UserConnection getConnection(UUID uuid) {
        return Via.getManager().getConnectionManager().getServerConnection(uuid);
    }

    @Override
    public String getVersion() {
        return Via.getPlatform().getPluginVersion();
    }

    @Override
    public void sendRawPacket(UUID uuid, ByteBuf packet) throws IllegalArgumentException {
        if (!this.isInjected(uuid)) {
            throw new IllegalArgumentException("This player is not controlled by ViaVersion!");
        }
        UserConnection user = Via.getManager().getConnectionManager().getServerConnection(uuid);
        user.scheduleSendRawPacket(packet);
    }

    @Override
    public ServerProtocolVersion getServerVersion() {
        return Via.getManager().getProtocolManager().getServerProtocolVersion();
    }

    @Override
    public boolean isInjected(UUID uuid) {
        return Via.getManager().getConnectionManager().hasServerConnection(uuid);
    }

    @Override
    public LegacyViaAPI<T> legacyAPI() {
        return this.legacy;
    }

    @Override
    public ProtocolVersion getPlayerProtocolVersion(UUID uuid) {
        UserConnection connection = Via.getManager().getConnectionManager().getServerConnection(uuid);
        return connection != null ? connection.getProtocolInfo().protocolVersion() : ProtocolVersion.unknown;
    }

    @Override
    public SortedSet<ProtocolVersion> getFullSupportedProtocolVersions() {
        return Via.getManager().getProtocolManager().getSupportedVersions();
    }
}

