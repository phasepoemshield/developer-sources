/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class01657
 *  minecraft.class01816
 *  minecraft.class07340
 *  minecraft.class07342
 *  org.apache.commons.lang3.Validate
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class01657;
import minecraft.class01816;
import minecraft.class07340;
import minecraft.class07342;
import org.apache.commons.lang3.Validate;

public class class00566<T>
implements class07340<T> {
    private final T[] N;
    private final int y;
    private int L;

    private class00566(int n, List<T> list) {
        this.N = new Object[1 << n];
        this.y = n;
        Validate.isTrue((list.size() <= this.N.length ? 1 : 0) != 0, (String)"Can't initialize LinearPalette of size %d with %d entries", (Object[])new Object[]{this.N.length, list.size()});
        for (int i = 0; i < list.size(); ++i) {
            this.N[i] = list.get(i);
        }
        this.L = list.size();
    }

    private class00566(T[] TArray, int n, int n2) {
        this.N = TArray;
        this.y = n;
        this.L = n2;
    }

    public static <A> class07340<A> N(int n, List<A> list) {
        return new class00566<A>(n, list);
    }

    public void method_12287(class00667 class006672, class00750<T> class007502) {
        class006672.L(this.L);
        for (int i = 0; i < this.L; ++i) {
            class006672.L(class007502.N(this.N[i]));
        }
    }

    public void method_12289(class00667 class006672, class00750<T> class007502) {
        this.L = class006672.E();
        for (int i = 0; i < this.L; ++i) {
            this.N[i] = class007502.y(class006672.E());
        }
    }

    public class07340<T> method_39956() {
        return new class00566<Object>((Object[])this.N.clone(), this.y, this.L);
    }

    public int method_12290(class00750<T> class007502) {
        int n = class01657.N((int)this.method_12197());
        for (int i = 0; i < this.method_12197(); ++i) {
            n += class01657.N((int)class007502.N(this.N[i]));
        }
        return n;
    }

    public int method_12291(T t, class07342<T> class073422) {
        int n;
        for (n = 0; n < this.L; ++n) {
            if (this.N[n] != t) continue;
            return n;
        }
        if ((n = this.L++) < this.N.length) {
            this.N[n] = t;
            return n;
        }
        return class073422.onResize(this.y + 1, t);
    }

    public boolean method_19525(Predicate<T> predicate) {
        for (int i = 0; i < this.L; ++i) {
            if (!predicate.test(this.N[i])) continue;
            return true;
        }
        return false;
    }

    public int method_12197() {
        return this.L;
    }

    public T method_12288(int n) {
        if (n >= 0 && n < this.L) {
            return this.N[n];
        }
        throw new class01816(n);
    }
}

