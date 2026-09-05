/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09666
 *  Nursultan.class09689
 *  Nursultan.class09692
 *  Nursultan.class09713
 *  Nursultan.class09838
 *  Nursultan.class10009
 *  Nursultan.class10010
 *  Nursultan.class10012
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09689;
import Nursultan.class09692;
import Nursultan.class09713;
import Nursultan.class09838;
import Nursultan.class09962;
import Nursultan.class09964;
import Nursultan.class09965;
import Nursultan.class09969;
import Nursultan.class09970;
import Nursultan.class09971;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09976;
import Nursultan.class09977;
import Nursultan.class09979;
import Nursultan.class09983;
import Nursultan.class09985;
import Nursultan.class09989;
import Nursultan.class09992;
import Nursultan.class09993;
import Nursultan.class09994;
import Nursultan.class10001;
import Nursultan.class10002;
import Nursultan.class10003;
import Nursultan.class10006;
import Nursultan.class10009;
import Nursultan.class10010;
import Nursultan.class10012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class class09991 {
    public static final class09991 N = new class09991(null, null, null, null, null, null);
    private final class10002 y;
    private final class10010 L;
    private final class10006 u;
    private final class10002 i;
    private final class10002 R;
    private final List<class09992> M;

    public class09991 L(boolean bl) {
        return this.N(this.y.u(bl));
    }

    public class09991 L() {
        return this.N(this.y.L());
    }

    public class09991 L(class09973 class099732) {
        if (class099732 == null) {
            return this;
        }
        return this.N(this.y.L(class099732));
    }

    public class09991 L(float f, float f2) {
        return this.N(class09666.y((float)f)).y(class09666.y((float)f2));
    }

    public class09991 L(float f) {
        return this.R(f).M(f);
    }

    public class09991 L(class09992 class099922, UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.ACTIVE, class099922, unaryOperator);
    }

    public class09991 L(UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.HOVER, unaryOperator);
    }

    public class09991 L(int n) {
        return this.N(this.y.L(n));
    }

    public class09991 M(float f) {
        return this.N(this.y.u(f));
    }

    public class09991 M() {
        return this.L(true);
    }

    public class09991 P(float f) {
        return this.N(this.y.z(f));
    }

    public class09991 T(float f) {
        return this.N(class09971.L(f));
    }

    private class09991(class10002 class100022, class10010 class100102, class10006 class100062, class10002 class100023, class10002 class100024, List<class09992> list) {
        this.y = class100022 == null ? class10002.N : class100022;
        this.L = class100102 == null ? class10010.N : class100102;
        this.u = class100062 == null ? class10006.N : class100062;
        this.i = class100023 == null ? class10002.N : class100023;
        this.R = class100024 == null ? class10002.N : class100024;
        this.M = class09991.N(list);
    }

    public class10002 B() {
        return this.y;
    }

    public class09991 B(float f) {
        return this.N(class10009.N((float)f));
    }

    public class09991 Z(float f) {
        return this.N(class09965.N(f));
    }

    public class10010 Z() {
        return this.L;
    }

    public class09991 i() {
        return this.N(this.y.y(true));
    }

    public class09991 i(float f, float f2) {
        return this.N(class09971.y(f), class09971.y(f2));
    }

    public class09991 i(UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.ACTIVE, unaryOperator);
    }

    public class09991 i(int n) {
        return this.N(this.y.i(n));
    }

    public class09991 i(float f) {
        return this.N(this.y.y(f));
    }

    public class09991 b(float f) {
        return this.y(class09971.L(f));
    }

    public class09991 s(float f) {
        return this.N(this.y.U(f));
    }

    public class09991 n(float f) {
        return this.N(this.y.W(f));
    }

    public class09991 l(float f) {
        return this.N(this.y.s(f));
    }

    public class09991 d(float f) {
        return this.N(this.y.T(f));
    }

    public boolean m() {
        return this.y.N() && this.L.N() && this.u.N() && this.i.N() && this.R.N() && this.M.isEmpty();
    }

    public class09991 m(float f) {
        return this.y(class09666.N((float)f));
    }

    public class09991 t(float f) {
        return this.N(this.y.m(f));
    }

    public class09991 v(float f) {
        return this.N(this.y.W(f));
    }

    public class09991 j(float f) {
        return this.N(this.y.E(f));
    }

    public class10002 U() {
        return this.i;
    }

    public class09991 U(float f) {
        return this.N(this.y.M(f));
    }

    public class10006 z() {
        return this.u;
    }

    public class09991 z(float f) {
        return this.N(this.y.R(f));
    }

    public class09991 u(int n) {
        return this.N(this.y.u(n));
    }

    public class09991 u(UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.FOCUS, unaryOperator);
    }

    public class09991 u() {
        return this.N(this.y.N(true));
    }

    public class09991 u(float f, float f2) {
        return this.N(class09971.N(f), class09971.N(f2));
    }

    public class09991 u(float f) {
        return this.N(this.y.N(f));
    }

    public class09991 y(boolean bl) {
        return this.N(this.y.L(bl));
    }

    public class09991 y(class09992 class099922, UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.FOCUS, class099922, unaryOperator);
    }

    public class09991 y(int n) {
        return this.N(this.y.y(n));
    }

    public class09991 y(class09973 class099732) {
        if (class099732 == null) {
            return this;
        }
        return this.N(this.y.y(class099732));
    }

    public class09991 y(class09962 class099622) {
        if (class099622 == null) {
            return this;
        }
        return this.N(this.y.y(class099622));
    }

    public class09991 y() {
        return this.N(class10009.N());
    }

    public class09991 y(float f, float f2) {
        return this.N(class09666.N((float)f)).y(class09666.N((float)f2));
    }

    public class09991 y(float f) {
        return this.u(f).i(f);
    }

    public class09991 y(class09666 class096662) {
        return this.N(this.y.y(class096662));
    }

    public class09991 y(UnaryOperator<class09991> unaryOperator) {
        Objects.requireNonNull(unaryOperator, "update");
        class09991 class099912 = (class09991)unaryOperator.apply(class09991.N());
        class10002 class100022 = class099912 == null ? class10002.N : class099912.B();
        return new class09991(this.y, this.L, this.u, this.i, class100022, this.M);
    }

    public class10002 E() {
        return this.R;
    }

    public class09991 E(float f) {
        return this.N(this.y.B(f));
    }

    public class09991 N(class09994 ... class09994Array) {
        Objects.requireNonNull(class09994Array, "values");
        return this.N(class09692.N((class09994[])class09994Array));
    }

    public class09991 N(class09994 class099942) {
        return this.N(class09692.N((class09994[])new class09994[]{Objects.requireNonNull(class099942, "value")}));
    }

    public class09991 N(UnaryOperator<class09991> unaryOperator) {
        Objects.requireNonNull(unaryOperator, "update");
        class09991 class099912 = (class09991)unaryOperator.apply(class09991.N());
        class10002 class100022 = class099912 == null ? class10002.N : class099912.B();
        return new class09991(this.y, this.L, this.u, class100022, this.R, this.M);
    }

    public class09991 N(class09689 class096892) {
        if (class096892 == null) {
            return this;
        }
        return this.N(this.y.N(class096892));
    }

    public class09991 N(float f, float f2, float f3, float f4) {
        return this.N(new class09689(f, f2, f3, f4));
    }

    private class09991 N(class10002 class100022) {
        return new class09991(class100022, this.L, this.u, this.i, this.R, this.M);
    }

    private class09991 N(class09979 class099792, UnaryOperator<class09991> unaryOperator) {
        Objects.requireNonNull(unaryOperator, "update");
        class09991 class099912 = (class09991)unaryOperator.apply(class09991.N());
        class10002 class100022 = class099912 == null ? class10002.N : class099912.B();
        return new class09991(this.y, this.L.N(class099792, class100022), this.u, this.i, this.R, this.M);
    }

    public static class09991 N(class09991 ... class09991Array) {
        class09991 class099912 = N;
        if (class09991Array == null) {
            return class099912;
        }
        if (class09991Array.length == 1) {
            return class09991Array[0];
        }
        for (class09991 class099913 : class09991Array) {
            class099912 = class099912.N(class099913);
        }
        return class099912;
    }

    public class09991 N(class09991 class099912) {
        if (class099912 == null || class099912.m()) {
            return this;
        }
        if (this.m()) {
            return class099912;
        }
        return new class09991(this.y.N(class099912.y), this.L.N(class099912.L), this.u.N(class099912.u), this.i.N(class099912.i), this.R.N(class099912.R), class09991.N(this.M, class099912.M));
    }

    private static List<class09992> N(List<class09992> list) {
        if (list == null || list.isEmpty()) {
            return List.of();
        }
        ArrayList<class09992> arrayList = new ArrayList<class09992>(list.size());
        for (class09992 class099922 : list) {
            if (class099922 == null || class09991.N(arrayList, class099922)) continue;
            arrayList.add(class099922);
        }
        return arrayList.isEmpty() ? List.of() : List.copyOf(arrayList);
    }

    private static List<class09992> N(List<class09992> list, List<class09992> list2) {
        if (list2 == null || list2.isEmpty()) {
            return class09991.N(list);
        }
        if (list == null || list.isEmpty()) {
            return class09991.N(list2);
        }
        ArrayList<class09992> arrayList = new ArrayList<class09992>(list.size() + list2.size());
        arrayList.addAll(list);
        for (class09992 class099922 : list2) {
            if (class099922 == null || class09991.N(arrayList, class099922)) continue;
            arrayList.add(class099922);
        }
        return List.copyOf(arrayList);
    }

    private static boolean N(List<class09992> list, class09992 class099922) {
        if (class099922 == null || list == null) {
            return false;
        }
        Iterator<class09992> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != class099922) continue;
            return true;
        }
        return false;
    }

    public static class09991 N() {
        return N;
    }

    public class09991 N(class09992 class099922, UnaryOperator<class09991> unaryOperator) {
        return this.N(class09979.HOVER, class099922, unaryOperator);
    }

    public class09991 N(class09979 class099792, class09992 class099922, UnaryOperator<class09991> unaryOperator) {
        if (class099792 == null || class099922 == null) {
            return this;
        }
        Objects.requireNonNull(unaryOperator, "update");
        class09991 class099912 = (class09991)unaryOperator.apply(class09991.N());
        class10002 class100022 = class099912 == null ? class10002.N : class099912.B();
        return new class09991(this.y, this.L, this.u.N(class099792, class099922, class100022), this.i, this.R, this.M);
    }

    public class09991 N(class09977 class099772) {
        if (class099772 == null) {
            return this;
        }
        class09991 class099912 = this;
        if (class099772.u() != null) {
            class099912 = class099912.N(class099772.u());
        }
        if (class099772.i() != null) {
            class099912 = class099912.N(class099772.i());
        }
        if (class099772.R() != null) {
            class099912 = class099912.y(class099772.R());
        }
        if (class099772.M() != null) {
            class099912 = class099912.N(class099772.M());
        }
        return class099912;
    }

    public class09991 N(class09992 class099922) {
        if (class099922 == null || class09991.N(this.M, class099922)) {
            return this;
        }
        ArrayList<class09992> arrayList = new ArrayList<class09992>(this.M.size() + 1);
        arrayList.addAll(this.M);
        arrayList.add(class099922);
        return new class09991(this.y, this.L, this.u, this.i, this.R, arrayList);
    }

    public class09991 N(class09992 ... class09992Array) {
        if (class09992Array == null || class09992Array.length == 0) {
            return this;
        }
        class09991 class099912 = this;
        for (class09992 class099922 : class09992Array) {
            class099912 = class099912.N(class099922);
        }
        return class099912;
    }

    public class10002 N(boolean bl, boolean bl2, boolean bl3) {
        return this.y.N(this.L.N(bl, bl2, bl3));
    }

    public class09991 N(class09666 class096662) {
        return this.N(this.y.N(class096662));
    }

    public class09991 N(class09666 class096662, class09666 class096663) {
        return this.N(class096662).y(class096663);
    }

    public class09991 N(class10003 class100032) {
        return this.N(class100032, 0.0f);
    }

    public class09991 N(class10003 class100032, float f) {
        if (class100032 == null) {
            return this;
        }
        return this.N(this.y.N(class100032).Z(f));
    }

    public class09991 N(class09970 class099702) {
        if (class099702 == null) {
            return this;
        }
        return this.N(this.y.N(class099702));
    }

    public class09991 N(class09993 class099932) {
        if (class099932 == null) {
            return this;
        }
        return this.N(this.y.N(class099932));
    }

    public class09991 N(class09976 class099762) {
        if (class099762 == null) {
            return this;
        }
        return this.N(this.y.N(class099762));
    }

    public class09991 N(float f) {
        return this.N(class09985.N(f));
    }

    public class09991 N(class09969 class099692) {
        if (class099692 == null) {
            return this;
        }
        return this.N(this.y.N(class099692));
    }

    public class09991 N(class09965 class099652) {
        if (class099652 == null) {
            return this;
        }
        return this.N(this.y.N(class099652));
    }

    public class09991 N(class10012 class100122) {
        if (class100122 == null) {
            return this;
        }
        class09991 class099912 = this;
        if (class100122.N() != null) {
            class099912 = class099912.z(class100122.N().floatValue());
        }
        if (class100122.y() != null) {
            class099912 = class099912.u(class100122.y());
        }
        if (class100122.L() != null) {
            class099912 = class099912.N(class100122.L());
        }
        return class099912;
    }

    public class09991 N(class10009 class100092) {
        if (class100092 == null) {
            return this;
        }
        return this.N(this.y.N(class100092));
    }

    public class09991 N(int n) {
        return this.N(this.y.N(n));
    }

    public class09991 N(float f, float f2) {
        return this.U(f).E(f2);
    }

    public class09991 N(String string) {
        if (string == null) {
            return this;
        }
        return this.N(this.y.N(string));
    }

    public class09991 N(class09838 class098382) {
        if (class098382 == null) {
            return this;
        }
        return this.N(this.y.N(class098382));
    }

    public class09991 N(class09975 class099752) {
        if (class099752 == null) {
            return this;
        }
        return this.N(this.y.N(class099752));
    }

    public class09991 N(class09962 class099622) {
        if (class099622 == null) {
            return this;
        }
        return this.N(this.y.N(class099622));
    }

    public class09991 N(class09973 class099732) {
        if (class099732 == null) {
            return this;
        }
        return this.N(this.y.N(class099732));
    }

    public class09991 N(class09964 class099642) {
        if (class099642 == null) {
            return this;
        }
        return this.N(this.y.N(class099642));
    }

    public class09991 N(float f, int n) {
        return this.G(f).R(n);
    }

    public class09991 N(class09713 class097132) {
        return this.N(this.y.N(Objects.requireNonNull(class097132, "value")));
    }

    public class09991 N(class09962 class099622, class09962 class099623) {
        return this.N(class099622).y(class099623);
    }

    public class09991 N(class10001 class100012) {
        if (class100012 == null) {
            return this;
        }
        return this.N(this.y.N(class100012));
    }

    public class09991 N(class09985 class099852) {
        if (class099852 == null) {
            return this;
        }
        return this.N(this.y.N(class099852));
    }

    public class09991 N(boolean bl) {
        return this.N(this.y.N(class09989.VISIBLE, bl));
    }

    public class09991 N(class09983 class099832) {
        if (class099832 == null) {
            return this;
        }
        return this.N(this.y.N(class099832));
    }

    public class09991 W(float f) {
        return this.N(class09666.N((float)f));
    }

    public List<class09992> W() {
        return this.M;
    }

    public class09991 R(float f) {
        return this.N(this.y.L(f));
    }

    public class09991 R(int n) {
        return this.N(this.y.R(n));
    }

    public class09991 R() {
        return this.N(class09971.u(100.0f), class09971.u(100.0f));
    }

    public class09991 G(float f) {
        return this.N(this.y.P(f));
    }
}

