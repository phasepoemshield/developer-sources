/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.lame4j;

import de.maxhenkel.lame4j.Audio;
import de.maxhenkel.lame4j.DecodedAudio;
import de.maxhenkel.lame4j.NativeInitializer;
import de.maxhenkel.lame4j.ShortArrayBuffer;
import de.maxhenkel.lame4j.UnknownPlatformException;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;

public class Mp3Decoder
implements Audio,
AutoCloseable {
    private long pointer;
    private final InputStream inputStream;
    private final byte[] inBuffer;
    private final byte[] leftoverBuffer;
    private int leftoverBufferLength;
    private final short[] outBuffer;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Mp3Decoder(InputStream inputStream) throws IOException, UnknownPlatformException {
        Class<Mp3Decoder> clazz = Mp3Decoder.class;
        synchronized (Mp3Decoder.class) {
            NativeInitializer.load("liblame4j");
            this.pointer = Mp3Decoder.createDecoder0();
            this.inputStream = inputStream;
            this.inBuffer = new byte[16384];
            this.leftoverBuffer = new byte[16384];
            this.leftoverBufferLength = 0;
            this.outBuffer = new short[Mp3Decoder.getMaxSamplesPerFrame0()];
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    public static DecodedAudio decode(InputStream inputStream) throws IOException, UnknownPlatformException {
        try (Mp3Decoder mp3Decoder = new Mp3Decoder(inputStream);){
            Object object;
            ShortArrayBuffer shortArrayBuffer = new ShortArrayBuffer(2048);
            while (true) {
                if ((object = mp3Decoder.decodeNextFrame()) == null) {
                    if (shortArrayBuffer.size() > 0) break;
                    throw new IOException("No audio data found");
                }
                shortArrayBuffer.writeShorts((short[])object);
            }
            if (!mp3Decoder.headerParsed()) {
                throw new IOException("No header found");
            }
            object = new DecodedAudio(mp3Decoder.getChannelCount(), mp3Decoder.getSampleRate(), mp3Decoder.getBitRate(), shortArrayBuffer.toShortArray());
            return object;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() throws IOException {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            this.destroyDecoder0(this.pointer);
            this.pointer = 0L;
            this.inputStream.close();
        }
    }

    private static native long createDecoder0();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public short[] decodeNextFrame() throws IOException {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            System.arraycopy(this.leftoverBuffer, 0, this.inBuffer, 0, this.leftoverBufferLength);
            int n = this.inputStream.read(this.inBuffer, this.leftoverBufferLength, this.inBuffer.length - this.leftoverBufferLength);
            if (n < 0) {
                if (this.leftoverBufferLength <= 0) {
                    return null;
                }
                n = 0;
            }
            int n2 = this.leftoverBufferLength + n;
            long l = this.decodeNextFrame0(this.pointer, this.inBuffer, n2, this.outBuffer);
            int n3 = (int)(l >> 32);
            int n4 = (int)l;
            short[] sArray = new short[n3];
            System.arraycopy(this.outBuffer, 0, sArray, 0, n3);
            this.leftoverBufferLength = n2 - n4;
            System.arraycopy(this.inBuffer, n4, this.leftoverBuffer, 0, this.leftoverBufferLength);
            return sArray;
        }
    }

    private native long decodeNextFrame0(long var1, byte[] var3, int var4, short[] var5) throws IOException;

    private native int getSampleRate0(long var1);

    @Override
    @Nullable
    public AudioFormat createAudioFormat() {
        if (!this.headerParsed()) {
            return null;
        }
        return Audio.super.createAudioFormat();
    }

    private native int getChannelCount0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int getSampleRate() {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            return this.getSampleRate0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean headerParsed() {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            return this.getChannelCount0(this.pointer) >= 0 && this.getSampleRate0(this.pointer) >= 0 && this.getBitRate0(this.pointer) >= 0;
        }
    }

    private native int getBitRate0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int getChannelCount() {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            return this.getChannelCount0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int getBitRate() {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            return this.getBitRate0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        Mp3Decoder mp3Decoder = this;
        synchronized (mp3Decoder) {
            return this.pointer == 0L;
        }
    }

    private native void destroyDecoder0(long var1);

    private static native int getMaxSamplesPerFrame0();
}

