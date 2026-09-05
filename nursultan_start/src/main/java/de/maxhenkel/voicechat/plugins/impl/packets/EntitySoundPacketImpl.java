/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 */
package de.maxhenkel.voicechat.plugins.impl.packets;

import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import java.util.UUID;

public class EntitySoundPacketImpl
extends SoundPacketImpl
implements EntitySoundPacket {
    private final PlayerSoundPacket packet;

    public EntitySoundPacketImpl(PlayerSoundPacket playerSoundPacket) {
        super(playerSoundPacket);
        this.packet = playerSoundPacket;
    }

    public boolean isWhispering() {
        return this.packet.isWhispering();
    }

    public PlayerSoundPacket getPacket() {
        return this.packet;
    }

    public float getDistance() {
        return this.packet.getDistance();
    }

    public UUID getEntityUuid() {
        return this.packet.getSender();
    }

    @Override
    public UUID getChannelId() {
        return this.packet.getChannelId();
    }
}

