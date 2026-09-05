/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel
 *  de.maxhenkel.voicechat.voice.common.GroupSoundPacket
 *  de.maxhenkel.voicechat.voice.common.SoundPacket
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.audiochannel.ClientStaticAudioChannel;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.ClientAudioChannelImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.UUID;

public class ClientStaticAudioChannelImpl
extends ClientAudioChannelImpl
implements ClientStaticAudioChannel {
    public ClientStaticAudioChannelImpl(UUID uUID) {
        super(uUID);
    }

    @Override
    protected SoundPacket<?> createSoundPacket(short[] sArray) {
        return new GroupSoundPacket(this.id, this.id, sArray, this.category);
    }
}

