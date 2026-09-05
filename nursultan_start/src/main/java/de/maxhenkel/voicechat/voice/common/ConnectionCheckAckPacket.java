/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.Packet;
import minecraft.class00667;

public class ConnectionCheckAckPacket
implements Packet<ConnectionCheckAckPacket> {
    @Override
    public void toBytes(class00667 class006672) {
    }

    @Override
    public ConnectionCheckAckPacket fromBytes(class00667 class006672) {
        return new ConnectionCheckAckPacket();
    }
}

