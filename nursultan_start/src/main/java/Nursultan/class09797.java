/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09715
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09715;
import Nursultan.class09771;
import Nursultan.class09774;
import Nursultan.class09779;
import Nursultan.class09787;
import Nursultan.class09790;
import Nursultan.class09798;
import Nursultan.class09799;
import Nursultan.class09800;
import Nursultan.class09810;
import Nursultan.class09811;
import Nursultan.class10021;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

final class class09797 {
    private final class10021 N;
    private final class09798 y;
    private final class09810 L;
    private final class09715 u;
    private final Set<class10021> i = Collections.newSetFromMap(new IdentityHashMap());

    private void L(class10021 class100212) {
        if (class100212 != null && !this.u(class100212)) {
            this.i.add(class100212);
        }
    }

    class09797(class10021 class100212, class09798 class097982, class09810 class098102, class09715 class097152) {
        this.N = Objects.requireNonNull(class100212, "root");
        this.y = Objects.requireNonNull(class097982, "spec");
        this.L = Objects.requireNonNull(class098102, "options");
        this.u = Objects.requireNonNull(class097152, "animationManager");
    }

    private boolean u(class10021 class100212) {
        for (class10021 class100213 = class100212; class100213 != null; class100213 = class100213.X()) {
            if (!this.i.contains(class100213)) continue;
            return true;
        }
        return false;
    }

    private boolean y(class10021 class100212) {
        return !this.N(class100212);
    }

    private void N(class10021 class100212, class09798 class097982, Set<class10021> set, Set<class10021> set2, List<class10021> list) {
        String string = class09800.N(class097982);
        if (string == null) {
            return;
        }
        for (int i = class100212.u() - 1; i >= 0; --i) {
            class10021 class100213 = class100212.N(i);
            if (!class09774.N(class100213) || set.contains(class100213) || set2.contains(class100213) || this.u(class100213) || !string.equals(class09800.N(class100213)) || class09800.N(class100213, class097982)) continue;
            this.N(class100213, set2, list);
        }
    }

    private class10021 N(class10021 class100212, int n) {
        int n2 = 0;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class09774.y(class100213) || this.u(class100213)) continue;
            if (n2 == n) {
                return class100213;
            }
            ++n2;
        }
        return null;
    }

    private boolean N(class10021 class100212) {
        return this.L.L() != class09787.REMOVE_IMMEDIATELY && class09771.N(class100212, this.u);
    }

    private void N(class10021 class100212, Set<class10021> set, List<class10021> list) {
        if (set.add(class100212)) {
            list.add(class100212);
            this.L(class100212);
        }
    }

    class09811 N() {
        class09799 class097992;
        class09799 class097993 = class097992 = class09800.N(this.N, this.y) ? this.N(this.N, this.y) : this.N(this.y);
        if (!class097992.R()) {
            this.L(this.N);
        }
        return new class09811(class097992);
    }

    private class09799 N(class09798 class097982) {
        class09799 class097992 = new class09799(class097982, null, class09790.INSERT);
        ArrayList<class09799> arrayList = new ArrayList<class09799>(class097982.L().size());
        for (class09798 class097983 : class097982.L()) {
            arrayList.add(this.N(class097983));
        }
        class097992.N(new class09779(arrayList, List.of(), List.of()));
        return class097992;
    }

    private class09779 N(class10021 class100212, List<class09798> list) {
        int n = class100212.u();
        if (list.isEmpty() && n == 0) {
            return class09779.N();
        }
        Set<class10021> set = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Set<class10021> set2 = Collections.newSetFromMap(new IdentityHashMap(n));
        Set<class10021> set3 = Collections.newSetFromMap(new IdentityHashMap(n));
        ArrayList<class10021> arrayList = new ArrayList<class10021>();
        ArrayList<class10021> arrayList2 = new ArrayList<class10021>();
        ArrayList<class09799> arrayList3 = new ArrayList<class09799>(list.size());
        for (int i = 0; i < list.size(); ++i) {
            class09798 class097982 = list.get(i);
            this.N(class100212, class097982, set, set2, arrayList);
            class10021 class100213 = this.N(class100212, class097982, i, set);
            if (class100213 == null) {
                arrayList3.add(this.N(class097982));
                continue;
            }
            set.add(class100213);
            set3.add(class100213);
            arrayList3.add(this.N(class100213, class097982));
        }
        this.N(class100212, set, set2, set3, arrayList, arrayList2);
        this.N(class100212, set3);
        return new class09779(arrayList3, arrayList, arrayList2);
    }

    private void N(class10021 class100212, Set<class10021> set, Set<class10021> set2, Set<class10021> set3, List<class10021> list, List<class10021> list2) {
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class09774.N(class100213) || set.contains(class100213) || set2.contains(class100213) || this.u(class100213)) continue;
            if (this.y(class100213)) {
                this.N(class100213, set2, list);
                set3.add(class100213);
                continue;
            }
            if (!class100213.T()) {
                list2.add(class100213);
            }
            set3.add(class100213);
        }
    }

    private void N(class10021 class100212, Set<class10021> set) {
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class09774.N(class100213) || this.u(class100213) || set.contains(class100213)) continue;
            throw new IllegalStateException("Unplanned normal child during reconciliation: " + String.valueOf(class100213));
        }
    }

    private class09799 N(class10021 class100212, class09798 class097982) {
        class09799 class097992 = new class09799(class097982, class100212, class09790.REUSE);
        class097992.N(this.N(class100212, class097982.L()));
        return class097992;
    }

    private class10021 N(class10021 class100212, class09798 class097982, int n, Set<class10021> set) {
        if (class09800.N(class097982) != null) {
            for (int i = 0; i < class100212.u(); ++i) {
                class10021 class100213 = class100212.N(i);
                if (!class09774.N(class100213) || set.contains(class100213) || this.u(class100213) || !class09800.N(class100213, class097982)) continue;
                return class100213;
            }
            return null;
        }
        class10021 class100214 = this.N(class100212, n);
        if (class100214 == null || set.contains(class100214) || !class09800.N(class100214, class097982)) {
            return null;
        }
        return class100214;
    }
}

