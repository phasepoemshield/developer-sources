/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.lame4j.Mp3Decoder
 *  de.maxhenkel.lame4j.ShortArrayBuffer
 *  de.maxhenkel.voicechat.api.mp3.Mp3Decoder
 *  de.maxhenkel.voicechat.natives.LameManager
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.mp3;

import de.maxhenkel.lame4j.ShortArrayBuffer;
import de.maxhenkel.voicechat.api.mp3.Mp3Decoder;
import de.maxhenkel.voicechat.natives.LameManager;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;

public class Mp3DecoderImpl
implements Mp3Decoder {
    private final de.maxhenkel.lame4j.Mp3Decoder decoder;
    private IOException decodeError;
    @Nullable
    private short[] samples;
    @Nullable
    private AudioFormat audioFormat;
    private int bitrate;

    private Mp3DecoderImpl(de.maxhenkel.lame4j.Mp3Decoder mp3Decoder) {
        this.decoder = mp3Decoder;
        this.bitrate = -1;
    }

    public short[] decode() throws IOException {
        this.decodeIfNecessary();
        return this.samples;
    }

    @Nullable
    public static Mp3Decoder createDecoder(InputStream inputStream) {
        de.maxhenkel.lame4j.Mp3Decoder mp3Decoder = LameManager.createDecoder((InputStream)inputStream);
        if (mp3Decoder == null) {
            return null;
        }
        return new Mp3DecoderImpl(mp3Decoder);
    }

    private void decodeIfNecessary() throws IOException {
        if (this.decodeError != null) {
            throw this.decodeError;
        }
        try {
            if (this.samples == null) {
                short[] sArray;
                ShortArrayBuffer shortArrayBuffer = new ShortArrayBuffer(2048);
                while ((sArray = this.decoder.decodeNextFrame()) != null) {
                    shortArrayBuffer.writeShorts(sArray);
                }
                this.samples = shortArrayBuffer.toShortArray();
                this.audioFormat = this.decoder.createAudioFormat();
                this.bitrate = this.decoder.getBitRate();
            }
        }
        catch (IOException iOException) {
            this.decodeError = iOException;
            throw iOException;
        }
        finally {
            this.decoder.close();
        }
    }

    public int getBitrate() throws IOException {
        this.decodeIfNecessary();
        return this.bitrate;
    }

    public AudioFormat getAudioFormat() throws IOException {
        this.decodeIfNecessary();
        return this.audioFormat;
    }
}

