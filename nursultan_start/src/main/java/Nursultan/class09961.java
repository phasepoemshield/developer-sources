/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09715
 *  Nursultan.class09781
 *  Nursultan.class10021
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09715;
import Nursultan.class09781;
import Nursultan.class09904;
import Nursultan.class09968;
import Nursultan.class09979;
import Nursultan.class09980;
import Nursultan.class09991;
import Nursultan.class10002;
import Nursultan.class10006;
import Nursultan.class10021;
import Nursultan.class10049;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class class09961 {
    private final class09715 N;

    private void L(class10021 class100212) {
        this.u(class100212);
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            this.L(class100213);
        }
    }

    private static class10002 M(class10021 class100212) {
        class09991 class099912 = class100212.i();
        return class099912 == null ? class10002.N : class099912.U();
    }

    private class09961(class09781 class097812) {
        this.N = class09715.N((class09781)Objects.requireNonNull(class097812, "context"));
    }

    private static class10002 B(class10021 class100212) {
        class09991 class099912 = class100212.i();
        return class099912 == null ? class10002.N : class099912.E();
    }

    private static class10002 Z(class10021 class100212) {
        Object object;
        List var1 = class100212.v();
        if (var1.isEmpty()) {
            return class10002.N;
        }
        ArrayList<class10021> arrayList = new ArrayList<class10021>();
        for (object = class100212.X(); object != null; object = object.X()) {
            arrayList.add((class10021)object);
        }
        object = class10002.N;
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            class10021 class100213 = (class10021)arrayList.get(i);
            class09991 class099912 = class100213.i();
            if (class099912 == null || class099912.z().N()) continue;
            class10002 class100022 = class099912.z().N(var1, class100213.E(), class100213.W(), class100213.m());
            object = ((class10002)object).N(class100022);
        }
        return object;
    }

    private void i(class10021 class100212) {
        for (int i = 0; i < class100212.u(); ++i) {
            this.L(class100212.N(i));
        }
    }

    private void u(class10021 class100212) {
        boolean bl;
        class09980 class099802 = class100212.o();
        class09980 class099803 = class09961.R(class100212);
        class09980 class099804 = this.N.N(class100212, class099802, class099803, class09961.M(class100212));
        class100212.N(class099804);
        class100212.N(class099804.I());
        boolean bl2 = !class099803.N(class099802);
        boolean bl3 = !class099803.y(class099802);
        boolean bl4 = bl = !class099803.L(class099802);
        if (bl2) {
            class100212.i(2);
            return;
        }
        if (bl3) {
            class100212.i(4);
            return;
        }
        if (bl) {
            class100212.i(1);
        }
    }

    public void y(class10021 class100212) {
        if (class100212 != null) {
            this.u(class100212);
        }
    }

    private static boolean N(class09991 class099912, boolean bl, boolean bl2, boolean bl3) {
        if (class099912 == null || class099912.z().N()) {
            return false;
        }
        class10006 class100062 = class099912.z();
        return bl && class100062.N(class09979.HOVER) || bl2 && class100062.N(class09979.FOCUS) || bl3 && class100062.N(class09979.ACTIVE);
    }

    public static class09961 N(class09781 class097812) {
        return (class09961)class097812.N(class09961.class).orElseGet(() -> {
            class09961 class099612 = new class09961(class097812);
            class097812.N(class09961.class, (Object)class099612);
            return class099612;
        });
    }

    public void N(class10021 class100212, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        if (class100212 == null) {
            return;
        }
        boolean bl5 = class100212.E() != bl;
        boolean bl6 = class100212.W() != bl2;
        boolean bl7 = bl4 = class100212.m() != bl3;
        if (!(bl5 || bl6 || bl4)) {
            return;
        }
        class100212.y(bl);
        class100212.L(bl2);
        class100212.u(bl3);
        this.y(class100212);
        if (class09961.N(class100212.i(), bl5, bl6, bl4)) {
            this.i(class100212);
        }
    }

    public void N(class09904 class099042) {
        if (class099042 instanceof class10021) {
            class10021 class100212 = (class10021)class099042;
            this.L(class100212);
        }
    }

    public void N(class10021 class100212) {
        if (class100212 != null) {
            this.L(class100212);
        }
    }

    private static class09980 R(class10021 class100212) {
        class09980 class099802 = class100212.y() == class10049.INPUT ? class09968.y() : class09968.N();
        class09991 class099912 = class100212.i();
        class10002 class100022 = class099912 == null ? class10002.N : class099912.N(class100212.E(), class100212.W(), class100212.m());
        class100022 = class100022.N(class09961.Z(class100212));
        if (class100212.T()) {
            return class09961.B(class100212).N(class100022.N(class099802));
        }
        if (class100022.equals(class100212.n())) {
            return class100212.t();
        }
        class09980 class099803 = class100022.N(class099802);
        class100212.N(class100022, class099803);
        return class099803;
    }
}

