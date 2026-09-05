/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11828
 */
package Nursultan;

import Nursultan.class11828;

public class class11802 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11802(String string) {
        this.i();
        this.N_0 = string;
        class11828 class118282 = class11828.N((String)string);
        this.N_1 = class118282 == null ? 0 : class118282.N();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    public String y() {
        return (String)this.N_0;
    }

    public int N() {
        return (Integer)this.N_1;
    }
}

