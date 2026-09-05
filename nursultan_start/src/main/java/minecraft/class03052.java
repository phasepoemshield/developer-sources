/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class03068;
import org.slf4j.Logger;

public class class03052
implements class03068,
AutoCloseable {
    private static final Logger y = LogUtils.getLogger();
    private CompletableFuture<?> L = CompletableFuture.completedFuture(null);
    private final Executor u;
    private volatile boolean i;

    public class03052(Executor executor) {
        this.u = executor;
    }

    @Override
    public void close() {
        this.i = true;
    }

    @Override
    public <T> void N(CompletableFuture<T> completableFuture, Consumer<T> consumer) {
        this.L = ((CompletableFuture)((CompletableFuture)this.L.thenCombine(completableFuture, (object, object2) -> object2)).thenAcceptAsync(object -> {
            if (!this.i) {
                consumer.accept(object);
            }
        }, this.u)).exceptionally(throwable -> {
            RuntimeException runtimeException;
            if (throwable instanceof CompletionException) {
                runtimeException = (CompletionException)throwable;
                throwable = runtimeException.getCause();
            }
            if (throwable instanceof CancellationException) {
                runtimeException = (CancellationException)throwable;
                throw runtimeException;
            }
            y.error("Chain link failed, continuing to next one", throwable);
            return null;
        });
    }
}

