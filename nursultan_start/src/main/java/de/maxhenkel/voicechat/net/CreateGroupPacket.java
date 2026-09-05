/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Group$Type
 *  javax.annotation.Nullable
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl$TypeImpl;
import javax.annotation.Nullable;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class CreateGroupPacket
implements Packet<CreateGroupPacket> {
    public static final class01666<CreateGroupPacket> CREATE_GROUP = new class01666(class01894.N((String)"voicechat", (String)"create_group"));
    private String name;
    @Nullable
    private String password;
    private Group.Type type;

    @Nullable
    public String getPassword() {
        return this.password;
    }

    public CreateGroupPacket() {
    }

    public CreateGroupPacket(String string, @Nullable String string2, Group.Type type) {
        this.name = string;
        this.password = string2;
        this.type = type;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.name, 24);
        class006672.writeBoolean(this.password != null);
        if (this.password != null) {
            class006672.N(this.password, 24);
        }
        class006672.writeShort((int)GroupImpl$TypeImpl.toInt(this.type));
    }

    public String getName() {
        return this.name;
    }

    public Group.Type getType() {
        return this.type;
    }

    @Override
    public class01666<CreateGroupPacket> method_56479() {
        return CREATE_GROUP;
    }

    @Override
    public CreateGroupPacket fromBytes(class00667 class006672) {
        this.name = class006672.u(24);
        this.password = null;
        if (class006672.readBoolean()) {
            this.password = class006672.u(24);
        }
        this.type = GroupImpl$TypeImpl.fromInt(class006672.readShort());
        return this;
    }
}

