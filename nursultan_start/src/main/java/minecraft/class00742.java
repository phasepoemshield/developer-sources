/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMaps
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00750
 *  net.fabricmc.fabric.impl.registry.sync.RemovableIdList
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class00750;
import net.fabricmc.fabric.impl.registry.sync.RemovableIdList;
import org.jspecify.annotations.Nullable;

public class class00742<T>
implements class00750<T>,
RemovableIdList {
    private int y;
    private final Reference2IntMap<T> L;
    private final List<T> u;

    public int L() {
        return this.L.size();
    }

    public boolean L(int n) {
        return this.N(n) != null;
    }

    public class00742() {
        this(512);
    }

    public class00742(int n) {
        this.u = Lists.newArrayListWithExpectedSize((int)n);
        this.L = new Reference2IntOpenHashMap(n);
        this.L.defaultReturnValue(-1);
    }

    public Iterator<T> iterator() {
        return Iterators.filter(this.u.iterator(), Objects::nonNull);
    }

    private void u(Object object) {
        int n = this.L.removeInt(object);
        this.u.set(n, null);
        while (this.y > 1 && this.u.get(this.y - 1) == null) {
            --this.y;
        }
    }

    public void y(T t) {
        this.N(t, this.y);
    }

    public int N(T t) {
        return this.L.getInt(t);
    }

    public final @Nullable T N(int n) {
        if (n >= 0 && n < this.u.size()) {
            return this.u.get(n);
        }
        return null;
    }

    public void N(T t, int n) {
        this.L.put(t, n);
        while (this.u.size() <= n) {
            this.u.add(null);
        }
        this.u.set(n, t);
        if (this.y <= n) {
            this.y = n + 1;
        }
    }

    public void fabric_remapId(int n, int n2) {
        this.fabric_remapIds(Int2IntMaps.singleton((int)n, (int)n2));
    }

    public void fabric_clear() {
        this.y = 0;
        this.L.clear();
        this.u.clear();
    }

    public void fabric_remove(Object object) {
        if (this.L.containsKey(object)) {
            this.u(object);
        }
    }

    public void fabric_removeId(int n) {
        ArrayList arrayList = new ArrayList();
        for (Object e : this.L.keySet()) {
            int n2 = this.L.getInt(e);
            if (n != n2) continue;
            arrayList.add(e);
        }
        arrayList.forEach(this::u);
    }

    public void fabric_remapIds(Int2IntMap int2IntMap) {
        this.L.replaceAll((object, n) -> int2IntMap.get(n.intValue()));
        this.y = 0;
        ArrayList<T> arrayList = new ArrayList<T>(this.u);
        this.u.clear();
        for (int i = 0; i < arrayList.size(); ++i) {
            Object e = arrayList.get(i);
            if (e == null) continue;
            int n2 = int2IntMap.getOrDefault(i, i);
            while (this.u.size() <= n2) {
                this.u.add(null);
            }
            this.u.set(n2, e);
            if (this.y > n2) continue;
            this.y = n2 + 1;
        }
    }
}

