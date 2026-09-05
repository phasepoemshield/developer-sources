/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 */
package Nursultan;

import java.util.concurrent.ThreadLocalRandom;
import minecraft.class04995;
import minecraft.class06889;

public class class09139 {
    private class09139() {
    }

    public static class06889 N(float f, float f2) {
        float f3 = f * ((float)Math.PI / 180);
        float f4 = -f2 * ((float)Math.PI / 180);
        float f5 = class04995.P((double)f4);
        float f6 = class04995.m((double)f4);
        float f7 = class04995.P((double)f3);
        float f8 = class04995.m((double)f3);
        return new class06889((double)(f6 * f7), (double)(-f8), (double)(f5 * f7));
    }

    public static float N(double d, double d2) {
        if (d2 <= d) {
            return (float)d;
        }
        return (float)(d + (d2 - d) * ThreadLocalRandom.current().nextDouble());
    }
}

