/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Platform
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CrossSideManager
 */
package de.maxhenkel.voicechat.natives;

import com.sun.jna.Platform;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CrossSideManager;
import de.maxhenkel.voicechat.macos.VersionCheck;
import de.maxhenkel.voicechat.natives.NativeUtils;
import de.maxhenkel.voicechat.natives.NativeValidator$NativeState;

public abstract class NativeValidator {
    private NativeValidator$NativeState state = NativeValidator$NativeState.NOT_INITIALIZED;

    public void initialize() {
        if (this.state.isInitialized()) {
            return;
        }
        if (!CrossSideManager.get().useNatives()) {
            Voicechat.LOGGER.info("Skipping initialization of {} - Natives are disabled", this.getNativeName());
            this.state = NativeValidator$NativeState.failed("Natives are disabled");
            return;
        }
        if (Platform.isMac() && !VersionCheck.isMacOSNativeCompatible()) {
            Voicechat.LOGGER.info("Skipping initialization of {} - Unsupported macOS version", this.getNativeName());
            this.state = NativeValidator$NativeState.failed("Unsupported macOS version");
            return;
        }
        Voicechat.LOGGER.info("Initializing {}", this.getNativeName());
        Boolean bl = (Boolean)NativeUtils.createSafe(() -> {
            this.runValidation();
            return true;
        }, throwable -> {
            Voicechat.LOGGER.warn("Failed to validate {}", this.getNativeName(), throwable);
            this.state = NativeValidator$NativeState.failed(throwable.getMessage());
        });
        if (bl == null || !bl.booleanValue()) {
            if (!this.state.isInitialized()) {
                this.state = NativeValidator$NativeState.failed("Unknown error");
            }
            return;
        }
        this.state = NativeValidator$NativeState.SUCCESS;
        Voicechat.LOGGER.info("Successfully initialized {}", this.getNativeName());
    }

    public String getMessage() {
        return this.state.getMessage();
    }

    public boolean canUse() {
        if (!this.state.isInitialized()) {
            this.initialize();
        }
        return this.state.isSuccess();
    }

    protected abstract String getNativeName();

    protected abstract void runValidation() throws Throwable;

    public void setFailed(String string) {
        this.state = NativeValidator$NativeState.failed(string);
    }
}

