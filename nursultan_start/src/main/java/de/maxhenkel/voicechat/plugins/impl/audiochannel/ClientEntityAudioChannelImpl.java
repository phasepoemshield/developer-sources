/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel
 *  de.maxhenkel.voicechat.voice.client.ClientUtils
 *  de.maxhenkel.voicechat.voice.common.PlayerSoundPacket
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientAudioChannelImpl;
import de.maxhenkel.voicechat.voice.client.ClientUtils;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;

public class ClientEntityAudioChannelImpl
extends ClientAudioChannelImpl
implements ClientEntityAudioChannel {
    private UUID entityId;
    private boolean whispering;
    private float distance;

    public ClientEntityAudioChannelImpl(UUID uUID, UUID uUID2) {
        super(uUID);
        this.entityId = uUID2;
        this.whispering = false;
        this.distance = ClientUtils.getDefaultDistanceClient();
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    @Override
    protected SoundPacket<?> createSoundPacket(short[] sArray) {
        return new PlayerSoundPacket(this.id, this.id, sArray, this.whispering, this.distance, this.category);
    }

    public float getDistance() {
        return this.distance;
    }

    public UUID getEntityId() {
        return this.entityId;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void setWhispering(boolean bl) {
        this.whispering = bl;
    }
}

