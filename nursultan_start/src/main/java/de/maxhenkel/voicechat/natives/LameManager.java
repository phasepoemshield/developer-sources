/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.lame4j.Mp3Decoder
 *  de.maxhenkel.lame4j.Mp3Encoder
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.plugins.impl.mp3.Mp3EncoderImpl
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.lame4j.Mp3Decoder;
import de.maxhenkel.lame4j.Mp3Encoder;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.natives.NativeUtils;
import de.maxhenkel.voicechat.natives.NativeValidator;
import de.maxhenkel.voicechat.plugins.impl.mp3.Mp3EncoderImpl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;

public class LameManager
extends NativeValidator {
    private static LameManager instance;

    public static void init() {
        LameManager.instance().initialize();
    }

    private static synchronized LameManager instance() {
        if (instance == null) {
            instance = new LameManager();
        }
        return instance;
    }

    @Nullable
    public static Mp3Decoder createDecoder(InputStream inputStream) {
        LameManager lameManager = LameManager.instance();
        if (!lameManager.canUse()) {
            return null;
        }
        return NativeUtils.createSafe(() -> new Mp3Decoder(inputStream), throwable -> {
            lameManager.setFailed(throwable.getMessage());
            Voicechat.LOGGER.warn("Failed to load LAME decoder", throwable);
        });
    }

    @Override
    protected String getNativeName() {
        return "LAME";
    }

    @Override
    protected void runValidation() throws Throwable {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            try (Object object = new Mp3Encoder(1, 48000, 128, 5, (OutputStream)byteArrayOutputStream);){
                object.write(new short[960]);
            }
            object = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            try (Mp3Decoder mp3Decoder = new Mp3Decoder((InputStream)object);){
                mp3Decoder.decodeNextFrame();
                mp3Decoder.getSampleRate();
                mp3Decoder.getBitRate();
                mp3Decoder.getChannelCount();
            }
            finally {
                ((ByteArrayInputStream)object).close();
            }
        }
    }

    @Nullable
    public static Mp3EncoderImpl createEncoder(AudioFormat audioFormat, int n, int n2, OutputStream outputStream) {
        LameManager lameManager = LameManager.instance();
        if (!lameManager.canUse()) {
            return null;
        }
        return NativeUtils.createSafe(() -> new Mp3EncoderImpl(audioFormat, n, n2, outputStream), throwable -> {
            lameManager.setFailed(throwable.getMessage());
            Voicechat.LOGGER.warn("Failed to load LAME encoder", throwable);
        });
    }

    public static String getFailedMessage() {
        return LameManager.instance().getMessage();
    }

    public static boolean isFailed() {
        return !LameManager.instance().canUse();
    }

    public static boolean canUseLame() {
        return LameManager.instance().canUse();
    }
}

