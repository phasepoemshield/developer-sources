/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11462;

public class class11474
extends class11462 {
    public Object N_0;
    public Object N_1;

    @Override
    public boolean L() {
        return false;
    }

    public class11474(int n, int n2, Runnable runnable) {
        super(n, runnable);
        this.i();
        this.N_0 = n;
        this.N_1 = n2;
    }

    private void i() {
        this.N_0 = 0;
        this.N_1 = 0;
    }

    @Override
    public boolean u() {
        this.i();
        int n = (Integer)this.N_1 - 1;
        this.N_1 = n;
        if (n < 0 && super.u()) {
            this.y_0 = (int)((Integer)this.N_0);
        }
        return false;
    }
}

