/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group$Type
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.server;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.UUID;
import javax.annotation.Nullable;

public class Group {
    private UUID id;
    private String name;
    @Nullable
    private String password;
    private boolean persistent;
    private boolean hidden;
    private Group.Type type;

    @Nullable
    public String getPassword() {
        return this.password;
    }

    public Group(UUID uUID, String string) {
        this(uUID, string, null);
    }

    public Group() {
    }

    public Group(UUID uUID, String string, @Nullable String string2, boolean bl, boolean bl2, Group.Type type) {
        this.id = uUID;
        this.name = string;
        this.password = string2;
        this.persistent = bl;
        this.hidden = bl2;
        this.type = type;
    }

    public Group(UUID uUID, String string, @Nullable String string2) {
        this(uUID, string, string2, false);
    }

    public Group(UUID uUID, String string, @Nullable String string2, boolean bl) {
        this(uUID, string, string2, bl, false, Group.Type.NORMAL);
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public String getName() {
        return this.name;
    }

    public boolean isOpen() {
        return this.type == Group.Type.OPEN;
    }

    public UUID getId() {
        return this.id;
    }

    public Group.Type getType() {
        return this.type;
    }

    public boolean isPersistent() {
        return this.persistent;
    }

    public ClientGroup toClientGroup() {
        return new ClientGroup(this.id, this.name, this.password != null, this.persistent, this.hidden, this.type);
    }

    public boolean isIsolated() {
        return this.type == Group.Type.ISOLATED;
    }

    public boolean isNormal() {
        return this.type == Group.Type.NORMAL;
    }
}

