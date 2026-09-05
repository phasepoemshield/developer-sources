/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.util.collections;

import java.util.Arrays;
import net.caffeinemc.mods.sodium.client.util.collections.ReadQueue;
import net.caffeinemc.mods.sodium.client.util.collections.WriteQueue;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

final class DoubleBufferedQueue$QueueImpl<E>
implements ReadQueue<E>,
WriteQueue<E> {
    private E[] elements;
    private int readIndex;
    private int writeIndex;

    @Override
    public @Nullable E dequeue() {
        if (this.readIndex == this.writeIndex) {
            return null;
        }
        return this.elements[this.readIndex++];
    }

    DoubleBufferedQueue$QueueImpl(int n) {
        this.elements = new Object[n];
    }

    DoubleBufferedQueue$QueueImpl() {
        this(256);
    }

    public int size() {
        return this.writeIndex - this.readIndex;
    }

    public void clear() {
        if (this.writeIndex != 0) {
            Arrays.fill(this.elements, 0, this.writeIndex, null);
        }
        this.readIndex = 0;
        this.writeIndex = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.readIndex == this.writeIndex;
    }

    @Override
    public void enqueue(@NonNull E e) {
        if (this.writeIndex >= this.elements.length) {
            this.resize(this.writeIndex + 1);
        }
        this.elements[this.writeIndex++] = e;
    }

    @Override
    public void ensureCapacity(int n) {
        int n2 = this.writeIndex + n;
        if (n2 > this.elements.length) {
            this.grow(n2);
        }
    }

    private void resize(int n) {
        Object[] objectArray = new Object[n];
        System.arraycopy(this.elements, 0, objectArray, 0, this.writeIndex);
        this.elements = objectArray;
    }

    private void grow(int n) {
        this.resize(DoubleBufferedQueue$QueueImpl.getNextSize(n, this.elements.length));
    }

    private static int getNextSize(int n, int n2) {
        return Math.max(n, n2 << 1);
    }
}

