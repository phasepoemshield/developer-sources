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

public class class09273
implements class11951<class09263> {
    public Object N_0;
    public boolean N_init;

    public class09273() {
        this.u();
    }

    public class09273(long l) {
        this.u();
        this.N_0 = l;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
        }
    }

    public void y(class11940 class119402) {
        this.N_0 = class119402.M();
    }

    public void N(class11940 class119402) {
        class119402.N(((Long)this.N_0).longValue());
    }

    public long N() {
        return (Long)this.N_0;
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }
}

