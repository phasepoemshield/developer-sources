/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

class class07561<T, U, R>
implements BiFunction<T, U, R> {
    private final Map<Pair<T, U>, R> y = new ConcurrentHashMap<Pair<T, U>, R>();
    final /* synthetic */ BiFunction N;

    class07561(BiFunction biFunction) {
        this.N = biFunction;
    }

    public String toString() {
        return "memoize/2[function=" + String.valueOf(this.N) + ", size=" + this.y.size() + "]";
    }

    @Override
    public R apply(T t, U u) {
        return (R)this.y.computeIfAbsent(Pair.of(t, u), pair -> this.N.apply(pair.getFirst(), pair.getSecond()));
    }
}

