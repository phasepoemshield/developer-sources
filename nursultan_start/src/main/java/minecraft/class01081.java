/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;

@FunctionalInterface
public interface class01081 {
    public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4);

    default public String method_22322() {
        return this.getClass().getSimpleName();
    }

    default public void prepareSharedState(class01073 class010732) {
    }
}

