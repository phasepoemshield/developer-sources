/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.VoicechatApi
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.VoicechatPlugin
 *  de.maxhenkel.voicechat.api.VoicechatSocket
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.audiolistener.AudioListener
 *  de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener
 *  de.maxhenkel.voicechat.api.events.CreateGroupEvent
 *  de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent
 *  de.maxhenkel.voicechat.api.events.Event
 *  de.maxhenkel.voicechat.api.events.EventRegistration
 *  de.maxhenkel.voicechat.api.events.JoinGroupEvent
 *  de.maxhenkel.voicechat.api.events.LeaveGroupEvent
 *  de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent
 *  de.maxhenkel.voicechat.api.events.MicrophonePacketEvent
 *  de.maxhenkel.voicechat.api.events.PlayerConnectedEvent
 *  de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent
 *  de.maxhenkel.voicechat.api.events.PlayerStateChangedEvent
 *  de.maxhenkel.voicechat.api.events.RegisterVolumeCategoryEvent
 *  de.maxhenkel.voicechat.api.events.RemoveGroupEvent
 *  de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent
 *  de.maxhenkel.voicechat.api.events.UnregisterVolumeCategoryEvent
 *  de.maxhenkel.voicechat.api.events.VoiceDistanceEvent
 *  de.maxhenkel.voicechat.api.events.VoiceHostEvent
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent
 *  de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent
 *  de.maxhenkel.voicechat.api.packets.EntitySoundPacket
 *  de.maxhenkel.voicechat.api.packets.LocationalSoundPacket
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.api.packets.SoundPacket
 *  de.maxhenkel.voicechat.api.packets.StaticSoundPacket
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.plugins.impl.events.PlayerConnectedEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.PlayerDisconnectedEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.PlayerStateChangedEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.RegisterVolumeCategoryEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.RemoveGroupEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.StaticSoundPacketEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.UnregisterVolumeCategoryEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.VoiceDistanceEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.VoiceHostEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStartedEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStartingEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStoppedEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.MicrophonePacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl
 *  de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl
 *  de.maxhenkel.voicechat.voice.common.GroupSoundPacket
 *  de.maxhenkel.voicechat.voice.common.LocationSoundPacket
 *  de.maxhenkel.voicechat.voice.common.MicPacket
 *  de.maxhenkel.voicechat.voice.common.PlayerSoundPacket
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  javax.annotation.Nullable
 *  minecraft.class02796
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.plugins;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.VoicechatSocket;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.audiolistener.AudioListener;
import de.maxhenkel.voicechat.api.audiolistener.PlayerAudioListener;
import de.maxhenkel.voicechat.api.events.CreateGroupEvent;
import de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent;
import de.maxhenkel.voicechat.api.events.Event;
import de.maxhenkel.voicechat.api.events.EventRegistration;
import de.maxhenkel.voicechat.api.events.JoinGroupEvent;
import de.maxhenkel.voicechat.api.events.LeaveGroupEvent;
import de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent;
import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent;
import de.maxhenkel.voicechat.api.events.PlayerConnectedEvent;
import de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent;
import de.maxhenkel.voicechat.api.events.PlayerStateChangedEvent;
import de.maxhenkel.voicechat.api.events.RegisterVolumeCategoryEvent;
import de.maxhenkel.voicechat.api.events.RemoveGroupEvent;
import de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent;
import de.maxhenkel.voicechat.api.events.UnregisterVolumeCategoryEvent;
import de.maxhenkel.voicechat.api.events.VoiceDistanceEvent;
import de.maxhenkel.voicechat.api.events.VoiceHostEvent;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;
import de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent;
import de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent;
import de.maxhenkel.voicechat.api.packets.EntitySoundPacket;
import de.maxhenkel.voicechat.api.packets.LocationalSoundPacket;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.api.packets.StaticSoundPacket;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.EventBuilder;
import de.maxhenkel.voicechat.plugins.impl.GroupImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatConnectionImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatSocketImpl;
import de.maxhenkel.voicechat.plugins.impl.audiolistener.PlayerAudioListenerImpl;
import de.maxhenkel.voicechat.plugins.impl.events.CreateGroupEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.EntitySoundPacketEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.JoinGroupEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.LeaveGroupEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.LocationalSoundPacketEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.MicrophonePacketEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.PlayerConnectedEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.PlayerDisconnectedEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.PlayerStateChangedEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.RegisterVolumeCategoryEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.RemoveGroupEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.StaticSoundPacketEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.UnregisterVolumeCategoryEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoiceDistanceEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoiceHostEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStartedEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStartingEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoicechatServerStoppedEventImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.EntitySoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.LocationalSoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.MicrophonePacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.SoundPacketImpl;
import de.maxhenkel.voicechat.plugins.impl.packets.StaticSoundPacketImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import minecraft.class02796;
import minecraft.class04770;

