/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.BigArrays
 *  com.viaversion.viaversion.libs.fastutil.bytes.ByteIterator
 *  com.viaversion.viaversion.libs.fastutil.chars.CharIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntBigArrays
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$ArrayIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$ByteIteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$CharIteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$IntervalIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$IteratorConcatenator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$IteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$ListIteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$PrimitiveIteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$ShortIteratorWrapper
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$SingletonIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$UnmodifiableBidirectionalIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$UnmodifiableIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntIterators$UnmodifiableListIterator
 *  com.viaversion.viaversion.libs.fastutil.shorts.ShortIterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.BigArrays;
import com.viaversion.viaversion.libs.fastutil.bytes.ByteIterator;
import com.viaversion.viaversion.libs.fastutil.chars.CharIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntBidirectionalIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntBigArrays;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntIterators;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import com.viaversion.viaversion.libs.fastutil.ints.IntListIterator;
import com.viaversion.viaversion.libs.fastutil.shorts.ShortIterator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public final class IntIterators {
    public static final EmptyIterator EMPTY_ITERATOR = new EmptyIterator();

    private IntIterators() {
    }

    public static IntListIterator singleton(int element) {
        return new SingletonIterator(element);
    }

    public static IntListIterator wrap(int[] array, int offset, int length) {
        IntArrays.ensureOffsetLength(array, offset, length);
        return new ArrayIterator(array, offset, length);
    }

    public static IntListIterator wrap(int[] array) {
        return new ArrayIterator(array, 0, array.length);
    }

    public static int unwrap(IntIterator i, int[] array, int offset, int max) {
        if (max < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        if (offset < 0 || offset + max > array.length) {
            throw new IllegalArgumentException();
        }
        int j = max;
        while (j-- != 0 && i.hasNext()) {
            array[offset++] = i.nextInt();
        }
        return max - j - 1;
    }

    public static int unwrap(IntIterator i, int[] array) {
        return IntIterators.unwrap(i, array, 0, array.length);
    }

    public static int[] unwrap(IntIterator i, int max) {
        if (max < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        int[] array = new int[16];
        int j = 0;
        while (max-- != 0 && i.hasNext()) {
            if (j == array.length) {
                array = IntArrays.grow(array, j + 1);
            }
            array[j++] = i.nextInt();
        }
        return IntArrays.trim(array, j);
    }

    public static int[] unwrap(IntIterator i) {
        return IntIterators.unwrap(i, Integer.MAX_VALUE);
    }

    public static long unwrap(IntIterator i, int[][] array, long offset, long max) {
        if (max < 0L) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        if (offset < 0L || offset + max > BigArrays.length((int[][])array)) {
            throw new IllegalArgumentException();
        }
        long j = max;
        while (j-- != 0L && i.hasNext()) {
            BigArrays.set((int[][])array, (long)offset++, (int)i.nextInt());
        }
        return max - j - 1L;
    }

    public static long unwrap(IntIterator i, int[][] array) {
        return IntIterators.unwrap(i, array, 0L, BigArrays.length((int[][])array));
    }

    public static int unwrap(IntIterator i, IntCollection c, int max) {
        if (max < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        int j = max;
        while (j-- != 0 && i.hasNext()) {
            c.add(i.nextInt());
        }
        return max - j - 1;
    }

    public static int[][] unwrapBig(IntIterator i, long max) {
        if (max < 0L) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        int[][] array = IntBigArrays.newBigArray((long)16L);
        long j = 0L;
        while (max-- != 0L && i.hasNext()) {
            if (j == BigArrays.length((int[][])array)) {
                array = BigArrays.grow((int[][])array, (long)(j + 1L));
            }
            BigArrays.set((int[][])array, (long)j++, (int)i.nextInt());
        }
        return BigArrays.trim((int[][])array, (long)j);
    }

    public static int[][] unwrapBig(IntIterator i) {
        return IntIterators.unwrapBig(i, Long.MAX_VALUE);
    }

    public static long unwrap(IntIterator i, IntCollection c) {
        long n = 0L;
        while (i.hasNext()) {
            c.add(i.nextInt());
            ++n;
        }
        return n;
    }

    public static int pour(IntIterator i, IntCollection s, int max) {
        if (max < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + max + ") is negative");
        }
        int j = max;
        while (j-- != 0 && i.hasNext()) {
            s.add(i.nextInt());
        }
        return max - j - 1;
    }

    public static int pour(IntIterator i, IntCollection s) {
        return IntIterators.pour(i, s, Integer.MAX_VALUE);
    }

    public static IntList pour(IntIterator i, int max) {
        IntArrayList l = new IntArrayList();
        IntIterators.pour(i, l, max);
        l.trim();
        return l;
    }

    public static IntList pour(IntIterator i) {
        return IntIterators.pour(i, Integer.MAX_VALUE);
    }

    public static IntIterator asIntIterator(Iterator i) {
        if (i instanceof IntIterator) {
            return (IntIterator)i;
        }
        if (i instanceof PrimitiveIterator.OfInt) {
            return new PrimitiveIteratorWrapper((PrimitiveIterator.OfInt)i);
        }
        return new IteratorWrapper(i);
    }

    public static IntListIterator asIntIterator(ListIterator i) {
        if (i instanceof IntListIterator) {
            return (IntListIterator)i;
        }
        return new ListIteratorWrapper(i);
    }

    public static boolean any(IntIterator iterator, IntPredicate predicate) {
        return IntIterators.indexOf(iterator, predicate) != -1;
    }

    public static boolean all(IntIterator iterator, IntPredicate predicate) {
        Objects.requireNonNull(predicate);
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while (predicate.test(iterator.nextInt()));
        return false;
    }

    public static int indexOf(IntIterator iterator, IntPredicate predicate) {
        Objects.requireNonNull(predicate);
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.test(iterator.nextInt())) {
                return i;
            }
            ++i;
        }
        return -1;
    }

    public static IntListIterator fromTo(int from, int to) {
        return new IntervalIterator(from, to);
    }

    public static IntIterator concat(IntIterator ... a) {
        return IntIterators.concat(a, 0, a.length);
    }

    public static IntIterator concat(IntIterator[] a, int offset, int length) {
        return new IteratorConcatenator(a, offset, length);
    }

    public static IntIterator unmodifiable(IntIterator i) {
        return new UnmodifiableIterator(i);
    }

    public static IntBidirectionalIterator unmodifiable(IntBidirectionalIterator i) {
        return new UnmodifiableBidirectionalIterator(i);
    }

    public static IntListIterator unmodifiable(IntListIterator i) {
        return new UnmodifiableListIterator(i);
    }

    public static IntIterator wrap(ByteIterator iterator) {
        return new ByteIteratorWrapper(iterator);
    }

    public static IntIterator wrap(ShortIterator iterator) {
        return new ShortIteratorWrapper(iterator);
    }

    public static IntIterator wrap(CharIterator iterator) {
        return new CharIteratorWrapper(iterator);
    }

    public static class EmptyIterator
    implements IntListIterator,
    Serializable,
    Cloneable {
        private static final long serialVersionUID = -7046029254386353129L;

        private Object readResolve() {
            return EMPTY_ITERATOR;
        }

        protected EmptyIterator() {
        }

        public Object clone() {
            return EMPTY_ITERATOR;
        }

        @Override
        public void forEachRemaining(IntConsumer action) {
        }

        @Override
        @Deprecated
        public void forEachRemaining(Consumer<? super Integer> action) {
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public int previousIndex() {
            return -1;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public int skip(int n) {
            return 0;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int nextInt() {
            throw new NoSuchElementException();
        }

        @Override
        public int back(int n) {
            return 0;
        }

        @Override
        public int previousInt() {
            throw new NoSuchElementException();
        }
    }
}

