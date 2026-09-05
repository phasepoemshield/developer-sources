/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11536;
import Nursultan.class12018;

public class class11515
extends class11536<Integer> {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public boolean L() {
        this.M();
        return (Boolean)this.N_1;
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
            this.N_1 = false;
        }
    }

    public class11515(class12018 class120182, int n) {
        super(class120182, n);
        this.M();
        this.N_0 = true;
    }

    public boolean y() {
        this.M();
        return (Boolean)this.N_0;
    }

    public class11515 y(boolean bl) {
        this.M();
        this.N_1 = bl;
        return this;
    }

    public class11515 N(boolean bl) {
        this.M();
        this.N_0 = bl;
        return this;
    }
}

