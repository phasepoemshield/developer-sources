/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class JoinedGroupPacket
implements Packet<JoinedGroupPacket> {
    public static final class01666<JoinedGroupPacket> JOINED_GROUP = new class01666(class01894.N((String)"voicechat", (String)"joined_group"));
    @Nullable
    private UUID group;
    private boolean wrongPassword;

    public JoinedGroupPacket() {
    }

    public JoinedGroupPacket(@Nullable UUID uUID, boolean bl) {
        this.group = uUID;
        this.wrongPassword = bl;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.writeBoolean(this.group != null);
        if (this.group != null) {
            class006672.N(this.group);
        }
        class006672.writeBoolean(this.wrongPassword);
    }

    @Override
    public class01666<JoinedGroupPacket> method_56479() {
        return JOINED_GROUP;
    }

    @Nullable
    public UUID getGroup() {
        return this.group;
    }

    @Override
    public JoinedGroupPacket fromBytes(class00667 class006672) {
        if (class006672.readBoolean()) {
            this.group = class006672.m();
        }
        this.wrongPassword = class006672.readBoolean();
        return this;
    }

    public boolean isWrongPassword() {
        return this.wrongPassword;
    }
}

