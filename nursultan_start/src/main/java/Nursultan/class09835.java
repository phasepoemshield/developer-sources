/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09937
 *  Nursultan.class09976
 *  Nursultan.class09980
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09856;
import Nursultan.class09858;
import Nursultan.class09937;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10049;

public final class class09835 {
    private static class09858 L(class10021 class100212) {
        float f = class100212.c().y();
        float f2 = class100212.c().L();
        float f3 = f + Math.max(0.0f, class100212.c().u());
        float f4 = f2 + Math.max(0.0f, class100212.c().i());
        return new class09858(f, f2, f3, f4);
    }

    private class09835() {
    }

    private static class09858 i(class10021 class100212) {
        class10021 class100213 = class100212.X();
        if (class100213 == null) {
            return null;
        }
        float f = class10019.y((class10021)class100212) ? class09835.N(class100213) : 0.0f;
        float f2 = class100213.c().y();
        float f3 = class100213.c().L() + f;
        float f4 = f2 + Math.max(0.0f, class100213.c().u());
        float f5 = f3 + Math.max(0.0f, class100213.c().i());
        return new class09858(f2, f3, f4, f5);
    }

    private static class09858 u(class10021 class100212) {
        float f = class100212.c().R();
        float f2 = class100212.c().M();
        float f3 = f + Math.max(0.0f, class100212.c().B());
        float f4 = f2 + Math.max(0.0f, class100212.c().Z());
        return new class09858(f, f2, f3, f4);
    }

    private static boolean y(class10021 class100212) {
        boolean bl;
        class09937 class099372 = class100212.c();
        int n = class100212.O();
        if (class099372.s() == n) {
            return class099372.T();
        }
        float f = class099372.y();
        float f2 = class099372.L();
        float f3 = f + Math.max(0.0f, class099372.u());
        float f4 = f2 + Math.max(0.0f, class099372.i());
        class09980 class099802 = class100212.o();
        if (class099802.d() != class09976.NONE) {
            bl = true;
        } else if (class099802.y()) {
            bl = false;
        } else {
            bl = true;
            int n2 = class100212.u();
            for (int i = 0; i < n2; ++i) {
                class10021 class100213 = class100212.N(i);
                if (class10019.N((class10021)class100213)) continue;
                bl &= class09835.y(class100213);
                class09937 class099373 = class100213.c();
                f = Math.min(f, class099373.b());
                f2 = Math.min(f2, class099373.j());
                f3 = Math.max(f3, class099373.v());
                f4 = Math.max(f4, class099373.n());
            }
        }
        class099372.N(f, f2, f3, f4, n, bl);
        return bl;
    }

    public static boolean y(class10021 class100212, float f, float f2, float f3) {
        if (!class09835.y(class100212)) {
            return false;
        }
        class09937 class099372 = class100212.c();
        return f2 < class099372.b() || f2 > class099372.v() || f3 < class099372.j() + f || f3 > class099372.n() + f;
    }

    public static class09858 N(class10021 class100212, class09980 class099802) {
        return switch (class09856.N[class099802.d().ordinal()]) {
            case 1 -> {
                if (class100212.y() == class10049.INPUT) {
                    yield class09835.u(class100212);
                }
                yield class09835.L(class100212);
            }
            case 2 -> class09835.i(class100212);
            default -> null;
        };
    }

    public static boolean N(class10021 class100212, float f, float f2, float f3) {
        float f4 = Math.max(0.0f, class100212.c().u());
        float f5 = Math.max(0.0f, class100212.c().i());
        if (f4 <= 0.0f || f5 <= 0.0f) {
            return false;
        }
        float f6 = class100212.c().y();
        float f7 = class100212.c().L() + f;
        return f2 >= f6 && f2 <= f6 + f4 && f3 >= f7 && f3 <= f7 + f5;
    }

    public static float N(float f, class10021 class100212, float f2) {
        return class10019.y((class10021)class100212) ? f - f2 : f;
    }

    public static class09858 N(class10021 class100212, float f) {
        float f2 = class100212.c().y();
        float f3 = class100212.c().L() + f;
        float f4 = f2 + Math.max(0.0f, class100212.c().u());
        float f5 = f3 + Math.max(0.0f, class100212.c().i());
        return new class09858(f2, f3, f4, f5);
    }

    public static class09858 N(class09858 class098582, float f, class09858 class098583) {
        if (class098582 == null) {
            return class098583;
        }
        float f2 = class098582.L() + f;
        float f3 = class098582.i() + f;
        if (class098583 == null) {
            return new class09858(class098582.y(), f2, class098582.u(), f3);
        }
        return new class09858(Math.max(class098583.y(), class098582.y()), Math.max(class098583.L(), f2), Math.min(class098583.u(), class098582.u()), Math.min(class098583.i(), f3));
    }

    public static float N(class10021 class100212) {
        if (!class100212.o().y()) {
            return 0.0f;
        }
        return Math.max(0.0f, class100212.c().m());
    }
}

