/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntConsumer
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.IntConsumer;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators;
import java.util.Objects;
import java.util.function.Consumer;

public interface IntIterable
extends Iterable<Integer> {
    public IntIterator iterator();

    default public IntSpliterator spliterator() {
        return IntSpliterators.asSpliteratorUnknownSize((IntIterator)this.iterator(), (int)0);
    }

    default public void forEach(java.util.function.IntConsumer action) {
        Objects.requireNonNull(action);
        this.iterator().forEachRemaining(action);
    }

    @Override
    @Deprecated
    default public void forEach(Consumer<? super Integer> action) {
        Objects.requireNonNull(action);
        this.forEach(action instanceof java.util.function.IntConsumer ? (java.util.function.IntConsumer)((Object)action) : action::accept);
    }

    default public void forEach(IntConsumer action) {
        this.forEach((java.util.function.IntConsumer)action);
    }

    default public IntIterator intIterator() {
        return this.iterator();
    }

    default public IntSpliterator intSpliterator() {
        return this.spliterator();
    }
}