public class PluginManager {
    private List<VoicechatPlugin> plugins;
    private Map<Class<? extends Event>, List<Consumer<? extends Event>>> events;
    private Map<UUID, List<PlayerAudioListener>> playerAudioListeners;
    private static PluginManager instance;

    public void init() {
        if (this.plugins != null) {
            return;
        }
        Voicechat.LOGGER.info("Loading plugins", new Object[0]);
        this.plugins = CommonCompatibilityManager.INSTANCE.loadPlugins();
        Voicechat.LOGGER.info("Loaded {} plugin(s)", this.plugins.size());
        Voicechat.LOGGER.info("Initializing plugins", new Object[0]);
        for (VoicechatPlugin voicechatPlugin : this.plugins) {
            try {
                voicechatPlugin.initialize((VoicechatApi)VoicechatServerApiImpl.instance());
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.warn("Failed to initialize plugin '{}'", voicechatPlugin.getPluginId(), throwable);
            }
        }
        Voicechat.LOGGER.info("Initialized {} plugin(s)", this.plugins.size());
        this.gatherEvents();
        this.playerAudioListeners = new HashMap<UUID, List<PlayerAudioListener>>();
    }

    public static PluginManager instance() {
        if (instance == null) {
            instance = new PluginManager();
            instance.init();
        }
        return instance;
    }

    public <T extends Event> boolean dispatchEvent(Class<? extends T> clazz, T t) {
        List<Consumer<? extends Event>> list = this.events.get(clazz);
        if (list == null) {
            return false;
        }
        for (Consumer<? extends Event> consumer : list) {
            try {
                Consumer<? extends Event> consumer2 = consumer;
                consumer2.accept(t);
                if (!t.isCancelled()) continue;
                break;
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.error("Failed to dispatch event '{}'", clazz.getSimpleName(), throwable);
            }
        }
        return t.isCancelled();
    }

    public void onServerStarted() {
        this.dispatchEvent(VoicechatServerStartedEvent.class, new VoicechatServerStartedEventImpl());
    }

    public void onServerStopped() {
        this.dispatchEvent(VoicechatServerStoppedEvent.class, new VoicechatServerStoppedEventImpl());
    }

    public void onRegisterVolumeCategory(VolumeCategory volumeCategory) {
        this.dispatchEvent(RegisterVolumeCategoryEvent.class, new RegisterVolumeCategoryEventImpl(volumeCategory));
    }

    public List<PlayerAudioListener> getPlayerAudioListeners(UUID uUID) {
        return this.playerAudioListeners.getOrDefault(uUID, Collections.emptyList());
    }

    public boolean registerAudioListener(AudioListener audioListener) {
        if (!(audioListener instanceof PlayerAudioListener)) {
            return false;
        }
        PlayerAudioListener playerAudioListener = (PlayerAudioListener)audioListener;
        boolean bl = this.playerAudioListeners.values().stream().anyMatch(list -> list.stream().anyMatch(playerAudioListener2 -> playerAudioListener2.getListenerId().equals(playerAudioListener.getListenerId())));
        if (bl) {
            return false;
        }
        this.playerAudioListeners.computeIfAbsent(playerAudioListener.getPlayerUuid(), uUID -> new ArrayList()).add(playerAudioListener);
        return true;
    }

