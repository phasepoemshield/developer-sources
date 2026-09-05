/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.ServerLevel
 *  de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.voice.common.LocationSoundPacket
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  de.maxhenkel.voicechat.voice.common.Utils
 *  de.maxhenkel.voicechat.voice.server.Server
 *  de.maxhenkel.voicechat.voice.server.ServerWorldUtils
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerLevelImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.AudioChannelImpl;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.common.Utils;
import de.maxhenkel.voicechat.voice.server.Server;
import de.maxhenkel.voicechat.voice.server.ServerWorldUtils;
import java.util.UUID;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;

public class LocationalAudioChannelImpl
extends AudioChannelImpl
implements LocationalAudioChannel {
    protected ServerLevel level;
    protected PositionImpl position;
    protected float distance;

    public LocationalAudioChannelImpl(UUID uUID, Server server, ServerLevel serverLevel, PositionImpl positionImpl) {
        super(uUID, server);
        this.level = serverLevel;
        this.position = positionImpl;
        this.distance = Utils.getDefaultDistanceServer();
    }

    public void flush() {
        this.broadcast(new LocationSoundPacket(this.channelId, this.channelId, this.position.getPosition(), new byte[0], this.sequenceNumber.getAndIncrement(), this.distance, this.category));
    }

    public Position getLocation() {
        return this.position;
    }

    private void broadcast(LocationSoundPacket locationSoundPacket) {
        ServerLevel serverLevel = this.level;
        if (!(serverLevel instanceof ServerLevelImpl)) {
            throw new IllegalArgumentException("level is not an instance of ServerLevelImpl");
        }
        ServerLevelImpl serverLevelImpl = (ServerLevelImpl)serverLevel;
        this.server.broadcast(ServerWorldUtils.getPlayersInRange((class04782)serverLevelImpl.getRawServerLevel(), (class06889)this.position.getPosition(), (double)this.server.getBroadcastRange(this.distance), this.filter == null ? class047702 -> true : class047702 -> this.filter.test(new ServerPlayerImpl((class04770)class047702))), (SoundPacket)locationSoundPacket, null, null, null, "plugin");
    }

    public void send(byte[] byArray) {
        this.broadcast(new LocationSoundPacket(this.channelId, this.channelId, this.position.getPosition(), byArray, this.sequenceNumber.getAndIncrement(), this.distance, this.category));
    }

    public void send(MicrophonePacket microphonePacket) {
        this.send(microphonePacket.getOpusEncodedData());
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public void updateLocation(Position position) {
        PositionImpl positionImpl;
        if (!(position instanceof PositionImpl)) {
            throw new IllegalArgumentException("position is not an instance of PositionImpl");
        }
        this.position = positionImpl = (PositionImpl)position;
    }
}

