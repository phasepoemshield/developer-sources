/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10336
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2LongMaps
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class04643
 *  minecraft.class05163
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08700
 */
package minecraft;

import Nursultan.class10336;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import minecraft.class00753;
import minecraft.class01296;
import minecraft.class04298;
import minecraft.class04309;
import minecraft.class04310;
import minecraft.class04334;
import minecraft.class04643;
import minecraft.class05163;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08700;

public class class04312<T>
implements class04298<T> {
    private static final Comparator<class04310<?>> N = (class043102, class043103) -> class04309.y.compare(class043102.y(), class043103.y());
    private final LongPredicate y;
    private final Long2ObjectMap<class04310<T>> L = new Long2ObjectOpenHashMap();
    private final Long2LongMap u = (Long2LongMap)class07536.N((Object)new Long2LongOpenHashMap(), (T long2LongOpenHashMap) -> long2LongOpenHashMap.defaultReturnValue(Long.MAX_VALUE));
    private final Queue<class04310<T>> i = new PriorityQueue(N);
    private final Queue<class04309<T>> R = new ArrayDeque<class04309<T>>();
    private final List<class04309<T>> M = new ArrayList<class04309<T>>();
    private final Set<class04309<?>> B = new ObjectOpenCustomHashSet(class04309.L);
    private final BiConsumer<class04310<T>, class04309<T>> Z = (class043102, class043092) -> {
        if (class043092.equals((Object)class043102.y())) {
            this.y((class04309<T>)((Object)class043092));
        }
    };

    private void L(class04309<T> class043092) {
        this.R.add(class043092);
    }

    private void L() {
        this.R.clear();
        this.i.clear();
        this.M.clear();
        this.B.clear();
    }

    public class04312(LongPredicate longPredicate) {
        this.y = longPredicate;
    }

    private void u() {
        if (this.B.isEmpty() && !this.R.isEmpty()) {
            this.B.addAll(this.R);
        }
    }

    private void y() {
        for (class04310 class043102 : this.i) {
            this.y(class043102.y());
        }
    }

    private void y(class04309<T> class043092) {
        this.u.put(class07321.N((class07209)class043092.y()), class043092.L());
    }

    @Override
    public boolean y(class07209 class072092, T t) {
        this.u();
        return this.B.contains(class04309.N(t, class072092));
    }

    public void N(class04312<T> class043122, class05163 class051632, class00753 class007532) {
        ArrayList arrayList = new ArrayList();
        Predicate<class04309> predicate = class043092 -> class051632.y((class00753)class043092.y());
        class043122.M.stream().filter(predicate).forEach(arrayList::add);
        class043122.R.stream().filter(predicate).forEach(arrayList::add);
        class043122.N(class051632, (l, class043102) -> class043102.u().filter(predicate).forEach(arrayList::add));
        LongSummaryStatistics longSummaryStatistics = arrayList.stream().mapToLong(class04309::i).summaryStatistics();
        long l2 = longSummaryStatistics.getMin();
        long l3 = longSummaryStatistics.getMax();
        arrayList.forEach(class043092 -> this.N(new class04309(class043092.N(), class043092.y().method_10081(class007532), class043092.L(), class043092.u(), class043092.i() - l2 + l3 + 1L)));
    }

    @Override
    public int N() {
        return this.L.values().stream().mapToInt(class04334::N).sum();
    }

    public void N(class05163 class051632, class00753 class007532) {
        this.N(this, class051632, class007532);
    }

    public void N(long l, int n, BiConsumer<class07209, T> biConsumer) {
        class04643 class046432 = class08700.N();
        class046432.N("collect");
        this.N(l, n, class046432);
        class046432.y("run");
        class046432.N("ticksToRun", this.R.size());
        this.N(biConsumer);
        class046432.y("cleanup");
        this.L();
        class046432.L();
    }

    private boolean N(int n) {
        return this.R.size() < n;
    }

    @Override
    public void N(class04309<T> class043092) {
        long l = class07321.N((class07209)class043092.y());
        class04310 class043102 = (class04310)this.L.get(l);
        if (class043102 == null) {
            class07536.y((String)("Trying to schedule tick in not loaded position " + String.valueOf(class043092.y())));
            return;
        }
        class043102.N((class04309)class043092);
    }

    private void N(Queue<class04310<T>> queue, class04310<T> class043102, long l, int n) {
        class04309 class043092;
        class04309 class043093;
        if (!this.N(n)) {
            return;
        }
        class04310<T> class043103 = queue.peek();
        class04309 class043094 = class043093 = class043103 != null ? class043103.y() : null;
        while (this.N(n) && (class043092 = class043102.y()) != null && class043092.L() <= l && (class043093 == null || class04309.y.compare(class043092, class043093) <= 0)) {
            class043102.L();
            this.L(class043092);
        }
    }

    private void N(long l, int n) {
        class04310<T> class043102;
        while (this.N(n) && (class043102 = this.i.poll()) != null) {
            class04309 class043092 = class043102.L();
            this.L(class043092);
            this.N(this.i, class043102, l, n);
            class04309 class043093 = class043102.y();
            if (class043093 == null) continue;
            if (class043093.L() <= l && this.N(n)) {
                this.i.add(class043102);
                continue;
            }
            this.y(class043093);
        }
    }

    private void N(long l) {
        ObjectIterator var3 = Long2LongMaps.fastIterator((Long2LongMap)this.u);
        while (var3.hasNext()) {
            Long2LongMap.Entry entry = (Long2LongMap.Entry)var3.next();
            long l2 = entry.getLongKey();
            if (entry.getLongValue() > l) continue;
            class04310 class043102 = (class04310)this.L.get(l2);
            if (class043102 == null) {
                var3.remove();
                continue;
            }
            class04309 class043092 = class043102.y();
            if (class043092 == null) {
                var3.remove();
                continue;
            }
            if (class043092.L() > l) {
                entry.setValue(class043092.L());
                continue;
            }
            if (!this.y.test(l2)) continue;
            var3.remove();
            this.i.add(class043102);
        }
    }

    private void N(long l, int n, class04643 class046432) {
        this.N(l);
        class046432.N("containersToTick", this.i.size());
        this.N(l, n);
        this.y();
    }

    public void N(class05163 class051632) {
        Predicate<class04309> predicate = class043092 -> class051632.y((class00753)class043092.y());
        this.N(class051632, (l, class043102) -> {
            class04309 class043092 = class043102.y();
            class043102.N(predicate);
            class04309 class043093 = class043102.y();
            if (class043093 != class043092) {
                if (class043093 != null) {
                    this.y(class043093);
                } else {
                    this.u.remove(l);
                }
            }
        });
        this.M.removeIf(predicate);
        this.R.removeIf(predicate);
    }

    private void N(class05163 class051632, class10336<T> class103362) {
        int n = class01296.N((double)class051632.B());
        int n2 = class01296.N((double)class051632.z());
        int n3 = class01296.N((double)class051632.U());
        int n4 = class01296.N((double)class051632.W());
        for (int i = n; i <= n3; ++i) {
            for (int j = n2; j <= n4; ++j) {
                long l = class07321.u((int)i, (int)j);
                class04310 class043102 = (class04310)this.L.get(l);
                if (class043102 == null) continue;
                class103362.accept(l, class043102);
            }
        }
    }

    public void N(class07321 class073212, class04310<T> class043102) {
        long l = class073212.y();
        this.L.put(l, class043102);
        class04309 class043092 = class043102.y();
        if (class043092 != null) {
            this.u.put(l, class043092.L());
        }
        class043102.N(this.Z);
    }

    @Override
    public boolean N(class07209 class072092, T t) {
        class04310 class043102 = (class04310)this.L.get(class07321.N((class07209)class072092));
        return class043102 != null && class043102.N(class072092, (Object)t);
    }

    public void N(class07321 class073212) {
        long l = class073212.y();
        class04310 class043102 = (class04310)this.L.remove(l);
        this.u.remove(l);
        if (class043102 != null) {
            class043102.N(null);
        }
    }

    private void N(BiConsumer<class07209, T> biConsumer) {
        while (!this.R.isEmpty()) {
            class04309<T> class043092 = this.R.poll();
            if (!this.B.isEmpty()) {
                this.B.remove(class043092);
            }
            this.M.add(class043092);
            biConsumer.accept(class043092.y(), (class07209)class043092.N());
        }
    }
}

