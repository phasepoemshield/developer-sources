/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class04643
 *  minecraft.class08700
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class04643;
import minecraft.class08700;

public abstract class class01291<T>
implements class01081 {
    protected abstract T y(class01089 var1, class04643 var2);

    protected abstract void N(T var1, class01089 var2, class04643 var3);

    public final CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class01089 class010892 = class010732.N();
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> this.y(class010892, class08700.N()), executor).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(object -> this.N(object, class010892, class08700.N()), executor2);
    }
}

