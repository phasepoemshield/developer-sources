/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09935
 */
package Nursultan;

import Nursultan.class09935;
import java.util.List;

final class class10011 {
    private List<class09935> N = List.of();
    private int y;
    private int L;
    private int u;
    private int i;
    private int R;
    private boolean M;

    void L() {
        this.N = List.of();
        this.y = 0;
        this.L = 0;
        this.u = 0;
        this.i = 0;
        this.R = 0;
        this.M = false;
    }

    class10011() {
    }

    int y() {
        return this.y;
    }

    void N(List<class09935> list, int n, int n2, int n3, int n4, int n5) {
        if (list == null || list.isEmpty() || n <= 0) {
            this.L();
            return;
        }
        this.N = List.copyOf(list);
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = n4;
        this.R = n5;
        this.M = true;
    }

    void N(int n) {
        this.R = n;
    }

    boolean N(int n, int n2) {
        return this.M && this.R == n && this.L == n2;
    }

    boolean N(int n, int n2, int n3) {
        return this.M && this.L == n && this.u == n2 && this.i == n3;
    }

    List<class09935> N() {
        return this.N;
    }
}

