/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.natives.Agc;
import de.maxhenkel.voicechat.natives.NativeUtils;
import de.maxhenkel.voicechat.natives.NativeValidator;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import javax.annotation.Nullable;

public class SpeexManager
extends NativeValidator {
    public static final int TARGET = AudioUtils.dbSample((double)-5.0);
    private static SpeexManager instance;

    public static void init() {
        SpeexManager.instance().initialize();
    }

    private static synchronized SpeexManager instance() {
        if (instance == null) {
            instance = new SpeexManager();
        }
        return instance;
    }

    @Override
    protected String getNativeName() {
        return "Speex";
    }

    @Override
    protected void runValidation() throws Throwable {
        try (Agc agc = new Agc(960, 48000);){
            agc.setTarget(TARGET);
            agc.agc(new short[960]);
        }
    }

    public static String getFailedMessage() {
        return SpeexManager.instance().getMessage();
    }

    public static boolean isFailed() {
        return !SpeexManager.instance().canUse();
    }

    public static boolean canUseAgc() {
        return SpeexManager.instance().canUse();
    }

    @Nullable
    public static Agc createAgc() {
        SpeexManager speexManager = SpeexManager.instance();
        if (!speexManager.canUse()) {
            return null;
        }
        return NativeUtils.createSafe(() -> {
            Agc agc = new Agc(960, 48000);
            agc.setTarget(TARGET);
            return agc;
        }, throwable -> {
            speexManager.setFailed(throwable.getMessage());
            Voicechat.LOGGER.warn("Failed to load Speex", throwable);
        });
    }
}

