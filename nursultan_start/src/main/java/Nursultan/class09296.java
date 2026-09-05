/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09263
 *  Nursultan.class11940
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class11940;
import Nursultan.class11951;

public class class09296
implements class11951<class09263> {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class09296() {
        this.R();
    }

    public class09296(String string, long l) {
        this.R();
        this.N_0 = string;
        this.N_1 = l;
    }

    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = class119402.M();
    }

    public String y() {
        return (String)this.N_0;
    }

    public long N() {
        return (Long)this.N_1;
    }

    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.N(((Long)this.N_1).longValue());
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0L;
        }
    }
}

