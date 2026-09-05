/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface class00440 {
    public <V> CompletableFuture<V> N(Supplier<V> var1);

    public CompletableFuture<Void> N(Runnable var1);
}

