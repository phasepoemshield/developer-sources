/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08535
 */
package minecraft;

import minecraft.class08535;

public class class07287 {
    public static int[] N = new int[65536];

    public static void N(int[] nArray) {
        N = nArray;
    }

    public static int N() {
        return class07287.N(0.5, 1.0);
    }

    public static int N(double d, double d2) {
        return class08535.N((double)d, (double)d2, (int[])N, (int)-65281);
    }
}

