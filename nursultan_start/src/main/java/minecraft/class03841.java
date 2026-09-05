/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07438;

public class class03841<T extends class07438>
extends class05355<T> {
    private final BiPredicate<T, class07438> N;
    private final Predicate<T> y;
    private final class05378<Boolean> L;
    private final int u;

    public void L(T t) {
        t.method_18868().y(this.L);
    }

    public class03841(int n, BiPredicate<T, class07438> biPredicate, Predicate<T> predicate, class05378<Boolean> class053782, int n2) {
        super(n);
        this.N = biPredicate;
        this.y = predicate;
        this.L = class053782;
        this.u = n2;
    }

    public void y(T t) {
        t.method_18868().N(this.L, (Object)true, (long)this.u);
    }

    public void N(T t) {
        Optional var2 = t.method_18868().L(class05378.M);
        if (var2.isEmpty()) {
            return;
        }
        if (((List)var2.get()).stream().anyMatch(class074383 -> this.N.test((class07438)t, (class07438)class074383))) {
            this.y(t);
        }
    }

    public Set<class05378<?>> N() {
        return Set.of(class05378.M);
    }

    protected void N(class04782 class047822, T t) {
        if (!this.y.test(t)) {
            this.L(t);
        } else {
            this.N(t);
        }
    }
}

