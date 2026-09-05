/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class00667;

public class PlayerSoundPacket
extends SoundPacket<PlayerSoundPacket> {
    protected boolean whispering;
    protected float distance;

    public PlayerSoundPacket() {
    }

    public PlayerSoundPacket(UUID uUID, UUID uUID2, short[] sArray, boolean bl, float f, @Nullable String string) {
        super(uUID, uUID2, sArray, string);
        this.whispering = bl;
        this.distance = f;
    }

    public PlayerSoundPacket(UUID uUID, UUID uUID2, byte[] byArray, long l, boolean bl, float f, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
        this.whispering = bl;
        this.distance = f;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.channelId);
        class006672.N(this.sender);
        class006672.N(this.data);
        class006672.writeLong(this.sequenceNumber);
        class006672.writeFloat(this.distance);
        byte by = 0;
        if (this.whispering) {
            by = this.setFlag(by, (byte)1);
        }
        if (this.category != null) {
            by = this.setFlag(by, (byte)2);
        }
        class006672.writeByte((int)by);
        if (this.category != null) {
            class006672.N(this.category, 16);
        }
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    @Override
    public PlayerSoundPacket fromBytes(class00667 class006672) {
        PlayerSoundPacket playerSoundPacket = new PlayerSoundPacket();
        playerSoundPacket.channelId = class006672.m();
        playerSoundPacket.sender = class006672.m();
        playerSoundPacket.data = class006672.y();
        playerSoundPacket.sequenceNumber = class006672.readLong();
        playerSoundPacket.distance = class006672.readFloat();
        byte by = class006672.readByte();
        playerSoundPacket.whispering = this.hasFlag(by, (byte)1);
        if (this.hasFlag(by, (byte)2)) {
            playerSoundPacket.category = class006672.u(16);
        }
        return playerSoundPacket;
    }

    @Override
    public UUID getSender() {
        return this.sender;
    }

    public float getDistance() {
        return this.distance;
    }
}

