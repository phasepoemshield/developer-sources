/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.gui.image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class YACLImageReloadListener$CompletableFutureCollector<X, T extends CompletableFuture<X>>
implements Collector<T, List<T>, CompletableFuture<List<X>>> {
    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }

    @Override
    public Function<List<T>, CompletableFuture<List<X>>> finisher() {
        return list -> CompletableFuture.allOf((CompletableFuture[])list.toArray(CompletableFuture[]::new)).thenApply(void_ -> list.stream().map(CompletableFuture::join).toList());
    }

    public static <X, T extends CompletableFuture<X>> Collector<T, List<T>, CompletableFuture<List<X>>> allOf() {
        return new YACLImageReloadListener$CompletableFutureCollector<X, T>();
    }

    private YACLImageReloadListener$CompletableFutureCollector() {
    }

    @Override
    public Set<Collector.Characteristics> characteristics() {
        return Collections.emptySet();
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list, list2) -> {
            list.addAll(list2);
            return list;
        };
    }

    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }
}

