/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.natives.Denoiser;
import de.maxhenkel.voicechat.natives.NativeUtils;
import de.maxhenkel.voicechat.natives.NativeValidator;
import javax.annotation.Nullable;

public class RNNoiseManager
extends NativeValidator {
    private static RNNoiseManager instance;

    public static void init() {
        RNNoiseManager.instance().initialize();
    }

    private static synchronized RNNoiseManager instance() {
        if (instance == null) {
            instance = new RNNoiseManager();
        }
        return instance;
    }

    @Override
    protected String getNativeName() {
        return "RNNoise";
    }

    @Override
    protected void runValidation() throws Throwable {
        try (Denoiser denoiser = new Denoiser();){
            denoiser.denoiseInPlace(new short[denoiser.getFrameSize()]);
            denoiser.denoise(new short[denoiser.getFrameSize()]);
        }
    }

    public static String getFailedMessage() {
        return RNNoiseManager.instance().getMessage();
    }

    @Nullable
    public static Denoiser createDenoiser() {
        RNNoiseManager rNNoiseManager = RNNoiseManager.instance();
        if (!rNNoiseManager.canUse()) {
            return null;
        }
        return NativeUtils.createSafe(Denoiser::new, throwable -> {
            rNNoiseManager.setFailed(throwable.getMessage());
            Voicechat.LOGGER.warn("Failed to load RNNoise", throwable);
        });
    }

    public static boolean canUseDenoiser() {
        return RNNoiseManager.instance().canUse();
    }

    public static boolean isFailed() {
        return !RNNoiseManager.instance().canUse();
    }
}

