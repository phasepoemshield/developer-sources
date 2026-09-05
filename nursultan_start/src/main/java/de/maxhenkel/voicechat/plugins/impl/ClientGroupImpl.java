/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.Objects;
import java.util.UUID;

public class ClientGroupImpl
implements Group {
    private final ClientGroup group;

    public ClientGroupImpl(ClientGroup clientGroup) {
        this.group = clientGroup;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ClientGroupImpl clientGroupImpl = (ClientGroupImpl)object;
        return Objects.equals(this.group.getId(), clientGroupImpl.group.getId());
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

    public ClientGroup getGroup() {
        return this.group;
    }

    public boolean hasPassword() {
        return this.group.hasPassword();
    }

    public boolean isPersistent() {
        return this.group.isPersistent();
    }
}

