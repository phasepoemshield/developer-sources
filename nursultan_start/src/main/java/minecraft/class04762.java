/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05010
 *  minecraft.class07321
 */
package minecraft;

import minecraft.class05010;
import minecraft.class07321;

public abstract class class04762
extends class05010 {
    protected class04762(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public void y(long l, int n, boolean bl) {
        this.N(class07321.L, l, n, bl);
    }

    protected int y(long l, long l2, int n) {
        if (l == class07321.L) {
            return this.y(l2);
        }
        return n + 1;
    }

    protected abstract int y(long var1);

    protected void N(long l, int n, boolean bl) {
        if (bl && n >= this.R - 2) {
            return;
        }
        class07321 class073212 = new class07321(l);
        int n2 = class073212.B;
        int n3 = class073212.Z;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                long l2 = class07321.u((int)(n2 + i), (int)(n3 + j));
                if (l2 == l) continue;
                this.y(l, l2, n, bl);
            }
        }
    }

    protected boolean N(long l) {
        return l == class07321.L;
    }

    protected int N(long l, long l2, int n) {
        int n2 = n;
        class07321 class073212 = new class07321(l);
        int n3 = class073212.B;
        int n4 = class073212.Z;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                long l3 = class07321.u((int)(n3 + i), (int)(n4 + j));
                if (l3 == l) {
                    l3 = class07321.L;
                }
                if (l3 == l2) continue;
                int n5 = this.y(l3, l, this.L(l3));
                if (n2 > n5) {
                    n2 = n5;
                }
                if (n2 != 0) continue;
                return n2;
            }
        }
        return n2;
    }
}

