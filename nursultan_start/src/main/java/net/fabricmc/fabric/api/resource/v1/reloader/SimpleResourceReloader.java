/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 */
package net.fabricmc.fabric.api.resource.v1.reloader;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;

public abstract class SimpleResourceReloader<T>
implements class01081 {
    protected abstract T prepare(class01073 var1);

    protected abstract void apply(T var1, class01073 var2);

    public final CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        CompletableFuture<Object> completableFuture = CompletableFuture.supplyAsync(() -> this.prepare(class010732), executor);
        Objects.requireNonNull(class010802);
        return ((CompletableFuture)completableFuture.thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(object -> this.apply(object, class010732), executor2);
    }
}

