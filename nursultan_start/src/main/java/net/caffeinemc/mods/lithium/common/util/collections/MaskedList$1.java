/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList;

class MaskedList$1
implements Iterator<E> {
    int nextIndex = 0;
    int cachedNext = -1;
    final /* synthetic */ MaskedList this$0;

    MaskedList$1(MaskedList maskedList) {
        this.this$0 = maskedList;
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

