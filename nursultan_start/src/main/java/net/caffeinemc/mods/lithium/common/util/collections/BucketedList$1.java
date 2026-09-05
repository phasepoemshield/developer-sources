/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.ArrayList;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.util.collections.BucketedList;

class BucketedList$1
implements Iterator<T> {
    int bucketIndex = -1;
    int index;
    int consumed;
    ArrayList<T> bucketList;
    final /* synthetic */ BucketedList this$0;

    BucketedList$1(BucketedList bucketedList) {
        this.this$0 = bucketedList;
    }

    @Override
    public boolean hasNext() {
        return this.consumed < this.this$0.size;
    }

    @Override
    public T next() {
        if (this.bucketList == null || this.bucketList.size() <= this.index) {
            ++this.bucketIndex;
            this.bucketList = this.this$0.buckets[this.bucketIndex];
            this.index = 0;
            return this.next();
        }
        ++this.consumed;
        return this.bucketList.get(this.index++);
    }
}

