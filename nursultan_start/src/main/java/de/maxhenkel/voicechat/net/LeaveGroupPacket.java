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
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class LeaveGroupPacket
implements Packet<LeaveGroupPacket> {
    public static final class01666<LeaveGroupPacket> LEAVE_GROUP = new class01666(class01894.N((String)"voicechat", (String)"leave_group"));

    @Override
    public void toBytes(class00667 class006672) {
    }

    @Override
    public class01666<LeaveGroupPacket> method_56479() {
        return LEAVE_GROUP;
    }

    @Override
    public LeaveGroupPacket fromBytes(class00667 class006672) {
        return this;
    }
}

