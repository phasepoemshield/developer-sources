/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMaps
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class01596
 *  minecraft.class01624
 *  minecraft.class07321
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import minecraft.class01596;
import minecraft.class01624;
import minecraft.class04766;
import minecraft.class04778;
import minecraft.class07321;

class class04759
extends class04766 {
    private int M;
    private final Long2IntMap B;
    private final LongSet Z;
    final /* synthetic */ class04778 u;

    private boolean L(int n) {
        return n <= this.M;
    }

    protected class04759(class04778 class047782, int n) {
        this.u = class047782;
        super(class047782, n);
        this.B = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
        this.Z = new LongOpenHashSet();
        this.M = 0;
        this.B.defaultReturnValue(n + 2);
    }

    private void N(long l, int n, boolean bl, boolean bl2) {
        if (bl != bl2) {
            class01596 class015962 = new class01596(class01624.z, class04778.N);
            if (bl2) {
                this.u.i.N(() -> this.u.M.execute(() -> {
                    if (this.L(this.L(l))) {
                        this.u.L.N(l, class015962);
                        this.u.R.add(l);
                    } else {
                        this.u.i.N(l, () -> {}, false);
                    }
                }), l, () -> n);
            } else {
                this.u.i.N(l, () -> this.u.M.execute(() -> this.u.L.y(l, class015962)), true);
            }
        }
    }

    public void N(int n) {
        for (Long2ByteMap.Entry entry : this.N.long2ByteEntrySet()) {
            byte by = entry.getByteValue();
            long l = entry.getLongKey();
            this.N(l, by, this.L(by), by <= n);
        }
        this.M = n;
    }

    @Override
    protected void N(long l, int n, int n2) {
        this.Z.add(l);
    }

    @Override
    public void N() {
        super.N();
        if (!this.Z.isEmpty()) {
            LongIterator longIterator = this.Z.iterator();
            while (longIterator.hasNext()) {
                int n2;
                long l = longIterator.nextLong();
                int n3 = this.B.get(l);
                if (n3 == (n2 = this.L(l))) continue;
                this.u.i.method_17209(new class07321(l), () -> this.B.get(l), n2, n -> {
                    if (n >= this.B.defaultReturnValue()) {
                        this.B.remove(l);
                    } else {
                        this.B.put(l, n);
                    }
                });
                this.N(l, n2, this.L(n3), this.L(n2));
            }
            this.Z.clear();
        }
    }
}

