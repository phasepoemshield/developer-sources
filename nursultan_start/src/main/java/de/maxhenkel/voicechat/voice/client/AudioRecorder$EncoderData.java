/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.mp3.Mp3Encoder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.api.mp3.Mp3Encoder;
import javax.annotation.Nullable;

class AudioRecorder$EncoderData {
    @Nullable
    final Mp3Encoder encoder;
    long lastTimestamp;

    public AudioRecorder$EncoderData(@Nullable Mp3Encoder mp3Encoder, long l) {
        this.encoder = mp3Encoder;
        this.lastTimestamp = l;
    }
}

