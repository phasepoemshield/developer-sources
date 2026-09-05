/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.ALSpeakerBase;
import java.util.UUID;
import javax.annotation.Nullable;

public class ALSpeaker
extends ALSpeakerBase {
    @Override
    protected int getFormat() {
        return 4353;
    }

    public ALSpeaker(SoundManager soundManager, int n, int n2, @Nullable UUID uUID) {
        super(soundManager, n, n2, uUID);
    }
}

