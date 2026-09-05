/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  minecraft.class03469
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class03469;
import minecraft.class06256;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class06263 {
    public static final int N = class03469.y + 2;
    private final List<Long2ObjectLinkedOpenHashMap<List<Runnable>>> y = IntStream.range(0, N).mapToObj(n -> new Long2ObjectLinkedOpenHashMap()).toList();
    private volatile int L = N;
    private final String u;

    public class06263(String string) {
        this.u = string;
    }

    public String toString() {
        return this.u + " " + this.L + "...";
    }

    public boolean y() {
        return this.L < N;
    }

    protected void N(Runnable runnable, long l2, int n) {
        ((List)this.y.get(n).computeIfAbsent(l2, l -> Lists.newArrayList())).add(runnable);
        this.L = Math.min(this.L, n);
    }

    protected void N(long l, boolean bl) {
        for (Long2ObjectLinkedOpenHashMap<List<Runnable>> var5 : this.y) {
            List var6 = (List)var5.get(l);
            if (var6 == null) continue;
            if (bl) {
                var6.clear();
            }
            if (!var6.isEmpty()) continue;
            var5.remove(l);
        }
        while (this.y() && this.y.get(this.L).isEmpty()) {
            ++this.L;
        }
    }

    public @Nullable class06256 N() {
        if (!this.y()) {
            return null;
        }
        int n = this.L;
        Long2ObjectLinkedOpenHashMap<List<Runnable>> var2 = this.y.get(n);
        long l = var2.firstLongKey();
        List var5 = (List)var2.removeFirst();
        while (this.y() && this.y.get(this.L).isEmpty()) {
            ++this.L;
        }
        return new class06256(l, var5);
    }

    protected void N(int n, class07321 class073212, int n2) {
        if (n >= N) {
            return;
        }
        List var5 = (List)this.y.get(n).remove(class073212.y());
        if (n == this.L) {
            while (this.y() && this.y.get(this.L).isEmpty()) {
                ++this.L;
            }
        }
        if (var5 != null && !var5.isEmpty()) {
            ((List)this.y.get(n2).computeIfAbsent(class073212.y(), l -> Lists.newArrayList())).addAll(var5);
            this.L = Math.min(this.L, n2);
        }
    }
}

