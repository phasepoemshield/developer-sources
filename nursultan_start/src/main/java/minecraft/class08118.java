/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class04806
 *  minecraft.class07085
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01188;
import minecraft.class01686;
import minecraft.class04806;
import minecraft.class07085;

public final class class08118<T>
extends Record {
    private final T head;
    private final T chest;
    private final T legs;
    private final T feet;

    public T L() {
        return this.legs;
    }

    public class08118(T t, T t2, T t3, T t4) {
        this.head = t;
        this.chest = t2;
        this.legs = t3;
        this.feet = t4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08118.class, "head;chest;legs;feet", "head", "chest", "legs", "feet"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08118.class, "head;chest;legs;feet", "head", "chest", "legs", "feet"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08118.class, "head;chest;legs;feet", "head", "chest", "legs", "feet"}, this);
    }

    public T u() {
        return this.feet;
    }

    public T y() {
        return this.chest;
    }

    public T N(class07085 class070852) {
        return switch (class070852) {
            case class07085.field_6169 -> this.head;
            case class07085.field_6174 -> this.chest;
            case class07085.field_6172 -> this.legs;
            case class07085.field_6166 -> this.feet;
            default -> throw new IllegalStateException("No model for slot: " + String.valueOf(class070852));
        };
    }

    public static <M extends class01188<?>> class08118<M> N(class08118<class01134> class081182, class01140 class011402, Function<class01686, M> function) {
        return class081182.N((? super T class011342) -> (class01188)function.apply(class011402.N(class011342)));
    }

    public T N() {
        return this.head;
    }

    public <U> class08118<U> N(Function<? super T, ? extends U> function) {
        return new class08118<U>(function.apply(this.head), function.apply(this.chest), function.apply(this.legs), function.apply(this.feet));
    }

    public void N(class08118<class04806> class081182, ImmutableMap.Builder<T, class04806> builder) {
        builder.put(this.head, (Object)((class04806)class081182.head));
        builder.put(this.chest, (Object)((class04806)class081182.chest));
        builder.put(this.legs, (Object)((class04806)class081182.legs));
        builder.put(this.feet, (Object)((class04806)class081182.feet));
    }
}

