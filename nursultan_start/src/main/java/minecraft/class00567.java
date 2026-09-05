/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class01199
 *  minecraft.class01657
 *  minecraft.class01816
 *  minecraft.class07340
 *  minecraft.class07342
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class01199;
import minecraft.class01657;
import minecraft.class01816;
import minecraft.class07340;
import minecraft.class07342;

public class class00567<T>
implements class07340<T> {
    private final class01199<T> N;
    private final int y;

    private class00567(int n, class01199<T> class011992) {
        this.y = n;
        this.N = class011992;
    }

    public class00567(int n) {
        this(n, class01199.L((int)(1 << n)));
    }

    public class00567(int n, List<T> list) {
        this(n);
        list.forEach(arg_0 -> this.N.u(arg_0));
    }

    public List<T> N() {
        ArrayList arrayList = new ArrayList();
        this.N.iterator().forEachRemaining(arrayList::add);
        return arrayList;
    }

    public static <A> class07340<A> N(int n, List<A> list) {
        return new class00567<A>(n, list);
    }

    public void method_12287(class00667 class006672, class00750<T> class007502) {
        int n = this.method_12197();
        class006672.L(n);
        for (int i = 0; i < n; ++i) {
            class006672.L(class007502.N(this.N.N(i)));
        }
    }

    public void method_12289(class00667 class006672, class00750<T> class007502) {
        this.N.N();
        int n = class006672.E();
        for (int i = 0; i < n; ++i) {
            this.N.u(class007502.y(class006672.E()));
        }
    }

    public class07340<T> method_39956() {
        return new class00567<T>(this.y, this.N.y());
    }

    public int method_12290(class00750<T> class007502) {
        int n = class01657.N((int)this.method_12197());
        for (int i = 0; i < this.method_12197(); ++i) {
            n += class01657.N((int)class007502.N(this.N.N(i)));
        }
        return n;
    }

    public int method_12291(T t, class07342<T> class073422) {
        int n = this.N.N(t);
        if (n == -1 && (n = this.N.u(t)) >= 1 << this.y) {
            n = class073422.onResize(this.y + 1, t);
        }
        return n;
    }

    public boolean method_19525(Predicate<T> predicate) {
        for (int i = 0; i < this.method_12197(); ++i) {
            if (!predicate.test(this.N.N(i))) continue;
            return true;
        }
        return false;
    }

    public int method_12197() {
        return this.N.L();
    }

    public T method_12288(int n) {
        Object object = this.N.N(n);
        if (object == null) {
            throw new class01816(n);
        }
        return (T)object;
    }
}

