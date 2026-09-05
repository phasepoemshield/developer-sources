/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09937
 *  Nursultan.class09975
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09937;
import Nursultan.class09975;
import Nursultan.class09980;
import Nursultan.class10009;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10030;
import Nursultan.class10036;
import Nursultan.class10048;
import Nursultan.class10049;
import Nursultan.class10053;

final class class10022 {
    private final class10030 N;
    private final class10053 y;
    private final float L;
    private final boolean u;

    class10022(class10030 class100302, class10053 class100532, float f, boolean bl) {
        this.N = class100302;
        this.y = class100532;
        this.L = f;
        this.u = bl;
    }

    private void y(class10021 class100212, class09980 class099802, float f, float f2, float f3, float f4) {
        class10009 class100092 = class099802.E();
        boolean bl = class10048.N(class100092);
        if (class099802.M() == class09975.ROW) {
            this.N(class100212, class099802, f, f2, f3, f4, class100092, bl);
            return;
        }
        this.y(class100212, class099802, f, f2, f3, f4, class100092, bl);
    }

    private void y(class10021 class100212, class09980 class099802, float f, float f2, float f3, float f4, class10009 class100092, boolean bl) {
        int n = 0;
        float f5 = 0.0f;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class10048.N(class100213)) continue;
            ++n;
            f5 += this.y.y(class100213);
        }
        if (n == 0) {
            return;
        }
        float f6 = class10048.N(n, class100092, f4 - f5);
        f5 += class10048.N(n, f6);
        float f7 = f2;
        if (!bl) {
            f7 += class10048.y(class099802.Z(), f4 - f5);
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100214 = class100212.N(i);
            if (!class10048.N(class100214)) continue;
            float f8 = f + class10048.N(class099802.B(), f3 - this.y.N(class100214));
            this.N(class100214, f8, f7);
            f7 += this.y.y(class100214) + f6;
        }
    }

    private float y(class10021 class100212) {
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class10048.N(class100213)) continue;
            ++n;
            f += this.y.y(class100213);
        }
        return f + class10048.N(n, class100212.o().E());
    }

    private void N(class10021 class100212, class09980 class099802, float f, float f2, float f3, float f4, class10009 class100092, boolean bl) {
        int n = 0;
        float f5 = 0.0f;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class10048.N(class100213)) continue;
            ++n;
            f5 += this.y.N(class100213);
        }
        if (n == 0) {
            return;
        }
        float f6 = class10048.N(n, class100092, f3 - f5);
        f5 += class10048.N(n, f6);
        float f7 = f;
        if (!bl) {
            f7 += class10048.y(class099802.B(), f3 - f5);
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100214 = class100212.N(i);
            if (!class10048.N(class100214)) continue;
            float f8 = f2 + class10048.N(class099802.Z(), f4 - this.y.y(class100214));
            this.N(class100214, f7, f8);
            f7 += this.y.N(class100214) + f6;
        }
    }

    private float N(float f) {
        return class10048.L(f, this.L);
    }

    void N(class10021 class100212) {
        this.N(class100212, 0.0f, 0.0f);
    }

    private void N(class10021 class100212, float f, float f2) {
        ++this.N.M;
        class09980 class099802 = class100212.o();
        class09937 class099372 = class100212.c();
        float f3 = this.y.N(class100212);
        float f4 = this.y.y(class100212);
        class099372.N(f3, f4);
        float f5 = this.N(f);
        float f6 = this.N(f2);
        class099372.L(f5, f6);
        class099372.u(f5, f6);
        class099372.y(this.N(f + f3) - f5, this.N(f2 + f4) - f6);
        float f7 = f + class10048.i(class099802, class10036.WIDTH);
        float f8 = f2 + class10048.i(class099802, class10036.HEIGHT);
        float f9 = Math.max(0.0f, f3 - class10048.u(class099802, class10036.WIDTH) - class10048.N(class099802));
        float f10 = Math.max(0.0f, f4 - class10048.u(class099802, class10036.HEIGHT));
        float f11 = this.N(f7);
        float f12 = this.N(f8);
        class099372.N(f11, f12, this.N(f7 + f9) - f11, this.N(f8 + f10) - f12);
        if (this.u) {
            this.N(class100212, class099372);
            this.N(class100212, class099372, class099802, f10);
        }
        this.N(class100212, class099802, f7, f8, f9, f10);
    }

    private void N(class10021 class100212, class09937 class099372) {
        if (class100212.y() == class10049.TEXT) {
            class099372.N(Math.max(0.0f, class099372.Z()));
            String string = this.y.L(class100212);
            class099372.N(string == null ? class100212.B() : string);
            return;
        }
        class099372.N(0.0f);
        class099372.N("");
    }

    private void N(class10021 class100212, class09937 class099372, class09980 class099802, float f) {
        float f2 = 0.0f;
        if (class099802.y()) {
            f2 = Math.max(0.0f, this.y(class100212) - f);
        }
        class099372.i(f2, this.L);
    }

    private void N(class10021 class100212, class09980 class099802, float f, float f2, float f3, float f4) {
        this.y(class100212, class099802, f, f2, f3, f4);
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (class10048.N(class100213)) continue;
            class09980 class099803 = class100213.o();
            if (class10019.N(class100213)) {
                this.N(class100213, class099803.j(), class099803.v());
                continue;
            }
            this.N(class100213, f + class099803.j(), f2 + class099803.v());
        }
    }
}

