/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;

@FunctionalInterface
public interface class06160<S> {
    public static final class06160<Void> N = (class010732, class010802, class010812, executor, executor2) -> class010812.method_25931(class010732, executor, class010802, executor2);

    public CompletableFuture<S> create(class01073 var1, class01080 var2, class01081 var3, Executor var4, Executor var5);
}

