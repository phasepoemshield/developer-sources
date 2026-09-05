/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.impl.transfer.TransferApiImpl
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;

public interface Storage<T>
extends Iterable<StorageView<T>> {
    public long extract(T var1, long var2, TransactionContext var4);

    public long insert(T var1, long var2, TransactionContext var4);

    @Override
    public Iterator<StorageView<T>> iterator();

    public static <T> Storage<T> empty() {
        return TransferApiImpl.EMPTY_STORAGE;
    }

    default public long getVersion() {
        if (Transaction.isOpen()) {
            throw new IllegalStateException("getVersion() may not be called during a transaction.");
        }
        return TransferApiImpl.version.getAndIncrement();
    }

    public static <T> Class<Storage<T>> asClass() {
        return Storage.class;
    }

    default public Iterator<StorageView<T>> nonEmptyIterator() {
        return Iterators.filter(this.iterator(), storageView -> storageView.getAmount() > 0L && !storageView.isResourceBlank());
    }

    default public Iterable<StorageView<T>> nonEmptyViews() {
        return this::nonEmptyIterator;
    }

    default public boolean supportsExtraction() {
        return true;
    }

    default public boolean supportsInsertion() {
        return true;
    }
}

