/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.iterator;

import java.util.NoSuchElementException;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator;

public class ByteArrayIterator
implements ByteIterator {
    private final byte[] elements;
    private final int lastIndex;
    private int index;

    public ByteArrayIterator(byte[] byArray, int n) {
        this.elements = byArray;
        this.lastIndex = n;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.lastIndex;
    }

    @Override
    public int nextByteAsInt() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return Byte.toUnsignedInt(this.elements[this.index++]);
    }
}

