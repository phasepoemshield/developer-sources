/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.collections;

import net.caffeinemc.mods.sodium.client.util.collections.DoubleBufferedQueue$QueueImpl;
import net.caffeinemc.mods.sodium.client.util.collections.ReadQueue;
import net.caffeinemc.mods.sodium.client.util.collections.WriteQueue;

public final class DoubleBufferedQueue<E> {
    private DoubleBufferedQueue$QueueImpl<E> read = new DoubleBufferedQueue$QueueImpl();
    private DoubleBufferedQueue$QueueImpl<E> write = new DoubleBufferedQueue$QueueImpl();

    public void reset() {
        this.read.clear();
        this.write.clear();
    }

    public WriteQueue<E> write() {
        return this.write;
    }

    public ReadQueue<E> read() {
        return this.read;
    }

    public boolean flip() {
        if (this.write.size() == 0) {
            return false;
        }
        DoubleBufferedQueue$QueueImpl<E> doubleBufferedQueue$QueueImpl = this.read;
        this.read = this.write;
        this.write = doubleBufferedQueue$QueueImpl;
        this.write.clear();
        return true;
    }
}

