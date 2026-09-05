/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class03682<K, V> {
    private final Function<K, V> N;
    private @Nullable K y = null;
    private @Nullable V L;

    public class03682(Function<K, V> function) {
        this.N = function;
    }

    public V N(K k) {
        if (this.L == null || !Objects.equals(this.y, k)) {
            this.L = this.N.apply(k);
            this.y = k;
        }
        return this.L;
    }
}

