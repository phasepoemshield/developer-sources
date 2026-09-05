/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class04995
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class01296;
import minecraft.class04995;
import minecraft.class06889;

public final class class08728 {
    private int N;
    private int y;
    private int L;

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof class08728) {
            class08728 class087282 = (class08728)object;
            return this.N == class087282.N && this.y == class087282.y && this.L == class087282.L;
        }
        return false;
    }

    public class08728 y(class06889 class068892, long l) {
        this.N = class08728.N(class068892.N(), class01296.y((long)l));
        this.y = class08728.N(class068892.y(), class01296.L((long)l));
        this.L = class08728.N(class068892.L(), class01296.u((long)l));
        return this;
    }

    private static int N(double d, int n) {
        return class04995.N((int)(class01296.y((double)d) - n), (int)-1, (int)1);
    }

    public boolean N() {
        return this.N == 0 || this.y == 0 || this.L == 0;
    }

    public static class08728 N(class06889 class068892, long l) {
        return new class08728().y(class068892, l);
    }
}

