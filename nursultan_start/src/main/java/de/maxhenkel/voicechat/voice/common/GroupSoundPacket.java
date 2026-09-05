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

public class GroupSoundPacket
extends SoundPacket<GroupSoundPacket> {
    public GroupSoundPacket() {
    }

    public GroupSoundPacket(UUID uUID, UUID uUID2, short[] sArray, @Nullable String string) {
        super(uUID, uUID2, sArray, string);
    }

    public GroupSoundPacket(UUID uUID, UUID uUID2, byte[] byArray, long l, @Nullable String string) {
        super(uUID, uUID2, byArray, l, string);
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.channelId);
        class006672.N(this.sender);
        class006672.N(this.data);
        class006672.writeLong(this.sequenceNumber);
        byte by = 0;
        if (this.category != null) {
            by = this.setFlag(by, (byte)2);
        }
        class006672.writeByte((int)by);
        if (this.category != null) {
            class006672.N(this.category, 16);
        }
    }

    @Override
    public GroupSoundPacket fromBytes(class00667 class006672) {
        GroupSoundPacket groupSoundPacket = new GroupSoundPacket();
        groupSoundPacket.channelId = class006672.m();
        groupSoundPacket.sender = class006672.m();
        groupSoundPacket.data = class006672.y();
        groupSoundPacket.sequenceNumber = class006672.readLong();
        byte by = class006672.readByte();
        if (this.hasFlag(by, (byte)2)) {
            groupSoundPacket.category = class006672.u(16);
        }
        return groupSoundPacket;
    }
}

