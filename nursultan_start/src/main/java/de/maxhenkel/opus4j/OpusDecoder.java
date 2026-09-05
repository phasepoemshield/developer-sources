/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.opus4j;

import de.maxhenkel.opus4j.NativeInitializer;
import de.maxhenkel.opus4j.UnknownPlatformException;
import java.io.IOException;
import javax.annotation.Nullable;

public class OpusDecoder
implements AutoCloseable {
    private long decoder;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public OpusDecoder(int n, int n2) throws IOException, UnknownPlatformException {
        Class<OpusDecoder> clazz = OpusDecoder.class;
        synchronized (OpusDecoder.class) {
            NativeInitializer.load("libopus4j");
            this.decoder = OpusDecoder.createDecoder0(n, n2);
            // ** MonitorExit[var3_3] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return String.format("OpusDecoder[%d]", this.decoder);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    public short[] decode(@Nullable byte[] byArray, boolean bl) {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return this.decode0(this.decoder, byArray, bl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public short[][] decode(byte[] byArray, int n) {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return this.decodeRecover0(this.decoder, byArray, n);
        }
    }

    public short[] decode(@Nullable byte[] byArray) {
        return this.decode(byArray, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            this.destroyDecoder0(this.decoder);
            this.decoder = 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void resetState() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            this.resetState0(this.decoder);
        }
    }

    private native void setFrameSize0(long var1, int var3);

    private native int getFrameSize0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getFrameSize() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return this.getFrameSize0(this.decoder);
        }
    }

    private static native long createDecoder0(int var0, int var1) throws IOException;

    @Deprecated
    public short[] decodeFec() {
        return this.decode(null, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setFrameSize(int n) {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            this.setFrameSize0(this.decoder, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return this.decoder == 0L;
        }
    }

    private native void destroyDecoder0(long var1);

    private native short[][] decodeRecover0(long var1, byte[] var3, int var4);

    private native short[] decode0(long var1, @Nullable byte[] var3, boolean var4);

    private static native String getOpusVersion0();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String getOpusVersion() {
        OpusDecoder opusDecoder = this;
        synchronized (opusDecoder) {
            return OpusDecoder.getOpusVersion0();
        }
    }

    private native void resetState0(long var1);
}

