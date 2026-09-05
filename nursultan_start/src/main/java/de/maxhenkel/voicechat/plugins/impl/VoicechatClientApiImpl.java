/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.Entity
 *  de.maxhenkel.voicechat.api.Group
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.VoicechatClientApi
 *  de.maxhenkel.voicechat.api.VolumeCategory
 *  de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel
 *  de.maxhenkel.voicechat.api.config.ConfigAccessor
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  de.maxhenkel.voicechat.voice.client.ClientUtils
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.MicThread
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.VoicechatClientApi;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel;
import de.maxhenkel.voicechat.api.config.ConfigAccessor;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.plugins.impl.ClientGroupImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatApiImpl;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientEntityAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientLocationalAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientStaticAudioChannelImpl;
import de.maxhenkel.voicechat.plugins.impl.config.ConfigAccessorImpl;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientUtils;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.MicThread;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.UUID;
import javax.annotation.Nullable;

public class VoicechatClientApiImpl
extends VoicechatApiImpl
implements VoicechatClientApi {
    @Deprecated
    public static final VoicechatClientApiImpl INSTANCE = new VoicechatClientApiImpl();

    private VoicechatClientApiImpl() {
    }

    public static VoicechatClientApi instance() {
        return ClientCompatibilityManager.INSTANCE.getClientApi();
    }

    public boolean isWhispering(@Nullable UUID uUID) {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return false;
        }
        if (uUID == null) {
            MicThread micThread = clientVoicechat.getMicThread();
            if (micThread == null) {
                return false;
            }
            return micThread.isWhispering();
        }
        clientVoicechat.getTalkCache().isWhispering(uUID);
        return false;
    }

    public boolean isTalking(@Nullable UUID uUID) {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return false;
        }
        if (uUID == null) {
            MicThread micThread = clientVoicechat.getMicThread();
            if (micThread == null) {
                return false;
            }
            return micThread.isTalking();
        }
        clientVoicechat.getTalkCache().isTalking(uUID);
        return false;
    }

    public boolean isDisabled(@Nullable UUID uUID) {
        if (uUID == null) {
            return ClientManager.getPlayerStateManager().isDisabled();
        }
        return ClientManager.getPlayerStateManager().isPlayerDisabled(uUID);
    }

    @Nullable
    public Group getGroup() {
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        if (clientPlayerStateManager.getGroupID() == null) {
            return null;
        }
        ClientGroup clientGroup = clientPlayerStateManager.getGroup();
        if (clientGroup == null) {
            return null;
        }
        return new ClientGroupImpl(clientGroup);
    }

    @Override
    public double getVoiceChatDistance() {
        return ClientUtils.getDefaultDistanceClient();
    }

    public boolean isMuted() {
        return ClientManager.getPlayerStateManager().isMuted();
    }

    public boolean isDisconnected(@Nullable UUID uUID) {
        if (uUID == null) {
            return ClientManager.getPlayerStateManager().isDisconnected();
        }
        return ClientManager.getPlayerStateManager().isPlayerDisconnected(uUID);
    }

    public ConfigAccessor getClientConfig() {
        return new ConfigAccessorImpl(VoicechatClient.CLIENT_CONFIG.disabled.getConfig());
    }

    public void registerClientVolumeCategory(VolumeCategory volumeCategory) {
        if (!(volumeCategory instanceof VolumeCategoryImpl)) {
            throw new IllegalArgumentException("VolumeCategory is not an instance of VolumeCategoryImpl");
        }
        VolumeCategoryImpl volumeCategoryImpl = (VolumeCategoryImpl)volumeCategory;
        ClientManager.getCategoryManager().addCategory(volumeCategoryImpl);
    }

    public void unregisterClientVolumeCategory(String string) {
        ClientManager.getCategoryManager().removeCategory(string);
    }

    public ClientLocationalAudioChannel createLocationalAudioChannel(UUID uUID, Position position) {
        return new ClientLocationalAudioChannelImpl(uUID, position);
    }

    public ClientEntityAudioChannel createEntityAudioChannel(UUID uUID) {
        return new ClientEntityAudioChannelImpl(uUID, uUID);
    }

    public ClientEntityAudioChannel createEntityAudioChannel(UUID uUID, Entity entity) {
        return new ClientEntityAudioChannelImpl(uUID, entity.getUuid());
    }

    public boolean isWhisperKeyPressed() {
        return ClientManager.getPttKeyHandler().isWhisperDown();
    }

    public ClientStaticAudioChannel createStaticAudioChannel(UUID uUID) {
        return new ClientStaticAudioChannelImpl(uUID);
    }

    public boolean isPushToTalkKeyPressed() {
        return ClientManager.getPttKeyHandler().isPTTDown();
    }
}

