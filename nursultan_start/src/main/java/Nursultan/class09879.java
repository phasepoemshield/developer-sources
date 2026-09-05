/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09775;
import Nursultan.class09783;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09805;
import Nursultan.class09809;
import Nursultan.class09819;
import Nursultan.class09829;
import Nursultan.class09840;
import Nursultan.class09845;
import Nursultan.class09848;
import Nursultan.class09853;
import Nursultan.class09862;
import Nursultan.class09872;
import Nursultan.class09874;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

final class class09879 {
    private final class09872 N;
    private final Runnable y;
    private final class09874 L;
    private final Map<class09829, class09840<?>> u = new HashMap();
    private final Map<String, class09840<?>> i = new HashMap();
    private final Map<class09829, class09848<?>> R = new HashMap();
    private final Set<class09874> M = new HashSet<class09874>();
    private final Set<class09829> B = new HashSet<class09829>();
    private final Set<class09829> Z = new HashSet<class09829>();
    private class09862 z;
    private boolean U;

    void L() {
        if (!this.U) {
            return;
        }
        for (class09829 class098293 : this.Z) {
            class09848<?> var3 = this.R.get((Object)class098293);
            if (var3 == null) continue;
            var3.y();
        }
        this.u.entrySet().removeIf(entry -> this.N((class09829)((Object)((Object)entry.getKey())), (class09840)entry.getValue()));
        this.R.keySet().removeIf(class098292 -> !this.Z.contains(class098292));
        this.M.clear();
        this.B.clear();
        this.Z.clear();
        this.z = null;
        this.U = false;
    }

    class09879(class09872 class098722, Runnable runnable, String string) {
        this.N = Objects.requireNonNull(class098722, "tickerManager");
        this.y = Objects.requireNonNull(runnable, "requestRender");
        this.L = class09874.N(string);
    }

    boolean i() {
        if (this.R.isEmpty()) {
            return false;
        }
        Iterator<class09848<?>> var1 = this.R.values().iterator();
        while (var1.hasNext()) {
            if (!var1.next().N()) continue;
            return true;
        }
        return false;
    }

    void u() {
        for (class09829 class098292 : this.B) {
            class09840<?> var3 = this.u.get((Object)class098292);
            if (var3 == null || !var3.L) continue;
            this.N(var3);
        }
        this.M.clear();
        this.B.clear();
        this.Z.clear();
        this.z = null;
        this.U = false;
    }

    <T extends class09819> T y(class09874 class098742, String string, Supplier<T> supplier, class09783 class097832) {
        class09829 class098292 = this.N(class098742, string, "ticker name");
        class09783 class097833 = this.N(class097832);
        class09840<?> var7 = this.u.get((Object)class098292);
        if (var7 != null) {
            if (!var7.L) {
                throw new IllegalStateException("State name is already used by a value: " + String.valueOf((Object)class098292));
            }
            var7.y = class097833;
            class09819 class098192 = (class09819)var7.N;
            this.N(class098292, class098192);
            return (T)class098192;
        }
        T t = this.N(supplier, class098292);
        class09840<T> class098402 = new class09840<T>(t, class097833, true, this.y);
        this.u.put(class098292, class098402);
        this.N(class098292, (class09819)t);
        return t;
    }

    class09809 y() {
        return this.N(this.L);
    }

    private class09829 N(class09874 class098742, String string, String string2) {
        return new class09829(class098742, class09853.N(string, string2));
    }

    private void N(class09829 class098292, class09819 class098192) {
        this.B.add(class098292);
        this.N.N(class098192, this.y);
    }

    private void N(class09840<?> class098402) {
        this.N.N((class09819)class098402.N);
    }

    private boolean N(class09829 class098292, class09840<?> class098402) {
        boolean bl;
        boolean bl2 = this.B.contains((Object)class098292);
        if (class098402.L && !bl2) {
            this.N(class098402);
        }
        boolean bl3 = bl = class098402.y == class09783.WHILE_MOUNTED && !this.M.contains((Object)class098292.N());
        if (bl && class098402.L && bl2) {
            this.N(class098402);
        }
        return bl;
    }

    private <T extends class09819> T N(Supplier<T> supplier, class09829 class098292) {
        return (T)Objects.requireNonNull((class09819)Objects.requireNonNull(supplier, "initialValue").get(), "Ticker supplier returned null: " + String.valueOf((Object)class098292));
    }

