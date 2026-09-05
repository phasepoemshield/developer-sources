/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.BidirectionalIterator
 */
package com.viaversion.viaversion.libs.fastutil.objects;

import com.viaversion.viaversion.libs.fastutil.BidirectionalIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;

public interface ObjectBidirectionalIterator<K>
extends ObjectIterator<K>,
BidirectionalIterator<K> {
    @Override
    default public int skip(int n) {
        return ObjectIterator.super.skip(n);
    }

    default public int back(int n) {
        int i = n;
        while (i-- != 0 && this.hasPrevious()) {
            this.previous();
        }
        return n - i - 1;
    }
}

