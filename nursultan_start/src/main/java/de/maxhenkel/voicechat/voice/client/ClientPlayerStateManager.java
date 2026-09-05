/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent
 *  de.maxhenkel.voicechat.api.events.Event
 *  de.maxhenkel.voicechat.api.events.MicrophoneMuteEvent
 *  de.maxhenkel.voicechat.api.events.VoicechatDisableEvent
 *  de.maxhenkel.voicechat.gui.CreateGroupScreen
 *  de.maxhenkel.voicechat.gui.EnterPasswordScreen
 *  de.maxhenkel.voicechat.gui.group.GroupList
 *  de.maxhenkel.voicechat.gui.group.GroupScreen
 *  de.maxhenkel.voicechat.gui.group.JoinGroupList
 *  de.maxhenkel.voicechat.gui.group.JoinGroupScreen
 *  de.maxhenkel.voicechat.gui.onboarding.OnboardingManager
 *  de.maxhenkel.voicechat.gui.volume.AdjustVolumeList
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.net.Channel
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.net.UpdateStatePacket
 *  de.maxhenkel.voicechat.plugins.PluginManager
 *  de.maxhenkel.voicechat.plugins.impl.events.ClientVoicechatConnectionEventImpl
 *  de.maxhenkel.voicechat.plugins.impl.events.MicrophoneMuteEventImpl
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08036
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent;
import de.maxhenkel.voicechat.api.events.Event;
import de.maxhenkel.voicechat.api.events.MicrophoneMuteEvent;
import de.maxhenkel.voicechat.api.events.VoicechatDisableEvent;
import de.maxhenkel.voicechat.gui.CreateGroupScreen;
import de.maxhenkel.voicechat.gui.EnterPasswordScreen;
import de.maxhenkel.voicechat.gui.group.GroupList;
import de.maxhenkel.voicechat.gui.group.GroupScreen;
import de.maxhenkel.voicechat.gui.group.JoinGroupList;
import de.maxhenkel.voicechat.gui.group.JoinGroupScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeList;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.UpdateStatePacket;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.plugins.impl.events.ClientVoicechatConnectionEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.MicrophoneMuteEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.VoicechatDisableEventImpl;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class08036;

public class ClientPlayerStateManager {
    private boolean disconnected = true;
    @Nullable
    private UUID group = null;
    private Map<UUID, PlayerState> states = new HashMap<UUID, PlayerState>();

    public ClientPlayerStateManager() {
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().playerStateChannel, (class044532, playerStatePacket) -> {
            ClientVoicechat clientVoicechat;
            this.states.put(playerStatePacket.getPlayerState().getUuid(), playerStatePacket.getPlayerState());
            Voicechat.LOGGER.debug("Got state for {}: {}", new Object[]{playerStatePacket.getPlayerState().getName(), playerStatePacket.getPlayerState()});
            VoicechatClient.USERNAME_CACHE.updateUsernameAndSave(playerStatePacket.getPlayerState().getUuid(), playerStatePacket.getPlayerState().getName());
            if (playerStatePacket.getPlayerState().isDisconnected() && (clientVoicechat = ClientManager.getClient()) != null) {
                clientVoicechat.closeAudioChannel(playerStatePacket.getPlayerState().getUuid());
            }
            AdjustVolumeList.update();
            JoinGroupList.update();
            GroupList.update();
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().playerStatesChannel, (class044532, playerStatesPacket) -> {
            this.states = playerStatesPacket.getPlayerStates().stream().collect(Collectors.toMap(PlayerState::getUuid, playerState -> playerState));
            Voicechat.LOGGER.debug("Received {} state(s)", new Object[]{this.states.size()});
            for (PlayerState playerState2 : this.states.values()) {
                VoicechatClient.USERNAME_CACHE.updateUsername(playerState2.getUuid(), playerState2.getName());
            }
            VoicechatClient.USERNAME_CACHE.save();
            AdjustVolumeList.update();
            JoinGroupList.update();
            GroupList.update();
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().removePlayerStateChannel, (class044532, removePlayerStatePacket) -> {
            this.states.remove(removePlayerStatePacket.getId());
            Voicechat.LOGGER.debug("Removed state {}", new Object[]{removePlayerStatePacket.getId()});
            AdjustVolumeList.update();
            JoinGroupList.update();
            GroupList.update();
        });
        ClientServerNetManager.setClientListener((Channel)CommonCompatibilityManager.INSTANCE.getNetManager().joinedGroupChannel, (class044532, joinedGroupPacket) -> {
            class05096 class050962 = (class05096)class06202.Nq().v_3;
            this.group = joinedGroupPacket.getGroup();
            if (joinedGroupPacket.isWrongPassword()) {
                if (class050962 instanceof JoinGroupScreen || class050962 instanceof CreateGroupScreen || class050962 instanceof EnterPasswordScreen) {
                    class06202.Nq().N(null);
                }
                class044532.method_7353((class00392)class00392.L((String)"message.voicechat.wrong_password").N(class06541.field_1079), true);
            } else if (this.group != null && class050962 instanceof JoinGroupScreen || class050962 instanceof CreateGroupScreen || class050962 instanceof EnterPasswordScreen) {
                ClientGroup clientGroup = this.getGroup();
                if (clientGroup != null) {
                    class06202.Nq().N((class05096)new GroupScreen(clientGroup));
                } else {
                    Voicechat.LOGGER.warn("Received join group packet without group being present", new Object[0]);
                }
            }
            GroupList.update();
        });
        ClientCompatibilityManager.INSTANCE.onVoiceChatConnected(this::onVoiceChatConnected);
        ClientCompatibilityManager.INSTANCE.onVoiceChatDisconnected(this::onVoiceChatDisconnected);
        ClientCompatibilityManager.INSTANCE.onDisconnect(this::onDisconnect);
    }

    @Nullable
    public PlayerState getState(UUID uUID) {
        return this.states.get(uUID);
    }

    public boolean isPlayerDisabled(UUID uUID) {
        PlayerState playerState = this.states.get(uUID);
        if (playerState == null) {
            return false;
        }
        return playerState.isDisabled();
    }

    private void resetOwnState() {
        this.disconnected = true;
        this.group = null;
    }

    public void syncOwnState() {
        ClientServerNetManager.sendToServer((Packet)new UpdateStatePacket(this.isDisabled()));
        Voicechat.LOGGER.debug("Sent own state to server: disabled={}", new Object[]{this.isDisabled()});
    }

    public void clearStates() {
        this.states.clear();
    }

    public void onFinishOnboarding() {
        this.syncOwnState();
    }

    private void onDisconnect() {
        this.clearStates();
        this.resetOwnState();
    }

    public UUID getOwnID() {
        ClientVoicechatConnection clientVoicechatConnection;
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat != null && (clientVoicechatConnection = clientVoicechat.getConnection()) != null) {
            return clientVoicechatConnection.getData().getPlayerUUID();
        }
        return class06202.Nq().Ny().y();
    }

