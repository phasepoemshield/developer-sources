/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.UUID;

public class class11815 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11815(UUID uUID, boolean bl) {
        this.i();
        this.N_0 = uUID;
        this.N_1 = bl;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = false;
        }
    }

    public UUID y() {
        return (UUID)this.N_0;
    }

    public class11815 N(UUID uUID) {
        this.N_0 = uUID;
        return this;
    }

    public class11815 N(boolean bl) {
        this.N_1 = bl;
        return this;
    }

    public boolean N() {
        return (Boolean)this.N_1;
    }
}

