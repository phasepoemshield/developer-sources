/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public interface StorageView<T> {
    public long extract(T var1, long var2, TransactionContext var4);

    public T getResource();

    public long getCapacity();

    public long getAmount();

    public boolean isResourceBlank();

    default public StorageView<T> getUnderlyingView() {
        return this;
    }
}

