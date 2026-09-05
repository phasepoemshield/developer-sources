/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01080
 *  minecraft.class01081
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class06162;
import minecraft.class06244;

class class06157
implements class01080 {
    final /* synthetic */ Executor N;
    final /* synthetic */ class01081 y;
    final /* synthetic */ CompletableFuture L;
    final /* synthetic */ class06162 u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06157(class06162 class061622, Executor executor, class01081 class010812, CompletableFuture completableFuture) {
        this.u = class061622;
        this.N = executor;
        this.y = class010812;
        this.L = completableFuture;
    }

    public <T> CompletableFuture<T> N(T t) {
        this.N.execute(() -> {
            this.u.y.remove(this.y);
            if (this.u.y.isEmpty()) {
                this.u.N.complete(class06244.field_17274);
            }
        });
        return this.u.N.thenCombine((CompletionStage)this.L, (class062442, object2) -> t);
    }
}

