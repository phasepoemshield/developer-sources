/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function4
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.util.Function4;
import java.util.List;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08092;

public class class05411<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>>
extends class05415<V> {
    private final class08092<T1> N;
    private final class08092<T2> y;
    private final class08092<T3> L;
    private final class08092<T4> u;

    class05411(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925) {
        this.N = class080922;
        this.y = class080923;
        this.L = class080924;
        this.u = class080925;
    }

    @Override
    public List<class08092<?>> y() {
        return List.of(this.N, this.y, this.L, this.u);
    }

    public class05415<V> N(Function4<T1, T2, T3, T4, V> function4) {
        this.N.N().forEach(comparable -> this.y.N().forEach(comparable2 -> this.L.N().forEach(comparable3 -> this.u.N().forEach(comparable4 -> this.N(comparable, comparable2, comparable3, comparable4, function4.apply(comparable, comparable2, comparable3, comparable4))))));
        return this;
    }

    public class05411<V, T1, T2, T3, T4> N(T1 T1, T2 T2, T3 T3, T4 T4, V v) {
        class05390 class053902 = class05390.N(this.N.L(T1), this.y.L(T2), this.L.L(T3), this.u.L(T4));
        this.N(class053902, v);
        return this;
    }
}

