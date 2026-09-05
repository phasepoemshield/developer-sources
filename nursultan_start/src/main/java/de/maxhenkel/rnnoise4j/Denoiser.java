/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.rnnoise4j;

import de.maxhenkel.rnnoise4j.NativeInitializer;
import de.maxhenkel.rnnoise4j.UnknownPlatformException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Denoiser
implements AutoCloseable {
    public static final String WEIGHTS_PATH = "/rnnoise/weights_blob.bin";
    private static IOException loadError;
    private static byte[] weights;
    private long pointer;

    private native short[] denoise0(long var1, short[] var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Denoiser() throws IOException, UnknownPlatformException {
        Class<Denoiser> clazz = Denoiser.class;
        synchronized (Denoiser.class) {
            if (loadError != null) {
                throw new IOException(loadError.getMessage());
            }
            NativeInitializer.load("librnnoise4j");
            if (weights == null) {
                try (InputStream inputStream = Denoiser.class.getResourceAsStream(WEIGHTS_PATH);){
                    if (inputStream == null) {
                        throw new IOException("Could not find weights");
                    }
                    weights = Denoiser.readAllBytes(inputStream);
                }
                catch (IOException iOException) {
                    loadError = iOException;
                    throw iOException;
                }
            }
            this.pointer = Denoiser.createDenoiser0(weights);
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            this.destroyDenoiser0(this.pointer);
            this.pointer = 0L;
        }
    }

    private static byte[] readAllBytes(InputStream inputStream) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[8192];
        while ((n = inputStream.read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static native int getFrameSize0();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getFrameSize() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return Denoiser.getFrameSize0();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float denoiseInPlace(short[] sArray) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.denoiseInPlace0(this.pointer, sArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public short[] denoise(short[] sArray) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.denoise0(this.pointer, sArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.pointer == 0L;
        }
    }

    private native float denoiseInPlace0(long var1, short[] var3);

    private static native long createDenoiser0(byte[] var0);

    private native void destroyDenoiser0(long var1);

    private native float getSpeechProbability0(long var1, short[] var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float getSpeechProbability(short[] sArray) {
        Denoiser denoiser = this;
        synchronized (denoiser) {
            return this.getSpeechProbability0(this.pointer, sArray);
        }
    }
}

