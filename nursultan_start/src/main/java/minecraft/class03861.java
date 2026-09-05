/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap
 *  minecraft.class04995
 */
package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
import java.util.NoSuchElementException;
import minecraft.class04995;

public class class03861
extends Long2LongLinkedOpenHashMap {
    private static final int N = class04995.M((int)60000000);
    private static final int y = class04995.M((int)60000000);
    private static final int L;
    private static final int u = 0;
    private static final int i;
    private static final int R;
    private static final long M;
    private int B = -1;
    private long Z;
    private final int z;

    public boolean L(long l) {
        int n;
        long l2 = class03861.N(l);
        int n2 = class03861.y(l);
        long l3 = 1L << n2;
        if (l2 == 0L) {
            if (this.containsNullKey) {
                return this.N(this.n, l3);
            }
            this.containsNullKey = true;
            n = this.n;
        } else {
            if (this.B != -1 && l2 == this.Z) {
                return this.N(this.B, l3);
            }
            n = (int)HashCommon.mix((long)l2) & this.mask;
            long l4 = this.key[n];
            while (l4 != 0L) {
                if (l4 == l2) {
                    this.B = n;
                    this.Z = l2;
                    return this.N(n, l3);
                }
                n = n + 1 & this.mask;
                l4 = this.key[n];
            }
        }
        this.key[n] = l2;
        this.value[n] = l3;
        if (this.size == 0) {
            this.first = this.last = n;
            this.link[n] = -1L;
        } else {
            int n3 = this.last;
            this.link[n3] = this.link[n3] ^ (this.link[this.last] ^ (long)n & 0xFFFFFFFFL) & 0xFFFFFFFFL;
            this.link[n] = ((long)this.last & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL;
            this.last = n;
        }
        if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize((int)(this.size + 1), (float)this.f));
        }
        return false;
    }

    public class03861(int n, float f) {
        super(n, f);
        this.z = n;
    }

    static {
        i = L = 64 - N - y;
        R = L + y;
        M = 3L << R | 3L | 3L << i;
    }

    private boolean i(long l) {
        if ((this.value[this.n] & l) == 0L) {
            return false;
        }
        int n = this.n;
        this.value[n] = this.value[n] & (l ^ 0xFFFFFFFFFFFFFFFFL);
        if (this.value[this.n] != 0L) {
            return true;
        }
        this.containsNullKey = false;
        --this.size;
        this.fixPointers(this.n);
        if (this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return true;
    }

    protected void rehash(int n) {
        if (n > this.z) {
            super.rehash(n);
        }
    }

    public boolean u(long l) {
        long l2 = class03861.N(l);
        int n = class03861.y(l);
        long l3 = 1L << n;
        if (l2 == 0L) {
            if (this.containsNullKey) {
                return this.i(l3);
            }
            return false;
        }
        if (this.B != -1 && l2 == this.Z) {
            return this.y(this.B, l3);
        }
        int n2 = (int)HashCommon.mix((long)l2) & this.mask;
        long l4 = this.key[n2];
        while (l4 != 0L) {
            if (l2 == l4) {
                this.B = n2;
                this.Z = l2;
                return this.y(n2, l3);
            }
            n2 = n2 + 1 & this.mask;
            l4 = this.key[n2];
        }
        return false;
    }

    private boolean y(int n, long l) {
        if ((this.value[n] & l) == 0L) {
            return false;
        }
        int n2 = n;
        this.value[n2] = this.value[n2] & (l ^ 0xFFFFFFFFFFFFFFFFL);
        if (this.value[n] != 0L) {
            return true;
        }
        this.B = -1;
        --this.size;
        this.fixPointers(n);
        this.shiftKeys(n);
        if (this.size < this.maxFill / 4 && this.n > 16) {
            this.rehash(this.n / 2);
        }
        return true;
    }

    static int y(long l) {
        int n = (int)(l >>> R & 3L);
        int n2 = (int)(l >>> 0 & 3L);
        int n3 = (int)(l >>> i & 3L);
        return n << 4 | n3 << 2 | n2;
    }

    public long N() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        int n = this.first;
        long l = this.key[n];
        int n2 = Long.numberOfTrailingZeros(this.value[n]);
        int n3 = n;
        this.value[n3] = this.value[n3] & (1L << n2 ^ 0xFFFFFFFFFFFFFFFFL);
        if (this.value[n] == 0L) {
            this.removeFirstLong();
            this.B = -1;
        }
        return class03861.N(l, n2);
    }

    static long N(long l, int n) {
        l |= (long)(n >>> 4 & 3) << R;
        l |= (long)(n >>> 2 & 3) << i;
        return l |= (long)(n >>> 0 & 3) << 0;
    }

    private boolean N(int n, long l) {
        boolean bl = (this.value[n] & l) != 0L;
        int n2 = n;
        this.value[n2] = this.value[n2] | l;
        return bl;
    }

    static long N(long l) {
        return l & (M ^ 0xFFFFFFFFFFFFFFFFL);
    }
}

