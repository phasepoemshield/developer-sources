/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder$Application
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.opus4j.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;

public enum ServerConfig$Codec {
    VOIP(OpusEncoder.Application.VOIP, OpusEncoderMode.VOIP),
    AUDIO(OpusEncoder.Application.AUDIO, OpusEncoderMode.AUDIO),
    RESTRICTED_LOWDELAY(OpusEncoder.Application.LOW_DELAY, OpusEncoderMode.RESTRICTED_LOWDELAY);

    private final OpusEncoder.Application application;
    private final OpusEncoderMode mode;

    private ServerConfig$Codec(OpusEncoder.Application application, OpusEncoderMode opusEncoderMode) {
        this.application = application;
        this.mode = opusEncoderMode;
    }

    public OpusEncoderMode getMode() {
        return this.mode;
    }

    public OpusEncoder.Application getApplication() {
        return this.application;
    }
}

