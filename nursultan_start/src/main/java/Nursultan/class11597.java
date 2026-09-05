/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09946
 *  Nursultan.class11737
 */
package Nursultan;

import Nursultan.class09946;
import Nursultan.class11596;
import Nursultan.class11737;

public class class11597 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    private class11597(class11737 class117372) {
        this.i();
        this.N_5 = -1;
        this.N_6 = -1;
        this.N_7 = (class11596)((Object)class11596.E_0);
        this.N_0 = class117372;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
            this.N_3 = 0;
            this.N_4 = 0;
            this.N_5 = 0;
            this.N_6 = 0;
        }
    }

    static class11597 u() {
        return new class11597(class11737.LOADING);
    }

    class11596 N(int n, int n2) {
        if ((Integer)this.N_2 != 0) {
            return (class11596)((Object)this.N_7);
        }
        if ((class09946)this.N_1 == null || n == 0) {
            return (class11596)((Object)class11596.E_0);
        }
        if (((class11596)((Object)this.N_7)).Z() && (Integer)this.N_5 == n && (Integer)this.N_6 == n2) {
            return (class11596)((Object)this.N_7);
        }
        this.N_5 = n;
        this.N_6 = n2;
        this.N_7 = class11596.N(n, (Integer)this.N_3, (Integer)this.N_4, ((class09946)this.N_1).R(), ((class09946)this.N_1).M(), ((class09946)this.N_1).B(), ((class09946)this.N_1).Z());
        return (class11596)((Object)this.N_7);
    }
}

