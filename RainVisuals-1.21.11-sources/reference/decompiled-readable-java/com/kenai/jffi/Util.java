/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import java.util.Locale;

public final class Util {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean startsWithIgnoreCase(String s1, String s2, Locale locale) {
        if (s1.startsWith(s2)) return true;
        if (s1.toUpperCase(locale).startsWith(s2.toUpperCase(locale))) return true;
        if (!s1.toLowerCase(locale).startsWith(s2.toLowerCase(locale))) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean equalsIgnoreCase(String s1, String s2, Locale locale) {
        if (s1.equalsIgnoreCase(s2)) return true;
        if (s1.toUpperCase(locale).equals(s2.toUpperCase(locale))) return true;
        if (!s1.toLowerCase(locale).equals(s2.toLowerCase(locale))) return false;
        return true;
    }

    private Util() {
    }

    static int ffi_align(int v, int a2) {
        return (v + -1 | a2 + -1) + 1;
    }
}

