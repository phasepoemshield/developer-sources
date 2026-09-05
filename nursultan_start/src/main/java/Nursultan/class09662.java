/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09677;
import Nursultan.class09693;

public final class class09662 {
    public static final int N = 0;
    public static final int y = -16777216;
    private static final int L = 255;

    public static int L(int n) {
        return class09662.N(n, class09677.GREEN);
    }

    private class09662() {
    }

    public static boolean i(int n) {
        return class09662.N(n) < 255;
    }

    public static int u(int n) {
        return class09662.N(n, class09677.BLUE);
    }

    public static int y(int n) {
        return class09662.N(n, class09677.RED);
    }

    private static int y(int n, int n2, float f) {
        return Math.round((float)n + (float)(n2 - n) * f);
    }

    public static int N(int n, int n2, float f) {
        float f2 = class09693.N(f);
        int n3 = class09662.y(class09662.y(n), class09662.y(n2), f2);
        int n4 = class09662.y(class09662.L(n), class09662.L(n2), f2);
        int n5 = class09662.y(class09662.u(n), class09662.u(n2), f2);
        int n6 = class09662.y(class09662.N(n), class09662.N(n2), f2);
        return class09662.N(n3, n4, n5, n6);
    }

    public static int N(int n, float f) {
        if (f >= 1.0f || n == 0) {
            return n;
        }
        int n2 = (int)((float)(n >>> class09677.ALPHA.y() & 0xFF) * f);
        return n & ~class09677.ALPHA.N() | n2 << class09677.ALPHA.y();
    }

    public static int N(int n, class09677 class096772, int n2) {
        class09677 class096773 = class096772 == null ? class09677.ALPHA : class096772;
        int n3 = class09693.N(n2, 0, 255);
        return n & ~class096773.N() | n3 << class096773.y();
    }

    public static int N(int n, int n2, int n3, int n4) {
        int n5 = class09693.N(n, 0, 255);
        int n6 = class09693.N(n2, 0, 255);
        int n7 = class09693.N(n3, 0, 255);
        return class09693.N(n4, 0, 255) << class09677.ALPHA.y() | n5 << class09677.RED.y() | n6 << class09677.GREEN.y() | n7 << class09677.BLUE.y();
    }

    public static int N(int n) {
        return class09662.N(n, class09677.ALPHA);
    }

    public static int N(int n, class09677 class096772) {
        class09677 class096773 = class096772 == null ? class09677.ALPHA : class096772;
        return n >>> class096773.y() & 0xFF;
    }

    public static boolean R(int n) {
        return class09662.N(n) > 0;
    }
}

