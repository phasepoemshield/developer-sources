/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09969
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09969;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10052;

final class class10055 {
    private final class10052 N;

    class10055(class10052 class100522) {
        this.N = class100522;
    }

    private int N(class10021 class100212, class09980 class099802) {
        if (!class099802.T()) {
            return class099802.b();
        }
        if (class099802.s() != class09969.FLOATING) {
            return 0;
        }
        return 1000 + this.N.M();
    }

    private void N(class10021 class100212, int n) {
        ++this.N.i().N;
        class100212.y(n);
        class100212.c().N(this.N(class100212, class100212.o()));
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            this.N(class100213, n + 1);
        }
    }

    void N() {
        this.N(this.N.N(), 0);
    }
}

