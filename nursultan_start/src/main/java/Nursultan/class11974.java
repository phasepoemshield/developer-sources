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

public class class11974
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    public class11974(String string, String string2) {
        this.u();
        this.N_0 = string;
        this.N_1 = string2;
    }

    public class11974() {
        this.u();
    }

    private void u() {
    }

    public String y() {
        return (String)this.N_0;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = class119402.P();
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.N((String)this.N_1);
    }

    public String N() {
        return (String)this.N_1;
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }
}

