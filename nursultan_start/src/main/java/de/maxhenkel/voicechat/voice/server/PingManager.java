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
import de.maxhenkel.voicechat.voice.server.PingManager$Ping;
import de.maxhenkel.voicechat.voice.server.PingManager$PingListener;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PingManager {
    private final Map<UUID, PingManager$Ping> listeners;
    final Server server;

    public PingManager(Server server) {
        this.server = server;
        this.listeners = new ConcurrentHashMap<UUID, PingManager$Ping>();
    }

    public void checkTimeouts() {
        if (this.listeners.isEmpty()) {
            return;
        }
        List list = this.listeners.entrySet().stream().filter(entry -> ((PingManager$Ping)entry.getValue()).isTimedOut()).toList();
        for (Map.Entry entry2 : list) {
            PingManager$Ping pingManager$Ping = (PingManager$Ping)entry2.getValue();
            if (pingManager$Ping.attempt >= pingManager$Ping.maxAttempts) {
                this.listeners.remove(entry2.getKey());
                pingManager$Ping.listener.onTimeout(pingManager$Ping.attempt);
                continue;
            }
            pingManager$Ping.listener.onFailedAttempt(pingManager$Ping.attempt);
            try {
                pingManager$Ping.send();
            }
            catch (Exception exception) {
                pingManager$Ping.listener.onTimeout(pingManager$Ping.attempt);
                Voicechat.LOGGER.warn("Failed to send ping {} after attempt {}", new Object[]{pingManager$Ping.id, pingManager$Ping.attempt});
            }
        }
    }

    public void onPongPacket(PingPacket pingPacket) {
        Voicechat.LOGGER.info("Received pong {}", new Object[]{pingPacket.getId()});
        PingManager$Ping pingManager$Ping = this.listeners.remove(pingPacket.getId());
        if (pingManager$Ping == null) {
            return;
        }
        pingManager$Ping.listener.onPong(pingManager$Ping.attempt, System.currentTimeMillis() - pingPacket.getTimestamp());
    }

    public void sendPing(ClientConnection clientConnection, long l, int n, PingManager$PingListener pingManager$PingListener) throws Exception {
        PingManager$Ping pingManager$Ping = new PingManager$Ping(this, clientConnection, pingManager$PingListener, l, n);
        this.listeners.put(pingManager$Ping.id, pingManager$Ping);
        pingManager$Ping.send();
    }
}

