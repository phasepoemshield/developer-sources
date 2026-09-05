/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class PlayerStatePacket
implements Packet<PlayerStatePacket> {
    public static final class01666<PlayerStatePacket> PLAYER_STATE = new class01666(class01894.N((String)"voicechat", (String)"state"));
    private PlayerState playerState;

    public PlayerStatePacket() {
    }

    public PlayerStatePacket(PlayerState playerState) {
        this.playerState = playerState;
    }

    @Override
    public void toBytes(class00667 class006672) {
        this.playerState.toBytes(class006672);
    }

    @Override
    public class01666<PlayerStatePacket> method_56479() {
        return PLAYER_STATE;
    }

    @Override
    public PlayerStatePacket fromBytes(class00667 class006672) {
        this.playerState = PlayerState.fromBytes((class00667)class006672);
        return this;
    }

    public PlayerState getPlayerState() {
        return this.playerState;
    }
}

