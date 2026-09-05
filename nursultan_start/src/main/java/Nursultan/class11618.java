/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09809
 */
package Nursultan;

import Nursultan.class09809;
import Nursultan.class11608;
import Nursultan.class11610;

public class class11618 {
    private static String[] y;
    public static Object N_0;

    private static void L() {
        y = new String[1];
        class11618.y[0] = "modalFade";
    }

    private class11618() {
    }

    static {
        class11618.L();
        class11618.u();
    }

    private static void u() {
        N_0 = Float.valueOf(0.18f);
    }

    public static class11610 N(class09809 class098092, boolean bl) {
        class11608 class116082 = (class11608)class098092.u(y[0], class11608::new);
        class116082.N(bl);
        return new class11610(class116082.L(), bl || class116082.B() > 0.0f);
    }
}

