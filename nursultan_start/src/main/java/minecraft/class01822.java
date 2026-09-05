/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class01657
 *  minecraft.class07340
 *  minecraft.class07342
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class01657;
import minecraft.class07340;
import minecraft.class07342;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

public class class01822<T>
implements class07340<T> {
    private @Nullable T N;

    public class01822(List<T> list) {
        if (!list.isEmpty()) {
            Validate.isTrue((list.size() <= 1 ? 1 : 0) != 0, (String)"Can't initialize SingleValuePalette with %d values.", (long)list.size());
            this.N = list.getFirst();
        }
    }

    public static <A> class07340<A> N(int n, List<A> list) {
        return new class01822<A>(list);
    }

    public void method_12287(class00667 class006672, class00750<T> class007502) {
        if (this.N == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        class006672.L(class007502.N(this.N));
    }

    public void method_12289(class00667 class006672, class00750<T> class007502) {
        this.N = class007502.y(class006672.E());
    }

    public class07340<T> method_39956() {
        if (this.N == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return this;
    }

    public int method_12290(class00750<T> class007502) {
        if (this.N == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return class01657.N((int)class007502.N(this.N));
    }

    public int method_12291(T t, class07342<T> class073422) {
        if (this.N == null || this.N == t) {
            this.N = t;
            return 0;
        }
        return class073422.onResize(1, t);
    }

    public boolean method_19525(Predicate<T> predicate) {
        if (this.N == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return predicate.test(this.N);
    }

    public int method_12197() {
        return 1;
    }

    public T method_12288(int n) {
        if (this.N == null || n != 0) {
            throw new IllegalStateException("Missing Palette entry for id " + n + ".");
        }
        return this.N;
    }
}

