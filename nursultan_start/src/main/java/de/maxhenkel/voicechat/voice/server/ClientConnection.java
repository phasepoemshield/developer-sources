/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.server.Server;
import java.net.SocketAddress;
import java.util.UUID;

public class ClientConnection {
    private final UUID playerUUID;
    private final SocketAddress address;
    private long lastKeepAliveResponse;

    public ClientConnection(UUID uUID, SocketAddress socketAddress) {
        this.playerUUID = uUID;
        this.address = socketAddress;
        this.lastKeepAliveResponse = System.currentTimeMillis();
    }

    public SocketAddress getAddress() {
        return this.address;
    }

    public long getLastKeepAliveResponse() {
        return this.lastKeepAliveResponse;
    }

    public void setLastKeepAliveResponse(long l) {
        this.lastKeepAliveResponse = l;
    }

    public void send(Server server, NetworkMessage networkMessage) throws Exception {
        server.getSocket().send(networkMessage.writeServer(server, this), this.address);
    }

    public UUID getPlayerUUID() {
        return this.playerUUID;
    }
}

