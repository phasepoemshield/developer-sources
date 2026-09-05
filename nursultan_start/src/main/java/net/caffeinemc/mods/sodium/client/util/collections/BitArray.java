/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.collections;

import java.util.Arrays;
import net.caffeinemc.mods.sodium.client.util.MathUtil;

public class BitArray {
    private static final int ADDRESS_BITS_PER_WORD = 6;
    private static final int BITS_PER_WORD = 64;
    private static final int BIT_INDEX_MASK = 63;
    private static final long WORD_MASK = -1L;
    private final long[] words;
    private final int capacity;

    public boolean getAndSet(int n) {
        int n2 = BitArray.wordIndex(n);
        long l = 1L << BitArray.bitIndex(n);
        long l2 = this.words[n2];
        this.words[n2] = l2 | l;
        return (l2 & l) != 0L;
    }

    public BitArray(int n) {
        this.words = new long[MathUtil.align(n, 64) >> 6];
        this.capacity = n;
    }

    public boolean get(int n) {
        return (this.words[BitArray.wordIndex(n)] & 1L << BitArray.bitIndex(n)) != 0L;
    }

    public void put(int n, boolean bl) {
        int n2 = BitArray.wordIndex(n);
        int n3 = BitArray.bitIndex(n);
        long l = bl ? 1L : 0L;
        this.words[n2] = this.words[n2] & (1L << n3 ^ 0xFFFFFFFFFFFFFFFFL) | l << n3;
    }

    public void fill(boolean bl) {
        Arrays.fill(this.words, bl ? -1L : 0L);
    }

    public void set(int n, int n2) {
        int n3 = BitArray.wordIndex(n);
        int n4 = BitArray.wordIndex(n2 - 1);
        long l = -1L << n;
        long l2 = -1L >>> -n2;
        if (n3 == n4) {
            int n5 = n3;
            this.words[n5] = this.words[n5] | l & l2;
        } else {
            int n6 = n3;
            this.words[n6] = this.words[n6] | l;
            for (int i = n3 + 1; i < n4; ++i) {
                this.words[i] = -1L;
            }
            int n7 = n4;
            this.words[n7] = this.words[n7] | l2;
        }
    }

    public void set(int n) {
        int n2 = BitArray.wordIndex(n);
        this.words[n2] = this.words[n2] | 1L << BitArray.bitIndex(n);
    }

    public int capacity() {
        return this.capacity;
    }

    public void setAll() {
        this.fill(true);
    }

    private static int bitIndex(int n) {
        return n & 0x3F;
    }

    private static int wordIndex(int n) {
        return n >> 6;
    }

    public int nextSetBit(int n) {
        int n2 = BitArray.wordIndex(n);
        if (n2 >= this.words.length) {
            return -1;
        }
        long l = this.words[n2] & -1L << n;
        while (l == 0L) {
            if (++n2 == this.words.length) {
                return -1;
            }
            l = this.words[n2];
        }
        return n2 * 64 + Long.numberOfTrailingZeros(l);
    }

    public void unset(int n) {
        int n2 = BitArray.wordIndex(n);
        this.words[n2] = this.words[n2] & (1L << BitArray.bitIndex(n) ^ 0xFFFFFFFFFFFFFFFFL);
    }

    public void unset(int n, int n2) {
        int n3 = BitArray.wordIndex(n);
        int n4 = BitArray.wordIndex(n2 - 1);
        long l = -1L << n ^ 0xFFFFFFFFFFFFFFFFL;
        long l2 = -1L >>> -n2 ^ 0xFFFFFFFFFFFFFFFFL;
        if (n3 == n4) {
            int n5 = n3;
            this.words[n5] = this.words[n5] & (l & l2);
        } else {
            int n6 = n3;
            this.words[n6] = this.words[n6] & l;
            for (int i = n3 + 1; i < n4; ++i) {
                this.words[i] = 0L;
            }
            int n7 = n4;
            this.words[n7] = this.words[n7] & l2;
        }
    }

    public boolean getAndUnset(int n) {
        int n2 = BitArray.wordIndex(n);
        long l = 1L << BitArray.bitIndex(n);
        long l2 = this.words[n2];
        this.words[n2] = l2 & (l ^ 0xFFFFFFFFFFFFFFFFL);
        return (l2 & l) != 0L;
    }

    public int countSetBits() {
        int n = 0;
        for (long l : this.words) {
            n += Long.bitCount(l);
        }
        return n;
    }

    public void unsetAll() {
        this.fill(false);
    }
}

