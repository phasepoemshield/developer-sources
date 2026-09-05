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
import Nursultan.class11976;

public class class11945
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    public class11945() {
        this.L();
    }

    public class11945(class11976 class119762, String string) {
        this.L();
        this.N_0 = class119762;
        this.N_1 = string;
    }

    public class11976 y() {
        return (class11976)((Object)this.N_0);
    }

    @Override
    public void y(class11940 class119402) {
        this.N_1 = class119402.P();
        this.N_0 = class119402.N(class11976.class);
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((String)this.N_1);
        class119402.N((class11976)((Object)this.N_0));
    }

    public String N() {
        return (String)this.N_1;
    }
}

