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
import java.util.ArrayList;
import java.util.Collection;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class PlayerStatesPacket
implements Packet<PlayerStatesPacket> {
    public static final class01666<PlayerStatesPacket> PLAYER_STATES = new class01666(class01894.N((String)"voicechat", (String)"states"));
    private Collection<PlayerState> playerStates;

    public PlayerStatesPacket() {
    }

    public PlayerStatesPacket(Collection<PlayerState> collection) {
        this.playerStates = collection;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.writeInt(this.playerStates.size());
        for (PlayerState playerState : this.playerStates) {
            playerState.toBytes(class006672);
        }
    }

    @Override
    public class01666<PlayerStatesPacket> method_56479() {
        return PLAYER_STATES;
    }

    @Override
    public PlayerStatesPacket fromBytes(class00667 class006672) {
        int n = class006672.readInt();
        this.playerStates = new ArrayList<PlayerState>(n);
        for (int i = 0; i < n; ++i) {
            PlayerState playerState = PlayerState.fromBytes((class00667)class006672);
            this.playerStates.add(playerState);
        }
        return this;
    }

    public Collection<PlayerState> getPlayerStates() {
        return this.playerStates;
    }
}