    public boolean unregisterAudioListener(UUID uUID) {
        boolean bl = this.playerAudioListeners.values().stream().anyMatch(list -> list.removeIf(playerAudioListener -> playerAudioListener.getListenerId().equals(uUID)));
        if (!bl) {
            return false;
        }
        this.playerAudioListeners.values().removeIf(List::isEmpty);
        return true;
    }

    public void onUnregisterVolumeCategory(VolumeCategory volumeCategory) {
        this.dispatchEvent(UnregisterVolumeCategoryEvent.class, new UnregisterVolumeCategoryEventImpl(volumeCategory));
    }

    public VoicechatSocket getSocketImplementation(class02796 class027962) {
        VoicechatServerStartingEventImpl voicechatServerStartingEventImpl = new VoicechatServerStartingEventImpl();
        this.dispatchEvent(VoicechatServerStartingEvent.class, voicechatServerStartingEventImpl);
        VoicechatSocket voicechatSocket = voicechatServerStartingEventImpl.getSocketImplementation();
        if (voicechatSocket == null) {
            voicechatSocket = new VoicechatSocketImpl();
            Voicechat.LOGGER.debug("Using default voicechat socket implementation", new Object[0]);
        } else {
            Voicechat.LOGGER.info("Using custom voicechat socket implementation: {}", voicechatSocket.getClass().getName());
        }
        return voicechatSocket;
    }

    public void onPlayerDisconnected(UUID uUID) {
        this.dispatchEvent(PlayerDisconnectedEvent.class, new PlayerDisconnectedEventImpl(uUID));
    }

    public void onPlayerStateChanged(PlayerState playerState) {
        this.dispatchEvent(PlayerStateChangedEvent.class, new PlayerStateChangedEventImpl(playerState));
    }

    public String getVoiceHost(class04770 class047702, String string) {
        VoiceHostEventImpl voiceHostEventImpl = new VoiceHostEventImpl(class047702, string);
        this.dispatchEvent(VoiceHostEvent.class, voiceHostEventImpl);
        return voiceHostEventImpl.getVoiceHost();
    }

    public boolean onMicPacket(class04770 class047702, PlayerState playerState, MicPacket micPacket) {
        return this.dispatchEvent(MicrophonePacketEvent.class, new MicrophonePacketEventImpl((MicrophonePacket)new MicrophonePacketImpl(micPacket, class047702.method_5667()), new VoicechatConnectionImpl(class047702, playerState)));
    }

    public void onListenerAudio(UUID uUID, SoundPacket<?> soundPacket) {
        if (uUID.equals(soundPacket.getSender())) {
            return;
        }
        List<PlayerAudioListener> list = this.getPlayerAudioListeners(uUID);
        if (list.isEmpty()) {
            return;
        }
        Object object = soundPacket instanceof GroupSoundPacket ? new StaticSoundPacketImpl((GroupSoundPacket)soundPacket) : (soundPacket instanceof PlayerSoundPacket ? new EntitySoundPacketImpl((PlayerSoundPacket)soundPacket) : (soundPacket instanceof LocationSoundPacket ? new LocationalSoundPacketImpl((LocationSoundPacket)soundPacket) : new SoundPacketImpl(soundPacket)));
        for (PlayerAudioListener playerAudioListener : list) {
            if (!(playerAudioListener instanceof PlayerAudioListenerImpl)) continue;
            try {
                ((PlayerAudioListenerImpl)playerAudioListener).getListener().accept((de.maxhenkel.voicechat.api.packets.SoundPacket)object);
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.error("Failed to process audio listener", throwable);
            }
        }
    }

    public void onPlayerConnected(class04770 class047702) {
        this.dispatchEvent(PlayerConnectedEvent.class, new PlayerConnectedEventImpl(VoicechatConnectionImpl.fromPlayer(class047702)));
    }

    public boolean onJoinGroup(class04770 class047702, @Nullable Group group) {
        if (group == null) {
            return this.onLeaveGroup(class047702);
        }
        return this.dispatchEvent(JoinGroupEvent.class, new JoinGroupEventImpl(new GroupImpl(group), VoicechatConnectionImpl.fromPlayer(class047702)));
    }

