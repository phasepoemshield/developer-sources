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

public class class09527<T>
extends class01807<T> {
    private class06617 L(class06617 class066172) {
        return class01807.G;
    }

    public class09527(class00750 class007502, int n) {
        super(class007502, n);
    }

    private class06617 u(class06617 class066172) {
        return class01807.l;
    }

    private class06617 y(class06617 class066172) {
        return class01807.t;
    }

    private class06617 N(class06617 class066172) {
        return class01807.n;
    }

    public class06617 N(int n) {
        return switch (n) {
            case 0 -> class01807.L;
            case 1, 2, 3, 4 -> this.N(class01807.M, n);
            case 5 -> this.N(class01807.B);
            case 6 -> this.y(class01807.Z);
            case 7 -> this.L(class01807.z);
            case 8 -> this.u(class01807.U);
            default -> new class10638(this.E, n);
        };
    }

    private class06617 N(class06617 class066172, int n) {
        if (n == 3 || n == 4) {
            return class01807.v;
        }
        return class066172;
    }
}

