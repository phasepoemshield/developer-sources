/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03447;

class class03444 {
    class03447<?> N = class03447.N;
    int y = -1;
    boolean L;

    class03444() {
    }

    public class03444 N(int n, class03447<?> class034472) {
        if (!this.N.equals(class034472)) {
            this.N = class034472;
            this.L = false;
        } else if (this.y + 1 != n) {
            this.L = false;
        }
        this.y = n;
        return this;
    }
}

