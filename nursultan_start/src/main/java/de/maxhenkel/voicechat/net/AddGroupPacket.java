/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class AddGroupPacket
implements Packet<AddGroupPacket> {
    public static final class01666<AddGroupPacket> ADD_ADD_GROUP = new class01666(class01894.N((String)"voicechat", (String)"add_group"));
    private ClientGroup group;

    public AddGroupPacket() {
    }

    public AddGroupPacket(ClientGroup clientGroup) {
        this.group = clientGroup;
    }

    @Override
    public void toBytes(class00667 class006672) {
        this.group.toBytes(class006672);
    }

    @Override
    public class01666<AddGroupPacket> method_56479() {
        return ADD_ADD_GROUP;
    }

    public ClientGroup getGroup() {
        return this.group;
    }

    @Override
    public AddGroupPacket fromBytes(class00667 class006672) {
        this.group = ClientGroup.fromBytes((class00667)class006672);
        return this;
    }
}

