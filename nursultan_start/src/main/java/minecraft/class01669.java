/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02276
 *  minecraft.class02566
 *  minecraft.class04995
 */
package minecraft;

import java.util.Objects;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02276;
import minecraft.class02566;
import minecraft.class04995;

public abstract class class01669 {
    protected static final int N = 60;
    protected static final int y = 1;
    protected final class01590 L;
    protected final class02276 u;

    protected void L(class01054 class010542, int n, int n2, int n3) {
    }

    protected class01669(class01590 class015902, class02276 class022762) {
        this.L = class015902;
        this.u = class022762;
    }

    protected void u(class01054 class010542, int n, int n2, int n3) {
    }

    protected void y(class01054 class010542, int n, int n2, int n3) {
        long l = this.u.N(n3);
        int n4 = this.y(l);
        int n5 = this.N(l);
        class010542.N(n2, n - n4, n2 + 1, n, n5);
    }

    protected long y(int n) {
        return this.u.N(n);
    }

    protected abstract int y(double var1);

    protected abstract String N(double var1);

    public int N(int n) {
        return Math.min(this.u.L() + 2, n);
    }

    protected abstract int N(long var1);

    protected int N(double d, double d2, int n, double d3, int n2, double d4, int n3) {
        if ((d = class04995.N((double)d, (double)d2, (double)d4)) < d3) {
            return class02566.N((float)((float)((d - d2) / (d3 - d2))), (int)n, (int)n2);
        }
        return class02566.N((float)((float)((d - d3) / (d4 - d3))), (int)n2, (int)n3);
    }

    protected void N(class01054 class010542, int n, int n2, int n3) {
        this.y(class010542, n, n2, n3);
        this.L(class010542, n, n2, n3);
    }

    public void N(class01054 class010542, int n, int n2) {
        int n3 = class010542.y();
        class010542.N(n, n3 - 60, n + n2, n3, -1873784752);
        long l = 0L;
        long l2 = Integer.MAX_VALUE;
        long l3 = Integer.MIN_VALUE;
        int n4 = Math.max(0, this.u.L() - (n2 - 2));
        int n5 = this.u.u() - n4;
        for (int i = 0; i < n5; ++i) {
            int n6 = n + i + 1;
            int n7 = n4 + i;
            long l4 = this.y(n7);
            l2 = Math.min(l2, l4);
            l3 = Math.max(l3, l4);
            l += l4;
            this.N(class010542, n3, n6, n7);
        }
        class010542.N(n, n + n2 - 1, n3 - 60, -1);
        class010542.N(n, n + n2 - 1, n3 - 1, -1);
        class010542.y(n, n3 - 60, n3, -1);
        class010542.y(n + n2 - 1, n3 - 60, n3, -1);
        if (n5 > 0) {
            String string = this.N((double)l2) + " min";
            String string2 = this.N((double)l / (double)n5) + " avg";
            String string3 = this.N((double)l3) + " max";
            Objects.requireNonNull(this.L);
            class010542.y(this.L, string, n + 2, n3 - 60 - 9, -2039584);
            int n8 = n + n2 / 2;
            Objects.requireNonNull(this.L);
            class010542.N(this.L, string2, n8, n3 - 60 - 9, -2039584);
            int n9 = n + n2 - this.L.y(string3) - 2;
            Objects.requireNonNull(this.L);
            class010542.y(this.L, string3, n9, n3 - 60 - 9, -2039584);
        }
        this.u(class010542, n, n2, n3);
    }

    public int N() {
        Objects.requireNonNull(this.L);
        return 60 + 9;
    }

    protected void N(class01054 class010542, String string, int n, int n2) {
        int n3 = n + this.L.y(string) + 1;
        Objects.requireNonNull(this.L);
        class010542.N(n, n2, n3, n2 + 9, -1873784752);
        class010542.N(this.L, string, n + 1, n2 + 1, -2039584, false);
    }
}

