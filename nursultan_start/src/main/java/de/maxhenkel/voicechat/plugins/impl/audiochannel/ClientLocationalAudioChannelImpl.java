/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel
 *  de.maxhenkel.voicechat.voice.client.ClientUtils
 *  de.maxhenkel.voicechat.voice.common.LocationSoundPacket
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientAudioChannelImpl;
import de.maxhenkel.voicechat.voice.client.ClientUtils;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;
import minecraft.class06889;

public class ClientLocationalAudioChannelImpl
extends ClientAudioChannelImpl
implements ClientLocationalAudioChannel {
    private Position position;
    private float distance;

    public ClientLocationalAudioChannelImpl(UUID uUID, Position position) {
        super(uUID);
        this.position = position;
        this.distance = ClientUtils.getDefaultDistanceClient();
    }

    public Position getLocation() {
        return this.position;
    }

    public void setLocation(Position position) {
        this.position = position;
    }

    @Override
    protected SoundPacket<?> createSoundPacket(short[] sArray) {
        return new LocationSoundPacket(this.id, this.id, sArray, new class06889(this.position.getX(), this.position.getY(), this.position.getZ()), this.distance, this.category);
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float f) {
        this.distance = f;
    }
}

