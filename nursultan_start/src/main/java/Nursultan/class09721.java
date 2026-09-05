/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09960
 */
package Nursultan;

import Nursultan.class09723;
import Nursultan.class09960;

final class class09721 {
    private final int[] N;
    private final int[] y;
    private final int[] L;
    private final int[] u;
    private int i;
    private boolean R;

    class09960[] L() {
        class09960[] class09960Array = this.y();
        this.u();
        return class09960Array;
    }

    class09721(int n) {
        this.N = new int[n];
        this.y = new int[n];
        this.L = new int[n];
        this.u = new int[n];
    }

    void u() {
        this.i = 0;
        this.R = false;
    }

    private void y(int n, int n2, int n3, int n4) {
        int n5 = n;
        int n6 = n2;
        int n7 = n + n3;
        int n8 = n2 + n4;
        for (int i = 0; i < this.i; ++i) {
            n5 = Math.min(n5, this.N[i]);
            n6 = Math.min(n6, this.y[i]);
            n7 = Math.max(n7, this.N[i] + this.L[i]);
            n8 = Math.max(n8, this.y[i] + this.u[i]);
        }
        this.N[0] = n5;
        this.y[0] = n6;
        this.L[0] = n7 - n5;
        this.u[0] = n8 - n6;
        this.i = 1;
    }

    class09960[] y() {
        if (this.i == 0) {
            return class09723.L;
        }
        class09960[] class09960Array = new class09960[this.i];
        for (int i = 0; i < this.i; ++i) {
            class09960Array[i] = new class09960(this.N[i], this.y[i], this.L[i], this.u[i]);
        }
        return class09960Array;
    }

    private boolean N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return n <= n5 + n7 && n5 <= n + n3 && n2 <= n6 + n8 && n6 <= n2 + n4;
    }

    private void N(int n) {
        int n2 = this.i - 1;
        this.N[n] = this.N[n2];
        this.y[n] = this.y[n2];
        this.L[n] = this.L[n2];
        this.u[n] = this.u[n2];
        this.i = n2;
    }

    boolean N() {
        return this.R;
    }

    void N(int n, int n2, int n3, int n4) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        this.R = true;
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        int n9 = 0;
        while (n9 < this.i) {
            if (this.N(n5, n6, n7, n8, this.N[n9], this.y[n9], this.L[n9], this.u[n9])) {
                int n10 = Math.min(n5, this.N[n9]);
                int n11 = Math.min(n6, this.y[n9]);
                int n12 = Math.max(n5 + n7, this.N[n9] + this.L[n9]);
                int n13 = Math.max(n6 + n8, this.y[n9] + this.u[n9]);
                n5 = n10;
                n6 = n11;
                n7 = n12 - n10;
                n8 = n13 - n11;
                this.N(n9);
                n9 = 0;
                continue;
            }
            ++n9;
        }
        if (this.i < this.N.length) {
            this.N[this.i] = n5;
            this.y[this.i] = n6;
            this.L[this.i] = n7;
            this.u[this.i] = n8;
            ++this.i;
            return;
        }
        this.y(n5, n6, n7, n8);
    }
}

