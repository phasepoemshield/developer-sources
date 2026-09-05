/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener$Builder
 *  de.maxhenkel.voicechat.api.packets.SoundPacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.audiolistener;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.packets.SoundPacket;
import de.maxhenkel.voicechat.plugins.impl.audiolistener.PlayerAudioListenerImpl;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class PlayerAudioListenerImpl$BuilderImpl
implements PlayerAudioListener.Builder {
    @Nullable
    private UUID playerUuid;
    @Nullable
    private Consumer<SoundPacket> listener;

    public PlayerAudioListener build() {
        if (this.playerUuid == null) {
            throw new IllegalStateException("No player provided");
        }
        if (this.listener == null) {
            throw new IllegalStateException("No listener provided");
        }
        return new PlayerAudioListenerImpl(this.playerUuid, this.listener);
    }

    public PlayerAudioListener.Builder setPlayer(ServerPlayer serverPlayer) {
        this.playerUuid = serverPlayer.getUuid();
        return this;
    }

    public PlayerAudioListener.Builder setPlayer(UUID uUID) {
        this.playerUuid = uUID;
        return this;
    }

    public PlayerAudioListener.Builder setPacketListener(Consumer<SoundPacket> consumer) {
        this.listener = consumer;
        return this;
    }
}

