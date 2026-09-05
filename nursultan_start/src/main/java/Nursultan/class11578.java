/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11547;
import Nursultan.class11580;
import Nursultan.class11588;
import Nursultan.class11589;
import java.util.ArrayList;
import java.util.List;

public class class11578 {
    private static String[] L;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;

    private static void L() {
        L = new String[4];
        class11578.L[0] = "This is a utility class and cannot be instantiated";
        class11578.L[1] = "\u041f\u043b\u0430\u0441\u0442";
        class11578.L[2] = "\u041f\u043b\u0430\u0441\u0442";
        class11578.L[3] = "\u041f\u043b\u0430\u0441\u0442";
    }

    private class11578() {
        throw new UnsupportedOperationException(L[0]);
    }

    static {
        class11578.L();
        class11578.u();
        N_0 = new ArrayList();
        N_1 = class11578.N(new class11588(L[1], 400));
        N_2 = class11578.N(new class11580(L[2], 1200));
        N_3 = class11578.N(new class11589(L[3], 400));
    }

    private static void u() {
    }

    private static <T extends class11547> T N(T t) {
        ((List)N_0).add(t);
        return t;
    }
}

