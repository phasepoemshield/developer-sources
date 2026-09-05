/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03068
 */
package Nursultan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class03068;

public class class10102
implements class03068 {
    final /* synthetic */ Executor y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10102(Executor executor) {
        this.y = executor;
    }

    public <T> void N(CompletableFuture<T> completableFuture, Consumer<T> consumer) {
        ((CompletableFuture)completableFuture.thenAcceptAsync((Consumer)consumer, this.y)).exceptionally(throwable -> {
            N.error("Task failed", throwable);
            return null;
        });
    }
}

