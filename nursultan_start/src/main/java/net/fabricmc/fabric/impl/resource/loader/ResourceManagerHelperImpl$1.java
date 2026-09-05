/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01929
 *  net.fabricmc.fabric.api.resource.v1.ResourceLoader
 */
package net.fabricmc.fabric.impl.resource.loader;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01929;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;

class ResourceManagerHelperImpl$1
implements class01081 {
    final /* synthetic */ Function val$listenerFactory;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    ResourceManagerHelperImpl$1() {
        void var2_-1;
        this.val$listenerFactory = var2_-1;
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class01929 class019292 = (class01929)class010732.N(ResourceLoader.RELOADER_REGISTRY_LOOKUP_KEY);
        class01081 class010812 = (class01081)this.val$listenerFactory.apply(class019292);
        return class010812.method_25931(class010732, executor, class010802, executor2);
    }
}

