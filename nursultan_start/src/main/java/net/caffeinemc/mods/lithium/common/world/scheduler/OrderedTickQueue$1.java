/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04309
 */
package net.caffeinemc.mods.lithium.common.world.scheduler;

import java.util.Iterator;
import minecraft.class04309;
import net.caffeinemc.mods.lithium.common.world.scheduler.OrderedTickQueue;

class OrderedTickQueue$1
implements Iterator<class04309<T>> {
    int nextIndex;
    final /* synthetic */ OrderedTickQueue this$0;

    OrderedTickQueue$1(OrderedTickQueue orderedTickQueue) {
        this.this$0 = orderedTickQueue;
        this.nextIndex = this.this$0.firstIndex;
    }

    @Override
    public boolean hasNext() {
        return this.nextIndex < this.this$0.lastIndexExclusive;
    }

    @Override
    public class04309<T> next() {
        return this.this$0.arr[this.nextIndex++];
    }
}

