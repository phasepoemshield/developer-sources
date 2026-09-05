/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectBidirectionalIterator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.IntIterator;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectBidirectionalIterator;

public interface IntBidirectionalIterator
extends IntIterator,
ObjectBidirectionalIterator<Integer> {
    @Deprecated
    default public Integer previous() {
        return this.previousInt();
    }

    @Override
    default public int skip(int n) {
        return IntIterator.super.skip(n);
    }

    default public int back(int n) {
        int i = n;
        while (i-- != 0 && this.hasPrevious()) {
            this.previousInt();
        }
        return n - i - 1;
    }

    public int previousInt();
}

