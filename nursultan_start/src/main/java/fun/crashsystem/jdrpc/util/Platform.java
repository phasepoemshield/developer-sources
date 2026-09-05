/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.util;

import java.util.Locale;

public enum Platform {
    WINDOWS,
    MACOS,
    LINUX;

    public static final Platform CURRENT;

    static {
        CURRENT = Platform.detect();
    }

    private static Platform detect() {
        String string = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        if (string.contains("win")) {
            return WINDOWS;
        }
        if (string.contains("mac") || string.contains("darwin")) {
            return MACOS;
        }
        return LINUX;
    }
}

