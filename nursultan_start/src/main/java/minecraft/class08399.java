/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08428
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import minecraft.class08398;
import minecraft.class08404;
import minecraft.class08428;

class class08399<K, U, V>
extends class08428<K, U, V> {
    static final /* synthetic */ boolean N;

    class08399(BiFunction<K, U, V> biFunction, int n) {
        super(biFunction, n, n);
    }

    static {
        N = !class08404.class.desiredAssertionStatus();
    }

    protected CompletableFuture<Map<K, V>> N(CompletableFuture<?> completableFuture, class08398<K, U, V> class083982) {
        return completableFuture.thenApply(object -> {
            HashMap hashMap = new HashMap(class083982.N());
            for (int i = 0; i < class083982.N(); ++i) {
                class083982.N(i, hashMap);
            }
            return hashMap;
        });
    }

    protected int N(int n) {
        return 1;
    }

    protected CompletableFuture<?> N(class08398<K, U, V> class083982, int n, int n2, Executor executor) {
        if (!N && n + 1 != n2) {
            throw new AssertionError();
        }
        return CompletableFuture.runAsync(() -> class083982.N(n), executor);
    }
}

