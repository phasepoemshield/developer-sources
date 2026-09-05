/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public class BlankVariantView<T extends TransferVariant<?>>
implements StorageView<T> {
    private final T blankVariant;
    private final long capacity;

    public BlankVariantView(T t, long l) {
        if (!t.isBlank()) {
            throw new IllegalArgumentException("Expected a blank variant, received " + String.valueOf(t));
        }
        this.blankVariant = t;
        this.capacity = l;
    }

    @Override
    public long extract(T t, long l, TransactionContext transactionContext) {
        return 0L;
    }

    @Override
    public T getResource() {
        return this.blankVariant;
    }

    @Override
    public long getCapacity() {
        return this.capacity;
    }

    @Override
    public long getAmount() {
        return 0L;
    }

    @Override
    public boolean isResourceBlank() {
        return true;
    }
}

