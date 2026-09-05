/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket$Builder
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket$Builder
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket$Builder
 *  de.maxhenkel.voicechat.plugins.impl.PositionImpl
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
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
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.util.Objects;
import java.util.UUID;

public class MicrophonePacketImpl
implements MicrophonePacket {
    private final MicPacket packet;
    private final UUID sender;

    public MicrophonePacketImpl(MicPacket micPacket, UUID uUID) {
        this.packet = micPacket;
        this.sender = uUID;
    }

    public boolean isWhispering() {
        return this.packet.isWhispering();
    }

    public byte[] getOpusEncodedData() {
        return this.packet.getData();
    }

    public void setOpusEncodedData(byte[] byArray) {
        this.packet.setData(Objects.requireNonNull(byArray));
    }

    public LocationalSoundPacket.Builder<?> locationalSoundPacketBuilder() {
        return new LocationalSoundPacketImpl$BuilderImpl(this.sender, this.sender, this.packet.getData(), this.packet.getSequenceNumber(), null);
    }

    @Deprecated
    public LocationalSoundPacket toLocationalSoundPacket(Position position) {
        if (position instanceof PositionImpl) {
            PositionImpl positionImpl = (PositionImpl)position;
            return new LocationalSoundPacketImpl(new LocationSoundPacket(this.sender, this.sender, positionImpl.getPosition(), this.packet.getData(), this.packet.getSequenceNumber(), Utils.getDefaultDistanceServer(), null));
        }
        throw new IllegalArgumentException("position is not an instance of PositionImpl");
    }

    @Deprecated
    public StaticSoundPacket toStaticSoundPacket() {
        return new StaticSoundPacketImpl(new GroupSoundPacket(this.sender, this.sender, this.packet.getData(), this.packet.getSequenceNumber(), null));
    }

    public StaticSoundPacket.Builder<?> staticSoundPacketBuilder() {
        return new StaticSoundPacketImpl$BuilderImpl(this.sender, this.sender, this.packet.getData(), this.packet.getSequenceNumber(), null);
    }

    public EntitySoundPacket.Builder<?> entitySoundPacketBuilder() {
        return new EntitySoundPacketImpl$BuilderImpl(this.sender, this.sender, this.packet.getData(), this.packet.getSequenceNumber(), null);
    }

    @Deprecated
    public EntitySoundPacket toEntitySoundPacket(UUID uUID, boolean bl) {
        return new EntitySoundPacketImpl(new PlayerSoundPacket(this.sender, this.sender, this.packet.getData(), this.packet.getSequenceNumber(), bl, Utils.getDefaultDistanceServer(), null));
    }
}

