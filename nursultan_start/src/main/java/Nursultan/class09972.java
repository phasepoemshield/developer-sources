/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09770
 *  Nursultan.class09781
 *  Nursultan.class09830
 *  Nursultan.class09887
 *  Nursultan.class09888
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10047
 */
package Nursultan;

import Nursultan.class09770;
import Nursultan.class09781;
import Nursultan.class09830;
import Nursultan.class09887;
import Nursultan.class09888;
import Nursultan.class09890;
import Nursultan.class09895;
import Nursultan.class09896;
import Nursultan.class09897;
import Nursultan.class09899;
import Nursultan.class09901;
import Nursultan.class09903;
import Nursultan.class09908;
import Nursultan.class09914;
import Nursultan.class09915;
import Nursultan.class09916;
import Nursultan.class09917;
import Nursultan.class09918;
import Nursultan.class09919;
import Nursultan.class09922;
import Nursultan.class09926;
import Nursultan.class09928;
import Nursultan.class09929;
import Nursultan.class09932;
import Nursultan.class09934;
import Nursultan.class09935;
import Nursultan.class09936;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class10007;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10047;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

final class class09972 {
    private static final int N = 1;
    private static final int y = 2;
    private static final int L = 4;
    private final class09917 u;
    private final class10007 i;
    private final class09929 R;
    private final class09897 M;
    private final class09890 B;
    private final class09928 Z;
    private class09887 z;

    private static boolean L(class09980 class099802) {
        return class099802.C() > 0.0f;
    }

    class09972(class09781 class097812) {
        class09781 class097813 = Objects.requireNonNull(class097812, "context");
        this.u = new class09917(class097813);
        this.i = new class10007(class097813);
        this.R = new class09929(this.u, this.i);
        this.M = new class09897(this.i);
        this.B = new class09890();
        this.Z = new class09928(this.i, this.u);
    }

    private static boolean u(class09980 class099802) {
        return !class099802.g() || class099802.f() <= 0.0f;
    }

