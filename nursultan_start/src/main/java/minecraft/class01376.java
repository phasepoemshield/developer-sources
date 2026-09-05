/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01820
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01820;

public final class class01376
implements class01820 {
    private final int N;
    private final class00500[] y;

    public class01376(int n, class00500[] class00500Array) {
        this.N = n;
        this.y = class00500Array;
    }

    public class00500 N(int n) {
        int n2 = n - this.N;
        if (n2 < 0 || n2 >= this.y.length) {
            return class00869.N.W();
        }
        return this.y[n2];
    }

    public void N(int n, class00500 class005002) {
        int n2 = n - this.N;
        if (n2 < 0 || n2 >= this.y.length) {
            throw new IllegalArgumentException("Outside of column height: " + n);
        }
        this.y[n2] = class005002;
    }
}

