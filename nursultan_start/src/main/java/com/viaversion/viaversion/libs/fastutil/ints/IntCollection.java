/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.Size64
 *  com.viaversion.viaversion.libs.fastutil.ints.IntPredicate
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.Size64;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterable;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntPredicate;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSpliterators;
import java.util.Collection;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface IntCollection
extends Collection<Integer>,
IntIterable {
    @Override
    @Deprecated
    default public boolean remove(Object key) {
        if (key == null) {
            return false;
        }
        return this.rem((Integer)key);
    }

    @Override
    @Deprecated
    default public boolean add(Integer key) {
        return this.add((int)key);
    }

    @Override
    public boolean add(int var1);

    public int[] toArray(int[] var1);

    @Override
    public IntIterator iterator();

    @Override
    @Deprecated
    default public Stream<Integer> stream() {
        return Collection.super.stream();
    }

    default public IntStream intStream() {
        return StreamSupport.intStream((Spliterator.OfInt)this.intSpliterator(), false);
    }

    @Override
    @Deprecated
    default public boolean contains(Object key) {
        if (key == null) {
            return false;
        }
        return this.contains((Integer)key);
    }

    public boolean contains(int var1);

    @Override
    default public IntSpliterator spliterator() {
        return IntSpliterators.asSpliterator((IntIterator)this.iterator(), (long)Size64.sizeOf((Collection)this), (int)320);
    }

    public boolean addAll(IntCollection var1);

    @Override
    @Deprecated
    default public Stream<Integer> parallelStream() {
        return Collection.super.parallelStream();
    }

    public boolean rem(int var1);

    @Override
    @Deprecated
    default public boolean removeIf(Predicate<? super Integer> filter) {
        return this.removeIf(filter instanceof java.util.function.IntPredicate ? (java.util.function.IntPredicate)((Object)filter) : key -> filter.test(key));
    }

    default public boolean removeIf(java.util.function.IntPredicate filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        IntIterator each = this.iterator();
        while (each.hasNext()) {
            if (!filter.test(each.nextInt())) continue;
            each.remove();
            removed = true;
        }
        return removed;
    }

    default public boolean removeIf(IntPredicate filter) {
        return this.removeIf((java.util.function.IntPredicate)filter);
    }

    public boolean removeAll(IntCollection var1);

    public boolean retainAll(IntCollection var1);

    public boolean containsAll(IntCollection var1);

    public int[] toIntArray();

    @Deprecated
    default public int[] toIntArray(int[] a) {
        return this.toArray(a);
    }

    @Override
    default public IntIterator intIterator() {
        return this.iterator();
    }

    default public IntStream intParallelStream() {
        return StreamSupport.intStream((Spliterator.OfInt)this.intSpliterator(), true);
    }

    @Override
    default public IntSpliterator intSpliterator() {
        return this.spliterator();
    }
}