    private void gatherEvents() {
        EventBuilder eventBuilder = EventBuilder.create();
        EventRegistration eventRegistration = eventBuilder::addEvent;
        for (VoicechatPlugin voicechatPlugin : this.plugins) {
            Voicechat.LOGGER.info("Registering events for '{}'", voicechatPlugin.getPluginId());
            try {
                voicechatPlugin.registerEvents(eventRegistration);
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.error("Failed to register events for '{}'", voicechatPlugin.getPluginId(), throwable);
            }
        }
        this.events = eventBuilder.build();
    }

    public boolean onLeaveGroup(class04770 class047702) {
        Group group;
        UUID uUID;
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return false;
        }
        GroupImpl groupImpl = null;
        PlayerState playerState = server.getPlayerStateManager().getState(class047702.method_5667());
        if (playerState != null && (uUID = playerState.getGroup()) != null && (group = server.getGroupManager().getGroup(uUID)) != null) {
            groupImpl = new GroupImpl(group);
        }
        return this.dispatchEvent(LeaveGroupEvent.class, new LeaveGroupEventImpl(groupImpl, VoicechatConnectionImpl.fromPlayer(class047702)));
    }

    public boolean onCreateGroup(@Nullable class04770 class047702, @Nullable Group group) {
        if (group == null) {
            if (class047702 == null) {
                return false;
            }
            return this.onLeaveGroup(class047702);
        }
        return this.dispatchEvent(CreateGroupEvent.class, new CreateGroupEventImpl(new GroupImpl(group), VoicechatConnectionImpl.fromPlayer(class047702)));
    }

    public boolean onRemoveGroup(Group group) {
        return this.dispatchEvent(RemoveGroupEvent.class, new RemoveGroupEventImpl((de.maxhenkel.voicechat.api.Group)new GroupImpl(group)));
    }

    public float getDistance(class04770 class047702, PlayerState playerState, MicPacket micPacket, float f) {
        VoiceDistanceEventImpl voiceDistanceEventImpl = new VoiceDistanceEventImpl((MicrophonePacket)new MicrophonePacketImpl(micPacket, class047702.method_5667()), (VoicechatConnection)new VoicechatConnectionImpl(class047702, playerState), f);
        this.dispatchEvent(VoiceDistanceEvent.class, voiceDistanceEventImpl);
        return voiceDistanceEventImpl.getDistance();
    }

    public boolean onSoundPacket(@Nullable class04770 class047702, @Nullable PlayerState playerState, class04770 class047703, PlayerState playerState2, SoundPacket<?> soundPacket, String string) {
        VoicechatConnectionImpl voicechatConnectionImpl = null;
        if (class047702 != null && playerState != null) {
            voicechatConnectionImpl = new VoicechatConnectionImpl(class047702, playerState);
        }
        VoicechatConnectionImpl voicechatConnectionImpl2 = new VoicechatConnectionImpl(class047703, playerState2);
        if (soundPacket instanceof LocationSoundPacket) {
            LocationSoundPacket locationSoundPacket = (LocationSoundPacket)soundPacket;
            return this.dispatchEvent(LocationalSoundPacketEvent.class, new LocationalSoundPacketEventImpl((LocationalSoundPacket)new LocationalSoundPacketImpl(locationSoundPacket), voicechatConnectionImpl, voicechatConnectionImpl2, string));
        }
        if (soundPacket instanceof PlayerSoundPacket) {
            PlayerSoundPacket playerSoundPacket = (PlayerSoundPacket)soundPacket;
            return this.dispatchEvent(EntitySoundPacketEvent.class, new EntitySoundPacketEventImpl((EntitySoundPacket)new EntitySoundPacketImpl(playerSoundPacket), voicechatConnectionImpl, voicechatConnectionImpl2, string));
        }
        if (soundPacket instanceof GroupSoundPacket) {
            GroupSoundPacket groupSoundPacket = (GroupSoundPacket)soundPacket;
            return this.dispatchEvent(StaticSoundPacketEvent.class, new StaticSoundPacketEventImpl((StaticSoundPacket)new StaticSoundPacketImpl(groupSoundPacket), (VoicechatConnection)voicechatConnectionImpl, (VoicechatConnection)voicechatConnectionImpl2, string));
        }
        return false;
    }
}

