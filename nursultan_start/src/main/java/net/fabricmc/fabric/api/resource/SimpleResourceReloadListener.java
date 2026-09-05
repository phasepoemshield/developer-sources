/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01089
 */
package net.fabricmc.fabric.api.resource;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01089;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;

@Deprecated
public interface SimpleResourceReloadListener<T>
extends IdentifiableResourceReloadListener {
    public CompletableFuture<T> load(class01089 var1, Executor var2);

    public CompletableFuture<Void> apply(T var1, class01089 var2, Executor var3);

    default public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        return ((CompletableFuture)this.load(class010732.N(), executor).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenCompose(object -> this.apply(object, class010732.N(), executor2));
    }
}

