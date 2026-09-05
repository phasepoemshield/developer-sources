/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11784 {
    public Object N_0;
    public boolean N_init;

    public class11784() {
        this.i();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    public boolean y() {
        return (Boolean)this.N_0;
    }

    public class11784 N(boolean bl) {
        this.N_0 = bl;
        return this;
    }

    public void N() {
        this.N_0 = true;
    }
}

