/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viafabricplus.visuals.features.force_unicode_font;

import java.util.Map;

public final class LanguageUtil {
    private static final int NON_ASCII_THRESHOLD = 256;

    public static boolean isUnicodeFont1_12_2(Map<String, String> map) {
        int n = 0;
        int n2 = 0;
        for (String string : map.values()) {
            n2 += string.length();
            for (int i = 0; i < string.length(); ++i) {
                if (string.charAt(i) < '\u0100') continue;
                ++n;
            }
        }
        return (double)((float)n / (float)n2) > 0.1;
    }
}

