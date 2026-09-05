/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class GroupImpl
implements de.maxhenkel.voicechat.api.Group {
    private final Group group;

    @Nullable
    public static GroupImpl create(PlayerState playerState) {
        Group group;
        UUID uUID = playerState.getGroup();
        Server server = Voicechat.SERVER.getServer();
        if (server != null && uUID != null && (group = server.getGroupManager().getGroup(uUID)) != null) {
            return new GroupImpl(group);
        }
        return null;
    }

    public GroupImpl(Group group) {
        this.group = group;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GroupImpl groupImpl = (GroupImpl)object;
        return Objects.equals(this.group.getId(), groupImpl.group.getId());
    }

    public int hashCode() {
        return this.group != null ? this.group.getId().hashCode() : 0;
    }

    public boolean isHidden() {
        return this.group.isHidden();
    }

    public String getName() {
        return this.group.getName();
    }

    public UUID getId() {
        return this.group.getId();
    }

    public Group.Type getType() {
        return this.group.getType();
    }

    public Group getGroup() {
        return this.group;
    }

    public boolean hasPassword() {
        return this.group.getPassword() != null;
    }

    public boolean isPersistent() {
        return this.group.isPersistent();
    }
}

