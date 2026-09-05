/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00667
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class00667;
import minecraft.class06889;

public class LocationSoundPacket
extends SoundPacket<LocationSoundPacket> {
    protected class06889 location;
    protected float distance;

    public LocationSoundPacket() {
    }

    public LocationSoundPacket(UUID uUID, UUID uUID2, short[] sArray, class06889 class068892, float f, @Nullable String string) {
        super(uUID, uUID2, sArray, string);
        this.location = class068892;
        this.distance = f;
    }

    public LocationSoundPacket(UUID uUID, UUID uUID2, class06889 class068892, byte[] byArray, long l, float f, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
        this.location = class068892;
        this.distance = f;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.channelId);
        class006672.N(this.sender);
        class006672.writeDouble(this.location.M);
        class006672.writeDouble(this.location.B);
        class006672.writeDouble(this.location.Z);
        class006672.N(this.data);
        class006672.writeLong(this.sequenceNumber);
        class006672.writeFloat(this.distance);
        byte by = 0;
        if (this.category != null) {
            by = this.setFlag(by, (byte)2);
        }
        class006672.writeByte((int)by);
        if (this.category != null) {
            class006672.N(this.category, 16);
        }
    }

    public class06889 getLocation() {
        return this.location;
    }

    @Override
    public LocationSoundPacket fromBytes(class00667 class006672) {
        LocationSoundPacket locationSoundPacket = new LocationSoundPacket();
        locationSoundPacket.channelId = class006672.m();
        locationSoundPacket.sender = class006672.m();
        locationSoundPacket.location = new class06889(class006672.readDouble(), class006672.readDouble(), class006672.readDouble());
        locationSoundPacket.data = class006672.y();
        locationSoundPacket.sequenceNumber = class006672.readLong();
        locationSoundPacket.distance = class006672.readFloat();
        byte by = class006672.readByte();
        if (this.hasFlag(by, (byte)2)) {
            locationSoundPacket.category = class006672.u(16);
        }
        return locationSoundPacket;
    }

    public float getDistance() {
        return this.distance;
    }
}

