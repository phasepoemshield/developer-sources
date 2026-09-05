/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class09853 {
    private class09853() {
    }

    static String N(String string, String string2) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException(string2 + " must not be blank");
        }
        return string.trim();
    }
}

