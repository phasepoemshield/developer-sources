/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09830
 *  Nursultan.class09887
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10047
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09830;
import Nursultan.class09887;
import Nursultan.class09892;
import Nursultan.class09897;
import Nursultan.class09916;
import Nursultan.class09917;
import Nursultan.class09918;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class09981;
import Nursultan.class10007;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10047;
import Nursultan.class10049;
import java.util.ArrayDeque;
import java.util.Deque;

final class class09928 {
    private static final int N = 32;
    private final class10007 y;
    private final class09917 L;
    private final Deque<class09892> u = new ArrayDeque<class09892>();
    private final float[] i = new float[128];
    private int R;
    private boolean M;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    class09916 L(class10021 class100212) {
        class09892 class098922 = this.y();
        try {
            class09980 class099802 = class100212.o();
            if (class100212.y() == class10049.INPUT) {
                class09916 class099162 = this.L.N(class100212, class099802);
                class098922.N(class099162.y(), class099162.L(), class099162.u(), class099162.i());
                class09916 class099163 = class098922.L();
                return class099163;
            }
            this.y(class100212, class098922);
            if (class099802.d() != class09976.PARENT) {
                this.N(this.y.N(class100212, class099802), class098922);
            }
            this.L(class100212, class098922);
            class09916 class099164 = class098922.L();
            return class099164;
        }
        finally {
            this.N(class098922);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void L(class10021 class100212, class09892 class098922) {
        float f = class09918.N(class100212);
        for (class10021 class100213 : class10047.N((class10021)class100212)) {
            if (class10019.N((class10021)class100213)) continue;
            class09892 class098923 = this.y();
            try {
                this.N(class100213, class098923);
                if (class10019.y((class10021)class100213)) {
                    class098923.N(0.0f, -f);
                }
                class098922.N(class098923);
            }
            finally {
                this.N(class098923);
            }
        }
    }

    private static void L(class10021 class100212, class09980 class099802, class09892 class098922) {
        if (class098922.y() || class099802.d() == class09976.NONE) {
            return;
        }
        class09887 class098872 = class09918.N(class100212, class099802);
        if (class098872 == null) {
            return;
        }
        class098922.y(class098872.y(), class098872.L(), class098872.u(), class098872.i());
    }

    class09928(class10007 class100072, class09917 class099172) {
        this.y = class100072;
        this.L = class099172;
    }

    private static void u(class10021 class100212, class09892 class098922) {
        class098922.N(class100212.c().R(), class100212.c().M(), class100212.c().B(), class100212.c().Z());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    class09916 y(class10021 class100212) {
        class09892 class098922 = this.y();
        try {
            this.N(class100212, class098922);
            class09916 class099162 = class098922.L();
            return class099162;
        }
        finally {
            this.N(class098922);
        }
    }

    private void y(class10021 class100212, class09892 class098922) {
        if (class100212.y() == class10049.CANVAS) {
            if (class100212.U() != null) {
                class098922.N(class100212.c().y(), class100212.c().L(), class100212.c().u(), class100212.c().i());
            }
            return;
        }
        if (class100212.y() == class10049.TEXT && !class100212.B().isEmpty()) {
            class09928.u(class100212, class098922);
            return;
        }
        if (class100212.y() == class10049.INPUT) {
            class09928.u(class100212, class098922);
            return;
        }
        if (class100212.y() == class10049.TEXTURE && !class100212.z().isEmpty()) {
            class09928.u(class100212, class098922);
        }
    }

    private void y(class10021 class100212, class09980 class099802, class09892 class098922) {
        if (class100212.y() == class10049.CANVAS) {
            return;
        }
        boolean bl = class09662.R((int)class099802.o());
        boolean bl2 = class099802.m() > 0.0f && class09662.R((int)class099802.e());
        boolean bl3 = class09897.y(class099802);
        if (!(bl || bl2 || bl3)) {
            return;
        }
        float f = Math.max(0.0f, class099802.m());
        float f2 = bl2 && class099802.P() == class09981.OUTSIDE ? f : 0.0f;
        float f3 = bl3 ? Math.max(0.0f, class099802.K()) : 0.0f;
        float f4 = f2 + f3;
        class098922.N(class100212.c().y() - f4, class100212.c().L() - f4, class100212.c().u() + f4 * 2.0f, class100212.c().i() + f4 * 2.0f);
    }

    private class09892 y() {
        class09892 class098922 = this.u.pollFirst();
        if (class098922 == null) {
            return new class09892();
        }
        class098922.N();
        return class098922;
    }

    private void N(class10021 class100212, class09980 class099802, class09892 class098922) {
        if (!class09897.N(class099802)) {
            return;
        }
        class098922.N(class100212.c().y(), class100212.c().L(), class100212.c().u(), class100212.c().i());
    }

    private void N(class09830 class098302, class09892 class098922) {
        if (class098302 == null) {
            return;
        }
        class098922.N(class098302.i(), class098302.R(), class098302.M(), class098302.B());
        class098922.N(class098302.Z(), class098302.z(), class098302.U(), class098302.E());
    }

    boolean N(class10021 class100212) {
        this.M = true;
        this.R = 0;
        this.N(class100212, 0.0f, 0.0f, true);
        return this.M && !this.N();
    }

    private void N(class10021 class100212, float f, float f2) {
        float f3 = class100212.c().R() + f;
        float f4 = class100212.c().M() + f2;
        float f5 = class100212.c().B();
        float f6 = class100212.c().Z();
        if (f5 <= 0.0f || f6 <= 0.0f) {
            return;
        }
        if (!(Float.isFinite(f3) && Float.isFinite(f4) && Float.isFinite(f5) && Float.isFinite(f6))) {
            return;
        }
        if (this.R >= 32) {
            this.M = false;
            return;
        }
        int n = this.R * 4;
        this.i[n] = f3;
        this.i[n + 1] = f4;
        this.i[n + 2] = f3 + f5;
        this.i[n + 3] = f4 + f6;
        ++this.R;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class10021 class100212, class09892 class098922) {
        class09980 class099802 = class100212.o();
        if (!class099802.g() || class099802.f() <= 0.0f) {
            return;
        }
        class09892 class098923 = this.y();
        try {
            class09830 class098302 = this.y.N(class100212, class099802);
            this.N(class100212, class099802, class098302, class098923);
            this.L(class100212, class098923);
            class09928.L(class100212, class099802, class098923);
            class098922.N(class098923);
        }
        finally {
            this.N(class098923);
        }
    }

    private boolean N(class10021 class100212, class09980 class099802, float f, float f2) {
        class10049 class100492 = class100212.y();
        if (class100492 == class10049.CANVAS) {
            return class100212.U() == null;
        }
        if (class09662.R((int)class099802.o())) {
            return false;
        }
        if (class099802.m() > 0.0f && class09662.R((int)class099802.e())) {
            return false;
        }
        if (class09897.y(class099802)) {
            return false;
        }
        if (this.y.N(class100212, class099802, this.y.N(class100212, class099802))) {
            return false;
        }
        if (class100492 == class10049.INPUT) {
            return false;
        }
        if (class100492 == class10049.TEXT && !class100212.B().isEmpty()) {
            this.N(class100212, f, f2);
        } else if (class100492 == class10049.TEXTURE && !class100212.z().isEmpty()) {
            this.N(class100212, f, f2);
        }
        return true;
    }

    private static boolean N(class09980 class099802) {
        return class099802.f() > 0.0f && class099802.f() < 1.0f || class099802.C() > 0.0f;
    }

    private boolean N() {
        for (int i = 0; i < this.R; ++i) {
            int n = i * 4;
            float f = this.i[n];
            float f2 = this.i[n + 1];
            float f3 = this.i[n + 2];
            float f4 = this.i[n + 3];
            for (int j = i + 1; j < this.R; ++j) {
                int n2 = j * 4;
                if (!(f < this.i[n2 + 2]) || !(this.i[n2] < f3) || !(f2 < this.i[n2 + 3]) || !(this.i[n2 + 1] < f4)) continue;
                return true;
            }
        }
        return false;
    }

    private void N(class10021 class100212, float f, float f2, boolean bl) {
        if (!this.M) {
            return;
        }
        class09980 class099802 = class100212.o();
        if (!class099802.g() || class099802.f() <= 0.0f) {
            return;
        }
        if (!bl && class09928.N(class099802)) {
            this.M = false;
            return;
        }
        if (class09897.N(class099802)) {
            this.M = false;
            return;
        }
        if (!this.N(class100212, class099802, f, f2)) {
            this.M = false;
            return;
        }
        float f3 = class09918.N(class100212);
        for (class10021 class100213 : class10047.N((class10021)class100212)) {
            if (class10019.N((class10021)class100213)) continue;
            float f4 = f;
            float f5 = f2 + (class10019.y((class10021)class100213) ? -f3 : 0.0f);
            this.N(class100213, f4, f5, false);
            if (this.M) continue;
            return;
        }
    }

    private void N(class09892 class098922) {
        this.u.push(class098922);
    }

    private void N(class10021 class100212, class09980 class099802, class09830 class098302, class09892 class098922) {
        this.N(class100212, class099802, class098922);
        this.y(class100212, class099802, class098922);
        this.y(class100212, class098922);
        this.N(class098302, class098922);
    }
}

