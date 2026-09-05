/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09723
 */
package Nursultan;

import Nursultan.class09723;

public final class class09946 {
    private final class09723 N;
    private int y;
    private int L;
    private int u;
    private int i;
    private boolean R;

    public int L() {
        return this.u;
    }

    public float M() {
        return (float)this.L / (float)this.N.L();
    }

    class09946(class09723 class097232) {
        this.N = class097232;
    }

    public float B() {
        return (float)(this.y + this.u) / (float)this.N.y();
    }

    public float Z() {
        return (float)(this.L + this.i) / (float)this.N.L();
    }

    public boolean i() {
        return this.R;
    }

    void U() {
        this.y = 0;
        this.L = 0;
        this.u = 0;
        this.i = 0;
        this.R = false;
    }

    class09723 z() {
        return this.N;
    }

    public int u() {
        return this.i;
    }

    public int y() {
        return this.L;
    }

    void N(int n, int n2, int n3, int n4) {
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = n4;
        this.R = true;
    }

    public int N() {
        return this.y;
    }

    public float R() {
        return (float)this.y / (float)this.N.y();
    }
}

