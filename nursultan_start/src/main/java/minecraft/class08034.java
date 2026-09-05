/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterable
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2IntMaps
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterable;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class08012;
import minecraft.class08014;
import minecraft.class08022;
import org.jspecify.annotations.Nullable;

public class class08034<T> {
    public final Reference2IntOpenHashMap<T> N = new Reference2IntOpenHashMap();

    void L(T t, int n) {
        this.N.addTo(t, n);
    }

    public void u(T t, int n) {
        this.L(t, n);
    }

    public int y(List<? extends class08022<T>> list, int n, @Nullable class08012<T> class080122) {
        return new class08014<T>(this, list).y(n, class080122);
    }

    void y(T t, int n) {
        int n2 = this.N.addTo(t, -n);
        if (n2 < n) {
            throw new IllegalStateException("Took " + n + " items, but only had " + n2);
        }
    }

    List<T> N(Iterable<? extends class08022<T>> iterable) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Reference2IntMap.Entry entry : Reference2IntMaps.fastIterable(this.N)) {
            if (entry.getIntValue() <= 0 || !class08034.N(iterable, entry.getKey())) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    private static <T> boolean N(Iterable<? extends class08022<T>> iterable, T t) {
        Iterator<class08022<T>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().acceptsItem(t)) continue;
            return true;
        }
        return false;
    }

    public int N(List<? extends class08022<T>> list) {
        int n = Integer.MAX_VALUE;
        ObjectIterable objectIterable = Reference2IntMaps.fastIterable(this.N);
        block0: for (class08022<Object> class080222 : list) {
            int n2 = 0;
            for (Reference2IntMap.Entry entry : objectIterable) {
                int n3 = entry.getIntValue();
                if (n3 <= n2) continue;
                if (class080222.acceptsItem(entry.getKey())) {
                    n2 = n3;
                }
                if (n2 < n) continue;
                continue block0;
            }
            n = n2;
            if (n != 0) continue;
            break;
        }
        return n;
    }

    boolean N(T t, int n) {
        return this.N.getInt(t) >= n;
    }

    public void N() {
        this.N.clear();
    }

    public boolean N(List<? extends class08022<T>> list, int n, @Nullable class08012<T> class080122) {
        return new class08014<T>(this, list).N(n, class080122);
    }
}

