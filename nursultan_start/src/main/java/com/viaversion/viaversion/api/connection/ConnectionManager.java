/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.connection;

import com.viaversion.viaversion.api.connection.UserConnection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ConnectionManager {
    public Map<UUID, UserConnection> getServerConnections();

    public @Nullable UserConnection getClientConnection(UUID var1);

    public boolean hasClientConnection(UUID var1);

    public Map<UUID, UserConnection> getClientConnections();

    @Deprecated
    default public Map<UUID, UserConnection> getConnectedClients() {
        return this.getServerConnections();
    }

    public Set<UserConnection> getConnections();

    public void onDisconnect(UserConnection var1);

    public void onLoginSuccess(UserConnection var1);

    @Deprecated
    default public @Nullable UserConnection getConnectedClient(UUID uuid) {
        return this.getServerConnection(uuid);
    }

    @Deprecated
    default public boolean isClientConnected(UUID uuid) {
        return this.hasServerConnection(uuid);
    }

    public @Nullable UserConnection getServerConnection(UUID var1);

    public boolean hasServerConnection(UUID var1);
}

