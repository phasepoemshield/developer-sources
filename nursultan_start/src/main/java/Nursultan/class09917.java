/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09677
 *  Nursultan.class09693
 *  Nursultan.class09781
 *  Nursultan.class10021
 *  Nursultan.class10041
 *  Nursultan.class10049
 *  Nursultan.class10062
 *  Nursultan.class10066
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09677;
import Nursultan.class09693;
import Nursultan.class09781;
import Nursultan.class09889;
import Nursultan.class09894;
import Nursultan.class09902;
import Nursultan.class09915;
import Nursultan.class09916;
import Nursultan.class09924;
import Nursultan.class09925;
import Nursultan.class09931;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10041;
import Nursultan.class10049;
import Nursultan.class10062;
import Nursultan.class10066;
import java.util.List;

final class class09917 {
    private static final class09916 N = new class09916(0.0f, 0.0f, 0.0f, 0.0f);
    private final class09781 y;
    private final class10066 L;
    private final class10062 u;

    class09917(class09781 class097812) {
        this.y = class097812;
        this.L = class10066.N((class09781)class097812);
        this.u = class10062.N((class09781)class097812);
    }

    private void N(class09915 class099152, class09980 class099802, List<class09924> list, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!class099152.y()) {
            return;
        }
        class10041 class100412 = class099152.N();
        float f8 = class09693.N((float)f3, (float)0.0f, (float)f5);
        if (f8 <= 0.0f) {
            return;
        }
        float f9 = this.N(class100412, class099802, class100412.i(), f6);
        float f10 = f + Math.max(0.0f, f2 - 1.0f);
        float f11 = class09693.N((float)f9, (float)f, (float)f10);
        float f12 = f7 > 0.0f ? 1.0f / f7 : 1.0f;
        float f13 = class09693.N((float)f11, (float)f7);
        float f14 = class09693.N((float)(f11 + 1.0f), (float)f7);
        if (f14 - f13 < f12) {
            f14 = f13 + f12;
        }
        float f15 = class09693.N((float)f4, (float)f7);
        float f16 = class09693.N((float)(f4 + f8), (float)f7);
        if (f16 <= f15) {
            return;
        }
        list.add(new class09925(f13, f15, f14 - f13, f16 - f15, class09889.N, class099802.H(), 0, 0.0f, 0, 0.0f));
    }

    private float N(class10041 class100412, class09980 class099802, int n, float f) {
        String string = class100412.y();
        int n2 = class09693.N((int)n, (int)0, (int)string.length());
        float f2 = this.y.y().N(string.substring(0, n2), class099802.c(), class099802.X());
        return f + f2;
    }

    private static class09924 N(String string, float f, float f2, int n, class09980 class099802) {
        float f3 = class099802.F();
        int n2 = class099802.p();
        if (f3 > 0.0f && class09662.R((int)n2)) {
            return new class09931(string, f, f2, n, class099802.c(), class099802.X(), n2, f3);
        }
        return new class09902(string, f, f2, n, class099802.c(), class099802.X());
    }

    private static int N(class10041 class100412, class09980 class099802) {
        int n = class099802.H();
        if (!class100412.u()) {
            return n;
        }
        int n2 = Math.max(1, Math.round((float)class09662.N((int)n) * 0.55f));
        return class09662.N((int)n, (class09677)class09677.ALPHA, (int)n2);
    }

    private static int N(class09980 class099802) {
        int n = class099802.H();
        int n2 = Math.max(1, Math.round((float)class09662.N((int)n) * 0.28f));
        return class09662.N((int)n, (class09677)class09677.ALPHA, (int)n2);
    }

    private float N(class09980 class099802, float f, float f2, float f3) {
        float f4 = Math.max(0.0f, f2 - f3);
        return f + (switch (class09894.N[class099802.Z().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 0.0f;
            case 2 -> f4 * 0.5f;
            case 3 -> f4;
        });
    }

    void N(class09915 class099152, class09980 class099802, List<class09924> list, float f, float f2, float f3, float f4) {
        class10041 class100412 = class099152.N();
        float f5 = this.y.u().N();
        float f6 = this.y.y().N(class099802.c(), class099802.X());
        float f7 = this.N(class099802, f2, f4, f6);
        float f8 = this.N(class099802, class100412.y(), f, f3) - class100412.B();
        this.N(class100412, class099802, list, f, f3, f4, f7, f6, f8, f5);
        if (!class100412.L().isEmpty()) {
            float f9 = class100412.u() ? this.N(class099802, class100412.L(), f, f3) - class100412.B() : f8;
            list.add(class09917.N(class100412.L(), class09693.N((float)f9, (float)f5), class09693.N((float)f7, (float)f5), class09917.N(class100412, class099802), class099802));
        }
        this.N(class099152, class099802, list, f, f3, f4, f7, f6, f8, f5);
    }

    class09916 N(class10021 class100212, class09980 class099802) {
        if (class100212.y() != class10049.INPUT) {
            return N;
        }
        class10041 class100412 = this.u.i(class100212);
        String string = class100412.L();
        if (string.isEmpty()) {
            return N;
        }
        float f = class100212.c().R();
        float f2 = class100212.c().M();
        float f3 = class100212.c().B();
        float f4 = class100212.c().Z();
        float f5 = this.y.y().N(class099802.c(), class099802.X());
        float f6 = this.N(class099802, f2, f4, f5);
        float f7 = this.N(class099802, string, f, f3) - class100412.B();
        float f8 = this.y.y().N(string, class099802.c(), class099802.X());
        return new class09916(f7, f6, f8, f5);
    }

    private float N(class09980 class099802, String string, float f, float f2) {
        float f3 = this.y.y().N(string, class099802.c(), class099802.X());
        float f4 = Math.max(0.0f, f2 - f3);
        return f + (switch (class09894.N[class099802.B().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 0.0f;
            case 2 -> f4 * 0.5f;
            case 3 -> f4;
        });
    }

    private void N(class10041 class100412, class09980 class099802, List<class09924> list, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class100412.u() || !class100412.N()) {
            return;
        }
        float f8 = this.N(class100412, class099802, class100412.R(), f6);
        float f9 = this.N(class100412, class099802, class100412.M(), f6);
        float f10 = class09693.N((float)f8, (float)f, (float)(f + f2));
        float f11 = class09693.N((float)f9, (float)f, (float)(f + f2));
        if (f11 <= f10) {
            return;
        }
        float f12 = class09693.N((float)f3, (float)0.0f, (float)f5);
        if (f12 <= 0.0f) {
            return;
        }
        float f13 = class09693.N((float)f10, (float)f7);
        float f14 = class09693.N((float)f11, (float)f7);
        float f15 = class09693.N((float)f4, (float)f7);
        float f16 = class09693.N((float)(f4 + f12), (float)f7);
        if (f14 <= f13 || f16 <= f15) {
            return;
        }
        list.add(new class09925(f13, f15, f14 - f13, f16 - f15, class09889.N, class09917.N(class099802), 0, 0.0f, 0, 0.0f));
    }

    class09915 N(class10021 class100212) {
        if (class100212.y() != class10049.INPUT) {
            return class09915.N;
        }
        class10041 class100412 = this.u.i(class100212);
        boolean bl = this.L.y(class100212) && class100212.c().B() > 0.0f && class100212.c().Z() > 0.0f;
        return new class09915(class100412, bl);
    }
}

