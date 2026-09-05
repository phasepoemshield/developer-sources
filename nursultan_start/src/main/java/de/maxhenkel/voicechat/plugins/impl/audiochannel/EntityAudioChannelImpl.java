/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Entity
 *  de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.voice.common.PlayerSoundPacket
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  de.maxhenkel.voicechat.voice.common.Utils
 *  de.maxhenkel.voicechat.voice.server.Server
 *  de.maxhenkel.voicechat.voice.server.ServerWorldUtils
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.plugins.impl.EntityImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.AudioChannelImpl;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import de.maxhenkel.voicechat.voice.server.Server;
import de.maxhenkel.voicechat.voice.server.ServerWorldUtils;
import java.util.UUID;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;

public class EntityAudioChannelImpl
extends AudioChannelImpl
implements EntityAudioChannel {
    protected Entity entity;
    protected boolean whispering;
    protected float distance;

    public EntityAudioChannelImpl(UUID uUID, Server server, Entity entity) {
        super(uUID, server);
        this.entity = entity;
        this.whispering = false;
        this.distance = Utils.getDefaultDistanceServer();
    }

    public void flush() {
        this.broadcast(new PlayerSoundPacket(this.channelId, this.entity.getUuid(), new byte[0], this.sequenceNumber.getAndIncrement(), this.whispering, this.distance, this.category));
    }

    private void broadcast(PlayerSoundPacket playerSoundPacket) {
        Entity entity = this.entity;
        if (!(entity instanceof EntityImpl)) {
            throw new IllegalArgumentException("entity is not an instance of EntityImpl");
        }
        EntityImpl entityImpl = (EntityImpl)entity;
        this.server.broadcast(ServerWorldUtils.getPlayersInRange((class04782)((class04782)entityImpl.getRealEntity().method_73183()), (class06889)entityImpl.getRealEntity().method_33571(), (double)this.server.getBroadcastRange(this.distance), this.filter == null ? class047702 -> true : class047702 -> this.filter.test(new ServerPlayerImpl((class04770)class047702))), (SoundPacket)playerSoundPacket, null, null, null, "plugin");
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    public void send(MicrophonePacket microphonePacket) {
        this.broadcast(new PlayerSoundPacket(this.channelId, this.entity.getUuid(), microphonePacket.getOpusEncodedData(), this.sequenceNumber.getAndIncrement(), this.whispering, this.distance, this.category));
    }

    public void send(byte[] byArray) {
        this.broadcast(new PlayerSoundPacket(this.channelId, this.entity.getUuid(), byArray, this.sequenceNumber.getAndIncrement(), this.whispering, this.distance, this.category));
    }

    public Entity getEntity() {
        return this.entity;
    }

    public float getDistance() {
        return this.distance;
    }

    public void updateEntity(Entity entity) {
        this.entity = entity;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void setWhispering(boolean bl) {
        this.whispering = bl;
    }
}

