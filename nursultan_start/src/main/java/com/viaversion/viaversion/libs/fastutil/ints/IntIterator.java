/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntConsumer
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.IntConsumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;

public interface IntIterator
extends PrimitiveIterator.OfInt {
    @Override
    @Deprecated
    default public void forEachRemaining(Consumer<? super Integer> action) {
        this.forEachRemaining(action instanceof java.util.function.IntConsumer ? (java.util.function.IntConsumer)((Object)action) : action::accept);
    }

    @Override
    default public void forEachRemaining(IntConsumer action) {
        this.forEachRemaining((java.util.function.IntConsumer)action);
    }

    @Override
    @Deprecated
    default public Integer next() {
        return this.nextInt();
    }

    default public int skip(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be nonnegative: " + n);
        }
        int i = n;
        while (i-- != 0 && this.hasNext()) {
            this.nextInt();
        }
        return n - i - 1;
    }

    @Override
    public int nextInt();
}

