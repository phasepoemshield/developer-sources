/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11535;

public class class11420
extends class11535 {
    public Object N_0;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public class11420(String string, boolean bl, boolean bl2) {
        super(string, bl2);
        this.L();
        this.N_0 = bl;
    }

    public boolean N() {
        this.L();
        return (Boolean)this.N_0;
    }
}

