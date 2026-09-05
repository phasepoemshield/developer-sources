/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.voice.common.PingPacket;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.PingManager;
import de.maxhenkel.voicechat.voice.server.PingManager$PingListener;
import java.util.UUID;

class PingManager$Ping {
    final UUID id = UUID.randomUUID();
    private final ClientConnection connection;
    final PingManager.PingListener listener;
    private long timestamp;
    private final long timeout;
    final int maxAttempts;
    int attempt;
    final /* synthetic */ PingManager this$0;

    public PingManager$Ping(PingManager pingManager, ClientConnection clientConnection, PingManager.PingListener pingListener, long l, int n) {
        this.this$0 = pingManager;
        this.connection = clientConnection;
        this.listener = pingListener;
        this.timeout = l;
        this.maxAttempts = n;
        this.attempt = 0;
    }

    public void send() throws Exception {
        this.timestamp = System.currentTimeMillis();
        ++this.attempt;
        this.this$0.server.sendPacketRaw(new PingPacket(this.id, this.timestamp), this.connection);
        Voicechat.LOGGER.info("Sent ping {} attempt {}", new Object[]{this.id, this.attempt});
    }

    public boolean isTimedOut() {
        return System.currentTimeMillis() - this.timestamp >= this.timeout;
    }
}

