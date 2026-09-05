/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03264
 *  minecraft.class05426
 *  minecraft.class08092
 *  minecraft.class08503
 */
package minecraft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class03264;
import minecraft.class05390;
import minecraft.class05392;
import minecraft.class05408;
import minecraft.class05411;
import minecraft.class05413;
import minecraft.class05426;
import minecraft.class08092;
import minecraft.class08503;

public abstract class class05415<V> {
    private final Map<class05390, V> N = new HashMap<class05390, V>();

    private void L() {
        List<class08092<?>> var1 = this.y();
        Stream<class05390> stream = Stream.of(class05390.N);
        for (class08092<?> var4 : var1) {
            stream = stream.flatMap(class053902 -> var4.L().map(class053902::N));
        }
        List list = stream.filter(class053902 -> !this.N.containsKey(class053902)).toList();
        if (!list.isEmpty()) {
            throw new IllegalStateException("Missing definition for properties: " + String.valueOf(list));
        }
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> class05411<class08503, T1, T2, T3, T4> y(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925) {
        return new class05411(class080922, class080923, class080924, class080925);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> class05408<class08503, T1, T2, T3> y(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924) {
        return new class05408(class080922, class080923, class080924);
    }

    public static <T1 extends Comparable<T1>> class05392<class08503, T1> y(class08092<T1> class080922) {
        return new class05392(class080922);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> class05413<class08503, T1, T2> y(class08092<T1> class080922, class08092<T2> class080923) {
        return new class05413(class080922, class080923);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> class05426<class08503, T1, T2, T3, T4, T5> y(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925, class08092<T5> class080926) {
        return new class05426(class080922, class080923, class080924, class080925, class080926);
    }

    abstract List<class08092<?>> y();

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> class05413<class03264, T1, T2> N(class08092<T1> class080922, class08092<T2> class080923) {
        return new class05413(class080922, class080923);
    }

    public static <T1 extends Comparable<T1>> class05392<class03264, T1> N(class08092<T1> class080922) {
        return new class05392(class080922);
    }

    Map<class05390, V> N() {
        this.L();
        return Map.copyOf(this.N);
    }

    protected void N(class05390 class053902, V v) {
        if (this.N.put(class053902, v) != null) {
            throw new IllegalStateException("Value " + String.valueOf((Object)class053902) + " is already defined");
        }
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> class05408<class03264, T1, T2, T3> N(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924) {
        return new class05408(class080922, class080923, class080924);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> class05411<class03264, T1, T2, T3, T4> N(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925) {
        return new class05411(class080922, class080923, class080924, class080925);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> class05426<class03264, T1, T2, T3, T4, T5> N(class08092<T1> class080922, class08092<T2> class080923, class08092<T3> class080924, class08092<T4> class080925, class08092<T5> class080926) {
        return new class05426(class080922, class080923, class080924, class080925, class080926);
    }
}

