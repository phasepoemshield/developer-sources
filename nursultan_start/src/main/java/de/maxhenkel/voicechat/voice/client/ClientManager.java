/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.debug.DebugOverlay
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.macos.PermissionCheck
 *  de.maxhenkel.voicechat.macos.VersionCheck
 *  de.maxhenkel.voicechat.macos.avfoundation.AVAuthorizationStatus
 *  de.maxhenkel.voicechat.net.Channel
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.RequestSecretPacket
 *  de.maxhenkel.voicechat.net.SecretPacket
 *  io.netty.channel.local.LocalAddress
 *  javax.annotation.Nullable
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01056
 *  minecraft.class01683
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.debug.DebugOverlay;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.macos.PermissionCheck;
import de.maxhenkel.voicechat.macos.VersionCheck;
import de.maxhenkel.voicechat.macos.avfoundation.AVAuthorizationStatus;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.RequestSecretPacket;
import de.maxhenkel.voicechat.net.SecretPacket;
import de.maxhenkel.voicechat.voice.client.ChatUtils;
import de.maxhenkel.voicechat.voice.client.ClientCategoryManager;
import de.maxhenkel.voicechat.voice.client.ClientGroupManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.client.InitializationData;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import de.maxhenkel.voicechat.voice.client.PTTKeyHandler;
import de.maxhenkel.voicechat.voice.client.RenderEvents;
import de.maxhenkel.voicechat.voice.server.Server;
import io.netty.channel.local.LocalAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import javax.annotation.Nullable;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01056;
import minecraft.class01683;
import minecraft.class06202;

public class ClientManager {
    @Nullable
    private ClientVoicechat client;
    private final ClientPlayerStateManager playerStateManager = new ClientPlayerStateManager();
    private final ClientGroupManager groupManager = new ClientGroupManager();
    private final ClientCategoryManager categoryManager = new ClientCategoryManager();
    private final PTTKeyHandler pttKeyHandler = new PTTKeyHandler();
    private final RenderEvents renderEvents = new RenderEvents();
    private final DebugOverlay debugOverlay = new DebugOverlay();
    private final KeyEvents keyEvents = new KeyEvents();
    private final class06202 minecraft = class06202.Nq();
    private boolean hasShownPermissionsMessage;
    private static ClientManager instance;

    private void authenticate(SecretPacket secretPacket) {
        class01683 class016832;
        if (this.client == null) {
            Voicechat.LOGGER.error("Received secret without a client being present", new Object[0]);
            return;
        }
        Voicechat.LOGGER.info("Received secret", new Object[0]);
        if (this.client.getConnection() != null) {
            ClientCompatibilityManager.INSTANCE.emitVoiceChatDisconnectedEvent();
        }
        if ((class016832 = this.minecraft.NE()) != null) {
            try {
                SocketAddress socketAddress = ClientCompatibilityManager.INSTANCE.getSocketAddress(class016832.M());
                this.client.connect(new InitializationData(ClientManager.resolveAddress(socketAddress), secretPacket));
            }
            catch (Exception exception) {
                Voicechat.LOGGER.error("Failed to connect to voice chat server", new Object[]{exception});
            }
        }
    }

