/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.gui.group.JoinGroupList
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.net.Channel
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.group.JoinGroupList;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

public class ClientGroupManager {
    private final Map<UUID, ClientGroup> groups = new ConcurrentHashMap<UUID, ClientGroup>();

    public ClientGroupManager() {
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().addGroupChannel, (class044532, addGroupPacket) -> {
            this.groups.put(addGroupPacket.getGroup().getId(), addGroupPacket.getGroup());
            Voicechat.LOGGER.debug("Added group '{}' ({})", new Object[]{addGroupPacket.getGroup().getName(), addGroupPacket.getGroup().getId()});
            JoinGroupList.update();
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().removeGroupChannel, (class044532, removeGroupPacket) -> {
            this.groups.remove(removeGroupPacket.getGroupId());
            Voicechat.LOGGER.debug("Removed group {}", new Object[]{removeGroupPacket.getGroupId()});
            JoinGroupList.update();
        });
        ClientCompatibilityManager.INSTANCE.onDisconnect(this::clear);
    }

    public void clear() {
        this.groups.clear();
    }

    public Collection<ClientGroup> getGroups() {
        return this.groups.values();
    }

    @Nullable
    public ClientGroup getGroup(UUID uUID) {
        return this.groups.get(uUID);
    }
}