    private static boolean y(List<class10021> list) {
        Iterator<class10021> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().R(1)) continue;
            return true;
        }
        return false;
    }

    private static boolean y(class09980 class099802) {
        return class099802.f() > 0.0f && class099802.f() < 1.0f;
    }

    private static List<class10021> N(List<class10021> list) {
        boolean bl = false;
        for (class10021 object : list) {
            if (!class10019.N((class10021)object)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (class10021 class100212 : list) {
            if (class10019.N((class10021)class100212)) continue;
            arrayList.add(class100212);
        }
        return arrayList;
    }

    private class09895 N(class10021 class100212, class09895 class098952, List<String> list, class09896 class098962) {
        if (class100212.K() == null || !class100212.K().i()) {
            return class098952;
        }
        List var5 = class100212.K().u();
        if (var5.isEmpty()) {
            return class098952;
        }
        ArrayList<class09935> arrayList = null;
        int n = class098952.y();
        for (class10021 class100213 : var5) {
            class09895 class098953 = this.N(class100213, list, class098962, 0.0f, this.z);
            if (class098953.N().isEmpty()) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<class09935>(class098952.N().size() + var5.size());
                arrayList.addAll(class098952.N());
            }
            arrayList.addAll(class098953.N());
            n += class098953.y();
        }
        return arrayList == null ? class098952 : new class09895(arrayList, n);
    }

    private static boolean N(class09916 class099162, class09916 class099163) {
        return class099162.y() < class099163.y() + class099163.u() && class099163.y() < class099162.y() + class099162.u() && class099162.L() < class099163.L() + class099163.i() && class099163.L() < class099162.L() + class099162.i();
    }

    private static boolean N(List<class09922> list, class09916 class099162) {
        for (int i = 0; i < list.size(); ++i) {
            if (!class09972.N(list.get(i).N(), class099162)) continue;
            return true;
        }
        return false;
    }

    private static int N(List<class09935> list, List<class09922> list2, int n) {
        if (list2 == null || list2.isEmpty()) {
            return 0;
        }
        int n2 = list2.size();
        if (n2 == 1) {
            list.add(list2.get(0));
            list2.clear();
            return n;
        }
        class09922 class099222 = list2.get(0);
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += list2.get(i).L().size();
        }
        ArrayList<class09935> arrayList = new ArrayList<class09935>(n3);
        class09916 class099162 = class099222.N();
        float f = class099162.y();
        float f2 = class099162.L();
        float f3 = class099162.y() + class099162.u();
        float f4 = class099162.L() + class099162.i();
        arrayList.addAll(class099222.L());
        for (int i = 1; i < n2; ++i) {
            class09922 class099223 = list2.get(i);
            arrayList.addAll(class099223.L());
            class09916 class099163 = class099223.N();
            f = Math.min(f, class099163.y());
            f2 = Math.min(f2, class099163.L());
            f3 = Math.max(f3, class099163.y() + class099163.u());
            f4 = Math.max(f4, class099163.L() + class099163.i());
        }
        list.add(new class09922(new class09916(f, f2, f3 - f, f4 - f2), class099222.y(), arrayList));
        list2.clear();
        return n;
    }

    private static boolean N(class10021 class100212, class09908 class099082, int n, int n2) {
        return !class100212.R(1) && class099082.N(n, n2);
    }

    private static boolean N(class10021 class100212, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, List<class10021> list) {
        boolean bl = class100212.M(1);
        boolean bl2 = class09972.y(list);
        return !bl && !bl2 && class100212.q().N(n, n2, n3, n4, n5, n6, n7, n8);
    }

    private static boolean N(class09980 class099802, List<class10021> list, boolean bl) {
        if (!list.isEmpty()) {
            return class099802.d() != class09976.NONE && !bl;
        }
        return !bl;
    }

    private static void N(class10021 class100212, List<String> list) {
        String string = class100212.N();
        if (string != null && !string.isBlank()) {
            list.add(string);
        }
    }

    private static boolean N(class10021 class100212, int n, int n2, int n3, int n4, int n5) {
        return !class100212.M(1) && class100212.q().N(n, n2, n3, n4, n5);
    }

    private static class09895 N(class09908 class099082) {
        return new class09895(class099082.B(), class099082.Z());
    }

    private int N(class10021 class100212, class09980 class099802, class09887 class098872, float f, class09887 class098873) {
        boolean bl;
        boolean bl2;
        float f2 = class09929.N(class099802);
        boolean bl3 = f2 > 0.0f;
        boolean bl4 = bl2 = class098872 != null && class098872.N();
        if (!bl2 && !bl3) {
            return 0;
        }
        boolean bl5 = class099802.d() == class09976.SELF;
        boolean bl6 = bl5 && bl2 && class099802.W().y();
        boolean bl7 = bl2 && class09918.y(class098872, f, class098873);
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = class100212.c().P() > 0.0f;
        boolean bl11 = bl = bl5 && bl2 && (!bl7 || bl6) && !bl10;
        if (bl || bl3) {
            class09916 class099162 = this.Z.L(class100212);
            if (class099162.N()) {
                if (bl) {
                    bl7 = true;
                    bl8 = bl6;
                }
            } else {
                float f3 = class099162.y();
                float f4 = class099162.L();
                float f5 = class099162.y() + class099162.u();
                float f6 = class099162.L() + class099162.i();
                if (bl && !bl7 && class09918.N(class098872, f3, f4, f5, f6)) {
                    bl7 = true;
                }
                if (bl && bl6 && class09918.N(class098872, class099802.W().u() + f2, class099802.W().i() + f2, class099802.W().R() + f2, class099802.W().M() + f2, f3, f4, f5, f6)) {
                    bl8 = true;
                }
                if (bl3) {
                    bl9 = class09972.N(class100212, class099802, f2, f3, f4, f5, f6);
                }
            }
        }
        int n = 0;
        if (bl7) {
            n |= 1;
        }
        if (bl8) {
            n |= 2;
        }
        if (bl9) {
            n |= 4;
        }
        return n;
    }

    private static boolean N(class10021 class100212, class09980 class099802, float f, float f2, float f3, float f4, float f5) {
        float f6 = class100212.c().y();
        float f7 = class100212.c().L();
        float f8 = Math.max(0.0f, class100212.c().u());
        float f9 = Math.max(0.0f, class100212.c().i());
        float f10 = f6 + f;
        float f11 = f7 + f;
        float f12 = f6 + Math.max(f, f8 - f);
        float f13 = f7 + Math.max(f, f9 - f);
        return !class09918.N(new class09887(f10, f11, Math.max(f10, f12), Math.max(f11, f13)), class099802.W().u(), class099802.W().i(), class099802.W().R(), class099802.W().M(), f2, f3, f4, f5);
    }

    private static class09895 N(class09908 class099082, class09980 class099802, class09887 class098872, int n, class09895 class098952) {
        boolean bl = (n & 4) != 0;
        List<class09935> var6 = bl ? class099082.L() : class099082.y();
        List<Object> list = bl ? class099082.u() : List.of();
        List<class09935> var8 = class099082.i();
        List<class09935> var9 = class099082.R();
        class09926 class099262 = (n & 2) != 0 ? null : class099082.M();
        boolean bl2 = class099802.d() != class09976.PARENT;
        boolean bl3 = class098872 != null && class098872.N() && (n & 1) == 0 && class099262 == null;
        int n2 = var8.size() + class098952.y() + (bl2 ? var9.size() : 0);
        int n3 = var6.size() + n2 + (bl2 ? 0 : var9.size()) + list.size();
        ArrayList<class09935> arrayList = new ArrayList<class09935>(var6.size() + var8.size() + class098952.N().size() + var9.size() + list.size() + 1);
        arrayList.addAll(var6);
        if (n2 > 0) {
            if (class099262 == null && !bl3) {
                arrayList.addAll(var8);
                arrayList.addAll(class098952.N());
                if (bl2) {
                    arrayList.addAll(var9);
                }
            } else {
                class09934 class099342;
                ArrayList<class09935> arrayList2 = new ArrayList<class09935>(var8.size() + class098952.N().size() + (bl2 ? var9.size() : 0));
                arrayList2.addAll(var8);
                arrayList2.addAll(class098952.N());
                if (bl2) {
                    arrayList2.addAll(var9);
                }
                class09934 class099343 = class099342 = class099262 != null ? new class09934(class099262, arrayList2) : null;
                if (bl3) {
                    List<class09935> list2 = class099342 != null ? List.of(class099342) : arrayList2;
                    arrayList.add(new class09903(class098872.y(), class098872.L(), class098872.u() - class098872.y(), class098872.i() - class098872.L(), list2));
                } else {
                    arrayList.add(class099342);
                }
            }
        }
        if (!bl2) {
            arrayList.addAll(var9);
        }
        arrayList.addAll(list);
        if (arrayList.isEmpty()) {
            return class09895.N;
        }
        return new class09895(arrayList, n3);
    }

    private class09895 N(class10021 class100212, List<String> list, class09896 class098962, float f, class09887 class098872) {
        int n;
        int n2;
        int n3;
        int n4;
        class09908 class099082 = class100212.q();
        if (class09918.N(class098872)) {
            return class09895.N;
        }
        int n5 = class099082.y(class098872, f);
        if (class09972.N(class100212, class099082, n5, n4 = class100212.O())) {
            ++class098962.N;
            return class09972.N(class099082);
        }
        class09980 class099802 = class100212.o();
        class09830 class098302 = this.i.N(class100212, class099802);
        List var11 = class10047.N((class10021)class100212);
        class09887 class098873 = class09918.N(class100212, class099802);
        class09887 class098874 = class09918.N(class098873, f, class098872);
        boolean bl = class09918.N(class098872, class100212, f);
        if (class09972.N(class099802, var11, bl)) {
            return class09895.N;
        }
        if (class09972.u(class099802)) {
            return class09895.N;
        }
        class09915 class099152 = this.u.N(class100212);
        int n6 = class099082.N(class099152);
        int n7 = class099082.N(class098873);
        int n8 = class099082.N(class098874, f);
        int n9 = class100212.G();
        if (class09972.N(class100212, n4, n9, n3 = class100212.c().W(), n2 = class100212.w(), n6, n7, n8, n = this.N(class100212, class099802, class098873, f, class098872), var11)) {
            ++class098962.N;
            class099082.N(n5);
            return class09972.N(class099082);
        }
        ++class098962.y;
        class09972.N(class100212, list);
        if (!class09972.N(class100212, n9, n3, n2, n6, n7)) {
            this.R.N(class100212, class099802, class098302, class099152, class098873, n9, n3, n2, n6, n7);
            ++class098962.L;
        }
        class09895 class098952 = this.N(class09972.N(var11), list, class098962, f, class098874, class09918.N(class100212));
        if (!(bl && this.M.N(class100212, class099802, class098302, class099152)) && class098952.y() == 0) {
            return class09895.N;
        }
        class09895 class098953 = class09972.N(class099082, class099802, class098873, n, class098952);
        class098953 = this.N(class100212, class099802, class098953);
        class099082.N(class098953.N(), class098953.y(), n4, n8, n, n5);
        return class09972.N(class099082);
    }

    class09936 N(class10021 class100212, float f, float f2, class09770 class097702, boolean bl) {
        class09887 class098872;
        if (class100212 == null) {
            return class09936.N();
        }
        class09770 class097703 = class097702 == null ? class09770.N : class097702;
        class09896 class098962 = new class09896();
        ArrayList<String> arrayList = new ArrayList<String>();
        this.z = class098872 = class09918.N(f, f2);
        class09895 class098952 = this.N(class100212, arrayList, class098962, 0.0f, class098872);
        class100212.I();
        class09895 class098953 = this.N(class100212, class098952, arrayList, class098962);
        this.B.N(class100212, class098953.y(), class098962, class097703);
        return this.B.N(class100212, class098953, arrayList, bl);
    }

    class09936 N(class10021 class100212, float f, float f2) {
        return this.N(class100212, f, f2, class09770.N, false);
    }

    private class09895 N(class10021 class100212, class09895 class098952, class09914 class099142, float f) {
        class09916 class099162 = class09972.N(this.Z.y(class100212), class099142.N() + f);
        if (class099162.N()) {
            return class09895.N;
        }
        List<class09935> list = List.of(new class09922(class099162, class099142, class098952.N()));
        return new class09895(list, class098952.y());
    }

    private static class09916 N(class09916 class099162, float f) {
        if (f <= 0.0f) {
            return class099162;
        }
        return new class09916(class099162.y() - f, class099162.L() - f, class099162.u() + f * 2.0f, class099162.i() + f * 2.0f);
    }

    private class09895 N(List<class10021> list, List<String> list2, class09896 class098962, float f, class09887 class098872, float f2) {
        if (list.isEmpty()) {
            return class09895.N;
        }
        boolean bl = f2 > 0.0f;
        ArrayList<class09935> arrayList = new ArrayList<class09935>(list.size() + 1);
        int n = 0;
        ArrayList<class09935> arrayList2 = null;
        int n2 = 0;
        ArrayList<class09922> arrayList3 = null;
        float f3 = 0.0f;
        int n3 = 0;
        Iterator<class10021> iterator = list.iterator();
        while (iterator.hasNext()) {
            class09922 class099222;
            class10021 class100212;
            boolean bl2 = class10019.y((class10021)(class100212 = iterator.next()));
            float f4 = !bl2 ? f : f - f2;
            class09895 class098952 = this.N(class100212, list2, class098962, f4, class098872);
            if (class098952.N().isEmpty()) continue;
            if (bl && bl2) {
                n += class09972.N(arrayList, arrayList3, n3);
                n3 = 0;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<class09935>();
                }
                arrayList2.addAll(class098952.N());
                n2 += class098952.y();
                continue;
            }
            if (arrayList2 != null) {
                arrayList.add(class09919.N(0.0f, -f2, arrayList2));
                n += n2;
                arrayList2 = null;
                n2 = 0;
            }
            if ((class099222 = class09972.N(class098952)) != null) {
                float f5 = ((class09932)class099222.y()).y();
                if (!(arrayList3 != null && !arrayList3.isEmpty() && f5 == f3 && !class09972.N((List<class09922>)arrayList3, class099222.N()))) {
                    n += class09972.N(arrayList, (List<class09922>)arrayList3, n3);
                    n3 = 0;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<class09922>();
                    }
                    f3 = f5;
                }
                arrayList3.add(class099222);
                n3 += class098952.y();
                continue;
            }
            n += class09972.N(arrayList, arrayList3, n3);
            n3 = 0;
            arrayList.addAll(class098952.N());
            n += class098952.y();
        }
        n += class09972.N(arrayList, arrayList3, n3);
        if (arrayList2 != null) {
            arrayList.add(class09919.N(0.0f, -f2, arrayList2));
            n += n2;
        }
        if (arrayList.isEmpty()) {
            return class09895.N;
        }
        return new class09895(arrayList, n);
    }

    private static class09922 N(class09895 class098952) {
        class09922 class099222;
        class09935 class099352;
        List<class09935> var1 = class098952.N();
        if (var1.size() == 1 && (class099352 = var1.get(0)) instanceof class09922 && (class099222 = (class09922)class099352).y() instanceof class09932) {
            return class099222;
        }
        return null;
    }

    private static class09895 N(float f, class09895 class098952) {
        List<class09935> list = List.of(new class09899(f, class098952.N()));
        return new class09895(list, class098952.y());
    }

    private static boolean N(class09980 class099802) {
        return class099802.G() != 1.0f || class099802.l() != 0.0f;
    }

    private class09895 N(class10021 class100212, class09980 class099802, class09895 class098952) {
        if (class098952.y() == 0) {
            return class098952;
        }
        float f = 0.0f;
        boolean bl = class09972.L(class099802);
        if (bl) {
            class09888 class098882 = new class09888(class099802.C());
            if ((class098952 = this.N(class100212, class098952, (class09914)class098882, f)).y() == 0) {
                return class098952;
            }
            f += class098882.N();
        }
        if (class09972.y(class099802)) {
            class098952 = !bl && this.Z.N(class100212) ? class09972.N(class099802.f(), class098952) : this.N(class100212, class098952, new class09932(class099802.f()), f);
        }
        if (class09972.N(class099802) && class098952.y() > 0) {
            float f2 = class100212.c().y() + class100212.c().u() / 2.0f;
            float f3 = class100212.c().L() + class100212.c().i() / 2.0f;
            class098952 = this.N(class100212, class098952, new class09901(f2, f3, class099802.G(), class099802.l()), f);
        }
        return class098952;
    }
}

