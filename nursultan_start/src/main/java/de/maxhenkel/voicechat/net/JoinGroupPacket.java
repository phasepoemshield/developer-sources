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

public class JoinGroupPacket
implements Packet<JoinGroupPacket> {
    public static final class01666<JoinGroupPacket> SET_GROUP = new class01666(class01894.N((String)"voicechat", (String)"set_group"));
    private UUID group;
    @Nullable
    private String password;

    @Nullable
    public String getPassword() {
        return this.password;
    }

    public JoinGroupPacket() {
    }

    public JoinGroupPacket(UUID uUID, @Nullable String string) {
        this.group = uUID;
        this.password = string;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.group);
        class006672.writeBoolean(this.password != null);
        if (this.password != null) {
            class006672.N(this.password, 512);
        }
    }

    @Override
    public class01666<JoinGroupPacket> method_56479() {
        return SET_GROUP;
    }

    public UUID getGroup() {
        return this.group;
    }

    @Override
    public JoinGroupPacket fromBytes(class00667 class006672) {
        this.group = class006672.m();
        if (class006672.readBoolean()) {
            this.password = class006672.u(512);
        }
        return this;
    }
}

