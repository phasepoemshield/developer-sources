/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class01816
 *  minecraft.class07340
 *  minecraft.class07342
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class01816;
import minecraft.class07340;
import minecraft.class07342;

public class class00551<T>
implements class07340<T> {
    private final class00750<T> N;

    public class00551(class00750<T> class007502) {
        this.N = class007502;
    }

    public void method_12287(class00667 class006672, class00750<T> class007502) {
    }

    public void method_12289(class00667 class006672, class00750<T> class007502) {
    }

    public class07340<T> method_39956() {
        return this;
    }

    public int method_12290(class00750<T> class007502) {
        return 0;
    }

    public int method_12291(T t, class07342<T> class073422) {
        int n = this.N.N(t);
        return n == -1 ? 0 : n;
    }

    public boolean method_19525(Predicate<T> predicate) {
        return true;
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

