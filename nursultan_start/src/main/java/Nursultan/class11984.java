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

public class class11984
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public String L() {
        return (String)this.N_1;
    }

    public class11984(String string, String string2, int n) {
        this.u();
        this.N_0 = string;
        this.N_1 = string2;
        this.N_2 = n;
    }

    public class11984() {
        this.u();
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public String y() {
        return (String)this.N_0;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = class119402.P();
        this.N_2 = class119402.R();
    }

    public int N() {
        return (Integer)this.N_2;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.N((String)this.N_1);
        class119402.y((Integer)this.N_2);
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }
}