    private ClientManager() {
        ClientCompatibilityManager.INSTANCE.onJoinWorld(this::onJoinWorld);
        ClientCompatibilityManager.INSTANCE.onDisconnect(this::onDisconnect);
        ClientCompatibilityManager.INSTANCE.onPublishServer(this::onPublishServer);
        ClientCompatibilityManager.INSTANCE.onVoiceChatConnected(clientVoicechatConnection -> {
            if (this.client != null) {
                this.client.onVoiceChatConnected((ClientVoicechatConnection)clientVoicechatConnection);
            }
        });
        ClientCompatibilityManager.INSTANCE.onVoiceChatDisconnected(() -> {
            if (this.client != null) {
                this.client.onVoiceChatDisconnected();
            }
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().secretChannel, (class044532, secretPacket) -> this.authenticate((SecretPacket)secretPacket));
    }

    public static synchronized ClientManager instance() {
        if (instance == null) {
            instance = new ClientManager();
        }
        return instance;
    }

    public static ClientCategoryManager getCategoryManager() {
        return ClientManager.instance().categoryManager;
    }

    public static RenderEvents getRenderEvents() {
        return ClientManager.instance().renderEvents;
    }

    public KeyEvents getKeyEvents() {
        return this.keyEvents;
    }

    public static PTTKeyHandler getPttKeyHandler() {
        return ClientManager.instance().pttKeyHandler;
    }

    private void onDisconnect() {
        if (this.client != null) {
            this.client.close();
            this.client = null;
        }
        ClientCompatibilityManager.INSTANCE.emitVoiceChatDisconnectedEvent();
    }

    private static String resolveAddress(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof LocalAddress) {
            return "127.0.0.1";
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new IOException(String.format("Failed to determine server address with SocketAddress of type %s", socketAddress.getClass().getSimpleName()));
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        InetAddress inetAddress = inetSocketAddress.getAddress();
        if (inetAddress == null) {
            return inetSocketAddress.getHostString();
        }
        return inetAddress.getHostAddress();
    }

    public void checkMicrophonePermissions() {
        if (!((Boolean)VoicechatClient.CLIENT_CONFIG.macosCheckMicrophonePermission.get()).booleanValue()) {
            return;
        }
        if (VersionCheck.isMacOSNativeCompatible()) {
            AVAuthorizationStatus aVAuthorizationStatus = PermissionCheck.getMicrophonePermissions();
            if (aVAuthorizationStatus.equals((Object)AVAuthorizationStatus.DENIED)) {
                if (!this.hasShownPermissionsMessage) {
                    ChatUtils.sendModErrorMessage("message.voicechat.macos_no_mic_permission");
                    this.hasShownPermissionsMessage = true;
                }
                Voicechat.LOGGER.warn("User hasn't granted microphone permissions: {}", new Object[]{aVAuthorizationStatus.name()});
            } else if (!aVAuthorizationStatus.equals((Object)AVAuthorizationStatus.AUTHORIZED)) {
                if (!this.hasShownPermissionsMessage) {
                    ChatUtils.sendModErrorMessage("message.voicechat.macos_unsupported_launcher");
                    this.hasShownPermissionsMessage = true;
                }
                Voicechat.LOGGER.warn("User has an unsupported launcher: {}", new Object[]{aVAuthorizationStatus.name()});
            }
        }
    }

    private static /* synthetic */ void lambda$onPublishServer$3(class06202 class062022, class00392 class003922) {
        ((class01056)class062022.i_6).i().N((class00392)class00392.N((String)"message.voicechat.server_port", (Object[])new Object[]{class003922}));
    }

    public static ClientPlayerStateManager getPlayerStateManager() {
        return ClientManager.instance().playerStateManager;
    }

    @Nullable
    public static ClientVoicechat getClient() {
        return ClientManager.instance().client;
    }

    private void onPublishServer(int n) {
        Object object;
        ClientVoicechat clientVoicechat;
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        try {
            Voicechat.LOGGER.info("Changing voice chat port to {}", new Object[]{n});
            server.changePort(n);
            clientVoicechat = ClientManager.getClient();
            if (clientVoicechat != null && (object = clientVoicechat.getConnection()) != null) {
                Voicechat.LOGGER.info("Force disconnecting due to port change", new Object[0]);
                ((ClientVoicechatConnection)object).disconnect();
            }
            ClientServerNetManager.sendToServer((Packet)new RequestSecretPacket(Voicechat.COMPATIBILITY_VERSION));
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to change voice chat port", new Object[]{exception});
        }
        clientVoicechat = class00390.N((String)String.valueOf(server.getPort()));
        object = class06202.Nq();
        object.execute(() -> ClientManager.lambda$onPublishServer$3((class06202)object, (class00392)clientVoicechat));
    }

    private void onJoinWorld() {
        if (((Boolean)VoicechatClient.CLIENT_CONFIG.muteOnJoin.get()).booleanValue()) {
            this.playerStateManager.setMuted(true);
        }
        if (this.client != null) {
            Voicechat.LOGGER.info("Disconnecting from previous connection due to server change", new Object[0]);
            ClientCompatibilityManager.INSTANCE.emitDisconnectedEvent();
        }
        this.hasShownPermissionsMessage = false;
        Voicechat.LOGGER.info("Sending secret request to the server", new Object[0]);
        ClientServerNetManager.sendToServer((Packet)new RequestSecretPacket(Voicechat.COMPATIBILITY_VERSION));
        this.client = new ClientVoicechat();
    }

    public static DebugOverlay getDebugOverlay() {
        return ClientManager.instance().debugOverlay;
    }

    public static ClientGroupManager getGroupManager() {
        return ClientManager.instance().groupManager;
    }
}

