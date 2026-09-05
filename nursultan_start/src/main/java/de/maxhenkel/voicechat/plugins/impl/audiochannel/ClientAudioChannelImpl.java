/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.audiochannel.ClientAudioChannel;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ClientAudioChannelImpl
implements ClientAudioChannel {
    protected UUID id;
    @Nullable
    protected String category;

    public void setCategory(@Nullable String string) {
        this.category = string;
    }

    @Nullable
    public String getCategory() {
        return this.category;
    }

    public ClientAudioChannelImpl(UUID uUID) {
        this.id = uUID;
    }

    public UUID getId() {
        return this.id;
    }

    protected abstract SoundPacket<?> createSoundPacket(short[] var1);

    public void play(short[] sArray) {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat != null) {
            clientVoicechat.processSoundPacket(this.createSoundPacket(sArray));
        }
    }
}

