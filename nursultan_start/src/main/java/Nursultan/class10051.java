/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09962
 *  Nursultan.class09964
 *  Nursultan.class09975
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09962;
import Nursultan.class09964;
import Nursultan.class09975;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10036;
import Nursultan.class10048;
import Nursultan.class10049;
import Nursultan.class10052;
import Nursultan.class10056;
import Nursultan.class10061;
import Nursultan.class10063;

final class class10051 {
    private final class10052 N;

    class10051(class10052 class100522) {
        this.N = class100522;
    }

    private class10063 y(class10021 class100212, class09980 class099802) {
        boolean bl;
        class09962 class099622 = class099802.Q();
        class09962 class099623 = class099802.O();
        boolean bl2 = class10048.N(class099622);
        boolean bl3 = bl = class10048.N(class099623) && bl2;
        if (!bl2) {
            return new class10063(0.0f, 0.0f, 0.0f, 0.0f);
        }
        class10056 class100562 = this.N.N(class100212, class099802);
        float f = class10048.N(class099623) ? class100562.y() : 0.0f;
        float f2 = class099802.a() == class09964.WORDS ? class100562.L() : class100562.N();
        return new class10063(class100562.N(), bl ? class100562.y() : 0.0f, f2, f);
    }

    private static float N(class09980 class099802, class10036 class100362, float f) {
        return class10048.M(class099802, class100362, f);
    }

    private class10063 N(class10021 class100212, class09980 class099802) {
        if (class100212.y() == class10049.TEXT) {
            return this.y(class100212, class099802);
        }
        return new class10063(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void N(class10021 class100212) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ++this.N.i().y;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            this.N(class100213);
        }
        class09980 class099802 = class100212.o();
        boolean bl = class099802.y();
        boolean bl2 = class099802.M() == class09975.ROW;
        int n = 0;
        if (bl2) {
            f6 = class10048.u(class099802, class10036.WIDTH);
            f5 = class10048.u(class099802, class10036.HEIGHT);
            f4 = class10048.u(class099802, class10036.WIDTH);
            f3 = class10048.u(class099802, class10036.HEIGHT);
            f2 = class10048.u(class099802, class10036.WIDTH);
            f = class10048.u(class099802, class10036.HEIGHT);
            for (var12_14 = 0; var12_14 < class100212.u(); ++var12_14) {
                class10021 class100214 = class100212.N(var12_14);
                if (!class10048.N(class100214)) continue;
                ++n;
                class10061 class100612 = this.N.N(class100214);
                f6 += class10051.N(class100612, class10036.WIDTH);
                f5 = Math.max(f5, class100612.y + class10048.u(class099802, class10036.HEIGHT));
                if (bl) continue;
                f4 += class100612.i;
                f3 = Math.max(f3, class100612.R + class10048.u(class099802, class10036.HEIGHT));
                f2 += class100612.y(class10036.WIDTH);
                f = Math.max(f, class100612.y(class10036.HEIGHT) + class10048.u(class099802, class10036.HEIGHT));
            }
        } else {
            f6 = class10048.u(class099802, class10036.WIDTH);
            f5 = class10048.u(class099802, class10036.HEIGHT);
            f4 = class10048.u(class099802, class10036.WIDTH);
            f3 = class10048.u(class099802, class10036.HEIGHT);
            f2 = class10048.u(class099802, class10036.WIDTH);
            f = class10048.u(class099802, class10036.HEIGHT);
            for (var12_14 = 0; var12_14 < class100212.u(); ++var12_14) {
                class10021 class100215 = class100212.N(var12_14);
                if (!class10048.N(class100215)) continue;
                ++n;
                class10061 class100613 = this.N.N(class100215);
                f5 += class100613.y;
                f6 = Math.max(f6, class10051.N(class100613, class10036.WIDTH) + class10048.u(class099802, class10036.WIDTH));
                if (bl) continue;
                f3 += class100613.R;
                f4 = Math.max(f4, class100613.i + class10048.u(class099802, class10036.WIDTH));
                f += class100613.y(class10036.HEIGHT);
                f2 = Math.max(f2, class100613.y(class10036.WIDTH) + class10048.u(class099802, class10036.WIDTH));
            }
        }
        if (n == 0) {
            class10063 class100632 = this.N(class100212, class099802);
            f6 = class10048.u(class099802, class10036.WIDTH) + class100632.N();
            f5 = class10048.u(class099802, class10036.HEIGHT) + class100632.y();
            f4 = class10048.u(class099802, class10036.WIDTH) + class100632.L();
            f3 = class10048.u(class099802, class10036.HEIGHT) + class100632.u();
            f2 = f4;
            f = f3;
        } else if (bl2) {
            float f7 = class10048.N(n, class099802.E());
            f6 += f7;
            f4 = bl ? class10048.u(class099802, class10036.WIDTH) : f4 + f7;
            f3 = bl ? class10048.u(class099802, class10036.HEIGHT) : f3;
            f2 = bl ? class10048.u(class099802, class10036.WIDTH) : f2 + f7;
            f = bl ? class10048.u(class099802, class10036.HEIGHT) : f;
        } else {
            float f8 = class10048.N(n, class099802.E());
            f5 += f8;
            f4 = bl ? class10048.u(class099802, class10036.WIDTH) : f4;
            f3 = bl ? class10048.u(class099802, class10036.HEIGHT) : f3 + f8;
            f2 = bl ? class10048.u(class099802, class10036.WIDTH) : f2;
            f = bl ? class10048.u(class099802, class10036.HEIGHT) : f + f8;
        }
        class10061 class100614 = this.N.N(class100212);
        class100614.N = class10048.R(class099802, class10036.WIDTH, f6);
        class100614.y = class10048.R(class099802, class10036.HEIGHT, f5);
        class100614.y(class10036.WIDTH, class100614.N);
        class100614.y(class10036.HEIGHT, class100614.y);
        class100614.i = class10048.M(class099802, class10036.WIDTH, f4);
        class100614.R = class10048.M(class099802, class10036.HEIGHT, f3);
        class100614.u(class10036.WIDTH, class10051.N(class099802, class10036.WIDTH, f2));
        class100614.u(class10036.HEIGHT, class10051.N(class099802, class10036.HEIGHT, f));
        if (class099802.Q().L()) {
            class100614.i = Math.max(class100614.i, f4);
            class100614.u(class10036.WIDTH, Math.max(class100614.y(class10036.WIDTH), f4));
        }
        class100614.N = this.N.N(class100212, class10036.WIDTH, class100614.N);
        if (!class099802.Q().L()) {
            class100614.i(class10036.WIDTH);
        }
    }

    private static float N(class10061 class100612, class10036 class100362) {
        return Math.max(class100612.u(class100362), class100612.N(class100362));
    }
}

