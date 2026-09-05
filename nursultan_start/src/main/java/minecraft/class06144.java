/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.logging.LogUtils
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class04643
 *  minecraft.class07536
 *  minecraft.class08700
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class04643;
import minecraft.class06155;
import minecraft.class06160;
import minecraft.class06162;
import minecraft.class06164;
import minecraft.class06244;
import minecraft.class07536;
import minecraft.class08700;
import org.slf4j.Logger;

public class class06144
extends class06162<class06155> {
    private static final Logger L = LogUtils.getLogger();
    private final Stopwatch u = Stopwatch.createUnstarted();

    private class06144(List<class01081> list) {
        super(list);
        this.u.start();
    }

    public static class06164 N(class01089 class010892, List<class01081> list, Executor executor, Executor executor4, CompletableFuture<class06244> completableFuture) {
        class06144 class061442 = new class06144(list);
        class061442.y(executor, executor4, class010892, list, (class010732, class010802, class010812, executor2, executor3) -> {
            AtomicLong atomicLong = new AtomicLong();
            AtomicLong atomicLong2 = new AtomicLong();
            AtomicLong atomicLong3 = new AtomicLong();
            AtomicLong atomicLong4 = new AtomicLong();
            return class010812.method_25931(class010732, class06144.N(executor2, atomicLong, atomicLong2, class010812.method_22322()), class010802, class06144.N(executor3, atomicLong3, atomicLong4, class010812.method_22322())).thenApplyAsync(void_ -> {
                L.debug("Finished reloading {}", (Object)class010812.method_22322());
                return new class06155(class010812.method_22322(), atomicLong, atomicLong2, atomicLong3, atomicLong4);
            }, executor4);
        }, completableFuture);
        return class061442;
    }

    @Override
    protected CompletableFuture<List<class06155>> N(Executor executor, Executor executor2, class01089 class010892, List<class01081> list, class06160<class06155> class061602, CompletableFuture<?> completableFuture) {
        return super.N(executor, executor2, class010892, list, class061602, completableFuture).thenApplyAsync(this::N, executor2);
    }

    private static Executor N(Executor executor, AtomicLong atomicLong, AtomicLong atomicLong2, String string) {
        return runnable -> executor.execute(() -> {
            class04643 class046432 = class08700.N();
            class046432.N(string);
            long l = class07536.u();
            runnable.run();
            atomicLong.addAndGet(class07536.u() - l);
            atomicLong2.incrementAndGet();
            class046432.L();
        });
    }

    private List<class06155> N(List<class06155> list) {
        this.u.stop();
        long l = 0L;
        L.info("Resource reload finished after {} ms", (Object)this.u.elapsed(TimeUnit.MILLISECONDS));
        for (class06155 class061552 : list) {
            long l2 = TimeUnit.NANOSECONDS.toMillis(class061552.y().get());
            long l3 = class061552.L().get();
            long l4 = TimeUnit.NANOSECONDS.toMillis(class061552.u().get());
            long l5 = class061552.i().get();
            long l6 = l2 + l4;
            long l7 = l3 + l5;
            String string = class061552.N();
            L.info("{} took approximately {} tasks/{} ms ({} tasks/{} ms preparing, {} tasks/{} ms applying)", new Object[]{string, l7, l6, l3, l2, l5, l4});
            l += l4;
        }
        L.info("Total blocking time: {} ms", (Object)l);
        return list;
    }
}

