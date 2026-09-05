/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Entity
 *  de.maxhenkel.voicechat.api.Position
 *  de.maxhenkel.voicechat.api.ServerLevel
 *  de.maxhenkel.voicechat.api.ServerPlayer
 *  de.maxhenkel.voicechat.api.VoicechatApi
 *  de.maxhenkel.voicechat.api.VolumeCategory$Builder
 *  de.maxhenkel.voicechat.api.audio.AudioConverter
 *  de.maxhenkel.voicechat.api.mp3.Mp3Decoder
 *  de.maxhenkel.voicechat.api.mp3.Mp3Encoder
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 *  de.maxhenkel.voicechat.plugins.impl.mp3.Mp3DecoderImpl
 *  de.maxhenkel.voicechat.voice.common.Utils
 *  javax.annotation.Nullable
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07049
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VolumeCategory;
import de.maxhenkel.voicechat.api.audio.AudioConverter;
import de.maxhenkel.voicechat.api.mp3.Mp3Decoder;
import de.maxhenkel.voicechat.api.mp3.Mp3Encoder;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;
import de.maxhenkel.voicechat.natives.LameManager;
import de.maxhenkel.voicechat.natives.OpusManager;
import de.maxhenkel.voicechat.plugins.impl.EntityImpl;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerLevelImpl;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl$BuilderImpl;
import de.maxhenkel.voicechat.plugins.impl.audio.AudioConverterImpl;
import de.maxhenkel.voicechat.plugins.impl.mp3.Mp3DecoderImpl;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;

public abstract class VoicechatApiImpl
implements VoicechatApi {
    private static final AudioConverter AUDIO_CONVERTER = new AudioConverterImpl();

    public OpusDecoder createDecoder() {
        return OpusManager.createDecoder();
    }

    public OpusEncoder createEncoder() {
        return OpusManager.createEncoder(null);
    }

    public OpusEncoder createEncoder(OpusEncoderMode opusEncoderMode) {
        return OpusManager.createEncoder(opusEncoderMode);
    }

    public double getVoiceChatDistance() {
        return Utils.getDefaultDistanceServer();
    }

    public Entity fromEntity(Object object) {
        if (object instanceof class07049) {
            class07049 class070492 = (class07049)object;
            return new EntityImpl(class070492);
        }
        throw new IllegalArgumentException("entity is not an instance of Entity");
    }

    public ServerLevel fromServerLevel(Object object) {
        if (object instanceof class04782) {
            class04782 class047822 = (class04782)object;
            return new ServerLevelImpl(class047822);
        }
        throw new IllegalArgumentException("serverLevel is not an instance of ServerLevel");
    }

    @Nullable
    public Mp3Decoder createMp3Decoder(InputStream inputStream) {
        return Mp3DecoderImpl.createDecoder((InputStream)inputStream);
    }

    @Nullable
    public Mp3Encoder createMp3Encoder(AudioFormat audioFormat, int n, int n2, OutputStream outputStream) {
        return LameManager.createEncoder(audioFormat, n, n2, outputStream);
    }

    public ServerPlayer fromServerPlayer(Object object) {
        if (object instanceof class04770) {
            class04770 class047702 = (class04770)object;
            return new ServerPlayerImpl(class047702);
        }
        throw new IllegalArgumentException("serverPlayer is not an instance of ServerPlayer");
    }

    public Position createPosition(double d, double d2, double d3) {
        return new PositionImpl(d, d2, d3);
    }

    public AudioConverter getAudioConverter() {
        return AUDIO_CONVERTER;
    }

    public VolumeCategory.Builder volumeCategoryBuilder() {
        return new VolumeCategoryImpl$BuilderImpl();
    }
}

