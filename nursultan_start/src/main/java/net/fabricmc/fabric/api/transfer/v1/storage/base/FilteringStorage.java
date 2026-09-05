/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.FilteringStorage$1;
import net.fabricmc.fabric.api.transfer.v1.storage.base.FilteringStorage$FilteringStorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public abstract class FilteringStorage<T>
implements Storage<T> {
    protected final Supplier<Storage<T>> backingStorage;

    public FilteringStorage(Storage<T> storage) {
        this(() -> storage);
    }

    public FilteringStorage(Supplier<Storage<T>> supplier) {
        this.backingStorage = supplier;
    }

    public String toString() {
        return "FilteringStorage[" + String.valueOf(this.backingStorage.get()) + "/" + String.valueOf(this.backingStorage) + "]";
    }

    public long extract(T t, long l, TransactionContext transactionContext) {
        if (this.canExtract(t)) {
            return this.backingStorage.get().extract(t, l, transactionContext);
        }
        return 0L;
    }

    public long insert(T t, long l, TransactionContext transactionContext) {
        if (this.canInsert(t)) {
            return this.backingStorage.get().insert(t, l, transactionContext);
        }
        return 0L;
    }

    public Iterator<StorageView<T>> iterator() {
        return Iterators.transform((Iterator)this.backingStorage.get().iterator(), storageView -> new FilteringStorage$FilteringStorageView(this, storageView));
    }

    public static <T> Storage<T> of(Storage<T> storage, boolean bl, boolean bl2) {
        if (bl && bl2) {
            return storage;
        }
        return new FilteringStorage$1(storage, bl, bl2);
    }

    public long getVersion() {
        return this.backingStorage.get().getVersion();
    }

    protected boolean canInsert(T t) {
        return true;
    }

    protected boolean canExtract(T t) {
        return true;
    }

    public static <T> Storage<T> readOnlyOf(Storage<T> storage) {
        return FilteringStorage.of(storage, false, false);
    }

    public boolean supportsExtraction() {
        return this.backingStorage.get().supportsExtraction();
    }

    public boolean supportsInsertion() {
        return this.backingStorage.get().supportsInsertion();
    }

    public static <T> Storage<T> insertOnlyOf(Storage<T> storage) {
        return FilteringStorage.of(storage, true, false);
    }

    public static <T> Storage<T> extractOnlyOf(Storage<T> storage) {
        return FilteringStorage.of(storage, false, true);
    }
}

