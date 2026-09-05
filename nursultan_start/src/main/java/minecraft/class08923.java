/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02002
 *  minecraft.class08280
 */
package minecraft;

import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02002;
import minecraft.class08280;

public final class class08923 {
    private static final int N = 16;
    private static final int y = 16;
    private static final String L = "missingno";
    private static final class01894 u = class01894.y((String)"missingno");

    public static class01894 L() {
        return u;
    }

    public static class01991 y() {
        class08280 class082802 = class08923.N(16, 16);
        return new class01991(u, new class02002(16, 16), class082802);
    }

    public static class08280 N() {
        return class08923.N(16, 16);
    }

    public static class08280 N(int n, int n2) {
        class08280 class082802 = new class08280(n, n2, false);
        int n3 = -524040;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i < n2 / 2 ^ j < n / 2) {
                    class082802.y(j, i, -524040);
                    continue;
                }
                class082802.y(j, i, -16777216);
            }
        }
        return class082802;
    }
}

