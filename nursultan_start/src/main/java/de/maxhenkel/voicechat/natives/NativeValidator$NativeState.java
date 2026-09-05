/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.natives.NativeValidator$NativeLoadState;

public class NativeValidator$NativeState {
    public static final NativeValidator$NativeState NOT_INITIALIZED = NativeValidator$NativeState.notInitialized();
    public static final NativeValidator$NativeState SUCCESS = NativeValidator$NativeState.success();
    private final NativeValidator$NativeLoadState state;
    private final String message;

    public boolean isInitialized() {
        return !NativeValidator$NativeLoadState.NOT_INITIALIZED.equals((Object)this.state);
    }

    private NativeValidator$NativeState(NativeValidator$NativeLoadState nativeValidator$NativeLoadState, String string) {
        this.state = nativeValidator$NativeLoadState;
        this.message = string;
    }

    public String getMessage() {
        return this.message;
    }

    public NativeValidator$NativeLoadState getState() {
        return this.state;
    }

    private static NativeValidator$NativeState notInitialized() {
        return new NativeValidator$NativeState(NativeValidator$NativeLoadState.NOT_INITIALIZED, "");
    }

    public boolean isFailed() {
        return NativeValidator$NativeLoadState.FAILED.equals((Object)this.state);
    }

    private static NativeValidator$NativeState success() {
        return new NativeValidator$NativeState(NativeValidator$NativeLoadState.SUCCESS, "");
    }

    public boolean isSuccess() {
        return NativeValidator$NativeLoadState.SUCCESS.equals((Object)this.state);
    }

    public static NativeValidator$NativeState failed(String string) {
        return new NativeValidator$NativeState(NativeValidator$NativeLoadState.FAILED, string);
    }
}

