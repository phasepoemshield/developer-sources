/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.plugins.impl.PositionImpl
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;

public class LocationalSoundPacketImpl
extends SoundPacketImpl
implements LocationalSoundPacket {
    private final LocationSoundPacket packet;
    final PositionImpl position;

    public LocationalSoundPacketImpl(LocationSoundPacket locationSoundPacket) {
        super(locationSoundPacket);
        this.packet = locationSoundPacket;
        this.position = new PositionImpl(locationSoundPacket.getLocation());
    }

    public Position getPosition() {
        return this.position;
    }

    public LocationSoundPacket getPacket() {
        return this.packet;
    }

    public float getDistance() {
        return this.packet.getDistance();
    }
}

