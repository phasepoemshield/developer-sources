/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.CrossSideManager
 *  de.maxhenkel.voicechat.net.NetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.PacketRateLimiter
 *  de.maxhenkel.voicechat.net.SecretPacket
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  de.maxhenkel.voicechat.voice.common.Secret
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class05623
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.PacketRateLimiter;
import de.maxhenkel.voicechat.net.SecretPacket;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.Secret;
import de.maxhenkel.voicechat.voice.server.Server;
import de.maxhenkel.voicechat.voice.server.ServerVoiceEvents$1;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class05623;
import minecraft.class06541;

public class ServerVoiceEvents {
    private final Map<UUID, Integer> clientCompatibilities = new ConcurrentHashMap<UUID, Integer>();
    private final PacketRateLimiter rateLimiter;
    private Server server;

    public ServerVoiceEvents() {
        this.rateLimiter = new PacketRateLimiter(((Integer)Voicechat.SERVER_CONFIG.tcpRateLimit.get()).intValue());
        CommonCompatibilityManager.INSTANCE.onServerStarting(this::serverStarting);
        CommonCompatibilityManager.INSTANCE.onPlayerLoggedIn(this::playerLoggedIn);
        CommonCompatibilityManager.INSTANCE.onPlayerLoggedOut(this::playerLoggedOut);
        CommonCompatibilityManager.INSTANCE.onPlayerHide(this::onPlayerHide);
        CommonCompatibilityManager.INSTANCE.onPlayerShow(this::onPlayerShow);
        CommonCompatibilityManager.INSTANCE.onServerStopping(this::serverStopping);
        CommonCompatibilityManager.INSTANCE.onServerVoiceChatConnected(this::serverVoiceChatConnected);
        CommonCompatibilityManager.INSTANCE.onServerVoiceChatDisconnected(this::serverVoiceChatDisconnected);
        CommonCompatibilityManager.INSTANCE.onPlayerCompatibilityCheckSucceeded(this::playerCompatibilityCheckSucceeded);
        CommonCompatibilityManager.INSTANCE.getNetManager().requestSecretChannel.setServerListener((class047702, requestSecretPacket) -> {
            Voicechat.LOGGER.info("Received secret request of {} ({})", new Object[]{class047702.method_5477().getString(), requestSecretPacket.getCompatibilityVersion()});
            this.clientCompatibilities.put(class047702.method_5667(), requestSecretPacket.getCompatibilityVersion());
            if (requestSecretPacket.getCompatibilityVersion() != Voicechat.COMPATIBILITY_VERSION) {
                Voicechat.LOGGER.warn("Connected client {} has incompatible voice chat version (server={}, client={})", new Object[]{class047702.method_5477().getString(), Voicechat.COMPATIBILITY_VERSION, requestSecretPacket.getCompatibilityVersion()});
                class047702.method_64398(this.getIncompatibleMessage(requestSecretPacket.getCompatibilityVersion()));
            } else {
                this.initializePlayerConnection(class047702);
            }
        });
    }

    public boolean isCompatible(class04770 class047702) {
        return this.isCompatible(class047702.method_5667());
    }

    public boolean isCompatible(UUID uUID) {
        return this.clientCompatibilities.getOrDefault(uUID, -1) == Voicechat.COMPATIBILITY_VERSION;
    }

    @Nullable
    public Server getServer() {
        return this.server;
    }

    public void serverVoiceChatConnected(class04770 class047702) {
        if (this.server == null) {
            return;
        }
        this.server.onPlayerVoicechatConnect(class047702);
    }

    public class00392 getIncompatibleMessage(int n) {
        if (n <= 6) {
            return class00392.y((String)((String)Voicechat.TRANSLATIONS.voicechatNotCompatibleMessage.get()).formatted(new Object[]{"2.6.x", CommonCompatibilityManager.INSTANCE.getModName()}));
        }
        return class00392.N((String)"message.voicechat.incompatible_version", (String)"Your voice chat client version is not compatible with the server-side version.\nPlease install version %s of %s.", (Object[])new Object[]{class00392.y((String)"2.6.x").N(class06541.field_1067), class00392.y((String)CommonCompatibilityManager.INSTANCE.getModName()).N(class06541.field_1067)});
    }

    public void initializePlayerConnection(class04770 class047702) {
        if (this.server == null) {
            return;
        }
        CommonCompatibilityManager.INSTANCE.emitPlayerCompatibilityCheckSucceeded(class047702);
        Secret secret = this.server.generateNewSecret(class047702.method_5667());
        if (secret == null) {
            Voicechat.LOGGER.warn("Player already requested secret - ignoring", new Object[0]);
            return;
        }
        NetManager.sendToClient((class04770)class047702, (Packet)new SecretPacket(class047702, secret, this.server.getPort(), Voicechat.SERVER_CONFIG));
        Voicechat.LOGGER.info("Sent secret to {}", new Object[]{class047702.method_5477().getString()});
    }

    public void playerCompatibilityCheckSucceeded(class04770 class047702) {
        if (this.server == null) {
            return;
        }
        this.server.onPlayerCompatibilityCheckSucceeded(class047702);
    }

    public void serverVoiceChatDisconnected(UUID uUID) {
        if (this.server == null) {
            return;
        }
        this.server.onPlayerVoicechatDisconnect(uUID);
    }

    public void playerLoggedIn(class04770 class047702) {
        if (this.server != null) {
            this.server.onPlayerLoggedIn(class047702);
        }
        if (!((Boolean)Voicechat.SERVER_CONFIG.forceVoiceChat.get()).booleanValue()) {
            return;
        }
        Timer timer = new Timer("%s-login-timer".formatted(new Object[]{class047702.method_7334().name()}), true);
        timer.schedule((TimerTask)new ServerVoiceEvents$1(this, timer, class047702), ((Integer)Voicechat.SERVER_CONFIG.loginTimeout.get()).intValue());
    }

    public void serverStopping(class02796 class027962) {
        if (this.server != null) {
            this.server.close();
            this.server = null;
        }
    }

    public void playerLoggedOut(class04770 class047702) {
        this.clientCompatibilities.remove(class047702.method_5667());
        this.rateLimiter.onPlayerLoggedOut(class047702);
        if (this.server == null) {
            return;
        }
        this.server.onPlayerLoggedOut(class047702);
        Voicechat.LOGGER.info("Disconnecting client {}", new Object[]{class047702.method_5477().getString()});
    }

    public void serverStarting(class02796 class027962) {
        if (this.server != null) {
            this.server.close();
            this.server = null;
        }
        if (!CrossSideManager.get().shouldRunVoiceChatServer(class027962)) {
            Voicechat.LOGGER.info("Disabling voice chat in singleplayer", new Object[0]);
            return;
        }
        if (class027962 instanceof class05623 && !class027962.NH()) {
            Voicechat.LOGGER.warn("Running in offline mode - Voice chat encryption is not secure!", new Object[0]);
        }
        try {
            this.server = new Server(class027962);
            this.server.start();
            PluginManager.instance().onServerStarted();
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to start voice chat server", new Object[]{exception});
        }
    }

    public void onPlayerShow(class04770 class047702, class04770 class047703) {
        if (this.server == null) {
            return;
        }
        this.server.onPlayerShow(class047702, class047703);
    }

    public void onPlayerHide(class04770 class047702, class04770 class047703) {
        if (this.server == null) {
            return;
        }
        this.server.onPlayerHide(class047702, class047703);
    }

    public PacketRateLimiter getRateLimiter() {
        return this.rateLimiter;
    }
}

