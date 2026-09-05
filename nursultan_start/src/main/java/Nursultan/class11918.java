/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11918 {
    private static String[] y;
    private static String[] L;
    private static String[] i;
    private static String[] B;
    private static String[] z;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private class11918() {
        throw new UnsupportedOperationException(y[0]);
    }

    static {
        class11918.R();
        class11918.i();
        N_2 = new String[320];
        ((String[])class11918.N_2)[0] = y[1];
        ((String[])class11918.N_2)[86] = y[2];
        ((String[])class11918.N_2)[96] = z[0];
        ((String[])class11918.N_2)[9] = z[1];
        ((String[])class11918.N_2)[1] = z[2];
        ((String[])class11918.N_2)[82] = z[3];
        ((String[])class11918.N_2)[72] = B[0];
        ((String[])class11918.N_2)[64] = B[1];
        ((String[])class11918.N_2)[40] = B[2];
        ((String[])class11918.N_2)[36] = B[3];
        ((String[])class11918.N_2)[32] = B[4];
        ((String[])class11918.N_2)[22] = B[5];
        ((String[])class11918.N_2)[18] = B[6];
        ((String[])class11918.N_2)[8] = B[7];
        ((String[])class11918.N_2)[4] = L[0];
        ((String[])class11918.N_2)[68] = L[1];
        ((String[])class11918.N_2)[55] = L[2];
        ((String[])class11918.N_2)[54] = L[3];
        ((String[])class11918.N_2)[5] = L[4];
        ((String[])class11918.N_2)[19] = L[5];
        ((String[])class11918.N_2)[23] = L[6];
        ((String[])class11918.N_2)[33] = i[0];
        ((String[])class11918.N_2)[37] = i[1];
        ((String[])class11918.N_2)[41] = i[2];
        ((String[])class11918.N_2)[306] = i[3];
        ((String[])class11918.N_2)[307] = i[4];
        ((String[])class11918.N_2)[65] = i[5];
        ((String[])class11918.N_2)[69] = i[6];
    }

    private static void i() {
        N_0 = 42240;
        N_1 = 320;
    }

    public static String N(char c) {
        int n = c - 42240;
        return n >= 0 && n < 320 ? ((String[])N_2)[n] : null;
    }

    public static String N(int n) {
        if (n < 42240 || n > 42559) {
            return null;
        }
        return ((String[])N_2)[n - 42240];
    }

    private static void R() {
        y = new String[3];
        class11918.y[0] = "This is a utility class and cannot be instantiated";
        class11918.y[1] = "\u0418\u0413\u0420\u041e\u041a";
        class11918.y[2] = "BUNNY";
        z = new String[4];
        class11918.z[0] = "D.HELPER";
        class11918.z[1] = "HELPER";
        class11918.z[2] = "MEDIA";
        class11918.z[3] = "RABBIT";
        B = new String[8];
        class11918.B[0] = "COBRA";
        class11918.B[1] = "HYDRA";
        class11918.B[2] = "DRAGON";
        class11918.B[3] = "IMPERATOR";
        class11918.B[4] = "MAGISTER";
        class11918.B[5] = "OVERLORD";
        class11918.B[6] = "AVENGER";
        class11918.B[7] = "TITAN";
        L = new String[7];
        class11918.L[0] = "HERO";
        class11918.L[1] = "DRACULA";
        class11918.L[2] = "ADMIN";
        class11918.L[3] = "TIGER";
        class11918.L[4] = "YT";
        class11918.L[5] = "ML.MODER";
        class11918.L[6] = "MODER";
        i = new String[7];
        class11918.i[0] = "MODER+";
        class11918.i[1] = "ST.MODER";
        class11918.i[2] = "GL.MODER";
        class11918.i[3] = "BULL";
        class11918.i[4] = "ML.ADMIN";
        class11918.i[5] = "GOD";
        class11918.i[6] = "VAMPIRE";
    }
}

