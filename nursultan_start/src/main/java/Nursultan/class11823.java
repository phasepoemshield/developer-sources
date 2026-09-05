/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Set;
import java.util.regex.Pattern;

public class class11823 {
    private static String[] i;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;

    private static void L() {
        i = new String[1];
        class11823.i[0] = "^[A-Za-z\u0410-\u042f\u0430-\u044f\u0401\u04510-9 _-]+$";
    }

    private class11823() {
    }

    static {
        class11823.L();
        class11823.u();
        N_5 = Pattern.compile(i[0]);
        N_6 = Set.of(Integer.valueOf(1));
    }

    private static void u() {
        N_0 = 3;
        N_1 = 32;
        N_2 = 0x100000;
        N_3 = 0x400000;
        N_4 = 50;
    }
}

