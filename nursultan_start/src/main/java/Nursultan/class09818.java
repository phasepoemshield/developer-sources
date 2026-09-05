/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09937
 *  Nursultan.class09973
 *  Nursultan.class09980
 *  Nursultan.class10003
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09802;
import Nursultan.class09849;
import Nursultan.class09937;
import Nursultan.class09973;
import Nursultan.class09980;
import Nursultan.class10003;
import Nursultan.class10019;
import Nursultan.class10021;

final class class09818 {
    private static final float N = 0.001f;

    private class09818() {
    }

    private static class10003 N(class10003 class100032, class10003 class100033, class10003 class100034, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean bl;
        boolean bl2 = f + f3 <= f6;
        boolean bl3 = bl = f2 >= 0.0f;
        if (class100032 == class100033) {
            if (bl2) {
                return class100033;
            }
            if (bl) {
                return class100034;
            }
            return f4 > f5 ? class100034 : class100033;
        }
        if (bl) {
            return class100034;
        }
        if (bl2) {
            return class100033;
        }
        return f5 > f4 ? class100033 : class100034;
    }

    private static float N(float f, float f2, float f3) {
        float f4 = Math.max(0.0f, f3 - f2);
        return class09693.N((float)f, (float)0.0f, (float)f4);
    }

    private static void N(class10021 class100212, float f, float f2) {
        class09937 class099372 = class100212.c();
        class099372.L(class099372.y() + f, class099372.L() + f2);
        class099372.N(class099372.R() + f, class099372.M() + f2, class099372.B(), class099372.Z());
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (class10019.N((class10021)class100213)) continue;
            class09818.N(class100213, f, f2);
        }
    }

    private static boolean N(float f, float f2) {
        return Math.abs(f - f2) <= 0.001f;
    }

    static boolean N(class10021 class100212, class09849 class098492, float f, float f2) {
        class09980 class099802 = class100212.o();
        class09937 class099372 = class100212.c();
        class09802 class098022 = class09818.N(class099802.D(), class099802.h(), class099802.r(), class099802.NN(), class099802.Ny(), class098492, class099372.u(), class099372.i(), Math.max(0.0f, f), Math.max(0.0f, f2));
        float f3 = class098022.N() - class099372.y();
        float f4 = class098022.y() - class099372.L();
        if (class09818.N(f3, 0.0f) && class09818.N(f4, 0.0f)) {
            return false;
        }
        class09818.N(class100212, f3, f4);
        class100212.u(1);
        return true;
    }

    static class09802 N(class10003 class100032, float f, class09973 class099732, boolean bl, boolean bl2, class09849 class098492, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        class10003 class100033 = bl ? class09818.N(class100032, f, class098492, f2, f3, f4, f5) : class100032;
        switch (class100033) {
            case TOP: {
                f7 = class098492.y() + f;
                f6 = class09818.N(class099732, class098492.i(), class098492.M(), f2);
                break;
            }
            case BOTTOM: {
                f7 = class098492.R() - f - f3;
                f6 = class09818.N(class099732, class098492.i(), class098492.M(), f2);
                break;
            }
            case LEFT: {
                f6 = class098492.N() + f;
                f7 = class09818.N(class099732, class098492.R(), class098492.B(), f3);
                break;
            }
            case RIGHT: {
                f6 = class098492.i() - f - f2;
                f7 = class09818.N(class099732, class098492.R(), class098492.B(), f3);
                break;
            }
            default: {
                throw new IllegalStateException("Unhandled side: " + String.valueOf(class100033));
            }
        }
        if (bl2) {
            f6 = class09818.N(f6, f2, f4);
            f7 = class09818.N(f7, f3, f5);
        }
        return new class09802(f6, f7, class100033);
    }

    private static float N(class09973 class099732, float f, float f2, float f3) {
        return switch (class099732) {
            default -> throw new MatchException(null, null);
            case class09973.START -> f;
            case class09973.CENTER -> f + (f2 - f3) * 0.5f;
            case class09973.END -> f + f2 - f3;
        };
    }

    private static class10003 N(class10003 class100032, float f, class09849 class098492, float f2, float f3, float f4, float f5) {
        return switch (class100032) {
            default -> throw new MatchException(null, null);
            case class10003.TOP, class10003.BOTTOM -> class09818.N(class100032, class10003.BOTTOM, class10003.TOP, class098492.y() + f, class098492.R() - f - f3, f3, class098492.R(), Math.max(0.0f, f5 - class098492.y()), f5);
            case class10003.LEFT, class10003.RIGHT -> class09818.N(class100032, class10003.RIGHT, class10003.LEFT, class098492.N() + f, class098492.i() - f - f2, f2, class098492.i(), Math.max(0.0f, f4 - class098492.N()), f4);
        };
    }
}

