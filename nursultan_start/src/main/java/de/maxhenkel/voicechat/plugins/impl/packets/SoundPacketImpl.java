/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket$Builder
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket$Builder
 *  de.maxhenkel.voicechat.api.packets.SoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket$Builder
 *  de.maxhenkel.voicechat.plugins.impl.PositionImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl$BuilderImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.util.UUID;
import javax.annotation.Nullable;

public class SoundPacketImpl
implements de.maxhenkel.voicechat.api.packets.SoundPacket {
    private final SoundPacket<?> packet;

    @Nullable
    public String getCategory() {
        return this.packet.getCategory();
    }

    public SoundPacketImpl(SoundPacket<?> soundPacket) {
        this.packet = soundPacket;
    }

    public UUID getSender() {
        return this.packet.getSender();
    }

    public SoundPacket<?> getPacket() {
        return this.packet;
    }

    private float getDistance() {
        SoundPacketImpl soundPacketImpl = this;
        if (soundPacketImpl instanceof EntitySoundPacket) {
            EntitySoundPacket entitySoundPacket = (EntitySoundPacket)soundPacketImpl;
            return entitySoundPacket.getDistance();
        }
        soundPacketImpl = this;
        if (soundPacketImpl instanceof LocationalSoundPacket) {
            LocationalSoundPacket locationalSoundPacket = (LocationalSoundPacket)soundPacketImpl;
            return locationalSoundPacket.getDistance();
        }
        return Utils.getDefaultDistanceServer();
    }

    public UUID getChannelId() {
        return this.packet.getChannelId();
    }

    public byte[] getOpusEncodedData() {
        return this.packet.getData();
    }

    public long getSequenceNumber() {
        return this.packet.getSequenceNumber();
    }

    public LocationalSoundPacket.Builder<?> locationalSoundPacketBuilder() {
        return new LocationalSoundPacketImpl$BuilderImpl(this);
    }

    public LocationalSoundPacket toLocationalSoundPacket(Position position) {
        if (position instanceof PositionImpl) {
            PositionImpl positionImpl = (PositionImpl)position;
            return new LocationalSoundPacketImpl(new LocationSoundPacket(this.packet.getChannelId(), this.packet.getSender(), positionImpl.getPosition(), this.packet.getData(), this.packet.getSequenceNumber(), this.getDistance(), null));
        }
        throw new IllegalArgumentException("position is not an instance of PositionImpl");
    }

    public StaticSoundPacket toStaticSoundPacket() {
        return new StaticSoundPacketImpl(new GroupSoundPacket(this.packet.getChannelId(), this.packet.getSender(), this.packet.getData(), this.packet.getSequenceNumber(), null));
    }

    public StaticSoundPacket.Builder<?> staticSoundPacketBuilder() {
        return new StaticSoundPacketImpl$BuilderImpl(this);
    }

    public EntitySoundPacket.Builder<?> entitySoundPacketBuilder() {
        return new EntitySoundPacketImpl$BuilderImpl(this);
    }

    public EntitySoundPacket toEntitySoundPacket(UUID uUID, boolean bl) {
        return new EntitySoundPacketImpl(new PlayerSoundPacket(this.packet.getChannelId(), this.packet.getSender(), this.packet.getData(), this.packet.getSequenceNumber(), bl, this.getDistance(), null));
    }
}

