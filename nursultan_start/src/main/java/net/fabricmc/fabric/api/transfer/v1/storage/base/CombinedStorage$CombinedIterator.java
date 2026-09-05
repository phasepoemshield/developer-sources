/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage;

class CombinedStorage$CombinedIterator
implements Iterator<StorageView<T>> {
    final Iterator<S> partIterator;
    Iterator<? extends StorageView<T>> currentPartIterator;
    final /* synthetic */ CombinedStorage this$0;

    CombinedStorage$CombinedIterator(CombinedStorage combinedStorage) {
        this.this$0 = combinedStorage;
        this.partIterator = this.this$0.parts.iterator();
        this.currentPartIterator = null;
        this.advanceCurrentPartIterator();
    }

    @Override
    public boolean hasNext() {
        return this.currentPartIterator != null && this.currentPartIterator.hasNext();
    }

    @Override
    public StorageView<T> next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        StorageView storageView = this.currentPartIterator.next();
        if (!this.currentPartIterator.hasNext()) {
            this.advanceCurrentPartIterator();
        }
        return storageView;
    }

    private void advanceCurrentPartIterator() {
        while (this.partIterator.hasNext()) {
            this.currentPartIterator = ((Storage)this.partIterator.next()).iterator();
            if (!this.currentPartIterator.hasNext()) continue;
            break;
        }
    }
}

