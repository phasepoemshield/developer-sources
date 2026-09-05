/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.legacy.LegacyViaAPI
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.legacy.LegacyViaAPI;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion;
import io.netty.buffer.ByteBuf;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Collectors;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ViaAPI<T> {
    public SortedSet<ProtocolVersion> getSupportedProtocolVersions();

    public @Nullable UserConnection getConnection(UUID var1);

    public String getVersion();

    default public int majorVersion() {
        return 5;
    }

    public void sendRawPacket(UUID var1, ByteBuf var2);

    public void sendRawPacket(T var1, ByteBuf var2);

    default public int getPlayerVersion(T player) {
        return this.getPlayerProtocolVersion(player).getVersion();
    }

    default public int getPlayerVersion(UUID uuid) {
        return this.getPlayerProtocolVersion(uuid).getVersion();
    }

    public ServerProtocolVersion getServerVersion();

    public boolean isInjected(UUID var1);

    public LegacyViaAPI<T> legacyAPI();

    public ProtocolVersion getPlayerProtocolVersion(T var1);

    public ProtocolVersion getPlayerProtocolVersion(UUID var1);

    @Deprecated
    default public SortedSet<Integer> getFullSupportedVersions() {
        return this.getFullSupportedProtocolVersions().stream().map(ProtocolVersion::getVersion).collect(Collectors.toCollection(TreeSet::new));
    }

    @Deprecated
    default public SortedSet<Integer> getSupportedVersions() {
        return this.getSupportedProtocolVersions().stream().map(ProtocolVersion::getVersion).collect(Collectors.toCollection(TreeSet::new));
    }

    public SortedSet<ProtocolVersion> getFullSupportedProtocolVersions();

    default public int apiVersion() {
        return 26;
    }
}

