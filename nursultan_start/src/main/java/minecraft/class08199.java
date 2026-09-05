/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10884
 */
package minecraft;

import Nursultan.class10884;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface class08199<R extends Runnable>
extends AutoCloseable {
    @Override
    default public void close() {
    }

    public R y(Runnable var1);

    public static class08199<Runnable> N(String string, Executor executor) {
        return new class10884(string, executor);
    }

    default public <Source> CompletableFuture<Source> N_87(Consumer<CompletableFuture<Source>> consumer) {
        CompletableFuture completableFuture = new CompletableFuture();
        this.N(this.y(() -> consumer.accept(completableFuture)));
        return completableFuture;
    }

    public void N(R var1);

    public String as_();
}

