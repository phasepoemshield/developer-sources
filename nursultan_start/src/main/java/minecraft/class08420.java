/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class08428
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import minecraft.class04995;
import minecraft.class08398;
import minecraft.class08404;
import minecraft.class08428;

class class08420<K, U, V>
extends class08428<K, U, V> {
    private final Map<K, V> L;
    private final int u;
    private final int i;
    static final /* synthetic */ boolean N;

    class08420(BiFunction<K, U, V> biFunction, int n, int n2) {
        super(biFunction, n, n2);
        this.L = new HashMap(n);
        this.u = class04995.R((int)n, (int)n2);
        int n3 = this.u * n2 - n;
        this.i = n2 - n3;
        if (!(N || this.i > 0 && this.i <= n2)) {
            throw new AssertionError();
        }
    }

    protected CompletableFuture<Map<K, V>> N(CompletableFuture<?> completableFuture, class08398<K, U, V> class083982) {
        Map map = this.L;
        return completableFuture.thenApply(object -> map);
    }

    protected CompletableFuture<?> N(class08398<K, U, V> class083982, int n, int n2, Executor executor) {
        int n3 = n2 - n;
        if (!N && n3 != this.u && n3 != this.u - 1) {
            throw new AssertionError();
        }
        return CompletableFuture.runAsync(class08420.N(this.L, n, n2, class083982), executor);
    }

    private static <K, U, V> Runnable N(Map<K, V> map, int n, int n2, class08398<K, U, V> class083982) {
        return () -> {
            for (int i = n; i < n2; ++i) {
                class083982.N(i);
            }
            Map map2 = map;
            synchronized (map2) {
                for (int i = n; i < n2; ++i) {
                    class083982.N(i, map);
                }
            }
        };
    }

    protected int N(int n) {
        return n < this.i ? this.u : this.u - 1;
    }

    static {
        N = !class08404.class.desiredAssertionStatus();
    }
}

