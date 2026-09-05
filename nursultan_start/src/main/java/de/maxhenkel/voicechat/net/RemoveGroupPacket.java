/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import java.util.UUID;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class RemoveGroupPacket
implements Packet<RemoveGroupPacket> {
    public static final class01666<RemoveGroupPacket> REMOVE_GROUP = new class01666(class01894.N((String)"voicechat", (String)"remove_group"));
    private UUID groupId;

    public RemoveGroupPacket() {
    }

    public RemoveGroupPacket(UUID uUID) {
        this.groupId = uUID;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.groupId);
    }

    @Override
    public class01666<RemoveGroupPacket> method_56479() {
        return REMOVE_GROUP;
    }

    @Override
    public RemoveGroupPacket fromBytes(class00667 class006672) {
        this.groupId = class006672.m();
        return this;
    }

    public UUID getGroupId() {
        return this.groupId;
    }
}

