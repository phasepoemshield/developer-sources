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
import Nursultan.class11966;

public class class11958
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    public class11958() {
        this.i();
    }

    public class11958(class11966 class119662, String string) {
        this.i();
        this.N_0 = class119662;
        this.N_1 = string;
    }

    private void i() {
    }

    public String y() {
        return (String)this.N_1;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.N(class11966.class);
        this.N_1 = class119402.P();
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    public class11966 N() {
        return (class11966)((Object)this.N_0);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((class11966)((Object)this.N_0));
        class119402.N((String)this.N_1);
    }
}

