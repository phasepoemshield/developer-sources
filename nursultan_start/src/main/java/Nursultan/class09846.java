/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09970
 *  Nursultan.class10001
 *  Nursultan.class10021
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09794;
import Nursultan.class09830;
import Nursultan.class09877;
import Nursultan.class09970;
import Nursultan.class10001;
import Nursultan.class10021;
import java.util.Objects;

final class class09846 {
    private final class09794 N;

    class09846(class09794 class097942) {
        this.N = Objects.requireNonNull(class097942, "uiScalePolicy");
    }

    private class09830 y(class10021 class100212) {
        if (!class100212.o().y()) {
            return null;
        }
        if (class100212.o().k() == class09970.HIDDEN) {
            return null;
        }
        float f = class100212.c().P();
        if (f <= 0.0f) {
            return null;
        }
        class10001 class100012 = class100212.o().Y();
        float f2 = class100212.c().B();
        float f3 = class100212.c().Z();
        float f4 = class09693.N((float)class100012.N(), (float)0.0f, (float)Math.max(0.0f, f2));
        if (f4 <= 0.0f || f3 <= 0.0f) {
            return null;
        }
        float f5 = switch (class09877.N[class100212.o().k().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class100212.c().R() + f2;
            case 2 -> class100212.c().R() + Math.max(0.0f, f2 - f4);
            case 3 -> class100212.c().R();
        };
        float f6 = this.N.N();
        float f7 = class09693.N((float)class100012.y(), (float)0.0f, (float)(f4 * 0.5f));
        float f8 = class09693.N((float)class100012.L(), (float)0.0f, (float)(f3 * 0.5f));
        float f9 = class09693.N((float)(class100212.c().M() + f8), (float)f6);
        float f10 = class09693.N((float)Math.max(0.0f, f3 - f8 * 2.0f), (float)f6);
        if (f10 <= 0.0f) {
            return null;
        }
        float f11 = class09693.N((float)(f5 + f7), (float)f6);
        float f12 = f9;
        float f13 = class09693.N((float)Math.max(0.0f, f4 - f7 * 2.0f), (float)f6);
        float f14 = f10;
        float f15 = f3 + f;
        float f16 = f15 <= 0.0f ? 1.0f : f3 / f15;
        float f17 = f14 * f16;
        f17 = class09693.N((float)class09693.N((float)f17, (float)class100012.u(), (float)f14), (float)f6);
        float f18 = Math.max(0.0f, f14 - f17);
        float f19 = class09693.N((float)(class100212.c().m() / f * f18), (float)0.0f, (float)f18);
        float f20 = f11;
        float f21 = class09693.N((float)(f12 + f19), (float)f6);
        return new class09830(f5, f9, f4, f10, f11, f12, f13, f14, f20, f21, f13, f17, f18);
    }

    class09830 N(class10021 class100212) {
        if (class100212 == null) {
            return null;
        }
        int n = class100212.c().W();
        int n2 = class100212.d();
        int n3 = this.N.y();
        if (class100212.q().y(n, n2, n3)) {
            return class100212.q().z();
        }
        class09830 class098302 = this.y(class100212);
        class100212.q().N(class098302, n, n2, n3);
        return class098302;
    }
}

