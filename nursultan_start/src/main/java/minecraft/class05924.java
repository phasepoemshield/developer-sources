/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

class class05924 {
    @Nullable class07001 N;
    final CompletableFuture<Void> y = new CompletableFuture();

    public class05924(@Nullable class07001 class070012) {
        this.N = class070012;
    }

    @Nullable class07001 N() {
        class07001 class070012 = this.N;
        return class070012 == null ? null : class070012.N();
    }
}

