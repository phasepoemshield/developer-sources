/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09759
 *  Nursultan.class09819
 */
package Nursultan;

import Nursultan.class09759;
import Nursultan.class09819;

public class class11608
implements class09819 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    float L() {
        return class09759.EASE_OUT.N(((Float)this.N_0).floatValue());
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    public class11608() {
        this.M();
    }

    float B() {
        return ((Float)this.N_0).floatValue();
    }

    void N(boolean bl) {
        this.N_1 = Float.valueOf(bl ? 1.0f : 0.0f);
    }

    public boolean N() {
        return ((Float)this.N_0).floatValue() != ((Float)this.N_1).floatValue();
    }

    public boolean N(float f) {
        float f2 = f / 0.18f;
        this.N_0 = ((Float)this.N_0).floatValue() < ((Float)this.N_1).floatValue() ? Float.valueOf(Math.min(((Float)this.N_1).floatValue(), ((Float)this.N_0).floatValue() + f2)) : Float.valueOf(Math.max(((Float)this.N_1).floatValue(), ((Float)this.N_0).floatValue() - f2));
        return true;
    }
}

