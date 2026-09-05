/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function3
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.util.Function3;
import java.util.List;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08092;

public class class05408<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
extends class05415<V> {
    private final class08092<T1> N;
    private final class08092<T2> y;
    private final class08092<T3> L;

    class05408(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924) {
        this.N = class080922;
        this.y = class080923;
        this.L = class080924;
    }

    @Override
    public List<class08092<?>> y() {
        return List.of(this.N, this.y, this.L);
    }

    public class05415<V> N(Function3<T1, T2, T3, V> function3) {
        this.N.N().forEach(comparable -> this.y.N().forEach(comparable2 -> this.L.N().forEach(comparable3 -> this.N(comparable, comparable2, comparable3, function3.apply(comparable, comparable2, comparable3)))));
        return this;
    }

    public class05408<V, T1, T2, T3> N(T1 T1, T2 T2, T3 T3, V v) {
        class05390 class053902 = class05390.N(this.N.L(T1), this.y.L(T2), this.L.L(T3));
        this.N(class053902, v);
        return this;
    }
}

