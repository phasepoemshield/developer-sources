/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 */
package Nursultan;

import Nursultan.class09899;
import Nursultan.class09903;
import Nursultan.class09909;
import Nursultan.class09919;
import Nursultan.class09922;
import Nursultan.class09924;
import Nursultan.class09934;
import Nursultan.class09935;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class class09936 {
    private static final class09936 N = new class09936(List.of(), 0, List.of());
    private final List<class09935> y;
    private final int L;
    private final List<String> u;

    public int L() {
        return this.L;
    }

    private class09936(List<class09935> list, int n, List<String> list2) {
        this.y = list;
        this.L = n;
        this.u = list2 == null ? List.of() : List.copyOf(list2);
    }

    public List<String> i() {
        return this.u;
    }

    public List<class09924> u() {
        if (this.y.isEmpty()) {
            return List.of();
        }
        ArrayList<class09924> arrayList = new ArrayList<class09924>(this.L);
        class09936.N(this.y, arrayList);
        return arrayList;
    }

    public List<class09935> y() {
        return this.y;
    }

    public static class09936 N(List<class09935> list, int n, List<String> list2) {
        if (list == null || list.isEmpty() || n <= 0) {
            return new class09936(List.of(), 0, list2);
        }
        return new class09936(list, n, list2);
    }

    private static void N(List<class09935> list, List<class09924> list2) {
        Iterator<class09935> iterator = list.iterator();
        block8: while (iterator.hasNext()) {
            class09935 class099352;
            Objects.requireNonNull(iterator.next());
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class09909.class, class09919.class, class09903.class, class09934.class, class09922.class, class09899.class}, (Object)class099352, (int)n)) {
                default: {
                    throw new MatchException(null, null);
                }
                case 0: {
                    class09909 class099092 = (class09909)class099352;
                    list2.add(class099092.N());
                    continue block8;
                }
                case 1: {
                    class09936.N(((class09919)class099352).M(), list2);
                    continue block8;
                }
                case 2: {
                    class09936.N(((class09903)class099352).i(), list2);
                    continue block8;
                }
                case 3: {
                    class09936.N(((class09934)class099352).y(), list2);
                    continue block8;
                }
                case 4: {
                    class09936.N(((class09922)class099352).L(), list2);
                    continue block8;
                }
                case 5: 
            }
            class09936.N(((class09899)class099352).y(), list2);
        }
    }

    public static class09936 N() {
        return N;
    }
}

