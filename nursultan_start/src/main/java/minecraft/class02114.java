/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02086;
import minecraft.class02091;

public class class02114 {
    private final class00392 N;
    private final class01590 y;
    private final int L;
    private int u = -1;
    private boolean i = true;
    private class02086 R = class02086.field_62117;

    class02114(class00392 class003922, class01590 class015902) {
        this(class003922, class015902, 4);
    }

    class02114(class00392 class003922, class01590 class015902, int n) {
        this.N = class003922;
        this.y = class015902;
        this.L = n;
    }

    public class02114 y(int n) {
        this.u = n + this.L * 2;
        return this;
    }

    public class02091 N() {
        return new class02091(this.N, this.y, this.L, this.u, this.R, this.i);
    }

    public class02114 N(class02086 class020862) {
        this.R = class020862;
        return this;
    }

    public class02114 N(boolean bl) {
        this.i = bl;
        return this;
    }

    public class02114 N(int n) {
        this.u = n;
        return this;
    }
}

