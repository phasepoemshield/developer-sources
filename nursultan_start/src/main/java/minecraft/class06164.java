/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.concurrent.CompletableFuture;

public interface class06164 {
    default public boolean L() {
        return this.N().isDone();
    }

    default public void u() {
        CompletableFuture<?> var1 = this.N();
        if (var1.isCompletedExceptionally()) {
            var1.join();
        }
    }

    public float y();

    public CompletableFuture<?> N();
}

