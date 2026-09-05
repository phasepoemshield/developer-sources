/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class09938
 *  Nursultan.class09991
 *  Nursultan.class09992
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09793;
import Nursultan.class09816;
import Nursultan.class09904;
import Nursultan.class09938;
import Nursultan.class09991;
import Nursultan.class09992;
import Nursultan.class10049;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class class09798 {
    private final String N;
    private final String y;
    private final class10049 L;
    private final List<class09798> u;
    private final List<class09816> i;
    private final List<class09992> R;
    private final class09991 M;
    private final String B;
    private final String Z;
    private final String z;
    private final class09938 U;
    private final class09793<class09904> E;

    public List<class09798> L() {
        return this.u;
    }

    public String M() {
        return this.B;
    }

    class09798(String string, String string2, class10049 class100492, List<class09798> list, List<class09816> list2, List<class09992> list3, class09991 class099912, String string3, String string4, String string5, class09938 class099382, class09793<class09904> class097932) {
        this.N = string == null || string.isBlank() ? null : string;
        this.y = string2 == null || string2.isBlank() ? null : string2;
        this.L = Objects.requireNonNull(class100492, "type");
        this.u = list == null ? List.of() : List.copyOf(list);
        this.i = list2 == null ? List.of() : List.copyOf(list2);
        this.M = class099912 == null ? class09991.N : class099912;
        this.R = class09798.N(list3, this.M.W());
        this.B = string3 == null ? "" : string3;
        this.Z = string4 == null ? "" : string4;
        this.z = string5 == null ? "" : string5;
        this.U = class099382;
        this.E = class097932;
    }

    public String B() {
        return this.Z;
    }

    public String Z() {
        return this.z;
    }

    public List<class09992> i() {
        return this.R;
    }

    String U() {
        return this.y;
    }

    public class09938 z() {
        return this.U;
    }

    public List<class09816> u() {
        return this.i;
    }

    private static void y(List<class09992> list, List<class09992> list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (class09992 class099922 : list2) {
            if (class099922 == null || class09798.N(list, class099922)) continue;
            list.add(class099922);
        }
    }

    public class10049 y() {
        return this.L;
    }

    class09793<class09904> E() {
        return this.E;
    }

    private static List<class09992> N(List<class09992> list, List<class09992> list2) {
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            return List.of();
        }
        ArrayList<class09992> arrayList = new ArrayList<class09992>();
        class09798.y(arrayList, list);
        class09798.y(arrayList, list2);
        return arrayList.isEmpty() ? List.of() : List.copyOf(arrayList);
    }

    private static boolean N(List<class09992> list, class09992 class099922) {
        Iterator<class09992> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != class099922) continue;
            return true;
        }
        return false;
    }

    class09798 N(String string) {
        return new class09798(this.N, string, this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E);
    }

    public String N() {
        return this.N;
    }

    public class09991 R() {
        return this.M;
    }
}

