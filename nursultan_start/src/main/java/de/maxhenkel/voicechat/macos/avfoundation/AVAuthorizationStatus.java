/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLong
 */
package de.maxhenkel.voicechat.macos.avfoundation;

import com.sun.jna.NativeLong;

public enum AVAuthorizationStatus {
    NOT_DETERMINED(0),
    RESTRICTED(1),
    DENIED(2),
    AUTHORIZED(3);

    private final int value;

    private AVAuthorizationStatus(int n2) {
        this.value = n2;
    }

    public int getValue() {
        return this.value;
    }

    public static AVAuthorizationStatus byValue(long l) {
        return AVAuthorizationStatus.byValue((int)l);
    }

    public static AVAuthorizationStatus byValue(NativeLong nativeLong) {
        return AVAuthorizationStatus.byValue(nativeLong.longValue());
    }

    public static AVAuthorizationStatus byValue(int n) {
        for (AVAuthorizationStatus aVAuthorizationStatus : AVAuthorizationStatus.values()) {
            if (aVAuthorizationStatus.getValue() != n) continue;
            return aVAuthorizationStatus;
        }
        return null;
    }
}

