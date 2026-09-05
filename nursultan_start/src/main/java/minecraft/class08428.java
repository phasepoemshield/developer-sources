/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08398
 *  minecraft.class08404
 */
package minecraft;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import minecraft.class08398;
import minecraft.class08404;

abstract class class08428<K, U, V> {
    private int N;
    private int L;
    private final CompletableFuture<?>[] u;
    private int i;
    private final class08398<K, U, V> R;
    static final /* synthetic */ boolean y;

    class08428(BiFunction<K, U, V> biFunction, int n, int n2) {
        this.R = new class08398(biFunction, n);
        this.u = new CompletableFuture[n2];
    }

    protected abstract CompletableFuture<?> N(class08398<K, U, V> var1, int var2, int var3, Executor var4);

    protected abstract CompletableFuture<Map<K, V>> N(CompletableFuture<?> var1, class08398<K, U, V> var2);

    private int N() {
        return this.L - this.N;
    }

    protected abstract int N(int var1);

    public CompletableFuture<Map<K, V>> N(Map<K, U> map, Executor executor) {
        map.forEach((object, object2) -> {
            this.R.N(this.L++, object, object2);
            if (this.N() == this.N(this.i)) {
                this.u[this.i++] = this.N(this.R, this.N, this.L, executor);
                this.N = this.L;
            }
        });
        if (!y && this.L != this.R.N()) {
            throw new AssertionError();
        }
        if (!y && this.N != this.L) {
            throw new AssertionError();
        }
        if (!y && this.i != this.u.length) {
            throw new AssertionError();
        }
        return this.N(CompletableFuture.allOf(this.u), this.R);
    }

    static {
        y = !class08404.class.desiredAssertionStatus();
    }
}

