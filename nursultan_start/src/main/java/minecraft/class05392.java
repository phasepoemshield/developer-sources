/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08092
 */
package minecraft;

import java.util.List;
import java.util.function.Function;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08092;

public class class05392<V, T1 extends Comparable<T1>>
extends class05415<V> {
    private final class08092<T1> N;

    class05392(class08092<T1> class080922) {
        this.N = class080922;
    }

    @Override
    public List<class08092<?>> y() {
        return List.of(this.N);
    }

    public class05415<V> N(Function<T1, V> function) {
        this.N.N().forEach(comparable -> this.N(comparable, function.apply(comparable)));
        return this;
    }

    public class05392<V, T1> N(T1 T1, V v) {
        class05390 class053902 = class05390.N(this.N.L(T1));
        this.N(class053902, v);
        return this;
    }
}

