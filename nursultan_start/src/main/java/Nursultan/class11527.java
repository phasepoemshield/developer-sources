/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11389
 *  Nursultan.class12002
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11389;
import Nursultan.class11536;
import Nursultan.class12002;
import Nursultan.class12018;

public class class11527
extends class11536<class12002> {
    public Object N_0;
    public boolean N_init;

    public int L() {
        this.R();
        return (Integer)this.N_0;
    }

    public class11527(class12018 class120182, class12002 class120022) {
        super(class120182, class120022);
        this.R();
    }

    @Override
    public void u() {
        this.R();
        this.N_0 = 0;
        super.u();
    }

    public boolean N(class11389 class113892) {
        this.R();
        return class113892.y((class12002)this.i(), ((Integer)this.N_0).intValue());
    }

    public void N(class12002 class120022, int n) {
        this.R();
        this.N_0 = n;
        this.N(class120022);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    @Override
    public boolean c_() {
        this.R();
        return (Integer)this.N_0 != 0 || super.c_();
    }
}

