/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08137
 */
package minecraft;

import java.util.Arrays;
import java.util.function.Function;
import minecraft.class08137;

public interface class08967<T extends class08967<T>> {
    public T N();

    default public <E> T N(E[] EArray, Function<E, class08137> function) {
        return this.N(Arrays.asList(EArray), function);
    }

    default public <E> T N(Iterable<E> iterable, Function<E, class08137> function) {
        T t = this.N();
        for (E e : iterable) {
            t = t.N(function.apply(e));
        }
        return t;
    }

    public T N(class08137 var1);
}

