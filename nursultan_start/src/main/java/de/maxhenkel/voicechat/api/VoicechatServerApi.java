/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener$Builder
 *  de.maxhenkel.voicechat.api.audiosender.AudioSender
 *  de.maxhenkel.voicechat.api.config.ConfigAccessor
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.Group$Builder;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.AudioPlayer;
import de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel;
import de.maxhenkel.voicechat.api.audiolistener.AudioListener;
import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.audiosender.AudioSender;
import de.maxhenkel.voicechat.api.config.ConfigAccessor;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface VoicechatServerApi
extends VoicechatApi {
    @Deprecated
    public Group createGroup(String var1, @Nullable String var2);

    @Deprecated
    public Group createGroup(String var1, @Nullable String var2, boolean var3);

    public Collection<Group> getGroups();

    @Nullable
    public Group getGroup(UUID var1);

    public boolean registerAudioListener(AudioListener var1);

    public boolean unregisterAudioListener(UUID var1);

    public boolean unregisterAudioListener(AudioListener var1);

    @Nullable
    @Deprecated
    public UUID getSecret(UUID var1);

    public boolean removeGroup(UUID var1);

    public Collection<ServerPlayer> getPlayersInRange(ServerLevel var1, Position var2, double var3, Predicate<ServerPlayer> var5);

    default public Collection<ServerPlayer> getPlayersInRange(ServerLevel serverLevel, Position position, double d) {
        return this.getPlayersInRange(serverLevel, position, d, null);
    }

    public ConfigAccessor getServerConfig();

    public AudioSender createAudioSender(VoicechatConnection var1);

    @Nullable
    default public VoicechatConnection getConnectionOf(ServerPlayer serverPlayer) {
        return this.getConnectionOf(serverPlayer.getUuid());
    }

    @Nullable
    public VoicechatConnection getConnectionOf(UUID var1);

    public Group$Builder groupBuilder();

    public AudioPlayer createAudioPlayer(AudioChannel var1, OpusEncoder var2, short[] var3);

    public AudioPlayer createAudioPlayer(AudioChannel var1, OpusEncoder var2, Supplier<short[]> var3);

    public double getBroadcastRange();

    public void sendLocationalSoundPacketTo(VoicechatConnection var1, LocationalSoundPacket var2);

    @Nullable
    public LocationalAudioChannel createLocationalAudioChannel(UUID var1, ServerLevel var2, Position var3);

    public void sendEntitySoundPacketTo(VoicechatConnection var1, EntitySoundPacket var2);

    public Collection<VolumeCategory> getVolumeCategories();

    @Nullable
    public EntityAudioChannel createEntityAudioChannel(UUID var1, Entity var2);

    public boolean registerAudioSender(AudioSender var1);

    public void sendStaticSoundPacketTo(VoicechatConnection var1, StaticSoundPacket var2);

    public void registerVolumeCategory(VolumeCategory var1);

    public PlayerAudioListener.Builder playerAudioListenerBuilder();

    public boolean unregisterAudioSender(AudioSender var1);

    public void unregisterVolumeCategory(String var1);

    default public void unregisterVolumeCategory(VolumeCategory volumeCategory) {
        this.unregisterVolumeCategory(volumeCategory.getId());
    }

    @Deprecated
    @Nullable
    public StaticAudioChannel createStaticAudioChannel(UUID var1, ServerLevel var2, VoicechatConnection var3);

    @Nullable
    public StaticAudioChannel createStaticAudioChannel(UUID var1);
}

