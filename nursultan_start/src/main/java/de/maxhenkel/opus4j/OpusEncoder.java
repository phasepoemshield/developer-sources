/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.opus4j;

import de.maxhenkel.opus4j.NativeInitializer;
import de.maxhenkel.opus4j.OpusEncoder$Application;
import de.maxhenkel.opus4j.UnknownPlatformException;
import java.io.IOException;

public class OpusEncoder
implements AutoCloseable {
    private long encoder;

    public OpusEncoder(int n, int n2, OpusEncoder$Application opusEncoder$Application) throws IOException, UnknownPlatformException {
        NativeInitializer.load("libopus4j");
        this.encoder = OpusEncoder.createEncoder0(n, n2, opusEncoder$Application);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return String.format("OpusEncoder[%d]", this.encoder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public byte[] encode(short[] sArray) {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return this.encode0(this.encoder, sArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            this.destroyEncoder0(this.encoder);
            this.encoder = 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void resetState() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            this.resetState0(this.encoder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setMaxPayloadSize(int n) {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            this.setMaxPayloadSize0(this.encoder, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getMaxPayloadSize() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return this.getMaxPayloadSize0(this.encoder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return this.encoder == 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float getMaxPacketLossPercentage() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return this.getMaxPacketLossPercentage0(this.encoder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setMaxPacketLossPercentage(float f) {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            this.setMaxPacketLossPercentage0(this.encoder, f);
        }
    }

    private native byte[] encode0(long var1, short[] var3);

    private native void setMaxPacketLossPercentage0(long var1, float var3);

    private native float getMaxPacketLossPercentage0(long var1);

    private native void setMaxPayloadSize0(long var1, int var3);

    private static native String getOpusVersion0();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String getOpusVersion() {
        OpusEncoder opusEncoder = this;
        synchronized (opusEncoder) {
            return OpusEncoder.getOpusVersion0();
        }
    }

    private native void destroyEncoder0(long var1);

    private native void resetState0(long var1);

    private native int getMaxPayloadSize0(long var1);

    private static native long createEncoder0(int var0, int var1, OpusEncoder$Application var2) throws IOException;
}

