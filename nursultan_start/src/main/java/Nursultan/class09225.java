/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09819
 */
package Nursultan;

import Nursultan.class09819;

public class class09225
implements class09819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    class09225(float f) {
        this.R();
        this.N_3 = () -> {};
        this.N_0 = Float.valueOf(f);
    }

    void i() {
        this.N_1 = true;
        this.N_2 = Float.valueOf(0.0f);
    }

    void y() {
        this.N_1 = false;
        this.N_2 = Float.valueOf(0.0f);
    }

    public boolean N(float f) {
        if (!((Boolean)this.N_1).booleanValue()) {
            return false;
        }
        this.N_2 = Float.valueOf(((Float)this.N_2).floatValue() + f);
        if (((Float)this.N_2).floatValue() >= ((Float)this.N_0).floatValue()) {
            this.N_1 = false;
            ((Runnable)this.N_3).run();
            return true;
        }
        return false;
    }

    void N(Runnable runnable) {
        this.N_3 = runnable == null ? () -> {} : runnable;
    }

    public boolean N() {
        return (Boolean)this.N_1;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = false;
            this.N_2 = Float.valueOf(0.0f);
        }
    }
}

