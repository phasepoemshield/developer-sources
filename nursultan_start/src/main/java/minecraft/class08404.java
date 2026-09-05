/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 *  minecraft.class08428
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import minecraft.class07536;
import minecraft.class08399;
import minecraft.class08420;
import minecraft.class08428;
import org.jspecify.annotations.Nullable;

public class class08404 {
    private static final int N = 16;

    public static <K, U, V> CompletableFuture<Map<K, V>> N(Map<K, U> map, BiFunction<K, U, @Nullable V> biFunction, Executor executor) {
        int n = class07536.M() * 16;
        return class08404.N(map, biFunction, n, executor);
    }

    public static <K, U, V> CompletableFuture<Map<K, V>> N(Map<K, U> map, BiFunction<K, U, @Nullable V> biFunction, int n, Executor executor) {
        int n2 = map.size();
        if (n2 == 0) {
            return CompletableFuture.completedFuture(Map.of());
        }
        if (n2 == 1) {
            Map.Entry<K, U> entry = map.entrySet().iterator().next();
            Object k = entry.getKey();
            Object u = entry.getValue();
            return CompletableFuture.supplyAsync(() -> {
                Object r = biFunction.apply(k, u);
                return r != null ? Map.of(k, r) : Map.of();
            }, executor);
        }
        class08428 class084282 = n2 <= n ? new class08399<K, U, V>(biFunction, n2) : new class08420<K, U, V>(biFunction, n2, n);
        return class084282.N(map, executor);
    }
}

