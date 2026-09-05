/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00763
 *  minecraft.class07209
 *  net.caffeinemc.mods.lithium.common.world.scheduler.OrderedTickQueue
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00763;
import minecraft.class04306;
import minecraft.class04309;
import minecraft.class04325;
import minecraft.class04327;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.world.scheduler.OrderedTickQueue;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04310<T>
implements class04325<T>,
class04327<T> {
    private Queue<class04309<T>> N;
    private @Nullable List<class04306<T>> y;
    private Set<class04309<?>> L;
    private @Nullable BiConsumer<class04310<T>, class04309<T>> u;
    private static volatile Reference2IntOpenHashMap i = new Reference2IntOpenHashMap();
    private final Long2ReferenceAVLTreeMap R = new Long2ReferenceAVLTreeMap();
    private OrderedTickQueue M;
    private final IntOpenHashSet B = new IntOpenHashSet();

    public class04309 L() {
        class04309 class043092 = this.M.poll();
        if (class043092 != null) {
            if (this.M.isEmpty()) {
                this.N(true);
            }
            this.B.remove(class04310.y(class043092.y(), class043092.N()));
            return class043092;
        }
        return null;
    }

    private void L(class04309 class043092) {
        OrderedTickQueue orderedTickQueue = (OrderedTickQueue)this.R.computeIfAbsent(class04310.N(class043092.L(), class043092.u()), l -> new OrderedTickQueue());
        if (orderedTickQueue.isEmpty()) {
            this.N(false);
        }
        orderedTickQueue.offer(class043092);
        if (this.u != null) {
            this.u.accept(this, class043092);
        }
    }

    public class04310() {
        this.N = new PriorityQueue(class04309.N);
        this.L = new ObjectOpenCustomHashSet(class04309.L);
        this.N((CallbackInfo)null);
    }

    public class04310(List<class04306<T>> list) {
        this.N = new PriorityQueue(class04309.N);
        this.L = new ObjectOpenCustomHashSet(class04309.L);
        this.y = list;
        for (class04306<T> class043062 : list) {
            this.L.add(class04309.N(class043062.N(), class043062.y()));
        }
        this.N((CallbackInfo)null);
    }

    static {
        i.defaultReturnValue(-1);
    }

    public Stream u() {
        return this.R.values().stream().flatMap(Collection::stream);
    }

    private static int y(class07209 class072092, Object object) {
        int n = i.getInt(object);
        if (n == -1) {
            n = class04310.N(object);
        }
        int n2 = (class072092.method_10263() & 0xF) << 16 | (class072092.method_10264() & 0xFFF) << 4 | class072092.method_10260() & 0xF;
        return n2 |= n << 20;
    }

    private void y(class04309<T> class043092) {
        this.N.add(class043092);
        if (this.u != null) {
            this.u.accept(this, class043092);
        }
    }

    public class04309 y() {
        if (this.M == null) {
            return null;
        }
        return this.M.peek();
    }

    public void y(long l) {
        if (this.y != null) {
            int n = -this.y.size();
            for (class04306<T> class043062 : this.y) {
                this.L(class043062.N(l, n++));
            }
        }
        this.y = null;
    }

    private static synchronized int N(Object object) {
        int n = i.getInt(object);
        if (n == -1) {
            Reference2IntOpenHashMap reference2IntOpenHashMap = i.clone();
            n = reference2IntOpenHashMap.size();
            reference2IntOpenHashMap.put(object, n);
            i = reference2IntOpenHashMap;
            if (n >= 4096) {
                throw new IllegalStateException("Lithium Tick Scheduler assumes at most 4096 different block types that receive scheduled ticks exist! Add mixin.world.tick_scheduler=false to the lithium properties/config to disable the optimization!");
            }
        }
        return n;
    }

    @Override
    public int N() {
        return this.B.size();
    }

    public void N(@Nullable BiConsumer<class04310<T>, class04309<T>> biConsumer) {
        this.u = biConsumer;
    }

    @Override
    public List N(long l) {
        ArrayList arrayList = new ArrayList(this.N());
        if (this.y != null) {
            arrayList.addAll(this.y);
        }
        ObjectIterator objectIterator = this.R.values().iterator();
        while (objectIterator.hasNext()) {
            for (class04309 class043092 : (OrderedTickQueue)objectIterator.next()) {
                arrayList.add(class043092.N(l));
            }
        }
        return arrayList;
    }

    @Override
    public void N(class04309 class043092) {
        int n = class04310.y(class043092.y(), class043092.N());
        if (this.B.add(n)) {
            this.L(class043092);
        }
    }

    private static long N(long l, class00763 class007632) {
        return l << 4 | (long)(class007632.ordinal() & 0xF);
    }

    private void N(boolean bl) {
        OrderedTickQueue orderedTickQueue;
        if (bl && this.M != null && this.M.isEmpty() && (orderedTickQueue = (OrderedTickQueue)this.R.remove(this.R.firstLongKey())) != this.M) {
            throw new IllegalStateException("Next tick queue doesn't have the lowest key!");
        }
        if (this.R.isEmpty()) {
            this.M = null;
            return;
        }
        long l = this.R.firstLongKey();
        this.M = (OrderedTickQueue)this.R.get(l);
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.y != null) {
            for (class04306<T> class043062 : this.y) {
                this.B.add(class04310.y(class043062.y(), class043062.N()));
            }
        }
        this.L = null;
        this.N = null;
    }

    @Override
    public boolean N(class07209 class072092, Object object) {
        return this.B.contains(class04310.y(class072092, object));
    }

    public void N(Predicate predicate) {
        ObjectIterator objectIterator = this.R.values().iterator();
        while (objectIterator.hasNext()) {
            OrderedTickQueue orderedTickQueue = (OrderedTickQueue)objectIterator.next();
            orderedTickQueue.sort();
            boolean bl = false;
            for (int i = 0; i < orderedTickQueue.size(); ++i) {
                class04309 class043092 = orderedTickQueue.getTickAtIndex(i);
                if (!predicate.test(class043092)) continue;
                orderedTickQueue.setTickAtIndex(i, null);
                this.B.remove(class04310.y(class043092.y(), class043092.N()));
                bl = true;
            }
            if (bl) {
                orderedTickQueue.removeNullsAndConsumed();
            }
            if (!orderedTickQueue.isEmpty()) continue;
            objectIterator.remove();
        }
        this.N(false);
    }
}

