/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 */
package Nursultan;

import Nursultan.class09693;

final class class10067 {
    static boolean L(String string, int n, int n2) {
        return class10067.N(string, n, n2) != class10067.y(string, n, n2);
    }

    static int L(String string, int n) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        int n2 = class10067.N(string, n);
        if (n2 >= string.length()) {
            return string.length();
        }
        return string.offsetByCodePoints(n2, 1);
    }

    private class10067() {
    }

    static int y(String string, int n) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        int n2 = class10067.N(string, n);
        if (n2 <= 0) {
            return 0;
        }
        return string.offsetByCodePoints(n2, -1);
    }

    static int y(String string, int n, int n2) {
        return Math.max(class10067.N(string, n), class10067.N(string, n2));
    }

    static int N(String string, int n) {
        String string2 = string == null ? "" : string;
        int n2 = class09693.N((int)n, (int)0, (int)string2.length());
        if (n2 > 0 && n2 < string2.length() && Character.isLowSurrogate(string2.charAt(n2)) && Character.isHighSurrogate(string2.charAt(n2 - 1))) {
            return n2 - 1;
        }
        return n2;
    }

    static int N(String string, int n, int n2) {
        return Math.min(class10067.N(string, n), class10067.N(string, n2));
    }
}