    public boolean isDisabled() {
        if (!this.canEnable()) {
            return true;
        }
        return (Boolean)VoicechatClient.CLIENT_CONFIG.disabled.get();
    }

    @Nullable
    public ClientGroup getGroup() {
        if (this.group == null) {
            return null;
        }
        return ClientManager.getGroupManager().getGroup(this.group);
    }

    @Nullable
    public UUID getGroup(UUID uUID) {
        PlayerState playerState = this.states.get(uUID);
        if (playerState == null) {
            return null;
        }
        return playerState.getGroup();
    }

    public boolean isInGroup(class08036 class080362) {
        PlayerState playerState = this.states.get(class080362.method_5667());
        if (playerState == null) {
            return false;
        }
        return playerState.hasGroup();
    }

    public void onVoiceChatConnected(ClientVoicechatConnection clientVoicechatConnection) {
        this.disconnected = false;
        this.syncOwnState();
        PluginManager.instance().dispatchEvent(ClientVoicechatConnectionEvent.class, (Event)new ClientVoicechatConnectionEventImpl(true));
    }

    public void onVoiceChatDisconnected() {
        this.disconnected = true;
        this.syncOwnState();
        PluginManager.instance().dispatchEvent(ClientVoicechatConnectionEvent.class, (Event)new ClientVoicechatConnectionEventImpl(false));
    }

    public boolean isPlayerDisconnected(UUID uUID) {
        PlayerState playerState = this.states.get(uUID);
        if (playerState == null) {
            return (Boolean)VoicechatClient.CLIENT_CONFIG.showFakePlayersDisconnected.get();
        }
        return playerState.isDisconnected();
    }

    public boolean canEnable() {
        if (OnboardingManager.isOnboarding()) {
            return false;
        }
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return false;
        }
        return clientVoicechat.getSoundManager() != null;
    }

    public void setMuted(boolean bl) {
        VoicechatClient.CLIENT_CONFIG.muted.set((Object)bl).save();
        PluginManager.instance().dispatchEvent(MicrophoneMuteEvent.class, (Event)new MicrophoneMuteEventImpl(bl));
    }

    public boolean isMuted() {
        return (Boolean)VoicechatClient.CLIENT_CONFIG.muted.get();
    }

    public void setDisabled(boolean bl) {
        VoicechatClient.CLIENT_CONFIG.disabled.set((Object)bl).save();
        this.syncOwnState();
        PluginManager.instance().dispatchEvent(VoicechatDisableEvent.class, (Event)new VoicechatDisableEventImpl(bl));
    }

    public boolean isDisconnected() {
        return this.disconnected;
    }

    public List<PlayerState> getPlayerStates(boolean bl) {
        if (bl) {
            return new ArrayList<PlayerState>(this.states.values());
        }
        return this.states.values().stream().filter(playerState -> !playerState.getUuid().equals(this.getOwnID())).collect(Collectors.toList());
    }

    @Nullable
    public UUID getGroupID() {
        return this.group;
    }
}

