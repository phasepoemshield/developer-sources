/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class10057 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    public static final int u = 4;
    public static final int i = 8;

    private class10057() {
    }

    public static int y(int n, int n2) {
        int n3 = n | n2;
        if (class10057.N(n3, 2) || class10057.N(n3, 4) || class10057.N(n3, 8)) {
            n3 |= 1;
        }
        return n3;
    }

    public static boolean N(int n, int n2) {
        return (n & n2) == n2;
    }
}

