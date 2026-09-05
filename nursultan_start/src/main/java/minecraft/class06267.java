/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06250
 */
package minecraft;

import minecraft.class06250;

public interface class06267 {
    default public int L() {
        int n = 0;
        for (int i = 0; i < 16; ++i) {
            n |= this.N(i);
        }
        return n;
    }

    default public int u() {
        int n;
        int n2;
        int n3 = this.L();
        int n4 = this.N();
        if (n3 == 0) {
            n2 = 0;
            n = n4;
        } else {
            n2 = Integer.numberOfLeadingZeros(n3);
            n = 32 - Integer.numberOfTrailingZeros(n3) - 1;
        }
        return class06250.N((int)n2, (int)n);
    }

    public int N();

    public int N(int var1);
}

