/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Range
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.VersionedPacketTransformer
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.protocol;

import com.google.common.collect.Range;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.ProtocolPathEntry;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.VersionedPacketTransformer;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.CompletableFuture;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ProtocolManager {
    public @Nullable Protocol getProtocol(ProtocolVersion var1, ProtocolVersion var2);

    public <T extends Protocol> @Nullable T getProtocol(Class<T> var1);

    public boolean isWorkingPipe();

    public List<Protocol> getBaseProtocols(@Nullable ProtocolVersion var1, @Nullable ProtocolVersion var2);

    public Protocol getBaseProtocol();

    public boolean hasLoadedMappings();

    public void registerProtocol(Protocol var1, List<ProtocolVersion> var2, ProtocolVersion var3);

    public void registerProtocol(Protocol var1, ProtocolVersion var2, ProtocolVersion var3);

    public @Nullable List<ProtocolPathEntry> getProtocolPath(ProtocolVersion var1, ProtocolVersion var2);

    @Deprecated
    default public @Nullable List<ProtocolPathEntry> getProtocolPath(int clientVersion, int serverVersion) {
        return this.getProtocolPath(ProtocolVersion.getProtocol(clientVersion), ProtocolVersion.getProtocol(serverVersion));
    }

    @Deprecated(forRemoval=true)
    default public boolean isBaseProtocol(Protocol protocol) {
        return protocol.isBaseProtocol();
    }

    public Collection<Protocol<?, ?, ?, ?>> getProtocols();

    public void addMappingLoaderFuture(Class<? extends Protocol> var1, Class<? extends Protocol> var2, Runnable var3);

    public void addMappingLoaderFuture(Class<? extends Protocol> var1, Runnable var2);

    public <C extends ClientboundPacketType, S extends ServerboundPacketType> VersionedPacketTransformer<C, S> createPacketTransformer(ProtocolVersion var1, @Nullable Class<C> var2, @Nullable Class<S> var3);

    public boolean checkForMappingCompletion(boolean var1);

    default public boolean checkForMappingCompletion() {
        return this.checkForMappingCompletion(false);
    }

    public void registerBaseProtocol(Direction var1, Protocol var2, Range<ProtocolVersion> var3);

    public int getMaxProtocolPathSize();

    public void setMaxProtocolPathSize(int var1);

    public @Nullable CompletableFuture<Void> getMappingLoaderFuture(Class<? extends Protocol> var1);

    public void setMaxPathDeltaIncrease(int var1);

    public int getMaxPathDeltaIncrease();

    public PacketWrapper createPacketWrapper(@Nullable PacketType var1, @Nullable ByteBuf var2, UserConnection var3);

    @Deprecated
    public PacketWrapper createPacketWrapper(int var1, @Nullable ByteBuf var2, UserConnection var3);

    public void completeMappingDataLoading(Class<? extends Protocol> var1);

    public ServerProtocolVersion getServerProtocolVersion();

    public SortedSet<ProtocolVersion> getSupportedVersions();
}

