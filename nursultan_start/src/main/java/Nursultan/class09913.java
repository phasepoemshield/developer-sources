/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class10021;
import java.util.List;

final class class09913 {
    private List<class10021> N = List.of();
    private int y;
    private int L;
    private boolean u;

    class09913() {
    }

    void N(List<class10021> list, int n, int n2, int n3) {
        this.N = list == null || list.isEmpty() ? List.of() : List.copyOf(list);
        this.y = n;
        this.L = n2;
        this.u = !this.N.isEmpty() || n3 == 0;
    }

    List<class10021> N() {
        return this.N;
    }

    boolean N(int n, int n2, int n3) {
        return this.u && this.y == n && this.L == n2 && this.N.size() == n3;
    }
}

