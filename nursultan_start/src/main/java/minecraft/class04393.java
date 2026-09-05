/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class02604
 *  minecraft.class02741
 *  minecraft.class02950
 *  minecraft.class03556
 *  minecraft.class03729
 *  minecraft.class04056
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06910
 *  minecraft.class06937
 *  minecraft.class08044
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02604;
import minecraft.class02741;
import minecraft.class02950;
import minecraft.class03556;
import minecraft.class03729;
import minecraft.class04056;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06910;
import minecraft.class06937;
import minecraft.class08044;

public class class04393<R extends class06521<?>> {
    private static final int N = -1;
    private final class08044 y;
    private final class04056<R> L;
    private final boolean u;
    private final int i;
    private final int R;
    private final List<class06937> M;
    private final List<class06937> B;

    private int L() {
        int n = 0;
        Iterator var2 = this.y.u().iterator();
        while (var2.hasNext()) {
            if (!((class06584)var2.next()).R()) continue;
            ++n;
        }
        return n;
    }

    private class04393(class04056<R> class040562, class08044 class080442, boolean bl, int n, int n2, List<class06937> list, List<class06937> list2) {
        this.L = class040562;
        this.y = class080442;
        this.u = bl;
        this.i = n;
        this.R = n2;
        this.M = list;
        this.B = list2;
    }

    private void y(class03729<R> class037292, class02741 class027412) {
        class06937 class0693722;
        boolean bl = this.L.N(class037292);
        int n = class027412.y(class037292.y(), null);
        if (bl) {
            for (class06937 class0693722 : this.M) {
                class06584 class065842 = class0693722.i();
                if (class065842.R() || Math.min(n, class065842.U()) >= class065842.c() + 1) continue;
                return;
            }
        }
        int n2 = this.N(n, bl);
        class0693722 = new ArrayList();
        if (!class027412.N(class037292.y(), n2, ((List)class0693722)::add)) {
            return;
        }
        int n3 = class04393.N(n2, (List<class03556<class06581>>)class0693722);
        if (n3 != n2) {
            class0693722.clear();
            if (!class027412.N(class037292.y(), n3, ((List)class0693722)::add)) {
                return;
            }
        }
        this.N();
        class02604.N((int)this.i, (int)this.R, (class06521)class037292.y(), (Iterable)class037292.y().method_61671().N(), (arg_0, arg_1, arg_2, arg_3) -> this.N((List)class0693722, n3, arg_0, arg_1, arg_2, arg_3));
    }

    private boolean y() {
        ArrayList arrayList = Lists.newArrayList();
        int n = this.L();
        Iterator<class06937> var3 = this.M.iterator();
        while (var3.hasNext()) {
            class06584 class065842 = var3.next().i().t();
            if (class065842.R()) continue;
            int n2 = this.y.R(class065842);
            if (n2 == -1 && arrayList.size() <= n) {
                for (class06584 class065843 : arrayList) {
                    if (!class06584.y((class06584)class065843, (class06584)class065842) || class065843.c() == class065843.U() || class065843.c() + class065842.c() > class065843.U()) continue;
                    class065843.M(class065842.c());
                    class065842.i(0);
                    break;
                }
                if (class065842.R()) continue;
                if (arrayList.size() < n) {
                    arrayList.add(class065842);
                    continue;
                }
                return false;
            }
            if (n2 != -1) continue;
            return false;
        }
        return true;
    }

    private int N(class06937 class069372, class03556<class06581> class035562, int n) {
        class06584 class065842 = class069372.i();
        int n2 = this.y.N(class035562, class065842);
        if (n2 == -1) {
            return -1;
        }
        class06584 class065843 = this.y.method_5438(n2);
        class06584 class065844 = n < class065843.c() ? this.y.method_5434(n2, n) : this.y.method_5441(n2);
        int n3 = class065844.c();
        if (class065842.R()) {
            class069372.i(class065844);
        } else {
            class065842.M(n3);
        }
        return n - n3;
    }

    private int N(int n, boolean bl) {
        if (this.u) {
            return n;
        }
        if (bl) {
            int n2 = Integer.MAX_VALUE;
            Iterator<class06937> var4 = this.M.iterator();
            while (var4.hasNext()) {
                class06584 class065842 = var4.next().i();
                if (class065842.R() || n2 <= class065842.c()) continue;
                n2 = class065842.c();
            }
            if (n2 != Integer.MAX_VALUE) {
                ++n2;
            }
            return n2;
        }
        return 1;
    }

    private /* synthetic */ void N(List list, int n, Integer n2, int n3, int n4, int n5) {
        if (n2 == -1) {
            return;
        }
        class06937 class069372 = this.M.get(n3);
        class03556 class035562 = (class03556)list.get(n2);
        int n6 = n;
        while (n6 > 0) {
            if ((n6 = this.N(class069372, (class03556<class06581>)class035562, n6)) != -1) continue;
            return;
        }
    }

    public static <I extends class02950, R extends class06521<I>> class06910 N(class04056<R> class040562, int n, int n2, List<class06937> list, List<class06937> list2, class08044 class080442, class03729<R> class037292, boolean bl, boolean bl2) {
        class04393<R> class043932 = new class04393<R>(class040562, class080442, bl, n, n2, list, list2);
        if (!bl2 && !class043932.y()) {
            return class06910.field_52572;
        }
        class02741 class027412 = new class02741();
        class080442.N(class027412);
        class040562.N(class027412);
        return class043932.N(class037292, class027412);
    }

    private class06910 N(class03729<R> class037292, class02741 class027412) {
        if (class027412.N(class037292.y(), null)) {
            this.y(class037292, class027412);
            this.y.method_5431();
            return class06910.field_52572;
        }
        this.N();
        this.y.method_5431();
        return class06910.field_52573;
    }

    private void N() {
        for (class06937 class069372 : this.B) {
            class06584 class065842 = class069372.i().t();
            this.y.N(class065842, false);
            class069372.i(class065842);
        }
        this.L.N();
    }

    private static int N(int n, List<class03556<class06581>> list) {
        for (class03556<class06581> class035562 : list) {
            n = Math.min(n, ((class06581)class035562.N()).M());
        }
        return n;
    }
}

