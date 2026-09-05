/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class00500;
import minecraft.class06069;

public class class01378 {
    private static final double y = 0.826;
    public static final double N = 0.1;

    public static boolean N(class00500 class005002) {
        return class005002.P();
    }

    public static int N(class06069 class060692) {
        double d = 1.0;
        int n = 0;
        while (class060692.U() < d) {
            d *= 0.826;
            ++n;
        }
        return n;
    }
}

