/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.plugins.impl.GroupImpl$TypeImpl
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00667;

public class ClientGroup {
    private final UUID id;
    private final String name;
    private final boolean hasPassword;
    private final boolean persistent;
    private final boolean hidden;
    private final Group.Type type;

    public ClientGroup(UUID uUID, String string, boolean bl, boolean bl2, boolean bl3, Group.Type type) {
        this.id = uUID;
        this.name = string;
        this.hasPassword = bl;
        this.persistent = bl2;
        this.hidden = bl3;
        this.type = type;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ClientGroup clientGroup = (ClientGroup)object;
        return Objects.equals(this.id, clientGroup.id);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public void toBytes(class00667 class006672) {
        class006672.N(this.id);
        class006672.N(this.name, 512);
        class006672.writeBoolean(this.hasPassword);
        class006672.writeBoolean(this.persistent);
        class006672.writeBoolean(this.hidden);
        class006672.writeShort((int)GroupImpl.TypeImpl.toInt((Group.Type)this.type));
    }

    public String getName() {
        return this.name;
    }

    public UUID getId() {
        return this.id;
    }

    public Group.Type getType() {
        return this.type;
    }

    public boolean hasPassword() {
        return this.hasPassword;
    }

    public static ClientGroup fromBytes(class00667 class006672) {
        return new ClientGroup(class006672.m(), class006672.u(512), class006672.readBoolean(), class006672.readBoolean(), class006672.readBoolean(), GroupImpl.TypeImpl.fromInt((short)class006672.readShort()));
    }

    public boolean isPersistent() {
        return this.persistent;
    }
}

