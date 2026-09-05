/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09964
 *  Nursultan.class09975
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09964;
import Nursultan.class09975;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10026;
import Nursultan.class10036;
import Nursultan.class10048;
import Nursultan.class10049;
import Nursultan.class10052;
import Nursultan.class10061;

final class class10025 {
    private final class10052 N;

    class10025(class10052 class100522) {
        this.N = class100522;
    }

    void y(class10021 class100212) {
        Object object;
        ++this.N.i().R;
        for (int i = 0; i < class100212.u(); ++i) {
            object = class100212.N(i);
            this.y((class10021)object);
        }
        class09980 class099802 = class100212.o();
        object = this.N.N(class100212);
        boolean bl = class099802.y();
        if (class099802.M() == class09975.ROW) {
            float f = class10048.u(class099802, class10036.HEIGHT);
            float f2 = class10048.u(class099802, class10036.HEIGHT);
            float f3 = class10048.u(class099802, class10036.HEIGHT);
            int n = 0;
            for (int i = 0; i < class100212.u(); ++i) {
                class10021 class100213 = class100212.N(i);
                if (!class10048.N(class100213)) continue;
                ++n;
                class10061 class100612 = this.N.N(class100213);
                f = Math.max(f, class100612.y + class10048.u(class099802, class10036.HEIGHT));
                if (bl) continue;
                f2 = Math.max(f2, class100612.R + class10048.u(class099802, class10036.HEIGHT));
                f3 = Math.max(f3, class100612.y(class10036.HEIGHT) + class10048.u(class099802, class10036.HEIGHT));
            }
            if (n == 0) {
                this.N(class100212, (class10061)object);
                return;
            }
            ((class10061)object).y = class10048.R(class099802, class10036.HEIGHT, f);
            ((class10061)object).R = class10048.M(class099802, class10036.HEIGHT, bl ? class10048.u(class099802, class10036.HEIGHT) : f2);
            ((class10061)object).u(class10036.HEIGHT, class10048.M(class099802, class10036.HEIGHT, bl ? class10048.u(class099802, class10036.HEIGHT) : f3));
            this.N(class100212, (class10061)object);
            return;
        }
        float f = class10048.u(class099802, class10036.HEIGHT);
        float f4 = class10048.u(class099802, class10036.HEIGHT);
        float f5 = class10048.u(class099802, class10036.HEIGHT);
        int n = 0;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100214 = class100212.N(i);
            if (!class10048.N(class100214)) continue;
            ++n;
            class10061 class100613 = this.N.N(class100214);
            f += class100613.y;
            if (bl) continue;
            f4 += class100613.R;
            f5 += class100613.y(class10036.HEIGHT);
        }
        if (n == 0) {
            this.N(class100212, (class10061)object);
            return;
        }
        float f6 = class10048.N(n, class099802.E());
        ((class10061)object).y = class10048.R(class099802, class10036.HEIGHT, f + f6);
        ((class10061)object).R = class10048.M(class099802, class10036.HEIGHT, bl ? class10048.u(class099802, class10036.HEIGHT) : f4 + f6);
        ((class10061)object).u(class10036.HEIGHT, class10048.M(class099802, class10036.HEIGHT, bl ? class10048.u(class099802, class10036.HEIGHT) : f5 + f6));
        this.N(class100212, (class10061)object);
    }

    void N(class10021 class100212) {
        boolean bl;
        Object object;
        ++this.N.i().i;
        for (int i = 0; i < class100212.u(); ++i) {
            object = class100212.N(i);
            this.N((class10021)object);
        }
        if (class100212.y() != class10049.TEXT) {
            return;
        }
        class09980 class099802 = class100212.o();
        object = this.N.N(class100212);
        ((class10061)object).Z = class100212.B();
        boolean bl2 = class10048.N(class099802.O());
        boolean bl3 = bl = class099802.a() == class09964.WORDS;
        if (!bl2 && !bl) {
            this.N(class100212, (class10061)object);
            return;
        }
        float f = Float.POSITIVE_INFINITY;
        if (bl) {
            f = Math.max(0.0f, ((class10061)object).N - class10048.u(class099802, class10036.WIDTH) - class10048.N(class099802));
        }
        class10026 class100262 = this.N.N(class100212, class099802, f);
        ((class10061)object).Z = class100262.N();
        if (!bl2) {
            this.N(class100212, (class10061)object);
            return;
        }
        float f2 = class10048.u(class099802, class10036.HEIGHT) + class100262.L();
        ((class10061)object).y = class10048.R(class099802, class10036.HEIGHT, f2);
        ((class10061)object).R = class10048.M(class099802, class10036.HEIGHT, f2);
        ((class10061)object).u(class10036.HEIGHT, ((class10061)object).R);
        this.N(class100212, (class10061)object);
    }

    private void N(class10021 class100212, class10061 class100612) {
        class100612.y(class10036.HEIGHT, class100612.y);
        class100612.y = this.N.N(class100212, class10036.HEIGHT, class100612.y);
        class100612.i(class10036.HEIGHT);
    }
}

