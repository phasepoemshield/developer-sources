/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.net.NetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.PlayerStatePacket
 *  de.maxhenkel.voicechat.net.PlayerStatesPacket
 *  de.maxhenkel.voicechat.net.RemovePlayerStatePacket
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  javax.annotation.Nullable
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.PlayerStatePacket;
import de.maxhenkel.voicechat.net.PlayerStatesPacket;
import de.maxhenkel.voicechat.net.RemovePlayerStatePacket;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import minecraft.class04770;

public class PlayerStateManager {
    private final ConcurrentHashMap<UUID, PlayerState> states;
    private final Server voicechatServer;

    public PlayerStateManager(Server server) {
        this.voicechatServer = server;
        this.states = new ConcurrentHashMap();
        CommonCompatibilityManager.INSTANCE.getNetManager().updateStateChannel.setServerListener((class047702, updateStatePacket) -> {
            PlayerState playerState = this.states.get(class047702.method_5667());
            if (playerState == null) {
                playerState = PlayerStateManager.defaultDisconnectedState(class047702);
            }
            playerState.setDisabled(updateStatePacket.isDisabled());
            this.states.put(class047702.method_5667(), playerState);
            this.broadcastState(class047702, playerState);
            Voicechat.LOGGER.debug("Got state of {}: {}", new Object[]{class047702.method_5477().getString(), playerState});
        });
    }

    @Nullable
    public PlayerState getState(UUID uUID) {
        return this.states.get(uUID);
    }

    public static PlayerState defaultDisconnectedState(class04770 class047702) {
        return new PlayerState(class047702.method_5667(), class047702.method_7334().name(), false, true);
    }

    public void broadcastRemoveState(class04770 class047702) {
        RemovePlayerStatePacket removePlayerStatePacket = new RemovePlayerStatePacket(class047702.method_5667());
        for (class04770 class047703 : this.voicechatServer.getServer().Nm().v()) {
            NetManager.sendToClient((class04770)class047703, (Packet)removePlayerStatePacket);
        }
        PluginManager.instance().onPlayerStateChanged(PlayerStateManager.defaultDisconnectedState(class047702));
    }

    public void setGroup(class04770 class047702, @Nullable UUID uUID) {
        PlayerState playerState = this.states.get(class047702.method_5667());
        if (playerState == null) {
            playerState = PlayerStateManager.defaultDisconnectedState(class047702);
            Voicechat.LOGGER.debug("Defaulting to default state for {}: {}", new Object[]{class047702.method_5477().getString(), playerState});
        }
        playerState.setGroup(uUID);
        this.states.put(class047702.method_5667(), playerState);
        this.broadcastState(class047702, playerState);
        Voicechat.LOGGER.debug("Setting group of {}: {}", new Object[]{class047702.method_5477().getString(), playerState});
    }

    public void onPlayerVoicechatConnect(class04770 class047702) {
        PlayerState playerState = this.states.get(class047702.method_5667());
        if (playerState == null) {
            playerState = PlayerStateManager.defaultDisconnectedState(class047702);
        }
        playerState.setDisconnected(false);
        this.states.put(class047702.method_5667(), playerState);
        this.broadcastState(class047702, playerState);
        Voicechat.LOGGER.debug("Set state of {} to connected: {}", new Object[]{class047702.method_5477().getString(), playerState});
    }

    public Collection<PlayerState> getStates() {
        return this.states.values();
    }

    public void onPlayerVoicechatDisconnect(UUID uUID) {
        PlayerState playerState = this.states.get(uUID);
        if (playerState == null) {
            return;
        }
        playerState.setDisconnected(true);
        class04770 class047702 = this.voicechatServer.getServer().Nm().y(uUID);
        this.broadcastState(class047702, playerState);
        Voicechat.LOGGER.debug("Set state of {} to disconnected: {}", new Object[]{uUID, playerState});
    }

    public void onPlayerLoggedOut(class04770 class047702) {
        this.states.remove(class047702.method_5667());
        this.broadcastRemoveState(class047702);
        Voicechat.LOGGER.debug("Removing state of {}", new Object[]{class047702.method_5477().getString()});
    }

    public void onPlayerShow(class04770 class047702, class04770 class047703) {
        PlayerState playerState = this.states.get(class047702.method_5667());
        if (playerState == null) {
            playerState = PlayerStateManager.defaultDisconnectedState(class047702);
        }
        PlayerStatePacket playerStatePacket = new PlayerStatePacket(playerState);
        NetManager.sendToClient((class04770)class047703, (Packet)playerStatePacket);
        Voicechat.LOGGER.debug("Sending state of {} to {}", new Object[]{class047702.method_5477().getString(), class047703.method_5477().getString()});
    }

    public void onPlayerHide(class04770 class047702, class04770 class047703) {
        RemovePlayerStatePacket removePlayerStatePacket = new RemovePlayerStatePacket(class047702.method_5667());
        NetManager.sendToClient((class04770)class047703, (Packet)removePlayerStatePacket);
        Voicechat.LOGGER.debug("Removing state of {} for {}", new Object[]{class047702.method_5477().getString(), class047703.method_5477().getString()});
    }

    public void broadcastState(@Nullable class04770 class047702, PlayerState playerState) {
        PlayerStatePacket playerStatePacket = new PlayerStatePacket(playerState);
        for (class04770 class047703 : this.voicechatServer.getServer().Nm().v()) {
            if (class047702 != null && !CommonCompatibilityManager.INSTANCE.canSee(class047703, class047702)) continue;
            NetManager.sendToClient((class04770)class047703, (Packet)playerStatePacket);
        }
        PluginManager.instance().onPlayerStateChanged(playerState);
    }

    public void onPlayerLoggedIn(class04770 class047702) {
        PlayerState playerState = PlayerStateManager.defaultDisconnectedState(class047702);
        this.states.put(class047702.method_5667(), playerState);
        this.broadcastState(class047702, playerState);
        Voicechat.LOGGER.debug("Setting default state of {}: {}", new Object[]{class047702.method_5477().getString(), playerState});
    }

    public void onPlayerCompatibilityCheckSucceeded(class04770 class047702) {
        ArrayList<PlayerState> arrayList = new ArrayList<PlayerState>(this.states.size());
        for (PlayerState playerState : this.states.values()) {
            class04770 class047703 = this.voicechatServer.getServer().Nm().y(playerState.getUuid());
            if (class047703 == null || !CommonCompatibilityManager.INSTANCE.canSee(class047702, class047703)) continue;
            arrayList.add(playerState);
        }
        PlayerStatesPacket playerStatesPacket = new PlayerStatesPacket(arrayList);
        NetManager.sendToClient((class04770)class047702, (Packet)playerStatesPacket);
        Voicechat.LOGGER.debug("Sending initial states to {}", new Object[]{class047702.method_5477().getString()});
    }
}

