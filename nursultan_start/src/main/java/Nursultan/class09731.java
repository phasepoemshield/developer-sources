/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;

public final class class09731 {
    boolean N;
    int y;
    int L;
    int u;
    int i;
    int R;
    int[] M = new int[64];

    public int L() {
        return this.y;
    }

    public int L(int n) {
        return this.M[n * 4 + 2];
    }

    public int M() {
        return this.R;
    }

    void B() {
        this.N = false;
        this.R = 0;
    }

    void Z() {
        this.R = 0;
    }

    public int i() {
        return this.u;
    }

    public int u(int n) {
        return this.M[n * 4 + 3];
    }

    public int u() {
        return this.L;
    }

    public int y(int n) {
        return this.M[n * 4 + 1];
    }

    public boolean y() {
        return this.N;
    }

    void N(int n, int n2, int n3, int n4) {
        int n5 = this.R * 4;
        if (n5 + 4 > this.M.length) {
            this.M = Arrays.copyOf(this.M, this.M.length * 2);
        }
        this.M[n5] = n;
        this.M[n5 + 1] = n2;
        this.M[n5 + 2] = n3;
        this.M[n5 + 3] = n4;
        ++this.R;
    }

    public boolean N() {
        return this.N || this.R > 0;
    }

    public int N(int n) {
        return this.M[n * 4];
    }

    public int R() {
        return this.i;
    }
}

