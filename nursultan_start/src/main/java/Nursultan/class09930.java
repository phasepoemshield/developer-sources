/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09926;
import Nursultan.class09935;
import Nursultan.class09974;
import java.util.List;

final class class09930 {
    private final class09974 N = new class09974();
    private List<class09935> y = List.of();
    private List<class09935> L = List.of();
    private List<class09935> u = List.of();
    private List<class09935> i = List.of();
    private List<class09935> R = List.of();
    private class09926 M;
    private boolean B;

    List<class09935> L() {
        return this.u;
    }

    void M() {
        this.y = List.of();
        this.L = List.of();
        this.u = List.of();
        this.i = List.of();
        this.R = List.of();
        this.M = null;
        this.N.N();
        this.B = false;
    }

    class09930() {
    }

    List<class09935> i() {
        return this.R;
    }

    List<class09935> u() {
        return this.i;
    }

    List<class09935> y() {
        return this.L;
    }

    void N(List<class09935> list, List<class09935> list2, List<class09935> list3, List<class09935> list4, List<class09935> list5, class09926 class099262, int n, int n2, int n3, int n4, int n5) {
        this.y = class09930.N(list);
        this.L = class09930.N(list2);
        this.u = class09930.N(list3);
        this.i = class09930.N(list4);
        this.R = class09930.N(list5);
        this.M = class099262;
        this.N.y(n, n2, n3, n4, n5);
        this.B = true;
    }

    boolean N(int n, int n2, int n3, int n4, int n5) {
        return this.B && this.N.N(n, n2, n3, n4, n5);
    }

    private static List<class09935> N(List<class09935> list) {
        return list == null ? List.of() : list;
    }

    List<class09935> N() {
        return this.y;
    }

    class09926 R() {
        return this.M;
    }
}

