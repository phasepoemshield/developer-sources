/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08092
 */
package minecraft;

import java.util.List;
import java.util.function.BiFunction;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08092;

public class class05413<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>>
extends class05415<V> {
    private final class08092<T1> N;
    private final class08092<T2> y;

    class05413(class08092<T1> class080922, class08092<T2> class080923) {
        this.N = class080922;
        this.y = class080923;
    }

    @Override
    public List<class08092<?>> y() {
        return List.of(this.N, this.y);
    }

    public class05415<V> N(BiFunction<T1, T2, V> biFunction) {
        this.N.N().forEach(comparable -> this.y.N().forEach(comparable2 -> this.N(comparable, comparable2, biFunction.apply(comparable, comparable2))));
        return this;
    }

    public class05413<V, T1, T2> N(T1 T1, T2 T2, V v) {
        class05390 class053902 = class05390.N(this.N.L(T1), this.y.L(T2));
        this.N(class053902, v);
        return this;
    }
}

