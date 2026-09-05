/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.PlayerStateManager
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.PlayerStateManager;
import de.maxhenkel.voicechat.voice.server.Server;
import javax.annotation.Nullable;
import minecraft.class04770;

public class VoicechatConnectionImpl
implements VoicechatConnection {
    private final ServerPlayer player;
    private final class04770 serverPlayer;
    private final PlayerState state;
    @Nullable
    private final de.maxhenkel.voicechat.api.Group group;

    public void setConnected(boolean bl) {
        if (this.isInstalled()) {
            return;
        }
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        PlayerStateManager playerStateManager = server.getPlayerStateManager();
        PlayerState playerState = playerStateManager.getState(this.state.getUuid());
        if (playerState == null) {
            return;
        }
        if (playerState.isDisconnected() != bl) {
            return;
        }
        playerState.setDisconnected(!bl);
        playerStateManager.broadcastState(null, playerState);
    }

    public VoicechatConnectionImpl(class04770 class047702, PlayerState playerState) {
        this.serverPlayer = class047702;
        this.player = new ServerPlayerImpl(class047702);
        this.state = playerState;
        this.group = GroupImpl.create(playerState);
    }

    public boolean isDisabled() {
        return this.state.isDisabled();
    }

    @Nullable
    public de.maxhenkel.voicechat.api.Group getGroup() {
        return this.group;
    }

    public boolean isConnected() {
        return !this.state.isDisconnected();
    }

    public void setGroup(@Nullable de.maxhenkel.voicechat.api.Group group) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        if (group == null) {
            server.getGroupManager().leaveGroup(this.serverPlayer);
            return;
        }
        if (group instanceof GroupImpl) {
            GroupImpl groupImpl = (GroupImpl)group;
            Group group2 = server.getGroupManager().getGroup(groupImpl.getGroup().getId());
            if (group2 == null) {
                server.getGroupManager().addGroup(groupImpl.getGroup(), this.serverPlayer);
                group2 = groupImpl.getGroup();
            }
            server.getGroupManager().joinGroup(group2, this.serverPlayer, groupImpl.getGroup().getPassword());
        }
    }

    public boolean isInGroup() {
        return this.group != null;
    }

    public void setDisabled(boolean bl) {
        if (this.isInstalled()) {
            return;
        }
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        PlayerStateManager playerStateManager = server.getPlayerStateManager();
        PlayerState playerState = playerStateManager.getState(this.state.getUuid());
        if (playerState == null) {
            return;
        }
        if (playerState.isDisabled() == bl) {
            return;
        }
        playerState.setDisabled(bl);
        playerStateManager.broadcastState(null, playerState);
    }

    @Nullable
    public static VoicechatConnectionImpl fromPlayer(@Nullable class04770 class047702) {
        if (class047702 == null) {
            return null;
        }
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        PlayerState playerState = server.getPlayerStateManager().getState(class047702.method_5667());
        if (playerState == null) {
            return null;
        }
        return new VoicechatConnectionImpl(class047702, playerState);
    }

    public ServerPlayer getPlayer() {
        return this.player;
    }

    public boolean isInstalled() {
        return Voicechat.SERVER.isCompatible(this.serverPlayer);
    }
}

