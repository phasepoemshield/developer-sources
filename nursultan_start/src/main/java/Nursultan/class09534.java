/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10638
 *  minecraft.class00750
 *  minecraft.class01807
 *  minecraft.class06617
 */
package Nursultan;

import Nursultan.class10638;
import minecraft.class00750;
import minecraft.class01807;
import minecraft.class06617;

public class class09534<T>
extends class01807<T> {
    public class09534(class00750 class007502, int n) {
        super(class007502, n);
    }

    public class06617 N(int n) {
        return switch (n) {
            case 0 -> class01807.L;
            case 1 -> class01807.u;
            case 2 -> class01807.i;
            case 3 -> this.N(class01807.R);
            default -> new class10638(this.E, n);
        };
    }

    private class06617 N(class06617 class066172) {
        return class01807.j;
    }
}

