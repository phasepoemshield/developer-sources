/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener
 *  de.maxhenkel.voicechat.api.packets.SoundPacket
 */
package de.maxhenkel.voicechat.plugins.impl.audiolistener;

import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.packets.SoundPacket;
import java.util.UUID;
import java.util.function.Consumer;

public class PlayerAudioListenerImpl
implements PlayerAudioListener {
    private final UUID playerUuid;
    private final Consumer<SoundPacket> listener;
    private final UUID listenerId;

    public PlayerAudioListenerImpl(UUID uUID, Consumer<SoundPacket> consumer) {
        this.playerUuid = uUID;
        this.listener = consumer;
        this.listenerId = UUID.randomUUID();
    }

    public UUID getListenerId() {
        return this.listenerId;
    }

    public Consumer<SoundPacket> getListener() {
        return this.listener;
    }

    public UUID getPlayerUuid() {
        return this.playerUuid;
    }
}

