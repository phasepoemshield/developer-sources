/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.net.AddGroupPacket
 *  de.maxhenkel.voicechat.net.JoinedGroupPacket
 *  de.maxhenkel.voicechat.net.NetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.RemoveGroupPacket
 *  de.maxhenkel.voicechat.permission.PermissionManager
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.AddGroupPacket;
import de.maxhenkel.voicechat.net.JoinedGroupPacket;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.RemoveGroupPacket;
import de.maxhenkel.voicechat.permission.PermissionManager;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.PlayerStateManager;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04770;

public class ServerGroupManager {
    private final Map<UUID, Group> groups;
    private final Server server;

    public ServerGroupManager(Server server) {
        this.server = server;
        this.groups = new ConcurrentHashMap<UUID, Group>();
        CommonCompatibilityManager.INSTANCE.getNetManager().joinGroupChannel.setServerListener((class047702, joinGroupPacket) -> {
            if (!((Boolean)Voicechat.SERVER_CONFIG.groupsEnabled.get()).booleanValue()) {
                return;
            }
            if (!PermissionManager.INSTANCE.GROUPS_PERMISSION.hasPermission(class047702)) {
                class047702.method_7353((class00392)class00392.L((String)"message.voicechat.no_group_permission"), true);
                return;
            }
            this.joinGroup(this.groups.get(joinGroupPacket.getGroup()), class047702, joinGroupPacket.getPassword());
        });
        CommonCompatibilityManager.INSTANCE.getNetManager().createGroupChannel.setServerListener((class047702, createGroupPacket) -> {
            if (!((Boolean)Voicechat.SERVER_CONFIG.groupsEnabled.get()).booleanValue()) {
                return;
            }
            if (!PermissionManager.INSTANCE.GROUPS_PERMISSION.hasPermission(class047702)) {
                class047702.method_7353((class00392)class00392.L((String)"message.voicechat.no_group_permission"), true);
                return;
            }
            if (!Voicechat.GROUP_REGEX.matcher(createGroupPacket.getName()).matches()) {
                Voicechat.LOGGER.warn("Player {} tried to create a group with an invalid name", new Object[]{class047702.method_5477().getString()});
                return;
            }
            if (createGroupPacket.getPassword() != null && !Voicechat.GROUP_REGEX.matcher(createGroupPacket.getPassword()).matches()) {
                Voicechat.LOGGER.warn("Player {} tried to create a group with an invalid password", new Object[]{class047702.method_5476()});
                return;
            }
            this.addGroup(new Group(UUID.randomUUID(), createGroupPacket.getName(), createGroupPacket.getPassword(), false, false, createGroupPacket.getType()), class047702);
        });
        CommonCompatibilityManager.INSTANCE.getNetManager().leaveGroupChannel.setServerListener((class047702, leaveGroupPacket) -> this.leaveGroup(class047702));
    }

    private void broadcastRemoveGroup(UUID uUID) {
        RemoveGroupPacket removeGroupPacket = new RemoveGroupPacket(uUID);
        this.server.getServer().Nm().v().forEach(class047702 -> NetManager.sendToClient((class04770)class047702, (Packet)removeGroupPacket));
    }

    public Map<UUID, Group> getGroups() {
        return this.groups;
    }

    @Nullable
    public Group getGroup(UUID uUID) {
        return this.groups.get(uUID);
    }

    public void cleanupGroups() {
        PlayerStateManager playerStateManager = this.getStates();
        List list = playerStateManager.getStates().stream().filter(PlayerState::hasGroup).map(PlayerState::getGroup).distinct().toList();
        List list2 = this.groups.entrySet().stream().filter(entry -> !((Group)entry.getValue()).isPersistent()).map(Map.Entry::getKey).filter(uUID -> !list.contains(uUID)).toList();
        for (UUID uUID2 : list2) {
            this.removeGroup(uUID2);
        }
    }

    private void broadcastAddGroup(Group group) {
        AddGroupPacket addGroupPacket = new AddGroupPacket(group.toClientGroup());
        this.server.getServer().Nm().v().forEach(class047702 -> NetManager.sendToClient((class04770)class047702, (Packet)addGroupPacket));
    }

    private PlayerStateManager getStates() {
        return this.server.getPlayerStateManager();
    }

    public void onPlayerLoggedOut(class04770 class047702) {
        this.cleanupGroups();
    }

    public void leaveGroup(class04770 class047702) {
        if (PluginManager.instance().onLeaveGroup(class047702)) {
            return;
        }
        PlayerStateManager playerStateManager = this.getStates();
        playerStateManager.setGroup(class047702, null);
        NetManager.sendToClient((class04770)class047702, (Packet)new JoinedGroupPacket(null, false));
        this.cleanupGroups();
    }

    public void joinGroup(@Nullable Group group, class04770 class047702, @Nullable String string) {
        if (PluginManager.instance().onJoinGroup(class047702, group)) {
            return;
        }
        if (group == null) {
            NetManager.sendToClient((class04770)class047702, (Packet)new JoinedGroupPacket(null, false));
            return;
        }
        if (group.getPassword() != null && !group.getPassword().equals(string)) {
            NetManager.sendToClient((class04770)class047702, (Packet)new JoinedGroupPacket(null, true));
            return;
        }
        PlayerStateManager playerStateManager = this.getStates();
        playerStateManager.setGroup(class047702, group.getId());
        NetManager.sendToClient((class04770)class047702, (Packet)new JoinedGroupPacket(group.getId(), false));
    }

    @Nullable
    public Group getPlayerGroup(class04770 class047702) {
        PlayerState playerState = this.server.getPlayerStateManager().getState(class047702.method_5667());
        if (playerState == null) {
            return null;
        }
        UUID uUID = playerState.getGroup();
        if (uUID == null) {
            return null;
        }
        return this.getGroup(uUID);
    }

    public void addGroup(Group group, @Nullable class04770 class047702) {
        if (PluginManager.instance().onCreateGroup(class047702, group)) {
            return;
        }
        this.groups.put(group.getId(), group);
        this.broadcastAddGroup(group);
        if (class047702 == null) {
            return;
        }
        PlayerStateManager playerStateManager = this.getStates();
        playerStateManager.setGroup(class047702, group.getId());
        NetManager.sendToClient((class04770)class047702, (Packet)new JoinedGroupPacket(group.getId(), false));
    }

    public void onPlayerCompatibilityCheckSucceeded(class04770 class047702) {
        Voicechat.LOGGER.debug("Synchronizing {} groups with {}", new Object[]{this.groups.size(), class047702.method_5477().getString()});
        for (Group group : this.groups.values()) {
            this.broadcastAddGroup(group);
        }
    }

    public boolean removeGroup(UUID uUID) {
        Group group = this.groups.get(uUID);
        if (group == null) {
            return false;
        }
        PlayerStateManager playerStateManager = this.getStates();
        if (playerStateManager.getStates().stream().anyMatch(playerState -> playerState.hasGroup() && playerState.getGroup().equals(uUID))) {
            return false;
        }
        if (PluginManager.instance().onRemoveGroup(group)) {
            return false;
        }
        this.groups.remove(uUID);
        this.broadcastRemoveGroup(uUID);
        return true;
    }
}

