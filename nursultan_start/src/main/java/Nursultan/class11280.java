/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11330
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11330;

public class class11280 {
    private static String[] y;
    public static Object N_0;
    public static Object N_1;

    private static void L() {
        y = new String[1];
        class11280.y[0] = "No serializer for CURRENT_FORMAT=1";
    }

    private class11280() {
    }

    static {
        class11280.L();
        class11280.y();
    }

    private static void y() {
        N_0 = 1;
        N_1 = 1;
    }

    public static byte[] N(Iterable<class11067> iterable) {
        return new class11330().N(iterable);
    }
}

