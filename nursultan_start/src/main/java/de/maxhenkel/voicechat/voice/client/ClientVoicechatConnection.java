/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.ClientVoicechatSocket
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.ClientVoicechatSocket;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.ClientNetworkMessage;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection$AuthThread;
import de.maxhenkel.voicechat.voice.client.InitializationData;
import de.maxhenkel.voicechat.voice.common.AuthenticateAckPacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckAckPacket;
import de.maxhenkel.voicechat.voice.common.KeepAlivePacket;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.common.Packet;
import de.maxhenkel.voicechat.voice.common.PingPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class ClientVoicechatConnection
extends Thread {
    private ClientVoicechat client;
    final InitializationData data;
    private final ClientVoicechatSocket socket;
    private final InetAddress address;
    private boolean running;
    boolean authenticated;
    boolean connected;
    private final ClientVoicechatConnection$AuthThread authThread;
    private long lastKeepAlive;

    public boolean isInitialized() {
        return this.authenticated && this.connected;
    }

    public ClientVoicechatConnection(ClientVoicechat clientVoicechat, InitializationData initializationData) throws Exception {
        this.client = clientVoicechat;
        this.data = initializationData;
        this.address = InetAddress.getByName(initializationData.getServerIP());
        this.socket = ClientPluginManager.instance().getClientSocketImplementation();
        this.lastKeepAlive = -1L;
        this.running = true;
        this.authThread = new ClientVoicechatConnection$AuthThread(this);
        this.authThread.start();
        this.setDaemon(true);
        this.setName("VoiceChatConnectionThread");
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
        this.socket.open();
    }

    @Override
    public void run() {
        block8: {
            try {
                while (this.running) {
                    NetworkMessage networkMessage = ClientNetworkMessage.readPacketClient(this.socket.read(), this);
                    if (networkMessage == null) continue;
                    if (networkMessage.getPacket() instanceof AuthenticateAckPacket) {
                        if (this.authenticated) continue;
                        Voicechat.LOGGER.info("Server acknowledged authentication", new Object[0]);
                        this.authenticated = true;
                        continue;
                    }
                    if (networkMessage.getPacket() instanceof ConnectionCheckAckPacket) {
                        if (!this.authenticated || this.connected) continue;
                        Voicechat.LOGGER.info("Server acknowledged connection check", new Object[0]);
                        this.connected = true;
                        ClientCompatibilityManager.INSTANCE.emitVoiceChatConnectedEvent(this);
                        this.lastKeepAlive = System.currentTimeMillis();
                        continue;
                    }
                    Packet<? extends Packet> packet = networkMessage.getPacket();
                    if (packet instanceof SoundPacket) {
                        SoundPacket soundPacket = (SoundPacket)packet;
                        this.client.processSoundPacket(soundPacket);
                        continue;
                    }
                    packet = networkMessage.getPacket();
                    if (packet instanceof PingPacket) {
                        PingPacket pingPacket = (PingPacket)packet;
                        Voicechat.LOGGER.info("Received ping {}, sending pong...", new Object[]{pingPacket.getId()});
                        this.sendToServer(new NetworkMessage(pingPacket));
                        continue;
                    }
                    if (!(networkMessage.getPacket() instanceof KeepAlivePacket)) continue;
                    this.lastKeepAlive = System.currentTimeMillis();
                    this.sendToServer(new NetworkMessage(new KeepAlivePacket()));
                }
            }
            catch (InterruptedException interruptedException) {
            }
            catch (Exception exception) {
                if (!this.running) break block8;
                Voicechat.LOGGER.error("Failed to process packet from server", new Object[]{exception});
            }
        }
    }

    public void close() {
        Voicechat.LOGGER.info("Disconnecting voicechat", new Object[0]);
        this.running = false;
        this.socket.close();
        this.authThread.close();
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public InitializationData getData() {
        return this.data;
    }

    public ClientVoicechatSocket getSocket() {
        return this.socket;
    }

    public boolean sendToServer(NetworkMessage networkMessage) {
        if (!this.isConnected()) {
            return false;
        }
        try {
            this.socket.send(ClientNetworkMessage.writeClient(this, networkMessage), (SocketAddress)new InetSocketAddress(this.address, this.data.getServerPort()));
            return true;
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to send voice chat packet - Disconnecting", new Object[]{exception});
            this.disconnect();
            return false;
        }
    }

    public boolean isConnected() {
        return this.running && !this.socket.isClosed();
    }

    public void disconnect() {
        ClientCompatibilityManager.INSTANCE.emitVoiceChatDisconnectedEvent();
    }

    public void checkTimeout() {
        if (this.lastKeepAlive >= 0L && System.currentTimeMillis() - this.lastKeepAlive > (long)this.data.getKeepAlive() * 10L) {
            Voicechat.LOGGER.info("Connection timeout", new Object[0]);
            this.disconnect();
        }
    }
}

