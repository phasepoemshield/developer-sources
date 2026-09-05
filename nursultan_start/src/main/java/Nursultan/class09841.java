/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09715
 *  Nursultan.class09904
 *  Nursultan.class09961
 *  Nursultan.class09969
 *  Nursultan.class09980
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10037
 *  Nursultan.class10047
 */
package Nursultan;

import Nursultan.class09715;
import Nursultan.class09773;
import Nursultan.class09776;
import Nursultan.class09781;
import Nursultan.class09791;
import Nursultan.class09792;
import Nursultan.class09798;
import Nursultan.class09799;
import Nursultan.class09810;
import Nursultan.class09811;
import Nursultan.class09812;
import Nursultan.class09818;
import Nursultan.class09820;
import Nursultan.class09839;
import Nursultan.class09849;
import Nursultan.class09878;
import Nursultan.class09904;
import Nursultan.class09961;
import Nursultan.class09969;
import Nursultan.class09980;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10037;
import Nursultan.class10047;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class class09841 {
    private final class09781 N;
    private final class09715 y;
    private final class10037 L;
    private final class09961 u;
    private final class09792 i;
    private final class09776 R;
    private class10021 M;
    private float B;
    private float Z;
    private final Map<String, class10021> z = new HashMap<String, class10021>();
    private final List<class10021> U = new ArrayList<class10021>();
    private final List<class10021> E = new ArrayList<class10021>();
    private int W;
    private int m;
    private List<class10021> P = List.of();
    private final ArrayList<class10021> s = new ArrayList();
    private class10021 T;
    private int b = -1;
    private boolean j;

    private void L(class10021 class100212) {
        if (class100212 == null) {
            return;
        }
        this.N.i().y((class09904)class100212);
        this.y.u(class100212);
        this.L.N(class100212);
    }

    public String L() {
        return class09820.y(this.M, class09791.N());
    }

    public float M() {
        return this.Z;
    }

    public class09841(class09781 class097812, class09798 class097982) {
        this.N = Objects.requireNonNull(class097812, "context");
        this.y = class09715.N((class09781)class097812);
        this.L = class10037.N((class09781)class097812);
        this.u = class09961.N((class09781)class097812);
        this.i = new class09792(new class09812(), this::L);
        this.R = new class09776();
        class09798 class097983 = Objects.requireNonNull(class097982, "rootSpec");
        this.M = this.i.N(class097983);
        this.M.N(this);
        this.u.N((class09904)this.M);
    }

    public class09841(class09781 class097812, class09904 class099042) {
        this(class097812, class099042, new class09812());
    }

    class09841(class09781 class097812, class09904 class099042, class09812 class098122) {
        this.N = Objects.requireNonNull(class097812, "context");
        this.y = class09715.N((class09781)class097812);
        this.L = class10037.N((class09781)class097812);
        this.u = class09961.N((class09781)class097812);
        this.i = new class09792(Objects.requireNonNull(class098122, "nodeSpecCompiler"), this::L);
        this.R = new class09776();
        this.M = Objects.requireNonNull((class10021)class099042, "root");
        this.M.N(this);
    }

    public boolean B() {
        ArrayList<class10021> arrayList = new ArrayList<class10021>();
        this.y(this.M, arrayList);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (class10021 class100212 : arrayList) {
            this.L(class100212);
            if (class100212.X() == null) continue;
            class100212.X().y(class100212);
        }
        return true;
    }

    private boolean Z() {
        class10021 class100212;
        this.U.clear();
        this.E.clear();
        class09841.N(this.M, this.U, this.E);
        if (this.U.isEmpty() && this.E.isEmpty()) {
            return false;
        }
        this.z.clear();
        class09841.N(this.M, this.z);
        boolean bl = false;
        for (class10021 class100213 : this.U) {
            class100212 = this.z.get(class100213.o().x());
            if (class100212 == null || class100212 == class100213) continue;
            bl |= class09818.N(class100213, class09878.N(class100212), this.B, this.Z);
        }
        for (class10021 class100213 : this.E) {
            class100212 = this.z.get(class100213.o().x());
            if (class100212 == null || class100212 == class100213) continue;
            bl |= class09818.N(class100213, class09841.N(class100212), this.B, this.Z);
        }
        return bl;
    }

    public boolean i() {
        return this.W > 0;
    }

    public List<class10021> u() {
        if (this.M == null) {
            return List.of();
        }
        int n = this.M.O();
        if (this.j && this.T == this.M && this.b == n) {
            return this.P;
        }
        this.s.clear();
        class09841.N(this.M, this.s);
        if (this.s.size() > 1) {
            this.s.sort(Comparator.comparingInt(class100212 -> class100212.c().z()));
        }
        this.P = this.s.isEmpty() ? List.of() : List.copyOf(this.s);
        this.T = this.M;
        this.b = n;
        this.j = true;
        return this.P;
    }

    public void y(int n) {
        this.m = Math.max(0, this.m + n);
    }

    public class09904 y() {
        return this.M;
    }

    private void y(class10021 class100212, List<class10021> list) {
        if (class100212 == null) {
            return;
        }
        for (int i = class100212.u() - 1; i >= 0; --i) {
            class10021 class100213 = class100212.N(i);
            if (class100213.T() && !this.y.N(class100213)) {
                list.add(class100213);
                continue;
            }
            this.y(class100213, list);
        }
    }

    public class09773 y(class09791 class097912) {
        return class09820.N(this.M, class097912);
    }

    private void y(class10021 class100212) {
        if (class100212 == null) {
            return;
        }
        ArrayDeque<class10021> arrayDeque = new ArrayDeque<class10021>();
        arrayDeque.push(class100212);
        while (!arrayDeque.isEmpty()) {
            class10021 class100213 = (class10021)arrayDeque.pop();
            if (class100213.T()) {
                this.N.i().y((class09904)class100213);
                continue;
            }
            for (int i = 0; i < class100213.u(); ++i) {
                arrayDeque.push(class100213.N(i));
            }
        }
    }

    private static class10021 N(class10021 class100212, String string) {
        if (string.equals(class100212.N())) {
            return class100212;
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class09841.N(class100212.N(i), string);
            if (class100213 == null) continue;
            return class100213;
        }
        return null;
    }

    private static void N(class10021 class100212, List<class10021> list, List<class10021> list2) {
        class09980 class099802 = class100212.o();
        if (class099802.x() != null) {
            if (class099802.s() == class09969.FIXED) {
                list.add(class100212);
            } else if (class099802.s() == class09969.FLOATING) {
                list2.add(class100212);
            }
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class09841.N(class100212.N(i), list, list2);
        }
    }

    private static void N(class10021 class100212, Map<String, class10021> map) {
        String string = class100212.N();
        if (string != null) {
            map.putIfAbsent(string, class100212);
        }
        for (int i = 0; i < class100212.u(); ++i) {
            class09841.N(class100212.N(i), map);
        }
    }

    public boolean N(float f, float f2, float f3, boolean bl) {
        this.B = Math.max(0.0f, f);
        this.Z = Math.max(0.0f, f2);
        if (!bl || this.M == null || this.m == 0) {
            return false;
        }
        class09839.N(this.M);
        boolean bl2 = this.Z();
        return bl2 |= class09839.N(this.M, f3);
    }

    public class09781 N() {
        return this.N;
    }

    private void N(class09799 class097992) {
        this.L(this.M);
        this.M.N(null);
        this.M = Objects.requireNonNull(class097992.i(), "resolvedElement");
        this.M.N(this);
    }

    public void N(int n) {
        this.W = Math.max(0, this.W + n);
    }

    private static void N(class10021 class100212, List<class10021> list) {
        class09980 class099802 = class100212.o();
        if (!class099802.g() || class099802.f() <= 0.0f) {
            return;
        }
        for (class10021 class100213 : class10047.N((class10021)class100212)) {
            if (class10019.N((class10021)class100213)) {
                list.add(class100213);
            }
            class09841.N(class100213, list);
        }
    }

    public class09904 N(class09798 class097982, class09810 class098102) {
        Objects.requireNonNull(class097982, "spec");
        Objects.requireNonNull(class098102, "options");
        class09811 class098112 = this.R.N(this.M, class097982, class098102, this.y);
        this.i.N(class098112);
        if (class098112.N().R()) {
            this.i.N(class098112.N(), class098102);
        } else {
            this.N(class098112.N());
        }
        this.y(this.M);
        this.u.N(this.M);
        this.B();
        return this.M;
    }

    public class09904 N(class09798 class097982) {
        return this.N(class097982, class09810.N());
    }

    public String N(class09791 class097912) {
        return class09820.y(this.M, class097912);
    }

    public class09849 N(String string) {
        if (string == null || this.M == null) {
            return null;
        }
        class10021 class100212 = class09841.N(this.M, string);
        return class100212 == null ? null : class09878.N(class100212);
    }

    private static class09849 N(class10021 class100212) {
        return new class09849(class100212.c().y(), class100212.c().L(), class100212.c().u(), class100212.c().i());
    }

    public float R() {
        return this.B;
    }
}

