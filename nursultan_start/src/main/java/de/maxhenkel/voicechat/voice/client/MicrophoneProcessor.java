/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.natives.Agc
 *  de.maxhenkel.voicechat.natives.Denoiser
 *  de.maxhenkel.voicechat.natives.RNNoiseManager
 *  de.maxhenkel.voicechat.natives.SpeexManager
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.natives.Agc;
import de.maxhenkel.voicechat.natives.Denoiser;
import de.maxhenkel.voicechat.natives.RNNoiseManager;
import de.maxhenkel.voicechat.natives.SpeexManager;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.client.MicrophoneProcessor$MicActivator;
import de.maxhenkel.voicechat.voice.client.VolumeManager;
import javax.annotation.Nullable;

public abstract class MicrophoneProcessor {
    public static final float AGC_PROBABILITY = 0.95f;
    private final MicrophoneProcessor$MicActivator micActivator = new MicrophoneProcessor$MicActivator(this::getDeactivationDelay);
    private final MicrophoneProcessor$MicActivator whisperMicActivator = new MicrophoneProcessor$MicActivator(() -> ((ConfigEntry)VoicechatClient.CLIENT_CONFIG.pttDeactivationDelay).get());
    private final VolumeManager volumeManager = new VolumeManager();
    private boolean whispering;
    private boolean activating;
    protected float speechProbability;
    @Nullable
    private Denoiser denoiser = RNNoiseManager.createDenoiser();
    @Nullable
    private Agc agc;

    public MicrophoneProcessor() {
        if (this.denoiser == null) {
            Voicechat.LOGGER.warn("Denoiser not available", new Object[0]);
        }
        this.agc = SpeexManager.createAgc();
        if (this.agc == null) {
            Voicechat.LOGGER.warn("AGC not available", new Object[0]);
        }
    }

    public void reset() {
        this.micActivator.reset();
        this.whisperMicActivator.reset();
        this.whispering = false;
        this.activating = false;
    }

    public void close() {
        if (this.denoiser != null) {
            this.denoiser.close();
        }
        if (this.agc != null) {
            this.agc.close();
        }
    }

    public void process(short[] sArray, boolean bl) {
        boolean bl2 = this.isWhisperButtonDown();
        this.preprocess(sArray);
        boolean bl3 = this.processInternal(sArray, bl);
        this.activating = this.micActivator.shouldStillSend(bl3);
        if (bl3) {
            this.whispering = bl2;
            this.whisperMicActivator.reset();
        } else {
            this.whispering = !this.isMuted() && this.whisperMicActivator.shouldStillSend(bl2);
        }
    }

    public abstract int getDeactivationDelay();

    public boolean isWhisperButtonDown() {
        return ClientManager.getPttKeyHandler().isWhisperDown();
    }

    public boolean isAnyTalkButtonDown() {
        return ClientManager.getPttKeyHandler().isAnyDown();
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    public abstract MicrophoneActivationType getActivationType();

    public float getSpeechProbability() {
        return this.speechProbability;
    }

    public boolean isMuted() {
        return ClientManager.getPlayerStateManager().isMuted();
    }

    protected abstract boolean processInternal(short[] var1, boolean var2);

    @Nullable
    protected Denoiser getDenoiser() {
        if (this.denoiser != null && this.denoiser.isClosed()) {
            this.denoiser = RNNoiseManager.createDenoiser();
        }
        return this.denoiser;
    }

    public boolean agcAvailable() {
        return this.agc != null;
    }

    public boolean useDenoiser() {
        return (Boolean)VoicechatClient.CLIENT_CONFIG.denoiser.get();
    }

    public boolean isPttButtonDown() {
        return ClientManager.getPttKeyHandler().isPTTDown();
    }

    protected abstract boolean shouldAdjustGain();

    public boolean denoiserAvailable() {
        return this.denoiser != null;
    }

    public boolean useAgc() {
        return (Boolean)VoicechatClient.CLIENT_CONFIG.agc.get();
    }

    @Nullable
    protected Agc getAgc() {
        if (this.agc != null && this.agc.isClosed()) {
            this.agc = SpeexManager.createAgc();
        }
        return this.agc;
    }

    protected void preprocess(short[] sArray) {
        Denoiser denoiser = this.getDenoiser();
        this.speechProbability = denoiser != null ? (this.useDenoiser() ? denoiser.denoiseInPlace(sArray) : denoiser.getSpeechProbability(sArray)) : 1.0f;
        Agc agc = this.getAgc();
        if (this.useAgc() && agc != null) {
            if (this.speechProbability >= 0.95f && this.shouldAdjustGain()) {
                agc.setIncrement(12);
            } else {
                agc.setIncrement(0);
            }
            agc.agc(sArray);
        } else {
            this.volumeManager.adjustVolume(sArray, (Double)VoicechatClient.CLIENT_CONFIG.microphoneGain.get());
        }
    }

    public boolean shouldTransmitAudio() {
        return this.activating || this.whispering;
    }
}

