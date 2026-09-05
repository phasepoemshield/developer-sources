/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageView
 */
package net.fabricmc.fabric.api.transfer.v1.storage.base;

import java.util.Collections;
import java.util.Iterator;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;

public interface InsertionOnlyStorage<T>
extends Storage<T> {
    default public long extract(T t, long l, TransactionContext transactionContext) {
        return 0L;
    }

    default public Iterator<StorageView<T>> iterator() {
        return Collections.emptyIterator();
    }

    default public boolean supportsExtraction() {
        return false;
    }
}

