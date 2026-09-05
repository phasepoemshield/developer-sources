/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Queues
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public final class class03119<T>
extends AbstractIterator<T> {
    private static final int N = Integer.MIN_VALUE;
    private @Nullable Deque<T> y = null;
    private int L = Integer.MIN_VALUE;
    private final Int2ObjectMap<Deque<T>> u = new Int2ObjectOpenHashMap();

    private void N() {
        int n = Integer.MIN_VALUE;
        Deque deque = null;
        for (Int2ObjectMap.Entry entry : Int2ObjectMaps.fastIterable(this.u)) {
            Deque deque2 = (Deque)entry.getValue();
            int n2 = entry.getIntKey();
            if (n2 <= n || deque2.isEmpty()) continue;
            n = n2;
            deque = deque2;
            if (n2 != this.L - 1) continue;
            break;
        }
        this.L = n;
        this.y = deque;
    }

    public void N(T t, int n2) {
        if (n2 == this.L && this.y != null) {
            this.y.addLast(t);
            return;
        }
        Deque deque = (Deque)this.u.computeIfAbsent(n2, n -> Queues.newArrayDeque());
        deque.addLast(t);
        if (n2 >= this.L) {
            this.y = deque;
            this.L = n2;
        }
    }

    protected @Nullable T computeNext() {
        if (this.y == null) {
            return (T)this.endOfData();
        }
        T t = this.y.removeFirst();
        if (t == null) {
            return (T)this.endOfData();
        }
        if (this.y.isEmpty()) {
            this.N();
        }
        return t;
    }
}

