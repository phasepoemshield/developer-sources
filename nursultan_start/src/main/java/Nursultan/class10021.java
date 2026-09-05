/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09836
 *  Nursultan.class09841
 *  Nursultan.class09860
 *  Nursultan.class09867
 *  Nursultan.class09876
 *  Nursultan.class09904
 *  Nursultan.class09908
 *  Nursultan.class09937
 *  Nursultan.class09938
 *  Nursultan.class09963
 *  Nursultan.class09968
 *  Nursultan.class09969
 *  Nursultan.class09980
 *  Nursultan.class09991
 *  Nursultan.class09992
 *  Nursultan.class10002
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09836;
import Nursultan.class09841;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09876;
import Nursultan.class09904;
import Nursultan.class09908;
import Nursultan.class09937;
import Nursultan.class09938;
import Nursultan.class09963;
import Nursultan.class09968;
import Nursultan.class09969;
import Nursultan.class09980;
import Nursultan.class09991;
import Nursultan.class09992;
import Nursultan.class10002;
import Nursultan.class10016;
import Nursultan.class10034;
import Nursultan.class10049;
import Nursultan.class10057;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class class10021
implements class09904 {
    private final String N;
    private final class10049 y;
    private final List<class10021> L = new ArrayList<class10021>();
    private final List<class10021> u = Collections.unmodifiableList(this.L);
    private Map<class09867, List<class10016>> i;
    private final class09937 R = new class09937(this);
    private final class09908 M = new class09908();
    private final class10034 B;
    private class09841 Z;
    private class10021 z;
    private int U = -1;
    private boolean E;
    private boolean W;
    private boolean m;
    private boolean P;
    private String s;
    private int T = 3;
    private int b = 3;
    private int j = 1;
    private class09991 v = class09991.N;
    private List<class09992> n = List.of();
    private class09980 t = class09968.N();
    private class10002 G;
    private class09980 l;
    private boolean d;
    private int w;
    private int k;
    private int Y;
    private int Q;
    private int O;
    private int g;
    private int I;
    private int J;

    public int w() {
        return this.Q;
    }

    public void L(int n) {
        this.z(n);
    }

    public void L(String string) {
        String string2;
        String string3 = string2 = string == null ? "" : string;
        if (this.B.u().equals(string2)) {
            return;
        }
        this.B.L(string2);
        this.p();
        this.i(1);
    }

    private static boolean L(class09980 class099802, class09980 class099803) {
        return class099802.M() == class099803.M() && class099802.w() == class099803.w() && class099802.k() == class099803.k() && class10021.N(class099802.Y().N(), class099803.Y().N()) && class10021.N(class099802.Y().y(), class099803.Y().y()) && class10021.N(class099802.Y().L(), class099803.Y().L()) && class10021.N(class099802.Y().u(), class099803.Y().u());
    }

    private boolean L(List<class10021> list) {
        for (int i = 0; i < this.L.size(); ++i) {
            if (this.L.get(i) == list.get(i)) continue;
            return false;
        }
        return true;
    }

    public void L(boolean bl) {
        this.m = bl;
    }

    public List<class10021> L() {
        return this.u;
    }

    public int M() {
        return this.U;
    }

    public boolean M(int n) {
        if (n == 1) {
            return this.x();
        }
        return class10057.N(this.T, n);
    }

    public boolean P() {
        return this.E;
    }

    public class09841 K() {
        return this.Z;
    }

    public boolean T() {
        return this.d;
    }

    public int Q() {
        return this.I;
    }

    public class10021(class10049 class100492) {
        this(null, class100492);
    }

    public class10021(String string, class10049 class100492) {
        this.N = string == null || string.isBlank() ? null : string;
        this.y = Objects.requireNonNull(class100492, "type");
        this.B = class10034.N(class100492);
    }

    public class10021 B(int n) {
        if (n < 0 || n >= this.L.size()) {
            return null;
        }
        class10021 class100212 = this.L.remove(n);
        if (class100212 != null) {
            if (class100212.j > 0) {
                this.U(-class100212.j);
            }
            class100212.z = null;
            class100212.a();
            class100212.N((class09841)null);
        }
        this.A();
        this.i(2);
        return class100212;
    }

    public String B() {
        return this.B.y();
    }

    private void C() {
        class10021 class100212 = this;
        while (class100212 != null) {
            ++class100212.J;
            class100212 = class100212.z;
        }
    }

    private void D() {
        if (this.j > 0) {
            this.b |= 1;
            return;
        }
        this.b &= 0xFFFFFFFE;
    }

    private void F() {
        ++this.Q;
        ++this.O;
        this.C();
    }

    public void I() {
        this.S();
    }

    public class09937 c() {
        return this.R;
    }

    private int S() {
        if (this.j == 0) {
            return 0;
        }
        boolean bl = this.x();
        this.T &= 0xFFFFFFFE;
        int n = bl && !this.x() ? 1 : 0;
        for (class10021 class100212 : this.L) {
            if (class100212.j == 0) continue;
            n += class100212.S();
        }
        if (n > 0) {
            this.j -= n;
        }
        this.D();
        return n;
    }

    public String Z() {
        return this.B.L();
    }

    private int Z(int n) {
        boolean bl = this.x();
        this.T = class10057.y(this.T, n);
        this.b = class10057.y(this.b, n);
        this.M.U();
        this.M.E();
        int n2 = !bl && this.x() ? 1 : 0;
        for (class10021 class100212 : this.L) {
            n2 += class100212.Z(n);
        }
        if (n2 > 0) {
            this.j += n2;
        }
        return n2;
    }

    public void V() {
        if (this.i == null) {
            return;
        }
        Iterator<List<class10016>> var1 = this.i.values().iterator();
        while (var1.hasNext()) {
            Iterator<class10016> var3 = var1.next().iterator();
            while (var3.hasNext()) {
                var3.next().L = true;
            }
        }
        this.i = null;
    }

    void e() {
        this.C();
    }

    public class09991 i() {
        return this.v;
    }

    public void i(int n) {
        int n2 = class10057.y(0, n);
        boolean bl = this.x();
        this.T = class10057.y(this.T, n2);
        this.b = class10057.y(this.b, n2);
        if (!bl && this.x()) {
            this.U(1);
        }
        this.M.U();
        this.M.E();
        class10021 class100212 = this.z;
        while (class100212 != null) {
            class100212.b = class10057.y(class100212.b, n2);
            class100212.M.E();
            class100212 = class100212.z;
        }
    }

    public void b() {
        if (!this.d) {
            this.d = true;
            this.u(1);
        }
    }

    private boolean x() {
        return class10057.N(this.T, 1) || class10057.N(this.T, 2) || class10057.N(this.T, 4) || class10057.N(this.T, 8);
    }

    String s() {
        return this.s;
    }

    public class10002 n() {
        return this.G;
    }

    private void f() {
        ++this.I;
    }

    public int l() {
        return this.k;
    }

    public int d() {
        return this.Y;
    }

    private void a() {
        this.U = -1;
        Iterator<class10021> var1 = this.L.iterator();
        while (var1.hasNext()) {
            var1.next().a();
        }
    }

    public boolean m() {
        return this.P;
    }

    public class09980 o() {
        return this.t;
    }

    private void p() {
        ++this.Q;
        this.C();
    }

    public int k() {
        return this.O;
    }

    public class09980 t() {
        return this.l;
    }

    public int g() {
        return this.b;
    }

    public List<class09992> v() {
        return this.n;
    }

    public void j() {
        if (this.d) {
            this.d = false;
            this.u(1);
        }
    }

    public class09908 q() {
        return this.M;
    }

    public class09938 U() {
        return this.B.N();
    }

    private void U(int n) {
        if (n == 0) {
            return;
        }
        class10021 class100212 = this;
        while (class100212 != null) {
            class100212.j += n;
            class100212.D();
            class100212 = class100212.z;
        }
    }

    private int z(int n) {
        boolean bl = this.x();
        this.T &= ~n;
        int n2 = (n & 1) != 0 && bl && !this.x() ? 1 : 0;
        for (class10021 class100212 : this.L) {
            n2 += class100212.z(n);
        }
        this.b &= ~n;
        if ((n & 1) != 0 && n2 > 0) {
            this.j -= n2;
        }
        this.D();
        return n2;
    }

    public String z() {
        return this.B.u();
    }

    public int u() {
        return this.L.size();
    }

    private void u(List<class10021> list) {
        IdentityHashMap<class10021, Boolean> identityHashMap = new IdentityHashMap<class10021, Boolean>();
        for (class10021 object : this.L) {
            identityHashMap.put(object, Boolean.TRUE);
        }
        IdentityHashMap<class10021, Boolean> identityHashMap2 = new IdentityHashMap<class10021, Boolean>();
        for (class10021 class100212 : list) {
            if (class100212 == null || class100212.z != this || !identityHashMap.containsKey(class100212)) {
                throw new IllegalArgumentException("Reordered child list contains an element outside this parent");
            }
            if (identityHashMap2.put(class100212, Boolean.TRUE) == null) continue;
            throw new IllegalArgumentException("Reordered child list contains duplicate elements");
        }
    }

    public void u(boolean bl) {
        this.P = bl;
    }

    void u(String string) {
        this.s = string == null || string.isBlank() ? null : string;
    }

    private static boolean u(class09980 class099802, class09980 class099803) {
        return class099802.s() == class099803.s() && class099802.T() == class099803.T() && class099802.b() == class099803.b();
    }

    public void u(int n) {
        int n2 = class10057.y(0, n);
        int n3 = this.Z(n2);
        class10021 class100212 = this.z;
        while (class100212 != null) {
            class100212.b = class10057.y(class100212.b, n2);
            if (n3 > 0) {
                class100212.j += n3;
            }
            class100212.M.E();
            class100212 = class100212.z;
        }
    }

    public boolean y(class10021 class100212) {
        if (class100212 == null) {
            return false;
        }
        int n = this.L.indexOf(class100212);
        if (n < 0) {
            return false;
        }
        this.B(n);
        return true;
    }

    public void y(class09867 class098672, class09836 class098362) {
        if (class098672 == null || class098362 == null || this.i == null) {
            return;
        }
        List<class10016> var3 = this.i.get(class098672);
        if (var3 == null) {
            return;
        }
        var3.removeIf(class100162 -> {
            if (class100162.N != class098362) {
                return false;
            }
            class100162.L = true;
            return true;
        });
        if (var3.isEmpty()) {
            this.i.remove(class098672);
        }
    }

    public class10049 y() {
        return this.y;
    }

    public void y(int n) {
        this.U = Math.max(-1, n);
    }

    private static boolean y(class09980 class099802, class09980 class099803) {
        return class10021.N(class099802.c(), class099803.c()) && Objects.equals(class099802.X(), class099803.X());
    }

    public void y(String string) {
        String string2;
        String string3 = string2 = string == null ? "" : string;
        if (this.B.L().equals(string2)) {
            return;
        }
        this.B.y(string2);
        this.p();
        this.i(1);
    }

    public void y(List<class10021> list) {
        if (list == null || list.size() != this.L.size()) {
            throw new IllegalArgumentException("Reordered child list must contain every current child exactly once");
        }
        if (this.L(list)) {
            return;
        }
        this.u(list);
        this.L.clear();
        this.L.addAll(list);
        this.A();
        this.i(2);
    }

    public void y(boolean bl) {
        this.W = bl;
    }

    public boolean E() {
        return this.W;
    }

    private void A() {
        ++this.g;
        ++this.I;
        this.C();
    }

    public boolean N(class09992 class099922) {
        return class099922 != null && class09963.N(this.n, (class09992)class099922);
    }

    public void N(String string) {
        String string2;
        String string3 = string2 = string == null ? "" : string;
        if (this.B.y().equals(string2)) {
            return;
        }
        this.B.N(string2);
        if (this.y == class10049.TEXT) {
            this.R.N("");
        }
        this.F();
        this.i(this.y == class10049.TEXT ? 2 : 1);
    }

    public void N(class09991 class099912) {
        this.v = class099912 == null ? class09991.N : class099912;
    }

    public void N(boolean bl) {
        this.E = bl;
    }

    private static boolean N(float f, float f2) {
        return Float.floatToIntBits(f) == Float.floatToIntBits(f2);
    }

    public class10021 N(int n) {
        return this.L.get(n);
    }

    public void N(class10002 class100022, class09980 class099802) {
        this.G = class100022;
        this.l = class099802;
    }

    public void N(class09980 class099802) {
        boolean bl;
        class09980 class099803 = this.t;
        class09980 class099804 = class099802 == null ? class09968.N() : class099802;
        if (Objects.equals(class099803, class099804)) {
            return;
        }
        boolean bl2 = class099803 != null && class099803.s() == class09969.FIXED;
        boolean bl3 = bl = class099804.s() == class09969.FIXED;
        if (this.Z != null && bl2 != bl) {
            this.Z.N(bl ? 1 : -1);
        }
        boolean bl4 = class099803 != null && class099803.L();
        boolean bl5 = class099804.L();
        if (this.Z != null && bl4 != bl5) {
            this.Z.y(bl5 ? 1 : -1);
        }
        this.t = class099804;
        this.N(class099803, class099804);
    }

    public String N() {
        return this.N;
    }

    public void N(List<class09992> list) {
        this.n = class09963.N(list);
    }

    public void N(class09938 class099382) {
        if (this.B.N() == class099382) {
            return;
        }
        this.B.N(class099382);
        this.p();
        this.i(1);
    }

    public void N(class09867 class098673, class09836 class098362, class09876 class098762) {
        class09876 class098763;
        if (class098673 == null || class098362 == null) {
            return;
        }
        class09876 class098764 = class098763 = class098762 == null ? class09876.N : class098762;
        if (this.i == null) {
            this.i = new EnumMap<class09867, List<class10016>>(class09867.class);
        }
        ((List)this.i.computeIfAbsent(class098673, class098672 -> new ArrayList())).add(new class10016(class098362, class098763));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class09860 class098602, boolean bl) {
        if (class098602 == null || class098602.i() == null || this.i == null) {
            return;
        }
        List<class10016> var3 = this.i.get(class098602.i());
        if (var3 == null || var3.isEmpty()) {
            return;
        }
        for (class10016 class100162 : List.copyOf(var3)) {
            if (class100162.L || class100162.y.u() != bl) continue;
            class098602.N(class100162.y.R());
            try {
                class100162.N.handle(class098602);
            }
            finally {
                class098602.v();
            }
            if (class100162.y.i()) {
                class100162.L = true;
                var3.remove(class100162);
            }
            if (!class098602.W()) continue;
            break;
        }
        if (var3.isEmpty()) {
            this.i.remove(class098602.i());
        }
    }

    public boolean N(class09867 class098672) {
        if (class098672 == null || this.i == null) {
            return false;
        }
        List<class10016> var2 = this.i.get(class098672);
        if (var2 == null || var2.isEmpty()) {
            return false;
        }
        Iterator<class10016> var3 = var2.iterator();
        while (var3.hasNext()) {
            if (var3.next().L) continue;
            return true;
        }
        return false;
    }

    public void N(int n, class10021 class100212) {
        if (class100212 == null) {
            return;
        }
        if (this.y == class10049.CANVAS) {
            throw new IllegalStateException("Element type '" + String.valueOf((Object)this.y) + "' cannot have children");
        }
        int n2 = class09693.N((int)n, (int)0, (int)this.L.size());
        class100212.z = this;
        class100212.a();
        class100212.N(this.Z);
        this.L.add(n2, class100212);
        if (class100212.j > 0) {
            this.U(class100212.j);
        }
        this.A();
        this.i(2);
    }

    public void N(class09841 class098412) {
        class09841 class098413 = this.Z;
        if (class098413 != class098412 && this.t != null && this.t.s() == class09969.FIXED) {
            if (class098413 != null) {
                class098413.N(-1);
            }
            if (class098412 != null) {
                class098412.N(1);
            }
        }
        if (class098413 != class098412 && this.t != null && this.t.L()) {
            if (class098413 != null) {
                class098413.y(-1);
            }
            if (class098412 != null) {
                class098412.y(1);
            }
        }
        this.Z = class098412;
        Iterator<class10021> var3 = this.L.iterator();
        while (var3.hasNext()) {
            var3.next().N(class098412);
        }
    }

    private void N(class09980 class099802, class09980 class099803) {
        ++this.w;
        if (!class10021.y(class099802, class099803)) {
            ++this.k;
        }
        if (!class10021.L(class099802, class099803)) {
            ++this.Y;
        }
        this.C();
        if (!class10021.u(class099802, class099803)) {
            this.H();
        }
    }

    public void N(class10021 class100212) {
        this.N(this.L.size(), class100212);
    }

    public void N(class09867 class098672, class09836 class098362) {
        this.N(class098672, class098362, class09876.N);
    }

    public boolean W() {
        return this.m;
    }

    public boolean R(int n) {
        if (n == 1) {
            return this.j > 0;
        }
        return class10057.N(this.b, n);
    }

    public class10021 X() {
        return this.z;
    }

    public int O() {
        return this.J;
    }

    void H() {
        if (this.z != null) {
            this.z.f();
        }
    }

    public int G() {
        return this.w;
    }

    public int Y() {
        return this.g;
    }
}

