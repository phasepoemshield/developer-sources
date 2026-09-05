/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class04643
 *  minecraft.class04645
 *  minecraft.class04657
 *  minecraft.class04681
 *  minecraft.class04687
 *  minecraft.class05011
 *  minecraft.class06007
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import minecraft.class04524;
import minecraft.class04526;
import minecraft.class04530;
import minecraft.class04536;
import minecraft.class04555;
import minecraft.class04643;
import minecraft.class04645;
import minecraft.class04657;
import minecraft.class04681;
import minecraft.class04687;
import minecraft.class05011;
import minecraft.class06007;
import org.jspecify.annotations.Nullable;

public class class04541
implements class04526 {
    public static final int N = 10;
    private static @Nullable Consumer<Path> y = null;
    private final Map<class04530, List<class04536>> L = new Object2ObjectOpenHashMap();
    private final class06007 u;
    private final Executor i;
    private final class04524 R;
    private final Consumer<class04681> M;
    private final Consumer<Path> B;
    private final class04555 Z;
    private final LongSupplier z;
    private final long U;
    private int E;
    private class04657 W;
    private volatile boolean m;
    private Set<class04530> P = ImmutableSet.of();

    @Override
    public void L() {
        this.M();
        this.P = this.Z.N(() -> this.W);
        Iterator<class04530> var1 = this.P.iterator();
        while (var1.hasNext()) {
            var1.next().N();
        }
        ++this.E;
    }

    private void M() {
        if (!this.i()) {
            throw new IllegalStateException("Not started!");
        }
    }

    private class04541(class04555 class045552, LongSupplier longSupplier, Executor executor, class04524 class045242, Consumer<class04681> consumer, Consumer<Path> consumer2) {
        this.Z = class045552;
        this.z = longSupplier;
        this.u = new class06007(longSupplier, () -> this.E, () -> false);
        this.i = executor;
        this.R = class045242;
        this.M = consumer;
        this.B = y == null ? consumer2 : consumer2.andThen(y);
        this.U = longSupplier.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
        this.W = new class05011(this.z, () -> this.E, () -> true);
        this.u.L();
    }

    @Override
    public boolean i() {
        return this.u.N();
    }

    @Override
    public void u() {
        this.M();
        if (this.E == 0) {
            return;
        }
        for (class04530 class045303 : this.P) {
            class045303.N(this.E);
            if (!class045303.M()) continue;
            class04536 class045362 = new class04536(Instant.now(), this.E, this.W.u());
            this.L.computeIfAbsent(class045303, class045302 -> Lists.newArrayList()).add(class045362);
        }
        if (this.m || this.z.getAsLong() > this.U) {
            this.m = false;
            class04681 class046812 = this.u.i();
            this.W = class04687.N;
            this.M.accept(class046812);
            this.N(class046812);
            return;
        }
        this.W = new class05011(this.z, () -> this.E, () -> true);
    }

    @Override
    public synchronized void y() {
        if (!this.i()) {
            return;
        }
        this.W = class04687.N;
        this.M.accept((class04681)class04645.N);
        this.N(this.P);
    }

    private void N(class04681 class046812) {
        HashSet<class04530> hashSet = new HashSet<class04530>(this.P);
        this.i.execute(() -> {
            Path path = this.R.N(hashSet, this.L, class046812);
            this.N(hashSet);
            this.B.accept(path);
        });
    }

    @Override
    public synchronized void N() {
        if (!this.i()) {
            return;
        }
        this.m = true;
    }

    public static void N(Consumer<Path> consumer) {
        y = consumer;
    }

    public static class04541 N(class04555 class045552, LongSupplier longSupplier, Executor executor, class04524 class045242, Consumer<class04681> consumer, Consumer<Path> consumer2) {
        return new class04541(class045552, longSupplier, executor, class045242, consumer, consumer2);
    }

    private void N(Collection<class04530> collection) {
        Iterator<class04530> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().y();
        }
        this.L.clear();
        this.u.y();
    }

    @Override
    public class04643 R() {
        return class04643.N((class04643)this.u.u(), (class04643)this.W);
    }
}

