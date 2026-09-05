/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.iterator;

import java.util.NoSuchElementException;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator;

public class ReversibleByteArrayIterator
implements ByteIterator {
    private final byte[] elements;
    private final int step;
    private int currentIndex;
    private int remaining;

    public ReversibleByteArrayIterator(byte[] byArray, int n, boolean bl) {
        this.elements = byArray;
        this.remaining = n;
        this.step = bl ? -1 : 1;
        this.currentIndex = bl ? n - 1 : 0;
    }

    @Override
    public boolean hasNext() {
        return this.remaining > 0;
    }

    @Override
    public int nextByteAsInt() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int n = Byte.toUnsignedInt(this.elements[this.currentIndex]);
        this.currentIndex += this.step;
        --this.remaining;
        return n;
    }
}

