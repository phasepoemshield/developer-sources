/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 *  de.maxhenkel.voicechat.api.VoicechatSocket
 *  de.maxhenkel.voicechat.debug.CooldownTimer
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.permission.PermissionManager
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  de.maxhenkel.voicechat.voice.server.ServerWorldUtils
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05623
 *  minecraft.class06889
 *  minecraft.class07049
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.api.VoicechatSocket;
import de.maxhenkel.voicechat.debug.CooldownTimer;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.permission.PermissionManager;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.KeepAlivePacket;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.common.Packet;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.common.Secret;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.PingManager;
import de.maxhenkel.voicechat.voice.server.PlayerStateManager;
import de.maxhenkel.voicechat.voice.server.Server$ProcessThread;
import de.maxhenkel.voicechat.voice.server.ServerCategoryManager;
import de.maxhenkel.voicechat.voice.server.ServerGroupManager;
import de.maxhenkel.voicechat.voice.server.ServerWorldUtils;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.channels.AsynchronousCloseException;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05623;
import minecraft.class06889;
import minecraft.class07049;

public class Server
extends Thread {
    final Map<UUID, ClientConnection> connections;
    final Map<UUID, ClientConnection> unCheckedConnections;
    final Map<UUID, Secret> secrets;
    private final boolean dedicated;
    private int port;
    final class02796 server;
    private VoicechatSocket socket;
    private final Server$ProcessThread processThread;
    final BlockingQueue<RawUdpPacket> packetQueue;
    final PingManager pingManager;
    private final PlayerStateManager playerStateManager;
    private final ServerGroupManager groupManager;
    private final ServerCategoryManager categoryManager;

    @Nullable
    public ClientConnection getConnection(UUID uUID) {
        return this.connections.get(uUID);
    }

    public Server(class02796 class027962) {
        this.dedicated = class027962 instanceof class05623;
        if (this.dedicated) {
            int n = (Integer)Voicechat.SERVER_CONFIG.voiceChatPort.get();
            if (n < 0) {
                Voicechat.LOGGER.info("Using the Minecraft servers port as voice chat port", new Object[0]);
                this.port = class027962.ar_();
            } else {
                this.port = n;
            }
        } else {
            this.port = 0;
        }
        this.server = class027962;
        this.socket = PluginManager.instance().getSocketImplementation(class027962);
        this.connections = new ConcurrentHashMap<UUID, ClientConnection>();
        this.unCheckedConnections = new ConcurrentHashMap<UUID, ClientConnection>();
        this.secrets = new ConcurrentHashMap<UUID, Secret>();
        this.packetQueue = new LinkedBlockingQueue<RawUdpPacket>();
        this.pingManager = new PingManager(this);
        this.playerStateManager = new PlayerStateManager(this);
        this.groupManager = new ServerGroupManager(this);
        this.categoryManager = new ServerCategoryManager(this);
        this.setDaemon(true);
        this.setName("VoiceChatServerThread");
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
        this.processThread = new Server$ProcessThread(this);
        this.processThread.start();
    }

    @Override
    public void run() {
        try {
            String string = this.getBindAddress();
            try {
                InetAddress.getByName(string);
            }
            catch (UnknownHostException unknownHostException) {
                Voicechat.LOGGER.error("Failed to parse bind IP address '{}'", new Object[]{string, unknownHostException});
                Voicechat.LOGGER.info("Binding to wildcard IP address", new Object[0]);
                string = "";
            }
            this.socket.open(this.port, string);
            if (string.isEmpty()) {
                Voicechat.LOGGER.info("Voice chat server started at port {}", new Object[]{this.socket.getLocalPort()});
            } else {
                Voicechat.LOGGER.info("Voice chat server started at {}:{}", new Object[]{string, this.socket.getLocalPort()});
            }
            while (!this.socket.isClosed()) {
                try {
                    this.packetQueue.add(this.socket.read());
                }
                catch (Exception exception) {
                    if (exception instanceof SocketException && exception.getCause() instanceof AsynchronousCloseException || !Voicechat.debugMode()) continue;
                    Voicechat.LOGGER.error("Failed to read from socket", new Object[]{exception});
                }
            }
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Voice chat server error", new Object[]{exception});
        }
    }

    public void close() {
        this.socket.close();
        this.processThread.close();
        PluginManager.instance().onServerStopped();
    }

    public int getPort() {
        return this.socket.getLocalPort();
    }

    public VoicechatSocket getSocket() {
        return this.socket;
    }

    @Nullable
    public ClientConnection getUnconnectedSender(NetworkMessage networkMessage) {
        return this.unCheckedConnections.values().stream().filter(clientConnection -> clientConnection.getAddress().equals(networkMessage.getAddress())).findAny().orElse(null);
    }

    private void processProximityPacket(PlayerState playerState, class04770 class047702, MicPacket micPacket) {
        UUID uUID = playerState.getGroup();
        float f = micPacket.isWhispering() ? ((Double)Voicechat.SERVER_CONFIG.whisperDistance.get()).floatValue() : Utils.getDefaultDistanceServer();
        f = PluginManager.instance().getDistance(class047702, playerState, micPacket, f);
        SoundPacket soundPacket = null;
        String string = null;
        if (class047702.method_7325()) {
            class04770 class047704;
            class07049 class070492;
            if (((Boolean)Voicechat.SERVER_CONFIG.spectatorPlayerPossession.get()).booleanValue() && (class070492 = class047702.method_14242()) instanceof class04770 && (class047704 = (class04770)class070492) != class047702) {
                PlayerState playerState2 = this.playerStateManager.getState(class047704.method_5667());
                if (playerState2 == null) {
                    return;
                }
                GroupSoundPacket groupSoundPacket = new GroupSoundPacket(playerState.getUuid(), playerState.getUuid(), micPacket.getData(), micPacket.getSequenceNumber(), null);
                ClientConnection clientConnection = this.getConnection(playerState2.getUuid());
                this.sendSoundPacket(class047702, playerState, class047704, playerState2, clientConnection, groupSoundPacket, "spectator");
                return;
            }
            if (((Boolean)Voicechat.SERVER_CONFIG.spectatorInteraction.get()).booleanValue()) {
                soundPacket = new LocationSoundPacket(class047702.method_5667(), class047702.method_5667(), class047702.method_33571(), micPacket.getData(), micPacket.getSequenceNumber(), f, null);
                string = "spectator";
            }
        }
        if (soundPacket == null) {
            soundPacket = new PlayerSoundPacket(class047702.method_5667(), class047702.method_5667(), micPacket.getData(), micPacket.getSequenceNumber(), micPacket.isWhispering(), f, null);
            string = "proximity";
        }
        this.broadcast(ServerWorldUtils.getPlayersInRange((class04782)class047702.method_51469(), (class06889)class047702.method_73189(), (double)this.getBroadcastRange(f), class047703 -> !class047703.method_5667().equals(class047702.method_5667())), soundPacket, class047702, playerState, uUID, string);
    }

    public void broadcast(Collection<class04770> collection, SoundPacket<?> soundPacket, @Nullable class04770 class047702, @Nullable PlayerState playerState, @Nullable UUID uUID, String string) {
        for (class04770 class047703 : collection) {
            PlayerState playerState2 = this.playerStateManager.getState(class047703.method_5667());
            if (playerState2 == null || playerState2.hasGroup() && playerState2.getGroup().equals(uUID)) continue;
            Group group = null;
            if (playerState2.hasGroup()) {
                group = this.groupManager.getGroup(playerState2.getGroup());
            }
            if (group != null && group.isIsolated()) continue;
            ClientConnection clientConnection = this.getConnection(playerState2.getUuid());
            this.sendSoundPacket(class047702, playerState, class047703, playerState2, clientConnection, soundPacket, string);
        }
    }

    public ServerCategoryManager getCategoryManager() {
        return this.categoryManager;
    }

    public Map<UUID, ClientConnection> getConnections() {
        return this.connections;
    }

    public boolean isClosed() {
        return !this.processThread.running;
    }

    @Nullable
    public ClientConnection getSender(NetworkMessage networkMessage) {
        return this.connections.values().stream().filter(clientConnection -> clientConnection.getAddress().equals(networkMessage.getAddress())).findAny().orElse(null);
    }

    public class02796 getServer() {
        return this.server;
    }

    void sendKeepAlives() {
        long l = System.currentTimeMillis();
        this.connections.values().removeIf(clientConnection -> {
            if (l - clientConnection.getLastKeepAliveResponse() >= (long)((Integer)Voicechat.SERVER_CONFIG.keepAlive.get()).intValue() * 10L) {
                this.secrets.remove(clientConnection.getPlayerUUID());
                Voicechat.LOGGER.info("Player {} timed out", new Object[]{clientConnection.getPlayerUUID()});
                class04770 class047702 = this.server.Nm().y(clientConnection.getPlayerUUID());
                if (class047702 != null) {
                    Voicechat.LOGGER.info("Reconnecting player {}", new Object[]{class047702.method_5477().getString()});
                    Voicechat.SERVER.initializePlayerConnection(class047702);
                } else {
                    Voicechat.LOGGER.warn("Reconnecting player {} failed (Could not find player)", new Object[]{clientConnection.getPlayerUUID()});
                }
                CommonCompatibilityManager.INSTANCE.emitServerVoiceChatDisconnectedEvent(clientConnection.getPlayerUUID());
                PluginManager.instance().onPlayerDisconnected(clientConnection.getPlayerUUID());
                return true;
            }
            return false;
        });
        for (ClientConnection clientConnection2 : this.connections.values()) {
            this.sendPacket(new KeepAlivePacket(), clientConnection2);
        }
    }

    private String getBindAddress() {
        if (!this.dedicated) {
            return "";
        }
        String string = (String)Voicechat.SERVER_CONFIG.voiceChatBindAddress.get();
        if (string.trim().equals("*")) {
            string = "";
        } else if (string.trim().equals("") && this.server instanceof class05623 && !(string = ((class05623)this.server).y().M).trim().isEmpty()) {
            try {
                InetAddress inetAddress = InetAddress.getByName(string);
                if (inetAddress.isLoopbackAddress()) {
                    string = "";
                } else {
                    Voicechat.LOGGER.info("Using server-ip as bind address: {}", new Object[]{string});
                }
            }
            catch (Exception exception) {
                Voicechat.LOGGER.warn("Invalid server-ip", new Object[]{exception});
                string = "";
            }
        }
        return string;
    }

    public void sendPacketRaw(Packet<?> packet, ClientConnection clientConnection) throws Exception {
        clientConnection.send(this, new NetworkMessage(packet));
    }

    public void disconnectClient(UUID uUID) {
        this.connections.remove(uUID);
        this.unCheckedConnections.remove(uUID);
        this.secrets.remove(uUID);
        PluginManager.instance().onPlayerDisconnected(uUID);
    }

    private void processMicPacket(class04770 class047702, PlayerState playerState, MicPacket micPacket) {
        if (playerState.hasGroup()) {
            Group group = this.groupManager.getGroup(playerState.getGroup());
            this.processGroupPacket(playerState, class047702, micPacket);
            if (group == null || group.isOpen()) {
                this.processProximityPacket(playerState, class047702, micPacket);
            }
            return;
        }
        this.processProximityPacket(playerState, class047702, micPacket);
    }

    private void processGroupPacket(PlayerState playerState, class04770 class047702, MicPacket micPacket) {
        UUID uUID = playerState.getGroup();
        if (uUID == null) {
            return;
        }
        GroupSoundPacket groupSoundPacket = new GroupSoundPacket(playerState.getUuid(), playerState.getUuid(), micPacket.getData(), micPacket.getSequenceNumber(), null);
        for (PlayerState playerState2 : this.playerStateManager.getStates()) {
            class04770 class047703;
            if (!uUID.equals(playerState2.getGroup()) || playerState.getUuid().equals(playerState2.getUuid()) || (class047703 = this.server.Nm().y(playerState2.getUuid())) == null) continue;
            ClientConnection clientConnection = this.getConnection(playerState2.getUuid());
            this.sendSoundPacket(class047702, playerState, class047703, playerState2, clientConnection, groupSoundPacket, "group");
        }
    }

    public void onPlayerVoicechatConnect(class04770 class047702) {
        this.playerStateManager.onPlayerVoicechatConnect(class047702);
    }

    public PlayerStateManager getPlayerStateManager() {
        return this.playerStateManager;
    }

    public void changePort(int n) throws Exception {
        VoicechatSocket voicechatSocket = PluginManager.instance().getSocketImplementation(this.server);
        voicechatSocket.open(n, this.getBindAddress());
        VoicechatSocket voicechatSocket2 = this.socket;
        this.socket = voicechatSocket;
        this.port = n;
        voicechatSocket2.close();
        this.connections.clear();
        this.unCheckedConnections.clear();
        this.secrets.clear();
    }

    public void onPlayerVoicechatDisconnect(UUID uUID) {
        this.playerStateManager.onPlayerVoicechatDisconnect(uUID);
    }

    @Nullable
    public Secret generateNewSecret(UUID uUID) {
        if (this.hasSecret(uUID)) {
            return null;
        }
        return this.getSecret(uUID);
    }

    public void onPlayerLoggedOut(class04770 class047702) {
        this.disconnectClient(class047702.method_5667());
        this.playerStateManager.onPlayerLoggedOut(class047702);
        this.groupManager.onPlayerLoggedOut(class047702);
    }

    public void onPlayerShow(class04770 class047702, class04770 class047703) {
        this.playerStateManager.onPlayerShow(class047702, class047703);
    }

    public void onPlayerHide(class04770 class047702, class04770 class047703) {
        this.playerStateManager.onPlayerHide(class047702, class047703);
    }

    public void sendSoundPacket(@Nullable class04770 class047702, @Nullable PlayerState playerState, class04770 class047703, PlayerState playerState2, @Nullable ClientConnection clientConnection, SoundPacket<?> soundPacket, String string) {
        PluginManager.instance().onListenerAudio(class047703.method_5667(), soundPacket);
        if (clientConnection == null) {
            return;
        }
        if (playerState2.isDisabled() || playerState2.isDisconnected()) {
            return;
        }
        if (PluginManager.instance().onSoundPacket(class047702, playerState, class047703, playerState2, soundPacket, string)) {
            return;
        }
        if (!PermissionManager.INSTANCE.LISTEN_PERMISSION.hasPermission(class047703)) {
            CooldownTimer.run((String)String.format("no-listen-%s", class047703.method_5667()), (long)30000L, () -> class047703.method_7353((class00392)class00392.L((String)"message.voicechat.no_listen_permission"), true));
            return;
        }
        this.sendPacket(soundPacket, clientConnection);
    }

    public boolean hasSecret(UUID uUID) {
        return this.secrets.containsKey(uUID);
    }

    public void onMicPacket(UUID uUID, MicPacket micPacket) {
        class04770 class047702 = this.server.Nm().y(uUID);
        if (class047702 == null) {
            return;
        }
        if (!PermissionManager.INSTANCE.SPEAK_PERMISSION.hasPermission(class047702)) {
            CooldownTimer.run((String)("no-speak-" + String.valueOf(uUID)), (long)30000L, () -> class047702.method_7353((class00392)class00392.L((String)"message.voicechat.no_speak_permission"), true));
            return;
        }
        PlayerState playerState = this.playerStateManager.getState(class047702.method_5667());
        if (playerState == null) {
            return;
        }
        if (!PluginManager.instance().onMicPacket(class047702, playerState, micPacket)) {
            this.processMicPacket(class047702, playerState, micPacket);
        }
    }

    public ServerGroupManager getGroupManager() {
        return this.groupManager;
    }

    public PingManager getPingManager() {
        return this.pingManager;
    }

    public void onPlayerLoggedIn(class04770 class047702) {
        this.playerStateManager.onPlayerLoggedIn(class047702);
    }

    public Secret getSecret(UUID uUID) {
        if (this.hasSecret(uUID)) {
            return this.secrets.get(uUID);
        }
        Secret secret = Secret.generateNewRandomSecret();
        this.secrets.put(uUID, secret);
        return secret;
    }

    public boolean sendPacket(Packet<?> packet, ClientConnection clientConnection) {
        try {
            this.sendPacketRaw(packet, clientConnection);
            return true;
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to send voice chat packet to {}", new Object[]{clientConnection.getPlayerUUID()});
            return false;
        }
    }

    public void onPlayerCompatibilityCheckSucceeded(class04770 class047702) {
        this.playerStateManager.onPlayerCompatibilityCheckSucceeded(class047702);
        this.groupManager.onPlayerCompatibilityCheckSucceeded(class047702);
        this.categoryManager.onPlayerCompatibilityCheckSucceeded(class047702);
    }

    public double getBroadcastRange(float f) {
        double d = (Double)Voicechat.SERVER_CONFIG.broadcastRange.get();
        if (d < 0.0) {
            d = (Double)Voicechat.SERVER_CONFIG.voiceChatDistance.get() + 1.0;
        }
        return Math.max(d, (double)f);
    }
}

