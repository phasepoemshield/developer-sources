/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.config.ConfigAccessor
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.audiochannel.ClientEntityAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.ClientLocationalAudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel;
import de.maxhenkel.voicechat.api.config.ConfigAccessor;
import java.util.UUID;
import javax.annotation.Nullable;

public interface VoicechatClientApi
extends VoicechatApi {
    default public boolean isWhispering() {
        return this.isWhispering(null);
    }

    public boolean isWhispering(@Nullable UUID var1);

    public boolean isTalking(@Nullable UUID var1);

    default public boolean isTalking() {
        return this.isTalking(null);
    }

    public boolean isDisabled(@Nullable UUID var1);

    default public boolean isDisabled() {
        return this.isDisabled(null);
    }

    @Nullable
    public Group getGroup();

    public boolean isMuted();

    default public boolean isDisconnected() {
        return this.isDisconnected(null);
    }

    public boolean isDisconnected(@Nullable UUID var1);

    public ConfigAccessor getClientConfig();

    public void registerClientVolumeCategory(VolumeCategory var1);

    public void unregisterClientVolumeCategory(String var1);

    default public void unregisterClientVolumeCategory(VolumeCategory volumeCategory) {
        this.unregisterClientVolumeCategory(volumeCategory.getId());
    }

    public ClientLocationalAudioChannel createLocationalAudioChannel(UUID var1, Position var2);

    public ClientEntityAudioChannel createEntityAudioChannel(UUID var1, Entity var2);

    @Deprecated
    public ClientEntityAudioChannel createEntityAudioChannel(UUID var1);

    public boolean isWhisperKeyPressed();

    public ClientStaticAudioChannel createStaticAudioChannel(UUID var1);

    public boolean isPushToTalkKeyPressed();
}

