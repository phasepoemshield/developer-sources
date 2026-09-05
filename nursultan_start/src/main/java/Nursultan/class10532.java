/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  minecraft.class05678
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import Nursultan.class10533;
import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class05678;
import org.jspecify.annotations.Nullable;

public final class class10532
implements class05678<class10533> {
    private final Queue<Runnable>[] N;
    private final AtomicInteger y = new AtomicInteger();

    public int L() {
        return this.y.get();
    }

    public class10532(int n) {
        this.N = new Queue[n];
        for (int i = 0; i < n; ++i) {
            this.N[i] = Queues.newConcurrentLinkedQueue();
        }
    }

    public boolean y() {
        return this.y.get() == 0;
    }

    public boolean N(class10533 class105332) {
        int n = class105332.N();
        if (n >= this.N.length || n < 0) {
            throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", n, this.N.length - 1));
        }
        this.N[n].add(class105332);
        this.y.incrementAndGet();
        return true;
    }

    public @Nullable Runnable N() {
        Queue<Runnable>[] var1 = this.N;
        int n = var1.length;
        for (int i = 0; i < n; ++i) {
            Runnable runnable = var1[i].poll();
            if (runnable == null) continue;
            this.y.decrementAndGet();
            return runnable;
        }
        return null;
    }
}

