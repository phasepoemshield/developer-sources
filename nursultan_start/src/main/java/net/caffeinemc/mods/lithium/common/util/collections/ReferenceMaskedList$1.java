/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.ReferenceMaskedList;

class ReferenceMaskedList$1
implements Iterator<E> {
    int nextIndex = 0;
    int cachedNext = -1;
    final /* synthetic */ ReferenceMaskedList this$0;

    ReferenceMaskedList$1(ReferenceMaskedList referenceMaskedList) {
        this.this$0 = referenceMaskedList;
    }

    @Override
    public boolean hasNext() {
        this.cachedNext = this.this$0.visibleMask.nextSetBit(this.nextIndex);
        return this.cachedNext != -1;
    }

    @Override
    public E next() {
        int n = this.cachedNext;
        this.cachedNext = -1;
        this.nextIndex = n + 1;
        return this.this$0.allElements.get(n);
    }
}

