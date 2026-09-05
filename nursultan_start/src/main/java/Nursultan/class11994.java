/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11535
 */
package Nursultan;

import Nursultan.class11535;

public class class11994
extends class11535 {
    public Object N_0;
    public boolean N_init;

    public class11994(String string, boolean bl, float f) {
        super(string, bl);
        this.i();
        this.N_0 = Float.valueOf(f);
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
        }
    }

    public float N() {
        this.i();
        return ((Float)this.N_0).floatValue();
    }
}

