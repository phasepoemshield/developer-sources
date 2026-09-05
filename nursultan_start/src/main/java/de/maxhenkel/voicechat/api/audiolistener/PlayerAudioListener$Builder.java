/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerPlayer
 */
package de.maxhenkel.voicechat.api.audiolistener;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.packets.SoundPacket;
import java.util.UUID;
import java.util.function.Consumer;

public interface PlayerAudioListener$Builder {
    public PlayerAudioListener build();

    public PlayerAudioListener$Builder setPlayer(ServerPlayer var1);

    public PlayerAudioListener$Builder setPlayer(UUID var1);

    public PlayerAudioListener$Builder setPacketListener(Consumer<SoundPacket> var1);
}