    private <T> T N(Supplier<T> supplier) {
        return supplier == null ? null : (T)supplier.get();
    }

    private class09783 N(class09783 class097832) {
        return class097832 == null ? class09783.WHILE_MOUNTED : class097832;
    }

    void N(class09874 class098742, String string) {
        class09840<?> var3 = this.u.remove((Object)this.N(class098742, string, "state name"));
        if (var3 != null && var3.L) {
            this.N(var3);
        }
    }

    <T> class09785<T> N(String string, Supplier<T> supplier) {
        String string2 = class09853.N(string, "app state name");
        class09840<?> var4 = this.i.get(string2);
        if (var4 != null) {
            return var4;
        }
        class09840<T> class098402 = new class09840<T>(this.N(supplier), class09783.MANUAL, false, this.y);
        this.i.put(string2, class098402);
        return class098402;
    }

    <T> class09785<T> N(class09874 class098742, String string, Supplier<T> supplier, class09783 class097832) {
        class09829 class098292 = this.N(class098742, string, "state name");
        class09783 class097833 = this.N(class097832);
        class09840<?> var7 = this.u.get((Object)class098292);
        if (var7 != null) {
            if (var7.L) {
                throw new IllegalStateException("State name is already used by a ticker: " + String.valueOf((Object)class098292));
            }
            var7.y = class097833;
            return var7;
        }
        class09840<T> class098402 = new class09840<T>(this.N(supplier), class097833, false, this.y);
        this.u.put(class098292, class098402);
        return class098402;
    }

    class09809 N(class09874 class098742) {
        if (!this.U) {
            throw new IllegalStateException("State scope can only be opened while rendering");
        }
        if (!this.M.add(class098742)) {
            throw new IllegalStateException("Duplicate state scope path: " + String.valueOf((Object)class098742));
        }
        return new class09845(this, class098742);
    }

    void N() {
        if (this.U) {
            throw new IllegalStateException("Stateful render is already in progress");
        }
        this.M.clear();
        this.B.clear();
        this.Z.clear();
        this.z = null;
        this.U = true;
    }

    <C> class09798 N(class09874 class098742, String string, class09788<C> class097882, C c) {
        String string2 = class09853.N(string, "component key");
        class09788<C> class097883 = Objects.requireNonNull(class097882, "component");
        class09874 class098743 = class098742.y(string2);
        class09809 class098092 = this.N(class098743);
        return Objects.requireNonNull(class097883.render(c, class098092), "Stateful component returned null: " + String.valueOf((Object)class098743));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    <T> class09798 N(class09804<T> class098042, T t, Supplier<class09798> supplier) {
        Objects.requireNonNull(class098042, "context");
        Objects.requireNonNull(supplier, "render");
        class09862 class098622 = this.z;
        this.z = new class09862(class098622, class098042, t);
        try {
            class09798 class097982 = Objects.requireNonNull(supplier.get(), "Context provider returned null: " + String.valueOf(class098042));
            return class097982;
        }
        finally {
            this.z = class098622;
        }
    }

    <T> T N(class09804<T> class098042) {
        Object object;
        class09804<T> class098043 = Objects.requireNonNull(class098042, "context");
        Object object2 = object = this.z == null ? class09862.N : this.z.N(class098043);
        if (object != class09862.N) {
            return (T)object;
        }
        if (class098043.N()) {
            return class098043.y();
        }
        throw new class09775("Missing context: " + String.valueOf(class098043));
    }

    <T> T N(class09874 class098742, String string, Supplier<T> supplier, class09805<T> class098052) {
        class09829 class098292 = this.N(class098742, string, "observable name");
        Supplier<T> supplier2 = Objects.requireNonNull(supplier, "snapshot");
        class09805<T> class098053 = Objects.requireNonNull(class098052, "changeDetector");
        T t = supplier2.get();
        class09848<?> var9 = this.R.get((Object)class098292);
        if (var9 == null) {
            this.R.put(class098292, new class09848<T>(t, supplier2, class098053));
        } else {
            class09848<?> var10 = var9;
            var10.y = t;
            var10.L = supplier2;
            var10.u = class098053;
        }
        this.Z.add(class098292);
        return t;
    }
}

