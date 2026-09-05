/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.FilteringStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

class FilteringStorage$FilteringStorageView
implements StorageView<T> {
    private final StorageView<T> backingView;
    final /* synthetic */ FilteringStorage this$0;

    FilteringStorage$FilteringStorageView(FilteringStorage filteringStorage, StorageView<T> storageView) {
        this.this$0 = filteringStorage;
        this.backingView = storageView;
    }

    public long extract(T t, long l, TransactionContext transactionContext) {
        if (this.this$0.canExtract(t)) {
            return this.backingView.extract(t, l, transactionContext);
        }
        return 0L;
    }

    public T getResource() {
        return this.backingView.getResource();
    }

    public long getCapacity() {
        return this.backingView.getCapacity();
    }

    public long getAmount() {
        return this.backingView.getAmount();
    }

    public boolean isResourceBlank() {
        return this.backingView.isResourceBlank();
    }

    public StorageView<T> getUnderlyingView() {
        return this.backingView.getUnderlyingView();
    }
}

