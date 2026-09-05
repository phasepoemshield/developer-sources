/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder$Application
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 *  de.maxhenkel.voicechat.intercompatibility.CrossSideManager
 *  de.maxhenkel.voicechat.plugins.impl.opus.JavaOpusDecoderImpl
 *  de.maxhenkel.voicechat.plugins.impl.opus.JavaOpusEncoderImpl
 *  de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusDecoderImpl
 *  de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusEncoderImpl
 *  java.lang.MatchException
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.opus4j.OpusEncoder;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import de.maxhenkel.voicechat.natives.NativeValidator;
import de.maxhenkel.voicechat.plugins.impl.opus.JavaOpusDecoderImpl;
import de.maxhenkel.voicechat.plugins.impl.opus.JavaOpusEncoderImpl;
import de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusDecoderImpl;
import de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusEncoderImpl;

public class OpusManager
extends NativeValidator {
    private static OpusManager instance;

    public static void init() {
        OpusManager.instance().initialize();
    }

    private static synchronized OpusManager instance() {
        if (instance == null) {
            instance = new OpusManager();
        }
        return instance;
    }

    public static OpusDecoder createDecoder() {
        OpusManager opusManager = OpusManager.instance();
        if (opusManager.canUse()) {
            try {
                NativeOpusDecoderImpl nativeOpusDecoderImpl = new NativeOpusDecoderImpl(48000, 1);
                nativeOpusDecoderImpl.setFrameSize(960);
                return nativeOpusDecoderImpl;
            }
            catch (Throwable throwable) {
                opusManager.setFailed(throwable.getMessage());
                Voicechat.LOGGER.warn("Failed to load native Opus decoder - Falling back to Java Opus implementation", new Object[0]);
            }
        }
        return new JavaOpusDecoderImpl(48000, 960);
    }

    @Override
    protected String getNativeName() {
        return "Opus";
    }

    @Override
    protected void runValidation() throws Throwable {
        NativeOpusEncoderImpl nativeOpusEncoderImpl = new NativeOpusEncoderImpl(48000, 1, OpusEncoder.Application.VOIP);
        nativeOpusEncoderImpl.setMaxPayloadSize(1024);
        byte[] byArray = nativeOpusEncoderImpl.encode(new short[960]);
        nativeOpusEncoderImpl.resetState();
        nativeOpusEncoderImpl.close();
        NativeOpusDecoderImpl nativeOpusDecoderImpl = new NativeOpusDecoderImpl(48000, 1);
        nativeOpusDecoderImpl.setFrameSize(960);
        nativeOpusDecoderImpl.decode(byArray);
        nativeOpusDecoderImpl.decode(null);
        nativeOpusDecoderImpl.resetState();
        nativeOpusDecoderImpl.close();
    }

    public static OpusEncoder createEncoder(OpusEncoderMode opusEncoderMode) {
        OpusManager opusManager = OpusManager.instance();
        int n = CrossSideManager.get().getMtuSize();
        OpusEncoder.Application application = OpusEncoder.Application.VOIP;
        if (opusEncoderMode != null) {
            switch (opusEncoderMode) {
                default: {
                    throw new MatchException(null, null);
                }
                case VOIP: {
                    OpusEncoder.Application application2 = OpusEncoder.Application.VOIP;
                    break;
                }
                case AUDIO: {
                    OpusEncoder.Application application2 = OpusEncoder.Application.AUDIO;
                    break;
                }
                case RESTRICTED_LOWDELAY: {
                    OpusEncoder.Application application2 = application = OpusEncoder.Application.LOW_DELAY;
                }
            }
        }
        if (opusManager.canUse()) {
            try {
                NativeOpusEncoderImpl nativeOpusEncoderImpl = new NativeOpusEncoderImpl(48000, 1, application);
                nativeOpusEncoderImpl.setMaxPayloadSize(n);
                return nativeOpusEncoderImpl;
            }
            catch (Throwable throwable) {
                opusManager.setFailed(throwable.getMessage());
                Voicechat.LOGGER.warn("Failed to load native Opus encoder - Falling back to Java Opus implementation", new Object[0]);
            }
        }
        return new JavaOpusEncoderImpl(48000, 960, n, application);
    }

    public static String getFailedMessage() {
        return OpusManager.instance().getMessage();
    }

    public static boolean isFailed() {
        return !OpusManager.instance().canUse();
    }
}

