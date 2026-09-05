/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.mp3.Mp3Decoder
 *  de.maxhenkel.voicechat.api.mp3.Mp3Encoder
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.Entity;
import de.maxhenkel.voicechat.api.Position;
import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.VolumeCategory$Builder;
import de.maxhenkel.voicechat.api.audio.AudioConverter;
import de.maxhenkel.voicechat.api.mp3.Mp3Decoder;
import de.maxhenkel.voicechat.api.mp3.Mp3Encoder;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;

public interface VoicechatApi {
    public OpusDecoder createDecoder();

    public OpusEncoder createEncoder();

    public OpusEncoder createEncoder(OpusEncoderMode var1);

    public double getVoiceChatDistance();

    public Entity fromEntity(Object var1);

    public ServerLevel fromServerLevel(Object var1);

    @Nullable
    public Mp3Decoder createMp3Decoder(InputStream var1);

    @Nullable
    public Mp3Encoder createMp3Encoder(AudioFormat var1, int var2, int var3, OutputStream var4);

    public ServerPlayer fromServerPlayer(Object var1);

    public Position createPosition(double var1, double var3, double var5);

    public AudioConverter getAudioConverter();

    public VolumeCategory.Builder volumeCategoryBuilder();
}

