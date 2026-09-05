/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.client.MicrophoneProcessor;
import de.maxhenkel.voicechat.voice.common.AudioUtils;

public class VoiceMicrophoneProcessor
extends MicrophoneProcessor {
    public static final float ACTIVATION_PROBABILITY = 0.5f;
    private boolean testing;

    @Override
    public int getDeactivationDelay() {
        return (Integer)VoicechatClient.CLIENT_CONFIG.voiceDeactivationDelay.get();
    }

    @Override
    public MicrophoneActivationType getActivationType() {
        return MicrophoneActivationType.VOICE;
    }

    @Override
    protected boolean processInternal(short[] sArray, boolean bl) {
        this.testing = bl;
        if (this.isMuted() && !bl) {
            this.reset();
            return false;
        }
        if (this.denoiserAvailable() && ((Boolean)VoicechatClient.CLIENT_CONFIG.vad.get()).booleanValue()) {
            return this.speechProbability >= 0.5f;
        }
        return AudioUtils.isAboveThreshold(sArray, (Double)VoicechatClient.CLIENT_CONFIG.voiceActivationThreshold.get());
    }

    @Override
    protected boolean shouldAdjustGain() {
        return !this.isMuted() || this.testing;
    }
}

