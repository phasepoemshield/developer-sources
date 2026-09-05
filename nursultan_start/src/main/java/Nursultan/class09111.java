/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.PeekingIterator
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class class09111<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> N;
    private final PeekingIterator<T> y;
    private final Comparator<T> L;

    public class09111(Iterator<T> iterator, Iterator<T> iterator2, Comparator<T> comparator) {
        this.N = Iterators.peekingIterator(iterator);
        this.y = Iterators.peekingIterator(iterator2);
        this.L = comparator;
    }

    protected T computeNext() {
        boolean bl;
        boolean bl2 = !this.N.hasNext();
        boolean bl3 = bl = !this.y.hasNext();
        if (bl2 && bl) {
            return (T)this.endOfData();
        }
        if (bl2) {
            return (T)this.y.next();
        }
        if (bl) {
            return (T)this.N.next();
        }
        int n = this.L.compare(this.N.peek(), this.y.peek());
        if (n == 0) {
            this.y.next();
        }
        return (T)(n <= 0 ? this.N.next() : this.y.next());
    }
}

