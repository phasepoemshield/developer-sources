/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09769;
import Nursultan.class09774;
import Nursultan.class09779;
import Nursultan.class09793;
import Nursultan.class09795;
import Nursultan.class09798;
import Nursultan.class09799;
import Nursultan.class09810;
import Nursultan.class09811;
import Nursultan.class09812;
import Nursultan.class09816;
import Nursultan.class09817;
import Nursultan.class09904;
import Nursultan.class10021;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class class09792 {
    private final class09812 N;
    private final class09769 y;

    private class10021 L(class09799 class097992) {
        return Objects.requireNonNull(class097992.i(), "resolvedElement");
    }

    class09792(class09812 class098122, class09769 class097692) {
        this.N = Objects.requireNonNull(class098122, "nodeSpecCompiler");
        this.y = class097692 == null ? class09769.N : class097692;
    }

    private void y(class10021 class100212, List<class09799> list) {
        if (class100212.u() == 0) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(class100212.u());
        ArrayList<class10021> arrayList2 = new ArrayList<class10021>();
        int n = 0;
        for (int i = 0; i < class100212.u(); ++i) {
            class10021 class100213 = class100212.N(i);
            if (!class09774.N(class100213)) {
                arrayList2.add(class100213);
                continue;
            }
            if (class100213.T()) {
                arrayList.add(class100213);
                continue;
            }
            if (n < list.size()) {
                arrayList.add(Objects.requireNonNull(list.get(n).i(), "resolvedElement"));
                ++n;
                continue;
            }
            throw new IllegalStateException("Unplanned active child during reorder: " + String.valueOf(class100213));
        }
        while (n < list.size()) {
            arrayList.add(Objects.requireNonNull(list.get(n).i(), "resolvedElement"));
            ++n;
        }
        arrayList.addAll(arrayList2);
        class100212.y(arrayList);
    }

    private class10021 y(class09799 class097992, class09810 class098102) {
        if (!class097992.R()) {
            return this.L(class097992);
        }
        class10021 class100212 = Objects.requireNonNull(class097992.y(), "existing");
        class100212.j();
        class097992.N(class100212);
        this.N(class100212, class097992, class098102);
        return class100212;
    }

    private void y(class09799 class097992) {
        if (!class097992.R()) {
            if (class097992.i() == null) {
                this.N(class097992);
            }
            return;
        }
        for (class09799 class097993 : class097992.u().y()) {
            this.y(class097993);
        }
    }

    class10021 N(class09799 class097992, class09810 class098102) {
        Objects.requireNonNull(class097992, "plan");
        Objects.requireNonNull(class098102, "options");
        if (!class097992.R()) {
            return this.L(class097992);
        }
        class10021 class100212 = Objects.requireNonNull(class097992.y(), "existing");
        class097992.N(class100212);
        this.N(class100212, class097992, class098102);
        return class100212;
    }

    private class10021 N(class09799 class097992) {
        class10021 class100212 = this.N.N(class097992.N());
        this.N(class097992, class100212);
        return class100212;
    }

    void N(class09811 class098112) {
        Objects.requireNonNull(class098112, "plan");
        this.y(class098112.N());
    }

    class10021 N(class09798 class097982) {
        return this.N.N(class097982);
    }

    private void N(class09799 class097992, class10021 class100212) {
        class097992.N(class100212);
        List<class09799> var3 = class097992.u().y();
        for (int i = 0; i < var3.size(); ++i) {
            this.N(var3.get(i), class100212.N(i));
        }
    }

    private void N(class10021 class100212, class09798 class097982) {
        switch (class09795.N[class097982.y().ordinal()]) {
            case 1: {
                class100212.N(class097982.M());
                break;
            }
            case 2: {
                class100212.N(class097982.M());
                class100212.y(class097982.B());
                break;
            }
            case 3: {
                class100212.L(class097982.Z());
                break;
            }
            case 4: {
                class100212.N(class097982.z());
                break;
            }
        }
    }

    private void N(class10021 class100212, class09779 class097792, class09810 class098102) {
        this.N(class100212, class097792.L());
        for (class09799 class097992 : class097792.y()) {
            class10021 class100213 = this.y(class097992, class098102);
            if (class097992.R()) continue;
            class100212.N(class100213);
        }
        for (class10021 class100214 : class097792.u()) {
            if (class100214.X() != class100212 || class100214.T()) continue;
            class100214.b();
        }
        this.y(class100212, class097792.y());
    }

    private void N(class10021 class100212, class09799 class097992, class09810 class098102) {
        class09798 class097982 = class097992.N();
        class09793<class09904> var5 = class09817.y(class097982);
        if (var5 != null) {
            var5.N((class09904)class100212);
        }
        class100212.N(class097982.R());
        class100212.N(class097982.i());
        class100212.V();
        for (class09816 class098162 : class097982.u()) {
            class100212.N(class098162.N(), class098162.y(), class098162.L());
        }
        this.N(class100212, class097982);
        this.N(class100212, class097992.u(), class098102);
    }

    private void N(class10021 class100212, List<class10021> list) {
        for (class10021 class100213 : list) {
            if (class100213.X() != class100212) continue;
            this.y.beforeDetach(class100213);
            class100212.y(class100213);
        }
    }
}

