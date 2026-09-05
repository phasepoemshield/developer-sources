/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.ListIterator;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningList;

class ListeningList$1
implements ListIterator<T> {
    final ListIterator<T> itDelegate;
    final /* synthetic */ int val$i;
    final /* synthetic */ ListeningList this$0;

    ListeningList$1() {
        this.this$0 = var1_1;
        this.val$i = n;
        this.itDelegate = this.this$0.delegate.listIterator(this.val$i);
    }

    @Override
    public void remove() {
        this.itDelegate.remove();
        this.this$0.onChange();
    }

    @Override
    public void add(T t) {
        this.itDelegate.add(t);
        this.this$0.onChange();
    }

    @Override
    public boolean hasNext() {
        return this.itDelegate.hasNext();
    }

    @Override
    public T next() {
        return this.itDelegate.next();
    }

    @Override
    public void set(T t) {
        this.itDelegate.set(t);
        this.this$0.onChange();
    }

    @Override
    public int previousIndex() {
        return this.itDelegate.previousIndex();
    }

    @Override
    public boolean hasPrevious() {
        return this.itDelegate.hasPrevious();
    }

    @Override
    public T previous() {
        return this.itDelegate.previous();
    }

    @Override
    public int nextIndex() {
        return this.itDelegate.nextIndex();
    }
}

