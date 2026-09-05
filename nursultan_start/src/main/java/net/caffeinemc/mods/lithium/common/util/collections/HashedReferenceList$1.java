/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import net.caffeinemc.mods.lithium.common.util.collections.HashedReferenceList;

class HashedReferenceList$1
implements ListIterator<T> {
    private final ListIterator<T> inner;
    final /* synthetic */ int val$index;
    final /* synthetic */ HashedReferenceList this$0;

    HashedReferenceList$1(HashedReferenceList hashedReferenceList, int n) {
        this.this$0 = hashedReferenceList;
        this.val$index = n;
        this.inner = this.this$0.list.listIterator(this.val$index);
    }

    @Override
    public void remove() {
        int n = this.previousIndex();
        if (n == -1) {
            throw new NoSuchElementException();
        }
        Object t = this.this$0.get(n);
        if (t != null) {
            this.this$0.trackReferenceRemoved(t);
        }
        this.inner.remove();
    }

    @Override
    public void add(T t) {
        this.this$0.trackReferenceAdded(t);
        this.inner.add(t);
    }

    @Override
    public boolean hasNext() {
        return this.inner.hasNext();
    }

    @Override
    public T next() {
        return this.inner.next();
    }

    @Override
    public void set(T t) {
        int n = this.previousIndex();
        if (n == -1) {
            throw new NoSuchElementException();
        }
        Object t2 = this.this$0.get(n);
        if (t2 != t) {
            if (t2 != null) {
                this.this$0.trackReferenceRemoved(t2);
            }
            this.this$0.trackReferenceAdded(t);
        }
        this.inner.remove();
    }

    @Override
    public int previousIndex() {
        return this.inner.previousIndex();
    }

    @Override
    public boolean hasPrevious() {
        return this.inner.hasPrevious();
    }

    @Override
    public T previous() {
        return this.inner.previous();
    }

    @Override
    public int nextIndex() {
        return this.inner.nextIndex();
    }
}

