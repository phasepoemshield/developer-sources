/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.Entity
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.Group$Builder
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.ServerLevel
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.VoicechatServerApi
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.audiochannel.AudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.AudioPlayer
 *  de.maxhenkel.voicechat.api.audiochannel.EntityAudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.LocationalAudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel
 *  de.maxhenkel.voicechat.api.audiolistener.AudioListener
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener$Builder
 *  de.maxhenkel.voicechat.api.audiosender.AudioSender
 *  de.maxhenkel.voicechat.api.config.ConfigAccessor
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  de.maxhenkel.voicechat.voice.server.ClientConnection
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  de.maxhenkel.voicechat.voice.server.ServerWorldUtils
 *  javax.annotation.Nullable
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.VoicechatServerApi;
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
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerLevelImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatApiImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.AudioPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.AudioSupplier;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.EntityAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.LocationalAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.StaticAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.audiolistener.PlayerAudioListenerImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.audiosender.AudioSenderImpl;
import de.maxhenkel.voicechat.plugins.impl.config.ConfigAccessorImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import de.maxhenkel.voicechat.voice.server.ServerWorldUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;

public class VoicechatServerApiImpl
extends VoicechatApiImpl
implements VoicechatServerApi {
    @Deprecated
    public static final VoicechatServerApiImpl INSTANCE = new VoicechatServerApiImpl();

    public de.maxhenkel.voicechat.api.Group createGroup(String string, @Nullable String string2) {
        return this.createGroup(string, string2, false);
    }

    public de.maxhenkel.voicechat.api.Group createGroup(String string, @Nullable String string2, boolean bl) {
        return this.groupBuilder().setName(string).setPassword(string2).setPersistent(bl).build();
    }

    protected VoicechatServerApiImpl() {
    }

    public static VoicechatServerApi instance() {
        return CommonCompatibilityManager.INSTANCE.getServerApi();
    }

    public Collection<de.maxhenkel.voicechat.api.Group> getGroups() {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return Collections.emptyList();
        }
        return server.getGroupManager().getGroups().values().stream().map(group -> new GroupImpl((Group)group)).toList();
    }

    @Nullable
    public de.maxhenkel.voicechat.api.Group getGroup(UUID uUID) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        return new GroupImpl(server.getGroupManager().getGroup(uUID));
    }

    public boolean registerAudioListener(AudioListener audioListener) {
        return PluginManager.instance().registerAudioListener(audioListener);
    }

    public boolean unregisterAudioListener(UUID uUID) {
        return PluginManager.instance().unregisterAudioListener(uUID);
    }

    public boolean unregisterAudioListener(AudioListener audioListener) {
        return this.unregisterAudioListener(audioListener.getListenerId());
    }

    @Nullable
    public UUID getSecret(UUID uUID) {
        return null;
    }

    public static void sendPacket(class04770 class047702, SoundPacket<?> soundPacket) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        PlayerState playerState = server.getPlayerStateManager().getState(class047702.method_5667());
        if (playerState == null) {
            return;
        }
        ClientConnection clientConnection = (ClientConnection)server.getConnections().get(class047702.method_5667());
        server.sendSoundPacket(null, null, class047702, playerState, clientConnection, soundPacket, "plugin");
    }

    public static void sendPacket(VoicechatConnection voicechatConnection, SoundPacket<?> soundPacket) {
        ServerPlayer serverPlayer = voicechatConnection.getPlayer();
        if (!(serverPlayer instanceof ServerPlayerImpl)) {
            throw new IllegalArgumentException("ServerPlayer is not an instance of ServerPlayerImpl");
        }
        ServerPlayerImpl serverPlayerImpl = (ServerPlayerImpl)serverPlayer;
        VoicechatServerApiImpl.sendPacket(serverPlayerImpl.getRealServerPlayer(), soundPacket);
    }

    public boolean removeGroup(UUID uUID) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return false;
        }
        return server.getGroupManager().removeGroup(uUID);
    }

    public Collection<ServerPlayer> getPlayersInRange(ServerLevel serverLevel, Position position, double d, @Nullable Predicate<ServerPlayer> predicate) {
        if (!(position instanceof PositionImpl)) {
            throw new IllegalArgumentException("Position is not an instance of PositionImpl");
        }
        PositionImpl positionImpl = (PositionImpl)position;
        if (!(serverLevel instanceof ServerLevelImpl)) {
            throw new IllegalArgumentException("ServerLevel is not an instance of ServerLevelImpl");
        }
        ServerLevelImpl serverLevelImpl = (ServerLevelImpl)serverLevel;
        return ServerWorldUtils.getPlayersInRange((class04782)serverLevelImpl.getRawServerLevel(), (class06889)positionImpl.getPosition(), (double)d, predicate == null ? null : class047702 -> predicate.test(new ServerPlayerImpl((class04770)class047702))).stream().map(ServerPlayerImpl::new).collect(Collectors.toList());
    }

    public ConfigAccessor getServerConfig() {
        return new ConfigAccessorImpl(Voicechat.SERVER_CONFIG.voiceChatDistance.getConfig());
    }

    public AudioSender createAudioSender(VoicechatConnection voicechatConnection) {
        return new AudioSenderImpl(voicechatConnection.getPlayer().getUuid());
    }

    @Nullable
    public VoicechatConnection getConnectionOf(UUID uUID) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        class04770 class047702 = server.getServer().Nm().y(uUID);
        if (class047702 == null) {
            return null;
        }
        return VoicechatConnectionImpl.fromPlayer(class047702);
    }

    public Group.Builder groupBuilder() {
        return new GroupImpl$BuilderImpl();
    }

    public AudioPlayer createAudioPlayer(AudioChannel audioChannel, OpusEncoder opusEncoder, Supplier<short[]> supplier) {
        return new AudioPlayerImpl(audioChannel, opusEncoder, supplier);
    }

    public AudioPlayer createAudioPlayer(AudioChannel audioChannel, OpusEncoder opusEncoder, short[] sArray) {
        return new AudioPlayerImpl(audioChannel, opusEncoder, new AudioSupplier(sArray));
    }

    public double getBroadcastRange() {
        return Math.max((Double)Voicechat.SERVER_CONFIG.voiceChatDistance.get(), (Double)Voicechat.SERVER_CONFIG.broadcastRange.get());
    }

    public void sendLocationalSoundPacketTo(VoicechatConnection voicechatConnection, LocationalSoundPacket locationalSoundPacket) {
        if (locationalSoundPacket instanceof LocationalSoundPacketImpl) {
            LocationalSoundPacketImpl locationalSoundPacketImpl = (LocationalSoundPacketImpl)locationalSoundPacket;
            VoicechatServerApiImpl.sendPacket(voicechatConnection, locationalSoundPacketImpl.getPacket());
        }
    }

    @Nullable
    public LocationalAudioChannel createLocationalAudioChannel(UUID uUID, ServerLevel serverLevel, Position position) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        if (position instanceof PositionImpl) {
            PositionImpl positionImpl = (PositionImpl)position;
            return new LocationalAudioChannelImpl(uUID, server, serverLevel, positionImpl);
        }
        throw new IllegalArgumentException("initialPosition is not an instance of PositionImpl");
    }

    public void sendEntitySoundPacketTo(VoicechatConnection voicechatConnection, EntitySoundPacket entitySoundPacket) {
        if (entitySoundPacket instanceof EntitySoundPacketImpl) {
            EntitySoundPacketImpl entitySoundPacketImpl = (EntitySoundPacketImpl)entitySoundPacket;
            VoicechatServerApiImpl.sendPacket(voicechatConnection, entitySoundPacketImpl.getPacket());
        }
    }

    public Collection<VolumeCategory> getVolumeCategories() {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return Collections.emptyList();
        }
        return server.getCategoryManager().getCategories().stream().map(VolumeCategory.class::cast).toList();
    }

    @Nullable
    public EntityAudioChannel createEntityAudioChannel(UUID uUID, Entity entity) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        return new EntityAudioChannelImpl(uUID, server, entity);
    }

    public boolean registerAudioSender(AudioSender audioSender) {
        if (!(audioSender instanceof AudioSenderImpl)) {
            return false;
        }
        return AudioSenderImpl.registerAudioSender((AudioSenderImpl)audioSender);
    }

    public void sendStaticSoundPacketTo(VoicechatConnection voicechatConnection, StaticSoundPacket staticSoundPacket) {
        if (staticSoundPacket instanceof StaticSoundPacketImpl) {
            StaticSoundPacketImpl staticSoundPacketImpl = (StaticSoundPacketImpl)staticSoundPacket;
            VoicechatServerApiImpl.sendPacket(voicechatConnection, staticSoundPacketImpl.getPacket());
        }
    }

    public void registerVolumeCategory(VolumeCategory volumeCategory) {
        if (!(volumeCategory instanceof VolumeCategoryImpl)) {
            throw new IllegalArgumentException("VolumeCategory is not an instance of VolumeCategoryImpl");
        }
        VolumeCategoryImpl volumeCategoryImpl = (VolumeCategoryImpl)volumeCategory;
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        server.getCategoryManager().addCategory(volumeCategoryImpl);
        PluginManager.instance().onRegisterVolumeCategory(volumeCategory);
    }

    public PlayerAudioListener.Builder playerAudioListenerBuilder() {
        return new PlayerAudioListenerImpl$BuilderImpl();
    }

    public boolean unregisterAudioSender(AudioSender audioSender) {
        if (!(audioSender instanceof AudioSenderImpl)) {
            return false;
        }
        return AudioSenderImpl.unregisterAudioSender((AudioSenderImpl)audioSender);
    }

    public void unregisterVolumeCategory(String string) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return;
        }
        VolumeCategoryImpl volumeCategoryImpl = server.getCategoryManager().removeCategory(string);
        if (volumeCategoryImpl != null) {
            PluginManager.instance().onUnregisterVolumeCategory(volumeCategoryImpl);
        }
    }

    @Nullable
    public StaticAudioChannel createStaticAudioChannel(UUID uUID) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        return new StaticAudioChannelImpl(uUID, server);
    }

    @Nullable
    public StaticAudioChannel createStaticAudioChannel(UUID uUID, ServerLevel serverLevel, VoicechatConnection voicechatConnection) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return null;
        }
        StaticAudioChannelImpl staticAudioChannelImpl = new StaticAudioChannelImpl(uUID, server);
        staticAudioChannelImpl.setBypassGroupIsolation(true);
        staticAudioChannelImpl.addTarget(voicechatConnection);
        return staticAudioChannelImpl;
    }
}

