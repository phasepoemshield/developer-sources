/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class11940;
import Nursultan.class11951;

public class class09278
implements class11951<class09263> {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    public class09278(String string, float f) {
        this.L();
        this.N_0 = string;
        this.N_1 = Float.valueOf(f);
    }

    public class09278() {
        this.L();
    }

    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = Float.valueOf(class119402.Z());
    }

    public String y() {
        return (String)this.N_0;
    }

    public float N() {
        return ((Float)this.N_1).floatValue();
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.N(((Float)this.N_1).floatValue());
    }
}

