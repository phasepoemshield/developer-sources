/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.charset.StandardCharsets;

public class class05183 {
    public static final int N = 1460;
    public static final char[] y = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int L(byte[] byArray, int n, int n2) {
        if (0 > n2 - n - 4) {
            return 0;
        }
        return byArray[n] << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    public static int y(byte[] byArray, int n, int n2) {
        if (0 > n2 - n - 4) {
            return 0;
        }
        return byArray[n + 3] << 24 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 1] & 0xFF) << 8 | byArray[n] & 0xFF;
    }

    public static int N(byte[] byArray, int n) {
        return class05183.y(byArray, n, byArray.length);
    }

    public static String N(byte by) {
        return "" + y[(by & 0xF0) >>> 4] + y[by & 0xF];
    }

    public static String N(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = n2 - 1;
        int n5 = n3 = n > n4 ? n4 : n;
        while (0 != byArray[n3] && n3 < n4) {
            ++n3;
        }
        return new String(byArray, n, n3 - n, StandardCharsets.UTF_8);
    }
}

