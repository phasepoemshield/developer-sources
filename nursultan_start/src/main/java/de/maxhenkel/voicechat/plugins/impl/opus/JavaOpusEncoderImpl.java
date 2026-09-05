/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder$Application
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.concentus.OpusApplication
 *  de.maxhenkel.voicechat.concentus.OpusEncoder
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.OpusEncoder;
import de.maxhenkel.voicechat.concentus.OpusApplication;
import de.maxhenkel.voicechat.concentus.OpusEncoder;

public class JavaOpusEncoderImpl
implements de.maxhenkel.voicechat.api.opus.OpusEncoder {
    protected OpusEncoder opusEncoder;
    protected byte[] buffer;
    protected int sampleRate;
    protected int frameSize;
    protected OpusEncoder.Application application;

    public JavaOpusEncoderImpl(int n, int n2, int n3, OpusEncoder.Application application) {
        this.sampleRate = n;
        this.frameSize = n2;
        this.application = application;
        this.buffer = new byte[n3];
        this.open();
    }

    public byte[] encode(short[] sArray) {
        int n;
        if (this.isClosed()) {
            throw new IllegalStateException("Encoder is closed");
        }
        try {
            n = this.opusEncoder.encode(sArray, 0, this.frameSize, this.buffer, 0, this.buffer.length);
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to encode audio", exception);
        }
        if (n < 0) {
            throw new RuntimeException("Failed to encode audio data");
        }
        byte[] byArray = new byte[n];
        System.arraycopy(this.buffer, 0, byArray, 0, n);
        return byArray;
    }

    public void close() {
        if (this.isClosed()) {
            return;
        }
        this.opusEncoder = null;
    }

    private void open() {
        if (this.opusEncoder != null) {
            return;
        }
        try {
            this.opusEncoder = new OpusEncoder(this.sampleRate, 1, JavaOpusEncoderImpl.getApplication(this.application));
            this.opusEncoder.setUseInbandFEC(true);
            this.opusEncoder.setPacketLossPercent(5);
        }
        catch (Exception exception) {
            throw new IllegalStateException("Failed to create Opus encoder", exception);
        }
    }

    public void resetState() {
        if (this.isClosed()) {
            throw new IllegalStateException("Encoder is closed");
        }
        this.opusEncoder.resetState();
    }

    public boolean isClosed() {
        return this.opusEncoder == null;
    }

    public static OpusApplication getApplication(OpusEncoder.Application application) {
        switch (application) {
            default: {
                return OpusApplication.OPUS_APPLICATION_VOIP;
            }
            case AUDIO: {
                return OpusApplication.OPUS_APPLICATION_AUDIO;
            }
            case LOW_DELAY: 
        }
        return OpusApplication.OPUS_APPLICATION_RESTRICTED_LOWDELAY;
    }
}

