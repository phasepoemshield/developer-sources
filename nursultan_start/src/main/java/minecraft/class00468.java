/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05623
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class00440;
import minecraft.class05623;

public class class00468
implements class00440 {
    private final class05623 N;

    public class00468(class05623 class056232) {
        this.N = class056232;
    }

    @Override
    public <V> CompletableFuture<V> N(Supplier<V> supplier) {
        return this.N.N(supplier);
    }

    @Override
    public CompletableFuture<Void> N(Runnable runnable) {
        return this.N.u(runnable);
    }
}

