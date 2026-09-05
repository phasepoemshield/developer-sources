/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11462;

public class class11461
extends class11462 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    @Override
    public boolean L() {
        this.z();
        if (((Boolean)this.N_2).booleanValue()) {
            return true;
        }
        return (Integer)this.N_0 <= 0 && super.L();
    }

    public class11461(int n, int n2, Runnable runnable) {
        super(n, runnable);
        this.z();
        this.N_0 = n;
        this.N_1 = n2;
    }

    public class11461(int n, Runnable runnable) {
        super(n, runnable);
        this.z();
        this.N_0 = 0;
        this.N_1 = 0;
    }

    public void i() {
        this.z();
        this.N_2 = true;
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
            this.N_1 = 0;
            this.N_2 = false;
        }
    }

    @Override
    public boolean u() {
        this.z();
        if (((Boolean)this.N_2).booleanValue()) {
            return false;
        }
        if ((Integer)this.N_0 <= 0) {
            return super.u();
        }
        int n = (Integer)this.N_1 - 1;
        this.N_1 = n;
        if (n < 0 && super.u()) {
            this.y_0 = (int)((Integer)this.N_0);
        }
        return false;
    }

    public boolean y() {
        this.z();
        return (Boolean)this.N_2;
    }

    public int N() {
        this.z();
        return (Integer)this.N_1;
    }

    public int R() {
        this.z();
        return (Integer)this.N_0;
    }
}

