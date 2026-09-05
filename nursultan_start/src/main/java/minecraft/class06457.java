/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06419;

@FunctionalInterface
interface class06457 {
    public static final class06457 N = class064192 -> 1.0f;

    public static class06457 N(int n) {
        return class064192 -> {
            double d = (double)(n - class064192.N()) / 200.0;
            d = 1.0 - d;
            d *= 10.0;
            d = class04995.N((double)d, (double)0.0, (double)1.0);
            d *= d;
            return (float)d;
        };
    }

    public float calculate(class06419 var1);
}

