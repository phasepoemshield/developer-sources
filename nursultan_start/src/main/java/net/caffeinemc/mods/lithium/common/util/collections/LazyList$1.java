/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.LazyList;

class LazyList$1
implements Iterator<T> {
    private int index = 0;
    final /* synthetic */ LazyList this$0;

    LazyList$1(LazyList lazyList) {
        this.this$0 = lazyList;
    }

    @Override
    public boolean hasNext() {
        return this.this$0.produceToIndex(this.index);
    }

    @Override
    public T next() {
        return this.this$0.get(this.index++);
    }
}

