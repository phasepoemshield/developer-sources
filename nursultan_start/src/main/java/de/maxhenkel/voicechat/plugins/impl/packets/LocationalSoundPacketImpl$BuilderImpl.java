/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket$Builder
 *  de.maxhenkel.voicechat.plugins.impl.PositionImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.util.UUID;
import javax.annotation.Nullable;

public class LocationalSoundPacketImpl$BuilderImpl
extends SoundPacketImpl$BuilderImpl<LocationalSoundPacketImpl$BuilderImpl, LocationalSoundPacket>
implements LocationalSoundPacket.Builder<LocationalSoundPacketImpl$BuilderImpl> {
    protected PositionImpl position;
    protected float distance;

    public LocationalSoundPacketImpl$BuilderImpl(SoundPacketImpl soundPacketImpl) {
        super(soundPacketImpl);
        if (soundPacketImpl instanceof LocationalSoundPacketImpl) {
            LocationalSoundPacketImpl locationalSoundPacketImpl = (LocationalSoundPacketImpl)soundPacketImpl;
            this.position = locationalSoundPacketImpl.position;
            this.distance = locationalSoundPacketImpl.getDistance();
        } else if (soundPacketImpl instanceof EntitySoundPacketImpl) {
            EntitySoundPacketImpl entitySoundPacketImpl = (EntitySoundPacketImpl)soundPacketImpl;
            this.distance = entitySoundPacketImpl.getDistance();
        } else {
            this.distance = Utils.getDefaultDistanceServer();
        }
    }

    public LocationalSoundPacketImpl$BuilderImpl(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
        this.distance = Utils.getDefaultDistanceServer();
    }

    public LocationalSoundPacketImpl$BuilderImpl position(Position position) {
        this.position = (PositionImpl)position;
        return this;
    }

    public LocationalSoundPacketImpl$BuilderImpl distance(float f) {
        this.distance = f;
        return this;
    }

    public LocationalSoundPacket build() {
        if (this.position == null) {
            throw new IllegalStateException("position missing");
        }
        return new LocationalSoundPacketImpl(new LocationSoundPacket(this.channelId, this.sender, this.position.getPosition(), this.opusEncodedData, this.sequenceNumber, this.distance, this.category));
    }
}

