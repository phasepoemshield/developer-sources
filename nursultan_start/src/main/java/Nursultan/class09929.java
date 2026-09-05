/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09830
 *  Nursultan.class09887
 *  Nursultan.class10021
 *  Nursultan.class10049
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09830;
import Nursultan.class09887;
import Nursultan.class09891;
import Nursultan.class09893;
import Nursultan.class09897;
import Nursultan.class09902;
import Nursultan.class09906;
import Nursultan.class09907;
import Nursultan.class09909;
import Nursultan.class09915;
import Nursultan.class09917;
import Nursultan.class09924;
import Nursultan.class09925;
import Nursultan.class09926;
import Nursultan.class09931;
import Nursultan.class09935;
import Nursultan.class09976;
import Nursultan.class09980;
import Nursultan.class09981;
import Nursultan.class10007;
import Nursultan.class10021;
import Nursultan.class10049;
import java.util.ArrayList;
import java.util.List;
import org.joml.Vector4f;
import org.joml.Vector4fc;

final class class09929 {
    private final class09917 N;
    private final class10007 y;

    class09929(class09917 class099172, class10007 class100072) {
        this.N = class099172;
        this.y = class100072;
    }

    private static class09924 N(class10021 class100212, class09980 class099802) {
        if (!class09897.N(class099802)) {
            return null;
        }
        float f = class100212.c().u();
        float f2 = class100212.c().i();
        if (f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        float f3 = Math.max(0.0f, class099802.m());
        return new class09907(class100212.c().y(), class100212.c().L(), f, f2, class099802.q(), -1, (Vector4fc)new Vector4f(class099802.W().u() + f3, class099802.W().i() + f3, class099802.W().R() + f3, class099802.W().M() + f3));
    }

    private static void N(class10021 class100212, class09980 class099802, List<class09924> list, List<class09924> list2, List<class09924> list3) {
        boolean bl;
        class09924 class099242 = class09929.N(class100212, class099802);
        if (class099242 != null) {
            list.add(class099242);
        }
        if (class100212.y() == class10049.CANVAS) {
            return;
        }
        int n = class099802.o();
        boolean bl2 = class09662.R((int)n);
        float f = class099802.m();
        int n2 = class099802.e();
        boolean bl3 = f > 0.0f && class09662.R((int)n2);
        float f2 = class099802.K();
        int n3 = f2 > 0.01f ? class099802.V() : 0;
        boolean bl4 = bl = f2 > 0.01f && class09662.R((int)n3);
        if (!(bl2 || bl3 || bl)) {
            return;
        }
        class09981 class099812 = class099802.P();
        float f3 = bl3 && class099812 == class09981.OUTSIDE ? f : 0.0f;
        float f4 = class100212.c().y() + f3;
        float f5 = class100212.c().L() + f3;
        float f6 = Math.max(0.0f, class100212.c().u() - f3 * 2.0f);
        float f7 = Math.max(0.0f, class100212.c().i() - f3 * 2.0f);
        float f8 = bl3 && class099812 == class09981.INSIDE ? f : 0.0f;
        Vector4f vector4f = new Vector4f(class099802.W().u() + f8, class099802.W().i() + f8, class099802.W().R() + f8, class099802.W().M() + f8);
        list.add(new class09925(f4, f5, f6, f7, (Vector4fc)vector4f, bl2 ? n : 0, bl3 ? n2 : 0, bl3 ? f : 0.0f, class099812, n3, bl ? f2 : 0.0f));
        if (!bl3 || class099812 != class09981.INSIDE) {
            return;
        }
        if (class099242 != null) {
            list2.add(class099242);
        }
        if (bl2 || bl) {
            list2.add(new class09925(f4, f5, f6, f7, (Vector4fc)vector4f, bl2 ? n : 0, 0, 0.0f, class099812, n3, bl ? f2 : 0.0f));
        }
        list3.add(new class09925(f4, f5, f6, f7, (Vector4fc)vector4f, 0, n2, f, class099812, 0, 0.0f));
    }

    private void N(class10021 class100212, class09915 class099152, List<class09924> list) {
        if (class100212.y() == class10049.CANVAS) {
            if (class100212.U() != null && class100212.c().u() > 0.0f && class100212.c().i() > 0.0f) {
                list.add(new class09891(class100212.U(), class100212.c().y(), class100212.c().L(), class100212.c().u(), class100212.c().i()));
            }
            return;
        }
        class09980 class099802 = class100212.o();
        float f = class100212.c().R();
        float f2 = class100212.c().M();
        float f3 = class100212.c().B();
        float f4 = class100212.c().Z();
        if (class100212.y() == class10049.TEXT && !class100212.B().isEmpty()) {
            String string = class100212.c().E().isEmpty() ? class100212.B() : class100212.c().E();
            list.add(class09929.N(string, f, f2, class099802.H(), class099802));
            return;
        }
        if (class100212.y() == class10049.INPUT) {
            this.N.N(class099152, class099802, list, f, f2, f3, f4);
            return;
        }
        if (class100212.y() == class10049.TEXTURE && !class100212.z().isEmpty()) {
            list.add(new class09906(class100212.z(), f, f2, f3, f4, class099802.H(), class099802.S()));
        }
    }

    private static class09924 N(String string, float f, float f2, int n, class09980 class099802) {
        float f3 = class099802.F();
        int n2 = class099802.p();
        if (f3 > 0.0f && class09662.R((int)n2)) {
            return new class09931(string, f, f2, n, class099802.c(), class099802.X(), n2, f3);
        }
        return new class09902(string, f, f2, n, class099802.c(), class099802.X());
    }

    void N(class10021 class100212, class09980 class099802, class09830 class098302, class09915 class099152, class09887 class098872, int n, int n2, int n3, int n4, int n5) {
        ArrayList<class09924> arrayList = new ArrayList<class09924>(2);
        ArrayList<class09924> arrayList2 = new ArrayList<class09924>(2);
        ArrayList<class09924> arrayList3 = new ArrayList<class09924>(1);
        class09929.N(class100212, class099802, arrayList, arrayList2, arrayList3);
        ArrayList<class09924> arrayList4 = new ArrayList<class09924>(4);
        this.N(class100212, class099152, arrayList4);
        ArrayList<class09924> arrayList5 = new ArrayList<class09924>(2);
        this.y.N(class100212, class099802, class098302, arrayList5);
        class09926 class099262 = class09929.N(class099802, class098872);
        class100212.q().N(class09929.N(arrayList), class09929.N(arrayList2), class09929.N(arrayList3), class09929.N(arrayList4), class09929.N(arrayList5), class099262, n, n2, n3, n4, n5);
    }

    private static class09926 N(class09980 class099802, class09887 class098872) {
        if (class099802.d() != class09976.SELF || !class099802.W().y()) {
            return null;
        }
        if (class098872 == null || !class098872.N()) {
            return null;
        }
        float f = class09929.N(class099802);
        Vector4f vector4f = new Vector4f(class099802.W().u() + f, class099802.W().i() + f, class099802.W().R() + f, class099802.W().M() + f);
        return new class09893(class098872.y(), class098872.L(), class098872.u() - class098872.y(), class098872.i() - class098872.L(), (Vector4fc)vector4f);
    }

    static float N(class09980 class099802) {
        return class099802.m() > 0.0f && class09662.R((int)class099802.e()) && class099802.P() == class09981.INSIDE ? class099802.m() : 0.0f;
    }

    private static List<class09935> N(List<class09924> list) {
        if (list.isEmpty()) {
            return List.of();
        }
        ArrayList<class09935> arrayList = new ArrayList<class09935>(list.size());
        for (int i = 0; i < list.size(); ++i) {
            arrayList.add(new class09909(list.get(i)));
        }
        return arrayList;
    }
}

