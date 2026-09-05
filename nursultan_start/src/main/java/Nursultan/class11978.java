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

public class class11978
implements class11951<class09276> {
    public Object N_0;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
        }
    }

    public class11978() {
        this.L();
    }

    public class11978(long l) {
        this.L();
        this.N_0 = l;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.M();
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((Long)this.N_0);
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    public long N() {
        return (Long)this.N_0;
    }
}

