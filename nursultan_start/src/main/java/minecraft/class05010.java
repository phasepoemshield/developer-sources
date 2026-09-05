/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10484
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 *  minecraft.class03340
 */
package minecraft;

import Nursultan.class10484;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.function.LongPredicate;
import minecraft.class03340;
import minecraft.class04995;

public abstract class class05010 {
    public static final long i = Long.MAX_VALUE;
    private static final int N = 255;
    protected final int R;
    private final class03340 y;
    private final Long2ByteMap L;
    private volatile boolean u;

    protected abstract int L(long var1);

    public int L() {
        return this.L.size();
    }

    protected class05010(int n, int n2, int n3) {
        if (n >= 254) {
            throw new IllegalArgumentException("Level count must be < 254.");
        }
        this.R = n;
        this.y = new class03340(n, n2);
        this.L = new class10484(this, n3, 0.5f, n3);
        this.L.defaultReturnValue((byte)-1);
    }

    protected void i(long l) {
        this.N(l, l, this.R - 1, false);
    }

    protected void u(long l) {
        int n = this.L.remove(l) & 0xFF;
        if (n == 255) {
            return;
        }
        int n2 = this.L(l);
        int n3 = this.N(n2, n);
        this.y.N(l, n3, this.R);
        this.u = !this.y.y();
    }

    protected final boolean y() {
        return this.u;
    }

    protected final int y(int n) {
        if (this.y.y()) {
            return n;
        }
        while (!this.y.y() && n > 0) {
            --n;
            long l = this.y.N();
            int n2 = class04995.N(this.L(l), 0, this.R - 1);
            int n3 = this.L.remove(l) & 0xFF;
            if (n3 < n2) {
                this.N(l, n3);
                this.N(l, n3, true);
                continue;
            }
            if (n3 <= n2) continue;
            this.N(l, this.R - 1);
            if (n3 != this.R - 1) {
                this.y.N(l, this.N(this.R - 1, n3));
                this.L.put(l, (byte)n3);
            }
            this.N(l, n2, false);
        }
        this.u = !this.y.y();
        return n;
    }

    protected abstract int y(long var1, long var3, int var5);

    protected final void y(long l, long l2, int n, boolean bl) {
        int n2 = this.L.get(l2) & 0xFF;
        int n3 = class04995.N(this.y(l, l2, n), 0, this.R - 1);
        if (bl) {
            this.N(l, l2, n3, this.L(l2), n2, bl);
        } else {
            boolean bl2 = n2 == 255;
            int n4 = bl2 ? class04995.N(this.L(l2), 0, this.R - 1) : n2;
            if (n3 == n4) {
                this.N(l, l2, this.R - 1, bl2 ? n4 : this.L(l2), n2, bl);
            }
        }
    }

    protected abstract void N(long var1, int var3);

    private int N(int n, int n2) {
        return Math.min(Math.min(n, n2), this.R - 1);
    }

    protected abstract void N(long var1, int var3, boolean var4);

    public void N(LongPredicate longPredicate) {
        LongArrayList longArrayList = new LongArrayList();
        this.L.keySet().forEach(arg_0 -> class05010.N(longPredicate, (LongList)longArrayList, arg_0));
        longArrayList.forEach(this::u);
    }

    private static /* synthetic */ void N(LongPredicate longPredicate, LongList longList, long l) {
        if (longPredicate.test(l)) {
            longList.add(l);
        }
    }

    private void N(long l, long l2, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        if (this.N(l2)) {
            return;
        }
        n = class04995.N(n, 0, this.R - 1);
        n2 = class04995.N(n2, 0, this.R - 1);
        boolean bl3 = bl2 = n3 == 255;
        if (bl2) {
            n3 = n2;
        }
        int n4 = bl ? Math.min(n3, n) : class04995.N(this.N(l2, l, n), 0, this.R - 1);
        int n5 = this.N(n2, n3);
        if (n2 != n4) {
            int n6 = this.N(n2, n4);
            if (n5 != n6 && !bl2) {
                this.y.N(l2, n5, n6);
            }
            this.y.N(l2, n6);
            this.L.put(l2, (byte)n4);
        } else if (!bl2) {
            this.y.N(l2, n5, this.R);
            this.L.remove(l2);
        }
    }

    protected void N(long l, long l2, int n, boolean bl) {
        this.N(l, l2, n, this.L(l2), this.L.get(l2) & 0xFF, bl);
        this.u = !this.y.y();
    }

    protected boolean N(long l) {
        return l == Long.MAX_VALUE;
    }

    protected abstract int N(long var1, long var3, int var5);
}

