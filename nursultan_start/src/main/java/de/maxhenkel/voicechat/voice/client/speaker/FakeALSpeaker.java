/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class06889
 *  org.lwjgl.openal.AL11
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.voice.client.PositionalAudioUtils;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.ALSpeakerBase;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class06889;
import org.lwjgl.openal.AL11;

public class FakeALSpeaker
extends ALSpeakerBase {
    @Override
    protected int getFormat() {
        return 4355;
    }

    public FakeALSpeaker(SoundManager soundManager, int n, int n2, @Nullable UUID uUID) {
        super(soundManager, n, n2, uUID);
        this.bufferSize *= 2;
    }

    @Override
    protected short[] convert(short[] sArray, @Nullable class06889 class068892) {
        return PositionalAudioUtils.convertToStereo(sArray, class068892);
    }

    @Override
    protected int getBufferSize() {
        return Math.min(super.getBufferSize(), 3);
    }

    @Override
    protected void setPositionSync(@Nullable class06889 class068892, float f) {
    }

    @Override
    protected void linearAttenuation(float f) {
    }

    @Override
    protected float getVolume(float f, @Nullable class06889 class068892, float f2) {
        if (class068892 == null) {
            return super.getVolume(f, class068892, f2);
        }
        return super.getVolume(f, class068892, f2) * PositionalAudioUtils.getDistanceVolume(f2, class068892);
    }

    @Override
    protected void openSync() {
        super.openSync();
        AL11.alDistanceModel((int)0);
        SoundManager.checkAlError();
    }
}

