/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.Spliterators;
import java.util.function.Consumer;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList;

class MaskedList$2
extends Spliterators.AbstractSpliterator<E> {
    int nextIndex;
    final /* synthetic */ MaskedList this$0;

    @Override
    public boolean tryAdvance(Consumer<? super E> consumer) {
        int n = this.this$0.visibleMask.nextSetBit(this.nextIndex);
        if (n == -1) {
            return false;
        }
        this.nextIndex = n + 1;
        consumer.accept(this.this$0.allElements.get(n));
        return true;
    }

    MaskedList$2(MaskedList maskedList, long l, int n) {
        this.this$0 = maskedList;
        super(l, n);
        this.nextIndex = 0;
    }
}

