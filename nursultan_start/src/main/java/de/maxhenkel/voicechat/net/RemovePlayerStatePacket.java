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

public class RemovePlayerStatePacket
implements Packet<RemovePlayerStatePacket> {
    public static final class01666<RemovePlayerStatePacket> REMOVE_PLAYER_STATE = new class01666(class01894.N((String)"voicechat", (String)"remove_state"));
    private UUID id;

    public RemovePlayerStatePacket() {
    }

    public RemovePlayerStatePacket(UUID uUID) {
        this.id = uUID;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.id);
    }

    public UUID getId() {
        return this.id;
    }

    @Override
    public class01666<RemovePlayerStatePacket> method_56479() {
        return REMOVE_PLAYER_STATE;
    }

    @Override
    public RemovePlayerStatePacket fromBytes(class00667 class006672) {
        this.id = class006672.m();
        return this;
    }
}

