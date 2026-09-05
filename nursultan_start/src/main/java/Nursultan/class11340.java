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

public class class11340<T>
extends AbstractIterator<T> {
    private final PeekingIterator<T> N;
    private final PeekingIterator<T> y;
    private final Comparator<T> L;

    public class11340(Iterator<T> iterator, Iterator<T> iterator2, Comparator<T> comparator) {
        this.N = Iterators.peekingIterator(iterator);
        this.y = Iterators.peekingIterator(iterator2);
        this.L = comparator;
    }

    protected T computeNext() {
        while (this.N.hasNext() && this.y.hasNext()) {
            int n = this.L.compare(this.N.peek(), this.y.peek());
            if (n == 0) {
                this.y.next();
                return (T)this.N.next();
            }
            if (n < 0) {
                this.N.next();
                continue;
            }
            this.y.next();
        }
        return (T)this.endOfData();
    }
}

