/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ConnectionManager
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.connection;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ConnectionManager;
import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ConnectionManagerImpl
implements ConnectionManager {
    protected final Map<UUID, UserConnection> serverConnections = new ConcurrentHashMap<UUID, UserConnection>();
    protected final Map<UUID, UserConnection> clientConnections = new ConcurrentHashMap<UUID, UserConnection>();
    protected final Set<UserConnection> connections = ConcurrentHashMap.newKeySet();

    public Map<UUID, UserConnection> getServerConnections() {
        return Collections.unmodifiableMap(this.serverConnections);
    }

    public @Nullable UserConnection getClientConnection(UUID uuid) {
        return this.clientConnections.get(uuid);
    }

    public boolean hasClientConnection(UUID uuid) {
        return this.clientConnections.containsKey(uuid);
    }

    public Map<UUID, UserConnection> getClientConnections() {
        return Collections.unmodifiableMap(this.clientConnections);
    }

    public Set<UserConnection> getConnections() {
        return Collections.unmodifiableSet(this.connections);
    }

    public void onDisconnect(UserConnection connection) {
        Objects.requireNonNull(connection, "connection is null!");
        connection.setActive(false);
        this.connections.remove(connection);
        UUID id = connection.getProtocolInfo().getUuid();
        if (connection.isServerSide()) {
            this.serverConnections.remove(id, connection);
        } else {
            this.clientConnections.remove(id, connection);
        }
        connection.getChannel().eventLoop().execute(() -> ((UserConnection)connection).clearStoredObjects());
    }

    public void onLoginSuccess(UserConnection connection) {
        Objects.requireNonNull(connection, "connection is null!");
        Channel channel = connection.getChannel();
        if (channel != null && !channel.isOpen()) {
            return;
        }
        boolean newlyAdded = this.connections.add(connection);
        UUID id = connection.getProtocolInfo().getUuid();
        if (connection.isServerSide()) {
            UserConnection previous = this.serverConnections.put(id, connection);
            if (previous != null && previous != connection) {
                Via.getPlatform().getLogger().warning("Duplicate UUID on frontend connection! (" + String.valueOf(id) + ")");
            }
        } else {
            this.clientConnections.put(id, connection);
        }
        if (channel != null) {
            if (!channel.isOpen()) {
                this.onDisconnect(connection);
            } else if (newlyAdded) {
                channel.closeFuture().addListener((GenericFutureListener)((ChannelFutureListener)future -> this.onDisconnect(connection)));
            }
        }
    }

    public @Nullable UserConnection getServerConnection(UUID uuid) {
        return this.serverConnections.get(uuid);
    }

    public boolean hasServerConnection(UUID playerId) {
        return this.serverConnections.containsKey(playerId);
    }
}

