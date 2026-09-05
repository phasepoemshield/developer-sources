/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05678
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Queue;
import minecraft.class05678;
import org.jspecify.annotations.Nullable;

public final class class10530
implements class05678<Runnable> {
    private final Queue<Runnable> N;

    public int L() {
        return this.N.size();
    }

    public class10530(Queue<Runnable> queue) {
        this.N = queue;
    }

    public boolean y() {
        return this.N.isEmpty();
    }

    public @Nullable Runnable N() {
        return this.N.poll();
    }

    public boolean N(Runnable runnable) {
        return this.N.add(runnable);
    }
}

