/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class09961
 *  Nursultan.class10017
 *  Nursultan.class10021
 *  Nursultan.class10049
 *  Nursultan.class10062
 *  Nursultan.class10066
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class09828;
import Nursultan.class09834;
import Nursultan.class09837;
import Nursultan.class09851;
import Nursultan.class09852;
import Nursultan.class09854;
import Nursultan.class09857;
import Nursultan.class09863;
import Nursultan.class09864;
import Nursultan.class09865;
import Nursultan.class09867;
import Nursultan.class09869;
import Nursultan.class09873;
import Nursultan.class09904;
import Nursultan.class09961;
import Nursultan.class10017;
import Nursultan.class10021;
import Nursultan.class10049;
import Nursultan.class10062;
import Nursultan.class10066;
import java.util.Objects;

final class class09786
implements class09869 {
    private static final int N = 0;
    private static final int y = 99;
    private static final int L = 67;
    private static final int u = 118;
    private static final int i = 86;
    private static final int R = 120;
    private static final int M = 88;
    private final class09781 B;
    private final class09961 Z;
    private final class09851 z;
    private final class09828 U;
    private final class10066 E;
    private final class10062 W;
    private final class10017 m;
    private class10021 P;
    private class10021 s;
    private class10021 T;
    private class10021 b;
    private class10021 j;
    private class10021 v;
    private float n;
    private float t;
    private boolean G;

    @Override
    public class09904 L() {
        return this.T;
    }

    @Override
    public boolean L(class09904 class099042) {
        class10021 class100212;
        if (class099042 == null) {
            this.y((class10021)null);
            return false;
        }
        if (!(class099042 instanceof class10021 && (class100212 = (class10021)class099042).P() && class09786.y(this.P, class100212))) {
            return false;
        }
        this.y(class100212);
        this.E.N(class100212);
        return true;
    }

    private void L(class10021 class100212) {
        if (this.b == class100212) {
            return;
        }
        class10021 class100213 = this.b;
        this.b = class100212;
        if (class100213 != null) {
            this.Z.N(class100213, class100213 == this.s, class100213 == this.T, false);
        }
        if (class100212 != null) {
            this.Z.N(class100212, class100212 == this.s, class100212 == this.T, true);
        }
    }

    private float L(float f) {
        return f / this.B.u().N();
    }

    private class09854 M() {
        if (this.P == null) {
            return class09854.N;
        }
        return this.z.N(this.P, this.n, this.t);
    }

    private static void M(class10021 class100212) {
        class100212.y(false);
        class100212.L(false);
        class100212.u(false);
        for (int i = 0; i < class100212.u(); ++i) {
            class09786.M(class100212.N(i));
        }
    }

    class09786(class09781 class097812) {
        this.B = Objects.requireNonNull(class097812, "context");
        this.Z = class09961.N((class09781)class097812);
        this.z = new class09851(class097812);
        this.U = class09828.N(class097812);
        this.E = class10066.N((class09781)class097812);
        this.W = class10062.N((class09781)class097812);
        this.m = new class10017(class097812);
    }

    private static class10021 i(class10021 class100212) {
        if (class100212 == null) {
            return null;
        }
        for (class10021 class100213 = class100212; class100213 != null; class100213 = class100213.X()) {
            if (!class100213.N(class09867.CLICK)) continue;
            return class100213;
        }
        return class09786.u(class100212);
    }

    @Override
    public class09904 i() {
        return this.j;
    }

    @Override
    public class09904 u() {
        return this.b;
    }

    private static class10021 u(class10021 class100212) {
        if (class100212 == null) {
            return null;
        }
        for (class10021 class100213 = class100212; class100213 != null; class100213 = class100213.X()) {
            if (!class100213.P()) continue;
            return class100213;
        }
        return class100212;
    }

    @Override
    public void y(class09904 class099042) {
        if (!(class099042 instanceof class10021)) {
            return;
        }
        class10021 class100212 = (class10021)class099042;
        if (class09786.y(class100212, this.T)) {
            this.E.N(this.T, null);
            this.W.N(this.T, null);
            this.T = null;
        }
        if (class09786.y(class100212, this.s)) {
            class10021 class100213 = class100212.X();
            if (class100213 != null) {
                this.N(class100213);
            } else {
                this.s = null;
            }
        }
        if (class09786.y(class100212, this.b)) {
            this.b = null;
        }
        if (class09786.y(class100212, this.j)) {
            this.j = null;
        }
        if (class09786.y(class100212, this.v)) {
            this.v = null;
        }
        class09786.M(class100212);
    }

    private static boolean y(class10021 class100212, class10021 class100213) {
        if (class100212 == null || class100213 == null) {
            return false;
        }
        for (class10021 class100214 = class100213; class100214 != null; class100214 = class100214.X()) {
            if (class100214 != class100212) continue;
            return true;
        }
        return false;
    }

    private void y(int n, class10021 class100212) {
        class10021 class100213;
        class10021 class100214 = class09786.u(class100212);
        class10021 class100215 = class100213 = this.j != null ? this.j : class100214;
        if (class100213 != null) {
            class09863.N(new class09864(class09867.POINTER_UP, (class09904)class100213, this.n, this.t, n, false));
        }
        if (n == 0) {
            class10021 class100216 = class09786.i(class100212);
            if (this.v != null && class100216 == this.v && class100212 != null) {
                class09863.N(new class09864(class09867.CLICK, (class09904)class100212, this.n, this.t, n, false));
            }
            this.v = null;
            if (this.j != null && this.j.y() == class10049.INPUT) {
                this.W.u(this.j);
            }
            this.j = null;
            this.L((class10021)null);
        }
    }

    private void y(class10021 class100212) {
        if (this.T == class100212) {
            return;
        }
        class10021 class100213 = this.T;
        this.T = class100212;
        if (class100213 != null) {
            this.Z.N(class100213, class100213 == this.s, false, class100213 == this.b);
            class09863.N(new class09873(class09867.BLUR, (class09904)class100213, (class09904)class100212));
        }
        if (class100212 != null) {
            this.Z.N(class100212, class100212 == this.s, true, class100212 == this.b);
            class09863.N(new class09873(class09867.FOCUS, (class09904)class100212, (class09904)class100213));
        }
        this.E.N(class100213, class100212);
        this.W.N(class100213, class100212);
    }

    @Override
    public class09904 y() {
        return this.s;
    }

    private float y(float f) {
        return f / this.B.u().N();
    }

    private void N(int n, class10021 class100212) {
        class10021 class100213;
        class10021 class100214 = class09786.u(class100212);
        class10021 class100215 = class100213 = this.j != null ? this.j : class100214;
        if (class100213 != null) {
            class09863.N(new class09864(class09867.POINTER_DOWN, (class09904)class100213, this.n, this.t, n, true));
        }
        if (n != 0) {
            return;
        }
        this.v = class09786.i(class100212);
        this.j = class100214;
        this.y(class100214 != null && class100214.P() ? class100214 : null);
        this.L(class100214);
        if (class100214 != null && class100214.y() == class10049.INPUT) {
            this.W.N(class100214, this.n);
        }
        this.E.N(class100214);
    }

    @Override
    public void N(class09904 class099042) {
        this.E.N(this.T, null);
        this.W.N(this.T, null);
        this.P = (class10021)class099042;
        this.s = null;
        this.T = null;
        this.b = null;
        this.j = null;
        this.v = null;
        this.G = false;
        this.U.N(this.P);
    }

    private void N(class09854 class098542) {
        if (class098542.N()) {
            this.U.N(class098542.L(), class098542.u());
        } else {
            this.U.N(null, null);
        }
    }

    private static class10021 N(class10021 class100212, class10021 class100213) {
        class10021 class100214;
        int n = class09786.R(class100212);
        int n2 = class09786.R(class100213);
        class10021 class100215 = class100213;
        for (class100214 = class100212; n > n2 && class100214 != null; class100214 = class100214.X(), --n) {
        }
        while (n2 > n && class100215 != null) {
            class100215 = class100215.X();
            --n2;
        }
        while (class100214 != class100215) {
            if (class100214 != null) {
                class100214 = class100214.X();
            }
            if (class100215 == null) continue;
            class100215 = class100215.X();
        }
        return class100214;
    }

    private boolean N(class10021 class100212, int n) {
        if (this.m.y(class100212, n)) {
            return true;
        }
        if (this.T == null) {
            return false;
        }
        if (n == 99 || n == 67) {
            this.B.N().N(this.T.B());
            return true;
        }
        if (n == 120 || n == 88) {
            this.B.N().N(this.T.B());
            return true;
        }
        if (n == 118 || n == 86) {
            this.B.N().N();
            return true;
        }
        return false;
    }

    @Override
    public void N(int n, boolean bl, class09857 class098572, boolean bl2) {
        class10021 class100212;
        class10021 class100213 = class100212 = this.T != null ? this.T : this.P;
        if (class100212 == null) {
            return;
        }
        class09867 class098672 = bl ? class09867.KEY_DOWN : class09867.KEY_UP;
        class09865 class098652 = new class09865(class098672, (class09904)class100212, n, bl, class098572, bl2);
        class09863.N(class098652);
        if (!bl || class098652.P() || class098652.m()) {
            return;
        }
        if (!bl2 && class098572 != null && class098572.N() && this.N(class100212, n)) {
            this.E.N(class100212);
            return;
        }
        if (this.m.N(class100212, n, class098572, bl2)) {
            this.E.N(class100212);
        }
    }

    @Override
    public void N(int n, boolean bl) {
        class09854 class098542 = this.M();
        this.N(class098542.L());
        if (bl) {
            if (class098542.N() && n == 0) {
                this.U.N(class098542.L(), class098542.u(), this.t, class098542.i());
                return;
            }
            this.N(n, this.N(class098542, n));
            return;
        }
        boolean bl2 = n == 0 && this.U.L();
        this.N(class098542);
        if (bl2) {
            return;
        }
        this.y(n, this.N(class098542, n));
    }

    private class10021 N(class09854 class098542, int n) {
        if (class098542.N() && n != 0) {
            return this.z.y(this.P, this.n, this.t);
        }
        return class098542.L();
    }

    @Override
    public void N(int n) {
        class10021 class100212;
        class10021 class100213 = class100212 = this.T != null ? this.T : this.P;
        if (class100212 == null) {
            return;
        }
        class09852 class098522 = new class09852((class09904)class100212, n);
        class09863.N(class098522);
        if (!class098522.P() && !class098522.m() && this.m.N(class100212, n)) {
            this.E.N(class100212);
        }
    }

    @Override
    public void N(float f, float f2) {
        class10021 class100212;
        f = this.y(f);
        f2 = this.L(f2);
        if (this.G && Float.compare(this.n, f) == 0 && Float.compare(this.t, f2) == 0) {
            return;
        }
        this.G = true;
        this.n = f;
        this.t = f2;
        if (this.j != null && this.j.y() == class10049.INPUT) {
            this.W.y(this.j, this.n);
            this.E.N(this.j);
        }
        if (this.U.L(this.P, this.t)) {
            return;
        }
        class09854 class098542 = this.M();
        this.N(class098542);
        this.N(class098542.L());
        class10021 class100213 = class100212 = this.j != null ? this.j : class098542.L();
        if (class100212 != null) {
            class09863.N(new class09864(class09867.POINTER_MOVE, (class09904)class100212, f, f2, -1, false));
        }
    }

    private void N(class10021 class100212) {
        class10021 class100213;
        if (this.s == class100212) {
            return;
        }
        class10021 class100214 = this.s;
        this.s = class100212;
        class10021 class100215 = class09786.N(class100214, class100212);
        for (class100213 = class100214; class100213 != null && class100213 != class100215; class100213 = class100213.X()) {
            this.Z.N(class100213, false, class100213 == this.T, class100213 == this.b);
        }
        for (class100213 = class100212; class100213 != null && class100213 != class100215; class100213 = class100213.X()) {
            this.Z.N(class100213, true, class100213 == this.T, class100213 == this.b);
        }
        for (class100213 = class100214; class100213 != null && class100213 != class100215; class100213 = class100213.X()) {
            class09863.N(new class09834(class09867.HOVER_LEAVE, (class09904)class100213, this.n, this.t, (class09904)class100212));
        }
        for (class100213 = class100212; class100213 != null && class100213 != class100215; class100213 = class100213.X()) {
            class09863.N(new class09834(class09867.HOVER_ENTER, (class09904)class100213, this.n, this.t, (class09904)class100214));
        }
    }

    @Override
    public void N() {
        if (!this.G || this.P == null) {
            return;
        }
        if (this.j != null || this.U.y()) {
            return;
        }
        class09854 class098542 = this.M();
        this.N(class098542);
        this.N(class098542.L());
    }

    @Override
    public void N(float f) {
        class10021 class100212;
        class09854 class098542 = this.M();
        this.N(class098542.L());
        if (this.P == null) {
            return;
        }
        class10021 class100213 = class100212 = this.j != null ? this.j : class098542.L();
        if (class100212 != null) {
            class09837 class098372 = new class09837((class09904)class100212, this.n, this.t, f);
            class09863.N(class098372);
            if (!class098372.P() && !class098372.m()) {
                this.U.N(class100212, this.P, f);
            }
        }
    }

    private static int R(class10021 class100212) {
        if (class100212 == null) {
            return 0;
        }
        if (class100212.M() >= 0) {
            return class100212.M();
        }
        int n = 0;
        for (class10021 class100213 = class100212; class100213 != null; class100213 = class100213.X()) {
            ++n;
        }
        return n;
    }

    @Override
    public void R() {
        this.y((class10021)null);
    }
}

