/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10434
 *  Nursultan.class10457
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class02253
 *  minecraft.class02672
 *  minecraft.class03463
 *  minecraft.class04587
 *  minecraft.class04657
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10434;
import Nursultan.class10457;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import minecraft.class02253;
import minecraft.class02672;
import minecraft.class03463;
import minecraft.class04522;
import minecraft.class04530;
import minecraft.class04555;
import minecraft.class04574;
import minecraft.class04587;
import minecraft.class04657;
import org.slf4j.Logger;

public class class04553
implements class04555 {
    private static final Logger N = LogUtils.getLogger();
    private final Set<class04530> y = new ObjectOpenHashSet();
    private final class04587 L = new class04587();

    public class04553(LongSupplier longSupplier, boolean bl) {
        this.y.add(class04553.N(longSupplier));
        if (bl) {
            this.y.addAll(class04553.N());
        }
    }

    @Override
    public Set<class04530> N(Supplier<class04657> supplier) {
        this.y.addAll(this.L.N(supplier));
        return this.y;
    }

    public static Set<class04530> N() {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        try {
            class04574 class045742 = new class04574();
            IntStream.range(0, class045742.N).mapToObj(n -> class04530.N("cpu#" + n, class02253.field_33881, () -> class045742.N(n))).forEach(arg_0 -> ((ImmutableSet.Builder)builder).add(arg_0));
        }
        catch (Throwable throwable) {
            N.warn("Failed to query cpu, no cpu stats will be recorded", throwable);
        }
        builder.add((Object)class04530.N("heap MiB", class02253.field_33878, () -> class03463.N((long)(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()))));
        builder.addAll((Iterable)class02672.N.N());
        return builder.build();
    }

    public static class04530 N(LongSupplier longSupplier) {
        Stopwatch stopwatch2 = Stopwatch.createUnstarted((Ticker)new class10457(longSupplier));
        ToDoubleFunction<Stopwatch> toDoubleFunction = stopwatch -> {
            if (stopwatch.isRunning()) {
                stopwatch.stop();
            }
            long l = stopwatch.elapsed(TimeUnit.NANOSECONDS);
            stopwatch.reset();
            return l;
        };
        class10434 class104342 = new class10434(2.0f);
        return class04530.N("ticktime", class02253.field_33877, toDoubleFunction, stopwatch2).N(Stopwatch::start).N((class04522)class104342).N();
    }
}

