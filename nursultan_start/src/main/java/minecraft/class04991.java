/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10485
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10485;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04993;
import minecraft.class05015;
import minecraft.class05017;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public abstract class class04991<M extends class05017<M>> {
    private final class00772 Z;
    protected final class00538 N;
    protected final Long2ByteMap y = new Long2ByteOpenHashMap();
    private final LongSet z = new LongOpenHashSet();
    protected volatile M L;
    protected final M u;
    protected final LongSet i = new LongOpenHashSet();
    protected final LongSet R = new LongOpenHashSet();
    protected final Long2ObjectMap<class00536> M = Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
    private final LongSet U = new LongOpenHashSet();
    private final LongSet E = new LongOpenHashSet();
    protected volatile boolean B;

    protected @Nullable class00536 L(long l) {
        class00536 class005362 = ((class05017)this.u).L(l);
        if (class005362 == null) {
            return null;
        }
        if (this.i.add(l)) {
            class005362 = class005362.y();
            ((class05017)this.u).N(l, class005362);
            ((class05017)this.u).L();
        }
        return class005362;
    }

    public void L(long l, boolean bl) {
        if (bl) {
            this.U.add(l);
        } else {
            this.U.remove(l);
        }
    }

    protected class00536 M(long l) {
        class00536 class005362 = (class00536)this.M.get(l);
        if (class005362 != null) {
            return class005362;
        }
        return new class00536();
    }

    protected class04991(class00772 class007722, class00538 class005382, M m) {
        this.Z = class007722;
        this.N = class005382;
        this.u = m;
        this.L = ((class05017)m).y();
        ((class05017)this.L).u();
        this.y.defaultReturnValue((byte)0);
    }

    protected void B(long l) {
    }

    protected void Z(long l) {
    }

    protected int i(long l) {
        long l2 = class01296.i((long)l);
        return this.N(l2, true).N(class01296.y((int)class07209.method_10061((long)l)), class01296.y((int)class07209.method_10071((long)l)), class01296.y((int)class07209.method_10083((long)l)));
    }

    private void m(long l) {
        this.E.add(l);
        this.B = true;
    }

    protected boolean U(long l) {
        return this.z.contains(l);
    }

    protected boolean z(long l) {
        long l2 = class01296.R((long)l);
        return this.z.contains(l2);
    }

    public @Nullable class00536 u(long l) {
        class00536 class005362 = (class00536)this.M.get(l);
        if (class005362 != null) {
            return class005362;
        }
        return this.N(l, false);
    }

    protected void u(long l, boolean bl) {
        byte by;
        byte by2 = this.y.get(l);
        if (by2 == (by = class10485.N((byte)by2, (!bl ? 1 : 0) != 0))) {
            return;
        }
        this.N(l, by);
        int n = bl ? -1 : 1;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    if (i == 0 && j == 0 && k == 0) continue;
                    long l2 = class01296.N((long)l, (int)i, (int)j, (int)k);
                    byte by3 = this.y.get(l2);
                    this.N(l2, class10485.N((byte)by3, (int)(class10485.y((byte)by3) + n)));
                }
            }
        }
    }

    protected boolean y(long l) {
        return this.N(l, true) != null;
    }

    protected void y(long l, boolean bl) {
        if (bl) {
            this.z.add(l);
        } else {
            this.z.remove(l);
        }
    }

    protected void y() {
        Object object;
        if (!this.i.isEmpty()) {
            object = ((class05017)this.u).y();
            ((class05017)object).u();
            this.L = object;
            this.i.clear();
        }
        if (!this.R.isEmpty()) {
            object = this.R.iterator();
            while (object.hasNext()) {
                long l = object.nextLong();
                this.N.N(this.Z, class01296.N((long)l));
            }
            this.R.clear();
        }
    }

    public class04993 E(long l) {
        return class10485.L((byte)this.y.get(l));
    }

    protected @Nullable class00536 N(long l, boolean bl) {
        return this.N(bl ? this.u : this.L, l);
    }

    protected void N(long l, byte by) {
        if (by != 0) {
            if (this.y.put(l, by) == 0) {
                this.W(l);
            }
        } else if (this.y.remove(l) != 0) {
            this.m(l);
        }
    }

    protected void N(long l, int n) {
        long l2 = class01296.i((long)l);
        class00536 class005362 = this.i.add(l2) ? ((class05017)this.u).N(l2) : this.N(l2, true);
        class005362.N(class01296.y((int)class07209.method_10061((long)l)), class01296.y((int)class07209.method_10071((long)l)), class01296.y((int)class07209.method_10083((long)l)), n);
        class01296.N((long)l, arg_0 -> ((LongSet)this.R).add(arg_0));
    }

    protected abstract int N(long var1);

    protected void N(class05015<M, ?> class050152) {
        class00536 class005362;
        long l;
        if (!this.B) {
            return;
        }
        this.B = false;
        LongIterator longIterator = this.E.iterator();
        while (longIterator.hasNext()) {
            l = (Long)longIterator.next();
            class00536 class005363 = (class00536)this.M.remove(l);
            class005362 = ((class05017)this.u).u(l);
            if (!this.U.contains(class01296.R((long)l))) continue;
            if (class005363 != null) {
                this.M.put(l, (Object)class005363);
                continue;
            }
            if (class005362 == null) continue;
            this.M.put(l, (Object)class005362);
        }
        ((class05017)this.u).L();
        longIterator = this.E.iterator();
        while (longIterator.hasNext()) {
            l = (Long)longIterator.next();
            this.Z(l);
            this.i.add(l);
        }
        this.E.clear();
        ObjectIterator var2 = Long2ObjectMaps.fastIterator(this.M);
        while (var2.hasNext()) {
            Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)var2.next();
            long l2 = entry.getLongKey();
            if (!this.y(l2)) continue;
            class005362 = (class00536)entry.getValue();
            if (((class05017)this.u).L(l2) != class005362) {
                ((class05017)this.u).N(l2, class005362);
                this.i.add(l2);
            }
            var2.remove();
        }
        ((class05017)this.u).L();
    }

    protected boolean N() {
        return this.B;
    }

    protected void N(long l, @Nullable class00536 class005362) {
        if (class005362 != null) {
            this.M.put(l, (Object)class005362);
            this.B = true;
        } else {
            this.M.remove(l);
        }
    }

    protected @Nullable class00536 N(M m, long l) {
        return ((class05017)m).L(l);
    }

    private void W(long l) {
        if (!this.E.remove(l)) {
            ((class05017)this.u).N(l, this.M(l));
            this.i.add(l);
            this.B(l);
            this.R(l);
            this.B = true;
        }
    }

    protected void R(long l) {
        int n = class01296.y((long)l);
        int n2 = class01296.L((long)l);
        int n3 = class01296.u((long)l);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    this.R.add(class01296.y((int)(n + j), (int)(n2 + k), (int)(n3 + i)));
                }
            }
        }
    }
}

