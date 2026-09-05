/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.lame4j;

import de.maxhenkel.lame4j.NativeInitializer;
import de.maxhenkel.lame4j.UnknownPlatformException;
import java.io.IOException;
import java.io.OutputStream;

public class Mp3Encoder
implements AutoCloseable {
    private long pointer;
    private final OutputStream outputStream;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Mp3Encoder(int n, int n2, int n3, int n4, OutputStream outputStream) throws IOException, UnknownPlatformException {
        Class<Mp3Encoder> clazz = Mp3Encoder.class;
        synchronized (Mp3Encoder.class) {
            NativeInitializer.load("liblame4j");
            this.pointer = Mp3Encoder.createEncoder0(n, n2, n3, n4);
            this.outputStream = outputStream;
            // ** MonitorExit[var6_6] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(short[] sArray) throws IOException {
        Mp3Encoder mp3Encoder = this;
        synchronized (mp3Encoder) {
            byte[] byArray = this.writeInternal0(this.pointer, sArray);
            this.outputStream.write(byArray, 0, byArray.length);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() throws IOException {
        Mp3Encoder mp3Encoder = this;
        synchronized (mp3Encoder) {
            byte[] byArray = this.flush0(this.pointer);
            this.outputStream.write(byArray, 0, byArray.length);
            this.destroyEncoder0(this.pointer);
            this.pointer = 0L;
            this.outputStream.close();
        }
    }

    private native byte[] writeInternal0(long var1, short[] var3) throws IOException;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        Mp3Encoder mp3Encoder = this;
        synchronized (mp3Encoder) {
            return this.pointer == 0L;
        }
    }

    private native byte[] flush0(long var1) throws IOException;

    private native void destroyEncoder0(long var1);

    private static native long createEncoder0(int var0, int var1, int var2, int var3) throws IOException;
}

