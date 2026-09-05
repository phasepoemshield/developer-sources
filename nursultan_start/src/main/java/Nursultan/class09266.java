/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09295
 *  Nursultan.class11940
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class09295;
import Nursultan.class11940;
import Nursultan.class11951;

public class class09266
implements class11951<class09263> {
    public Object N_0;

    public class09266() {
        this.u();
    }

    public class09266(class09295[] class09295Array) {
        this.u();
        this.N_0 = class09295Array;
    }

    private void u() {
    }

    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = new class09295[n];
        for (int i = 0; i < n; ++i) {
            String string = class119402.P();
            String string2 = class119402.P();
            boolean bl = class119402.B();
            ((class09295[])this.N_0)[i] = new class09295(string, string2, bl);
        }
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public class09295[] N() {
        return (class09295[])this.N_0;
    }

    public void N(class11940 class119402) {
        class119402.y(((class09295[])this.N_0).length);
        for (class09295 class092952 : (class09295[])this.N_0) {
            class119402.N(class092952.y());
            class119402.N(class092952.N());
            class119402.N(class092952.L());
        }
    }
}

