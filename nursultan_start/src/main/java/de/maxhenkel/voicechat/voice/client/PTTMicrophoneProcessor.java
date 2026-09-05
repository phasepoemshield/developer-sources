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

public class PTTMicrophoneProcessor
extends MicrophoneProcessor {
    private boolean transmitting;

    @Override
    public int getDeactivationDelay() {
        return (Integer)VoicechatClient.CLIENT_CONFIG.pttDeactivationDelay.get();
    }

    @Override
    public MicrophoneActivationType getActivationType() {
        return MicrophoneActivationType.PTT;
    }

    @Override
    protected boolean processInternal(short[] sArray, boolean bl) {
        this.transmitting = this.isPttButtonDown() || bl;
        return this.transmitting;
    }

    @Override
    protected boolean shouldAdjustGain() {
        return this.transmitting;
    }
}

