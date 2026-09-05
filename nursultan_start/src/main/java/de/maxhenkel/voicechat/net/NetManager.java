/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.AddCategoryPacket;
import de.maxhenkel.voicechat.net.AddGroupPacket;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.CreateGroupPacket;
import de.maxhenkel.voicechat.net.JoinGroupPacket;
import de.maxhenkel.voicechat.net.JoinedGroupPacket;
import de.maxhenkel.voicechat.net.LeaveGroupPacket;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.PlayerStatePacket;
import de.maxhenkel.voicechat.net.PlayerStatesPacket;
import de.maxhenkel.voicechat.net.RemoveCategoryPacket;
import de.maxhenkel.voicechat.net.RemoveGroupPacket;
import de.maxhenkel.voicechat.net.RemovePlayerStatePacket;
import de.maxhenkel.voicechat.net.RequestSecretPacket;
import de.maxhenkel.voicechat.net.SecretPacket;
import de.maxhenkel.voicechat.net.UpdateStatePacket;
import minecraft.class04770;

public abstract class NetManager {
    public Channel<UpdateStatePacket> updateStateChannel;
    public Channel<PlayerStatePacket> playerStateChannel;
    public Channel<PlayerStatesPacket> playerStatesChannel;
    public Channel<RemovePlayerStatePacket> removePlayerStateChannel;
    public Channel<SecretPacket> secretChannel;
    public Channel<RequestSecretPacket> requestSecretChannel;
    public Channel<AddGroupPacket> addGroupChannel;
    public Channel<RemoveGroupPacket> removeGroupChannel;
    public Channel<JoinGroupPacket> joinGroupChannel;
    public Channel<CreateGroupPacket> createGroupChannel;
    public Channel<LeaveGroupPacket> leaveGroupChannel;
    public Channel<JoinedGroupPacket> joinedGroupChannel;
    public Channel<AddCategoryPacket> addCategoryChannel;
    public Channel<RemoveCategoryPacket> removeCategoryChannel;

    public void init() {
        this.updateStateChannel = this.registerReceiver(UpdateStatePacket.class, false, true);
        this.playerStateChannel = this.registerReceiver(PlayerStatePacket.class, true, false);
        this.playerStatesChannel = this.registerReceiver(PlayerStatesPacket.class, true, false);
        this.removePlayerStateChannel = this.registerReceiver(RemovePlayerStatePacket.class, true, false);
        this.secretChannel = this.registerReceiver(SecretPacket.class, true, false);
        this.requestSecretChannel = this.registerReceiver(RequestSecretPacket.class, false, true);
        this.addGroupChannel = this.registerReceiver(AddGroupPacket.class, true, false);
        this.removeGroupChannel = this.registerReceiver(RemoveGroupPacket.class, true, false);
        this.joinGroupChannel = this.registerReceiver(JoinGroupPacket.class, false, true);
        this.createGroupChannel = this.registerReceiver(CreateGroupPacket.class, false, true);
        this.leaveGroupChannel = this.registerReceiver(LeaveGroupPacket.class, false, true);
        this.joinedGroupChannel = this.registerReceiver(JoinedGroupPacket.class, true, false);
        this.addCategoryChannel = this.registerReceiver(AddCategoryPacket.class, true, false);
        this.removeCategoryChannel = this.registerReceiver(RemoveCategoryPacket.class, true, false);
    }

    protected abstract void sendToServerInternal(Packet<?> var1);

    public abstract <T extends Packet<T>> Channel<T> registerReceiver(Class<T> var1, boolean var2, boolean var3);

    public static void sendToClient(class04770 class047702, Packet<?> packet) {
        if (!Voicechat.SERVER.isCompatible(class047702)) {
            return;
        }
        CommonCompatibilityManager.INSTANCE.getNetManager().sendToClient(packet, class047702);
    }

    public abstract void sendToClient(Packet<?> var1, class04770 var2);
}

