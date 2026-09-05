/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11535;

public class class11443
extends class11535 {
    public Object N_0;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    public class11443(String string, int n, boolean bl) {
        super(string, bl);
        this.L();
        this.N_0 = n;
    }

    public int N() {
        this.L();
        return (Integer)this.N_0;
    }
}

