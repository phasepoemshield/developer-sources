/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10546
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import Nursultan.class10546;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.ToIntFunction;
import minecraft.class01296;
import minecraft.class05928;
import minecraft.class07209;
import minecraft.class07321;

public class class05917 {
    private static final int N = 256;
    private final ThreadLocal<class10546> y = ThreadLocal.withInitial(class10546::new);
    private final Long2ObjectLinkedOpenHashMap<class05928> L = new Long2ObjectLinkedOpenHashMap(256, 0.25f);
    private final ReentrantReadWriteLock u = new ReentrantReadWriteLock();
    private final ToIntFunction<class07209> i;

    public class05917(ToIntFunction<class07209> toIntFunction) {
        this.i = toIntFunction;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class05928 y(int n, int n2) {
        class05928 class059282;
        long l = class07321.u((int)n, (int)n2);
        this.u.readLock().lock();
        try {
            class059282 = (class05928)this.L.get(l);
            if (class059282 != null) {
                class05928 class059283 = class059282;
                return class059283;
            }
        }
        finally {
            this.u.readLock().unlock();
        }
        this.u.writeLock().lock();
        try {
            class05928 class059284;
            class059282 = (class05928)this.L.get(l);
            if (class059282 != null) {
                class05928 class059285 = class059282;
                return class059285;
            }
            class05928 class059286 = new class05928();
            if (this.L.size() >= 256 && (class059284 = (class05928)this.L.removeFirst()) != null) {
                class059284.y();
            }
            this.L.put(l, (Object)class059286);
            class059284 = class059286;
            return class059284;
        }
        finally {
            this.u.writeLock().unlock();
        }
    }

    public int N(class07209 class072092) {
        int n;
        int n2 = class01296.N((int)class072092.method_10263());
        int n3 = class01296.N((int)class072092.method_10260());
        class10546 class105462 = this.y.get();
        if (class105462.N != n2 || class105462.y != n3 || class105462.L == null || class105462.L.N()) {
            class105462.N = n2;
            class105462.y = n3;
            class105462.L = this.y(n2, n3);
        }
        int[] nArray = class105462.L.N(class072092.method_10264());
        int n4 = class072092.method_10263() & 0xF;
        int n5 = (class072092.method_10260() & 0xF) << 4 | n4;
        int n6 = nArray[n5];
        if (n6 != -1) {
            return n6;
        }
        nArray[n5] = n = this.i.applyAsInt(class072092);
        return n;
    }

    public void N() {
        try {
            this.u.writeLock().lock();
            this.L.values().forEach(class05928::y);
            this.L.clear();
        }
        finally {
            this.u.writeLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(int n, int n2) {
        try {
            this.u.writeLock().lock();
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    long l = class07321.u((int)(n + i), (int)(n2 + j));
                    class05928 class059282 = (class05928)this.L.remove(l);
                    if (class059282 == null) continue;
                    class059282.y();
                }
            }
        }
        finally {
            this.u.writeLock().unlock();
        }
    }
}

