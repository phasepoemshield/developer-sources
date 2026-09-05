/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10532
 *  Nursultan.class10533
 *  minecraft.class02510
 *  minecraft.class02672
 */
package minecraft;

import Nursultan.class10532;
import Nursultan.class10533;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class02510;
import minecraft.class02672;
import minecraft.class08224;

public class class08240
extends class08224<class10533> {
    @Override
    public class10533 y(Runnable runnable) {
        return new class10533(0, runnable);
    }

    public class08240(int n, Executor executor, String string) {
        super(new class10532(n), executor, string);
        class02672.N.N((class02510)this);
    }

    public <Source> CompletableFuture<Source> N(int n, Consumer<CompletableFuture<Source>> consumer) {
        CompletableFuture completableFuture = new CompletableFuture();
        this.N(new class10533(n, () -> consumer.accept(completableFuture)));
        return completableFuture;
    }
}

