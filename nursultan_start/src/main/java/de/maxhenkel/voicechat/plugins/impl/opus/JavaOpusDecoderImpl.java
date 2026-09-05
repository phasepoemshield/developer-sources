/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  de.maxhenkel.voicechat.concentus.OpusDecoder
 *  de.maxhenkel.voicechat.concentus.OpusException
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.concentus.OpusException;
import javax.annotation.Nullable;

public class JavaOpusDecoderImpl
implements OpusDecoder {
    protected de.maxhenkel.voicechat.concentus.OpusDecoder opusDecoder;
    protected short[] buffer;
    protected int sampleRate;

    public JavaOpusDecoderImpl(int n, int n2) {
        this.sampleRate = n;
        this.buffer = new short[n2];
        this.open();
    }

    public short[][] decode(byte[] byArray, int n) {
        if (this.isClosed()) {
            throw new IllegalStateException("Decoder is closed");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Frames must be greater than 0");
        }
        if (byArray == null || byArray.length == 0) {
            throw new IllegalArgumentException("Data must not be null or empty");
        }
        short[][] sArrayArray = new short[n][];
        try {
            int n2;
            if (n > 2) {
                for (int i = 0; i < n - 2; ++i) {
                    n2 = this.opusDecoder.decode(null, 0, 0, this.buffer, 0, this.buffer.length, true);
                    short[] sArray = new short[n2];
                    System.arraycopy(this.buffer, 0, sArray, 0, n2);
                    sArrayArray[i] = sArray;
                }
            }
            if (n > 1) {
                n2 = this.opusDecoder.decode(byArray, 0, byArray.length, this.buffer, 0, this.buffer.length, true);
                short[] sArray = new short[n2];
                System.arraycopy(this.buffer, 0, sArray, 0, n2);
                sArrayArray[n - 2] = sArray;
            }
            n2 = this.opusDecoder.decode(byArray, 0, byArray.length, this.buffer, 0, this.buffer.length, false);
            short[] sArray = new short[n2];
            System.arraycopy(this.buffer, 0, sArray, 0, n2);
            sArrayArray[n - 1] = sArray;
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to decode audio", exception);
        }
        return sArrayArray;
    }

    public short[] decode(@Nullable byte[] byArray) {
        int n;
        if (this.isClosed()) {
            throw new IllegalStateException("Decoder is closed");
        }
        try {
            n = byArray == null || byArray.length == 0 ? this.opusDecoder.decode(null, 0, 0, this.buffer, 0, this.buffer.length, true) : this.opusDecoder.decode(byArray, 0, byArray.length, this.buffer, 0, this.buffer.length, false);
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to decode audio", exception);
        }
        short[] sArray = new short[n];
        System.arraycopy(this.buffer, 0, sArray, 0, n);
        return sArray;
    }

    public void close() {
        if (this.isClosed()) {
            return;
        }
        this.opusDecoder = null;
    }

    private void open() {
        if (this.opusDecoder != null) {
            return;
        }
        try {
            this.opusDecoder = new de.maxhenkel.voicechat.concentus.OpusDecoder(this.sampleRate, 1);
        }
        catch (OpusException opusException) {
            throw new IllegalStateException("Failed to create Opus decoder", opusException);
        }
        Voicechat.LOGGER.debug("Initializing Java Opus decoder with sample rate {} Hz, frame size {} bytes", new Object[]{this.sampleRate, this.buffer.length});
    }

    public void resetState() {
        if (this.isClosed()) {
            throw new IllegalStateException("Decoder is closed");
        }
        this.opusDecoder.resetState();
    }

    public boolean isClosed() {
        return this.opusDecoder == null;
    }
}

