/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05952
 */
package minecraft;

import java.util.function.Function;
import minecraft.class05952;

public interface class07297<T extends class07297<T>> {
    public T M();

    public T y(class05952 var1);

    default public <E> T a_(Iterable<E> iterable, Function<E, class05952> function) {
        T t = this.M();
        for (E e : iterable) {
            t = t.y(function.apply(e));
        }
        return t;
    }
}

