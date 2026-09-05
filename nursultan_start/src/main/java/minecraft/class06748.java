/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06723
 *  minecraft.class06730
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06723;
import minecraft.class06730;
import minecraft.class07536;

public class class06748
implements class06723 {
    private final class06730 N;
    private boolean y;
    private long L;
    private long u;
    private boolean i;

    public boolean L() {
        return this.y;
    }

    class06748(class06730 class067302) {
        this.N = class067302;
    }

    public class06730 i() {
        return this.N;
    }

    public long u() {
        return this.u;
    }

    public class06723 y() {
        this.i = true;
        return this;
    }

    public float N(long l) {
        if (this.i) {
            long l2 = this.u - this.L;
            long l3 = l - this.L;
            return 1.0f - class04995.N((float)((float)l3 / (float)l2), (float)0.0f, (float)1.0f);
        }
        return 1.0f;
    }

    public class06723 N() {
        this.y = true;
        return this;
    }

    public class06723 N(int n) {
        this.L = class07536.L();
        this.u = this.L + (long)n;
        return this;
    }
}

