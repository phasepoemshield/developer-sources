/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10102
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10102;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03068 {
    public static final Logger N = LogUtils.getLogger();

    public static class03068 N(Executor executor) {
        return new class10102(executor);
    }

    public <T> void N(CompletableFuture<T> var1, Consumer<T> var2);

    default public void N(Runnable runnable) {
        this.N(CompletableFuture.completedFuture(null), object -> runnable.run());
    }
}

