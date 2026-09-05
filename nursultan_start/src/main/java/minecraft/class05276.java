/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05237;
import org.jspecify.annotations.Nullable;

class class05276 {
    final int N;
    final int y;
    private final int L;
    private final int u;
    private @Nullable class05276 i;
    private @Nullable class05276 R;
    private boolean M;

    class05276(int n, int n2, int n3, int n4) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
    }

    @Nullable class05276 N(class05237 class052372) {
        if (this.i != null && this.R != null) {
            class05276 class052762 = this.i.N(class052372);
            if (class052762 == null) {
                class052762 = this.R.N(class052372);
            }
            return class052762;
        }
        if (this.M) {
            return null;
        }
        int n = class052372.method_2031();
        int n2 = class052372.method_2032();
        if (n > this.L || n2 > this.u) {
            return null;
        }
        if (n == this.L && n2 == this.u) {
            this.M = true;
            return this;
        }
        int n3 = this.L - n;
        int n4 = this.u - n2;
        if (n3 > n4) {
            this.i = new class05276(this.N, this.y, n, this.u);
            this.R = new class05276(this.N + n + 1, this.y, this.L - n - 1, this.u);
        } else {
            this.i = new class05276(this.N, this.y, this.L, n2);
            this.R = new class05276(this.N, this.y + n2 + 1, this.L, this.u - n2 - 1);
        }
        return this.i.N(class052372);
    }
}

