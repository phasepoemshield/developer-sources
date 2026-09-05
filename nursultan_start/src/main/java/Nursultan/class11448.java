/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 */
package Nursultan;

import Nursultan.class11410;
import Nursultan.class11940;

public abstract class class11448 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11448(class11410 class114102, boolean bl) {
        this.R();
        this.N_0 = class114102;
        this.N_1 = bl;
    }

    public boolean y() {
        return (Boolean)this.N_1;
    }

    public abstract void N(class11940 var1);

    public class11410 N() {
        return (class11410)((Object)this.N_0);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = false;
        }
    }
}

