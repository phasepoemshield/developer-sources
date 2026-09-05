/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.CombinedStorage$CombinedIterator;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public class CombinedStorage<T, S extends Storage<T>>
implements Storage<T> {
    public List<S> parts;

    public CombinedStorage(List<S> list) {
        this.parts = list;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (Storage storage : this.parts) {
            stringJoiner.add(storage.toString());
        }
        return "CombinedStorage[" + String.valueOf(stringJoiner) + "]";
    }

    public long extract(T t, long l, TransactionContext transactionContext) {
        Storage storage;
        StoragePreconditions.notNegative((long)l);
        long l2 = 0L;
        Iterator<S> iterator = this.parts.iterator();
        while (iterator.hasNext() && (l2 += (storage = (Storage)iterator.next()).extract(t, l - l2, transactionContext)) != l) {
        }
        return l2;
    }

    public long insert(T t, long l, TransactionContext transactionContext) {
        Storage storage;
        StoragePreconditions.notNegative((long)l);
        long l2 = 0L;
        Iterator<S> iterator = this.parts.iterator();
        while (iterator.hasNext() && (l2 += (storage = (Storage)iterator.next()).insert(t, l - l2, transactionContext)) != l) {
        }
        return l2;
    }

    public Iterator<StorageView<T>> iterator() {
        return new CombinedStorage$CombinedIterator(this);
    }

    public boolean supportsExtraction() {
        for (Storage storage : this.parts) {
            if (!storage.supportsExtraction()) continue;
            return true;
        }
        return false;
    }

    public boolean supportsInsertion() {
        for (Storage storage : this.parts) {
            if (!storage.supportsInsertion()) continue;
            return true;
        }
        return false;
    }
}

