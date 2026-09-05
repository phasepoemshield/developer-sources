/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Function5
 *  minecraft.class05390
 *  minecraft.class05415
 *  minecraft.class08084
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.util.Function5;
import java.util.List;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08084;
import minecraft.class08092;

public class class05426<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
extends class05415<V> {
    private final class08092<T1> N;
    private final class08092<T2> y;
    private final class08092<T3> L;
    private final class08092<T4> u;
    private final class08092<T5> i;

    class05426(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925, class08092<T5> class080926) {
        this.N = class080922;
        this.y = class080923;
        this.L = class080924;
        this.u = class080925;
        this.i = class080926;
    }

    public List<class08092<?>> y() {
        return List.of(this.N, this.y, this.L, this.u, this.i);
    }

    public class05415<V> N(Function5<T1, T2, T3, T4, T5, V> function5) {
        this.N.N().forEach(comparable -> this.y.N().forEach(comparable2 -> this.L.N().forEach(comparable3 -> this.u.N().forEach(comparable4 -> this.i.N().forEach(comparable5 -> this.N(comparable, comparable2, comparable3, comparable4, comparable5, function5.apply(comparable, comparable2, comparable3, comparable4, comparable5)))))));
        return this;
    }

    public class05426<V, T1, T2, T3, T4, T5> N(T1 T1, T2 T2, T3 T3, T4 T4, T5 T5, V v) {
        class05390 class053902 = class05390.N((class08084[])new class08084[]{this.N.L(T1), this.y.L(T2), this.L.L(T3), this.u.L(T4), this.i.L(T5)});
        this.N(class053902, v);
        return this;
    }
}

