/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class11938;

public class class11478 {
    public Object N_0;

    public class11478() {
        this.u();
    }

    private void u() {
        this.N_0 = 0;
    }

    public class11478 y(int n) {
        this.N_0 = n;
        return this;
    }

    public void y() {
        this.N_0 = class11938.j().y();
    }

    public boolean N(int n) {
        return (Integer)this.N_0 + n <= class11938.j().y();
    }

    public int N() {
        return class11938.j().y() - (Integer)this.N_0;
    }
}

