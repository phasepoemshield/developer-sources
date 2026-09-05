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

public class class11955
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public char L() {
        return ((Character)this.N_0).charValue();
    }

    public class11955() {
        this.Z();
    }

    public class11955(char c, int n, String string, String string2, boolean bl, boolean bl2) {
        this.Z();
        this.N_0 = Character.valueOf(c);
        this.N_1 = n;
        this.N_2 = string;
        this.N_3 = string2;
        this.N_4 = bl;
        this.N_5 = bl2;
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Character.valueOf('\u0000');
            this.N_1 = 0;
            this.N_4 = false;
            this.N_5 = false;
        }
    }

    public String i() {
        return (String)this.N_3;
    }

    public int u() {
        return (Integer)this.N_1;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = Character.valueOf(class119402.u());
        this.N_1 = (int)class119402.E();
        this.N_2 = class119402.P();
        this.N_3 = class119402.P();
        this.N_4 = class119402.B();
        this.N_5 = class119402.B();
    }

    public boolean y() {
        return (Boolean)this.N_4;
    }

    public String N() {
        return (String)this.N_2;
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(((Character)this.N_0).charValue());
        class119402.L((Integer)this.N_1);
        class119402.N((String)this.N_2);
        class119402.N((String)this.N_3);
        class119402.N((Boolean)this.N_4);
        class119402.N((Boolean)this.N_5);
    }

    public boolean R() {
        return (Boolean)this.N_5;
    }
}

