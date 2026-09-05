/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

class class07555<T, R>
implements Function<T, R> {
    private final Map<T, R> y = new ConcurrentHashMap<T, R>();
    final /* synthetic */ Function N;

    class07555(Function function) {
        this.N = function;
    }

    public String toString() {
        return "memoize/1[function=" + String.valueOf(this.N) + ", size=" + this.y.size() + "]";
    }

    @Override
    public R apply(T t) {
        return this.y.computeIfAbsent(t, this.N);
    }
}

