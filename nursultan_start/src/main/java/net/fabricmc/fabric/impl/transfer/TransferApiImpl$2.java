/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.transfer;

import java.util.Iterator;
import java.util.NoSuchElementException;

class TransferApiImpl$2
implements Iterator<T> {
    boolean hasNext = true;
    final /* synthetic */ Object val$it;

    TransferApiImpl$2(Object object) {
        this.val$it = object;
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public T next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return this.val$it;
    }
}

