/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11464 {
    private static String[] R;
    public static Object N_0;
    public static Object N_1;

    public static int L(int n) {
        return n / 1200;
    }

    private static void L() {
        R = new String[1];
        class11464.R[0] = "This is a utility class and cannot be instantiated";
    }

    private class11464() {
        throw new UnsupportedOperationException(R[0]);
    }

    static {
        class11464.L();
        class11464.y();
    }

    public static long i(int n) {
        return (long)n * 50L;
    }

    public static int u(int n) {
        return n * 20;
    }

    private static void y() {
        N_0 = 20L;
        N_1 = 50L;
    }

    public static int y(int n) {
        return n * 1200;
    }

    public static int N(int n) {
        return n / 20;
    }

    public static int N(long l) {
        return (int)(l / 50L);
    }
}

