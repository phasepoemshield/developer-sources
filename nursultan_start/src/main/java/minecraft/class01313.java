/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03469
 *  minecraft.class04745
 *  minecraft.class04762
 *  minecraft.class04778
 *  minecraft.class08593
 */
package minecraft;

import minecraft.class03469;
import minecraft.class04745;
import minecraft.class04762;
import minecraft.class04778;
import minecraft.class08593;

class class01313
extends class04762 {
    private static final int N = class03469.y + 1;
    private final class04778 y;
    private final class08593 L;

    protected int L(long l) {
        class04745 class047452;
        if (!this.y.N(l) && (class047452 = this.y.y(l)) != null) {
            return class047452.z();
        }
        return N;
    }

    public class01313(class04778 class047782, class08593 class085932) {
        super(N + 1, 16, 256);
        this.y = class047782;
        this.L = class085932;
        class085932.N((arg_0, arg_1, arg_2) -> ((class01313)this).y(arg_0, arg_1, arg_2));
    }

    protected int y(long l) {
        return this.L.N(l, false);
    }

    public int N(int n) {
        return this.y(n);
    }

    protected void N(long l, int n) {
        int n2;
        class04745 class047452 = this.y.y(l);
        int n3 = n2 = class047452 == null ? N : class047452.z();
        if (n2 == n) {
            return;
        }
        if ((class047452 = this.y.N(l, n, class047452, n2)) != null) {
            this.y.u.add(class047452);
        }
    }
}

