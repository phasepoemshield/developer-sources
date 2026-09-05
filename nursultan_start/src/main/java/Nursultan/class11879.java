/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09753
 *  Nursultan.class09780
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09753;
import Nursultan.class09780;
import Nursultan.class11833;
import Nursultan.class11863;

public class class11879
implements class09780 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    public class11879(int n, int n2, class11863 class118632) {
        this.u();
        this.N_0 = new class11833(class09662.N((int)n), class09662.N((int)n2), class118632);
        this.N_1 = new class11833(class09662.y((int)n), class09662.y((int)n2), class118632);
        this.N_2 = new class11833(class09662.L((int)n), class09662.L((int)n2), class118632);
        this.N_3 = new class11833(class09662.u((int)n), class09662.u((int)n2), class118632);
    }

    private void u() {
    }

    public boolean y() {
        return ((class11833)this.N_0).y() && ((class11833)this.N_1).y() && ((class11833)this.N_2).y() && ((class11833)this.N_3).y();
    }

    public boolean N(class09753 class097532) {
        int n = class097532.L();
        ((class11833)this.N_0).y(class09662.N((int)n));
        ((class11833)this.N_1).y(class09662.y((int)n));
        ((class11833)this.N_2).y(class09662.L((int)n));
        ((class11833)this.N_3).y(class09662.u((int)n));
        return true;
    }

    public boolean N(float f) {
        boolean bl = ((class11833)this.N_0).N(f);
        bl |= ((class11833)this.N_1).N(f);
        bl |= ((class11833)this.N_2).N(f);
        return bl |= ((class11833)this.N_3).N(f);
    }

    public class09753 N() {
        return class09753.N((int)class09662.N((int)Math.round(((class11833)this.N_1).L()), (int)Math.round(((class11833)this.N_2).L()), (int)Math.round(((class11833)this.N_3).L()), (int)Math.round(((class11833)this.N_0).L())));
    }
}

