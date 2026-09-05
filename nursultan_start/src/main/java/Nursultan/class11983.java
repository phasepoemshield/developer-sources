/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11940;
import Nursultan.class11951;

public class class11983
implements class11951<class09276> {
    public Object N_0;
    public boolean N_init;

    public class11983(int n) {
        this.u();
        this.N_0 = n;
    }

    public class11983() {
        this.u();
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = (int)class119402.E();
    }

    @Override
    public void N(class11940 class119402) {
        class119402.L((Integer)this.N_0);
    }

    public int N() {
        return (Integer)this.N_0;
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }
}

