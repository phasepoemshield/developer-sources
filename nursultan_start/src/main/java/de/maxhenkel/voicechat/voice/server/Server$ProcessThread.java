/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 *  de.maxhenkel.voicechat.debug.CooldownTimer
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.debug.CooldownTimer;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.AuthenticateAckPacket;
import de.maxhenkel.voicechat.voice.common.AuthenticatePacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckAckPacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckPacket;
import de.maxhenkel.voicechat.voice.common.KeepAlivePacket;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.common.Packet;
import de.maxhenkel.voicechat.voice.common.PingPacket;
import de.maxhenkel.voicechat.voice.common.Secret;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.concurrent.TimeUnit;
import minecraft.class04770;

class Server$ProcessThread
extends Thread {
    boolean running = true;
    private long lastKeepAlive = 0L;
    final /* synthetic */ Server this$0;

    public Server$ProcessThread(Server server) {
        this.this$0 = server;
        this.setDaemon(true);
        this.setName("VoiceChatPacketProcessingThread");
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
    }

    @Override
    public void run() {
        while (this.running) {
            try {
                Object object;
                Object object2;
                NetworkMessage networkMessage;
                RawUdpPacket rawUdpPacket;
                this.this$0.pingManager.checkTimeouts();
                long l = System.currentTimeMillis();
                if (l - this.lastKeepAlive > (long)((Integer)Voicechat.SERVER_CONFIG.keepAlive.get()).intValue()) {
                    this.this$0.sendKeepAlives();
                    this.lastKeepAlive = l;
                }
                if ((rawUdpPacket = this.this$0.packetQueue.poll(10L, TimeUnit.MILLISECONDS)) == null) continue;
                try {
                    networkMessage = NetworkMessage.readPacketServer(rawUdpPacket, this.this$0);
                }
                catch (Exception exception) {
                    CooldownTimer.run((String)"failed_reading_packet", () -> Voicechat.LOGGER.warn("Failed to read packet from {}", new Object[]{rawUdpPacket.getSocketAddress()}));
                    continue;
                }
                if (networkMessage == null) continue;
                if (System.currentTimeMillis() - networkMessage.getTimestamp() > networkMessage.getTTL()) {
                    CooldownTimer.run((String)"ttl", () -> {
                        Voicechat.LOGGER.warn("Dropping voice chat packets! Your Server might be overloaded!", new Object[0]);
                        Voicechat.LOGGER.warn("Packet queue has {} packets", new Object[]{this.this$0.packetQueue.size()});
                    });
                    continue;
                }
                Packet<? extends Packet> packet = networkMessage.getPacket();
                if (packet instanceof AuthenticatePacket && (packet = this.this$0.secrets.get(((AuthenticatePacket)(object2 = (AuthenticatePacket)packet)).getPlayerUUID())) != null && ((Secret)((Object)packet)).equals(((AuthenticatePacket)object2).getSecret())) {
                    object = this.this$0.unCheckedConnections.get(((AuthenticatePacket)object2).getPlayerUUID());
                    if (object == null) {
                        object = this.this$0.connections.get(((AuthenticatePacket)object2).getPlayerUUID());
                    }
                    if (object == null) {
                        object = new ClientConnection(((AuthenticatePacket)object2).getPlayerUUID(), networkMessage.getAddress());
                        this.this$0.unCheckedConnections.put(((AuthenticatePacket)object2).getPlayerUUID(), (ClientConnection)object);
                        Voicechat.LOGGER.info("Successfully authenticated player {}", new Object[]{((AuthenticatePacket)object2).getPlayerUUID()});
                    }
                    this.this$0.sendPacket(new AuthenticateAckPacket(), (ClientConnection)object);
                }
                if (networkMessage.getPacket() instanceof ConnectionCheckPacket) {
                    object2 = this.this$0.getUnconnectedSender(networkMessage);
                    if (object2 == null) {
                        object2 = this.this$0.getSender(networkMessage);
                        if (object2 == null) continue;
                        this.this$0.sendPacket(new ConnectionCheckAckPacket(), (ClientConnection)object2);
                        continue;
                    }
                    ((ClientConnection)object2).setLastKeepAliveResponse(System.currentTimeMillis());
                    this.this$0.connections.put(((ClientConnection)object2).getPlayerUUID(), (ClientConnection)object2);
                    this.this$0.unCheckedConnections.remove(((ClientConnection)object2).getPlayerUUID());
                    Voicechat.LOGGER.info("Successfully validated connection of player {}", new Object[]{((ClientConnection)object2).getPlayerUUID()});
                    packet = this.this$0.server.Nm().y(((ClientConnection)object2).getPlayerUUID());
                    if (packet != null) {
                        CommonCompatibilityManager.INSTANCE.emitServerVoiceChatConnectedEvent((class04770)packet);
                        PluginManager.instance().onPlayerConnected((class04770)packet);
                        Voicechat.LOGGER.info("Player {} ({}) successfully connected to voice chat", new Object[]{packet.method_5477().getString(), ((ClientConnection)object2).getPlayerUUID()});
                    }
                    this.this$0.sendPacket(new ConnectionCheckAckPacket(), (ClientConnection)object2);
                    continue;
                }
                object2 = this.this$0.getSender(networkMessage);
                if (object2 == null) continue;
                Packet<? extends Packet> packet2 = networkMessage.getPacket();
                if (packet2 instanceof MicPacket) {
                    packet = (MicPacket)packet2;
                    this.this$0.onMicPacket(((ClientConnection)object2).getPlayerUUID(), (MicPacket)packet);
                    continue;
                }
                packet2 = networkMessage.getPacket();
                if (packet2 instanceof PingPacket) {
                    object = (PingPacket)packet2;
                    this.this$0.pingManager.onPongPacket((PingPacket)object);
                    continue;
                }
                if (!(networkMessage.getPacket() instanceof KeepAlivePacket)) continue;
                ((ClientConnection)object2).setLastKeepAliveResponse(System.currentTimeMillis());
            }
            catch (Exception exception) {
                Voicechat.LOGGER.error("Voice chat server error", new Object[]{exception});
            }
        }
    }

    public void close() {
        this.running = false;
    }
}

