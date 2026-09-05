/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class12002;
import Nursultan.class12022;

public class class12013 {
    private static String[] i;
    public static Object N_0;

    private class12013() {
        throw new UnsupportedOperationException(i[3]);
    }

    static {
        class12013.N();
        class12013.i();
    }

    private static void i() {
        N_0 = 7;
    }

    private static int y(class12002 class120022) {
        return switch (((int[])class12022.N_0)[class120022.ordinal()]) {
            case 1, 2 -> 1;
            case 3, 4 -> 2;
            case 5, 6 -> 4;
            default -> 0;
        };
    }

    public static int y(class12002 class120022, int n) {
        return n & 7 & ~class12013.y(class120022);
    }

    private static void N() {
        i = new String[4];
        class12013.i[0] = "Ctrl+";
        class12013.i[1] = "Shift+";
        class12013.i[2] = "Alt+";
        class12013.i[3] = "This is a utility class and cannot be instantiated";
    }

    public static String N(class12002 class120022, int n) {
        if (n == 0) {
            return class120022.u();
        }
        StringBuilder stringBuilder = new StringBuilder();
        if ((n & 2) != 0) {
            stringBuilder.append(i[0]);
        }
        if ((n & 1) != 0) {
            stringBuilder.append(i[1]);
        }
        if ((n & 4) != 0) {
            stringBuilder.append(i[2]);
        }
        return stringBuilder.append(class120022.u()).toString();
    }

    public static boolean N(class12002 class120022) {
        return class12013.y(class120022) != 0;
    }
}

