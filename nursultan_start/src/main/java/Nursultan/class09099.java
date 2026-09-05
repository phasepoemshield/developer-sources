/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  minecraft.class00405
 */
package Nursultan;

import Nursultan.class09090;
import Nursultan.class09102;
import Nursultan.class09719;
import minecraft.class00405;

public class class09099
implements class09102 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    float L() {
        return Math.round(((Float)this.N_1).floatValue());
    }

    class09099() {
        this.B();
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    @Override
    public void y() {
        float f = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
        if (f > ((Float)this.N_1).floatValue()) {
            this.N_1 = Float.valueOf(f);
        }
    }

    @Override
    public void N() {
        float f = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
        if (f > ((Float)this.N_1).floatValue()) {
            this.N_1 = Float.valueOf(f);
        }
    }

    void N(class09090 class090902) {
        this.N_0 = class090902;
        this.N_1 = Float.valueOf(0.0f);
    }

    @Override
    public void N(int n, class00405 class004052, boolean bl, class09719 class097192, float f) {
        float f2 = ((class09090)this.N_0).R() - ((class09090)this.N_0).N() + f;
        if (f2 > ((Float)this.N_1).floatValue()) {
            this.N_1 = Float.valueOf(f2);
        }
    }
}

