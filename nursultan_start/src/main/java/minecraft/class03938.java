/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class05220
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class03943;
import minecraft.class05220;

public class class03938 {
    private int N;
    private int y;
    private class00392 L = class05220.N;
    private int u = -2039584;
    private boolean i = true;
    private int R = -3092272;
    private boolean M = true;
    private boolean B = true;

    public class03938 L(boolean bl) {
        this.B = bl;
        return this;
    }

    public class03938 L(int n) {
        this.u = n;
        return this;
    }

    public class03938 u(int n) {
        this.R = n;
        return this;
    }

    public class03938 y(int n) {
        this.y = n;
        return this;
    }

    public class03938 y(boolean bl) {
        this.M = bl;
        return this;
    }

    public class03943 N(class01590 class015902, int n, int n2, class00392 class003922) {
        return new class03943(class015902, this.N, this.y, n, n2, this.L, class003922, this.u, this.i, this.R, this.M, this.B);
    }

    public class03938 N(boolean bl) {
        this.i = bl;
        return this;
    }

    public class03938 N(class00392 class003922) {
        this.L = class003922;
        return this;
    }

    public class03938 N(int n) {
        this.N = n;
        return this;
    }
}

