/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.Group$Builder
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.UUID;
import javax.annotation.Nullable;

public class GroupImpl$BuilderImpl
implements Group.Builder {
    @Nullable
    private UUID id;
    private String name;
    @Nullable
    private String password;
    private boolean persistent;
    private boolean hidden;
    private Group.Type type = Group.Type.NORMAL;

    public Group.Builder setType(Group.Type type) {
        this.type = type;
        return this;
    }

    public Group.Builder setId(@Nullable UUID uUID) {
        this.id = uUID;
        return this;
    }

    public Group.Builder setName(String string) {
        this.name = GroupImpl$BuilderImpl.convertGroupName(string);
        return this;
    }

    public de.maxhenkel.voicechat.api.Group build() {
        if (this.name == null) {
            throw new IllegalStateException("Group is missing a name");
        }
        if (!Voicechat.GROUP_REGEX.matcher(this.name).matches()) {
            throw new IllegalStateException(String.format("Invalid group name: %s", this.name));
        }
        GroupImpl groupImpl = new GroupImpl(new Group(this.id == null ? UUID.randomUUID() : this.id, this.name, this.password, this.persistent, this.hidden, this.type));
        Server server = Voicechat.SERVER.getServer();
        if (server != null && this.persistent) {
            server.getGroupManager().addGroup(groupImpl.getGroup(), null);
        }
        return groupImpl;
    }

    public Group.Builder setPassword(String string) {
        this.password = string;
        return this;
    }

    public Group.Builder setHidden(boolean bl) {
        this.hidden = bl;
        return this;
    }

    private static String convertGroupName(String string) {
        if ((string = string.replaceAll("[\\n\\r\\t]", "")).matches("^\\s.*")) {
            string = string.replaceFirst("^\\s+", "");
        }
        if (string.length() > 16) {
            return string.substring(0, 16);
        }
        return string;
    }

    public Group.Builder setPersistent(boolean bl) {
        this.persistent = bl;
        return this;
    }
}

